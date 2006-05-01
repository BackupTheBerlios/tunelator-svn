/*
 * Created on 15-sep-2005
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

import java.util.List;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import ca.odell.glazedlists.EventList;
import es.tunelator.vo.ProfileVO;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * Provides the logic to create child nodes when a file node in the tree 
 * needs to be udated.<p/>
 * File's child nodes are leafs containing a <code>ProfileVO</code> user
 * object.
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class FileNodeUpdater extends ListTreeNodeUpdater {
    /**
     * Creates an updater
     * @param treeModel - The model used to force reload after updates
     * @param node - The node that will be updated
     * @param list - The list that contains the data and emits the events
     * @param userObject - The user object that the updater replaces
     */
    public FileNodeUpdater(DefaultTreeModel treeModel, 
            DefaultMutableTreeNode node, EventList list, Object userObject) {
        super(treeModel,node,list,userObject);
    }
    /**
     * @see es.tunelator.gui.models.ListTreeNodeUpdater#createChildNode
     * (javax.swing.tree.DefaultMutableTreeNode, java.lang.Object)
     */
    protected DefaultMutableTreeNode createChildNode(
            DefaultMutableTreeNode parent, Object userObject) {
        DefaultMutableTreeNode result = new DefaultMutableTreeNode();
        result.setUserObject(new ProfileVO((List)userObject));
        parent.add(result);
        return result;
    }
    /**
     * Relays the equality comparation to the replaced user object to avoid
     * affecting the search of nodes in the tree based in their user object.
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object obj){
        return this.getUserObject().equals(obj);
    }
}
