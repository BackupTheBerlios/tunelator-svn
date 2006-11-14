/*
 * An XML document type.
 * Localname: PurposeOfSurvey
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PurposeOfSurveyDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one PurposeOfSurvey(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class PurposeOfSurveyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PurposeOfSurveyDocument
{
    
    public PurposeOfSurveyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PURPOSEOFSURVEY$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PurposeOfSurvey");
    
    
    /**
     * Gets the "PurposeOfSurvey" element
     */
    public org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey getPurposeOfSurvey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey target = null;
            target = (org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey)get_store().find_element_user(PURPOSEOFSURVEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PurposeOfSurvey" element
     */
    public void setPurposeOfSurvey(org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey purposeOfSurvey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey target = null;
            target = (org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey)get_store().find_element_user(PURPOSEOFSURVEY$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey)get_store().add_element_user(PURPOSEOFSURVEY$0);
            }
            target.set(purposeOfSurvey);
        }
    }
    
    /**
     * Appends and returns a new empty "PurposeOfSurvey" element
     */
    public org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey addNewPurposeOfSurvey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey target = null;
            target = (org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey)get_store().add_element_user(PURPOSEOFSURVEY$0);
            return target;
        }
    }
    /**
     * An XML PurposeOfSurvey(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class PurposeOfSurveyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey
    {
        
        public PurposeOfSurveyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        
        
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
        public org.landxml.schema.landXML11.PurpSurvType xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PurpSurvType target = null;
                target = (org.landxml.schema.landXML11.PurpSurvType)get_store().find_attribute_user(NAME$0);
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
        public void xsetName(org.landxml.schema.landXML11.PurpSurvType name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PurpSurvType target = null;
                target = (org.landxml.schema.landXML11.PurpSurvType)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PurpSurvType)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
    }
}
