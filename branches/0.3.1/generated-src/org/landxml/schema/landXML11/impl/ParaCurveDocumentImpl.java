/*
 * An XML document type.
 * Localname: ParaCurve
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ParaCurveDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one ParaCurve(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ParaCurveDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ParaCurveDocument
{
    
    public ParaCurveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARACURVE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ParaCurve");
    
    
    /**
     * Gets the "ParaCurve" element
     */
    public org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve getParaCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve target = null;
            target = (org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve)get_store().find_element_user(PARACURVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ParaCurve" element
     */
    public void setParaCurve(org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve paraCurve)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve target = null;
            target = (org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve)get_store().find_element_user(PARACURVE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve)get_store().add_element_user(PARACURVE$0);
            }
            target.set(paraCurve);
        }
    }
    
    /**
     * Appends and returns a new empty "ParaCurve" element
     */
    public org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve addNewParaCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve target = null;
            target = (org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve)get_store().add_element_user(PARACURVE$0);
            return target;
        }
    }
    /**
     * An XML ParaCurve(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlDouble.
     */
    public static class ParaCurveImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve
    {
        
        public ParaCurveImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected ParaCurveImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName LENGTH$0 = 
            new javax.xml.namespace.QName("", "length");
        private static final javax.xml.namespace.QName DESC$2 = 
            new javax.xml.namespace.QName("", "desc");
        
        
        /**
         * Gets the "length" attribute
         */
        public double getLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "length" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTH$0);
                return target;
            }
        }
        
        /**
         * Sets the "length" attribute
         */
        public void setLength(double length)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LENGTH$0);
                }
                target.setDoubleValue(length);
            }
        }
        
        /**
         * Sets (as xml) the "length" attribute
         */
        public void xsetLength(org.apache.xmlbeans.XmlDouble length)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTH$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LENGTH$0);
                }
                target.set(length);
            }
        }
        
        /**
         * Gets the "desc" attribute
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "desc" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$2);
                return target;
            }
        }
        
        /**
         * True if has "desc" attribute
         */
        public boolean isSetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DESC$2) != null;
            }
        }
        
        /**
         * Sets the "desc" attribute
         */
        public void setDesc(java.lang.String desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$2);
                }
                target.setStringValue(desc);
            }
        }
        
        /**
         * Sets (as xml) the "desc" attribute
         */
        public void xsetDesc(org.apache.xmlbeans.XmlString desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$2);
                }
                target.set(desc);
            }
        }
        
        /**
         * Unsets the "desc" attribute
         */
        public void unsetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DESC$2);
            }
        }
    }
}
