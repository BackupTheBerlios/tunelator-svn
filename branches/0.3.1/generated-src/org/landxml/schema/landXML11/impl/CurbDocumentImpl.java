/*
 * An XML document type.
 * Localname: Curb
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CurbDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Curb(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class CurbDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CurbDocument
{
    
    public CurbDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURB$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Curb");
    
    
    /**
     * Gets the "Curb" element
     */
    public org.landxml.schema.landXML11.CurbDocument.Curb getCurb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CurbDocument.Curb target = null;
            target = (org.landxml.schema.landXML11.CurbDocument.Curb)get_store().find_element_user(CURB$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Curb" element
     */
    public void setCurb(org.landxml.schema.landXML11.CurbDocument.Curb curb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CurbDocument.Curb target = null;
            target = (org.landxml.schema.landXML11.CurbDocument.Curb)get_store().find_element_user(CURB$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.CurbDocument.Curb)get_store().add_element_user(CURB$0);
            }
            target.set(curb);
        }
    }
    
    /**
     * Appends and returns a new empty "Curb" element
     */
    public org.landxml.schema.landXML11.CurbDocument.Curb addNewCurb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CurbDocument.Curb target = null;
            target = (org.landxml.schema.landXML11.CurbDocument.Curb)get_store().add_element_user(CURB$0);
            return target;
        }
    }
    /**
     * An XML Curb(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class CurbImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CurbDocument.Curb
    {
        
        public CurbImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FEATURE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName STASTART$2 = 
            new javax.xml.namespace.QName("", "staStart");
        private static final javax.xml.namespace.QName STAEND$4 = 
            new javax.xml.namespace.QName("", "staEnd");
        private static final javax.xml.namespace.QName SIDEOFROAD$6 = 
            new javax.xml.namespace.QName("", "sideofRoad");
        private static final javax.xml.namespace.QName TYPE$8 = 
            new javax.xml.namespace.QName("", "type");
        
        
        /**
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return CurbImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CurbImpl.this.getFeatureArray(i);
                    CurbImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { CurbImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CurbImpl.this.getFeatureArray(i);
                    CurbImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return CurbImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "sideofRoad" attribute
         */
        public org.landxml.schema.landXML11.SideofRoadType.Enum getSideofRoad()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIDEOFROAD$6);
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
                target = (org.landxml.schema.landXML11.SideofRoadType)get_store().find_attribute_user(SIDEOFROAD$6);
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
                return get_store().find_attribute_user(SIDEOFROAD$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIDEOFROAD$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIDEOFROAD$6);
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
                target = (org.landxml.schema.landXML11.SideofRoadType)get_store().find_attribute_user(SIDEOFROAD$6);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SideofRoadType)get_store().add_attribute_user(SIDEOFROAD$6);
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
                get_store().remove_attribute(SIDEOFROAD$6);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public org.landxml.schema.landXML11.CurbType.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.CurbType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.landxml.schema.landXML11.CurbType xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CurbType target = null;
                target = (org.landxml.schema.landXML11.CurbType)get_store().find_attribute_user(TYPE$8);
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$8) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(org.landxml.schema.landXML11.CurbType.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$8);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.landxml.schema.landXML11.CurbType type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CurbType target = null;
                target = (org.landxml.schema.landXML11.CurbType)get_store().find_attribute_user(TYPE$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CurbType)get_store().add_attribute_user(TYPE$8);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$8);
            }
        }
    }
}
