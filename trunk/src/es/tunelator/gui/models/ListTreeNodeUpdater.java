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

import java.util.Iterator;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import ca.odell.glazedlists.EventList;
import ca.odell.glazedlists.event.ListEvent;
import ca.odell.glazedlists.event.ListEventListener;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * To be used as user object in tree nodes that represent lists and have their
 * children in the tree created from the list elements.<p/>
 * It registers as <code>ListEventListener</code> of the <code>EventList</code> on which it's 
 * created, and authomatically updates the child nodes upon changes in the list.<p/>
 * Child nodes in the tree will exist in the same order as the corresponding elements in the list.
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public abstract class ListTreeNodeUpdater implements ListEventListener {
    private EventList list = null;
    private Object userObject = null;
    private DefaultMutableTreeNode node = null;
    private DefaultTreeModel treeModel = null;
    /**
     * The updater will listen to the received <code>EventList</code>, nodes will be created as children of
     * the <code>DefaultMutableTreeNode</code>.
     * The <code>TreeModel</code> is needed to use its <code>reload()</code> method in order to provoke the 
     * changes in the model to be reflected in the <code>JTree</code> widget.
     * The last param gves the opportunity to store the user object that would be stored in <code>node</code>
     * if it wheren't for the use of this updater, in case it's necessary, and it can get <code>null</code> value.
     * If so, the node in the JTree will show no text, getting it to show something is as simple as 
     * using a <code>String</code> or any type that implements <code>toString()</code> in the last parameter.
     * @param treeModel 
     * @param node
     * @param list
     * @param userObject
     */
    public ListTreeNodeUpdater(DefaultTreeModel treeModel, DefaultMutableTreeNode node, EventList list, Object userObject) {
        this.treeModel = treeModel;
        this.node = node;
        this.list = list;
        this.userObject = userObject;
        populateTree();
        this.list.addListEventListener(this);
    }
    /**
     * Allows this object to be garbage collected when no other object is referencing it
     */
    public void dispose(){
        this.list.removeListEventListener(this);
        this.userObject = null;
        this.list = null;
        this.node = null;
        this.treeModel = null;
    }
    /**
     * Decendant types implement this method to create the proper node structure under the node
     * that will hold their objects.
     * The <code>DefaultMutableTreeNode</code> that's created is returned, but it must be already 
     * be a child of the <code>parent</code> node and have the given user object.
     * @param parent The <code>DefaultMutableTreeNode</code> where the children structur to hold 
     * the user object will be created
     * @param userObject The data that the tree structure to create is to hold
     * @return The root <code>DefaultMutableTreeNode</code> of the created structure.
     */
    protected abstract DefaultMutableTreeNode createChildNode(DefaultMutableTreeNode parent, Object userObject);
    /**
     * Creates child nodes from the elements in the list.
     */
    public void populateTree(){
        Iterator it = list.iterator();
        while(it.hasNext()){
            Object childUserObject = it.next();
            createChildNode(node,childUserObject);
        }
    }
    /**
     * Gets invoked when changes occur to the contents of the list, and 
     * updates the nodes of the tree model accordingly. It the invokes 
     * <code>reload(node)</code> on the tree model for the affected node 
     * so changes are reflected in the <code>JTree</code>
     * @see ca.odell.glazedlists.event.ListEventListener#listChanged
     * (ca.odell.glazedlists.event.ListEvent)
     */
    public void listChanged(ListEvent listChanges) {
        while(listChanges.next()){
            int type = listChanges.getType();
            int index = listChanges.getIndex();
            if(type == ListEvent.INSERT){
                Object element = listChanges.getSourceList().get(index);
                DefaultMutableTreeNode newNode = createChildNode(node,element);
                node.insert(newNode,index);
            } else {
                if(type == ListEvent.UPDATE){
                    node.remove(index);
                    Object element = listChanges.getSourceList().get(index);
                    DefaultMutableTreeNode newNode = createChildNode(node,element);
                    node.insert(newNode,index);
                } else {
                    if(type == ListEvent.DELETE){
                        node.remove(index);
                    }
                }
            }
        }
        treeModel.reload(node);
    }
    /**
     * @return The <code>EventList</code> to which this updater listens.
     */
    public EventList getList() {
        return list;
    }
    /**
     * @return The <code>DefaultMutableTreeNode</code> that receives the contents of the list
     * as child nodes.
     */
    public DefaultMutableTreeNode getNode() {
        return node;
    }
    /**
     * @return The <code>TreeModel</code> where the nodes are inserted.
     */
    public DefaultTreeModel getTreeModel() {
        return treeModel;
    }
    /**
     * @return The userObject that this updates substitutes and to which the <code>toString()</code>
     * method is relayed.
     */
    public Object getUserObject() {
        return userObject;
    }
    /**
     * If the user object is not <code>null</code>, relays this method to it, else returns an empty string.
     * 
     * @see java.lang.Object#toString()
     */
    public String toString(){
        if(userObject != null)
            return userObject.toString();
        return "";
    }
}
