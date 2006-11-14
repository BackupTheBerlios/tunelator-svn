/*
 * An XML document type.
 * Localname: InstrumentSetup
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.InstrumentSetupDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one InstrumentSetup(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class InstrumentSetupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.InstrumentSetupDocument
{
    
    public InstrumentSetupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTRUMENTSETUP$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "InstrumentSetup");
    
    
    /**
     * Gets the "InstrumentSetup" element
     */
    public org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup getInstrumentSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup target = null;
            target = (org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup)get_store().find_element_user(INSTRUMENTSETUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InstrumentSetup" element
     */
    public void setInstrumentSetup(org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup instrumentSetup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup target = null;
            target = (org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup)get_store().find_element_user(INSTRUMENTSETUP$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup)get_store().add_element_user(INSTRUMENTSETUP$0);
            }
            target.set(instrumentSetup);
        }
    }
    
    /**
     * Appends and returns a new empty "InstrumentSetup" element
     */
    public org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup addNewInstrumentSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup target = null;
            target = (org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup)get_store().add_element_user(INSTRUMENTSETUP$0);
            return target;
        }
    }
    /**
     * An XML InstrumentSetup(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class InstrumentSetupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup
    {
        
        public InstrumentSetupImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INSTRUMENTPOINT$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "InstrumentPoint");
        private static final javax.xml.namespace.QName BACKSIGHT$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Backsight");
        private static final javax.xml.namespace.QName TARGETSETUP$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "TargetSetup");
        private static final javax.xml.namespace.QName RAWOBSERVATION$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "RawObservation");
        private static final javax.xml.namespace.QName OBSERVATIONGROUP$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ObservationGroup");
        private static final javax.xml.namespace.QName CONTROLCHECKS$10 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ControlChecks");
        private static final javax.xml.namespace.QName FIELDNOTE$12 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FieldNote");
        private static final javax.xml.namespace.QName FEATURE$14 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName ID$16 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName INSTRUMENTDETAILSID$18 = 
            new javax.xml.namespace.QName("", "instrumentDetailsID");
        private static final javax.xml.namespace.QName STATIONNAME$20 = 
            new javax.xml.namespace.QName("", "stationName");
        private static final javax.xml.namespace.QName INSTRUMENTHEIGHT$22 = 
            new javax.xml.namespace.QName("", "instrumentHeight");
        private static final javax.xml.namespace.QName ORIENTATIONAZIMUTH$24 = 
            new javax.xml.namespace.QName("", "orientationAzimuth");
        private static final javax.xml.namespace.QName CIRCLEAZIMUTH$26 = 
            new javax.xml.namespace.QName("", "circleAzimuth");
        
        
        /**
         * Gets a List of "InstrumentPoint" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PointType> getInstrumentPointList()
        {
            final class InstrumentPointList extends java.util.AbstractList<org.landxml.schema.landXML11.PointType>
            {
                public org.landxml.schema.landXML11.PointType get(int i)
                    { return InstrumentSetupImpl.this.getInstrumentPointArray(i); }
                
                public org.landxml.schema.landXML11.PointType set(int i, org.landxml.schema.landXML11.PointType o)
                {
                    org.landxml.schema.landXML11.PointType old = InstrumentSetupImpl.this.getInstrumentPointArray(i);
                    InstrumentSetupImpl.this.setInstrumentPointArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PointType o)
                    { InstrumentSetupImpl.this.insertNewInstrumentPoint(i).set(o); }
                
                public org.landxml.schema.landXML11.PointType remove(int i)
                {
                    org.landxml.schema.landXML11.PointType old = InstrumentSetupImpl.this.getInstrumentPointArray(i);
                    InstrumentSetupImpl.this.removeInstrumentPoint(i);
                    return old;
                }
                
                public int size()
                    { return InstrumentSetupImpl.this.sizeOfInstrumentPointArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new InstrumentPointList();
            }
        }
        
        /**
         * Gets array of all "InstrumentPoint" elements
         */
        public org.landxml.schema.landXML11.PointType[] getInstrumentPointArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INSTRUMENTPOINT$0, targetList);
                org.landxml.schema.landXML11.PointType[] result = new org.landxml.schema.landXML11.PointType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "InstrumentPoint" element
         */
        public org.landxml.schema.landXML11.PointType getInstrumentPointArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(INSTRUMENTPOINT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "InstrumentPoint" element
         */
        public int sizeOfInstrumentPointArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INSTRUMENTPOINT$0);
            }
        }
        
        /**
         * Sets array of all "InstrumentPoint" element
         */
        public void setInstrumentPointArray(org.landxml.schema.landXML11.PointType[] instrumentPointArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(instrumentPointArray, INSTRUMENTPOINT$0);
            }
        }
        
        /**
         * Sets ith "InstrumentPoint" element
         */
        public void setInstrumentPointArray(int i, org.landxml.schema.landXML11.PointType instrumentPoint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(INSTRUMENTPOINT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(instrumentPoint);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "InstrumentPoint" element
         */
        public org.landxml.schema.landXML11.PointType insertNewInstrumentPoint(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().insert_element_user(INSTRUMENTPOINT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "InstrumentPoint" element
         */
        public org.landxml.schema.landXML11.PointType addNewInstrumentPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(INSTRUMENTPOINT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "InstrumentPoint" element
         */
        public void removeInstrumentPoint(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INSTRUMENTPOINT$0, i);
            }
        }
        
        /**
         * Gets a List of "Backsight" elements
         */
        public java.util.List<org.landxml.schema.landXML11.BacksightDocument.Backsight> getBacksightList()
        {
            final class BacksightList extends java.util.AbstractList<org.landxml.schema.landXML11.BacksightDocument.Backsight>
            {
                public org.landxml.schema.landXML11.BacksightDocument.Backsight get(int i)
                    { return InstrumentSetupImpl.this.getBacksightArray(i); }
                
                public org.landxml.schema.landXML11.BacksightDocument.Backsight set(int i, org.landxml.schema.landXML11.BacksightDocument.Backsight o)
                {
                    org.landxml.schema.landXML11.BacksightDocument.Backsight old = InstrumentSetupImpl.this.getBacksightArray(i);
                    InstrumentSetupImpl.this.setBacksightArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.BacksightDocument.Backsight o)
                    { InstrumentSetupImpl.this.insertNewBacksight(i).set(o); }
                
                public org.landxml.schema.landXML11.BacksightDocument.Backsight remove(int i)
                {
                    org.landxml.schema.landXML11.BacksightDocument.Backsight old = InstrumentSetupImpl.this.getBacksightArray(i);
                    InstrumentSetupImpl.this.removeBacksight(i);
                    return old;
                }
                
                public int size()
                    { return InstrumentSetupImpl.this.sizeOfBacksightArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new BacksightList();
            }
        }
        
        /**
         * Gets array of all "Backsight" elements
         */
        public org.landxml.schema.landXML11.BacksightDocument.Backsight[] getBacksightArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BACKSIGHT$2, targetList);
                org.landxml.schema.landXML11.BacksightDocument.Backsight[] result = new org.landxml.schema.landXML11.BacksightDocument.Backsight[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Backsight" element
         */
        public org.landxml.schema.landXML11.BacksightDocument.Backsight getBacksightArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BacksightDocument.Backsight target = null;
                target = (org.landxml.schema.landXML11.BacksightDocument.Backsight)get_store().find_element_user(BACKSIGHT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Backsight" element
         */
        public int sizeOfBacksightArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BACKSIGHT$2);
            }
        }
        
        /**
         * Sets array of all "Backsight" element
         */
        public void setBacksightArray(org.landxml.schema.landXML11.BacksightDocument.Backsight[] backsightArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(backsightArray, BACKSIGHT$2);
            }
        }
        
        /**
         * Sets ith "Backsight" element
         */
        public void setBacksightArray(int i, org.landxml.schema.landXML11.BacksightDocument.Backsight backsight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BacksightDocument.Backsight target = null;
                target = (org.landxml.schema.landXML11.BacksightDocument.Backsight)get_store().find_element_user(BACKSIGHT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(backsight);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Backsight" element
         */
        public org.landxml.schema.landXML11.BacksightDocument.Backsight insertNewBacksight(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BacksightDocument.Backsight target = null;
                target = (org.landxml.schema.landXML11.BacksightDocument.Backsight)get_store().insert_element_user(BACKSIGHT$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Backsight" element
         */
        public org.landxml.schema.landXML11.BacksightDocument.Backsight addNewBacksight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BacksightDocument.Backsight target = null;
                target = (org.landxml.schema.landXML11.BacksightDocument.Backsight)get_store().add_element_user(BACKSIGHT$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Backsight" element
         */
        public void removeBacksight(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BACKSIGHT$2, i);
            }
        }
        
        /**
         * Gets a List of "TargetSetup" elements
         */
        public java.util.List<org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup> getTargetSetupList()
        {
            final class TargetSetupList extends java.util.AbstractList<org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup>
            {
                public org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup get(int i)
                    { return InstrumentSetupImpl.this.getTargetSetupArray(i); }
                
                public org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup set(int i, org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup o)
                {
                    org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup old = InstrumentSetupImpl.this.getTargetSetupArray(i);
                    InstrumentSetupImpl.this.setTargetSetupArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup o)
                    { InstrumentSetupImpl.this.insertNewTargetSetup(i).set(o); }
                
                public org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup remove(int i)
                {
                    org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup old = InstrumentSetupImpl.this.getTargetSetupArray(i);
                    InstrumentSetupImpl.this.removeTargetSetup(i);
                    return old;
                }
                
                public int size()
                    { return InstrumentSetupImpl.this.sizeOfTargetSetupArray(); }
                
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
                get_store().find_all_element_users(TARGETSETUP$4, targetList);
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
                target = (org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup)get_store().find_element_user(TARGETSETUP$4, i);
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
                return get_store().count_elements(TARGETSETUP$4);
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
                arraySetterHelper(targetSetupArray, TARGETSETUP$4);
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
                target = (org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup)get_store().find_element_user(TARGETSETUP$4, i);
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
                target = (org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup)get_store().insert_element_user(TARGETSETUP$4, i);
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
                target = (org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup)get_store().add_element_user(TARGETSETUP$4);
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
                get_store().remove_element(TARGETSETUP$4, i);
            }
        }
        
        /**
         * Gets a List of "RawObservation" elements
         */
        public java.util.List<org.landxml.schema.landXML11.RawObservationDocument.RawObservation> getRawObservationList()
        {
            final class RawObservationList extends java.util.AbstractList<org.landxml.schema.landXML11.RawObservationDocument.RawObservation>
            {
                public org.landxml.schema.landXML11.RawObservationDocument.RawObservation get(int i)
                    { return InstrumentSetupImpl.this.getRawObservationArray(i); }
                
                public org.landxml.schema.landXML11.RawObservationDocument.RawObservation set(int i, org.landxml.schema.landXML11.RawObservationDocument.RawObservation o)
                {
                    org.landxml.schema.landXML11.RawObservationDocument.RawObservation old = InstrumentSetupImpl.this.getRawObservationArray(i);
                    InstrumentSetupImpl.this.setRawObservationArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.RawObservationDocument.RawObservation o)
                    { InstrumentSetupImpl.this.insertNewRawObservation(i).set(o); }
                
                public org.landxml.schema.landXML11.RawObservationDocument.RawObservation remove(int i)
                {
                    org.landxml.schema.landXML11.RawObservationDocument.RawObservation old = InstrumentSetupImpl.this.getRawObservationArray(i);
                    InstrumentSetupImpl.this.removeRawObservation(i);
                    return old;
                }
                
                public int size()
                    { return InstrumentSetupImpl.this.sizeOfRawObservationArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RawObservationList();
            }
        }
        
        /**
         * Gets array of all "RawObservation" elements
         */
        public org.landxml.schema.landXML11.RawObservationDocument.RawObservation[] getRawObservationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RAWOBSERVATION$6, targetList);
                org.landxml.schema.landXML11.RawObservationDocument.RawObservation[] result = new org.landxml.schema.landXML11.RawObservationDocument.RawObservation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "RawObservation" element
         */
        public org.landxml.schema.landXML11.RawObservationDocument.RawObservation getRawObservationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RawObservationDocument.RawObservation target = null;
                target = (org.landxml.schema.landXML11.RawObservationDocument.RawObservation)get_store().find_element_user(RAWOBSERVATION$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "RawObservation" element
         */
        public int sizeOfRawObservationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RAWOBSERVATION$6);
            }
        }
        
        /**
         * Sets array of all "RawObservation" element
         */
        public void setRawObservationArray(org.landxml.schema.landXML11.RawObservationDocument.RawObservation[] rawObservationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(rawObservationArray, RAWOBSERVATION$6);
            }
        }
        
        /**
         * Sets ith "RawObservation" element
         */
        public void setRawObservationArray(int i, org.landxml.schema.landXML11.RawObservationDocument.RawObservation rawObservation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RawObservationDocument.RawObservation target = null;
                target = (org.landxml.schema.landXML11.RawObservationDocument.RawObservation)get_store().find_element_user(RAWOBSERVATION$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(rawObservation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RawObservation" element
         */
        public org.landxml.schema.landXML11.RawObservationDocument.RawObservation insertNewRawObservation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RawObservationDocument.RawObservation target = null;
                target = (org.landxml.schema.landXML11.RawObservationDocument.RawObservation)get_store().insert_element_user(RAWOBSERVATION$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RawObservation" element
         */
        public org.landxml.schema.landXML11.RawObservationDocument.RawObservation addNewRawObservation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RawObservationDocument.RawObservation target = null;
                target = (org.landxml.schema.landXML11.RawObservationDocument.RawObservation)get_store().add_element_user(RAWOBSERVATION$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "RawObservation" element
         */
        public void removeRawObservation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RAWOBSERVATION$6, i);
            }
        }
        
        /**
         * Gets a List of "ObservationGroup" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup> getObservationGroupList()
        {
            final class ObservationGroupList extends java.util.AbstractList<org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup>
            {
                public org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup get(int i)
                    { return InstrumentSetupImpl.this.getObservationGroupArray(i); }
                
                public org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup set(int i, org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup o)
                {
                    org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup old = InstrumentSetupImpl.this.getObservationGroupArray(i);
                    InstrumentSetupImpl.this.setObservationGroupArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup o)
                    { InstrumentSetupImpl.this.insertNewObservationGroup(i).set(o); }
                
                public org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup remove(int i)
                {
                    org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup old = InstrumentSetupImpl.this.getObservationGroupArray(i);
                    InstrumentSetupImpl.this.removeObservationGroup(i);
                    return old;
                }
                
                public int size()
                    { return InstrumentSetupImpl.this.sizeOfObservationGroupArray(); }
                
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
                get_store().find_all_element_users(OBSERVATIONGROUP$8, targetList);
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
                target = (org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup)get_store().find_element_user(OBSERVATIONGROUP$8, i);
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
                return get_store().count_elements(OBSERVATIONGROUP$8);
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
                arraySetterHelper(observationGroupArray, OBSERVATIONGROUP$8);
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
                target = (org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup)get_store().find_element_user(OBSERVATIONGROUP$8, i);
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
                target = (org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup)get_store().insert_element_user(OBSERVATIONGROUP$8, i);
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
                target = (org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup)get_store().add_element_user(OBSERVATIONGROUP$8);
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
                get_store().remove_element(OBSERVATIONGROUP$8, i);
            }
        }
        
        /**
         * Gets a List of "ControlChecks" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks> getControlChecksList()
        {
            final class ControlChecksList extends java.util.AbstractList<org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks>
            {
                public org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks get(int i)
                    { return InstrumentSetupImpl.this.getControlChecksArray(i); }
                
                public org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks set(int i, org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks o)
                {
                    org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks old = InstrumentSetupImpl.this.getControlChecksArray(i);
                    InstrumentSetupImpl.this.setControlChecksArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks o)
                    { InstrumentSetupImpl.this.insertNewControlChecks(i).set(o); }
                
                public org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks remove(int i)
                {
                    org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks old = InstrumentSetupImpl.this.getControlChecksArray(i);
                    InstrumentSetupImpl.this.removeControlChecks(i);
                    return old;
                }
                
                public int size()
                    { return InstrumentSetupImpl.this.sizeOfControlChecksArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ControlChecksList();
            }
        }
        
        /**
         * Gets array of all "ControlChecks" elements
         */
        public org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks[] getControlChecksArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONTROLCHECKS$10, targetList);
                org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks[] result = new org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ControlChecks" element
         */
        public org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks getControlChecksArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks target = null;
                target = (org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks)get_store().find_element_user(CONTROLCHECKS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ControlChecks" element
         */
        public int sizeOfControlChecksArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTROLCHECKS$10);
            }
        }
        
        /**
         * Sets array of all "ControlChecks" element
         */
        public void setControlChecksArray(org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks[] controlChecksArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(controlChecksArray, CONTROLCHECKS$10);
            }
        }
        
        /**
         * Sets ith "ControlChecks" element
         */
        public void setControlChecksArray(int i, org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks controlChecks)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks target = null;
                target = (org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks)get_store().find_element_user(CONTROLCHECKS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(controlChecks);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ControlChecks" element
         */
        public org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks insertNewControlChecks(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks target = null;
                target = (org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks)get_store().insert_element_user(CONTROLCHECKS$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ControlChecks" element
         */
        public org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks addNewControlChecks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks target = null;
                target = (org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks)get_store().add_element_user(CONTROLCHECKS$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "ControlChecks" element
         */
        public void removeControlChecks(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTROLCHECKS$10, i);
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
                    { return InstrumentSetupImpl.this.getFieldNoteArray(i); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote set(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = InstrumentSetupImpl.this.getFieldNoteArray(i);
                    InstrumentSetupImpl.this.setFieldNoteArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                    { InstrumentSetupImpl.this.insertNewFieldNote(i).set(o); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote remove(int i)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = InstrumentSetupImpl.this.getFieldNoteArray(i);
                    InstrumentSetupImpl.this.removeFieldNote(i);
                    return old;
                }
                
                public int size()
                    { return InstrumentSetupImpl.this.sizeOfFieldNoteArray(); }
                
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
                get_store().find_all_element_users(FIELDNOTE$12, targetList);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().find_element_user(FIELDNOTE$12, i);
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
                return get_store().count_elements(FIELDNOTE$12);
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
                arraySetterHelper(fieldNoteArray, FIELDNOTE$12);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().find_element_user(FIELDNOTE$12, i);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().insert_element_user(FIELDNOTE$12, i);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().add_element_user(FIELDNOTE$12);
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
                get_store().remove_element(FIELDNOTE$12, i);
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
                    { return InstrumentSetupImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = InstrumentSetupImpl.this.getFeatureArray(i);
                    InstrumentSetupImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { InstrumentSetupImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = InstrumentSetupImpl.this.getFeatureArray(i);
                    InstrumentSetupImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return InstrumentSetupImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$14, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$14, i);
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
                return get_store().count_elements(FEATURE$14);
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
                arraySetterHelper(featureArray, FEATURE$14);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$14, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$14, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$14);
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
                get_store().remove_element(FEATURE$14, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$16);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$16);
                }
                target.set(id);
            }
        }
        
        /**
         * Gets the "instrumentDetailsID" attribute
         */
        public java.lang.String getInstrumentDetailsID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTRUMENTDETAILSID$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "instrumentDetailsID" attribute
         */
        public org.apache.xmlbeans.XmlIDREF xgetInstrumentDetailsID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(INSTRUMENTDETAILSID$18);
                return target;
            }
        }
        
        /**
         * True if has "instrumentDetailsID" attribute
         */
        public boolean isSetInstrumentDetailsID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INSTRUMENTDETAILSID$18) != null;
            }
        }
        
        /**
         * Sets the "instrumentDetailsID" attribute
         */
        public void setInstrumentDetailsID(java.lang.String instrumentDetailsID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTRUMENTDETAILSID$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSTRUMENTDETAILSID$18);
                }
                target.setStringValue(instrumentDetailsID);
            }
        }
        
        /**
         * Sets (as xml) the "instrumentDetailsID" attribute
         */
        public void xsetInstrumentDetailsID(org.apache.xmlbeans.XmlIDREF instrumentDetailsID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(INSTRUMENTDETAILSID$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(INSTRUMENTDETAILSID$18);
                }
                target.set(instrumentDetailsID);
            }
        }
        
        /**
         * Unsets the "instrumentDetailsID" attribute
         */
        public void unsetInstrumentDetailsID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INSTRUMENTDETAILSID$18);
            }
        }
        
        /**
         * Gets the "stationName" attribute
         */
        public java.lang.String getStationName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATIONNAME$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "stationName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStationName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATIONNAME$20);
                return target;
            }
        }
        
        /**
         * Sets the "stationName" attribute
         */
        public void setStationName(java.lang.String stationName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATIONNAME$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATIONNAME$20);
                }
                target.setStringValue(stationName);
            }
        }
        
        /**
         * Sets (as xml) the "stationName" attribute
         */
        public void xsetStationName(org.apache.xmlbeans.XmlString stationName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATIONNAME$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATIONNAME$20);
                }
                target.set(stationName);
            }
        }
        
        /**
         * Gets the "instrumentHeight" attribute
         */
        public double getInstrumentHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTRUMENTHEIGHT$22);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "instrumentHeight" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetInstrumentHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INSTRUMENTHEIGHT$22);
                return target;
            }
        }
        
        /**
         * Sets the "instrumentHeight" attribute
         */
        public void setInstrumentHeight(double instrumentHeight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTRUMENTHEIGHT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSTRUMENTHEIGHT$22);
                }
                target.setDoubleValue(instrumentHeight);
            }
        }
        
        /**
         * Sets (as xml) the "instrumentHeight" attribute
         */
        public void xsetInstrumentHeight(org.apache.xmlbeans.XmlDouble instrumentHeight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INSTRUMENTHEIGHT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(INSTRUMENTHEIGHT$22);
                }
                target.set(instrumentHeight);
            }
        }
        
        /**
         * Gets the "orientationAzimuth" attribute
         */
        public double getOrientationAzimuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENTATIONAZIMUTH$24);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "orientationAzimuth" attribute
         */
        public org.landxml.schema.landXML11.Direction xgetOrientationAzimuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Direction target = null;
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(ORIENTATIONAZIMUTH$24);
                return target;
            }
        }
        
        /**
         * True if has "orientationAzimuth" attribute
         */
        public boolean isSetOrientationAzimuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ORIENTATIONAZIMUTH$24) != null;
            }
        }
        
        /**
         * Sets the "orientationAzimuth" attribute
         */
        public void setOrientationAzimuth(double orientationAzimuth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENTATIONAZIMUTH$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIENTATIONAZIMUTH$24);
                }
                target.setDoubleValue(orientationAzimuth);
            }
        }
        
        /**
         * Sets (as xml) the "orientationAzimuth" attribute
         */
        public void xsetOrientationAzimuth(org.landxml.schema.landXML11.Direction orientationAzimuth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Direction target = null;
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(ORIENTATIONAZIMUTH$24);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Direction)get_store().add_attribute_user(ORIENTATIONAZIMUTH$24);
                }
                target.set(orientationAzimuth);
            }
        }
        
        /**
         * Unsets the "orientationAzimuth" attribute
         */
        public void unsetOrientationAzimuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ORIENTATIONAZIMUTH$24);
            }
        }
        
        /**
         * Gets the "circleAzimuth" attribute
         */
        public double getCircleAzimuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CIRCLEAZIMUTH$26);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "circleAzimuth" attribute
         */
        public org.landxml.schema.landXML11.Direction xgetCircleAzimuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Direction target = null;
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(CIRCLEAZIMUTH$26);
                return target;
            }
        }
        
        /**
         * True if has "circleAzimuth" attribute
         */
        public boolean isSetCircleAzimuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CIRCLEAZIMUTH$26) != null;
            }
        }
        
        /**
         * Sets the "circleAzimuth" attribute
         */
        public void setCircleAzimuth(double circleAzimuth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CIRCLEAZIMUTH$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CIRCLEAZIMUTH$26);
                }
                target.setDoubleValue(circleAzimuth);
            }
        }
        
        /**
         * Sets (as xml) the "circleAzimuth" attribute
         */
        public void xsetCircleAzimuth(org.landxml.schema.landXML11.Direction circleAzimuth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Direction target = null;
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(CIRCLEAZIMUTH$26);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Direction)get_store().add_attribute_user(CIRCLEAZIMUTH$26);
                }
                target.set(circleAzimuth);
            }
        }
        
        /**
         * Unsets the "circleAzimuth" attribute
         */
        public void unsetCircleAzimuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CIRCLEAZIMUTH$26);
            }
        }
    }
}
