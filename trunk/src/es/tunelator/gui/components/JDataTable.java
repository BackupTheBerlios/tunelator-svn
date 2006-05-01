/*
 * Created on 12-jul-2005
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
package es.tunelator.gui.components;

import java.awt.Color;
import java.awt.Component;
import java.util.EventObject;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.text.JTextComponent;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Changes the editing behaviour of <code>JTable</code>.<br/>
 * Entering a cell in editing mode selects its content and shows the 
 * editing caret at the end.
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class JDataTable extends JTable {

    //  Place cell in edit mode when it 'gains focus'
    public void changeSelection(
        int row, int column, boolean toggle, boolean extend)
    {
        super.changeSelection(row, column, toggle, extend);
        // This if is required to preserve behaviour when selecting rows using the
        // shift+cursor keys
        if (!toggle && !extend && isCellEditable(row, column)){
            if(editCellAt(row,column))
                getEditorComponent().requestFocusInWindow();
        }
    }

    //  Select the text when the cell starts editing
    //  a) text will be replaced when you start typing in a cell
    //  b) text will be selected when you use F2 to start editing
    //  c) text will be selected when double clicking to start editing
    public boolean xxxeditCellAt(int row, int column, EventObject e)
    {
        boolean result = super.editCellAt(row, column, e);
        final Component editor = getEditorComponent();
        if (editor != null && editor instanceof JTextComponent)
        {
            if (e == null)
            {
                ((JTextComponent)editor).selectAll();
            }
            else
            {
                SwingUtilities.invokeLater(new Runnable()
                {
                    public void run()
                    {
                        ((JTextComponent)editor).selectAll();
                    }
                });
            }
        }
        return result;
    }

    //  Select the text when the cell starts editing
    //  a) text will be replaced when you start typing in a cell
    //  b) text will be selected when you use F2 to start editing
    //  c) caret is placed at end of text when double clicking to start editing
    public Component prepareEditor(
        TableCellEditor editor, int row, int column)
    {
        Component c = super.prepareEditor(editor, row, column);
        if (c instanceof JTextComponent)
        {
            ((JTextField)c).selectAll();
        }
        return c;
    }

    /**
     * Sets black characters over white background for non-selected rows and
     * white characters over blue background for selected rows.
     * <p/>
     * @see javax.swing.JTable#prepareRenderer(javax.swing.table.TableCellRenderer, 
     * int, int)
     */
    public Component prepareRenderer(TableCellRenderer renderer, int row,
            int column) {
        Component result = super.prepareRenderer(renderer, row, column);
        if(!isRowSelected(row)){
            result.setForeground(Color.BLACK);
            result.setBackground((row % 2 == 0) ? new Color(204,204,255) : Color.WHITE);
        } else {
            result.setForeground(Color.WHITE);
            result.setBackground(Color.BLUE);
        }
        return result;
    }
}
