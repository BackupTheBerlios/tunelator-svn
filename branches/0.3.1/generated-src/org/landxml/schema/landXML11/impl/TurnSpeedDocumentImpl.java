/*
 * An XML document type.
 * Localname: TurnSpeed
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.TurnSpeedDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one TurnSpeed(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class TurnSpeedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.TurnSpeedDocument
{
    
    public TurnSpeedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TURNSPEED$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "TurnSpeed");
    
    
    /**
     * Gets the "TurnSpeed" element
     */
    public org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed getTurnSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed target = null;
            target = (org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed)get_store().find_element_user(TURNSPEED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TurnSpeed" element
     */
    public void setTurnSpeed(org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed turnSpeed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed target = null;
            target = (org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed)get_store().find_element_user(TURNSPEED$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed)get_store().add_element_user(TURNSPEED$0);
            }
            target.set(turnSpeed);
        }
    }
    
    /**
     * Appends and returns a new empty "TurnSpeed" element
     */
    public org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed addNewTurnSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed target = null;
            target = (org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed)get_store().add_element_user(TURNSPEED$0);
            return target;
        }
    }
    /**
     * An XML TurnSpeed(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class TurnSpeedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed
    {
        
        public TurnSpeedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FEATURE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName STATION$2 = 
            new javax.xml.namespace.QName("", "station");
        private static final javax.xml.namespace.QName LEGNUMBER$4 = 
            new javax.xml.namespace.QName("", "legNumber");
        private static final javax.xml.namespace.QName SPEED$6 = 
            new javax.xml.namespace.QName("", "speed");
        
        
        /**
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return TurnSpeedImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = TurnSpeedImpl.this.getFeatureArray(i);
                    TurnSpeedImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { TurnSpeedImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = TurnSpeedImpl.this.getFeatureArray(i);
                    TurnSpeedImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return TurnSpeedImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "speed" attribute
         */
        public double getSpeed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPEED$6);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "speed" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSpeed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SPEED$6);
                return target;
            }
        }
        
        /**
         * True if has "speed" attribute
         */
        public boolean isSetSpeed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SPEED$6) != null;
            }
        }
        
        /**
         * Sets the "speed" attribute
         */
        public void setSpeed(double speed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPEED$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPEED$6);
                }
                target.setDoubleValue(speed);
            }
        }
        
        /**
         * Sets (as xml) the "speed" attribute
         */
        public void xsetSpeed(org.apache.xmlbeans.XmlDouble speed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SPEED$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SPEED$6);
                }
                target.set(speed);
            }
        }
        
        /**
         * Unsets the "speed" attribute
         */
        public void unsetSpeed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SPEED$6);
            }
        }
    }
}
