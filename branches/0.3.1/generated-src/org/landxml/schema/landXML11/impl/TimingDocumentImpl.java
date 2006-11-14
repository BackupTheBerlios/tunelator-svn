/*
 * An XML document type.
 * Localname: Timing
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.TimingDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Timing(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class TimingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.TimingDocument
{
    
    public TimingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMING$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Timing");
    
    
    /**
     * Gets the "Timing" element
     */
    public org.landxml.schema.landXML11.TimingDocument.Timing getTiming()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.TimingDocument.Timing target = null;
            target = (org.landxml.schema.landXML11.TimingDocument.Timing)get_store().find_element_user(TIMING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Timing" element
     */
    public void setTiming(org.landxml.schema.landXML11.TimingDocument.Timing timing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.TimingDocument.Timing target = null;
            target = (org.landxml.schema.landXML11.TimingDocument.Timing)get_store().find_element_user(TIMING$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.TimingDocument.Timing)get_store().add_element_user(TIMING$0);
            }
            target.set(timing);
        }
    }
    
    /**
     * Appends and returns a new empty "Timing" element
     */
    public org.landxml.schema.landXML11.TimingDocument.Timing addNewTiming()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.TimingDocument.Timing target = null;
            target = (org.landxml.schema.landXML11.TimingDocument.Timing)get_store().add_element_user(TIMING$0);
            return target;
        }
    }
    /**
     * An XML Timing(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class TimingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.TimingDocument.Timing
    {
        
        public TimingImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FEATURE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName STATION$2 = 
            new javax.xml.namespace.QName("", "station");
        private static final javax.xml.namespace.QName LEGNUMBER$4 = 
            new javax.xml.namespace.QName("", "legNumber");
        private static final javax.xml.namespace.QName PROTECTEDTURNPERCENT$6 = 
            new javax.xml.namespace.QName("", "protectedTurnPercent");
        private static final javax.xml.namespace.QName UNPROTECTEDTURNPERCENT$8 = 
            new javax.xml.namespace.QName("", "unprotectedTurnPercent");
        
        
        /**
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return TimingImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = TimingImpl.this.getFeatureArray(i);
                    TimingImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { TimingImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = TimingImpl.this.getFeatureArray(i);
                    TimingImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return TimingImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "station" attribute
         */
        public double getStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATION$2);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "station" attribute
         */
        public org.landxml.schema.landXML11.Station xgetStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(STATION$2);
                return target;
            }
        }
        
        /**
         * True if has "station" attribute
         */
        public boolean isSetStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STATION$2) != null;
            }
        }
        
        /**
         * Sets the "station" attribute
         */
        public void setStation(double station)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATION$2);
                }
                target.setDoubleValue(station);
            }
        }
        
        /**
         * Sets (as xml) the "station" attribute
         */
        public void xsetStation(org.landxml.schema.landXML11.Station station)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(STATION$2);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(STATION$2);
                }
                target.set(station);
            }
        }
        
        /**
         * Unsets the "station" attribute
         */
        public void unsetStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STATION$2);
            }
        }
        
        /**
         * Gets the "legNumber" attribute
         */
        public int getLegNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEGNUMBER$4);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "legNumber" attribute
         */
        public org.apache.xmlbeans.XmlInt xgetLegNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(LEGNUMBER$4);
                return target;
            }
        }
        
        /**
         * True if has "legNumber" attribute
         */
        public boolean isSetLegNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LEGNUMBER$4) != null;
            }
        }
        
        /**
         * Sets the "legNumber" attribute
         */
        public void setLegNumber(int legNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEGNUMBER$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEGNUMBER$4);
                }
                target.setIntValue(legNumber);
            }
        }
        
        /**
         * Sets (as xml) the "legNumber" attribute
         */
        public void xsetLegNumber(org.apache.xmlbeans.XmlInt legNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(LEGNUMBER$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(LEGNUMBER$4);
                }
                target.set(legNumber);
            }
        }
        
        /**
         * Unsets the "legNumber" attribute
         */
        public void unsetLegNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LEGNUMBER$4);
            }
        }
        
        /**
         * Gets the "protectedTurnPercent" attribute
         */
        public double getProtectedTurnPercent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROTECTEDTURNPERCENT$6);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "protectedTurnPercent" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetProtectedTurnPercent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PROTECTEDTURNPERCENT$6);
                return target;
            }
        }
        
        /**
         * True if has "protectedTurnPercent" attribute
         */
        public boolean isSetProtectedTurnPercent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PROTECTEDTURNPERCENT$6) != null;
            }
        }
        
        /**
         * Sets the "protectedTurnPercent" attribute
         */
        public void setProtectedTurnPercent(double protectedTurnPercent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROTECTEDTURNPERCENT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROTECTEDTURNPERCENT$6);
                }
                target.setDoubleValue(protectedTurnPercent);
            }
        }
        
        /**
         * Sets (as xml) the "protectedTurnPercent" attribute
         */
        public void xsetProtectedTurnPercent(org.apache.xmlbeans.XmlDouble protectedTurnPercent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PROTECTEDTURNPERCENT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PROTECTEDTURNPERCENT$6);
                }
                target.set(protectedTurnPercent);
            }
        }
        
        /**
         * Unsets the "protectedTurnPercent" attribute
         */
        public void unsetProtectedTurnPercent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PROTECTEDTURNPERCENT$6);
            }
        }
        
        /**
         * Gets the "unprotectedTurnPercent" attribute
         */
        public double getUnprotectedTurnPercent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNPROTECTEDTURNPERCENT$8);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "unprotectedTurnPercent" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetUnprotectedTurnPercent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(UNPROTECTEDTURNPERCENT$8);
                return target;
            }
        }
        
        /**
         * True if has "unprotectedTurnPercent" attribute
         */
        public boolean isSetUnprotectedTurnPercent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(UNPROTECTEDTURNPERCENT$8) != null;
            }
        }
        
        /**
         * Sets the "unprotectedTurnPercent" attribute
         */
        public void setUnprotectedTurnPercent(double unprotectedTurnPercent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNPROTECTEDTURNPERCENT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNPROTECTEDTURNPERCENT$8);
                }
                target.setDoubleValue(unprotectedTurnPercent);
            }
        }
        
        /**
         * Sets (as xml) the "unprotectedTurnPercent" attribute
         */
        public void xsetUnprotectedTurnPercent(org.apache.xmlbeans.XmlDouble unprotectedTurnPercent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(UNPROTECTEDTURNPERCENT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(UNPROTECTEDTURNPERCENT$8);
                }
                target.set(unprotectedTurnPercent);
            }
        }
        
        /**
         * Unsets the "unprotectedTurnPercent" attribute
         */
        public void unsetUnprotectedTurnPercent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(UNPROTECTEDTURNPERCENT$8);
            }
        }
    }
}
