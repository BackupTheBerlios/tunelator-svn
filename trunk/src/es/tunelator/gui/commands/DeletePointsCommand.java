/*
 * Created on 14-jun-2005
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

import java.util.List;

import javax.swing.JTable;

import es.tunelator.UserMessageException;
import es.tunelator.gui.adv.MainFrame;
import es.tunelator.gui.vo.GUIFileVO;
import es.tunelator.log.Logger;
import es.tunelator.resources.Resourcer;
import es.tunelator.vo.PuntoVO;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * Executes the command to delete those points currently selected on the
 * table.
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class DeletePointsCommand implements Command {
    /**
     * <code>rows</code> - The array of the <code>PuntoVO</code> deleted 
     * objects
     */
    private PuntoVO deletedPoints[] = {};
    /**
     * <code>frame</code> - The <code>MainFrame</code> on which the command
     * is performed.
     */
    private MainFrame frame = null;
    /**
     * <code>elementCount</code> - How many elements where deleted. We don't
     * use the size of <code>rows</code>, because in the event of an exception
     * while deleting elements, it will be incorrect.
     */
    private int elementCount;
    /**
     * Creates the command to be executed on the specified 
     * <code>MainFrame</code>
     * @param frame - Where action will take place
     */
    public DeletePointsCommand(MainFrame frame) {
        this.frame = frame;
    }
    /**
     * Returns a descriptive name for the executed comand.
     * No use for this right now (0.3.0). In the future this will be
     * displayed in the command list of the redo command.
     * The value is taken from the "name" text resource of this class.
     * @see es.tunelator.gui.commands.Command#getName()
     */
    public String getName() {
        return Resourcer.getString(DeletePointsCommand.class,"name");
    }
    /**
     * Executes the command saving whatever is necesssary to be able
     * to undo it later.
     * <dir>
     * <li>Cancel table editing</li>
     * <li>Create an array to save the points that are going to be
     * deleted. The size will be the number of selected points in the
     * GUI table</li>
     * <li>Remove each selected point in the GUI table from the 
     * displayed file data, and save it in the array.</li>
     * </dir>
     * @see es.tunelator.gui.commands.Command#execute()
     */
    public void execute() throws UserMessageException {
	    try {
	        GUIFileVO displayedFile = frame.getDisplayedGUIFile();
	        frame.cancelTableEditing();
	        JTable pointsTable = frame.getPointsTable();
		    int rows[] = pointsTable.getSelectedRows();
		    // Get the data in the order in which it's present in the
		    // GUI table, so indexes in the table and in the list 
		    // correspond.
		    List data = displayedFile.getTableList();
		    deletedPoints = new PuntoVO[rows.length];
		    for(elementCount=0;elementCount<rows.length;elementCount++){
		        deletedPoints[elementCount] = (PuntoVO) data.remove(rows[elementCount]-elementCount);
		    }
	    } catch (Exception ex) {
	        Logger.logError(this.getClass(),"Deleting points",ex);
	        throw new UserMessageException(Resourcer.getString(this.getClass(),"error.execute"));
	    }
    }
    /**
     * Undoes the deletion of points and notifies listeners, which in turn provokes the
     * update of the affected GUI components.
     * 
     * @see es.tunelator.gui.commands.Command#undo()
     */
    public void undo() throws UserMessageException {
        GUIFileVO displayedFile = frame.getDisplayedGUIFile();
        List points = displayedFile.getData();
        for(int i=0; i<elementCount; i++){
            points.add(deletedPoints[i]);
        }
    }
}
