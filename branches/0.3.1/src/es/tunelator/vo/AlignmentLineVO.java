/*
 * Created on Nov 12, 2006
 * 
 * Copyright 2005, Logica Equipamientos Integrales, S.L.
 * 
 */
package es.tunelator.vo;

/**
 * &COPY; 2006 Juan Alvarez Ferrando<p/>
 *     
 * Represents a straight line component of an axis definition.</p>
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class AlignmentLineVO extends AlignmentComponentVO {
    /**
     * Start point. 0 is the X, 1 is the Y
     */
    double start[]=new double[2];
    /**
     * End point. 0 is the X, 1 is the Y
     */
    double end[]=new double[2];
    /**
     * Returns AlignmentComponentVO.AXIS_LINE as the type of the
     * component.
     * 
     * @see es.tunelator.vo.AlignmentComponentVO#getType()
     */
    public int getType() {
        return AlignmentComponentVO.AXIS_LINE;
    }
    /**
     * Gives the end point coordinates as an array of 2 double, where
     * position 0 is the x coordinate and position 1 the y.
     * @return double[2]
     */
    public double[] getEnd() {
        return end;
    }
    /**
     * Sets the coordinates of the end point given in an array of 2 double,
     * where position 0 is the x coordinate and position 1 the y.
     * 
     * @param end  Array of 2 double
     */
    public void setEnd(double[] end) {
        this.end[0] = end[0];
        this.end[1] = end[1];
    }
    /**
     * Sets the coordinates of the end point.
     * 
     * @param x Coordinate X of the end point
     * @param y Coordinate Y of the end point
     */
    public void setEnd(double x, double y) {
        end[0]=x;
        end[1]=y;
    }
    /**
     * Gives the start point coordinates as an array of 2 double, where
     * position 0 is the x coordinate and position 1 the y.
     * @return double[2]
     */
    public double[] getStart() {
        return start;
    }
    /**
     * Sets the coordinates of the start point given in an array of 2 double,
     * where position 0 is the x coordinate and position 1 the y.
     * 
     * @param end  Array of 2 double
     */
    public void setStart(double[] start) {
        this.start[0] = start[0];
        this.start[1] = start[1];
    }
    /**
     * Sets the coordinates of the start point.
     * 
     * @param x Coordinate X of the start point
     * @param y Coordinate Y of the start point
     */
    public void setStart(double x, double y) {
        start[0]=x;
        start[1]=y;
    }
}
