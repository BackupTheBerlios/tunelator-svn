/*
 * An XML document type.
 * Localname: GradeModel
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.GradeModelDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one GradeModel(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class GradeModelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.GradeModelDocument
{
    
    public GradeModelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRADEMODEL$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "GradeModel");
    
    
    /**
     * Gets the "GradeModel" element
     */
    public org.landxml.schema.landXML11.GradeModelDocument.GradeModel getGradeModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GradeModelDocument.GradeModel target = null;
            target = (org.landxml.schema.landXML11.GradeModelDocument.GradeModel)get_store().find_element_user(GRADEMODEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GradeModel" element
     */
    public void setGradeModel(org.landxml.schema.landXML11.GradeModelDocument.GradeModel gradeModel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GradeModelDocument.GradeModel target = null;
            target = (org.landxml.schema.landXML11.GradeModelDocument.GradeModel)get_store().find_element_user(GRADEMODEL$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.GradeModelDocument.GradeModel)get_store().add_element_user(GRADEMODEL$0);
            }
            target.set(gradeModel);
        }
    }
    
    /**
     * Appends and returns a new empty "GradeModel" element
     */
    public org.landxml.schema.landXML11.GradeModelDocument.GradeModel addNewGradeModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GradeModelDocument.GradeModel target = null;
            target = (org.landxml.schema.landXML11.GradeModelDocument.GradeModel)get_store().add_element_user(GRADEMODEL$0);
            return target;
        }
    }
    /**
     * An XML GradeModel(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class GradeModelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.GradeModelDocument.GradeModel
    {
        
        public GradeModelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GRADESURFACE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "GradeSurface");
        private static final javax.xml.namespace.QName FEATURE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName DESC$4 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName NAME$6 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName STATE$8 = 
            new javax.xml.namespace.QName("", "state");
        
        
        /**
         * Gets a List of "GradeSurface" elements
         */
        public java.util.List<org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface> getGradeSurfaceList()
        {
            final class GradeSurfaceList extends java.util.AbstractList<org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface>
            {
                public org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface get(int i)
                    { return GradeModelImpl.this.getGradeSurfaceArray(i); }
                
                public org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface set(int i, org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface o)
                {
                    org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface old = GradeModelImpl.this.getGradeSurfaceArray(i);
                    GradeModelImpl.this.setGradeSurfaceArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface o)
                    { GradeModelImpl.this.insertNewGradeSurface(i).set(o); }
                
                public org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface remove(int i)
                {
                    org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface old = GradeModelImpl.this.getGradeSurfaceArray(i);
                    GradeModelImpl.this.removeGradeSurface(i);
                    return old;
                }
                
                public int size()
                    { return GradeModelImpl.this.sizeOfGradeSurfaceArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new GradeSurfaceList();
            }
        }
        
        /**
         * Gets array of all "GradeSurface" elements
         */
        public org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface[] getGradeSurfaceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GRADESURFACE$0, targetList);
                org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface[] result = new org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "GradeSurface" element
         */
        public org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface getGradeSurfaceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface target = null;
                target = (org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface)get_store().find_element_user(GRADESURFACE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "GradeSurface" element
         */
        public int sizeOfGradeSurfaceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GRADESURFACE$0);
            }
        }
        
        /**
         * Sets array of all "GradeSurface" element
         */
        public void setGradeSurfaceArray(org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface[] gradeSurfaceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(gradeSurfaceArray, GRADESURFACE$0);
            }
        }
        
        /**
         * Sets ith "GradeSurface" element
         */
        public void setGradeSurfaceArray(int i, org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface gradeSurface)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface target = null;
                target = (org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface)get_store().find_element_user(GRADESURFACE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(gradeSurface);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GradeSurface" element
         */
        public org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface insertNewGradeSurface(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface target = null;
                target = (org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface)get_store().insert_element_user(GRADESURFACE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GradeSurface" element
         */
        public org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface addNewGradeSurface()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface target = null;
                target = (org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface)get_store().add_element_user(GRADESURFACE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "GradeSurface" element
         */
        public void removeGradeSurface(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GRADESURFACE$0, i);
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
                    { return GradeModelImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = GradeModelImpl.this.getFeatureArray(i);
                    GradeModelImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { GradeModelImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = GradeModelImpl.this.getFeatureArray(i);
                    GradeModelImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return GradeModelImpl.this.sizeOfFeatureArray(); }
                
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
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$6) != null;
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
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$8);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$8);
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
        public void setState(org.landxml.schema.landXML11.StateType.Enum state)
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$8);
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
    }
}
