/*
 * An XML document type.
 * Localname: InstrumentDetails
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.InstrumentDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one InstrumentDetails(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class InstrumentDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.InstrumentDetailsDocument
{
    
    public InstrumentDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTRUMENTDETAILS$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "InstrumentDetails");
    
    
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
     * An XML InstrumentDetails(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class InstrumentDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.InstrumentDetailsDocument.InstrumentDetails
    {
        
        public InstrumentDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CORRECTIONS$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Corrections");
        private static final javax.xml.namespace.QName FIELDNOTE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FieldNote");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName ID$6 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName EDMACCURACYCONSTANT$8 = 
            new javax.xml.namespace.QName("", "edmAccuracyConstant");
        private static final javax.xml.namespace.QName EDMACCURACYPPM$10 = 
            new javax.xml.namespace.QName("", "edmAccuracyppm");
        private static final javax.xml.namespace.QName EDMVERTOFFSET$12 = 
            new javax.xml.namespace.QName("", "edmVertOffset");
        private static final javax.xml.namespace.QName HORIZANGLEPRECISION$14 = 
            new javax.xml.namespace.QName("", "horizAnglePrecision");
        private static final javax.xml.namespace.QName MANUFACTURER$16 = 
            new javax.xml.namespace.QName("", "manufacturer");
        private static final javax.xml.namespace.QName MODEL$18 = 
            new javax.xml.namespace.QName("", "model");
        private static final javax.xml.namespace.QName SERIALNUMBER$20 = 
            new javax.xml.namespace.QName("", "serialNumber");
        private static final javax.xml.namespace.QName ZENITHANGLEPRECISION$22 = 
            new javax.xml.namespace.QName("", "zenithAnglePrecision");
        private static final javax.xml.namespace.QName CARRIERWAVELENGTH$24 = 
            new javax.xml.namespace.QName("", "carrierWavelength");
        private static final javax.xml.namespace.QName REFRACTIVEINDEX$26 = 
            new javax.xml.namespace.QName("", "refractiveIndex");
        private static final javax.xml.namespace.QName HORIZCOLLIMATION$28 = 
            new javax.xml.namespace.QName("", "horizCollimation");
        private static final javax.xml.namespace.QName VERTCOLLIMATION$30 = 
            new javax.xml.namespace.QName("", "vertCollimation");
        
        
        /**
         * Gets the "Corrections" element
         */
        public org.landxml.schema.landXML11.CorrectionsDocument.Corrections getCorrections()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CorrectionsDocument.Corrections target = null;
                target = (org.landxml.schema.landXML11.CorrectionsDocument.Corrections)get_store().find_element_user(CORRECTIONS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Corrections" element
         */
        public void setCorrections(org.landxml.schema.landXML11.CorrectionsDocument.Corrections corrections)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CorrectionsDocument.Corrections target = null;
                target = (org.landxml.schema.landXML11.CorrectionsDocument.Corrections)get_store().find_element_user(CORRECTIONS$0, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CorrectionsDocument.Corrections)get_store().add_element_user(CORRECTIONS$0);
                }
                target.set(corrections);
            }
        }
        
        /**
         * Appends and returns a new empty "Corrections" element
         */
        public org.landxml.schema.landXML11.CorrectionsDocument.Corrections addNewCorrections()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CorrectionsDocument.Corrections target = null;
                target = (org.landxml.schema.landXML11.CorrectionsDocument.Corrections)get_store().add_element_user(CORRECTIONS$0);
                return target;
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
                    { return InstrumentDetailsImpl.this.getFieldNoteArray(i); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote set(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = InstrumentDetailsImpl.this.getFieldNoteArray(i);
                    InstrumentDetailsImpl.this.setFieldNoteArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                    { InstrumentDetailsImpl.this.insertNewFieldNote(i).set(o); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote remove(int i)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = InstrumentDetailsImpl.this.getFieldNoteArray(i);
                    InstrumentDetailsImpl.this.removeFieldNote(i);
                    return old;
                }
                
                public int size()
                    { return InstrumentDetailsImpl.this.sizeOfFieldNoteArray(); }
                
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
                    { return InstrumentDetailsImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = InstrumentDetailsImpl.this.getFeatureArray(i);
                    InstrumentDetailsImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { InstrumentDetailsImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = InstrumentDetailsImpl.this.getFeatureArray(i);
                    InstrumentDetailsImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return InstrumentDetailsImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "edmAccuracyConstant" attribute
         */
        public double getEdmAccuracyConstant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDMACCURACYCONSTANT$8);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "edmAccuracyConstant" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetEdmAccuracyConstant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EDMACCURACYCONSTANT$8);
                return target;
            }
        }
        
        /**
         * True if has "edmAccuracyConstant" attribute
         */
        public boolean isSetEdmAccuracyConstant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EDMACCURACYCONSTANT$8) != null;
            }
        }
        
        /**
         * Sets the "edmAccuracyConstant" attribute
         */
        public void setEdmAccuracyConstant(double edmAccuracyConstant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDMACCURACYCONSTANT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EDMACCURACYCONSTANT$8);
                }
                target.setDoubleValue(edmAccuracyConstant);
            }
        }
        
        /**
         * Sets (as xml) the "edmAccuracyConstant" attribute
         */
        public void xsetEdmAccuracyConstant(org.apache.xmlbeans.XmlDouble edmAccuracyConstant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EDMACCURACYCONSTANT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EDMACCURACYCONSTANT$8);
                }
                target.set(edmAccuracyConstant);
            }
        }
        
        /**
         * Unsets the "edmAccuracyConstant" attribute
         */
        public void unsetEdmAccuracyConstant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EDMACCURACYCONSTANT$8);
            }
        }
        
        /**
         * Gets the "edmAccuracyppm" attribute
         */
        public double getEdmAccuracyppm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDMACCURACYPPM$10);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "edmAccuracyppm" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetEdmAccuracyppm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EDMACCURACYPPM$10);
                return target;
            }
        }
        
        /**
         * True if has "edmAccuracyppm" attribute
         */
        public boolean isSetEdmAccuracyppm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EDMACCURACYPPM$10) != null;
            }
        }
        
        /**
         * Sets the "edmAccuracyppm" attribute
         */
        public void setEdmAccuracyppm(double edmAccuracyppm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDMACCURACYPPM$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EDMACCURACYPPM$10);
                }
                target.setDoubleValue(edmAccuracyppm);
            }
        }
        
        /**
         * Sets (as xml) the "edmAccuracyppm" attribute
         */
        public void xsetEdmAccuracyppm(org.apache.xmlbeans.XmlDouble edmAccuracyppm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EDMACCURACYPPM$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EDMACCURACYPPM$10);
                }
                target.set(edmAccuracyppm);
            }
        }
        
        /**
         * Unsets the "edmAccuracyppm" attribute
         */
        public void unsetEdmAccuracyppm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EDMACCURACYPPM$10);
            }
        }
        
        /**
         * Gets the "edmVertOffset" attribute
         */
        public double getEdmVertOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDMVERTOFFSET$12);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "edmVertOffset" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetEdmVertOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EDMVERTOFFSET$12);
                return target;
            }
        }
        
        /**
         * True if has "edmVertOffset" attribute
         */
        public boolean isSetEdmVertOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EDMVERTOFFSET$12) != null;
            }
        }
        
        /**
         * Sets the "edmVertOffset" attribute
         */
        public void setEdmVertOffset(double edmVertOffset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDMVERTOFFSET$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EDMVERTOFFSET$12);
                }
                target.setDoubleValue(edmVertOffset);
            }
        }
        
        /**
         * Sets (as xml) the "edmVertOffset" attribute
         */
        public void xsetEdmVertOffset(org.apache.xmlbeans.XmlDouble edmVertOffset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EDMVERTOFFSET$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EDMVERTOFFSET$12);
                }
                target.set(edmVertOffset);
            }
        }
        
        /**
         * Unsets the "edmVertOffset" attribute
         */
        public void unsetEdmVertOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EDMVERTOFFSET$12);
            }
        }
        
        /**
         * Gets the "horizAnglePrecision" attribute
         */
        public double getHorizAnglePrecision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZANGLEPRECISION$14);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "horizAnglePrecision" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetHorizAnglePrecision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HORIZANGLEPRECISION$14);
                return target;
            }
        }
        
        /**
         * True if has "horizAnglePrecision" attribute
         */
        public boolean isSetHorizAnglePrecision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HORIZANGLEPRECISION$14) != null;
            }
        }
        
        /**
         * Sets the "horizAnglePrecision" attribute
         */
        public void setHorizAnglePrecision(double horizAnglePrecision)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZANGLEPRECISION$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORIZANGLEPRECISION$14);
                }
                target.setDoubleValue(horizAnglePrecision);
            }
        }
        
        /**
         * Sets (as xml) the "horizAnglePrecision" attribute
         */
        public void xsetHorizAnglePrecision(org.apache.xmlbeans.XmlDouble horizAnglePrecision)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HORIZANGLEPRECISION$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(HORIZANGLEPRECISION$14);
                }
                target.set(horizAnglePrecision);
            }
        }
        
        /**
         * Unsets the "horizAnglePrecision" attribute
         */
        public void unsetHorizAnglePrecision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HORIZANGLEPRECISION$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANUFACTURER$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MANUFACTURER$16);
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
                return get_store().find_attribute_user(MANUFACTURER$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANUFACTURER$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MANUFACTURER$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MANUFACTURER$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MANUFACTURER$16);
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
                get_store().remove_attribute(MANUFACTURER$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODEL$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODEL$18);
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
                return get_store().find_attribute_user(MODEL$18) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODEL$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODEL$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODEL$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MODEL$18);
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
                get_store().remove_attribute(MODEL$18);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALNUMBER$20);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERIALNUMBER$20);
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
                return get_store().find_attribute_user(SERIALNUMBER$20) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALNUMBER$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERIALNUMBER$20);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERIALNUMBER$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SERIALNUMBER$20);
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
                get_store().remove_attribute(SERIALNUMBER$20);
            }
        }
        
        /**
         * Gets the "zenithAnglePrecision" attribute
         */
        public double getZenithAnglePrecision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZENITHANGLEPRECISION$22);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "zenithAnglePrecision" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetZenithAnglePrecision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ZENITHANGLEPRECISION$22);
                return target;
            }
        }
        
        /**
         * True if has "zenithAnglePrecision" attribute
         */
        public boolean isSetZenithAnglePrecision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ZENITHANGLEPRECISION$22) != null;
            }
        }
        
        /**
         * Sets the "zenithAnglePrecision" attribute
         */
        public void setZenithAnglePrecision(double zenithAnglePrecision)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZENITHANGLEPRECISION$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZENITHANGLEPRECISION$22);
                }
                target.setDoubleValue(zenithAnglePrecision);
            }
        }
        
        /**
         * Sets (as xml) the "zenithAnglePrecision" attribute
         */
        public void xsetZenithAnglePrecision(org.apache.xmlbeans.XmlDouble zenithAnglePrecision)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ZENITHANGLEPRECISION$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ZENITHANGLEPRECISION$22);
                }
                target.set(zenithAnglePrecision);
            }
        }
        
        /**
         * Unsets the "zenithAnglePrecision" attribute
         */
        public void unsetZenithAnglePrecision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ZENITHANGLEPRECISION$22);
            }
        }
        
        /**
         * Gets the "carrierWavelength" attribute
         */
        public double getCarrierWavelength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARRIERWAVELENGTH$24);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "carrierWavelength" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetCarrierWavelength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CARRIERWAVELENGTH$24);
                return target;
            }
        }
        
        /**
         * True if has "carrierWavelength" attribute
         */
        public boolean isSetCarrierWavelength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CARRIERWAVELENGTH$24) != null;
            }
        }
        
        /**
         * Sets the "carrierWavelength" attribute
         */
        public void setCarrierWavelength(double carrierWavelength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARRIERWAVELENGTH$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CARRIERWAVELENGTH$24);
                }
                target.setDoubleValue(carrierWavelength);
            }
        }
        
        /**
         * Sets (as xml) the "carrierWavelength" attribute
         */
        public void xsetCarrierWavelength(org.apache.xmlbeans.XmlDouble carrierWavelength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CARRIERWAVELENGTH$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CARRIERWAVELENGTH$24);
                }
                target.set(carrierWavelength);
            }
        }
        
        /**
         * Unsets the "carrierWavelength" attribute
         */
        public void unsetCarrierWavelength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CARRIERWAVELENGTH$24);
            }
        }
        
        /**
         * Gets the "refractiveIndex" attribute
         */
        public double getRefractiveIndex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRACTIVEINDEX$26);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "refractiveIndex" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetRefractiveIndex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(REFRACTIVEINDEX$26);
                return target;
            }
        }
        
        /**
         * True if has "refractiveIndex" attribute
         */
        public boolean isSetRefractiveIndex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REFRACTIVEINDEX$26) != null;
            }
        }
        
        /**
         * Sets the "refractiveIndex" attribute
         */
        public void setRefractiveIndex(double refractiveIndex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRACTIVEINDEX$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFRACTIVEINDEX$26);
                }
                target.setDoubleValue(refractiveIndex);
            }
        }
        
        /**
         * Sets (as xml) the "refractiveIndex" attribute
         */
        public void xsetRefractiveIndex(org.apache.xmlbeans.XmlDouble refractiveIndex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(REFRACTIVEINDEX$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(REFRACTIVEINDEX$26);
                }
                target.set(refractiveIndex);
            }
        }
        
        /**
         * Unsets the "refractiveIndex" attribute
         */
        public void unsetRefractiveIndex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REFRACTIVEINDEX$26);
            }
        }
        
        /**
         * Gets the "horizCollimation" attribute
         */
        public double getHorizCollimation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZCOLLIMATION$28);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "horizCollimation" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetHorizCollimation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HORIZCOLLIMATION$28);
                return target;
            }
        }
        
        /**
         * True if has "horizCollimation" attribute
         */
        public boolean isSetHorizCollimation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HORIZCOLLIMATION$28) != null;
            }
        }
        
        /**
         * Sets the "horizCollimation" attribute
         */
        public void setHorizCollimation(double horizCollimation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZCOLLIMATION$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORIZCOLLIMATION$28);
                }
                target.setDoubleValue(horizCollimation);
            }
        }
        
        /**
         * Sets (as xml) the "horizCollimation" attribute
         */
        public void xsetHorizCollimation(org.apache.xmlbeans.XmlDouble horizCollimation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HORIZCOLLIMATION$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(HORIZCOLLIMATION$28);
                }
                target.set(horizCollimation);
            }
        }
        
        /**
         * Unsets the "horizCollimation" attribute
         */
        public void unsetHorizCollimation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HORIZCOLLIMATION$28);
            }
        }
        
        /**
         * Gets the "vertCollimation" attribute
         */
        public double getVertCollimation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTCOLLIMATION$30);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "vertCollimation" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetVertCollimation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VERTCOLLIMATION$30);
                return target;
            }
        }
        
        /**
         * True if has "vertCollimation" attribute
         */
        public boolean isSetVertCollimation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VERTCOLLIMATION$30) != null;
            }
        }
        
        /**
         * Sets the "vertCollimation" attribute
         */
        public void setVertCollimation(double vertCollimation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTCOLLIMATION$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTCOLLIMATION$30);
                }
                target.setDoubleValue(vertCollimation);
            }
        }
        
        /**
         * Sets (as xml) the "vertCollimation" attribute
         */
        public void xsetVertCollimation(org.apache.xmlbeans.XmlDouble vertCollimation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VERTCOLLIMATION$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VERTCOLLIMATION$30);
                }
                target.set(vertCollimation);
            }
        }
        
        /**
         * Unsets the "vertCollimation" attribute
         */
        public void unsetVertCollimation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VERTCOLLIMATION$30);
            }
        }
    }
}
