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
import es.tunelator.gui.models.ListTreeNodeUpdater;
import es.tunelator.gui.models.PointsTableModel;
import es.tunelator.gui.vo.GUIFileVO;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Executes the removal of a file to a job.
 * This command can't be undone. Calling <code>undo</code> results in an
 * <code>InternalError</code>
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class RemoveFileCommand implements Command {
    /**
     * The <code>MainFrame</code> where the GUI actions of the command will be done
     */
    private MainFrame frame = null;
    /**
     * Creates a new command to be executed on the given <code>MainFrame</code>
     * @param frame The <code>MainFrame</code> where the GUI actions of the command will be done
     */
    public RemoveFileCommand(MainFrame frame){
        this.frame = frame;
    }
    /**
     * Allways returns <code>null</code>. It's designated to provide a meaningful description
     * of the command to be displayed to the user, for example if a list of commands where presented.
     * @see es.tunelator.gui.commands.Command#getName()
     */
    public String getName() {
        return null;
    }
    /**
     * Removes the currently selected file
     * @see es.tunelator.gui.commands.Command#execute()
     */
    public void execute() throws UserMessageException {
		DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)frame.getJTree().getLastSelectedPathComponent();
		if((selectedNode != null) && (selectedNode.getLevel()>2)){
		    // Next of the parent's children
		    DefaultMutableTreeNode nextSibling = selectedNode.getNextSibling();
		    // Previous of the parent's children
		    DefaultMutableTreeNode prevSibling = selectedNode.getPreviousSibling();
		    // The removed node has a 
		    if((nextSibling != null)||(prevSibling!=null)){
		        // There's a brother to set as the displayed file
		        // Preference is given to the next brother over the previous one
		        DefaultMutableTreeNode newSelectedJob = (nextSibling!=null) ? nextSibling:prevSibling;
		        GUIFileVO newDisplayedFile = (GUIFileVO)((ListTreeNodeUpdater) newSelectedJob.getUserObject()).getUserObject();
		        frame.setDisplayedGUIFile(newDisplayedFile,true);
		    } else {
			    PointsTableModel emptyModel = frame.getPointsTableModel(null);
			    frame.getPointsTable().setModel(emptyModel);
			    frame.setDisplayedGUIFile(frame.getEmptyGUIFile(),false);
		    }
		    DefaultMutableTreeNode parent = (DefaultMutableTreeNode)selectedNode.getParent();
		    selectedNode.removeFromParent();
		    frame.getJobsTreeModel().reload(parent);
	        frame.resetEnablementStatus();
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
