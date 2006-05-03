/*
 * Created on 07-may-2005
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

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
 
/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Validates the value of a String representation of a date
 * in a specified format, as a valid <code>java.util.Date</code>.<p/>
 * It can be used for date, time and date-time values.
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class DateValidator implements StringValidator {
    /**
     * The string representation of the validated format
     */
    private String format = "";
    /**
     * If <code>true</code> empty strings are valid
     */
    private boolean acceptEmptyValues = true;
    /**
     * Initializes the validator with a format.
     * @see java.text.SimpleDateFormat
     * @param format Format to convert the string representation into a date 
     * value
     */
    public DateValidator(String format){
        setFormat(format);
    }
    /**
     * Initializes the validator with a format.
     * @see java.text.SimpleDateFormat
     * @param format Format to convert the string representation into a date value
     */
    public DateValidator(String format, boolean acceptEmptyValues){
        setFormat(format);
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
     * @param format The format to set.
     */
    public final void setFormat(String format) {
        this.format = format;
    }
    /**
     * @return <code>true</code> if the data is a valid date and 
     * <code>false</code> otherwise.
     * @see es.tunelator.gui.validators.StringValidator#
     * isValid(java.lang.String)
     */
    public boolean isValid(String data) {
        if (data.trim().length()>0){
	        SimpleDateFormat sdf = new SimpleDateFormat(format);
	        sdf.setLenient(false);
	        ParsePosition pos = new ParsePosition(0);
	        java.util.Date value = sdf.parse(data,pos);
	        if(value != null)
	            return true;
	        return false;
        }
        if(acceptEmptyValues)
            return true;
        return false;
    }
}
