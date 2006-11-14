/*
 * An XML document type.
 * Localname: ReducedArcObservation
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ReducedArcObservationDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one ReducedArcObservation(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ReducedArcObservationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ReducedArcObservationDocument
{
    
    public ReducedArcObservationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REDUCEDARCOBSERVATION$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ReducedArcObservation");
    
    
    /**
     * Gets the "ReducedArcObservation" element
     */
    public org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation getReducedArcObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation target = null;
            target = (org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation)get_store().find_element_user(REDUCEDARCOBSERVATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReducedArcObservation" element
     */
    public void setReducedArcObservation(org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation reducedArcObservation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation target = null;
            target = (org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation)get_store().find_element_user(REDUCEDARCOBSERVATION$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation)get_store().add_element_user(REDUCEDARCOBSERVATION$0);
            }
            target.set(reducedArcObservation);
        }
    }
    
    /**
     * Appends and returns a new empty "ReducedArcObservation" element
     */
    public org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation addNewReducedArcObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation target = null;
            target = (org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation)get_store().add_element_user(REDUCEDARCOBSERVATION$0);
            return target;
        }
    }
    /**
     * An XML ReducedArcObservation(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class ReducedArcObservationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation
    {
        
        public ReducedArcObservationImpl(org.apache.xmlbeans.SchemaType sType)
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
        private static final javax.xml.namespace.QName PURPOSE$8 = 
            new javax.xml.namespace.QName("", "purpose");
        private static final javax.xml.namespace.QName SETUPID$10 = 
            new javax.xml.namespace.QName("", "setupID");
        private static final javax.xml.namespace.QName TARGETSETUPID$12 = 
            new javax.xml.namespace.QName("", "targetSetupID");
        private static final javax.xml.namespace.QName SETID$14 = 
            new javax.xml.namespace.QName("", "setID");
        private static final javax.xml.namespace.QName CHORDAZIMUTH$16 = 
            new javax.xml.namespace.QName("", "chordAzimuth");
        private static final javax.xml.namespace.QName RADIUS$18 = 
            new javax.xml.namespace.QName("", "radius");
        private static final javax.xml.namespace.QName LENGTH$20 = 
            new javax.xml.namespace.QName("", "length");
        private static final javax.xml.namespace.QName ROT$22 = 
            new javax.xml.namespace.QName("", "rot");
        private static final javax.xml.namespace.QName EQUIPMENTUSED$24 = 
            new javax.xml.namespace.QName("", "equipmentUsed");
        private static final javax.xml.namespace.QName ARCAZIMUTHACCURACY$26 = 
            new javax.xml.namespace.QName("", "arcAzimuthAccuracy");
        private static final javax.xml.namespace.QName ARCLENGTHACCURACY$28 = 
            new javax.xml.namespace.QName("", "arcLengthAccuracy");
        private static final javax.xml.namespace.QName DATE$30 = 
            new javax.xml.namespace.QName("", "date");
        private static final javax.xml.namespace.QName ARCTYPE$32 = 
            new javax.xml.namespace.QName("", "arcType");
        private static final javax.xml.namespace.QName ADOPTEDSURVEY$34 = 
            new javax.xml.namespace.QName("", "adoptedSurvey");
        private static final javax.xml.namespace.QName LENGTHACCCLASS$36 = 
            new javax.xml.namespace.QName("", "lengthAccClass");
        private static final javax.xml.namespace.QName AZIMUTHACCCLASS$38 = 
            new javax.xml.namespace.QName("", "azimuthAccClass");
        private static final javax.xml.namespace.QName AZIMUTHADOPTIONFACTOR$40 = 
            new javax.xml.namespace.QName("", "azimuthAdoptionFactor");
        private static final javax.xml.namespace.QName LENGTHADOPTIONFACTOR$42 = 
            new javax.xml.namespace.QName("", "lengthAdoptionFactor");
        private static final javax.xml.namespace.QName COORDGEOMREFS$44 = 
            new javax.xml.namespace.QName("", "coordGeomRefs");
        private static final javax.xml.namespace.QName NAME$46 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESC$48 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName STATE$50 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName OID$52 = 
            new javax.xml.namespace.QName("", "oID");
        
        
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
         * True if has "TargetPoint" element
         */
        public boolean isSetTargetPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TARGETPOINT$0) != 0;
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
         * Unsets the "TargetPoint" element
         */
        public void unsetTargetPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TARGETPOINT$0, 0);
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
                    { return ReducedArcObservationImpl.this.getFieldNoteArray(i); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote set(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = ReducedArcObservationImpl.this.getFieldNoteArray(i);
                    ReducedArcObservationImpl.this.setFieldNoteArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                    { ReducedArcObservationImpl.this.insertNewFieldNote(i).set(o); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote remove(int i)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = ReducedArcObservationImpl.this.getFieldNoteArray(i);
                    ReducedArcObservationImpl.this.removeFieldNote(i);
                    return old;
                }
                
                public int size()
                    { return ReducedArcObservationImpl.this.sizeOfFieldNoteArray(); }
                
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
                    { return ReducedArcObservationImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ReducedArcObservationImpl.this.getFeatureArray(i);
                    ReducedArcObservationImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { ReducedArcObservationImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ReducedArcObservationImpl.this.getFeatureArray(i);
                    ReducedArcObservationImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return ReducedArcObservationImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "purpose" attribute
         */
        public org.landxml.schema.landXML11.PurposeType.Enum getPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PURPOSE$8);
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
                target = (org.landxml.schema.landXML11.PurposeType)get_store().find_attribute_user(PURPOSE$8);
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
                return get_store().find_attribute_user(PURPOSE$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PURPOSE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PURPOSE$8);
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
                target = (org.landxml.schema.landXML11.PurposeType)get_store().find_attribute_user(PURPOSE$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PurposeType)get_store().add_attribute_user(PURPOSE$8);
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
                get_store().remove_attribute(PURPOSE$8);
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
         * Gets the "targetSetupID" attribute
         */
        public java.lang.String getTargetSetupID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETSETUPID$12);
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
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(TARGETSETUPID$12);
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
                return get_store().find_attribute_user(TARGETSETUPID$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETSETUPID$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETSETUPID$12);
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
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(TARGETSETUPID$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(TARGETSETUPID$12);
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
                get_store().remove_attribute(TARGETSETUPID$12);
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
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(SETID$14);
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
                return get_store().find_attribute_user(SETID$14) != null;
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
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(SETID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(SETID$14);
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
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(SETID$14);
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
                get_store().remove_attribute(SETID$14);
            }
        }
        
        /**
         * Gets the "chordAzimuth" attribute
         */
        public double getChordAzimuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHORDAZIMUTH$16);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "chordAzimuth" attribute
         */
        public org.landxml.schema.landXML11.Direction xgetChordAzimuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Direction target = null;
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(CHORDAZIMUTH$16);
                return target;
            }
        }
        
        /**
         * Sets the "chordAzimuth" attribute
         */
        public void setChordAzimuth(double chordAzimuth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHORDAZIMUTH$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHORDAZIMUTH$16);
                }
                target.setDoubleValue(chordAzimuth);
            }
        }
        
        /**
         * Sets (as xml) the "chordAzimuth" attribute
         */
        public void xsetChordAzimuth(org.landxml.schema.landXML11.Direction chordAzimuth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Direction target = null;
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(CHORDAZIMUTH$16);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Direction)get_store().add_attribute_user(CHORDAZIMUTH$16);
                }
                target.set(chordAzimuth);
            }
        }
        
        /**
         * Gets the "radius" attribute
         */
        public double getRadius()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RADIUS$18);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "radius" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetRadius()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RADIUS$18);
                return target;
            }
        }
        
        /**
         * Sets the "radius" attribute
         */
        public void setRadius(double radius)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RADIUS$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RADIUS$18);
                }
                target.setDoubleValue(radius);
            }
        }
        
        /**
         * Sets (as xml) the "radius" attribute
         */
        public void xsetRadius(org.apache.xmlbeans.XmlDouble radius)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RADIUS$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RADIUS$18);
                }
                target.set(radius);
            }
        }
        
        /**
         * Gets the "length" attribute
         */
        public double getLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$20);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "length" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTH$20);
                return target;
            }
        }
        
        /**
         * Sets the "length" attribute
         */
        public void setLength(double length)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LENGTH$20);
                }
                target.setDoubleValue(length);
            }
        }
        
        /**
         * Sets (as xml) the "length" attribute
         */
        public void xsetLength(org.apache.xmlbeans.XmlDouble length)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTH$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LENGTH$20);
                }
                target.set(length);
            }
        }
        
        /**
         * Gets the "rot" attribute
         */
        public org.landxml.schema.landXML11.Clockwise.Enum getRot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROT$22);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.Clockwise.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "rot" attribute
         */
        public org.landxml.schema.landXML11.Clockwise xgetRot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Clockwise target = null;
                target = (org.landxml.schema.landXML11.Clockwise)get_store().find_attribute_user(ROT$22);
                return target;
            }
        }
        
        /**
         * Sets the "rot" attribute
         */
        public void setRot(org.landxml.schema.landXML11.Clockwise.Enum rot)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROT$22);
                }
                target.setEnumValue(rot);
            }
        }
        
        /**
         * Sets (as xml) the "rot" attribute
         */
        public void xsetRot(org.landxml.schema.landXML11.Clockwise rot)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Clockwise target = null;
                target = (org.landxml.schema.landXML11.Clockwise)get_store().find_attribute_user(ROT$22);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Clockwise)get_store().add_attribute_user(ROT$22);
                }
                target.set(rot);
            }
        }
        
        /**
         * Gets the "equipmentUsed" attribute
         */
        public java.lang.String getEquipmentUsed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EQUIPMENTUSED$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "equipmentUsed" attribute
         */
        public org.landxml.schema.landXML11.EquipmentType xgetEquipmentUsed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.EquipmentType target = null;
                target = (org.landxml.schema.landXML11.EquipmentType)get_store().find_attribute_user(EQUIPMENTUSED$24);
                return target;
            }
        }
        
        /**
         * True if has "equipmentUsed" attribute
         */
        public boolean isSetEquipmentUsed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EQUIPMENTUSED$24) != null;
            }
        }
        
        /**
         * Sets the "equipmentUsed" attribute
         */
        public void setEquipmentUsed(java.lang.String equipmentUsed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EQUIPMENTUSED$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EQUIPMENTUSED$24);
                }
                target.setStringValue(equipmentUsed);
            }
        }
        
        /**
         * Sets (as xml) the "equipmentUsed" attribute
         */
        public void xsetEquipmentUsed(org.landxml.schema.landXML11.EquipmentType equipmentUsed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.EquipmentType target = null;
                target = (org.landxml.schema.landXML11.EquipmentType)get_store().find_attribute_user(EQUIPMENTUSED$24);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.EquipmentType)get_store().add_attribute_user(EQUIPMENTUSED$24);
                }
                target.set(equipmentUsed);
            }
        }
        
        /**
         * Unsets the "equipmentUsed" attribute
         */
        public void unsetEquipmentUsed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EQUIPMENTUSED$24);
            }
        }
        
        /**
         * Gets the "arcAzimuthAccuracy" attribute
         */
        public double getArcAzimuthAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARCAZIMUTHACCURACY$26);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "arcAzimuthAccuracy" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetArcAzimuthAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ARCAZIMUTHACCURACY$26);
                return target;
            }
        }
        
        /**
         * True if has "arcAzimuthAccuracy" attribute
         */
        public boolean isSetArcAzimuthAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ARCAZIMUTHACCURACY$26) != null;
            }
        }
        
        /**
         * Sets the "arcAzimuthAccuracy" attribute
         */
        public void setArcAzimuthAccuracy(double arcAzimuthAccuracy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARCAZIMUTHACCURACY$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARCAZIMUTHACCURACY$26);
                }
                target.setDoubleValue(arcAzimuthAccuracy);
            }
        }
        
        /**
         * Sets (as xml) the "arcAzimuthAccuracy" attribute
         */
        public void xsetArcAzimuthAccuracy(org.apache.xmlbeans.XmlDouble arcAzimuthAccuracy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ARCAZIMUTHACCURACY$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ARCAZIMUTHACCURACY$26);
                }
                target.set(arcAzimuthAccuracy);
            }
        }
        
        /**
         * Unsets the "arcAzimuthAccuracy" attribute
         */
        public void unsetArcAzimuthAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ARCAZIMUTHACCURACY$26);
            }
        }
        
        /**
         * Gets the "arcLengthAccuracy" attribute
         */
        public double getArcLengthAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARCLENGTHACCURACY$28);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "arcLengthAccuracy" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetArcLengthAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ARCLENGTHACCURACY$28);
                return target;
            }
        }
        
        /**
         * True if has "arcLengthAccuracy" attribute
         */
        public boolean isSetArcLengthAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ARCLENGTHACCURACY$28) != null;
            }
        }
        
        /**
         * Sets the "arcLengthAccuracy" attribute
         */
        public void setArcLengthAccuracy(double arcLengthAccuracy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARCLENGTHACCURACY$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARCLENGTHACCURACY$28);
                }
                target.setDoubleValue(arcLengthAccuracy);
            }
        }
        
        /**
         * Sets (as xml) the "arcLengthAccuracy" attribute
         */
        public void xsetArcLengthAccuracy(org.apache.xmlbeans.XmlDouble arcLengthAccuracy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ARCLENGTHACCURACY$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ARCLENGTHACCURACY$28);
                }
                target.set(arcLengthAccuracy);
            }
        }
        
        /**
         * Unsets the "arcLengthAccuracy" attribute
         */
        public void unsetArcLengthAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ARCLENGTHACCURACY$28);
            }
        }
        
        /**
         * Gets the "date" attribute
         */
        public java.util.Calendar getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$30);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "date" attribute
         */
        public org.apache.xmlbeans.XmlDate xgetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(DATE$30);
                return target;
            }
        }
        
        /**
         * True if has "date" attribute
         */
        public boolean isSetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DATE$30) != null;
            }
        }
        
        /**
         * Sets the "date" attribute
         */
        public void setDate(java.util.Calendar date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATE$30);
                }
                target.setCalendarValue(date);
            }
        }
        
        /**
         * Sets (as xml) the "date" attribute
         */
        public void xsetDate(org.apache.xmlbeans.XmlDate date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(DATE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(DATE$30);
                }
                target.set(date);
            }
        }
        
        /**
         * Unsets the "date" attribute
         */
        public void unsetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DATE$30);
            }
        }
        
        /**
         * Gets the "arcType" attribute
         */
        public java.lang.String getArcType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARCTYPE$32);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "arcType" attribute
         */
        public org.apache.xmlbeans.XmlString xgetArcType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ARCTYPE$32);
                return target;
            }
        }
        
        /**
         * True if has "arcType" attribute
         */
        public boolean isSetArcType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ARCTYPE$32) != null;
            }
        }
        
        /**
         * Sets the "arcType" attribute
         */
        public void setArcType(java.lang.String arcType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARCTYPE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARCTYPE$32);
                }
                target.setStringValue(arcType);
            }
        }
        
        /**
         * Sets (as xml) the "arcType" attribute
         */
        public void xsetArcType(org.apache.xmlbeans.XmlString arcType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ARCTYPE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ARCTYPE$32);
                }
                target.set(arcType);
            }
        }
        
        /**
         * Unsets the "arcType" attribute
         */
        public void unsetArcType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ARCTYPE$32);
            }
        }
        
        /**
         * Gets the "adoptedSurvey" attribute
         */
        public java.lang.String getAdoptedSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADOPTEDSURVEY$34);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "adoptedSurvey" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAdoptedSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADOPTEDSURVEY$34);
                return target;
            }
        }
        
        /**
         * True if has "adoptedSurvey" attribute
         */
        public boolean isSetAdoptedSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ADOPTEDSURVEY$34) != null;
            }
        }
        
        /**
         * Sets the "adoptedSurvey" attribute
         */
        public void setAdoptedSurvey(java.lang.String adoptedSurvey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADOPTEDSURVEY$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADOPTEDSURVEY$34);
                }
                target.setStringValue(adoptedSurvey);
            }
        }
        
        /**
         * Sets (as xml) the "adoptedSurvey" attribute
         */
        public void xsetAdoptedSurvey(org.apache.xmlbeans.XmlString adoptedSurvey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADOPTEDSURVEY$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADOPTEDSURVEY$34);
                }
                target.set(adoptedSurvey);
            }
        }
        
        /**
         * Unsets the "adoptedSurvey" attribute
         */
        public void unsetAdoptedSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ADOPTEDSURVEY$34);
            }
        }
        
        /**
         * Gets the "lengthAccClass" attribute
         */
        public java.lang.String getLengthAccClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTHACCCLASS$36);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lengthAccClass" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLengthAccClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LENGTHACCCLASS$36);
                return target;
            }
        }
        
        /**
         * True if has "lengthAccClass" attribute
         */
        public boolean isSetLengthAccClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LENGTHACCCLASS$36) != null;
            }
        }
        
        /**
         * Sets the "lengthAccClass" attribute
         */
        public void setLengthAccClass(java.lang.String lengthAccClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTHACCCLASS$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LENGTHACCCLASS$36);
                }
                target.setStringValue(lengthAccClass);
            }
        }
        
        /**
         * Sets (as xml) the "lengthAccClass" attribute
         */
        public void xsetLengthAccClass(org.apache.xmlbeans.XmlString lengthAccClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LENGTHACCCLASS$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LENGTHACCCLASS$36);
                }
                target.set(lengthAccClass);
            }
        }
        
        /**
         * Unsets the "lengthAccClass" attribute
         */
        public void unsetLengthAccClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LENGTHACCCLASS$36);
            }
        }
        
        /**
         * Gets the "azimuthAccClass" attribute
         */
        public java.lang.String getAzimuthAccClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AZIMUTHACCCLASS$38);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "azimuthAccClass" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAzimuthAccClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AZIMUTHACCCLASS$38);
                return target;
            }
        }
        
        /**
         * True if has "azimuthAccClass" attribute
         */
        public boolean isSetAzimuthAccClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AZIMUTHACCCLASS$38) != null;
            }
        }
        
        /**
         * Sets the "azimuthAccClass" attribute
         */
        public void setAzimuthAccClass(java.lang.String azimuthAccClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AZIMUTHACCCLASS$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AZIMUTHACCCLASS$38);
                }
                target.setStringValue(azimuthAccClass);
            }
        }
        
        /**
         * Sets (as xml) the "azimuthAccClass" attribute
         */
        public void xsetAzimuthAccClass(org.apache.xmlbeans.XmlString azimuthAccClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AZIMUTHACCCLASS$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AZIMUTHACCCLASS$38);
                }
                target.set(azimuthAccClass);
            }
        }
        
        /**
         * Unsets the "azimuthAccClass" attribute
         */
        public void unsetAzimuthAccClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AZIMUTHACCCLASS$38);
            }
        }
        
        /**
         * Gets the "azimuthAdoptionFactor" attribute
         */
        public double getAzimuthAdoptionFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AZIMUTHADOPTIONFACTOR$40);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "azimuthAdoptionFactor" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetAzimuthAdoptionFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AZIMUTHADOPTIONFACTOR$40);
                return target;
            }
        }
        
        /**
         * True if has "azimuthAdoptionFactor" attribute
         */
        public boolean isSetAzimuthAdoptionFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AZIMUTHADOPTIONFACTOR$40) != null;
            }
        }
        
        /**
         * Sets the "azimuthAdoptionFactor" attribute
         */
        public void setAzimuthAdoptionFactor(double azimuthAdoptionFactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AZIMUTHADOPTIONFACTOR$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AZIMUTHADOPTIONFACTOR$40);
                }
                target.setDoubleValue(azimuthAdoptionFactor);
            }
        }
        
        /**
         * Sets (as xml) the "azimuthAdoptionFactor" attribute
         */
        public void xsetAzimuthAdoptionFactor(org.apache.xmlbeans.XmlDouble azimuthAdoptionFactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AZIMUTHADOPTIONFACTOR$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(AZIMUTHADOPTIONFACTOR$40);
                }
                target.set(azimuthAdoptionFactor);
            }
        }
        
        /**
         * Unsets the "azimuthAdoptionFactor" attribute
         */
        public void unsetAzimuthAdoptionFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AZIMUTHADOPTIONFACTOR$40);
            }
        }
        
        /**
         * Gets the "lengthAdoptionFactor" attribute
         */
        public double getLengthAdoptionFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTHADOPTIONFACTOR$42);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "lengthAdoptionFactor" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetLengthAdoptionFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTHADOPTIONFACTOR$42);
                return target;
            }
        }
        
        /**
         * True if has "lengthAdoptionFactor" attribute
         */
        public boolean isSetLengthAdoptionFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LENGTHADOPTIONFACTOR$42) != null;
            }
        }
        
        /**
         * Sets the "lengthAdoptionFactor" attribute
         */
        public void setLengthAdoptionFactor(double lengthAdoptionFactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTHADOPTIONFACTOR$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LENGTHADOPTIONFACTOR$42);
                }
                target.setDoubleValue(lengthAdoptionFactor);
            }
        }
        
        /**
         * Sets (as xml) the "lengthAdoptionFactor" attribute
         */
        public void xsetLengthAdoptionFactor(org.apache.xmlbeans.XmlDouble lengthAdoptionFactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTHADOPTIONFACTOR$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LENGTHADOPTIONFACTOR$42);
                }
                target.set(lengthAdoptionFactor);
            }
        }
        
        /**
         * Unsets the "lengthAdoptionFactor" attribute
         */
        public void unsetLengthAdoptionFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LENGTHADOPTIONFACTOR$42);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COORDGEOMREFS$44);
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
                target = (org.landxml.schema.landXML11.CoordGeomNameRefs)get_store().find_attribute_user(COORDGEOMREFS$44);
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
                return get_store().find_attribute_user(COORDGEOMREFS$44) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COORDGEOMREFS$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COORDGEOMREFS$44);
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
                target = (org.landxml.schema.landXML11.CoordGeomNameRefs)get_store().find_attribute_user(COORDGEOMREFS$44);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CoordGeomNameRefs)get_store().add_attribute_user(COORDGEOMREFS$44);
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
                get_store().remove_attribute(COORDGEOMREFS$44);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$46);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$46);
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
                return get_store().find_attribute_user(NAME$46) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$46);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$46);
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
                get_store().remove_attribute(NAME$46);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$48);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$48);
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
                return get_store().find_attribute_user(DESC$48) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$48);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$48);
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
                get_store().remove_attribute(DESC$48);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$50);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$50);
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
                return get_store().find_attribute_user(STATE$50) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$50);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$50);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$50);
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
                get_store().remove_attribute(STATE$50);
            }
        }
        
        /**
         * Gets the "oID" attribute
         */
        public java.lang.String getOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$52);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "oID" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$52);
                return target;
            }
        }
        
        /**
         * True if has "oID" attribute
         */
        public boolean isSetOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OID$52) != null;
            }
        }
        
        /**
         * Sets the "oID" attribute
         */
        public void setOID(java.lang.String oid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OID$52);
                }
                target.setStringValue(oid);
            }
        }
        
        /**
         * Sets (as xml) the "oID" attribute
         */
        public void xsetOID(org.apache.xmlbeans.XmlString oid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OID$52);
                }
                target.set(oid);
            }
        }
        
        /**
         * Unsets the "oID" attribute
         */
        public void unsetOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OID$52);
            }
        }
    }
}
