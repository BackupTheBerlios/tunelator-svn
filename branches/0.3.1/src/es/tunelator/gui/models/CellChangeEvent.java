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
package es.tunelator.gui.models;

import javax.swing.table.TableModel;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * Represents the event of a change of value in a cell of a table model.
 * Provides both the preious and the new value.
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class CellChangeEvent {
    /**
     * <code>row</code> - row index of the edited cell. Notice that if the
     * table is sorted, this index corresponds to the one that the edited
     * cell occupied before edition. After that, the order of rows may
     * have changed.
     */
    private int row;
    /**
     * <code>column</code> - the column of the edited cell. This can lead to 
     * know the affected attribute of the underlying element.
     */
    private int column;
    /**
     * <code>oldValue</code> - value in the cell before edition
     */
    private Object oldValue;
    /**
     * <code>newValue</code> - new value of the cell after edition
     */
    private Object newValue;
    /**
     * <code>element</code> - the element that was affected by the edition
     */
    private Object element;
    /**
     * <code>source</code> - the <code>TableModel</code> that supports the table
     * when the change occurs.
     */
    private TableModel source;
    /**
     * Transmits the event of a change in the value of a cell in the table.
     * The parameters are saved as the information provided to listeners.
     * @param element - The element affected
     * @param row - Row index of the element in the table before edition
     * @param column - Column index of the edited cell
     * @param oldValue - Value in the cell before edition
     * @param newValue - New value in the cell
     * @param source - The <code>TableModel</code> that emitted the event
     */
    public CellChangeEvent(Object element, int row, int column,
            Object oldValue, Object newValue, TableModel source) {
        this.row = row;
        this.column = column;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.element = element;
        this.source = source;
    }
    /**
     * @return Returns the column.
     */
    public int getColumn() {
        return column;
    }
    /**
     * @return Returns the newValue.
     */
    public Object getNewValue() {
        return newValue;
    }
    /**
     * @return Returns the oldValue.
     */
    public Object getOldValue() {
        return oldValue;
    }
    /**
     * @return Returns the row.
     */
    public int getRow() {
        return row;
    }
    /**
     * @return Returns the element.
     */
    public Object getElement() {
        return element;
    }
    /**
     * @return Returns the source.
     */
    public TableModel getSource() {
        return source;
    }
}
