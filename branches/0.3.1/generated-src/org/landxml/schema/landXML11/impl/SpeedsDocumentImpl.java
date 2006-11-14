/*
 * An XML document type.
 * Localname: Speeds
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.SpeedsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Speeds(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class SpeedsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SpeedsDocument
{
    
    public SpeedsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPEEDS$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Speeds");
    
    
    /**
     * Gets the "Speeds" element
     */
    public org.landxml.schema.landXML11.SpeedsDocument.Speeds getSpeeds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SpeedsDocument.Speeds target = null;
            target = (org.landxml.schema.landXML11.SpeedsDocument.Speeds)get_store().find_element_user(SPEEDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Speeds" element
     */
    public void setSpeeds(org.landxml.schema.landXML11.SpeedsDocument.Speeds speeds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SpeedsDocument.Speeds target = null;
            target = (org.landxml.schema.landXML11.SpeedsDocument.Speeds)get_store().find_element_user(SPEEDS$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.SpeedsDocument.Speeds)get_store().add_element_user(SPEEDS$0);
            }
            target.set(speeds);
        }
    }
    
    /**
     * Appends and returns a new empty "Speeds" element
     */
    public org.landxml.schema.landXML11.SpeedsDocument.Speeds addNewSpeeds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SpeedsDocument.Speeds target = null;
            target = (org.landxml.schema.landXML11.SpeedsDocument.Speeds)get_store().add_element_user(SPEEDS$0);
            return target;
        }
    }
    /**
     * An XML Speeds(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class SpeedsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SpeedsDocument.Speeds
    {
        
        public SpeedsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESIGNSPEED$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "DesignSpeed");
        private static final javax.xml.namespace.QName DESIGNSPEED85TH$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "DesignSpeed85th");
        private static final javax.xml.namespace.QName POSTEDSPEED$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PostedSpeed");
        private static final javax.xml.namespace.QName FEATURE$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        
        
        /**
         * Gets a List of "DesignSpeed" elements
         */
        public java.util.List<org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed> getDesignSpeedList()
        {
            final class DesignSpeedList extends java.util.AbstractList<org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed>
            {
                public org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed get(int i)
                    { return SpeedsImpl.this.getDesignSpeedArray(i); }
                
                public org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed set(int i, org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed o)
                {
                    org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed old = SpeedsImpl.this.getDesignSpeedArray(i);
                    SpeedsImpl.this.setDesignSpeedArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed o)
                    { SpeedsImpl.this.insertNewDesignSpeed(i).set(o); }
                
                public org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed remove(int i)
                {
                    org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed old = SpeedsImpl.this.getDesignSpeedArray(i);
                    SpeedsImpl.this.removeDesignSpeed(i);
                    return old;
                }
                
                public int size()
                    { return SpeedsImpl.this.sizeOfDesignSpeedArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DesignSpeedList();
            }
        }
        
        /**
         * Gets array of all "DesignSpeed" elements
         */
        public org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed[] getDesignSpeedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DESIGNSPEED$0, targetList);
                org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed[] result = new org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "DesignSpeed" element
         */
        public org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed getDesignSpeedArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed target = null;
                target = (org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed)get_store().find_element_user(DESIGNSPEED$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "DesignSpeed" element
         */
        public int sizeOfDesignSpeedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESIGNSPEED$0);
            }
        }
        
        /**
         * Sets array of all "DesignSpeed" element
         */
        public void setDesignSpeedArray(org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed[] designSpeedArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(designSpeedArray, DESIGNSPEED$0);
            }
        }
        
        /**
         * Sets ith "DesignSpeed" element
         */
        public void setDesignSpeedArray(int i, org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed designSpeed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed target = null;
                target = (org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed)get_store().find_element_user(DESIGNSPEED$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(designSpeed);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DesignSpeed" element
         */
        public org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed insertNewDesignSpeed(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed target = null;
                target = (org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed)get_store().insert_element_user(DESIGNSPEED$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DesignSpeed" element
         */
        public org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed addNewDesignSpeed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed target = null;
                target = (org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed)get_store().add_element_user(DESIGNSPEED$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "DesignSpeed" element
         */
        public void removeDesignSpeed(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESIGNSPEED$0, i);
            }
        }
        
        /**
         * Gets a List of "DesignSpeed85th" elements
         */
        public java.util.List<org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th> getDesignSpeed85ThList()
        {
            final class DesignSpeed85ThList extends java.util.AbstractList<org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th>
            {
                public org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th get(int i)
                    { return SpeedsImpl.this.getDesignSpeed85ThArray(i); }
                
                public org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th set(int i, org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th o)
                {
                    org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th old = SpeedsImpl.this.getDesignSpeed85ThArray(i);
                    SpeedsImpl.this.setDesignSpeed85ThArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th o)
                    { SpeedsImpl.this.insertNewDesignSpeed85Th(i).set(o); }
                
                public org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th remove(int i)
                {
                    org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th old = SpeedsImpl.this.getDesignSpeed85ThArray(i);
                    SpeedsImpl.this.removeDesignSpeed85Th(i);
                    return old;
                }
                
                public int size()
                    { return SpeedsImpl.this.sizeOfDesignSpeed85ThArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DesignSpeed85ThList();
            }
        }
        
        /**
         * Gets array of all "DesignSpeed85th" elements
         */
        public org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th[] getDesignSpeed85ThArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DESIGNSPEED85TH$2, targetList);
                org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th[] result = new org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "DesignSpeed85th" element
         */
        public org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th getDesignSpeed85ThArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th target = null;
                target = (org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th)get_store().find_element_user(DESIGNSPEED85TH$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "DesignSpeed85th" element
         */
        public int sizeOfDesignSpeed85ThArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESIGNSPEED85TH$2);
            }
        }
        
        /**
         * Sets array of all "DesignSpeed85th" element
         */
        public void setDesignSpeed85ThArray(org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th[] designSpeed85ThArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(designSpeed85ThArray, DESIGNSPEED85TH$2);
            }
        }
        
        /**
         * Sets ith "DesignSpeed85th" element
         */
        public void setDesignSpeed85ThArray(int i, org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th designSpeed85Th)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th target = null;
                target = (org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th)get_store().find_element_user(DESIGNSPEED85TH$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(designSpeed85Th);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DesignSpeed85th" element
         */
        public org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th insertNewDesignSpeed85Th(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th target = null;
                target = (org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th)get_store().insert_element_user(DESIGNSPEED85TH$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DesignSpeed85th" element
         */
        public org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th addNewDesignSpeed85Th()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th target = null;
                target = (org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th)get_store().add_element_user(DESIGNSPEED85TH$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "DesignSpeed85th" element
         */
        public void removeDesignSpeed85Th(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESIGNSPEED85TH$2, i);
            }
        }
        
        /**
         * Gets a List of "PostedSpeed" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed> getPostedSpeedList()
        {
            final class PostedSpeedList extends java.util.AbstractList<org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed>
            {
                public org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed get(int i)
                    { return SpeedsImpl.this.getPostedSpeedArray(i); }
                
                public org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed set(int i, org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed o)
                {
                    org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed old = SpeedsImpl.this.getPostedSpeedArray(i);
                    SpeedsImpl.this.setPostedSpeedArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed o)
                    { SpeedsImpl.this.insertNewPostedSpeed(i).set(o); }
                
                public org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed remove(int i)
                {
                    org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed old = SpeedsImpl.this.getPostedSpeedArray(i);
                    SpeedsImpl.this.removePostedSpeed(i);
                    return old;
                }
                
                public int size()
                    { return SpeedsImpl.this.sizeOfPostedSpeedArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PostedSpeedList();
            }
        }
        
        /**
         * Gets array of all "PostedSpeed" elements
         */
        public org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed[] getPostedSpeedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(POSTEDSPEED$4, targetList);
                org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed[] result = new org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PostedSpeed" element
         */
        public org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed getPostedSpeedArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed target = null;
                target = (org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed)get_store().find_element_user(POSTEDSPEED$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PostedSpeed" element
         */
        public int sizeOfPostedSpeedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(POSTEDSPEED$4);
            }
        }
        
        /**
         * Sets array of all "PostedSpeed" element
         */
        public void setPostedSpeedArray(org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed[] postedSpeedArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(postedSpeedArray, POSTEDSPEED$4);
            }
        }
        
        /**
         * Sets ith "PostedSpeed" element
         */
        public void setPostedSpeedArray(int i, org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed postedSpeed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed target = null;
                target = (org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed)get_store().find_element_user(POSTEDSPEED$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(postedSpeed);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PostedSpeed" element
         */
        public org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed insertNewPostedSpeed(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed target = null;
                target = (org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed)get_store().insert_element_user(POSTEDSPEED$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PostedSpeed" element
         */
        public org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed addNewPostedSpeed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed target = null;
                target = (org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed)get_store().add_element_user(POSTEDSPEED$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "PostedSpeed" element
         */
        public void removePostedSpeed(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(POSTEDSPEED$4, i);
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
                    { return SpeedsImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = SpeedsImpl.this.getFeatureArray(i);
                    SpeedsImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { SpeedsImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = SpeedsImpl.this.getFeatureArray(i);
                    SpeedsImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return SpeedsImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$6, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$6, i);
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
                return get_store().count_elements(FEATURE$6);
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
                arraySetterHelper(featureArray, FEATURE$6);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$6, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$6, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$6);
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
                get_store().remove_element(FEATURE$6, i);
            }
        }
    }
}
