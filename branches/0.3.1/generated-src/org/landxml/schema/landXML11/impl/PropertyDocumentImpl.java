/*
 * An XML document type.
 * Localname: Property
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PropertyDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Property(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class PropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PropertyDocument
{
    
    public PropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Property");
    
    
    /**
     * Gets the "Property" element
     */
    public org.landxml.schema.landXML11.PropertyDocument.Property getProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PropertyDocument.Property target = null;
            target = (org.landxml.schema.landXML11.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Property" element
     */
    public void setProperty(org.landxml.schema.landXML11.PropertyDocument.Property property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PropertyDocument.Property target = null;
            target = (org.landxml.schema.landXML11.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PropertyDocument.Property)get_store().add_element_user(PROPERTY$0);
            }
            target.set(property);
        }
    }
    
    /**
     * Appends and returns a new empty "Property" element
     */
    public org.landxml.schema.landXML11.PropertyDocument.Property addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PropertyDocument.Property target = null;
            target = (org.landxml.schema.landXML11.PropertyDocument.Property)get_store().add_element_user(PROPERTY$0);
            return target;
        }
    }
    /**
     * An XML Property(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class PropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PropertyDocument.Property
    {
        
        public PropertyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LABEL$0 = 
            new javax.xml.namespace.QName("", "label");
        private static final javax.xml.namespace.QName VALUE$2 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "label" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(LABEL$0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "label" attribute
         */
        public void setLabel(org.apache.xmlbeans.XmlAnySimpleType label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(LABEL$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(LABEL$0);
                }
                target.set(label);
            }
        }
        
        /**
         * Appends and returns a new empty "label" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(LABEL$0);
                return target;
            }
        }
        
        /**
         * Gets the "value" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(org.apache.xmlbeans.XmlAnySimpleType value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(VALUE$2);
                }
                target.set(value);
            }
        }
        
        /**
         * Appends and returns a new empty "value" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(VALUE$2);
                return target;
            }
        }
    }
}
