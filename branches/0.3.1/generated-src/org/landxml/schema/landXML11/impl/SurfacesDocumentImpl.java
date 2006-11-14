/*
 * An XML document type.
 * Localname: Surfaces
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.SurfacesDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Surfaces(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class SurfacesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SurfacesDocument
{
    
    public SurfacesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFACES$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Surfaces");
    
    
    /**
     * Gets the "Surfaces" element
     */
    public org.landxml.schema.landXML11.SurfacesDocument.Surfaces getSurfaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SurfacesDocument.Surfaces target = null;
            target = (org.landxml.schema.landXML11.SurfacesDocument.Surfaces)get_store().find_element_user(SURFACES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Surfaces" element
     */
    public void setSurfaces(org.landxml.schema.landXML11.SurfacesDocument.Surfaces surfaces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SurfacesDocument.Surfaces target = null;
            target = (org.landxml.schema.landXML11.SurfacesDocument.Surfaces)get_store().find_element_user(SURFACES$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.SurfacesDocument.Surfaces)get_store().add_element_user(SURFACES$0);
            }
            target.set(surfaces);
        }
    }
    
    /**
     * Appends and returns a new empty "Surfaces" element
     */
    public org.landxml.schema.landXML11.SurfacesDocument.Surfaces addNewSurfaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SurfacesDocument.Surfaces target = null;
            target = (org.landxml.schema.landXML11.SurfacesDocument.Surfaces)get_store().add_element_user(SURFACES$0);
            return target;
        }
    }
    /**
     * An XML Surfaces(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class SurfacesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SurfacesDocument.Surfaces
    {
        
        public SurfacesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SURFACE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Surface");
        private static final javax.xml.namespace.QName SURFVOLUMES$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "SurfVolumes");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName DESC$6 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName NAME$8 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName STATE$10 = 
            new javax.xml.namespace.QName("", "state");
        
        
        /**
         * Gets a List of "Surface" elements
         */
        public java.util.List<org.landxml.schema.landXML11.SurfaceDocument.Surface> getSurfaceList()
        {
            final class SurfaceList extends java.util.AbstractList<org.landxml.schema.landXML11.SurfaceDocument.Surface>
            {
                public org.landxml.schema.landXML11.SurfaceDocument.Surface get(int i)
                    { return SurfacesImpl.this.getSurfaceArray(i); }
                
                public org.landxml.schema.landXML11.SurfaceDocument.Surface set(int i, org.landxml.schema.landXML11.SurfaceDocument.Surface o)
                {
                    org.landxml.schema.landXML11.SurfaceDocument.Surface old = SurfacesImpl.this.getSurfaceArray(i);
                    SurfacesImpl.this.setSurfaceArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.SurfaceDocument.Surface o)
                    { SurfacesImpl.this.insertNewSurface(i).set(o); }
                
                public org.landxml.schema.landXML11.SurfaceDocument.Surface remove(int i)
                {
                    org.landxml.schema.landXML11.SurfaceDocument.Surface old = SurfacesImpl.this.getSurfaceArray(i);
                    SurfacesImpl.this.removeSurface(i);
                    return old;
                }
                
                public int size()
                    { return SurfacesImpl.this.sizeOfSurfaceArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SurfaceList();
            }
        }
        
        /**
         * Gets array of all "Surface" elements
         */
        public org.landxml.schema.landXML11.SurfaceDocument.Surface[] getSurfaceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SURFACE$0, targetList);
                org.landxml.schema.landXML11.SurfaceDocument.Surface[] result = new org.landxml.schema.landXML11.SurfaceDocument.Surface[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Surface" element
         */
        public org.landxml.schema.landXML11.SurfaceDocument.Surface getSurfaceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfaceDocument.Surface target = null;
                target = (org.landxml.schema.landXML11.SurfaceDocument.Surface)get_store().find_element_user(SURFACE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Surface" element
         */
        public int sizeOfSurfaceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SURFACE$0);
            }
        }
        
        /**
         * Sets array of all "Surface" element
         */
        public void setSurfaceArray(org.landxml.schema.landXML11.SurfaceDocument.Surface[] surfaceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(surfaceArray, SURFACE$0);
            }
        }
        
        /**
         * Sets ith "Surface" element
         */
        public void setSurfaceArray(int i, org.landxml.schema.landXML11.SurfaceDocument.Surface surface)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfaceDocument.Surface target = null;
                target = (org.landxml.schema.landXML11.SurfaceDocument.Surface)get_store().find_element_user(SURFACE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(surface);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Surface" element
         */
        public org.landxml.schema.landXML11.SurfaceDocument.Surface insertNewSurface(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfaceDocument.Surface target = null;
                target = (org.landxml.schema.landXML11.SurfaceDocument.Surface)get_store().insert_element_user(SURFACE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Surface" element
         */
        public org.landxml.schema.landXML11.SurfaceDocument.Surface addNewSurface()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfaceDocument.Surface target = null;
                target = (org.landxml.schema.landXML11.SurfaceDocument.Surface)get_store().add_element_user(SURFACE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Surface" element
         */
        public void removeSurface(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SURFACE$0, i);
            }
        }
        
        /**
         * Gets a List of "SurfVolumes" elements
         */
        public java.util.List<org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes> getSurfVolumesList()
        {
            final class SurfVolumesList extends java.util.AbstractList<org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes>
            {
                public org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes get(int i)
                    { return SurfacesImpl.this.getSurfVolumesArray(i); }
                
                public org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes set(int i, org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes o)
                {
                    org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes old = SurfacesImpl.this.getSurfVolumesArray(i);
                    SurfacesImpl.this.setSurfVolumesArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes o)
                    { SurfacesImpl.this.insertNewSurfVolumes(i).set(o); }
                
                public org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes remove(int i)
                {
                    org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes old = SurfacesImpl.this.getSurfVolumesArray(i);
                    SurfacesImpl.this.removeSurfVolumes(i);
                    return old;
                }
                
                public int size()
                    { return SurfacesImpl.this.sizeOfSurfVolumesArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SurfVolumesList();
            }
        }
        
        /**
         * Gets array of all "SurfVolumes" elements
         */
        public org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes[] getSurfVolumesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SURFVOLUMES$2, targetList);
                org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes[] result = new org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "SurfVolumes" element
         */
        public org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes getSurfVolumesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes target = null;
                target = (org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes)get_store().find_element_user(SURFVOLUMES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "SurfVolumes" element
         */
        public int sizeOfSurfVolumesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SURFVOLUMES$2);
            }
        }
        
        /**
         * Sets array of all "SurfVolumes" element
         */
        public void setSurfVolumesArray(org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes[] surfVolumesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(surfVolumesArray, SURFVOLUMES$2);
            }
        }
        
        /**
         * Sets ith "SurfVolumes" element
         */
        public void setSurfVolumesArray(int i, org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes surfVolumes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes target = null;
                target = (org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes)get_store().find_element_user(SURFVOLUMES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(surfVolumes);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SurfVolumes" element
         */
        public org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes insertNewSurfVolumes(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes target = null;
                target = (org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes)get_store().insert_element_user(SURFVOLUMES$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SurfVolumes" element
         */
        public org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes addNewSurfVolumes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes target = null;
                target = (org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes)get_store().add_element_user(SURFVOLUMES$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "SurfVolumes" element
         */
        public void removeSurfVolumes(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SURFVOLUMES$2, i);
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
                    { return SurfacesImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = SurfacesImpl.this.getFeatureArray(i);
                    SurfacesImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { SurfacesImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = SurfacesImpl.this.getFeatureArray(i);
                    SurfacesImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return SurfacesImpl.this.sizeOfFeatureArray(); }
                
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
    }
}
