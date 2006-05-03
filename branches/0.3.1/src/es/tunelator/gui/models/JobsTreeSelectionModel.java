/*
 * Created on 25-jul-2005
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
package es.tunelator.gui.models;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * This selection model only allows multiple selections if all the nodes 
 * are at level 3 (profile node) and all belong to the same file 
 * (have the same parent node).
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class JobsTreeSelectionModel extends DefaultTreeSelectionModel {
    /**
     * Tells if the paths can be added to the selection. This will be true if
     * all already selected nodes and all the leaf nodes of the received paths
     * share a common parent node, and this one is at level 2 (is a file node).
     * 
     * @param paths
     * @return
     */
    protected boolean allowPathsBeAdded(TreePath[] paths) {
        DefaultMutableTreeNode commonParent = null;
        TreePath[] selected = this.getSelectionPaths();
        if(selected != null){
            commonParent = (DefaultMutableTreeNode)
                ((DefaultMutableTreeNode)selected[0].
                        getLastPathComponent()).getParent();
        }
        for(int i=0; i<paths.length; i++){
            DefaultMutableTreeNode parent = (DefaultMutableTreeNode)
                ((DefaultMutableTreeNode)paths[i].
                        getLastPathComponent()).getParent();
            if(commonParent == null){
                commonParent = parent;
            } else {
                if(!parent.equals(commonParent)){
                    return false;
                }
            }
        }
        if(commonParent.getLevel()==2){
            return true;
        }
        return false;
    }
    
    /* (non-Javadoc)
     * @see javax.swing.tree.TreeSelectionModel#
     * addSelectionPath(javax.swing.tree.TreePath)
     */
    public void addSelectionPath(TreePath path) {
        TreePath[] paths = {path};
        if(this.allowPathsBeAdded(paths)) {
            super.addSelectionPath(path);
        }
    }
    /* (non-Javadoc)
     * @see javax.swing.tree.TreeSelectionModel#
     * addSelectionPaths(javax.swing.tree.TreePath[])
     */
    public void addSelectionPaths(TreePath[] paths) {
        if(this.allowPathsBeAdded(paths)){
            super.addSelectionPaths(paths);
        }
    }
}
