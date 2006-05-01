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

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * Interface to be implemented by undoable commands
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public interface Command {
    /**
     * Returns the name of the command.
     * This can be used in the GUI and thus should be internationalized
     * @return The descriptive name of the command
     */
    public String getName();
    /**
     * Executes the action proper to the command
     * @throws UserMessageException
     */
    public void execute() throws UserMessageException;
    /**
     * Undoes the effects of the execution of the command
     * @throws UserMessageException
     */
    public void undo() throws UserMessageException;
}
