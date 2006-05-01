/*
 * Created on 17-jun-2005
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
import es.tunelator.gui.models.PointsTableFormat;
import es.tunelator.gui.models.PointsTableModel;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * </p>
 * This is not a proper command, because it does not perform an action. 
 * Instead it represents an action that has been performed on a 
 * <code>PointsTableModel</code> when the user directly edits the value
 * of a cell in the table.<p/>
 * That action is detected in the <code>setValueAt</code> method of the
 * table model and an object of this type is created and stored so the
 * action can be undone later.<p/>
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class ModifyPointsTableCellCommand implements Command {
    /**
     * <code>column</code> - Index of the column of the edited cell
     */
    private int column;
    /**
     * <code>value</code> - The value that was replaced
     */
    private Object value;
    /**
     * <code>tableModel</code> - 
     */
    private PointsTableModel tableModel;
    /**
     * <code>element</code> - The element that was affected by the change
     */
    private Object element;
    /**
     * Creates a new comand representing the modification of the value in a
     * given cell of a <code>PointsTableModel</code>.
     * @param column - The column in the table that was changed
     * @param value - The value that was before the change
     * @param elment - The element affected by the change
     * @param tableModel - The tablemodel that was in place at the moment of 
     * execution
     */
    public ModifyPointsTableCellCommand(int column,Object value,
            Object element, PointsTableModel tableModel){
        this.column = column;
        this.value = value;
        this.tableModel = tableModel;
        this.element = element;
    }
    /**
     * Allways returns null
     * @see es.tunelator.gui.commands.Command#getName()
     */
    public String getName() {
        return null;
    }
    /**
     * @see es.tunelator.gui.commands.Command#execute
     * (es.tunelator.gui.adv.MainFrame)
     */
    public void execute() throws UserMessageException {
    }
    /**
     * @see es.tunelator.gui.commands.Command#undo
     * (es.tunelator.gui.adv.MainFrame)
     */
    public void undo() throws UserMessageException {
        ((PointsTableFormat)tableModel.getTableFormat()).
            setColumnValue(this.element,this.value,this.column);
    }
}
