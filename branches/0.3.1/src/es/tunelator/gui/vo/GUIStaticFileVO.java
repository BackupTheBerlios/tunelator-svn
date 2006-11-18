/*
 * Created on Nov 18, 2006
 *
 * Tunelator surveying software.
 * 
 * Copyright (C) 2006 Juan Alvarez Ferrando
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
package es.tunelator.gui.vo;

import java.io.File;
import java.util.List;

import es.tunelator.vo.AlignmentVO;

/**
 * &COPY; 2006 Juan Alvarez Ferrando<p/>
 *     
 * Represents a file which contents are not edited. Used as user
 * object for static file nodes.
 *
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class GUIStaticFileVO {
    File file;
    List elements;
    /**
     * @param file
     * @param elements
     */
    public GUIStaticFileVO(File file, List elements) {
        this.file = file;
        this.elements = elements;
    }
    /**
     * @return Returns the alignments.
     */
    public List getAlignments() {
        return elements;
    }
    /**
     * @param elements The alignments to set.
     */
    public void setAlignments(List elements) {
        this.elements = elements;
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
     * Returns the file's name
     * @see java.lang.Object#toString()
     */
    public String toString(){
        return file.getName();
    }
}
