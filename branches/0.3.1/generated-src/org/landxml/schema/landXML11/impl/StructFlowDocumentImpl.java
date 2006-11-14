/*
 * An XML document type.
 * Localname: StructFlow
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.StructFlowDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one StructFlow(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class StructFlowDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.StructFlowDocument
{
    
    public StructFlowDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTFLOW$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "StructFlow");
    
    
    /**
     * Gets the "StructFlow" element
     */
    public org.landxml.schema.landXML11.StructFlowDocument.StructFlow getStructFlow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.StructFlowDocument.StructFlow target = null;
            target = (org.landxml.schema.landXML11.StructFlowDocument.StructFlow)get_store().find_element_user(STRUCTFLOW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StructFlow" element
     */
    public void setStructFlow(org.landxml.schema.landXML11.StructFlowDocument.StructFlow structFlow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.StructFlowDocument.StructFlow target = null;
            target = (org.landxml.schema.landXML11.StructFlowDocument.StructFlow)get_store().find_element_user(STRUCTFLOW$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.StructFlowDocument.StructFlow)get_store().add_element_user(STRUCTFLOW$0);
            }
            target.set(structFlow);
        }
    }
    
    /**
     * Appends and returns a new empty "StructFlow" element
     */
    public org.landxml.schema.landXML11.StructFlowDocument.StructFlow addNewStructFlow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.StructFlowDocument.StructFlow target = null;
            target = (org.landxml.schema.landXML11.StructFlowDocument.StructFlow)get_store().add_element_user(STRUCTFLOW$0);
            return target;
        }
    }
    /**
     * An XML StructFlow(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class StructFlowImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.StructFlowDocument.StructFlow
    {
        
        public StructFlowImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FEATURE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName LOSSIN$2 = 
            new javax.xml.namespace.QName("", "lossIn");
        private static final javax.xml.namespace.QName LOSSOUT$4 = 
            new javax.xml.namespace.QName("", "lossOut");
        private static final javax.xml.namespace.QName DESC$6 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName HGLIN$8 = 
            new javax.xml.namespace.QName("", "hglIn");
        private static final javax.xml.namespace.QName HGLOUT$10 = 
            new javax.xml.namespace.QName("", "hglOut");
        private static final javax.xml.namespace.QName LOCALDEPRESSION$12 = 
            new javax.xml.namespace.QName("", "localDepression");
        private static final javax.xml.namespace.QName SLOPESURF$14 = 
            new javax.xml.namespace.QName("", "slopeSurf");
        private static final javax.xml.namespace.QName SLOPEGUTTER$16 = 
            new javax.xml.namespace.QName("", "slopeGutter");
        private static final javax.xml.namespace.QName WIDTHGUTTER$18 = 
            new javax.xml.namespace.QName("", "widthGutter");
        
        
        /**
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return StructFlowImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = StructFlowImpl.this.getFeatureArray(i);
                    StructFlowImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { StructFlowImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = StructFlowImpl.this.getFeatureArray(i);
                    StructFlowImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return StructFlowImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "lossIn" attribute
         */
        public double getLossIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOSSIN$2);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "lossIn" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetLossIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LOSSIN$2);
                return target;
            }
        }
        
        /**
         * Sets the "lossIn" attribute
         */
        public void setLossIn(double lossIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOSSIN$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOSSIN$2);
                }
                target.setDoubleValue(lossIn);
            }
        }
        
        /**
         * Sets (as xml) the "lossIn" attribute
         */
        public void xsetLossIn(org.apache.xmlbeans.XmlDouble lossIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LOSSIN$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LOSSIN$2);
                }
                target.set(lossIn);
            }
        }
        
        /**
         * Gets the "lossOut" attribute
         */
        public double getLossOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOSSOUT$4);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "lossOut" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetLossOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LOSSOUT$4);
                return target;
            }
        }
        
        /**
         * Sets the "lossOut" attribute
         */
        public void setLossOut(double lossOut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOSSOUT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOSSOUT$4);
                }
                target.setDoubleValue(lossOut);
            }
        }
        
        /**
         * Sets (as xml) the "lossOut" attribute
         */
        public void xsetLossOut(org.apache.xmlbeans.XmlDouble lossOut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LOSSOUT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LOSSOUT$4);
                }
                target.set(lossOut);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$6);
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
                return get_store().find_attribute_user(DESC$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$6);
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
                get_store().remove_attribute(DESC$6);
            }
        }
        
        /**
         * Gets the "hglIn" attribute
         */
        public double getHglIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HGLIN$8);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "hglIn" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetHglIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HGLIN$8);
                return target;
            }
        }
        
        /**
         * True if has "hglIn" attribute
         */
        public boolean isSetHglIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HGLIN$8) != null;
            }
        }
        
        /**
         * Sets the "hglIn" attribute
         */
        public void setHglIn(double hglIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HGLIN$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HGLIN$8);
                }
                target.setDoubleValue(hglIn);
            }
        }
        
        /**
         * Sets (as xml) the "hglIn" attribute
         */
        public void xsetHglIn(org.apache.xmlbeans.XmlDouble hglIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HGLIN$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(HGLIN$8);
                }
                target.set(hglIn);
            }
        }
        
        /**
         * Unsets the "hglIn" attribute
         */
        public void unsetHglIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HGLIN$8);
            }
        }
        
        /**
         * Gets the "hglOut" attribute
         */
        public double getHglOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HGLOUT$10);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "hglOut" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetHglOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HGLOUT$10);
                return target;
            }
        }
        
        /**
         * True if has "hglOut" attribute
         */
        public boolean isSetHglOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HGLOUT$10) != null;
            }
        }
        
        /**
         * Sets the "hglOut" attribute
         */
        public void setHglOut(double hglOut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HGLOUT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HGLOUT$10);
                }
                target.setDoubleValue(hglOut);
            }
        }
        
        /**
         * Sets (as xml) the "hglOut" attribute
         */
        public void xsetHglOut(org.apache.xmlbeans.XmlDouble hglOut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HGLOUT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(HGLOUT$10);
                }
                target.set(hglOut);
            }
        }
        
        /**
         * Unsets the "hglOut" attribute
         */
        public void unsetHglOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HGLOUT$10);
            }
        }
        
        /**
         * Gets the "localDepression" attribute
         */
        public double getLocalDepression()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALDEPRESSION$12);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "localDepression" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetLocalDepression()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LOCALDEPRESSION$12);
                return target;
            }
        }
        
        /**
         * True if has "localDepression" attribute
         */
        public boolean isSetLocalDepression()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOCALDEPRESSION$12) != null;
            }
        }
        
        /**
         * Sets the "localDepression" attribute
         */
        public void setLocalDepression(double localDepression)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALDEPRESSION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCALDEPRESSION$12);
                }
                target.setDoubleValue(localDepression);
            }
        }
        
        /**
         * Sets (as xml) the "localDepression" attribute
         */
        public void xsetLocalDepression(org.apache.xmlbeans.XmlDouble localDepression)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LOCALDEPRESSION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LOCALDEPRESSION$12);
                }
                target.set(localDepression);
            }
        }
        
        /**
         * Unsets the "localDepression" attribute
         */
        public void unsetLocalDepression()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOCALDEPRESSION$12);
            }
        }
        
        /**
         * Gets the "slopeSurf" attribute
         */
        public double getSlopeSurf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SLOPESURF$14);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "slopeSurf" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSlopeSurf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SLOPESURF$14);
                return target;
            }
        }
        
        /**
         * True if has "slopeSurf" attribute
         */
        public boolean isSetSlopeSurf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SLOPESURF$14) != null;
            }
        }
        
        /**
         * Sets the "slopeSurf" attribute
         */
        public void setSlopeSurf(double slopeSurf)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SLOPESURF$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SLOPESURF$14);
                }
                target.setDoubleValue(slopeSurf);
            }
        }
        
        /**
         * Sets (as xml) the "slopeSurf" attribute
         */
        public void xsetSlopeSurf(org.apache.xmlbeans.XmlDouble slopeSurf)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SLOPESURF$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SLOPESURF$14);
                }
                target.set(slopeSurf);
            }
        }
        
        /**
         * Unsets the "slopeSurf" attribute
         */
        public void unsetSlopeSurf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SLOPESURF$14);
            }
        }
        
        /**
         * Gets the "slopeGutter" attribute
         */
        public double getSlopeGutter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SLOPEGUTTER$16);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "slopeGutter" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSlopeGutter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SLOPEGUTTER$16);
                return target;
            }
        }
        
        /**
         * True if has "slopeGutter" attribute
         */
        public boolean isSetSlopeGutter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SLOPEGUTTER$16) != null;
            }
        }
        
        /**
         * Sets the "slopeGutter" attribute
         */
        public void setSlopeGutter(double slopeGutter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SLOPEGUTTER$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SLOPEGUTTER$16);
                }
                target.setDoubleValue(slopeGutter);
            }
        }
        
        /**
         * Sets (as xml) the "slopeGutter" attribute
         */
        public void xsetSlopeGutter(org.apache.xmlbeans.XmlDouble slopeGutter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SLOPEGUTTER$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SLOPEGUTTER$16);
                }
                target.set(slopeGutter);
            }
        }
        
        /**
         * Unsets the "slopeGutter" attribute
         */
        public void unsetSlopeGutter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SLOPEGUTTER$16);
            }
        }
        
        /**
         * Gets the "widthGutter" attribute
         */
        public double getWidthGutter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTHGUTTER$18);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "widthGutter" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetWidthGutter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WIDTHGUTTER$18);
                return target;
            }
        }
        
        /**
         * True if has "widthGutter" attribute
         */
        public boolean isSetWidthGutter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(WIDTHGUTTER$18) != null;
            }
        }
        
        /**
         * Sets the "widthGutter" attribute
         */
        public void setWidthGutter(double widthGutter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTHGUTTER$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WIDTHGUTTER$18);
                }
                target.setDoubleValue(widthGutter);
            }
        }
        
        /**
         * Sets (as xml) the "widthGutter" attribute
         */
        public void xsetWidthGutter(org.apache.xmlbeans.XmlDouble widthGutter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WIDTHGUTTER$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WIDTHGUTTER$18);
                }
                target.set(widthGutter);
            }
        }
        
        /**
         * Unsets the "widthGutter" attribute
         */
        public void unsetWidthGutter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(WIDTHGUTTER$18);
            }
        }
    }
}
