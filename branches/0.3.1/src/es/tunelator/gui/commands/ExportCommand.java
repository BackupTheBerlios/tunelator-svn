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

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

import es.tunelator.UserMessageException;
import es.tunelator.gui.adv.DXF12FileFilter;
import es.tunelator.gui.adv.DXF12_2DFileFilter;
import es.tunelator.gui.adv.IspolFileFilter;
import es.tunelator.gui.adv.MDTFileFilter;
import es.tunelator.gui.adv.MainFrame;
import es.tunelator.gui.adv.ProwinFileFilter;
import es.tunelator.gui.vo.GUIFileVO;
import es.tunelator.plugins.transformers.SetIndexInProfile;
import es.tunelator.plugins.transformers.SetProfilePointsDateTime;
import es.tunelator.plugins.transformers.SortPKTeor;
import es.tunelator.plugins.transformers.TransformException;
import es.tunelator.plugins.writers.DXF12Writer;
import es.tunelator.plugins.writers.DXF12_2DWriter;
import es.tunelator.plugins.writers.IspolWriter;
import es.tunelator.plugins.writers.MDTWriter;
import es.tunelator.plugins.writers.ProWinWriter;
import es.tunelator.resources.Resourcer;
import es.tunelator.vo.PuntoVO;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * </p>
 * Execution of this command exports a file to another format.<br/>
 * This command can't be undone, and so, calling <code>undo</code> results in an
 * <code>IllegalStateException</code>
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class ExportCommand implements Command {
    /**
     * <code>frame</code> - The <code>MainFrame<code> upon which the command is
     *  executed
     */
    private MainFrame frame = null;
    /**
     * <code>guiFileVO</code> - The file that's exported
     */
    private GUIFileVO guiFileVO = null;
    /**
     * Creates a new command to be executed on the given <code>MainFrame</code>
     * @param frame
     */
    public ExportCommand(MainFrame frame, GUIFileVO guiFileVO){
        this.frame = frame;
        this.guiFileVO = guiFileVO;
    }
    /**
     * Allways returns <code>null</code>. This commands can't be undone to 
     * there's no need to have a name to save for them.
     * @see es.tunelator.gui.commands.Command#getName()
     */
    public String getName() {
        return null;
    }
    /**
     * Exports the file to another format in a file selected by the user. This 
     * implies:
     * <dir>
     * <li>Show a file choosing dialog to capture the path,name and format of 
     * the file to create</li>
     * <li>Check if the file already exists, alert the user and ask for 
     * confirmation</li>
     * <li>Inoke the writer class that's adecuate to the selected format</li>
     * </dir>
     * @see es.tunelator.gui.commands.Command#execute()
     */
    public void execute() throws UserMessageException {
        try {
		    if(guiFileVO == null)
		        return;
		    JFileChooser fileChooser = new JFileChooser();
		    fileChooser.setApproveButtonText(Resourcer.getString(
		            frame.getClass(),"exportDialog.button.export.label"));
		    fileChooser.setSelectedFile(guiFileVO.getFile());
		    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		    fileChooser.setDialogTitle(Resourcer.getString(frame.getClass(),
		            "exportDialog.title"));
		    fileChooser.setFileFilter(new IspolFileFilter());
		    fileChooser.setFileFilter(new MDTFileFilter());
		    fileChooser.setFileFilter(new ProwinFileFilter());
		    fileChooser.setFileFilter(new DXF12FileFilter());
		    fileChooser.setFileFilter(new DXF12_2DFileFilter());
		    int option = fileChooser.showDialog(frame,null);
		    if(option == JFileChooser.APPROVE_OPTION){
		        FileFilter fileType = fileChooser.getFileFilter();
		        File outputFile = fileChooser.getSelectedFile();
		        List data = new ArrayList();
		        if(outputFile.exists()){
		            int yesNoOption = JOptionPane.showConfirmDialog(frame,
		                    Resourcer.getString(null,"info.fileExists"),
		                    Resourcer.getString(null,"popup.infoTitle"),
		                    JOptionPane.YES_NO_OPTION);
		            if(yesNoOption == JOptionPane.NO_OPTION){
		                return;
		            }
		        }
		        List points = guiFileVO.getData();
		        Iterator it = points.iterator();
		        while(it.hasNext()){
		            PuntoVO point = (PuntoVO) it.next();
		            PuntoVO clone = (PuntoVO) point.clone();
		            data.add(clone);
		        } 
		        data = SortPKTeor.transform(data);
		        data = SetIndexInProfile.transform(data);
	            data = SetProfilePointsDateTime.transform(data);
		        if(fileType.getClass().equals(IspolFileFilter.class)){
		            IspolWriter.write(data,outputFile);
		        }
		        if(fileType.getClass().equals(MDTFileFilter.class)){
		            MDTWriter.write(data,outputFile);
		        }
		        if(fileType.getClass().equals(ProwinFileFilter.class)){
		            ProWinWriter.write(data,outputFile);
		        }
		        if(fileType.getClass().equals(DXF12FileFilter.class)){
		            DXF12Writer.write(data,outputFile);
		        }
		        if(fileType.getClass().equals(DXF12_2DFileFilter.class)){
		            DXF12_2DWriter.write(data,outputFile);
		        }
		    }
        } catch(TransformException e){
            throw new UserMessageException(Resourcer.getString(
                    frame.getClass(),"error.transform"));
        } catch (Exception e) {
            throw new UserMessageException(Resourcer.getString(
                    frame.getClass(),"error.fileWrite"));
        }
    }
    /**
     * It's illegal to call this method. Doing so results in an 
     * <code>IllegalStateException</code>
     * @see es.tunelator.gui.commands.Command#undo()
     */
    public void undo() throws UserMessageException {
        throw new IllegalStateException("Command can't be undone.");
    }
}
