/*
 * An XML document type.
 * Localname: ZoneCrossSectStructure
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ZoneCrossSectStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one ZoneCrossSectStructure(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ZoneCrossSectStructureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ZoneCrossSectStructureDocument
{
    
    public ZoneCrossSectStructureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ZONECROSSSECTSTRUCTURE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ZoneCrossSectStructure");
    
    
    /**
     * Gets the "ZoneCrossSectStructure" element
     */
    public org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure getZoneCrossSectStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure target = null;
            target = (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure)get_store().find_element_user(ZONECROSSSECTSTRUCTURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ZoneCrossSectStructure" element
     */
    public void setZoneCrossSectStructure(org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure zoneCrossSectStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure target = null;
            target = (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure)get_store().find_element_user(ZONECROSSSECTSTRUCTURE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure)get_store().add_element_user(ZONECROSSSECTSTRUCTURE$0);
            }
            target.set(zoneCrossSectStructure);
        }
    }
    
    /**
     * Appends and returns a new empty "ZoneCrossSectStructure" element
     */
    public org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure addNewZoneCrossSectStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure target = null;
            target = (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure)get_store().add_element_user(ZONECROSSSECTSTRUCTURE$0);
            return target;
        }
    }
    /**
     * An XML ZoneCrossSectStructure(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class ZoneCrossSectStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure
    {
        
        public ZoneCrossSectStructureImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PNTLIST2D$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PntList2D");
        private static final javax.xml.namespace.QName FEATURE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName INNERCONNECTPNT$6 = 
            new javax.xml.namespace.QName("", "innerConnectPnt");
        private static final javax.xml.namespace.QName OUTERCONNECTPNT$8 = 
            new javax.xml.namespace.QName("", "outerConnectPnt");
        private static final javax.xml.namespace.QName OFFSETMODE$10 = 
            new javax.xml.namespace.QName("", "offsetMode");
        private static final javax.xml.namespace.QName STARTOFFSET$12 = 
            new javax.xml.namespace.QName("", "startOffset");
        private static final javax.xml.namespace.QName STARTOFFSETELEV$14 = 
            new javax.xml.namespace.QName("", "startOffsetElev");
        private static final javax.xml.namespace.QName ENDOFFSET$16 = 
            new javax.xml.namespace.QName("", "endOffset");
        private static final javax.xml.namespace.QName ENDOFFSETELEV$18 = 
            new javax.xml.namespace.QName("", "endOffsetElev");
        private static final javax.xml.namespace.QName TRANSITION$20 = 
            new javax.xml.namespace.QName("", "transition");
        private static final javax.xml.namespace.QName PLACEMENT$22 = 
            new javax.xml.namespace.QName("", "placement");
        private static final javax.xml.namespace.QName CATALOGREFERENCE$24 = 
            new javax.xml.namespace.QName("", "catalogReference");
        
        
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
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return ZoneCrossSectStructureImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ZoneCrossSectStructureImpl.this.getFeatureArray(i);
                    ZoneCrossSectStructureImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { ZoneCrossSectStructureImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ZoneCrossSectStructureImpl.this.getFeatureArray(i);
                    ZoneCrossSectStructureImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return ZoneCrossSectStructureImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "innerConnectPnt" attribute
         */
        public java.util.List getInnerConnectPnt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INNERCONNECTPNT$6);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "innerConnectPnt" attribute
         */
        public org.landxml.schema.landXML11.CrossSectionPnt xgetInnerConnectPnt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectionPnt target = null;
                target = (org.landxml.schema.landXML11.CrossSectionPnt)get_store().find_attribute_user(INNERCONNECTPNT$6);
                return target;
            }
        }
        
        /**
         * Sets the "innerConnectPnt" attribute
         */
        public void setInnerConnectPnt(java.util.List innerConnectPnt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INNERCONNECTPNT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INNERCONNECTPNT$6);
                }
                target.setListValue(innerConnectPnt);
            }
        }
        
        /**
         * Sets (as xml) the "innerConnectPnt" attribute
         */
        public void xsetInnerConnectPnt(org.landxml.schema.landXML11.CrossSectionPnt innerConnectPnt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectionPnt target = null;
                target = (org.landxml.schema.landXML11.CrossSectionPnt)get_store().find_attribute_user(INNERCONNECTPNT$6);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CrossSectionPnt)get_store().add_attribute_user(INNERCONNECTPNT$6);
                }
                target.set(innerConnectPnt);
            }
        }
        
        /**
         * Gets the "outerConnectPnt" attribute
         */
        public java.util.List getOuterConnectPnt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTERCONNECTPNT$8);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "outerConnectPnt" attribute
         */
        public org.landxml.schema.landXML11.CrossSectionPnt xgetOuterConnectPnt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectionPnt target = null;
                target = (org.landxml.schema.landXML11.CrossSectionPnt)get_store().find_attribute_user(OUTERCONNECTPNT$8);
                return target;
            }
        }
        
        /**
         * Sets the "outerConnectPnt" attribute
         */
        public void setOuterConnectPnt(java.util.List outerConnectPnt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTERCONNECTPNT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTERCONNECTPNT$8);
                }
                target.setListValue(outerConnectPnt);
            }
        }
        
        /**
         * Sets (as xml) the "outerConnectPnt" attribute
         */
        public void xsetOuterConnectPnt(org.landxml.schema.landXML11.CrossSectionPnt outerConnectPnt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectionPnt target = null;
                target = (org.landxml.schema.landXML11.CrossSectionPnt)get_store().find_attribute_user(OUTERCONNECTPNT$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CrossSectionPnt)get_store().add_attribute_user(OUTERCONNECTPNT$8);
                }
                target.set(outerConnectPnt);
            }
        }
        
        /**
         * Gets the "offsetMode" attribute
         */
        public org.landxml.schema.landXML11.ZoneOffsetType.Enum getOffsetMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFSETMODE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OFFSETMODE$10);
                }
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ZoneOffsetType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "offsetMode" attribute
         */
        public org.landxml.schema.landXML11.ZoneOffsetType xgetOffsetMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneOffsetType target = null;
                target = (org.landxml.schema.landXML11.ZoneOffsetType)get_store().find_attribute_user(OFFSETMODE$10);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ZoneOffsetType)get_default_attribute_value(OFFSETMODE$10);
                }
                return target;
            }
        }
        
        /**
         * True if has "offsetMode" attribute
         */
        public boolean isSetOffsetMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OFFSETMODE$10) != null;
            }
        }
        
        /**
         * Sets the "offsetMode" attribute
         */
        public void setOffsetMode(org.landxml.schema.landXML11.ZoneOffsetType.Enum offsetMode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFSETMODE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OFFSETMODE$10);
                }
                target.setEnumValue(offsetMode);
            }
        }
        
        /**
         * Sets (as xml) the "offsetMode" attribute
         */
        public void xsetOffsetMode(org.landxml.schema.landXML11.ZoneOffsetType offsetMode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneOffsetType target = null;
                target = (org.landxml.schema.landXML11.ZoneOffsetType)get_store().find_attribute_user(OFFSETMODE$10);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ZoneOffsetType)get_store().add_attribute_user(OFFSETMODE$10);
                }
                target.set(offsetMode);
            }
        }
        
        /**
         * Unsets the "offsetMode" attribute
         */
        public void unsetOffsetMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OFFSETMODE$10);
            }
        }
        
        /**
         * Gets the "startOffset" attribute
         */
        public double getStartOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTOFFSET$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STARTOFFSET$12);
                }
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "startOffset" attribute
         */
        public org.landxml.schema.landXML11.OffsetDistance xgetStartOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OffsetDistance target = null;
                target = (org.landxml.schema.landXML11.OffsetDistance)get_store().find_attribute_user(STARTOFFSET$12);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.OffsetDistance)get_default_attribute_value(STARTOFFSET$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "startOffset" attribute
         */
        public boolean isSetStartOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STARTOFFSET$12) != null;
            }
        }
        
        /**
         * Sets the "startOffset" attribute
         */
        public void setStartOffset(double startOffset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTOFFSET$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTOFFSET$12);
                }
                target.setDoubleValue(startOffset);
            }
        }
        
        /**
         * Sets (as xml) the "startOffset" attribute
         */
        public void xsetStartOffset(org.landxml.schema.landXML11.OffsetDistance startOffset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OffsetDistance target = null;
                target = (org.landxml.schema.landXML11.OffsetDistance)get_store().find_attribute_user(STARTOFFSET$12);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.OffsetDistance)get_store().add_attribute_user(STARTOFFSET$12);
                }
                target.set(startOffset);
            }
        }
        
        /**
         * Unsets the "startOffset" attribute
         */
        public void unsetStartOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STARTOFFSET$12);
            }
        }
        
        /**
         * Gets the "startOffsetElev" attribute
         */
        public double getStartOffsetElev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTOFFSETELEV$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STARTOFFSETELEV$14);
                }
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "startOffsetElev" attribute
         */
        public org.landxml.schema.landXML11.OffsetElevation xgetStartOffsetElev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OffsetElevation target = null;
                target = (org.landxml.schema.landXML11.OffsetElevation)get_store().find_attribute_user(STARTOFFSETELEV$14);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.OffsetElevation)get_default_attribute_value(STARTOFFSETELEV$14);
                }
                return target;
            }
        }
        
        /**
         * True if has "startOffsetElev" attribute
         */
        public boolean isSetStartOffsetElev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STARTOFFSETELEV$14) != null;
            }
        }
        
        /**
         * Sets the "startOffsetElev" attribute
         */
        public void setStartOffsetElev(double startOffsetElev)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTOFFSETELEV$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTOFFSETELEV$14);
                }
                target.setDoubleValue(startOffsetElev);
            }
        }
        
        /**
         * Sets (as xml) the "startOffsetElev" attribute
         */
        public void xsetStartOffsetElev(org.landxml.schema.landXML11.OffsetElevation startOffsetElev)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OffsetElevation target = null;
                target = (org.landxml.schema.landXML11.OffsetElevation)get_store().find_attribute_user(STARTOFFSETELEV$14);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.OffsetElevation)get_store().add_attribute_user(STARTOFFSETELEV$14);
                }
                target.set(startOffsetElev);
            }
        }
        
        /**
         * Unsets the "startOffsetElev" attribute
         */
        public void unsetStartOffsetElev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STARTOFFSETELEV$14);
            }
        }
        
        /**
         * Gets the "endOffset" attribute
         */
        public double getEndOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDOFFSET$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ENDOFFSET$16);
                }
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "endOffset" attribute
         */
        public org.landxml.schema.landXML11.OffsetDistance xgetEndOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OffsetDistance target = null;
                target = (org.landxml.schema.landXML11.OffsetDistance)get_store().find_attribute_user(ENDOFFSET$16);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.OffsetDistance)get_default_attribute_value(ENDOFFSET$16);
                }
                return target;
            }
        }
        
        /**
         * True if has "endOffset" attribute
         */
        public boolean isSetEndOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENDOFFSET$16) != null;
            }
        }
        
        /**
         * Sets the "endOffset" attribute
         */
        public void setEndOffset(double endOffset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDOFFSET$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDOFFSET$16);
                }
                target.setDoubleValue(endOffset);
            }
        }
        
        /**
         * Sets (as xml) the "endOffset" attribute
         */
        public void xsetEndOffset(org.landxml.schema.landXML11.OffsetDistance endOffset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OffsetDistance target = null;
                target = (org.landxml.schema.landXML11.OffsetDistance)get_store().find_attribute_user(ENDOFFSET$16);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.OffsetDistance)get_store().add_attribute_user(ENDOFFSET$16);
                }
                target.set(endOffset);
            }
        }
        
        /**
         * Unsets the "endOffset" attribute
         */
        public void unsetEndOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENDOFFSET$16);
            }
        }
        
        /**
         * Gets the "endOffsetElev" attribute
         */
        public double getEndOffsetElev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDOFFSETELEV$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ENDOFFSETELEV$18);
                }
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "endOffsetElev" attribute
         */
        public org.landxml.schema.landXML11.OffsetElevation xgetEndOffsetElev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OffsetElevation target = null;
                target = (org.landxml.schema.landXML11.OffsetElevation)get_store().find_attribute_user(ENDOFFSETELEV$18);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.OffsetElevation)get_default_attribute_value(ENDOFFSETELEV$18);
                }
                return target;
            }
        }
        
        /**
         * True if has "endOffsetElev" attribute
         */
        public boolean isSetEndOffsetElev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENDOFFSETELEV$18) != null;
            }
        }
        
        /**
         * Sets the "endOffsetElev" attribute
         */
        public void setEndOffsetElev(double endOffsetElev)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDOFFSETELEV$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDOFFSETELEV$18);
                }
                target.setDoubleValue(endOffsetElev);
            }
        }
        
        /**
         * Sets (as xml) the "endOffsetElev" attribute
         */
        public void xsetEndOffsetElev(org.landxml.schema.landXML11.OffsetElevation endOffsetElev)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OffsetElevation target = null;
                target = (org.landxml.schema.landXML11.OffsetElevation)get_store().find_attribute_user(ENDOFFSETELEV$18);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.OffsetElevation)get_store().add_attribute_user(ENDOFFSETELEV$18);
                }
                target.set(endOffsetElev);
            }
        }
        
        /**
         * Unsets the "endOffsetElev" attribute
         */
        public void unsetEndOffsetElev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENDOFFSETELEV$18);
            }
        }
        
        /**
         * Gets the "transition" attribute
         */
        public org.landxml.schema.landXML11.ZoneTransitionType.Enum getTransition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSITION$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TRANSITION$20);
                }
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ZoneTransitionType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "transition" attribute
         */
        public org.landxml.schema.landXML11.ZoneTransitionType xgetTransition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneTransitionType target = null;
                target = (org.landxml.schema.landXML11.ZoneTransitionType)get_store().find_attribute_user(TRANSITION$20);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ZoneTransitionType)get_default_attribute_value(TRANSITION$20);
                }
                return target;
            }
        }
        
        /**
         * True if has "transition" attribute
         */
        public boolean isSetTransition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TRANSITION$20) != null;
            }
        }
        
        /**
         * Sets the "transition" attribute
         */
        public void setTransition(org.landxml.schema.landXML11.ZoneTransitionType.Enum transition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSITION$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRANSITION$20);
                }
                target.setEnumValue(transition);
            }
        }
        
        /**
         * Sets (as xml) the "transition" attribute
         */
        public void xsetTransition(org.landxml.schema.landXML11.ZoneTransitionType transition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneTransitionType target = null;
                target = (org.landxml.schema.landXML11.ZoneTransitionType)get_store().find_attribute_user(TRANSITION$20);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ZoneTransitionType)get_store().add_attribute_user(TRANSITION$20);
                }
                target.set(transition);
            }
        }
        
        /**
         * Unsets the "transition" attribute
         */
        public void unsetTransition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TRANSITION$20);
            }
        }
        
        /**
         * Gets the "placement" attribute
         */
        public org.landxml.schema.landXML11.ZonePlacementType.Enum getPlacement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLACEMENT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PLACEMENT$22);
                }
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ZonePlacementType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "placement" attribute
         */
        public org.landxml.schema.landXML11.ZonePlacementType xgetPlacement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZonePlacementType target = null;
                target = (org.landxml.schema.landXML11.ZonePlacementType)get_store().find_attribute_user(PLACEMENT$22);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ZonePlacementType)get_default_attribute_value(PLACEMENT$22);
                }
                return target;
            }
        }
        
        /**
         * True if has "placement" attribute
         */
        public boolean isSetPlacement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PLACEMENT$22) != null;
            }
        }
        
        /**
         * Sets the "placement" attribute
         */
        public void setPlacement(org.landxml.schema.landXML11.ZonePlacementType.Enum placement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLACEMENT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PLACEMENT$22);
                }
                target.setEnumValue(placement);
            }
        }
        
        /**
         * Sets (as xml) the "placement" attribute
         */
        public void xsetPlacement(org.landxml.schema.landXML11.ZonePlacementType placement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZonePlacementType target = null;
                target = (org.landxml.schema.landXML11.ZonePlacementType)get_store().find_attribute_user(PLACEMENT$22);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ZonePlacementType)get_store().add_attribute_user(PLACEMENT$22);
                }
                target.set(placement);
            }
        }
        
        /**
         * Unsets the "placement" attribute
         */
        public void unsetPlacement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PLACEMENT$22);
            }
        }
        
        /**
         * Gets the "catalogReference" attribute
         */
        public java.lang.String getCatalogReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATALOGREFERENCE$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "catalogReference" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetCatalogReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(CATALOGREFERENCE$24);
                return target;
            }
        }
        
        /**
         * True if has "catalogReference" attribute
         */
        public boolean isSetCatalogReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CATALOGREFERENCE$24) != null;
            }
        }
        
        /**
         * Sets the "catalogReference" attribute
         */
        public void setCatalogReference(java.lang.String catalogReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATALOGREFERENCE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATALOGREFERENCE$24);
                }
                target.setStringValue(catalogReference);
            }
        }
        
        /**
         * Sets (as xml) the "catalogReference" attribute
         */
        public void xsetCatalogReference(org.apache.xmlbeans.XmlAnyURI catalogReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(CATALOGREFERENCE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(CATALOGREFERENCE$24);
                }
                target.set(catalogReference);
            }
        }
        
        /**
         * Unsets the "catalogReference" attribute
         */
        public void unsetCatalogReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CATALOGREFERENCE$24);
            }
        }
    }
}
