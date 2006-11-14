/*
 * An XML document type.
 * Localname: PipeFlow
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PipeFlowDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one PipeFlow(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class PipeFlowDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PipeFlowDocument
{
    
    public PipeFlowDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PIPEFLOW$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PipeFlow");
    
    
    /**
     * Gets the "PipeFlow" element
     */
    public org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow getPipeFlow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow target = null;
            target = (org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow)get_store().find_element_user(PIPEFLOW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PipeFlow" element
     */
    public void setPipeFlow(org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow pipeFlow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow target = null;
            target = (org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow)get_store().find_element_user(PIPEFLOW$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow)get_store().add_element_user(PIPEFLOW$0);
            }
            target.set(pipeFlow);
        }
    }
    
    /**
     * Appends and returns a new empty "PipeFlow" element
     */
    public org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow addNewPipeFlow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow target = null;
            target = (org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow)get_store().add_element_user(PIPEFLOW$0);
            return target;
        }
    }
    /**
     * An XML PipeFlow(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class PipeFlowImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow
    {
        
        public PipeFlowImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FEATURE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName FLOWIN$2 = 
            new javax.xml.namespace.QName("", "flowIn");
        private static final javax.xml.namespace.QName AREACATCHMENT$4 = 
            new javax.xml.namespace.QName("", "areaCatchment");
        private static final javax.xml.namespace.QName DESC$6 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName DEPTHCRITICAL$8 = 
            new javax.xml.namespace.QName("", "depthCritical");
        private static final javax.xml.namespace.QName HGLDOWN$10 = 
            new javax.xml.namespace.QName("", "hglDown");
        private static final javax.xml.namespace.QName HGLUP$12 = 
            new javax.xml.namespace.QName("", "hglUp");
        private static final javax.xml.namespace.QName INTENSITY$14 = 
            new javax.xml.namespace.QName("", "intensity");
        private static final javax.xml.namespace.QName RUNOFFCOEFF$16 = 
            new javax.xml.namespace.QName("", "runoffCoeff");
        private static final javax.xml.namespace.QName SLOPECRITICAL$18 = 
            new javax.xml.namespace.QName("", "slopeCritical");
        private static final javax.xml.namespace.QName TIMEINLET$20 = 
            new javax.xml.namespace.QName("", "timeInlet");
        private static final javax.xml.namespace.QName VELOCITYCRITICAL$22 = 
            new javax.xml.namespace.QName("", "velocityCritical");
        
        
        /**
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return PipeFlowImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = PipeFlowImpl.this.getFeatureArray(i);
                    PipeFlowImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { PipeFlowImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = PipeFlowImpl.this.getFeatureArray(i);
                    PipeFlowImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return PipeFlowImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "flowIn" attribute
         */
        public double getFlowIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLOWIN$2);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "flowIn" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetFlowIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(FLOWIN$2);
                return target;
            }
        }
        
        /**
         * Sets the "flowIn" attribute
         */
        public void setFlowIn(double flowIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLOWIN$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLOWIN$2);
                }
                target.setDoubleValue(flowIn);
            }
        }
        
        /**
         * Sets (as xml) the "flowIn" attribute
         */
        public void xsetFlowIn(org.apache.xmlbeans.XmlDouble flowIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(FLOWIN$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(FLOWIN$2);
                }
                target.set(flowIn);
            }
        }
        
        /**
         * Gets the "areaCatchment" attribute
         */
        public double getAreaCatchment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREACATCHMENT$4);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "areaCatchment" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetAreaCatchment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AREACATCHMENT$4);
                return target;
            }
        }
        
        /**
         * True if has "areaCatchment" attribute
         */
        public boolean isSetAreaCatchment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AREACATCHMENT$4) != null;
            }
        }
        
        /**
         * Sets the "areaCatchment" attribute
         */
        public void setAreaCatchment(double areaCatchment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREACATCHMENT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AREACATCHMENT$4);
                }
                target.setDoubleValue(areaCatchment);
            }
        }
        
        /**
         * Sets (as xml) the "areaCatchment" attribute
         */
        public void xsetAreaCatchment(org.apache.xmlbeans.XmlDouble areaCatchment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AREACATCHMENT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(AREACATCHMENT$4);
                }
                target.set(areaCatchment);
            }
        }
        
        /**
         * Unsets the "areaCatchment" attribute
         */
        public void unsetAreaCatchment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AREACATCHMENT$4);
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
         * Gets the "depthCritical" attribute
         */
        public double getDepthCritical()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPTHCRITICAL$8);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "depthCritical" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetDepthCritical()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DEPTHCRITICAL$8);
                return target;
            }
        }
        
        /**
         * True if has "depthCritical" attribute
         */
        public boolean isSetDepthCritical()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEPTHCRITICAL$8) != null;
            }
        }
        
        /**
         * Sets the "depthCritical" attribute
         */
        public void setDepthCritical(double depthCritical)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPTHCRITICAL$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPTHCRITICAL$8);
                }
                target.setDoubleValue(depthCritical);
            }
        }
        
        /**
         * Sets (as xml) the "depthCritical" attribute
         */
        public void xsetDepthCritical(org.apache.xmlbeans.XmlDouble depthCritical)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DEPTHCRITICAL$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DEPTHCRITICAL$8);
                }
                target.set(depthCritical);
            }
        }
        
        /**
         * Unsets the "depthCritical" attribute
         */
        public void unsetDepthCritical()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEPTHCRITICAL$8);
            }
        }
        
        /**
         * Gets the "hglDown" attribute
         */
        public double getHglDown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HGLDOWN$10);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "hglDown" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetHglDown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HGLDOWN$10);
                return target;
            }
        }
        
        /**
         * True if has "hglDown" attribute
         */
        public boolean isSetHglDown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HGLDOWN$10) != null;
            }
        }
        
        /**
         * Sets the "hglDown" attribute
         */
        public void setHglDown(double hglDown)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HGLDOWN$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HGLDOWN$10);
                }
                target.setDoubleValue(hglDown);
            }
        }
        
        /**
         * Sets (as xml) the "hglDown" attribute
         */
        public void xsetHglDown(org.apache.xmlbeans.XmlDouble hglDown)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HGLDOWN$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(HGLDOWN$10);
                }
                target.set(hglDown);
            }
        }
        
        /**
         * Unsets the "hglDown" attribute
         */
        public void unsetHglDown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HGLDOWN$10);
            }
        }
        
        /**
         * Gets the "hglUp" attribute
         */
        public double getHglUp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HGLUP$12);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "hglUp" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetHglUp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HGLUP$12);
                return target;
            }
        }
        
        /**
         * True if has "hglUp" attribute
         */
        public boolean isSetHglUp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HGLUP$12) != null;
            }
        }
        
        /**
         * Sets the "hglUp" attribute
         */
        public void setHglUp(double hglUp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HGLUP$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HGLUP$12);
                }
                target.setDoubleValue(hglUp);
            }
        }
        
        /**
         * Sets (as xml) the "hglUp" attribute
         */
        public void xsetHglUp(org.apache.xmlbeans.XmlDouble hglUp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HGLUP$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(HGLUP$12);
                }
                target.set(hglUp);
            }
        }
        
        /**
         * Unsets the "hglUp" attribute
         */
        public void unsetHglUp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HGLUP$12);
            }
        }
        
        /**
         * Gets the "intensity" attribute
         */
        public double getIntensity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTENSITY$14);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "intensity" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetIntensity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INTENSITY$14);
                return target;
            }
        }
        
        /**
         * True if has "intensity" attribute
         */
        public boolean isSetIntensity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INTENSITY$14) != null;
            }
        }
        
        /**
         * Sets the "intensity" attribute
         */
        public void setIntensity(double intensity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTENSITY$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTENSITY$14);
                }
                target.setDoubleValue(intensity);
            }
        }
        
        /**
         * Sets (as xml) the "intensity" attribute
         */
        public void xsetIntensity(org.apache.xmlbeans.XmlDouble intensity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INTENSITY$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(INTENSITY$14);
                }
                target.set(intensity);
            }
        }
        
        /**
         * Unsets the "intensity" attribute
         */
        public void unsetIntensity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INTENSITY$14);
            }
        }
        
        /**
         * Gets the "runoffCoeff" attribute
         */
        public double getRunoffCoeff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RUNOFFCOEFF$16);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "runoffCoeff" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetRunoffCoeff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RUNOFFCOEFF$16);
                return target;
            }
        }
        
        /**
         * True if has "runoffCoeff" attribute
         */
        public boolean isSetRunoffCoeff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RUNOFFCOEFF$16) != null;
            }
        }
        
        /**
         * Sets the "runoffCoeff" attribute
         */
        public void setRunoffCoeff(double runoffCoeff)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RUNOFFCOEFF$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RUNOFFCOEFF$16);
                }
                target.setDoubleValue(runoffCoeff);
            }
        }
        
        /**
         * Sets (as xml) the "runoffCoeff" attribute
         */
        public void xsetRunoffCoeff(org.apache.xmlbeans.XmlDouble runoffCoeff)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RUNOFFCOEFF$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RUNOFFCOEFF$16);
                }
                target.set(runoffCoeff);
            }
        }
        
        /**
         * Unsets the "runoffCoeff" attribute
         */
        public void unsetRunoffCoeff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RUNOFFCOEFF$16);
            }
        }
        
        /**
         * Gets the "slopeCritical" attribute
         */
        public double getSlopeCritical()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SLOPECRITICAL$18);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "slopeCritical" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSlopeCritical()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SLOPECRITICAL$18);
                return target;
            }
        }
        
        /**
         * True if has "slopeCritical" attribute
         */
        public boolean isSetSlopeCritical()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SLOPECRITICAL$18) != null;
            }
        }
        
        /**
         * Sets the "slopeCritical" attribute
         */
        public void setSlopeCritical(double slopeCritical)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SLOPECRITICAL$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SLOPECRITICAL$18);
                }
                target.setDoubleValue(slopeCritical);
            }
        }
        
        /**
         * Sets (as xml) the "slopeCritical" attribute
         */
        public void xsetSlopeCritical(org.apache.xmlbeans.XmlDouble slopeCritical)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SLOPECRITICAL$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SLOPECRITICAL$18);
                }
                target.set(slopeCritical);
            }
        }
        
        /**
         * Unsets the "slopeCritical" attribute
         */
        public void unsetSlopeCritical()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SLOPECRITICAL$18);
            }
        }
        
        /**
         * Gets the "timeInlet" attribute
         */
        public double getTimeInlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEINLET$20);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "timeInlet" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetTimeInlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TIMEINLET$20);
                return target;
            }
        }
        
        /**
         * True if has "timeInlet" attribute
         */
        public boolean isSetTimeInlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TIMEINLET$20) != null;
            }
        }
        
        /**
         * Sets the "timeInlet" attribute
         */
        public void setTimeInlet(double timeInlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEINLET$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMEINLET$20);
                }
                target.setDoubleValue(timeInlet);
            }
        }
        
        /**
         * Sets (as xml) the "timeInlet" attribute
         */
        public void xsetTimeInlet(org.apache.xmlbeans.XmlDouble timeInlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TIMEINLET$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TIMEINLET$20);
                }
                target.set(timeInlet);
            }
        }
        
        /**
         * Unsets the "timeInlet" attribute
         */
        public void unsetTimeInlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TIMEINLET$20);
            }
        }
        
        /**
         * Gets the "velocityCritical" attribute
         */
        public double getVelocityCritical()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VELOCITYCRITICAL$22);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "velocityCritical" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetVelocityCritical()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VELOCITYCRITICAL$22);
                return target;
            }
        }
        
        /**
         * True if has "velocityCritical" attribute
         */
        public boolean isSetVelocityCritical()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VELOCITYCRITICAL$22) != null;
            }
        }
        
        /**
         * Sets the "velocityCritical" attribute
         */
        public void setVelocityCritical(double velocityCritical)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VELOCITYCRITICAL$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VELOCITYCRITICAL$22);
                }
                target.setDoubleValue(velocityCritical);
            }
        }
        
        /**
         * Sets (as xml) the "velocityCritical" attribute
         */
        public void xsetVelocityCritical(org.apache.xmlbeans.XmlDouble velocityCritical)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VELOCITYCRITICAL$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VELOCITYCRITICAL$22);
                }
                target.set(velocityCritical);
            }
        }
        
        /**
         * Unsets the "velocityCritical" attribute
         */
        public void unsetVelocityCritical()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VELOCITYCRITICAL$22);
            }
        }
    }
}
