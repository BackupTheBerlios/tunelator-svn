/*
 * An XML document type.
 * Localname: CrossSects
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CrossSectsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one CrossSects(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class CrossSectsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CrossSectsDocument
{
    
    public CrossSectsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CROSSSECTS$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CrossSects");
    
    
    /**
     * Gets the "CrossSects" element
     */
    public org.landxml.schema.landXML11.CrossSectsDocument.CrossSects getCrossSects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CrossSectsDocument.CrossSects target = null;
            target = (org.landxml.schema.landXML11.CrossSectsDocument.CrossSects)get_store().find_element_user(CROSSSECTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CrossSects" element
     */
    public void setCrossSects(org.landxml.schema.landXML11.CrossSectsDocument.CrossSects crossSects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CrossSectsDocument.CrossSects target = null;
            target = (org.landxml.schema.landXML11.CrossSectsDocument.CrossSects)get_store().find_element_user(CROSSSECTS$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.CrossSectsDocument.CrossSects)get_store().add_element_user(CROSSSECTS$0);
            }
            target.set(crossSects);
        }
    }
    
    /**
     * Appends and returns a new empty "CrossSects" element
     */
    public org.landxml.schema.landXML11.CrossSectsDocument.CrossSects addNewCrossSects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CrossSectsDocument.CrossSects target = null;
            target = (org.landxml.schema.landXML11.CrossSectsDocument.CrossSects)get_store().add_element_user(CROSSSECTS$0);
            return target;
        }
    }
    /**
     * An XML CrossSects(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class CrossSectsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CrossSectsDocument.CrossSects
    {
        
        public CrossSectsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CROSSSECT$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CrossSect");
        private static final javax.xml.namespace.QName FEATURE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName DESC$4 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName NAME$6 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName STATE$8 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName CALCMETHOD$10 = 
            new javax.xml.namespace.QName("", "calcMethod");
        private static final javax.xml.namespace.QName CURVECORRECTION$12 = 
            new javax.xml.namespace.QName("", "curveCorrection");
        private static final javax.xml.namespace.QName SWELLFACTOR$14 = 
            new javax.xml.namespace.QName("", "swellFactor");
        private static final javax.xml.namespace.QName SHRINKFACTOR$16 = 
            new javax.xml.namespace.QName("", "shrinkFactor");
        
        
        /**
         * Gets a List of "CrossSect" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CrossSectDocument.CrossSect> getCrossSectList()
        {
            final class CrossSectList extends java.util.AbstractList<org.landxml.schema.landXML11.CrossSectDocument.CrossSect>
            {
                public org.landxml.schema.landXML11.CrossSectDocument.CrossSect get(int i)
                    { return CrossSectsImpl.this.getCrossSectArray(i); }
                
                public org.landxml.schema.landXML11.CrossSectDocument.CrossSect set(int i, org.landxml.schema.landXML11.CrossSectDocument.CrossSect o)
                {
                    org.landxml.schema.landXML11.CrossSectDocument.CrossSect old = CrossSectsImpl.this.getCrossSectArray(i);
                    CrossSectsImpl.this.setCrossSectArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CrossSectDocument.CrossSect o)
                    { CrossSectsImpl.this.insertNewCrossSect(i).set(o); }
                
                public org.landxml.schema.landXML11.CrossSectDocument.CrossSect remove(int i)
                {
                    org.landxml.schema.landXML11.CrossSectDocument.CrossSect old = CrossSectsImpl.this.getCrossSectArray(i);
                    CrossSectsImpl.this.removeCrossSect(i);
                    return old;
                }
                
                public int size()
                    { return CrossSectsImpl.this.sizeOfCrossSectArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CrossSectList();
            }
        }
        
        /**
         * Gets array of all "CrossSect" elements
         */
        public org.landxml.schema.landXML11.CrossSectDocument.CrossSect[] getCrossSectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CROSSSECT$0, targetList);
                org.landxml.schema.landXML11.CrossSectDocument.CrossSect[] result = new org.landxml.schema.landXML11.CrossSectDocument.CrossSect[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CrossSect" element
         */
        public org.landxml.schema.landXML11.CrossSectDocument.CrossSect getCrossSectArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectDocument.CrossSect target = null;
                target = (org.landxml.schema.landXML11.CrossSectDocument.CrossSect)get_store().find_element_user(CROSSSECT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CrossSect" element
         */
        public int sizeOfCrossSectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CROSSSECT$0);
            }
        }
        
        /**
         * Sets array of all "CrossSect" element
         */
        public void setCrossSectArray(org.landxml.schema.landXML11.CrossSectDocument.CrossSect[] crossSectArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(crossSectArray, CROSSSECT$0);
            }
        }
        
        /**
         * Sets ith "CrossSect" element
         */
        public void setCrossSectArray(int i, org.landxml.schema.landXML11.CrossSectDocument.CrossSect crossSect)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectDocument.CrossSect target = null;
                target = (org.landxml.schema.landXML11.CrossSectDocument.CrossSect)get_store().find_element_user(CROSSSECT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(crossSect);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CrossSect" element
         */
        public org.landxml.schema.landXML11.CrossSectDocument.CrossSect insertNewCrossSect(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectDocument.CrossSect target = null;
                target = (org.landxml.schema.landXML11.CrossSectDocument.CrossSect)get_store().insert_element_user(CROSSSECT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CrossSect" element
         */
        public org.landxml.schema.landXML11.CrossSectDocument.CrossSect addNewCrossSect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectDocument.CrossSect target = null;
                target = (org.landxml.schema.landXML11.CrossSectDocument.CrossSect)get_store().add_element_user(CROSSSECT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "CrossSect" element
         */
        public void removeCrossSect(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CROSSSECT$0, i);
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
                    { return CrossSectsImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CrossSectsImpl.this.getFeatureArray(i);
                    CrossSectsImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { CrossSectsImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CrossSectsImpl.this.getFeatureArray(i);
                    CrossSectsImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return CrossSectsImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$2, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$2, i);
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
                return get_store().count_elements(FEATURE$2);
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
                arraySetterHelper(featureArray, FEATURE$2);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$2, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$2, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$2);
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
                get_store().remove_element(FEATURE$2, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$4);
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
                return get_store().find_attribute_user(DESC$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$4);
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
                get_store().remove_attribute(DESC$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
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
                return get_store().find_attribute_user(NAME$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
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
                get_store().remove_attribute(NAME$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$8);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$8);
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
                return get_store().find_attribute_user(STATE$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$8);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$8);
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
                get_store().remove_attribute(STATE$8);
            }
        }
        
        /**
         * Gets the "calcMethod" attribute
         */
        public org.landxml.schema.landXML11.XsVolCalcMethodType.Enum getCalcMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALCMETHOD$10);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.XsVolCalcMethodType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "calcMethod" attribute
         */
        public org.landxml.schema.landXML11.XsVolCalcMethodType xgetCalcMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.XsVolCalcMethodType target = null;
                target = (org.landxml.schema.landXML11.XsVolCalcMethodType)get_store().find_attribute_user(CALCMETHOD$10);
                return target;
            }
        }
        
        /**
         * True if has "calcMethod" attribute
         */
        public boolean isSetCalcMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CALCMETHOD$10) != null;
            }
        }
        
        /**
         * Sets the "calcMethod" attribute
         */
        public void setCalcMethod(org.landxml.schema.landXML11.XsVolCalcMethodType.Enum calcMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALCMETHOD$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CALCMETHOD$10);
                }
                target.setEnumValue(calcMethod);
            }
        }
        
        /**
         * Sets (as xml) the "calcMethod" attribute
         */
        public void xsetCalcMethod(org.landxml.schema.landXML11.XsVolCalcMethodType calcMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.XsVolCalcMethodType target = null;
                target = (org.landxml.schema.landXML11.XsVolCalcMethodType)get_store().find_attribute_user(CALCMETHOD$10);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.XsVolCalcMethodType)get_store().add_attribute_user(CALCMETHOD$10);
                }
                target.set(calcMethod);
            }
        }
        
        /**
         * Unsets the "calcMethod" attribute
         */
        public void unsetCalcMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CALCMETHOD$10);
            }
        }
        
        /**
         * Gets the "curveCorrection" attribute
         */
        public boolean getCurveCorrection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURVECORRECTION$12);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "curveCorrection" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetCurveCorrection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CURVECORRECTION$12);
                return target;
            }
        }
        
        /**
         * True if has "curveCorrection" attribute
         */
        public boolean isSetCurveCorrection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CURVECORRECTION$12) != null;
            }
        }
        
        /**
         * Sets the "curveCorrection" attribute
         */
        public void setCurveCorrection(boolean curveCorrection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURVECORRECTION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CURVECORRECTION$12);
                }
                target.setBooleanValue(curveCorrection);
            }
        }
        
        /**
         * Sets (as xml) the "curveCorrection" attribute
         */
        public void xsetCurveCorrection(org.apache.xmlbeans.XmlBoolean curveCorrection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CURVECORRECTION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CURVECORRECTION$12);
                }
                target.set(curveCorrection);
            }
        }
        
        /**
         * Unsets the "curveCorrection" attribute
         */
        public void unsetCurveCorrection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CURVECORRECTION$12);
            }
        }
        
        /**
         * Gets the "swellFactor" attribute
         */
        public double getSwellFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SWELLFACTOR$14);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "swellFactor" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSwellFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SWELLFACTOR$14);
                return target;
            }
        }
        
        /**
         * True if has "swellFactor" attribute
         */
        public boolean isSetSwellFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SWELLFACTOR$14) != null;
            }
        }
        
        /**
         * Sets the "swellFactor" attribute
         */
        public void setSwellFactor(double swellFactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SWELLFACTOR$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SWELLFACTOR$14);
                }
                target.setDoubleValue(swellFactor);
            }
        }
        
        /**
         * Sets (as xml) the "swellFactor" attribute
         */
        public void xsetSwellFactor(org.apache.xmlbeans.XmlDouble swellFactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SWELLFACTOR$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SWELLFACTOR$14);
                }
                target.set(swellFactor);
            }
        }
        
        /**
         * Unsets the "swellFactor" attribute
         */
        public void unsetSwellFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SWELLFACTOR$14);
            }
        }
        
        /**
         * Gets the "shrinkFactor" attribute
         */
        public double getShrinkFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHRINKFACTOR$16);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "shrinkFactor" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetShrinkFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SHRINKFACTOR$16);
                return target;
            }
        }
        
        /**
         * True if has "shrinkFactor" attribute
         */
        public boolean isSetShrinkFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SHRINKFACTOR$16) != null;
            }
        }
        
        /**
         * Sets the "shrinkFactor" attribute
         */
        public void setShrinkFactor(double shrinkFactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHRINKFACTOR$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHRINKFACTOR$16);
                }
                target.setDoubleValue(shrinkFactor);
            }
        }
        
        /**
         * Sets (as xml) the "shrinkFactor" attribute
         */
        public void xsetShrinkFactor(org.apache.xmlbeans.XmlDouble shrinkFactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SHRINKFACTOR$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SHRINKFACTOR$16);
                }
                target.set(shrinkFactor);
            }
        }
        
        /**
         * Unsets the "shrinkFactor" attribute
         */
        public void unsetShrinkFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SHRINKFACTOR$16);
            }
        }
    }
}
