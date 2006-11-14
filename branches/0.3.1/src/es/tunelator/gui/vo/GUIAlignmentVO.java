/*
 * Created on Nov 12, 2006
 * 
 * Copyright 2005, Logica Equipamientos Integrales, S.L.
 * 
 */
package es.tunelator.gui.vo;

import java.io.File;
import java.util.Collection;

import ca.odell.glazedlists.BasicEventList;
import ca.odell.glazedlists.EventList;
import es.tunelator.vo.AlignmentVO;

/**
 * Holds all that's necessary to handle an alignment in the 
 * GUI. Currently, a GUI level name and the AlignmentVO object
 * containing the geometries.
 *
 * @author Juan Alvarez
 */
public class GUIAlignmentVO {
    File file;
    String name = "default";
    AlignmentVO alignment;
    /**
     * New object to hold an <code>alignment</code> read from a 
     * <code>file</code> and identified by a given <code>name</code>.
     * 
     * @param name Name to show in the GUI
     * @param file File from where the alignment was obtained
     * @param alignment AlignmentVO that contains the geometries
     */
    public GUIAlignmentVO(String name,File file,AlignmentVO alignment) {
        this.name = name;
        this.file = file;
    }
    /**
     * @return Returns the alignment.
     */
    public AlignmentVO getAlignment() {
        return alignment;
    }
    /**
     * @param alignment The alignment to set.
     */
    public void setAlignment(AlignmentVO alignment) {
        this.alignment = alignment;
    }
    /**
     * @return Returns the file.
     */
    public File getFile() {
        return file;
    }
    /**
     * @param file The file to set.
     */
    public void setFile(File file) {
        this.file = file;
    }
    /**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }
    /**
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Returns the name. This will be shown in the GUI to label
     * this alignment.
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return name;
    }
    
}
