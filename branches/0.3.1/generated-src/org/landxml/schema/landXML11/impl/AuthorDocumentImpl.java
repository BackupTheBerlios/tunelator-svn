/*
 * An XML document type.
 * Localname: Author
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.AuthorDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Author(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class AuthorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.AuthorDocument
{
    
    public AuthorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHOR$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Author");
    
    
    /**
     * Gets the "Author" element
     */
    public org.landxml.schema.landXML11.AuthorDocument.Author getAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AuthorDocument.Author target = null;
            target = (org.landxml.schema.landXML11.AuthorDocument.Author)get_store().find_element_user(AUTHOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Author" element
     */
    public void setAuthor(org.landxml.schema.landXML11.AuthorDocument.Author author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AuthorDocument.Author target = null;
            target = (org.landxml.schema.landXML11.AuthorDocument.Author)get_store().find_element_user(AUTHOR$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.AuthorDocument.Author)get_store().add_element_user(AUTHOR$0);
            }
            target.set(author);
        }
    }
    
    /**
     * Appends and returns a new empty "Author" element
     */
    public org.landxml.schema.landXML11.AuthorDocument.Author addNewAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AuthorDocument.Author target = null;
            target = (org.landxml.schema.landXML11.AuthorDocument.Author)get_store().add_element_user(AUTHOR$0);
            return target;
        }
    }
    /**
     * An XML Author(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class AuthorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.AuthorDocument.Author
    {
        
        public AuthorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CREATEDBY$0 = 
            new javax.xml.namespace.QName("", "createdBy");
        private static final javax.xml.namespace.QName CREATEDBYEMAIL$2 = 
            new javax.xml.namespace.QName("", "createdByEmail");
        private static final javax.xml.namespace.QName COMPANY$4 = 
            new javax.xml.namespace.QName("", "company");
        private static final javax.xml.namespace.QName COMPANYURL$6 = 
            new javax.xml.namespace.QName("", "companyURL");
        private static final javax.xml.namespace.QName TIMESTAMP$8 = 
            new javax.xml.namespace.QName("", "timeStamp");
        
        
        /**
         * Gets the "createdBy" attribute
         */
        public java.lang.String getCreatedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEDBY$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "createdBy" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCreatedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CREATEDBY$0);
                return target;
            }
        }
        
        /**
         * True if has "createdBy" attribute
         */
        public boolean isSetCreatedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CREATEDBY$0) != null;
            }
        }
        
        /**
         * Sets the "createdBy" attribute
         */
        public void setCreatedBy(java.lang.String createdBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEDBY$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATEDBY$0);
                }
                target.setStringValue(createdBy);
            }
        }
        
        /**
         * Sets (as xml) the "createdBy" attribute
         */
        public void xsetCreatedBy(org.apache.xmlbeans.XmlString createdBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CREATEDBY$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CREATEDBY$0);
                }
                target.set(createdBy);
            }
        }
        
        /**
         * Unsets the "createdBy" attribute
         */
        public void unsetCreatedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CREATEDBY$0);
            }
        }
        
        /**
         * Gets the "createdByEmail" attribute
         */
        public java.lang.String getCreatedByEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEDBYEMAIL$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "createdByEmail" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCreatedByEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CREATEDBYEMAIL$2);
                return target;
            }
        }
        
        /**
         * True if has "createdByEmail" attribute
         */
        public boolean isSetCreatedByEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CREATEDBYEMAIL$2) != null;
            }
        }
        
        /**
         * Sets the "createdByEmail" attribute
         */
        public void setCreatedByEmail(java.lang.String createdByEmail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEDBYEMAIL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATEDBYEMAIL$2);
                }
                target.setStringValue(createdByEmail);
            }
        }
        
        /**
         * Sets (as xml) the "createdByEmail" attribute
         */
        public void xsetCreatedByEmail(org.apache.xmlbeans.XmlString createdByEmail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CREATEDBYEMAIL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CREATEDBYEMAIL$2);
                }
                target.set(createdByEmail);
            }
        }
        
        /**
         * Unsets the "createdByEmail" attribute
         */
        public void unsetCreatedByEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CREATEDBYEMAIL$2);
            }
        }
        
        /**
         * Gets the "company" attribute
         */
        public java.lang.String getCompany()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPANY$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "company" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCompany()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COMPANY$4);
                return target;
            }
        }
        
        /**
         * True if has "company" attribute
         */
        public boolean isSetCompany()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COMPANY$4) != null;
            }
        }
        
        /**
         * Sets the "company" attribute
         */
        public void setCompany(java.lang.String company)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPANY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPANY$4);
                }
                target.setStringValue(company);
            }
        }
        
        /**
         * Sets (as xml) the "company" attribute
         */
        public void xsetCompany(org.apache.xmlbeans.XmlString company)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COMPANY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COMPANY$4);
                }
                target.set(company);
            }
        }
        
        /**
         * Unsets the "company" attribute
         */
        public void unsetCompany()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COMPANY$4);
            }
        }
        
        /**
         * Gets the "companyURL" attribute
         */
        public java.lang.String getCompanyURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPANYURL$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "companyURL" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCompanyURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COMPANYURL$6);
                return target;
            }
        }
        
        /**
         * True if has "companyURL" attribute
         */
        public boolean isSetCompanyURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COMPANYURL$6) != null;
            }
        }
        
        /**
         * Sets the "companyURL" attribute
         */
        public void setCompanyURL(java.lang.String companyURL)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPANYURL$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPANYURL$6);
                }
                target.setStringValue(companyURL);
            }
        }
        
        /**
         * Sets (as xml) the "companyURL" attribute
         */
        public void xsetCompanyURL(org.apache.xmlbeans.XmlString companyURL)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COMPANYURL$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COMPANYURL$6);
                }
                target.set(companyURL);
            }
        }
        
        /**
         * Unsets the "companyURL" attribute
         */
        public void unsetCompanyURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COMPANYURL$6);
            }
        }
        
        /**
         * Gets the "timeStamp" attribute
         */
        public java.util.Calendar getTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$8);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "timeStamp" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$8);
                return target;
            }
        }
        
        /**
         * True if has "timeStamp" attribute
         */
        public boolean isSetTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TIMESTAMP$8) != null;
            }
        }
        
        /**
         * Sets the "timeStamp" attribute
         */
        public void setTimeStamp(java.util.Calendar timeStamp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESTAMP$8);
                }
                target.setCalendarValue(timeStamp);
            }
        }
        
        /**
         * Sets (as xml) the "timeStamp" attribute
         */
        public void xsetTimeStamp(org.apache.xmlbeans.XmlDateTime timeStamp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(TIMESTAMP$8);
                }
                target.set(timeStamp);
            }
        }
        
        /**
         * Unsets the "timeStamp" attribute
         */
        public void unsetTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TIMESTAMP$8);
            }
        }
    }
}
