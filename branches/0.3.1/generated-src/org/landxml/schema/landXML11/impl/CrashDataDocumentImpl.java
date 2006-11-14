/*
 * An XML document type.
 * Localname: CrashData
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CrashDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one CrashData(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class CrashDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CrashDataDocument
{
    
    public CrashDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CRASHDATA$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CrashData");
    
    
    /**
     * Gets the "CrashData" element
     */
    public org.landxml.schema.landXML11.CrashDataDocument.CrashData getCrashData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CrashDataDocument.CrashData target = null;
            target = (org.landxml.schema.landXML11.CrashDataDocument.CrashData)get_store().find_element_user(CRASHDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CrashData" element
     */
    public void setCrashData(org.landxml.schema.landXML11.CrashDataDocument.CrashData crashData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CrashDataDocument.CrashData target = null;
            target = (org.landxml.schema.landXML11.CrashDataDocument.CrashData)get_store().find_element_user(CRASHDATA$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.CrashDataDocument.CrashData)get_store().add_element_user(CRASHDATA$0);
            }
            target.set(crashData);
        }
    }
    
    /**
     * Appends and returns a new empty "CrashData" element
     */
    public org.landxml.schema.landXML11.CrashDataDocument.CrashData addNewCrashData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CrashDataDocument.CrashData target = null;
            target = (org.landxml.schema.landXML11.CrashDataDocument.CrashData)get_store().add_element_user(CRASHDATA$0);
            return target;
        }
    }
    /**
     * An XML CrashData(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class CrashDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CrashDataDocument.CrashData
    {
        
        public CrashDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CRASHHISTORY$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CrashHistory");
        private static final javax.xml.namespace.QName FEATURE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        
        
        /**
         * Gets a List of "CrashHistory" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory> getCrashHistoryList()
        {
            final class CrashHistoryList extends java.util.AbstractList<org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory>
            {
                public org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory get(int i)
                    { return CrashDataImpl.this.getCrashHistoryArray(i); }
                
                public org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory set(int i, org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory o)
                {
                    org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory old = CrashDataImpl.this.getCrashHistoryArray(i);
                    CrashDataImpl.this.setCrashHistoryArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory o)
                    { CrashDataImpl.this.insertNewCrashHistory(i).set(o); }
                
                public org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory remove(int i)
                {
                    org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory old = CrashDataImpl.this.getCrashHistoryArray(i);
                    CrashDataImpl.this.removeCrashHistory(i);
                    return old;
                }
                
                public int size()
                    { return CrashDataImpl.this.sizeOfCrashHistoryArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CrashHistoryList();
            }
        }
        
        /**
         * Gets array of all "CrashHistory" elements
         */
        public org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory[] getCrashHistoryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CRASHHISTORY$0, targetList);
                org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory[] result = new org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CrashHistory" element
         */
        public org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory getCrashHistoryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory target = null;
                target = (org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory)get_store().find_element_user(CRASHHISTORY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CrashHistory" element
         */
        public int sizeOfCrashHistoryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CRASHHISTORY$0);
            }
        }
        
        /**
         * Sets array of all "CrashHistory" element
         */
        public void setCrashHistoryArray(org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory[] crashHistoryArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(crashHistoryArray, CRASHHISTORY$0);
            }
        }
        
        /**
         * Sets ith "CrashHistory" element
         */
        public void setCrashHistoryArray(int i, org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory crashHistory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory target = null;
                target = (org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory)get_store().find_element_user(CRASHHISTORY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(crashHistory);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CrashHistory" element
         */
        public org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory insertNewCrashHistory(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory target = null;
                target = (org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory)get_store().insert_element_user(CRASHHISTORY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CrashHistory" element
         */
        public org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory addNewCrashHistory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory target = null;
                target = (org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory)get_store().add_element_user(CRASHHISTORY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "CrashHistory" element
         */
        public void removeCrashHistory(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CRASHHISTORY$0, i);
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
                    { return CrashDataImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CrashDataImpl.this.getFeatureArray(i);
                    CrashDataImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { CrashDataImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CrashDataImpl.this.getFeatureArray(i);
                    CrashDataImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return CrashDataImpl.this.sizeOfFeatureArray(); }
                
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
