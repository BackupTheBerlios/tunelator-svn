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
 * General type of the representations of components of an axis
 * specification.</p> 
 *
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public abstract class AlignmentComponentVO {
    /**
     * Straight line component
     */
    public static final int AXIS_LINE=0;
    /**
     * Circumference arc component
     */
    public static final int AXIS_ARC=1;
    /**
     * Clothoid spiral component
     */
    public static final int AXIS_SPIRAL_CLOTHOID=2;
    
    /**
     * Gives the type of component represented by the object
     * @return
     */
    public abstract int getType();
}
