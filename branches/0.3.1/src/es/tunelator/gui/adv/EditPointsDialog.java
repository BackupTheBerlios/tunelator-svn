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

import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.jgoodies.forms.builder.ButtonBarBuilder;
import com.jgoodies.forms.builder.PanelBuilder;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import es.tunelator.AppParameters;
import es.tunelator.gui.components.JFormatTextField;
import es.tunelator.gui.validators.DateValidator;
import es.tunelator.gui.validators.NumberValidator;
import es.tunelator.log.Logger;
import es.tunelator.resources.Resourcer;
import es.tunelator.vo.PuntoVO;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * Dialog to edit point data.<p/>
 * This dialog is used to capture de data of a point's attributes.
 *
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class EditPointsDialog extends JDialog {
	/**
	 * <code>JFormatTextField</code> for the ID
	 */
	private JFormatTextField jID = null;
	/**
	 * <code>JFormatTextField</code> for the Code
	 */
	private JFormatTextField jCode = null;
	/**
	 * <code>JFormatTextField</code> for the theoric PK
	 */
	private JFormatTextField jPKT = null;
	/**
	 * <code>JFormatTextField</code> for the real PK
	 */
	private JFormatTextField jPKA = null;
	/**
	 * <code>JFormatTextField</code> for the index in the profile
	 */
	private JFormatTextField jPKIndex = null;
	/**
	 * <code>JFormatTextField</code> for the X coordinate
	 */
	private JFormatTextField jX = null;
	/**
	 * <code>JFormatTextField</code> for the Y coordinate
	 */
	private JFormatTextField jY = null;
	/**
	 * <code>JFormatTextField</code> for the Z coordinate (height)
	 */
	private JFormatTextField jZ = null;
	/**
	 * <code>JFormatTextField</code> for the Z (height) increment
	 */
	private JFormatTextField jIncZ = null;
	/**
	 * <code>JFormatTextField</code> for the distance to the axis
	 */
	private JFormatTextField jDeje = null;
	/**
	 * <code>JFormatTextField</code> for the date of acquisition
	 */
	private JFormatTextField jDate = null;
	/**
	 * <code>JFormatTextField</code> for the time of acquisition
	 */
	private JFormatTextField jTime = null;
	/**
	 * The <code>FormLayout</code> to layout the components
	 */
	private FormLayout formLayout = null;
	/**
	 * The <code>JButton</code> to accept changes
	 */
	private JButton okButton = null;
	/**
	 * The <code>JButton</code> to cancel and close the dialog
	 */
	private JButton cancelButton = null;
	/**
	 * The <code>JPanel</code> where OK and Cancel buttons are placed
	 * to be horizontally centered toghether in the diagog.
	 */
	private JPanel buttonBarPanel = null;
	/**
	 * Saves the action used to close the dialog, either <code>CANCEL</code>
	 * or <code>ACCEPT</code>
	 */
	private int actionPerformed = -1;
	/**
	 * Dialog was closed with the Cancel button
	 */
	public static final int CANCEL = 0;
	/**
	 * Dialog was closed with the OK button
	 */
	public static final int ACCEPT = 1;
	/**
	 * <code>PuntoVO</code> from which attributes are taken to initialize
	 * the fields in the dialog and where values are saved before closing,
	 * to be recovered by the caller.
	 */
	private PuntoVO data = null;
	/**
	 * <code>ActionListener</code> implementators that listen for user actions
	 * performed on this dialog.
	 */
	private Vector listeners = null;
	/**
	 * Patterns used in <code>JFormatTextField</code> to validate integer values
	 */
	private String pintPatterns [] = {"\\d{1,7}"};
	/**
	 * Patterns used in <code>JFormatTextField</code> to validate date values
	 */
	private String datePatterns [] = {"\\d{1,2}",
	        						"\\d{1,2}\\.",
	        						"\\d{1,2}\\.\\d{1,2}",
	        						"\\d{1,2}\\.\\d{1,2}\\.",
	        						"\\d{1,2}\\.\\d{1,2}\\.\\d{1,4}"};
	/**
	 * Patterns used in <code>JFormatTextField</code> to validate time values
	 */
	private String timePatterns [] = {"\\d{1,2}","\\d{1,2}:",
	        						"\\d{1,2}:\\d{1,2}",
	        						"\\d{1,2}:\\d{1,2}:",
	        						"\\d{1,2}:\\d{1,2}:\\d{1,2}"};
	/**
	 * Patterns used in <code>JFormatTextField</code> to validate double values
	 */
	private String doublePatterns [] = {"-?",
	        							"-?\\d{1,7}",
	        							"-?\\d{1,7}\\.",
	        							"\\A-?\\d{1,7}(\\.\\d{1,3})?"};
    /**
     * <code>DecimalFormat</code> used to format double values
     */
	private DecimalFormat decimalFormat = null;
	/**
	 * <code>SimpleDateFormat</code> used to format date values
	 */
	private SimpleDateFormat dateFormat = null;
	/**
	 * <code>SimpleDateFormat</code> used to format time values
	 */
	private SimpleDateFormat timeFormat = null;
	/**
	 * If false, no empty values are accepted as valid.
	 */
	private boolean allowEmptyValues = false;
	/**
	 * <code>JSplitPane</code> to create the side bar for the HTML help
	 */
	private JSplitPane jSplitPane = null;
	/**
	 * <code>JTextPane</code> to hold the HTML help
	 */
	private JTextPane jTextPane = null;
	/**
	 * The <code>JPanel</code> that contains the fields and buttons
	 */
	private JPanel jPanel = null;
	/**
	 * The HTML text. Empty if the resource si not found.
	 */
	private static String helpText = "<html><head></head><body><p></p>"+
                                     "</body></html>";
	/**
	 * <code>ErrorListener</code> implementators that listen for errors
	 * occurred in this dialog. Used to relay error management.
	 */
	private Vector errorListeners = new Vector();
	
    /**
     * Calls <code>JDialog(Frame)</code> and initializes the dialog.
     * @param owner Parent <code>JFrame</code> 
     * @param allowEmptyValues If false all fields must have a non-empty value
     * @throws java.awt.HeadlessException
     * @see JDialog#JDialog(java.awt.Frame)
     */
    public EditPointsDialog(Frame owner,boolean allowEmptyValues) throws HeadlessException {
        super(owner);
        this.allowEmptyValues = allowEmptyValues;
        initialize();
    }
    /**
     * Initializes the size, title, resizable and default close operation.<p/>
     * Centers the dialog on its owner <code>JFrame</code>
     * @see javax.swing.JDialog#dialogInit()
     */
    protected void dialogInit() {
        super.dialogInit();
		setSize(599, 340);
		setTitle(Resourcer.getString(this.getClass(),"title"));
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(this.getOwner());
    }
	/**
	 * Add a listener to this class's errors
	 * @param listener
	 */
	public void addErrorListener(ErrorListener listener){
	    errorListeners.add(listener);
	}
	/**
	 * Remove a listener of this class's errors
	 * @param listener
	 */
	public void removeErrorListener(ErrorListener listener){
	    errorListeners.remove(listener);
	}
	/**
	 * Notify all listeners that an error has occurred
	 * @param msg
	 */
	public void fireError(String msg){
	    Iterator it = errorListeners.iterator();
	    while(it.hasNext()){
	        ErrorListener listener = (ErrorListener)it.next();
	        listener.respondToError(this,msg);
	    }
	}
	/**
	 * Initializes the dialog creating the list of acton listeners
	 * and invoking <code>getJSplitPane()</code> for the rest of the 
	 * creation process.
	 */
	private void initialize() {
	    listeners = new Vector();
		setContentPane(getJSplitPane());
	}
	/**
	 * Add a listener to the actions performed by this dialog
	 * @param listener
	 */
	public void addActionListener(ActionListener listener) {
	    listeners.add(listener);
	}
	/**
	 * Remove a listener to the actions performed by this dialog
	 * @param listener
	 */
	public void removeActionListener(ActionListener listener) {
	    listeners.remove(listener);
	}
	/**
	 * Notify all listeners that an action has been performed by this dialog
	 * @param event
	 */
	private void fireActionPerformed(ActionEvent event) {
	    Iterator it = listeners.iterator();
	    while(it.hasNext()){
	        ActionListener listener = (ActionListener) it.next();
	        listener.actionPerformed(event);
	    }
	}
	/**
	 * @return The layout of the panel in a <code>FormLayout</code>
	 * @see FormLayout
	 */
	public FormLayout getFormLayout() {
	    if(formLayout == null){
			formLayout = new FormLayout(
			        "5dlu,right:max(10dlu;p),3dlu,50dlu,3dlu,right:pref,3dlu,"+
			        "50dlu,5dlu,right:max(5dlu;p),3dlu,50dlu",  // columns
			        "pref,3dlu,pref,3dlu,pref,3dlu,pref,5dlu,pref,3dlu,pref,"+
			        "5dlu,pref,3dlu,pref,5dlu,pref,3dlu,pref,3dlu,pref");  //rows
	    }
	    return formLayout;
	}
    /**
     * @return Returns the cancelButton.
     */
    public JButton getCancelButton() {
        if(cancelButton == null){
            cancelButton = new JButton(Resourcer.getString(null,"button.cancel.text"));
            cancelButton.addActionListener(new java.awt.event.ActionListener(){
				public void actionPerformed(java.awt.event.ActionEvent e) {
				    actionPerformed = CANCEL;
				    data = null;
				    EditPointsDialog.this.fireActionPerformed(e);
				    EditPointsDialog.this.setVisible(false);
				}
            });
        }
        return cancelButton;
    }
    /**
     * Checks if the data in the dialog if valid to allow the ACCEPT
     * action to be performed.
     * The only required validation is that all fields are not empty
     * if empty values are not allowed. The format and data type validation
     * of each field is enforced by <code>JFormatTextField</code>
     * @param data The <code>PuntoVO</code> to verify
     * @return <code>true</code> if empty values area allowed or all
     * attributes have non-empty value.
     */
    private boolean isValid(PuntoVO data){
        if(data.getDate().trim().length()==0 && !allowEmptyValues)
            return false;
        if(data.getDeje().trim().length()==0 && !allowEmptyValues)
            return false;
        if(data.getHeight().trim().length()==0 && !allowEmptyValues)
            return false;
        if(data.getHeightInc().trim().length()==0 && !allowEmptyValues)
            return false;
        if(data.getPkAct().trim().length()==0 && !allowEmptyValues)
            return false;
        if(data.getPkTeor().trim().length()==0 && !allowEmptyValues)
            return false;
        if(data.getIndexInPK().trim().length()==0 && !allowEmptyValues)
            return false;
        if(data.getPointID().trim().length()==0 && !allowEmptyValues)
            return false;
        if(data.getTime().trim().length()==0 && !allowEmptyValues)
            return false;
        if(data.getXCoord().trim().length()==0 && !allowEmptyValues)
            return false;
        if(data.getYCoord().trim().length()==0 && !allowEmptyValues)
            return false;
        return true;
    }
    /**
     * Takes the label from the "button.accept.text" property of this class's
     * resource bundle.
     * @return Returns the okButton.
     */
    public JButton getOkButton() {
        if(okButton == null) {
            okButton = new JButton(Resourcer.getString(null,
                    "button.accept.text"));
            okButton.addActionListener(new java.awt.event.ActionListener() { 
            	public void actionPerformed(java.awt.event.ActionEvent e) {
                    try {
	            	    data = new PuntoVO();
	            	    data.setCode(getJCode(true).getText());
	            	    data.setDate(getJDate(EditPointsDialog.this.
	            	            allowEmptyValues).getText());
	            	    data.setDeje(getJDeje(EditPointsDialog.this.
	            	            allowEmptyValues).getText());
	            	    data.setHeight(getJZ(EditPointsDialog.this.
	            	            allowEmptyValues).getText());
	            	    data.setHeightInc(getJIncZ(EditPointsDialog.this.
	            	            allowEmptyValues).getText());
	            	    data.setPkAct(getJPKA(EditPointsDialog.this.
	            	            allowEmptyValues).getText());
	            	    data.setPkTeor(getJPKT(EditPointsDialog.this.
	            	            allowEmptyValues).getText());
	            	    data.setIndexInPK(getJPKIndex(EditPointsDialog.this.
	            	            allowEmptyValues).getText());
	            	    data.setPointID(getJID(EditPointsDialog.this.
	            	            allowEmptyValues).getText());
	            	    data.setTime(getJTime(EditPointsDialog.this.
	            	            allowEmptyValues).getText());
	            	    data.setXCoord(getJX(EditPointsDialog.this.
	            	            allowEmptyValues).getText());
	            	    data.setYCoord(getJY(EditPointsDialog.this.
	            	            allowEmptyValues).getText());
	            	    if(isValid(data)){
		            	    actionPerformed = ACCEPT;
						    EditPointsDialog.this.fireActionPerformed(e);
		            	    EditPointsDialog.this.dispose();
	            	    }
	        	    } catch (Exception ex) {
	        	        Logger.logError(this.getClass(),"Error at EditPointsDialog OK Action",ex);
	        	        ((MainFrame)EditPointsDialog.this.getOwner()). // TODO: Relay errors to the main frame
	        	        	showGenericErrorMessage(ex);
	        	    }
            	}
            });
        }
        return okButton;
    }
    /**
     * @return Returns the jCode.
     */
    public JFormatTextField getJCode(boolean allowEmpty) {
        if(jCode == null){
            jCode = new JFormatTextField(pintPatterns,allowEmpty);
        }
        return jCode;
    }
    /**
     * A <code>NumberValidator</code> validator is set with a "######0.0##" 
     * format and "." as decimal separator.
     * @return The axis distance <code>JFormatTextField</code>
     * with the <code>doublePatterns</code> double patterns.
     */
    public JFormatTextField getJDeje(boolean allowEmpty) {
        if(jDeje == null){
            jDeje = new JFormatTextField(doublePatterns,allowEmpty);
            jDeje.setValidator(new NumberValidator("######0.0##",'.',
                    				allowEmpty));
            jDeje.setFormat(getDecimalFormat());
        }
        return jDeje;
    }
    /**
     * @return The ID <code>JFormatTextField</code> with the
     * <code>pintPatterns</code> positive integer patterns.
     */
    public JFormatTextField getJID(boolean allowEmpty) {
        if(jID == null){
            jID = new JFormatTextField(pintPatterns,allowEmpty);
        }
        return jID;
    }
    /**
     * A <code>NumberValidator</code> validator is set with a "######0.0##" 
     * format and "." as decimal separator.
     * @return The Z (height) increment <code>JFormatTextField</code>
     * with the <code>doublePatterns</code> double patterns.
     */
    public JTextField getJIncZ(boolean allowEmpty) {
        if(jIncZ == null){
            jIncZ  = new JFormatTextField(doublePatterns,allowEmpty);
            jIncZ.setValidator(new NumberValidator("######0.0##",'.',
                    				allowEmpty));
            jIncZ.setFormat(getDecimalFormat());
        }
        return jIncZ;
    }
    /**
     * A <code>NumberValidator</code> validator is set with a "######0.0##" 
     * format and "." as decimal separator.
     * @return The real PK <code>JFormatTextField</code>
     * with the <code>doublePatterns</code> double patterns.
     */
    public JTextField getJPKA(boolean allowEmpty) {
        if (jPKA == null){
            jPKA  = new JFormatTextField(doublePatterns,allowEmpty);
            jPKA.setValidator(new NumberValidator("######0.0##",'.',allowEmpty));
            jPKA.setFormat(getDecimalFormat());
        }
        return jPKA;
    }
    /**
     * Returns the text field for the theorick PK.
     * A <code>NumberValidator</code> validator is set with a "######0.0##" 
     * format and "." as decimal separator.
     * @param allowEmpty - True if the field accepts an empty value
     * @return The theoric PK <code>JFormatTextField</code>
     * with the <code>doublePatterns</code> double patterns.
     */
    public JTextField getJPKT(boolean allowEmpty) {
        if(jPKT == null){
            jPKT  = new JFormatTextField(doublePatterns,allowEmpty);
            jPKT.setValidator(new NumberValidator("######0.0##",'.',allowEmpty));
            jPKT.setFormat(getDecimalFormat());
        }
        return jPKT;
    }
    /**
     * Returns the text field for the position index in the profile.
     * @param allowEmpty - True if the field accepts an empty value
     * @return The inden in profile <code>JFormatTextField</code>
     * with the <code>integerPatterns</code> positive integer patterns.
     */
    public JTextField getJPKIndex(boolean allowEmpty) {
        if(jPKIndex == null){
            jPKIndex = new JFormatTextField(pintPatterns,allowEmpty);
        }
        return jPKIndex;
    }
    /**
     * A <code>NumberValidator</code> validator is set with a "######0.0##" 
     * format and "." as decimal separator.
     * @return The X coordinate <code>JFormatTextField</code>
     * with the <code>doublePatterns</code> double patterns.
     */
    public JTextField getJX(boolean allowEmpty) {
        if(jX == null){
            jX  = new JFormatTextField(doublePatterns,allowEmpty);
            jX.setValidator(new NumberValidator("######0.0##",'.',allowEmpty));
            jX.setFormat(getDecimalFormat());
        }
        return jX;
    }
    /**
     * A <code>NumberValidator</code> validator is set with a "######0.0##" 
     * format and "." as decimal separator.
     * @return The Y coordinate <code>JFormatTextField</code>
     * with the <code>doublePatterns</code> double patterns.
     */
    public JTextField getJY(boolean allowEmpty) {
        if(jY == null){
            jY  = new JFormatTextField(doublePatterns,allowEmpty);
            jY.setValidator(new NumberValidator("######0.0##",'.',allowEmpty));
            jY.setFormat(getDecimalFormat());
        }
        return jY;
    }
    /**
     * A <code>NumberValidator</code> validator is set with a "######0.0##" 
     * format and "." as decimal separator.
     * @return The Z coordinate <code>JFormatTextField</code>
     * with the <code>doublePatterns</code> double patterns.
     */
    public JTextField getJZ(boolean allowEmpty) {
        if(jZ == null){
            jZ  = new JFormatTextField(doublePatterns,allowEmpty);
            jZ.setValidator(new NumberValidator("######0.0##",'.',allowEmpty));
            jZ.setFormat(getDecimalFormat());
        }
        return jZ;
    }
    /**
     * @return A <code>DecimalFormat</code> with the "######0.000· pattern
     * and "." as decimal separator
     * @see DecimalFormat
     */
    public DecimalFormat getDecimalFormat(){
        if(decimalFormat == null){
            decimalFormat = (DecimalFormat) DecimalFormat.getInstance();
			DecimalFormatSymbols symbols = new DecimalFormatSymbols();
			symbols.setDecimalSeparator('.');
			decimalFormat.setDecimalFormatSymbols(symbols);
			decimalFormat.applyPattern("######0.000");
        }
        return decimalFormat;
    }
    /**
     * @return A <code>SimpleDateFormat</code> for the "HH:mm:ss" pattern.
     * @see SimpleDateFormat
     */
    public SimpleDateFormat getTimeFormat() {
        if(timeFormat == null){
            timeFormat = new SimpleDateFormat("HH:mm:ss");
        }
        return timeFormat;
    }
    /**
     * A <code>DateValidator</code> validator is set with a "dd.MM.yyyy" format 
     * @return The Date <code>JFormatTextField</code>
     * with the <code>datePatterns</code> date/time patterns.
     * @see DateValidator
     */
    public JTextField getJDate(boolean allowEmpty) {
        if(jDate == null){
			jDate = new JFormatTextField(datePatterns,allowEmpty);
			jDate.setValidator(new DateValidator("dd.MM.yyyy",allowEmpty));
			jDate.setFormat(getDateFormat());
        }
        return jDate;
    }
    /**
     * The format applied is "dd.MM.yyyy"
     * @return The <code>SimpleDateFormat</code> used to format Date values when
     * the focus leaves a date <code>JFormatTextField</code>
     */
    public SimpleDateFormat getDateFormat() {
        if(dateFormat == null){
            dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        }
        return dateFormat;
    }
    /**
     * The format applied is "HH:mm:ss"
     * @return The <code>SimpleDateFormat</code> used to format Time values when
     * the focus leaves a time <code>JFormatTextField</code>
     */
    public JTextField getJTime(boolean allowEmpty) {
        if(jTime == null){
            jTime = new JFormatTextField(timePatterns,allowEmpty);
            jTime.setValidator(new DateValidator("HH:mm:ss",allowEmpty));
            jTime.setFormat(getTimeFormat());
        }
        return jTime;
    }
    /**
     * @return A <code>PuntoVO</code> containing the values in the dialog.
     */
    public PuntoVO getData() {
        return data;
    }
    /**
     * Sets the data of the received <code>PuntoVO</code> in the dialog.
     * @param data The data to set into the dialog's fields
     */
    public void setData(PuntoVO data) {
        if(data == null) {
            this.data = new PuntoVO();
        } else {
            this.data = data;
        }
        if(data.getPointID() !=  null){
            getJID(allowEmptyValues).setText(data.getPointID());
        }
        if(data.getCode() !=  null){
            getJCode(true).setText(data.getCode());
        }
        if(data.getIndexInPK() !=  null){
            this.getJPKIndex(allowEmptyValues).setText(data.getIndexInPK());
        }
        if(data.getPkTeor() !=  null){
            this.getJPKT(allowEmptyValues).setText(data.getPkTeor());
        }
        if(data.getPkAct() !=  null){
            this.getJPKA(allowEmptyValues).setText(data.getPkAct());
        }
        if(data.getDate() !=  null){
            getJDate(allowEmptyValues).setText(data.getDate());
        }
        if(data.getTime()!=null) {
            getJTime(allowEmptyValues).setText(data.getTime());
        }
        if(data.getDeje() != null){
            getJDeje(allowEmptyValues).setText(data.getDeje());
        }
        if(data.getXCoord()!=null){
            getJX(allowEmptyValues).setText(data.getXCoord());
        }
        if(data.getYCoord()!=null){
            getJY(allowEmptyValues).setText(data.getYCoord());
        }
        if(data.getHeight()!=null){
            this.getJZ(allowEmptyValues).setText(data.getHeight());
        }
        if(data.getHeightInc()!=null){
            getJIncZ(allowEmptyValues).setText(data.getHeightInc());
        }
    }
    /**
     * @return Returns the actionPerformed.
     */
    public int getActionPerformed() {
        return actionPerformed;
    }
    /**
     * @return Returns the allowEmptyValues.
     */
    public boolean isAllowEmptyValues() {
        return allowEmptyValues;
    }
    /**
     * @param allowEmptyValues The allowEmptyValues to set.
     */
    public void setAllowEmptyValues(boolean allowEmptyValues) {
        this.allowEmptyValues = allowEmptyValues;
    }
	/**
	 * Initializes jSplitPane by creating the HTML help panel and
	 * the data fields panel.
	 * 	
	 * @return javax.swing.JSplitPane	
	 */    
	private JSplitPane getJSplitPane() {
		if (jSplitPane == null) {
			jSplitPane = new JSplitPane();
			jSplitPane.setLeftComponent(getJTextPane());
			jSplitPane.setDividerSize(2);
			jSplitPane.setRightComponent(getJPanel());
		}
		return jSplitPane;
	}
	/**
	 * Returns a <code>JTextPane</code> loaded with the HTML file specified 
	 * by the "helpFile" property of this class's resource bundle.
	 * 	
	 * @return The <code>JTextPane</code> that shows the HTML help
	 */    
	private JTextPane getJTextPane() {
		if (jTextPane == null) {
			jTextPane = new JTextPane();
			jTextPane.setContentType("text/html");
			jTextPane.setEditable(false);
			jTextPane.setAutoscrolls(true);
			jTextPane.setFocusable(false);
			jTextPane.setMargin(new Insets(0,0,0,0));
			String fileName = Resourcer.getString(this.getClass(),"helpFile");
			try {
			    String filePathStr = AppParameters.getParams().
			    			getProperty(AppParameters.HELP_PATH)+"/"+fileName;
			    File f = new File(filePathStr);
			    jTextPane.setPage(f.toURL());
			} catch (IOException e){
			    jTextPane.setText(helpText);
			}
		}
		return jTextPane;
	}
	/**
	 * The following properties from this class's resource bundle are used
	 * as labels to the different data fields:
	 * <dir>
	 * <li>measurement (separator)</code>
	 * <li>date</li>
	 * <li>time</li>
	 * <li>identification (separator)</li>
	 * <li>pointId</li>
	 * <li>code</li>
	 * <li>profile (separator)</li>
	 * <li>theoricPK</li>
	 * <li>realPK</li>
	 * <li>indexPK</li>
	 * <li>coordinates (separator)</li>
	 * <li>xCoord</li>
	 * <li>yCoord</li>
	 * <li>zCoord</li>
	 * <li>calcs (separator)</li>
	 * <li>heightInc</li>
	 * <li>axisDistance</li>
	 * </dir>
	 * @return The <code>JPanel</code> that contains the data fields 
	 * and button bar
	 */    
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
			PanelBuilder builder = new PanelBuilder(getFormLayout());
			builder.setDefaultDialogBorder();
			CellConstraints cc = new CellConstraints();
			builder.addSeparator(Resourcer.getString(this.getClass(),
			        "measurement"),cc.xyw(1,1,12));
			builder.addLabel(Resourcer.getString(this.getClass(),
			        "date"),cc.xy(2,3));
			builder.add(getJDate(allowEmptyValues),cc.xy(4,3));
			builder.addLabel(Resourcer.getString(this.getClass(),
			        "time"),cc.xy(6,3));
			builder.add(getJTime(allowEmptyValues),cc.xy(8,3));
			builder.addSeparator(Resourcer.getString(this.getClass(),
			        "identification"),cc.xyw(1,5,12));
			builder.addLabel(Resourcer.getString(this.getClass(),
			        "pointId"),cc.xy(2,7));
			builder.add(getJID(allowEmptyValues),cc.xy(4,7));
			builder.addLabel(Resourcer.getString(this.getClass(),
			        "code"),cc.xy(6,7));
			builder.add(getJCode(true),cc.xy(8,7));
			builder.addSeparator(Resourcer.getString(this.getClass(),
			        "profile"),cc.xyw(1,9,12));
			builder.addLabel(Resourcer.getString(this.getClass(),
			        "theoricPK"),cc.xy(2,11));
			builder.add(getJPKT(allowEmptyValues),cc.xy(4,11));
			builder.addLabel(Resourcer.getString(this.getClass(),
			        "realPK"),cc.xy(6,11));
			builder.add(getJPKA(allowEmptyValues),cc.xy(8,11));
			builder.addLabel(Resourcer.getString(this.getClass(),
					"indexPK"),cc.xy(10,11));
			builder.add(getJPKIndex(allowEmptyValues),cc.xy(12,11));
			builder.addSeparator(Resourcer.getString(this.getClass(),
			        "coordinates"),cc.xyw(1,13,12));
			builder.addLabel(Resourcer.getString(this.getClass(),
			        "xCoord"),cc.xy(2,15));
			builder.add(getJX(allowEmptyValues),cc.xy(4,15));
			builder.addLabel(Resourcer.getString(this.getClass(),
			        "yCoord"),cc.xy(6,15));
			builder.add(getJY(allowEmptyValues),cc.xy(8,15));
			builder.addLabel(Resourcer.getString(this.getClass(),
			        "zCoord"),cc.xy(10,15));
			builder.add(getJZ(allowEmptyValues),cc.xy(12,15));
			builder.addSeparator(Resourcer.getString(this.getClass(),
			        "calcs"),cc.xyw(1,17,12));
			builder.addLabel(Resourcer.getString(this.getClass(),
			        "heightInc"),cc.xy(2,19));
			builder.add(getJIncZ(allowEmptyValues),cc.xy(4,19));
			builder.addLabel(Resourcer.getString(this.getClass(),
			        "axisDistance"),cc.xy(6,19));
			builder.add(getJDeje(allowEmptyValues),cc.xy(8,19));
			builder.add(getButtonBarPanel(),cc.xyw(1,21,12,
			        CellConstraints.CENTER,CellConstraints.CENTER));
			
			jPanel.add(builder.getPanel());
		}
		return jPanel;
	}
    /**
     * @return Returns the panel that contains the action buttons
     */
    public JPanel getButtonBarPanel() {
        if(buttonBarPanel == null){
			ButtonBarBuilder bbb = new ButtonBarBuilder();
			bbb.setDefaultButtonBarGapBorder();
			bbb.setAlignment(CellConstraints.CENTER,CellConstraints.CENTER);
			JButton buttons [] = {getOkButton(),getCancelButton()}; 
			bbb.addGriddedButtons(buttons);
			buttonBarPanel = bbb.getPanel();
        }
        return buttonBarPanel;
    }
}  //  @jve:decl-index=0:visual-constraint="10,10"
