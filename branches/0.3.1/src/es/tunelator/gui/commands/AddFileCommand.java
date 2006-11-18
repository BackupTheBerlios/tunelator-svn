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

import java.io.File;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import es.tunelator.UserMessageException;
import es.tunelator.gui.adv.MainFrame;
import es.tunelator.gui.models.FileNodeUpdater;
import es.tunelator.gui.models.JobsTreeModel;
import es.tunelator.gui.vo.GUIFileVO;
import es.tunelator.plugins.readers.PlainFormatReader;
import es.tunelator.plugins.transformers.SetIndexInProfile;
import es.tunelator.plugins.transformers.TransformException;
import es.tunelator.resources.Resourcer;
import es.tunelator.vo.PuntoVO;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<p/>    
 * 
 * Executes the addition of a file to a job.
 * This command can't be undone. Calling <code>undo</code> results in an
 * <code>InternalError</code>
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class AddFileCommand implements Command {
    /**
     * <code>frame</code> - The <code>MainFrame</code> upon which actions
     * are performed.
     */
    private MainFrame frame = null;
    /**
     * Creates a new command to be executed on the given <code>MainFrame</code>
     * @param frame
     */
    public AddFileCommand(MainFrame frame){
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
     * Adds a file to the currently selected job node in the tree
     * @see es.tunelator.gui.commands.Command#execute()
     */
    public void execute() throws UserMessageException {
		DefaultMutableTreeNode node = (DefaultMutableTreeNode)frame.
			getJTree().getLastSelectedPathComponent();
		if((node != null) && (node.getLevel()>=JobsTreeModel.JOB_LEVEL)){
		    List data = null;
		    // Get the job's node
            DefaultMutableTreeNode jobNode = (DefaultMutableTreeNode) 
                node.getPath()[JobsTreeModel.JOB_LEVEL];
		    JFileChooser chooser = new JFileChooser();
		    int option = chooser.showOpenDialog(frame);
		    if(option == JFileChooser.APPROVE_OPTION){
		        File file = chooser.getSelectedFile();
	            data = PlainFormatReader.readFile(file);
	            try {
	               // Asign the indexInPK attribute value to each point
	               data = (List) SetIndexInProfile.transform(data);
	            } catch(TransformException e){
	               throw new UserMessageException(
	                       Resourcer.getString(this.getClass(),
	                               "error.transform"));
	            }
                // Create the new user interface file structure
		        GUIFileVO guiFileVO = new GUIFileVO(file,data,
		                PuntoVO.defaultComparator(),PuntoVO.class);
		        // The tree model reads and parses the file, leaving the 
	            // contents in the user object of the node that
		        // represents the file.
	            DefaultMutableTreeNode fileNode = frame.getJobsTreeModel().
	            	addFile(jobNode,guiFileVO);
	            // Extract the file object from the tree node
	            GUIFileVO displayedFile = (GUIFileVO) (
	                    (FileNodeUpdater) fileNode.getUserObject()).
	                    	getUserObject();
	            // Sets and displays the file in the table and preview panels
	            frame.setDisplayedGUIFile(displayedFile,true);
	            // Register the frame as listener of the file's undo manager 
	            // to update the state of menu and 
	            // menubar options when the list of undoable actions changes. 
	            // For example if there's only one
	            // undoable action and it's undone, the undo menu option and 
	            // button in the menubar have to be deactivated.
	            displayedFile.getUndoManager().addUndoableCommandListener(
	                    frame);
	            // Have the node of the file expanded and selected
	            TreePath tp = new TreePath(fileNode.getPath());
				frame.getJTree().expandPath(tp);
				frame.getJTree().setSelectionPath(tp);
			    // Force the update of the menu and menubar options state
		        frame.resetEnablementStatus();
		        // Update the previsualization with the data of the opened file
			    frame.getPreviewPanel().setFile(displayedFile);
			    // This hack is necessary to avoid the preview panel from 
			    // coming to the front even if it's not
			    // the selected tab. This happens because Java3D panels are not
			    // lightweight and most of the rest of swing's widgets are.
			    frame.correctTabStatus();
		    }
		} else {
	        throw new UserMessageException(Resourcer.getString(MainFrame.class,
                    "info.selectJobNode"));
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
