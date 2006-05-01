/*
 * Created on 09-may-2005
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

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import es.tunelator.AppParameters;
import es.tunelator.resources.Resourcer;
/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * Dialog that shows an HTML content.<p/>
 * It is used as a online help or about dialog.
 *
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class HTMLDialog extends JDialog {

	private JPanel jPanel = null;
	private JTextPane jTextPane = null;
	private String filePath = null;
	private JScrollPane jScrollPane = null;
	/**
	 * This method initializes 
	 * 
	 */
	public HTMLDialog() {
		super();
		initialize();
	}
	/**
	 * This method initializes 
	 * 
	 */
	public HTMLDialog(String filePath) {
		super();
		this.filePath = filePath;
		initialize();
	}
	/**
	 * This method initializes 
	 * 
	 */
	public HTMLDialog(Frame parent) {
		super(parent);
		initialize();
	}
	/**
	 * This method initializes 
	 * 
	 */
	public HTMLDialog(Frame parent,String filePath) {
		super(parent);
		this.filePath = filePath;
		initialize();
	}
	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
        this.setModal(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setContentPane(getJPanel());
		this.setTitle("Acerca de Tunelator 0.3.0");
		this.setSize(new Dimension(340,475));
		this.setLocationRelativeTo(this.getOwner());
	}
	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel() {
		if (jPanel == null) {
		    GridLayout gridLayout1 = new GridLayout();
			jPanel = new JPanel();
			jPanel.setLayout(gridLayout1);
			gridLayout1.setRows(1);
			gridLayout1.setColumns(1);
			gridLayout1.setHgap(1);
			gridLayout1.setVgap(1);
			jPanel.add(getJScrollPane(), null);
		}
		return jPanel;
	}
	/**
	 * This method initializes jTextArea	
	 * 	
	 * @return javax.swing.JTextArea	
	 */    
	private JTextPane getJTextPane() {
		if (jTextPane == null) {
		    String filePathStr = this.filePath; 
		    jTextPane = new JTextPane();
			jTextPane.setContentType("text/html");
			jTextPane.setEditable(false);
			jTextPane.setAutoscrolls(true);
			jTextPane.setFocusable(false);
			jTextPane.setMargin(new Insets(0,0,0,0));
			if(filePath == null){
				String fileName = Resourcer.getString(this.getClass(),"htmlFile");
			    filePathStr = AppParameters.getParams().
			    	getProperty(AppParameters.HELP_PATH)+"/"+fileName;
			}
			try {
			    File f = new File(filePathStr);
			    jTextPane.setPage(f.toURL());
//			    jTextPane.setPreferredSize(new java.awt.Dimension(324,284));
			} catch (IOException e){
			    jTextPane.setText("<html><head></head><body><p><h1>Content not found</h1></p>"+
			            "</body></html>");
			}
		}
		return jTextPane;
	}
	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */    
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getJTextPane());
		}
		return jScrollPane;
	}
   }
