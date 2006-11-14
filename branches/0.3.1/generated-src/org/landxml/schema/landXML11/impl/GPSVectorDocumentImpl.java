/*
 * An XML document type.
 * Localname: GPSVector
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.GPSVectorDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one GPSVector(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class GPSVectorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.GPSVectorDocument
{
    
    public GPSVectorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GPSVECTOR$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "GPSVector");
    
    
    /**
     * Gets the "GPSVector" element
     */
    public org.landxml.schema.landXML11.GPSVectorDocument.GPSVector getGPSVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GPSVectorDocument.GPSVector target = null;
            target = (org.landxml.schema.landXML11.GPSVectorDocument.GPSVector)get_store().find_element_user(GPSVECTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GPSVector" element
     */
    public void setGPSVector(org.landxml.schema.landXML11.GPSVectorDocument.GPSVector gpsVector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GPSVectorDocument.GPSVector target = null;
            target = (org.landxml.schema.landXML11.GPSVectorDocument.GPSVector)get_store().find_element_user(GPSVECTOR$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.GPSVectorDocument.GPSVector)get_store().add_element_user(GPSVECTOR$0);
            }
            target.set(gpsVector);
        }
    }
    
    /**
     * Appends and returns a new empty "GPSVector" element
     */
    public org.landxml.schema.landXML11.GPSVectorDocument.GPSVector addNewGPSVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GPSVectorDocument.GPSVector target = null;
            target = (org.landxml.schema.landXML11.GPSVectorDocument.GPSVector)get_store().add_element_user(GPSVECTOR$0);
            return target;
        }
    }
    /**
     * An XML GPSVector(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class GPSVectorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.GPSVectorDocument.GPSVector
    {
        
        public GPSVectorImpl(org.apache.xmlbeans.SchemaType sType)
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
        private static final javax.xml.namespace.QName DX$10 = 
            new javax.xml.namespace.QName("", "dX");
        private static final javax.xml.namespace.QName DY$12 = 
            new javax.xml.namespace.QName("", "dY");
        private static final javax.xml.namespace.QName DZ$14 = 
            new javax.xml.namespace.QName("", "dZ");
        private static final javax.xml.namespace.QName SETUPIDA$16 = 
            new javax.xml.namespace.QName("", "setupID_A");
        private static final javax.xml.namespace.QName SETUPIDB$18 = 
            new javax.xml.namespace.QName("", "setupID_B");
        private static final javax.xml.namespace.QName STARTTIME$20 = 
            new javax.xml.namespace.QName("", "startTime");
        private static final javax.xml.namespace.QName ENDTIME$22 = 
            new javax.xml.namespace.QName("", "endTime");
        private static final javax.xml.namespace.QName HORIZONTALPRECISION$24 = 
            new javax.xml.namespace.QName("", "horizontalPrecision");
        private static final javax.xml.namespace.QName VERTICALPRECISION$26 = 
            new javax.xml.namespace.QName("", "verticalPrecision");
        private static final javax.xml.namespace.QName PURPOSE$28 = 
            new javax.xml.namespace.QName("", "purpose");
        private static final javax.xml.namespace.QName SETID$30 = 
            new javax.xml.namespace.QName("", "setID");
        private static final javax.xml.namespace.QName SOLUTIONDATALINK$32 = 
            new javax.xml.namespace.QName("", "solutionDataLink");
        private static final javax.xml.namespace.QName COORDGEOMREFS$34 = 
            new javax.xml.namespace.QName("", "coordGeomRefs");
        
        
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
                    { return GPSVectorImpl.this.getFieldNoteArray(i); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote set(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = GPSVectorImpl.this.getFieldNoteArray(i);
                    GPSVectorImpl.this.setFieldNoteArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                    { GPSVectorImpl.this.insertNewFieldNote(i).set(o); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote remove(int i)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = GPSVectorImpl.this.getFieldNoteArray(i);
                    GPSVectorImpl.this.removeFieldNote(i);
                    return old;
                }
                
                public int size()
                    { return GPSVectorImpl.this.sizeOfFieldNoteArray(); }
                
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
                    { return GPSVectorImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = GPSVectorImpl.this.getFeatureArray(i);
                    GPSVectorImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { GPSVectorImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = GPSVectorImpl.this.getFeatureArray(i);
                    GPSVectorImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return GPSVectorImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "dX" attribute
         */
        public double getDX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DX$10);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "dX" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetDX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DX$10);
                return target;
            }
        }
        
        /**
         * Sets the "dX" attribute
         */
        public void setDX(double dx)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DX$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DX$10);
                }
                target.setDoubleValue(dx);
            }
        }
        
        /**
         * Sets (as xml) the "dX" attribute
         */
        public void xsetDX(org.apache.xmlbeans.XmlDouble dx)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DX$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DX$10);
                }
                target.set(dx);
            }
        }
        
        /**
         * Gets the "dY" attribute
         */
        public double getDY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DY$12);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "dY" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetDY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DY$12);
                return target;
            }
        }
        
        /**
         * Sets the "dY" attribute
         */
        public void setDY(double dy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DY$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DY$12);
                }
                target.setDoubleValue(dy);
            }
        }
        
        /**
         * Sets (as xml) the "dY" attribute
         */
        public void xsetDY(org.apache.xmlbeans.XmlDouble dy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DY$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DY$12);
                }
                target.set(dy);
            }
        }
        
        /**
         * Gets the "dZ" attribute
         */
        public double getDZ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DZ$14);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "dZ" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetDZ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DZ$14);
                return target;
            }
        }
        
        /**
         * Sets the "dZ" attribute
         */
        public void setDZ(double dz)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DZ$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DZ$14);
                }
                target.setDoubleValue(dz);
            }
        }
        
        /**
         * Sets (as xml) the "dZ" attribute
         */
        public void xsetDZ(org.apache.xmlbeans.XmlDouble dz)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DZ$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DZ$14);
                }
                target.set(dz);
            }
        }
        
        /**
         * Gets the "setupID_A" attribute
         */
        public java.lang.String getSetupIDA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETUPIDA$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "setupID_A" attribute
         */
        public org.apache.xmlbeans.XmlIDREF xgetSetupIDA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(SETUPIDA$16);
                return target;
            }
        }
        
        /**
         * Sets the "setupID_A" attribute
         */
        public void setSetupIDA(java.lang.String setupIDA)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETUPIDA$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETUPIDA$16);
                }
                target.setStringValue(setupIDA);
            }
        }
        
        /**
         * Sets (as xml) the "setupID_A" attribute
         */
        public void xsetSetupIDA(org.apache.xmlbeans.XmlIDREF setupIDA)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(SETUPIDA$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(SETUPIDA$16);
                }
                target.set(setupIDA);
            }
        }
        
        /**
         * Gets the "setupID_B" attribute
         */
        public java.lang.String getSetupIDB()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETUPIDB$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "setupID_B" attribute
         */
        public org.apache.xmlbeans.XmlIDREF xgetSetupIDB()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(SETUPIDB$18);
                return target;
            }
        }
        
        /**
         * Sets the "setupID_B" attribute
         */
        public void setSetupIDB(java.lang.String setupIDB)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETUPIDB$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETUPIDB$18);
                }
                target.setStringValue(setupIDB);
            }
        }
        
        /**
         * Sets (as xml) the "setupID_B" attribute
         */
        public void xsetSetupIDB(org.apache.xmlbeans.XmlIDREF setupIDB)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(SETUPIDB$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(SETUPIDB$18);
                }
                target.set(setupIDB);
            }
        }
        
        /**
         * Gets the "startTime" attribute
         */
        public java.util.Calendar getStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTTIME$20);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "startTime" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(STARTTIME$20);
                return target;
            }
        }
        
        /**
         * True if has "startTime" attribute
         */
        public boolean isSetStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STARTTIME$20) != null;
            }
        }
        
        /**
         * Sets the "startTime" attribute
         */
        public void setStartTime(java.util.Calendar startTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTTIME$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTTIME$20);
                }
                target.setCalendarValue(startTime);
            }
        }
        
        /**
         * Sets (as xml) the "startTime" attribute
         */
        public void xsetStartTime(org.apache.xmlbeans.XmlDateTime startTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(STARTTIME$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(STARTTIME$20);
                }
                target.set(startTime);
            }
        }
        
        /**
         * Unsets the "startTime" attribute
         */
        public void unsetStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STARTTIME$20);
            }
        }
        
        /**
         * Gets the "endTime" attribute
         */
        public java.util.Calendar getEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDTIME$22);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "endTime" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(ENDTIME$22);
                return target;
            }
        }
        
        /**
         * True if has "endTime" attribute
         */
        public boolean isSetEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENDTIME$22) != null;
            }
        }
        
        /**
         * Sets the "endTime" attribute
         */
        public void setEndTime(java.util.Calendar endTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDTIME$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDTIME$22);
                }
                target.setCalendarValue(endTime);
            }
        }
        
        /**
         * Sets (as xml) the "endTime" attribute
         */
        public void xsetEndTime(org.apache.xmlbeans.XmlDateTime endTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(ENDTIME$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(ENDTIME$22);
                }
                target.set(endTime);
            }
        }
        
        /**
         * Unsets the "endTime" attribute
         */
        public void unsetEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENDTIME$22);
            }
        }
        
        /**
         * Gets the "horizontalPrecision" attribute
         */
        public double getHorizontalPrecision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTALPRECISION$24);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "horizontalPrecision" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetHorizontalPrecision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HORIZONTALPRECISION$24);
                return target;
            }
        }
        
        /**
         * True if has "horizontalPrecision" attribute
         */
        public boolean isSetHorizontalPrecision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HORIZONTALPRECISION$24) != null;
            }
        }
        
        /**
         * Sets the "horizontalPrecision" attribute
         */
        public void setHorizontalPrecision(double horizontalPrecision)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTALPRECISION$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORIZONTALPRECISION$24);
                }
                target.setDoubleValue(horizontalPrecision);
            }
        }
        
        /**
         * Sets (as xml) the "horizontalPrecision" attribute
         */
        public void xsetHorizontalPrecision(org.apache.xmlbeans.XmlDouble horizontalPrecision)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HORIZONTALPRECISION$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(HORIZONTALPRECISION$24);
                }
                target.set(horizontalPrecision);
            }
        }
        
        /**
         * Unsets the "horizontalPrecision" attribute
         */
        public void unsetHorizontalPrecision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HORIZONTALPRECISION$24);
            }
        }
        
        /**
         * Gets the "verticalPrecision" attribute
         */
        public double getVerticalPrecision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALPRECISION$26);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "verticalPrecision" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetVerticalPrecision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VERTICALPRECISION$26);
                return target;
            }
        }
        
        /**
         * True if has "verticalPrecision" attribute
         */
        public boolean isSetVerticalPrecision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VERTICALPRECISION$26) != null;
            }
        }
        
        /**
         * Sets the "verticalPrecision" attribute
         */
        public void setVerticalPrecision(double verticalPrecision)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALPRECISION$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTICALPRECISION$26);
                }
                target.setDoubleValue(verticalPrecision);
            }
        }
        
        /**
         * Sets (as xml) the "verticalPrecision" attribute
         */
        public void xsetVerticalPrecision(org.apache.xmlbeans.XmlDouble verticalPrecision)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VERTICALPRECISION$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VERTICALPRECISION$26);
                }
                target.set(verticalPrecision);
            }
        }
        
        /**
         * Unsets the "verticalPrecision" attribute
         */
        public void unsetVerticalPrecision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VERTICALPRECISION$26);
            }
        }
        
        /**
         * Gets the "purpose" attribute
         */
        public org.landxml.schema.landXML11.PurposeType.Enum getPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PURPOSE$28);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.PurposeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "purpose" attribute
         */
        public org.landxml.schema.landXML11.PurposeType xgetPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PurposeType target = null;
                target = (org.landxml.schema.landXML11.PurposeType)get_store().find_attribute_user(PURPOSE$28);
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
                return get_store().find_attribute_user(PURPOSE$28) != null;
            }
        }
        
        /**
         * Sets the "purpose" attribute
         */
        public void setPurpose(org.landxml.schema.landXML11.PurposeType.Enum purpose)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PURPOSE$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PURPOSE$28);
                }
                target.setEnumValue(purpose);
            }
        }
        
        /**
         * Sets (as xml) the "purpose" attribute
         */
        public void xsetPurpose(org.landxml.schema.landXML11.PurposeType purpose)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PurposeType target = null;
                target = (org.landxml.schema.landXML11.PurposeType)get_store().find_attribute_user(PURPOSE$28);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PurposeType)get_store().add_attribute_user(PURPOSE$28);
                }
                target.set(purpose);
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
                get_store().remove_attribute(PURPOSE$28);
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
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(SETID$30);
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
                return get_store().find_attribute_user(SETID$30) != null;
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
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(SETID$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(SETID$30);
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
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(SETID$30);
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
                get_store().remove_attribute(SETID$30);
            }
        }
        
        /**
         * Gets the "solutionDataLink" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getSolutionDataLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(SOLUTIONDATALINK$32);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "solutionDataLink" attribute
         */
        public boolean isSetSolutionDataLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SOLUTIONDATALINK$32) != null;
            }
        }
        
        /**
         * Sets the "solutionDataLink" attribute
         */
        public void setSolutionDataLink(org.apache.xmlbeans.XmlAnySimpleType solutionDataLink)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(SOLUTIONDATALINK$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(SOLUTIONDATALINK$32);
                }
                target.set(solutionDataLink);
            }
        }
        
        /**
         * Appends and returns a new empty "solutionDataLink" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewSolutionDataLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(SOLUTIONDATALINK$32);
                return target;
            }
        }
        
        /**
         * Unsets the "solutionDataLink" attribute
         */
        public void unsetSolutionDataLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SOLUTIONDATALINK$32);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COORDGEOMREFS$34);
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
                target = (org.landxml.schema.landXML11.CoordGeomNameRefs)get_store().find_attribute_user(COORDGEOMREFS$34);
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
                return get_store().find_attribute_user(COORDGEOMREFS$34) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COORDGEOMREFS$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COORDGEOMREFS$34);
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
                target = (org.landxml.schema.landXML11.CoordGeomNameRefs)get_store().find_attribute_user(COORDGEOMREFS$34);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CoordGeomNameRefs)get_store().add_attribute_user(COORDGEOMREFS$34);
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
                get_store().remove_attribute(COORDGEOMREFS$34);
            }
        }
    }
}
