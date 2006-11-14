/*
 * An XML document type.
 * Localname: Equipment
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.EquipmentDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Equipment(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class EquipmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.EquipmentDocument
{
    
    public EquipmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EQUIPMENT$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Equipment");
    
    
    /**
     * Gets the "Equipment" element
     */
    public org.landxml.schema.landXML11.EquipmentDocument.Equipment getEquipment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.EquipmentDocument.Equipment target = null;
            target = (org.landxml.schema.landXML11.EquipmentDocument.Equipment)get_store().find_element_user(EQUIPMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Equipment" element
     */
    public void setEquipment(org.landxml.schema.landXML11.EquipmentDocument.Equipment equipment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.EquipmentDocument.Equipment target = null;
            target = (org.landxml.schema.landXML11.EquipmentDocument.Equipment)get_store().find_element_user(EQUIPMENT$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.EquipmentDocument.Equipment)get_store().add_element_user(EQUIPMENT$0);
            }
            target.set(equipment);
        }
    }
    
    /**
     * Appends and returns a new empty "Equipment" element
     */
    public org.landxml.schema.landXML11.EquipmentDocument.Equipment addNewEquipment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.EquipmentDocument.Equipment target = null;
            target = (org.landxml.schema.landXML11.EquipmentDocument.Equipment)get_store().add_element_user(EQUIPMENT$0);
            return target;
        }
    }
    /**
     * An XML Equipment(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class EquipmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.EquipmentDocument.Equipment
    {
        
        public EquipmentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INSTRUMENTDETAILS$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "InstrumentDetails");
        private static final javax.xml.namespace.QName LASERDETAILS$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "LaserDetails");
        private static final javax.xml.namespace.QName GPSRECEIVERDETAILS$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "GPSReceiverDetails");
        private static final javax.xml.namespace.QName GPSANTENNADETAILS$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "GPSAntennaDetails");
        private static final javax.xml.namespace.QName FIELDNOTE$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FieldNote");
        private static final javax.xml.namespace.QName FEATURE$10 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        
        
        /**
         * Gets the "InstrumentDetails" element
         */
        public org.landxml.schema.landXML11.InstrumentDetailsDocument.InstrumentDetails getInstrumentDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.InstrumentDetailsDocument.InstrumentDetails target = null;
                target = (org.landxml.schema.landXML11.InstrumentDetailsDocument.InstrumentDetails)get_store().find_element_user(INSTRUMENTDETAILS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "InstrumentDetails" element
         */
        public boolean isSetInstrumentDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INSTRUMENTDETAILS$0) != 0;
            }
        }
        
        /**
         * Sets the "InstrumentDetails" element
         */
        public void setInstrumentDetails(org.landxml.schema.landXML11.InstrumentDetailsDocument.InstrumentDetails instrumentDetails)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.InstrumentDetailsDocument.InstrumentDetails target = null;
                target = (org.landxml.schema.landXML11.InstrumentDetailsDocument.InstrumentDetails)get_store().find_element_user(INSTRUMENTDETAILS$0, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.InstrumentDetailsDocument.InstrumentDetails)get_store().add_element_user(INSTRUMENTDETAILS$0);
                }
                target.set(instrumentDetails);
            }
        }
        
        /**
         * Appends and returns a new empty "InstrumentDetails" element
         */
        public org.landxml.schema.landXML11.InstrumentDetailsDocument.InstrumentDetails addNewInstrumentDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.InstrumentDetailsDocument.InstrumentDetails target = null;
                target = (org.landxml.schema.landXML11.InstrumentDetailsDocument.InstrumentDetails)get_store().add_element_user(INSTRUMENTDETAILS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "InstrumentDetails" element
         */
        public void unsetInstrumentDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INSTRUMENTDETAILS$0, 0);
            }
        }
        
        /**
         * Gets the "LaserDetails" element
         */
        public org.landxml.schema.landXML11.LaserDetailsDocument.LaserDetails getLaserDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LaserDetailsDocument.LaserDetails target = null;
                target = (org.landxml.schema.landXML11.LaserDetailsDocument.LaserDetails)get_store().find_element_user(LASERDETAILS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "LaserDetails" element
         */
        public boolean isSetLaserDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LASERDETAILS$2) != 0;
            }
        }
        
        /**
         * Sets the "LaserDetails" element
         */
        public void setLaserDetails(org.landxml.schema.landXML11.LaserDetailsDocument.LaserDetails laserDetails)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LaserDetailsDocument.LaserDetails target = null;
                target = (org.landxml.schema.landXML11.LaserDetailsDocument.LaserDetails)get_store().find_element_user(LASERDETAILS$2, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.LaserDetailsDocument.LaserDetails)get_store().add_element_user(LASERDETAILS$2);
                }
                target.set(laserDetails);
            }
        }
        
        /**
         * Appends and returns a new empty "LaserDetails" element
         */
        public org.landxml.schema.landXML11.LaserDetailsDocument.LaserDetails addNewLaserDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LaserDetailsDocument.LaserDetails target = null;
                target = (org.landxml.schema.landXML11.LaserDetailsDocument.LaserDetails)get_store().add_element_user(LASERDETAILS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "LaserDetails" element
         */
        public void unsetLaserDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LASERDETAILS$2, 0);
            }
        }
        
        /**
         * Gets the "GPSReceiverDetails" element
         */
        public org.landxml.schema.landXML11.GPSReceiverDetailsDocument.GPSReceiverDetails getGPSReceiverDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSReceiverDetailsDocument.GPSReceiverDetails target = null;
                target = (org.landxml.schema.landXML11.GPSReceiverDetailsDocument.GPSReceiverDetails)get_store().find_element_user(GPSRECEIVERDETAILS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GPSReceiverDetails" element
         */
        public boolean isSetGPSReceiverDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GPSRECEIVERDETAILS$4) != 0;
            }
        }
        
        /**
         * Sets the "GPSReceiverDetails" element
         */
        public void setGPSReceiverDetails(org.landxml.schema.landXML11.GPSReceiverDetailsDocument.GPSReceiverDetails gpsReceiverDetails)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSReceiverDetailsDocument.GPSReceiverDetails target = null;
                target = (org.landxml.schema.landXML11.GPSReceiverDetailsDocument.GPSReceiverDetails)get_store().find_element_user(GPSRECEIVERDETAILS$4, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.GPSReceiverDetailsDocument.GPSReceiverDetails)get_store().add_element_user(GPSRECEIVERDETAILS$4);
                }
                target.set(gpsReceiverDetails);
            }
        }
        
        /**
         * Appends and returns a new empty "GPSReceiverDetails" element
         */
        public org.landxml.schema.landXML11.GPSReceiverDetailsDocument.GPSReceiverDetails addNewGPSReceiverDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSReceiverDetailsDocument.GPSReceiverDetails target = null;
                target = (org.landxml.schema.landXML11.GPSReceiverDetailsDocument.GPSReceiverDetails)get_store().add_element_user(GPSRECEIVERDETAILS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "GPSReceiverDetails" element
         */
        public void unsetGPSReceiverDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GPSRECEIVERDETAILS$4, 0);
            }
        }
        
        /**
         * Gets the "GPSAntennaDetails" element
         */
        public org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails getGPSAntennaDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails target = null;
                target = (org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails)get_store().find_element_user(GPSANTENNADETAILS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GPSAntennaDetails" element
         */
        public boolean isSetGPSAntennaDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GPSANTENNADETAILS$6) != 0;
            }
        }
        
        /**
         * Sets the "GPSAntennaDetails" element
         */
        public void setGPSAntennaDetails(org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails gpsAntennaDetails)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails target = null;
                target = (org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails)get_store().find_element_user(GPSANTENNADETAILS$6, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails)get_store().add_element_user(GPSANTENNADETAILS$6);
                }
                target.set(gpsAntennaDetails);
            }
        }
        
        /**
         * Appends and returns a new empty "GPSAntennaDetails" element
         */
        public org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails addNewGPSAntennaDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails target = null;
                target = (org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails)get_store().add_element_user(GPSANTENNADETAILS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "GPSAntennaDetails" element
         */
        public void unsetGPSAntennaDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GPSANTENNADETAILS$6, 0);
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
                    { return EquipmentImpl.this.getFieldNoteArray(i); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote set(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = EquipmentImpl.this.getFieldNoteArray(i);
                    EquipmentImpl.this.setFieldNoteArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                    { EquipmentImpl.this.insertNewFieldNote(i).set(o); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote remove(int i)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = EquipmentImpl.this.getFieldNoteArray(i);
                    EquipmentImpl.this.removeFieldNote(i);
                    return old;
                }
                
                public int size()
                    { return EquipmentImpl.this.sizeOfFieldNoteArray(); }
                
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
                    { return EquipmentImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = EquipmentImpl.this.getFeatureArray(i);
                    EquipmentImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { EquipmentImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = EquipmentImpl.this.getFeatureArray(i);
                    EquipmentImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return EquipmentImpl.this.sizeOfFeatureArray(); }
                
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
    }
}
