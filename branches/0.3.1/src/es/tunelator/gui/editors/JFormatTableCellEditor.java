/*
 * Created on 03-may-2005
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
package es.tunelator.gui.editors;

import java.awt.Component;
import java.awt.Toolkit;
import java.util.EventObject;
import java.util.regex.Pattern;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.EventListenerList;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;

import es.tunelator.gui.renderers.JFormatTableRenderer;
import es.tunelator.gui.validators.StringValidator;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * This editor for table cells accepts an array of format strings and
 * an optional StringValidator to control the format and validity of the data
 * while the user is editing the cell.<br/>
 * Modifications of the value are only accepted if the resulting value
 * matches with one of the patterns in the array. This allows to provide
 * not only the pattern of the valid complete value, but also of the 
 * intermediate string values it may have while the cell is being edited.
 * For example a double value accepting negatives, is invalid when only
 * the minus sign is entered, or when the decimal separator is the last
 * character.<br/>
 * Also, if the matched pattern is the last one in the array, the value
 * of the field after the mofification is verified for validity using 
 * the StringValidator if it has been asigned. Else this verification is
 * omitted and fields can take invalid values as long as they match the 
 * format; for example a date of 31.11.2005.<br/>
 *
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class JFormatTableCellEditor extends JTextField implements
        TableCellEditor {
    protected EventListenerList listenerList = new EventListenerList();
    protected ChangeEvent changeEvent = new ChangeEvent(this);
    String patterns[];
    Pattern compiled[];
    StringValidator validator = null;
    int matchedPatternIndex = -1;
    TableCellRenderer renderer = null;
    boolean allowEmpty = true;
    /**
     * @return Returns the patterns.
     */
    public final String[] getPatterns() {
        return patterns;
    }
    /**
     * @param patterns The patterns to set.
     */
    public final void setPatterns(String[] patterns) {
        this.patterns = patterns;
        compiled = new Pattern[patterns.length];
        for (int i=0;i<patterns.length;i++){
            compiled[i]=Pattern.compile(patterns[i]);
        }
    }
    /**
     * Initialices the editor with the array of patterns.
     * The last value in the array has to be the one that matches
     * a complete value of the cell, if a StringValidator is used.
     * 
     * @param patterns
     */
    public JFormatTableCellEditor(String[] patterns, boolean allowEmpty) {
        setPatterns(patterns);
        this.allowEmpty = allowEmpty;
    }
    /**
     * Initialices the editor with no array of patterns.
     * It is unusable until <code>setPatterns<code> is used.
     * @param allowEmpty If false, an empty value es considered invalid 
     * (which is not usually desirable because it preempts deleting all 
     * the contents)
     */
    public JFormatTableCellEditor(boolean allowEmpty) {
        this.allowEmpty = allowEmpty;
    }
    /**
     * Allows to invoke <code>matchesPatterns(StringBuffer)</code> with a
     *  String parameter.
     * 
     * @param str String that's checked against the patterns
     * @return true if the string matches any of the patterns
     */
    private boolean matchesPatterns(String str){
        return matchesPatterns(new StringBuffer(str));
    }
    /**
     * Checks to see if the value contained in the SringBuffer matches
     * one of the patterns.<br/>
     * If a match is found the matchedPatternIndex attribute is asigned
     * the index of the position of the matching pattern in the array of
     * patterns. Else this attribute gets value -1.
     * 
     * @param str The <code>StringBuffer</code> that contains the value that's
     * checked against the patterns.
     * @return true if a match is found, false otherwise
     */
    private boolean matchesPatterns(StringBuffer str){
        for(int i=0;i<compiled.length;i++){
            if(compiled[i].matcher(str).matches()){
                matchedPatternIndex = i;
                return true;
            }
        }
        matchedPatternIndex = -1;
        return false;
    }
    /**
     * If the column has a <code>JTableFormatRenderer</code>, it is used to set
     * the value of the cell, so it is saved in the model in the proper format.
     * 
     * @see javax.swing.table.TableCellEditor#
     * getTableCellEditorComponent(javax.swing.JTable, java.lang.Object,
     *  boolean, int, int)
     */
    public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {
        renderer = table.getColumnModel().getColumn(column).getCellRenderer();
        if(renderer!=null){
	        Component cmp = renderer.getTableCellRendererComponent(table,value,
                    isSelected,true,row,column);
	        if((cmp != null) && cmp.getClass().equals(JFormatTableRenderer.class)){
	            this.setText(((JFormatTableRenderer)cmp).getText());
	            return this;
	        }
        }
        this.setText(value.toString());
        return this;
    }
    /**
     * Invokes the editingStopped method in each registered listener
     */
    protected void fireEditingStopped() {
	    CellEditorListener listener;
	    Object[] listeners = listenerList.getListenerList();
	    for (int i = 0; i < listeners.length; i++) {
			if (listeners[i] == CellEditorListener.class) {
				listener = (CellEditorListener) listeners[i + 1];
				listener.editingStopped(changeEvent);
			} 
	    } 
	} 
	/**
     * Invokes the editingCanceled method in each registered listener
	 */
	protected void fireEditingCanceled() {
	  CellEditorListener listener;
	  Object[] listeners = listenerList.getListenerList();
	  for (int i = 0; i < listeners.length; i++) {
	    if (listeners[i] == CellEditorListener.class) {
	      listener = (CellEditorListener) listeners[i + 1];
	      listener.editingCanceled(changeEvent);
	    } 
	  } 
	} 
    /**
     * Invokes <code>fireEditingCanceled</code>
     * 
     * @see javax.swing.CellEditor#cancelCellEditing()
     */
    public void cancelCellEditing() {
        this.fireEditingCanceled();
    }
    /**
     * If there's a validator it is used to verify the value of the cell.
     * If the value is not valid <code>fireEditingCanceled</code> is invoked
     * so the value returns to the one before the editing.<br/>
     * If the value is valid or if there's no validator, 
     * <code>fireEditingStopped()</code>
     * is invoked.
     * 
     * @see javax.swing.CellEditor#stopCellEditing()
     */
    public boolean stopCellEditing() {
        if(this.getText().trim().length()==0 && !allowEmpty){
            Toolkit.getDefaultToolkit().beep();
            this.cancelCellEditing();
            return true;
        }
        if(validator != null){
            if(!validator.isValid(this.getText())) {
                Toolkit.getDefaultToolkit().beep();
                this.cancelCellEditing();
                return true;
            }
        }
        this.fireEditingStopped();
        return true;
    }
    /**
     * Returns the text using <code>getText<code>
     * 
     * @see javax.swing.CellEditor#getCellEditorValue()
     */
    public Object getCellEditorValue() {
        return this.getText();
    }
    /**
     * Allways returns true. All cells are editable.
     * 
     * @see javax.swing.CellEditor#isCellEditable(java.util.EventObject)
     * @return true
     */
    public boolean isCellEditable(EventObject anEvent) {
        return true;
    }
    /**
     * Allways returns true.
     * 
     * @see javax.swing.CellEditor#shouldSelectCell(java.util.EventObject)
     * @return true
     */
    public boolean shouldSelectCell(EventObject anEvent) {
        return true;
    }
    /**
     * Adds a listener of the events fired by this editor.
     * 
     * @see javax.swing.CellEditor#
     * addCellEditorListener(javax.swing.event.CellEditorListener)
     */
    public void addCellEditorListener(CellEditorListener listener) {
        listenerList.add(CellEditorListener.class, listener);
    }
    /**
     * Removes a listener of the events fired by this editor.
     * 
     * @see javax.swing.CellEditor#
     * removeCellEditorListener(javax.swing.event.CellEditorListener)
     */
    public void removeCellEditorListener(CellEditorListener listener) {
        listenerList.remove(CellEditorListener.class, listener);
    }
    /**
     * Returns the document model used to verify the format of
     * the value while it is being edited.
     * 
     * @see javax.swing.JTextField#createDefaultModel()
     * @return FieldDocument
     */
    protected Document createDefaultModel() {
        FieldDocument fieldDocument = new FieldDocument();
        return fieldDocument;
    }
    /**
     * @return Returns the validator.
     */
    public final StringValidator getValidator() {
        return validator;
    }
    /**
     * @param validator The validator to set.
     */
    public final void setValidator(StringValidator validator) {
        this.validator = validator;
    }
    /**
     * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
     * 
     * This model checks each modification in the value of the cell before
     * it is taken to its value. The resulting value has to match one of
     * the patterns and if a StringValidator exists and the match is with
     * the last pattern, it also has to be valid.<br>
     * If this conditions are not fulfilled, the modification is not done and
     * a beep sound is emitted.
     * 
     * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
     *
     */
    protected class FieldDocument
      extends PlainDocument {
        /**
         * Is invoked when part of the text is removed.
         * Verifies if the resulting text complies with one of the format
         * patterns. If it doesn't, the value is not changed and a sound is 
         * emitted.
         * 
         * @see javax.swing.text.Document#remove(int, int)
         */
        public void remove(int offs, int len) throws BadLocationException {
            StringBuffer stringBuffer = new StringBuffer(JFormatTableCellEditor.
                    this.getText());
            stringBuffer.delete(offs, offs + len);
			if(stringBuffer.length()>0){
			    String text = stringBuffer.toString();
				if(!JFormatTableCellEditor.this.matchesPatterns(text)){
                    Toolkit.getDefaultToolkit().beep();
                    return;
                }
				if(matchedPatternIndex==patterns.length-1){
				    if(validator!=null){
				        if(!validator.isValid(text)){
		                    Toolkit.getDefaultToolkit().beep();
				        	return;
				        }
				    }
				}
            }
			super.remove(offs, len);
        }
        /**
         * Is invoked when text is inserted.
         * Verifies if the resulting text complies with one of the format
         * patterns. If it doesn't, the value is not changed and a sound is 
         * emitted.
         * 
         * @see javax.swing.text.Document#insertString(int, java.lang.String,
         *  javax.swing.text.AttributeSet)
         */
        public void insertString(int offs, String text, AttributeSet a) throws
        BadLocationException {
            String str = text;
			if (str == null) {
			    return;
			}
			if (str.length() > 0) {
			    StringBuffer stringBuffer = 
                    new StringBuffer(JFormatTableCellEditor.this.getText());
			    stringBuffer.insert(offs, str);
			    if(!JFormatTableCellEditor.this.matchesPatterns(stringBuffer)){
			        Toolkit.getDefaultToolkit().beep();
			        return;
			    }
				if(matchedPatternIndex==patterns.length-1){
				    if(validator!=null){
				        if(!validator.isValid(stringBuffer.toString())){
				            Toolkit.getDefaultToolkit().beep();
				        	return;
				        }
				    }
				}
				super.insertString(offs, text, a);
			}
        }
        /**
         * Called when part of the text is replaced.
         * Verifies if the resulting text complies with one of the format
         * patterns. If it doesn't, the value is not changed and a sound is 
         * emitted.
         * 
         * @see javax.swing.text.AbstractDocument#replace(int, int, java.lang.String,
         *  javax.swing.text.AttributeSet)
         */
        public void replace(int offset, int length, String text,
                AttributeSet attrs) throws BadLocationException {
            String text2 = text;
            if(text.length() > 0) {
                if (text.equals("ERROR!")) {
                    super.replace(offset, length, text2, attrs);
                    return;
                }
	            StringBuffer stringBuffer = new StringBuffer(
                        JFormatTableCellEditor.this.getText());
	            stringBuffer.replace(offset,offset+length,text);
				if(!JFormatTableCellEditor.this.matchesPatterns(stringBuffer)){
	                Toolkit.getDefaultToolkit().beep();
	                return;
	            }
				if(matchedPatternIndex==patterns.length-1){
				    if(validator!=null){
				        if(!validator.isValid(stringBuffer.toString())){
		                    Toolkit.getDefaultToolkit().beep();
				        	return;
				        }
				    }
				}
            }
            super.replace(offset, length, text2, attrs);
        }
      }
}
