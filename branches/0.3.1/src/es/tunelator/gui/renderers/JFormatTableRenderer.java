/*
 * Created on 08-may-2005
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
package es.tunelator.gui.renderers;

import java.awt.Color;
import java.text.Format;
import java.text.ParseException;

import javax.swing.table.DefaultTableCellRenderer;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Generic renderer that formats the value to be displayed using a 
 * <code>Format</code> passed to its constructuor.
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class JFormatTableRenderer extends DefaultTableCellRenderer {
    /**
     * Holds the format to apply to cell values
     */
    Format format = null;
    /**
     * Constructs a renderer that uses the given <code>Format</code>
     * @param format
     */
    public JFormatTableRenderer(Format format) {
        if(format == null)
            throw new IllegalArgumentException("Format can't be null");
        this.format = format;
    }
    /**
     * If the parameter is of <code>String</code> type, extracts the value
     * it represents and then formats it.
     * The received <code>String<code> must be in a format parseable by
     * the <code>Format</code> used.
     */
    protected void setValue(Object value) {
        try {
            if(value.getClass().equals(String.class)) {
                Object datum;
                datum = format.parseObject((String)value);
                setText(format.format(datum));
            } else {
                super.setValue(value); 
            }
        } catch (ParseException e) {
            setForeground(Color.RED);
            setText("ERROR!");
        }
    }
}
