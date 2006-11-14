/*
 * An XML document type.
 * Localname: ReducedObservation
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ReducedObservationDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one ReducedObservation(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ReducedObservationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ReducedObservationDocument
{
    
    public ReducedObservationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REDUCEDOBSERVATION$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ReducedObservation");
    
    
    /**
     * Gets the "ReducedObservation" element
     */
    public org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation getReducedObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation target = null;
            target = (org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation)get_store().find_element_user(REDUCEDOBSERVATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReducedObservation" element
     */
    public void setReducedObservation(org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation reducedObservation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation target = null;
            target = (org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation)get_store().find_element_user(REDUCEDOBSERVATION$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation)get_store().add_element_user(REDUCEDOBSERVATION$0);
            }
            target.set(reducedObservation);
        }
    }
    
    /**
     * Appends and returns a new empty "ReducedObservation" element
     */
    public org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation addNewReducedObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation target = null;
            target = (org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation)get_store().add_element_user(REDUCEDOBSERVATION$0);
            return target;
        }
    }
    /**
     * An XML ReducedObservation(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class ReducedObservationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation
    {
        
        public ReducedObservationImpl(org.apache.xmlbeans.SchemaType sType)
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
        private static final javax.xml.namespace.QName TARGETHEIGHT$16 = 
            new javax.xml.namespace.QName("", "targetHeight");
        private static final javax.xml.namespace.QName AZIMUTH$18 = 
            new javax.xml.namespace.QName("", "azimuth");
        private static final javax.xml.namespace.QName HORIZDISTANCE$20 = 
            new javax.xml.namespace.QName("", "horizDistance");
        private static final javax.xml.namespace.QName VERTDISTANCE$22 = 
            new javax.xml.namespace.QName("", "vertDistance");
        private static final javax.xml.namespace.QName HORIZANGLE$24 = 
            new javax.xml.namespace.QName("", "horizAngle");
        private static final javax.xml.namespace.QName SLOPEDISTANCE$26 = 
            new javax.xml.namespace.QName("", "slopeDistance");
        private static final javax.xml.namespace.QName ZENITHANGLE$28 = 
            new javax.xml.namespace.QName("", "zenithAngle");
        private static final javax.xml.namespace.QName EQUIPMENTUSED$30 = 
            new javax.xml.namespace.QName("", "equipmentUsed");
        private static final javax.xml.namespace.QName AZIMUTHACCURACY$32 = 
            new javax.xml.namespace.QName("", "azimuthAccuracy");
        private static final javax.xml.namespace.QName DISTANCEACCURACY$34 = 
            new javax.xml.namespace.QName("", "distanceAccuracy");
        private static final javax.xml.namespace.QName DATE$36 = 
            new javax.xml.namespace.QName("", "date");
        private static final javax.xml.namespace.QName DISTANCETYPE$38 = 
            new javax.xml.namespace.QName("", "distanceType");
        private static final javax.xml.namespace.QName AZIMUTHTYPE$40 = 
            new javax.xml.namespace.QName("", "azimuthType");
        private static final javax.xml.namespace.QName ADOPTEDAZIMUTHSURVEY$42 = 
            new javax.xml.namespace.QName("", "adoptedAzimuthSurvey");
        private static final javax.xml.namespace.QName ADOPTEDDISTANCESURVEY$44 = 
            new javax.xml.namespace.QName("", "adoptedDistanceSurvey");
        private static final javax.xml.namespace.QName DISTANCEACCCLASS$46 = 
            new javax.xml.namespace.QName("", "distanceAccClass");
        private static final javax.xml.namespace.QName AZIMUTHACCCLASS$48 = 
            new javax.xml.namespace.QName("", "azimuthAccClass");
        private static final javax.xml.namespace.QName AZIMUTHADOPTIONFACTOR$50 = 
            new javax.xml.namespace.QName("", "azimuthAdoptionFactor");
        private static final javax.xml.namespace.QName DISTANCEADOPTIONFACTOR$52 = 
            new javax.xml.namespace.QName("", "distanceAdoptionFactor");
        private static final javax.xml.namespace.QName COORDGEOMREFS$54 = 
            new javax.xml.namespace.QName("", "coordGeomRefs");
        private static final javax.xml.namespace.QName NAME$56 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESC$58 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName STATE$60 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName OID$62 = 
            new javax.xml.namespace.QName("", "oID");
        private static final javax.xml.namespace.QName MSLDISTANCE$64 = 
            new javax.xml.namespace.QName("", "MSLDistance");
        private static final javax.xml.namespace.QName SPHERDISTANCE$66 = 
            new javax.xml.namespace.QName("", "spherDistance");
        
        
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
                    { return ReducedObservationImpl.this.getFieldNoteArray(i); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote set(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = ReducedObservationImpl.this.getFieldNoteArray(i);
                    ReducedObservationImpl.this.setFieldNoteArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                    { ReducedObservationImpl.this.insertNewFieldNote(i).set(o); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote remove(int i)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = ReducedObservationImpl.this.getFieldNoteArray(i);
                    ReducedObservationImpl.this.removeFieldNote(i);
                    return old;
                }
                
                public int size()
                    { return ReducedObservationImpl.this.sizeOfFieldNoteArray(); }
                
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
                    { return ReducedObservationImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ReducedObservationImpl.this.getFeatureArray(i);
                    ReducedObservationImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { ReducedObservationImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ReducedObservationImpl.this.getFeatureArray(i);
                    ReducedObservationImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return ReducedObservationImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "azimuth" attribute
         */
        public double getAzimuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AZIMUTH$18);
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
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(AZIMUTH$18);
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
                return get_store().find_attribute_user(AZIMUTH$18) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AZIMUTH$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AZIMUTH$18);
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
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(AZIMUTH$18);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Direction)get_store().add_attribute_user(AZIMUTH$18);
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
                get_store().remove_attribute(AZIMUTH$18);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZDISTANCE$20);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HORIZDISTANCE$20);
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
                return get_store().find_attribute_user(HORIZDISTANCE$20) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZDISTANCE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORIZDISTANCE$20);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HORIZDISTANCE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(HORIZDISTANCE$20);
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
                get_store().remove_attribute(HORIZDISTANCE$20);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTDISTANCE$22);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VERTDISTANCE$22);
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
                return get_store().find_attribute_user(VERTDISTANCE$22) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTDISTANCE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTDISTANCE$22);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VERTDISTANCE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VERTDISTANCE$22);
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
                get_store().remove_attribute(VERTDISTANCE$22);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZANGLE$24);
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
                target = (org.landxml.schema.landXML11.Angle)get_store().find_attribute_user(HORIZANGLE$24);
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
                return get_store().find_attribute_user(HORIZANGLE$24) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZANGLE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORIZANGLE$24);
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
                target = (org.landxml.schema.landXML11.Angle)get_store().find_attribute_user(HORIZANGLE$24);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Angle)get_store().add_attribute_user(HORIZANGLE$24);
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
                get_store().remove_attribute(HORIZANGLE$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SLOPEDISTANCE$26);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SLOPEDISTANCE$26);
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
                return get_store().find_attribute_user(SLOPEDISTANCE$26) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SLOPEDISTANCE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SLOPEDISTANCE$26);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SLOPEDISTANCE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SLOPEDISTANCE$26);
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
                get_store().remove_attribute(SLOPEDISTANCE$26);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZENITHANGLE$28);
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
                target = (org.landxml.schema.landXML11.ZenithAngle)get_store().find_attribute_user(ZENITHANGLE$28);
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
                return get_store().find_attribute_user(ZENITHANGLE$28) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZENITHANGLE$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZENITHANGLE$28);
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
                target = (org.landxml.schema.landXML11.ZenithAngle)get_store().find_attribute_user(ZENITHANGLE$28);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ZenithAngle)get_store().add_attribute_user(ZENITHANGLE$28);
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
                get_store().remove_attribute(ZENITHANGLE$28);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EQUIPMENTUSED$30);
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
                target = (org.landxml.schema.landXML11.EquipmentType)get_store().find_attribute_user(EQUIPMENTUSED$30);
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
                return get_store().find_attribute_user(EQUIPMENTUSED$30) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EQUIPMENTUSED$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EQUIPMENTUSED$30);
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
                target = (org.landxml.schema.landXML11.EquipmentType)get_store().find_attribute_user(EQUIPMENTUSED$30);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.EquipmentType)get_store().add_attribute_user(EQUIPMENTUSED$30);
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
                get_store().remove_attribute(EQUIPMENTUSED$30);
            }
        }
        
        /**
         * Gets the "azimuthAccuracy" attribute
         */
        public double getAzimuthAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AZIMUTHACCURACY$32);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "azimuthAccuracy" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetAzimuthAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AZIMUTHACCURACY$32);
                return target;
            }
        }
        
        /**
         * True if has "azimuthAccuracy" attribute
         */
        public boolean isSetAzimuthAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AZIMUTHACCURACY$32) != null;
            }
        }
        
        /**
         * Sets the "azimuthAccuracy" attribute
         */
        public void setAzimuthAccuracy(double azimuthAccuracy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AZIMUTHACCURACY$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AZIMUTHACCURACY$32);
                }
                target.setDoubleValue(azimuthAccuracy);
            }
        }
        
        /**
         * Sets (as xml) the "azimuthAccuracy" attribute
         */
        public void xsetAzimuthAccuracy(org.apache.xmlbeans.XmlDouble azimuthAccuracy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AZIMUTHACCURACY$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(AZIMUTHACCURACY$32);
                }
                target.set(azimuthAccuracy);
            }
        }
        
        /**
         * Unsets the "azimuthAccuracy" attribute
         */
        public void unsetAzimuthAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AZIMUTHACCURACY$32);
            }
        }
        
        /**
         * Gets the "distanceAccuracy" attribute
         */
        public double getDistanceAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCEACCURACY$34);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "distanceAccuracy" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetDistanceAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DISTANCEACCURACY$34);
                return target;
            }
        }
        
        /**
         * True if has "distanceAccuracy" attribute
         */
        public boolean isSetDistanceAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DISTANCEACCURACY$34) != null;
            }
        }
        
        /**
         * Sets the "distanceAccuracy" attribute
         */
        public void setDistanceAccuracy(double distanceAccuracy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCEACCURACY$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTANCEACCURACY$34);
                }
                target.setDoubleValue(distanceAccuracy);
            }
        }
        
        /**
         * Sets (as xml) the "distanceAccuracy" attribute
         */
        public void xsetDistanceAccuracy(org.apache.xmlbeans.XmlDouble distanceAccuracy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DISTANCEACCURACY$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DISTANCEACCURACY$34);
                }
                target.set(distanceAccuracy);
            }
        }
        
        /**
         * Unsets the "distanceAccuracy" attribute
         */
        public void unsetDistanceAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DISTANCEACCURACY$34);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$36);
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
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(DATE$36);
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
                return get_store().find_attribute_user(DATE$36) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATE$36);
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
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(DATE$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(DATE$36);
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
                get_store().remove_attribute(DATE$36);
            }
        }
        
        /**
         * Gets the "distanceType" attribute
         */
        public java.lang.String getDistanceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCETYPE$38);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "distanceType" attribute
         */
        public org.landxml.schema.landXML11.ObservationType xgetDistanceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ObservationType target = null;
                target = (org.landxml.schema.landXML11.ObservationType)get_store().find_attribute_user(DISTANCETYPE$38);
                return target;
            }
        }
        
        /**
         * True if has "distanceType" attribute
         */
        public boolean isSetDistanceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DISTANCETYPE$38) != null;
            }
        }
        
        /**
         * Sets the "distanceType" attribute
         */
        public void setDistanceType(java.lang.String distanceType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCETYPE$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTANCETYPE$38);
                }
                target.setStringValue(distanceType);
            }
        }
        
        /**
         * Sets (as xml) the "distanceType" attribute
         */
        public void xsetDistanceType(org.landxml.schema.landXML11.ObservationType distanceType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ObservationType target = null;
                target = (org.landxml.schema.landXML11.ObservationType)get_store().find_attribute_user(DISTANCETYPE$38);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ObservationType)get_store().add_attribute_user(DISTANCETYPE$38);
                }
                target.set(distanceType);
            }
        }
        
        /**
         * Unsets the "distanceType" attribute
         */
        public void unsetDistanceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DISTANCETYPE$38);
            }
        }
        
        /**
         * Gets the "azimuthType" attribute
         */
        public java.lang.String getAzimuthType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AZIMUTHTYPE$40);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "azimuthType" attribute
         */
        public org.landxml.schema.landXML11.ObservationType xgetAzimuthType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ObservationType target = null;
                target = (org.landxml.schema.landXML11.ObservationType)get_store().find_attribute_user(AZIMUTHTYPE$40);
                return target;
            }
        }
        
        /**
         * True if has "azimuthType" attribute
         */
        public boolean isSetAzimuthType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AZIMUTHTYPE$40) != null;
            }
        }
        
        /**
         * Sets the "azimuthType" attribute
         */
        public void setAzimuthType(java.lang.String azimuthType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AZIMUTHTYPE$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AZIMUTHTYPE$40);
                }
                target.setStringValue(azimuthType);
            }
        }
        
        /**
         * Sets (as xml) the "azimuthType" attribute
         */
        public void xsetAzimuthType(org.landxml.schema.landXML11.ObservationType azimuthType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ObservationType target = null;
                target = (org.landxml.schema.landXML11.ObservationType)get_store().find_attribute_user(AZIMUTHTYPE$40);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ObservationType)get_store().add_attribute_user(AZIMUTHTYPE$40);
                }
                target.set(azimuthType);
            }
        }
        
        /**
         * Unsets the "azimuthType" attribute
         */
        public void unsetAzimuthType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AZIMUTHTYPE$40);
            }
        }
        
        /**
         * Gets the "adoptedAzimuthSurvey" attribute
         */
        public java.lang.String getAdoptedAzimuthSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADOPTEDAZIMUTHSURVEY$42);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "adoptedAzimuthSurvey" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAdoptedAzimuthSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADOPTEDAZIMUTHSURVEY$42);
                return target;
            }
        }
        
        /**
         * True if has "adoptedAzimuthSurvey" attribute
         */
        public boolean isSetAdoptedAzimuthSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ADOPTEDAZIMUTHSURVEY$42) != null;
            }
        }
        
        /**
         * Sets the "adoptedAzimuthSurvey" attribute
         */
        public void setAdoptedAzimuthSurvey(java.lang.String adoptedAzimuthSurvey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADOPTEDAZIMUTHSURVEY$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADOPTEDAZIMUTHSURVEY$42);
                }
                target.setStringValue(adoptedAzimuthSurvey);
            }
        }
        
        /**
         * Sets (as xml) the "adoptedAzimuthSurvey" attribute
         */
        public void xsetAdoptedAzimuthSurvey(org.apache.xmlbeans.XmlString adoptedAzimuthSurvey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADOPTEDAZIMUTHSURVEY$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADOPTEDAZIMUTHSURVEY$42);
                }
                target.set(adoptedAzimuthSurvey);
            }
        }
        
        /**
         * Unsets the "adoptedAzimuthSurvey" attribute
         */
        public void unsetAdoptedAzimuthSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ADOPTEDAZIMUTHSURVEY$42);
            }
        }
        
        /**
         * Gets the "adoptedDistanceSurvey" attribute
         */
        public java.lang.String getAdoptedDistanceSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADOPTEDDISTANCESURVEY$44);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "adoptedDistanceSurvey" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAdoptedDistanceSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADOPTEDDISTANCESURVEY$44);
                return target;
            }
        }
        
        /**
         * True if has "adoptedDistanceSurvey" attribute
         */
        public boolean isSetAdoptedDistanceSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ADOPTEDDISTANCESURVEY$44) != null;
            }
        }
        
        /**
         * Sets the "adoptedDistanceSurvey" attribute
         */
        public void setAdoptedDistanceSurvey(java.lang.String adoptedDistanceSurvey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADOPTEDDISTANCESURVEY$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADOPTEDDISTANCESURVEY$44);
                }
                target.setStringValue(adoptedDistanceSurvey);
            }
        }
        
        /**
         * Sets (as xml) the "adoptedDistanceSurvey" attribute
         */
        public void xsetAdoptedDistanceSurvey(org.apache.xmlbeans.XmlString adoptedDistanceSurvey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADOPTEDDISTANCESURVEY$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADOPTEDDISTANCESURVEY$44);
                }
                target.set(adoptedDistanceSurvey);
            }
        }
        
        /**
         * Unsets the "adoptedDistanceSurvey" attribute
         */
        public void unsetAdoptedDistanceSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ADOPTEDDISTANCESURVEY$44);
            }
        }
        
        /**
         * Gets the "distanceAccClass" attribute
         */
        public java.lang.String getDistanceAccClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCEACCCLASS$46);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "distanceAccClass" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDistanceAccClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISTANCEACCCLASS$46);
                return target;
            }
        }
        
        /**
         * True if has "distanceAccClass" attribute
         */
        public boolean isSetDistanceAccClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DISTANCEACCCLASS$46) != null;
            }
        }
        
        /**
         * Sets the "distanceAccClass" attribute
         */
        public void setDistanceAccClass(java.lang.String distanceAccClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCEACCCLASS$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTANCEACCCLASS$46);
                }
                target.setStringValue(distanceAccClass);
            }
        }
        
        /**
         * Sets (as xml) the "distanceAccClass" attribute
         */
        public void xsetDistanceAccClass(org.apache.xmlbeans.XmlString distanceAccClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISTANCEACCCLASS$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DISTANCEACCCLASS$46);
                }
                target.set(distanceAccClass);
            }
        }
        
        /**
         * Unsets the "distanceAccClass" attribute
         */
        public void unsetDistanceAccClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DISTANCEACCCLASS$46);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AZIMUTHACCCLASS$48);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AZIMUTHACCCLASS$48);
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
                return get_store().find_attribute_user(AZIMUTHACCCLASS$48) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AZIMUTHACCCLASS$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AZIMUTHACCCLASS$48);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AZIMUTHACCCLASS$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AZIMUTHACCCLASS$48);
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
                get_store().remove_attribute(AZIMUTHACCCLASS$48);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AZIMUTHADOPTIONFACTOR$50);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AZIMUTHADOPTIONFACTOR$50);
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
                return get_store().find_attribute_user(AZIMUTHADOPTIONFACTOR$50) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AZIMUTHADOPTIONFACTOR$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AZIMUTHADOPTIONFACTOR$50);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AZIMUTHADOPTIONFACTOR$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(AZIMUTHADOPTIONFACTOR$50);
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
                get_store().remove_attribute(AZIMUTHADOPTIONFACTOR$50);
            }
        }
        
        /**
         * Gets the "distanceAdoptionFactor" attribute
         */
        public double getDistanceAdoptionFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCEADOPTIONFACTOR$52);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "distanceAdoptionFactor" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetDistanceAdoptionFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DISTANCEADOPTIONFACTOR$52);
                return target;
            }
        }
        
        /**
         * True if has "distanceAdoptionFactor" attribute
         */
        public boolean isSetDistanceAdoptionFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DISTANCEADOPTIONFACTOR$52) != null;
            }
        }
        
        /**
         * Sets the "distanceAdoptionFactor" attribute
         */
        public void setDistanceAdoptionFactor(double distanceAdoptionFactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCEADOPTIONFACTOR$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTANCEADOPTIONFACTOR$52);
                }
                target.setDoubleValue(distanceAdoptionFactor);
            }
        }
        
        /**
         * Sets (as xml) the "distanceAdoptionFactor" attribute
         */
        public void xsetDistanceAdoptionFactor(org.apache.xmlbeans.XmlDouble distanceAdoptionFactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DISTANCEADOPTIONFACTOR$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DISTANCEADOPTIONFACTOR$52);
                }
                target.set(distanceAdoptionFactor);
            }
        }
        
        /**
         * Unsets the "distanceAdoptionFactor" attribute
         */
        public void unsetDistanceAdoptionFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DISTANCEADOPTIONFACTOR$52);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COORDGEOMREFS$54);
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
                target = (org.landxml.schema.landXML11.CoordGeomNameRefs)get_store().find_attribute_user(COORDGEOMREFS$54);
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
                return get_store().find_attribute_user(COORDGEOMREFS$54) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COORDGEOMREFS$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COORDGEOMREFS$54);
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
                target = (org.landxml.schema.landXML11.CoordGeomNameRefs)get_store().find_attribute_user(COORDGEOMREFS$54);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CoordGeomNameRefs)get_store().add_attribute_user(COORDGEOMREFS$54);
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
                get_store().remove_attribute(COORDGEOMREFS$54);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$56);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$56);
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
                return get_store().find_attribute_user(NAME$56) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$56);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$56);
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
                get_store().remove_attribute(NAME$56);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$58);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$58);
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
                return get_store().find_attribute_user(DESC$58) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$58);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$58);
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
                get_store().remove_attribute(DESC$58);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$60);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$60);
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
                return get_store().find_attribute_user(STATE$60) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$60);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$60);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$60);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$60);
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
                get_store().remove_attribute(STATE$60);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$62);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$62);
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
                return get_store().find_attribute_user(OID$62) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OID$62);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OID$62);
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
                get_store().remove_attribute(OID$62);
            }
        }
        
        /**
         * Gets the "MSLDistance" attribute
         */
        public java.lang.String getMSLDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MSLDISTANCE$64);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MSLDistance" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMSLDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MSLDISTANCE$64);
                return target;
            }
        }
        
        /**
         * True if has "MSLDistance" attribute
         */
        public boolean isSetMSLDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MSLDISTANCE$64) != null;
            }
        }
        
        /**
         * Sets the "MSLDistance" attribute
         */
        public void setMSLDistance(java.lang.String mslDistance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MSLDISTANCE$64);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MSLDISTANCE$64);
                }
                target.setStringValue(mslDistance);
            }
        }
        
        /**
         * Sets (as xml) the "MSLDistance" attribute
         */
        public void xsetMSLDistance(org.apache.xmlbeans.XmlString mslDistance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MSLDISTANCE$64);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MSLDISTANCE$64);
                }
                target.set(mslDistance);
            }
        }
        
        /**
         * Unsets the "MSLDistance" attribute
         */
        public void unsetMSLDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MSLDISTANCE$64);
            }
        }
        
        /**
         * Gets the "spherDistance" attribute
         */
        public java.lang.String getSpherDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPHERDISTANCE$66);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "spherDistance" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSpherDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SPHERDISTANCE$66);
                return target;
            }
        }
        
        /**
         * True if has "spherDistance" attribute
         */
        public boolean isSetSpherDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SPHERDISTANCE$66) != null;
            }
        }
        
        /**
         * Sets the "spherDistance" attribute
         */
        public void setSpherDistance(java.lang.String spherDistance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPHERDISTANCE$66);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPHERDISTANCE$66);
                }
                target.setStringValue(spherDistance);
            }
        }
        
        /**
         * Sets (as xml) the "spherDistance" attribute
         */
        public void xsetSpherDistance(org.apache.xmlbeans.XmlString spherDistance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SPHERDISTANCE$66);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SPHERDISTANCE$66);
                }
                target.set(spherDistance);
            }
        }
        
        /**
         * Unsets the "spherDistance" attribute
         */
        public void unsetSpherDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SPHERDISTANCE$66);
            }
        }
    }
}
