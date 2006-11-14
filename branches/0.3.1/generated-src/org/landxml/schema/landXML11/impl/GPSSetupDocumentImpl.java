/*
 * An XML document type.
 * Localname: GPSSetup
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.GPSSetupDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one GPSSetup(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class GPSSetupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.GPSSetupDocument
{
    
    public GPSSetupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GPSSETUP$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "GPSSetup");
    
    
    /**
     * Gets the "GPSSetup" element
     */
    public org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup getGPSSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup target = null;
            target = (org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup)get_store().find_element_user(GPSSETUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GPSSetup" element
     */
    public void setGPSSetup(org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup gpsSetup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup target = null;
            target = (org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup)get_store().find_element_user(GPSSETUP$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup)get_store().add_element_user(GPSSETUP$0);
            }
            target.set(gpsSetup);
        }
    }
    
    /**
     * Appends and returns a new empty "GPSSetup" element
     */
    public org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup addNewGPSSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup target = null;
            target = (org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup)get_store().add_element_user(GPSSETUP$0);
            return target;
        }
    }
    /**
     * An XML GPSSetup(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class GPSSetupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup
    {
        
        public GPSSetupImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TARGETSETUP$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "TargetSetup");
        private static final javax.xml.namespace.QName GPSPOSITION$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "GPSPosition");
        private static final javax.xml.namespace.QName FIELDNOTE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FieldNote");
        private static final javax.xml.namespace.QName FEATURE$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName ID$8 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName ANTENNAHEIGHT$10 = 
            new javax.xml.namespace.QName("", "antennaHeight");
        private static final javax.xml.namespace.QName STATIONNAME$12 = 
            new javax.xml.namespace.QName("", "stationName");
        private static final javax.xml.namespace.QName GPSANTENNADETAILSID$14 = 
            new javax.xml.namespace.QName("", "GPSAntennaDetailsID");
        private static final javax.xml.namespace.QName GPSRECEIVERDETAILSID$16 = 
            new javax.xml.namespace.QName("", "GPSReceiverDetailsID");
        private static final javax.xml.namespace.QName OBSERVATIONDATALINK$18 = 
            new javax.xml.namespace.QName("", "observationDataLink");
        private static final javax.xml.namespace.QName STATIONDESCRIPTION$20 = 
            new javax.xml.namespace.QName("", "stationDescription");
        private static final javax.xml.namespace.QName STARTTIME$22 = 
            new javax.xml.namespace.QName("", "startTime");
        private static final javax.xml.namespace.QName STOPTIME$24 = 
            new javax.xml.namespace.QName("", "stopTime");
        
        
        /**
         * Gets a List of "TargetSetup" elements
         */
        public java.util.List<org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup> getTargetSetupList()
        {
            final class TargetSetupList extends java.util.AbstractList<org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup>
            {
                public org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup get(int i)
                    { return GPSSetupImpl.this.getTargetSetupArray(i); }
                
                public org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup set(int i, org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup o)
                {
                    org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup old = GPSSetupImpl.this.getTargetSetupArray(i);
                    GPSSetupImpl.this.setTargetSetupArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup o)
                    { GPSSetupImpl.this.insertNewTargetSetup(i).set(o); }
                
                public org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup remove(int i)
                {
                    org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup old = GPSSetupImpl.this.getTargetSetupArray(i);
                    GPSSetupImpl.this.removeTargetSetup(i);
                    return old;
                }
                
                public int size()
                    { return GPSSetupImpl.this.sizeOfTargetSetupArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new TargetSetupList();
            }
        }
        
        /**
         * Gets array of all "TargetSetup" elements
         */
        public org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup[] getTargetSetupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TARGETSETUP$0, targetList);
                org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup[] result = new org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "TargetSetup" element
         */
        public org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup getTargetSetupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup target = null;
                target = (org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup)get_store().find_element_user(TARGETSETUP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "TargetSetup" element
         */
        public int sizeOfTargetSetupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TARGETSETUP$0);
            }
        }
        
        /**
         * Sets array of all "TargetSetup" element
         */
        public void setTargetSetupArray(org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup[] targetSetupArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(targetSetupArray, TARGETSETUP$0);
            }
        }
        
        /**
         * Sets ith "TargetSetup" element
         */
        public void setTargetSetupArray(int i, org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup targetSetup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup target = null;
                target = (org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup)get_store().find_element_user(TARGETSETUP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(targetSetup);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TargetSetup" element
         */
        public org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup insertNewTargetSetup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup target = null;
                target = (org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup)get_store().insert_element_user(TARGETSETUP$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TargetSetup" element
         */
        public org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup addNewTargetSetup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup target = null;
                target = (org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup)get_store().add_element_user(TARGETSETUP$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "TargetSetup" element
         */
        public void removeTargetSetup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TARGETSETUP$0, i);
            }
        }
        
        /**
         * Gets a List of "GPSPosition" elements
         */
        public java.util.List<org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition> getGPSPositionList()
        {
            final class GPSPositionList extends java.util.AbstractList<org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition>
            {
                public org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition get(int i)
                    { return GPSSetupImpl.this.getGPSPositionArray(i); }
                
                public org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition set(int i, org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition o)
                {
                    org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition old = GPSSetupImpl.this.getGPSPositionArray(i);
                    GPSSetupImpl.this.setGPSPositionArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition o)
                    { GPSSetupImpl.this.insertNewGPSPosition(i).set(o); }
                
                public org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition remove(int i)
                {
                    org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition old = GPSSetupImpl.this.getGPSPositionArray(i);
                    GPSSetupImpl.this.removeGPSPosition(i);
                    return old;
                }
                
                public int size()
                    { return GPSSetupImpl.this.sizeOfGPSPositionArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new GPSPositionList();
            }
        }
        
        /**
         * Gets array of all "GPSPosition" elements
         */
        public org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition[] getGPSPositionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GPSPOSITION$2, targetList);
                org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition[] result = new org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "GPSPosition" element
         */
        public org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition getGPSPositionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition target = null;
                target = (org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition)get_store().find_element_user(GPSPOSITION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "GPSPosition" element
         */
        public int sizeOfGPSPositionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GPSPOSITION$2);
            }
        }
        
        /**
         * Sets array of all "GPSPosition" element
         */
        public void setGPSPositionArray(org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition[] gpsPositionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(gpsPositionArray, GPSPOSITION$2);
            }
        }
        
        /**
         * Sets ith "GPSPosition" element
         */
        public void setGPSPositionArray(int i, org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition gpsPosition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition target = null;
                target = (org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition)get_store().find_element_user(GPSPOSITION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(gpsPosition);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GPSPosition" element
         */
        public org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition insertNewGPSPosition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition target = null;
                target = (org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition)get_store().insert_element_user(GPSPOSITION$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GPSPosition" element
         */
        public org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition addNewGPSPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition target = null;
                target = (org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition)get_store().add_element_user(GPSPOSITION$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "GPSPosition" element
         */
        public void removeGPSPosition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GPSPOSITION$2, i);
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
                    { return GPSSetupImpl.this.getFieldNoteArray(i); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote set(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = GPSSetupImpl.this.getFieldNoteArray(i);
                    GPSSetupImpl.this.setFieldNoteArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                    { GPSSetupImpl.this.insertNewFieldNote(i).set(o); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote remove(int i)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = GPSSetupImpl.this.getFieldNoteArray(i);
                    GPSSetupImpl.this.removeFieldNote(i);
                    return old;
                }
                
                public int size()
                    { return GPSSetupImpl.this.sizeOfFieldNoteArray(); }
                
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
                    { return GPSSetupImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = GPSSetupImpl.this.getFeatureArray(i);
                    GPSSetupImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { GPSSetupImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = GPSSetupImpl.this.getFeatureArray(i);
                    GPSSetupImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return GPSSetupImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlID xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlID target = null;
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
                return target;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlID id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlID target = null;
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$8);
                }
                target.set(id);
            }
        }
        
        /**
         * Gets the "antennaHeight" attribute
         */
        public double getAntennaHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANTENNAHEIGHT$10);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "antennaHeight" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetAntennaHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ANTENNAHEIGHT$10);
                return target;
            }
        }
        
        /**
         * Sets the "antennaHeight" attribute
         */
        public void setAntennaHeight(double antennaHeight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANTENNAHEIGHT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ANTENNAHEIGHT$10);
                }
                target.setDoubleValue(antennaHeight);
            }
        }
        
        /**
         * Sets (as xml) the "antennaHeight" attribute
         */
        public void xsetAntennaHeight(org.apache.xmlbeans.XmlDouble antennaHeight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ANTENNAHEIGHT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ANTENNAHEIGHT$10);
                }
                target.set(antennaHeight);
            }
        }
        
        /**
         * Gets the "stationName" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getStationName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(STATIONNAME$12);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "stationName" attribute
         */
        public void setStationName(org.apache.xmlbeans.XmlAnySimpleType stationName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(STATIONNAME$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(STATIONNAME$12);
                }
                target.set(stationName);
            }
        }
        
        /**
         * Appends and returns a new empty "stationName" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewStationName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(STATIONNAME$12);
                return target;
            }
        }
        
        /**
         * Gets the "GPSAntennaDetailsID" attribute
         */
        public java.lang.String getGPSAntennaDetailsID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GPSANTENNADETAILSID$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GPSAntennaDetailsID" attribute
         */
        public org.apache.xmlbeans.XmlIDREF xgetGPSAntennaDetailsID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(GPSANTENNADETAILSID$14);
                return target;
            }
        }
        
        /**
         * True if has "GPSAntennaDetailsID" attribute
         */
        public boolean isSetGPSAntennaDetailsID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GPSANTENNADETAILSID$14) != null;
            }
        }
        
        /**
         * Sets the "GPSAntennaDetailsID" attribute
         */
        public void setGPSAntennaDetailsID(java.lang.String gpsAntennaDetailsID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GPSANTENNADETAILSID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GPSANTENNADETAILSID$14);
                }
                target.setStringValue(gpsAntennaDetailsID);
            }
        }
        
        /**
         * Sets (as xml) the "GPSAntennaDetailsID" attribute
         */
        public void xsetGPSAntennaDetailsID(org.apache.xmlbeans.XmlIDREF gpsAntennaDetailsID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(GPSANTENNADETAILSID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(GPSANTENNADETAILSID$14);
                }
                target.set(gpsAntennaDetailsID);
            }
        }
        
        /**
         * Unsets the "GPSAntennaDetailsID" attribute
         */
        public void unsetGPSAntennaDetailsID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GPSANTENNADETAILSID$14);
            }
        }
        
        /**
         * Gets the "GPSReceiverDetailsID" attribute
         */
        public java.lang.String getGPSReceiverDetailsID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GPSRECEIVERDETAILSID$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GPSReceiverDetailsID" attribute
         */
        public org.apache.xmlbeans.XmlIDREF xgetGPSReceiverDetailsID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(GPSRECEIVERDETAILSID$16);
                return target;
            }
        }
        
        /**
         * True if has "GPSReceiverDetailsID" attribute
         */
        public boolean isSetGPSReceiverDetailsID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GPSRECEIVERDETAILSID$16) != null;
            }
        }
        
        /**
         * Sets the "GPSReceiverDetailsID" attribute
         */
        public void setGPSReceiverDetailsID(java.lang.String gpsReceiverDetailsID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GPSRECEIVERDETAILSID$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GPSRECEIVERDETAILSID$16);
                }
                target.setStringValue(gpsReceiverDetailsID);
            }
        }
        
        /**
         * Sets (as xml) the "GPSReceiverDetailsID" attribute
         */
        public void xsetGPSReceiverDetailsID(org.apache.xmlbeans.XmlIDREF gpsReceiverDetailsID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(GPSRECEIVERDETAILSID$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(GPSRECEIVERDETAILSID$16);
                }
                target.set(gpsReceiverDetailsID);
            }
        }
        
        /**
         * Unsets the "GPSReceiverDetailsID" attribute
         */
        public void unsetGPSReceiverDetailsID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GPSRECEIVERDETAILSID$16);
            }
        }
        
        /**
         * Gets the "observationDataLink" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getObservationDataLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(OBSERVATIONDATALINK$18);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "observationDataLink" attribute
         */
        public boolean isSetObservationDataLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OBSERVATIONDATALINK$18) != null;
            }
        }
        
        /**
         * Sets the "observationDataLink" attribute
         */
        public void setObservationDataLink(org.apache.xmlbeans.XmlAnySimpleType observationDataLink)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(OBSERVATIONDATALINK$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(OBSERVATIONDATALINK$18);
                }
                target.set(observationDataLink);
            }
        }
        
        /**
         * Appends and returns a new empty "observationDataLink" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewObservationDataLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(OBSERVATIONDATALINK$18);
                return target;
            }
        }
        
        /**
         * Unsets the "observationDataLink" attribute
         */
        public void unsetObservationDataLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OBSERVATIONDATALINK$18);
            }
        }
        
        /**
         * Gets the "stationDescription" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getStationDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(STATIONDESCRIPTION$20);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "stationDescription" attribute
         */
        public boolean isSetStationDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STATIONDESCRIPTION$20) != null;
            }
        }
        
        /**
         * Sets the "stationDescription" attribute
         */
        public void setStationDescription(org.apache.xmlbeans.XmlAnySimpleType stationDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(STATIONDESCRIPTION$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(STATIONDESCRIPTION$20);
                }
                target.set(stationDescription);
            }
        }
        
        /**
         * Appends and returns a new empty "stationDescription" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewStationDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(STATIONDESCRIPTION$20);
                return target;
            }
        }
        
        /**
         * Unsets the "stationDescription" attribute
         */
        public void unsetStationDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STATIONDESCRIPTION$20);
            }
        }
        
        /**
         * Gets the "startTime" attribute
         */
        public double getStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTTIME$22);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "startTime" attribute
         */
        public org.landxml.schema.landXML11.GPSTime xgetStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSTime target = null;
                target = (org.landxml.schema.landXML11.GPSTime)get_store().find_attribute_user(STARTTIME$22);
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
                return get_store().find_attribute_user(STARTTIME$22) != null;
            }
        }
        
        /**
         * Sets the "startTime" attribute
         */
        public void setStartTime(double startTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTTIME$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTTIME$22);
                }
                target.setDoubleValue(startTime);
            }
        }
        
        /**
         * Sets (as xml) the "startTime" attribute
         */
        public void xsetStartTime(org.landxml.schema.landXML11.GPSTime startTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSTime target = null;
                target = (org.landxml.schema.landXML11.GPSTime)get_store().find_attribute_user(STARTTIME$22);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.GPSTime)get_store().add_attribute_user(STARTTIME$22);
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
                get_store().remove_attribute(STARTTIME$22);
            }
        }
        
        /**
         * Gets the "stopTime" attribute
         */
        public double getStopTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STOPTIME$24);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "stopTime" attribute
         */
        public org.landxml.schema.landXML11.GPSTime xgetStopTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSTime target = null;
                target = (org.landxml.schema.landXML11.GPSTime)get_store().find_attribute_user(STOPTIME$24);
                return target;
            }
        }
        
        /**
         * True if has "stopTime" attribute
         */
        public boolean isSetStopTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STOPTIME$24) != null;
            }
        }
        
        /**
         * Sets the "stopTime" attribute
         */
        public void setStopTime(double stopTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STOPTIME$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STOPTIME$24);
                }
                target.setDoubleValue(stopTime);
            }
        }
        
        /**
         * Sets (as xml) the "stopTime" attribute
         */
        public void xsetStopTime(org.landxml.schema.landXML11.GPSTime stopTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSTime target = null;
                target = (org.landxml.schema.landXML11.GPSTime)get_store().find_attribute_user(STOPTIME$24);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.GPSTime)get_store().add_attribute_user(STOPTIME$24);
                }
                target.set(stopTime);
            }
        }
        
        /**
         * Unsets the "stopTime" attribute
         */
        public void unsetStopTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STOPTIME$24);
            }
        }
    }
}
