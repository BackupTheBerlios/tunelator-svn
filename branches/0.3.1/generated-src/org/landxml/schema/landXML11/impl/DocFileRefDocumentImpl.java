/*
 * An XML document type.
 * Localname: DocFileRef
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.DocFileRefDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one DocFileRef(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class DocFileRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.DocFileRefDocument
{
    
    public DocFileRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCFILEREF$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "DocFileRef");
    
    
    /**
     * Gets the "DocFileRef" element
     */
    public org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef getDocFileRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef target = null;
            target = (org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef)get_store().find_element_user(DOCFILEREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DocFileRef" element
     */
    public void setDocFileRef(org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef docFileRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef target = null;
            target = (org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef)get_store().find_element_user(DOCFILEREF$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef)get_store().add_element_user(DOCFILEREF$0);
            }
            target.set(docFileRef);
        }
    }
    
    /**
     * Appends and returns a new empty "DocFileRef" element
     */
    public org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef addNewDocFileRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef target = null;
            target = (org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef)get_store().add_element_user(DOCFILEREF$0);
            return target;
        }
    }
    /**
     * An XML DocFileRef(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class DocFileRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef
    {
        
        public DocFileRefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName LOCATION$2 = 
            new javax.xml.namespace.QName("", "location");
        private static final javax.xml.namespace.QName FILETYPE$4 = 
            new javax.xml.namespace.QName("", "fileType");
        private static final javax.xml.namespace.QName FILEFORMAT$6 = 
            new javax.xml.namespace.QName("", "fileFormat");
        
        
        /**
         * Gets the "name" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(org.apache.xmlbeans.XmlAnySimpleType name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Appends and returns a new empty "name" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(NAME$0);
                return target;
            }
        }
        
        /**
         * Gets the "location" attribute
         */
        public java.lang.String getLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "location" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(LOCATION$2);
                return target;
            }
        }
        
        /**
         * Sets the "location" attribute
         */
        public void setLocation(java.lang.String location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATION$2);
                }
                target.setStringValue(location);
            }
        }
        
        /**
         * Sets (as xml) the "location" attribute
         */
        public void xsetLocation(org.apache.xmlbeans.XmlAnyURI location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(LOCATION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(LOCATION$2);
                }
                target.set(location);
            }
        }
        
        /**
         * Gets the "fileType" attribute
         */
        public java.lang.String getFileType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILETYPE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fileType" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFileType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILETYPE$4);
                return target;
            }
        }
        
        /**
         * True if has "fileType" attribute
         */
        public boolean isSetFileType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FILETYPE$4) != null;
            }
        }
        
        /**
         * Sets the "fileType" attribute
         */
        public void setFileType(java.lang.String fileType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILETYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILETYPE$4);
                }
                target.setStringValue(fileType);
            }
        }
        
        /**
         * Sets (as xml) the "fileType" attribute
         */
        public void xsetFileType(org.apache.xmlbeans.XmlString fileType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILETYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FILETYPE$4);
                }
                target.set(fileType);
            }
        }
        
        /**
         * Unsets the "fileType" attribute
         */
        public void unsetFileType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FILETYPE$4);
            }
        }
        
        /**
         * Gets the "fileFormat" attribute
         */
        public java.lang.String getFileFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILEFORMAT$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fileFormat" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFileFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILEFORMAT$6);
                return target;
            }
        }
        
        /**
         * True if has "fileFormat" attribute
         */
        public boolean isSetFileFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FILEFORMAT$6) != null;
            }
        }
        
        /**
         * Sets the "fileFormat" attribute
         */
        public void setFileFormat(java.lang.String fileFormat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILEFORMAT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILEFORMAT$6);
                }
                target.setStringValue(fileFormat);
            }
        }
        
        /**
         * Sets (as xml) the "fileFormat" attribute
         */
        public void xsetFileFormat(org.apache.xmlbeans.XmlString fileFormat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILEFORMAT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FILEFORMAT$6);
                }
                target.set(fileFormat);
            }
        }
        
        /**
         * Unsets the "fileFormat" attribute
         */
        public void unsetFileFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FILEFORMAT$6);
            }
        }
    }
}
