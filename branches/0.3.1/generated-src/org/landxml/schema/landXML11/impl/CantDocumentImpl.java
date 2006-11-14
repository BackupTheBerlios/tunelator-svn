/*
 * An XML document type.
 * Localname: Cant
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CantDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Cant(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class CantDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CantDocument
{
    
    public CantDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANT$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Cant");
    
    
    /**
     * Gets the "Cant" element
     */
    public org.landxml.schema.landXML11.CantDocument.Cant getCant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CantDocument.Cant target = null;
            target = (org.landxml.schema.landXML11.CantDocument.Cant)get_store().find_element_user(CANT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Cant" element
     */
    public void setCant(org.landxml.schema.landXML11.CantDocument.Cant cant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CantDocument.Cant target = null;
            target = (org.landxml.schema.landXML11.CantDocument.Cant)get_store().find_element_user(CANT$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.CantDocument.Cant)get_store().add_element_user(CANT$0);
            }
            target.set(cant);
        }
    }
    
    /**
     * Appends and returns a new empty "Cant" element
     */
    public org.landxml.schema.landXML11.CantDocument.Cant addNewCant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CantDocument.Cant target = null;
            target = (org.landxml.schema.landXML11.CantDocument.Cant)get_store().add_element_user(CANT$0);
            return target;
        }
    }
    /**
     * An XML Cant(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class CantImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CantDocument.Cant
    {
        
        public CantImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CANTSTATION$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CantStation");
        private static final javax.xml.namespace.QName SPEEDSTATION$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "SpeedStation");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName NAME$6 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESC$8 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName STATE$10 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName EQUILIBRIUMCONSTANT$12 = 
            new javax.xml.namespace.QName("", "equilibriumConstant");
        private static final javax.xml.namespace.QName APPLIEDCANTCONSTANT$14 = 
            new javax.xml.namespace.QName("", "appliedCantConstant");
        private static final javax.xml.namespace.QName GAUGE$16 = 
            new javax.xml.namespace.QName("", "gauge");
        private static final javax.xml.namespace.QName ROTATIONPOINT$18 = 
            new javax.xml.namespace.QName("", "rotationPoint");
        
        
        /**
         * Gets a List of "CantStation" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CantStationDocument.CantStation> getCantStationList()
        {
            final class CantStationList extends java.util.AbstractList<org.landxml.schema.landXML11.CantStationDocument.CantStation>
            {
                public org.landxml.schema.landXML11.CantStationDocument.CantStation get(int i)
                    { return CantImpl.this.getCantStationArray(i); }
                
                public org.landxml.schema.landXML11.CantStationDocument.CantStation set(int i, org.landxml.schema.landXML11.CantStationDocument.CantStation o)
                {
                    org.landxml.schema.landXML11.CantStationDocument.CantStation old = CantImpl.this.getCantStationArray(i);
                    CantImpl.this.setCantStationArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CantStationDocument.CantStation o)
                    { CantImpl.this.insertNewCantStation(i).set(o); }
                
                public org.landxml.schema.landXML11.CantStationDocument.CantStation remove(int i)
                {
                    org.landxml.schema.landXML11.CantStationDocument.CantStation old = CantImpl.this.getCantStationArray(i);
                    CantImpl.this.removeCantStation(i);
                    return old;
                }
                
                public int size()
                    { return CantImpl.this.sizeOfCantStationArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CantStationList();
            }
        }
        
        /**
         * Gets array of all "CantStation" elements
         */
        public org.landxml.schema.landXML11.CantStationDocument.CantStation[] getCantStationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CANTSTATION$0, targetList);
                org.landxml.schema.landXML11.CantStationDocument.CantStation[] result = new org.landxml.schema.landXML11.CantStationDocument.CantStation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CantStation" element
         */
        public org.landxml.schema.landXML11.CantStationDocument.CantStation getCantStationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CantStationDocument.CantStation target = null;
                target = (org.landxml.schema.landXML11.CantStationDocument.CantStation)get_store().find_element_user(CANTSTATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CantStation" element
         */
        public int sizeOfCantStationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CANTSTATION$0);
            }
        }
        
        /**
         * Sets array of all "CantStation" element
         */
        public void setCantStationArray(org.landxml.schema.landXML11.CantStationDocument.CantStation[] cantStationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(cantStationArray, CANTSTATION$0);
            }
        }
        
        /**
         * Sets ith "CantStation" element
         */
        public void setCantStationArray(int i, org.landxml.schema.landXML11.CantStationDocument.CantStation cantStation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CantStationDocument.CantStation target = null;
                target = (org.landxml.schema.landXML11.CantStationDocument.CantStation)get_store().find_element_user(CANTSTATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(cantStation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CantStation" element
         */
        public org.landxml.schema.landXML11.CantStationDocument.CantStation insertNewCantStation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CantStationDocument.CantStation target = null;
                target = (org.landxml.schema.landXML11.CantStationDocument.CantStation)get_store().insert_element_user(CANTSTATION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CantStation" element
         */
        public org.landxml.schema.landXML11.CantStationDocument.CantStation addNewCantStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CantStationDocument.CantStation target = null;
                target = (org.landxml.schema.landXML11.CantStationDocument.CantStation)get_store().add_element_user(CANTSTATION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "CantStation" element
         */
        public void removeCantStation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CANTSTATION$0, i);
            }
        }
        
        /**
         * Gets a List of "SpeedStation" elements
         */
        public java.util.List<org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation> getSpeedStationList()
        {
            final class SpeedStationList extends java.util.AbstractList<org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation>
            {
                public org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation get(int i)
                    { return CantImpl.this.getSpeedStationArray(i); }
                
                public org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation set(int i, org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation o)
                {
                    org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation old = CantImpl.this.getSpeedStationArray(i);
                    CantImpl.this.setSpeedStationArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation o)
                    { CantImpl.this.insertNewSpeedStation(i).set(o); }
                
                public org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation remove(int i)
                {
                    org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation old = CantImpl.this.getSpeedStationArray(i);
                    CantImpl.this.removeSpeedStation(i);
                    return old;
                }
                
                public int size()
                    { return CantImpl.this.sizeOfSpeedStationArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SpeedStationList();
            }
        }
        
        /**
         * Gets array of all "SpeedStation" elements
         */
        public org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation[] getSpeedStationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SPEEDSTATION$2, targetList);
                org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation[] result = new org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "SpeedStation" element
         */
        public org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation getSpeedStationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation target = null;
                target = (org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation)get_store().find_element_user(SPEEDSTATION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "SpeedStation" element
         */
        public int sizeOfSpeedStationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SPEEDSTATION$2);
            }
        }
        
        /**
         * Sets array of all "SpeedStation" element
         */
        public void setSpeedStationArray(org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation[] speedStationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(speedStationArray, SPEEDSTATION$2);
            }
        }
        
        /**
         * Sets ith "SpeedStation" element
         */
        public void setSpeedStationArray(int i, org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation speedStation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation target = null;
                target = (org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation)get_store().find_element_user(SPEEDSTATION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(speedStation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SpeedStation" element
         */
        public org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation insertNewSpeedStation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation target = null;
                target = (org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation)get_store().insert_element_user(SPEEDSTATION$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SpeedStation" element
         */
        public org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation addNewSpeedStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation target = null;
                target = (org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation)get_store().add_element_user(SPEEDSTATION$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "SpeedStation" element
         */
        public void removeSpeedStation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SPEEDSTATION$2, i);
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
                    { return CantImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CantImpl.this.getFeatureArray(i);
                    CantImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { CantImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CantImpl.this.getFeatureArray(i);
                    CantImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return CantImpl.this.sizeOfFeatureArray(); }
                
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
        
        /**
         * Gets the "equilibriumConstant" attribute
         */
        public double getEquilibriumConstant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EQUILIBRIUMCONSTANT$12);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "equilibriumConstant" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetEquilibriumConstant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EQUILIBRIUMCONSTANT$12);
                return target;
            }
        }
        
        /**
         * True if has "equilibriumConstant" attribute
         */
        public boolean isSetEquilibriumConstant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EQUILIBRIUMCONSTANT$12) != null;
            }
        }
        
        /**
         * Sets the "equilibriumConstant" attribute
         */
        public void setEquilibriumConstant(double equilibriumConstant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EQUILIBRIUMCONSTANT$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EQUILIBRIUMCONSTANT$12);
                }
                target.setDoubleValue(equilibriumConstant);
            }
        }
        
        /**
         * Sets (as xml) the "equilibriumConstant" attribute
         */
        public void xsetEquilibriumConstant(org.apache.xmlbeans.XmlDouble equilibriumConstant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EQUILIBRIUMCONSTANT$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EQUILIBRIUMCONSTANT$12);
                }
                target.set(equilibriumConstant);
            }
        }
        
        /**
         * Unsets the "equilibriumConstant" attribute
         */
        public void unsetEquilibriumConstant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EQUILIBRIUMCONSTANT$12);
            }
        }
        
        /**
         * Gets the "appliedCantConstant" attribute
         */
        public double getAppliedCantConstant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLIEDCANTCONSTANT$14);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "appliedCantConstant" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetAppliedCantConstant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(APPLIEDCANTCONSTANT$14);
                return target;
            }
        }
        
        /**
         * True if has "appliedCantConstant" attribute
         */
        public boolean isSetAppliedCantConstant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(APPLIEDCANTCONSTANT$14) != null;
            }
        }
        
        /**
         * Sets the "appliedCantConstant" attribute
         */
        public void setAppliedCantConstant(double appliedCantConstant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLIEDCANTCONSTANT$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLIEDCANTCONSTANT$14);
                }
                target.setDoubleValue(appliedCantConstant);
            }
        }
        
        /**
         * Sets (as xml) the "appliedCantConstant" attribute
         */
        public void xsetAppliedCantConstant(org.apache.xmlbeans.XmlDouble appliedCantConstant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(APPLIEDCANTCONSTANT$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(APPLIEDCANTCONSTANT$14);
                }
                target.set(appliedCantConstant);
            }
        }
        
        /**
         * Unsets the "appliedCantConstant" attribute
         */
        public void unsetAppliedCantConstant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(APPLIEDCANTCONSTANT$14);
            }
        }
        
        /**
         * Gets the "gauge" attribute
         */
        public double getGauge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GAUGE$16);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "gauge" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetGauge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(GAUGE$16);
                return target;
            }
        }
        
        /**
         * Sets the "gauge" attribute
         */
        public void setGauge(double gauge)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GAUGE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GAUGE$16);
                }
                target.setDoubleValue(gauge);
            }
        }
        
        /**
         * Sets (as xml) the "gauge" attribute
         */
        public void xsetGauge(org.apache.xmlbeans.XmlDouble gauge)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(GAUGE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(GAUGE$16);
                }
                target.set(gauge);
            }
        }
        
        /**
         * Gets the "rotationPoint" attribute
         */
        public java.lang.String getRotationPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROTATIONPOINT$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "rotationPoint" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRotationPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROTATIONPOINT$18);
                return target;
            }
        }
        
        /**
         * True if has "rotationPoint" attribute
         */
        public boolean isSetRotationPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ROTATIONPOINT$18) != null;
            }
        }
        
        /**
         * Sets the "rotationPoint" attribute
         */
        public void setRotationPoint(java.lang.String rotationPoint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROTATIONPOINT$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROTATIONPOINT$18);
                }
                target.setStringValue(rotationPoint);
            }
        }
        
        /**
         * Sets (as xml) the "rotationPoint" attribute
         */
        public void xsetRotationPoint(org.apache.xmlbeans.XmlString rotationPoint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROTATIONPOINT$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROTATIONPOINT$18);
                }
                target.set(rotationPoint);
            }
        }
        
        /**
         * Unsets the "rotationPoint" attribute
         */
        public void unsetRotationPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ROTATIONPOINT$18);
            }
        }
    }
}
