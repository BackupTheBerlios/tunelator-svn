/*
 * An XML document type.
 * Localname: Watershed
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.WatershedDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Watershed(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class WatershedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.WatershedDocument
{
    
    public WatershedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WATERSHED$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Watershed");
    
    
    /**
     * Gets the "Watershed" element
     */
    public org.landxml.schema.landXML11.WatershedDocument.Watershed getWatershed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.WatershedDocument.Watershed target = null;
            target = (org.landxml.schema.landXML11.WatershedDocument.Watershed)get_store().find_element_user(WATERSHED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Watershed" element
     */
    public void setWatershed(org.landxml.schema.landXML11.WatershedDocument.Watershed watershed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.WatershedDocument.Watershed target = null;
            target = (org.landxml.schema.landXML11.WatershedDocument.Watershed)get_store().find_element_user(WATERSHED$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.WatershedDocument.Watershed)get_store().add_element_user(WATERSHED$0);
            }
            target.set(watershed);
        }
    }
    
    /**
     * Appends and returns a new empty "Watershed" element
     */
    public org.landxml.schema.landXML11.WatershedDocument.Watershed addNewWatershed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.WatershedDocument.Watershed target = null;
            target = (org.landxml.schema.landXML11.WatershedDocument.Watershed)get_store().add_element_user(WATERSHED$0);
            return target;
        }
    }
    /**
     * An XML Watershed(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class WatershedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.WatershedDocument.Watershed
    {
        
        public WatershedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PNTLIST2D$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PntList2D");
        private static final javax.xml.namespace.QName PNTLIST3D$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PntList3D");
        private static final javax.xml.namespace.QName OUTLET$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Outlet");
        private static final javax.xml.namespace.QName FEATURE$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName NAME$8 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName AREA$10 = 
            new javax.xml.namespace.QName("", "area");
        private static final javax.xml.namespace.QName DESC$12 = 
            new javax.xml.namespace.QName("", "desc");
        
        
        /**
         * Gets the "PntList2D" element
         */
        public java.util.List getPntList2D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PNTLIST2D$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "PntList2D" element
         */
        public org.landxml.schema.landXML11.PntList2DDocument.PntList2D xgetPntList2D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntList2DDocument.PntList2D target = null;
                target = (org.landxml.schema.landXML11.PntList2DDocument.PntList2D)get_store().find_element_user(PNTLIST2D$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "PntList2D" element
         */
        public boolean isSetPntList2D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PNTLIST2D$0) != 0;
            }
        }
        
        /**
         * Sets the "PntList2D" element
         */
        public void setPntList2D(java.util.List pntList2D)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PNTLIST2D$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PNTLIST2D$0);
                }
                target.setListValue(pntList2D);
            }
        }
        
        /**
         * Sets (as xml) the "PntList2D" element
         */
        public void xsetPntList2D(org.landxml.schema.landXML11.PntList2DDocument.PntList2D pntList2D)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntList2DDocument.PntList2D target = null;
                target = (org.landxml.schema.landXML11.PntList2DDocument.PntList2D)get_store().find_element_user(PNTLIST2D$0, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PntList2DDocument.PntList2D)get_store().add_element_user(PNTLIST2D$0);
                }
                target.set(pntList2D);
            }
        }
        
        /**
         * Unsets the "PntList2D" element
         */
        public void unsetPntList2D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PNTLIST2D$0, 0);
            }
        }
        
        /**
         * Gets the "PntList3D" element
         */
        public java.util.List getPntList3D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PNTLIST3D$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "PntList3D" element
         */
        public org.landxml.schema.landXML11.PntList3DDocument.PntList3D xgetPntList3D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntList3DDocument.PntList3D target = null;
                target = (org.landxml.schema.landXML11.PntList3DDocument.PntList3D)get_store().find_element_user(PNTLIST3D$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "PntList3D" element
         */
        public boolean isSetPntList3D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PNTLIST3D$2) != 0;
            }
        }
        
        /**
         * Sets the "PntList3D" element
         */
        public void setPntList3D(java.util.List pntList3D)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PNTLIST3D$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PNTLIST3D$2);
                }
                target.setListValue(pntList3D);
            }
        }
        
        /**
         * Sets (as xml) the "PntList3D" element
         */
        public void xsetPntList3D(org.landxml.schema.landXML11.PntList3DDocument.PntList3D pntList3D)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntList3DDocument.PntList3D target = null;
                target = (org.landxml.schema.landXML11.PntList3DDocument.PntList3D)get_store().find_element_user(PNTLIST3D$2, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PntList3DDocument.PntList3D)get_store().add_element_user(PNTLIST3D$2);
                }
                target.set(pntList3D);
            }
        }
        
        /**
         * Unsets the "PntList3D" element
         */
        public void unsetPntList3D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PNTLIST3D$2, 0);
            }
        }
        
        /**
         * Gets a List of "Outlet" elements
         */
        public java.util.List<org.landxml.schema.landXML11.OutletDocument.Outlet> getOutletList()
        {
            final class OutletList extends java.util.AbstractList<org.landxml.schema.landXML11.OutletDocument.Outlet>
            {
                public org.landxml.schema.landXML11.OutletDocument.Outlet get(int i)
                    { return WatershedImpl.this.getOutletArray(i); }
                
                public org.landxml.schema.landXML11.OutletDocument.Outlet set(int i, org.landxml.schema.landXML11.OutletDocument.Outlet o)
                {
                    org.landxml.schema.landXML11.OutletDocument.Outlet old = WatershedImpl.this.getOutletArray(i);
                    WatershedImpl.this.setOutletArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.OutletDocument.Outlet o)
                    { WatershedImpl.this.insertNewOutlet(i).set(o); }
                
                public org.landxml.schema.landXML11.OutletDocument.Outlet remove(int i)
                {
                    org.landxml.schema.landXML11.OutletDocument.Outlet old = WatershedImpl.this.getOutletArray(i);
                    WatershedImpl.this.removeOutlet(i);
                    return old;
                }
                
                public int size()
                    { return WatershedImpl.this.sizeOfOutletArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new OutletList();
            }
        }
        
        /**
         * Gets array of all "Outlet" elements
         */
        public org.landxml.schema.landXML11.OutletDocument.Outlet[] getOutletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OUTLET$4, targetList);
                org.landxml.schema.landXML11.OutletDocument.Outlet[] result = new org.landxml.schema.landXML11.OutletDocument.Outlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Outlet" element
         */
        public org.landxml.schema.landXML11.OutletDocument.Outlet getOutletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OutletDocument.Outlet target = null;
                target = (org.landxml.schema.landXML11.OutletDocument.Outlet)get_store().find_element_user(OUTLET$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Outlet" element
         */
        public int sizeOfOutletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OUTLET$4);
            }
        }
        
        /**
         * Sets array of all "Outlet" element
         */
        public void setOutletArray(org.landxml.schema.landXML11.OutletDocument.Outlet[] outletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(outletArray, OUTLET$4);
            }
        }
        
        /**
         * Sets ith "Outlet" element
         */
        public void setOutletArray(int i, org.landxml.schema.landXML11.OutletDocument.Outlet outlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OutletDocument.Outlet target = null;
                target = (org.landxml.schema.landXML11.OutletDocument.Outlet)get_store().find_element_user(OUTLET$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(outlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Outlet" element
         */
        public org.landxml.schema.landXML11.OutletDocument.Outlet insertNewOutlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OutletDocument.Outlet target = null;
                target = (org.landxml.schema.landXML11.OutletDocument.Outlet)get_store().insert_element_user(OUTLET$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Outlet" element
         */
        public org.landxml.schema.landXML11.OutletDocument.Outlet addNewOutlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OutletDocument.Outlet target = null;
                target = (org.landxml.schema.landXML11.OutletDocument.Outlet)get_store().add_element_user(OUTLET$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "Outlet" element
         */
        public void removeOutlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OUTLET$4, i);
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
                    { return WatershedImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = WatershedImpl.this.getFeatureArray(i);
                    WatershedImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { WatershedImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = WatershedImpl.this.getFeatureArray(i);
                    WatershedImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return WatershedImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "area" attribute
         */
        public double getArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREA$10);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "area" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AREA$10);
                return target;
            }
        }
        
        /**
         * True if has "area" attribute
         */
        public boolean isSetArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AREA$10) != null;
            }
        }
        
        /**
         * Sets the "area" attribute
         */
        public void setArea(double area)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREA$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AREA$10);
                }
                target.setDoubleValue(area);
            }
        }
        
        /**
         * Sets (as xml) the "area" attribute
         */
        public void xsetArea(org.apache.xmlbeans.XmlDouble area)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AREA$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(AREA$10);
                }
                target.set(area);
            }
        }
        
        /**
         * Unsets the "area" attribute
         */
        public void unsetArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AREA$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$12);
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
                return get_store().find_attribute_user(DESC$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$12);
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
                get_store().remove_attribute(DESC$12);
            }
        }
    }
}
