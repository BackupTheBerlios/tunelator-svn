/*
 * An XML document type.
 * Localname: BikeFacilities
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.BikeFacilitiesDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one BikeFacilities(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class BikeFacilitiesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.BikeFacilitiesDocument
{
    
    public BikeFacilitiesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BIKEFACILITIES$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "BikeFacilities");
    
    
    /**
     * Gets the "BikeFacilities" element
     */
    public org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities getBikeFacilities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities target = null;
            target = (org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities)get_store().find_element_user(BIKEFACILITIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BikeFacilities" element
     */
    public void setBikeFacilities(org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities bikeFacilities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities target = null;
            target = (org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities)get_store().find_element_user(BIKEFACILITIES$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities)get_store().add_element_user(BIKEFACILITIES$0);
            }
            target.set(bikeFacilities);
        }
    }
    
    /**
     * Appends and returns a new empty "BikeFacilities" element
     */
    public org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities addNewBikeFacilities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities target = null;
            target = (org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities)get_store().add_element_user(BIKEFACILITIES$0);
            return target;
        }
    }
    /**
     * An XML BikeFacilities(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class BikeFacilitiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities
    {
        
        public BikeFacilitiesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FEATURE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName STASTART$2 = 
            new javax.xml.namespace.QName("", "staStart");
        private static final javax.xml.namespace.QName STAEND$4 = 
            new javax.xml.namespace.QName("", "staEnd");
        private static final javax.xml.namespace.QName WIDTH$6 = 
            new javax.xml.namespace.QName("", "width");
        private static final javax.xml.namespace.QName SIDEOFROAD$8 = 
            new javax.xml.namespace.QName("", "sideofRoad");
        
        
        /**
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return BikeFacilitiesImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = BikeFacilitiesImpl.this.getFeatureArray(i);
                    BikeFacilitiesImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { BikeFacilitiesImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = BikeFacilitiesImpl.this.getFeatureArray(i);
                    BikeFacilitiesImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return BikeFacilitiesImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "width" attribute
         */
        public double getWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$6);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "width" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WIDTH$6);
                return target;
            }
        }
        
        /**
         * True if has "width" attribute
         */
        public boolean isSetWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(WIDTH$6) != null;
            }
        }
        
        /**
         * Sets the "width" attribute
         */
        public void setWidth(double width)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WIDTH$6);
                }
                target.setDoubleValue(width);
            }
        }
        
        /**
         * Sets (as xml) the "width" attribute
         */
        public void xsetWidth(org.apache.xmlbeans.XmlDouble width)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WIDTH$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WIDTH$6);
                }
                target.set(width);
            }
        }
        
        /**
         * Unsets the "width" attribute
         */
        public void unsetWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(WIDTH$6);
            }
        }
        
        /**
         * Gets the "sideofRoad" attribute
         */
        public org.landxml.schema.landXML11.SideofRoadType.Enum getSideofRoad()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIDEOFROAD$8);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.SideofRoadType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "sideofRoad" attribute
         */
        public org.landxml.schema.landXML11.SideofRoadType xgetSideofRoad()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SideofRoadType target = null;
                target = (org.landxml.schema.landXML11.SideofRoadType)get_store().find_attribute_user(SIDEOFROAD$8);
                return target;
            }
        }
        
        /**
         * True if has "sideofRoad" attribute
         */
        public boolean isSetSideofRoad()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SIDEOFROAD$8) != null;
            }
        }
        
        /**
         * Sets the "sideofRoad" attribute
         */
        public void setSideofRoad(org.landxml.schema.landXML11.SideofRoadType.Enum sideofRoad)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIDEOFROAD$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIDEOFROAD$8);
                }
                target.setEnumValue(sideofRoad);
            }
        }
        
        /**
         * Sets (as xml) the "sideofRoad" attribute
         */
        public void xsetSideofRoad(org.landxml.schema.landXML11.SideofRoadType sideofRoad)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SideofRoadType target = null;
                target = (org.landxml.schema.landXML11.SideofRoadType)get_store().find_attribute_user(SIDEOFROAD$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SideofRoadType)get_store().add_attribute_user(SIDEOFROAD$8);
                }
                target.set(sideofRoad);
            }
        }
        
        /**
         * Unsets the "sideofRoad" attribute
         */
        public void unsetSideofRoad()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SIDEOFROAD$8);
            }
        }
    }
}
