/*
 * Created on 18-sep-2005
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
package es.tunelator.vo;

import java.text.Format;
import java.text.ParseException;
import java.util.Comparator;

import es.tunelator.Constants;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * Compares values considering the attribute of a <code>PuntoVO</code> object
 * they correspond to.<p/>
 * As some or all of <code>PuntoVO</code> attributes are stored as their string
 * representation, they need to be converted to their native values to be 
 * properly compared.<p/>
 * The attribute the comparator applies to is specified as an argument to its
 * constructor.
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 * 
 */
public class PuntoVOColumnComparator implements Comparator {
    /**
     * <code>attributeKey</code> - The key identifier of the attribute that
     * will be used to compare, as encoded in <code>PuntoVO</code>
     */
    private int attributeKey = -1;
    /**
     * <code>delegateComparator</code> - The comparator that's adecuate to
     * compare the native values of this comparator attribute.
     */
    private Comparator delegateComparator = null;
    /**
     * Creates a comparator for the specified key.
     * @param attributeKey - The identifier of the attribute that this 
     * comparator will be used to compare, as encoded in <code>PuntoVO</code>
     */
    public PuntoVOColumnComparator(int attributeKey){
        this.attributeKey = attributeKey;
        this.delegateComparator = chooseComparator(attributeKey);
    }
    /**
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    public int compare(Object o1, Object o2) {
        if(attributeKey == PuntoVO.TIME){
            o1 = Constants.TIME_REFERENCE_DATE+" "+o1;
            o2 = Constants.TIME_REFERENCE_DATE+" "+o2;
        }
        return this.delegateComparator.compare(o1,o2);
    }
    /**
     * Selects the adecuate comparator fot the specified attribute
     * 
     * @param attributeKey - The id of the attribute 
     * @return The adecuate <code>Comparator</code> based on the 
     * attribute's native type.
     */
    private Comparator chooseComparator(int attributeKey){
        Comparator result = null;
        Format format = PuntoVO.getFormat(attributeKey);
        // Beware: PuntoVO.getFormat returns null if the attribute is of 
        // String type
        if(format == null) {
            result = String.CASE_INSENSITIVE_ORDER;
        } else {
            result = new NativeStringComparator(format);
        }
        return result;
    }
    /**
     * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
     * 
     * A generic native type comparator that can compare any two
     * strings that are a representation of a value of any other
     * native type, as long as a <code>Format</code> capabe of
     * parsing them is provided.
     * 
     * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
     * 
     */
    private class NativeStringComparator implements Comparator {
        /**
         * A <code>Format</code> to convert the strings to their native type
         */
        private Format format = null;
        /**
         * Creates a comparator of values encoded as strings in the given 
         * format.
         * 
         * @param format - A <code>Format</code> capable of parsing the strings
         */
        public NativeStringComparator(Format format){
            this.format = format;
        }
        /**
         * Parses the two strings using the <code>Format</code> of this 
         * comparator, and compares them using the default comparator of
         * the resulting native type.
         * 
         * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
         */
        public int compare(Object o1, Object o2) {
            if(!(o1 instanceof String)&&(o2 instanceof String)){
                throw new IllegalArgumentException("Only String types are accepted");
            }
            String s1 = (String) o1;
            String s2 = (String) o2;
            try {
                Comparable d1 = (Comparable) format.parseObject(s1);
                Comparable d2 = (Comparable) format.parseObject(s2);
                // This is a hack to solve the problem that the behaviour of DecimalFormat creates
                // when a value that can be represented as a long is stored in an attribute of double
                // native type (for example "100.000"). DecimalFormat returns a Long whenever possible,
                // so if we receive here "100.000" and "100.100", d1 will be of Long type and d2 will
                // de a Double; and then compareTo throws a ClassCastException.
                if(!d1.getClass().equals(d2.getClass())){
                    if((d1 instanceof Number)&&(d2 instanceof Number)){
                        Number n1 = (Number) d1;
                        Number n2 = (Number) d2;
                        d1 = new Double(n1.doubleValue());
                        d2 = new Double(n2.doubleValue());
                    }
                }
                return d1.compareTo(d2);
            } catch (ParseException e) {
                throw new IllegalArgumentException("Incompatible date format either "+s1+" or "+s2);
            }
        }
    }
}
