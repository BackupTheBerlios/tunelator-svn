/*
 * An XML document type.
 * Localname: RawObservation
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.RawObservationDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one RawObservation(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class RawObservationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.RawObservationDocument
{
    
    public RawObservationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RAWOBSERVATION$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "RawObservation");
    
    
    /**
     * Gets the "RawObservation" element
     */
    public org.landxml.schema.landXML11.RawObservationDocument.RawObservation getRawObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RawObservationDocument.RawObservation target = null;
            target = (org.landxml.schema.landXML11.RawObservationDocument.RawObservation)get_store().find_element_user(RAWOBSERVATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RawObservation" element
     */
    public void setRawObservation(org.landxml.schema.landXML11.RawObservationDocument.RawObservation rawObservation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RawObservationDocument.RawObservation target = null;
            target = (org.landxml.schema.landXML11.RawObservationDocument.RawObservation)get_store().find_element_user(RAWOBSERVATION$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.RawObservationDocument.RawObservation)get_store().add_element_user(RAWOBSERVATION$0);
            }
            target.set(rawObservation);
        }
    }
    
    /**
     * Appends and returns a new empty "RawObservation" element
     */
    public org.landxml.schema.landXML11.RawObservationDocument.RawObservation addNewRawObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RawObservationDocument.RawObservation target = null;
            target = (org.landxml.schema.landXML11.RawObservationDocument.RawObservation)get_store().add_element_user(RAWOBSERVATION$0);
            return target;
        }
    }
    /**
     * An XML RawObservation(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class RawObservationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.RawObservationDocument.RawObservation
    {
        
        public RawObservationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TARGETPOINT$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "TargetPoint");
        private static final javax.xml.namespace.QName OFFSETVALS$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "OffsetVals");
        private static final javax.xml.namespace.QName FIELDNOTE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FieldNote");
        private static final javax.xml.namespace.QName FEATURE$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName SETUPID$8 = 
            new javax.xml.namespace.QName("", "setupID");
        private static final javax.xml.namespace.QName TARGETSETUPID$10 = 
            new javax.xml.namespace.QName("", "targetSetupID");
        private static final javax.xml.namespace.QName SETID$12 = 
            new javax.xml.namespace.QName("", "setID");
        private static final javax.xml.namespace.QName PURPOSE$14 = 
            new javax.xml.namespace.QName("", "purpose");
        private static final javax.xml.namespace.QName TARGETHEIGHT$16 = 
            new javax.xml.namespace.QName("", "targetHeight");
        private static final javax.xml.namespace.QName HORIZANGLE$18 = 
            new javax.xml.namespace.QName("", "horizAngle");
        private static final javax.xml.namespace.QName SLOPEDISTANCE$20 = 
            new javax.xml.namespace.QName("", "slopeDistance");
        private static final javax.xml.namespace.QName ZENITHANGLE$22 = 
            new javax.xml.namespace.QName("", "zenithAngle");
        private static final javax.xml.namespace.QName HORIZDISTANCE$24 = 
            new javax.xml.namespace.QName("", "horizDistance");
        private static final javax.xml.namespace.QName VERTDISTANCE$26 = 
            new javax.xml.namespace.QName("", "vertDistance");
        private static final javax.xml.namespace.QName AZIMUTH$28 = 
            new javax.xml.namespace.QName("", "azimuth");
        private static final javax.xml.namespace.QName UNUSED$30 = 
            new javax.xml.namespace.QName("", "unused");
        private static final javax.xml.namespace.QName DIRECTFACE$32 = 
            new javax.xml.namespace.QName("", "directFace");
        private static final javax.xml.namespace.QName COORDGEOMREFS$34 = 
            new javax.xml.namespace.QName("", "coordGeomRefs");
        private static final javax.xml.namespace.QName TIMESTAMP$36 = 
            new javax.xml.namespace.QName("", "timeStamp");
        
        
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
         * Gets the "OffsetVals" element
         */
        public org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals getOffsetVals()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals target = null;
                target = (org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals)get_store().find_element_user(OFFSETVALS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "OffsetVals" element
         */
        public boolean isSetOffsetVals()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OFFSETVALS$2) != 0;
            }
        }
        
        /**
         * Sets the "OffsetVals" element
         */
        public void setOffsetVals(org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals offsetVals)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals target = null;
                target = (org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals)get_store().find_element_user(OFFSETVALS$2, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals)get_store().add_element_user(OFFSETVALS$2);
                }
                target.set(offsetVals);
            }
        }
        
        /**
         * Appends and returns a new empty "OffsetVals" element
         */
        public org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals addNewOffsetVals()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals target = null;
                target = (org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals)get_store().add_element_user(OFFSETVALS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "OffsetVals" element
         */
        public void unsetOffsetVals()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OFFSETVALS$2, 0);
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
                    { return RawObservationImpl.this.getFieldNoteArray(i); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote set(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = RawObservationImpl.this.getFieldNoteArray(i);
                    RawObservationImpl.this.setFieldNoteArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                    { RawObservationImpl.this.insertNewFieldNote(i).set(o); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote remove(int i)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = RawObservationImpl.this.getFieldNoteArray(i);
                    RawObservationImpl.this.removeFieldNote(i);
                    return old;
                }
                
                public int size()
                    { return RawObservationImpl.this.sizeOfFieldNoteArray(); }
                
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
                get_store().find_all_element_users(FIELDNOTE$4, targetList);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().find_element_user(FIELDNOTE$4, i);
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
                return get_store().count_elements(FIELDNOTE$4);
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
                arraySetterHelper(fieldNoteArray, FIELDNOTE$4);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().find_element_user(FIELDNOTE$4, i);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().insert_element_user(FIELDNOTE$4, i);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().add_element_user(FIELDNOTE$4);
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
                get_store().remove_element(FIELDNOTE$4, i);
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
                    { return RawObservationImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = RawObservationImpl.this.getFeatureArray(i);
                    RawObservationImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { RawObservationImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = RawObservationImpl.this.getFeatureArray(i);
                    RawObservationImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return RawObservationImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$6, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$6, i);
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
                return get_store().count_elements(FEATURE$6);
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
                arraySetterHelper(featureArray, FEATURE$6);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$6, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$6, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$6);
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
                get_store().remove_element(FEATURE$6, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETUPID$8);
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
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(SETUPID$8);
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
                return get_store().find_attribute_user(SETUPID$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETUPID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETUPID$8);
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
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(SETUPID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(SETUPID$8);
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
                get_store().remove_attribute(SETUPID$8);
            }
        }
        
        /**
         * Gets the "targetSetupID" attribute
         */
        public java.lang.String getTargetSetupID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETSETUPID$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "targetSetupID" attribute
         */
        public org.apache.xmlbeans.XmlIDREF xgetTargetSetupID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(TARGETSETUPID$10);
                return target;
            }
        }
        
        /**
         * True if has "targetSetupID" attribute
         */
        public boolean isSetTargetSetupID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TARGETSETUPID$10) != null;
            }
        }
        
        /**
         * Sets the "targetSetupID" attribute
         */
        public void setTargetSetupID(java.lang.String targetSetupID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETSETUPID$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETSETUPID$10);
                }
                target.setStringValue(targetSetupID);
            }
        }
        
        /**
         * Sets (as xml) the "targetSetupID" attribute
         */
        public void xsetTargetSetupID(org.apache.xmlbeans.XmlIDREF targetSetupID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(TARGETSETUPID$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(TARGETSETUPID$10);
                }
                target.set(targetSetupID);
            }
        }
        
        /**
         * Unsets the "targetSetupID" attribute
         */
        public void unsetTargetSetupID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TARGETSETUPID$10);
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
         * Gets the "purpose" attribute
         */
        public org.landxml.schema.landXML11.PurposeType.Enum getPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PURPOSE$14);
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
                target = (org.landxml.schema.landXML11.PurposeType)get_store().find_attribute_user(PURPOSE$14);
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
                return get_store().find_attribute_user(PURPOSE$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PURPOSE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PURPOSE$14);
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
                target = (org.landxml.schema.landXML11.PurposeType)get_store().find_attribute_user(PURPOSE$14);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PurposeType)get_store().add_attribute_user(PURPOSE$14);
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
                get_store().remove_attribute(PURPOSE$14);
            }
        }
        
        /**
         * Gets the "targetHeight" attribute
         */
        public double getTargetHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETHEIGHT$16);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "targetHeight" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetTargetHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TARGETHEIGHT$16);
                return target;
            }
        }
        
        /**
         * True if has "targetHeight" attribute
         */
        public boolean isSetTargetHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TARGETHEIGHT$16) != null;
            }
        }
        
        /**
         * Sets the "targetHeight" attribute
         */
        public void setTargetHeight(double targetHeight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETHEIGHT$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETHEIGHT$16);
                }
                target.setDoubleValue(targetHeight);
            }
        }
        
        /**
         * Sets (as xml) the "targetHeight" attribute
         */
        public void xsetTargetHeight(org.apache.xmlbeans.XmlDouble targetHeight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TARGETHEIGHT$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TARGETHEIGHT$16);
                }
                target.set(targetHeight);
            }
        }
        
        /**
         * Unsets the "targetHeight" attribute
         */
        public void unsetTargetHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TARGETHEIGHT$16);
            }
        }
        
        /**
         * Gets the "horizAngle" attribute
         */
        public double getHorizAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZANGLE$18);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "horizAngle" attribute
         */
        public org.landxml.schema.landXML11.Angle xgetHorizAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Angle target = null;
                target = (org.landxml.schema.landXML11.Angle)get_store().find_attribute_user(HORIZANGLE$18);
                return target;
            }
        }
        
        /**
         * True if has "horizAngle" attribute
         */
        public boolean isSetHorizAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HORIZANGLE$18) != null;
            }
        }
        
        /**
         * Sets the "horizAngle" attribute
         */
        public void setHorizAngle(double horizAngle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZANGLE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORIZANGLE$18);
                }
                target.setDoubleValue(horizAngle);
            }
        }
        
        /**
         * Sets (as xml) the "horizAngle" attribute
         */
        public void xsetHorizAngle(org.landxml.schema.landXML11.Angle horizAngle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Angle target = null;
                target = (org.landxml.schema.landXML11.Angle)get_store().find_attribute_user(HORIZANGLE$18);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Angle)get_store().add_attribute_user(HORIZANGLE$18);
                }
                target.set(horizAngle);
            }
        }
        
        /**
         * Unsets the "horizAngle" attribute
         */
        public void unsetHorizAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HORIZANGLE$18);
            }
        }
        
        /**
         * Gets the "slopeDistance" attribute
         */
        public double getSlopeDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SLOPEDISTANCE$20);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "slopeDistance" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSlopeDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SLOPEDISTANCE$20);
                return target;
            }
        }
        
        /**
         * True if has "slopeDistance" attribute
         */
        public boolean isSetSlopeDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SLOPEDISTANCE$20) != null;
            }
        }
        
        /**
         * Sets the "slopeDistance" attribute
         */
        public void setSlopeDistance(double slopeDistance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SLOPEDISTANCE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SLOPEDISTANCE$20);
                }
                target.setDoubleValue(slopeDistance);
            }
        }
        
        /**
         * Sets (as xml) the "slopeDistance" attribute
         */
        public void xsetSlopeDistance(org.apache.xmlbeans.XmlDouble slopeDistance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SLOPEDISTANCE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SLOPEDISTANCE$20);
                }
                target.set(slopeDistance);
            }
        }
        
        /**
         * Unsets the "slopeDistance" attribute
         */
        public void unsetSlopeDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SLOPEDISTANCE$20);
            }
        }
        
        /**
         * Gets the "zenithAngle" attribute
         */
        public double getZenithAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZENITHANGLE$22);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "zenithAngle" attribute
         */
        public org.landxml.schema.landXML11.ZenithAngle xgetZenithAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZenithAngle target = null;
                target = (org.landxml.schema.landXML11.ZenithAngle)get_store().find_attribute_user(ZENITHANGLE$22);
                return target;
            }
        }
        
        /**
         * True if has "zenithAngle" attribute
         */
        public boolean isSetZenithAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ZENITHANGLE$22) != null;
            }
        }
        
        /**
         * Sets the "zenithAngle" attribute
         */
        public void setZenithAngle(double zenithAngle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZENITHANGLE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZENITHANGLE$22);
                }
                target.setDoubleValue(zenithAngle);
            }
        }
        
        /**
         * Sets (as xml) the "zenithAngle" attribute
         */
        public void xsetZenithAngle(org.landxml.schema.landXML11.ZenithAngle zenithAngle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZenithAngle target = null;
                target = (org.landxml.schema.landXML11.ZenithAngle)get_store().find_attribute_user(ZENITHANGLE$22);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ZenithAngle)get_store().add_attribute_user(ZENITHANGLE$22);
                }
                target.set(zenithAngle);
            }
        }
        
        /**
         * Unsets the "zenithAngle" attribute
         */
        public void unsetZenithAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ZENITHANGLE$22);
            }
        }
        
        /**
         * Gets the "horizDistance" attribute
         */
        public double getHorizDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZDISTANCE$24);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "horizDistance" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetHorizDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HORIZDISTANCE$24);
                return target;
            }
        }
        
        /**
         * True if has "horizDistance" attribute
         */
        public boolean isSetHorizDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HORIZDISTANCE$24) != null;
            }
        }
        
        /**
         * Sets the "horizDistance" attribute
         */
        public void setHorizDistance(double horizDistance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZDISTANCE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORIZDISTANCE$24);
                }
                target.setDoubleValue(horizDistance);
            }
        }
        
        /**
         * Sets (as xml) the "horizDistance" attribute
         */
        public void xsetHorizDistance(org.apache.xmlbeans.XmlDouble horizDistance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HORIZDISTANCE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(HORIZDISTANCE$24);
                }
                target.set(horizDistance);
            }
        }
        
        /**
         * Unsets the "horizDistance" attribute
         */
        public void unsetHorizDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HORIZDISTANCE$24);
            }
        }
        
        /**
         * Gets the "vertDistance" attribute
         */
        public double getVertDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTDISTANCE$26);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "vertDistance" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetVertDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VERTDISTANCE$26);
                return target;
            }
        }
        
        /**
         * True if has "vertDistance" attribute
         */
        public boolean isSetVertDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VERTDISTANCE$26) != null;
            }
        }
        
        /**
         * Sets the "vertDistance" attribute
         */
        public void setVertDistance(double vertDistance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTDISTANCE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTDISTANCE$26);
                }
                target.setDoubleValue(vertDistance);
            }
        }
        
        /**
         * Sets (as xml) the "vertDistance" attribute
         */
        public void xsetVertDistance(org.apache.xmlbeans.XmlDouble vertDistance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VERTDISTANCE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VERTDISTANCE$26);
                }
                target.set(vertDistance);
            }
        }
        
        /**
         * Unsets the "vertDistance" attribute
         */
        public void unsetVertDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VERTDISTANCE$26);
            }
        }
        
        /**
         * Gets the "azimuth" attribute
         */
        public double getAzimuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AZIMUTH$28);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "azimuth" attribute
         */
        public org.landxml.schema.landXML11.Direction xgetAzimuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Direction target = null;
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(AZIMUTH$28);
                return target;
            }
        }
        
        /**
         * True if has "azimuth" attribute
         */
        public boolean isSetAzimuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AZIMUTH$28) != null;
            }
        }
        
        /**
         * Sets the "azimuth" attribute
         */
        public void setAzimuth(double azimuth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AZIMUTH$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AZIMUTH$28);
                }
                target.setDoubleValue(azimuth);
            }
        }
        
        /**
         * Sets (as xml) the "azimuth" attribute
         */
        public void xsetAzimuth(org.landxml.schema.landXML11.Direction azimuth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Direction target = null;
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(AZIMUTH$28);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Direction)get_store().add_attribute_user(AZIMUTH$28);
                }
                target.set(azimuth);
            }
        }
        
        /**
         * Unsets the "azimuth" attribute
         */
        public void unsetAzimuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AZIMUTH$28);
            }
        }
        
        /**
         * Gets the "unused" attribute
         */
        public boolean getUnused()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNUSED$30);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "unused" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetUnused()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UNUSED$30);
                return target;
            }
        }
        
        /**
         * True if has "unused" attribute
         */
        public boolean isSetUnused()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(UNUSED$30) != null;
            }
        }
        
        /**
         * Sets the "unused" attribute
         */
        public void setUnused(boolean unused)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNUSED$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNUSED$30);
                }
                target.setBooleanValue(unused);
            }
        }
        
        /**
         * Sets (as xml) the "unused" attribute
         */
        public void xsetUnused(org.apache.xmlbeans.XmlBoolean unused)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UNUSED$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(UNUSED$30);
                }
                target.set(unused);
            }
        }
        
        /**
         * Unsets the "unused" attribute
         */
        public void unsetUnused()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(UNUSED$30);
            }
        }
        
        /**
         * Gets the "directFace" attribute
         */
        public boolean getDirectFace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTFACE$32);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "directFace" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetDirectFace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DIRECTFACE$32);
                return target;
            }
        }
        
        /**
         * True if has "directFace" attribute
         */
        public boolean isSetDirectFace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DIRECTFACE$32) != null;
            }
        }
        
        /**
         * Sets the "directFace" attribute
         */
        public void setDirectFace(boolean directFace)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTFACE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIRECTFACE$32);
                }
                target.setBooleanValue(directFace);
            }
        }
        
        /**
         * Sets (as xml) the "directFace" attribute
         */
        public void xsetDirectFace(org.apache.xmlbeans.XmlBoolean directFace)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DIRECTFACE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DIRECTFACE$32);
                }
                target.set(directFace);
            }
        }
        
        /**
         * Unsets the "directFace" attribute
         */
        public void unsetDirectFace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DIRECTFACE$32);
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
        
        /**
         * Gets the "timeStamp" attribute
         */
        public java.util.Calendar getTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$36);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "timeStamp" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$36);
                return target;
            }
        }
        
        /**
         * True if has "timeStamp" attribute
         */
        public boolean isSetTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TIMESTAMP$36) != null;
            }
        }
        
        /**
         * Sets the "timeStamp" attribute
         */
        public void setTimeStamp(java.util.Calendar timeStamp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESTAMP$36);
                }
                target.setCalendarValue(timeStamp);
            }
        }
        
        /**
         * Sets (as xml) the "timeStamp" attribute
         */
        public void xsetTimeStamp(org.apache.xmlbeans.XmlDateTime timeStamp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(TIMESTAMP$36);
                }
                target.set(timeStamp);
            }
        }
        
        /**
         * Unsets the "timeStamp" attribute
         */
        public void unsetTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TIMESTAMP$36);
            }
        }
    }
}
