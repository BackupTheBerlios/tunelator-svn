/*
 * An XML document type.
 * Localname: Watersheds
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.WatershedsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Watersheds(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class WatershedsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.WatershedsDocument
{
    
    public WatershedsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WATERSHEDS$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Watersheds");
    
    
    /**
     * Gets the "Watersheds" element
     */
    public org.landxml.schema.landXML11.WatershedsDocument.Watersheds getWatersheds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.WatershedsDocument.Watersheds target = null;
            target = (org.landxml.schema.landXML11.WatershedsDocument.Watersheds)get_store().find_element_user(WATERSHEDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Watersheds" element
     */
    public void setWatersheds(org.landxml.schema.landXML11.WatershedsDocument.Watersheds watersheds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.WatershedsDocument.Watersheds target = null;
            target = (org.landxml.schema.landXML11.WatershedsDocument.Watersheds)get_store().find_element_user(WATERSHEDS$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.WatershedsDocument.Watersheds)get_store().add_element_user(WATERSHEDS$0);
            }
            target.set(watersheds);
        }
    }
    
    /**
     * Appends and returns a new empty "Watersheds" element
     */
    public org.landxml.schema.landXML11.WatershedsDocument.Watersheds addNewWatersheds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.WatershedsDocument.Watersheds target = null;
            target = (org.landxml.schema.landXML11.WatershedsDocument.Watersheds)get_store().add_element_user(WATERSHEDS$0);
            return target;
        }
    }
    /**
     * An XML Watersheds(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class WatershedsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.WatershedsDocument.Watersheds
    {
        
        public WatershedsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WATERSHED$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Watershed");
        private static final javax.xml.namespace.QName FEATURE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        
        
        /**
         * Gets a List of "Watershed" elements
         */
        public java.util.List<org.landxml.schema.landXML11.WatershedDocument.Watershed> getWatershedList()
        {
            final class WatershedList extends java.util.AbstractList<org.landxml.schema.landXML11.WatershedDocument.Watershed>
            {
                public org.landxml.schema.landXML11.WatershedDocument.Watershed get(int i)
                    { return WatershedsImpl.this.getWatershedArray(i); }
                
                public org.landxml.schema.landXML11.WatershedDocument.Watershed set(int i, org.landxml.schema.landXML11.WatershedDocument.Watershed o)
                {
                    org.landxml.schema.landXML11.WatershedDocument.Watershed old = WatershedsImpl.this.getWatershedArray(i);
                    WatershedsImpl.this.setWatershedArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.WatershedDocument.Watershed o)
                    { WatershedsImpl.this.insertNewWatershed(i).set(o); }
                
                public org.landxml.schema.landXML11.WatershedDocument.Watershed remove(int i)
                {
                    org.landxml.schema.landXML11.WatershedDocument.Watershed old = WatershedsImpl.this.getWatershedArray(i);
                    WatershedsImpl.this.removeWatershed(i);
                    return old;
                }
                
                public int size()
                    { return WatershedsImpl.this.sizeOfWatershedArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new WatershedList();
            }
        }
        
        /**
         * Gets array of all "Watershed" elements
         */
        public org.landxml.schema.landXML11.WatershedDocument.Watershed[] getWatershedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(WATERSHED$0, targetList);
                org.landxml.schema.landXML11.WatershedDocument.Watershed[] result = new org.landxml.schema.landXML11.WatershedDocument.Watershed[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Watershed" element
         */
        public org.landxml.schema.landXML11.WatershedDocument.Watershed getWatershedArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.WatershedDocument.Watershed target = null;
                target = (org.landxml.schema.landXML11.WatershedDocument.Watershed)get_store().find_element_user(WATERSHED$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Watershed" element
         */
        public int sizeOfWatershedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WATERSHED$0);
            }
        }
        
        /**
         * Sets array of all "Watershed" element
         */
        public void setWatershedArray(org.landxml.schema.landXML11.WatershedDocument.Watershed[] watershedArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(watershedArray, WATERSHED$0);
            }
        }
        
        /**
         * Sets ith "Watershed" element
         */
        public void setWatershedArray(int i, org.landxml.schema.landXML11.WatershedDocument.Watershed watershed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.WatershedDocument.Watershed target = null;
                target = (org.landxml.schema.landXML11.WatershedDocument.Watershed)get_store().find_element_user(WATERSHED$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(watershed);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Watershed" element
         */
        public org.landxml.schema.landXML11.WatershedDocument.Watershed insertNewWatershed(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.WatershedDocument.Watershed target = null;
                target = (org.landxml.schema.landXML11.WatershedDocument.Watershed)get_store().insert_element_user(WATERSHED$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Watershed" element
         */
        public org.landxml.schema.landXML11.WatershedDocument.Watershed addNewWatershed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.WatershedDocument.Watershed target = null;
                target = (org.landxml.schema.landXML11.WatershedDocument.Watershed)get_store().add_element_user(WATERSHED$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Watershed" element
         */
        public void removeWatershed(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WATERSHED$0, i);
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
                    { return WatershedsImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = WatershedsImpl.this.getFeatureArray(i);
                    WatershedsImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { WatershedsImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = WatershedsImpl.this.getFeatureArray(i);
                    WatershedsImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return WatershedsImpl.this.sizeOfFeatureArray(); }
                
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
