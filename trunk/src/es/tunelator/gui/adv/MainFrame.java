/**
 * Created on 29-abr-2005
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
package es.tunelator.gui.adv;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableCellRenderer;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import ca.odell.glazedlists.BasicEventList;
import ca.odell.glazedlists.EventList;
import ca.odell.glazedlists.SortedList;
import ca.odell.glazedlists.swing.TableComparatorChooser;
import es.tunelator.AppParameters;
import es.tunelator.UserMessageException;
import es.tunelator.gui.commands.AddFileCommand;
import es.tunelator.gui.commands.AddPointCommand;
import es.tunelator.gui.commands.CloseJobCommand;
import es.tunelator.gui.commands.DeletePointsCommand;
import es.tunelator.gui.commands.DeleteProfileCommand;
import es.tunelator.gui.commands.EditPointsCommand;
import es.tunelator.gui.commands.ExportCommand;
import es.tunelator.gui.commands.NewJobCommand;
import es.tunelator.gui.commands.PointsTableEditCommandAdaptor;
import es.tunelator.gui.commands.RemoveFileCommand;
import es.tunelator.gui.commands.SaveAllCommand;
import es.tunelator.gui.commands.SaveAsCommand;
import es.tunelator.gui.commands.SaveCommand;
import es.tunelator.gui.commands.UndoCommand;
import es.tunelator.gui.components.JDataTable;
import es.tunelator.gui.containers.JobsJTree;
import es.tunelator.gui.editors.JFormatTableCellEditor;
import es.tunelator.gui.models.FileNodeUpdater;
import es.tunelator.gui.models.JobsTreeModel;
import es.tunelator.gui.models.JobsTreeSelectionModel;
import es.tunelator.gui.models.PointsTableFormat;
import es.tunelator.gui.models.PointsTableModel;
import es.tunelator.gui.renderers.JFormatTableRenderer;
import es.tunelator.gui.undo.UndoCommandListener;
import es.tunelator.gui.undo.UndoManager;
import es.tunelator.gui.validators.DateValidator;
import es.tunelator.gui.viewers.J3DProfileViewer;
import es.tunelator.gui.vo.GUIFileVO;
import es.tunelator.log.Logger;
import es.tunelator.resources.Resourcer;
import es.tunelator.vo.ProfileVO;
import es.tunelator.vo.PuntoVO;
/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * The main element of the GUI. this <code>JFrame</code> contains the 
 * elements of the application interface:<br/>
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class MainFrame extends JFrame implements UndoCommandListener {

	private JPanel jContentPane = null;
	private JPanel jPanel = null;
	private JPanel jPanel1 = null;

	private JToolBar jToolBar = null;
	private JToolBar jToolBar2 = null;
	
	private JButton newJobButton = null;
	private JButton closeJobButton = null;
	private JButton addFileButton = null;
	private JButton removeFileButton = null;
	private JButton saveButton = null;
	private JButton saveAsButton = null;
	private JButton saveAllButton = null;
	private JButton exportButton = null;
	private JButton removeProfileButton = null;
	private JButton undoButton = null;
	private JButton selectAllButton = null;
	private JButton editButton = null;
	private JButton addPointButton = null;
	private JButton deleteButton = null;

	private JSplitPane jSplitPane = null;
	private JTabbedPane jTabbedPane = null;
	private JPanel editPointsPanel = null;
	private JPanel messageBarPanel = null;  //  @jve:decl-index=0:
	private JLabel messageLabel = null;
	private JPanel jPanel4 = null;
	private JobsJTree jTree = null;
	private JTable pointsTable = null;
	private JScrollPane jScrollPane = null;

	private JMenuBar jJMenuBar = null;

	private JMenu fileMenu = null;
	private JMenu helpMenu = null;
	private JMenu editMenu = null;
	
	private JMenuItem exitMenuItem = null;
	private JMenuItem aboutMenuItem = null;
	private JMenuItem undoMenuItem = null;
	private JMenuItem selectAllMenuItem = null;
	private JMenuItem newJobMenuItem = null;
	private JMenuItem closeJobMenuItem = null;
	private JMenuItem addFileMenuItem = null;
	private JMenuItem removeFileMenuItem = null;
	private JMenuItem removeProfileMenuItem = null;
	private JMenuItem saveMenuItem = null;
	private JMenuItem saveAllMenuItem = null;
	private JMenuItem saveAsMenuItem = null;
	private JMenuItem exportMenuItem = null;
	private JMenuItem deleteMenuItem = null;
	private JMenuItem editMenuItem = null;
	private JMenuItem addPointMenuItem = null;

	private JobsTreeModel jobsTreeModel = null;//  @jve:decl-index=0:
	private JScrollPane jScrollPane2 = null;
	private PointsTableModel pointsTableModel = null;//  @jve:decl-index=0:
	private TableComparatorChooser columnSorter = null;
	/**
	 * <code>numberTableEditor</code> - Editor for + and - real numbers
	 */
	private JFormatTableCellEditor numberTableEditor = null; 
	/**
	 * <code>intTableEditor</code> - Editor for + and - integers
	 */
	private JFormatTableCellEditor intTableEditor = null;
	/**
	 * <code>pintTableEditor</code> - Editor for positive integers
	 */
	private JFormatTableCellEditor pintTableEditor = null;
	/**
	 * <code>dateTableEditor</code> - Editor for dates
	 */
	private JFormatTableCellEditor dateTableEditor = null;
	/**
	 * <code>timeTableEditor</code> - Editor for times
	 */
	private JFormatTableCellEditor timeTableEditor = null;
	private DateFormat dateFormat = null;
	private DateFormat timeFormat = null;
	private TableCellRenderer dateCellRenderer = null;
	private TableCellRenderer timeCellRenderer = null;
	
	private J3DProfileViewer previewPanel = null;
	/**
	 * <code>displayedFile</code> - The data displayed at each moment
	 */
	private GUIFileVO displayedFile = null;
	/**
	 * <code>emptyFile</code> - Used to display an empty data set
	 */
	private GUIFileVO emptyFile = null;
	/**
	 * <code>tableEditCommandAdaptor</code> - To create undoable commands 
	 * when data is directly edited by the user on the table.
	 */
	private PointsTableEditCommandAdaptor tableEditCommandAdaptor = null;
	/**
	 * Creates the GUI. After this, the frame is ready to be shown
	 */
	public MainFrame() {
		super();
		initialize();
	}
	/**
	 * This is required to avoid heavyweight Java3D to draw on top
	 * of the first tab panel even if tha's the one selected.
	 * This has to be invoked after setVisible(true) has been invoked
	 * on the frame.
	 */
	public void correctTabStatus() {
	    this.jTabbedPane.setSelectedIndex(0);
	    this.jTabbedPane.revalidate();
	}
	/**
	 * Initializes the user interface.<br/>
	 * Sets the initial window size, centers the window on the screen,
	 * sets the title from the <code>mainframe.frame.title</code> text
	 * resource of this class.
	 */
	private void initialize() {
	    emptyFile = new GUIFileVO(null,new ArrayList(),
	            PuntoVO.defaultComparator());
	    // Menus will overlap the Canvas3D which is not lightweight but native.
	    // Tell popup menus to be native too, so the Canvas3D does not overlap
	    // them.
	    JPopupMenu.setDefaultLightWeightPopupEnabled(false);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().
		        getResource(Resourcer.getString(this.getClass(),"mainframe.appIcon"))
		        ));
		this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(getJJMenuBar());
		// A reasonable default size at 1024x768 resolution
		this.setSize(850, 560);
		// Centers the window in the screen
		this.setLocationRelativeTo(null);
		this.setContentPane(getJContentPane());
		this.setTitle(Resourcer.getString(this.getClass(),
		        "mainframe.frame.title"));
        MainFrame.this.resetEnablementStatus();
        ListSelectionModel rowSM = this.getPointsTable().getSelectionModel();
        // Listen to events showing modifications in the selection state of the
        // points table, and adjust the enablement state of the affected menu
        // items accordingly.
        rowSM.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                //Ignore extra messages.
                if (e.getValueIsAdjusting()) return;

                ListSelectionModel lsm =
                    (ListSelectionModel)e.getSource();
                if (lsm.isSelectionEmpty()) {
                    MainFrame.this.getEditMenuItem().setEnabled(false);
                    MainFrame.this.getEditButton().setEnabled(false);
                    MainFrame.this.getDeleteMenuItem().setEnabled(false);
                    MainFrame.this.getDeleteButton().setEnabled(false);
                } else {
                    MainFrame.this.getEditMenuItem().setEnabled(true);
                    MainFrame.this.getEditButton().setEnabled(true);
                    MainFrame.this.getDeleteMenuItem().setEnabled(true);
                    MainFrame.this.getDeleteButton().setEnabled(true);
                }
            }
        });
    }
	/**
	 * Displays the message in a modal dialog.<p/>
	 * Dialog title takes the value of the "popup.errorTitle" text resource
	 * @param message The message to display
	 */
	public void showErrorMessage(String message) {
        String title = "";
        try {
	        title = Resourcer.getString(null,"popup.errorTitle"); 
	    } catch (InternalError e) {
	        title = "Error";
	    }
		JOptionPane.showMessageDialog(this,message,
		        title,JOptionPane.ERROR_MESSAGE);
	}
	/**
	 * Shows a message informing of the occurence of a runtime exception.<p/>
	 * The message is displayed in a dialog window using 
	 * <code>showErrorMessage(String)</code>
	 * @param e The exception to inform of.
	 */
	protected void showGenericErrorMessage(Exception e) {
	    String msg = "";
	    try {
	        MessageFormat mf = new MessageFormat(Resourcer.getString(null,
	                "error.generic"));
	        Object[] params = { getClass().getName(),e.getClass().getName(),
	                e.getMessage() };
	        msg = mf.format(params);
	        JOptionPane.showMessageDialog(this,msg,Resourcer.getString(null,
	                "popup.errorTitle"),JOptionPane.ERROR_MESSAGE);
	    } catch (InternalError ex) {
			showErrorMessage(ex.getMessage());
	    }
	}
	/**
	 * Informs of a error condition detected by the application logic.
	 * The message contained in the <code>UserMessageException</code> should be
	 * localized and use userland language.
	 * @param e The <code>UserMessageException</code> that carries the message
	 */
	protected void showUserMessageException(UserMessageException e) {
	    String msg = "";
	    try {
			MessageFormat mf = new MessageFormat(Resourcer.getString(null,
			        "error.userMessageException"));
			Object[] params = { e.getMessage() };
	        msg = mf.format(params);
	        JOptionPane.showMessageDialog(this,msg,Resourcer.getString(null,
	                "popup.errorTitle"),JOptionPane.ERROR_MESSAGE);
	    } catch (InternalError ex) {
			showErrorMessage(ex.getMessage());
	    }
	}
    /**
     * @return The file currently displayed
     */
    public GUIFileVO getDisplayedGUIFile() {
        return this.displayedFile;
    }
    /**
     * The <code>GUIFileVO</code> returned has no points and is used both
     * to clear the contents of the GUI widgets and to check if no data is
     * being displayed. At all times, if clearing the data in the GUI is
     * required, it has to be done with this code:<br/>
     * <code>frame.setDisplayedGUIFile(frame.getEmptyGUIFile());</code>
     * @return A <code>GUIFileVO</code> file with no points
     */
    public GUIFileVO getEmptyGUIFile(){
        return this.emptyFile;
    }
    /**
     * Sets a GUIFileVO as the file being displayed in the table editor and 
     * graphic preview.
     * @param displayedFile The displayedFile to set.
     * @param selectFile If true the displayed file is also selected in the 
     * tree
     */
    public void setDisplayedGUIFile(GUIFileVO displayedFile,boolean selectFile) {
        this.displayedFile = displayedFile;
        SortedList list = displayedFile.getTableList();
        // Beware: The TableComparatorChooser has to be disposed of to release
        // the references it holds to the list and remove it as a mouse listerer.
        // Also, this has to be done **before** creating the new EventTableModel.
        // Else when deleting a profile using DeleteProfileCommand, a 
        // NullPointerException is thrown at TableComparatorChooser inner 
        // MouseAdapter class, when it tries to get the comparator of the 
        // sorted list (null after disposed).
        if(columnSorter!=null) {
            columnSorter.dispose();
        }
        this.getPointsTable().setModel(this.getPointsTableModel(list));
        columnSorter = new TableComparatorChooser(this.pointsTable,list,true);
        // This has to be done each time that we replace the table model 
        // because when doing it the column model is also replaced.
        pointsTable.getColumnModel().getColumn(0).setCellEditor(
                getPintTableEditor(false));
		pointsTable.getColumnModel().getColumn(1).setCellEditor(
		        getNumberTableEditor(false));
        pointsTable.getColumnModel().getColumn(2).setCellEditor(
                getPintTableEditor(false));
		pointsTable.getColumnModel().getColumn(3).setCellEditor(
		        getNumberTableEditor(false));
		pointsTable.getColumnModel().getColumn(4).setCellEditor(
		        getNumberTableEditor(false));
		pointsTable.getColumnModel().getColumn(5).setCellEditor(
		        getNumberTableEditor(false));
		pointsTable.getColumnModel().getColumn(6).setCellEditor(
		        getNumberTableEditor(false));
		pointsTable.getColumnModel().getColumn(7).setCellEditor(
		        getNumberTableEditor(false));
		pointsTable.getColumnModel().getColumn(8).setCellEditor(
		        getNumberTableEditor(false));
		// Column 9 is the code which is a text value and does not need
		// any special editor or renderer.
		pointsTable.getColumnModel().getColumn(10).setCellEditor(
		        getDateTableEditor(false));
		pointsTable.getColumnModel().getColumn(10).setCellRenderer(
		        getDateCellRenderer());
		pointsTable.getColumnModel().getColumn(11).setCellEditor(
		        getTimeTableEditor(false));
		pointsTable.getColumnModel().getColumn(11).setCellRenderer(
		        getTimeCellRenderer());
		// Set the adaptor to register commands from edit operations on table 
		// cells this activates the undo feature for those changes
		if(tableEditCommandAdaptor != null){
		    tableEditCommandAdaptor.dispose();
		}
		tableEditCommandAdaptor = new PointsTableEditCommandAdaptor(this,
		        this.getDisplayedGUIFile());
		// Show the file in the preview panel
		if(this.previewPanel!=null){
            this.previewPanel.setFile(displayedFile);
        }
		
		if(selectFile && (displayedFile != this.getEmptyGUIFile())){
			// Find the node of the displayed file in the tree node
			DefaultMutableTreeNode node = this.getJobsTreeModel().
				getObjectTreeNode(null,displayedFile);
			if(node != null){
			    TreePath path = new TreePath(node.getPath());
			    getJTree().expandPath(path);
			    getJTree().setSelectionPath(path);
			} else {
			    // That's just not possible if the tree is consistent
			    Logger.logError(this.getClass(),
			            "Displayed file not found in the tree.");
			    throw new InternalError(
			            "Displayed file not found in the tree.");
			}
		}
    }
    /**
     * Sets the proper enablement state of the menu items, regarding the 
     * current interface status.<p/>
     * Menu item's state is also affected by events produced on other 
     * interface widgets such as data tables.
     */
    public void resetEnablementStatus(){
        if(displayedFile.equals(emptyFile)){
            DefaultMutableTreeNode node = (DefaultMutableTreeNode)this.
            	getJTree().getLastSelectedPathComponent();
            this.getNewJobMenuItem().setEnabled(true);
            this.getNewJobButton().setEnabled(true);
            if(node != null && node.getLevel()==1){
                this.getCloseJobMenuItem().setEnabled(true);
                this.getCloseJobButton().setEnabled(true);
            } else {
                this.getCloseJobMenuItem().setEnabled(false);
                this.getCloseJobButton().setEnabled(false);
            }
            if(node != null && node.getLevel()>=1){
                this.getAddFileMenuItem().setEnabled(true);
                this.getAddFileButton().setEnabled(true);
            } else {
                this.getAddFileMenuItem().setEnabled(false);
                this.getAddFileButton().setEnabled(false);
            }
            this.getRemoveFileMenuItem().setEnabled(false);
            this.getRemoveFileButton().setEnabled(false);
            this.getSaveAllMenuItem().setEnabled(false);
            this.getSaveAllButton().setEnabled(false);
            this.getSaveAsMenuItem().setEnabled(false);
            this.getSaveAsButton().setEnabled(false);
            this.getSaveMenuItem().setEnabled(false);
            this.getSaveButton().setEnabled(false);
            this.getExportMenuItem().setEnabled(false);
            this.getExportButton().setEnabled(false);
            this.getRemoveProfileMenuItem().setEnabled(false);
            this.getRemoveProfileButton().setEnabled(false);
            this.getExitMenuItem().setEnabled(true);
            this.getUndoMenuItem().setEnabled(false);
            this.getUndoButton().setEnabled(false);
            this.getSelectAllMenuItem().setEnabled(false);
            this.getSelectAllButton().setEnabled(false);
            this.getEditMenuItem().setEnabled(false);
            this.getEditButton().setEnabled(false);
            this.getAddPointMenuItem().setEnabled(false);
            this.getAddPointButton().setEnabled(false);
            this.getDeleteMenuItem().setEnabled(false);
            this.getDeleteButton().setEnabled(false);
            this.getAboutMenuItem().setEnabled(true);
        } else {
            if (displayedFile.getGroups().size() == 0){
                DefaultMutableTreeNode node = (DefaultMutableTreeNode)this.
                	getJTree().getLastSelectedPathComponent();
                this.getNewJobMenuItem().setEnabled(true);
                this.getNewJobButton().setEnabled(true);
                if(node != null && node.getLevel()==1){
                    this.closeJobMenuItem.setEnabled(true);
                    this.closeJobButton.setEnabled(true);
                } else {
                    this.closeJobMenuItem.setEnabled(false);
                    this.closeJobButton.setEnabled(false);
                }
                if(node != null && node.getLevel()>=1){
                    this.getAddFileMenuItem().setEnabled(true);
                    this.getAddFileButton().setEnabled(true);
                } else {
                    this.getAddFileMenuItem().setEnabled(false);
                    this.getAddFileButton().setEnabled(false);
                }
                this.getRemoveFileMenuItem().setEnabled(true);
                this.getRemoveFileButton().setEnabled(true);
                this.getSaveAllMenuItem().setEnabled(true);
                this.getSaveAllButton().setEnabled(true);
                this.getSaveAsMenuItem().setEnabled(true);
                this.getSaveAsButton().setEnabled(true);
                this.getSaveMenuItem().setEnabled(true);
                this.getSaveButton().setEnabled(true);
                this.getExportMenuItem().setEnabled(true);
                this.getExportButton().setEnabled(true);
                this.getRemoveProfileMenuItem().setEnabled(false);
                this.getRemoveProfileButton().setEnabled(false);
                this.getExitMenuItem().setEnabled(true);
                if(displayedFile.getUndoManager().getStackSize()==0) {
                    this.getUndoMenuItem().setEnabled(false);
                    this.getUndoButton().setEnabled(false);
                } else {
                    this.getUndoMenuItem().setEnabled(true);
                    this.getUndoButton().setEnabled(true);
                }
                this.getSelectAllMenuItem().setEnabled(false);
                this.getSelectAllButton().setEnabled(false);
                this.getEditMenuItem().setEnabled(false);
                this.getEditButton().setEnabled(false);
                this.getAddPointMenuItem().setEnabled(true);
                this.getAddPointButton().setEnabled(true);
                this.getDeleteMenuItem().setEnabled(false);
                this.getDeleteButton().setEnabled(false);
                this.getAboutMenuItem().setEnabled(true);
            } else {
        		DefaultMutableTreeNode node = (DefaultMutableTreeNode)jTree.
        			getLastSelectedPathComponent();
                this.getNewJobMenuItem().setEnabled(true);
                this.getNewJobButton().setEnabled(true);
                if(node != null && node.getLevel()==1){
                    this.closeJobMenuItem.setEnabled(true);
                    this.closeJobButton.setEnabled(true);
                } else {
                    this.closeJobMenuItem.setEnabled(false);
                    this.closeJobButton.setEnabled(false);
                }
                if(node != null && node.getLevel()>=1){
                    this.getAddFileMenuItem().setEnabled(true);
                    this.getAddFileButton().setEnabled(true);
                } else {
                    this.getAddFileMenuItem().setEnabled(false);
                    this.getAddFileButton().setEnabled(false);
                }
                this.getRemoveFileMenuItem().setEnabled(true);
                this.getRemoveFileButton().setEnabled(true);
                this.getSaveAllMenuItem().setEnabled(true);
                this.getSaveAllButton().setEnabled(true);
                this.getSaveAsMenuItem().setEnabled(true);
                this.getSaveAsButton().setEnabled(true);
                this.getSaveMenuItem().setEnabled(true);
                this.getSaveButton().setEnabled(true);
                this.getExportMenuItem().setEnabled(true);
                this.getExportButton().setEnabled(true);
        		if((node != null) && (node.getLevel()==3)){
                    this.getRemoveProfileMenuItem().setEnabled(true);
                    this.getRemoveProfileButton().setEnabled(true);
        		} else {
                    this.getRemoveProfileMenuItem().setEnabled(false);
                    this.getRemoveProfileButton().setEnabled(false);
        		}
                this.getExitMenuItem().setEnabled(true);
                if(displayedFile.getUndoManager().getStackSize()==0) {
                    this.getUndoMenuItem().setEnabled(false);
                    this.getUndoButton().setEnabled(false);
                } else {
                    this.getUndoMenuItem().setEnabled(true);
                    this.getUndoButton().setEnabled(true);
                }
                // While in the preview tab, edit and delete point operations 
                // can't be done because of the inactive status of the data grid.
                if(this.getJTabbedPane().getSelectedComponent().equals(
                        this.getPreviewPanel())) {
                    this.getSelectAllMenuItem().setEnabled(false);
                    this.getSelectAllButton().setEnabled(false);
                    this.getEditMenuItem().setEnabled(false);
                    this.getEditButton().setEnabled(false);
                    this.getAddPointMenuItem().setEnabled(false);
                    this.getAddPointButton().setEnabled(false);
                    this.getDeleteMenuItem().setEnabled(false);
                    this.getDeleteButton().setEnabled(false);
                } else {
	                this.getSelectAllMenuItem().setEnabled(true);
	                this.getSelectAllButton().setEnabled(true);
	                this.getAddPointMenuItem().setEnabled(true);
	                this.getAddPointButton().setEnabled(true);
	                if(this.getPointsTable().getSelectedRow() == -1){
	                    this.getEditMenuItem().setEnabled(false);
	                    this.getEditButton().setEnabled(false);
	                    this.getDeleteMenuItem().setEnabled(false);
	                    this.getDeleteButton().setEnabled(false);
	                } else {
	                    this.getEditMenuItem().setEnabled(true);
	                    this.getEditButton().setEnabled(true);
	                    this.getDeleteMenuItem().setEnabled(true);
	                    this.getDeleteButton().setEnabled(true);
	                }
                }
                this.getAboutMenuItem().setEnabled(true);
            }
        }
    }
    /**
	 * This method initializes jContentPane, the root of all the content in the
	 * GUI.
	 * @return javax.swing.JPanel
	 */
	private javax.swing.JPanel getJContentPane() {
		if(jContentPane == null) {
			jContentPane = new javax.swing.JPanel();
			jContentPane.setLayout(new java.awt.BorderLayout());
			jContentPane.add(getJPanel(), java.awt.BorderLayout.NORTH);
			jContentPane.add(getJSplitPane(), java.awt.BorderLayout.CENTER);
			jContentPane.add(getMessageBarPanel(), 
			        java.awt.BorderLayout.SOUTH);
		}
		return jContentPane;
	}
	/**
	 * This method initializes jJMenuBar
	 * @return javax.swing.JMenuBar	
	 */    
	private javax.swing.JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new javax.swing.JMenuBar();
			jJMenuBar.add(getFileMenu());
			jJMenuBar.add(getEditMenu());
			jJMenuBar.add(getHelpMenu());
		}
		return jJMenuBar;
	}
	/**
	 * This method initializes the "File" menu.<p/>
	 * Takes text from the "mainframe.menu.jobs" text resource
	 * of this class.
	 * @return javax.swing.JMenu	
	 */    
	private javax.swing.JMenu getFileMenu() {
		if (fileMenu == null) {
			fileMenu = new javax.swing.JMenu();
			fileMenu.setText(Resourcer.getString(this.getClass(),
			        "mainframe.menu.jobs"));
			fileMenu.add(getNewJobMenuItem());
			fileMenu.add(getCloseJobMenuItem());
			fileMenu.add(new JSeparator());
			fileMenu.add(getAddFileMenuItem());
			fileMenu.add(getRemoveFileMenuItem());
			fileMenu.add(new JSeparator());
			fileMenu.add(getSaveMenuItem());
			fileMenu.add(getSaveAllMenuItem());
			fileMenu.add(getSaveAsMenuItem());
			fileMenu.add(new JSeparator());
			fileMenu.add(getExportMenuItem());
			fileMenu.add(new JSeparator());
			fileMenu.add(getRemoveProfileMenuItem());
			fileMenu.add(new JSeparator());
			fileMenu.add(getExitMenuItem());
		}
		return fileMenu;
	}
	/**
	 * This method initializes the "Help" menu
	 * Takes text from the "mainframe.menu.help" text resource
	 * of this class.
	 * @return javax.swing.JMenu	
	 */    
	private javax.swing.JMenu getHelpMenu() {
		if (helpMenu == null) {
			helpMenu = new javax.swing.JMenu();
			helpMenu.setText(Resourcer.getString(this.getClass(),
			        "mainframe.menu.help"));
			helpMenu.add(getAboutMenuItem());
		}
		return helpMenu;
	}
	/**
	 * This method initializes the "File->Exit" menu item
	 * Takes text from the "mainframe.menu.jobs.exit" text resource
	 * of this class.
	 * @return javax.swing.JMenuItem	
	 */    
	private javax.swing.JMenuItem getExitMenuItem() {
		if (exitMenuItem == null) {
			exitMenuItem = new javax.swing.JMenuItem();
			exitMenuItem.setText(Resourcer.getString(this.getClass(),
			        "mainframe.menu.jobs.exit"));
			exitMenuItem.addActionListener(new java.awt.event.ActionListener(){ 
				/**
				 * Exits the application whit a 0 (zero) return code
				 * @see java.awt.event.ActionListener#actionPerformed
				 * (java.awt.event.ActionEvent)
				 */
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					System.exit(0);
				}
			});
		}
		return exitMenuItem;
	}
	/**
	 * This method initializes the "Help->About" menu item
	 * Takes text from the "mainframe.menu.help.about" text resource
	 * of this class.
	 * @return javax.swing.JMenuItem	
	 */    
	private javax.swing.JMenuItem getAboutMenuItem() {
		if (aboutMenuItem == null) {
			aboutMenuItem = new javax.swing.JMenuItem();
			aboutMenuItem.setText(Resourcer.getString(this.getClass(),
			        "mainframe.menu.help.about"));
			aboutMenuItem.addActionListener(new java.awt.event.ActionListener(){ 
				/**
				 * Shows the about dialog
				 * @see java.awt.event.ActionListener#actionPerformed
				 * (java.awt.event.ActionEvent)
				 * @see es.tunelator.gui.adv.AboutDialog#
				 * AboutDialog(Frame)
				 */
				public void actionPerformed(java.awt.event.ActionEvent e) {
                    new HTMLDialog(MainFrame.this,
                            Resourcer.getString(MainFrame.class,"aboutDialog.title"),
                            AppParameters.getProperty(AppParameters.ABOUT_PATH)+"/"+
                            Resourcer.getString(HTMLDialog.class,"file"))
                            .setVisible(true);
				}
			});
		}
		return aboutMenuItem;
	}
	/**
	 * This method initializes jPanel, the panel that contains
	 * the toolbar panel and the separator.
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
			jPanel.add(getJPanel1(), null);
			jPanel.add(new JSeparator(), null);
		}
		return jPanel;
	}
	/**
	 * This method initializes jPanel1, the panel that contains the
	 * toolbars.
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			FlowLayout flowLayout3 = new FlowLayout();
			jPanel1 = new JPanel();
			jPanel1.setLayout(flowLayout3);
			flowLayout3.setAlignment(java.awt.FlowLayout.LEFT);
			flowLayout3.setHgap(0);
			flowLayout3.setVgap(0);
			jPanel1.setPreferredSize(new java.awt.Dimension(46,36));
			jPanel1.add(getJToolBar(), null);
			jPanel1.add(getJToolBar2(), null);
		}
		return jPanel1;
	}
	/**
	 * This method initializes jToolBar, the first toolbar and the
	 * one that contains the file command buttons.	
	 * @return javax.swing.JToolBar	
	 */    
	private JToolBar getJToolBar() {
		if (jToolBar == null) {
		    JSeparator sep = null;
		    jToolBar = new JToolBar();
			jToolBar.add(getNewJobButton());
			jToolBar.add(getCloseJobButton());
			sep = new JSeparator();
			sep.setOrientation(SwingConstants.VERTICAL);
			jToolBar.add(sep);
			jToolBar.add(getAddFileButton());
			jToolBar.add(getRemoveFileButton());
			sep = new JSeparator();
			sep.setOrientation(SwingConstants.VERTICAL);
			jToolBar.add(sep);
			jToolBar.add(getSaveButton());
			jToolBar.add(getSaveAsButton());
			jToolBar.add(getSaveAllButton());
			sep = new JSeparator();
			sep.setOrientation(SwingConstants.VERTICAL);
			jToolBar.add(sep);
			jToolBar.add(getExportButton());
		}
		return jToolBar;
	}
	/**
	 * This method initializes jToolBar2, the second toolbar and the one
	 * that contains the data edition command buttons.
	 * @return javax.swing.JToolBar	
	 */    
	private JToolBar getJToolBar2() {
		if (jToolBar2 == null) {
		    jToolBar2 = new JToolBar();
		    JSeparator sep = null;
			jToolBar2.add(getRemoveProfileButton());
			sep = new JSeparator();
			sep.setOrientation(SwingConstants.VERTICAL);
			jToolBar2.add(sep);
			jToolBar2.add(getUndoButton());
			sep = new JSeparator();
			sep.setOrientation(SwingConstants.VERTICAL);
			jToolBar2.add(sep);
			jToolBar2.add(getSelectAllButton());
			sep = new JSeparator();
			sep.setOrientation(SwingConstants.VERTICAL);
			jToolBar2.add(sep);
			jToolBar2.add(getEditButton());
			jToolBar2.add(getAddPointButton());
			jToolBar2.add(getDeleteButton());
		}
		return jToolBar2;
	}
	/**
	 * Initializes newJobButton	
	 * @return javax.swing.JButton that performs the new job command
	 */    
	private JButton getNewJobButton() {
		if (newJobButton == null) {
		    newJobButton = new JButton();
		    newJobButton.setIcon(new ImageIcon(getClass().getResource(Resourcer
		            .getString(this.getClass(),
		                    "mainframe.toolbar.button.newJob.icon"))));
		    newJobButton.setToolTipText(Resourcer.getString(this.getClass(),
		            "mainframe.toolbar.button.newJob.toolTip"));
		    newJobButton.setText("");
		    newJobButton.setMargin(new java.awt.Insets(2,3,2,3));
		    newJobButton.setBorderPainted(false);
		    newJobButton.setContentAreaFilled(false);
		    newJobButton.setMinimumSize(new java.awt.Dimension(16,16));
		    newJobButton.setMaximumSize(new java.awt.Dimension(48,48));
		    newJobButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
				    try {
				        new NewJobCommand(MainFrame.this).execute();
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer
				                .getString(MainFrame.class,"error.internal.newJob"));
				    }
                }
		    });
		}
		return newJobButton;
	}
	/**
	 * Initializes closeJobButton	
	 * @return javax.swing.JButton that performs the close job command
	 */    
	private JButton getCloseJobButton() {
		if (closeJobButton == null) {
		    closeJobButton = new JButton();
		    closeJobButton.setIcon(new ImageIcon(getClass().getResource(
		            Resourcer.getString(this.getClass(),
		                    "mainframe.toolbar.button.closeJob.icon"))));
		    closeJobButton.setToolTipText(Resourcer.getString(this.getClass(),
		            "mainframe.toolbar.button.closeJob.toolTip"));
		    closeJobButton.setText("");
		    closeJobButton.setMargin(new java.awt.Insets(2,3,2,3));
		    closeJobButton.setBorderPainted(false);
		    closeJobButton.setContentAreaFilled(false);
		    closeJobButton.setMinimumSize(new java.awt.Dimension(16,16));
		    closeJobButton.setMaximumSize(new java.awt.Dimension(48,48));
		    closeJobButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
				    try {
				        new CloseJobCommand(MainFrame.this).execute();
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.newJob"));
				    }
                }
		    });
		}
		return closeJobButton;
	}
	/**
	 * Initializes addFileButton	
	 * @return javax.swing.JButton that performs the add file command
	 */    
	private JButton getAddFileButton() {
		if (addFileButton == null) {
		    addFileButton = new JButton();
		    addFileButton.setIcon(new ImageIcon(getClass().getResource(
		            Resourcer.getString(this.getClass(),
		                    "mainframe.toolbar.button.addFile.icon"))));
		    addFileButton.setToolTipText(Resourcer.getString(this.getClass(),
		            "mainframe.toolbar.button.addFile.toolTip"));
		    addFileButton.setText("");
		    addFileButton.setMargin(new java.awt.Insets(2,3,2,3));
		    addFileButton.setBorderPainted(false);
		    addFileButton.setContentAreaFilled(false);
		    addFileButton.setMinimumSize(new java.awt.Dimension(16,16));
		    addFileButton.setMaximumSize(new java.awt.Dimension(48,48));
		    addFileButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
				    try {
				        new AddFileCommand(MainFrame.this).execute();
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.newJob"));
				    }
                }
		    });
		}
		return addFileButton;
	}
	/**
	 * Initializes removeFileButton	
	 * @return javax.swing.JButton that performs the remove file command
	 */    
	private JButton getRemoveFileButton() {
		if (removeFileButton == null) {
		    removeFileButton = new JButton();
		    removeFileButton.setIcon(new ImageIcon(getClass().getResource(
		            Resourcer.getString(this.getClass(),
		                    "mainframe.toolbar.button.removeFile.icon"))));
		    removeFileButton.setToolTipText(Resourcer.getString(this.getClass(),
		            "mainframe.toolbar.button.removeFile.toolTip"));
		    removeFileButton.setText("");
		    removeFileButton.setMargin(new java.awt.Insets(2,3,2,3));
		    removeFileButton.setBorderPainted(false);
		    removeFileButton.setContentAreaFilled(false);
		    removeFileButton.setMinimumSize(new java.awt.Dimension(16,16));
		    removeFileButton.setMaximumSize(new java.awt.Dimension(48,48));
		    removeFileButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
				    try {
				        new RemoveFileCommand(MainFrame.this).execute();
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.newJob"));
				    }
                }
		    });
		}
		return removeFileButton;
	}
	/**
	 * Initializes saveButton	
	 * @return javax.swing.JButton that performs the save command
	 */    
	private JButton getSaveButton() {
		if (saveButton == null) {
		    saveButton = new JButton();
		    saveButton.setIcon(new ImageIcon(getClass().getResource(
		            Resourcer.getString(this.getClass(),
		                    "mainframe.toolbar.button.save.icon"))));
		    saveButton.setToolTipText(Resourcer.getString(this.getClass(),
		            "mainframe.toolbar.button.save.toolTip"));
		    saveButton.setText("");
		    saveButton.setMargin(new java.awt.Insets(2,3,2,3));
		    saveButton.setBorderPainted(false);
		    saveButton.setContentAreaFilled(false);
		    saveButton.setMinimumSize(new java.awt.Dimension(16,16));
		    saveButton.setMaximumSize(new java.awt.Dimension(48,48));
		    saveButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
				    try {
				        new SaveCommand(MainFrame.this.getDisplayedGUIFile()).
                            execute();
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.saveFile"));
				    }
                }
		    });
		}
		return saveButton;
	}
	/**
	 * Initializes saveAsButton	
	 * @return javax.swing.JButton that performs the save as command	
	 */    
	private JButton getSaveAsButton() {
		if (saveAsButton == null) {
		    saveAsButton = new JButton();
		    saveAsButton.setIcon(new ImageIcon(getClass().getResource(
		            Resourcer.getString(this.getClass(),
		                    "mainframe.toolbar.button.saveAs.icon"))));
		    saveAsButton.setToolTipText(Resourcer.getString(this.getClass(),
		            "mainframe.toolbar.button.saveAs.toolTip"));
		    saveAsButton.setText("");
		    saveAsButton.setMargin(new java.awt.Insets(2,3,2,3));
		    saveAsButton.setBorderPainted(false);
		    saveAsButton.setContentAreaFilled(false);
		    saveAsButton.setMinimumSize(new java.awt.Dimension(16,16));
		    saveAsButton.setMaximumSize(new java.awt.Dimension(48,48));
		    saveAsButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
				    try {
				        new SaveAsCommand(MainFrame.this,
				               MainFrame.this.getDisplayedGUIFile()).execute();
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.saveFile"));
				    }
                }
		    });
		}
		return saveAsButton;
	}
	/**
	 * Initializes saveAllButton	
	 * @return javax.swing.JButton that performs the save all command
	 */    
	private JButton getSaveAllButton() {
		if (saveAllButton == null) {
		    saveAllButton = new JButton();
		    saveAllButton.setIcon(new ImageIcon(getClass().getResource(
		            Resourcer.getString(this.getClass(),
		                    "mainframe.toolbar.button.saveAll.icon"))));
		    saveAllButton.setToolTipText(Resourcer.getString(this.getClass(),
		            "mainframe.toolbar.button.saveAll.toolTip"));
		    saveAllButton.setText("");
		    saveAllButton.setMargin(new java.awt.Insets(2,3,2,3));
		    saveAllButton.setBorderPainted(false);
		    saveAllButton.setContentAreaFilled(false);
		    saveAllButton.setMinimumSize(new java.awt.Dimension(16,16));
		    saveAllButton.setMaximumSize(new java.awt.Dimension(48,48));
		    saveAllButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
				    try {
				        new SaveAllCommand(MainFrame.this).execute();
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.saveFile"));
				    }
                }
		    });
		}
		return saveAllButton;
	}
	/**
	 * Initializes exportButton	
	 * @return javax.swing.JButton that performs the export command
	 */    
	private JButton getExportButton() {
		if (exportButton == null) {
		    exportButton = new JButton();
		    exportButton.setIcon(new ImageIcon(getClass().getResource(
		            Resourcer.getString(this.getClass(),
		                    "mainframe.toolbar.button.export.icon"))));
		    exportButton.setToolTipText(Resourcer.getString(this.getClass(),
		            "mainframe.toolbar.button.export.toolTip"));
		    exportButton.setText("");
		    exportButton.setMargin(new java.awt.Insets(2,3,2,3));
		    exportButton.setBorderPainted(false);
		    exportButton.setContentAreaFilled(false);
		    exportButton.setMinimumSize(new java.awt.Dimension(16,16));
		    exportButton.setMaximumSize(new java.awt.Dimension(48,48));
		    exportButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
				    try {
				        new ExportCommand(MainFrame.this,
				               MainFrame.this.getDisplayedGUIFile()).execute();
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.saveFile"));
				    }
                }
		    });
		}
		return exportButton;
	}
	/**
	 * Initializes removeProfileButton	
	 * @return javax.swing.JButton that performs he remove profile command
	 */    
	private JButton getRemoveProfileButton() {
		if (removeProfileButton == null) {
		    removeProfileButton = new JButton();
		    removeProfileButton.setIcon(new ImageIcon(getClass().getResource(
		            Resourcer.getString(this.getClass(),
		                    "mainframe.toolbar.button.removeProfile.icon"))));
		    removeProfileButton.setToolTipText(Resourcer.getString(
		            this.getClass(),
		            "mainframe.toolbar.button.removeProfile.toolTip"));
		    removeProfileButton.setText("");
		    removeProfileButton.setMargin(new java.awt.Insets(2,3,2,3));
		    removeProfileButton.setBorderPainted(false);
		    removeProfileButton.setContentAreaFilled(false);
		    removeProfileButton.setMinimumSize(new java.awt.Dimension(16,16));
		    removeProfileButton.setMaximumSize(new java.awt.Dimension(48,48));
		    removeProfileButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
				    try {
						MainFrame.this.getDisplayedGUIFile().getUndoManager()
						.executeCommand(new DeleteProfileCommand(MainFrame.this));
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.saveFile"));
				    }
                }
		    });
		}
		return removeProfileButton;
	}
	/**
	 * Initializes undoButton	
	 * @return javax.swing.JButton that performs the undo command
	 */    
	private JButton getUndoButton() {
		if (undoButton == null) {
		    undoButton = new JButton();
		    undoButton.setIcon(new ImageIcon(getClass().getResource(
		            Resourcer.getString(this.getClass(),
		                    "mainframe.toolbar.button.undo.icon"))));
		    undoButton.setToolTipText(Resourcer.getString(this.getClass(),
		            "mainframe.toolbar.button.undo.toolTip"));
		    undoButton.setText("");
		    undoButton.setMargin(new java.awt.Insets(2,3,2,3));
		    undoButton.setBorderPainted(false);
		    undoButton.setContentAreaFilled(false);
		    undoButton.setMinimumSize(new java.awt.Dimension(16,16));
		    undoButton.setMaximumSize(new java.awt.Dimension(48,48));
		    undoButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
				    try {
				        new UndoCommand(MainFrame.this).execute();
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.undo"));
				    }
                }
		    });
		}
		return undoButton;
	}
	/**
	 * Initializes selectAllButton	
	 * @return javax.swing.JButton that performs the select all command
	 */    
	private JButton getSelectAllButton() {
		if (selectAllButton == null) {
		    selectAllButton = new JButton();
		    selectAllButton.setIcon(new ImageIcon(getClass().getResource(
		            Resourcer.getString(this.getClass(),
		                    "mainframe.toolbar.button.selectAll.icon"))));
		    selectAllButton.setToolTipText(Resourcer.getString(this.getClass(),
		            "mainframe.toolbar.button.selectAll.toolTip"));
		    selectAllButton.setText("");
		    selectAllButton.setMargin(new java.awt.Insets(2,3,2,3));
		    selectAllButton.setBorderPainted(false);
		    selectAllButton.setContentAreaFilled(false);
		    selectAllButton.setMinimumSize(new java.awt.Dimension(16,16));
		    selectAllButton.setMaximumSize(new java.awt.Dimension(48,48));
		    selectAllButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
				    try {
				        MainFrame.this.getPointsTable().selectAll();
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.undo"));
				    }
                }
		    });
		}
		return selectAllButton;
	}
	/**
	 * Initializes editButton	
	 * @return javax.swing.JButton that performs the edit command	
	 */    
	private JButton getEditButton() {
		if (editButton == null) {
		    editButton = new JButton();
		    editButton.setIcon(new ImageIcon(getClass().getResource(
		            Resourcer.getString(this.getClass(),
		                    "mainframe.toolbar.button.edit.icon"))));
		    editButton.setToolTipText(Resourcer.getString(this.getClass(),
		            "mainframe.toolbar.button.edit.toolTip"));
		    editButton.setText("");
		    editButton.setMargin(new java.awt.Insets(2,3,2,3));
		    editButton.setBorderPainted(false);
		    editButton.setContentAreaFilled(false);
		    editButton.setMinimumSize(new java.awt.Dimension(16,16));
		    editButton.setMaximumSize(new java.awt.Dimension(48,48));
		    editButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
				    try {
					    MainFrame.this.getDisplayedGUIFile().getUndoManager().
					    	executeCommand(new EditPointsCommand(MainFrame.this));
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.editPoints"));
				    }
                }
		    });
		}
		return editButton;
	}
	/**
	 * Initializes addPointButton	
	 * @return javax.swing.JButton that performs the add point command
	 */    
	private JButton getAddPointButton() {
		if (addPointButton == null) {
		    addPointButton = new JButton();
		    addPointButton.setIcon(new ImageIcon(getClass().getResource(
		            Resourcer.getString(this.getClass(),
		                    "mainframe.toolbar.button.add.icon"))));
		    addPointButton.setToolTipText(Resourcer.getString(this.getClass(),
		            "mainframe.toolbar.button.add.toolTip"));
		    addPointButton.setText("");
		    addPointButton.setMargin(new java.awt.Insets(2,3,2,3));
		    addPointButton.setBorderPainted(false);
		    addPointButton.setContentAreaFilled(false);
		    addPointButton.setMinimumSize(new java.awt.Dimension(16,16));
		    addPointButton.setMaximumSize(new java.awt.Dimension(48,48));
		    addPointButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
				    try {
					    MainFrame.this.getDisplayedGUIFile().getUndoManager().
					    	executeCommand(new AddPointCommand(MainFrame.this));
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.editPoints"));
				    }
                }
		    });
		}
		return addPointButton;
	}
	/**
	 * Initializes deleteButton	
	 * @return javax.swing.JButton that performs the delete command
	 */    
	private JButton getDeleteButton() {
		if (deleteButton == null) {
		    deleteButton = new JButton();
		    deleteButton.setIcon(new ImageIcon(getClass().getResource(
		            Resourcer.getString(this.getClass(),
		                    "mainframe.toolbar.button.delete.icon"))));
		    deleteButton.setToolTipText(Resourcer.getString(this.getClass(),
		            "mainframe.toolbar.button.delete.toolTip"));
		    deleteButton.setText("");
		    deleteButton.setMargin(new java.awt.Insets(2,3,2,3));
		    deleteButton.setBorderPainted(false);
		    deleteButton.setContentAreaFilled(false);
		    deleteButton.setMinimumSize(new java.awt.Dimension(16,16));
		    deleteButton.setMaximumSize(new java.awt.Dimension(48,48));
		    deleteButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
				    try {
					    if(MainFrame.this.displayedFile != null){
							Component cmp = MainFrame.this.jTabbedPane.
								getSelectedComponent();
							if(cmp.equals(editPointsPanel)){
							    MainFrame.this.getDisplayedGUIFile().
							    	getUndoManager().executeCommand(
							    	        new DeletePointsCommand(
							    	                MainFrame.this));
						        MainFrame.this.resetEnablementStatus();
							}
					    }
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.deletePoints"));
				    }
                }
		    });
		}
		return deleteButton;
	}
	/**
	 * Initializes jSplitPane	
	 * @return javax.swing.JSplitPane that divides the frame in two vertical 
	 * sections. The left one for the jobs tree and the right one of the table
	 * and preview panels.
	 */    
	private JSplitPane getJSplitPane() {
		if (jSplitPane == null) {
			jSplitPane = new JSplitPane();
			jSplitPane.setRightComponent(getJTabbedPane());
			jSplitPane.setLeftComponent(getJPanel4());
		}
		return jSplitPane;
	}
	/**
	 * Initializes jTabbedPane	
	 * @return javax.swing.JTabbedPane that contains the table and preview panels
	 */    
	public JTabbedPane getJTabbedPane() {
		if (jTabbedPane == null) {
			jTabbedPane = new JTabbedPane();
			jTabbedPane.addTab(Resourcer.getString(this.getClass(),
			        "editpoints.tab.title"), null, getEditPointsPanel(), null);
			jTabbedPane.addTab(Resourcer.getString(this.getClass(),
			        "preview.tab.title"), null, getPreviewPanel(), null);
			jTabbedPane.addChangeListener(new ChangeListener(){
                public void stateChanged(ChangeEvent e) {
                    MainFrame.this.resetEnablementStatus();
                }});
		}
		return jTabbedPane;
	}
	/**
	 * @return J3DProfileViewer - The panel that shows the Java3D preview
	 */
	public J3DProfileViewer getPreviewPanel() {
	    if (previewPanel == null) {
	        if(displayedFile != null){
	            previewPanel = new J3DProfileViewer(displayedFile);
	        } else {
	            previewPanel = new J3DProfileViewer((GUIFileVO)null);
	        }
	    }
	    return previewPanel;
	}
	/**
	 * Adds scrolls to the table
	 * @return javax.swing.JPanel - Contains a JScrollPane containing the table
	 */    
	private JPanel getEditPointsPanel() {
		if (editPointsPanel == null) {
			GridLayout gridLayout = new GridLayout();
			editPointsPanel = new JPanel();
			editPointsPanel.setLayout(gridLayout);
			editPointsPanel.add(getJScrollPane(), null);
		}
		return editPointsPanel;
	}
	/**
	 * @return javax.swing.JPanel - A message bar occupying the botton of the 
	 * frame, showing the "label.copyright.text" global text resource.
	 */    
	private JPanel getMessageBarPanel() {
		if (messageBarPanel == null) {
			messageLabel = new JLabel();
			FlowLayout flowLayout4 = new FlowLayout();
			messageBarPanel = new JPanel();
			messageBarPanel.setLayout(flowLayout4);
			messageLabel.setText(Resourcer.getString(null,
			        "label.copyright.text"));
			messageLabel.setFont(new java.awt.Font("Dialog", 
			        java.awt.Font.PLAIN, 10));
			flowLayout4.setAlignment(java.awt.FlowLayout.LEFT);
			flowLayout4.setHgap(1);
			flowLayout4.setVgap(1);
			messageBarPanel.add(messageLabel, null);
		}
		return messageBarPanel;
	}
	/**
	 * @return javax.swing.JPanel to contain the tree and leave a white margin
	 * around it.
	 */    
	private JPanel getJPanel4() {
		if (jPanel4 == null) {
			GridLayout gridLayout8 = new GridLayout();
			jPanel4 = new JPanel();
			jPanel4.setLayout(gridLayout8);
			gridLayout8.setRows(1);
			gridLayout8.setColumns(1);
			jPanel4.setAutoscrolls(true);
			jPanel4.setAlignmentX(0.5F);
			jPanel4.setAlignmentY(0.5F);
			jPanel4.setBorder(javax.swing.BorderFactory.
			        createMatteBorder(2,2,2,2,java.awt.Color.white));
			jPanel4.setPreferredSize(new Dimension(150,50));
			jPanel4.add(getJScrollPane2(), null);
		}
		return jPanel4;
	}
	/**
	 * To be used to find the index of a point in the sorted list that
	 * is displayed in the table. This is needed because the SortedList
	 * indexOf method does not return the expected result
	 * @param list A list where we'll linearly search
	 * @param object The object we search for, using equals
	 * @return The index of object in list or -1 if it wasn't found
	 */
	private int getIndexOf(List list, Object object){
	    Iterator it = list.iterator();
	    int index = -1;
	    while(it.hasNext()){
	        index++;
	        if(object.equals(it.next())){
	            return index;
	        }
	    }
	    return index;
	}
	/**
	 * Marks as selected the rows of the table widget where the elements of the
	 * received list are stored.
	 * @param group The <code>List</code> of elements to select
	 */
	public void selectProfilePoints(List group) {
	    Iterator it = group.iterator();
	    while(it.hasNext()){
	        PuntoVO point = (PuntoVO) it.next();
	        // This simply doesn't return the correct indexes of the points as 
	        // they appear in the sorted table.
	        // int index = this.getDisplayedGUIFile().
	        //                  getTableList().indexOf(point);
	        // So, we use a hacked linear search function of our own to bypass 
	        // this problem.
	        int index = getIndexOf(this.displayedFile.getTableList(),point);
	        if(index != -1){
	            this.getPointsTable().addRowSelectionInterval(index,index);
	        }
	    }
	}
	/**
	 * Initializes the jobs <code>JTree</code> and sets its selection listener
	 * @return javax.swing.JTree	
	 */    
	public JTree getJTree() {
		if (jTree == null) {
			jTree = new JobsJTree();
			jTree.setModel(getJobsTreeModel());
			jTree.setEditable(true);
			jTree.setExpandsSelectedPaths(true);
			jTree.setRootVisible(false);
			jTree.setSelectionModel(new JobsTreeSelectionModel());
			jTree.addTreeSelectionListener(new javax.swing.event.
			        TreeSelectionListener() { 
				public void valueChanged(javax.swing.event.
				        TreeSelectionEvent e) {
				    try {
					    DefaultMutableTreeNode node = (DefaultMutableTreeNode) 
					    	MainFrame.this.jTree.
					    		getLastSelectedPathComponent();
					    if((node!=null)){
					        MainFrame.this.getPointsTable().clearSelection();
					        GUIFileVO file = null;
					        switch (node.getLevel()){
					        	case 0: MainFrame.this.getPointsTable().
					        			setModel(new PointsTableModel(
					        			        new BasicEventList(),
					        			        new PointsTableFormat()));
					        			displayedFile = null;
					        			break;
					        	case 1: if(node.getChildCount() > 0) {
							        	    DefaultMutableTreeNode node1 = 
							        	        (DefaultMutableTreeNode)node.
							        	        	getFirstChild();
							        		if(node1 != null){
						        			    file = (GUIFileVO) 
						        			    	((FileNodeUpdater)node1.
						        			    	        getUserObject()).
						        			    	        getUserObject();
						        			    if(!file.equals(
						        			            displayedFile)){
							        			    MainFrame.this.
							        			    	setDisplayedGUIFile(
							        			    	        file,
							        			    	        true);
						        			    }
						        			}
					        			}
					        			break;
					        	case 2: file = (GUIFileVO) ((FileNodeUpdater)
					        	        	node.getUserObject()).
					        	        		getUserObject();
					        			if(!file.equals(displayedFile)){
					        			    MainFrame.this.setDisplayedGUIFile(
					        			            file,true);
					        			}
							    		break;
					        	case 3: MainFrame.this.cancelTableEditing();
					        	    	DefaultMutableTreeNode fileNode = 
					        	    	    (DefaultMutableTreeNode)node.
					        	    	    	getParent();
					        			file = (GUIFileVO) ((FileNodeUpdater)
					        			        fileNode.getUserObject()).
					        			        	getUserObject();
						       			TreePath[] selected = MainFrame.this.
						       				jTree.getSelectionPaths();
						       			if(!file.equals(displayedFile)){
					        			    MainFrame.this.setDisplayedGUIFile(
					        			            file,false);
					        			}
						       			for(int i=0; i<selected.length; i++){
						       			    if(((DefaultMutableTreeNode)selected[i].
						       			            getLastPathComponent()).
						       			            	getParent().
						       			            	equals(fileNode)){
							       			    DefaultMutableTreeNode selectedNode = 
							       			        (DefaultMutableTreeNode)
							       			        	selected[i].
							       			        	getLastPathComponent();
							       			    if(selectedNode.getLevel()==3){
									       			ProfileVO group = 
									       			    (ProfileVO)selectedNode.
									       			    getUserObject();
									       			selectProfilePoints(group.
									       			        getElements());
							       			    }
						       			    }
						       			}
							    		break;
					        }
					        // If the selected file has undoable operations, 
					        // enable the undo menu item, else disable it.
					        if(file != null){
					            if(file.getUndoManager().getStackSize()==0){
					                MainFrame.this.getUndoMenuItem().
					                	setEnabled(false);
					            } else {
					                MainFrame.this.getUndoMenuItem().
					                	setEnabled(true);
					            }
					        }
					        MainFrame.this.resetEnablementStatus();
					    }
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,
				                "error.internal.selectTreeNode"));
				    }
				}
			});
		}
		return jTree;
	}
	/**
	 * Initializes the <code>JTable</code> of point data
	 * @return javax.swing.JTable
	 */    
	public JTable getPointsTable() {
		if (pointsTable == null) {
			pointsTable = new JDataTable();
			this.setDisplayedGUIFile(emptyFile,false);
		}
		return pointsTable;
	}
	/**
	 * @return <code>TableCellRenderer</code> of type 
	 * <code>JFormatTableRenderer</code> initialized
	 * with the format returned by <code>getDateFormat</code>
	 */
	public TableCellRenderer getDateCellRenderer(){
	    if(dateCellRenderer == null){
	        dateCellRenderer = new JFormatTableRenderer(getDateFormat());
	    }
	    return dateCellRenderer;
	}
	/**
	 * @return DateFormat to apply to date values.
	 */
	public DateFormat getDateFormat(){
	    if(dateFormat==null){
	        dateFormat = new SimpleDateFormat("dd.MM.yyyy");
	        dateFormat.setLenient(false);
	    }
	    return dateFormat;
	}
	/**
	 * @return <code>TableCellRenderer</code> of type 
	 * <code>JFormatTableRenderer</code> initialized
	 * with the format returned by <code>getTimeFormat</code>
	 */
	public TableCellRenderer getTimeCellRenderer(){
	    if(timeCellRenderer == null){
	        timeCellRenderer = new JFormatTableRenderer(getTimeFormat());
	    }
	    return timeCellRenderer;
	}
	/**
	 * @return DateFormat to apply to hour values.
	 */
	public DateFormat getTimeFormat(){
	    if(timeFormat==null){
	        timeFormat = new SimpleDateFormat("HH:mm:ss");
	        timeFormat.setLenient(false);
	    }
	    return timeFormat;
	}
	/**
	 * Initializes the scroll pane that provides scrolls for 
	 * the points table.
	 * @return javax.swing.JScrollPane	
	 */    
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getPointsTable());
		}
		return jScrollPane;
	}
	/**
	 * Initializes the menu of the main frame	
	 * @return javax.swing.JMenu	
	 */    
	private JMenu getEditMenu() {
		if (editMenu == null) {
			editMenu = new JMenu(Resourcer.getString(this.getClass(),
			        "mainframe.menu.edit"));
			editMenu.add(getUndoMenuItem());
			editMenu.add(new JSeparator());
			editMenu.add(getSelectAllMenuItem());
			editMenu.add(new JSeparator());
			editMenu.add(getEditMenuItem());
			editMenu.add(getDeleteMenuItem());
		}
		return editMenu;
	}
	/**
	 * Initializes the undo menu item with the
	 * "mainframe.menu.edit.undo" text resource of this class. 	
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getUndoMenuItem() {
		if (undoMenuItem == null) {
			undoMenuItem = new JMenuItem(Resourcer.getString(this.getClass(),
			        "mainframe.menu.edit.undo"));
			undoMenuItem.setEnabled(false);
			undoMenuItem.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {
				    try {
				        new UndoCommand(MainFrame.this).execute();
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.undo"));
				    }
				}
			});
		}
		return undoMenuItem;
	}
	/**
	 * Initializes jMenuItem	
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getSelectAllMenuItem() {
		if (selectAllMenuItem == null) {
			selectAllMenuItem = new JMenuItem(Resourcer.getString(
			        this.getClass(),"mainframe.menu.edit.selectall"));
			selectAllMenuItem.addActionListener(
			        new java.awt.event.ActionListener() {
			    public void actionPerformed(java.awt.event.ActionEvent e) {
			        try {
					    if(MainFrame.this.displayedFile != null){
							Component cmp = MainFrame.this.jTabbedPane.
								getSelectedComponent();
							if(cmp.equals(editPointsPanel)){
							    MainFrame.this.pointsTable.selectAll();
							}
					    }
			        } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.selectAll"));
				    }
			    }
			});
		}
		return selectAllMenuItem;
	}
	/**
	 * Initializes the new job menu item with the
	 * "mainframe.menu.jobs.newjob" text resource of this class
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getNewJobMenuItem() {
		if (newJobMenuItem == null) {
			newJobMenuItem = new JMenuItem(Resourcer.getString(this.getClass(),
			        "mainframe.menu.jobs.newjob"));
			newJobMenuItem.addActionListener(
			        new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {
				    try {
				        new NewJobCommand(MainFrame.this).execute();
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.newJob"));
				    }
				}
			});
		}
		return newJobMenuItem;
	}
	/**
	 * Initializes the close job menu item with the 
	 * "mainframe.menu.jobs.closejob" text resource of this class.
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getCloseJobMenuItem() {
		if (closeJobMenuItem == null) {
			closeJobMenuItem = new JMenuItem(Resourcer.getString(
			        this.getClass(),"mainframe.menu.jobs.closejob"));
			closeJobMenuItem.addActionListener(
			        new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {
				    try {
				        new CloseJobCommand(MainFrame.this).execute();
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(MainFrame.class,"error.internal.closeJob"));
				    }
				}
			});
		}
		return closeJobMenuItem;
	}
	/**
	 * Initializes the add file menu item with the	
	 * 	"mainframe.menu.jobs.addFile" text resource of this class
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getAddFileMenuItem() {
		if (addFileMenuItem == null) {
			addFileMenuItem = new JMenuItem(Resourcer.getString(
			        this.getClass(),"mainframe.menu.jobs.addFile"));
			addFileMenuItem.addActionListener(
			        new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {
				    try {
				        new AddFileCommand(MainFrame.this).execute();
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(
				                Resourcer.getString(MainFrame.class,
				                        "error.internal.addFile"));
				    }
				}
			});
		}
		return addFileMenuItem;
	}
	/**
	 * Initializes the remove file menu item with the 
	 * "mainframe.menu.jobs.removeFile" text resource of this class
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getRemoveFileMenuItem() {
		if (removeFileMenuItem == null) {
			removeFileMenuItem = new JMenuItem(Resourcer.getString(
			        this.getClass(),"mainframe.menu.jobs.removeFile"));
			removeFileMenuItem.addActionListener(
			        new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {
				    try {
				        new RemoveFileCommand(MainFrame.this).execute();
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.removeFile"));
				    }
				}
			});
		}
		return removeFileMenuItem;
	}
	/**
	 * Cancels edtion if a table cell is being edited
	 * Do this before modifying the table model from outside the table
	 */
	public void cancelTableEditing(){
        if(pointsTable.isEditing()){
            int row = pointsTable.getEditingRow();
            int col = pointsTable.getEditingColumn();
            pointsTable.getCellEditor(row,col).cancelCellEditing();
        }
	}
	/**
	 * This method initializes jRemoveProfileMenuItem	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getRemoveProfileMenuItem() {
		if (removeProfileMenuItem == null) {
			removeProfileMenuItem = new JMenuItem(Resourcer.getString(
			        this.getClass(),"mainframe.menu.jobs.removeProfile"));
			removeProfileMenuItem.addActionListener(
			        new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {
				    try {
						MainFrame.this.getDisplayedGUIFile().getUndoManager().
							executeCommand(new DeleteProfileCommand(MainFrame.this));
				    } catch (UserMessageException ex){
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.removeProfile"));
				    }
				}
			});
		}
		return removeProfileMenuItem;
	}
	/**
	 * Initializes the data model for the jobs tree
	 * @return es.tunelator.gui.models.JobsTreeModel	
	 */    
	public JobsTreeModel getJobsTreeModel() {
		if (jobsTreeModel == null) {
			jobsTreeModel = new JobsTreeModel();
		}
		return jobsTreeModel;
	}
	/**
	 * Initializes the scroll pane to add scrolls to the jobs tree
	 * @return javax.swing.JScrollPane	
	 */    
	private JScrollPane getJScrollPane2() {
		if (jScrollPane2 == null) {
			jScrollPane2 = new JScrollPane();
			jScrollPane2.setViewportView(getJTree());
		}
		return jScrollPane2;
	}
	/**
	 * Returns the current table model of the points table or creates
	 * an empty new one if there is no one already.
	 * @return es.tunelator.gui.models.PointsTableModel	
	 */    
	public PointsTableModel getPointsTableModel() {
	    if(pointsTableModel == null){
	        pointsTableModel = getPointsTableModel(null);
	    }
	    return pointsTableModel;
	}
	/**
	 * Creates a new table model for the given <code>GUIFileVO</code>
	 * @return es.tunelator.gui.models.PointsTableModel	
	 */    
	public PointsTableModel getPointsTableModel(EventList list) {
	    if(list == null) {
	        // Instead of deleting the elements of the list, an empty model 
	        // is created to replace the existing one.
	        pointsTableModel = new PointsTableModel(new SortedList(
	                new BasicEventList()),new PointsTableFormat());
	    } else {
	        pointsTableModel = new PointsTableModel(list, 
	                new PointsTableFormat());
	    }
		return pointsTableModel;
	}
	/**
	 * Initializes a table cell editor that forces contents to be double
	 * values in ######0.000 format.
	 * @return es.tunelator.gui.editors.JFormatTableCellEditor	
	 */    
	private JFormatTableCellEditor getNumberTableEditor(boolean allowEmpty) {
		if (numberTableEditor == null) {
		    String patterns [] = {"-?","-?\\d{1,7}","-?\\d{1,7}\\.",
		            "\\A-?\\d{1,7}(\\.\\d{1,5})?"};
			numberTableEditor = new JFormatTableCellEditor(patterns,allowEmpty);
		}
		return numberTableEditor;
	}
	/**
	 * Initializes a table cell editor that forces contests to be int
	 * values in [-]######0 format
	 * @return es.tunelator.gui.editors.JFormatTableCellEditor	
	 */    
	private JFormatTableCellEditor getIntTableEditor(boolean allowEmpty) {
		if (intTableEditor == null) {
		    String patterns [] = {"-?","-?\\d{1,7}"};
			intTableEditor = new JFormatTableCellEditor(patterns,allowEmpty);
		}
		return intTableEditor;
	}
	/**
	 * Initializes a table cell editor that forces contests to be positive int
	 * values in ######0 format
	 * @return es.tunelator.gui.editors.JFormatTableCellEditor	
	 */    
	private JFormatTableCellEditor getPintTableEditor(boolean allowEmpty) {
		if (pintTableEditor == null) {
		    String patterns [] = {"\\d{1,7}"};
			pintTableEditor = new JFormatTableCellEditor(patterns,allowEmpty);
		}
		return pintTableEditor;
	}
	/**
	 * Initializes a table cell editor that forces contents to be valid dates
	 * in dd.MM.yyyy format.
	 * @return es.tunelator.gui.editors.JFormatTableCellEditor	
	 */    
	private JFormatTableCellEditor getDateTableEditor(boolean allowEmpty) {
		if (dateTableEditor == null) {
		    String patterns [] = {"\\d{1,2}","\\d{1,2}\\.","\\d{1,2}\\.\\d{1,2}",
		            "\\d{1,2}\\.\\d{1,2}\\.","\\d{1,2}\\.\\d{1,2}\\.\\d{1,4}"};
			dateTableEditor = new JFormatTableCellEditor(patterns,allowEmpty);
			dateTableEditor.setValidator(new DateValidator("dd.MM.yyyy"));
		}
		return dateTableEditor;
	}
	/**
	 * Initializes a table cell editor that forces contenst to be valid time
	 * values in hh:mm:ss format
	 * @return es.tunelator.gui.editors.JFormatTableCellEditor	
	 */    
	private JFormatTableCellEditor getTimeTableEditor(boolean allowEmpty) {
		if (timeTableEditor == null) {
		    String patterns [] = {"\\d{1,2}","\\d{1,2}:","\\d{1,2}:\\d{1,2}",
		            "\\d{1,2}:\\d{1,2}:","\\d{1,2}:\\d{1,2}:\\d{1,2}"};
			timeTableEditor = new JFormatTableCellEditor(patterns,allowEmpty);
			timeTableEditor.setValidator(new DateValidator("HH:mm:ss"));
		}
		return timeTableEditor;
	}
	/**
	 * Initializes the save menu item with the 
	 * "mainframe.menu.jobs.saveFile" text resource of this class.
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getSaveMenuItem() {
		if (saveMenuItem == null) {
			saveMenuItem = new JMenuItem();
			saveMenuItem.setText(Resourcer.getString(this.getClass(),
			        "mainframe.menu.jobs.saveFile"));
			saveMenuItem.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {
				    try {
				        new SaveCommand(MainFrame.this.getDisplayedGUIFile()).
                            execute();
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.saveFile"));
				    }
				}
			});
		}
		return saveMenuItem;
	}
	/**
	 * Initializes the save all menu item with the 
	 * "mainframe.menu.jobs.saveAllFile" text resource of this class	
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getSaveAllMenuItem() {
		if (saveAllMenuItem == null) {
			saveAllMenuItem = new JMenuItem();
			saveAllMenuItem.setText(Resourcer.getString(this.getClass(),
			        "mainframe.menu.jobs.saveAllFile"));
			saveAllMenuItem.addActionListener(
			        new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {
				    try {
				        new SaveAllCommand(MainFrame.this).execute();
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.saveFile"));
				    }
				}
			});
		}
		return saveAllMenuItem;
	}
	/**
	 * Initializes the save as menu item with the 
	 * "mainframe.menu.jobs.saveAsFile" text resource of this class
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getSaveAsMenuItem() {
		if (saveAsMenuItem == null) {
			saveAsMenuItem = new JMenuItem();
			saveAsMenuItem.setText(Resourcer.getString(this.getClass(),
			        "mainframe.menu.jobs.saveAsFile"));
			saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {
				    try {
				        new SaveAsCommand(MainFrame.this,displayedFile).execute();
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.saveFile"));
				    }
				}
			});
		}
		return saveAsMenuItem;
	}
	/**
	 * Initializes the export menu item with the
	 * 	"mainframe.menu.jobs.export" text resource of this class.
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getExportMenuItem() {
		if (exportMenuItem == null) {
		    exportMenuItem = new JMenuItem();
		    exportMenuItem.setText(Resourcer.getString(this.getClass(),
		            "mainframe.menu.jobs.export"));
		    exportMenuItem.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {
				    try {
				        new ExportCommand(MainFrame.this,MainFrame.this.
				                getDisplayedGUIFile()).execute();
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.saveFile"));
				    }
				}
			});
		}
		return exportMenuItem;
	}
	/**
	 * Initializes the delete menu item with the 
	 * 	"mainframe.menu.edit.delete" text resource of this class.
	 * @return javax.swing.JMenuItem
	 */    
	private JMenuItem getDeleteMenuItem() {
		if (deleteMenuItem == null) {
			deleteMenuItem = new JMenuItem();
			deleteMenuItem.setText(Resourcer.getString(this.getClass(),
			        "mainframe.menu.edit.delete"));
			deleteMenuItem.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {
				    try {
					    if(MainFrame.this.displayedFile != null){
							Component cmp = MainFrame.this.jTabbedPane.
								getSelectedComponent();
							if(cmp.equals(editPointsPanel)){
							    MainFrame.this.getDisplayedGUIFile().
							    	getUndoManager().executeCommand(
							    	        new DeletePointsCommand(
							    	                MainFrame.this));
						        MainFrame.this.resetEnablementStatus();
							}
					    }
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.deletePoints"));
				    }
				}
			});
		}
		return deleteMenuItem;
	}
	/**
	 * Initializes the edit menu item with the 	
	 * "mainframe.menu.edit.edit" text resource of this class.
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getEditMenuItem() {
		if (editMenuItem == null) {
			editMenuItem = new JMenuItem();
			editMenuItem.setText(Resourcer.getString(this.getClass(),
			        "mainframe.menu.edit.edit"));
			editMenuItem.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {
				    try {
					    MainFrame.this.getDisplayedGUIFile().getUndoManager().
					    	executeCommand(new EditPointsCommand(MainFrame.this));
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (Exception ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.editPoints"));
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.editPoints"));
				    }
				}
			});
		}
		return editMenuItem;
	}
	/**
	 * Initializes the add point menu item with the
	 * "mainframe.menu.edit.add" text resource of this class.
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getAddPointMenuItem() {
		if (addPointMenuItem == null) {
		    addPointMenuItem = new JMenuItem();
		    addPointMenuItem.setText(Resourcer.getString(this.getClass(),
		            "mainframe.menu.edit.add"));
		    addPointMenuItem.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {
				    try {
					    MainFrame.this.getDisplayedGUIFile().getUndoManager().
					    	executeCommand(new AddPointCommand(MainFrame.this));
				    } catch (UserMessageException ex) {
				        MainFrame.this.showUserMessageException(ex);
				    } catch (Exception ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.editPoints"));
				    } catch (InternalError ex) {
				        Logger.logError(MainFrame.class,ex);
				        MainFrame.this.showErrorMessage(Resourcer.getString(
				                MainFrame.class,"error.internal.editPoints"));
				    }
				}
			});
		}
		return addPointMenuItem;
	}
    /**
     * Listens for execution of undoable commands coming from actions on UI 
     * elements of which the main frame has no direct knowledge, such as 
     * direct data modification on table components.<p/>
     * Registers the commands in the current displayed file 
     * <code>UndoManager<code> so they can be undone.
     * @see es.tunelator.gui.undo.UndoCommandListener#
     * undoableCommandPerformed(es.tunelator.gui.undo.UndoManager)
     */
    public void undoableCommandPerformed(UndoManager manager) {
        if(manager.equals(displayedFile.getUndoManager())){
            getUndoMenuItem().setEnabled(true);
        }
    }
}  //  @jve:decl-index=0:visual-constraint="10,10"
