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
import javax.swing.tree.TreePath;

import es.tunelator.UserMessageException;
import es.tunelator.gui.adv.MainFrame;
import es.tunelator.resources.Resourcer;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Executes the creation of a new job.
 * This command can't be undone. Calling <code>undo</code> results in an
 * <code>InternalError</code>
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class NewJobCommand implements Command {
    /**
     * <code>frame</code> - The <code>MainFrame</code> were actions will take 
     * place
     */
    private MainFrame frame = null;
    /**
     * Creates a new command to be executed on the given <code>MainFrame</code>
     * @param frame
     */
    public NewJobCommand(MainFrame frame){
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
     * Creates a new job node in the tree
     * @see es.tunelator.gui.commands.Command#execute()
     */
    public void execute() throws UserMessageException {
        String txt = Resourcer.getString(MainFrame.class,
                "mainframe.tree.defaultJobName");
		DefaultMutableTreeNode node = frame.getJobsTreeModel().addJob(txt);
		TreePath tp = new TreePath(node.getPath());
		frame.getJTree().setSelectionPath(tp);
		frame.getJTree().startEditingAtPath(tp);
        frame.resetEnablementStatus();
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
