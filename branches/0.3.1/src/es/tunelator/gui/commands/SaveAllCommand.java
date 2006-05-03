/*
 * Created on 28-jun-2005
 *
 * This code is licensed under the GNU General Public License version 2.
 * 
 * See full license terms at http://www.gnu.org/copyleft/gpl.html or 
 * in the license file included with the application or its
 * source code.
 * 
 * Created by: Juan Alvarez Ferrando
 *
 */
package es.tunelator.gui.commands;

import java.util.Enumeration;
import java.util.List;

import javax.swing.tree.DefaultMutableTreeNode;

import es.tunelator.UserMessageException;
import es.tunelator.gui.adv.MainFrame;
import es.tunelator.gui.models.FileNodeUpdater;
import es.tunelator.gui.vo.GUIFileVO;
import es.tunelator.log.Logger;
import es.tunelator.plugins.writers.PlainFormatWriter;
import es.tunelator.resources.Resourcer;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Saves all the open files
 * This command can't be undone. Calling <code>undo</code> results in an
 * <code>InternalError</code>
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 * 
 */
public class SaveAllCommand implements Command {
    private MainFrame frame = null;
    
    /**
     * Creates a new command to be executed on the given <code>MainFrame</code>
     * @param frame
     */
    public SaveAllCommand(MainFrame frame){
        this.frame = frame;
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
	    try {
	        // Traverse all nodes in the tree
	        Enumeration en = ((DefaultMutableTreeNode)frame.getJTree().
                    getModel().getRoot()).breadthFirstEnumeration();
		    while(en.hasMoreElements()){
		        // Get the user object of the current node
		        DefaultMutableTreeNode node = 
                    (DefaultMutableTreeNode) en.nextElement();
		        Object obj = node.getUserObject();
		        // Only act if the user object represents a file
		        if(obj instanceof FileNodeUpdater){
		            GUIFileVO file = (GUIFileVO)((FileNodeUpdater) obj).
                         getUserObject();
		    	    List data = file.getData();
		    	    PlainFormatWriter.write(data,file.getFile());
		        }
		    }
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
