/*
 * An XML document type.
 * Localname: SpeedStation
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.SpeedStationDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one SpeedStation(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class SpeedStationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SpeedStationDocument
{
    
    public SpeedStationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPEEDSTATION$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "SpeedStation");
    
    
    /**
     * Gets the "SpeedStation" element
     */
    public org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation getSpeedStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation target = null;
            target = (org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation)get_store().find_element_user(SPEEDSTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SpeedStation" element
     */
    public void setSpeedStation(org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation speedStation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation target = null;
            target = (org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation)get_store().find_element_user(SPEEDSTATION$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation)get_store().add_element_user(SPEEDSTATION$0);
            }
            target.set(speedStation);
        }
    }
    
    /**
     * Appends and returns a new empty "SpeedStation" element
     */
    public org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation addNewSpeedStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation target = null;
            target = (org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation)get_store().add_element_user(SPEEDSTATION$0);
            return target;
        }
    }
    /**
     * An XML SpeedStation(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class SpeedStationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation
    {
        
        public SpeedStationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATION$0 = 
            new javax.xml.namespace.QName("", "station");
        private static final javax.xml.namespace.QName SPEED$2 = 
            new javax.xml.namespace.QName("", "speed");
        
        
        /**
         * Gets the "station" attribute
         */
        public double getStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATION$0);
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
        public org.apache.xmlbeans.XmlDouble xgetStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STATION$0);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATION$0);
                }
                target.setDoubleValue(station);
            }
        }
        
        /**
         * Sets (as xml) the "station" attribute
         */
        public void xsetStation(org.apache.xmlbeans.XmlDouble station)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STATION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(STATION$0);
                }
                target.set(station);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPEED$2);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SPEED$2);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPEED$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPEED$2);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SPEED$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SPEED$2);
                }
                target.set(speed);
            }
        }
    }
}
