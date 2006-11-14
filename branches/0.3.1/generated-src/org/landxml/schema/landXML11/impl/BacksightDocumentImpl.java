/*
 * An XML document type.
 * Localname: Backsight
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.BacksightDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Backsight(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class BacksightDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.BacksightDocument
{
    
    public BacksightDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BACKSIGHT$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Backsight");
    
    
    /**
     * Gets the "Backsight" element
     */
    public org.landxml.schema.landXML11.BacksightDocument.Backsight getBacksight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.BacksightDocument.Backsight target = null;
            target = (org.landxml.schema.landXML11.BacksightDocument.Backsight)get_store().find_element_user(BACKSIGHT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Backsight" element
     */
    public void setBacksight(org.landxml.schema.landXML11.BacksightDocument.Backsight backsight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.BacksightDocument.Backsight target = null;
            target = (org.landxml.schema.landXML11.BacksightDocument.Backsight)get_store().find_element_user(BACKSIGHT$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.BacksightDocument.Backsight)get_store().add_element_user(BACKSIGHT$0);
            }
            target.set(backsight);
        }
    }
    
    /**
     * Appends and returns a new empty "Backsight" element
     */
    public org.landxml.schema.landXML11.BacksightDocument.Backsight addNewBacksight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.BacksightDocument.Backsight target = null;
            target = (org.landxml.schema.landXML11.BacksightDocument.Backsight)get_store().add_element_user(BACKSIGHT$0);
            return target;
        }
    }
    /**
     * An XML Backsight(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class BacksightImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.BacksightDocument.Backsight
    {
        
        public BacksightImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BACKSIGHTPOINT$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "BacksightPoint");
        private static final javax.xml.namespace.QName FIELDNOTE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FieldNote");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName ID$6 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName AZIMUTH$8 = 
            new javax.xml.namespace.QName("", "azimuth");
        private static final javax.xml.namespace.QName TARGETHEIGHT$10 = 
            new javax.xml.namespace.QName("", "targetHeight");
        private static final javax.xml.namespace.QName CIRCLE$12 = 
            new javax.xml.namespace.QName("", "circle");
        private static final javax.xml.namespace.QName SETUPID$14 = 
            new javax.xml.namespace.QName("", "setupID");
        
        
        /**
         * Gets the "BacksightPoint" element
         */
        public org.landxml.schema.landXML11.PointType getBacksightPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(BACKSIGHTPOINT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "BacksightPoint" element
         */
        public boolean isSetBacksightPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BACKSIGHTPOINT$0) != 0;
            }
        }
        
        /**
         * Sets the "BacksightPoint" element
         */
        public void setBacksightPoint(org.landxml.schema.landXML11.PointType backsightPoint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(BACKSIGHTPOINT$0, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(BACKSIGHTPOINT$0);
                }
                target.set(backsightPoint);
            }
        }
        
        /**
         * Appends and returns a new empty "BacksightPoint" element
         */
        public org.landxml.schema.landXML11.PointType addNewBacksightPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(BACKSIGHTPOINT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "BacksightPoint" element
         */
        public void unsetBacksightPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BACKSIGHTPOINT$0, 0);
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
                    { return BacksightImpl.this.getFieldNoteArray(i); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote set(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = BacksightImpl.this.getFieldNoteArray(i);
                    BacksightImpl.this.setFieldNoteArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                    { BacksightImpl.this.insertNewFieldNote(i).set(o); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote remove(int i)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = BacksightImpl.this.getFieldNoteArray(i);
                    BacksightImpl.this.removeFieldNote(i);
                    return old;
                }
                
                public int size()
                    { return BacksightImpl.this.sizeOfFieldNoteArray(); }
                
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
                    { return BacksightImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = BacksightImpl.this.getFeatureArray(i);
                    BacksightImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { BacksightImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = BacksightImpl.this.getFeatureArray(i);
                    BacksightImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return BacksightImpl.this.sizeOfFeatureArray(); }
                
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
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$6) != null;
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
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$6);
            }
        }
        
        /**
         * Gets the "azimuth" attribute
         */
        public double getAzimuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AZIMUTH$8);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "azimuth" attribute
         */
        public org.landxml.schema.landXML11.Direction xgetAzimuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Direction target = null;
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(AZIMUTH$8);
                return target;
            }
        }
        
        /**
         * True if has "azimuth" attribute
         */
        public boolean isSetAzimuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AZIMUTH$8) != null;
            }
        }
        
        /**
         * Sets the "azimuth" attribute
         */
        public void setAzimuth(double azimuth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AZIMUTH$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AZIMUTH$8);
                }
                target.setDoubleValue(azimuth);
            }
        }
        
        /**
         * Sets (as xml) the "azimuth" attribute
         */
        public void xsetAzimuth(org.landxml.schema.landXML11.Direction azimuth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Direction target = null;
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(AZIMUTH$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Direction)get_store().add_attribute_user(AZIMUTH$8);
                }
                target.set(azimuth);
            }
        }
        
        /**
         * Unsets the "azimuth" attribute
         */
        public void unsetAzimuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AZIMUTH$8);
            }
        }
        
        /**
         * Gets the "targetHeight" attribute
         */
        public double getTargetHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETHEIGHT$10);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "targetHeight" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetTargetHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TARGETHEIGHT$10);
                return target;
            }
        }
        
        /**
         * True if has "targetHeight" attribute
         */
        public boolean isSetTargetHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TARGETHEIGHT$10) != null;
            }
        }
        
        /**
         * Sets the "targetHeight" attribute
         */
        public void setTargetHeight(double targetHeight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETHEIGHT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETHEIGHT$10);
                }
                target.setDoubleValue(targetHeight);
            }
        }
        
        /**
         * Sets (as xml) the "targetHeight" attribute
         */
        public void xsetTargetHeight(org.apache.xmlbeans.XmlDouble targetHeight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TARGETHEIGHT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TARGETHEIGHT$10);
                }
                target.set(targetHeight);
            }
        }
        
        /**
         * Unsets the "targetHeight" attribute
         */
        public void unsetTargetHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TARGETHEIGHT$10);
            }
        }
        
        /**
         * Gets the "circle" attribute
         */
        public double getCircle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CIRCLE$12);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "circle" attribute
         */
        public org.landxml.schema.landXML11.Angle xgetCircle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Angle target = null;
                target = (org.landxml.schema.landXML11.Angle)get_store().find_attribute_user(CIRCLE$12);
                return target;
            }
        }
        
        /**
         * Sets the "circle" attribute
         */
        public void setCircle(double circle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CIRCLE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CIRCLE$12);
                }
                target.setDoubleValue(circle);
            }
        }
        
        /**
         * Sets (as xml) the "circle" attribute
         */
        public void xsetCircle(org.landxml.schema.landXML11.Angle circle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Angle target = null;
                target = (org.landxml.schema.landXML11.Angle)get_store().find_attribute_user(CIRCLE$12);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Angle)get_store().add_attribute_user(CIRCLE$12);
                }
                target.set(circle);
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
    }
}
