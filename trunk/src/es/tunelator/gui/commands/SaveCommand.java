/*
 * Created on 28-jun-2005
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

import es.tunelator.UserMessageException;
import es.tunelator.gui.vo.GUIFileVO;
import es.tunelator.log.Logger;
import es.tunelator.plugins.writers.PlainFormatWriter;
import es.tunelator.resources.Resourcer;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Saves the data of a <code>GUIFileVO</code> to the associated file
 * This command can't be undone. Calling <code>undo</code> results in an
 * <code>InternalError</code>
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class SaveCommand implements Command {
    /**
     * The <code>GUIFileVO</code> that is saved
     */
    private GUIFileVO guiFileVO = null;
    /**
     * Creates a new command to be executed on the given <code>MainFrame</code>
     * @param frame
     */
    public SaveCommand(GUIFileVO guiFileVO){
        this.guiFileVO = guiFileVO;
    }
    /**
     * Allways return <code>null</code>
     * 
     * @see es.tunelator.gui.commands.Command#getName()
     */
    public String getName() {
        return null;
    }
    /**
     * Saves the data in the file
     * 
     * @see es.tunelator.gui.commands.Command#execute()
     */
    public void execute() throws UserMessageException {
	    List data = guiFileVO.getData();
	    try {
	        PlainFormatWriter.write(data,guiFileVO.getFile());
        } catch (Exception ex) {
            Logger.logError(this.getClass(),ex);
            throw new UserMessageException(Resourcer.getString(this.getClass(),
                    "error.internal.saveFile"));
        }
    }
    /**
     * It's illegal to call this method. Doing so results in an 
     * <code>InternalError</code>
     * 
     * @see es.tunelator.gui.commands.Command#undo()
     */
    public void undo() throws UserMessageException {
        throw new InternalError("Command can't be undone.");
    }
}
