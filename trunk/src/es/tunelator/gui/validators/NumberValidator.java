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
package es.tunelator.gui.validators;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParsePosition;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Validator for Number derived types (Integer, Float, Double)
 * <p/>
 * @author <a href="maitlo:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class NumberValidator implements StringValidator {
    /**
     * The string representation of the valid format
     */
    private String format = "";
    /**
     * The character used as decimal separator
     */
    private char separator = '.'; // default value
    /**
     * If true, empty strings are valid
     */
    private boolean acceptEmptyValues = true;
    /**
     * Initializes the validator with a format.
     * @see java.text.SimpleDateFormat
     * @param format Format to convert the string representation into a date value
     */
    public NumberValidator(String format){
        setFormat(format);
    }
    /**
     * Initializes the validator with a format and decimal separator.
     * @see java.text.SimpleDateFormat
     * @param format Format to convert the string representation into a date value
     */
    public NumberValidator(String format, char separator){
        setFormat(format);
        setSeparator(separator);
    }
    /**
     * @param format
     * @param separator
     * @param acceptEmptyValues
     */
    public NumberValidator(String format, char separator, boolean acceptEmptyValues){
        setFormat(format);
        setSeparator(separator);
        setAcceptEmptyValues(acceptEmptyValues);
    }
    /**
     * @return Returns the acceptEmptyValues.
     */
    public boolean isAcceptEmptyValues() {
        return acceptEmptyValues;
    }
    /**
     * @param acceptEmptyValues The acceptEmptyValues to set.
     */
    public void setAcceptEmptyValues(boolean acceptEmptyValues) {
        this.acceptEmptyValues = acceptEmptyValues;
    }
    /**
     * @return Returns the format.
     */
    public final String getFormat() {
        return format;
    }
    /**
     * The format 
     * @param format The format to set.
     */
    public final void setFormat(String format) {
        this.format = format;
    }
    /**
     * @return Returns the separator.
     */
    public char getSeparator() {
        return separator;
    }
    /**
     * @param separator The separator to set.
     */
    public void setSeparator(char separator) {
        this.separator = separator;
    }
    /**
     * @return <code>true</code> if the data is a valid number with the 
     * format set, and <code>false</code> otherwise.
     * @see es.tunelator.gui.validators.StringValidator#
     * isValid(java.lang.String)
     */
    public boolean isValid(String data) {
        if((data != null) && (data.trim().length()>0)) {
			DecimalFormat formatter = (DecimalFormat) DecimalFormat.getInstance();
			DecimalFormatSymbols symbols = new DecimalFormatSymbols();
	        ParsePosition pos = new ParsePosition(0);
	        Number result = null;
			symbols.setDecimalSeparator(separator);
			formatter.setDecimalFormatSymbols(symbols);
			formatter.applyPattern(format);
			result = formatter.parse(data,pos);
			if (result != null) {
			    return true;
			}
	        return false;
        }
        if(acceptEmptyValues)
            return true;
        return false;
    }
}
