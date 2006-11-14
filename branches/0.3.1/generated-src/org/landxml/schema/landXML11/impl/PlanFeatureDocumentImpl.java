/*
 * An XML document type.
 * Localname: PlanFeature
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PlanFeatureDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one PlanFeature(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class PlanFeatureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PlanFeatureDocument
{
    
    public PlanFeatureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLANFEATURE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PlanFeature");
    
    
    /**
     * Gets the "PlanFeature" element
     */
    public org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature getPlanFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature target = null;
            target = (org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature)get_store().find_element_user(PLANFEATURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PlanFeature" element
     */
    public void setPlanFeature(org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature planFeature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature target = null;
            target = (org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature)get_store().find_element_user(PLANFEATURE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature)get_store().add_element_user(PLANFEATURE$0);
            }
            target.set(planFeature);
        }
    }
    
    /**
     * Appends and returns a new empty "PlanFeature" element
     */
    public org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature addNewPlanFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature target = null;
            target = (org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature)get_store().add_element_user(PLANFEATURE$0);
            return target;
        }
    }
    /**
     * An XML PlanFeature(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class PlanFeatureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature
    {
        
        public PlanFeatureImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COORDGEOM$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CoordGeom");
        private static final javax.xml.namespace.QName LOCATION$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Location");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName DESC$6 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName NAME$8 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName STATE$10 = 
            new javax.xml.namespace.QName("", "state");
        
        
        /**
         * Gets a List of "CoordGeom" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom> getCoordGeomList()
        {
            final class CoordGeomList extends java.util.AbstractList<org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom>
            {
                public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom get(int i)
                    { return PlanFeatureImpl.this.getCoordGeomArray(i); }
                
                public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom set(int i, org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom o)
                {
                    org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom old = PlanFeatureImpl.this.getCoordGeomArray(i);
                    PlanFeatureImpl.this.setCoordGeomArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom o)
                    { PlanFeatureImpl.this.insertNewCoordGeom(i).set(o); }
                
                public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom remove(int i)
                {
                    org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom old = PlanFeatureImpl.this.getCoordGeomArray(i);
                    PlanFeatureImpl.this.removeCoordGeom(i);
                    return old;
                }
                
                public int size()
                    { return PlanFeatureImpl.this.sizeOfCoordGeomArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CoordGeomList();
            }
        }
        
        /**
         * Gets array of all "CoordGeom" elements
         */
        public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom[] getCoordGeomArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COORDGEOM$0, targetList);
                org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom[] result = new org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CoordGeom" element
         */
        public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom getCoordGeomArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom target = null;
                target = (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom)get_store().find_element_user(COORDGEOM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CoordGeom" element
         */
        public int sizeOfCoordGeomArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COORDGEOM$0);
            }
        }
        
        /**
         * Sets array of all "CoordGeom" element
         */
        public void setCoordGeomArray(org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom[] coordGeomArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(coordGeomArray, COORDGEOM$0);
            }
        }
        
        /**
         * Sets ith "CoordGeom" element
         */
        public void setCoordGeomArray(int i, org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom coordGeom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom target = null;
                target = (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom)get_store().find_element_user(COORDGEOM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(coordGeom);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CoordGeom" element
         */
        public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom insertNewCoordGeom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom target = null;
                target = (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom)get_store().insert_element_user(COORDGEOM$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CoordGeom" element
         */
        public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom addNewCoordGeom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom target = null;
                target = (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom)get_store().add_element_user(COORDGEOM$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "CoordGeom" element
         */
        public void removeCoordGeom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COORDGEOM$0, i);
            }
        }
        
        /**
         * Gets a List of "Location" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PointType> getLocationList()
        {
            final class LocationList extends java.util.AbstractList<org.landxml.schema.landXML11.PointType>
            {
                public org.landxml.schema.landXML11.PointType get(int i)
                    { return PlanFeatureImpl.this.getLocationArray(i); }
                
                public org.landxml.schema.landXML11.PointType set(int i, org.landxml.schema.landXML11.PointType o)
                {
                    org.landxml.schema.landXML11.PointType old = PlanFeatureImpl.this.getLocationArray(i);
                    PlanFeatureImpl.this.setLocationArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PointType o)
                    { PlanFeatureImpl.this.insertNewLocation(i).set(o); }
                
                public org.landxml.schema.landXML11.PointType remove(int i)
                {
                    org.landxml.schema.landXML11.PointType old = PlanFeatureImpl.this.getLocationArray(i);
                    PlanFeatureImpl.this.removeLocation(i);
                    return old;
                }
                
                public int size()
                    { return PlanFeatureImpl.this.sizeOfLocationArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LocationList();
            }
        }
        
        /**
         * Gets array of all "Location" elements
         */
        public org.landxml.schema.landXML11.PointType[] getLocationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LOCATION$2, targetList);
                org.landxml.schema.landXML11.PointType[] result = new org.landxml.schema.landXML11.PointType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Location" element
         */
        public org.landxml.schema.landXML11.PointType getLocationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(LOCATION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Location" element
         */
        public int sizeOfLocationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCATION$2);
            }
        }
        
        /**
         * Sets array of all "Location" element
         */
        public void setLocationArray(org.landxml.schema.landXML11.PointType[] locationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(locationArray, LOCATION$2);
            }
        }
        
        /**
         * Sets ith "Location" element
         */
        public void setLocationArray(int i, org.landxml.schema.landXML11.PointType location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(LOCATION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(location);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Location" element
         */
        public org.landxml.schema.landXML11.PointType insertNewLocation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().insert_element_user(LOCATION$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Location" element
         */
        public org.landxml.schema.landXML11.PointType addNewLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(LOCATION$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Location" element
         */
        public void removeLocation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCATION$2, i);
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
                    { return PlanFeatureImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = PlanFeatureImpl.this.getFeatureArray(i);
                    PlanFeatureImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { PlanFeatureImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = PlanFeatureImpl.this.getFeatureArray(i);
                    PlanFeatureImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return PlanFeatureImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "desc" attribute
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$6);
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
                return get_store().find_attribute_user(DESC$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$6);
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
                get_store().remove_attribute(DESC$6);
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
