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

import java.util.List;

import javax.swing.JTable;

import es.tunelator.UserMessageException;
import es.tunelator.gui.adv.EditPointsDialog;
import es.tunelator.gui.adv.MainFrame;
import es.tunelator.gui.vo.GUIFileVO;
import es.tunelator.log.Logger;
import es.tunelator.resources.Resourcer;
import es.tunelator.vo.PuntoVO;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * 
 * Performs the consecuences of editing point's data and implements
 * the <code>Command</code> interface so the action can be undone.<p/>
 * Editing is performed through a dialog window.
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class EditPointsCommand implements Command {
    /**
     * <code>frame</code> - The <code>MainFrame</code> where actions are
     * performed.
     */
    private MainFrame frame = null;
    /**
     * <code>savedPoints</code> - Array of the <code>PuntoVO</code> 
     * objects that where modified by the command
     */
    private PuntoVO savedPoints[] = {};
    /**
     * <code>savedPoints</code> - -Array of the <code>PuntoVO</code> 
     * copied from those that were modified, in their original state.
     */
    private PuntoVO originalPoints[] = {};
    /**
     * Creates a new command asociated to a <code>MainFrame</code>
     * @param frame
     */
    public EditPointsCommand(MainFrame frame){
        if (frame == null)
            throw new NullPointerException("frame parameter is null");
        this.frame = frame;
    }
    /**
     * Returns a description of the executed command.
     * It's not used at all now (0.3.0) but will be used in the future
     * to show in the command list of the redo feature.
     * The value is taken from the "name" text resource of this class.
     * @see es.tunelator.gui.commands.Command#getName()
     */
    public String getName() {
        return Resourcer.getString(EditPointsCommand.class,"name");
    }
    /**
     * Obtains a <code>PuntoVO</code> object loaded with the values that all 
     * the points in the <code>points</code> parameter have in common.
     * Any attribute for which any of the points have a different value than
     * the rest is left blank (empty string).
     * @param points - Array of <code>PuntoVO</code>
     * @return <code>PuntoVO</code> - A new instance of <code>PuntoVO</code>
     * containing only the values of those attributes that all objects in the 
     * given array share in common.
     * @throws UserMessageException
     */
	private PuntoVO getPointsCommonData(PuntoVO[] points) 
		throws UserMessageException {
	    try {
		    PuntoVO result = new PuntoVO();
		    for(int i=0;i < points.length; i++){
		        if(i==0)
		            result.updateData(points[0],true);
		        else {
		            if(!result.getCode().equals(points[i].getCode()))
		                result.setCode("");
		            if(!result.getDate().equals(points[i].getDate()))
		                result.setDate("");
		            if(!result.getDeje().equals(points[i].getDeje()))
		                result.setDeje("");
		            if(!result.getHeight().equals(points[i].getHeight()))
		                result.setHeight("");
		            if(!result.getHeightInc().equals(points[i].getHeightInc()))
		                result.setHeightInc("");
		            if(!result.getPkAct().equals(points[i].getPkAct()))
		                result.setPkAct("");
		            if(!result.getPkTeor().equals(points[i].getPkTeor()))
		                result.setPkTeor("");
		            if(!result.getIndexInPK().equals(points[i].getIndexInPK()))
		                result.setIndexInPK("");
		            if(!result.getPointID().equals(points[i].getPointID()))
		                result.setPointID("");
		            if(!result.getTime().equals(points[i].getTime()))
		                result.setTime("");
		            if(!result.getXCoord().equals(points[i].getXCoord()))
		                result.setXCoord("");
		            if(!result.getYCoord().equals(points[i].getYCoord()))
		                result.setYCoord("");
		        }
		    }
		    return result;
	    } catch (Exception e) {
	        throw new UserMessageException(e);
	    }
	}
    /**
     * Executes the command to modify one or more point's data.
     * Takes the data that all the selected points in the points table have in
     * common and shows a <code>EditPointsDialog</code>.
     * If the action on the dialog is to accept the operation, the selected 
     * points are updated with the data in the dialog.
     * If only one point is selected, even empty data is updated into the 
     * point, else only attributed with a value in the dialog are updated.
     * A clone of all the modified point objects is saved in the object's 
     * state to be able to perform the undo opperation of the command.
     * @throws UserMessageException
     * @see es.tunelator.gui.commands.Command#execute()
     */
    public void execute() throws UserMessageException {
        try {
            frame.cancelTableEditing();
            JTable pointsTable = frame.getPointsTable();
            GUIFileVO displayedFile = frame.getDisplayedGUIFile();
		    boolean setEmptyData;
		    int rows [] = pointsTable.getSelectedRows();
		    if (rows.length > 1)
		        setEmptyData = false;
		    else
		        setEmptyData = true;
		    List data = displayedFile.getTableList();
		    // Get the selected points in an array structure to pass to 
		    // getPointsCommonData
		    originalPoints = new PuntoVO[rows.length];
		    for(int i = 0; i<rows.length;i++){
		        originalPoints[i]=(PuntoVO) data.get(rows[i]);
		    }
		    EditPointsDialog dialog = new EditPointsDialog(frame,!setEmptyData);
		    // Initialize the dialog fields with the common data of the selected points
		    dialog.setData(getPointsCommonData(originalPoints));
		    dialog.setModal(true);
		    dialog.setVisible(true);
		    if(dialog.getActionPerformed()== EditPointsDialog.ACCEPT){
		        savedPoints = new PuntoVO[rows.length];
			    for(int i=0;i<rows.length;i++) {
			        // Save state for undo support
			        PuntoVO point = originalPoints[i];
			        savedPoints[i] = (PuntoVO)point.clone();
			        // Update point's data
			        point.updateData(dialog.getData(),setEmptyData);
			    }
		    }
        } catch (UserMessageException e) {
        	throw e;
	    } catch (Exception e) {
            Logger.logError(this.getClass(),"Error editing point data",e);
            throw new UserMessageException(Resourcer.getString(this.getClass(),
                    "error.execute"));
	    }
    }
    /**
     * Undoes the command restoring the original data of the modified points.
     * After the operation, listeners of the file to which the points belong
     * get notified of a data change in the file. This should provoke the 
     * update of the affected GUI components.
     * If any of the original point objects is not found in the file, an 
     * <code>InternalError</code> is thrown.
     * @see es.tunelator.gui.commands.Command#undo()
     */
    public void undo() throws UserMessageException {
        try {
            GUIFileVO displayedFile = frame.getDisplayedGUIFile();
            List filePointsData = displayedFile.getData();
	        for (int i =0; i< savedPoints.length; i++){
	            if(filePointsData.contains(originalPoints[i])){
	                originalPoints[i].updateData(savedPoints[i],true);
	            } else {
	                throw new InternalError(EditPointsCommand.class.getName()+
	                        ": Undo error. Point object not found in current"+
	                        " file data");
	            }
	        }
        } catch (Exception e) {
            Logger.logError(this.getClass(),"Undo point edition",e);
            throw new UserMessageException(Resourcer.getString(this.getClass(),
                    "error.undo"));
        }
    }
}
