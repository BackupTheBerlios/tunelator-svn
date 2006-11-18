/*
 * Created on Nov 12, 2006
 * 
 * Copyright 2005, Logica Equipamientos Integrales, S.L.
 * 
 */
package es.tunelator.vo;

import java.util.List;

/**
 * &COPY; 2006 Juan Alvarez Ferrando<p/>
 *     
 * Represents an alignment.</p>
 * Each alignment has a name and a list of ordered geometric components.
 * Currently supported component types are:
 * - Line
 * Future support will be provided for:
 * - Curve
 * - Clothoid spirals
 *
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class AlignmentVO {
    /**
     * Name taken from the file (if found) and showed at the GUI
     */
    String name = "default";
    /**
     * Ordered list of the geometries that form the alignment
     */
    List<AlignmentComponentVO> components = null;
    
    /**
     * New alingnment with given name
     * @param name
     */
    public AlignmentVO(String name) {
        this.name = name;
    }
    /**
     * New alignment with empty name
     */
    public AlignmentVO(){
        this.name = "";
    }
    /**
     * Creates the aligmnet for the given name and list of components.
     * Is used by AlignmentFileUpdater.
     * @param name2
     * @param name
     */
    public AlignmentVO(List<AlignmentComponentVO> name2, String name) {
        if(components.isEmpty()){
            throw new IllegalArgumentException(
                    "Atempt to create ProfileVO with no points");
        }
        this.setComponents(components);
        this.setName(name);
    }
    /**
     * Returns the list of geometric components
     * @return
     */
    public List<AlignmentComponentVO> getComponents() {
        return components;
    }
    /**
     * Sets the list of geometric components
     * @param components
     */
    public void setComponents(List<AlignmentComponentVO> components) {
        this.components = components;
    }
    /**
     * Returns the name of the alignment
     * @return
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the name of the alignment
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Returns the name
     * @see java.lang.Object#toString()
     */
    public String toString(){
        return name;
    }
}
