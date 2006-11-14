/*
 * An XML document type.
 * Localname: Feature
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.FeatureDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Feature(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class FeatureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.FeatureDocument
{
    
    public FeatureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATURE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
    
    
    /**
     * Gets the "Feature" element
     */
    public org.landxml.schema.landXML11.FeatureDocument.Feature getFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.FeatureDocument.Feature target = null;
            target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Feature" element
     */
    public void setFeature(org.landxml.schema.landXML11.FeatureDocument.Feature feature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.FeatureDocument.Feature target = null;
            target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$0);
            }
            target.set(feature);
        }
    }
    
    /**
     * Appends and returns a new empty "Feature" element
     */
    public org.landxml.schema.landXML11.FeatureDocument.Feature addNewFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.FeatureDocument.Feature target = null;
            target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$0);
            return target;
        }
    }
    /**
     * An XML Feature(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class FeatureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.FeatureDocument.Feature
    {
        
        public FeatureImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROPERTY$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Property");
        private static final javax.xml.namespace.QName DOCFILEREF$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "DocFileRef");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName CODE$6 = 
            new javax.xml.namespace.QName("", "code");
        private static final javax.xml.namespace.QName SOURCE$8 = 
            new javax.xml.namespace.QName("", "source");
        
        
        /**
         * Gets a List of "Property" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PropertyDocument.Property> getPropertyList()
        {
            final class PropertyList extends java.util.AbstractList<org.landxml.schema.landXML11.PropertyDocument.Property>
            {
                public org.landxml.schema.landXML11.PropertyDocument.Property get(int i)
                    { return FeatureImpl.this.getPropertyArray(i); }
                
                public org.landxml.schema.landXML11.PropertyDocument.Property set(int i, org.landxml.schema.landXML11.PropertyDocument.Property o)
                {
                    org.landxml.schema.landXML11.PropertyDocument.Property old = FeatureImpl.this.getPropertyArray(i);
                    FeatureImpl.this.setPropertyArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PropertyDocument.Property o)
                    { FeatureImpl.this.insertNewProperty(i).set(o); }
                
                public org.landxml.schema.landXML11.PropertyDocument.Property remove(int i)
                {
                    org.landxml.schema.landXML11.PropertyDocument.Property old = FeatureImpl.this.getPropertyArray(i);
                    FeatureImpl.this.removeProperty(i);
                    return old;
                }
                
                public int size()
                    { return FeatureImpl.this.sizeOfPropertyArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PropertyList();
            }
        }
        
        /**
         * Gets array of all "Property" elements
         */
        public org.landxml.schema.landXML11.PropertyDocument.Property[] getPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROPERTY$0, targetList);
                org.landxml.schema.landXML11.PropertyDocument.Property[] result = new org.landxml.schema.landXML11.PropertyDocument.Property[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Property" element
         */
        public org.landxml.schema.landXML11.PropertyDocument.Property getPropertyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PropertyDocument.Property target = null;
                target = (org.landxml.schema.landXML11.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Property" element
         */
        public int sizeOfPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROPERTY$0);
            }
        }
        
        /**
         * Sets array of all "Property" element
         */
        public void setPropertyArray(org.landxml.schema.landXML11.PropertyDocument.Property[] propertyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(propertyArray, PROPERTY$0);
            }
        }
        
        /**
         * Sets ith "Property" element
         */
        public void setPropertyArray(int i, org.landxml.schema.landXML11.PropertyDocument.Property property)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PropertyDocument.Property target = null;
                target = (org.landxml.schema.landXML11.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(property);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Property" element
         */
        public org.landxml.schema.landXML11.PropertyDocument.Property insertNewProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PropertyDocument.Property target = null;
                target = (org.landxml.schema.landXML11.PropertyDocument.Property)get_store().insert_element_user(PROPERTY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Property" element
         */
        public org.landxml.schema.landXML11.PropertyDocument.Property addNewProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PropertyDocument.Property target = null;
                target = (org.landxml.schema.landXML11.PropertyDocument.Property)get_store().add_element_user(PROPERTY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Property" element
         */
        public void removeProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROPERTY$0, i);
            }
        }
        
        /**
         * Gets a List of "DocFileRef" elements
         */
        public java.util.List<org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef> getDocFileRefList()
        {
            final class DocFileRefList extends java.util.AbstractList<org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef>
            {
                public org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef get(int i)
                    { return FeatureImpl.this.getDocFileRefArray(i); }
                
                public org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef set(int i, org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef o)
                {
                    org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef old = FeatureImpl.this.getDocFileRefArray(i);
                    FeatureImpl.this.setDocFileRefArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef o)
                    { FeatureImpl.this.insertNewDocFileRef(i).set(o); }
                
                public org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef remove(int i)
                {
                    org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef old = FeatureImpl.this.getDocFileRefArray(i);
                    FeatureImpl.this.removeDocFileRef(i);
                    return old;
                }
                
                public int size()
                    { return FeatureImpl.this.sizeOfDocFileRefArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DocFileRefList();
            }
        }
        
        /**
         * Gets array of all "DocFileRef" elements
         */
        public org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef[] getDocFileRefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DOCFILEREF$2, targetList);
                org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef[] result = new org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "DocFileRef" element
         */
        public org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef getDocFileRefArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef target = null;
                target = (org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef)get_store().find_element_user(DOCFILEREF$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "DocFileRef" element
         */
        public int sizeOfDocFileRefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DOCFILEREF$2);
            }
        }
        
        /**
         * Sets array of all "DocFileRef" element
         */
        public void setDocFileRefArray(org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef[] docFileRefArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(docFileRefArray, DOCFILEREF$2);
            }
        }
        
        /**
         * Sets ith "DocFileRef" element
         */
        public void setDocFileRefArray(int i, org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef docFileRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef target = null;
                target = (org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef)get_store().find_element_user(DOCFILEREF$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(docFileRef);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DocFileRef" element
         */
        public org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef insertNewDocFileRef(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef target = null;
                target = (org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef)get_store().insert_element_user(DOCFILEREF$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DocFileRef" element
         */
        public org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef addNewDocFileRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef target = null;
                target = (org.landxml.schema.landXML11.DocFileRefDocument.DocFileRef)get_store().add_element_user(DOCFILEREF$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "DocFileRef" element
         */
        public void removeDocFileRef(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DOCFILEREF$2, i);
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
                    { return FeatureImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = FeatureImpl.this.getFeatureArray(i);
                    FeatureImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { FeatureImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = FeatureImpl.this.getFeatureArray(i);
                    FeatureImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return FeatureImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "code" attribute
         */
        public java.lang.String getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODE$6);
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
                return get_store().find_attribute_user(CODE$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODE$6);
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
                get_store().remove_attribute(CODE$6);
            }
        }
        
        /**
         * Gets the "source" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(SOURCE$8);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "source" attribute
         */
        public boolean isSetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SOURCE$8) != null;
            }
        }
        
        /**
         * Sets the "source" attribute
         */
        public void setSource(org.apache.xmlbeans.XmlAnySimpleType source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(SOURCE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(SOURCE$8);
                }
                target.set(source);
            }
        }
        
        /**
         * Appends and returns a new empty "source" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(SOURCE$8);
                return target;
            }
        }
        
        /**
         * Unsets the "source" attribute
         */
        public void unsetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SOURCE$8);
            }
        }
    }
}
