/*
 * Created on 16-jun-2005
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

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

import es.tunelator.UserMessageException;
import es.tunelator.gui.commands.Command;
import es.tunelator.log.Logger;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Holds a stack of executed commands
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class UndoManager {
    /**
     * Stack of executed commands.
     */
    private Stack commandStack = new Stack();
    /**
     * Listeners interested in receiving events when a command is
     * executed.
     */
    private Vector undoCommandListeners = new Vector();
    /**
     * Registers a listener for execution of commands events
     * @param listener
     */
    public void addUndoableCommandListener(UndoCommandListener listener){
        if(!undoCommandListeners.contains(listener))
            undoCommandListeners.add(listener);
    }
    /**
     * Unregisters the listener
     * @param listener
     */
    public void removeUndoableCommandListener(UndoCommandListener listener){
        undoCommandListeners.remove(listener);
    }
    /**
     * Notifies all listeners about a data change in this
     * object.
     */
    private void fireUndoableCommandExecuted() {
        Iterator it = ((Vector)undoCommandListeners.clone()).iterator();
        while(it.hasNext()){
            UndoCommandListener listener = (UndoCommandListener) it.next();
            // TODO: Put this into an if(isDebug())
            Logger.logDebug(this.getClass(),this.getClass().getName()+
                    ": Notifying undoable command execution to "+
                    listener.toString());
            listener.undoableCommandPerformed(this);
        }
    }
    /**
     * Executes the command, adds it to the stack and notifies listeners
     * @param command The command that's executed
     * @throws UserMessageException if an error occurs while executing the 
     * command
     */
    public void executeCommand(Command command) throws UserMessageException {
        commandStack.push(command);
        command.execute();
        fireUndoableCommandExecuted();
    }
    /**
     * Undoes the command that was last executed
     * @throws UserMessageException if an error occurs while undoing the 
     * command
     */
    public void undoLastCommand() throws UserMessageException {
        if(commandStack.size()>0){
	        Command command = (Command) commandStack.pop();
	        command.undo();
        }
    }
    /**
     * Returns the number of commands in the stack
     * @return
     */
    public int getStackSize() {
        return commandStack.size();
    }
}
