/*
 * An XML document type.
 * Localname: DataPoints
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.DataPointsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one DataPoints(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class DataPointsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.DataPointsDocument
{
    
    public DataPointsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAPOINTS$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "DataPoints");
    
    
    /**
     * Gets the "DataPoints" element
     */
    public org.landxml.schema.landXML11.DataPointsDocument.DataPoints getDataPoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.DataPointsDocument.DataPoints target = null;
            target = (org.landxml.schema.landXML11.DataPointsDocument.DataPoints)get_store().find_element_user(DATAPOINTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataPoints" element
     */
    public void setDataPoints(org.landxml.schema.landXML11.DataPointsDocument.DataPoints dataPoints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.DataPointsDocument.DataPoints target = null;
            target = (org.landxml.schema.landXML11.DataPointsDocument.DataPoints)get_store().find_element_user(DATAPOINTS$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.DataPointsDocument.DataPoints)get_store().add_element_user(DATAPOINTS$0);
            }
            target.set(dataPoints);
        }
    }
    
    /**
     * Appends and returns a new empty "DataPoints" element
     */
    public org.landxml.schema.landXML11.DataPointsDocument.DataPoints addNewDataPoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.DataPointsDocument.DataPoints target = null;
            target = (org.landxml.schema.landXML11.DataPointsDocument.DataPoints)get_store().add_element_user(DATAPOINTS$0);
            return target;
        }
    }
    /**
     * An XML DataPoints(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class DataPointsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.DataPointsDocument.DataPoints
    {
        
        public DataPointsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PNTLIST3D$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PntList3D");
        private static final javax.xml.namespace.QName FEATURE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESC$6 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName CODE$8 = 
            new javax.xml.namespace.QName("", "code");
        private static final javax.xml.namespace.QName STATE$10 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName PNTREF$12 = 
            new javax.xml.namespace.QName("", "pntRef");
        private static final javax.xml.namespace.QName POINTGEOMETRY$14 = 
            new javax.xml.namespace.QName("", "pointGeometry");
        private static final javax.xml.namespace.QName DTMATTRIBUTE$16 = 
            new javax.xml.namespace.QName("", "DTMAttribute");
        
        
        /**
         * Gets a List of "PntList3D" elements
         */
        public java.util.List<java.util.List> getPntList3DList()
        {
            final class PntList3DList extends java.util.AbstractList<java.util.List>
            {
                public java.util.List get(int i)
                    { return DataPointsImpl.this.getPntList3DArray(i); }
                
                public java.util.List set(int i, java.util.List o)
                {
                    java.util.List old = DataPointsImpl.this.getPntList3DArray(i);
                    DataPointsImpl.this.setPntList3DArray(i, o);
                    return old;
                }
                
                public void add(int i, java.util.List o)
                    { DataPointsImpl.this.insertPntList3D(i, o); }
                
                public java.util.List remove(int i)
                {
                    java.util.List old = DataPointsImpl.this.getPntList3DArray(i);
                    DataPointsImpl.this.removePntList3D(i);
                    return old;
                }
                
                public int size()
                    { return DataPointsImpl.this.sizeOfPntList3DArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PntList3DList();
            }
        }
        
        /**
         * Gets array of all "PntList3D" elements
         */
        public java.util.List[] getPntList3DArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PNTLIST3D$0, targetList);
                java.util.List[] result = new java.util.List[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getListValue();
                return result;
            }
        }
        
        /**
         * Gets ith "PntList3D" element
         */
        public java.util.List getPntList3DArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PNTLIST3D$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "PntList3D" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PntList3DDocument.PntList3D> xgetPntList3DList()
        {
            final class PntList3DList extends java.util.AbstractList<org.landxml.schema.landXML11.PntList3DDocument.PntList3D>
            {
                public org.landxml.schema.landXML11.PntList3DDocument.PntList3D get(int i)
                    { return DataPointsImpl.this.xgetPntList3DArray(i); }
                
                public org.landxml.schema.landXML11.PntList3DDocument.PntList3D set(int i, org.landxml.schema.landXML11.PntList3DDocument.PntList3D o)
                {
                    org.landxml.schema.landXML11.PntList3DDocument.PntList3D old = DataPointsImpl.this.xgetPntList3DArray(i);
                    DataPointsImpl.this.xsetPntList3DArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PntList3DDocument.PntList3D o)
                    { DataPointsImpl.this.insertNewPntList3D(i).set(o); }
                
                public org.landxml.schema.landXML11.PntList3DDocument.PntList3D remove(int i)
                {
                    org.landxml.schema.landXML11.PntList3DDocument.PntList3D old = DataPointsImpl.this.xgetPntList3DArray(i);
                    DataPointsImpl.this.removePntList3D(i);
                    return old;
                }
                
                public int size()
                    { return DataPointsImpl.this.sizeOfPntList3DArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PntList3DList();
            }
        }
        
        /**
         * Gets (as xml) array of all "PntList3D" elements
         */
        public org.landxml.schema.landXML11.PntList3DDocument.PntList3D[] xgetPntList3DArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PNTLIST3D$0, targetList);
                org.landxml.schema.landXML11.PntList3DDocument.PntList3D[] result = new org.landxml.schema.landXML11.PntList3DDocument.PntList3D[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "PntList3D" element
         */
        public org.landxml.schema.landXML11.PntList3DDocument.PntList3D xgetPntList3DArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntList3DDocument.PntList3D target = null;
                target = (org.landxml.schema.landXML11.PntList3DDocument.PntList3D)get_store().find_element_user(PNTLIST3D$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.landxml.schema.landXML11.PntList3DDocument.PntList3D)target;
            }
        }
        
        /**
         * Returns number of "PntList3D" element
         */
        public int sizeOfPntList3DArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PNTLIST3D$0);
            }
        }
        
        /**
         * Sets array of all "PntList3D" element
         */
        public void setPntList3DArray(java.util.List[] pntList3DArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pntList3DArray, PNTLIST3D$0);
            }
        }
        
        /**
         * Sets ith "PntList3D" element
         */
        public void setPntList3DArray(int i, java.util.List pntList3D)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PNTLIST3D$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setListValue(pntList3D);
            }
        }
        
        /**
         * Sets (as xml) array of all "PntList3D" element
         */
        public void xsetPntList3DArray(org.landxml.schema.landXML11.PntList3DDocument.PntList3D[]pntList3DArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pntList3DArray, PNTLIST3D$0);
            }
        }
        
        /**
         * Sets (as xml) ith "PntList3D" element
         */
        public void xsetPntList3DArray(int i, org.landxml.schema.landXML11.PntList3DDocument.PntList3D pntList3D)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntList3DDocument.PntList3D target = null;
                target = (org.landxml.schema.landXML11.PntList3DDocument.PntList3D)get_store().find_element_user(PNTLIST3D$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(pntList3D);
            }
        }
        
        /**
         * Inserts the value as the ith "PntList3D" element
         */
        public void insertPntList3D(int i, java.util.List pntList3D)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PNTLIST3D$0, i);
                target.setListValue(pntList3D);
            }
        }
        
        /**
         * Appends the value as the last "PntList3D" element
         */
        public void addPntList3D(java.util.List pntList3D)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PNTLIST3D$0);
                target.setListValue(pntList3D);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PntList3D" element
         */
        public org.landxml.schema.landXML11.PntList3DDocument.PntList3D insertNewPntList3D(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntList3DDocument.PntList3D target = null;
                target = (org.landxml.schema.landXML11.PntList3DDocument.PntList3D)get_store().insert_element_user(PNTLIST3D$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PntList3D" element
         */
        public org.landxml.schema.landXML11.PntList3DDocument.PntList3D addNewPntList3D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntList3DDocument.PntList3D target = null;
                target = (org.landxml.schema.landXML11.PntList3DDocument.PntList3D)get_store().add_element_user(PNTLIST3D$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "PntList3D" element
         */
        public void removePntList3D(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PNTLIST3D$0, i);
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
                    { return DataPointsImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = DataPointsImpl.this.getFeatureArray(i);
                    DataPointsImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { DataPointsImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = DataPointsImpl.this.getFeatureArray(i);
                    DataPointsImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return DataPointsImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
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
                return get_store().find_attribute_user(NAME$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
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
                get_store().remove_attribute(NAME$4);
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
         * Gets the "code" attribute
         */
        public java.lang.String getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "code" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODE$8);
                return target;
            }
        }
        
        /**
         * True if has "code" attribute
         */
        public boolean isSetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CODE$8) != null;
            }
        }
        
        /**
         * Sets the "code" attribute
         */
        public void setCode(java.lang.String code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$8);
                }
                target.setStringValue(code);
            }
        }
        
        /**
         * Sets (as xml) the "code" attribute
         */
        public void xsetCode(org.apache.xmlbeans.XmlString code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODE$8);
                }
                target.set(code);
            }
        }
        
        /**
         * Unsets the "code" attribute
         */
        public void unsetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CODE$8);
            }
        }
        
        /**
         * Gets the "state" attribute
         */
        public org.landxml.schema.landXML11.StateType.Enum getState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$10);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.StateType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "state" attribute
         */
        public org.landxml.schema.landXML11.StateType xgetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StateType target = null;
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$10);
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
                return get_store().find_attribute_user(STATE$10) != null;
            }
        }
        
        /**
         * Sets the "state" attribute
         */
        public void setState(org.landxml.schema.landXML11.StateType.Enum state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$10);
                }
                target.setEnumValue(state);
            }
        }
        
        /**
         * Sets (as xml) the "state" attribute
         */
        public void xsetState(org.landxml.schema.landXML11.StateType state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StateType target = null;
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$10);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$10);
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
                get_store().remove_attribute(STATE$10);
            }
        }
        
        /**
         * Gets the "pntRef" attribute
         */
        public java.lang.String getPntRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PNTREF$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pntRef" attribute
         */
        public org.landxml.schema.landXML11.PointNameRef xgetPntRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointNameRef target = null;
                target = (org.landxml.schema.landXML11.PointNameRef)get_store().find_attribute_user(PNTREF$12);
                return target;
            }
        }
        
        /**
         * True if has "pntRef" attribute
         */
        public boolean isSetPntRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PNTREF$12) != null;
            }
        }
        
        /**
         * Sets the "pntRef" attribute
         */
        public void setPntRef(java.lang.String pntRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PNTREF$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PNTREF$12);
                }
                target.setStringValue(pntRef);
            }
        }
        
        /**
         * Sets (as xml) the "pntRef" attribute
         */
        public void xsetPntRef(org.landxml.schema.landXML11.PointNameRef pntRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointNameRef target = null;
                target = (org.landxml.schema.landXML11.PointNameRef)get_store().find_attribute_user(PNTREF$12);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PointNameRef)get_store().add_attribute_user(PNTREF$12);
                }
                target.set(pntRef);
            }
        }
        
        /**
         * Unsets the "pntRef" attribute
         */
        public void unsetPntRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PNTREF$12);
            }
        }
        
        /**
         * Gets the "pointGeometry" attribute
         */
        public org.landxml.schema.landXML11.PointGeometryType.Enum getPointGeometry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POINTGEOMETRY$14);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.PointGeometryType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "pointGeometry" attribute
         */
        public org.landxml.schema.landXML11.PointGeometryType xgetPointGeometry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointGeometryType target = null;
                target = (org.landxml.schema.landXML11.PointGeometryType)get_store().find_attribute_user(POINTGEOMETRY$14);
                return target;
            }
        }
        
        /**
         * True if has "pointGeometry" attribute
         */
        public boolean isSetPointGeometry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POINTGEOMETRY$14) != null;
            }
        }
        
        /**
         * Sets the "pointGeometry" attribute
         */
        public void setPointGeometry(org.landxml.schema.landXML11.PointGeometryType.Enum pointGeometry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POINTGEOMETRY$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POINTGEOMETRY$14);
                }
                target.setEnumValue(pointGeometry);
            }
        }
        
        /**
         * Sets (as xml) the "pointGeometry" attribute
         */
        public void xsetPointGeometry(org.landxml.schema.landXML11.PointGeometryType pointGeometry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointGeometryType target = null;
                target = (org.landxml.schema.landXML11.PointGeometryType)get_store().find_attribute_user(POINTGEOMETRY$14);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PointGeometryType)get_store().add_attribute_user(POINTGEOMETRY$14);
                }
                target.set(pointGeometry);
            }
        }
        
        /**
         * Unsets the "pointGeometry" attribute
         */
        public void unsetPointGeometry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POINTGEOMETRY$14);
            }
        }
        
        /**
         * Gets the "DTMAttribute" attribute
         */
        public org.landxml.schema.landXML11.DTMAttributeType.Enum getDTMAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DTMATTRIBUTE$16);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.DTMAttributeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "DTMAttribute" attribute
         */
        public org.landxml.schema.landXML11.DTMAttributeType xgetDTMAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DTMAttributeType target = null;
                target = (org.landxml.schema.landXML11.DTMAttributeType)get_store().find_attribute_user(DTMATTRIBUTE$16);
                return target;
            }
        }
        
        /**
         * True if has "DTMAttribute" attribute
         */
        public boolean isSetDTMAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DTMATTRIBUTE$16) != null;
            }
        }
        
        /**
         * Sets the "DTMAttribute" attribute
         */
        public void setDTMAttribute(org.landxml.schema.landXML11.DTMAttributeType.Enum dtmAttribute)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DTMATTRIBUTE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DTMATTRIBUTE$16);
                }
                target.setEnumValue(dtmAttribute);
            }
        }
        
        /**
         * Sets (as xml) the "DTMAttribute" attribute
         */
        public void xsetDTMAttribute(org.landxml.schema.landXML11.DTMAttributeType dtmAttribute)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DTMAttributeType target = null;
                target = (org.landxml.schema.landXML11.DTMAttributeType)get_store().find_attribute_user(DTMATTRIBUTE$16);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.DTMAttributeType)get_store().add_attribute_user(DTMATTRIBUTE$16);
                }
                target.set(dtmAttribute);
            }
        }
        
        /**
         * Unsets the "DTMAttribute" attribute
         */
        public void unsetDTMAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DTMATTRIBUTE$16);
            }
        }
    }
}
