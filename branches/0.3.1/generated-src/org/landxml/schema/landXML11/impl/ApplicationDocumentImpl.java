/*
 * An XML document type.
 * Localname: Application
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ApplicationDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Application(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ApplicationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ApplicationDocument
{
    
    public ApplicationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLICATION$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Application");
    
    
    /**
     * Gets the "Application" element
     */
    public org.landxml.schema.landXML11.ApplicationDocument.Application getApplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ApplicationDocument.Application target = null;
            target = (org.landxml.schema.landXML11.ApplicationDocument.Application)get_store().find_element_user(APPLICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Application" element
     */
    public void setApplication(org.landxml.schema.landXML11.ApplicationDocument.Application application)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ApplicationDocument.Application target = null;
            target = (org.landxml.schema.landXML11.ApplicationDocument.Application)get_store().find_element_user(APPLICATION$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ApplicationDocument.Application)get_store().add_element_user(APPLICATION$0);
            }
            target.set(application);
        }
    }
    
    /**
     * Appends and returns a new empty "Application" element
     */
    public org.landxml.schema.landXML11.ApplicationDocument.Application addNewApplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ApplicationDocument.Application target = null;
            target = (org.landxml.schema.landXML11.ApplicationDocument.Application)get_store().add_element_user(APPLICATION$0);
            return target;
        }
    }
    /**
     * An XML Application(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class ApplicationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ApplicationDocument.Application
    {
        
        public ApplicationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AUTHOR$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Author");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESC$4 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName MANUFACTURER$6 = 
            new javax.xml.namespace.QName("", "manufacturer");
        private static final javax.xml.namespace.QName VERSION$8 = 
            new javax.xml.namespace.QName("", "version");
        private static final javax.xml.namespace.QName MANUFACTURERURL$10 = 
            new javax.xml.namespace.QName("", "manufacturerURL");
        private static final javax.xml.namespace.QName TIMESTAMP$12 = 
            new javax.xml.namespace.QName("", "timeStamp");
        
        
        /**
         * Gets a List of "Author" elements
         */
        public java.util.List<org.landxml.schema.landXML11.AuthorDocument.Author> getAuthorList()
        {
            final class AuthorList extends java.util.AbstractList<org.landxml.schema.landXML11.AuthorDocument.Author>
            {
                public org.landxml.schema.landXML11.AuthorDocument.Author get(int i)
                    { return ApplicationImpl.this.getAuthorArray(i); }
                
                public org.landxml.schema.landXML11.AuthorDocument.Author set(int i, org.landxml.schema.landXML11.AuthorDocument.Author o)
                {
                    org.landxml.schema.landXML11.AuthorDocument.Author old = ApplicationImpl.this.getAuthorArray(i);
                    ApplicationImpl.this.setAuthorArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.AuthorDocument.Author o)
                    { ApplicationImpl.this.insertNewAuthor(i).set(o); }
                
                public org.landxml.schema.landXML11.AuthorDocument.Author remove(int i)
                {
                    org.landxml.schema.landXML11.AuthorDocument.Author old = ApplicationImpl.this.getAuthorArray(i);
                    ApplicationImpl.this.removeAuthor(i);
                    return old;
                }
                
                public int size()
                    { return ApplicationImpl.this.sizeOfAuthorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new AuthorList();
            }
        }
        
        /**
         * Gets array of all "Author" elements
         */
        public org.landxml.schema.landXML11.AuthorDocument.Author[] getAuthorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(AUTHOR$0, targetList);
                org.landxml.schema.landXML11.AuthorDocument.Author[] result = new org.landxml.schema.landXML11.AuthorDocument.Author[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Author" element
         */
        public org.landxml.schema.landXML11.AuthorDocument.Author getAuthorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AuthorDocument.Author target = null;
                target = (org.landxml.schema.landXML11.AuthorDocument.Author)get_store().find_element_user(AUTHOR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Author" element
         */
        public int sizeOfAuthorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AUTHOR$0);
            }
        }
        
        /**
         * Sets array of all "Author" element
         */
        public void setAuthorArray(org.landxml.schema.landXML11.AuthorDocument.Author[] authorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(authorArray, AUTHOR$0);
            }
        }
        
        /**
         * Sets ith "Author" element
         */
        public void setAuthorArray(int i, org.landxml.schema.landXML11.AuthorDocument.Author author)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AuthorDocument.Author target = null;
                target = (org.landxml.schema.landXML11.AuthorDocument.Author)get_store().find_element_user(AUTHOR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(author);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Author" element
         */
        public org.landxml.schema.landXML11.AuthorDocument.Author insertNewAuthor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AuthorDocument.Author target = null;
                target = (org.landxml.schema.landXML11.AuthorDocument.Author)get_store().insert_element_user(AUTHOR$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Author" element
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
         * Removes the ith "Author" element
         */
        public void removeAuthor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AUTHOR$0, i);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "desc" attribute
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "desc" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$4);
                return target;
            }
        }
        
        /**
         * True if has "desc" attribute
         */
        public boolean isSetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DESC$4) != null;
            }
        }
        
        /**
         * Sets the "desc" attribute
         */
        public void setDesc(java.lang.String desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$4);
                }
                target.setStringValue(desc);
            }
        }
        
        /**
         * Sets (as xml) the "desc" attribute
         */
        public void xsetDesc(org.apache.xmlbeans.XmlString desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$4);
                }
                target.set(desc);
            }
        }
        
        /**
         * Unsets the "desc" attribute
         */
        public void unsetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DESC$4);
            }
        }
        
        /**
         * Gets the "manufacturer" attribute
         */
        public java.lang.String getManufacturer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANUFACTURER$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "manufacturer" attribute
         */
        public org.apache.xmlbeans.XmlString xgetManufacturer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MANUFACTURER$6);
                return target;
            }
        }
        
        /**
         * True if has "manufacturer" attribute
         */
        public boolean isSetManufacturer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MANUFACTURER$6) != null;
            }
        }
        
        /**
         * Sets the "manufacturer" attribute
         */
        public void setManufacturer(java.lang.String manufacturer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANUFACTURER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MANUFACTURER$6);
                }
                target.setStringValue(manufacturer);
            }
        }
        
        /**
         * Sets (as xml) the "manufacturer" attribute
         */
        public void xsetManufacturer(org.apache.xmlbeans.XmlString manufacturer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MANUFACTURER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MANUFACTURER$6);
                }
                target.set(manufacturer);
            }
        }
        
        /**
         * Unsets the "manufacturer" attribute
         */
        public void unsetManufacturer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MANUFACTURER$6);
            }
        }
        
        /**
         * Gets the "version" attribute
         */
        public java.lang.String getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "version" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$8);
                return target;
            }
        }
        
        /**
         * True if has "version" attribute
         */
        public boolean isSetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VERSION$8) != null;
            }
        }
        
        /**
         * Sets the "version" attribute
         */
        public void setVersion(java.lang.String version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$8);
                }
                target.setStringValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "version" attribute
         */
        public void xsetVersion(org.apache.xmlbeans.XmlString version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSION$8);
                }
                target.set(version);
            }
        }
        
        /**
         * Unsets the "version" attribute
         */
        public void unsetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VERSION$8);
            }
        }
        
        /**
         * Gets the "manufacturerURL" attribute
         */
        public java.lang.String getManufacturerURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANUFACTURERURL$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "manufacturerURL" attribute
         */
        public org.apache.xmlbeans.XmlString xgetManufacturerURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MANUFACTURERURL$10);
                return target;
            }
        }
        
        /**
         * True if has "manufacturerURL" attribute
         */
        public boolean isSetManufacturerURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MANUFACTURERURL$10) != null;
            }
        }
        
        /**
         * Sets the "manufacturerURL" attribute
         */
        public void setManufacturerURL(java.lang.String manufacturerURL)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANUFACTURERURL$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MANUFACTURERURL$10);
                }
                target.setStringValue(manufacturerURL);
            }
        }
        
        /**
         * Sets (as xml) the "manufacturerURL" attribute
         */
        public void xsetManufacturerURL(org.apache.xmlbeans.XmlString manufacturerURL)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MANUFACTURERURL$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MANUFACTURERURL$10);
                }
                target.set(manufacturerURL);
            }
        }
        
        /**
         * Unsets the "manufacturerURL" attribute
         */
        public void unsetManufacturerURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MANUFACTURERURL$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$12);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$12);
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
                return get_store().find_attribute_user(TIMESTAMP$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESTAMP$12);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(TIMESTAMP$12);
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
                get_store().remove_attribute(TIMESTAMP$12);
            }
        }
    }
}
