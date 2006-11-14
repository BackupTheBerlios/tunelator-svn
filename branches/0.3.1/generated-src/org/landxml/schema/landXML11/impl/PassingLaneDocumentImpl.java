/*
 * An XML document type.
 * Localname: PassingLane
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PassingLaneDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one PassingLane(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class PassingLaneDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PassingLaneDocument
{
    
    public PassingLaneDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PASSINGLANE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PassingLane");
    
    
    /**
     * Gets the "PassingLane" element
     */
    public org.landxml.schema.landXML11.PassingLaneDocument.PassingLane getPassingLane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PassingLaneDocument.PassingLane target = null;
            target = (org.landxml.schema.landXML11.PassingLaneDocument.PassingLane)get_store().find_element_user(PASSINGLANE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PassingLane" element
     */
    public void setPassingLane(org.landxml.schema.landXML11.PassingLaneDocument.PassingLane passingLane)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PassingLaneDocument.PassingLane target = null;
            target = (org.landxml.schema.landXML11.PassingLaneDocument.PassingLane)get_store().find_element_user(PASSINGLANE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PassingLaneDocument.PassingLane)get_store().add_element_user(PASSINGLANE$0);
            }
            target.set(passingLane);
        }
    }
    
    /**
     * Appends and returns a new empty "PassingLane" element
     */
    public org.landxml.schema.landXML11.PassingLaneDocument.PassingLane addNewPassingLane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PassingLaneDocument.PassingLane target = null;
            target = (org.landxml.schema.landXML11.PassingLaneDocument.PassingLane)get_store().add_element_user(PASSINGLANE$0);
            return target;
        }
    }
    /**
     * An XML PassingLane(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class PassingLaneImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PassingLaneDocument.PassingLane
    {
        
        public PassingLaneImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FEATURE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName STASTART$2 = 
            new javax.xml.namespace.QName("", "staStart");
        private static final javax.xml.namespace.QName STAEND$4 = 
            new javax.xml.namespace.QName("", "staEnd");
        private static final javax.xml.namespace.QName BEGINFULLWIDTHSTA$6 = 
            new javax.xml.namespace.QName("", "beginFullWidthSta");
        private static final javax.xml.namespace.QName ENDFULLWIDTHSTA$8 = 
            new javax.xml.namespace.QName("", "endFullWidthSta");
        private static final javax.xml.namespace.QName WIDTH$10 = 
            new javax.xml.namespace.QName("", "width");
        private static final javax.xml.namespace.QName SIDEOFROAD$12 = 
            new javax.xml.namespace.QName("", "sideofRoad");
        
        
        /**
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return PassingLaneImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = PassingLaneImpl.this.getFeatureArray(i);
                    PassingLaneImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { PassingLaneImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = PassingLaneImpl.this.getFeatureArray(i);
                    PassingLaneImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return PassingLaneImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "beginFullWidthSta" attribute
         */
        public double getBeginFullWidthSta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEGINFULLWIDTHSTA$6);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "beginFullWidthSta" attribute
         */
        public org.landxml.schema.landXML11.Station xgetBeginFullWidthSta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(BEGINFULLWIDTHSTA$6);
                return target;
            }
        }
        
        /**
         * True if has "beginFullWidthSta" attribute
         */
        public boolean isSetBeginFullWidthSta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BEGINFULLWIDTHSTA$6) != null;
            }
        }
        
        /**
         * Sets the "beginFullWidthSta" attribute
         */
        public void setBeginFullWidthSta(double beginFullWidthSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEGINFULLWIDTHSTA$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BEGINFULLWIDTHSTA$6);
                }
                target.setDoubleValue(beginFullWidthSta);
            }
        }
        
        /**
         * Sets (as xml) the "beginFullWidthSta" attribute
         */
        public void xsetBeginFullWidthSta(org.landxml.schema.landXML11.Station beginFullWidthSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(BEGINFULLWIDTHSTA$6);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(BEGINFULLWIDTHSTA$6);
                }
                target.set(beginFullWidthSta);
            }
        }
        
        /**
         * Unsets the "beginFullWidthSta" attribute
         */
        public void unsetBeginFullWidthSta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BEGINFULLWIDTHSTA$6);
            }
        }
        
        /**
         * Gets the "endFullWidthSta" attribute
         */
        public double getEndFullWidthSta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDFULLWIDTHSTA$8);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "endFullWidthSta" attribute
         */
        public org.landxml.schema.landXML11.Station xgetEndFullWidthSta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(ENDFULLWIDTHSTA$8);
                return target;
            }
        }
        
        /**
         * True if has "endFullWidthSta" attribute
         */
        public boolean isSetEndFullWidthSta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENDFULLWIDTHSTA$8) != null;
            }
        }
        
        /**
         * Sets the "endFullWidthSta" attribute
         */
        public void setEndFullWidthSta(double endFullWidthSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDFULLWIDTHSTA$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDFULLWIDTHSTA$8);
                }
                target.setDoubleValue(endFullWidthSta);
            }
        }
        
        /**
         * Sets (as xml) the "endFullWidthSta" attribute
         */
        public void xsetEndFullWidthSta(org.landxml.schema.landXML11.Station endFullWidthSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(ENDFULLWIDTHSTA$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(ENDFULLWIDTHSTA$8);
                }
                target.set(endFullWidthSta);
            }
        }
        
        /**
         * Unsets the "endFullWidthSta" attribute
         */
        public void unsetEndFullWidthSta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENDFULLWIDTHSTA$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$10);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WIDTH$10);
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
                return get_store().find_attribute_user(WIDTH$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WIDTH$10);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WIDTH$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WIDTH$10);
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
                get_store().remove_attribute(WIDTH$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIDEOFROAD$12);
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
                target = (org.landxml.schema.landXML11.SideofRoadType)get_store().find_attribute_user(SIDEOFROAD$12);
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
                return get_store().find_attribute_user(SIDEOFROAD$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIDEOFROAD$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIDEOFROAD$12);
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
                target = (org.landxml.schema.landXML11.SideofRoadType)get_store().find_attribute_user(SIDEOFROAD$12);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SideofRoadType)get_store().add_attribute_user(SIDEOFROAD$12);
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
                get_store().remove_attribute(SIDEOFROAD$12);
            }
        }
    }
}
