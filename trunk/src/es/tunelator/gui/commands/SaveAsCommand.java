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

import javax.swing.JFileChooser;
import javax.swing.tree.DefaultMutableTreeNode;

import es.tunelator.UserMessageException;
import es.tunelator.gui.adv.MainFrame;
import es.tunelator.gui.vo.GUIFileVO;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Saves the data of a <code>GUIFileVO</code> to file selected by the user
 * This command can't be undone. Calling <code>undo</code> results in an
 * <code>InternalError</code>
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando<p/>
 */
public class SaveAsCommand implements Command {
    /**
     * The <code>MainFrame</code> from where the command is invoked
     */
    private MainFrame frame = null;
    /**
     * The <code>GUIFileVO</code> containing the data file that's saved
     */
    private GUIFileVO guiFileVO = null;
    /**
     * Creates a new command to be executed on the given <code>MainFrame</code>
     * @param frame
     */
    public SaveAsCommand(MainFrame frame,GUIFileVO guiFileVO){
        this.frame = frame;
        this.guiFileVO = guiFileVO;
    }
    /**
     * Allways return <code>null</code>
     * 
     * @see es.tunelator.gui.commands.Command#getName()
     */
    public String getName() {
        return null;
    }
    /**
     * Saves the data in the file
     * 
     * @see es.tunelator.gui.commands.Command#execute()
     */
    public void execute() throws UserMessageException {
	    DefaultMutableTreeNode node = frame.getJobsTreeModel().
            getObjectTreeNode(null,guiFileVO);
	    if(node != null){
		    JFileChooser chooser = new JFileChooser();
		    int option = chooser.showSaveDialog(frame);
		    if(option == JFileChooser.APPROVE_OPTION){
		        File file = chooser.getSelectedFile();
		        guiFileVO.setFile(file);
		        new SaveCommand(guiFileVO).execute();
			    frame.getJobsTreeModel().nodeChanged(node);
		    }
	    } else {
	        throw new InternalError("File object not found in the tree!");
	    }
    }
    /**
     * It's illegal to call this method. Doing so results in an 
     * <code>InternalError</code>
     * 
     * @see es.tunelator.gui.commands.Command#undo()
     */
    public void undo() throws UserMessageException {
        throw new InternalError("Command can't be undone.");
    }
}
