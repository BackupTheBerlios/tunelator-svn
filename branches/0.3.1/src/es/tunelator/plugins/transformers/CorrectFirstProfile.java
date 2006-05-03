/*
 * Created on 13-mar-2005
 * 
 * Tunelator surveying software.
 * 
 * Copyright (C) 2005 Juan Alvarez Ferrando
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 2 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 *
 */
package es.tunelator.plugins.transformers;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.tunelator.log.Logger;
import es.tunelator.plugins.transformers.vo.Point2D;
import es.tunelator.plugins.transformers.vo.Point3D;
import es.tunelator.plugins.transformers.vo.RegressLine;
import es.tunelator.vo.PuntoVO;

/**
 * Before taking the first real profile, the station takes a profile
 * over its own PK to get a reference used to calculate the rest
 * of profiles.
 * When the user of the station has specified a PK for the stationing
 * the point in this test profile and the points of the first real 
 * profile get the same theoric PK value, which makes them look as
 * belonging to the same profile to the receiving applications
 * (Ispol, Prowin, MDT).
 * This class corrects this problem by detecting the points that 
 * really belong to the test profile and modifying their theorical PK
 * to the same value of their measured PK.
 * 
 * The algorithm depends on the closeness of the points in the 
 * test profile to the regression line they form.
 * It first uses all the points up to the fist one that is at a 
 * significant distance (fixed to 0.5 meters) from the first point 
 * read to calculate a initial regression line and a tolerance for 
 * the distance of the belonging point to this line, as:
 * 
 * tolerance = max distance + medium distance
 * 
 * Then it starts over reading the points and for each one it
 * tests if it is at a distance from the regression line which
 * is less that the calculated tolerance.
 * When the point belongs to the profile and is after the one 
 * where it stopped calculating the regression line, it adds it 
 * to the line and recalculates the tolerance, so the references
 * are more precise.
 * Each point that is detected as belonging to the profile gets
 * its theorical PK substituted by its measured PK.
 * When it reaches the first point that does not belong to the profile
 * it stops iterating.
 * 
 * @author <a href="jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class CorrectFirstProfile {
    /**
     * TODO To change the template for this generated type comment go to
     * Window - Preferences - Java - Code Style - Code Templates
     *
     * @author Juan Alvarez
     *
     */
    private class Dimensions {
        public double height;
        public double width;

        protected int UPPER_LEFT = 0;
        protected int UPPER_RIGHT = 1;
        protected int LOWER_RIGHT = 2;
        protected int LOWER_LEFT = 3;
        /**
         * @param h
         * @param w
         */
        public Dimensions(double h, double w){
            height = h;
            width = w;
        }
        /**
         * @param v1
         * @param v2
         * @return
         */
        private double doubleMax(double v1, double v2){
            return (v1 >= v2) ? v1:v2;
        }
        /**
         * @param v1
         * @param v2
         * @return
         */
        private double doubleMin(double v1, double v2){
            return (v1 >= v2) ? v2:v1;
        }
        /**
         * @param listPK
         * @return
         * @throws IOException
         * @throws TransformException
         */
        public Dimensions calculateDimensions(List listPK) throws IOException, TransformException {
            Iterator it = listPK.iterator();
            PuntoVO p1=null;
            PuntoVO p2=null;
            String currentPK = "";
            double maxDeje = -Double.MAX_VALUE;
            double minDeje = Double.MAX_VALUE;
            double maxHeightInc = -Double.MAX_VALUE;
            double minHeightInc = Double.MAX_VALUE;
            double height = 0.0d;
            double width = 0.0d;
            int profileIndex = 0;
            while(it.hasNext()){
                PuntoVO currentPoint = (PuntoVO) it.next();
                Point3D point = currentPoint.getPoint3D();
                double deje = point.getDeje();
                double heightInc = point.getHeightInc();
                if(!currentPoint.getPkTeor().equals(currentPK)){
                    if(profileIndex > 0){
                        throw new InternalError("No more than one profile in the point list is accepted");
                    }
                    currentPK = currentPoint.getPkTeor();
                    height = maxHeightInc - minHeightInc;
                    width = maxDeje - minDeje;
                    maxDeje = -Double.MAX_VALUE;
                    minDeje = Double.MAX_VALUE;
                    maxHeightInc = -Double.MAX_VALUE;
                    minHeightInc = Double.MIN_VALUE;
                    profileIndex++;
                }
                // Get the maximun and minimum distances to the axis
                maxDeje = doubleMax(deje,maxDeje);
                minDeje = doubleMin(deje,minDeje);
                // Get the maximun and minimum height increments to the axis
                maxHeightInc = doubleMax(heightInc,maxHeightInc);
                minHeightInc = doubleMin(heightInc,maxHeightInc);
            }
            height = maxHeightInc - minHeightInc;
            height = (height>=0) ? height : -height;
            width = maxDeje - minDeje;
            width = (width >= 0) ? width : -width;
            return new Dimensions(height,width);
        }
        /**
         * @param pointVO
         * @return
         * @throws TransformException
         */
        public int pointPosition(PuntoVO pointVO) throws TransformException {
            int result = -1;
            Point3D point = pointVO.getPoint3D();
            double deje = point.getDeje();
            double heightInc = point.getHeightInc();
            
            return result;
        }
        /**
         * @param points
         * @param dim
         * @return
         * @throws TransformException
         */
        protected List classifyPoints(List points, Dimensions dim) throws TransformException {
            ArrayList result = new ArrayList();
            result.add(UPPER_LEFT,new ArrayList());
            result.add(UPPER_RIGHT,new ArrayList());
            result.add(LOWER_LEFT,new ArrayList());
            result.add(LOWER_RIGHT,new ArrayList());
            Iterator it = points.iterator();
            int profileIndex = 0;
            String currentPK = "";
            while(it.hasNext()){
                PuntoVO currentPoint = (PuntoVO) it.next();
                Point3D point = currentPoint.getPoint3D();
                double deje = point.getDeje();
                double heightInc = point.getHeightInc();
                if(!currentPoint.getPkTeor().equals(currentPK)){
                    if(profileIndex > 0){
                        throw new InternalError("No more than one profile in the point list is accepted");
                    }
                    currentPK = currentPoint.getPkTeor();
                    profileIndex++;
                }
            }
            return result;
        }
    }
    
    /**
	 * Creates an ArrayList of Point2D objects from an ArrayList of PuntoVO
	 * objects, converting the X, Y and dEje string values to their 
	 * double value.
	 * The conversion mask applied is #######0.0###
	 * 
	 * @param input ArrayList of PuntoVO
	 * @return ArrayList of Point2D
	 * @throws Exception Format excetions converting string values to double
	 */
	protected static ArrayList toNumericValues(ArrayList input) throws Exception {
		Iterator it = input.iterator();
		ArrayList result = new ArrayList();
		DecimalFormat formatter = (DecimalFormat) DecimalFormat.getInstance();
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setDecimalSeparator('.');
		formatter.setDecimalFormatSymbols(symbols);
		formatter.applyPattern("#######0.0###");
		while(it.hasNext()){
			Point2D pt = null;
			PuntoVO pto = (PuntoVO) it.next();
			String sX = pto.getXCoord();
			String sY = pto.getYCoord();
			String sDeje = pto.getDeje();
			double x = formatter.parse(sX).doubleValue();
			double y = formatter.parse(sY).doubleValue();
			double deje = formatter.parse(sDeje).doubleValue();
			pt = new Point2D(x,y,deje);
			result.add(pt);
		}
		return(result);
	}
	
	/**
	 * Tests the distance of a point to a regression line to be less
	 * than a given tolerance.
	 * 
	 * @param line RegressionLine to measuse distance against
	 * @param pt Point2D to test
	 * @param tolerance Tolerance applied
	 * @return true if the point is closer that tolerance to the line
	 */
	private static boolean isOnLine(RegressLine line, Point2D pt, double tolerance){
		if(line.distance(pt) < tolerance)
			return true;
		return false;
	}

	/**
	 * Implements the algorithm used to create the initial regression line
	 * and holds the calculated values of the tolerance, index of the last
	 * point, number of points included. 
	 *
	 * @author Juan Alvarez
	 *
	 */
	private static class GetInitialLineAlg {
	    public double tolerance = 0.0d;
	    public int ptIndex = 0;
	    public int numPoints = 0;
	    public RegressLine rg = new RegressLine();
	    private double tolDist = 0.5d;
	    private double maxDist = 0.0d;
	    private double medDist = 0.0d;
	    private double sumDist = 0.0d;

	    /**
	     * Adds a point to the regression line and the calculated values
	     * @param pt
	     */
	    public void addPoint(Point2D pt) {
	        double dist = 0.0d;
            rg.addPoint(pt);
            dist = rg.distance(pt);
            if (dist > maxDist) {
                maxDist = dist;
            }
            sumDist += dist;
            numPoints++;
            medDist = sumDist / numPoints;
            tolerance = maxDist + medDist;
	    }
	    
	    /**
	     * Constructs a new object, performing the algoritm on the 
	     * received initial point, and list of Point2D points.
	     * 
	     * @param pt1 Initial point
	     * @param pts Complete list of points as Point2D objects
	     */
		public GetInitialLineAlg(Point2D pt1,ArrayList pts){
		    boolean found = false;
		    int index = 0;
		    Iterator it = pts.iterator();
		    while(it.hasNext() && !found){
		        double dist = 0.0d;
		        Point2D ptAct = (Point2D) it.next();
		        if(pt1.distance(ptAct) >= tolDist) {
		            ptIndex = index;
		            found = true;
		        }
		        addPoint(ptAct);
		        index++;
		    }
		}
	}

	/**
	 * Transforms the points reasigning the theorical PK of the test profile
	 * to their measured PK.
	 * 
	 * @param input ArrayList of PuntoVO objects, containint the complete list of points
	 * @return Transformed ArrayList of PuntoVO objects
	 * @throws TransformException
	 */
	public static ArrayList transform(ArrayList input) throws TransformException {
		try {
			int index;
			boolean finPerfil = false;
			ArrayList result = new ArrayList();
			ArrayList points = toNumericValues(input);
			Point2D station = (Point2D) points.get(0);
			GetInitialLineAlg gilAlg = new GetInitialLineAlg(station,points);
			RegressLine line = gilAlg.rg;
			
			PuntoVO pto = (PuntoVO)((PuntoVO)input.get(0)).clone();
			String pkAct = pto.getPkAct();
			boolean abort = false;
			pto.setPkTeor(pkAct);
			result.add(pto);
			index = 1;
			Iterator it = points.listIterator(index);
			while(it.hasNext() && !(finPerfil) && !abort){
				Point2D pt = (Point2D) it.next();
				pto = (PuntoVO)((PuntoVO)input.get(index)).clone();
				if(isOnLine(line,pt,gilAlg.tolerance)){
					if(!pto.getPkAct().equals(pkAct)){
					    abort = true;
						break;
					}
					pto.setPkTeor(pkAct);
					result.add(pto);
					if(index > gilAlg.ptIndex) {
					    gilAlg.addPoint(pt);
					}
					index++;
				} else {
					finPerfil = true;
				}
			}
			if(!abort){
			    it = input.listIterator(index);
				while(it.hasNext()){
					pto = (PuntoVO)it.next();
					result.add(pto);
				}
				return(result);
			}
			return(input);
		} catch (Exception e) {
		    Logger.logError(CorrectFirstProfile.class,e);
		    throw new TransformException(e);
		}
	}
}
