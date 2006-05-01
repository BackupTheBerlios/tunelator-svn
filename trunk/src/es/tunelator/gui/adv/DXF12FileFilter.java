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
 * FileFilter for DXF12 files in 3D format that's used in the export command 
 * file dialog.
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class DXF12FileFilter extends FileFilter {

    /**
     * Allways returns <code>true</code>
     * @see javax.swing.filechooser.FileFilter#accept(java.io.File)
     */
    public boolean accept(File f) {
        return true;
    }
    /**
     * Returns the description to show in the "File type" listbox of the file
     * dialog, as the value of the "description" property in this class's resource file.
     * 
     * @see javax.swing.filechooser.FileFilter#getDescription()
     * @see Resourcer#getString(Class, String)
     */
    public String getDescription() {
        return Resourcer.getString(this.getClass(),"description");
    }
}
