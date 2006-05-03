/*
 * Created on 15-jul-2005
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
package es.tunelator.gui.viewers;

import java.util.Comparator;
import java.util.Iterator;

import javax.media.j3d.Appearance;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.GeometryArray;
import javax.media.j3d.LineAttributes;
import javax.media.j3d.LineStripArray;
import javax.media.j3d.PointArray;
import javax.media.j3d.PointAttributes;
import javax.media.j3d.Shape3D;
import javax.vecmath.Point3d;

import ca.odell.glazedlists.BasicEventList;
import ca.odell.glazedlists.SortedList;
import es.tunelator.log.Logger;
import es.tunelator.plugins.transformers.TransformException;
import es.tunelator.plugins.transformers.vo.Point3D;
import es.tunelator.vo.ProfileVO;
import es.tunelator.vo.PuntoVO;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * Defines the Java3D data structure for the graphical representation of a 
 * profile.<p/>
 * A profile is defined as a set of <code>Point3d</code> points in a 
 * <code>LineStripArray</code>, so they appear linked by line segments 
 * following thir order in the profile.<p/>
 * The profile can also be represented with the points not linked by using 
 * a <code>PointArray</code>.
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class ProfileShape3D extends Shape3D {
    /**
     * Array of point coordinates
     */
    protected Point3d[] points;
    /**
     * Number of points in the profile
     */
    protected int[] stripCounts;
    /**
     * Geometry to represent the profile as a connected line
     */
    protected LineStripArray geometry = null;
    /**
     * Geometry that represents the pointcloud
     */
    protected PointArray pointCloud = null;
    /**
     * Appearance properties to apply if no others are
     * provided.
     */
    protected static Appearance defaultAppearance = null;
    
    static {
        defaultAppearance = new Appearance();

        PointAttributes ptAt = new PointAttributes();
        ptAt.setPointSize(1.0f);
        ptAt.setPointAntialiasingEnable(true);

        LineAttributes lnAt = new LineAttributes();
        lnAt.setLineAntialiasingEnable(true);
        lnAt.setLineWidth(1.0f);
        lnAt.setLinePattern(LineAttributes.PATTERN_SOLID);
        
        ColoringAttributes clAt = new ColoringAttributes();
        clAt.setColor(1.0f,0.0f,0.0f);

        defaultAppearance.setLineAttributes(lnAt);
        defaultAppearance.setPointAttributes(ptAt);
        defaultAppearance.setColoringAttributes(clAt);
    }
    /**
     * @return A default appearance to use when one is not specified in the
     * constructor
     */
    public static Appearance getDefaultAppearance(){
        return defaultAppearance;
    }
    /**
     * Creates a profile shape with the default appearance
     * @param profile The profile data to construct the shape
     * @param fp The point where the shape is translated
     */
    public ProfileShape3D(ProfileVO profile,Point3D fp){
        this(profile,fp,null);
    }
    /**
     * Creates a profile shape with the given appearance
     * @param profile The profile data to construct the shape
     * @param fp The point where the shape is translated
     * @param appearance The appearance to use
     */
    public ProfileShape3D(ProfileVO profile, Point3D fp, 
            Appearance appearance){
        try {
            BasicEventList basicList = new BasicEventList();
            basicList.addAll(profile.getElements());
            // Points are ordered on the indexInPK value that represents the
            // sequence in which they have to be taken to draw the profile
	        SortedList pointList = new SortedList(basicList,new Comparator() {
                public int compare(Object o1, Object o2) {
                    try {
	                    Point3D p1 = ((PuntoVO)o1).getPoint3D();
	                    Point3D p2 = ((PuntoVO)o2).getPoint3D();
	                    Integer i1 = new Integer(p1.getPkIndex());
	                    Integer i2 = new Integer(p2.getPkIndex());
	                    return i1.compareTo(i2);
                    } catch (TransformException e){
                        Logger.logError(ProfileShape3D.class,e);
                        throw new InternalError("Error converting PuntoVO to"+
                                " Point3D");
                    }
                }
	        });
	        Logger.logDebug(this.getClass(),"Profile Shape: ["+profile.getPK()+
	                "] "+ pointList.size()+" points");
	        Iterator it = pointList.iterator();
	        
	        points = new Point3d[pointList.size()];
	        int pointCount = 0;
	        pointCloud = new PointArray(pointList.size(),
	                GeometryArray.COORDINATES);
	        while (it.hasNext()){
	            PuntoVO pointVO = (PuntoVO) it.next();
		        Logger.logDebug(this.getClass(),"Profile Shape: ["+
		                profile.getPK()+"] Point:"+ pointVO.toString());
	            Point3D p3d = pointVO.getPoint3D();
	            points [pointCount]=new Point3d(p3d.getX()-fp.getX(),
	                    p3d.getY()-fp.getY(),p3d.getZ()-fp.getZ());
	            pointCloud.setCoordinate(pointCount,points[pointCount]);
	            pointCount++;
	        }
	        if(points.length > 1){
		        stripCounts = new int[] {points.length};
	            geometry = new LineStripArray(pointCount,
	                    GeometryArray.COORDINATES,stripCounts);
		        Logger.logDebug(this.getClass(),"Profile Shape: ["+
		                profile.getPK()+"] "+points.length+" points in array");
		        geometry.setCoordinates(0,points);
	            setGeometry(geometry);
	        } else {
	            setGeometry(pointCloud);
	        }
	        if(appearance == null) {
		        Logger.logDebug(this.getClass(),"Appearance is null, using "+
		                "default appearance");
		        appearance = ProfileShape3D.getDefaultAppearance();
	            setAppearance(appearance);
	        } else {
	            setAppearance(appearance);
	        }
        } catch (TransformException e) {
            Logger.logError(this.getClass(),"Profile Shape: ["+profile.getPK()+
                    "] : Invalid data format");
            Logger.logError(this.getClass(),e);
        }
    }

    /**
     * @return Returns the pointCloud.
     */
    public PointArray getPointCloud() {
        return pointCloud;
    }
    /**
     * @return Returns the points.
     */
    public Point3d[] getPoints() {
        return points;
    }
    /**
     * @return Returns the stripCounts.
     */
    public int[] getStripCounts() {
        return stripCounts;
    }
    
}
