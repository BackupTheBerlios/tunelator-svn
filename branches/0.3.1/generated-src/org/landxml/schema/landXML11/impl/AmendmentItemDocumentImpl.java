/*
 * An XML document type.
 * Localname: AmendmentItem
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.AmendmentItemDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one AmendmentItem(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class AmendmentItemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.AmendmentItemDocument
{
    
    public AmendmentItemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AMENDMENTITEM$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "AmendmentItem");
    
    
    /**
     * Gets the "AmendmentItem" element
     */
    public org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem getAmendmentItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem target = null;
            target = (org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem)get_store().find_element_user(AMENDMENTITEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AmendmentItem" element
     */
    public void setAmendmentItem(org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem amendmentItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem target = null;
            target = (org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem)get_store().find_element_user(AMENDMENTITEM$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem)get_store().add_element_user(AMENDMENTITEM$0);
            }
            target.set(amendmentItem);
        }
    }
    
    /**
     * Appends and returns a new empty "AmendmentItem" element
     */
    public org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem addNewAmendmentItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem target = null;
            target = (org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem)get_store().add_element_user(AMENDMENTITEM$0);
            return target;
        }
    }
    /**
     * An XML AmendmentItem(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class AmendmentItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem
    {
        
        public AmendmentItemImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ELEMENTNAME$0 = 
            new javax.xml.namespace.QName("", "elementName");
        private static final javax.xml.namespace.QName OLDNAME$2 = 
            new javax.xml.namespace.QName("", "oldName");
        private static final javax.xml.namespace.QName NEWNAME$4 = 
            new javax.xml.namespace.QName("", "newName");
        
        
        /**
         * Gets the "elementName" attribute
         */
        public java.lang.String getElementName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEMENTNAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "elementName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetElementName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ELEMENTNAME$0);
                return target;
            }
        }
        
        /**
         * True if has "elementName" attribute
         */
        public boolean isSetElementName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ELEMENTNAME$0) != null;
            }
        }
        
        /**
         * Sets the "elementName" attribute
         */
        public void setElementName(java.lang.String elementName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEMENTNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELEMENTNAME$0);
                }
                target.setStringValue(elementName);
            }
        }
        
        /**
         * Sets (as xml) the "elementName" attribute
         */
        public void xsetElementName(org.apache.xmlbeans.XmlString elementName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ELEMENTNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ELEMENTNAME$0);
                }
                target.set(elementName);
            }
        }
        
        /**
         * Unsets the "elementName" attribute
         */
        public void unsetElementName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ELEMENTNAME$0);
            }
        }
        
        /**
         * Gets the "oldName" attribute
         */
        public java.lang.String getOldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDNAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "oldName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OLDNAME$2);
                return target;
            }
        }
        
        /**
         * True if has "oldName" attribute
         */
        public boolean isSetOldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OLDNAME$2) != null;
            }
        }
        
        /**
         * Sets the "oldName" attribute
         */
        public void setOldName(java.lang.String oldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLDNAME$2);
                }
                target.setStringValue(oldName);
            }
        }
        
        /**
         * Sets (as xml) the "oldName" attribute
         */
        public void xsetOldName(org.apache.xmlbeans.XmlString oldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OLDNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OLDNAME$2);
                }
                target.set(oldName);
            }
        }
        
        /**
         * Unsets the "oldName" attribute
         */
        public void unsetOldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OLDNAME$2);
            }
        }
        
        /**
         * Gets the "newName" attribute
         */
        public java.lang.String getNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEWNAME$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "newName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NEWNAME$4);
                return target;
            }
        }
        
        /**
         * True if has "newName" attribute
         */
        public boolean isSetNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NEWNAME$4) != null;
            }
        }
        
        /**
         * Sets the "newName" attribute
         */
        public void setNewName(java.lang.String newName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEWNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NEWNAME$4);
                }
                target.setStringValue(newName);
            }
        }
        
        /**
         * Sets (as xml) the "newName" attribute
         */
        public void xsetNewName(org.apache.xmlbeans.XmlString newName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NEWNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NEWNAME$4);
                }
                target.set(newName);
            }
        }
        
        /**
         * Unsets the "newName" attribute
         */
        public void unsetNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NEWNAME$4);
            }
        }
    }
}
