/*
 * An XML document type.
 * Localname: Boundaries
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.BoundariesDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Boundaries(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class BoundariesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.BoundariesDocument
{
    
    public BoundariesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOUNDARIES$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Boundaries");
    
    
    /**
     * Gets the "Boundaries" element
     */
    public org.landxml.schema.landXML11.BoundariesDocument.Boundaries getBoundaries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.BoundariesDocument.Boundaries target = null;
            target = (org.landxml.schema.landXML11.BoundariesDocument.Boundaries)get_store().find_element_user(BOUNDARIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Boundaries" element
     */
    public void setBoundaries(org.landxml.schema.landXML11.BoundariesDocument.Boundaries boundaries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.BoundariesDocument.Boundaries target = null;
            target = (org.landxml.schema.landXML11.BoundariesDocument.Boundaries)get_store().find_element_user(BOUNDARIES$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.BoundariesDocument.Boundaries)get_store().add_element_user(BOUNDARIES$0);
            }
            target.set(boundaries);
        }
    }
    
    /**
     * Appends and returns a new empty "Boundaries" element
     */
    public org.landxml.schema.landXML11.BoundariesDocument.Boundaries addNewBoundaries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.BoundariesDocument.Boundaries target = null;
            target = (org.landxml.schema.landXML11.BoundariesDocument.Boundaries)get_store().add_element_user(BOUNDARIES$0);
            return target;
        }
    }
    /**
     * An XML Boundaries(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class BoundariesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.BoundariesDocument.Boundaries
    {
        
        public BoundariesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BOUNDARY$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Boundary");
        private static final javax.xml.namespace.QName FEATURE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        
        
        /**
         * Gets a List of "Boundary" elements
         */
        public java.util.List<org.landxml.schema.landXML11.BoundaryDocument.Boundary> getBoundaryList()
        {
            final class BoundaryList extends java.util.AbstractList<org.landxml.schema.landXML11.BoundaryDocument.Boundary>
            {
                public org.landxml.schema.landXML11.BoundaryDocument.Boundary get(int i)
                    { return BoundariesImpl.this.getBoundaryArray(i); }
                
                public org.landxml.schema.landXML11.BoundaryDocument.Boundary set(int i, org.landxml.schema.landXML11.BoundaryDocument.Boundary o)
                {
                    org.landxml.schema.landXML11.BoundaryDocument.Boundary old = BoundariesImpl.this.getBoundaryArray(i);
                    BoundariesImpl.this.setBoundaryArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.BoundaryDocument.Boundary o)
                    { BoundariesImpl.this.insertNewBoundary(i).set(o); }
                
                public org.landxml.schema.landXML11.BoundaryDocument.Boundary remove(int i)
                {
                    org.landxml.schema.landXML11.BoundaryDocument.Boundary old = BoundariesImpl.this.getBoundaryArray(i);
                    BoundariesImpl.this.removeBoundary(i);
                    return old;
                }
                
                public int size()
                    { return BoundariesImpl.this.sizeOfBoundaryArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new BoundaryList();
            }
        }
        
        /**
         * Gets array of all "Boundary" elements
         */
        public org.landxml.schema.landXML11.BoundaryDocument.Boundary[] getBoundaryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BOUNDARY$0, targetList);
                org.landxml.schema.landXML11.BoundaryDocument.Boundary[] result = new org.landxml.schema.landXML11.BoundaryDocument.Boundary[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Boundary" element
         */
        public org.landxml.schema.landXML11.BoundaryDocument.Boundary getBoundaryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BoundaryDocument.Boundary target = null;
                target = (org.landxml.schema.landXML11.BoundaryDocument.Boundary)get_store().find_element_user(BOUNDARY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Boundary" element
         */
        public int sizeOfBoundaryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BOUNDARY$0);
            }
        }
        
        /**
         * Sets array of all "Boundary" element
         */
        public void setBoundaryArray(org.landxml.schema.landXML11.BoundaryDocument.Boundary[] boundaryArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(boundaryArray, BOUNDARY$0);
            }
        }
        
        /**
         * Sets ith "Boundary" element
         */
        public void setBoundaryArray(int i, org.landxml.schema.landXML11.BoundaryDocument.Boundary boundary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BoundaryDocument.Boundary target = null;
                target = (org.landxml.schema.landXML11.BoundaryDocument.Boundary)get_store().find_element_user(BOUNDARY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(boundary);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Boundary" element
         */
        public org.landxml.schema.landXML11.BoundaryDocument.Boundary insertNewBoundary(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BoundaryDocument.Boundary target = null;
                target = (org.landxml.schema.landXML11.BoundaryDocument.Boundary)get_store().insert_element_user(BOUNDARY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Boundary" element
         */
        public org.landxml.schema.landXML11.BoundaryDocument.Boundary addNewBoundary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BoundaryDocument.Boundary target = null;
                target = (org.landxml.schema.landXML11.BoundaryDocument.Boundary)get_store().add_element_user(BOUNDARY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Boundary" element
         */
        public void removeBoundary(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BOUNDARY$0, i);
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
                    { return BoundariesImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = BoundariesImpl.this.getFeatureArray(i);
                    BoundariesImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { BoundariesImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = BoundariesImpl.this.getFeatureArray(i);
                    BoundariesImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return BoundariesImpl.this.sizeOfFeatureArray(); }
                
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
