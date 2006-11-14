/*
 * Created on Nov 11, 2006
 * 
 * Copyright 2005, Logica Equipamientos Integrales, S.L.
 * 
 */
package es.tunelator.vo;

import java.util.List;

/**
 * &COPY; 2006 Juan Alvarez Ferrando<p/>    
 * 
 * Access interface to any kind of axis, no matter how it's
 * defined.</p>
 * Initially we only read LandXML specifications but this 
 * leaves the door open to others in the future.</p>
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public interface AlignmentIf {
    public List getComponents();
    public AlignmentComponentVO getComponent(int i);
}
