/*
 * An XML document type.
 * Localname: CircPipe
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CircPipeDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one CircPipe(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class CircPipeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CircPipeDocument
{
    
    public CircPipeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIRCPIPE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CircPipe");
    
    
    /**
     * Gets the "CircPipe" element
     */
    public org.landxml.schema.landXML11.CircPipeDocument.CircPipe getCircPipe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CircPipeDocument.CircPipe target = null;
            target = (org.landxml.schema.landXML11.CircPipeDocument.CircPipe)get_store().find_element_user(CIRCPIPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CircPipe" element
     */
    public void setCircPipe(org.landxml.schema.landXML11.CircPipeDocument.CircPipe circPipe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CircPipeDocument.CircPipe target = null;
            target = (org.landxml.schema.landXML11.CircPipeDocument.CircPipe)get_store().find_element_user(CIRCPIPE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.CircPipeDocument.CircPipe)get_store().add_element_user(CIRCPIPE$0);
            }
            target.set(circPipe);
        }
    }
    
    /**
     * Appends and returns a new empty "CircPipe" element
     */
    public org.landxml.schema.landXML11.CircPipeDocument.CircPipe addNewCircPipe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CircPipeDocument.CircPipe target = null;
            target = (org.landxml.schema.landXML11.CircPipeDocument.CircPipe)get_store().add_element_user(CIRCPIPE$0);
            return target;
        }
    }
    /**
     * An XML CircPipe(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class CircPipeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CircPipeDocument.CircPipe
    {
        
        public CircPipeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FEATURE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName DIAMETER$2 = 
            new javax.xml.namespace.QName("", "diameter");
        private static final javax.xml.namespace.QName DESC$4 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName HAZENWILLIAMS$6 = 
            new javax.xml.namespace.QName("", "hazenWilliams");
        private static final javax.xml.namespace.QName MANNINGS$8 = 
            new javax.xml.namespace.QName("", "mannings");
        private static final javax.xml.namespace.QName MATERIAL$10 = 
            new javax.xml.namespace.QName("", "material");
        private static final javax.xml.namespace.QName THICKNESS$12 = 
            new javax.xml.namespace.QName("", "thickness");
        
        
        /**
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return CircPipeImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CircPipeImpl.this.getFeatureArray(i);
                    CircPipeImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { CircPipeImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CircPipeImpl.this.getFeatureArray(i);
                    CircPipeImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return CircPipeImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$0, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$0, i);
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
                return get_store().count_elements(FEATURE$0);
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
                arraySetterHelper(featureArray, FEATURE$0);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$0, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$0, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$0);
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
                get_store().remove_element(FEATURE$0, i);
            }
        }
        
        /**
         * Gets the "diameter" attribute
         */
        public double getDiameter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIAMETER$2);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "diameter" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetDiameter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DIAMETER$2);
                return target;
            }
        }
        
        /**
         * Sets the "diameter" attribute
         */
        public void setDiameter(double diameter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIAMETER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIAMETER$2);
                }
                target.setDoubleValue(diameter);
            }
        }
        
        /**
         * Sets (as xml) the "diameter" attribute
         */
        public void xsetDiameter(org.apache.xmlbeans.XmlDouble diameter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DIAMETER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DIAMETER$2);
                }
                target.set(diameter);
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
         * Gets the "hazenWilliams" attribute
         */
        public double getHazenWilliams()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HAZENWILLIAMS$6);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "hazenWilliams" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetHazenWilliams()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HAZENWILLIAMS$6);
                return target;
            }
        }
        
        /**
         * True if has "hazenWilliams" attribute
         */
        public boolean isSetHazenWilliams()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HAZENWILLIAMS$6) != null;
            }
        }
        
        /**
         * Sets the "hazenWilliams" attribute
         */
        public void setHazenWilliams(double hazenWilliams)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HAZENWILLIAMS$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HAZENWILLIAMS$6);
                }
                target.setDoubleValue(hazenWilliams);
            }
        }
        
        /**
         * Sets (as xml) the "hazenWilliams" attribute
         */
        public void xsetHazenWilliams(org.apache.xmlbeans.XmlDouble hazenWilliams)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HAZENWILLIAMS$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(HAZENWILLIAMS$6);
                }
                target.set(hazenWilliams);
            }
        }
        
        /**
         * Unsets the "hazenWilliams" attribute
         */
        public void unsetHazenWilliams()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HAZENWILLIAMS$6);
            }
        }
        
        /**
         * Gets the "mannings" attribute
         */
        public double getMannings()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANNINGS$8);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "mannings" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetMannings()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MANNINGS$8);
                return target;
            }
        }
        
        /**
         * True if has "mannings" attribute
         */
        public boolean isSetMannings()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MANNINGS$8) != null;
            }
        }
        
        /**
         * Sets the "mannings" attribute
         */
        public void setMannings(double mannings)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANNINGS$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MANNINGS$8);
                }
                target.setDoubleValue(mannings);
            }
        }
        
        /**
         * Sets (as xml) the "mannings" attribute
         */
        public void xsetMannings(org.apache.xmlbeans.XmlDouble mannings)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MANNINGS$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MANNINGS$8);
                }
                target.set(mannings);
            }
        }
        
        /**
         * Unsets the "mannings" attribute
         */
        public void unsetMannings()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MANNINGS$8);
            }
        }
        
        /**
         * Gets the "material" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getMaterial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(MATERIAL$10);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "material" attribute
         */
        public boolean isSetMaterial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MATERIAL$10) != null;
            }
        }
        
        /**
         * Sets the "material" attribute
         */
        public void setMaterial(org.apache.xmlbeans.XmlAnySimpleType material)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(MATERIAL$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(MATERIAL$10);
                }
                target.set(material);
            }
        }
        
        /**
         * Appends and returns a new empty "material" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewMaterial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(MATERIAL$10);
                return target;
            }
        }
        
        /**
         * Unsets the "material" attribute
         */
        public void unsetMaterial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MATERIAL$10);
            }
        }
        
        /**
         * Gets the "thickness" attribute
         */
        public double getThickness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THICKNESS$12);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "thickness" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetThickness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(THICKNESS$12);
                return target;
            }
        }
        
        /**
         * True if has "thickness" attribute
         */
        public boolean isSetThickness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(THICKNESS$12) != null;
            }
        }
        
        /**
         * Sets the "thickness" attribute
         */
        public void setThickness(double thickness)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THICKNESS$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THICKNESS$12);
                }
                target.setDoubleValue(thickness);
            }
        }
        
        /**
         * Sets (as xml) the "thickness" attribute
         */
        public void xsetThickness(org.apache.xmlbeans.XmlDouble thickness)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(THICKNESS$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(THICKNESS$12);
                }
                target.set(thickness);
            }
        }
        
        /**
         * Unsets the "thickness" attribute
         */
        public void unsetThickness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(THICKNESS$12);
            }
        }
    }
}
