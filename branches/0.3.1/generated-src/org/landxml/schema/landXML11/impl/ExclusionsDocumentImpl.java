/*
 * An XML document type.
 * Localname: Exclusions
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ExclusionsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Exclusions(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ExclusionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ExclusionsDocument
{
    
    public ExclusionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXCLUSIONS$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Exclusions");
    
    
    /**
     * Gets the "Exclusions" element
     */
    public org.landxml.schema.landXML11.ExclusionsDocument.Exclusions getExclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ExclusionsDocument.Exclusions target = null;
            target = (org.landxml.schema.landXML11.ExclusionsDocument.Exclusions)get_store().find_element_user(EXCLUSIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Exclusions" element
     */
    public void setExclusions(org.landxml.schema.landXML11.ExclusionsDocument.Exclusions exclusions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ExclusionsDocument.Exclusions target = null;
            target = (org.landxml.schema.landXML11.ExclusionsDocument.Exclusions)get_store().find_element_user(EXCLUSIONS$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ExclusionsDocument.Exclusions)get_store().add_element_user(EXCLUSIONS$0);
            }
            target.set(exclusions);
        }
    }
    
    /**
     * Appends and returns a new empty "Exclusions" element
     */
    public org.landxml.schema.landXML11.ExclusionsDocument.Exclusions addNewExclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ExclusionsDocument.Exclusions target = null;
            target = (org.landxml.schema.landXML11.ExclusionsDocument.Exclusions)get_store().add_element_user(EXCLUSIONS$0);
            return target;
        }
    }
    /**
     * An XML Exclusions(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class ExclusionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ExclusionsDocument.Exclusions
    {
        
        public ExclusionsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXCLUSIONTYPE$0 = 
            new javax.xml.namespace.QName("", "exclusionType");
        private static final javax.xml.namespace.QName AREA$2 = 
            new javax.xml.namespace.QName("", "area");
        
        
        /**
         * Gets the "exclusionType" attribute
         */
        public java.lang.String getExclusionType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXCLUSIONTYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "exclusionType" attribute
         */
        public org.landxml.schema.landXML11.ExclusType xgetExclusionType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ExclusType target = null;
                target = (org.landxml.schema.landXML11.ExclusType)get_store().find_attribute_user(EXCLUSIONTYPE$0);
                return target;
            }
        }
        
        /**
         * Sets the "exclusionType" attribute
         */
        public void setExclusionType(java.lang.String exclusionType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXCLUSIONTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXCLUSIONTYPE$0);
                }
                target.setStringValue(exclusionType);
            }
        }
        
        /**
         * Sets (as xml) the "exclusionType" attribute
         */
        public void xsetExclusionType(org.landxml.schema.landXML11.ExclusType exclusionType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ExclusType target = null;
                target = (org.landxml.schema.landXML11.ExclusType)get_store().find_attribute_user(EXCLUSIONTYPE$0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ExclusType)get_store().add_attribute_user(EXCLUSIONTYPE$0);
                }
                target.set(exclusionType);
            }
        }
        
        /**
         * Gets the "area" attribute
         */
        public double getArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREA$2);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "area" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AREA$2);
                return target;
            }
        }
        
        /**
         * Sets the "area" attribute
         */
        public void setArea(double area)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREA$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AREA$2);
                }
                target.setDoubleValue(area);
            }
        }
        
        /**
         * Sets (as xml) the "area" attribute
         */
        public void xsetArea(org.apache.xmlbeans.XmlDouble area)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AREA$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(AREA$2);
                }
                target.set(area);
            }
        }
    }
}
