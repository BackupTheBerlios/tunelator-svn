/*
 * An XML document type.
 * Localname: Surface
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.SurfaceDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Surface(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class SurfaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SurfaceDocument
{
    
    public SurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFACE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Surface");
    
    
    /**
     * Gets the "Surface" element
     */
    public org.landxml.schema.landXML11.SurfaceDocument.Surface getSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SurfaceDocument.Surface target = null;
            target = (org.landxml.schema.landXML11.SurfaceDocument.Surface)get_store().find_element_user(SURFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Surface" element
     */
    public void setSurface(org.landxml.schema.landXML11.SurfaceDocument.Surface surface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SurfaceDocument.Surface target = null;
            target = (org.landxml.schema.landXML11.SurfaceDocument.Surface)get_store().find_element_user(SURFACE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.SurfaceDocument.Surface)get_store().add_element_user(SURFACE$0);
            }
            target.set(surface);
        }
    }
    
    /**
     * Appends and returns a new empty "Surface" element
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
     * An XML Surface(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class SurfaceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SurfaceDocument.Surface
    {
        
        public SurfaceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCEDATA$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "SourceData");
        private static final javax.xml.namespace.QName DEFINITION$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Definition");
        private static final javax.xml.namespace.QName WATERSHEDS$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Watersheds");
        private static final javax.xml.namespace.QName FEATURE$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName NAME$8 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESC$10 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName OID$12 = 
            new javax.xml.namespace.QName("", "OID");
        private static final javax.xml.namespace.QName STATE$14 = 
            new javax.xml.namespace.QName("", "state");
        
        
        /**
         * Gets a List of "SourceData" elements
         */
        public java.util.List<org.landxml.schema.landXML11.SourceDataDocument.SourceData> getSourceDataList()
        {
            final class SourceDataList extends java.util.AbstractList<org.landxml.schema.landXML11.SourceDataDocument.SourceData>
            {
                public org.landxml.schema.landXML11.SourceDataDocument.SourceData get(int i)
                    { return SurfaceImpl.this.getSourceDataArray(i); }
                
                public org.landxml.schema.landXML11.SourceDataDocument.SourceData set(int i, org.landxml.schema.landXML11.SourceDataDocument.SourceData o)
                {
                    org.landxml.schema.landXML11.SourceDataDocument.SourceData old = SurfaceImpl.this.getSourceDataArray(i);
                    SurfaceImpl.this.setSourceDataArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.SourceDataDocument.SourceData o)
                    { SurfaceImpl.this.insertNewSourceData(i).set(o); }
                
                public org.landxml.schema.landXML11.SourceDataDocument.SourceData remove(int i)
                {
                    org.landxml.schema.landXML11.SourceDataDocument.SourceData old = SurfaceImpl.this.getSourceDataArray(i);
                    SurfaceImpl.this.removeSourceData(i);
                    return old;
                }
                
                public int size()
                    { return SurfaceImpl.this.sizeOfSourceDataArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SourceDataList();
            }
        }
        
        /**
         * Gets array of all "SourceData" elements
         */
        public org.landxml.schema.landXML11.SourceDataDocument.SourceData[] getSourceDataArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SOURCEDATA$0, targetList);
                org.landxml.schema.landXML11.SourceDataDocument.SourceData[] result = new org.landxml.schema.landXML11.SourceDataDocument.SourceData[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "SourceData" element
         */
        public org.landxml.schema.landXML11.SourceDataDocument.SourceData getSourceDataArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SourceDataDocument.SourceData target = null;
                target = (org.landxml.schema.landXML11.SourceDataDocument.SourceData)get_store().find_element_user(SOURCEDATA$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "SourceData" element
         */
        public int sizeOfSourceDataArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCEDATA$0);
            }
        }
        
        /**
         * Sets array of all "SourceData" element
         */
        public void setSourceDataArray(org.landxml.schema.landXML11.SourceDataDocument.SourceData[] sourceDataArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sourceDataArray, SOURCEDATA$0);
            }
        }
        
        /**
         * Sets ith "SourceData" element
         */
        public void setSourceDataArray(int i, org.landxml.schema.landXML11.SourceDataDocument.SourceData sourceData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SourceDataDocument.SourceData target = null;
                target = (org.landxml.schema.landXML11.SourceDataDocument.SourceData)get_store().find_element_user(SOURCEDATA$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(sourceData);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SourceData" element
         */
        public org.landxml.schema.landXML11.SourceDataDocument.SourceData insertNewSourceData(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SourceDataDocument.SourceData target = null;
                target = (org.landxml.schema.landXML11.SourceDataDocument.SourceData)get_store().insert_element_user(SOURCEDATA$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SourceData" element
         */
        public org.landxml.schema.landXML11.SourceDataDocument.SourceData addNewSourceData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SourceDataDocument.SourceData target = null;
                target = (org.landxml.schema.landXML11.SourceDataDocument.SourceData)get_store().add_element_user(SOURCEDATA$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "SourceData" element
         */
        public void removeSourceData(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCEDATA$0, i);
            }
        }
        
        /**
         * Gets a List of "Definition" elements
         */
        public java.util.List<org.landxml.schema.landXML11.DefinitionDocument.Definition> getDefinitionList()
        {
            final class DefinitionList extends java.util.AbstractList<org.landxml.schema.landXML11.DefinitionDocument.Definition>
            {
                public org.landxml.schema.landXML11.DefinitionDocument.Definition get(int i)
                    { return SurfaceImpl.this.getDefinitionArray(i); }
                
                public org.landxml.schema.landXML11.DefinitionDocument.Definition set(int i, org.landxml.schema.landXML11.DefinitionDocument.Definition o)
                {
                    org.landxml.schema.landXML11.DefinitionDocument.Definition old = SurfaceImpl.this.getDefinitionArray(i);
                    SurfaceImpl.this.setDefinitionArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.DefinitionDocument.Definition o)
                    { SurfaceImpl.this.insertNewDefinition(i).set(o); }
                
                public org.landxml.schema.landXML11.DefinitionDocument.Definition remove(int i)
                {
                    org.landxml.schema.landXML11.DefinitionDocument.Definition old = SurfaceImpl.this.getDefinitionArray(i);
                    SurfaceImpl.this.removeDefinition(i);
                    return old;
                }
                
                public int size()
                    { return SurfaceImpl.this.sizeOfDefinitionArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DefinitionList();
            }
        }
        
        /**
         * Gets array of all "Definition" elements
         */
        public org.landxml.schema.landXML11.DefinitionDocument.Definition[] getDefinitionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DEFINITION$2, targetList);
                org.landxml.schema.landXML11.DefinitionDocument.Definition[] result = new org.landxml.schema.landXML11.DefinitionDocument.Definition[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Definition" element
         */
        public org.landxml.schema.landXML11.DefinitionDocument.Definition getDefinitionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DefinitionDocument.Definition target = null;
                target = (org.landxml.schema.landXML11.DefinitionDocument.Definition)get_store().find_element_user(DEFINITION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Definition" element
         */
        public int sizeOfDefinitionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEFINITION$2);
            }
        }
        
        /**
         * Sets array of all "Definition" element
         */
        public void setDefinitionArray(org.landxml.schema.landXML11.DefinitionDocument.Definition[] definitionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(definitionArray, DEFINITION$2);
            }
        }
        
        /**
         * Sets ith "Definition" element
         */
        public void setDefinitionArray(int i, org.landxml.schema.landXML11.DefinitionDocument.Definition definition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DefinitionDocument.Definition target = null;
                target = (org.landxml.schema.landXML11.DefinitionDocument.Definition)get_store().find_element_user(DEFINITION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(definition);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Definition" element
         */
        public org.landxml.schema.landXML11.DefinitionDocument.Definition insertNewDefinition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DefinitionDocument.Definition target = null;
                target = (org.landxml.schema.landXML11.DefinitionDocument.Definition)get_store().insert_element_user(DEFINITION$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Definition" element
         */
        public org.landxml.schema.landXML11.DefinitionDocument.Definition addNewDefinition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DefinitionDocument.Definition target = null;
                target = (org.landxml.schema.landXML11.DefinitionDocument.Definition)get_store().add_element_user(DEFINITION$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Definition" element
         */
        public void removeDefinition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEFINITION$2, i);
            }
        }
        
        /**
         * Gets a List of "Watersheds" elements
         */
        public java.util.List<org.landxml.schema.landXML11.WatershedsDocument.Watersheds> getWatershedsList()
        {
            final class WatershedsList extends java.util.AbstractList<org.landxml.schema.landXML11.WatershedsDocument.Watersheds>
            {
                public org.landxml.schema.landXML11.WatershedsDocument.Watersheds get(int i)
                    { return SurfaceImpl.this.getWatershedsArray(i); }
                
                public org.landxml.schema.landXML11.WatershedsDocument.Watersheds set(int i, org.landxml.schema.landXML11.WatershedsDocument.Watersheds o)
                {
                    org.landxml.schema.landXML11.WatershedsDocument.Watersheds old = SurfaceImpl.this.getWatershedsArray(i);
                    SurfaceImpl.this.setWatershedsArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.WatershedsDocument.Watersheds o)
                    { SurfaceImpl.this.insertNewWatersheds(i).set(o); }
                
                public org.landxml.schema.landXML11.WatershedsDocument.Watersheds remove(int i)
                {
                    org.landxml.schema.landXML11.WatershedsDocument.Watersheds old = SurfaceImpl.this.getWatershedsArray(i);
                    SurfaceImpl.this.removeWatersheds(i);
                    return old;
                }
                
                public int size()
                    { return SurfaceImpl.this.sizeOfWatershedsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new WatershedsList();
            }
        }
        
        /**
         * Gets array of all "Watersheds" elements
         */
        public org.landxml.schema.landXML11.WatershedsDocument.Watersheds[] getWatershedsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(WATERSHEDS$4, targetList);
                org.landxml.schema.landXML11.WatershedsDocument.Watersheds[] result = new org.landxml.schema.landXML11.WatershedsDocument.Watersheds[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Watersheds" element
         */
        public org.landxml.schema.landXML11.WatershedsDocument.Watersheds getWatershedsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.WatershedsDocument.Watersheds target = null;
                target = (org.landxml.schema.landXML11.WatershedsDocument.Watersheds)get_store().find_element_user(WATERSHEDS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Watersheds" element
         */
        public int sizeOfWatershedsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WATERSHEDS$4);
            }
        }
        
        /**
         * Sets array of all "Watersheds" element
         */
        public void setWatershedsArray(org.landxml.schema.landXML11.WatershedsDocument.Watersheds[] watershedsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(watershedsArray, WATERSHEDS$4);
            }
        }
        
        /**
         * Sets ith "Watersheds" element
         */
        public void setWatershedsArray(int i, org.landxml.schema.landXML11.WatershedsDocument.Watersheds watersheds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.WatershedsDocument.Watersheds target = null;
                target = (org.landxml.schema.landXML11.WatershedsDocument.Watersheds)get_store().find_element_user(WATERSHEDS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(watersheds);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Watersheds" element
         */
        public org.landxml.schema.landXML11.WatershedsDocument.Watersheds insertNewWatersheds(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.WatershedsDocument.Watersheds target = null;
                target = (org.landxml.schema.landXML11.WatershedsDocument.Watersheds)get_store().insert_element_user(WATERSHEDS$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Watersheds" element
         */
        public org.landxml.schema.landXML11.WatershedsDocument.Watersheds addNewWatersheds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.WatershedsDocument.Watersheds target = null;
                target = (org.landxml.schema.landXML11.WatershedsDocument.Watersheds)get_store().add_element_user(WATERSHEDS$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "Watersheds" element
         */
        public void removeWatersheds(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WATERSHEDS$4, i);
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
                    { return SurfaceImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = SurfaceImpl.this.getFeatureArray(i);
                    SurfaceImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { SurfaceImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = SurfaceImpl.this.getFeatureArray(i);
                    SurfaceImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return SurfaceImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$6, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$6, i);
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
                return get_store().count_elements(FEATURE$6);
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
                arraySetterHelper(featureArray, FEATURE$6);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$6, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$6, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$6);
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
                get_store().remove_element(FEATURE$6, i);
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
         * Gets the "desc" attribute
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$10);
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
                return get_store().find_attribute_user(DESC$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$10);
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
                get_store().remove_attribute(DESC$10);
            }
        }
        
        /**
         * Gets the "OID" attribute
         */
        public java.lang.String getOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OID" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$12);
                return target;
            }
        }
        
        /**
         * True if has "OID" attribute
         */
        public boolean isSetOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OID$12) != null;
            }
        }
        
        /**
         * Sets the "OID" attribute
         */
        public void setOID(java.lang.String oid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OID$12);
                }
                target.setStringValue(oid);
            }
        }
        
        /**
         * Sets (as xml) the "OID" attribute
         */
        public void xsetOID(org.apache.xmlbeans.XmlString oid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OID$12);
                }
                target.set(oid);
            }
        }
        
        /**
         * Unsets the "OID" attribute
         */
        public void unsetOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OID$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$14);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$14);
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
                return get_store().find_attribute_user(STATE$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$14);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$14);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$14);
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
                get_store().remove_attribute(STATE$14);
            }
        }
    }
}
