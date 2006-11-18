/*
 * Created on 01-may-2005
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

import java.io.File;
import java.util.Enumeration;
import java.util.List;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import es.tunelator.UserMessageException;
import es.tunelator.gui.adv.MainFrame;
import es.tunelator.gui.vo.GUIFileVO;
import es.tunelator.gui.vo.GUIStaticFileVO;
import es.tunelator.log.Logger;
import es.tunelator.resources.Resourcer;
import es.tunelator.vo.AlignmentVO;

/**
 * &COPY; 2005 Juan Alvarez Ferrado<br/><br/>
 * 
 * The model for the <code>JTree</code> used to manage the 
 * jobs in the GUI.
 * The tree contains a root node that holds job nodes which in turn
 * hold file nodes, and these hold profile nodes.
 *
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class JobsTreeModel extends DefaultTreeModel {
    // The depth of the different kind of nodes in the tree
    public static final int JOB_LEVEL=1;
    public static final int PROFILES_LEVEL=2;
    public static final int ALIGMENTS_LEVEL=2;
    public static final int POINTSFILE_LEVEL=3;
    public static final int ALIGMENTSFILE_LEVEL=3;
    public static final int ALIGMENT_LEVEL=4;
    public static final int PROFILE_LEVEL=4;
    /**
     * Creates the model with a default root node.
     * The mainframe.tree.root text resource is used. 
     */
    public JobsTreeModel() {
        super(new DefaultMutableTreeNode(Resourcer.getString(MainFrame.class,
                "mainframe.tree.root")));
        DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode)
        	this.getRoot();
    }
    /**
     * Creates a new job node with the specified name.
     * @param jobName The name to show in the new job node.
     * @return <code>DefaultMutableTreeNode</code> of the new node
     */
    public DefaultMutableTreeNode addJob(String jobName) {
        DefaultMutableTreeNode node = null;
        node = new DefaultMutableTreeNode(jobName);
        ((DefaultMutableTreeNode)getRoot()).add(node);
        this.reload();
        return node;
    }
    /**
     * Returns the first node in a breath first walk, with the given user object
     * @param object User object that is searched
     * @return The <code>DefaultMutableTreeNode</code> found or null
     */
    public DefaultMutableTreeNode getObjectTreeNode(DefaultMutableTreeNode start, Object object){
        if(start == null)
            start = (DefaultMutableTreeNode)getRoot();
        Enumeration en = start.breadthFirstEnumeration();
        DefaultMutableTreeNode node = null;
        while(en.hasMoreElements()){
            DefaultMutableTreeNode aux = (DefaultMutableTreeNode)en.
            	nextElement();
            Object obj = aux.getUserObject();
            // ListTreeNodeUpdaters are objects that are inserted as the user 
            // objects of those nodes in a Jtree that we want authomatically
            // updated based on the changes of an underlying EventList.
            // This type of objects save the user object they are substituting
            // but this forces to take them as a special case here.
            if(obj instanceof ListTreeNodeUpdater){
                obj = ((ListTreeNodeUpdater) obj).getUserObject();
            }
            if(obj.equals(object)) {
                node = aux;
                break;
            }
        }
        return node;
    }
    /**
     * Returns the node in the tree for the file that contains the given 
     * profile object.
     * @param profile The profile object who's file node is searched for
     * @return The <code>DefaultMutableTreeNode</code> of the corresponding 
     * node or null if it's not found
     */
    private DefaultMutableTreeNode getGUIFileVONodeFromProfile(Object profile) {
        DefaultMutableTreeNode start = (DefaultMutableTreeNode)getRoot();
        Enumeration en = start.breadthFirstEnumeration();
        DefaultMutableTreeNode node = null;
        while(en.hasMoreElements()){
            DefaultMutableTreeNode aux = (DefaultMutableTreeNode)
            	en.nextElement();
            Object obj = aux.getUserObject();
            if(obj instanceof GUIFileVO){
	            GUIFileVO guiFileVO = (GUIFileVO) obj;
	            if(guiFileVO.getGroups().contains(profile)) {
	                node = aux;
	                break;
	            }
            }
        }
        return node;
    }
    /**
     * Removes a job node given by its name (as shown in the tree)
     * @param jobName The name of the job to remove
     */
    public void removeJob(String jobName) {
        DefaultMutableTreeNode job = null;
        job = getObjectTreeNode(null,jobName);
        if(job!=null){
            job.removeFromParent();
            this.reload();
        }
    }
    /**
     * Adds a file node to the node by the given name.
     * If a job by the given name does not exist, it does nothing.
     * @param file The <code>File</code> to add
     * @param jobName The <code>String</code> name of an existing job 
     * @throws UserMessageException
     */
    public DefaultMutableTreeNode addFile(DefaultMutableTreeNode jobNode, 
            GUIFileVO guiFileVO) throws UserMessageException {
        try {
	        if(jobNode != null && jobNode.getLevel()==JobsTreeModel.JOB_LEVEL){
                // Get the Profiles node under the job if there's one
                String profilesNodeKey = Resourcer.getString(MainFrame.class,
                        "mainframe.tree.profilesNode");
                DefaultMutableTreeNode profilesNode = getObjectTreeNode(jobNode,profilesNodeKey);
                if(profilesNode == null) {
                    profilesNode = new DefaultMutableTreeNode();
                    profilesNode.setUserObject(profilesNodeKey);
                    jobNode.add(profilesNode);
                }
	            DefaultMutableTreeNode fileNode = new DefaultMutableTreeNode();
	            profilesNode.add(fileNode);
	            ListTreeNodeUpdater nodeUpdater = new FileNodeUpdater(this,
	                    fileNode,guiFileVO.getGroups(),guiFileVO);
	            fileNode.setUserObject(nodeUpdater);
	            this.reload(jobNode);
	            return fileNode;
	        }
	        return(jobNode);
        } catch (Exception e){
            // TODO: Throw correct exception
            throw new UserMessageException(e.getMessage());
        }
    }
    /**
     * Adds a list of alignments to a job node.
     * Creates a new alignments node under the job node and adds
     * each alignment in the list as a new child node of it.
     * @param jobNode
     * @param file
     * @param alignmentsList
     * @return
     * @throws UserMessageException
     */
    public DefaultMutableTreeNode addAligmentsFile(DefaultMutableTreeNode
            jobNode, GUIStaticFileVO guiAlignmentsFileVO) throws UserMessageException {
        try {
            if(jobNode != null && jobNode.getLevel()==JobsTreeModel.JOB_LEVEL){
                String alignmentsNodeKey = Resourcer.getString(MainFrame.class,"mainframe.tree.alignmentsNode");
                DefaultMutableTreeNode alignmentsNode = getObjectTreeNode(jobNode,alignmentsNodeKey);
                // If there isn't, create it
                if(alignmentsNode == null) {
                    alignmentsNode = new DefaultMutableTreeNode();
                    alignmentsNode.setUserObject(alignmentsNodeKey);
                    // Alignments is the first node under the job
                    if(jobNode.getChildCount()>0) {
                        this.insertNodeInto(alignmentsNode,jobNode,0);
                    } else {
                        jobNode.add(alignmentsNode);
                    }
                }
                DefaultMutableTreeNode alignmentsFileNode = new DefaultMutableTreeNode();
                alignmentsFileNode.setUserObject(guiAlignmentsFileVO);
                List<AlignmentVO> alignmentList = guiAlignmentsFileVO.getAlignments();
                for(int i=0; i<alignmentList.size(); i++) {
                    DefaultMutableTreeNode alignmentNode = new DefaultMutableTreeNode();
                    alignmentNode.setUserObject(alignmentList.get(i));
                    alignmentsFileNode.add(alignmentNode);
                }
                alignmentsNode.add(alignmentsFileNode);
                this.reload(jobNode);
                return alignmentsFileNode;
            } else {
                String message = Resourcer.getString(MainFrame.class,
                        "error.internal.addAlignmentsFile.noJob");
                throw new UserMessageException(message);
            }
        } catch(UserMessageException e) {
            Logger.logError(this.getClass(),e);
            throw e;
        } catch(Exception e) {
            // TODO: Throw correct exception
            Logger.logError(this.getClass(),e);
            throw new UserMessageException(e.getMessage());
        }
    }
    /**
     * Removes a file from a job. If the job does not exist or it doesn't hold
     * the file, nothing is done.
     * This can remove any kind of file, as it locates the node where the user
     * object equals the file (it doesn't need to be a File type as long as the
     * equals accepts the comparison against a File object)
     * @param file The file to remove
     * @param jobName The <code>String</code> of the job that holds the file
     */
    public void removeFile(DefaultMutableTreeNode jobNode, File file) {
        DefaultMutableTreeNode fileNode = null;
        if(jobNode == null){
            throw new IllegalArgumentException("Requested to remove file,"+
                    "giving a null job node");
        }
        fileNode = getObjectTreeNode(jobNode,file);
        if(fileNode != null){
	        fileNode.removeFromParent();
	        this.reload(jobNode);
        }
    }
}
