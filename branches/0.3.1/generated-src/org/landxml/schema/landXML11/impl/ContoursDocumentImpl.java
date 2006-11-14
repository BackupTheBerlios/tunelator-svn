/*
 * An XML document type.
 * Localname: Contours
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ContoursDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Contours(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ContoursDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ContoursDocument
{
    
    public ContoursDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTOURS$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Contours");
    
    
    /**
     * Gets the "Contours" element
     */
    public org.landxml.schema.landXML11.ContoursDocument.Contours getContours()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ContoursDocument.Contours target = null;
            target = (org.landxml.schema.landXML11.ContoursDocument.Contours)get_store().find_element_user(CONTOURS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Contours" element
     */
    public void setContours(org.landxml.schema.landXML11.ContoursDocument.Contours contours)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ContoursDocument.Contours target = null;
            target = (org.landxml.schema.landXML11.ContoursDocument.Contours)get_store().find_element_user(CONTOURS$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ContoursDocument.Contours)get_store().add_element_user(CONTOURS$0);
            }
            target.set(contours);
        }
    }
    
    /**
     * Appends and returns a new empty "Contours" element
     */
    public org.landxml.schema.landXML11.ContoursDocument.Contours addNewContours()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ContoursDocument.Contours target = null;
            target = (org.landxml.schema.landXML11.ContoursDocument.Contours)get_store().add_element_user(CONTOURS$0);
            return target;
        }
    }
    /**
     * An XML Contours(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class ContoursImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ContoursDocument.Contours
    {
        
        public ContoursImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTOUR$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Contour");
        private static final javax.xml.namespace.QName FEATURE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        
        
        /**
         * Gets a List of "Contour" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ContourDocument.Contour> getContourList()
        {
            final class ContourList extends java.util.AbstractList<org.landxml.schema.landXML11.ContourDocument.Contour>
            {
                public org.landxml.schema.landXML11.ContourDocument.Contour get(int i)
                    { return ContoursImpl.this.getContourArray(i); }
                
                public org.landxml.schema.landXML11.ContourDocument.Contour set(int i, org.landxml.schema.landXML11.ContourDocument.Contour o)
                {
                    org.landxml.schema.landXML11.ContourDocument.Contour old = ContoursImpl.this.getContourArray(i);
                    ContoursImpl.this.setContourArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ContourDocument.Contour o)
                    { ContoursImpl.this.insertNewContour(i).set(o); }
                
                public org.landxml.schema.landXML11.ContourDocument.Contour remove(int i)
                {
                    org.landxml.schema.landXML11.ContourDocument.Contour old = ContoursImpl.this.getContourArray(i);
                    ContoursImpl.this.removeContour(i);
                    return old;
                }
                
                public int size()
                    { return ContoursImpl.this.sizeOfContourArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ContourList();
            }
        }
        
        /**
         * Gets array of all "Contour" elements
         */
        public org.landxml.schema.landXML11.ContourDocument.Contour[] getContourArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONTOUR$0, targetList);
                org.landxml.schema.landXML11.ContourDocument.Contour[] result = new org.landxml.schema.landXML11.ContourDocument.Contour[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Contour" element
         */
        public org.landxml.schema.landXML11.ContourDocument.Contour getContourArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ContourDocument.Contour target = null;
                target = (org.landxml.schema.landXML11.ContourDocument.Contour)get_store().find_element_user(CONTOUR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Contour" element
         */
        public int sizeOfContourArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTOUR$0);
            }
        }
        
        /**
         * Sets array of all "Contour" element
         */
        public void setContourArray(org.landxml.schema.landXML11.ContourDocument.Contour[] contourArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(contourArray, CONTOUR$0);
            }
        }
        
        /**
         * Sets ith "Contour" element
         */
        public void setContourArray(int i, org.landxml.schema.landXML11.ContourDocument.Contour contour)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ContourDocument.Contour target = null;
                target = (org.landxml.schema.landXML11.ContourDocument.Contour)get_store().find_element_user(CONTOUR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(contour);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Contour" element
         */
        public org.landxml.schema.landXML11.ContourDocument.Contour insertNewContour(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ContourDocument.Contour target = null;
                target = (org.landxml.schema.landXML11.ContourDocument.Contour)get_store().insert_element_user(CONTOUR$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Contour" element
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
         * Removes the ith "Contour" element
         */
        public void removeContour(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTOUR$0, i);
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
                    { return ContoursImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ContoursImpl.this.getFeatureArray(i);
                    ContoursImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { ContoursImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ContoursImpl.this.getFeatureArray(i);
                    ContoursImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return ContoursImpl.this.sizeOfFeatureArray(); }
                
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
    }
}
