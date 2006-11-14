/*
 * An XML document type.
 * Localname: ComplexName
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ComplexNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one ComplexName(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ComplexNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ComplexNameDocument
{
    
    public ComplexNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLEXNAME$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ComplexName");
    
    
    /**
     * Gets the "ComplexName" element
     */
    public org.landxml.schema.landXML11.ComplexNameDocument.ComplexName getComplexName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ComplexNameDocument.ComplexName target = null;
            target = (org.landxml.schema.landXML11.ComplexNameDocument.ComplexName)get_store().find_element_user(COMPLEXNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ComplexName" element
     */
    public void setComplexName(org.landxml.schema.landXML11.ComplexNameDocument.ComplexName complexName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ComplexNameDocument.ComplexName target = null;
            target = (org.landxml.schema.landXML11.ComplexNameDocument.ComplexName)get_store().find_element_user(COMPLEXNAME$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ComplexNameDocument.ComplexName)get_store().add_element_user(COMPLEXNAME$0);
            }
            target.set(complexName);
        }
    }
    
    /**
     * Appends and returns a new empty "ComplexName" element
     */
    public org.landxml.schema.landXML11.ComplexNameDocument.ComplexName addNewComplexName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ComplexNameDocument.ComplexName target = null;
            target = (org.landxml.schema.landXML11.ComplexNameDocument.ComplexName)get_store().add_element_user(COMPLEXNAME$0);
            return target;
        }
    }
    /**
     * An XML ComplexName(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class ComplexNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ComplexNameDocument.ComplexName
    {
        
        public ComplexNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESC$0 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName PRIORITY$2 = 
            new javax.xml.namespace.QName("", "priority");
        
        
        /**
         * Gets the "desc" attribute
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$0);
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
                return get_store().find_attribute_user(DESC$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$0);
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
                get_store().remove_attribute(DESC$0);
            }
        }
        
        /**
         * Gets the "priority" attribute
         */
        public int getPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$2);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "priority" attribute
         */
        public org.apache.xmlbeans.XmlInt xgetPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PRIORITY$2);
                return target;
            }
        }
        
        /**
         * True if has "priority" attribute
         */
        public boolean isSetPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PRIORITY$2) != null;
            }
        }
        
        /**
         * Sets the "priority" attribute
         */
        public void setPriority(int priority)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRIORITY$2);
                }
                target.setIntValue(priority);
            }
        }
        
        /**
         * Sets (as xml) the "priority" attribute
         */
        public void xsetPriority(org.apache.xmlbeans.XmlInt priority)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PRIORITY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PRIORITY$2);
                }
                target.set(priority);
            }
        }
        
        /**
         * Unsets the "priority" attribute
         */
        public void unsetPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PRIORITY$2);
            }
        }
    }
}
