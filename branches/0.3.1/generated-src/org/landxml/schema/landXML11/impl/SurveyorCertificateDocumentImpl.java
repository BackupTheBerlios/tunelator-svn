/*
 * An XML document type.
 * Localname: SurveyorCertificate
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.SurveyorCertificateDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one SurveyorCertificate(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class SurveyorCertificateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SurveyorCertificateDocument
{
    
    public SurveyorCertificateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURVEYORCERTIFICATE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "SurveyorCertificate");
    
    
    /**
     * Gets the "SurveyorCertificate" element
     */
    public org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate getSurveyorCertificate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate target = null;
            target = (org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate)get_store().find_element_user(SURVEYORCERTIFICATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SurveyorCertificate" element
     */
    public void setSurveyorCertificate(org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate surveyorCertificate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate target = null;
            target = (org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate)get_store().find_element_user(SURVEYORCERTIFICATE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate)get_store().add_element_user(SURVEYORCERTIFICATE$0);
            }
            target.set(surveyorCertificate);
        }
    }
    
    /**
     * Appends and returns a new empty "SurveyorCertificate" element
     */
    public org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate addNewSurveyorCertificate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate target = null;
            target = (org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate)get_store().add_element_user(SURVEYORCERTIFICATE$0);
            return target;
        }
    }
    /**
     * An XML SurveyorCertificate(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class SurveyorCertificateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate
    {
        
        public SurveyorCertificateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName CERTIFICATETYPE$2 = 
            new javax.xml.namespace.QName("", "certificateType");
        private static final javax.xml.namespace.QName TEXTCERTIFICATE$4 = 
            new javax.xml.namespace.QName("", "textCertificate");
        private static final javax.xml.namespace.QName SURVEYDATE$6 = 
            new javax.xml.namespace.QName("", "surveyDate");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "certificateType" attribute
         */
        public java.lang.String getCertificateType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CERTIFICATETYPE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "certificateType" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCertificateType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CERTIFICATETYPE$2);
                return target;
            }
        }
        
        /**
         * True if has "certificateType" attribute
         */
        public boolean isSetCertificateType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CERTIFICATETYPE$2) != null;
            }
        }
        
        /**
         * Sets the "certificateType" attribute
         */
        public void setCertificateType(java.lang.String certificateType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CERTIFICATETYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CERTIFICATETYPE$2);
                }
                target.setStringValue(certificateType);
            }
        }
        
        /**
         * Sets (as xml) the "certificateType" attribute
         */
        public void xsetCertificateType(org.apache.xmlbeans.XmlString certificateType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CERTIFICATETYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CERTIFICATETYPE$2);
                }
                target.set(certificateType);
            }
        }
        
        /**
         * Unsets the "certificateType" attribute
         */
        public void unsetCertificateType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CERTIFICATETYPE$2);
            }
        }
        
        /**
         * Gets the "textCertificate" attribute
         */
        public java.lang.String getTextCertificate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTCERTIFICATE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "textCertificate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTextCertificate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTCERTIFICATE$4);
                return target;
            }
        }
        
        /**
         * True if has "textCertificate" attribute
         */
        public boolean isSetTextCertificate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TEXTCERTIFICATE$4) != null;
            }
        }
        
        /**
         * Sets the "textCertificate" attribute
         */
        public void setTextCertificate(java.lang.String textCertificate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTCERTIFICATE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTCERTIFICATE$4);
                }
                target.setStringValue(textCertificate);
            }
        }
        
        /**
         * Sets (as xml) the "textCertificate" attribute
         */
        public void xsetTextCertificate(org.apache.xmlbeans.XmlString textCertificate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTCERTIFICATE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTCERTIFICATE$4);
                }
                target.set(textCertificate);
            }
        }
        
        /**
         * Unsets the "textCertificate" attribute
         */
        public void unsetTextCertificate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TEXTCERTIFICATE$4);
            }
        }
        
        /**
         * Gets the "surveyDate" attribute
         */
        public java.util.Calendar getSurveyDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYDATE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "surveyDate" attribute
         */
        public org.apache.xmlbeans.XmlDate xgetSurveyDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(SURVEYDATE$6);
                return target;
            }
        }
        
        /**
         * True if has "surveyDate" attribute
         */
        public boolean isSetSurveyDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SURVEYDATE$6) != null;
            }
        }
        
        /**
         * Sets the "surveyDate" attribute
         */
        public void setSurveyDate(java.util.Calendar surveyDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYDATE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SURVEYDATE$6);
                }
                target.setCalendarValue(surveyDate);
            }
        }
        
        /**
         * Sets (as xml) the "surveyDate" attribute
         */
        public void xsetSurveyDate(org.apache.xmlbeans.XmlDate surveyDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(SURVEYDATE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(SURVEYDATE$6);
                }
                target.set(surveyDate);
            }
        }
        
        /**
         * Unsets the "surveyDate" attribute
         */
        public void unsetSurveyDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SURVEYDATE$6);
            }
        }
    }
}
