/*
 * An XML document type.
 * Localname: PlanFeatures
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PlanFeaturesDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one PlanFeatures(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class PlanFeaturesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PlanFeaturesDocument
{
    
    public PlanFeaturesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLANFEATURES$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PlanFeatures");
    
    
    /**
     * Gets the "PlanFeatures" element
     */
    public org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures getPlanFeatures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures target = null;
            target = (org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures)get_store().find_element_user(PLANFEATURES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PlanFeatures" element
     */
    public void setPlanFeatures(org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures planFeatures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures target = null;
            target = (org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures)get_store().find_element_user(PLANFEATURES$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures)get_store().add_element_user(PLANFEATURES$0);
            }
            target.set(planFeatures);
        }
    }
    
    /**
     * Appends and returns a new empty "PlanFeatures" element
     */
    public org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures addNewPlanFeatures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures target = null;
            target = (org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures)get_store().add_element_user(PLANFEATURES$0);
            return target;
        }
    }
    /**
     * An XML PlanFeatures(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class PlanFeaturesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures
    {
        
        public PlanFeaturesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PLANFEATURE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PlanFeature");
        private static final javax.xml.namespace.QName FEATURE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName DESC$4 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName NAME$6 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName STATE$8 = 
            new javax.xml.namespace.QName("", "state");
        
        
        /**
         * Gets a List of "PlanFeature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature> getPlanFeatureList()
        {
            final class PlanFeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature>
            {
                public org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature get(int i)
                    { return PlanFeaturesImpl.this.getPlanFeatureArray(i); }
                
                public org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature set(int i, org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature o)
                {
                    org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature old = PlanFeaturesImpl.this.getPlanFeatureArray(i);
                    PlanFeaturesImpl.this.setPlanFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature o)
                    { PlanFeaturesImpl.this.insertNewPlanFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature remove(int i)
                {
                    org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature old = PlanFeaturesImpl.this.getPlanFeatureArray(i);
                    PlanFeaturesImpl.this.removePlanFeature(i);
                    return old;
                }
                
                public int size()
                    { return PlanFeaturesImpl.this.sizeOfPlanFeatureArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PlanFeatureList();
            }
        }
        
        /**
         * Gets array of all "PlanFeature" elements
         */
        public org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature[] getPlanFeatureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PLANFEATURE$0, targetList);
                org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature[] result = new org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PlanFeature" element
         */
        public org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature getPlanFeatureArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature target = null;
                target = (org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature)get_store().find_element_user(PLANFEATURE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PlanFeature" element
         */
        public int sizeOfPlanFeatureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PLANFEATURE$0);
            }
        }
        
        /**
         * Sets array of all "PlanFeature" element
         */
        public void setPlanFeatureArray(org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature[] planFeatureArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(planFeatureArray, PLANFEATURE$0);
            }
        }
        
        /**
         * Sets ith "PlanFeature" element
         */
        public void setPlanFeatureArray(int i, org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature planFeature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature target = null;
                target = (org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature)get_store().find_element_user(PLANFEATURE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(planFeature);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PlanFeature" element
         */
        public org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature insertNewPlanFeature(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature target = null;
                target = (org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature)get_store().insert_element_user(PLANFEATURE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PlanFeature" element
         */
        public org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature addNewPlanFeature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature target = null;
                target = (org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature)get_store().add_element_user(PLANFEATURE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "PlanFeature" element
         */
        public void removePlanFeature(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PLANFEATURE$0, i);
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
                    { return PlanFeaturesImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = PlanFeaturesImpl.this.getFeatureArray(i);
                    PlanFeaturesImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { PlanFeaturesImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = PlanFeaturesImpl.this.getFeatureArray(i);
                    PlanFeaturesImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return PlanFeaturesImpl.this.sizeOfFeatureArray(); }
                
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
    }
}
