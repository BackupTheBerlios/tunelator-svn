/*
 * An XML document type.
 * Localname: CoordinateSystem
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CoordinateSystemDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one CoordinateSystem(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class CoordinateSystemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CoordinateSystemDocument
{
    
    public CoordinateSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATESYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CoordinateSystem");
    
    
    /**
     * Gets the "CoordinateSystem" element
     */
    public org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem getCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem target = null;
            target = (org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem)get_store().find_element_user(COORDINATESYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CoordinateSystem" element
     */
    public void setCoordinateSystem(org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem coordinateSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem target = null;
            target = (org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem)get_store().find_element_user(COORDINATESYSTEM$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem)get_store().add_element_user(COORDINATESYSTEM$0);
            }
            target.set(coordinateSystem);
        }
    }
    
    /**
     * Appends and returns a new empty "CoordinateSystem" element
     */
    public org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem addNewCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem target = null;
            target = (org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem)get_store().add_element_user(COORDINATESYSTEM$0);
            return target;
        }
    }
    /**
     * An XML CoordinateSystem(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class CoordinateSystemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem
    {
        
        public CoordinateSystemImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName START$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Start");
        private static final javax.xml.namespace.QName FIELDNOTE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FieldNote");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName DESC$6 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName NAME$8 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName EPSGCODE$10 = 
            new javax.xml.namespace.QName("", "epsgCode");
        private static final javax.xml.namespace.QName OGCWKTCODE$12 = 
            new javax.xml.namespace.QName("", "ogcWktCode");
        private static final javax.xml.namespace.QName HORIZONTALDATUM$14 = 
            new javax.xml.namespace.QName("", "horizontalDatum");
        private static final javax.xml.namespace.QName VERTICALDATUM$16 = 
            new javax.xml.namespace.QName("", "verticalDatum");
        private static final javax.xml.namespace.QName ELLIPSOIDNAME$18 = 
            new javax.xml.namespace.QName("", "ellipsoidName");
        private static final javax.xml.namespace.QName HORIZONTALCOORDINATESYSTEMNAME$20 = 
            new javax.xml.namespace.QName("", "horizontalCoordinateSystemName");
        private static final javax.xml.namespace.QName GEOCENTRICCOORDINATESYSTEMNAME$22 = 
            new javax.xml.namespace.QName("", "geocentricCoordinateSystemName");
        private static final javax.xml.namespace.QName FILELOCATION$24 = 
            new javax.xml.namespace.QName("", "fileLocation");
        private static final javax.xml.namespace.QName ROTATIONANGLE$26 = 
            new javax.xml.namespace.QName("", "rotationAngle");
        private static final javax.xml.namespace.QName DATUM$28 = 
            new javax.xml.namespace.QName("", "datum");
        private static final javax.xml.namespace.QName FITTEDCOORDINATESYSTEMNAME$30 = 
            new javax.xml.namespace.QName("", "fittedCoordinateSystemName");
        private static final javax.xml.namespace.QName COMPOUNDCOORDINATESYSTEMNAME$32 = 
            new javax.xml.namespace.QName("", "compoundCoordinateSystemName");
        private static final javax.xml.namespace.QName LOCALCOORDINATESYSTEMNAME$34 = 
            new javax.xml.namespace.QName("", "localCoordinateSystemName");
        private static final javax.xml.namespace.QName GEOGRAPHICCOORDINATESYSTEMNAME$36 = 
            new javax.xml.namespace.QName("", "geographicCoordinateSystemName");
        private static final javax.xml.namespace.QName PROJECTEDCOORDINATESYSTEMNAME$38 = 
            new javax.xml.namespace.QName("", "projectedCoordinateSystemName");
        private static final javax.xml.namespace.QName VERTICALCOORDINATESYSTEMNAME$40 = 
            new javax.xml.namespace.QName("", "verticalCoordinateSystemName");
        
        
        /**
         * Gets the "Start" element
         */
        public org.landxml.schema.landXML11.PointType getStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(START$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Start" element
         */
        public boolean isSetStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(START$0) != 0;
            }
        }
        
        /**
         * Sets the "Start" element
         */
        public void setStart(org.landxml.schema.landXML11.PointType start)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(START$0, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(START$0);
                }
                target.set(start);
            }
        }
        
        /**
         * Appends and returns a new empty "Start" element
         */
        public org.landxml.schema.landXML11.PointType addNewStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(START$0);
                return target;
            }
        }
        
        /**
         * Unsets the "Start" element
         */
        public void unsetStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(START$0, 0);
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
                    { return CoordinateSystemImpl.this.getFieldNoteArray(i); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote set(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = CoordinateSystemImpl.this.getFieldNoteArray(i);
                    CoordinateSystemImpl.this.setFieldNoteArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                    { CoordinateSystemImpl.this.insertNewFieldNote(i).set(o); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote remove(int i)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = CoordinateSystemImpl.this.getFieldNoteArray(i);
                    CoordinateSystemImpl.this.removeFieldNote(i);
                    return old;
                }
                
                public int size()
                    { return CoordinateSystemImpl.this.sizeOfFieldNoteArray(); }
                
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
                    { return CoordinateSystemImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CoordinateSystemImpl.this.getFeatureArray(i);
                    CoordinateSystemImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { CoordinateSystemImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CoordinateSystemImpl.this.getFeatureArray(i);
                    CoordinateSystemImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return CoordinateSystemImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "desc" attribute
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$6);
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
                return get_store().find_attribute_user(DESC$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$6);
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
                get_store().remove_attribute(DESC$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
                return target;
            }
        }
        
        /**
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$8);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$8);
            }
        }
        
        /**
         * Gets the "epsgCode" attribute
         */
        public java.lang.String getEpsgCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EPSGCODE$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "epsgCode" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEpsgCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EPSGCODE$10);
                return target;
            }
        }
        
        /**
         * True if has "epsgCode" attribute
         */
        public boolean isSetEpsgCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EPSGCODE$10) != null;
            }
        }
        
        /**
         * Sets the "epsgCode" attribute
         */
        public void setEpsgCode(java.lang.String epsgCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EPSGCODE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EPSGCODE$10);
                }
                target.setStringValue(epsgCode);
            }
        }
        
        /**
         * Sets (as xml) the "epsgCode" attribute
         */
        public void xsetEpsgCode(org.apache.xmlbeans.XmlString epsgCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EPSGCODE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EPSGCODE$10);
                }
                target.set(epsgCode);
            }
        }
        
        /**
         * Unsets the "epsgCode" attribute
         */
        public void unsetEpsgCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EPSGCODE$10);
            }
        }
        
        /**
         * Gets the "ogcWktCode" attribute
         */
        public java.lang.String getOgcWktCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OGCWKTCODE$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ogcWktCode" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOgcWktCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OGCWKTCODE$12);
                return target;
            }
        }
        
        /**
         * True if has "ogcWktCode" attribute
         */
        public boolean isSetOgcWktCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OGCWKTCODE$12) != null;
            }
        }
        
        /**
         * Sets the "ogcWktCode" attribute
         */
        public void setOgcWktCode(java.lang.String ogcWktCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OGCWKTCODE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OGCWKTCODE$12);
                }
                target.setStringValue(ogcWktCode);
            }
        }
        
        /**
         * Sets (as xml) the "ogcWktCode" attribute
         */
        public void xsetOgcWktCode(org.apache.xmlbeans.XmlString ogcWktCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OGCWKTCODE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OGCWKTCODE$12);
                }
                target.set(ogcWktCode);
            }
        }
        
        /**
         * Unsets the "ogcWktCode" attribute
         */
        public void unsetOgcWktCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OGCWKTCODE$12);
            }
        }
        
        /**
         * Gets the "horizontalDatum" attribute
         */
        public java.lang.String getHorizontalDatum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTALDATUM$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "horizontalDatum" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHorizontalDatum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HORIZONTALDATUM$14);
                return target;
            }
        }
        
        /**
         * True if has "horizontalDatum" attribute
         */
        public boolean isSetHorizontalDatum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HORIZONTALDATUM$14) != null;
            }
        }
        
        /**
         * Sets the "horizontalDatum" attribute
         */
        public void setHorizontalDatum(java.lang.String horizontalDatum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTALDATUM$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORIZONTALDATUM$14);
                }
                target.setStringValue(horizontalDatum);
            }
        }
        
        /**
         * Sets (as xml) the "horizontalDatum" attribute
         */
        public void xsetHorizontalDatum(org.apache.xmlbeans.XmlString horizontalDatum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HORIZONTALDATUM$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HORIZONTALDATUM$14);
                }
                target.set(horizontalDatum);
            }
        }
        
        /**
         * Unsets the "horizontalDatum" attribute
         */
        public void unsetHorizontalDatum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HORIZONTALDATUM$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALDATUM$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERTICALDATUM$16);
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
                return get_store().find_attribute_user(VERTICALDATUM$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALDATUM$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTICALDATUM$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERTICALDATUM$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERTICALDATUM$16);
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
                get_store().remove_attribute(VERTICALDATUM$16);
            }
        }
        
        /**
         * Gets the "ellipsoidName" attribute
         */
        public java.lang.String getEllipsoidName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELLIPSOIDNAME$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ellipsoidName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEllipsoidName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ELLIPSOIDNAME$18);
                return target;
            }
        }
        
        /**
         * True if has "ellipsoidName" attribute
         */
        public boolean isSetEllipsoidName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ELLIPSOIDNAME$18) != null;
            }
        }
        
        /**
         * Sets the "ellipsoidName" attribute
         */
        public void setEllipsoidName(java.lang.String ellipsoidName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELLIPSOIDNAME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELLIPSOIDNAME$18);
                }
                target.setStringValue(ellipsoidName);
            }
        }
        
        /**
         * Sets (as xml) the "ellipsoidName" attribute
         */
        public void xsetEllipsoidName(org.apache.xmlbeans.XmlString ellipsoidName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ELLIPSOIDNAME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ELLIPSOIDNAME$18);
                }
                target.set(ellipsoidName);
            }
        }
        
        /**
         * Unsets the "ellipsoidName" attribute
         */
        public void unsetEllipsoidName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ELLIPSOIDNAME$18);
            }
        }
        
        /**
         * Gets the "horizontalCoordinateSystemName" attribute
         */
        public java.lang.String getHorizontalCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTALCOORDINATESYSTEMNAME$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "horizontalCoordinateSystemName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHorizontalCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HORIZONTALCOORDINATESYSTEMNAME$20);
                return target;
            }
        }
        
        /**
         * True if has "horizontalCoordinateSystemName" attribute
         */
        public boolean isSetHorizontalCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HORIZONTALCOORDINATESYSTEMNAME$20) != null;
            }
        }
        
        /**
         * Sets the "horizontalCoordinateSystemName" attribute
         */
        public void setHorizontalCoordinateSystemName(java.lang.String horizontalCoordinateSystemName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTALCOORDINATESYSTEMNAME$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORIZONTALCOORDINATESYSTEMNAME$20);
                }
                target.setStringValue(horizontalCoordinateSystemName);
            }
        }
        
        /**
         * Sets (as xml) the "horizontalCoordinateSystemName" attribute
         */
        public void xsetHorizontalCoordinateSystemName(org.apache.xmlbeans.XmlString horizontalCoordinateSystemName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HORIZONTALCOORDINATESYSTEMNAME$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HORIZONTALCOORDINATESYSTEMNAME$20);
                }
                target.set(horizontalCoordinateSystemName);
            }
        }
        
        /**
         * Unsets the "horizontalCoordinateSystemName" attribute
         */
        public void unsetHorizontalCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HORIZONTALCOORDINATESYSTEMNAME$20);
            }
        }
        
        /**
         * Gets the "geocentricCoordinateSystemName" attribute
         */
        public java.lang.String getGeocentricCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOCENTRICCOORDINATESYSTEMNAME$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "geocentricCoordinateSystemName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetGeocentricCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GEOCENTRICCOORDINATESYSTEMNAME$22);
                return target;
            }
        }
        
        /**
         * True if has "geocentricCoordinateSystemName" attribute
         */
        public boolean isSetGeocentricCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GEOCENTRICCOORDINATESYSTEMNAME$22) != null;
            }
        }
        
        /**
         * Sets the "geocentricCoordinateSystemName" attribute
         */
        public void setGeocentricCoordinateSystemName(java.lang.String geocentricCoordinateSystemName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOCENTRICCOORDINATESYSTEMNAME$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GEOCENTRICCOORDINATESYSTEMNAME$22);
                }
                target.setStringValue(geocentricCoordinateSystemName);
            }
        }
        
        /**
         * Sets (as xml) the "geocentricCoordinateSystemName" attribute
         */
        public void xsetGeocentricCoordinateSystemName(org.apache.xmlbeans.XmlString geocentricCoordinateSystemName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GEOCENTRICCOORDINATESYSTEMNAME$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GEOCENTRICCOORDINATESYSTEMNAME$22);
                }
                target.set(geocentricCoordinateSystemName);
            }
        }
        
        /**
         * Unsets the "geocentricCoordinateSystemName" attribute
         */
        public void unsetGeocentricCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GEOCENTRICCOORDINATESYSTEMNAME$22);
            }
        }
        
        /**
         * Gets the "fileLocation" attribute
         */
        public java.lang.String getFileLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILELOCATION$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fileLocation" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetFileLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(FILELOCATION$24);
                return target;
            }
        }
        
        /**
         * True if has "fileLocation" attribute
         */
        public boolean isSetFileLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FILELOCATION$24) != null;
            }
        }
        
        /**
         * Sets the "fileLocation" attribute
         */
        public void setFileLocation(java.lang.String fileLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILELOCATION$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILELOCATION$24);
                }
                target.setStringValue(fileLocation);
            }
        }
        
        /**
         * Sets (as xml) the "fileLocation" attribute
         */
        public void xsetFileLocation(org.apache.xmlbeans.XmlAnyURI fileLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(FILELOCATION$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(FILELOCATION$24);
                }
                target.set(fileLocation);
            }
        }
        
        /**
         * Unsets the "fileLocation" attribute
         */
        public void unsetFileLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FILELOCATION$24);
            }
        }
        
        /**
         * Gets the "rotationAngle" attribute
         */
        public double getRotationAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROTATIONANGLE$26);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "rotationAngle" attribute
         */
        public org.landxml.schema.landXML11.Angle xgetRotationAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Angle target = null;
                target = (org.landxml.schema.landXML11.Angle)get_store().find_attribute_user(ROTATIONANGLE$26);
                return target;
            }
        }
        
        /**
         * True if has "rotationAngle" attribute
         */
        public boolean isSetRotationAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ROTATIONANGLE$26) != null;
            }
        }
        
        /**
         * Sets the "rotationAngle" attribute
         */
        public void setRotationAngle(double rotationAngle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROTATIONANGLE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROTATIONANGLE$26);
                }
                target.setDoubleValue(rotationAngle);
            }
        }
        
        /**
         * Sets (as xml) the "rotationAngle" attribute
         */
        public void xsetRotationAngle(org.landxml.schema.landXML11.Angle rotationAngle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Angle target = null;
                target = (org.landxml.schema.landXML11.Angle)get_store().find_attribute_user(ROTATIONANGLE$26);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Angle)get_store().add_attribute_user(ROTATIONANGLE$26);
                }
                target.set(rotationAngle);
            }
        }
        
        /**
         * Unsets the "rotationAngle" attribute
         */
        public void unsetRotationAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ROTATIONANGLE$26);
            }
        }
        
        /**
         * Gets the "datum" attribute
         */
        public java.lang.String getDatum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATUM$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "datum" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDatum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DATUM$28);
                return target;
            }
        }
        
        /**
         * True if has "datum" attribute
         */
        public boolean isSetDatum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DATUM$28) != null;
            }
        }
        
        /**
         * Sets the "datum" attribute
         */
        public void setDatum(java.lang.String datum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATUM$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATUM$28);
                }
                target.setStringValue(datum);
            }
        }
        
        /**
         * Sets (as xml) the "datum" attribute
         */
        public void xsetDatum(org.apache.xmlbeans.XmlString datum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DATUM$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DATUM$28);
                }
                target.set(datum);
            }
        }
        
        /**
         * Unsets the "datum" attribute
         */
        public void unsetDatum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DATUM$28);
            }
        }
        
        /**
         * Gets the "fittedCoordinateSystemName" attribute
         */
        public java.lang.String getFittedCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FITTEDCOORDINATESYSTEMNAME$30);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fittedCoordinateSystemName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFittedCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FITTEDCOORDINATESYSTEMNAME$30);
                return target;
            }
        }
        
        /**
         * True if has "fittedCoordinateSystemName" attribute
         */
        public boolean isSetFittedCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FITTEDCOORDINATESYSTEMNAME$30) != null;
            }
        }
        
        /**
         * Sets the "fittedCoordinateSystemName" attribute
         */
        public void setFittedCoordinateSystemName(java.lang.String fittedCoordinateSystemName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FITTEDCOORDINATESYSTEMNAME$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FITTEDCOORDINATESYSTEMNAME$30);
                }
                target.setStringValue(fittedCoordinateSystemName);
            }
        }
        
        /**
         * Sets (as xml) the "fittedCoordinateSystemName" attribute
         */
        public void xsetFittedCoordinateSystemName(org.apache.xmlbeans.XmlString fittedCoordinateSystemName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FITTEDCOORDINATESYSTEMNAME$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FITTEDCOORDINATESYSTEMNAME$30);
                }
                target.set(fittedCoordinateSystemName);
            }
        }
        
        /**
         * Unsets the "fittedCoordinateSystemName" attribute
         */
        public void unsetFittedCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FITTEDCOORDINATESYSTEMNAME$30);
            }
        }
        
        /**
         * Gets the "compoundCoordinateSystemName" attribute
         */
        public java.lang.String getCompoundCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPOUNDCOORDINATESYSTEMNAME$32);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "compoundCoordinateSystemName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCompoundCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COMPOUNDCOORDINATESYSTEMNAME$32);
                return target;
            }
        }
        
        /**
         * True if has "compoundCoordinateSystemName" attribute
         */
        public boolean isSetCompoundCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COMPOUNDCOORDINATESYSTEMNAME$32) != null;
            }
        }
        
        /**
         * Sets the "compoundCoordinateSystemName" attribute
         */
        public void setCompoundCoordinateSystemName(java.lang.String compoundCoordinateSystemName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPOUNDCOORDINATESYSTEMNAME$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPOUNDCOORDINATESYSTEMNAME$32);
                }
                target.setStringValue(compoundCoordinateSystemName);
            }
        }
        
        /**
         * Sets (as xml) the "compoundCoordinateSystemName" attribute
         */
        public void xsetCompoundCoordinateSystemName(org.apache.xmlbeans.XmlString compoundCoordinateSystemName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COMPOUNDCOORDINATESYSTEMNAME$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COMPOUNDCOORDINATESYSTEMNAME$32);
                }
                target.set(compoundCoordinateSystemName);
            }
        }
        
        /**
         * Unsets the "compoundCoordinateSystemName" attribute
         */
        public void unsetCompoundCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COMPOUNDCOORDINATESYSTEMNAME$32);
            }
        }
        
        /**
         * Gets the "localCoordinateSystemName" attribute
         */
        public java.lang.String getLocalCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALCOORDINATESYSTEMNAME$34);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "localCoordinateSystemName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLocalCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCALCOORDINATESYSTEMNAME$34);
                return target;
            }
        }
        
        /**
         * True if has "localCoordinateSystemName" attribute
         */
        public boolean isSetLocalCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOCALCOORDINATESYSTEMNAME$34) != null;
            }
        }
        
        /**
         * Sets the "localCoordinateSystemName" attribute
         */
        public void setLocalCoordinateSystemName(java.lang.String localCoordinateSystemName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALCOORDINATESYSTEMNAME$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCALCOORDINATESYSTEMNAME$34);
                }
                target.setStringValue(localCoordinateSystemName);
            }
        }
        
        /**
         * Sets (as xml) the "localCoordinateSystemName" attribute
         */
        public void xsetLocalCoordinateSystemName(org.apache.xmlbeans.XmlString localCoordinateSystemName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCALCOORDINATESYSTEMNAME$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCALCOORDINATESYSTEMNAME$34);
                }
                target.set(localCoordinateSystemName);
            }
        }
        
        /**
         * Unsets the "localCoordinateSystemName" attribute
         */
        public void unsetLocalCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOCALCOORDINATESYSTEMNAME$34);
            }
        }
        
        /**
         * Gets the "geographicCoordinateSystemName" attribute
         */
        public java.lang.String getGeographicCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOGRAPHICCOORDINATESYSTEMNAME$36);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "geographicCoordinateSystemName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetGeographicCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GEOGRAPHICCOORDINATESYSTEMNAME$36);
                return target;
            }
        }
        
        /**
         * True if has "geographicCoordinateSystemName" attribute
         */
        public boolean isSetGeographicCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GEOGRAPHICCOORDINATESYSTEMNAME$36) != null;
            }
        }
        
        /**
         * Sets the "geographicCoordinateSystemName" attribute
         */
        public void setGeographicCoordinateSystemName(java.lang.String geographicCoordinateSystemName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOGRAPHICCOORDINATESYSTEMNAME$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GEOGRAPHICCOORDINATESYSTEMNAME$36);
                }
                target.setStringValue(geographicCoordinateSystemName);
            }
        }
        
        /**
         * Sets (as xml) the "geographicCoordinateSystemName" attribute
         */
        public void xsetGeographicCoordinateSystemName(org.apache.xmlbeans.XmlString geographicCoordinateSystemName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GEOGRAPHICCOORDINATESYSTEMNAME$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GEOGRAPHICCOORDINATESYSTEMNAME$36);
                }
                target.set(geographicCoordinateSystemName);
            }
        }
        
        /**
         * Unsets the "geographicCoordinateSystemName" attribute
         */
        public void unsetGeographicCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GEOGRAPHICCOORDINATESYSTEMNAME$36);
            }
        }
        
        /**
         * Gets the "projectedCoordinateSystemName" attribute
         */
        public java.lang.String getProjectedCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROJECTEDCOORDINATESYSTEMNAME$38);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "projectedCoordinateSystemName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetProjectedCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROJECTEDCOORDINATESYSTEMNAME$38);
                return target;
            }
        }
        
        /**
         * True if has "projectedCoordinateSystemName" attribute
         */
        public boolean isSetProjectedCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PROJECTEDCOORDINATESYSTEMNAME$38) != null;
            }
        }
        
        /**
         * Sets the "projectedCoordinateSystemName" attribute
         */
        public void setProjectedCoordinateSystemName(java.lang.String projectedCoordinateSystemName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROJECTEDCOORDINATESYSTEMNAME$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROJECTEDCOORDINATESYSTEMNAME$38);
                }
                target.setStringValue(projectedCoordinateSystemName);
            }
        }
        
        /**
         * Sets (as xml) the "projectedCoordinateSystemName" attribute
         */
        public void xsetProjectedCoordinateSystemName(org.apache.xmlbeans.XmlString projectedCoordinateSystemName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROJECTEDCOORDINATESYSTEMNAME$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROJECTEDCOORDINATESYSTEMNAME$38);
                }
                target.set(projectedCoordinateSystemName);
            }
        }
        
        /**
         * Unsets the "projectedCoordinateSystemName" attribute
         */
        public void unsetProjectedCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PROJECTEDCOORDINATESYSTEMNAME$38);
            }
        }
        
        /**
         * Gets the "verticalCoordinateSystemName" attribute
         */
        public java.lang.String getVerticalCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALCOORDINATESYSTEMNAME$40);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "verticalCoordinateSystemName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVerticalCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERTICALCOORDINATESYSTEMNAME$40);
                return target;
            }
        }
        
        /**
         * True if has "verticalCoordinateSystemName" attribute
         */
        public boolean isSetVerticalCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VERTICALCOORDINATESYSTEMNAME$40) != null;
            }
        }
        
        /**
         * Sets the "verticalCoordinateSystemName" attribute
         */
        public void setVerticalCoordinateSystemName(java.lang.String verticalCoordinateSystemName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALCOORDINATESYSTEMNAME$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTICALCOORDINATESYSTEMNAME$40);
                }
                target.setStringValue(verticalCoordinateSystemName);
            }
        }
        
        /**
         * Sets (as xml) the "verticalCoordinateSystemName" attribute
         */
        public void xsetVerticalCoordinateSystemName(org.apache.xmlbeans.XmlString verticalCoordinateSystemName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERTICALCOORDINATESYSTEMNAME$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERTICALCOORDINATESYSTEMNAME$40);
                }
                target.set(verticalCoordinateSystemName);
            }
        }
        
        /**
         * Unsets the "verticalCoordinateSystemName" attribute
         */
        public void unsetVerticalCoordinateSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VERTICALCOORDINATESYSTEMNAME$40);
            }
        }
    }
}
