/*
 * An XML document type.
 * Localname: Breakline
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.BreaklineDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Breakline(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class BreaklineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.BreaklineDocument
{
    
    public BreaklineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BREAKLINE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Breakline");
    
    
    /**
     * Gets the "Breakline" element
     */
    public org.landxml.schema.landXML11.BreaklineDocument.Breakline getBreakline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.BreaklineDocument.Breakline target = null;
            target = (org.landxml.schema.landXML11.BreaklineDocument.Breakline)get_store().find_element_user(BREAKLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Breakline" element
     */
    public void setBreakline(org.landxml.schema.landXML11.BreaklineDocument.Breakline breakline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.BreaklineDocument.Breakline target = null;
            target = (org.landxml.schema.landXML11.BreaklineDocument.Breakline)get_store().find_element_user(BREAKLINE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.BreaklineDocument.Breakline)get_store().add_element_user(BREAKLINE$0);
            }
            target.set(breakline);
        }
    }
    
    /**
     * Appends and returns a new empty "Breakline" element
     */
    public org.landxml.schema.landXML11.BreaklineDocument.Breakline addNewBreakline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.BreaklineDocument.Breakline target = null;
            target = (org.landxml.schema.landXML11.BreaklineDocument.Breakline)get_store().add_element_user(BREAKLINE$0);
            return target;
        }
    }
    /**
     * An XML Breakline(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class BreaklineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.BreaklineDocument.Breakline
    {
        
        public BreaklineImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PNTLIST2D$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PntList2D");
        private static final javax.xml.namespace.QName PNTLIST3D$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PntList3D");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName BRKTYPE$6 = 
            new javax.xml.namespace.QName("", "brkType");
        private static final javax.xml.namespace.QName DESC$8 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName NAME$10 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName STATE$12 = 
            new javax.xml.namespace.QName("", "state");
        
        
        /**
         * Gets the "PntList2D" element
         */
        public java.util.List getPntList2D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PNTLIST2D$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "PntList2D" element
         */
        public org.landxml.schema.landXML11.PntList2DDocument.PntList2D xgetPntList2D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntList2DDocument.PntList2D target = null;
                target = (org.landxml.schema.landXML11.PntList2DDocument.PntList2D)get_store().find_element_user(PNTLIST2D$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "PntList2D" element
         */
        public boolean isSetPntList2D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PNTLIST2D$0) != 0;
            }
        }
        
        /**
         * Sets the "PntList2D" element
         */
        public void setPntList2D(java.util.List pntList2D)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PNTLIST2D$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PNTLIST2D$0);
                }
                target.setListValue(pntList2D);
            }
        }
        
        /**
         * Sets (as xml) the "PntList2D" element
         */
        public void xsetPntList2D(org.landxml.schema.landXML11.PntList2DDocument.PntList2D pntList2D)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntList2DDocument.PntList2D target = null;
                target = (org.landxml.schema.landXML11.PntList2DDocument.PntList2D)get_store().find_element_user(PNTLIST2D$0, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PntList2DDocument.PntList2D)get_store().add_element_user(PNTLIST2D$0);
                }
                target.set(pntList2D);
            }
        }
        
        /**
         * Unsets the "PntList2D" element
         */
        public void unsetPntList2D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PNTLIST2D$0, 0);
            }
        }
        
        /**
         * Gets the "PntList3D" element
         */
        public java.util.List getPntList3D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PNTLIST3D$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "PntList3D" element
         */
        public org.landxml.schema.landXML11.PntList3DDocument.PntList3D xgetPntList3D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntList3DDocument.PntList3D target = null;
                target = (org.landxml.schema.landXML11.PntList3DDocument.PntList3D)get_store().find_element_user(PNTLIST3D$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "PntList3D" element
         */
        public boolean isSetPntList3D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PNTLIST3D$2) != 0;
            }
        }
        
        /**
         * Sets the "PntList3D" element
         */
        public void setPntList3D(java.util.List pntList3D)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PNTLIST3D$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PNTLIST3D$2);
                }
                target.setListValue(pntList3D);
            }
        }
        
        /**
         * Sets (as xml) the "PntList3D" element
         */
        public void xsetPntList3D(org.landxml.schema.landXML11.PntList3DDocument.PntList3D pntList3D)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntList3DDocument.PntList3D target = null;
                target = (org.landxml.schema.landXML11.PntList3DDocument.PntList3D)get_store().find_element_user(PNTLIST3D$2, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PntList3DDocument.PntList3D)get_store().add_element_user(PNTLIST3D$2);
                }
                target.set(pntList3D);
            }
        }
        
        /**
         * Unsets the "PntList3D" element
         */
        public void unsetPntList3D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PNTLIST3D$2, 0);
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
                    { return BreaklineImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = BreaklineImpl.this.getFeatureArray(i);
                    BreaklineImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { BreaklineImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = BreaklineImpl.this.getFeatureArray(i);
                    BreaklineImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return BreaklineImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$4, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$4, i);
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
                return get_store().count_elements(FEATURE$4);
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
                arraySetterHelper(featureArray, FEATURE$4);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$4, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$4, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$4);
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
                get_store().remove_element(FEATURE$4, i);
            }
        }
        
        /**
         * Gets the "brkType" attribute
         */
        public org.landxml.schema.landXML11.BreakLineType.Enum getBrkType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BRKTYPE$6);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.BreakLineType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "brkType" attribute
         */
        public org.landxml.schema.landXML11.BreakLineType xgetBrkType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BreakLineType target = null;
                target = (org.landxml.schema.landXML11.BreakLineType)get_store().find_attribute_user(BRKTYPE$6);
                return target;
            }
        }
        
        /**
         * True if has "brkType" attribute
         */
        public boolean isSetBrkType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BRKTYPE$6) != null;
            }
        }
        
        /**
         * Sets the "brkType" attribute
         */
        public void setBrkType(org.landxml.schema.landXML11.BreakLineType.Enum brkType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BRKTYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BRKTYPE$6);
                }
                target.setEnumValue(brkType);
            }
        }
        
        /**
         * Sets (as xml) the "brkType" attribute
         */
        public void xsetBrkType(org.landxml.schema.landXML11.BreakLineType brkType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BreakLineType target = null;
                target = (org.landxml.schema.landXML11.BreakLineType)get_store().find_attribute_user(BRKTYPE$6);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.BreakLineType)get_store().add_attribute_user(BRKTYPE$6);
                }
                target.set(brkType);
            }
        }
        
        /**
         * Unsets the "brkType" attribute
         */
        public void unsetBrkType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BRKTYPE$6);
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
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$10);
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
                return get_store().find_attribute_user(NAME$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$10);
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
                get_store().remove_attribute(NAME$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$12);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$12);
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
                return get_store().find_attribute_user(STATE$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$12);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$12);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$12);
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
                get_store().remove_attribute(STATE$12);
            }
        }
    }
}
