/*
 * An XML document type.
 * Localname: RectStruct
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.RectStructDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one RectStruct(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class RectStructDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.RectStructDocument
{
    
    public RectStructDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECTSTRUCT$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "RectStruct");
    
    
    /**
     * Gets the "RectStruct" element
     */
    public org.landxml.schema.landXML11.RectStructDocument.RectStruct getRectStruct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RectStructDocument.RectStruct target = null;
            target = (org.landxml.schema.landXML11.RectStructDocument.RectStruct)get_store().find_element_user(RECTSTRUCT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RectStruct" element
     */
    public void setRectStruct(org.landxml.schema.landXML11.RectStructDocument.RectStruct rectStruct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RectStructDocument.RectStruct target = null;
            target = (org.landxml.schema.landXML11.RectStructDocument.RectStruct)get_store().find_element_user(RECTSTRUCT$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.RectStructDocument.RectStruct)get_store().add_element_user(RECTSTRUCT$0);
            }
            target.set(rectStruct);
        }
    }
    
    /**
     * Appends and returns a new empty "RectStruct" element
     */
    public org.landxml.schema.landXML11.RectStructDocument.RectStruct addNewRectStruct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RectStructDocument.RectStruct target = null;
            target = (org.landxml.schema.landXML11.RectStructDocument.RectStruct)get_store().add_element_user(RECTSTRUCT$0);
            return target;
        }
    }
    /**
     * An XML RectStruct(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class RectStructImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.RectStructDocument.RectStruct
    {
        
        public RectStructImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FEATURE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName LENGTH$2 = 
            new javax.xml.namespace.QName("", "length");
        private static final javax.xml.namespace.QName LENGTHDIR$4 = 
            new javax.xml.namespace.QName("", "lengthDir");
        private static final javax.xml.namespace.QName WIDTH$6 = 
            new javax.xml.namespace.QName("", "width");
        private static final javax.xml.namespace.QName DESC$8 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName INLETCASE$10 = 
            new javax.xml.namespace.QName("", "inletCase");
        private static final javax.xml.namespace.QName LOSSCOEFF$12 = 
            new javax.xml.namespace.QName("", "lossCoeff");
        private static final javax.xml.namespace.QName MATERIAL$14 = 
            new javax.xml.namespace.QName("", "material");
        private static final javax.xml.namespace.QName THICKNESS$16 = 
            new javax.xml.namespace.QName("", "thickness");
        
        
        /**
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return RectStructImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = RectStructImpl.this.getFeatureArray(i);
                    RectStructImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { RectStructImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = RectStructImpl.this.getFeatureArray(i);
                    RectStructImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return RectStructImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "length" attribute
         */
        public double getLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$2);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "length" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTH$2);
                return target;
            }
        }
        
        /**
         * Sets the "length" attribute
         */
        public void setLength(double length)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LENGTH$2);
                }
                target.setDoubleValue(length);
            }
        }
        
        /**
         * Sets (as xml) the "length" attribute
         */
        public void xsetLength(org.apache.xmlbeans.XmlDouble length)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTH$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LENGTH$2);
                }
                target.set(length);
            }
        }
        
        /**
         * Gets the "lengthDir" attribute
         */
        public double getLengthDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTHDIR$4);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "lengthDir" attribute
         */
        public org.landxml.schema.landXML11.Direction xgetLengthDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Direction target = null;
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(LENGTHDIR$4);
                return target;
            }
        }
        
        /**
         * True if has "lengthDir" attribute
         */
        public boolean isSetLengthDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LENGTHDIR$4) != null;
            }
        }
        
        /**
         * Sets the "lengthDir" attribute
         */
        public void setLengthDir(double lengthDir)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTHDIR$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LENGTHDIR$4);
                }
                target.setDoubleValue(lengthDir);
            }
        }
        
        /**
         * Sets (as xml) the "lengthDir" attribute
         */
        public void xsetLengthDir(org.landxml.schema.landXML11.Direction lengthDir)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Direction target = null;
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(LENGTHDIR$4);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Direction)get_store().add_attribute_user(LENGTHDIR$4);
                }
                target.set(lengthDir);
            }
        }
        
        /**
         * Unsets the "lengthDir" attribute
         */
        public void unsetLengthDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LENGTHDIR$4);
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
         * Gets the "inletCase" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getInletCase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(INLETCASE$10);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "inletCase" attribute
         */
        public boolean isSetInletCase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INLETCASE$10) != null;
            }
        }
        
        /**
         * Sets the "inletCase" attribute
         */
        public void setInletCase(org.apache.xmlbeans.XmlAnySimpleType inletCase)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(INLETCASE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(INLETCASE$10);
                }
                target.set(inletCase);
            }
        }
        
        /**
         * Appends and returns a new empty "inletCase" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewInletCase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(INLETCASE$10);
                return target;
            }
        }
        
        /**
         * Unsets the "inletCase" attribute
         */
        public void unsetInletCase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INLETCASE$10);
            }
        }
        
        /**
         * Gets the "lossCoeff" attribute
         */
        public double getLossCoeff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOSSCOEFF$12);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "lossCoeff" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetLossCoeff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LOSSCOEFF$12);
                return target;
            }
        }
        
        /**
         * True if has "lossCoeff" attribute
         */
        public boolean isSetLossCoeff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOSSCOEFF$12) != null;
            }
        }
        
        /**
         * Sets the "lossCoeff" attribute
         */
        public void setLossCoeff(double lossCoeff)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOSSCOEFF$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOSSCOEFF$12);
                }
                target.setDoubleValue(lossCoeff);
            }
        }
        
        /**
         * Sets (as xml) the "lossCoeff" attribute
         */
        public void xsetLossCoeff(org.apache.xmlbeans.XmlDouble lossCoeff)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LOSSCOEFF$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LOSSCOEFF$12);
                }
                target.set(lossCoeff);
            }
        }
        
        /**
         * Unsets the "lossCoeff" attribute
         */
        public void unsetLossCoeff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOSSCOEFF$12);
            }
        }
        
        /**
         * Gets the "material" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getMaterial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(MATERIAL$14);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "material" attribute
         */
        public boolean isSetMaterial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MATERIAL$14) != null;
            }
        }
        
        /**
         * Sets the "material" attribute
         */
        public void setMaterial(org.apache.xmlbeans.XmlAnySimpleType material)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(MATERIAL$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(MATERIAL$14);
                }
                target.set(material);
            }
        }
        
        /**
         * Appends and returns a new empty "material" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewMaterial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(MATERIAL$14);
                return target;
            }
        }
        
        /**
         * Unsets the "material" attribute
         */
        public void unsetMaterial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MATERIAL$14);
            }
        }
        
        /**
         * Gets the "thickness" attribute
         */
        public double getThickness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THICKNESS$16);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "thickness" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetThickness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(THICKNESS$16);
                return target;
            }
        }
        
        /**
         * True if has "thickness" attribute
         */
        public boolean isSetThickness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(THICKNESS$16) != null;
            }
        }
        
        /**
         * Sets the "thickness" attribute
         */
        public void setThickness(double thickness)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THICKNESS$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THICKNESS$16);
                }
                target.setDoubleValue(thickness);
            }
        }
        
        /**
         * Sets (as xml) the "thickness" attribute
         */
        public void xsetThickness(org.apache.xmlbeans.XmlDouble thickness)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(THICKNESS$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(THICKNESS$16);
                }
                target.set(thickness);
            }
        }
        
        /**
         * Unsets the "thickness" attribute
         */
        public void unsetThickness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(THICKNESS$16);
            }
        }
    }
}
