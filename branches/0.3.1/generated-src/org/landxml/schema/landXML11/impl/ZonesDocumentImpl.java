/*
 * An XML document type.
 * Localname: Zones
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ZonesDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Zones(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ZonesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ZonesDocument
{
    
    public ZonesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ZONES$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Zones");
    
    
    /**
     * Gets the "Zones" element
     */
    public org.landxml.schema.landXML11.ZonesDocument.Zones getZones()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ZonesDocument.Zones target = null;
            target = (org.landxml.schema.landXML11.ZonesDocument.Zones)get_store().find_element_user(ZONES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Zones" element
     */
    public void setZones(org.landxml.schema.landXML11.ZonesDocument.Zones zones)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ZonesDocument.Zones target = null;
            target = (org.landxml.schema.landXML11.ZonesDocument.Zones)get_store().find_element_user(ZONES$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ZonesDocument.Zones)get_store().add_element_user(ZONES$0);
            }
            target.set(zones);
        }
    }
    
    /**
     * Appends and returns a new empty "Zones" element
     */
    public org.landxml.schema.landXML11.ZonesDocument.Zones addNewZones()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ZonesDocument.Zones target = null;
            target = (org.landxml.schema.landXML11.ZonesDocument.Zones)get_store().add_element_user(ZONES$0);
            return target;
        }
    }
    /**
     * An XML Zones(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class ZonesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ZonesDocument.Zones
    {
        
        public ZonesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ZONE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Zone");
        private static final javax.xml.namespace.QName ZONEHINGE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ZoneHinge");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName SIDE$6 = 
            new javax.xml.namespace.QName("", "side");
        private static final javax.xml.namespace.QName DESC$8 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName NAME$10 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName STATE$12 = 
            new javax.xml.namespace.QName("", "state");
        
        
        /**
         * Gets a List of "Zone" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ZoneDocument.Zone> getZoneList()
        {
            final class ZoneList extends java.util.AbstractList<org.landxml.schema.landXML11.ZoneDocument.Zone>
            {
                public org.landxml.schema.landXML11.ZoneDocument.Zone get(int i)
                    { return ZonesImpl.this.getZoneArray(i); }
                
                public org.landxml.schema.landXML11.ZoneDocument.Zone set(int i, org.landxml.schema.landXML11.ZoneDocument.Zone o)
                {
                    org.landxml.schema.landXML11.ZoneDocument.Zone old = ZonesImpl.this.getZoneArray(i);
                    ZonesImpl.this.setZoneArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ZoneDocument.Zone o)
                    { ZonesImpl.this.insertNewZone(i).set(o); }
                
                public org.landxml.schema.landXML11.ZoneDocument.Zone remove(int i)
                {
                    org.landxml.schema.landXML11.ZoneDocument.Zone old = ZonesImpl.this.getZoneArray(i);
                    ZonesImpl.this.removeZone(i);
                    return old;
                }
                
                public int size()
                    { return ZonesImpl.this.sizeOfZoneArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ZoneList();
            }
        }
        
        /**
         * Gets array of all "Zone" elements
         */
        public org.landxml.schema.landXML11.ZoneDocument.Zone[] getZoneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ZONE$0, targetList);
                org.landxml.schema.landXML11.ZoneDocument.Zone[] result = new org.landxml.schema.landXML11.ZoneDocument.Zone[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Zone" element
         */
        public org.landxml.schema.landXML11.ZoneDocument.Zone getZoneArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneDocument.Zone target = null;
                target = (org.landxml.schema.landXML11.ZoneDocument.Zone)get_store().find_element_user(ZONE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Zone" element
         */
        public int sizeOfZoneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ZONE$0);
            }
        }
        
        /**
         * Sets array of all "Zone" element
         */
        public void setZoneArray(org.landxml.schema.landXML11.ZoneDocument.Zone[] zoneArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(zoneArray, ZONE$0);
            }
        }
        
        /**
         * Sets ith "Zone" element
         */
        public void setZoneArray(int i, org.landxml.schema.landXML11.ZoneDocument.Zone zone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneDocument.Zone target = null;
                target = (org.landxml.schema.landXML11.ZoneDocument.Zone)get_store().find_element_user(ZONE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(zone);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Zone" element
         */
        public org.landxml.schema.landXML11.ZoneDocument.Zone insertNewZone(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneDocument.Zone target = null;
                target = (org.landxml.schema.landXML11.ZoneDocument.Zone)get_store().insert_element_user(ZONE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Zone" element
         */
        public org.landxml.schema.landXML11.ZoneDocument.Zone addNewZone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneDocument.Zone target = null;
                target = (org.landxml.schema.landXML11.ZoneDocument.Zone)get_store().add_element_user(ZONE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Zone" element
         */
        public void removeZone(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ZONE$0, i);
            }
        }
        
        /**
         * Gets a List of "ZoneHinge" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge> getZoneHingeList()
        {
            final class ZoneHingeList extends java.util.AbstractList<org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge>
            {
                public org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge get(int i)
                    { return ZonesImpl.this.getZoneHingeArray(i); }
                
                public org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge set(int i, org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge o)
                {
                    org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge old = ZonesImpl.this.getZoneHingeArray(i);
                    ZonesImpl.this.setZoneHingeArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge o)
                    { ZonesImpl.this.insertNewZoneHinge(i).set(o); }
                
                public org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge remove(int i)
                {
                    org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge old = ZonesImpl.this.getZoneHingeArray(i);
                    ZonesImpl.this.removeZoneHinge(i);
                    return old;
                }
                
                public int size()
                    { return ZonesImpl.this.sizeOfZoneHingeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ZoneHingeList();
            }
        }
        
        /**
         * Gets array of all "ZoneHinge" elements
         */
        public org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge[] getZoneHingeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ZONEHINGE$2, targetList);
                org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge[] result = new org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ZoneHinge" element
         */
        public org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge getZoneHingeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge target = null;
                target = (org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge)get_store().find_element_user(ZONEHINGE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ZoneHinge" element
         */
        public int sizeOfZoneHingeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ZONEHINGE$2);
            }
        }
        
        /**
         * Sets array of all "ZoneHinge" element
         */
        public void setZoneHingeArray(org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge[] zoneHingeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(zoneHingeArray, ZONEHINGE$2);
            }
        }
        
        /**
         * Sets ith "ZoneHinge" element
         */
        public void setZoneHingeArray(int i, org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge zoneHinge)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge target = null;
                target = (org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge)get_store().find_element_user(ZONEHINGE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(zoneHinge);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ZoneHinge" element
         */
        public org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge insertNewZoneHinge(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge target = null;
                target = (org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge)get_store().insert_element_user(ZONEHINGE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ZoneHinge" element
         */
        public org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge addNewZoneHinge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge target = null;
                target = (org.landxml.schema.landXML11.ZoneHingeDocument.ZoneHinge)get_store().add_element_user(ZONEHINGE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "ZoneHinge" element
         */
        public void removeZoneHinge(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ZONEHINGE$2, i);
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
                    { return ZonesImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ZonesImpl.this.getFeatureArray(i);
                    ZonesImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { ZonesImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ZonesImpl.this.getFeatureArray(i);
                    ZonesImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return ZonesImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$4, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$4, i);
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
                return get_store().count_elements(FEATURE$4);
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
                arraySetterHelper(featureArray, FEATURE$4);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$4, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$4, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$4);
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
                get_store().remove_element(FEATURE$4, i);
            }
        }
        
        /**
         * Gets the "side" attribute
         */
        public org.landxml.schema.landXML11.SideofRoadType.Enum getSide()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIDE$6);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.SideofRoadType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "side" attribute
         */
        public org.landxml.schema.landXML11.SideofRoadType xgetSide()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SideofRoadType target = null;
                target = (org.landxml.schema.landXML11.SideofRoadType)get_store().find_attribute_user(SIDE$6);
                return target;
            }
        }
        
        /**
         * Sets the "side" attribute
         */
        public void setSide(org.landxml.schema.landXML11.SideofRoadType.Enum side)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIDE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIDE$6);
                }
                target.setEnumValue(side);
            }
        }
        
        /**
         * Sets (as xml) the "side" attribute
         */
        public void xsetSide(org.landxml.schema.landXML11.SideofRoadType side)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SideofRoadType target = null;
                target = (org.landxml.schema.landXML11.SideofRoadType)get_store().find_attribute_user(SIDE$6);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SideofRoadType)get_store().add_attribute_user(SIDE$6);
                }
                target.set(side);
            }
        }
        
        /**
         * Gets the "desc" attribute
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "desc" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$8);
                return target;
            }
        }
        
        /**
         * True if has "desc" attribute
         */
        public boolean isSetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DESC$8) != null;
            }
        }
        
        /**
         * Sets the "desc" attribute
         */
        public void setDesc(java.lang.String desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$8);
                }
                target.setStringValue(desc);
            }
        }
        
        /**
         * Sets (as xml) the "desc" attribute
         */
        public void xsetDesc(org.apache.xmlbeans.XmlString desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$8);
                }
                target.set(desc);
            }
        }
        
        /**
         * Unsets the "desc" attribute
         */
        public void unsetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DESC$8);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$10);
                return target;
            }
        }
        
        /**
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$10) != null;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$10);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$10);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$10);
            }
        }
        
        /**
         * Gets the "state" attribute
         */
        public org.landxml.schema.landXML11.StateType.Enum getState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$12);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.StateType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "state" attribute
         */
        public org.landxml.schema.landXML11.StateType xgetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StateType target = null;
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$12);
                return target;
            }
        }
        
        /**
         * True if has "state" attribute
         */
        public boolean isSetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STATE$12) != null;
            }
        }
        
        /**
         * Sets the "state" attribute
         */
        public void setState(org.landxml.schema.landXML11.StateType.Enum state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$12);
                }
                target.setEnumValue(state);
            }
        }
        
        /**
         * Sets (as xml) the "state" attribute
         */
        public void xsetState(org.landxml.schema.landXML11.StateType state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StateType target = null;
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$12);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$12);
                }
                target.set(state);
            }
        }
        
        /**
         * Unsets the "state" attribute
         */
        public void unsetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STATE$12);
            }
        }
    }
}
