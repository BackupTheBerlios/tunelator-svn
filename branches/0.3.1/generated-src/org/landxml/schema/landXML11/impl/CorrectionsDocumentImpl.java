/*
 * An XML document type.
 * Localname: Corrections
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CorrectionsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Corrections(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class CorrectionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CorrectionsDocument
{
    
    public CorrectionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORRECTIONS$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Corrections");
    
    
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
     * An XML Corrections(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class CorrectionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CorrectionsDocument.Corrections
    {
        
        public CorrectionsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELDNOTE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FieldNote");
        private static final javax.xml.namespace.QName FEATURE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName REFRACTIONCOEFFICIENT$4 = 
            new javax.xml.namespace.QName("", "refractionCoefficient");
        private static final javax.xml.namespace.QName APPLYREFRACTIONCOEFFICIENT$6 = 
            new javax.xml.namespace.QName("", "applyRefractionCoefficient");
        private static final javax.xml.namespace.QName SPHERICITY$8 = 
            new javax.xml.namespace.QName("", "sphericity");
        private static final javax.xml.namespace.QName PRISMECCENTRICITY$10 = 
            new javax.xml.namespace.QName("", "prismEccentricity");
        
        
        /**
         * Gets a List of "FieldNote" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FieldNoteDocument.FieldNote> getFieldNoteList()
        {
            final class FieldNoteList extends java.util.AbstractList<org.landxml.schema.landXML11.FieldNoteDocument.FieldNote>
            {
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote get(int i)
                    { return CorrectionsImpl.this.getFieldNoteArray(i); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote set(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = CorrectionsImpl.this.getFieldNoteArray(i);
                    CorrectionsImpl.this.setFieldNoteArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                    { CorrectionsImpl.this.insertNewFieldNote(i).set(o); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote remove(int i)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = CorrectionsImpl.this.getFieldNoteArray(i);
                    CorrectionsImpl.this.removeFieldNote(i);
                    return old;
                }
                
                public int size()
                    { return CorrectionsImpl.this.sizeOfFieldNoteArray(); }
                
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
                    { return CorrectionsImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CorrectionsImpl.this.getFeatureArray(i);
                    CorrectionsImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { CorrectionsImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CorrectionsImpl.this.getFeatureArray(i);
                    CorrectionsImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return CorrectionsImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "refractionCoefficient" attribute
         */
        public double getRefractionCoefficient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRACTIONCOEFFICIENT$4);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "refractionCoefficient" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetRefractionCoefficient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(REFRACTIONCOEFFICIENT$4);
                return target;
            }
        }
        
        /**
         * True if has "refractionCoefficient" attribute
         */
        public boolean isSetRefractionCoefficient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REFRACTIONCOEFFICIENT$4) != null;
            }
        }
        
        /**
         * Sets the "refractionCoefficient" attribute
         */
        public void setRefractionCoefficient(double refractionCoefficient)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRACTIONCOEFFICIENT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFRACTIONCOEFFICIENT$4);
                }
                target.setDoubleValue(refractionCoefficient);
            }
        }
        
        /**
         * Sets (as xml) the "refractionCoefficient" attribute
         */
        public void xsetRefractionCoefficient(org.apache.xmlbeans.XmlDouble refractionCoefficient)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(REFRACTIONCOEFFICIENT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(REFRACTIONCOEFFICIENT$4);
                }
                target.set(refractionCoefficient);
            }
        }
        
        /**
         * Unsets the "refractionCoefficient" attribute
         */
        public void unsetRefractionCoefficient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REFRACTIONCOEFFICIENT$4);
            }
        }
        
        /**
         * Gets the "applyRefractionCoefficient" attribute
         */
        public boolean getApplyRefractionCoefficient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYREFRACTIONCOEFFICIENT$6);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "applyRefractionCoefficient" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetApplyRefractionCoefficient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYREFRACTIONCOEFFICIENT$6);
                return target;
            }
        }
        
        /**
         * True if has "applyRefractionCoefficient" attribute
         */
        public boolean isSetApplyRefractionCoefficient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(APPLYREFRACTIONCOEFFICIENT$6) != null;
            }
        }
        
        /**
         * Sets the "applyRefractionCoefficient" attribute
         */
        public void setApplyRefractionCoefficient(boolean applyRefractionCoefficient)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYREFRACTIONCOEFFICIENT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYREFRACTIONCOEFFICIENT$6);
                }
                target.setBooleanValue(applyRefractionCoefficient);
            }
        }
        
        /**
         * Sets (as xml) the "applyRefractionCoefficient" attribute
         */
        public void xsetApplyRefractionCoefficient(org.apache.xmlbeans.XmlBoolean applyRefractionCoefficient)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYREFRACTIONCOEFFICIENT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYREFRACTIONCOEFFICIENT$6);
                }
                target.set(applyRefractionCoefficient);
            }
        }
        
        /**
         * Unsets the "applyRefractionCoefficient" attribute
         */
        public void unsetApplyRefractionCoefficient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(APPLYREFRACTIONCOEFFICIENT$6);
            }
        }
        
        /**
         * Gets the "sphericity" attribute
         */
        public double getSphericity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPHERICITY$8);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "sphericity" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSphericity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SPHERICITY$8);
                return target;
            }
        }
        
        /**
         * True if has "sphericity" attribute
         */
        public boolean isSetSphericity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SPHERICITY$8) != null;
            }
        }
        
        /**
         * Sets the "sphericity" attribute
         */
        public void setSphericity(double sphericity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPHERICITY$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPHERICITY$8);
                }
                target.setDoubleValue(sphericity);
            }
        }
        
        /**
         * Sets (as xml) the "sphericity" attribute
         */
        public void xsetSphericity(org.apache.xmlbeans.XmlDouble sphericity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SPHERICITY$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SPHERICITY$8);
                }
                target.set(sphericity);
            }
        }
        
        /**
         * Unsets the "sphericity" attribute
         */
        public void unsetSphericity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SPHERICITY$8);
            }
        }
        
        /**
         * Gets the "prismEccentricity" attribute
         */
        public double getPrismEccentricity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRISMECCENTRICITY$10);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "prismEccentricity" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetPrismEccentricity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PRISMECCENTRICITY$10);
                return target;
            }
        }
        
        /**
         * True if has "prismEccentricity" attribute
         */
        public boolean isSetPrismEccentricity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PRISMECCENTRICITY$10) != null;
            }
        }
        
        /**
         * Sets the "prismEccentricity" attribute
         */
        public void setPrismEccentricity(double prismEccentricity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRISMECCENTRICITY$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRISMECCENTRICITY$10);
                }
                target.setDoubleValue(prismEccentricity);
            }
        }
        
        /**
         * Sets (as xml) the "prismEccentricity" attribute
         */
        public void xsetPrismEccentricity(org.apache.xmlbeans.XmlDouble prismEccentricity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PRISMECCENTRICITY$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PRISMECCENTRICITY$10);
                }
                target.set(prismEccentricity);
            }
        }
        
        /**
         * Unsets the "prismEccentricity" attribute
         */
        public void unsetPrismEccentricity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PRISMECCENTRICITY$10);
            }
        }
    }
}
