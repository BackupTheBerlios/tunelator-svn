/*
 * An XML document type.
 * Localname: Intersections
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.IntersectionsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Intersections(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class IntersectionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.IntersectionsDocument
{
    
    public IntersectionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERSECTIONS$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Intersections");
    
    
    /**
     * Gets the "Intersections" element
     */
    public org.landxml.schema.landXML11.IntersectionsDocument.Intersections getIntersections()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.IntersectionsDocument.Intersections target = null;
            target = (org.landxml.schema.landXML11.IntersectionsDocument.Intersections)get_store().find_element_user(INTERSECTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Intersections" element
     */
    public void setIntersections(org.landxml.schema.landXML11.IntersectionsDocument.Intersections intersections)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.IntersectionsDocument.Intersections target = null;
            target = (org.landxml.schema.landXML11.IntersectionsDocument.Intersections)get_store().find_element_user(INTERSECTIONS$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.IntersectionsDocument.Intersections)get_store().add_element_user(INTERSECTIONS$0);
            }
            target.set(intersections);
        }
    }
    
    /**
     * Appends and returns a new empty "Intersections" element
     */
    public org.landxml.schema.landXML11.IntersectionsDocument.Intersections addNewIntersections()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.IntersectionsDocument.Intersections target = null;
            target = (org.landxml.schema.landXML11.IntersectionsDocument.Intersections)get_store().add_element_user(INTERSECTIONS$0);
            return target;
        }
    }
    /**
     * An XML Intersections(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class IntersectionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.IntersectionsDocument.Intersections
    {
        
        public IntersectionsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INTERSECTION$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Intersection");
        private static final javax.xml.namespace.QName FEATURE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        
        
        /**
         * Gets a List of "Intersection" elements
         */
        public java.util.List<org.landxml.schema.landXML11.IntersectionDocument.Intersection> getIntersectionList()
        {
            final class IntersectionList extends java.util.AbstractList<org.landxml.schema.landXML11.IntersectionDocument.Intersection>
            {
                public org.landxml.schema.landXML11.IntersectionDocument.Intersection get(int i)
                    { return IntersectionsImpl.this.getIntersectionArray(i); }
                
                public org.landxml.schema.landXML11.IntersectionDocument.Intersection set(int i, org.landxml.schema.landXML11.IntersectionDocument.Intersection o)
                {
                    org.landxml.schema.landXML11.IntersectionDocument.Intersection old = IntersectionsImpl.this.getIntersectionArray(i);
                    IntersectionsImpl.this.setIntersectionArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.IntersectionDocument.Intersection o)
                    { IntersectionsImpl.this.insertNewIntersection(i).set(o); }
                
                public org.landxml.schema.landXML11.IntersectionDocument.Intersection remove(int i)
                {
                    org.landxml.schema.landXML11.IntersectionDocument.Intersection old = IntersectionsImpl.this.getIntersectionArray(i);
                    IntersectionsImpl.this.removeIntersection(i);
                    return old;
                }
                
                public int size()
                    { return IntersectionsImpl.this.sizeOfIntersectionArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new IntersectionList();
            }
        }
        
        /**
         * Gets array of all "Intersection" elements
         */
        public org.landxml.schema.landXML11.IntersectionDocument.Intersection[] getIntersectionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INTERSECTION$0, targetList);
                org.landxml.schema.landXML11.IntersectionDocument.Intersection[] result = new org.landxml.schema.landXML11.IntersectionDocument.Intersection[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Intersection" element
         */
        public org.landxml.schema.landXML11.IntersectionDocument.Intersection getIntersectionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.IntersectionDocument.Intersection target = null;
                target = (org.landxml.schema.landXML11.IntersectionDocument.Intersection)get_store().find_element_user(INTERSECTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Intersection" element
         */
        public int sizeOfIntersectionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTERSECTION$0);
            }
        }
        
        /**
         * Sets array of all "Intersection" element
         */
        public void setIntersectionArray(org.landxml.schema.landXML11.IntersectionDocument.Intersection[] intersectionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(intersectionArray, INTERSECTION$0);
            }
        }
        
        /**
         * Sets ith "Intersection" element
         */
        public void setIntersectionArray(int i, org.landxml.schema.landXML11.IntersectionDocument.Intersection intersection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.IntersectionDocument.Intersection target = null;
                target = (org.landxml.schema.landXML11.IntersectionDocument.Intersection)get_store().find_element_user(INTERSECTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(intersection);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Intersection" element
         */
        public org.landxml.schema.landXML11.IntersectionDocument.Intersection insertNewIntersection(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.IntersectionDocument.Intersection target = null;
                target = (org.landxml.schema.landXML11.IntersectionDocument.Intersection)get_store().insert_element_user(INTERSECTION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Intersection" element
         */
        public org.landxml.schema.landXML11.IntersectionDocument.Intersection addNewIntersection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.IntersectionDocument.Intersection target = null;
                target = (org.landxml.schema.landXML11.IntersectionDocument.Intersection)get_store().add_element_user(INTERSECTION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Intersection" element
         */
        public void removeIntersection(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTERSECTION$0, i);
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
                    { return IntersectionsImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = IntersectionsImpl.this.getFeatureArray(i);
                    IntersectionsImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { IntersectionsImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = IntersectionsImpl.this.getFeatureArray(i);
                    IntersectionsImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return IntersectionsImpl.this.sizeOfFeatureArray(); }
                
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
