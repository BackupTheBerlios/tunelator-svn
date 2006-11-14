/*
 * An XML document type.
 * Localname: AdministrativeDate
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.AdministrativeDateDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one AdministrativeDate(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class AdministrativeDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.AdministrativeDateDocument
{
    
    public AdministrativeDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADMINISTRATIVEDATE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "AdministrativeDate");
    
    
    /**
     * Gets the "AdministrativeDate" element
     */
    public org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate getAdministrativeDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate target = null;
            target = (org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate)get_store().find_element_user(ADMINISTRATIVEDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AdministrativeDate" element
     */
    public void setAdministrativeDate(org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate administrativeDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate target = null;
            target = (org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate)get_store().find_element_user(ADMINISTRATIVEDATE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate)get_store().add_element_user(ADMINISTRATIVEDATE$0);
            }
            target.set(administrativeDate);
        }
    }
    
    /**
     * Appends and returns a new empty "AdministrativeDate" element
     */
    public org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate addNewAdministrativeDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate target = null;
            target = (org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate)get_store().add_element_user(ADMINISTRATIVEDATE$0);
            return target;
        }
    }
    /**
     * An XML AdministrativeDate(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class AdministrativeDateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate
    {
        
        public AdministrativeDateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADMINDATETYPE$0 = 
            new javax.xml.namespace.QName("", "adminDateType");
        private static final javax.xml.namespace.QName ADMINDATE$2 = 
            new javax.xml.namespace.QName("", "adminDate");
        
        
        /**
         * Gets the "adminDateType" attribute
         */
        public java.lang.String getAdminDateType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADMINDATETYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "adminDateType" attribute
         */
        public org.landxml.schema.landXML11.AdminDateTypeType xgetAdminDateType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AdminDateTypeType target = null;
                target = (org.landxml.schema.landXML11.AdminDateTypeType)get_store().find_attribute_user(ADMINDATETYPE$0);
                return target;
            }
        }
        
        /**
         * Sets the "adminDateType" attribute
         */
        public void setAdminDateType(java.lang.String adminDateType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADMINDATETYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADMINDATETYPE$0);
                }
                target.setStringValue(adminDateType);
            }
        }
        
        /**
         * Sets (as xml) the "adminDateType" attribute
         */
        public void xsetAdminDateType(org.landxml.schema.landXML11.AdminDateTypeType adminDateType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AdminDateTypeType target = null;
                target = (org.landxml.schema.landXML11.AdminDateTypeType)get_store().find_attribute_user(ADMINDATETYPE$0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.AdminDateTypeType)get_store().add_attribute_user(ADMINDATETYPE$0);
                }
                target.set(adminDateType);
            }
        }
        
        /**
         * Gets the "adminDate" attribute
         */
        public java.util.Calendar getAdminDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADMINDATE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "adminDate" attribute
         */
        public org.apache.xmlbeans.XmlDate xgetAdminDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(ADMINDATE$2);
                return target;
            }
        }
        
        /**
         * Sets the "adminDate" attribute
         */
        public void setAdminDate(java.util.Calendar adminDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADMINDATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADMINDATE$2);
                }
                target.setCalendarValue(adminDate);
            }
        }
        
        /**
         * Sets (as xml) the "adminDate" attribute
         */
        public void xsetAdminDate(org.apache.xmlbeans.XmlDate adminDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(ADMINDATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(ADMINDATE$2);
                }
                target.set(adminDate);
            }
        }
    }
}
