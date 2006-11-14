/*
 * An XML document type.
 * Localname: ControlChecks
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ControlChecksDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one ControlChecks(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ControlChecksDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ControlChecksDocument
{
    
    public ControlChecksDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTROLCHECKS$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ControlChecks");
    
    
    /**
     * Gets the "ControlChecks" element
     */
    public org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks getControlChecks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks target = null;
            target = (org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks)get_store().find_element_user(CONTROLCHECKS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ControlChecks" element
     */
    public void setControlChecks(org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks controlChecks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks target = null;
            target = (org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks)get_store().find_element_user(CONTROLCHECKS$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks)get_store().add_element_user(CONTROLCHECKS$0);
            }
            target.set(controlChecks);
        }
    }
    
    /**
     * Appends and returns a new empty "ControlChecks" element
     */
    public org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks addNewControlChecks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks target = null;
            target = (org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks)get_store().add_element_user(CONTROLCHECKS$0);
            return target;
        }
    }
    /**
     * An XML ControlChecks(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class ControlChecksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks
    {
        
        public ControlChecksImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OBSERVATIONGROUP$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ObservationGroup");
        private static final javax.xml.namespace.QName POINTRESULTS$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PointResults");
        private static final javax.xml.namespace.QName FIELDNOTE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FieldNote");
        private static final javax.xml.namespace.QName FEATURE$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        
        
        /**
         * Gets a List of "ObservationGroup" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup> getObservationGroupList()
        {
            final class ObservationGroupList extends java.util.AbstractList<org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup>
            {
                public org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup get(int i)
                    { return ControlChecksImpl.this.getObservationGroupArray(i); }
                
                public org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup set(int i, org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup o)
                {
                    org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup old = ControlChecksImpl.this.getObservationGroupArray(i);
                    ControlChecksImpl.this.setObservationGroupArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup o)
                    { ControlChecksImpl.this.insertNewObservationGroup(i).set(o); }
                
                public org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup remove(int i)
                {
                    org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup old = ControlChecksImpl.this.getObservationGroupArray(i);
                    ControlChecksImpl.this.removeObservationGroup(i);
                    return old;
                }
                
                public int size()
                    { return ControlChecksImpl.this.sizeOfObservationGroupArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ObservationGroupList();
            }
        }
        
        /**
         * Gets array of all "ObservationGroup" elements
         */
        public org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup[] getObservationGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OBSERVATIONGROUP$0, targetList);
                org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup[] result = new org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ObservationGroup" element
         */
        public org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup getObservationGroupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup target = null;
                target = (org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup)get_store().find_element_user(OBSERVATIONGROUP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ObservationGroup" element
         */
        public int sizeOfObservationGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OBSERVATIONGROUP$0);
            }
        }
        
        /**
         * Sets array of all "ObservationGroup" element
         */
        public void setObservationGroupArray(org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup[] observationGroupArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(observationGroupArray, OBSERVATIONGROUP$0);
            }
        }
        
        /**
         * Sets ith "ObservationGroup" element
         */
        public void setObservationGroupArray(int i, org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup observationGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup target = null;
                target = (org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup)get_store().find_element_user(OBSERVATIONGROUP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(observationGroup);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ObservationGroup" element
         */
        public org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup insertNewObservationGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup target = null;
                target = (org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup)get_store().insert_element_user(OBSERVATIONGROUP$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ObservationGroup" element
         */
        public org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup addNewObservationGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup target = null;
                target = (org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup)get_store().add_element_user(OBSERVATIONGROUP$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ObservationGroup" element
         */
        public void removeObservationGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OBSERVATIONGROUP$0, i);
            }
        }
        
        /**
         * Gets a List of "PointResults" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PointResultsDocument.PointResults> getPointResultsList()
        {
            final class PointResultsList extends java.util.AbstractList<org.landxml.schema.landXML11.PointResultsDocument.PointResults>
            {
                public org.landxml.schema.landXML11.PointResultsDocument.PointResults get(int i)
                    { return ControlChecksImpl.this.getPointResultsArray(i); }
                
                public org.landxml.schema.landXML11.PointResultsDocument.PointResults set(int i, org.landxml.schema.landXML11.PointResultsDocument.PointResults o)
                {
                    org.landxml.schema.landXML11.PointResultsDocument.PointResults old = ControlChecksImpl.this.getPointResultsArray(i);
                    ControlChecksImpl.this.setPointResultsArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PointResultsDocument.PointResults o)
                    { ControlChecksImpl.this.insertNewPointResults(i).set(o); }
                
                public org.landxml.schema.landXML11.PointResultsDocument.PointResults remove(int i)
                {
                    org.landxml.schema.landXML11.PointResultsDocument.PointResults old = ControlChecksImpl.this.getPointResultsArray(i);
                    ControlChecksImpl.this.removePointResults(i);
                    return old;
                }
                
                public int size()
                    { return ControlChecksImpl.this.sizeOfPointResultsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PointResultsList();
            }
        }
        
        /**
         * Gets array of all "PointResults" elements
         */
        public org.landxml.schema.landXML11.PointResultsDocument.PointResults[] getPointResultsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(POINTRESULTS$2, targetList);
                org.landxml.schema.landXML11.PointResultsDocument.PointResults[] result = new org.landxml.schema.landXML11.PointResultsDocument.PointResults[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PointResults" element
         */
        public org.landxml.schema.landXML11.PointResultsDocument.PointResults getPointResultsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointResultsDocument.PointResults target = null;
                target = (org.landxml.schema.landXML11.PointResultsDocument.PointResults)get_store().find_element_user(POINTRESULTS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PointResults" element
         */
        public int sizeOfPointResultsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(POINTRESULTS$2);
            }
        }
        
        /**
         * Sets array of all "PointResults" element
         */
        public void setPointResultsArray(org.landxml.schema.landXML11.PointResultsDocument.PointResults[] pointResultsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pointResultsArray, POINTRESULTS$2);
            }
        }
        
        /**
         * Sets ith "PointResults" element
         */
        public void setPointResultsArray(int i, org.landxml.schema.landXML11.PointResultsDocument.PointResults pointResults)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointResultsDocument.PointResults target = null;
                target = (org.landxml.schema.landXML11.PointResultsDocument.PointResults)get_store().find_element_user(POINTRESULTS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(pointResults);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PointResults" element
         */
        public org.landxml.schema.landXML11.PointResultsDocument.PointResults insertNewPointResults(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointResultsDocument.PointResults target = null;
                target = (org.landxml.schema.landXML11.PointResultsDocument.PointResults)get_store().insert_element_user(POINTRESULTS$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PointResults" element
         */
        public org.landxml.schema.landXML11.PointResultsDocument.PointResults addNewPointResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointResultsDocument.PointResults target = null;
                target = (org.landxml.schema.landXML11.PointResultsDocument.PointResults)get_store().add_element_user(POINTRESULTS$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "PointResults" element
         */
        public void removePointResults(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(POINTRESULTS$2, i);
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
                    { return ControlChecksImpl.this.getFieldNoteArray(i); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote set(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = ControlChecksImpl.this.getFieldNoteArray(i);
                    ControlChecksImpl.this.setFieldNoteArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                    { ControlChecksImpl.this.insertNewFieldNote(i).set(o); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote remove(int i)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = ControlChecksImpl.this.getFieldNoteArray(i);
                    ControlChecksImpl.this.removeFieldNote(i);
                    return old;
                }
                
                public int size()
                    { return ControlChecksImpl.this.sizeOfFieldNoteArray(); }
                
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
                    { return ControlChecksImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ControlChecksImpl.this.getFeatureArray(i);
                    ControlChecksImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { ControlChecksImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ControlChecksImpl.this.getFeatureArray(i);
                    ControlChecksImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return ControlChecksImpl.this.sizeOfFeatureArray(); }
                
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
    }
}
