/*
 * An XML document type.
 * Localname: CrashHistory
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CrashHistoryDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one CrashHistory(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class CrashHistoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CrashHistoryDocument
{
    
    public CrashHistoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CRASHHISTORY$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CrashHistory");
    
    
    /**
     * Gets the "CrashHistory" element
     */
    public org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory getCrashHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory target = null;
            target = (org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory)get_store().find_element_user(CRASHHISTORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CrashHistory" element
     */
    public void setCrashHistory(org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory crashHistory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory target = null;
            target = (org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory)get_store().find_element_user(CRASHHISTORY$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory)get_store().add_element_user(CRASHHISTORY$0);
            }
            target.set(crashHistory);
        }
    }
    
    /**
     * Appends and returns a new empty "CrashHistory" element
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
     * An XML CrashHistory(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class CrashHistoryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory
    {
        
        public CrashHistoryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FEATURE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName YEAR$2 = 
            new javax.xml.namespace.QName("", "year");
        private static final javax.xml.namespace.QName LOCATION1$4 = 
            new javax.xml.namespace.QName("", "location-1");
        private static final javax.xml.namespace.QName LOCATION2$6 = 
            new javax.xml.namespace.QName("", "location-2");
        private static final javax.xml.namespace.QName SEVERITY$8 = 
            new javax.xml.namespace.QName("", "severity");
        private static final javax.xml.namespace.QName INTERSECTIONRELATION$10 = 
            new javax.xml.namespace.QName("", "intersectionRelation");
        private static final javax.xml.namespace.QName INTERSECTIONLOCATION$12 = 
            new javax.xml.namespace.QName("", "intersectionLocation");
        
        
        /**
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return CrashHistoryImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CrashHistoryImpl.this.getFeatureArray(i);
                    CrashHistoryImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { CrashHistoryImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CrashHistoryImpl.this.getFeatureArray(i);
                    CrashHistoryImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return CrashHistoryImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$0, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$0, i);
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
                return get_store().count_elements(FEATURE$0);
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
                arraySetterHelper(featureArray, FEATURE$0);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$0, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$0, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$0);
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
                get_store().remove_element(FEATURE$0, i);
            }
        }
        
        /**
         * Gets the "year" attribute
         */
        public java.util.Calendar getYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YEAR$2);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "year" attribute
         */
        public org.apache.xmlbeans.XmlDate xgetYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(YEAR$2);
                return target;
            }
        }
        
        /**
         * True if has "year" attribute
         */
        public boolean isSetYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(YEAR$2) != null;
            }
        }
        
        /**
         * Sets the "year" attribute
         */
        public void setYear(java.util.Calendar year)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YEAR$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(YEAR$2);
                }
                target.setCalendarValue(year);
            }
        }
        
        /**
         * Sets (as xml) the "year" attribute
         */
        public void xsetYear(org.apache.xmlbeans.XmlDate year)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(YEAR$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(YEAR$2);
                }
                target.set(year);
            }
        }
        
        /**
         * Unsets the "year" attribute
         */
        public void unsetYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(YEAR$2);
            }
        }
        
        /**
         * Gets the "location-1" attribute
         */
        public double getLocation1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION1$4);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "location-1" attribute
         */
        public org.landxml.schema.landXML11.Station xgetLocation1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(LOCATION1$4);
                return target;
            }
        }
        
        /**
         * True if has "location-1" attribute
         */
        public boolean isSetLocation1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOCATION1$4) != null;
            }
        }
        
        /**
         * Sets the "location-1" attribute
         */
        public void setLocation1(double location1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION1$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATION1$4);
                }
                target.setDoubleValue(location1);
            }
        }
        
        /**
         * Sets (as xml) the "location-1" attribute
         */
        public void xsetLocation1(org.landxml.schema.landXML11.Station location1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(LOCATION1$4);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(LOCATION1$4);
                }
                target.set(location1);
            }
        }
        
        /**
         * Unsets the "location-1" attribute
         */
        public void unsetLocation1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOCATION1$4);
            }
        }
        
        /**
         * Gets the "location-2" attribute
         */
        public double getLocation2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION2$6);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "location-2" attribute
         */
        public org.landxml.schema.landXML11.Station xgetLocation2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(LOCATION2$6);
                return target;
            }
        }
        
        /**
         * True if has "location-2" attribute
         */
        public boolean isSetLocation2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOCATION2$6) != null;
            }
        }
        
        /**
         * Sets the "location-2" attribute
         */
        public void setLocation2(double location2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION2$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATION2$6);
                }
                target.setDoubleValue(location2);
            }
        }
        
        /**
         * Sets (as xml) the "location-2" attribute
         */
        public void xsetLocation2(org.landxml.schema.landXML11.Station location2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(LOCATION2$6);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(LOCATION2$6);
                }
                target.set(location2);
            }
        }
        
        /**
         * Unsets the "location-2" attribute
         */
        public void unsetLocation2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOCATION2$6);
            }
        }
        
        /**
         * Gets the "severity" attribute
         */
        public org.landxml.schema.landXML11.CrashSeverityType.Enum getSeverity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEVERITY$8);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.CrashSeverityType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "severity" attribute
         */
        public org.landxml.schema.landXML11.CrashSeverityType xgetSeverity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrashSeverityType target = null;
                target = (org.landxml.schema.landXML11.CrashSeverityType)get_store().find_attribute_user(SEVERITY$8);
                return target;
            }
        }
        
        /**
         * True if has "severity" attribute
         */
        public boolean isSetSeverity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SEVERITY$8) != null;
            }
        }
        
        /**
         * Sets the "severity" attribute
         */
        public void setSeverity(org.landxml.schema.landXML11.CrashSeverityType.Enum severity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEVERITY$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEVERITY$8);
                }
                target.setEnumValue(severity);
            }
        }
        
        /**
         * Sets (as xml) the "severity" attribute
         */
        public void xsetSeverity(org.landxml.schema.landXML11.CrashSeverityType severity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrashSeverityType target = null;
                target = (org.landxml.schema.landXML11.CrashSeverityType)get_store().find_attribute_user(SEVERITY$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CrashSeverityType)get_store().add_attribute_user(SEVERITY$8);
                }
                target.set(severity);
            }
        }
        
        /**
         * Unsets the "severity" attribute
         */
        public void unsetSeverity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SEVERITY$8);
            }
        }
        
        /**
         * Gets the "intersectionRelation" attribute
         */
        public org.landxml.schema.landXML11.CrashIntersectionRelation.Enum getIntersectionRelation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERSECTIONRELATION$10);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.CrashIntersectionRelation.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "intersectionRelation" attribute
         */
        public org.landxml.schema.landXML11.CrashIntersectionRelation xgetIntersectionRelation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrashIntersectionRelation target = null;
                target = (org.landxml.schema.landXML11.CrashIntersectionRelation)get_store().find_attribute_user(INTERSECTIONRELATION$10);
                return target;
            }
        }
        
        /**
         * True if has "intersectionRelation" attribute
         */
        public boolean isSetIntersectionRelation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INTERSECTIONRELATION$10) != null;
            }
        }
        
        /**
         * Sets the "intersectionRelation" attribute
         */
        public void setIntersectionRelation(org.landxml.schema.landXML11.CrashIntersectionRelation.Enum intersectionRelation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERSECTIONRELATION$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERSECTIONRELATION$10);
                }
                target.setEnumValue(intersectionRelation);
            }
        }
        
        /**
         * Sets (as xml) the "intersectionRelation" attribute
         */
        public void xsetIntersectionRelation(org.landxml.schema.landXML11.CrashIntersectionRelation intersectionRelation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrashIntersectionRelation target = null;
                target = (org.landxml.schema.landXML11.CrashIntersectionRelation)get_store().find_attribute_user(INTERSECTIONRELATION$10);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CrashIntersectionRelation)get_store().add_attribute_user(INTERSECTIONRELATION$10);
                }
                target.set(intersectionRelation);
            }
        }
        
        /**
         * Unsets the "intersectionRelation" attribute
         */
        public void unsetIntersectionRelation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INTERSECTIONRELATION$10);
            }
        }
        
        /**
         * Gets the "intersectionLocation" attribute
         */
        public double getIntersectionLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERSECTIONLOCATION$12);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "intersectionLocation" attribute
         */
        public org.landxml.schema.landXML11.Station xgetIntersectionLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(INTERSECTIONLOCATION$12);
                return target;
            }
        }
        
        /**
         * True if has "intersectionLocation" attribute
         */
        public boolean isSetIntersectionLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INTERSECTIONLOCATION$12) != null;
            }
        }
        
        /**
         * Sets the "intersectionLocation" attribute
         */
        public void setIntersectionLocation(double intersectionLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERSECTIONLOCATION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERSECTIONLOCATION$12);
                }
                target.setDoubleValue(intersectionLocation);
            }
        }
        
        /**
         * Sets (as xml) the "intersectionLocation" attribute
         */
        public void xsetIntersectionLocation(org.landxml.schema.landXML11.Station intersectionLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(INTERSECTIONLOCATION$12);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(INTERSECTIONLOCATION$12);
                }
                target.set(intersectionLocation);
            }
        }
        
        /**
         * Unsets the "intersectionLocation" attribute
         */
        public void unsetIntersectionLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INTERSECTIONLOCATION$12);
            }
        }
    }
}
