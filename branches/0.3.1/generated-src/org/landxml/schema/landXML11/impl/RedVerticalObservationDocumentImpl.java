/*
 * An XML document type.
 * Localname: RedVerticalObservation
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.RedVerticalObservationDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one RedVerticalObservation(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class RedVerticalObservationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.RedVerticalObservationDocument
{
    
    public RedVerticalObservationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REDVERTICALOBSERVATION$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "RedVerticalObservation");
    
    
    /**
     * Gets the "RedVerticalObservation" element
     */
    public org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation getRedVerticalObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation target = null;
            target = (org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation)get_store().find_element_user(REDVERTICALOBSERVATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RedVerticalObservation" element
     */
    public void setRedVerticalObservation(org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation redVerticalObservation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation target = null;
            target = (org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation)get_store().find_element_user(REDVERTICALOBSERVATION$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation)get_store().add_element_user(REDVERTICALOBSERVATION$0);
            }
            target.set(redVerticalObservation);
        }
    }
    
    /**
     * Appends and returns a new empty "RedVerticalObservation" element
     */
    public org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation addNewRedVerticalObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation target = null;
            target = (org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation)get_store().add_element_user(REDVERTICALOBSERVATION$0);
            return target;
        }
    }
    /**
     * An XML RedVerticalObservation(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class RedVerticalObservationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation
    {
        
        public RedVerticalObservationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELDNOTE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FieldNote");
        private static final javax.xml.namespace.QName FEATURE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName DESC$4 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName NAME$6 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName STATE$8 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName OID$10 = 
            new javax.xml.namespace.QName("", "oID");
        private static final javax.xml.namespace.QName PURPOSE$12 = 
            new javax.xml.namespace.QName("", "purpose");
        private static final javax.xml.namespace.QName SETUPID$14 = 
            new javax.xml.namespace.QName("", "setupID");
        private static final javax.xml.namespace.QName DATE$16 = 
            new javax.xml.namespace.QName("", "date");
        private static final javax.xml.namespace.QName EQUIPMENTUSED$18 = 
            new javax.xml.namespace.QName("", "equipmentUsed");
        private static final javax.xml.namespace.QName HEIGHT$20 = 
            new javax.xml.namespace.QName("", "height");
        private static final javax.xml.namespace.QName VERTICALADJUSTMENT$22 = 
            new javax.xml.namespace.QName("", "verticalAdjustment");
        private static final javax.xml.namespace.QName VERTICALFIX$24 = 
            new javax.xml.namespace.QName("", "verticalFix");
        private static final javax.xml.namespace.QName GEOSPHOID$26 = 
            new javax.xml.namespace.QName("", "geosphoid");
        private static final javax.xml.namespace.QName GSDATUM$28 = 
            new javax.xml.namespace.QName("", "gsDatum");
        private static final javax.xml.namespace.QName GSMODEL$30 = 
            new javax.xml.namespace.QName("", "gsModel");
        private static final javax.xml.namespace.QName GSMETHOD$32 = 
            new javax.xml.namespace.QName("", "gsMethod");
        private static final javax.xml.namespace.QName ORIGINMARK$34 = 
            new javax.xml.namespace.QName("", "originMark");
        private static final javax.xml.namespace.QName VERTICALDATUM$36 = 
            new javax.xml.namespace.QName("", "verticalDatum");
        private static final javax.xml.namespace.QName LOCALUNCERTAINITY$38 = 
            new javax.xml.namespace.QName("", "localUncertainity");
        private static final javax.xml.namespace.QName CLASS1$40 = 
            new javax.xml.namespace.QName("", "class");
        private static final javax.xml.namespace.QName ORDER$42 = 
            new javax.xml.namespace.QName("", "order");
        private static final javax.xml.namespace.QName POSITIONALUNCERTAINITY$44 = 
            new javax.xml.namespace.QName("", "positionalUncertainity");
        
        
        /**
         * Gets a List of "FieldNote" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FieldNoteDocument.FieldNote> getFieldNoteList()
        {
            final class FieldNoteList extends java.util.AbstractList<org.landxml.schema.landXML11.FieldNoteDocument.FieldNote>
            {
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote get(int i)
                    { return RedVerticalObservationImpl.this.getFieldNoteArray(i); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote set(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = RedVerticalObservationImpl.this.getFieldNoteArray(i);
                    RedVerticalObservationImpl.this.setFieldNoteArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                    { RedVerticalObservationImpl.this.insertNewFieldNote(i).set(o); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote remove(int i)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = RedVerticalObservationImpl.this.getFieldNoteArray(i);
                    RedVerticalObservationImpl.this.removeFieldNote(i);
                    return old;
                }
                
                public int size()
                    { return RedVerticalObservationImpl.this.sizeOfFieldNoteArray(); }
                
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
                get_store().find_all_element_users(FIELDNOTE$0, targetList);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().find_element_user(FIELDNOTE$0, i);
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
                return get_store().count_elements(FIELDNOTE$0);
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
                arraySetterHelper(fieldNoteArray, FIELDNOTE$0);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().find_element_user(FIELDNOTE$0, i);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().insert_element_user(FIELDNOTE$0, i);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().add_element_user(FIELDNOTE$0);
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
                get_store().remove_element(FIELDNOTE$0, i);
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
                    { return RedVerticalObservationImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = RedVerticalObservationImpl.this.getFeatureArray(i);
                    RedVerticalObservationImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { RedVerticalObservationImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = RedVerticalObservationImpl.this.getFeatureArray(i);
                    RedVerticalObservationImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return RedVerticalObservationImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$2, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$2, i);
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
                return get_store().count_elements(FEATURE$2);
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
                arraySetterHelper(featureArray, FEATURE$2);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$2, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$2, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$2);
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
                get_store().remove_element(FEATURE$2, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$4);
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
                return get_store().find_attribute_user(DESC$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$4);
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
                get_store().remove_attribute(DESC$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "state" attribute
         */
        public java.lang.String getState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "state" attribute
         */
        public org.apache.xmlbeans.XmlString xgetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATE$8);
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
                return get_store().find_attribute_user(STATE$8) != null;
            }
        }
        
        /**
         * Sets the "state" attribute
         */
        public void setState(java.lang.String state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$8);
                }
                target.setStringValue(state);
            }
        }
        
        /**
         * Sets (as xml) the "state" attribute
         */
        public void xsetState(org.apache.xmlbeans.XmlString state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATE$8);
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
                get_store().remove_attribute(STATE$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$10);
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
                return get_store().find_attribute_user(OID$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OID$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OID$10);
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
                get_store().remove_attribute(OID$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PURPOSE$12);
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
                target = (org.landxml.schema.landXML11.PurposeType)get_store().find_attribute_user(PURPOSE$12);
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
                return get_store().find_attribute_user(PURPOSE$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PURPOSE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PURPOSE$12);
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
                target = (org.landxml.schema.landXML11.PurposeType)get_store().find_attribute_user(PURPOSE$12);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PurposeType)get_store().add_attribute_user(PURPOSE$12);
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
                get_store().remove_attribute(PURPOSE$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETUPID$14);
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
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(SETUPID$14);
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
                return get_store().find_attribute_user(SETUPID$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETUPID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETUPID$14);
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
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(SETUPID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(SETUPID$14);
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
                get_store().remove_attribute(SETUPID$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$16);
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
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(DATE$16);
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
                return get_store().find_attribute_user(DATE$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATE$16);
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
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(DATE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(DATE$16);
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
                get_store().remove_attribute(DATE$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EQUIPMENTUSED$18);
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
                target = (org.landxml.schema.landXML11.EquipmentType)get_store().find_attribute_user(EQUIPMENTUSED$18);
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
                return get_store().find_attribute_user(EQUIPMENTUSED$18) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EQUIPMENTUSED$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EQUIPMENTUSED$18);
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
                target = (org.landxml.schema.landXML11.EquipmentType)get_store().find_attribute_user(EQUIPMENTUSED$18);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.EquipmentType)get_store().add_attribute_user(EQUIPMENTUSED$18);
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
                get_store().remove_attribute(EQUIPMENTUSED$18);
            }
        }
        
        /**
         * Gets the "height" attribute
         */
        public double getHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEIGHT$20);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "height" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HEIGHT$20);
                return target;
            }
        }
        
        /**
         * True if has "height" attribute
         */
        public boolean isSetHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HEIGHT$20) != null;
            }
        }
        
        /**
         * Sets the "height" attribute
         */
        public void setHeight(double height)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEIGHT$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEIGHT$20);
                }
                target.setDoubleValue(height);
            }
        }
        
        /**
         * Sets (as xml) the "height" attribute
         */
        public void xsetHeight(org.apache.xmlbeans.XmlDouble height)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HEIGHT$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(HEIGHT$20);
                }
                target.set(height);
            }
        }
        
        /**
         * Unsets the "height" attribute
         */
        public void unsetHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HEIGHT$20);
            }
        }
        
        /**
         * Gets the "verticalAdjustment" attribute
         */
        public java.lang.String getVerticalAdjustment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALADJUSTMENT$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "verticalAdjustment" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVerticalAdjustment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERTICALADJUSTMENT$22);
                return target;
            }
        }
        
        /**
         * True if has "verticalAdjustment" attribute
         */
        public boolean isSetVerticalAdjustment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VERTICALADJUSTMENT$22) != null;
            }
        }
        
        /**
         * Sets the "verticalAdjustment" attribute
         */
        public void setVerticalAdjustment(java.lang.String verticalAdjustment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALADJUSTMENT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTICALADJUSTMENT$22);
                }
                target.setStringValue(verticalAdjustment);
            }
        }
        
        /**
         * Sets (as xml) the "verticalAdjustment" attribute
         */
        public void xsetVerticalAdjustment(org.apache.xmlbeans.XmlString verticalAdjustment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERTICALADJUSTMENT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERTICALADJUSTMENT$22);
                }
                target.set(verticalAdjustment);
            }
        }
        
        /**
         * Unsets the "verticalAdjustment" attribute
         */
        public void unsetVerticalAdjustment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VERTICALADJUSTMENT$22);
            }
        }
        
        /**
         * Gets the "verticalFix" attribute
         */
        public java.lang.String getVerticalFix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALFIX$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "verticalFix" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVerticalFix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERTICALFIX$24);
                return target;
            }
        }
        
        /**
         * True if has "verticalFix" attribute
         */
        public boolean isSetVerticalFix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VERTICALFIX$24) != null;
            }
        }
        
        /**
         * Sets the "verticalFix" attribute
         */
        public void setVerticalFix(java.lang.String verticalFix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALFIX$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTICALFIX$24);
                }
                target.setStringValue(verticalFix);
            }
        }
        
        /**
         * Sets (as xml) the "verticalFix" attribute
         */
        public void xsetVerticalFix(org.apache.xmlbeans.XmlString verticalFix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERTICALFIX$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERTICALFIX$24);
                }
                target.set(verticalFix);
            }
        }
        
        /**
         * Unsets the "verticalFix" attribute
         */
        public void unsetVerticalFix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VERTICALFIX$24);
            }
        }
        
        /**
         * Gets the "geosphoid" attribute
         */
        public double getGeosphoid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOSPHOID$26);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "geosphoid" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetGeosphoid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(GEOSPHOID$26);
                return target;
            }
        }
        
        /**
         * True if has "geosphoid" attribute
         */
        public boolean isSetGeosphoid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GEOSPHOID$26) != null;
            }
        }
        
        /**
         * Sets the "geosphoid" attribute
         */
        public void setGeosphoid(double geosphoid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOSPHOID$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GEOSPHOID$26);
                }
                target.setDoubleValue(geosphoid);
            }
        }
        
        /**
         * Sets (as xml) the "geosphoid" attribute
         */
        public void xsetGeosphoid(org.apache.xmlbeans.XmlDouble geosphoid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(GEOSPHOID$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(GEOSPHOID$26);
                }
                target.set(geosphoid);
            }
        }
        
        /**
         * Unsets the "geosphoid" attribute
         */
        public void unsetGeosphoid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GEOSPHOID$26);
            }
        }
        
        /**
         * Gets the "gsDatum" attribute
         */
        public java.lang.String getGsDatum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GSDATUM$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "gsDatum" attribute
         */
        public org.apache.xmlbeans.XmlString xgetGsDatum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GSDATUM$28);
                return target;
            }
        }
        
        /**
         * True if has "gsDatum" attribute
         */
        public boolean isSetGsDatum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GSDATUM$28) != null;
            }
        }
        
        /**
         * Sets the "gsDatum" attribute
         */
        public void setGsDatum(java.lang.String gsDatum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GSDATUM$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GSDATUM$28);
                }
                target.setStringValue(gsDatum);
            }
        }
        
        /**
         * Sets (as xml) the "gsDatum" attribute
         */
        public void xsetGsDatum(org.apache.xmlbeans.XmlString gsDatum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GSDATUM$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GSDATUM$28);
                }
                target.set(gsDatum);
            }
        }
        
        /**
         * Unsets the "gsDatum" attribute
         */
        public void unsetGsDatum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GSDATUM$28);
            }
        }
        
        /**
         * Gets the "gsModel" attribute
         */
        public java.lang.String getGsModel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GSMODEL$30);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "gsModel" attribute
         */
        public org.apache.xmlbeans.XmlString xgetGsModel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GSMODEL$30);
                return target;
            }
        }
        
        /**
         * True if has "gsModel" attribute
         */
        public boolean isSetGsModel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GSMODEL$30) != null;
            }
        }
        
        /**
         * Sets the "gsModel" attribute
         */
        public void setGsModel(java.lang.String gsModel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GSMODEL$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GSMODEL$30);
                }
                target.setStringValue(gsModel);
            }
        }
        
        /**
         * Sets (as xml) the "gsModel" attribute
         */
        public void xsetGsModel(org.apache.xmlbeans.XmlString gsModel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GSMODEL$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GSMODEL$30);
                }
                target.set(gsModel);
            }
        }
        
        /**
         * Unsets the "gsModel" attribute
         */
        public void unsetGsModel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GSMODEL$30);
            }
        }
        
        /**
         * Gets the "gsMethod" attribute
         */
        public java.lang.String getGsMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GSMETHOD$32);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "gsMethod" attribute
         */
        public org.apache.xmlbeans.XmlString xgetGsMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GSMETHOD$32);
                return target;
            }
        }
        
        /**
         * True if has "gsMethod" attribute
         */
        public boolean isSetGsMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GSMETHOD$32) != null;
            }
        }
        
        /**
         * Sets the "gsMethod" attribute
         */
        public void setGsMethod(java.lang.String gsMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GSMETHOD$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GSMETHOD$32);
                }
                target.setStringValue(gsMethod);
            }
        }
        
        /**
         * Sets (as xml) the "gsMethod" attribute
         */
        public void xsetGsMethod(org.apache.xmlbeans.XmlString gsMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GSMETHOD$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GSMETHOD$32);
                }
                target.set(gsMethod);
            }
        }
        
        /**
         * Unsets the "gsMethod" attribute
         */
        public void unsetGsMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GSMETHOD$32);
            }
        }
        
        /**
         * Gets the "originMark" attribute
         */
        public java.lang.String getOriginMark()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIGINMARK$34);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "originMark" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOriginMark()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORIGINMARK$34);
                return target;
            }
        }
        
        /**
         * True if has "originMark" attribute
         */
        public boolean isSetOriginMark()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ORIGINMARK$34) != null;
            }
        }
        
        /**
         * Sets the "originMark" attribute
         */
        public void setOriginMark(java.lang.String originMark)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIGINMARK$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIGINMARK$34);
                }
                target.setStringValue(originMark);
            }
        }
        
        /**
         * Sets (as xml) the "originMark" attribute
         */
        public void xsetOriginMark(org.apache.xmlbeans.XmlString originMark)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORIGINMARK$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ORIGINMARK$34);
                }
                target.set(originMark);
            }
        }
        
        /**
         * Unsets the "originMark" attribute
         */
        public void unsetOriginMark()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ORIGINMARK$34);
            }
        }
        
        /**
         * Gets the "verticalDatum" attribute
         */
        public java.lang.String getVerticalDatum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALDATUM$36);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "verticalDatum" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVerticalDatum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERTICALDATUM$36);
                return target;
            }
        }
        
        /**
         * True if has "verticalDatum" attribute
         */
        public boolean isSetVerticalDatum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VERTICALDATUM$36) != null;
            }
        }
        
        /**
         * Sets the "verticalDatum" attribute
         */
        public void setVerticalDatum(java.lang.String verticalDatum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALDATUM$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTICALDATUM$36);
                }
                target.setStringValue(verticalDatum);
            }
        }
        
        /**
         * Sets (as xml) the "verticalDatum" attribute
         */
        public void xsetVerticalDatum(org.apache.xmlbeans.XmlString verticalDatum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERTICALDATUM$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERTICALDATUM$36);
                }
                target.set(verticalDatum);
            }
        }
        
        /**
         * Unsets the "verticalDatum" attribute
         */
        public void unsetVerticalDatum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VERTICALDATUM$36);
            }
        }
        
        /**
         * Gets the "localUncertainity" attribute
         */
        public double getLocalUncertainity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALUNCERTAINITY$38);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "localUncertainity" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetLocalUncertainity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LOCALUNCERTAINITY$38);
                return target;
            }
        }
        
        /**
         * True if has "localUncertainity" attribute
         */
        public boolean isSetLocalUncertainity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOCALUNCERTAINITY$38) != null;
            }
        }
        
        /**
         * Sets the "localUncertainity" attribute
         */
        public void setLocalUncertainity(double localUncertainity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALUNCERTAINITY$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCALUNCERTAINITY$38);
                }
                target.setDoubleValue(localUncertainity);
            }
        }
        
        /**
         * Sets (as xml) the "localUncertainity" attribute
         */
        public void xsetLocalUncertainity(org.apache.xmlbeans.XmlDouble localUncertainity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LOCALUNCERTAINITY$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LOCALUNCERTAINITY$38);
                }
                target.set(localUncertainity);
            }
        }
        
        /**
         * Unsets the "localUncertainity" attribute
         */
        public void unsetLocalUncertainity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOCALUNCERTAINITY$38);
            }
        }
        
        /**
         * Gets the "class" attribute
         */
        public java.lang.String getClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$40);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "class" attribute
         */
        public org.apache.xmlbeans.XmlString xgetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$40);
                return target;
            }
        }
        
        /**
         * True if has "class" attribute
         */
        public boolean isSetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CLASS1$40) != null;
            }
        }
        
        /**
         * Sets the "class" attribute
         */
        public void setClass1(java.lang.String class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$40);
                }
                target.setStringValue(class1);
            }
        }
        
        /**
         * Sets (as xml) the "class" attribute
         */
        public void xsetClass1(org.apache.xmlbeans.XmlString class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASS1$40);
                }
                target.set(class1);
            }
        }
        
        /**
         * Unsets the "class" attribute
         */
        public void unsetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CLASS1$40);
            }
        }
        
        /**
         * Gets the "order" attribute
         */
        public java.lang.String getOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDER$42);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "order" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORDER$42);
                return target;
            }
        }
        
        /**
         * True if has "order" attribute
         */
        public boolean isSetOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ORDER$42) != null;
            }
        }
        
        /**
         * Sets the "order" attribute
         */
        public void setOrder(java.lang.String order)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDER$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORDER$42);
                }
                target.setStringValue(order);
            }
        }
        
        /**
         * Sets (as xml) the "order" attribute
         */
        public void xsetOrder(org.apache.xmlbeans.XmlString order)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORDER$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ORDER$42);
                }
                target.set(order);
            }
        }
        
        /**
         * Unsets the "order" attribute
         */
        public void unsetOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ORDER$42);
            }
        }
        
        /**
         * Gets the "positionalUncertainity" attribute
         */
        public double getPositionalUncertainity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITIONALUNCERTAINITY$44);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "positionalUncertainity" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetPositionalUncertainity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POSITIONALUNCERTAINITY$44);
                return target;
            }
        }
        
        /**
         * True if has "positionalUncertainity" attribute
         */
        public boolean isSetPositionalUncertainity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POSITIONALUNCERTAINITY$44) != null;
            }
        }
        
        /**
         * Sets the "positionalUncertainity" attribute
         */
        public void setPositionalUncertainity(double positionalUncertainity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITIONALUNCERTAINITY$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSITIONALUNCERTAINITY$44);
                }
                target.setDoubleValue(positionalUncertainity);
            }
        }
        
        /**
         * Sets (as xml) the "positionalUncertainity" attribute
         */
        public void xsetPositionalUncertainity(org.apache.xmlbeans.XmlDouble positionalUncertainity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POSITIONALUNCERTAINITY$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(POSITIONALUNCERTAINITY$44);
                }
                target.set(positionalUncertainity);
            }
        }
        
        /**
         * Unsets the "positionalUncertainity" attribute
         */
        public void unsetPositionalUncertainity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POSITIONALUNCERTAINITY$44);
            }
        }
    }
}
