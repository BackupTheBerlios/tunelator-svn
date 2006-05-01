/*
 * Created on 11-may-2005
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
package es.tunelator.gui.components;

import java.awt.Toolkit;
import java.text.Format;
import java.text.ParseException;
import java.util.regex.Pattern;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;

import es.tunelator.gui.validators.StringValidator;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Text field type that accepts a set of valid pattens and checks the
 * input text for vlididty againts them, rejecting any character that
 * renders the text invalid.<p/>
 * By using a set of patterns it's possible to accept states of a 
 * text value that are invalid against the desired final pattern, but
 * must be accepted to be able to write it.
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class JFormatTextField extends JTextField {
    private String patterns[];
    private Pattern compiled[];
    private Pattern regexp = null;
    private StringValidator validator = null;
    private int matchedPatternIndex = -1;
    private Format format = null;
    private Renderer renderer = null;
    private boolean allowEmpty = true;
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
    public JFormatTextField(String[] patterns, boolean allowEmpty) {
        setPatterns(patterns);
        setInputVerifier(new Verifier());
        this.allowEmpty = allowEmpty;
    }
    /**
     * Initialices the editor with no array of patterns.
     * It is unusable until <code>setPatterns<code> is used.
     */
    public JFormatTextField(boolean allowEmpty) {
        setInputVerifier(new Verifier());
        this.allowEmpty = allowEmpty;
    }
    /**
     * Allows to invoke matchesPatterns with a String parameter.
     * 
     * @param str
     * @return
     */
    private boolean matchesPatterns(String str){
        return matchesPatterns(new StringBuffer(str));
    }
    /**
     * Checks to see if the value contained in the SringBuffer matches
     * one of the patterns.<br>
     * If a match is found the matchedPatternIndex attribute is asigned
     * the index of the position of the matching pattern in the array of
     * patterns. Else this attribute gets value -1.
     * 
     * @param str
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
     * @return Returns the format.
     */
    public Format getFormat() {
        return format;
    }
    /**
     * @param format The format to set.
     */
    public void setFormat(Format format) {
        this.format = format;
        renderer = new Renderer(format);
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
     * This model checks each modification in the value of the cell before
     * it is taken to its value. The resulting value has to match one of
     * the patterns and if a StringValidator exists and the match is with
     * the last pattern, it also has to be valid.<br>
     * If this conditions are not fulfilled, the modification is not done and
     * a beep sound is emitted.
     * 
     * @author Juan Alvarez
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
          if (regexp != null) {
            StringBuffer stringBuffer = new StringBuffer(JFormatTextField.this.
            getText());
            stringBuffer.delete(offs, offs + len);
			if(stringBuffer.length()>0){
			    String text = stringBuffer.toString();
				if(!JFormatTextField.this.matchesPatterns(text)){
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
          }
          super.remove(offs, len);
        }

        /**
         * Is invoked when text is inserted.
         * Verifies if the resulting text complies with one of the format
         * patterns. If it doesn't, the value is not changed and a sound is 
         * emitted.
         * 
         * @see javax.swing.text.Document#insertString(int, java.lang.String, javax.swing.text.AttributeSet)
         */
        public void insertString(int offs, String text, AttributeSet a) throws
        BadLocationException {
          String str = text;
          if (str == null) {
            return;
          }
          if (str.length() > 0) {
            if (regexp != null) {
              StringBuffer stringBuffer = new StringBuffer(JFormatTextField.this.getText());
              stringBuffer.insert(offs, str);
			  if(!JFormatTextField.this.matchesPatterns(stringBuffer)){
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
            super.insertString(offs, text, a);
          }
        }
        
        /**
         * Called when part of the text is replaced.
         * Verifies if the resulting text complies with one of the format
         * patterns. If it doesn't, the value is not changed and a sound is 
         * emitted.
         * 
         * @see javax.swing.text.AbstractDocument#replace(int, int, java.lang.String, javax.swing.text.AttributeSet)
         */
        public void replace(int offset, int length, String text,
                AttributeSet attrs) throws BadLocationException {
            String text2 = text;
            if(text.length() > 0) {
	            StringBuffer stringBuffer = new StringBuffer(JFormatTextField.this.getText());
	            stringBuffer.replace(offset,offset+length,text);
				if(!JFormatTextField.this.matchesPatterns(stringBuffer)){
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
	            super.replace(offset, length, text2, attrs);
            }
        }
      }
    /**
     * &COPY; 2005 Juan Alvarez Ferrando
     * <p/>
     * Extension of InputValidator to avoid the field being abandoned
     * whit an invalid value.
     * <p/>
     * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
     */
    private class Verifier extends InputVerifier {
        /**
         * Verifies that the text is valid, and if it is so and there's a 
         * renderer, it uses it to format the value for display.<p/>
         * If anything invalid occurs, a beep sound is played.
         * @see javax.swing.InputVerifier#verify(javax.swing.JComponent)
         */
        public boolean verify(JComponent input) {
            StringValidator validator = JFormatTextField.this.validator;
            if(JFormatTextField.this.getText().trim().length()==0 && !JFormatTextField.this.allowEmpty){
                Toolkit.getDefaultToolkit().beep();
                return false;
            }
            if (validator != null){
                if(validator.isValid(JFormatTextField.this.getText().trim())){
                    if(JFormatTextField.this.renderer != null){
                        JFormatTextField.this.setText(renderer.render(JFormatTextField.this.getText().trim()));
                    }
                    return true;
                } else {
	                Toolkit.getDefaultToolkit().beep();
                    return false;
                }
            }
            return true;
        }
    }
    /**
     * &COPY; 2005 Juan Alvarez Ferrando
     * <p/>
     * Takes a <code>String<code> that represents some value and renders 
     * the same value in a different format.
     * <p/>
     * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
     */
    private class Renderer {
        private Format format;
        /**
         * Creates a <code>Renderer</code> for the given format
         * 
         * @param format The <code>Format</code> used to render the value
         */
        public Renderer(Format format) {
            this.format = format;
        }
        /**
         * @see javax.swing.table.TableCellRenderer#
         * getTableCellRendererComponent(javax.swing.JTable, java.lang.Object, 
         * boolean, boolean, int, int)
         */
        public String render(String value) {
            try {
                Object datum;
                if(value.trim().length()>0){
	                datum = format.parseObject((String)value);
	                return format.format(datum);
                }
                return value;
            } catch (ParseException e) {
                return "ERROR!";
            }
        }
    }
}
