/*
 * Created on Nov 12, 2006
 * 
 * Copyright 2005, Logica Equipamientos Integrales, S.L.
 * 
 */
package es.tunelator.gui.adv;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import es.tunelator.gui.models.FileNodeUpdater;
import es.tunelator.gui.models.JobsTreeModel;
import es.tunelator.gui.vo.GUIFileVO;
import es.tunelator.log.Logger;
import es.tunelator.resources.Resourcer;
import es.tunelator.vo.ProfileVO;

/**
 * &COPY; 2006 Juan Alvarez Ferrando<p/>    
 * 
 * Manages actions in response to selection events on the jobs tree.
 *
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class MainTreeSelectionManager implements TreeSelectionListener {
    /**
     * The main window of the application, where the actions have to be 
     * performed.
     */
    MainFrame mainFrame;
    
    /**
     * Creates the listener for the given MainFrame window
     * @param mainFrame
     */
    public MainTreeSelectionManager(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }
    /**
     * Listens to selection actions on the nodes of the Jobs tree
     * 
     * @see javax.swing.event.TreeSelectionListener#valueChanged(javax.swing.event.TreeSelectionEvent)
     */
    public void valueChanged(TreeSelectionEvent e) {
        try {
            GUIFileVO file =null;
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) mainFrame.getJTree().
                getLastSelectedPathComponent();
            if(node==null){
                return;
            }
            String profileNodeKey = Resourcer.getString(MainFrame.class,"mainframe.tree.profilesNode");
            String alignmentsNodeKey = Resourcer.getString(MainFrame.class,"mainframe.tree.alignmentsNode");
            // Is a file if it is at the same depth as file nodes...
            boolean isFile = node.getLevel()== JobsTreeModel.POINTSFILE_LEVEL;
            // and is under the profiles job child
            // and holds a FileNodeUpdater user object
            isFile = isFile && ((DefaultMutableTreeNode)node.getParent()).getUserObject().equals(profileNodeKey) &&
                    node.getUserObject().getClass().equals(FileNodeUpdater.class);
            // Is a file if it is at the same depth as profiles nodes...
            boolean isProfile = node.getLevel()== JobsTreeModel.PROFILE_LEVEL;
            // and its parent holds a FileNodeUpdater user object (it's a file node)
            isProfile = isProfile && ((DefaultMutableTreeNode)node.getParent()).
                getUserObject().getClass().equals(FileNodeUpdater.class);
            // If selected node is a file or profile
            if (isFile) {
            // Two getUserObject. The first is the ListTreeNodeUpdater used to
            // react to change event in the file's data
                file = (GUIFileVO)((FileNodeUpdater)node.
                        getUserObject()).
                        getUserObject();
            //     Set the file as the displayed file
                if(!file.equals(
                        mainFrame.getDisplayedGUIFile())){
                    mainFrame.setDisplayedGUIFile(file,true);
                }
            }
            if (isProfile) {
                DefaultMutableTreeNode fileNode = (DefaultMutableTreeNode)node.getParent();
                // Two getUserObject. The first is the ListTreeNodeUpdater used to
                // react to change event in the file's data
                file = (GUIFileVO)((FileNodeUpdater)fileNode.
                        getUserObject()).
                        getUserObject();
                //     Set the file as the displayed file
                if(!file.equals(
                        mainFrame.getDisplayedGUIFile())){
                    mainFrame.setDisplayedGUIFile(file,true);
                }
                TreePath[] selected = mainFrame.getJTree().getSelectionPaths();
                if(!file.equals(mainFrame.getDisplayedGUIFile())){
                    mainFrame.setDisplayedGUIFile(file,false);
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
                        if(selectedNode.getLevel()==4){
                            ProfileVO group = 
                                (ProfileVO)selectedNode.
                                getUserObject();
                            mainFrame.selectProfilePoints(group.
                                    getElements());
                        }
                    }
                }
            }
            boolean isJob = node.getLevel()==JobsTreeModel.JOB_LEVEL;
            boolean isProfiles = (node.getLevel()==JobsTreeModel.PROFILES_LEVEL) && 
                (node.getUserObject().equals(profileNodeKey));
            // If selected node is a job or Profiles
            if(isJob || isProfiles) {
                DefaultMutableTreeNode profilesNode = null;
                //     Find the first profiles file
                if(isJob) {
                    if(node.getChildCount()>1){
                        profilesNode = mainFrame.getJobsTreeModel().getObjectTreeNode(node,profileNodeKey);
                    }
                } else {
                    profilesNode = node;
                }
                if(profilesNode!=null) {
                    //     If found one
                    if(profilesNode.getChildCount()>0){
                        DefaultMutableTreeNode fileNode = (DefaultMutableTreeNode) profilesNode.getFirstChild();
                        file = (GUIFileVO)((FileNodeUpdater)fileNode.
                                getUserObject()).
                                getUserObject();
                        //     Set the file as the displayed file
                        if(!file.equals(
                                mainFrame.getDisplayedGUIFile())){
                            mainFrame.setDisplayedGUIFile(file,true);
                        }
                    }
                }
            }
            // If selected node is Alignments or an alignment
            //     Do nothing
            // If the selected file has undoable operations, 
            // enable the undo menu item, else disable it.
            if(file != null){
                if(file.getUndoManager().getStackSize()==0){
                    mainFrame.getUndoMenuItem().
                        setEnabled(false);
                } else {
                    mainFrame.getUndoMenuItem().
                        setEnabled(true);
                }
            }
            mainFrame.resetEnablementStatus();
        } catch (InternalError ex) {
            Logger.logError(MainTreeSelectionManager.class,ex);
            mainFrame.showErrorMessage(Resourcer.getString(
                    MainTreeSelectionManager.class,
                    "error.internal.selectTreeNode"));
        }
    }
}
