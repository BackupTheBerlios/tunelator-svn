/*
 * An XML document type.
 * Localname: UnsymParaCurve
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.UnsymParaCurveDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one UnsymParaCurve(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class UnsymParaCurveDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.UnsymParaCurveDocument
{
    
    public UnsymParaCurveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSYMPARACURVE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "UnsymParaCurve");
    
    
    /**
     * Gets the "UnsymParaCurve" element
     */
    public org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve getUnsymParaCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve target = null;
            target = (org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve)get_store().find_element_user(UNSYMPARACURVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnsymParaCurve" element
     */
    public void setUnsymParaCurve(org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve unsymParaCurve)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve target = null;
            target = (org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve)get_store().find_element_user(UNSYMPARACURVE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve)get_store().add_element_user(UNSYMPARACURVE$0);
            }
            target.set(unsymParaCurve);
        }
    }
    
    /**
     * Appends and returns a new empty "UnsymParaCurve" element
     */
    public org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve addNewUnsymParaCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve target = null;
            target = (org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve)get_store().add_element_user(UNSYMPARACURVE$0);
            return target;
        }
    }
    /**
     * An XML UnsymParaCurve(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlDouble.
     */
    public static class UnsymParaCurveImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve
    {
        
        public UnsymParaCurveImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected UnsymParaCurveImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName LENGTHIN$0 = 
            new javax.xml.namespace.QName("", "lengthIn");
        private static final javax.xml.namespace.QName LENGTHOUT$2 = 
            new javax.xml.namespace.QName("", "lengthOut");
        private static final javax.xml.namespace.QName DESC$4 = 
            new javax.xml.namespace.QName("", "desc");
        
        
        /**
         * Gets the "lengthIn" attribute
         */
        public double getLengthIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTHIN$0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "lengthIn" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetLengthIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTHIN$0);
                return target;
            }
        }
        
        /**
         * Sets the "lengthIn" attribute
         */
        public void setLengthIn(double lengthIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTHIN$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LENGTHIN$0);
                }
                target.setDoubleValue(lengthIn);
            }
        }
        
        /**
         * Sets (as xml) the "lengthIn" attribute
         */
        public void xsetLengthIn(org.apache.xmlbeans.XmlDouble lengthIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTHIN$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LENGTHIN$0);
                }
                target.set(lengthIn);
            }
        }
        
        /**
         * Gets the "lengthOut" attribute
         */
        public double getLengthOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTHOUT$2);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "lengthOut" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetLengthOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTHOUT$2);
                return target;
            }
        }
        
        /**
         * Sets the "lengthOut" attribute
         */
        public void setLengthOut(double lengthOut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTHOUT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LENGTHOUT$2);
                }
                target.setDoubleValue(lengthOut);
            }
        }
        
        /**
         * Sets (as xml) the "lengthOut" attribute
         */
        public void xsetLengthOut(org.apache.xmlbeans.XmlDouble lengthOut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTHOUT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LENGTHOUT$2);
                }
                target.set(lengthOut);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$4);
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
                return get_store().find_attribute_user(DESC$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$4);
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
                get_store().remove_attribute(DESC$4);
            }
        }
    }
}
