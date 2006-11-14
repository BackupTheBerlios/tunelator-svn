/*
 * An XML document type.
 * Localname: ZoneCutFill
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ZoneCutFillDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one ZoneCutFill(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ZoneCutFillDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ZoneCutFillDocument
{
    
    public ZoneCutFillDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ZONECUTFILL$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ZoneCutFill");
    
    
    /**
     * Gets the "ZoneCutFill" element
     */
    public org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill getZoneCutFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill target = null;
            target = (org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill)get_store().find_element_user(ZONECUTFILL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ZoneCutFill" element
     */
    public void setZoneCutFill(org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill zoneCutFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill target = null;
            target = (org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill)get_store().find_element_user(ZONECUTFILL$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill)get_store().add_element_user(ZONECUTFILL$0);
            }
            target.set(zoneCutFill);
        }
    }
    
    /**
     * Appends and returns a new empty "ZoneCutFill" element
     */
    public org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill addNewZoneCutFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill target = null;
            target = (org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill)get_store().add_element_user(ZONECUTFILL$0);
            return target;
        }
    }
    /**
     * An XML ZoneCutFill(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class ZoneCutFillImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill
    {
        
        public ZoneCutFillImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FEATURE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName STASTART$2 = 
            new javax.xml.namespace.QName("", "staStart");
        private static final javax.xml.namespace.QName STAEND$4 = 
            new javax.xml.namespace.QName("", "staEnd");
        private static final javax.xml.namespace.QName CUTSLOPE$6 = 
            new javax.xml.namespace.QName("", "cutSlope");
        private static final javax.xml.namespace.QName FILLSLOPE$8 = 
            new javax.xml.namespace.QName("", "fillSlope");
        
        
        /**
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return ZoneCutFillImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ZoneCutFillImpl.this.getFeatureArray(i);
                    ZoneCutFillImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { ZoneCutFillImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ZoneCutFillImpl.this.getFeatureArray(i);
                    ZoneCutFillImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return ZoneCutFillImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "cutSlope" attribute
         */
        public double getCutSlope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUTSLOPE$6);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "cutSlope" attribute
         */
        public org.landxml.schema.landXML11.CrossSlope xgetCutSlope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSlope target = null;
                target = (org.landxml.schema.landXML11.CrossSlope)get_store().find_attribute_user(CUTSLOPE$6);
                return target;
            }
        }
        
        /**
         * True if has "cutSlope" attribute
         */
        public boolean isSetCutSlope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CUTSLOPE$6) != null;
            }
        }
        
        /**
         * Sets the "cutSlope" attribute
         */
        public void setCutSlope(double cutSlope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUTSLOPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUTSLOPE$6);
                }
                target.setDoubleValue(cutSlope);
            }
        }
        
        /**
         * Sets (as xml) the "cutSlope" attribute
         */
        public void xsetCutSlope(org.landxml.schema.landXML11.CrossSlope cutSlope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSlope target = null;
                target = (org.landxml.schema.landXML11.CrossSlope)get_store().find_attribute_user(CUTSLOPE$6);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CrossSlope)get_store().add_attribute_user(CUTSLOPE$6);
                }
                target.set(cutSlope);
            }
        }
        
        /**
         * Unsets the "cutSlope" attribute
         */
        public void unsetCutSlope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CUTSLOPE$6);
            }
        }
        
        /**
         * Gets the "fillSlope" attribute
         */
        public double getFillSlope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLSLOPE$8);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "fillSlope" attribute
         */
        public org.landxml.schema.landXML11.CrossSlope xgetFillSlope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSlope target = null;
                target = (org.landxml.schema.landXML11.CrossSlope)get_store().find_attribute_user(FILLSLOPE$8);
                return target;
            }
        }
        
        /**
         * True if has "fillSlope" attribute
         */
        public boolean isSetFillSlope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FILLSLOPE$8) != null;
            }
        }
        
        /**
         * Sets the "fillSlope" attribute
         */
        public void setFillSlope(double fillSlope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLSLOPE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILLSLOPE$8);
                }
                target.setDoubleValue(fillSlope);
            }
        }
        
        /**
         * Sets (as xml) the "fillSlope" attribute
         */
        public void xsetFillSlope(org.landxml.schema.landXML11.CrossSlope fillSlope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSlope target = null;
                target = (org.landxml.schema.landXML11.CrossSlope)get_store().find_attribute_user(FILLSLOPE$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CrossSlope)get_store().add_attribute_user(FILLSLOPE$8);
                }
                target.set(fillSlope);
            }
        }
        
        /**
         * Unsets the "fillSlope" attribute
         */
        public void unsetFillSlope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FILLSLOPE$8);
            }
        }
    }
}
