/*
 * An XML document type.
 * Localname: PVI
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PVIDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one PVI(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class PVIDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PVIDocument
{
    
    public PVIDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PVI$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PVI");
    
    
    /**
     * Gets the "PVI" element
     */
    public org.landxml.schema.landXML11.PVIDocument.PVI getPVI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PVIDocument.PVI target = null;
            target = (org.landxml.schema.landXML11.PVIDocument.PVI)get_store().find_element_user(PVI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PVI" element
     */
    public void setPVI(org.landxml.schema.landXML11.PVIDocument.PVI pvi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PVIDocument.PVI target = null;
            target = (org.landxml.schema.landXML11.PVIDocument.PVI)get_store().find_element_user(PVI$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PVIDocument.PVI)get_store().add_element_user(PVI$0);
            }
            target.set(pvi);
        }
    }
    
    /**
     * Appends and returns a new empty "PVI" element
     */
    public org.landxml.schema.landXML11.PVIDocument.PVI addNewPVI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PVIDocument.PVI target = null;
            target = (org.landxml.schema.landXML11.PVIDocument.PVI)get_store().add_element_user(PVI$0);
            return target;
        }
    }
    /**
     * An XML PVI(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlDouble.
     */
    public static class PVIImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.landxml.schema.landXML11.PVIDocument.PVI
    {
        
        public PVIImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected PVIImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName DESC$0 = 
            new javax.xml.namespace.QName("", "desc");
        
        
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
    }
}
