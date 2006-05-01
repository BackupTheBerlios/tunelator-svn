/*
 * Created on 19-sep-2005
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
import es.tunelator.gui.adv.MainFrame;
import es.tunelator.gui.models.CellChangeEvent;
import es.tunelator.gui.models.CellChangeListener;
import es.tunelator.gui.models.PointsTableModel;
import es.tunelator.gui.vo.GUIFileVO;
import es.tunelator.log.Logger;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Receives notifications on changes in the cells of the table and converts
 * them into <code>ModifyPointsTableCellCommand</code> objects that it 
 * inserts into the undo manager of the <code>GUIFileVO</code><p/>
 * The file and table model must correspond to the same data for this to have
 * any sense.
 * <p/>
 * @author <a href="maitlo:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class PointsTableEditCommandAdaptor implements CellChangeListener {
    /**
     * <code>file</code>
     */
    private GUIFileVO file = null;
    /**
     * <code>frame</code> - Where actions will take place
     */
    private MainFrame frame = null;
    /**
     * Creates a command 
     * @param frame
     * @param file
     */
    public PointsTableEditCommandAdaptor(MainFrame frame, GUIFileVO file){
        this.file = file;
        this.frame  = frame;
        this.frame.getPointsTableModel().addCellChangeListener(this);
    }
    /**
     * @see es.tunelator.gui.models.CellChangeListener#cellChanged
     * (es.tunelator.gui.models.CellChangeEvent)
     */
    public void cellChanged(CellChangeEvent e) {
        try {
            this.file.getUndoManager().executeCommand(
                    new ModifyPointsTableCellCommand(e.getColumn(),
                            e.getOldValue(),e.getElement(),
                            (PointsTableModel)e.getSource()));
            this.frame.resetEnablementStatus();
        } catch (UserMessageException ex){
            Logger.logError(this.getClass(),ex);
            throw new InternalError(ex.getMessage());
        }
    }
    /**
     * Prepares this object to be garbage collected
     */
    public void dispose(){
        this.file = null;
        this.frame.getPointsTableModel().removeCellChangeListener(this);
        this.frame = null;
    }
}
