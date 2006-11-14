/*
 * An XML document type.
 * Localname: DesignCrossSectSurf
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.DesignCrossSectSurfDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one DesignCrossSectSurf(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class DesignCrossSectSurfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.DesignCrossSectSurfDocument
{
    
    public DesignCrossSectSurfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESIGNCROSSSECTSURF$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "DesignCrossSectSurf");
    
    
    /**
     * Gets the "DesignCrossSectSurf" element
     */
    public org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf getDesignCrossSectSurf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf target = null;
            target = (org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf)get_store().find_element_user(DESIGNCROSSSECTSURF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DesignCrossSectSurf" element
     */
    public void setDesignCrossSectSurf(org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf designCrossSectSurf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf target = null;
            target = (org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf)get_store().find_element_user(DESIGNCROSSSECTSURF$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf)get_store().add_element_user(DESIGNCROSSSECTSURF$0);
            }
            target.set(designCrossSectSurf);
        }
    }
    
    /**
     * Appends and returns a new empty "DesignCrossSectSurf" element
     */
    public org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf addNewDesignCrossSectSurf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf target = null;
            target = (org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf)get_store().add_element_user(DESIGNCROSSSECTSURF$0);
            return target;
        }
    }
    /**
     * An XML DesignCrossSectSurf(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class DesignCrossSectSurfImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf
    {
        
        public DesignCrossSectSurfImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CROSSSECTPNT$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CrossSectPnt");
        private static final javax.xml.namespace.QName FEATURE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESC$6 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName STATE$8 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName SIDE$10 = 
            new javax.xml.namespace.QName("", "side");
        private static final javax.xml.namespace.QName MATERIAL$12 = 
            new javax.xml.namespace.QName("", "material");
        private static final javax.xml.namespace.QName CLOSEDAREA$14 = 
            new javax.xml.namespace.QName("", "closedArea");
        private static final javax.xml.namespace.QName TYPICALTHICKNESS$16 = 
            new javax.xml.namespace.QName("", "typicalThickness");
        private static final javax.xml.namespace.QName TYPICALWIDTH$18 = 
            new javax.xml.namespace.QName("", "typicalWidth");
        private static final javax.xml.namespace.QName AREA$20 = 
            new javax.xml.namespace.QName("", "area");
        private static final javax.xml.namespace.QName VOLUME$22 = 
            new javax.xml.namespace.QName("", "volume");
        
        
        /**
         * Gets a List of "CrossSectPnt" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt> getCrossSectPntList()
        {
            final class CrossSectPntList extends java.util.AbstractList<org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt>
            {
                public org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt get(int i)
                    { return DesignCrossSectSurfImpl.this.getCrossSectPntArray(i); }
                
                public org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt set(int i, org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt o)
                {
                    org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt old = DesignCrossSectSurfImpl.this.getCrossSectPntArray(i);
                    DesignCrossSectSurfImpl.this.setCrossSectPntArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt o)
                    { DesignCrossSectSurfImpl.this.insertNewCrossSectPnt(i).set(o); }
                
                public org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt remove(int i)
                {
                    org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt old = DesignCrossSectSurfImpl.this.getCrossSectPntArray(i);
                    DesignCrossSectSurfImpl.this.removeCrossSectPnt(i);
                    return old;
                }
                
                public int size()
                    { return DesignCrossSectSurfImpl.this.sizeOfCrossSectPntArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CrossSectPntList();
            }
        }
        
        /**
         * Gets array of all "CrossSectPnt" elements
         */
        public org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt[] getCrossSectPntArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CROSSSECTPNT$0, targetList);
                org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt[] result = new org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CrossSectPnt" element
         */
        public org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt getCrossSectPntArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt target = null;
                target = (org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt)get_store().find_element_user(CROSSSECTPNT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CrossSectPnt" element
         */
        public int sizeOfCrossSectPntArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CROSSSECTPNT$0);
            }
        }
        
        /**
         * Sets array of all "CrossSectPnt" element
         */
        public void setCrossSectPntArray(org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt[] crossSectPntArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(crossSectPntArray, CROSSSECTPNT$0);
            }
        }
        
        /**
         * Sets ith "CrossSectPnt" element
         */
        public void setCrossSectPntArray(int i, org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt crossSectPnt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt target = null;
                target = (org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt)get_store().find_element_user(CROSSSECTPNT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(crossSectPnt);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CrossSectPnt" element
         */
        public org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt insertNewCrossSectPnt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt target = null;
                target = (org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt)get_store().insert_element_user(CROSSSECTPNT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CrossSectPnt" element
         */
        public org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt addNewCrossSectPnt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt target = null;
                target = (org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt)get_store().add_element_user(CROSSSECTPNT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "CrossSectPnt" element
         */
        public void removeCrossSectPnt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CROSSSECTPNT$0, i);
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
                    { return DesignCrossSectSurfImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = DesignCrossSectSurfImpl.this.getFeatureArray(i);
                    DesignCrossSectSurfImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { DesignCrossSectSurfImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = DesignCrossSectSurfImpl.this.getFeatureArray(i);
                    DesignCrossSectSurfImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return DesignCrossSectSurfImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
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
                return get_store().find_attribute_user(NAME$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
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
                get_store().remove_attribute(NAME$4);
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
         * Gets the "side" attribute
         */
        public org.landxml.schema.landXML11.SideofRoadType.Enum getSide()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIDE$10);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.SideofRoadType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "side" attribute
         */
        public org.landxml.schema.landXML11.SideofRoadType xgetSide()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SideofRoadType target = null;
                target = (org.landxml.schema.landXML11.SideofRoadType)get_store().find_attribute_user(SIDE$10);
                return target;
            }
        }
        
        /**
         * True if has "side" attribute
         */
        public boolean isSetSide()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SIDE$10) != null;
            }
        }
        
        /**
         * Sets the "side" attribute
         */
        public void setSide(org.landxml.schema.landXML11.SideofRoadType.Enum side)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIDE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIDE$10);
                }
                target.setEnumValue(side);
            }
        }
        
        /**
         * Sets (as xml) the "side" attribute
         */
        public void xsetSide(org.landxml.schema.landXML11.SideofRoadType side)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SideofRoadType target = null;
                target = (org.landxml.schema.landXML11.SideofRoadType)get_store().find_attribute_user(SIDE$10);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SideofRoadType)get_store().add_attribute_user(SIDE$10);
                }
                target.set(side);
            }
        }
        
        /**
         * Unsets the "side" attribute
         */
        public void unsetSide()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SIDE$10);
            }
        }
        
        /**
         * Gets the "material" attribute
         */
        public java.lang.String getMaterial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MATERIAL$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "material" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMaterial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MATERIAL$12);
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
                return get_store().find_attribute_user(MATERIAL$12) != null;
            }
        }
        
        /**
         * Sets the "material" attribute
         */
        public void setMaterial(java.lang.String material)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MATERIAL$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MATERIAL$12);
                }
                target.setStringValue(material);
            }
        }
        
        /**
         * Sets (as xml) the "material" attribute
         */
        public void xsetMaterial(org.apache.xmlbeans.XmlString material)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MATERIAL$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MATERIAL$12);
                }
                target.set(material);
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
                get_store().remove_attribute(MATERIAL$12);
            }
        }
        
        /**
         * Gets the "closedArea" attribute
         */
        public boolean getClosedArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLOSEDAREA$14);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "closedArea" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetClosedArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CLOSEDAREA$14);
                return target;
            }
        }
        
        /**
         * True if has "closedArea" attribute
         */
        public boolean isSetClosedArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CLOSEDAREA$14) != null;
            }
        }
        
        /**
         * Sets the "closedArea" attribute
         */
        public void setClosedArea(boolean closedArea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLOSEDAREA$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLOSEDAREA$14);
                }
                target.setBooleanValue(closedArea);
            }
        }
        
        /**
         * Sets (as xml) the "closedArea" attribute
         */
        public void xsetClosedArea(org.apache.xmlbeans.XmlBoolean closedArea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CLOSEDAREA$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CLOSEDAREA$14);
                }
                target.set(closedArea);
            }
        }
        
        /**
         * Unsets the "closedArea" attribute
         */
        public void unsetClosedArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CLOSEDAREA$14);
            }
        }
        
        /**
         * Gets the "typicalThickness" attribute
         */
        public double getTypicalThickness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPICALTHICKNESS$16);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "typicalThickness" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetTypicalThickness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TYPICALTHICKNESS$16);
                return target;
            }
        }
        
        /**
         * True if has "typicalThickness" attribute
         */
        public boolean isSetTypicalThickness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPICALTHICKNESS$16) != null;
            }
        }
        
        /**
         * Sets the "typicalThickness" attribute
         */
        public void setTypicalThickness(double typicalThickness)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPICALTHICKNESS$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPICALTHICKNESS$16);
                }
                target.setDoubleValue(typicalThickness);
            }
        }
        
        /**
         * Sets (as xml) the "typicalThickness" attribute
         */
        public void xsetTypicalThickness(org.apache.xmlbeans.XmlDouble typicalThickness)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TYPICALTHICKNESS$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TYPICALTHICKNESS$16);
                }
                target.set(typicalThickness);
            }
        }
        
        /**
         * Unsets the "typicalThickness" attribute
         */
        public void unsetTypicalThickness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPICALTHICKNESS$16);
            }
        }
        
        /**
         * Gets the "typicalWidth" attribute
         */
        public double getTypicalWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPICALWIDTH$18);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "typicalWidth" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetTypicalWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TYPICALWIDTH$18);
                return target;
            }
        }
        
        /**
         * True if has "typicalWidth" attribute
         */
        public boolean isSetTypicalWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPICALWIDTH$18) != null;
            }
        }
        
        /**
         * Sets the "typicalWidth" attribute
         */
        public void setTypicalWidth(double typicalWidth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPICALWIDTH$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPICALWIDTH$18);
                }
                target.setDoubleValue(typicalWidth);
            }
        }
        
        /**
         * Sets (as xml) the "typicalWidth" attribute
         */
        public void xsetTypicalWidth(org.apache.xmlbeans.XmlDouble typicalWidth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TYPICALWIDTH$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TYPICALWIDTH$18);
                }
                target.set(typicalWidth);
            }
        }
        
        /**
         * Unsets the "typicalWidth" attribute
         */
        public void unsetTypicalWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPICALWIDTH$18);
            }
        }
        
        /**
         * Gets the "area" attribute
         */
        public double getArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREA$20);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "area" attribute
         */
        public org.landxml.schema.landXML11.CrossSectSurfaceArea xgetArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectSurfaceArea target = null;
                target = (org.landxml.schema.landXML11.CrossSectSurfaceArea)get_store().find_attribute_user(AREA$20);
                return target;
            }
        }
        
        /**
         * True if has "area" attribute
         */
        public boolean isSetArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AREA$20) != null;
            }
        }
        
        /**
         * Sets the "area" attribute
         */
        public void setArea(double area)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREA$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AREA$20);
                }
                target.setDoubleValue(area);
            }
        }
        
        /**
         * Sets (as xml) the "area" attribute
         */
        public void xsetArea(org.landxml.schema.landXML11.CrossSectSurfaceArea area)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectSurfaceArea target = null;
                target = (org.landxml.schema.landXML11.CrossSectSurfaceArea)get_store().find_attribute_user(AREA$20);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CrossSectSurfaceArea)get_store().add_attribute_user(AREA$20);
                }
                target.set(area);
            }
        }
        
        /**
         * Unsets the "area" attribute
         */
        public void unsetArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AREA$20);
            }
        }
        
        /**
         * Gets the "volume" attribute
         */
        public double getVolume()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VOLUME$22);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "volume" attribute
         */
        public org.landxml.schema.landXML11.CrossSectSurfaceVolume xgetVolume()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectSurfaceVolume target = null;
                target = (org.landxml.schema.landXML11.CrossSectSurfaceVolume)get_store().find_attribute_user(VOLUME$22);
                return target;
            }
        }
        
        /**
         * True if has "volume" attribute
         */
        public boolean isSetVolume()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VOLUME$22) != null;
            }
        }
        
        /**
         * Sets the "volume" attribute
         */
        public void setVolume(double volume)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VOLUME$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VOLUME$22);
                }
                target.setDoubleValue(volume);
            }
        }
        
        /**
         * Sets (as xml) the "volume" attribute
         */
        public void xsetVolume(org.landxml.schema.landXML11.CrossSectSurfaceVolume volume)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectSurfaceVolume target = null;
                target = (org.landxml.schema.landXML11.CrossSectSurfaceVolume)get_store().find_attribute_user(VOLUME$22);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CrossSectSurfaceVolume)get_store().add_attribute_user(VOLUME$22);
                }
                target.set(volume);
            }
        }
        
        /**
         * Unsets the "volume" attribute
         */
        public void unsetVolume()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VOLUME$22);
            }
        }
    }
}
