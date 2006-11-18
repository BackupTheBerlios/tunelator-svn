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
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

import es.tunelator.UserMessageException;
import es.tunelator.gui.adv.IspolFileFilter;
import es.tunelator.gui.adv.LandXMLFileFilter;
import es.tunelator.gui.adv.MainFrame;
import es.tunelator.gui.models.FileNodeUpdater;
import es.tunelator.gui.models.JobsTreeModel;
import es.tunelator.gui.vo.GUIFileVO;
import es.tunelator.gui.vo.GUIStaticFileVO;
import es.tunelator.plugins.readers.LandXML11Reader;
import es.tunelator.plugins.readers.PlainFormatReader;
import es.tunelator.plugins.transformers.SetIndexInProfile;
import es.tunelator.plugins.transformers.TransformException;
import es.tunelator.resources.Resourcer;
import es.tunelator.vo.AlignmentComponentVO;
import es.tunelator.vo.AlignmentVO;
import es.tunelator.vo.PuntoVO;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<p/>    
 * 
 * Executes the addition of the alignment definitions in in LandXML file to a job.
 * This command can't be undone. Calling <code>undo</code> results in an
 * <code>InternalError</code>
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class AddAlignmentFileCommand implements Command {
    /**
     * <code>frame</code> - The <code>MainFrame</code> upon which actions
     * are performed.
     */
    private MainFrame frame = null;
    /**
     * Creates a new command to be executed on the given <code>MainFrame</code>
     * @param frame
     */
    public AddAlignmentFileCommand(MainFrame frame){
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
     * Adds an axis definition file to the currently selected job node in the 
     * tree
     * @see es.tunelator.gui.commands.Command#execute()
     */
    public void execute() throws UserMessageException {
		DefaultMutableTreeNode node = (DefaultMutableTreeNode)frame.
			getJTree().getLastSelectedPathComponent();
        JobsTreeModel treeModel = frame.getJobsTreeModel();
		if((node != null) && (node.getLevel()>=1)){
		    // Get the job's node
            DefaultMutableTreeNode jobNode = (DefaultMutableTreeNode) node.getPath()[1];
		    JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(new LandXMLFileFilter());
		    int option = chooser.showOpenDialog(frame);
		    if(option == JFileChooser.APPROVE_OPTION){
		        File file = chooser.getSelectedFile();
                // Read the file and return the alignments
	            LandXML11Reader reader = new LandXML11Reader(file); 
                List<AlignmentVO> alignmentsList = reader.getAlignmentsList();
                GUIStaticFileVO guiStaticFileVO = new GUIStaticFileVO(file,alignmentsList);
                // Create the tree nodes with their corresponding user objects
                DefaultMutableTreeNode alignmentsFileNode = frame.getJobsTreeModel().
                    addAligmentsFile(jobNode,guiStaticFileVO);
                // Select the alignments file in the tree
	            TreePath tp = new TreePath(alignmentsFileNode.getPath());
				frame.getJTree().expandPath(tp);
				frame.getJTree().setSelectionPath(tp);
			    // Force the update of the menu and menubar options state
		        frame.resetEnablementStatus();
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
