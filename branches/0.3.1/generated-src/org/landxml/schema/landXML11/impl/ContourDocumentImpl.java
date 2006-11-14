/*
 * An XML document type.
 * Localname: Contour
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ContourDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Contour(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ContourDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ContourDocument
{
    
    public ContourDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTOUR$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Contour");
    
    
    /**
     * Gets the "Contour" element
     */
    public org.landxml.schema.landXML11.ContourDocument.Contour getContour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ContourDocument.Contour target = null;
            target = (org.landxml.schema.landXML11.ContourDocument.Contour)get_store().find_element_user(CONTOUR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Contour" element
     */
    public void setContour(org.landxml.schema.landXML11.ContourDocument.Contour contour)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ContourDocument.Contour target = null;
            target = (org.landxml.schema.landXML11.ContourDocument.Contour)get_store().find_element_user(CONTOUR$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ContourDocument.Contour)get_store().add_element_user(CONTOUR$0);
            }
            target.set(contour);
        }
    }
    
    /**
     * Appends and returns a new empty "Contour" element
     */
    public org.landxml.schema.landXML11.ContourDocument.Contour addNewContour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ContourDocument.Contour target = null;
            target = (org.landxml.schema.landXML11.ContourDocument.Contour)get_store().add_element_user(CONTOUR$0);
            return target;
        }
    }
    /**
     * An XML Contour(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class ContourImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ContourDocument.Contour
    {
        
        public ContourImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PNTLIST2D$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PntList2D");
        private static final javax.xml.namespace.QName FEATURE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName ELEV$4 = 
            new javax.xml.namespace.QName("", "elev");
        
        
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
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return ContourImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ContourImpl.this.getFeatureArray(i);
                    ContourImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { ContourImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ContourImpl.this.getFeatureArray(i);
                    ContourImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return ContourImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "elev" attribute
         */
        public double getElev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEV$4);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "elev" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetElev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ELEV$4);
                return target;
            }
        }
        
        /**
         * Sets the "elev" attribute
         */
        public void setElev(double elev)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEV$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELEV$4);
                }
                target.setDoubleValue(elev);
            }
        }
        
        /**
         * Sets (as xml) the "elev" attribute
         */
        public void xsetElev(org.apache.xmlbeans.XmlDouble elev)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ELEV$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ELEV$4);
                }
                target.set(elev);
            }
        }
    }
}
