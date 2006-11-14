/*
 * An XML document type.
 * Localname: Structs
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.StructsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Structs(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class StructsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.StructsDocument
{
    
    public StructsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTS$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Structs");
    
    
    /**
     * Gets the "Structs" element
     */
    public org.landxml.schema.landXML11.StructsDocument.Structs getStructs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.StructsDocument.Structs target = null;
            target = (org.landxml.schema.landXML11.StructsDocument.Structs)get_store().find_element_user(STRUCTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Structs" element
     */
    public void setStructs(org.landxml.schema.landXML11.StructsDocument.Structs structs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.StructsDocument.Structs target = null;
            target = (org.landxml.schema.landXML11.StructsDocument.Structs)get_store().find_element_user(STRUCTS$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.StructsDocument.Structs)get_store().add_element_user(STRUCTS$0);
            }
            target.set(structs);
        }
    }
    
    /**
     * Appends and returns a new empty "Structs" element
     */
    public org.landxml.schema.landXML11.StructsDocument.Structs addNewStructs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.StructsDocument.Structs target = null;
            target = (org.landxml.schema.landXML11.StructsDocument.Structs)get_store().add_element_user(STRUCTS$0);
            return target;
        }
    }
    /**
     * An XML Structs(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class StructsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.StructsDocument.Structs
    {
        
        public StructsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UNITS$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Units");
        private static final javax.xml.namespace.QName STRUCT$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Struct");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        
        
        /**
         * Gets the "Units" element
         */
        public org.landxml.schema.landXML11.UnitsDocument.Units getUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.UnitsDocument.Units target = null;
                target = (org.landxml.schema.landXML11.UnitsDocument.Units)get_store().find_element_user(UNITS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Units" element
         */
        public boolean isSetUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UNITS$0) != 0;
            }
        }
        
        /**
         * Sets the "Units" element
         */
        public void setUnits(org.landxml.schema.landXML11.UnitsDocument.Units units)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.UnitsDocument.Units target = null;
                target = (org.landxml.schema.landXML11.UnitsDocument.Units)get_store().find_element_user(UNITS$0, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.UnitsDocument.Units)get_store().add_element_user(UNITS$0);
                }
                target.set(units);
            }
        }
        
        /**
         * Appends and returns a new empty "Units" element
         */
        public org.landxml.schema.landXML11.UnitsDocument.Units addNewUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.UnitsDocument.Units target = null;
                target = (org.landxml.schema.landXML11.UnitsDocument.Units)get_store().add_element_user(UNITS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "Units" element
         */
        public void unsetUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UNITS$0, 0);
            }
        }
        
        /**
         * Gets a List of "Struct" elements
         */
        public java.util.List<org.landxml.schema.landXML11.StructDocument.Struct> getStructList()
        {
            final class StructList extends java.util.AbstractList<org.landxml.schema.landXML11.StructDocument.Struct>
            {
                public org.landxml.schema.landXML11.StructDocument.Struct get(int i)
                    { return StructsImpl.this.getStructArray(i); }
                
                public org.landxml.schema.landXML11.StructDocument.Struct set(int i, org.landxml.schema.landXML11.StructDocument.Struct o)
                {
                    org.landxml.schema.landXML11.StructDocument.Struct old = StructsImpl.this.getStructArray(i);
                    StructsImpl.this.setStructArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.StructDocument.Struct o)
                    { StructsImpl.this.insertNewStruct(i).set(o); }
                
                public org.landxml.schema.landXML11.StructDocument.Struct remove(int i)
                {
                    org.landxml.schema.landXML11.StructDocument.Struct old = StructsImpl.this.getStructArray(i);
                    StructsImpl.this.removeStruct(i);
                    return old;
                }
                
                public int size()
                    { return StructsImpl.this.sizeOfStructArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new StructList();
            }
        }
        
        /**
         * Gets array of all "Struct" elements
         */
        public org.landxml.schema.landXML11.StructDocument.Struct[] getStructArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STRUCT$2, targetList);
                org.landxml.schema.landXML11.StructDocument.Struct[] result = new org.landxml.schema.landXML11.StructDocument.Struct[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Struct" element
         */
        public org.landxml.schema.landXML11.StructDocument.Struct getStructArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StructDocument.Struct target = null;
                target = (org.landxml.schema.landXML11.StructDocument.Struct)get_store().find_element_user(STRUCT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Struct" element
         */
        public int sizeOfStructArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRUCT$2);
            }
        }
        
        /**
         * Sets array of all "Struct" element
         */
        public void setStructArray(org.landxml.schema.landXML11.StructDocument.Struct[] structArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(structArray, STRUCT$2);
            }
        }
        
        /**
         * Sets ith "Struct" element
         */
        public void setStructArray(int i, org.landxml.schema.landXML11.StructDocument.Struct struct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StructDocument.Struct target = null;
                target = (org.landxml.schema.landXML11.StructDocument.Struct)get_store().find_element_user(STRUCT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(struct);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Struct" element
         */
        public org.landxml.schema.landXML11.StructDocument.Struct insertNewStruct(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StructDocument.Struct target = null;
                target = (org.landxml.schema.landXML11.StructDocument.Struct)get_store().insert_element_user(STRUCT$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Struct" element
         */
        public org.landxml.schema.landXML11.StructDocument.Struct addNewStruct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StructDocument.Struct target = null;
                target = (org.landxml.schema.landXML11.StructDocument.Struct)get_store().add_element_user(STRUCT$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Struct" element
         */
        public void removeStruct(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRUCT$2, i);
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
                    { return StructsImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = StructsImpl.this.getFeatureArray(i);
                    StructsImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { StructsImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = StructsImpl.this.getFeatureArray(i);
                    StructsImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return StructsImpl.this.sizeOfFeatureArray(); }
                
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
    }
}
