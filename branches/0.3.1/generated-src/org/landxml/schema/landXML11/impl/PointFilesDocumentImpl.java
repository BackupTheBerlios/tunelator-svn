/*
 * An XML document type.
 * Localname: PointFiles
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PointFilesDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one PointFiles(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class PointFilesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PointFilesDocument
{
    
    public PointFilesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINTFILES$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PointFiles");
    
    
    /**
     * Gets the "PointFiles" element
     */
    public org.landxml.schema.landXML11.PointFilesDocument.PointFiles getPointFiles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointFilesDocument.PointFiles target = null;
            target = (org.landxml.schema.landXML11.PointFilesDocument.PointFiles)get_store().find_element_user(POINTFILES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PointFiles" element
     */
    public void setPointFiles(org.landxml.schema.landXML11.PointFilesDocument.PointFiles pointFiles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointFilesDocument.PointFiles target = null;
            target = (org.landxml.schema.landXML11.PointFilesDocument.PointFiles)get_store().find_element_user(POINTFILES$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PointFilesDocument.PointFiles)get_store().add_element_user(POINTFILES$0);
            }
            target.set(pointFiles);
        }
    }
    
    /**
     * Appends and returns a new empty "PointFiles" element
     */
    public org.landxml.schema.landXML11.PointFilesDocument.PointFiles addNewPointFiles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointFilesDocument.PointFiles target = null;
            target = (org.landxml.schema.landXML11.PointFilesDocument.PointFiles)get_store().add_element_user(POINTFILES$0);
            return target;
        }
    }
    /**
     * An XML PointFiles(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class PointFilesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PointFilesDocument.PointFiles
    {
        
        public PointFilesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName POINTFILE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PointFile");
        private static final javax.xml.namespace.QName FEATURE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        
        
        /**
         * Gets a List of "PointFile" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PointFileDocument.PointFile> getPointFileList()
        {
            final class PointFileList extends java.util.AbstractList<org.landxml.schema.landXML11.PointFileDocument.PointFile>
            {
                public org.landxml.schema.landXML11.PointFileDocument.PointFile get(int i)
                    { return PointFilesImpl.this.getPointFileArray(i); }
                
                public org.landxml.schema.landXML11.PointFileDocument.PointFile set(int i, org.landxml.schema.landXML11.PointFileDocument.PointFile o)
                {
                    org.landxml.schema.landXML11.PointFileDocument.PointFile old = PointFilesImpl.this.getPointFileArray(i);
                    PointFilesImpl.this.setPointFileArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PointFileDocument.PointFile o)
                    { PointFilesImpl.this.insertNewPointFile(i).set(o); }
                
                public org.landxml.schema.landXML11.PointFileDocument.PointFile remove(int i)
                {
                    org.landxml.schema.landXML11.PointFileDocument.PointFile old = PointFilesImpl.this.getPointFileArray(i);
                    PointFilesImpl.this.removePointFile(i);
                    return old;
                }
                
                public int size()
                    { return PointFilesImpl.this.sizeOfPointFileArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PointFileList();
            }
        }
        
        /**
         * Gets array of all "PointFile" elements
         */
        public org.landxml.schema.landXML11.PointFileDocument.PointFile[] getPointFileArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(POINTFILE$0, targetList);
                org.landxml.schema.landXML11.PointFileDocument.PointFile[] result = new org.landxml.schema.landXML11.PointFileDocument.PointFile[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PointFile" element
         */
        public org.landxml.schema.landXML11.PointFileDocument.PointFile getPointFileArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointFileDocument.PointFile target = null;
                target = (org.landxml.schema.landXML11.PointFileDocument.PointFile)get_store().find_element_user(POINTFILE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PointFile" element
         */
        public int sizeOfPointFileArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(POINTFILE$0);
            }
        }
        
        /**
         * Sets array of all "PointFile" element
         */
        public void setPointFileArray(org.landxml.schema.landXML11.PointFileDocument.PointFile[] pointFileArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pointFileArray, POINTFILE$0);
            }
        }
        
        /**
         * Sets ith "PointFile" element
         */
        public void setPointFileArray(int i, org.landxml.schema.landXML11.PointFileDocument.PointFile pointFile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointFileDocument.PointFile target = null;
                target = (org.landxml.schema.landXML11.PointFileDocument.PointFile)get_store().find_element_user(POINTFILE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(pointFile);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PointFile" element
         */
        public org.landxml.schema.landXML11.PointFileDocument.PointFile insertNewPointFile(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointFileDocument.PointFile target = null;
                target = (org.landxml.schema.landXML11.PointFileDocument.PointFile)get_store().insert_element_user(POINTFILE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PointFile" element
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
         * Removes the ith "PointFile" element
         */
        public void removePointFile(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(POINTFILE$0, i);
            }
        }
        
        /**
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return PointFilesImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = PointFilesImpl.this.getFeatureArray(i);
                    PointFilesImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { PointFilesImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = PointFilesImpl.this.getFeatureArray(i);
                    PointFilesImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return PointFilesImpl.this.sizeOfFeatureArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FeatureList();
            }
        }
        
        /**
         * Gets array of all "Feature" elements
         */
        public org.landxml.schema.landXML11.FeatureDocument.Feature[] getFeatureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FEATURE$2, targetList);
                org.landxml.schema.landXML11.FeatureDocument.Feature[] result = new org.landxml.schema.landXML11.FeatureDocument.Feature[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Feature" element
         */
        public org.landxml.schema.landXML11.FeatureDocument.Feature getFeatureArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FeatureDocument.Feature target = null;
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Feature" element
         */
        public int sizeOfFeatureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FEATURE$2);
            }
        }
        
        /**
         * Sets array of all "Feature" element
         */
        public void setFeatureArray(org.landxml.schema.landXML11.FeatureDocument.Feature[] featureArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(featureArray, FEATURE$2);
            }
        }
        
        /**
         * Sets ith "Feature" element
         */
        public void setFeatureArray(int i, org.landxml.schema.landXML11.FeatureDocument.Feature feature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FeatureDocument.Feature target = null;
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(feature);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Feature" element
         */
        public org.landxml.schema.landXML11.FeatureDocument.Feature insertNewFeature(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FeatureDocument.Feature target = null;
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Feature" element
         */
        public org.landxml.schema.landXML11.FeatureDocument.Feature addNewFeature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FeatureDocument.Feature target = null;
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Feature" element
         */
        public void removeFeature(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FEATURE$2, i);
            }
        }
    }
}
