/*
 * An XML document type.
 * Localname: LaserSetup
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.LaserSetupDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one LaserSetup(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class LaserSetupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.LaserSetupDocument
{
    
    public LaserSetupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LASERSETUP$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "LaserSetup");
    
    
    /**
     * Gets the "LaserSetup" element
     */
    public org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup getLaserSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup target = null;
            target = (org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup)get_store().find_element_user(LASERSETUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LaserSetup" element
     */
    public void setLaserSetup(org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup laserSetup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup target = null;
            target = (org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup)get_store().find_element_user(LASERSETUP$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup)get_store().add_element_user(LASERSETUP$0);
            }
            target.set(laserSetup);
        }
    }
    
    /**
     * Appends and returns a new empty "LaserSetup" element
     */
    public org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup addNewLaserSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup target = null;
            target = (org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup)get_store().add_element_user(LASERSETUP$0);
            return target;
        }
    }
    /**
     * An XML LaserSetup(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class LaserSetupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup
    {
        
        public LaserSetupImpl(org.apache.xmlbeans.SchemaType sType)
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
        private static final javax.xml.namespace.QName FIELDNOTE$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FieldNote");
        private static final javax.xml.namespace.QName FEATURE$10 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName ID$12 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName STATIONNAME$14 = 
            new javax.xml.namespace.QName("", "stationName");
        private static final javax.xml.namespace.QName INSTRUMENTHEIGHT$16 = 
            new javax.xml.namespace.QName("", "instrumentHeight");
        private static final javax.xml.namespace.QName LASERDETAILSID$18 = 
            new javax.xml.namespace.QName("", "laserDetailsID");
        private static final javax.xml.namespace.QName MAGDECLINATION$20 = 
            new javax.xml.namespace.QName("", "magDeclination");
        
        
        /**
         * Gets a List of "InstrumentPoint" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PointType> getInstrumentPointList()
        {
            final class InstrumentPointList extends java.util.AbstractList<org.landxml.schema.landXML11.PointType>
            {
                public org.landxml.schema.landXML11.PointType get(int i)
                    { return LaserSetupImpl.this.getInstrumentPointArray(i); }
                
                public org.landxml.schema.landXML11.PointType set(int i, org.landxml.schema.landXML11.PointType o)
                {
                    org.landxml.schema.landXML11.PointType old = LaserSetupImpl.this.getInstrumentPointArray(i);
                    LaserSetupImpl.this.setInstrumentPointArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PointType o)
                    { LaserSetupImpl.this.insertNewInstrumentPoint(i).set(o); }
                
                public org.landxml.schema.landXML11.PointType remove(int i)
                {
                    org.landxml.schema.landXML11.PointType old = LaserSetupImpl.this.getInstrumentPointArray(i);
                    LaserSetupImpl.this.removeInstrumentPoint(i);
                    return old;
                }
                
                public int size()
                    { return LaserSetupImpl.this.sizeOfInstrumentPointArray(); }
                
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
                    { return LaserSetupImpl.this.getBacksightArray(i); }
                
                public org.landxml.schema.landXML11.BacksightDocument.Backsight set(int i, org.landxml.schema.landXML11.BacksightDocument.Backsight o)
                {
                    org.landxml.schema.landXML11.BacksightDocument.Backsight old = LaserSetupImpl.this.getBacksightArray(i);
                    LaserSetupImpl.this.setBacksightArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.BacksightDocument.Backsight o)
                    { LaserSetupImpl.this.insertNewBacksight(i).set(o); }
                
                public org.landxml.schema.landXML11.BacksightDocument.Backsight remove(int i)
                {
                    org.landxml.schema.landXML11.BacksightDocument.Backsight old = LaserSetupImpl.this.getBacksightArray(i);
                    LaserSetupImpl.this.removeBacksight(i);
                    return old;
                }
                
                public int size()
                    { return LaserSetupImpl.this.sizeOfBacksightArray(); }
                
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
                    { return LaserSetupImpl.this.getTargetSetupArray(i); }
                
                public org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup set(int i, org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup o)
                {
                    org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup old = LaserSetupImpl.this.getTargetSetupArray(i);
                    LaserSetupImpl.this.setTargetSetupArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup o)
                    { LaserSetupImpl.this.insertNewTargetSetup(i).set(o); }
                
                public org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup remove(int i)
                {
                    org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup old = LaserSetupImpl.this.getTargetSetupArray(i);
                    LaserSetupImpl.this.removeTargetSetup(i);
                    return old;
                }
                
                public int size()
                    { return LaserSetupImpl.this.sizeOfTargetSetupArray(); }
                
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
                    { return LaserSetupImpl.this.getRawObservationArray(i); }
                
                public org.landxml.schema.landXML11.RawObservationDocument.RawObservation set(int i, org.landxml.schema.landXML11.RawObservationDocument.RawObservation o)
                {
                    org.landxml.schema.landXML11.RawObservationDocument.RawObservation old = LaserSetupImpl.this.getRawObservationArray(i);
                    LaserSetupImpl.this.setRawObservationArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.RawObservationDocument.RawObservation o)
                    { LaserSetupImpl.this.insertNewRawObservation(i).set(o); }
                
                public org.landxml.schema.landXML11.RawObservationDocument.RawObservation remove(int i)
                {
                    org.landxml.schema.landXML11.RawObservationDocument.RawObservation old = LaserSetupImpl.this.getRawObservationArray(i);
                    LaserSetupImpl.this.removeRawObservation(i);
                    return old;
                }
                
                public int size()
                    { return LaserSetupImpl.this.sizeOfRawObservationArray(); }
                
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
         * Gets a List of "FieldNote" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FieldNoteDocument.FieldNote> getFieldNoteList()
        {
            final class FieldNoteList extends java.util.AbstractList<org.landxml.schema.landXML11.FieldNoteDocument.FieldNote>
            {
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote get(int i)
                    { return LaserSetupImpl.this.getFieldNoteArray(i); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote set(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = LaserSetupImpl.this.getFieldNoteArray(i);
                    LaserSetupImpl.this.setFieldNoteArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                    { LaserSetupImpl.this.insertNewFieldNote(i).set(o); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote remove(int i)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = LaserSetupImpl.this.getFieldNoteArray(i);
                    LaserSetupImpl.this.removeFieldNote(i);
                    return old;
                }
                
                public int size()
                    { return LaserSetupImpl.this.sizeOfFieldNoteArray(); }
                
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
                get_store().find_all_element_users(FIELDNOTE$8, targetList);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().find_element_user(FIELDNOTE$8, i);
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
                return get_store().count_elements(FIELDNOTE$8);
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
                arraySetterHelper(fieldNoteArray, FIELDNOTE$8);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().find_element_user(FIELDNOTE$8, i);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().insert_element_user(FIELDNOTE$8, i);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().add_element_user(FIELDNOTE$8);
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
                get_store().remove_element(FIELDNOTE$8, i);
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
                    { return LaserSetupImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = LaserSetupImpl.this.getFeatureArray(i);
                    LaserSetupImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { LaserSetupImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = LaserSetupImpl.this.getFeatureArray(i);
                    LaserSetupImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return LaserSetupImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$10, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$10, i);
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
                return get_store().count_elements(FEATURE$10);
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
                arraySetterHelper(featureArray, FEATURE$10);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$10, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$10, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$10);
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
                get_store().remove_element(FEATURE$10, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$12);
                }
                target.set(id);
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
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(STATIONNAME$14);
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
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(STATIONNAME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(STATIONNAME$14);
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
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(STATIONNAME$14);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTRUMENTHEIGHT$16);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INSTRUMENTHEIGHT$16);
                return target;
            }
        }
        
        /**
         * True if has "instrumentHeight" attribute
         */
        public boolean isSetInstrumentHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INSTRUMENTHEIGHT$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTRUMENTHEIGHT$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSTRUMENTHEIGHT$16);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INSTRUMENTHEIGHT$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(INSTRUMENTHEIGHT$16);
                }
                target.set(instrumentHeight);
            }
        }
        
        /**
         * Unsets the "instrumentHeight" attribute
         */
        public void unsetInstrumentHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INSTRUMENTHEIGHT$16);
            }
        }
        
        /**
         * Gets the "laserDetailsID" attribute
         */
        public java.lang.String getLaserDetailsID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASERDETAILSID$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "laserDetailsID" attribute
         */
        public org.apache.xmlbeans.XmlIDREF xgetLaserDetailsID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(LASERDETAILSID$18);
                return target;
            }
        }
        
        /**
         * True if has "laserDetailsID" attribute
         */
        public boolean isSetLaserDetailsID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LASERDETAILSID$18) != null;
            }
        }
        
        /**
         * Sets the "laserDetailsID" attribute
         */
        public void setLaserDetailsID(java.lang.String laserDetailsID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASERDETAILSID$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASERDETAILSID$18);
                }
                target.setStringValue(laserDetailsID);
            }
        }
        
        /**
         * Sets (as xml) the "laserDetailsID" attribute
         */
        public void xsetLaserDetailsID(org.apache.xmlbeans.XmlIDREF laserDetailsID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(LASERDETAILSID$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(LASERDETAILSID$18);
                }
                target.set(laserDetailsID);
            }
        }
        
        /**
         * Unsets the "laserDetailsID" attribute
         */
        public void unsetLaserDetailsID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LASERDETAILSID$18);
            }
        }
        
        /**
         * Gets the "magDeclination" attribute
         */
        public double getMagDeclination()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAGDECLINATION$20);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "magDeclination" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetMagDeclination()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MAGDECLINATION$20);
                return target;
            }
        }
        
        /**
         * True if has "magDeclination" attribute
         */
        public boolean isSetMagDeclination()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MAGDECLINATION$20) != null;
            }
        }
        
        /**
         * Sets the "magDeclination" attribute
         */
        public void setMagDeclination(double magDeclination)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAGDECLINATION$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAGDECLINATION$20);
                }
                target.setDoubleValue(magDeclination);
            }
        }
        
        /**
         * Sets (as xml) the "magDeclination" attribute
         */
        public void xsetMagDeclination(org.apache.xmlbeans.XmlDouble magDeclination)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MAGDECLINATION$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MAGDECLINATION$20);
                }
                target.set(magDeclination);
            }
        }
        
        /**
         * Unsets the "magDeclination" attribute
         */
        public void unsetMagDeclination()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MAGDECLINATION$20);
            }
        }
    }
}
