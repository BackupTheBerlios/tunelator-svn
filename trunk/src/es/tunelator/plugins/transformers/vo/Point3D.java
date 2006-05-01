/*
 * Created on 13-mar-2005
 * 
 * (c) Copyright 2005, Juan Alvarez Ferrando
 * 
 */
package es.tunelator.plugins.transformers.vo;

import java.util.Date;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * Represents a point in a three dimensional space.<br/>
 * This objects are usually created from <code>PuntoVO</code> objects.
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 *
 */
public final class Point3D {
	private double x;
	private double y;
	private double Z;
	private double deje;
	private double heightInc;
	private double theoricPK;
	private double realPK;
	private Date date;
	private Date time;
	private int pkIndex;
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
	 * Three dimensional point. All non set attributes take 
	 * <code>Double.NEGATIVE_INFINITY</code> value
	 * @param x
	 * @param y
	 * @param z
	 */
	public Point3D(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.Z = z;
		this.deje = Double.NEGATIVE_INFINITY;
		this.heightInc = Double.NEGATIVE_INFINITY;
		this.theoricPK = Double.NEGATIVE_INFINITY;
		this.realPK = Double.NEGATIVE_INFINITY;
		this.pkIndex = Integer.MIN_VALUE;
	}
	/**
	 * Three dimensional point
	 * @param x
	 * @param y
	 * @param z
	 * @param deje Distance to the axis
	 * @param heightInc Z increment to the axis
	 * @param theoricPK Theoric kilometric point
	 * @param pkIndex Position of the point in the profile
	 */
	public Point3D(double x, double y, double z,double deje,double heightInc, 
	        		double theoricPK, double realPK, int pkIndex){
		this.x = x;
		this.y = y;
		this.Z = z;
		this.deje = deje;
		this.heightInc = heightInc;
		this.theoricPK = theoricPK;
		this.realPK = realPK;
		this.pkIndex = pkIndex;
	}
	/**
	 * Calculates the distance between the point and the point
	 * represented by the parameter.
	 * @param p2 The point against which the distance is calculated
	 * @return
	 */
	public double distance(Point3D p2) {
		double x2 = p2.getX();
		double y2 = p2.getY();
		double z2 = p2.getZ();
		return(Math.sqrt((x2-x)*(x2-x)+(y2-y)*(y2-y)+(z2-Z)*(z2-Z)));
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
     * @return Returns the z.
     */
    public double getZ() {
        return Z;
    }
    /**
     * @param z The z to set.
     */
    public void setZ(double z) {
        Z = z;
    }
    /**
     * @return Returns the heightInc.
     */
    public double getHeightInc() {
        return heightInc;
    }
    /**
     * @param heightInc The heightInc to set.
     */
    public void setHeightInc(double heightInc) {
        this.heightInc = heightInc;
    }
    
    /**
     * @return Returns the theoricPK.
     */
    public double getTheoricPK() {
        return theoricPK;
    }
    /**
     * @param theoricPK The theoricPK to set.
     */
    public void setTheoricPK(double theoricPK) {
        this.theoricPK = theoricPK;
    }
    /**
     * @return Returns the realPK.
     */
    public double getRealPK() {
        return realPK;
    }
    /**
     * @param realPK The realPK to set.
     */
    public void setRealPK(double realPK) {
        this.realPK = realPK;
    }
    
    /**
     * @return Returns the date.
     */
    public Date getDate() {
        return date;
    }
    /**
     * @param date The date to set.
     */
    public void setDate(Date date) {
        this.date = date;
    }
    /**
     * @return Returns the time.
     */
    public Date getTime() {
        return time;
    }
    /**
     * @param time The time to set.
     */
    public void setTime(Date time) {
        this.time = time;
    }
    /**
     * @return Returns the pkIndex.
     */
    public int getPkIndex() {
        return pkIndex;
    }
    /**
     * @param pkIndex The pkIndex to set.
     */
    public void setPkIndex(int pkIndex) {
        this.pkIndex = pkIndex;
    }
}
