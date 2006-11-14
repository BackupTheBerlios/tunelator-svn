/*
 * An XML document type.
 * Localname: AdministrativeArea
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.AdministrativeAreaDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one AdministrativeArea(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class AdministrativeAreaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.AdministrativeAreaDocument
{
    
    public AdministrativeAreaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADMINISTRATIVEAREA$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "AdministrativeArea");
    
    
    /**
     * Gets the "AdministrativeArea" element
     */
    public org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea getAdministrativeArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea target = null;
            target = (org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea)get_store().find_element_user(ADMINISTRATIVEAREA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AdministrativeArea" element
     */
    public void setAdministrativeArea(org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea administrativeArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea target = null;
            target = (org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea)get_store().find_element_user(ADMINISTRATIVEAREA$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea)get_store().add_element_user(ADMINISTRATIVEAREA$0);
            }
            target.set(administrativeArea);
        }
    }
    
    /**
     * Appends and returns a new empty "AdministrativeArea" element
     */
    public org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea addNewAdministrativeArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea target = null;
            target = (org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea)get_store().add_element_user(ADMINISTRATIVEAREA$0);
            return target;
        }
    }
    /**
     * An XML AdministrativeArea(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class AdministrativeAreaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea
    {
        
        public AdministrativeAreaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADMINAREATYPE$0 = 
            new javax.xml.namespace.QName("", "adminAreaType");
        private static final javax.xml.namespace.QName ADMINAREANAME$2 = 
            new javax.xml.namespace.QName("", "adminAreaName");
        private static final javax.xml.namespace.QName ADMINAREACODE$4 = 
            new javax.xml.namespace.QName("", "adminAreaCode");
        private static final javax.xml.namespace.QName PCLREF$6 = 
            new javax.xml.namespace.QName("", "pclRef");
        
        
        /**
         * Gets the "adminAreaType" attribute
         */
        public java.lang.String getAdminAreaType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADMINAREATYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "adminAreaType" attribute
         */
        public org.landxml.schema.landXML11.AdminAreaTypeType xgetAdminAreaType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AdminAreaTypeType target = null;
                target = (org.landxml.schema.landXML11.AdminAreaTypeType)get_store().find_attribute_user(ADMINAREATYPE$0);
                return target;
            }
        }
        
        /**
         * Sets the "adminAreaType" attribute
         */
        public void setAdminAreaType(java.lang.String adminAreaType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADMINAREATYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADMINAREATYPE$0);
                }
                target.setStringValue(adminAreaType);
            }
        }
        
        /**
         * Sets (as xml) the "adminAreaType" attribute
         */
        public void xsetAdminAreaType(org.landxml.schema.landXML11.AdminAreaTypeType adminAreaType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AdminAreaTypeType target = null;
                target = (org.landxml.schema.landXML11.AdminAreaTypeType)get_store().find_attribute_user(ADMINAREATYPE$0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.AdminAreaTypeType)get_store().add_attribute_user(ADMINAREATYPE$0);
                }
                target.set(adminAreaType);
            }
        }
        
        /**
         * Gets the "adminAreaName" attribute
         */
        public java.lang.String getAdminAreaName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADMINAREANAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "adminAreaName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAdminAreaName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADMINAREANAME$2);
                return target;
            }
        }
        
        /**
         * True if has "adminAreaName" attribute
         */
        public boolean isSetAdminAreaName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ADMINAREANAME$2) != null;
            }
        }
        
        /**
         * Sets the "adminAreaName" attribute
         */
        public void setAdminAreaName(java.lang.String adminAreaName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADMINAREANAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADMINAREANAME$2);
                }
                target.setStringValue(adminAreaName);
            }
        }
        
        /**
         * Sets (as xml) the "adminAreaName" attribute
         */
        public void xsetAdminAreaName(org.apache.xmlbeans.XmlString adminAreaName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADMINAREANAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADMINAREANAME$2);
                }
                target.set(adminAreaName);
            }
        }
        
        /**
         * Unsets the "adminAreaName" attribute
         */
        public void unsetAdminAreaName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ADMINAREANAME$2);
            }
        }
        
        /**
         * Gets the "adminAreaCode" attribute
         */
        public java.lang.String getAdminAreaCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADMINAREACODE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "adminAreaCode" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAdminAreaCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADMINAREACODE$4);
                return target;
            }
        }
        
        /**
         * True if has "adminAreaCode" attribute
         */
        public boolean isSetAdminAreaCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ADMINAREACODE$4) != null;
            }
        }
        
        /**
         * Sets the "adminAreaCode" attribute
         */
        public void setAdminAreaCode(java.lang.String adminAreaCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADMINAREACODE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADMINAREACODE$4);
                }
                target.setStringValue(adminAreaCode);
            }
        }
        
        /**
         * Sets (as xml) the "adminAreaCode" attribute
         */
        public void xsetAdminAreaCode(org.apache.xmlbeans.XmlString adminAreaCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADMINAREACODE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADMINAREACODE$4);
                }
                target.set(adminAreaCode);
            }
        }
        
        /**
         * Unsets the "adminAreaCode" attribute
         */
        public void unsetAdminAreaCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ADMINAREACODE$4);
            }
        }
        
        /**
         * Gets the "pclRef" attribute
         */
        public java.util.List getPclRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PCLREF$6);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "pclRef" attribute
         */
        public org.landxml.schema.landXML11.ParcelNameRefs xgetPclRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParcelNameRefs target = null;
                target = (org.landxml.schema.landXML11.ParcelNameRefs)get_store().find_attribute_user(PCLREF$6);
                return target;
            }
        }
        
        /**
         * True if has "pclRef" attribute
         */
        public boolean isSetPclRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PCLREF$6) != null;
            }
        }
        
        /**
         * Sets the "pclRef" attribute
         */
        public void setPclRef(java.util.List pclRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PCLREF$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PCLREF$6);
                }
                target.setListValue(pclRef);
            }
        }
        
        /**
         * Sets (as xml) the "pclRef" attribute
         */
        public void xsetPclRef(org.landxml.schema.landXML11.ParcelNameRefs pclRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParcelNameRefs target = null;
                target = (org.landxml.schema.landXML11.ParcelNameRefs)get_store().find_attribute_user(PCLREF$6);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ParcelNameRefs)get_store().add_attribute_user(PCLREF$6);
                }
                target.set(pclRef);
            }
        }
        
        /**
         * Unsets the "pclRef" attribute
         */
        public void unsetPclRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PCLREF$6);
            }
        }
    }
}
