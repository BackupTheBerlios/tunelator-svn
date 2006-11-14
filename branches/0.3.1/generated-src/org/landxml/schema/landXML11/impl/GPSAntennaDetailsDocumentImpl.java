/*
 * An XML document type.
 * Localname: GPSAntennaDetails
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.GPSAntennaDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one GPSAntennaDetails(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class GPSAntennaDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.GPSAntennaDetailsDocument
{
    
    public GPSAntennaDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GPSANTENNADETAILS$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "GPSAntennaDetails");
    
    
    /**
     * Gets the "GPSAntennaDetails" element
     */
    public org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails getGPSAntennaDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails target = null;
            target = (org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails)get_store().find_element_user(GPSANTENNADETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails)get_store().find_element_user(GPSANTENNADETAILS$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails)get_store().add_element_user(GPSANTENNADETAILS$0);
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
            target = (org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails)get_store().add_element_user(GPSANTENNADETAILS$0);
            return target;
        }
    }
    /**
     * An XML GPSAntennaDetails(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class GPSAntennaDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails
    {
        
        public GPSAntennaDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MONUMENT$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Monument");
        private static final javax.xml.namespace.QName FIELDNOTE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FieldNote");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName ID$6 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName MANUFACTURER$8 = 
            new javax.xml.namespace.QName("", "manufacturer");
        private static final javax.xml.namespace.QName MODEL$10 = 
            new javax.xml.namespace.QName("", "model");
        private static final javax.xml.namespace.QName SERIALNUMBER$12 = 
            new javax.xml.namespace.QName("", "serialNumber");
        private static final javax.xml.namespace.QName LATITUDE$14 = 
            new javax.xml.namespace.QName("", "latitude");
        private static final javax.xml.namespace.QName LONGITUDE$16 = 
            new javax.xml.namespace.QName("", "longitude");
        private static final javax.xml.namespace.QName ALTITUDE$18 = 
            new javax.xml.namespace.QName("", "altitude");
        private static final javax.xml.namespace.QName ELLIPSIODNALHEIGHT$20 = 
            new javax.xml.namespace.QName("", "ellipsiodnalHeight");
        private static final javax.xml.namespace.QName ORTHOMETRICHEIGHT$22 = 
            new javax.xml.namespace.QName("", "orthometricHeight");
        
        
        /**
         * Gets a List of "Monument" elements
         */
        public java.util.List<org.landxml.schema.landXML11.MonumentDocument.Monument> getMonumentList()
        {
            final class MonumentList extends java.util.AbstractList<org.landxml.schema.landXML11.MonumentDocument.Monument>
            {
                public org.landxml.schema.landXML11.MonumentDocument.Monument get(int i)
                    { return GPSAntennaDetailsImpl.this.getMonumentArray(i); }
                
                public org.landxml.schema.landXML11.MonumentDocument.Monument set(int i, org.landxml.schema.landXML11.MonumentDocument.Monument o)
                {
                    org.landxml.schema.landXML11.MonumentDocument.Monument old = GPSAntennaDetailsImpl.this.getMonumentArray(i);
                    GPSAntennaDetailsImpl.this.setMonumentArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.MonumentDocument.Monument o)
                    { GPSAntennaDetailsImpl.this.insertNewMonument(i).set(o); }
                
                public org.landxml.schema.landXML11.MonumentDocument.Monument remove(int i)
                {
                    org.landxml.schema.landXML11.MonumentDocument.Monument old = GPSAntennaDetailsImpl.this.getMonumentArray(i);
                    GPSAntennaDetailsImpl.this.removeMonument(i);
                    return old;
                }
                
                public int size()
                    { return GPSAntennaDetailsImpl.this.sizeOfMonumentArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new MonumentList();
            }
        }
        
        /**
         * Gets array of all "Monument" elements
         */
        public org.landxml.schema.landXML11.MonumentDocument.Monument[] getMonumentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MONUMENT$0, targetList);
                org.landxml.schema.landXML11.MonumentDocument.Monument[] result = new org.landxml.schema.landXML11.MonumentDocument.Monument[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Monument" element
         */
        public org.landxml.schema.landXML11.MonumentDocument.Monument getMonumentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentDocument.Monument target = null;
                target = (org.landxml.schema.landXML11.MonumentDocument.Monument)get_store().find_element_user(MONUMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Monument" element
         */
        public int sizeOfMonumentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MONUMENT$0);
            }
        }
        
        /**
         * Sets array of all "Monument" element
         */
        public void setMonumentArray(org.landxml.schema.landXML11.MonumentDocument.Monument[] monumentArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(monumentArray, MONUMENT$0);
            }
        }
        
        /**
         * Sets ith "Monument" element
         */
        public void setMonumentArray(int i, org.landxml.schema.landXML11.MonumentDocument.Monument monument)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentDocument.Monument target = null;
                target = (org.landxml.schema.landXML11.MonumentDocument.Monument)get_store().find_element_user(MONUMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(monument);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Monument" element
         */
        public org.landxml.schema.landXML11.MonumentDocument.Monument insertNewMonument(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentDocument.Monument target = null;
                target = (org.landxml.schema.landXML11.MonumentDocument.Monument)get_store().insert_element_user(MONUMENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Monument" element
         */
        public org.landxml.schema.landXML11.MonumentDocument.Monument addNewMonument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentDocument.Monument target = null;
                target = (org.landxml.schema.landXML11.MonumentDocument.Monument)get_store().add_element_user(MONUMENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Monument" element
         */
        public void removeMonument(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MONUMENT$0, i);
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
                    { return GPSAntennaDetailsImpl.this.getFieldNoteArray(i); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote set(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = GPSAntennaDetailsImpl.this.getFieldNoteArray(i);
                    GPSAntennaDetailsImpl.this.setFieldNoteArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                    { GPSAntennaDetailsImpl.this.insertNewFieldNote(i).set(o); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote remove(int i)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = GPSAntennaDetailsImpl.this.getFieldNoteArray(i);
                    GPSAntennaDetailsImpl.this.removeFieldNote(i);
                    return old;
                }
                
                public int size()
                    { return GPSAntennaDetailsImpl.this.sizeOfFieldNoteArray(); }
                
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
                    { return GPSAntennaDetailsImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = GPSAntennaDetailsImpl.this.getFeatureArray(i);
                    GPSAntennaDetailsImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { GPSAntennaDetailsImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = GPSAntennaDetailsImpl.this.getFeatureArray(i);
                    GPSAntennaDetailsImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return GPSAntennaDetailsImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$6);
                }
                target.set(id);
            }
        }
        
        /**
         * Gets the "manufacturer" attribute
         */
        public java.lang.String getManufacturer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANUFACTURER$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "manufacturer" attribute
         */
        public org.apache.xmlbeans.XmlString xgetManufacturer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MANUFACTURER$8);
                return target;
            }
        }
        
        /**
         * True if has "manufacturer" attribute
         */
        public boolean isSetManufacturer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MANUFACTURER$8) != null;
            }
        }
        
        /**
         * Sets the "manufacturer" attribute
         */
        public void setManufacturer(java.lang.String manufacturer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANUFACTURER$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MANUFACTURER$8);
                }
                target.setStringValue(manufacturer);
            }
        }
        
        /**
         * Sets (as xml) the "manufacturer" attribute
         */
        public void xsetManufacturer(org.apache.xmlbeans.XmlString manufacturer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MANUFACTURER$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MANUFACTURER$8);
                }
                target.set(manufacturer);
            }
        }
        
        /**
         * Unsets the "manufacturer" attribute
         */
        public void unsetManufacturer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MANUFACTURER$8);
            }
        }
        
        /**
         * Gets the "model" attribute
         */
        public java.lang.String getModel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODEL$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "model" attribute
         */
        public org.apache.xmlbeans.XmlString xgetModel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODEL$10);
                return target;
            }
        }
        
        /**
         * True if has "model" attribute
         */
        public boolean isSetModel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MODEL$10) != null;
            }
        }
        
        /**
         * Sets the "model" attribute
         */
        public void setModel(java.lang.String model)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODEL$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODEL$10);
                }
                target.setStringValue(model);
            }
        }
        
        /**
         * Sets (as xml) the "model" attribute
         */
        public void xsetModel(org.apache.xmlbeans.XmlString model)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODEL$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MODEL$10);
                }
                target.set(model);
            }
        }
        
        /**
         * Unsets the "model" attribute
         */
        public void unsetModel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MODEL$10);
            }
        }
        
        /**
         * Gets the "serialNumber" attribute
         */
        public java.lang.String getSerialNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALNUMBER$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "serialNumber" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSerialNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERIALNUMBER$12);
                return target;
            }
        }
        
        /**
         * True if has "serialNumber" attribute
         */
        public boolean isSetSerialNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SERIALNUMBER$12) != null;
            }
        }
        
        /**
         * Sets the "serialNumber" attribute
         */
        public void setSerialNumber(java.lang.String serialNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALNUMBER$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERIALNUMBER$12);
                }
                target.setStringValue(serialNumber);
            }
        }
        
        /**
         * Sets (as xml) the "serialNumber" attribute
         */
        public void xsetSerialNumber(org.apache.xmlbeans.XmlString serialNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERIALNUMBER$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SERIALNUMBER$12);
                }
                target.set(serialNumber);
            }
        }
        
        /**
         * Unsets the "serialNumber" attribute
         */
        public void unsetSerialNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SERIALNUMBER$12);
            }
        }
        
        /**
         * Gets the "latitude" attribute
         */
        public double getLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATITUDE$14);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "latitude" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LATITUDE$14);
                return target;
            }
        }
        
        /**
         * True if has "latitude" attribute
         */
        public boolean isSetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LATITUDE$14) != null;
            }
        }
        
        /**
         * Sets the "latitude" attribute
         */
        public void setLatitude(double latitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATITUDE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LATITUDE$14);
                }
                target.setDoubleValue(latitude);
            }
        }
        
        /**
         * Sets (as xml) the "latitude" attribute
         */
        public void xsetLatitude(org.apache.xmlbeans.XmlDouble latitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LATITUDE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LATITUDE$14);
                }
                target.set(latitude);
            }
        }
        
        /**
         * Unsets the "latitude" attribute
         */
        public void unsetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LATITUDE$14);
            }
        }
        
        /**
         * Gets the "longitude" attribute
         */
        public double getLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LONGITUDE$16);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "longitude" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LONGITUDE$16);
                return target;
            }
        }
        
        /**
         * True if has "longitude" attribute
         */
        public boolean isSetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LONGITUDE$16) != null;
            }
        }
        
        /**
         * Sets the "longitude" attribute
         */
        public void setLongitude(double longitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LONGITUDE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LONGITUDE$16);
                }
                target.setDoubleValue(longitude);
            }
        }
        
        /**
         * Sets (as xml) the "longitude" attribute
         */
        public void xsetLongitude(org.apache.xmlbeans.XmlDouble longitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LONGITUDE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LONGITUDE$16);
                }
                target.set(longitude);
            }
        }
        
        /**
         * Unsets the "longitude" attribute
         */
        public void unsetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LONGITUDE$16);
            }
        }
        
        /**
         * Gets the "altitude" attribute
         */
        public double getAltitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALTITUDE$18);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "altitude" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetAltitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ALTITUDE$18);
                return target;
            }
        }
        
        /**
         * True if has "altitude" attribute
         */
        public boolean isSetAltitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ALTITUDE$18) != null;
            }
        }
        
        /**
         * Sets the "altitude" attribute
         */
        public void setAltitude(double altitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALTITUDE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALTITUDE$18);
                }
                target.setDoubleValue(altitude);
            }
        }
        
        /**
         * Sets (as xml) the "altitude" attribute
         */
        public void xsetAltitude(org.apache.xmlbeans.XmlDouble altitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ALTITUDE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ALTITUDE$18);
                }
                target.set(altitude);
            }
        }
        
        /**
         * Unsets the "altitude" attribute
         */
        public void unsetAltitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ALTITUDE$18);
            }
        }
        
        /**
         * Gets the "ellipsiodnalHeight" attribute
         */
        public double getEllipsiodnalHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELLIPSIODNALHEIGHT$20);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "ellipsiodnalHeight" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetEllipsiodnalHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ELLIPSIODNALHEIGHT$20);
                return target;
            }
        }
        
        /**
         * True if has "ellipsiodnalHeight" attribute
         */
        public boolean isSetEllipsiodnalHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ELLIPSIODNALHEIGHT$20) != null;
            }
        }
        
        /**
         * Sets the "ellipsiodnalHeight" attribute
         */
        public void setEllipsiodnalHeight(double ellipsiodnalHeight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELLIPSIODNALHEIGHT$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELLIPSIODNALHEIGHT$20);
                }
                target.setDoubleValue(ellipsiodnalHeight);
            }
        }
        
        /**
         * Sets (as xml) the "ellipsiodnalHeight" attribute
         */
        public void xsetEllipsiodnalHeight(org.apache.xmlbeans.XmlDouble ellipsiodnalHeight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ELLIPSIODNALHEIGHT$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ELLIPSIODNALHEIGHT$20);
                }
                target.set(ellipsiodnalHeight);
            }
        }
        
        /**
         * Unsets the "ellipsiodnalHeight" attribute
         */
        public void unsetEllipsiodnalHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ELLIPSIODNALHEIGHT$20);
            }
        }
        
        /**
         * Gets the "orthometricHeight" attribute
         */
        public double getOrthometricHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORTHOMETRICHEIGHT$22);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "orthometricHeight" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetOrthometricHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ORTHOMETRICHEIGHT$22);
                return target;
            }
        }
        
        /**
         * True if has "orthometricHeight" attribute
         */
        public boolean isSetOrthometricHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ORTHOMETRICHEIGHT$22) != null;
            }
        }
        
        /**
         * Sets the "orthometricHeight" attribute
         */
        public void setOrthometricHeight(double orthometricHeight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORTHOMETRICHEIGHT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORTHOMETRICHEIGHT$22);
                }
                target.setDoubleValue(orthometricHeight);
            }
        }
        
        /**
         * Sets (as xml) the "orthometricHeight" attribute
         */
        public void xsetOrthometricHeight(org.apache.xmlbeans.XmlDouble orthometricHeight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ORTHOMETRICHEIGHT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ORTHOMETRICHEIGHT$22);
                }
                target.set(orthometricHeight);
            }
        }
        
        /**
         * Unsets the "orthometricHeight" attribute
         */
        public void unsetOrthometricHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ORTHOMETRICHEIGHT$22);
            }
        }
    }
}
