/*
 * An XML document type.
 * Localname: GPSPosition
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.GPSPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one GPSPosition(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class GPSPositionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.GPSPositionDocument
{
    
    public GPSPositionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GPSPOSITION$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "GPSPosition");
    
    
    /**
     * Gets the "GPSPosition" element
     */
    public org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition getGPSPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition target = null;
            target = (org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition)get_store().find_element_user(GPSPOSITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GPSPosition" element
     */
    public void setGPSPosition(org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition gpsPosition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition target = null;
            target = (org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition)get_store().find_element_user(GPSPOSITION$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition)get_store().add_element_user(GPSPOSITION$0);
            }
            target.set(gpsPosition);
        }
    }
    
    /**
     * Appends and returns a new empty "GPSPosition" element
     */
    public org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition addNewGPSPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition target = null;
            target = (org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition)get_store().add_element_user(GPSPOSITION$0);
            return target;
        }
    }
    /**
     * An XML GPSPosition(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class GPSPositionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition
    {
        
        public GPSPositionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TARGETPOINT$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "TargetPoint");
        private static final javax.xml.namespace.QName GPSQCINFOLEVEL1$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "GPSQCInfoLevel1");
        private static final javax.xml.namespace.QName GPSQCINFOLEVEL2$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "GPSQCInfoLevel2");
        private static final javax.xml.namespace.QName FIELDNOTE$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FieldNote");
        private static final javax.xml.namespace.QName FEATURE$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName SETUPID$10 = 
            new javax.xml.namespace.QName("", "setupID");
        private static final javax.xml.namespace.QName SETID$12 = 
            new javax.xml.namespace.QName("", "setID");
        private static final javax.xml.namespace.QName WGSHEIGHT$14 = 
            new javax.xml.namespace.QName("", "wgsHeight");
        private static final javax.xml.namespace.QName WGSLATITUDE$16 = 
            new javax.xml.namespace.QName("", "wgsLatitude");
        private static final javax.xml.namespace.QName WGSLONGITUDE$18 = 
            new javax.xml.namespace.QName("", "wgsLongitude");
        private static final javax.xml.namespace.QName PURPOSE$20 = 
            new javax.xml.namespace.QName("", "purpose");
        private static final javax.xml.namespace.QName COORDGEOMREFS$22 = 
            new javax.xml.namespace.QName("", "coordGeomRefs");
        private static final javax.xml.namespace.QName PNTREF$24 = 
            new javax.xml.namespace.QName("", "pntRef");
        
        
        /**
         * Gets the "TargetPoint" element
         */
        public org.landxml.schema.landXML11.PointType getTargetPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(TARGETPOINT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "TargetPoint" element
         */
        public void setTargetPoint(org.landxml.schema.landXML11.PointType targetPoint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(TARGETPOINT$0, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(TARGETPOINT$0);
                }
                target.set(targetPoint);
            }
        }
        
        /**
         * Appends and returns a new empty "TargetPoint" element
         */
        public org.landxml.schema.landXML11.PointType addNewTargetPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(TARGETPOINT$0);
                return target;
            }
        }
        
        /**
         * Gets the "GPSQCInfoLevel1" element
         */
        public org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1 getGPSQCInfoLevel1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1 target = null;
                target = (org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1)get_store().find_element_user(GPSQCINFOLEVEL1$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GPSQCInfoLevel1" element
         */
        public boolean isSetGPSQCInfoLevel1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GPSQCINFOLEVEL1$2) != 0;
            }
        }
        
        /**
         * Sets the "GPSQCInfoLevel1" element
         */
        public void setGPSQCInfoLevel1(org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1 gpsqcInfoLevel1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1 target = null;
                target = (org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1)get_store().find_element_user(GPSQCINFOLEVEL1$2, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1)get_store().add_element_user(GPSQCINFOLEVEL1$2);
                }
                target.set(gpsqcInfoLevel1);
            }
        }
        
        /**
         * Appends and returns a new empty "GPSQCInfoLevel1" element
         */
        public org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1 addNewGPSQCInfoLevel1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1 target = null;
                target = (org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1)get_store().add_element_user(GPSQCINFOLEVEL1$2);
                return target;
            }
        }
        
        /**
         * Unsets the "GPSQCInfoLevel1" element
         */
        public void unsetGPSQCInfoLevel1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GPSQCINFOLEVEL1$2, 0);
            }
        }
        
        /**
         * Gets the "GPSQCInfoLevel2" element
         */
        public org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2 getGPSQCInfoLevel2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2 target = null;
                target = (org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2)get_store().find_element_user(GPSQCINFOLEVEL2$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GPSQCInfoLevel2" element
         */
        public boolean isSetGPSQCInfoLevel2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GPSQCINFOLEVEL2$4) != 0;
            }
        }
        
        /**
         * Sets the "GPSQCInfoLevel2" element
         */
        public void setGPSQCInfoLevel2(org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2 gpsqcInfoLevel2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2 target = null;
                target = (org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2)get_store().find_element_user(GPSQCINFOLEVEL2$4, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2)get_store().add_element_user(GPSQCINFOLEVEL2$4);
                }
                target.set(gpsqcInfoLevel2);
            }
        }
        
        /**
         * Appends and returns a new empty "GPSQCInfoLevel2" element
         */
        public org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2 addNewGPSQCInfoLevel2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2 target = null;
                target = (org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2)get_store().add_element_user(GPSQCINFOLEVEL2$4);
                return target;
            }
        }
        
        /**
         * Unsets the "GPSQCInfoLevel2" element
         */
        public void unsetGPSQCInfoLevel2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GPSQCINFOLEVEL2$4, 0);
            }
        }
        
        /**
         * Gets a List of "FieldNote" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FieldNoteDocument.FieldNote> getFieldNoteList()
        {
            final class FieldNoteList extends java.util.AbstractList<org.landxml.schema.landXML11.FieldNoteDocument.FieldNote>
            {
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote get(int i)
                    { return GPSPositionImpl.this.getFieldNoteArray(i); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote set(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = GPSPositionImpl.this.getFieldNoteArray(i);
                    GPSPositionImpl.this.setFieldNoteArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                    { GPSPositionImpl.this.insertNewFieldNote(i).set(o); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote remove(int i)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = GPSPositionImpl.this.getFieldNoteArray(i);
                    GPSPositionImpl.this.removeFieldNote(i);
                    return old;
                }
                
                public int size()
                    { return GPSPositionImpl.this.sizeOfFieldNoteArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FieldNoteList();
            }
        }
        
        /**
         * Gets array of all "FieldNote" elements
         */
        public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote[] getFieldNoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FIELDNOTE$6, targetList);
                org.landxml.schema.landXML11.FieldNoteDocument.FieldNote[] result = new org.landxml.schema.landXML11.FieldNoteDocument.FieldNote[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "FieldNote" element
         */
        public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote getFieldNoteArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FieldNoteDocument.FieldNote target = null;
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().find_element_user(FIELDNOTE$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "FieldNote" element
         */
        public int sizeOfFieldNoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELDNOTE$6);
            }
        }
        
        /**
         * Sets array of all "FieldNote" element
         */
        public void setFieldNoteArray(org.landxml.schema.landXML11.FieldNoteDocument.FieldNote[] fieldNoteArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(fieldNoteArray, FIELDNOTE$6);
            }
        }
        
        /**
         * Sets ith "FieldNote" element
         */
        public void setFieldNoteArray(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote fieldNote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FieldNoteDocument.FieldNote target = null;
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().find_element_user(FIELDNOTE$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(fieldNote);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "FieldNote" element
         */
        public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote insertNewFieldNote(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FieldNoteDocument.FieldNote target = null;
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().insert_element_user(FIELDNOTE$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "FieldNote" element
         */
        public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote addNewFieldNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FieldNoteDocument.FieldNote target = null;
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().add_element_user(FIELDNOTE$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "FieldNote" element
         */
        public void removeFieldNote(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELDNOTE$6, i);
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
                    { return GPSPositionImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = GPSPositionImpl.this.getFeatureArray(i);
                    GPSPositionImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { GPSPositionImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = GPSPositionImpl.this.getFeatureArray(i);
                    GPSPositionImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return GPSPositionImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$8, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$8, i);
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
                return get_store().count_elements(FEATURE$8);
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
                arraySetterHelper(featureArray, FEATURE$8);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$8, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$8, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$8);
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
                get_store().remove_element(FEATURE$8, i);
            }
        }
        
        /**
         * Gets the "setupID" attribute
         */
        public java.lang.String getSetupID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETUPID$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "setupID" attribute
         */
        public org.apache.xmlbeans.XmlIDREF xgetSetupID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(SETUPID$10);
                return target;
            }
        }
        
        /**
         * True if has "setupID" attribute
         */
        public boolean isSetSetupID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SETUPID$10) != null;
            }
        }
        
        /**
         * Sets the "setupID" attribute
         */
        public void setSetupID(java.lang.String setupID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETUPID$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETUPID$10);
                }
                target.setStringValue(setupID);
            }
        }
        
        /**
         * Sets (as xml) the "setupID" attribute
         */
        public void xsetSetupID(org.apache.xmlbeans.XmlIDREF setupID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(SETUPID$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(SETUPID$10);
                }
                target.set(setupID);
            }
        }
        
        /**
         * Unsets the "setupID" attribute
         */
        public void unsetSetupID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SETUPID$10);
            }
        }
        
        /**
         * Gets the "setID" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getSetID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(SETID$12);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "setID" attribute
         */
        public boolean isSetSetID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SETID$12) != null;
            }
        }
        
        /**
         * Sets the "setID" attribute
         */
        public void setSetID(org.apache.xmlbeans.XmlAnySimpleType setID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(SETID$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(SETID$12);
                }
                target.set(setID);
            }
        }
        
        /**
         * Appends and returns a new empty "setID" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewSetID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(SETID$12);
                return target;
            }
        }
        
        /**
         * Unsets the "setID" attribute
         */
        public void unsetSetID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SETID$12);
            }
        }
        
        /**
         * Gets the "wgsHeight" attribute
         */
        public double getWgsHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WGSHEIGHT$14);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "wgsHeight" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetWgsHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WGSHEIGHT$14);
                return target;
            }
        }
        
        /**
         * Sets the "wgsHeight" attribute
         */
        public void setWgsHeight(double wgsHeight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WGSHEIGHT$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WGSHEIGHT$14);
                }
                target.setDoubleValue(wgsHeight);
            }
        }
        
        /**
         * Sets (as xml) the "wgsHeight" attribute
         */
        public void xsetWgsHeight(org.apache.xmlbeans.XmlDouble wgsHeight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WGSHEIGHT$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WGSHEIGHT$14);
                }
                target.set(wgsHeight);
            }
        }
        
        /**
         * Gets the "wgsLatitude" attribute
         */
        public double getWgsLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WGSLATITUDE$16);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "wgsLatitude" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetWgsLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WGSLATITUDE$16);
                return target;
            }
        }
        
        /**
         * Sets the "wgsLatitude" attribute
         */
        public void setWgsLatitude(double wgsLatitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WGSLATITUDE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WGSLATITUDE$16);
                }
                target.setDoubleValue(wgsLatitude);
            }
        }
        
        /**
         * Sets (as xml) the "wgsLatitude" attribute
         */
        public void xsetWgsLatitude(org.apache.xmlbeans.XmlDouble wgsLatitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WGSLATITUDE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WGSLATITUDE$16);
                }
                target.set(wgsLatitude);
            }
        }
        
        /**
         * Gets the "wgsLongitude" attribute
         */
        public double getWgsLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WGSLONGITUDE$18);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "wgsLongitude" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetWgsLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WGSLONGITUDE$18);
                return target;
            }
        }
        
        /**
         * Sets the "wgsLongitude" attribute
         */
        public void setWgsLongitude(double wgsLongitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WGSLONGITUDE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WGSLONGITUDE$18);
                }
                target.setDoubleValue(wgsLongitude);
            }
        }
        
        /**
         * Sets (as xml) the "wgsLongitude" attribute
         */
        public void xsetWgsLongitude(org.apache.xmlbeans.XmlDouble wgsLongitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WGSLONGITUDE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WGSLONGITUDE$18);
                }
                target.set(wgsLongitude);
            }
        }
        
        /**
         * Gets the "purpose" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(PURPOSE$20);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "purpose" attribute
         */
        public boolean isSetPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PURPOSE$20) != null;
            }
        }
        
        /**
         * Sets the "purpose" attribute
         */
        public void setPurpose(org.apache.xmlbeans.XmlAnySimpleType purpose)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(PURPOSE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(PURPOSE$20);
                }
                target.set(purpose);
            }
        }
        
        /**
         * Appends and returns a new empty "purpose" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(PURPOSE$20);
                return target;
            }
        }
        
        /**
         * Unsets the "purpose" attribute
         */
        public void unsetPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PURPOSE$20);
            }
        }
        
        /**
         * Gets the "coordGeomRefs" attribute
         */
        public java.util.List getCoordGeomRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COORDGEOMREFS$22);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "coordGeomRefs" attribute
         */
        public org.landxml.schema.landXML11.CoordGeomNameRefs xgetCoordGeomRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordGeomNameRefs target = null;
                target = (org.landxml.schema.landXML11.CoordGeomNameRefs)get_store().find_attribute_user(COORDGEOMREFS$22);
                return target;
            }
        }
        
        /**
         * True if has "coordGeomRefs" attribute
         */
        public boolean isSetCoordGeomRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COORDGEOMREFS$22) != null;
            }
        }
        
        /**
         * Sets the "coordGeomRefs" attribute
         */
        public void setCoordGeomRefs(java.util.List coordGeomRefs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COORDGEOMREFS$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COORDGEOMREFS$22);
                }
                target.setListValue(coordGeomRefs);
            }
        }
        
        /**
         * Sets (as xml) the "coordGeomRefs" attribute
         */
        public void xsetCoordGeomRefs(org.landxml.schema.landXML11.CoordGeomNameRefs coordGeomRefs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordGeomNameRefs target = null;
                target = (org.landxml.schema.landXML11.CoordGeomNameRefs)get_store().find_attribute_user(COORDGEOMREFS$22);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CoordGeomNameRefs)get_store().add_attribute_user(COORDGEOMREFS$22);
                }
                target.set(coordGeomRefs);
            }
        }
        
        /**
         * Unsets the "coordGeomRefs" attribute
         */
        public void unsetCoordGeomRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COORDGEOMREFS$22);
            }
        }
        
        /**
         * Gets the "pntRef" attribute
         */
        public java.lang.String getPntRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PNTREF$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pntRef" attribute
         */
        public org.landxml.schema.landXML11.PointNameRef xgetPntRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointNameRef target = null;
                target = (org.landxml.schema.landXML11.PointNameRef)get_store().find_attribute_user(PNTREF$24);
                return target;
            }
        }
        
        /**
         * True if has "pntRef" attribute
         */
        public boolean isSetPntRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PNTREF$24) != null;
            }
        }
        
        /**
         * Sets the "pntRef" attribute
         */
        public void setPntRef(java.lang.String pntRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PNTREF$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PNTREF$24);
                }
                target.setStringValue(pntRef);
            }
        }
        
        /**
         * Sets (as xml) the "pntRef" attribute
         */
        public void xsetPntRef(org.landxml.schema.landXML11.PointNameRef pntRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointNameRef target = null;
                target = (org.landxml.schema.landXML11.PointNameRef)get_store().find_attribute_user(PNTREF$24);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PointNameRef)get_store().add_attribute_user(PNTREF$24);
                }
                target.set(pntRef);
            }
        }
        
        /**
         * Unsets the "pntRef" attribute
         */
        public void unsetPntRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PNTREF$24);
            }
        }
    }
}
