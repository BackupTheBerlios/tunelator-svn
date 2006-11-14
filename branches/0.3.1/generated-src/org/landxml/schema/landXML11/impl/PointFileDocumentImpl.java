/*
 * An XML document type.
 * Localname: PointFile
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PointFileDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one PointFile(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class PointFileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PointFileDocument
{
    
    public PointFileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINTFILE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PointFile");
    
    
    /**
     * Gets the "PointFile" element
     */
    public org.landxml.schema.landXML11.PointFileDocument.PointFile getPointFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointFileDocument.PointFile target = null;
            target = (org.landxml.schema.landXML11.PointFileDocument.PointFile)get_store().find_element_user(POINTFILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PointFile" element
     */
    public void setPointFile(org.landxml.schema.landXML11.PointFileDocument.PointFile pointFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointFileDocument.PointFile target = null;
            target = (org.landxml.schema.landXML11.PointFileDocument.PointFile)get_store().find_element_user(POINTFILE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PointFileDocument.PointFile)get_store().add_element_user(POINTFILE$0);
            }
            target.set(pointFile);
        }
    }
    
    /**
     * Appends and returns a new empty "PointFile" element
     */
    public org.landxml.schema.landXML11.PointFileDocument.PointFile addNewPointFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointFileDocument.PointFile target = null;
            target = (org.landxml.schema.landXML11.PointFileDocument.PointFile)get_store().add_element_user(POINTFILE$0);
            return target;
        }
    }
    /**
     * An XML PointFile(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class PointFileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PointFileDocument.PointFile
    {
        
        public PointFileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FILENAME$0 = 
            new javax.xml.namespace.QName("", "fileName");
        private static final javax.xml.namespace.QName FILETYPE$2 = 
            new javax.xml.namespace.QName("", "fileType");
        private static final javax.xml.namespace.QName FILEFORMAT$4 = 
            new javax.xml.namespace.QName("", "fileFormat");
        
        
        /**
         * Gets the "fileName" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(FILENAME$0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "fileName" attribute
         */
        public void setFileName(org.apache.xmlbeans.XmlAnySimpleType fileName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(FILENAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(FILENAME$0);
                }
                target.set(fileName);
            }
        }
        
        /**
         * Appends and returns a new empty "fileName" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(FILENAME$0);
                return target;
            }
        }
        
        /**
         * Gets the "fileType" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getFileType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(FILETYPE$2);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "fileType" attribute
         */
        public void setFileType(org.apache.xmlbeans.XmlAnySimpleType fileType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(FILETYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(FILETYPE$2);
                }
                target.set(fileType);
            }
        }
        
        /**
         * Appends and returns a new empty "fileType" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewFileType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(FILETYPE$2);
                return target;
            }
        }
        
        /**
         * Gets the "fileFormat" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getFileFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(FILEFORMAT$4);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "fileFormat" attribute
         */
        public void setFileFormat(org.apache.xmlbeans.XmlAnySimpleType fileFormat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(FILEFORMAT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(FILEFORMAT$4);
                }
                target.set(fileFormat);
            }
        }
        
        /**
         * Appends and returns a new empty "fileFormat" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewFileFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(FILEFORMAT$4);
                return target;
            }
        }
    }
}
