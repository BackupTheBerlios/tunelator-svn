/*
 * Created on 02-may-2005
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
package es.tunelator.gui.models;

import java.util.ArrayList;
import java.util.Iterator;

import ca.odell.glazedlists.EventList;
import ca.odell.glazedlists.gui.TableFormat;
import ca.odell.glazedlists.swing.EventTableModel;
import es.tunelator.log.Logger;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * Implements a table model for points data. It holds both an 
 * <code>ArrayList</code> containing the list of <code>PuntoVO</code> 
 * objects to show in the table, and the <code>GUIFileVO</code> object to 
 * which those points correspond.<p/>
 * It is a <code>DataListener</code> of the <code>GUIFileVO</code> object 
 * so it redraws each time the data of the file change.
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class PointsTableModel extends EventTableModel {
    /**
     * <code>List</code> of objects that will be notified when some change 
     * occurs in a cell's value
     */
    private ArrayList cellListeners = new ArrayList();
    /**
     * Creates a table model for point data, receiving an ArrayList of
     * PuntoVO objects.
     * @param data
     */
    public PointsTableModel(EventList data, TableFormat format) {
        super(data,format);
    }
    /**
     * Adds an object as a listener of changes to cells's values
     * @param listener
     */
    public void addCellChangeListener(CellChangeListener listener){
        if(!cellListeners.contains(listener)){
            cellListeners.add(listener);
        }
    }
    /**
     * Removes an object from the list of listeners of changes in cells's 
     * values
     * @param listener
     */
    public void removeCellChangeListener(CellChangeListener listener){
        if(cellListeners.contains(listener)){
            cellListeners.remove(listener);
        }
    }
    /**
     * Exposes the <code>fireTableDataChanged()</code> method as a way to force
     *  the table to update itself from this model.
     */
    public void reload(){
        this.fireTableDataChanged();
    }
    /**
     * Changes the value stored in a cell but notifies the change to all 
     * listeners.
     * @see javax.swing.table.TableModel#setValueAt(java.lang.Object, int, int)
     */
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Logger.logTrace(PointsTableModel.class,"("+this.toString()+
                "): Setting value ("+aValue.toString()+
                ") at position ["+rowIndex+","+columnIndex+"]");
        Object prevValue = getValueAt(rowIndex,columnIndex);
        if(prevValue != null && !prevValue.equals(aValue)){
            // Beware: Retrieve the element at the affected row before calling
            // super.setValueAt. If the table is sorted, the latter will change
            // the order
            // of the rows if the edited cell is part of the sort criteria, and
            // the CellChangeEvent will make reference to a wrong element (the 
            // one that ocuppies the rowIndex row after sorting).
            Object element = this.getElementAt(rowIndex);
            super.setValueAt(aValue,rowIndex,columnIndex);
            // Notifies listeners of cell changes. Specifically this will
            // notify the PointsTableCommandAdaptor that transforms this events
            // into undoable commands and saves them in the current files undo
            // manager.
            fireCellChangeEvent(new CellChangeEvent(element,rowIndex,
                    columnIndex,prevValue,aValue,this));
        }
    }
    /**
     * Allows to restore a cell to a previous value (whitout notifying listeners
     *  of the change).
     * @param aValue The value to be restored
     * @param rowIndex Row index of the cell
     * @param columnIndex Column index of the cell
     */
    public void undoSetValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue,rowIndex,columnIndex);
    }
    /**
     * Notifies listeners about a change in the value of a cell
     * @param event
     */
    private void fireCellChangeEvent(CellChangeEvent event) {
        for(Iterator it = cellListeners.iterator();it.hasNext();){
            CellChangeListener listener = (CellChangeListener) it.next();
            listener.cellChanged(event);
        }
    }
}
