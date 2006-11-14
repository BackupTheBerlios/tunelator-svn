/*
 * An XML document type.
 * Localname: Definition
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.DefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Definition(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class DefinitionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.DefinitionDocument
{
    
    public DefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Definition");
    
    
    /**
     * Gets the "Definition" element
     */
    public org.landxml.schema.landXML11.DefinitionDocument.Definition getDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.DefinitionDocument.Definition target = null;
            target = (org.landxml.schema.landXML11.DefinitionDocument.Definition)get_store().find_element_user(DEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Definition" element
     */
    public void setDefinition(org.landxml.schema.landXML11.DefinitionDocument.Definition definition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.DefinitionDocument.Definition target = null;
            target = (org.landxml.schema.landXML11.DefinitionDocument.Definition)get_store().find_element_user(DEFINITION$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.DefinitionDocument.Definition)get_store().add_element_user(DEFINITION$0);
            }
            target.set(definition);
        }
    }
    
    /**
     * Appends and returns a new empty "Definition" element
     */
    public org.landxml.schema.landXML11.DefinitionDocument.Definition addNewDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.DefinitionDocument.Definition target = null;
            target = (org.landxml.schema.landXML11.DefinitionDocument.Definition)get_store().add_element_user(DEFINITION$0);
            return target;
        }
    }
    /**
     * An XML Definition(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class DefinitionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.DefinitionDocument.Definition
    {
        
        public DefinitionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PNTS$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Pnts");
        private static final javax.xml.namespace.QName FACES$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Faces");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName SURFTYPE$6 = 
            new javax.xml.namespace.QName("", "surfType");
        private static final javax.xml.namespace.QName AREA2DSURF$8 = 
            new javax.xml.namespace.QName("", "area2DSurf");
        private static final javax.xml.namespace.QName AREA3DSURF$10 = 
            new javax.xml.namespace.QName("", "area3DSurf");
        private static final javax.xml.namespace.QName ELEVMAX$12 = 
            new javax.xml.namespace.QName("", "elevMax");
        private static final javax.xml.namespace.QName ELEVMIN$14 = 
            new javax.xml.namespace.QName("", "elevMin");
        
        
        /**
         * Gets the "Pnts" element
         */
        public org.landxml.schema.landXML11.PntsDocument.Pnts getPnts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntsDocument.Pnts target = null;
                target = (org.landxml.schema.landXML11.PntsDocument.Pnts)get_store().find_element_user(PNTS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Pnts" element
         */
        public void setPnts(org.landxml.schema.landXML11.PntsDocument.Pnts pnts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntsDocument.Pnts target = null;
                target = (org.landxml.schema.landXML11.PntsDocument.Pnts)get_store().find_element_user(PNTS$0, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PntsDocument.Pnts)get_store().add_element_user(PNTS$0);
                }
                target.set(pnts);
            }
        }
        
        /**
         * Appends and returns a new empty "Pnts" element
         */
        public org.landxml.schema.landXML11.PntsDocument.Pnts addNewPnts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntsDocument.Pnts target = null;
                target = (org.landxml.schema.landXML11.PntsDocument.Pnts)get_store().add_element_user(PNTS$0);
                return target;
            }
        }
        
        /**
         * Gets a List of "Faces" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FacesDocument.Faces> getFacesList()
        {
            final class FacesList extends java.util.AbstractList<org.landxml.schema.landXML11.FacesDocument.Faces>
            {
                public org.landxml.schema.landXML11.FacesDocument.Faces get(int i)
                    { return DefinitionImpl.this.getFacesArray(i); }
                
                public org.landxml.schema.landXML11.FacesDocument.Faces set(int i, org.landxml.schema.landXML11.FacesDocument.Faces o)
                {
                    org.landxml.schema.landXML11.FacesDocument.Faces old = DefinitionImpl.this.getFacesArray(i);
                    DefinitionImpl.this.setFacesArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FacesDocument.Faces o)
                    { DefinitionImpl.this.insertNewFaces(i).set(o); }
                
                public org.landxml.schema.landXML11.FacesDocument.Faces remove(int i)
                {
                    org.landxml.schema.landXML11.FacesDocument.Faces old = DefinitionImpl.this.getFacesArray(i);
                    DefinitionImpl.this.removeFaces(i);
                    return old;
                }
                
                public int size()
                    { return DefinitionImpl.this.sizeOfFacesArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FacesList();
            }
        }
        
        /**
         * Gets array of all "Faces" elements
         */
        public org.landxml.schema.landXML11.FacesDocument.Faces[] getFacesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FACES$2, targetList);
                org.landxml.schema.landXML11.FacesDocument.Faces[] result = new org.landxml.schema.landXML11.FacesDocument.Faces[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Faces" element
         */
        public org.landxml.schema.landXML11.FacesDocument.Faces getFacesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FacesDocument.Faces target = null;
                target = (org.landxml.schema.landXML11.FacesDocument.Faces)get_store().find_element_user(FACES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Faces" element
         */
        public int sizeOfFacesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FACES$2);
            }
        }
        
        /**
         * Sets array of all "Faces" element
         */
        public void setFacesArray(org.landxml.schema.landXML11.FacesDocument.Faces[] facesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(facesArray, FACES$2);
            }
        }
        
        /**
         * Sets ith "Faces" element
         */
        public void setFacesArray(int i, org.landxml.schema.landXML11.FacesDocument.Faces faces)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FacesDocument.Faces target = null;
                target = (org.landxml.schema.landXML11.FacesDocument.Faces)get_store().find_element_user(FACES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(faces);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Faces" element
         */
        public org.landxml.schema.landXML11.FacesDocument.Faces insertNewFaces(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FacesDocument.Faces target = null;
                target = (org.landxml.schema.landXML11.FacesDocument.Faces)get_store().insert_element_user(FACES$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Faces" element
         */
        public org.landxml.schema.landXML11.FacesDocument.Faces addNewFaces()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FacesDocument.Faces target = null;
                target = (org.landxml.schema.landXML11.FacesDocument.Faces)get_store().add_element_user(FACES$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Faces" element
         */
        public void removeFaces(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FACES$2, i);
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
                    { return DefinitionImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = DefinitionImpl.this.getFeatureArray(i);
                    DefinitionImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { DefinitionImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = DefinitionImpl.this.getFeatureArray(i);
                    DefinitionImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return DefinitionImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "surfType" attribute
         */
        public org.landxml.schema.landXML11.SurfTypeEnum.Enum getSurfType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURFTYPE$6);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.SurfTypeEnum.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "surfType" attribute
         */
        public org.landxml.schema.landXML11.SurfTypeEnum xgetSurfType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfTypeEnum target = null;
                target = (org.landxml.schema.landXML11.SurfTypeEnum)get_store().find_attribute_user(SURFTYPE$6);
                return target;
            }
        }
        
        /**
         * Sets the "surfType" attribute
         */
        public void setSurfType(org.landxml.schema.landXML11.SurfTypeEnum.Enum surfType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURFTYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SURFTYPE$6);
                }
                target.setEnumValue(surfType);
            }
        }
        
        /**
         * Sets (as xml) the "surfType" attribute
         */
        public void xsetSurfType(org.landxml.schema.landXML11.SurfTypeEnum surfType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfTypeEnum target = null;
                target = (org.landxml.schema.landXML11.SurfTypeEnum)get_store().find_attribute_user(SURFTYPE$6);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SurfTypeEnum)get_store().add_attribute_user(SURFTYPE$6);
                }
                target.set(surfType);
            }
        }
        
        /**
         * Gets the "area2DSurf" attribute
         */
        public double getArea2DSurf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREA2DSURF$8);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "area2DSurf" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetArea2DSurf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AREA2DSURF$8);
                return target;
            }
        }
        
        /**
         * True if has "area2DSurf" attribute
         */
        public boolean isSetArea2DSurf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AREA2DSURF$8) != null;
            }
        }
        
        /**
         * Sets the "area2DSurf" attribute
         */
        public void setArea2DSurf(double area2DSurf)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREA2DSURF$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AREA2DSURF$8);
                }
                target.setDoubleValue(area2DSurf);
            }
        }
        
        /**
         * Sets (as xml) the "area2DSurf" attribute
         */
        public void xsetArea2DSurf(org.apache.xmlbeans.XmlDouble area2DSurf)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AREA2DSURF$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(AREA2DSURF$8);
                }
                target.set(area2DSurf);
            }
        }
        
        /**
         * Unsets the "area2DSurf" attribute
         */
        public void unsetArea2DSurf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AREA2DSURF$8);
            }
        }
        
        /**
         * Gets the "area3DSurf" attribute
         */
        public double getArea3DSurf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREA3DSURF$10);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "area3DSurf" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetArea3DSurf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AREA3DSURF$10);
                return target;
            }
        }
        
        /**
         * True if has "area3DSurf" attribute
         */
        public boolean isSetArea3DSurf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AREA3DSURF$10) != null;
            }
        }
        
        /**
         * Sets the "area3DSurf" attribute
         */
        public void setArea3DSurf(double area3DSurf)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREA3DSURF$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AREA3DSURF$10);
                }
                target.setDoubleValue(area3DSurf);
            }
        }
        
        /**
         * Sets (as xml) the "area3DSurf" attribute
         */
        public void xsetArea3DSurf(org.apache.xmlbeans.XmlDouble area3DSurf)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AREA3DSURF$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(AREA3DSURF$10);
                }
                target.set(area3DSurf);
            }
        }
        
        /**
         * Unsets the "area3DSurf" attribute
         */
        public void unsetArea3DSurf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AREA3DSURF$10);
            }
        }
        
        /**
         * Gets the "elevMax" attribute
         */
        public double getElevMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEVMAX$12);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "elevMax" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetElevMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ELEVMAX$12);
                return target;
            }
        }
        
        /**
         * True if has "elevMax" attribute
         */
        public boolean isSetElevMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ELEVMAX$12) != null;
            }
        }
        
        /**
         * Sets the "elevMax" attribute
         */
        public void setElevMax(double elevMax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEVMAX$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELEVMAX$12);
                }
                target.setDoubleValue(elevMax);
            }
        }
        
        /**
         * Sets (as xml) the "elevMax" attribute
         */
        public void xsetElevMax(org.apache.xmlbeans.XmlDouble elevMax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ELEVMAX$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ELEVMAX$12);
                }
                target.set(elevMax);
            }
        }
        
        /**
         * Unsets the "elevMax" attribute
         */
        public void unsetElevMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ELEVMAX$12);
            }
        }
        
        /**
         * Gets the "elevMin" attribute
         */
        public double getElevMin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEVMIN$14);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "elevMin" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetElevMin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ELEVMIN$14);
                return target;
            }
        }
        
        /**
         * True if has "elevMin" attribute
         */
        public boolean isSetElevMin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ELEVMIN$14) != null;
            }
        }
        
        /**
         * Sets the "elevMin" attribute
         */
        public void setElevMin(double elevMin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEVMIN$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELEVMIN$14);
                }
                target.setDoubleValue(elevMin);
            }
        }
        
        /**
         * Sets (as xml) the "elevMin" attribute
         */
        public void xsetElevMin(org.apache.xmlbeans.XmlDouble elevMin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ELEVMIN$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ELEVMIN$14);
                }
                target.set(elevMin);
            }
        }
        
        /**
         * Unsets the "elevMin" attribute
         */
        public void unsetElevMin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ELEVMIN$14);
            }
        }
    }
}
