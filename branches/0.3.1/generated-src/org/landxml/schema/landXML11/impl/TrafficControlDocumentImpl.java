/*
 * An XML document type.
 * Localname: TrafficControl
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.TrafficControlDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one TrafficControl(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class TrafficControlDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.TrafficControlDocument
{
    
    public TrafficControlDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRAFFICCONTROL$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "TrafficControl");
    
    
    /**
     * Gets the "TrafficControl" element
     */
    public org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl getTrafficControl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl target = null;
            target = (org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl)get_store().find_element_user(TRAFFICCONTROL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TrafficControl" element
     */
    public void setTrafficControl(org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl trafficControl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl target = null;
            target = (org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl)get_store().find_element_user(TRAFFICCONTROL$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl)get_store().add_element_user(TRAFFICCONTROL$0);
            }
            target.set(trafficControl);
        }
    }
    
    /**
     * Appends and returns a new empty "TrafficControl" element
     */
    public org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl addNewTrafficControl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl target = null;
            target = (org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl)get_store().add_element_user(TRAFFICCONTROL$0);
            return target;
        }
    }
    /**
     * An XML TrafficControl(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class TrafficControlImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl
    {
        
        public TrafficControlImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FEATURE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName STATION$2 = 
            new javax.xml.namespace.QName("", "station");
        private static final javax.xml.namespace.QName SIGNALPERIOD$4 = 
            new javax.xml.namespace.QName("", "signalPeriod");
        private static final javax.xml.namespace.QName CONTROLPOSITION$6 = 
            new javax.xml.namespace.QName("", "controlPosition");
        private static final javax.xml.namespace.QName CONTROLTYPE$8 = 
            new javax.xml.namespace.QName("", "controlType");
        
        
        /**
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return TrafficControlImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = TrafficControlImpl.this.getFeatureArray(i);
                    TrafficControlImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { TrafficControlImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = TrafficControlImpl.this.getFeatureArray(i);
                    TrafficControlImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return TrafficControlImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "signalPeriod" attribute
         */
        public double getSignalPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIGNALPERIOD$4);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "signalPeriod" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSignalPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SIGNALPERIOD$4);
                return target;
            }
        }
        
        /**
         * True if has "signalPeriod" attribute
         */
        public boolean isSetSignalPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SIGNALPERIOD$4) != null;
            }
        }
        
        /**
         * Sets the "signalPeriod" attribute
         */
        public void setSignalPeriod(double signalPeriod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIGNALPERIOD$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIGNALPERIOD$4);
                }
                target.setDoubleValue(signalPeriod);
            }
        }
        
        /**
         * Sets (as xml) the "signalPeriod" attribute
         */
        public void xsetSignalPeriod(org.apache.xmlbeans.XmlDouble signalPeriod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SIGNALPERIOD$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SIGNALPERIOD$4);
                }
                target.set(signalPeriod);
            }
        }
        
        /**
         * Unsets the "signalPeriod" attribute
         */
        public void unsetSignalPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SIGNALPERIOD$4);
            }
        }
        
        /**
         * Gets the "controlPosition" attribute
         */
        public org.landxml.schema.landXML11.TrafficControlPosition.Enum getControlPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTROLPOSITION$6);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.TrafficControlPosition.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "controlPosition" attribute
         */
        public org.landxml.schema.landXML11.TrafficControlPosition xgetControlPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TrafficControlPosition target = null;
                target = (org.landxml.schema.landXML11.TrafficControlPosition)get_store().find_attribute_user(CONTROLPOSITION$6);
                return target;
            }
        }
        
        /**
         * True if has "controlPosition" attribute
         */
        public boolean isSetControlPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CONTROLPOSITION$6) != null;
            }
        }
        
        /**
         * Sets the "controlPosition" attribute
         */
        public void setControlPosition(org.landxml.schema.landXML11.TrafficControlPosition.Enum controlPosition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTROLPOSITION$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTROLPOSITION$6);
                }
                target.setEnumValue(controlPosition);
            }
        }
        
        /**
         * Sets (as xml) the "controlPosition" attribute
         */
        public void xsetControlPosition(org.landxml.schema.landXML11.TrafficControlPosition controlPosition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TrafficControlPosition target = null;
                target = (org.landxml.schema.landXML11.TrafficControlPosition)get_store().find_attribute_user(CONTROLPOSITION$6);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.TrafficControlPosition)get_store().add_attribute_user(CONTROLPOSITION$6);
                }
                target.set(controlPosition);
            }
        }
        
        /**
         * Unsets the "controlPosition" attribute
         */
        public void unsetControlPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CONTROLPOSITION$6);
            }
        }
        
        /**
         * Gets the "controlType" attribute
         */
        public org.landxml.schema.landXML11.TrafficControlType.Enum getControlType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTROLTYPE$8);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.TrafficControlType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "controlType" attribute
         */
        public org.landxml.schema.landXML11.TrafficControlType xgetControlType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TrafficControlType target = null;
                target = (org.landxml.schema.landXML11.TrafficControlType)get_store().find_attribute_user(CONTROLTYPE$8);
                return target;
            }
        }
        
        /**
         * True if has "controlType" attribute
         */
        public boolean isSetControlType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CONTROLTYPE$8) != null;
            }
        }
        
        /**
         * Sets the "controlType" attribute
         */
        public void setControlType(org.landxml.schema.landXML11.TrafficControlType.Enum controlType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTROLTYPE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTROLTYPE$8);
                }
                target.setEnumValue(controlType);
            }
        }
        
        /**
         * Sets (as xml) the "controlType" attribute
         */
        public void xsetControlType(org.landxml.schema.landXML11.TrafficControlType controlType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TrafficControlType target = null;
                target = (org.landxml.schema.landXML11.TrafficControlType)get_store().find_attribute_user(CONTROLTYPE$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.TrafficControlType)get_store().add_attribute_user(CONTROLTYPE$8);
                }
                target.set(controlType);
            }
        }
        
        /**
         * Unsets the "controlType" attribute
         */
        public void unsetControlType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CONTROLTYPE$8);
            }
        }
    }
}
