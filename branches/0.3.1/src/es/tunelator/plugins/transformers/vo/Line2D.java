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
 * Represents a line in a two dimensional space, defined
 * from two points.
 * 
 * @author Juan Alvarez
 *
 */
public class Line2D {
	Point2D p1;
	Point2D p2;

	/**
	 * Constructs a line from two points
	 * @param p1
	 * @param p2
	 */
	public Line2D(Point2D p1, Point2D p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	/**
	 * Calculates the angle formed by the line. 
	 * The result is given in centesimal grades.
	 */
	public double angle(){
		double incX = p2.x - p1.x;
		double incY = p2.y - p1.y;
		double radians = Math.atan(incY/incX);
		double centesimal = (radians *180*100)/(Math.PI*90);
		return (centesimal);
	}
	
	public double distance(Point2D pt){
		double a;
		double b = -1d;
		double c;
		double dx = (p2.x-p1.x);
		double dy = (p2.y-p1.y);
		if (dx == 0d)
		    return Math.abs(pt.x - p2.x);
		if (dy == 0d)
		    return Math.abs(pt.y - p2.y);
		a = dy/dx;
		c = p1.y - (p1.x * (a));
		double div = Math.sqrt(a*a+1);
		double d = Math.abs(a*pt.getX()-pt.getY()+c)/div;
		return d;
	}
	/**
	 * @return Returns the p1.
	 */
	public final Point2D getP1() {
		return p1;
	}
	/**
	 * @param p1 The p1 to set.
	 */
	public final void setP1(Point2D p1) {
		this.p1 = p1;
	}
	/**
	 * @return Returns the p2.
	 */
	public final Point2D getP2() {
		return p2;
	}
	/**
	 * @param p2 The p2 to set.
	 */
	public final void setP2(Point2D p2) {
		this.p2 = p2;
	}
}
