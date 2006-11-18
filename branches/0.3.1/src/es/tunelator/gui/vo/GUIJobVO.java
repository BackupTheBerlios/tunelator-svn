/*
 * Created on Nov 16, 2006
 *
 * Tunelator surveying software.
 * 
 * Copyright (C) 2006 Juan Alvarez Ferrando
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
package es.tunelator.gui.vo;

import ca.odell.glazedlists.ObservableElementList;
import es.tunelator.gui.undo.UndoManager;

/**
 * &COPY; 2006 Juan Alvarez Ferrando
 * <p/>
 * Contains all the points and aligmnets of the job so they can
 * be edited and previewed together as if they had come from a 
 * single file.
 * When the job is saved, the file contains all the job's points
 * or alignments.<p/>
 * The data is synchronized in both directions with the structures
 * contained in the files's nodes, by sharing the same elementary
 * data objects which notify changes to both the file and the job
 * structures.
 * <p/>
 * From version 0.3.1 the undo manager resides here instead of in
 * the file node. This means that undo operations are managed at
 * job level, and not at file level. When the user undoes she undoes
 * the last change to the job, no matter what file was it done on.
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class GUIJobVO {
    /**
     * The <code>UndoManager</code> that keeps track of commands executed on 
     * the job and performs the undo operations.
     */
    private UndoManager undoManager = new UndoManager();
    /**
     * Displayed name of the job. Returned by toString()
     */
    private String jobName = "default";
    /**
     * Live list of data objects, that changes as the data objects
     * it contains change (for example affecting the sorting)
     */
    private ObservableElementList liveData = null;
    /**
     * @param guiFileVO
     */
    public void addFileData(GUIFileVO guiFileVO) {
        liveData.addAll(guiFileVO.getData());
    }
    /**
     * @param guiFileVO
     */
    public void removeFileData(GUIFileVO guiFileVO) {
        liveData.removeAll(guiFileVO.getData());
    }
    /**
     * @return Returns the undoManager.
     */
    public UndoManager getUndoManager() {
        return undoManager;
    }
    
}
