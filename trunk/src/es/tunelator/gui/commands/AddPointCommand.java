/*
 * Created on 09-jun-2005
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

import es.tunelator.UserMessageException;
import es.tunelator.gui.adv.EditPointsDialog;
import es.tunelator.gui.adv.MainFrame;
import es.tunelator.gui.vo.GUIFileVO;
import es.tunelator.log.Logger;
import es.tunelator.resources.Resourcer;
import es.tunelator.vo.PuntoVO;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Performs the consecuences of adding one point and implements
 * the <code>Command</code> interface so the action can be undone.
 * Editing is performed through an <code>EditPointsDialog</code> dialog.
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de>Juan Alvarez Ferrando</a>
 */
public class AddPointCommand implements Command {
    /**
     * <code>frame</code> - The <code>MainFrame</code> where the comand acts
     */
    private MainFrame frame = null;
    /**
     * <code>addedPoint</code> - The <code>PuntoVO</code> that was added
     */
    private PuntoVO addedPoint;
    /**
     * Creates a new command asociated to a <code>MainFrame</code>
     * @param frame
     */
    public AddPointCommand(MainFrame frame){
        if (frame == null)
            throw new NullPointerException("frame parameter is null");
        this.frame = frame;
    }
    /**
     * Returns the name of the command from the resources file of this class.
     * This can be used to be shown on the GUI.
     * @see es.tunelator.gui.commands.Command#getName()
     */
    public String getName() {
        return Resourcer.getString(AddPointCommand.class,"name");
    }
    /**
     * Executes the command add a point to the currently displayed file.
     * @throws UserMessageException
     * @see es.tunelator.gui.commands.Command#execute()
     */
    public void execute() throws UserMessageException {
        try {
            GUIFileVO displayedFile = frame.getDisplayedGUIFile();
		    EditPointsDialog dialog = new EditPointsDialog(frame,false);
		    // Initialize the dialog fields with the common data of the selected points
		    //dialog.setData(initialData);
		    dialog.setModal(true);
		    dialog.setVisible(true);
		    if(dialog.getActionPerformed()== EditPointsDialog.ACCEPT){
		        PuntoVO data = dialog.getData();
		        displayedFile.getData().add(data);
		        addedPoint = data;
		    }
	    } catch (Exception e) {
	        Logger.logError(this.getClass(),e);
	        throw new UserMessageException(Resourcer.getString(null,"error.internal"));
	    }
    }
    /**
     * Undoes the command removing the point from the file data.
     * After the operation, listeners of the file to which the points belong get notified
     * of a data change in the file. This should provoke the update of the affected GUI
     * components.
     * @see es.tunelator.gui.commands.Command#undo()
     */
    public void undo() throws UserMessageException {
        try {
            GUIFileVO displayedFile = frame.getDisplayedGUIFile();
            displayedFile.getData().remove(addedPoint);
        } catch (Exception e) {
            Logger.logError(this.getClass(),e);
            throw new UserMessageException(Resourcer.getString(null,"error.internal"));
        }
    }
}
