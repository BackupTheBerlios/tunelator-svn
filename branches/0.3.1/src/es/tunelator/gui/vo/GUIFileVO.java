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
package es.tunelator.gui.vo;

import java.io.File;
import java.util.Collection;
import java.util.Comparator;

import ca.odell.glazedlists.BasicEventList;
import ca.odell.glazedlists.EventList;
import ca.odell.glazedlists.GlazedLists;
import ca.odell.glazedlists.GroupingList;
import ca.odell.glazedlists.ObservableElementList;
import ca.odell.glazedlists.SortedList;
import ca.odell.glazedlists.ObservableElementList.Connector;
import es.tunelator.gui.undo.UndoManager;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Contains a <code>FileVO</code> representing a file's data, and 
 * the stack of commands performed on it.
 * This type is the one to be holded by <code>JobsTreeModel</code> nodes
 * and represents the current and past states of the data.
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class GUIFileVO {
    /**
     * The <code>UndoManager</code> that keeps track of commands executed on 
     * the file and performs the undo operations.
     */
    private UndoManager undoManager = new UndoManager();
    /**
     * Displayable name of the file
     */
    private String name = null;
    /**
     * List of data objects in the file
     */
    private EventList data = null;
    /**
     * Live list of data objects in the file that changes as the data objects
     * it contains change (for example affecting the sorting)
     */
    private ObservableElementList liveData = null;
    /**
     * Sorted list of data objects in the file as they appear in the GUI table.
     */
    private SortedList tableList = null;
    /**
     * List of the groups of objects in the file, groupeb by the 
     * theoric PK attribute (the profile they belong to)
     */
    private GroupingList groups = null;
    /**
     * The filesystem file that contains the data
     */
    private File file = null;
    /**
     * Initializes the name that will be returned by <code>toString</code> and
     * loads the elements in <code>data</code>, which must be of 
     * <code>PuntoVO</code> type.<p/>
     * A list of groups is created using the <code>GroupModel</code> to 
     * identify those points belonging to the same group.
     * 
     * @param file - The filesystem file
     * @param data - The <code>Collection</code> holding the data objetct
     * @param sortOrder - The <code>Comparator</code> that that gives the 
     * @param beanClass - The bean type of the elements
     * sorting criterium
     */
    public GUIFileVO(File file, Collection data, Comparator sortOrder,Class beanClass){
        this.file = file;
        if(file!=null){
            this.name = file.getName();
        } else {
            this.name = "";
        }
        this.data = new BasicEventList();
        this.data.addAll(data);
        Connector dataConnector = GlazedLists.beanConnector(beanClass);
        this.liveData = new ObservableElementList(this.data, dataConnector);
        this.tableList = new SortedList(this.liveData, sortOrder);
        this.groups = new GroupingList(this.liveData, 
                new ProfilePointGrouper().getComparator()); 
    }
    /**
     * @param file
     * @param data
     */
    public GUIFileVO(File file, Collection data){
        this.file = file;
        if(file!=null){
            this.name = file.getName();
        } else {
            this.name = "";
        }
        this.data = new BasicEventList();
        this.data.addAll(data);
    }
    /**
     * @return Returns the liveData.
     */
    public ObservableElementList getLiveData() {
        return liveData;
    }
    /**
     * @return Returns the tableList.
     */
    public SortedList getTableList() {
        return tableList;
    }
    /**
     * @return Returns the file.
     */
    public File getFile() {
        return file;
    }
    /**
     * @return Returns the undoManager.
     */
    public UndoManager getUndoManager() {
        return undoManager;
    }
    /**
     * Returns the name of the file (withouth it's path). This is what will be 
     * shown as the label of the tree node that holds it.
     * @return The name of the file
     */
    public String toString() {
        return name;
    }
    /**
     * @return Returns the data.
     */
    public EventList getData() {
        return data;
    }
    /**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }
    /**
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return Returns the groups.
     */
    public EventList getGroups() {
        return groups;
    }
    /**
     * @param file2
     */
    public void setFile(File file) {
        this.file = file;
    }
}
