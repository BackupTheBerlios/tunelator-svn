/*
 * An XML document type.
 * Localname: Ditch
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.DitchDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Ditch(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class DitchDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.DitchDocument
{
    
    public DitchDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DITCH$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Ditch");
    
    
    /**
     * Gets the "Ditch" element
     */
    public org.landxml.schema.landXML11.DitchDocument.Ditch getDitch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.DitchDocument.Ditch target = null;
            target = (org.landxml.schema.landXML11.DitchDocument.Ditch)get_store().find_element_user(DITCH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ditch" element
     */
    public void setDitch(org.landxml.schema.landXML11.DitchDocument.Ditch ditch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.DitchDocument.Ditch target = null;
            target = (org.landxml.schema.landXML11.DitchDocument.Ditch)get_store().find_element_user(DITCH$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.DitchDocument.Ditch)get_store().add_element_user(DITCH$0);
            }
            target.set(ditch);
        }
    }
    
    /**
     * Appends and returns a new empty "Ditch" element
     */
    public org.landxml.schema.landXML11.DitchDocument.Ditch addNewDitch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.DitchDocument.Ditch target = null;
            target = (org.landxml.schema.landXML11.DitchDocument.Ditch)get_store().add_element_user(DITCH$0);
            return target;
        }
    }
    /**
     * An XML Ditch(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class DitchImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.DitchDocument.Ditch
    {
        
        public DitchImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FEATURE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName STASTART$2 = 
            new javax.xml.namespace.QName("", "staStart");
        private static final javax.xml.namespace.QName STAEND$4 = 
            new javax.xml.namespace.QName("", "staEnd");
        private static final javax.xml.namespace.QName BOTTOMWIDTH$6 = 
            new javax.xml.namespace.QName("", "bottomWidth");
        private static final javax.xml.namespace.QName BOTTOMSHAPE$8 = 
            new javax.xml.namespace.QName("", "bottomShape");
        
        
        /**
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return DitchImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = DitchImpl.this.getFeatureArray(i);
                    DitchImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { DitchImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = DitchImpl.this.getFeatureArray(i);
                    DitchImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return DitchImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "bottomWidth" attribute
         */
        public double getBottomWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOTTOMWIDTH$6);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "bottomWidth" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetBottomWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(BOTTOMWIDTH$6);
                return target;
            }
        }
        
        /**
         * Sets the "bottomWidth" attribute
         */
        public void setBottomWidth(double bottomWidth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOTTOMWIDTH$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BOTTOMWIDTH$6);
                }
                target.setDoubleValue(bottomWidth);
            }
        }
        
        /**
         * Sets (as xml) the "bottomWidth" attribute
         */
        public void xsetBottomWidth(org.apache.xmlbeans.XmlDouble bottomWidth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(BOTTOMWIDTH$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(BOTTOMWIDTH$6);
                }
                target.set(bottomWidth);
            }
        }
        
        /**
         * Gets the "bottomShape" attribute
         */
        public org.landxml.schema.landXML11.DitchBottomShape.Enum getBottomShape()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOTTOMSHAPE$8);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.DitchBottomShape.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "bottomShape" attribute
         */
        public org.landxml.schema.landXML11.DitchBottomShape xgetBottomShape()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DitchBottomShape target = null;
                target = (org.landxml.schema.landXML11.DitchBottomShape)get_store().find_attribute_user(BOTTOMSHAPE$8);
                return target;
            }
        }
        
        /**
         * True if has "bottomShape" attribute
         */
        public boolean isSetBottomShape()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BOTTOMSHAPE$8) != null;
            }
        }
        
        /**
         * Sets the "bottomShape" attribute
         */
        public void setBottomShape(org.landxml.schema.landXML11.DitchBottomShape.Enum bottomShape)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOTTOMSHAPE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BOTTOMSHAPE$8);
                }
                target.setEnumValue(bottomShape);
            }
        }
        
        /**
         * Sets (as xml) the "bottomShape" attribute
         */
        public void xsetBottomShape(org.landxml.schema.landXML11.DitchBottomShape bottomShape)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DitchBottomShape target = null;
                target = (org.landxml.schema.landXML11.DitchBottomShape)get_store().find_attribute_user(BOTTOMSHAPE$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.DitchBottomShape)get_store().add_attribute_user(BOTTOMSHAPE$8);
                }
                target.set(bottomShape);
            }
        }
        
        /**
         * Unsets the "bottomShape" attribute
         */
        public void unsetBottomShape()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BOTTOMSHAPE$8);
            }
        }
    }
}
