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
 * Represents a vector in a two dimensional space
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class Vector2D {
	double x;
	double y;
	/**
	 * @param x
	 * @param y
	 */
	public Vector2D(double x, double y){
		this.x = x;
		this.y = y;
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
	 * Computes the lencgth of the vector
	 * @return Length of this vector
	 */
	public double length(){
		return(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
	}
	/**
	 * Computes the angle from this vector to v2 in
	 * decimal grades.
	 * @param v2
	 * @return
	 */
	public double angle(Vector2D v2) {
		double result = 0;
		double incX = x - v2.getX();
		double incY = y - v2.getY();
		if(incX > 0 && incY > 0) {
			result = Math.asin(length()*incX);
		}
		if ( incX > 0 && incY < 0 ){
			result = 200-Math.asin(length()*incX);
		}
		if ( incX < 0 && incY < 0 ){
			result = 200 + Math.abs(Math.asin(length()*incX));
		}
		if ( incX < 0 && incY > 0 ){
			result = 400 + Math.asin(length()*incX);
		}
		return result;
	}
}
