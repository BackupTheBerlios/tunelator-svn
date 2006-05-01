/*
 * Created on 13-mar-2005
 * 
 * Copyright 2005, Juan Alvarez Ferrando
 * 
 * The author has given non trasferable right to use and modify this
 * code to Lógica Equipamientos Integrales, S.L.
 * 
 * All rights are reserved to the author.  
 *
 */
package es.tunelator.plugins.transformers.vo;

/**
 * Represents a point in a two dimensional space
 * Points can optionally have a distance to te axis
 * 
 * @author Juan Alvarez
 *
 */
public class Point2D {
	double x;
	double y;
	double deje;
	
	/**
	 * @return Returns the deje.
	 */
	public final double getDeje() {
		return deje;
	}
	/**
	 * @param deje The deje to set.
	 */
	public final void setDeje(double deje) {
		this.deje = deje;
	}
	
	/**
	 * Two dimwnsional point with 0 distance to the axis.
	 * @param x
	 * @param y
	 */
	public Point2D(double x, double y){
		this.x = x;
		this.y = y;
		this.deje = 0;
	}
	
	/**
	 * Two dimensional point with distance to the axis
	 * @param x
	 * @param y
	 * @param deje
	 */
	public Point2D(double x, double y, double deje){
		this.x = x;
		this.y = y;
		this.deje = deje;
	}
	/**
	 * Calculates the distance between the point and the point
	 * represented by the parameter.
	 * @param p2 The point against which the distance is calculated
	 * @return
	 */
	public double distance(Point2D p2) {
		double x2 = p2.getX();
		double y2 = p2.getY();
		return(Math.sqrt((x2-x)*(x2-x)+(y2-y)*(y2-y)));
	}
	/**
	 * @return Returns the x.
	 */
	public final double getX() {
		return x;
	}
	/**
	 * @param x The x to set.
	 */
	public final void setX(double x) {
		this.x = x;
	}
	/**
	 * @return Returns the y.
	 */
	public final double getY() {
		return y;
	}
	/**
	 * @param y The y to set.
	 */
	public final void setY(double y) {
		this.y = y;
	}
	/**
	 * Returns the vector that represents this point respect
	 * the origin of coordinates received as a parameter.
	 * @param orig
	 * @return
	 */
	public Vector2D vector(Point2D orig){
		return (new Vector2D(x-orig.getX(),y-orig.getY()));
	}
}
