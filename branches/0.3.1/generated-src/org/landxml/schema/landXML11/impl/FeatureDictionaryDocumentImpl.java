/*
 * An XML document type.
 * Localname: FeatureDictionary
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.FeatureDictionaryDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one FeatureDictionary(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class FeatureDictionaryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.FeatureDictionaryDocument
{
    
    public FeatureDictionaryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATUREDICTIONARY$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FeatureDictionary");
    
    
    /**
     * Gets the "FeatureDictionary" element
     */
    public org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary getFeatureDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary target = null;
            target = (org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary)get_store().find_element_user(FEATUREDICTIONARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FeatureDictionary" element
     */
    public void setFeatureDictionary(org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary featureDictionary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary target = null;
            target = (org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary)get_store().find_element_user(FEATUREDICTIONARY$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary)get_store().add_element_user(FEATUREDICTIONARY$0);
            }
            target.set(featureDictionary);
        }
    }
    
    /**
     * Appends and returns a new empty "FeatureDictionary" element
     */
    public org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary addNewFeatureDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary target = null;
            target = (org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary)get_store().add_element_user(FEATUREDICTIONARY$0);
            return target;
        }
    }
    /**
     * An XML FeatureDictionary(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class FeatureDictionaryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary
    {
        
        public FeatureDictionaryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DOCFILEREF$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "DocFileRef");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName VERSION$4 = 
            new javax.xml.namespace.QName("", "version");
        
        
        /**
         * Gets a List of "DocFileRef" elements
         */
        public java.util.List<org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef> getDocFileRefList()
        {
            final class DocFileRefList extends java.util.AbstractList<org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef>
            {
                public org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef get(int i)
                    { return FeatureDictionaryImpl.this.getDocFileRefArray(i); }
                
                public org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef set(int i, org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef o)
                {
                    org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef old = FeatureDictionaryImpl.this.getDocFileRefArray(i);
                    FeatureDictionaryImpl.this.setDocFileRefArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef o)
                    { FeatureDictionaryImpl.this.insertNewDocFileRef(i).set(o); }
                
                public org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef remove(int i)
                {
                    org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef old = FeatureDictionaryImpl.this.getDocFileRefArray(i);
                    FeatureDictionaryImpl.this.removeDocFileRef(i);
                    return old;
                }
                
                public int size()
                    { return FeatureDictionaryImpl.this.sizeOfDocFileRefArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DocFileRefList();
            }
        }
        
        /**
         * Gets array of all "DocFileRef" elements
         */
        public org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef[] getDocFileRefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DOCFILEREF$0, targetList);
                org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef[] result = new org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "DocFileRef" element
         */
        public org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef getDocFileRefArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef target = null;
                target = (org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef)get_store().find_element_user(DOCFILEREF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "DocFileRef" element
         */
        public int sizeOfDocFileRefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DOCFILEREF$0);
            }
        }
        
        /**
         * Sets array of all "DocFileRef" element
         */
        public void setDocFileRefArray(org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef[] docFileRefArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(docFileRefArray, DOCFILEREF$0);
            }
        }
        
        /**
         * Sets ith "DocFileRef" element
         */
        public void setDocFileRefArray(int i, org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef docFileRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef target = null;
                target = (org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef)get_store().find_element_user(DOCFILEREF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(docFileRef);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DocFileRef" element
         */
        public org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef insertNewDocFileRef(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef target = null;
                target = (org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef)get_store().insert_element_user(DOCFILEREF$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DocFileRef" element
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
         * Removes the ith "DocFileRef" element
         */
        public void removeDocFileRef(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DOCFILEREF$0, i);
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
         * Gets the "version" attribute
         */
        public java.lang.String getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$4);
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
                return get_store().find_attribute_user(VERSION$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSION$4);
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
                get_store().remove_attribute(VERSION$4);
            }
        }
    }
}
