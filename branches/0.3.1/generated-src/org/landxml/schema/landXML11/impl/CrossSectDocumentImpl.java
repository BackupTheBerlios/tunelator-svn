/*
 * An XML document type.
 * Localname: CrossSect
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CrossSectDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one CrossSect(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class CrossSectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CrossSectDocument
{
    
    public CrossSectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CROSSSECT$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CrossSect");
    
    
    /**
     * Gets the "CrossSect" element
     */
    public org.landxml.schema.landXML11.CrossSectDocument.CrossSect getCrossSect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CrossSectDocument.CrossSect target = null;
            target = (org.landxml.schema.landXML11.CrossSectDocument.CrossSect)get_store().find_element_user(CROSSSECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CrossSect" element
     */
    public void setCrossSect(org.landxml.schema.landXML11.CrossSectDocument.CrossSect crossSect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CrossSectDocument.CrossSect target = null;
            target = (org.landxml.schema.landXML11.CrossSectDocument.CrossSect)get_store().find_element_user(CROSSSECT$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.CrossSectDocument.CrossSect)get_store().add_element_user(CROSSSECT$0);
            }
            target.set(crossSect);
        }
    }
    
    /**
     * Appends and returns a new empty "CrossSect" element
     */
    public org.landxml.schema.landXML11.CrossSectDocument.CrossSect addNewCrossSect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CrossSectDocument.CrossSect target = null;
            target = (org.landxml.schema.landXML11.CrossSectDocument.CrossSect)get_store().add_element_user(CROSSSECT$0);
            return target;
        }
    }
    /**
     * An XML CrossSect(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class CrossSectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CrossSectDocument.CrossSect
    {
        
        public CrossSectImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CROSSSECTSURF$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CrossSectSurf");
        private static final javax.xml.namespace.QName DESIGNCROSSSECTSURF$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "DesignCrossSectSurf");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName STA$6 = 
            new javax.xml.namespace.QName("", "sta");
        private static final javax.xml.namespace.QName NAME$8 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESC$10 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName ANGLESKEW$12 = 
            new javax.xml.namespace.QName("", "angleSkew");
        private static final javax.xml.namespace.QName AREACUT$14 = 
            new javax.xml.namespace.QName("", "areaCut");
        private static final javax.xml.namespace.QName AREAFILL$16 = 
            new javax.xml.namespace.QName("", "areaFill");
        private static final javax.xml.namespace.QName CENTROIDCUT$18 = 
            new javax.xml.namespace.QName("", "centroidCut");
        private static final javax.xml.namespace.QName CENTROIDFILL$20 = 
            new javax.xml.namespace.QName("", "centroidFill");
        private static final javax.xml.namespace.QName SECTTYPE$22 = 
            new javax.xml.namespace.QName("", "sectType");
        private static final javax.xml.namespace.QName VOLUMECUT$24 = 
            new javax.xml.namespace.QName("", "volumeCut");
        private static final javax.xml.namespace.QName VOLUMEFILL$26 = 
            new javax.xml.namespace.QName("", "volumeFill");
        
        
        /**
         * Gets a List of "CrossSectSurf" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf> getCrossSectSurfList()
        {
            final class CrossSectSurfList extends java.util.AbstractList<org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf>
            {
                public org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf get(int i)
                    { return CrossSectImpl.this.getCrossSectSurfArray(i); }
                
                public org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf set(int i, org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf o)
                {
                    org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf old = CrossSectImpl.this.getCrossSectSurfArray(i);
                    CrossSectImpl.this.setCrossSectSurfArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf o)
                    { CrossSectImpl.this.insertNewCrossSectSurf(i).set(o); }
                
                public org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf remove(int i)
                {
                    org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf old = CrossSectImpl.this.getCrossSectSurfArray(i);
                    CrossSectImpl.this.removeCrossSectSurf(i);
                    return old;
                }
                
                public int size()
                    { return CrossSectImpl.this.sizeOfCrossSectSurfArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CrossSectSurfList();
            }
        }
        
        /**
         * Gets array of all "CrossSectSurf" elements
         */
        public org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf[] getCrossSectSurfArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CROSSSECTSURF$0, targetList);
                org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf[] result = new org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CrossSectSurf" element
         */
        public org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf getCrossSectSurfArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf target = null;
                target = (org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf)get_store().find_element_user(CROSSSECTSURF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CrossSectSurf" element
         */
        public int sizeOfCrossSectSurfArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CROSSSECTSURF$0);
            }
        }
        
        /**
         * Sets array of all "CrossSectSurf" element
         */
        public void setCrossSectSurfArray(org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf[] crossSectSurfArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(crossSectSurfArray, CROSSSECTSURF$0);
            }
        }
        
        /**
         * Sets ith "CrossSectSurf" element
         */
        public void setCrossSectSurfArray(int i, org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf crossSectSurf)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf target = null;
                target = (org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf)get_store().find_element_user(CROSSSECTSURF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(crossSectSurf);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CrossSectSurf" element
         */
        public org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf insertNewCrossSectSurf(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf target = null;
                target = (org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf)get_store().insert_element_user(CROSSSECTSURF$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CrossSectSurf" element
         */
        public org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf addNewCrossSectSurf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf target = null;
                target = (org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf)get_store().add_element_user(CROSSSECTSURF$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "CrossSectSurf" element
         */
        public void removeCrossSectSurf(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CROSSSECTSURF$0, i);
            }
        }
        
        /**
         * Gets a List of "DesignCrossSectSurf" elements
         */
        public java.util.List<org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf> getDesignCrossSectSurfList()
        {
            final class DesignCrossSectSurfList extends java.util.AbstractList<org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf>
            {
                public org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf get(int i)
                    { return CrossSectImpl.this.getDesignCrossSectSurfArray(i); }
                
                public org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf set(int i, org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf o)
                {
                    org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf old = CrossSectImpl.this.getDesignCrossSectSurfArray(i);
                    CrossSectImpl.this.setDesignCrossSectSurfArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf o)
                    { CrossSectImpl.this.insertNewDesignCrossSectSurf(i).set(o); }
                
                public org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf remove(int i)
                {
                    org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf old = CrossSectImpl.this.getDesignCrossSectSurfArray(i);
                    CrossSectImpl.this.removeDesignCrossSectSurf(i);
                    return old;
                }
                
                public int size()
                    { return CrossSectImpl.this.sizeOfDesignCrossSectSurfArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DesignCrossSectSurfList();
            }
        }
        
        /**
         * Gets array of all "DesignCrossSectSurf" elements
         */
        public org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf[] getDesignCrossSectSurfArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DESIGNCROSSSECTSURF$2, targetList);
                org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf[] result = new org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "DesignCrossSectSurf" element
         */
        public org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf getDesignCrossSectSurfArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf target = null;
                target = (org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf)get_store().find_element_user(DESIGNCROSSSECTSURF$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "DesignCrossSectSurf" element
         */
        public int sizeOfDesignCrossSectSurfArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESIGNCROSSSECTSURF$2);
            }
        }
        
        /**
         * Sets array of all "DesignCrossSectSurf" element
         */
        public void setDesignCrossSectSurfArray(org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf[] designCrossSectSurfArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(designCrossSectSurfArray, DESIGNCROSSSECTSURF$2);
            }
        }
        
        /**
         * Sets ith "DesignCrossSectSurf" element
         */
        public void setDesignCrossSectSurfArray(int i, org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf designCrossSectSurf)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf target = null;
                target = (org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf)get_store().find_element_user(DESIGNCROSSSECTSURF$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(designCrossSectSurf);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DesignCrossSectSurf" element
         */
        public org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf insertNewDesignCrossSectSurf(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf target = null;
                target = (org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf)get_store().insert_element_user(DESIGNCROSSSECTSURF$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DesignCrossSectSurf" element
         */
        public org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf addNewDesignCrossSectSurf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf target = null;
                target = (org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf)get_store().add_element_user(DESIGNCROSSSECTSURF$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "DesignCrossSectSurf" element
         */
        public void removeDesignCrossSectSurf(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESIGNCROSSSECTSURF$2, i);
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
                    { return CrossSectImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CrossSectImpl.this.getFeatureArray(i);
                    CrossSectImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { CrossSectImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CrossSectImpl.this.getFeatureArray(i);
                    CrossSectImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return CrossSectImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "sta" attribute
         */
        public double getSta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STA$6);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "sta" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STA$6);
                return target;
            }
        }
        
        /**
         * Sets the "sta" attribute
         */
        public void setSta(double sta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STA$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STA$6);
                }
                target.setDoubleValue(sta);
            }
        }
        
        /**
         * Sets (as xml) the "sta" attribute
         */
        public void xsetSta(org.apache.xmlbeans.XmlDouble sta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STA$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(STA$6);
                }
                target.set(sta);
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
         * Gets the "angleSkew" attribute
         */
        public double getAngleSkew()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANGLESKEW$12);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "angleSkew" attribute
         */
        public org.landxml.schema.landXML11.Angle xgetAngleSkew()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Angle target = null;
                target = (org.landxml.schema.landXML11.Angle)get_store().find_attribute_user(ANGLESKEW$12);
                return target;
            }
        }
        
        /**
         * True if has "angleSkew" attribute
         */
        public boolean isSetAngleSkew()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ANGLESKEW$12) != null;
            }
        }
        
        /**
         * Sets the "angleSkew" attribute
         */
        public void setAngleSkew(double angleSkew)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANGLESKEW$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ANGLESKEW$12);
                }
                target.setDoubleValue(angleSkew);
            }
        }
        
        /**
         * Sets (as xml) the "angleSkew" attribute
         */
        public void xsetAngleSkew(org.landxml.schema.landXML11.Angle angleSkew)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Angle target = null;
                target = (org.landxml.schema.landXML11.Angle)get_store().find_attribute_user(ANGLESKEW$12);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Angle)get_store().add_attribute_user(ANGLESKEW$12);
                }
                target.set(angleSkew);
            }
        }
        
        /**
         * Unsets the "angleSkew" attribute
         */
        public void unsetAngleSkew()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ANGLESKEW$12);
            }
        }
        
        /**
         * Gets the "areaCut" attribute
         */
        public double getAreaCut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREACUT$14);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "areaCut" attribute
         */
        public org.landxml.schema.landXML11.CrossSectSurfaceArea xgetAreaCut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectSurfaceArea target = null;
                target = (org.landxml.schema.landXML11.CrossSectSurfaceArea)get_store().find_attribute_user(AREACUT$14);
                return target;
            }
        }
        
        /**
         * True if has "areaCut" attribute
         */
        public boolean isSetAreaCut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AREACUT$14) != null;
            }
        }
        
        /**
         * Sets the "areaCut" attribute
         */
        public void setAreaCut(double areaCut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREACUT$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AREACUT$14);
                }
                target.setDoubleValue(areaCut);
            }
        }
        
        /**
         * Sets (as xml) the "areaCut" attribute
         */
        public void xsetAreaCut(org.landxml.schema.landXML11.CrossSectSurfaceArea areaCut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectSurfaceArea target = null;
                target = (org.landxml.schema.landXML11.CrossSectSurfaceArea)get_store().find_attribute_user(AREACUT$14);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CrossSectSurfaceArea)get_store().add_attribute_user(AREACUT$14);
                }
                target.set(areaCut);
            }
        }
        
        /**
         * Unsets the "areaCut" attribute
         */
        public void unsetAreaCut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AREACUT$14);
            }
        }
        
        /**
         * Gets the "areaFill" attribute
         */
        public double getAreaFill()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREAFILL$16);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "areaFill" attribute
         */
        public org.landxml.schema.landXML11.CrossSectSurfaceArea xgetAreaFill()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectSurfaceArea target = null;
                target = (org.landxml.schema.landXML11.CrossSectSurfaceArea)get_store().find_attribute_user(AREAFILL$16);
                return target;
            }
        }
        
        /**
         * True if has "areaFill" attribute
         */
        public boolean isSetAreaFill()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AREAFILL$16) != null;
            }
        }
        
        /**
         * Sets the "areaFill" attribute
         */
        public void setAreaFill(double areaFill)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREAFILL$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AREAFILL$16);
                }
                target.setDoubleValue(areaFill);
            }
        }
        
        /**
         * Sets (as xml) the "areaFill" attribute
         */
        public void xsetAreaFill(org.landxml.schema.landXML11.CrossSectSurfaceArea areaFill)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectSurfaceArea target = null;
                target = (org.landxml.schema.landXML11.CrossSectSurfaceArea)get_store().find_attribute_user(AREAFILL$16);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CrossSectSurfaceArea)get_store().add_attribute_user(AREAFILL$16);
                }
                target.set(areaFill);
            }
        }
        
        /**
         * Unsets the "areaFill" attribute
         */
        public void unsetAreaFill()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AREAFILL$16);
            }
        }
        
        /**
         * Gets the "centroidCut" attribute
         */
        public double getCentroidCut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CENTROIDCUT$18);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "centroidCut" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetCentroidCut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CENTROIDCUT$18);
                return target;
            }
        }
        
        /**
         * True if has "centroidCut" attribute
         */
        public boolean isSetCentroidCut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CENTROIDCUT$18) != null;
            }
        }
        
        /**
         * Sets the "centroidCut" attribute
         */
        public void setCentroidCut(double centroidCut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CENTROIDCUT$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CENTROIDCUT$18);
                }
                target.setDoubleValue(centroidCut);
            }
        }
        
        /**
         * Sets (as xml) the "centroidCut" attribute
         */
        public void xsetCentroidCut(org.apache.xmlbeans.XmlDouble centroidCut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CENTROIDCUT$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CENTROIDCUT$18);
                }
                target.set(centroidCut);
            }
        }
        
        /**
         * Unsets the "centroidCut" attribute
         */
        public void unsetCentroidCut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CENTROIDCUT$18);
            }
        }
        
        /**
         * Gets the "centroidFill" attribute
         */
        public double getCentroidFill()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CENTROIDFILL$20);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "centroidFill" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetCentroidFill()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CENTROIDFILL$20);
                return target;
            }
        }
        
        /**
         * True if has "centroidFill" attribute
         */
        public boolean isSetCentroidFill()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CENTROIDFILL$20) != null;
            }
        }
        
        /**
         * Sets the "centroidFill" attribute
         */
        public void setCentroidFill(double centroidFill)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CENTROIDFILL$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CENTROIDFILL$20);
                }
                target.setDoubleValue(centroidFill);
            }
        }
        
        /**
         * Sets (as xml) the "centroidFill" attribute
         */
        public void xsetCentroidFill(org.apache.xmlbeans.XmlDouble centroidFill)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CENTROIDFILL$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CENTROIDFILL$20);
                }
                target.set(centroidFill);
            }
        }
        
        /**
         * Unsets the "centroidFill" attribute
         */
        public void unsetCentroidFill()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CENTROIDFILL$20);
            }
        }
        
        /**
         * Gets the "sectType" attribute
         */
        public java.lang.String getSectType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECTTYPE$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sectType" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSectType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SECTTYPE$22);
                return target;
            }
        }
        
        /**
         * True if has "sectType" attribute
         */
        public boolean isSetSectType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SECTTYPE$22) != null;
            }
        }
        
        /**
         * Sets the "sectType" attribute
         */
        public void setSectType(java.lang.String sectType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECTTYPE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SECTTYPE$22);
                }
                target.setStringValue(sectType);
            }
        }
        
        /**
         * Sets (as xml) the "sectType" attribute
         */
        public void xsetSectType(org.apache.xmlbeans.XmlString sectType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SECTTYPE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SECTTYPE$22);
                }
                target.set(sectType);
            }
        }
        
        /**
         * Unsets the "sectType" attribute
         */
        public void unsetSectType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SECTTYPE$22);
            }
        }
        
        /**
         * Gets the "volumeCut" attribute
         */
        public double getVolumeCut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VOLUMECUT$24);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "volumeCut" attribute
         */
        public org.landxml.schema.landXML11.CrossSectSurfaceVolume xgetVolumeCut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectSurfaceVolume target = null;
                target = (org.landxml.schema.landXML11.CrossSectSurfaceVolume)get_store().find_attribute_user(VOLUMECUT$24);
                return target;
            }
        }
        
        /**
         * True if has "volumeCut" attribute
         */
        public boolean isSetVolumeCut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VOLUMECUT$24) != null;
            }
        }
        
        /**
         * Sets the "volumeCut" attribute
         */
        public void setVolumeCut(double volumeCut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VOLUMECUT$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VOLUMECUT$24);
                }
                target.setDoubleValue(volumeCut);
            }
        }
        
        /**
         * Sets (as xml) the "volumeCut" attribute
         */
        public void xsetVolumeCut(org.landxml.schema.landXML11.CrossSectSurfaceVolume volumeCut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectSurfaceVolume target = null;
                target = (org.landxml.schema.landXML11.CrossSectSurfaceVolume)get_store().find_attribute_user(VOLUMECUT$24);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CrossSectSurfaceVolume)get_store().add_attribute_user(VOLUMECUT$24);
                }
                target.set(volumeCut);
            }
        }
        
        /**
         * Unsets the "volumeCut" attribute
         */
        public void unsetVolumeCut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VOLUMECUT$24);
            }
        }
        
        /**
         * Gets the "volumeFill" attribute
         */
        public double getVolumeFill()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VOLUMEFILL$26);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "volumeFill" attribute
         */
        public org.landxml.schema.landXML11.CrossSectSurfaceVolume xgetVolumeFill()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectSurfaceVolume target = null;
                target = (org.landxml.schema.landXML11.CrossSectSurfaceVolume)get_store().find_attribute_user(VOLUMEFILL$26);
                return target;
            }
        }
        
        /**
         * True if has "volumeFill" attribute
         */
        public boolean isSetVolumeFill()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VOLUMEFILL$26) != null;
            }
        }
        
        /**
         * Sets the "volumeFill" attribute
         */
        public void setVolumeFill(double volumeFill)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VOLUMEFILL$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VOLUMEFILL$26);
                }
                target.setDoubleValue(volumeFill);
            }
        }
        
        /**
         * Sets (as xml) the "volumeFill" attribute
         */
        public void xsetVolumeFill(org.landxml.schema.landXML11.CrossSectSurfaceVolume volumeFill)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectSurfaceVolume target = null;
                target = (org.landxml.schema.landXML11.CrossSectSurfaceVolume)get_store().find_attribute_user(VOLUMEFILL$26);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CrossSectSurfaceVolume)get_store().add_attribute_user(VOLUMEFILL$26);
                }
                target.set(volumeFill);
            }
        }
        
        /**
         * Unsets the "volumeFill" attribute
         */
        public void unsetVolumeFill()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VOLUMEFILL$26);
            }
        }
    }
}
