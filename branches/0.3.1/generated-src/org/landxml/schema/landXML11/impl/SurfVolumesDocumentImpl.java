/*
 * An XML document type.
 * Localname: SurfVolumes
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.SurfVolumesDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one SurfVolumes(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class SurfVolumesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SurfVolumesDocument
{
    
    public SurfVolumesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFVOLUMES$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "SurfVolumes");
    
    
    /**
     * Gets the "SurfVolumes" element
     */
    public org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes getSurfVolumes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes target = null;
            target = (org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes)get_store().find_element_user(SURFVOLUMES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SurfVolumes" element
     */
    public void setSurfVolumes(org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes surfVolumes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes target = null;
            target = (org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes)get_store().find_element_user(SURFVOLUMES$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes)get_store().add_element_user(SURFVOLUMES$0);
            }
            target.set(surfVolumes);
        }
    }
    
    /**
     * Appends and returns a new empty "SurfVolumes" element
     */
    public org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes addNewSurfVolumes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes target = null;
            target = (org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes)get_store().add_element_user(SURFVOLUMES$0);
            return target;
        }
    }
    /**
     * An XML SurfVolumes(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class SurfVolumesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SurfVolumesDocument.SurfVolumes
    {
        
        public SurfVolumesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SURFVOLUME$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "SurfVolume");
        private static final javax.xml.namespace.QName FEATURE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName DESC$4 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName NAME$6 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName SURFVOLCALCMETHOD$8 = 
            new javax.xml.namespace.QName("", "surfVolCalcMethod");
        
        
        /**
         * Gets a List of "SurfVolume" elements
         */
        public java.util.List<org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume> getSurfVolumeList()
        {
            final class SurfVolumeList extends java.util.AbstractList<org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume>
            {
                public org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume get(int i)
                    { return SurfVolumesImpl.this.getSurfVolumeArray(i); }
                
                public org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume set(int i, org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume o)
                {
                    org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume old = SurfVolumesImpl.this.getSurfVolumeArray(i);
                    SurfVolumesImpl.this.setSurfVolumeArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume o)
                    { SurfVolumesImpl.this.insertNewSurfVolume(i).set(o); }
                
                public org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume remove(int i)
                {
                    org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume old = SurfVolumesImpl.this.getSurfVolumeArray(i);
                    SurfVolumesImpl.this.removeSurfVolume(i);
                    return old;
                }
                
                public int size()
                    { return SurfVolumesImpl.this.sizeOfSurfVolumeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SurfVolumeList();
            }
        }
        
        /**
         * Gets array of all "SurfVolume" elements
         */
        public org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume[] getSurfVolumeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SURFVOLUME$0, targetList);
                org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume[] result = new org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "SurfVolume" element
         */
        public org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume getSurfVolumeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume target = null;
                target = (org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume)get_store().find_element_user(SURFVOLUME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "SurfVolume" element
         */
        public int sizeOfSurfVolumeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SURFVOLUME$0);
            }
        }
        
        /**
         * Sets array of all "SurfVolume" element
         */
        public void setSurfVolumeArray(org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume[] surfVolumeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(surfVolumeArray, SURFVOLUME$0);
            }
        }
        
        /**
         * Sets ith "SurfVolume" element
         */
        public void setSurfVolumeArray(int i, org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume surfVolume)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume target = null;
                target = (org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume)get_store().find_element_user(SURFVOLUME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(surfVolume);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SurfVolume" element
         */
        public org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume insertNewSurfVolume(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume target = null;
                target = (org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume)get_store().insert_element_user(SURFVOLUME$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SurfVolume" element
         */
        public org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume addNewSurfVolume()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume target = null;
                target = (org.landxml.schema.landXML11.SurfVolumeDocument.SurfVolume)get_store().add_element_user(SURFVOLUME$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "SurfVolume" element
         */
        public void removeSurfVolume(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SURFVOLUME$0, i);
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
                    { return SurfVolumesImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = SurfVolumesImpl.this.getFeatureArray(i);
                    SurfVolumesImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { SurfVolumesImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = SurfVolumesImpl.this.getFeatureArray(i);
                    SurfVolumesImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return SurfVolumesImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "surfVolCalcMethod" attribute
         */
        public org.landxml.schema.landXML11.SurfVolCMethodType.Enum getSurfVolCalcMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURFVOLCALCMETHOD$8);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.SurfVolCMethodType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "surfVolCalcMethod" attribute
         */
        public org.landxml.schema.landXML11.SurfVolCMethodType xgetSurfVolCalcMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfVolCMethodType target = null;
                target = (org.landxml.schema.landXML11.SurfVolCMethodType)get_store().find_attribute_user(SURFVOLCALCMETHOD$8);
                return target;
            }
        }
        
        /**
         * Sets the "surfVolCalcMethod" attribute
         */
        public void setSurfVolCalcMethod(org.landxml.schema.landXML11.SurfVolCMethodType.Enum surfVolCalcMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURFVOLCALCMETHOD$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SURFVOLCALCMETHOD$8);
                }
                target.setEnumValue(surfVolCalcMethod);
            }
        }
        
        /**
         * Sets (as xml) the "surfVolCalcMethod" attribute
         */
        public void xsetSurfVolCalcMethod(org.landxml.schema.landXML11.SurfVolCMethodType surfVolCalcMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfVolCMethodType target = null;
                target = (org.landxml.schema.landXML11.SurfVolCMethodType)get_store().find_attribute_user(SURFVOLCALCMETHOD$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SurfVolCMethodType)get_store().add_attribute_user(SURFVOLCALCMETHOD$8);
                }
                target.set(surfVolCalcMethod);
            }
        }
    }
}
