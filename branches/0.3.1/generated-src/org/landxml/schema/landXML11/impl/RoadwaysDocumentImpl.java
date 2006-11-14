/*
 * An XML document type.
 * Localname: Roadways
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.RoadwaysDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Roadways(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class RoadwaysDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.RoadwaysDocument
{
    
    public RoadwaysDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROADWAYS$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Roadways");
    
    
    /**
     * Gets the "Roadways" element
     */
    public org.landxml.schema.landXML11.RoadwaysDocument.Roadways getRoadways()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RoadwaysDocument.Roadways target = null;
            target = (org.landxml.schema.landXML11.RoadwaysDocument.Roadways)get_store().find_element_user(ROADWAYS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Roadways" element
     */
    public void setRoadways(org.landxml.schema.landXML11.RoadwaysDocument.Roadways roadways)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RoadwaysDocument.Roadways target = null;
            target = (org.landxml.schema.landXML11.RoadwaysDocument.Roadways)get_store().find_element_user(ROADWAYS$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.RoadwaysDocument.Roadways)get_store().add_element_user(ROADWAYS$0);
            }
            target.set(roadways);
        }
    }
    
    /**
     * Appends and returns a new empty "Roadways" element
     */
    public org.landxml.schema.landXML11.RoadwaysDocument.Roadways addNewRoadways()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RoadwaysDocument.Roadways target = null;
            target = (org.landxml.schema.landXML11.RoadwaysDocument.Roadways)get_store().add_element_user(ROADWAYS$0);
            return target;
        }
    }
    /**
     * An XML Roadways(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class RoadwaysImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.RoadwaysDocument.Roadways
    {
        
        public RoadwaysImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROADWAY$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Roadway");
        private static final javax.xml.namespace.QName INTERSECTIONS$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Intersections");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName NAME$6 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESC$8 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName STATE$10 = 
            new javax.xml.namespace.QName("", "state");
        
        
        /**
         * Gets a List of "Roadway" elements
         */
        public java.util.List<org.landxml.schema.landXML11.RoadwayDocument.Roadway> getRoadwayList()
        {
            final class RoadwayList extends java.util.AbstractList<org.landxml.schema.landXML11.RoadwayDocument.Roadway>
            {
                public org.landxml.schema.landXML11.RoadwayDocument.Roadway get(int i)
                    { return RoadwaysImpl.this.getRoadwayArray(i); }
                
                public org.landxml.schema.landXML11.RoadwayDocument.Roadway set(int i, org.landxml.schema.landXML11.RoadwayDocument.Roadway o)
                {
                    org.landxml.schema.landXML11.RoadwayDocument.Roadway old = RoadwaysImpl.this.getRoadwayArray(i);
                    RoadwaysImpl.this.setRoadwayArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.RoadwayDocument.Roadway o)
                    { RoadwaysImpl.this.insertNewRoadway(i).set(o); }
                
                public org.landxml.schema.landXML11.RoadwayDocument.Roadway remove(int i)
                {
                    org.landxml.schema.landXML11.RoadwayDocument.Roadway old = RoadwaysImpl.this.getRoadwayArray(i);
                    RoadwaysImpl.this.removeRoadway(i);
                    return old;
                }
                
                public int size()
                    { return RoadwaysImpl.this.sizeOfRoadwayArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RoadwayList();
            }
        }
        
        /**
         * Gets array of all "Roadway" elements
         */
        public org.landxml.schema.landXML11.RoadwayDocument.Roadway[] getRoadwayArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ROADWAY$0, targetList);
                org.landxml.schema.landXML11.RoadwayDocument.Roadway[] result = new org.landxml.schema.landXML11.RoadwayDocument.Roadway[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Roadway" element
         */
        public org.landxml.schema.landXML11.RoadwayDocument.Roadway getRoadwayArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadwayDocument.Roadway target = null;
                target = (org.landxml.schema.landXML11.RoadwayDocument.Roadway)get_store().find_element_user(ROADWAY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Roadway" element
         */
        public int sizeOfRoadwayArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROADWAY$0);
            }
        }
        
        /**
         * Sets array of all "Roadway" element
         */
        public void setRoadwayArray(org.landxml.schema.landXML11.RoadwayDocument.Roadway[] roadwayArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(roadwayArray, ROADWAY$0);
            }
        }
        
        /**
         * Sets ith "Roadway" element
         */
        public void setRoadwayArray(int i, org.landxml.schema.landXML11.RoadwayDocument.Roadway roadway)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadwayDocument.Roadway target = null;
                target = (org.landxml.schema.landXML11.RoadwayDocument.Roadway)get_store().find_element_user(ROADWAY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(roadway);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Roadway" element
         */
        public org.landxml.schema.landXML11.RoadwayDocument.Roadway insertNewRoadway(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadwayDocument.Roadway target = null;
                target = (org.landxml.schema.landXML11.RoadwayDocument.Roadway)get_store().insert_element_user(ROADWAY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Roadway" element
         */
        public org.landxml.schema.landXML11.RoadwayDocument.Roadway addNewRoadway()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadwayDocument.Roadway target = null;
                target = (org.landxml.schema.landXML11.RoadwayDocument.Roadway)get_store().add_element_user(ROADWAY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Roadway" element
         */
        public void removeRoadway(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROADWAY$0, i);
            }
        }
        
        /**
         * Gets a List of "Intersections" elements
         */
        public java.util.List<org.landxml.schema.landXML11.IntersectionsDocument.Intersections> getIntersectionsList()
        {
            final class IntersectionsList extends java.util.AbstractList<org.landxml.schema.landXML11.IntersectionsDocument.Intersections>
            {
                public org.landxml.schema.landXML11.IntersectionsDocument.Intersections get(int i)
                    { return RoadwaysImpl.this.getIntersectionsArray(i); }
                
                public org.landxml.schema.landXML11.IntersectionsDocument.Intersections set(int i, org.landxml.schema.landXML11.IntersectionsDocument.Intersections o)
                {
                    org.landxml.schema.landXML11.IntersectionsDocument.Intersections old = RoadwaysImpl.this.getIntersectionsArray(i);
                    RoadwaysImpl.this.setIntersectionsArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.IntersectionsDocument.Intersections o)
                    { RoadwaysImpl.this.insertNewIntersections(i).set(o); }
                
                public org.landxml.schema.landXML11.IntersectionsDocument.Intersections remove(int i)
                {
                    org.landxml.schema.landXML11.IntersectionsDocument.Intersections old = RoadwaysImpl.this.getIntersectionsArray(i);
                    RoadwaysImpl.this.removeIntersections(i);
                    return old;
                }
                
                public int size()
                    { return RoadwaysImpl.this.sizeOfIntersectionsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new IntersectionsList();
            }
        }
        
        /**
         * Gets array of all "Intersections" elements
         */
        public org.landxml.schema.landXML11.IntersectionsDocument.Intersections[] getIntersectionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INTERSECTIONS$2, targetList);
                org.landxml.schema.landXML11.IntersectionsDocument.Intersections[] result = new org.landxml.schema.landXML11.IntersectionsDocument.Intersections[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Intersections" element
         */
        public org.landxml.schema.landXML11.IntersectionsDocument.Intersections getIntersectionsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.IntersectionsDocument.Intersections target = null;
                target = (org.landxml.schema.landXML11.IntersectionsDocument.Intersections)get_store().find_element_user(INTERSECTIONS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Intersections" element
         */
        public int sizeOfIntersectionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTERSECTIONS$2);
            }
        }
        
        /**
         * Sets array of all "Intersections" element
         */
        public void setIntersectionsArray(org.landxml.schema.landXML11.IntersectionsDocument.Intersections[] intersectionsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(intersectionsArray, INTERSECTIONS$2);
            }
        }
        
        /**
         * Sets ith "Intersections" element
         */
        public void setIntersectionsArray(int i, org.landxml.schema.landXML11.IntersectionsDocument.Intersections intersections)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.IntersectionsDocument.Intersections target = null;
                target = (org.landxml.schema.landXML11.IntersectionsDocument.Intersections)get_store().find_element_user(INTERSECTIONS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(intersections);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Intersections" element
         */
        public org.landxml.schema.landXML11.IntersectionsDocument.Intersections insertNewIntersections(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.IntersectionsDocument.Intersections target = null;
                target = (org.landxml.schema.landXML11.IntersectionsDocument.Intersections)get_store().insert_element_user(INTERSECTIONS$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Intersections" element
         */
        public org.landxml.schema.landXML11.IntersectionsDocument.Intersections addNewIntersections()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.IntersectionsDocument.Intersections target = null;
                target = (org.landxml.schema.landXML11.IntersectionsDocument.Intersections)get_store().add_element_user(INTERSECTIONS$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Intersections" element
         */
        public void removeIntersections(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTERSECTIONS$2, i);
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
                    { return RoadwaysImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = RoadwaysImpl.this.getFeatureArray(i);
                    RoadwaysImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { RoadwaysImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = RoadwaysImpl.this.getFeatureArray(i);
                    RoadwaysImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return RoadwaysImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "desc" attribute
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$8);
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
                return get_store().find_attribute_user(DESC$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$8);
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
                get_store().remove_attribute(DESC$8);
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
