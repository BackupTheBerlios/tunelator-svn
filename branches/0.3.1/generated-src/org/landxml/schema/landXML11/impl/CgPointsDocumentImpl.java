/*
 * An XML document type.
 * Localname: CgPoints
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CgPointsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one CgPoints(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class CgPointsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CgPointsDocument
{
    
    public CgPointsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CGPOINTS$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CgPoints");
    
    
    /**
     * Gets the "CgPoints" element
     */
    public org.landxml.schema.landXML11.CgPointsDocument.CgPoints getCgPoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CgPointsDocument.CgPoints target = null;
            target = (org.landxml.schema.landXML11.CgPointsDocument.CgPoints)get_store().find_element_user(CGPOINTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CgPoints" element
     */
    public void setCgPoints(org.landxml.schema.landXML11.CgPointsDocument.CgPoints cgPoints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CgPointsDocument.CgPoints target = null;
            target = (org.landxml.schema.landXML11.CgPointsDocument.CgPoints)get_store().find_element_user(CGPOINTS$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.CgPointsDocument.CgPoints)get_store().add_element_user(CGPOINTS$0);
            }
            target.set(cgPoints);
        }
    }
    
    /**
     * Appends and returns a new empty "CgPoints" element
     */
    public org.landxml.schema.landXML11.CgPointsDocument.CgPoints addNewCgPoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CgPointsDocument.CgPoints target = null;
            target = (org.landxml.schema.landXML11.CgPointsDocument.CgPoints)get_store().add_element_user(CGPOINTS$0);
            return target;
        }
    }
    /**
     * An XML CgPoints(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class CgPointsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CgPointsDocument.CgPoints
    {
        
        public CgPointsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CGPOINT$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CgPoint");
        private static final javax.xml.namespace.QName CGPOINTS$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CgPoints");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName DESC$6 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName NAME$8 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName STATE$10 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName CODE$12 = 
            new javax.xml.namespace.QName("", "code");
        private static final javax.xml.namespace.QName ZONENUMBER$14 = 
            new javax.xml.namespace.QName("", "zoneNumber");
        private static final javax.xml.namespace.QName DTMATTRIBUTE$16 = 
            new javax.xml.namespace.QName("", "DTMAttribute");
        
        
        /**
         * Gets a List of "CgPoint" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CgPointDocument.CgPoint> getCgPointList()
        {
            final class CgPointList extends java.util.AbstractList<org.landxml.schema.landXML11.CgPointDocument.CgPoint>
            {
                public org.landxml.schema.landXML11.CgPointDocument.CgPoint get(int i)
                    { return CgPointsImpl.this.getCgPointArray(i); }
                
                public org.landxml.schema.landXML11.CgPointDocument.CgPoint set(int i, org.landxml.schema.landXML11.CgPointDocument.CgPoint o)
                {
                    org.landxml.schema.landXML11.CgPointDocument.CgPoint old = CgPointsImpl.this.getCgPointArray(i);
                    CgPointsImpl.this.setCgPointArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CgPointDocument.CgPoint o)
                    { CgPointsImpl.this.insertNewCgPoint(i).set(o); }
                
                public org.landxml.schema.landXML11.CgPointDocument.CgPoint remove(int i)
                {
                    org.landxml.schema.landXML11.CgPointDocument.CgPoint old = CgPointsImpl.this.getCgPointArray(i);
                    CgPointsImpl.this.removeCgPoint(i);
                    return old;
                }
                
                public int size()
                    { return CgPointsImpl.this.sizeOfCgPointArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CgPointList();
            }
        }
        
        /**
         * Gets array of all "CgPoint" elements
         */
        public org.landxml.schema.landXML11.CgPointDocument.CgPoint[] getCgPointArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CGPOINT$0, targetList);
                org.landxml.schema.landXML11.CgPointDocument.CgPoint[] result = new org.landxml.schema.landXML11.CgPointDocument.CgPoint[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CgPoint" element
         */
        public org.landxml.schema.landXML11.CgPointDocument.CgPoint getCgPointArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CgPointDocument.CgPoint target = null;
                target = (org.landxml.schema.landXML11.CgPointDocument.CgPoint)get_store().find_element_user(CGPOINT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CgPoint" element
         */
        public int sizeOfCgPointArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CGPOINT$0);
            }
        }
        
        /**
         * Sets array of all "CgPoint" element
         */
        public void setCgPointArray(org.landxml.schema.landXML11.CgPointDocument.CgPoint[] cgPointArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(cgPointArray, CGPOINT$0);
            }
        }
        
        /**
         * Sets ith "CgPoint" element
         */
        public void setCgPointArray(int i, org.landxml.schema.landXML11.CgPointDocument.CgPoint cgPoint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CgPointDocument.CgPoint target = null;
                target = (org.landxml.schema.landXML11.CgPointDocument.CgPoint)get_store().find_element_user(CGPOINT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(cgPoint);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CgPoint" element
         */
        public org.landxml.schema.landXML11.CgPointDocument.CgPoint insertNewCgPoint(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CgPointDocument.CgPoint target = null;
                target = (org.landxml.schema.landXML11.CgPointDocument.CgPoint)get_store().insert_element_user(CGPOINT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CgPoint" element
         */
        public org.landxml.schema.landXML11.CgPointDocument.CgPoint addNewCgPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CgPointDocument.CgPoint target = null;
                target = (org.landxml.schema.landXML11.CgPointDocument.CgPoint)get_store().add_element_user(CGPOINT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "CgPoint" element
         */
        public void removeCgPoint(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CGPOINT$0, i);
            }
        }
        
        /**
         * Gets a List of "CgPoints" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CgPointsDocument.CgPoints> getCgPointsList()
        {
            final class CgPointsList extends java.util.AbstractList<org.landxml.schema.landXML11.CgPointsDocument.CgPoints>
            {
                public org.landxml.schema.landXML11.CgPointsDocument.CgPoints get(int i)
                    { return CgPointsImpl.this.getCgPointsArray(i); }
                
                public org.landxml.schema.landXML11.CgPointsDocument.CgPoints set(int i, org.landxml.schema.landXML11.CgPointsDocument.CgPoints o)
                {
                    org.landxml.schema.landXML11.CgPointsDocument.CgPoints old = CgPointsImpl.this.getCgPointsArray(i);
                    CgPointsImpl.this.setCgPointsArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CgPointsDocument.CgPoints o)
                    { CgPointsImpl.this.insertNewCgPoints(i).set(o); }
                
                public org.landxml.schema.landXML11.CgPointsDocument.CgPoints remove(int i)
                {
                    org.landxml.schema.landXML11.CgPointsDocument.CgPoints old = CgPointsImpl.this.getCgPointsArray(i);
                    CgPointsImpl.this.removeCgPoints(i);
                    return old;
                }
                
                public int size()
                    { return CgPointsImpl.this.sizeOfCgPointsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CgPointsList();
            }
        }
        
        /**
         * Gets array of all "CgPoints" elements
         */
        public org.landxml.schema.landXML11.CgPointsDocument.CgPoints[] getCgPointsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CGPOINTS$2, targetList);
                org.landxml.schema.landXML11.CgPointsDocument.CgPoints[] result = new org.landxml.schema.landXML11.CgPointsDocument.CgPoints[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CgPoints" element
         */
        public org.landxml.schema.landXML11.CgPointsDocument.CgPoints getCgPointsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CgPointsDocument.CgPoints target = null;
                target = (org.landxml.schema.landXML11.CgPointsDocument.CgPoints)get_store().find_element_user(CGPOINTS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CgPoints" element
         */
        public int sizeOfCgPointsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CGPOINTS$2);
            }
        }
        
        /**
         * Sets array of all "CgPoints" element
         */
        public void setCgPointsArray(org.landxml.schema.landXML11.CgPointsDocument.CgPoints[] cgPointsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(cgPointsArray, CGPOINTS$2);
            }
        }
        
        /**
         * Sets ith "CgPoints" element
         */
        public void setCgPointsArray(int i, org.landxml.schema.landXML11.CgPointsDocument.CgPoints cgPoints)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CgPointsDocument.CgPoints target = null;
                target = (org.landxml.schema.landXML11.CgPointsDocument.CgPoints)get_store().find_element_user(CGPOINTS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(cgPoints);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CgPoints" element
         */
        public org.landxml.schema.landXML11.CgPointsDocument.CgPoints insertNewCgPoints(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CgPointsDocument.CgPoints target = null;
                target = (org.landxml.schema.landXML11.CgPointsDocument.CgPoints)get_store().insert_element_user(CGPOINTS$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CgPoints" element
         */
        public org.landxml.schema.landXML11.CgPointsDocument.CgPoints addNewCgPoints()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CgPointsDocument.CgPoints target = null;
                target = (org.landxml.schema.landXML11.CgPointsDocument.CgPoints)get_store().add_element_user(CGPOINTS$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "CgPoints" element
         */
        public void removeCgPoints(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CGPOINTS$2, i);
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
                    { return CgPointsImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CgPointsImpl.this.getFeatureArray(i);
                    CgPointsImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { CgPointsImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CgPointsImpl.this.getFeatureArray(i);
                    CgPointsImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return CgPointsImpl.this.sizeOfFeatureArray(); }
                
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
        
        /**
         * Gets the "code" attribute
         */
        public java.lang.String getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "code" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODE$12);
                return target;
            }
        }
        
        /**
         * True if has "code" attribute
         */
        public boolean isSetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CODE$12) != null;
            }
        }
        
        /**
         * Sets the "code" attribute
         */
        public void setCode(java.lang.String code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$12);
                }
                target.setStringValue(code);
            }
        }
        
        /**
         * Sets (as xml) the "code" attribute
         */
        public void xsetCode(org.apache.xmlbeans.XmlString code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODE$12);
                }
                target.set(code);
            }
        }
        
        /**
         * Unsets the "code" attribute
         */
        public void unsetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CODE$12);
            }
        }
        
        /**
         * Gets the "zoneNumber" attribute
         */
        public int getZoneNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZONENUMBER$14);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "zoneNumber" attribute
         */
        public org.landxml.schema.landXML11.ZoneNumberType xgetZoneNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneNumberType target = null;
                target = (org.landxml.schema.landXML11.ZoneNumberType)get_store().find_attribute_user(ZONENUMBER$14);
                return target;
            }
        }
        
        /**
         * True if has "zoneNumber" attribute
         */
        public boolean isSetZoneNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ZONENUMBER$14) != null;
            }
        }
        
        /**
         * Sets the "zoneNumber" attribute
         */
        public void setZoneNumber(int zoneNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZONENUMBER$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZONENUMBER$14);
                }
                target.setIntValue(zoneNumber);
            }
        }
        
        /**
         * Sets (as xml) the "zoneNumber" attribute
         */
        public void xsetZoneNumber(org.landxml.schema.landXML11.ZoneNumberType zoneNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneNumberType target = null;
                target = (org.landxml.schema.landXML11.ZoneNumberType)get_store().find_attribute_user(ZONENUMBER$14);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ZoneNumberType)get_store().add_attribute_user(ZONENUMBER$14);
                }
                target.set(zoneNumber);
            }
        }
        
        /**
         * Unsets the "zoneNumber" attribute
         */
        public void unsetZoneNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ZONENUMBER$14);
            }
        }
        
        /**
         * Gets the "DTMAttribute" attribute
         */
        public org.landxml.schema.landXML11.DTMAttributeType.Enum getDTMAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DTMATTRIBUTE$16);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.DTMAttributeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "DTMAttribute" attribute
         */
        public org.landxml.schema.landXML11.DTMAttributeType xgetDTMAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DTMAttributeType target = null;
                target = (org.landxml.schema.landXML11.DTMAttributeType)get_store().find_attribute_user(DTMATTRIBUTE$16);
                return target;
            }
        }
        
        /**
         * True if has "DTMAttribute" attribute
         */
        public boolean isSetDTMAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DTMATTRIBUTE$16) != null;
            }
        }
        
        /**
         * Sets the "DTMAttribute" attribute
         */
        public void setDTMAttribute(org.landxml.schema.landXML11.DTMAttributeType.Enum dtmAttribute)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DTMATTRIBUTE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DTMATTRIBUTE$16);
                }
                target.setEnumValue(dtmAttribute);
            }
        }
        
        /**
         * Sets (as xml) the "DTMAttribute" attribute
         */
        public void xsetDTMAttribute(org.landxml.schema.landXML11.DTMAttributeType dtmAttribute)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DTMAttributeType target = null;
                target = (org.landxml.schema.landXML11.DTMAttributeType)get_store().find_attribute_user(DTMATTRIBUTE$16);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.DTMAttributeType)get_store().add_attribute_user(DTMATTRIBUTE$16);
                }
                target.set(dtmAttribute);
            }
        }
        
        /**
         * Unsets the "DTMAttribute" attribute
         */
        public void unsetDTMAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DTMATTRIBUTE$16);
            }
        }
    }
}
