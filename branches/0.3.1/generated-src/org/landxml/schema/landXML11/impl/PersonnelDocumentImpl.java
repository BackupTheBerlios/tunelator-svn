/*
 * An XML document type.
 * Localname: Personnel
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PersonnelDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Personnel(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class PersonnelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PersonnelDocument
{
    
    public PersonnelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONNEL$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Personnel");
    
    
    /**
     * Gets the "Personnel" element
     */
    public org.landxml.schema.landXML11.PersonnelDocument.Personnel getPersonnel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PersonnelDocument.Personnel target = null;
            target = (org.landxml.schema.landXML11.PersonnelDocument.Personnel)get_store().find_element_user(PERSONNEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Personnel" element
     */
    public void setPersonnel(org.landxml.schema.landXML11.PersonnelDocument.Personnel personnel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PersonnelDocument.Personnel target = null;
            target = (org.landxml.schema.landXML11.PersonnelDocument.Personnel)get_store().find_element_user(PERSONNEL$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PersonnelDocument.Personnel)get_store().add_element_user(PERSONNEL$0);
            }
            target.set(personnel);
        }
    }
    
    /**
     * Appends and returns a new empty "Personnel" element
     */
    public org.landxml.schema.landXML11.PersonnelDocument.Personnel addNewPersonnel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PersonnelDocument.Personnel target = null;
            target = (org.landxml.schema.landXML11.PersonnelDocument.Personnel)get_store().add_element_user(PERSONNEL$0);
            return target;
        }
    }
    /**
     * An XML Personnel(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class PersonnelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PersonnelDocument.Personnel
    {
        
        public PersonnelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName ROLE$2 = 
            new javax.xml.namespace.QName("", "role");
        private static final javax.xml.namespace.QName REGTYPE$4 = 
            new javax.xml.namespace.QName("", "regType");
        private static final javax.xml.namespace.QName REGNUMBER$6 = 
            new javax.xml.namespace.QName("", "regNumber");
        
        
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
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$0) != null;
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
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$0);
            }
        }
        
        /**
         * Gets the "role" attribute
         */
        public java.lang.String getRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "role" attribute
         */
        public org.landxml.schema.landXML11.SurveyorRoleType xgetRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyorRoleType target = null;
                target = (org.landxml.schema.landXML11.SurveyorRoleType)get_store().find_attribute_user(ROLE$2);
                return target;
            }
        }
        
        /**
         * True if has "role" attribute
         */
        public boolean isSetRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ROLE$2) != null;
            }
        }
        
        /**
         * Sets the "role" attribute
         */
        public void setRole(java.lang.String role)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLE$2);
                }
                target.setStringValue(role);
            }
        }
        
        /**
         * Sets (as xml) the "role" attribute
         */
        public void xsetRole(org.landxml.schema.landXML11.SurveyorRoleType role)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyorRoleType target = null;
                target = (org.landxml.schema.landXML11.SurveyorRoleType)get_store().find_attribute_user(ROLE$2);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SurveyorRoleType)get_store().add_attribute_user(ROLE$2);
                }
                target.set(role);
            }
        }
        
        /**
         * Unsets the "role" attribute
         */
        public void unsetRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ROLE$2);
            }
        }
        
        /**
         * Gets the "regType" attribute
         */
        public java.lang.String getRegType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REGTYPE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "regType" attribute
         */
        public org.landxml.schema.landXML11.RegistrationType xgetRegType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RegistrationType target = null;
                target = (org.landxml.schema.landXML11.RegistrationType)get_store().find_attribute_user(REGTYPE$4);
                return target;
            }
        }
        
        /**
         * True if has "regType" attribute
         */
        public boolean isSetRegType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REGTYPE$4) != null;
            }
        }
        
        /**
         * Sets the "regType" attribute
         */
        public void setRegType(java.lang.String regType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REGTYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REGTYPE$4);
                }
                target.setStringValue(regType);
            }
        }
        
        /**
         * Sets (as xml) the "regType" attribute
         */
        public void xsetRegType(org.landxml.schema.landXML11.RegistrationType regType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RegistrationType target = null;
                target = (org.landxml.schema.landXML11.RegistrationType)get_store().find_attribute_user(REGTYPE$4);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.RegistrationType)get_store().add_attribute_user(REGTYPE$4);
                }
                target.set(regType);
            }
        }
        
        /**
         * Unsets the "regType" attribute
         */
        public void unsetRegType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REGTYPE$4);
            }
        }
        
        /**
         * Gets the "regNumber" attribute
         */
        public java.lang.String getRegNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REGNUMBER$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "regNumber" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRegNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REGNUMBER$6);
                return target;
            }
        }
        
        /**
         * True if has "regNumber" attribute
         */
        public boolean isSetRegNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REGNUMBER$6) != null;
            }
        }
        
        /**
         * Sets the "regNumber" attribute
         */
        public void setRegNumber(java.lang.String regNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REGNUMBER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REGNUMBER$6);
                }
                target.setStringValue(regNumber);
            }
        }
        
        /**
         * Sets (as xml) the "regNumber" attribute
         */
        public void xsetRegNumber(org.apache.xmlbeans.XmlString regNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REGNUMBER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REGNUMBER$6);
                }
                target.set(regNumber);
            }
        }
        
        /**
         * Unsets the "regNumber" attribute
         */
        public void unsetRegNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REGNUMBER$6);
            }
        }
    }
}
