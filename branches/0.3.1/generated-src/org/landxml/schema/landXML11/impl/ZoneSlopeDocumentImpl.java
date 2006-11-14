/*
 * An XML document type.
 * Localname: ZoneSlope
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ZoneSlopeDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one ZoneSlope(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ZoneSlopeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ZoneSlopeDocument
{
    
    public ZoneSlopeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ZONESLOPE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ZoneSlope");
    
    
    /**
     * Gets the "ZoneSlope" element
     */
    public org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope getZoneSlope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope target = null;
            target = (org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope)get_store().find_element_user(ZONESLOPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ZoneSlope" element
     */
    public void setZoneSlope(org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope zoneSlope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope target = null;
            target = (org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope)get_store().find_element_user(ZONESLOPE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope)get_store().add_element_user(ZONESLOPE$0);
            }
            target.set(zoneSlope);
        }
    }
    
    /**
     * Appends and returns a new empty "ZoneSlope" element
     */
    public org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope addNewZoneSlope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope target = null;
            target = (org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope)get_store().add_element_user(ZONESLOPE$0);
            return target;
        }
    }
    /**
     * An XML ZoneSlope(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class ZoneSlopeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope
    {
        
        public ZoneSlopeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FEATURE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName STASTART$2 = 
            new javax.xml.namespace.QName("", "staStart");
        private static final javax.xml.namespace.QName STAEND$4 = 
            new javax.xml.namespace.QName("", "staEnd");
        private static final javax.xml.namespace.QName STARTVERTVALUE$6 = 
            new javax.xml.namespace.QName("", "startVertValue");
        private static final javax.xml.namespace.QName STARTVERTTYPE$8 = 
            new javax.xml.namespace.QName("", "startVertType");
        private static final javax.xml.namespace.QName ENDVERTVALUE$10 = 
            new javax.xml.namespace.QName("", "endVertValue");
        private static final javax.xml.namespace.QName ENDVERTTYPE$12 = 
            new javax.xml.namespace.QName("", "endVertType");
        private static final javax.xml.namespace.QName PARABOLICSTARTSTATION$14 = 
            new javax.xml.namespace.QName("", "parabolicStartStation");
        private static final javax.xml.namespace.QName PARABOLICENDSTATION$16 = 
            new javax.xml.namespace.QName("", "parabolicEndStation");
        
        
        /**
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return ZoneSlopeImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ZoneSlopeImpl.this.getFeatureArray(i);
                    ZoneSlopeImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { ZoneSlopeImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ZoneSlopeImpl.this.getFeatureArray(i);
                    ZoneSlopeImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return ZoneSlopeImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "startVertValue" attribute
         */
        public double getStartVertValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTVERTVALUE$6);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "startVertValue" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetStartVertValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STARTVERTVALUE$6);
                return target;
            }
        }
        
        /**
         * True if has "startVertValue" attribute
         */
        public boolean isSetStartVertValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STARTVERTVALUE$6) != null;
            }
        }
        
        /**
         * Sets the "startVertValue" attribute
         */
        public void setStartVertValue(double startVertValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTVERTVALUE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTVERTVALUE$6);
                }
                target.setDoubleValue(startVertValue);
            }
        }
        
        /**
         * Sets (as xml) the "startVertValue" attribute
         */
        public void xsetStartVertValue(org.apache.xmlbeans.XmlDouble startVertValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STARTVERTVALUE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(STARTVERTVALUE$6);
                }
                target.set(startVertValue);
            }
        }
        
        /**
         * Unsets the "startVertValue" attribute
         */
        public void unsetStartVertValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STARTVERTVALUE$6);
            }
        }
        
        /**
         * Gets the "startVertType" attribute
         */
        public org.landxml.schema.landXML11.ZoneVertType.Enum getStartVertType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTVERTTYPE$8);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ZoneVertType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "startVertType" attribute
         */
        public org.landxml.schema.landXML11.ZoneVertType xgetStartVertType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneVertType target = null;
                target = (org.landxml.schema.landXML11.ZoneVertType)get_store().find_attribute_user(STARTVERTTYPE$8);
                return target;
            }
        }
        
        /**
         * True if has "startVertType" attribute
         */
        public boolean isSetStartVertType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STARTVERTTYPE$8) != null;
            }
        }
        
        /**
         * Sets the "startVertType" attribute
         */
        public void setStartVertType(org.landxml.schema.landXML11.ZoneVertType.Enum startVertType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTVERTTYPE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTVERTTYPE$8);
                }
                target.setEnumValue(startVertType);
            }
        }
        
        /**
         * Sets (as xml) the "startVertType" attribute
         */
        public void xsetStartVertType(org.landxml.schema.landXML11.ZoneVertType startVertType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneVertType target = null;
                target = (org.landxml.schema.landXML11.ZoneVertType)get_store().find_attribute_user(STARTVERTTYPE$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ZoneVertType)get_store().add_attribute_user(STARTVERTTYPE$8);
                }
                target.set(startVertType);
            }
        }
        
        /**
         * Unsets the "startVertType" attribute
         */
        public void unsetStartVertType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STARTVERTTYPE$8);
            }
        }
        
        /**
         * Gets the "endVertValue" attribute
         */
        public double getEndVertValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDVERTVALUE$10);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "endVertValue" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetEndVertValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ENDVERTVALUE$10);
                return target;
            }
        }
        
        /**
         * Sets the "endVertValue" attribute
         */
        public void setEndVertValue(double endVertValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDVERTVALUE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDVERTVALUE$10);
                }
                target.setDoubleValue(endVertValue);
            }
        }
        
        /**
         * Sets (as xml) the "endVertValue" attribute
         */
        public void xsetEndVertValue(org.apache.xmlbeans.XmlDouble endVertValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ENDVERTVALUE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ENDVERTVALUE$10);
                }
                target.set(endVertValue);
            }
        }
        
        /**
         * Gets the "endVertType" attribute
         */
        public org.landxml.schema.landXML11.ZoneVertType.Enum getEndVertType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDVERTTYPE$12);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ZoneVertType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "endVertType" attribute
         */
        public org.landxml.schema.landXML11.ZoneVertType xgetEndVertType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneVertType target = null;
                target = (org.landxml.schema.landXML11.ZoneVertType)get_store().find_attribute_user(ENDVERTTYPE$12);
                return target;
            }
        }
        
        /**
         * Sets the "endVertType" attribute
         */
        public void setEndVertType(org.landxml.schema.landXML11.ZoneVertType.Enum endVertType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDVERTTYPE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDVERTTYPE$12);
                }
                target.setEnumValue(endVertType);
            }
        }
        
        /**
         * Sets (as xml) the "endVertType" attribute
         */
        public void xsetEndVertType(org.landxml.schema.landXML11.ZoneVertType endVertType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneVertType target = null;
                target = (org.landxml.schema.landXML11.ZoneVertType)get_store().find_attribute_user(ENDVERTTYPE$12);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ZoneVertType)get_store().add_attribute_user(ENDVERTTYPE$12);
                }
                target.set(endVertType);
            }
        }
        
        /**
         * Gets the "parabolicStartStation" attribute
         */
        public double getParabolicStartStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARABOLICSTARTSTATION$14);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "parabolicStartStation" attribute
         */
        public org.landxml.schema.landXML11.Station xgetParabolicStartStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(PARABOLICSTARTSTATION$14);
                return target;
            }
        }
        
        /**
         * True if has "parabolicStartStation" attribute
         */
        public boolean isSetParabolicStartStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARABOLICSTARTSTATION$14) != null;
            }
        }
        
        /**
         * Sets the "parabolicStartStation" attribute
         */
        public void setParabolicStartStation(double parabolicStartStation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARABOLICSTARTSTATION$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARABOLICSTARTSTATION$14);
                }
                target.setDoubleValue(parabolicStartStation);
            }
        }
        
        /**
         * Sets (as xml) the "parabolicStartStation" attribute
         */
        public void xsetParabolicStartStation(org.landxml.schema.landXML11.Station parabolicStartStation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(PARABOLICSTARTSTATION$14);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(PARABOLICSTARTSTATION$14);
                }
                target.set(parabolicStartStation);
            }
        }
        
        /**
         * Unsets the "parabolicStartStation" attribute
         */
        public void unsetParabolicStartStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARABOLICSTARTSTATION$14);
            }
        }
        
        /**
         * Gets the "parabolicEndStation" attribute
         */
        public double getParabolicEndStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARABOLICENDSTATION$16);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "parabolicEndStation" attribute
         */
        public org.landxml.schema.landXML11.Station xgetParabolicEndStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(PARABOLICENDSTATION$16);
                return target;
            }
        }
        
        /**
         * True if has "parabolicEndStation" attribute
         */
        public boolean isSetParabolicEndStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARABOLICENDSTATION$16) != null;
            }
        }
        
        /**
         * Sets the "parabolicEndStation" attribute
         */
        public void setParabolicEndStation(double parabolicEndStation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARABOLICENDSTATION$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARABOLICENDSTATION$16);
                }
                target.setDoubleValue(parabolicEndStation);
            }
        }
        
        /**
         * Sets (as xml) the "parabolicEndStation" attribute
         */
        public void xsetParabolicEndStation(org.landxml.schema.landXML11.Station parabolicEndStation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(PARABOLICENDSTATION$16);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(PARABOLICENDSTATION$16);
                }
                target.set(parabolicEndStation);
            }
        }
        
        /**
         * Unsets the "parabolicEndStation" attribute
         */
        public void unsetParabolicEndStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARABOLICENDSTATION$16);
            }
        }
    }
}
