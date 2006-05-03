/*
 * Created on 28-jun-2005
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
package es.tunelator.gui.commands;

import javax.swing.tree.DefaultMutableTreeNode;

import es.tunelator.UserMessageException;
import es.tunelator.gui.adv.MainFrame;
import es.tunelator.gui.models.PointsTableModel;
import es.tunelator.gui.vo.GUIFileVO;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Executes the closing of a job.
 * This command can't be undone. Calling <code>undo</code> results in an
 * <code>InternalError</code>
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class CloseJobCommand implements Command {
    /**
     * <code>frame</code> - The <code>MainFrame</code> where actions are 
     * performed
     */
    private MainFrame frame = null;
    /**
     * Creates a new command to be executed on the given <code>MainFrame</code>
     * @param frame
     */
    public CloseJobCommand(MainFrame frame){
        this.frame = frame;
    }
    /**
     * Allways returns <code>null</code>
     * @see es.tunelator.gui.commands.Command#getName()
     */
    public String getName() {
        return null;
    }
    /**
     * Closes the currently selected job in the tree
     * @see es.tunelator.gui.commands.Command#execute()
     */
    public void execute() throws UserMessageException {
		DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)
			frame.getJTree().getLastSelectedPathComponent();
		// Level 0 is the root, level 1 the jobs nodes
		if(selectedNode != null && selectedNode.getLevel()==1) {
		    // Next of the parent's children
		    DefaultMutableTreeNode nextSibling = selectedNode.getNextSibling();
		    // Previous of the parent's children
		    DefaultMutableTreeNode prevSibling = selectedNode.getPreviousSibling();
		    // The removed node has a 
		    if((nextSibling != null)||(prevSibling!=null)){
		        // There's a brother to set as the displayed file
		        // Preference is given to the next brother over the previous one
		        DefaultMutableTreeNode newSelectedJob = (nextSibling!=null) ? nextSibling:prevSibling;
		        GUIFileVO newDisplayedFile = (GUIFileVO) newSelectedJob.getUserObject();
		        frame.setDisplayedGUIFile(newDisplayedFile,true);
		    } else {
		        // There are no more jobs after removing this one
			    PointsTableModel emptyModel = frame.getPointsTableModel(null);
			    frame.getPointsTable().setModel(emptyModel);
			    selectedNode.removeFromParent();
			    frame.setDisplayedGUIFile(frame.getEmptyGUIFile(),false);
			    frame.getJobsTreeModel().reload();
		        frame.resetEnablementStatus();
		    }
		}
    }
    /**
     * It's illegal to call this method. Doing so results in an 
     * <code>InternalError</code>
     * @see es.tunelator.gui.commands.Command#undo()
     */
    public void undo() throws UserMessageException {
        throw new InternalError("Command can't be undone.");
    }
}
