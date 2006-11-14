/*
 * An XML document type.
 * Localname: DailyTrafficVolume
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.DailyTrafficVolumeDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one DailyTrafficVolume(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class DailyTrafficVolumeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.DailyTrafficVolumeDocument
{
    
    public DailyTrafficVolumeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DAILYTRAFFICVOLUME$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "DailyTrafficVolume");
    
    
    /**
     * Gets the "DailyTrafficVolume" element
     */
    public org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume getDailyTrafficVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume target = null;
            target = (org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume)get_store().find_element_user(DAILYTRAFFICVOLUME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DailyTrafficVolume" element
     */
    public void setDailyTrafficVolume(org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume dailyTrafficVolume)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume target = null;
            target = (org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume)get_store().find_element_user(DAILYTRAFFICVOLUME$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume)get_store().add_element_user(DAILYTRAFFICVOLUME$0);
            }
            target.set(dailyTrafficVolume);
        }
    }
    
    /**
     * Appends and returns a new empty "DailyTrafficVolume" element
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
     * An XML DailyTrafficVolume(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class DailyTrafficVolumeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume
    {
        
        public DailyTrafficVolumeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FEATURE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName STASTART$2 = 
            new javax.xml.namespace.QName("", "staStart");
        private static final javax.xml.namespace.QName STAEND$4 = 
            new javax.xml.namespace.QName("", "staEnd");
        private static final javax.xml.namespace.QName ADT$6 = 
            new javax.xml.namespace.QName("", "ADT");
        private static final javax.xml.namespace.QName YEAR$8 = 
            new javax.xml.namespace.QName("", "year");
        private static final javax.xml.namespace.QName ESCFACTOR$10 = 
            new javax.xml.namespace.QName("", "escFactor");
        
        
        /**
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return DailyTrafficVolumeImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = DailyTrafficVolumeImpl.this.getFeatureArray(i);
                    DailyTrafficVolumeImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { DailyTrafficVolumeImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = DailyTrafficVolumeImpl.this.getFeatureArray(i);
                    DailyTrafficVolumeImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return DailyTrafficVolumeImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "staStart" attribute
         */
        public double getStaStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STASTART$2);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "staStart" attribute
         */
        public org.landxml.schema.landXML11.Station xgetStaStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(STASTART$2);
                return target;
            }
        }
        
        /**
         * True if has "staStart" attribute
         */
        public boolean isSetStaStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STASTART$2) != null;
            }
        }
        
        /**
         * Sets the "staStart" attribute
         */
        public void setStaStart(double staStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STASTART$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STASTART$2);
                }
                target.setDoubleValue(staStart);
            }
        }
        
        /**
         * Sets (as xml) the "staStart" attribute
         */
        public void xsetStaStart(org.landxml.schema.landXML11.Station staStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(STASTART$2);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(STASTART$2);
                }
                target.set(staStart);
            }
        }
        
        /**
         * Unsets the "staStart" attribute
         */
        public void unsetStaStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STASTART$2);
            }
        }
        
        /**
         * Gets the "staEnd" attribute
         */
        public double getStaEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STAEND$4);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "staEnd" attribute
         */
        public org.landxml.schema.landXML11.Station xgetStaEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(STAEND$4);
                return target;
            }
        }
        
        /**
         * True if has "staEnd" attribute
         */
        public boolean isSetStaEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STAEND$4) != null;
            }
        }
        
        /**
         * Sets the "staEnd" attribute
         */
        public void setStaEnd(double staEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STAEND$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STAEND$4);
                }
                target.setDoubleValue(staEnd);
            }
        }
        
        /**
         * Sets (as xml) the "staEnd" attribute
         */
        public void xsetStaEnd(org.landxml.schema.landXML11.Station staEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(STAEND$4);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(STAEND$4);
                }
                target.set(staEnd);
            }
        }
        
        /**
         * Unsets the "staEnd" attribute
         */
        public void unsetStaEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STAEND$4);
            }
        }
        
        /**
         * Gets the "ADT" attribute
         */
        public double getADT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADT$6);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "ADT" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetADT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ADT$6);
                return target;
            }
        }
        
        /**
         * True if has "ADT" attribute
         */
        public boolean isSetADT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ADT$6) != null;
            }
        }
        
        /**
         * Sets the "ADT" attribute
         */
        public void setADT(double adt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADT$6);
                }
                target.setDoubleValue(adt);
            }
        }
        
        /**
         * Sets (as xml) the "ADT" attribute
         */
        public void xsetADT(org.apache.xmlbeans.XmlDouble adt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ADT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ADT$6);
                }
                target.set(adt);
            }
        }
        
        /**
         * Unsets the "ADT" attribute
         */
        public void unsetADT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ADT$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YEAR$8);
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
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(YEAR$8);
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
                return get_store().find_attribute_user(YEAR$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YEAR$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(YEAR$8);
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
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(YEAR$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(YEAR$8);
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
                get_store().remove_attribute(YEAR$8);
            }
        }
        
        /**
         * Gets the "escFactor" attribute
         */
        public double getEscFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ESCFACTOR$10);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "escFactor" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetEscFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ESCFACTOR$10);
                return target;
            }
        }
        
        /**
         * True if has "escFactor" attribute
         */
        public boolean isSetEscFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ESCFACTOR$10) != null;
            }
        }
        
        /**
         * Sets the "escFactor" attribute
         */
        public void setEscFactor(double escFactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ESCFACTOR$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ESCFACTOR$10);
                }
                target.setDoubleValue(escFactor);
            }
        }
        
        /**
         * Sets (as xml) the "escFactor" attribute
         */
        public void xsetEscFactor(org.apache.xmlbeans.XmlDouble escFactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ESCFACTOR$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ESCFACTOR$10);
                }
                target.set(escFactor);
            }
        }
        
        /**
         * Unsets the "escFactor" attribute
         */
        public void unsetEscFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ESCFACTOR$10);
            }
        }
    }
}
