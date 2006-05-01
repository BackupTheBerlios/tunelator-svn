/*
 * Created on 26-jun-2005
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
package es.tunelator.gui.adv;

import java.io.File;

import javax.swing.filechooser.FileFilter;

import es.tunelator.resources.Resourcer;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * To select MDT format in the file type of the export file dialog
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class MDTFileFilter extends FileFilter {
    /**
     * Allways returns true
     * 
     * @see javax.swing.filechooser.FileFilter#accept(java.io.File)
     */
    public boolean accept(File f) {
        return true;
    }
    /**
     * Takes the description shown in the file type listbox from the 
     * "description" property of this class's resource bundle.
     * 
     * @see javax.swing.filechooser.FileFilter#getDescription()
     */
    public String getDescription() {
        return Resourcer.getString(this.getClass(),"description");
    }
}
