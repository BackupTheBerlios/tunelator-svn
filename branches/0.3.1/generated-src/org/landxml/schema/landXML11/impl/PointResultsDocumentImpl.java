/*
 * An XML document type.
 * Localname: PointResults
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PointResultsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one PointResults(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class PointResultsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PointResultsDocument
{
    
    public PointResultsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINTRESULTS$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PointResults");
    
    
    /**
     * Gets the "PointResults" element
     */
    public org.landxml.schema.landXML11.PointResultsDocument.PointResults getPointResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointResultsDocument.PointResults target = null;
            target = (org.landxml.schema.landXML11.PointResultsDocument.PointResults)get_store().find_element_user(POINTRESULTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PointResults" element
     */
    public void setPointResults(org.landxml.schema.landXML11.PointResultsDocument.PointResults pointResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointResultsDocument.PointResults target = null;
            target = (org.landxml.schema.landXML11.PointResultsDocument.PointResults)get_store().find_element_user(POINTRESULTS$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PointResultsDocument.PointResults)get_store().add_element_user(POINTRESULTS$0);
            }
            target.set(pointResults);
        }
    }
    
    /**
     * Appends and returns a new empty "PointResults" element
     */
    public org.landxml.schema.landXML11.PointResultsDocument.PointResults addNewPointResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointResultsDocument.PointResults target = null;
            target = (org.landxml.schema.landXML11.PointResultsDocument.PointResults)get_store().add_element_user(POINTRESULTS$0);
            return target;
        }
    }
    /**
     * An XML PointResults(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class PointResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PointResultsDocument.PointResults
    {
        
        public PointResultsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TARGETPOINT$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "TargetPoint");
        private static final javax.xml.namespace.QName FIELDNOTE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FieldNote");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName SETUPID$6 = 
            new javax.xml.namespace.QName("", "setupID");
        private static final javax.xml.namespace.QName TARGETSETUPID$8 = 
            new javax.xml.namespace.QName("", "targetSetupID");
        private static final javax.xml.namespace.QName MEANHORIZANGLE$10 = 
            new javax.xml.namespace.QName("", "meanHorizAngle");
        private static final javax.xml.namespace.QName HORIZSTDDEVIATION$12 = 
            new javax.xml.namespace.QName("", "horizStdDeviation");
        private static final javax.xml.namespace.QName MEANZENITHANGLE$14 = 
            new javax.xml.namespace.QName("", "meanzenithAngle");
        private static final javax.xml.namespace.QName VERTSTDDEVIATION$16 = 
            new javax.xml.namespace.QName("", "vertStdDeviation");
        private static final javax.xml.namespace.QName MEANSLOPEDISTANCE$18 = 
            new javax.xml.namespace.QName("", "meanSlopeDistance");
        private static final javax.xml.namespace.QName SLOPEDISTANCESTDDEVIATION$20 = 
            new javax.xml.namespace.QName("", "slopeDistanceStdDeviation");
        
        
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
         * Gets a List of "FieldNote" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FieldNoteDocument.FieldNote> getFieldNoteList()
        {
            final class FieldNoteList extends java.util.AbstractList<org.landxml.schema.landXML11.FieldNoteDocument.FieldNote>
            {
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote get(int i)
                    { return PointResultsImpl.this.getFieldNoteArray(i); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote set(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = PointResultsImpl.this.getFieldNoteArray(i);
                    PointResultsImpl.this.setFieldNoteArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                    { PointResultsImpl.this.insertNewFieldNote(i).set(o); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote remove(int i)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = PointResultsImpl.this.getFieldNoteArray(i);
                    PointResultsImpl.this.removeFieldNote(i);
                    return old;
                }
                
                public int size()
                    { return PointResultsImpl.this.sizeOfFieldNoteArray(); }
                
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
                get_store().find_all_element_users(FIELDNOTE$2, targetList);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().find_element_user(FIELDNOTE$2, i);
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
                return get_store().count_elements(FIELDNOTE$2);
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
                arraySetterHelper(fieldNoteArray, FIELDNOTE$2);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().find_element_user(FIELDNOTE$2, i);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().insert_element_user(FIELDNOTE$2, i);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().add_element_user(FIELDNOTE$2);
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
                get_store().remove_element(FIELDNOTE$2, i);
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
                    { return PointResultsImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = PointResultsImpl.this.getFeatureArray(i);
                    PointResultsImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { PointResultsImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = PointResultsImpl.this.getFeatureArray(i);
                    PointResultsImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return PointResultsImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "setupID" attribute
         */
        public java.lang.String getSetupID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETUPID$6);
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
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(SETUPID$6);
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
                return get_store().find_attribute_user(SETUPID$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETUPID$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETUPID$6);
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
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(SETUPID$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(SETUPID$6);
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
                get_store().remove_attribute(SETUPID$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETSETUPID$8);
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
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(TARGETSETUPID$8);
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
                return get_store().find_attribute_user(TARGETSETUPID$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETSETUPID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETSETUPID$8);
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
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(TARGETSETUPID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(TARGETSETUPID$8);
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
                get_store().remove_attribute(TARGETSETUPID$8);
            }
        }
        
        /**
         * Gets the "meanHorizAngle" attribute
         */
        public double getMeanHorizAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEANHORIZANGLE$10);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "meanHorizAngle" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetMeanHorizAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MEANHORIZANGLE$10);
                return target;
            }
        }
        
        /**
         * True if has "meanHorizAngle" attribute
         */
        public boolean isSetMeanHorizAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MEANHORIZANGLE$10) != null;
            }
        }
        
        /**
         * Sets the "meanHorizAngle" attribute
         */
        public void setMeanHorizAngle(double meanHorizAngle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEANHORIZANGLE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEANHORIZANGLE$10);
                }
                target.setDoubleValue(meanHorizAngle);
            }
        }
        
        /**
         * Sets (as xml) the "meanHorizAngle" attribute
         */
        public void xsetMeanHorizAngle(org.apache.xmlbeans.XmlDouble meanHorizAngle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MEANHORIZANGLE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MEANHORIZANGLE$10);
                }
                target.set(meanHorizAngle);
            }
        }
        
        /**
         * Unsets the "meanHorizAngle" attribute
         */
        public void unsetMeanHorizAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MEANHORIZANGLE$10);
            }
        }
        
        /**
         * Gets the "horizStdDeviation" attribute
         */
        public double getHorizStdDeviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZSTDDEVIATION$12);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "horizStdDeviation" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetHorizStdDeviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HORIZSTDDEVIATION$12);
                return target;
            }
        }
        
        /**
         * True if has "horizStdDeviation" attribute
         */
        public boolean isSetHorizStdDeviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HORIZSTDDEVIATION$12) != null;
            }
        }
        
        /**
         * Sets the "horizStdDeviation" attribute
         */
        public void setHorizStdDeviation(double horizStdDeviation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZSTDDEVIATION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORIZSTDDEVIATION$12);
                }
                target.setDoubleValue(horizStdDeviation);
            }
        }
        
        /**
         * Sets (as xml) the "horizStdDeviation" attribute
         */
        public void xsetHorizStdDeviation(org.apache.xmlbeans.XmlDouble horizStdDeviation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HORIZSTDDEVIATION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(HORIZSTDDEVIATION$12);
                }
                target.set(horizStdDeviation);
            }
        }
        
        /**
         * Unsets the "horizStdDeviation" attribute
         */
        public void unsetHorizStdDeviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HORIZSTDDEVIATION$12);
            }
        }
        
        /**
         * Gets the "meanzenithAngle" attribute
         */
        public double getMeanzenithAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEANZENITHANGLE$14);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "meanzenithAngle" attribute
         */
        public org.landxml.schema.landXML11.ZenithAngle xgetMeanzenithAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZenithAngle target = null;
                target = (org.landxml.schema.landXML11.ZenithAngle)get_store().find_attribute_user(MEANZENITHANGLE$14);
                return target;
            }
        }
        
        /**
         * True if has "meanzenithAngle" attribute
         */
        public boolean isSetMeanzenithAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MEANZENITHANGLE$14) != null;
            }
        }
        
        /**
         * Sets the "meanzenithAngle" attribute
         */
        public void setMeanzenithAngle(double meanzenithAngle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEANZENITHANGLE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEANZENITHANGLE$14);
                }
                target.setDoubleValue(meanzenithAngle);
            }
        }
        
        /**
         * Sets (as xml) the "meanzenithAngle" attribute
         */
        public void xsetMeanzenithAngle(org.landxml.schema.landXML11.ZenithAngle meanzenithAngle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZenithAngle target = null;
                target = (org.landxml.schema.landXML11.ZenithAngle)get_store().find_attribute_user(MEANZENITHANGLE$14);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ZenithAngle)get_store().add_attribute_user(MEANZENITHANGLE$14);
                }
                target.set(meanzenithAngle);
            }
        }
        
        /**
         * Unsets the "meanzenithAngle" attribute
         */
        public void unsetMeanzenithAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MEANZENITHANGLE$14);
            }
        }
        
        /**
         * Gets the "vertStdDeviation" attribute
         */
        public double getVertStdDeviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTSTDDEVIATION$16);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "vertStdDeviation" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetVertStdDeviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VERTSTDDEVIATION$16);
                return target;
            }
        }
        
        /**
         * True if has "vertStdDeviation" attribute
         */
        public boolean isSetVertStdDeviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VERTSTDDEVIATION$16) != null;
            }
        }
        
        /**
         * Sets the "vertStdDeviation" attribute
         */
        public void setVertStdDeviation(double vertStdDeviation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTSTDDEVIATION$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTSTDDEVIATION$16);
                }
                target.setDoubleValue(vertStdDeviation);
            }
        }
        
        /**
         * Sets (as xml) the "vertStdDeviation" attribute
         */
        public void xsetVertStdDeviation(org.apache.xmlbeans.XmlDouble vertStdDeviation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VERTSTDDEVIATION$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VERTSTDDEVIATION$16);
                }
                target.set(vertStdDeviation);
            }
        }
        
        /**
         * Unsets the "vertStdDeviation" attribute
         */
        public void unsetVertStdDeviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VERTSTDDEVIATION$16);
            }
        }
        
        /**
         * Gets the "meanSlopeDistance" attribute
         */
        public double getMeanSlopeDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEANSLOPEDISTANCE$18);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "meanSlopeDistance" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetMeanSlopeDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MEANSLOPEDISTANCE$18);
                return target;
            }
        }
        
        /**
         * True if has "meanSlopeDistance" attribute
         */
        public boolean isSetMeanSlopeDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MEANSLOPEDISTANCE$18) != null;
            }
        }
        
        /**
         * Sets the "meanSlopeDistance" attribute
         */
        public void setMeanSlopeDistance(double meanSlopeDistance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEANSLOPEDISTANCE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEANSLOPEDISTANCE$18);
                }
                target.setDoubleValue(meanSlopeDistance);
            }
        }
        
        /**
         * Sets (as xml) the "meanSlopeDistance" attribute
         */
        public void xsetMeanSlopeDistance(org.apache.xmlbeans.XmlDouble meanSlopeDistance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MEANSLOPEDISTANCE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MEANSLOPEDISTANCE$18);
                }
                target.set(meanSlopeDistance);
            }
        }
        
        /**
         * Unsets the "meanSlopeDistance" attribute
         */
        public void unsetMeanSlopeDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MEANSLOPEDISTANCE$18);
            }
        }
        
        /**
         * Gets the "slopeDistanceStdDeviation" attribute
         */
        public double getSlopeDistanceStdDeviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SLOPEDISTANCESTDDEVIATION$20);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "slopeDistanceStdDeviation" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSlopeDistanceStdDeviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SLOPEDISTANCESTDDEVIATION$20);
                return target;
            }
        }
        
        /**
         * True if has "slopeDistanceStdDeviation" attribute
         */
        public boolean isSetSlopeDistanceStdDeviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SLOPEDISTANCESTDDEVIATION$20) != null;
            }
        }
        
        /**
         * Sets the "slopeDistanceStdDeviation" attribute
         */
        public void setSlopeDistanceStdDeviation(double slopeDistanceStdDeviation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SLOPEDISTANCESTDDEVIATION$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SLOPEDISTANCESTDDEVIATION$20);
                }
                target.setDoubleValue(slopeDistanceStdDeviation);
            }
        }
        
        /**
         * Sets (as xml) the "slopeDistanceStdDeviation" attribute
         */
        public void xsetSlopeDistanceStdDeviation(org.apache.xmlbeans.XmlDouble slopeDistanceStdDeviation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SLOPEDISTANCESTDDEVIATION$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SLOPEDISTANCESTDDEVIATION$20);
                }
                target.set(slopeDistanceStdDeviation);
            }
        }
        
        /**
         * Unsets the "slopeDistanceStdDeviation" attribute
         */
        public void unsetSlopeDistanceStdDeviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SLOPEDISTANCESTDDEVIATION$20);
            }
        }
    }
}
