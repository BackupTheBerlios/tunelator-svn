/*
 * Created on 19-jun-2005
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
package es.tunelator.gui.undo;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Implemented by types interested in receiving notifications when a command is 
 * added to an <code>UndoManager</code>.<p/>
 * For example, the main frame listens to all undo managers to set the enablement
 * state of it's undo menu item to enabled, each time an undoable operation is 
 * performed.
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public interface UndoCommandListener {
    /**
     * Receives notifications of the execution of commands that can be undone.
     * <p/>
     * This is done by the <code>UndoManager</code> to notify other components
     * that may need to take action.
     * @param manager The UndoManager that notifies the execution
     * @see es.tunelator.gui.undo.UndoManager
     */
    public void undoableCommandPerformed(UndoManager manager);
}
