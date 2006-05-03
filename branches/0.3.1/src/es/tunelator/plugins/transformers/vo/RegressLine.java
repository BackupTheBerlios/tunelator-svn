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
package es.tunelator.plugins.transformers.vo;


/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Represents a regression line for a mesh of points, as the line
 * formed by the equation: y = a+b*x+e where the "residual" e is
 * a random variable with mean zero.<p/>
 * The coefficients a and b are determined by the condition that
 * the sum of the square residuals is as small as possible.<p/>
 * The residuals are the orthogonal distances between the points 
 * and the line.<p/>
 * 
 * @author Juan Alvarez
 */
public class RegressLine {
	private double a;
	private double b;
	private double sumxx, sumxy;
	private double sumx, sumy;
	private int numberOfPoints;
	/**
	 * Default constructor (everything is zeroed)
	 */
	public RegressLine() {
		sumxx = 0;
		sumxy = 0;
		sumx = 0;
		sumy = 0;		
		numberOfPoints = 0;
	}
	/**
     * Creates a clone of the object
	 * @return The cloned <code>RegressLine</code>
	 */
	public RegressLine cloneLine() {
		RegressLine res = new RegressLine();
		res.setA(a);
		res.setB(b);
		res.setSumx(sumx);
		res.setSumy(sumy);
		res.setSumxx(sumxx);
		res.setSumxy(sumxy);
		res.setNumberOfPoints(numberOfPoints);
		return res;
	}
	/**
     * Angle of the line respect the coordinate axis
	 * @return
	 */
	public double angle() {
		Point2D pt1 = new Point2D(1d,a+b);
		Point2D pt2 = new Point2D(2d,a+b*2d);
		return (new Line2D(pt1,pt2).angle());
	}
	/**
     * Adds a point to the input data used to calculate the
     * regression line.
	 * @param pt
	 */
	public void addPoint(Point2D pt) {
		double x, y;

		x = pt.getX();
		y = pt.getY();
		numberOfPoints++;
		sumx += x;
		sumy += y;
		sumxx += x * x;
		sumxy += x * y;
		calculate();
	}
	/**
	 * Calculates the regression line for the points that where
     * input so far.
	 */
	private void calculate() {
		double n = (double) numberOfPoints;
		double Sxx = sumxx - sumx*sumx / n;
		double Sxy = sumxy - sumx*sumy / n;
		if (Sxx == 0D)
			Sxx = 0.00001d;
		b = Sxy/Sxx;
		a = (sumy-b*sumx) / n;
	}
	/**
     * Returns the distance of the point it receives, to this line
	 * @param pt The point as a <code>Point2D</code<
	 * @return The distance to the line
	 */
	public double distance(Point2D pt){
		double div = Math.sqrt(b*b+1);
		double d = Math.abs(b*pt.getX()-pt.getY()+a)/div;
		return d;
	}
	/**
	 * Zeroes all values
	 */
	public void reset() {
		sumxx = 0;
		sumxy = 0;
		sumx = 0;
		sumy = 0;		
		numberOfPoints = 0;
	}
	/**
	 * @return Returns the a.
	 */
	public final double getA() {
		return a;
	}
	/**
	 * @param a The a to set.
	 */
	public final void setA(double a) {
		this.a = a;
	}
	/**
	 * @return Returns the b.
	 */
	public final double getB() {
		return b;
	}
	/**
	 * @param b The b to set.
	 */
	public final void setB(double b) {
		this.b = b;
	}
	/**
	 * @return Returns the numberOfPoints.
	 */
	public final int getNumberOfPoints() {
		return numberOfPoints;
	}
	/**
	 * @param numberOfPoints The numberOfPoints to set.
	 */
	public final void setNumberOfPoints(int numberOfPoints) {
		this.numberOfPoints = numberOfPoints;
	}
	/**
	 * @return Returns the sumx.
	 */
	public final double getSumx() {
		return sumx;
	}
	/**
	 * @param sumx The sumx to set.
	 */
	public final void setSumx(double sumx) {
		this.sumx = sumx;
	}
	/**
	 * @return Returns the sumxx.
	 */
	public final double getSumxx() {
		return sumxx;
	}
	/**
	 * @param sumxx The sumxx to set.
	 */
	public final void setSumxx(double sumxx) {
		this.sumxx = sumxx;
	}
	/**
	 * @return Returns the sumxy.
	 */
	public final double getSumxy() {
		return sumxy;
	}
	/**
	 * @param sumxy The sumxy to set.
	 */
	public final void setSumxy(double sumxy) {
		this.sumxy = sumxy;
	}
	/**
	 * @return Returns the sumy.
	 */
	public final double getSumy() {
		return sumy;
	}
	/**
	 * @param sumy The sumy to set.
	 */
	public final void setSumy(double sumy) {
		this.sumy = sumy;
	}
}


