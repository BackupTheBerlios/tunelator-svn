/*
 * An XML document type.
 * Localname: TrafficVolume
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.TrafficVolumeDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one TrafficVolume(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class TrafficVolumeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.TrafficVolumeDocument
{
    
    public TrafficVolumeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRAFFICVOLUME$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "TrafficVolume");
    
    
    /**
     * Gets the "TrafficVolume" element
     */
    public org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume getTrafficVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume target = null;
            target = (org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume)get_store().find_element_user(TRAFFICVOLUME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TrafficVolume" element
     */
    public void setTrafficVolume(org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume trafficVolume)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume target = null;
            target = (org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume)get_store().find_element_user(TRAFFICVOLUME$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume)get_store().add_element_user(TRAFFICVOLUME$0);
            }
            target.set(trafficVolume);
        }
    }
    
    /**
     * Appends and returns a new empty "TrafficVolume" element
     */
    public org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume addNewTrafficVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume target = null;
            target = (org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume)get_store().add_element_user(TRAFFICVOLUME$0);
            return target;
        }
    }
    /**
     * An XML TrafficVolume(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class TrafficVolumeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume
    {
        
        public TrafficVolumeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DAILYTRAFFICVOLUME$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "DailyTrafficVolume");
        private static final javax.xml.namespace.QName DESIGNHOUR$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "DesignHour");
        private static final javax.xml.namespace.QName PEAKHOUR$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PeakHour");
        private static final javax.xml.namespace.QName FEATURE$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        
        
        /**
         * Gets a List of "DailyTrafficVolume" elements
         */
        public java.util.List<org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume> getDailyTrafficVolumeList()
        {
            final class DailyTrafficVolumeList extends java.util.AbstractList<org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume>
            {
                public org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume get(int i)
                    { return TrafficVolumeImpl.this.getDailyTrafficVolumeArray(i); }
                
                public org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume set(int i, org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume o)
                {
                    org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume old = TrafficVolumeImpl.this.getDailyTrafficVolumeArray(i);
                    TrafficVolumeImpl.this.setDailyTrafficVolumeArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume o)
                    { TrafficVolumeImpl.this.insertNewDailyTrafficVolume(i).set(o); }
                
                public org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume remove(int i)
                {
                    org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume old = TrafficVolumeImpl.this.getDailyTrafficVolumeArray(i);
                    TrafficVolumeImpl.this.removeDailyTrafficVolume(i);
                    return old;
                }
                
                public int size()
                    { return TrafficVolumeImpl.this.sizeOfDailyTrafficVolumeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DailyTrafficVolumeList();
            }
        }
        
        /**
         * Gets array of all "DailyTrafficVolume" elements
         */
        public org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume[] getDailyTrafficVolumeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DAILYTRAFFICVOLUME$0, targetList);
                org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume[] result = new org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "DailyTrafficVolume" element
         */
        public org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume getDailyTrafficVolumeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume target = null;
                target = (org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume)get_store().find_element_user(DAILYTRAFFICVOLUME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "DailyTrafficVolume" element
         */
        public int sizeOfDailyTrafficVolumeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DAILYTRAFFICVOLUME$0);
            }
        }
        
        /**
         * Sets array of all "DailyTrafficVolume" element
         */
        public void setDailyTrafficVolumeArray(org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume[] dailyTrafficVolumeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dailyTrafficVolumeArray, DAILYTRAFFICVOLUME$0);
            }
        }
        
        /**
         * Sets ith "DailyTrafficVolume" element
         */
        public void setDailyTrafficVolumeArray(int i, org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume dailyTrafficVolume)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume target = null;
                target = (org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume)get_store().find_element_user(DAILYTRAFFICVOLUME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dailyTrafficVolume);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DailyTrafficVolume" element
         */
        public org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume insertNewDailyTrafficVolume(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume target = null;
                target = (org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume)get_store().insert_element_user(DAILYTRAFFICVOLUME$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DailyTrafficVolume" element
         */
        public org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume addNewDailyTrafficVolume()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume target = null;
                target = (org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume)get_store().add_element_user(DAILYTRAFFICVOLUME$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "DailyTrafficVolume" element
         */
        public void removeDailyTrafficVolume(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DAILYTRAFFICVOLUME$0, i);
            }
        }
        
        /**
         * Gets a List of "DesignHour" elements
         */
        public java.util.List<org.landxml.schema.landXML11.DesignHourDocument.DesignHour> getDesignHourList()
        {
            final class DesignHourList extends java.util.AbstractList<org.landxml.schema.landXML11.DesignHourDocument.DesignHour>
            {
                public org.landxml.schema.landXML11.DesignHourDocument.DesignHour get(int i)
                    { return TrafficVolumeImpl.this.getDesignHourArray(i); }
                
                public org.landxml.schema.landXML11.DesignHourDocument.DesignHour set(int i, org.landxml.schema.landXML11.DesignHourDocument.DesignHour o)
                {
                    org.landxml.schema.landXML11.DesignHourDocument.DesignHour old = TrafficVolumeImpl.this.getDesignHourArray(i);
                    TrafficVolumeImpl.this.setDesignHourArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.DesignHourDocument.DesignHour o)
                    { TrafficVolumeImpl.this.insertNewDesignHour(i).set(o); }
                
                public org.landxml.schema.landXML11.DesignHourDocument.DesignHour remove(int i)
                {
                    org.landxml.schema.landXML11.DesignHourDocument.DesignHour old = TrafficVolumeImpl.this.getDesignHourArray(i);
                    TrafficVolumeImpl.this.removeDesignHour(i);
                    return old;
                }
                
                public int size()
                    { return TrafficVolumeImpl.this.sizeOfDesignHourArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DesignHourList();
            }
        }
        
        /**
         * Gets array of all "DesignHour" elements
         */
        public org.landxml.schema.landXML11.DesignHourDocument.DesignHour[] getDesignHourArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DESIGNHOUR$2, targetList);
                org.landxml.schema.landXML11.DesignHourDocument.DesignHour[] result = new org.landxml.schema.landXML11.DesignHourDocument.DesignHour[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "DesignHour" element
         */
        public org.landxml.schema.landXML11.DesignHourDocument.DesignHour getDesignHourArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DesignHourDocument.DesignHour target = null;
                target = (org.landxml.schema.landXML11.DesignHourDocument.DesignHour)get_store().find_element_user(DESIGNHOUR$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "DesignHour" element
         */
        public int sizeOfDesignHourArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESIGNHOUR$2);
            }
        }
        
        /**
         * Sets array of all "DesignHour" element
         */
        public void setDesignHourArray(org.landxml.schema.landXML11.DesignHourDocument.DesignHour[] designHourArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(designHourArray, DESIGNHOUR$2);
            }
        }
        
        /**
         * Sets ith "DesignHour" element
         */
        public void setDesignHourArray(int i, org.landxml.schema.landXML11.DesignHourDocument.DesignHour designHour)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DesignHourDocument.DesignHour target = null;
                target = (org.landxml.schema.landXML11.DesignHourDocument.DesignHour)get_store().find_element_user(DESIGNHOUR$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(designHour);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DesignHour" element
         */
        public org.landxml.schema.landXML11.DesignHourDocument.DesignHour insertNewDesignHour(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DesignHourDocument.DesignHour target = null;
                target = (org.landxml.schema.landXML11.DesignHourDocument.DesignHour)get_store().insert_element_user(DESIGNHOUR$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DesignHour" element
         */
        public org.landxml.schema.landXML11.DesignHourDocument.DesignHour addNewDesignHour()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DesignHourDocument.DesignHour target = null;
                target = (org.landxml.schema.landXML11.DesignHourDocument.DesignHour)get_store().add_element_user(DESIGNHOUR$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "DesignHour" element
         */
        public void removeDesignHour(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESIGNHOUR$2, i);
            }
        }
        
        /**
         * Gets a List of "PeakHour" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PeakHourDocument.PeakHour> getPeakHourList()
        {
            final class PeakHourList extends java.util.AbstractList<org.landxml.schema.landXML11.PeakHourDocument.PeakHour>
            {
                public org.landxml.schema.landXML11.PeakHourDocument.PeakHour get(int i)
                    { return TrafficVolumeImpl.this.getPeakHourArray(i); }
                
                public org.landxml.schema.landXML11.PeakHourDocument.PeakHour set(int i, org.landxml.schema.landXML11.PeakHourDocument.PeakHour o)
                {
                    org.landxml.schema.landXML11.PeakHourDocument.PeakHour old = TrafficVolumeImpl.this.getPeakHourArray(i);
                    TrafficVolumeImpl.this.setPeakHourArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PeakHourDocument.PeakHour o)
                    { TrafficVolumeImpl.this.insertNewPeakHour(i).set(o); }
                
                public org.landxml.schema.landXML11.PeakHourDocument.PeakHour remove(int i)
                {
                    org.landxml.schema.landXML11.PeakHourDocument.PeakHour old = TrafficVolumeImpl.this.getPeakHourArray(i);
                    TrafficVolumeImpl.this.removePeakHour(i);
                    return old;
                }
                
                public int size()
                    { return TrafficVolumeImpl.this.sizeOfPeakHourArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PeakHourList();
            }
        }
        
        /**
         * Gets array of all "PeakHour" elements
         */
        public org.landxml.schema.landXML11.PeakHourDocument.PeakHour[] getPeakHourArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PEAKHOUR$4, targetList);
                org.landxml.schema.landXML11.PeakHourDocument.PeakHour[] result = new org.landxml.schema.landXML11.PeakHourDocument.PeakHour[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PeakHour" element
         */
        public org.landxml.schema.landXML11.PeakHourDocument.PeakHour getPeakHourArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PeakHourDocument.PeakHour target = null;
                target = (org.landxml.schema.landXML11.PeakHourDocument.PeakHour)get_store().find_element_user(PEAKHOUR$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PeakHour" element
         */
        public int sizeOfPeakHourArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PEAKHOUR$4);
            }
        }
        
        /**
         * Sets array of all "PeakHour" element
         */
        public void setPeakHourArray(org.landxml.schema.landXML11.PeakHourDocument.PeakHour[] peakHourArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(peakHourArray, PEAKHOUR$4);
            }
        }
        
        /**
         * Sets ith "PeakHour" element
         */
        public void setPeakHourArray(int i, org.landxml.schema.landXML11.PeakHourDocument.PeakHour peakHour)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PeakHourDocument.PeakHour target = null;
                target = (org.landxml.schema.landXML11.PeakHourDocument.PeakHour)get_store().find_element_user(PEAKHOUR$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(peakHour);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PeakHour" element
         */
        public org.landxml.schema.landXML11.PeakHourDocument.PeakHour insertNewPeakHour(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PeakHourDocument.PeakHour target = null;
                target = (org.landxml.schema.landXML11.PeakHourDocument.PeakHour)get_store().insert_element_user(PEAKHOUR$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PeakHour" element
         */
        public org.landxml.schema.landXML11.PeakHourDocument.PeakHour addNewPeakHour()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PeakHourDocument.PeakHour target = null;
                target = (org.landxml.schema.landXML11.PeakHourDocument.PeakHour)get_store().add_element_user(PEAKHOUR$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "PeakHour" element
         */
        public void removePeakHour(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PEAKHOUR$4, i);
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
                    { return TrafficVolumeImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = TrafficVolumeImpl.this.getFeatureArray(i);
                    TrafficVolumeImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { TrafficVolumeImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = TrafficVolumeImpl.this.getFeatureArray(i);
                    TrafficVolumeImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return TrafficVolumeImpl.this.sizeOfFeatureArray(); }
                
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
