/*
 * Created on 03-may-2005
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
package es.tunelator.gui.containers;

import javax.swing.JTree;
import javax.swing.tree.TreePath;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * This specialization of <code>JTree</code> restricts the editable nodes 
 * to only the first level.
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class JobsJTree extends JTree {
    /**
     * @see javax.swing.JTree#isPathEditable(javax.swing.tree.TreePath)
     */
    public boolean isPathEditable(TreePath path) {
        boolean superResult = super.isPathEditable(path);
        // If tree is not editable, respect that setting
        if(superResult){
            // Only allow editing of level 1 nodes (Job names)
            if(path.getPathCount()==2)
                return true;
            else
                return false;
        }
        return superResult;
    }
}
