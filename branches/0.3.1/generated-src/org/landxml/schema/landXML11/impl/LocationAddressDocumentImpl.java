/*
 * An XML document type.
 * Localname: LocationAddress
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.LocationAddressDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one LocationAddress(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class LocationAddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.LocationAddressDocument
{
    
    public LocationAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "LocationAddress");
    
    
    /**
     * Gets the "LocationAddress" element
     */
    public org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress getLocationAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress target = null;
            target = (org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress)get_store().find_element_user(LOCATIONADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LocationAddress" element
     */
    public void setLocationAddress(org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress locationAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress target = null;
            target = (org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress)get_store().find_element_user(LOCATIONADDRESS$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress)get_store().add_element_user(LOCATIONADDRESS$0);
            }
            target.set(locationAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationAddress" element
     */
    public org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress addNewLocationAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress target = null;
            target = (org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress)get_store().add_element_user(LOCATIONADDRESS$0);
            return target;
        }
    }
    /**
     * An XML LocationAddress(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class LocationAddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress
    {
        
        public LocationAddressImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COMPLEXNAME$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ComplexName");
        private static final javax.xml.namespace.QName ROADNAME$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "RoadName");
        private static final javax.xml.namespace.QName ADMINISTRATIVEAREA$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "AdministrativeArea");
        private static final javax.xml.namespace.QName ADDRESSPOINT$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "AddressPoint");
        private static final javax.xml.namespace.QName ADDRESSTYPE$8 = 
            new javax.xml.namespace.QName("", "addressType");
        private static final javax.xml.namespace.QName FLATTYPE$10 = 
            new javax.xml.namespace.QName("", "flatType");
        private static final javax.xml.namespace.QName FLATNUMBER$12 = 
            new javax.xml.namespace.QName("", "flatNumber");
        private static final javax.xml.namespace.QName FLOORLEVELTYPE$14 = 
            new javax.xml.namespace.QName("", "floorLevelType");
        private static final javax.xml.namespace.QName FLOORLEVELNUMBER$16 = 
            new javax.xml.namespace.QName("", "floorLevelNumber");
        private static final javax.xml.namespace.QName NUMBERFIRST$18 = 
            new javax.xml.namespace.QName("", "numberFirst");
        private static final javax.xml.namespace.QName NUMBERSUFFIXFIRST$20 = 
            new javax.xml.namespace.QName("", "numberSuffixFirst");
        private static final javax.xml.namespace.QName NUMBERLAST$22 = 
            new javax.xml.namespace.QName("", "numberLast");
        private static final javax.xml.namespace.QName NUMBERSUFFIXLAST$24 = 
            new javax.xml.namespace.QName("", "numberSuffixLast");
        
        
        /**
         * Gets a List of "ComplexName" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ComplexNameDocument.ComplexName> getComplexNameList()
        {
            final class ComplexNameList extends java.util.AbstractList<org.landxml.schema.landXML11.ComplexNameDocument.ComplexName>
            {
                public org.landxml.schema.landXML11.ComplexNameDocument.ComplexName get(int i)
                    { return LocationAddressImpl.this.getComplexNameArray(i); }
                
                public org.landxml.schema.landXML11.ComplexNameDocument.ComplexName set(int i, org.landxml.schema.landXML11.ComplexNameDocument.ComplexName o)
                {
                    org.landxml.schema.landXML11.ComplexNameDocument.ComplexName old = LocationAddressImpl.this.getComplexNameArray(i);
                    LocationAddressImpl.this.setComplexNameArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ComplexNameDocument.ComplexName o)
                    { LocationAddressImpl.this.insertNewComplexName(i).set(o); }
                
                public org.landxml.schema.landXML11.ComplexNameDocument.ComplexName remove(int i)
                {
                    org.landxml.schema.landXML11.ComplexNameDocument.ComplexName old = LocationAddressImpl.this.getComplexNameArray(i);
                    LocationAddressImpl.this.removeComplexName(i);
                    return old;
                }
                
                public int size()
                    { return LocationAddressImpl.this.sizeOfComplexNameArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ComplexNameList();
            }
        }
        
        /**
         * Gets array of all "ComplexName" elements
         */
        public org.landxml.schema.landXML11.ComplexNameDocument.ComplexName[] getComplexNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMPLEXNAME$0, targetList);
                org.landxml.schema.landXML11.ComplexNameDocument.ComplexName[] result = new org.landxml.schema.landXML11.ComplexNameDocument.ComplexName[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ComplexName" element
         */
        public org.landxml.schema.landXML11.ComplexNameDocument.ComplexName getComplexNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ComplexNameDocument.ComplexName target = null;
                target = (org.landxml.schema.landXML11.ComplexNameDocument.ComplexName)get_store().find_element_user(COMPLEXNAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ComplexName" element
         */
        public int sizeOfComplexNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMPLEXNAME$0);
            }
        }
        
        /**
         * Sets array of all "ComplexName" element
         */
        public void setComplexNameArray(org.landxml.schema.landXML11.ComplexNameDocument.ComplexName[] complexNameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(complexNameArray, COMPLEXNAME$0);
            }
        }
        
        /**
         * Sets ith "ComplexName" element
         */
        public void setComplexNameArray(int i, org.landxml.schema.landXML11.ComplexNameDocument.ComplexName complexName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ComplexNameDocument.ComplexName target = null;
                target = (org.landxml.schema.landXML11.ComplexNameDocument.ComplexName)get_store().find_element_user(COMPLEXNAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(complexName);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ComplexName" element
         */
        public org.landxml.schema.landXML11.ComplexNameDocument.ComplexName insertNewComplexName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ComplexNameDocument.ComplexName target = null;
                target = (org.landxml.schema.landXML11.ComplexNameDocument.ComplexName)get_store().insert_element_user(COMPLEXNAME$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ComplexName" element
         */
        public org.landxml.schema.landXML11.ComplexNameDocument.ComplexName addNewComplexName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ComplexNameDocument.ComplexName target = null;
                target = (org.landxml.schema.landXML11.ComplexNameDocument.ComplexName)get_store().add_element_user(COMPLEXNAME$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ComplexName" element
         */
        public void removeComplexName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMPLEXNAME$0, i);
            }
        }
        
        /**
         * Gets a List of "RoadName" elements
         */
        public java.util.List<org.landxml.schema.landXML11.RoadNameDocument.RoadName> getRoadNameList()
        {
            final class RoadNameList extends java.util.AbstractList<org.landxml.schema.landXML11.RoadNameDocument.RoadName>
            {
                public org.landxml.schema.landXML11.RoadNameDocument.RoadName get(int i)
                    { return LocationAddressImpl.this.getRoadNameArray(i); }
                
                public org.landxml.schema.landXML11.RoadNameDocument.RoadName set(int i, org.landxml.schema.landXML11.RoadNameDocument.RoadName o)
                {
                    org.landxml.schema.landXML11.RoadNameDocument.RoadName old = LocationAddressImpl.this.getRoadNameArray(i);
                    LocationAddressImpl.this.setRoadNameArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.RoadNameDocument.RoadName o)
                    { LocationAddressImpl.this.insertNewRoadName(i).set(o); }
                
                public org.landxml.schema.landXML11.RoadNameDocument.RoadName remove(int i)
                {
                    org.landxml.schema.landXML11.RoadNameDocument.RoadName old = LocationAddressImpl.this.getRoadNameArray(i);
                    LocationAddressImpl.this.removeRoadName(i);
                    return old;
                }
                
                public int size()
                    { return LocationAddressImpl.this.sizeOfRoadNameArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RoadNameList();
            }
        }
        
        /**
         * Gets array of all "RoadName" elements
         */
        public org.landxml.schema.landXML11.RoadNameDocument.RoadName[] getRoadNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ROADNAME$2, targetList);
                org.landxml.schema.landXML11.RoadNameDocument.RoadName[] result = new org.landxml.schema.landXML11.RoadNameDocument.RoadName[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "RoadName" element
         */
        public org.landxml.schema.landXML11.RoadNameDocument.RoadName getRoadNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadNameDocument.RoadName target = null;
                target = (org.landxml.schema.landXML11.RoadNameDocument.RoadName)get_store().find_element_user(ROADNAME$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "RoadName" element
         */
        public int sizeOfRoadNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROADNAME$2);
            }
        }
        
        /**
         * Sets array of all "RoadName" element
         */
        public void setRoadNameArray(org.landxml.schema.landXML11.RoadNameDocument.RoadName[] roadNameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(roadNameArray, ROADNAME$2);
            }
        }
        
        /**
         * Sets ith "RoadName" element
         */
        public void setRoadNameArray(int i, org.landxml.schema.landXML11.RoadNameDocument.RoadName roadName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadNameDocument.RoadName target = null;
                target = (org.landxml.schema.landXML11.RoadNameDocument.RoadName)get_store().find_element_user(ROADNAME$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(roadName);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RoadName" element
         */
        public org.landxml.schema.landXML11.RoadNameDocument.RoadName insertNewRoadName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadNameDocument.RoadName target = null;
                target = (org.landxml.schema.landXML11.RoadNameDocument.RoadName)get_store().insert_element_user(ROADNAME$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RoadName" element
         */
        public org.landxml.schema.landXML11.RoadNameDocument.RoadName addNewRoadName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadNameDocument.RoadName target = null;
                target = (org.landxml.schema.landXML11.RoadNameDocument.RoadName)get_store().add_element_user(ROADNAME$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "RoadName" element
         */
        public void removeRoadName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROADNAME$2, i);
            }
        }
        
        /**
         * Gets a List of "AdministrativeArea" elements
         */
        public java.util.List<org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea> getAdministrativeAreaList()
        {
            final class AdministrativeAreaList extends java.util.AbstractList<org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea>
            {
                public org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea get(int i)
                    { return LocationAddressImpl.this.getAdministrativeAreaArray(i); }
                
                public org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea set(int i, org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea o)
                {
                    org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea old = LocationAddressImpl.this.getAdministrativeAreaArray(i);
                    LocationAddressImpl.this.setAdministrativeAreaArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea o)
                    { LocationAddressImpl.this.insertNewAdministrativeArea(i).set(o); }
                
                public org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea remove(int i)
                {
                    org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea old = LocationAddressImpl.this.getAdministrativeAreaArray(i);
                    LocationAddressImpl.this.removeAdministrativeArea(i);
                    return old;
                }
                
                public int size()
                    { return LocationAddressImpl.this.sizeOfAdministrativeAreaArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new AdministrativeAreaList();
            }
        }
        
        /**
         * Gets array of all "AdministrativeArea" elements
         */
        public org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea[] getAdministrativeAreaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ADMINISTRATIVEAREA$4, targetList);
                org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea[] result = new org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AdministrativeArea" element
         */
        public org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea getAdministrativeAreaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea target = null;
                target = (org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea)get_store().find_element_user(ADMINISTRATIVEAREA$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AdministrativeArea" element
         */
        public int sizeOfAdministrativeAreaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADMINISTRATIVEAREA$4);
            }
        }
        
        /**
         * Sets array of all "AdministrativeArea" element
         */
        public void setAdministrativeAreaArray(org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea[] administrativeAreaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(administrativeAreaArray, ADMINISTRATIVEAREA$4);
            }
        }
        
        /**
         * Sets ith "AdministrativeArea" element
         */
        public void setAdministrativeAreaArray(int i, org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea administrativeArea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea target = null;
                target = (org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea)get_store().find_element_user(ADMINISTRATIVEAREA$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(administrativeArea);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AdministrativeArea" element
         */
        public org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea insertNewAdministrativeArea(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea target = null;
                target = (org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea)get_store().insert_element_user(ADMINISTRATIVEAREA$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AdministrativeArea" element
         */
        public org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea addNewAdministrativeArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea target = null;
                target = (org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea)get_store().add_element_user(ADMINISTRATIVEAREA$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "AdministrativeArea" element
         */
        public void removeAdministrativeArea(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADMINISTRATIVEAREA$4, i);
            }
        }
        
        /**
         * Gets a List of "AddressPoint" elements
         */
        public java.util.List<org.landxml.schema.landXML11.AddressPointDocument.AddressPoint> getAddressPointList()
        {
            final class AddressPointList extends java.util.AbstractList<org.landxml.schema.landXML11.AddressPointDocument.AddressPoint>
            {
                public org.landxml.schema.landXML11.AddressPointDocument.AddressPoint get(int i)
                    { return LocationAddressImpl.this.getAddressPointArray(i); }
                
                public org.landxml.schema.landXML11.AddressPointDocument.AddressPoint set(int i, org.landxml.schema.landXML11.AddressPointDocument.AddressPoint o)
                {
                    org.landxml.schema.landXML11.AddressPointDocument.AddressPoint old = LocationAddressImpl.this.getAddressPointArray(i);
                    LocationAddressImpl.this.setAddressPointArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.AddressPointDocument.AddressPoint o)
                    { LocationAddressImpl.this.insertNewAddressPoint(i).set(o); }
                
                public org.landxml.schema.landXML11.AddressPointDocument.AddressPoint remove(int i)
                {
                    org.landxml.schema.landXML11.AddressPointDocument.AddressPoint old = LocationAddressImpl.this.getAddressPointArray(i);
                    LocationAddressImpl.this.removeAddressPoint(i);
                    return old;
                }
                
                public int size()
                    { return LocationAddressImpl.this.sizeOfAddressPointArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new AddressPointList();
            }
        }
        
        /**
         * Gets array of all "AddressPoint" elements
         */
        public org.landxml.schema.landXML11.AddressPointDocument.AddressPoint[] getAddressPointArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ADDRESSPOINT$6, targetList);
                org.landxml.schema.landXML11.AddressPointDocument.AddressPoint[] result = new org.landxml.schema.landXML11.AddressPointDocument.AddressPoint[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AddressPoint" element
         */
        public org.landxml.schema.landXML11.AddressPointDocument.AddressPoint getAddressPointArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AddressPointDocument.AddressPoint target = null;
                target = (org.landxml.schema.landXML11.AddressPointDocument.AddressPoint)get_store().find_element_user(ADDRESSPOINT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AddressPoint" element
         */
        public int sizeOfAddressPointArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDRESSPOINT$6);
            }
        }
        
        /**
         * Sets array of all "AddressPoint" element
         */
        public void setAddressPointArray(org.landxml.schema.landXML11.AddressPointDocument.AddressPoint[] addressPointArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(addressPointArray, ADDRESSPOINT$6);
            }
        }
        
        /**
         * Sets ith "AddressPoint" element
         */
        public void setAddressPointArray(int i, org.landxml.schema.landXML11.AddressPointDocument.AddressPoint addressPoint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AddressPointDocument.AddressPoint target = null;
                target = (org.landxml.schema.landXML11.AddressPointDocument.AddressPoint)get_store().find_element_user(ADDRESSPOINT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(addressPoint);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AddressPoint" element
         */
        public org.landxml.schema.landXML11.AddressPointDocument.AddressPoint insertNewAddressPoint(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AddressPointDocument.AddressPoint target = null;
                target = (org.landxml.schema.landXML11.AddressPointDocument.AddressPoint)get_store().insert_element_user(ADDRESSPOINT$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AddressPoint" element
         */
        public org.landxml.schema.landXML11.AddressPointDocument.AddressPoint addNewAddressPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AddressPointDocument.AddressPoint target = null;
                target = (org.landxml.schema.landXML11.AddressPointDocument.AddressPoint)get_store().add_element_user(ADDRESSPOINT$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "AddressPoint" element
         */
        public void removeAddressPoint(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDRESSPOINT$6, i);
            }
        }
        
        /**
         * Gets the "addressType" attribute
         */
        public java.lang.String getAddressType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESSTYPE$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "addressType" attribute
         */
        public org.landxml.schema.landXML11.AddressTypeType xgetAddressType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AddressTypeType target = null;
                target = (org.landxml.schema.landXML11.AddressTypeType)get_store().find_attribute_user(ADDRESSTYPE$8);
                return target;
            }
        }
        
        /**
         * True if has "addressType" attribute
         */
        public boolean isSetAddressType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ADDRESSTYPE$8) != null;
            }
        }
        
        /**
         * Sets the "addressType" attribute
         */
        public void setAddressType(java.lang.String addressType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESSTYPE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDRESSTYPE$8);
                }
                target.setStringValue(addressType);
            }
        }
        
        /**
         * Sets (as xml) the "addressType" attribute
         */
        public void xsetAddressType(org.landxml.schema.landXML11.AddressTypeType addressType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AddressTypeType target = null;
                target = (org.landxml.schema.landXML11.AddressTypeType)get_store().find_attribute_user(ADDRESSTYPE$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.AddressTypeType)get_store().add_attribute_user(ADDRESSTYPE$8);
                }
                target.set(addressType);
            }
        }
        
        /**
         * Unsets the "addressType" attribute
         */
        public void unsetAddressType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ADDRESSTYPE$8);
            }
        }
        
        /**
         * Gets the "flatType" attribute
         */
        public java.lang.String getFlatType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLATTYPE$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "flatType" attribute
         */
        public org.landxml.schema.landXML11.FlatTypeType xgetFlatType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FlatTypeType target = null;
                target = (org.landxml.schema.landXML11.FlatTypeType)get_store().find_attribute_user(FLATTYPE$10);
                return target;
            }
        }
        
        /**
         * True if has "flatType" attribute
         */
        public boolean isSetFlatType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FLATTYPE$10) != null;
            }
        }
        
        /**
         * Sets the "flatType" attribute
         */
        public void setFlatType(java.lang.String flatType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLATTYPE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLATTYPE$10);
                }
                target.setStringValue(flatType);
            }
        }
        
        /**
         * Sets (as xml) the "flatType" attribute
         */
        public void xsetFlatType(org.landxml.schema.landXML11.FlatTypeType flatType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FlatTypeType target = null;
                target = (org.landxml.schema.landXML11.FlatTypeType)get_store().find_attribute_user(FLATTYPE$10);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.FlatTypeType)get_store().add_attribute_user(FLATTYPE$10);
                }
                target.set(flatType);
            }
        }
        
        /**
         * Unsets the "flatType" attribute
         */
        public void unsetFlatType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FLATTYPE$10);
            }
        }
        
        /**
         * Gets the "flatNumber" attribute
         */
        public java.lang.String getFlatNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLATNUMBER$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "flatNumber" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFlatNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FLATNUMBER$12);
                return target;
            }
        }
        
        /**
         * True if has "flatNumber" attribute
         */
        public boolean isSetFlatNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FLATNUMBER$12) != null;
            }
        }
        
        /**
         * Sets the "flatNumber" attribute
         */
        public void setFlatNumber(java.lang.String flatNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLATNUMBER$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLATNUMBER$12);
                }
                target.setStringValue(flatNumber);
            }
        }
        
        /**
         * Sets (as xml) the "flatNumber" attribute
         */
        public void xsetFlatNumber(org.apache.xmlbeans.XmlString flatNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FLATNUMBER$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FLATNUMBER$12);
                }
                target.set(flatNumber);
            }
        }
        
        /**
         * Unsets the "flatNumber" attribute
         */
        public void unsetFlatNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FLATNUMBER$12);
            }
        }
        
        /**
         * Gets the "floorLevelType" attribute
         */
        public java.lang.String getFloorLevelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLOORLEVELTYPE$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "floorLevelType" attribute
         */
        public org.landxml.schema.landXML11.FloorLevelTypeType xgetFloorLevelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FloorLevelTypeType target = null;
                target = (org.landxml.schema.landXML11.FloorLevelTypeType)get_store().find_attribute_user(FLOORLEVELTYPE$14);
                return target;
            }
        }
        
        /**
         * True if has "floorLevelType" attribute
         */
        public boolean isSetFloorLevelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FLOORLEVELTYPE$14) != null;
            }
        }
        
        /**
         * Sets the "floorLevelType" attribute
         */
        public void setFloorLevelType(java.lang.String floorLevelType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLOORLEVELTYPE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLOORLEVELTYPE$14);
                }
                target.setStringValue(floorLevelType);
            }
        }
        
        /**
         * Sets (as xml) the "floorLevelType" attribute
         */
        public void xsetFloorLevelType(org.landxml.schema.landXML11.FloorLevelTypeType floorLevelType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FloorLevelTypeType target = null;
                target = (org.landxml.schema.landXML11.FloorLevelTypeType)get_store().find_attribute_user(FLOORLEVELTYPE$14);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.FloorLevelTypeType)get_store().add_attribute_user(FLOORLEVELTYPE$14);
                }
                target.set(floorLevelType);
            }
        }
        
        /**
         * Unsets the "floorLevelType" attribute
         */
        public void unsetFloorLevelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FLOORLEVELTYPE$14);
            }
        }
        
        /**
         * Gets the "floorLevelNumber" attribute
         */
        public java.lang.String getFloorLevelNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLOORLEVELNUMBER$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "floorLevelNumber" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFloorLevelNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FLOORLEVELNUMBER$16);
                return target;
            }
        }
        
        /**
         * True if has "floorLevelNumber" attribute
         */
        public boolean isSetFloorLevelNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FLOORLEVELNUMBER$16) != null;
            }
        }
        
        /**
         * Sets the "floorLevelNumber" attribute
         */
        public void setFloorLevelNumber(java.lang.String floorLevelNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLOORLEVELNUMBER$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLOORLEVELNUMBER$16);
                }
                target.setStringValue(floorLevelNumber);
            }
        }
        
        /**
         * Sets (as xml) the "floorLevelNumber" attribute
         */
        public void xsetFloorLevelNumber(org.apache.xmlbeans.XmlString floorLevelNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FLOORLEVELNUMBER$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FLOORLEVELNUMBER$16);
                }
                target.set(floorLevelNumber);
            }
        }
        
        /**
         * Unsets the "floorLevelNumber" attribute
         */
        public void unsetFloorLevelNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FLOORLEVELNUMBER$16);
            }
        }
        
        /**
         * Gets the "numberFirst" attribute
         */
        public int getNumberFirst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBERFIRST$18);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "numberFirst" attribute
         */
        public org.apache.xmlbeans.XmlInt xgetNumberFirst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(NUMBERFIRST$18);
                return target;
            }
        }
        
        /**
         * True if has "numberFirst" attribute
         */
        public boolean isSetNumberFirst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NUMBERFIRST$18) != null;
            }
        }
        
        /**
         * Sets the "numberFirst" attribute
         */
        public void setNumberFirst(int numberFirst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBERFIRST$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMBERFIRST$18);
                }
                target.setIntValue(numberFirst);
            }
        }
        
        /**
         * Sets (as xml) the "numberFirst" attribute
         */
        public void xsetNumberFirst(org.apache.xmlbeans.XmlInt numberFirst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(NUMBERFIRST$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(NUMBERFIRST$18);
                }
                target.set(numberFirst);
            }
        }
        
        /**
         * Unsets the "numberFirst" attribute
         */
        public void unsetNumberFirst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NUMBERFIRST$18);
            }
        }
        
        /**
         * Gets the "numberSuffixFirst" attribute
         */
        public java.lang.String getNumberSuffixFirst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBERSUFFIXFIRST$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "numberSuffixFirst" attribute
         */
        public org.apache.xmlbeans.XmlString xgetNumberSuffixFirst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NUMBERSUFFIXFIRST$20);
                return target;
            }
        }
        
        /**
         * True if has "numberSuffixFirst" attribute
         */
        public boolean isSetNumberSuffixFirst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NUMBERSUFFIXFIRST$20) != null;
            }
        }
        
        /**
         * Sets the "numberSuffixFirst" attribute
         */
        public void setNumberSuffixFirst(java.lang.String numberSuffixFirst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBERSUFFIXFIRST$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMBERSUFFIXFIRST$20);
                }
                target.setStringValue(numberSuffixFirst);
            }
        }
        
        /**
         * Sets (as xml) the "numberSuffixFirst" attribute
         */
        public void xsetNumberSuffixFirst(org.apache.xmlbeans.XmlString numberSuffixFirst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NUMBERSUFFIXFIRST$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NUMBERSUFFIXFIRST$20);
                }
                target.set(numberSuffixFirst);
            }
        }
        
        /**
         * Unsets the "numberSuffixFirst" attribute
         */
        public void unsetNumberSuffixFirst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NUMBERSUFFIXFIRST$20);
            }
        }
        
        /**
         * Gets the "numberLast" attribute
         */
        public int getNumberLast()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBERLAST$22);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "numberLast" attribute
         */
        public org.apache.xmlbeans.XmlInt xgetNumberLast()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(NUMBERLAST$22);
                return target;
            }
        }
        
        /**
         * True if has "numberLast" attribute
         */
        public boolean isSetNumberLast()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NUMBERLAST$22) != null;
            }
        }
        
        /**
         * Sets the "numberLast" attribute
         */
        public void setNumberLast(int numberLast)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBERLAST$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMBERLAST$22);
                }
                target.setIntValue(numberLast);
            }
        }
        
        /**
         * Sets (as xml) the "numberLast" attribute
         */
        public void xsetNumberLast(org.apache.xmlbeans.XmlInt numberLast)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(NUMBERLAST$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(NUMBERLAST$22);
                }
                target.set(numberLast);
            }
        }
        
        /**
         * Unsets the "numberLast" attribute
         */
        public void unsetNumberLast()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NUMBERLAST$22);
            }
        }
        
        /**
         * Gets the "numberSuffixLast" attribute
         */
        public java.lang.String getNumberSuffixLast()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBERSUFFIXLAST$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "numberSuffixLast" attribute
         */
        public org.apache.xmlbeans.XmlString xgetNumberSuffixLast()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NUMBERSUFFIXLAST$24);
                return target;
            }
        }
        
        /**
         * True if has "numberSuffixLast" attribute
         */
        public boolean isSetNumberSuffixLast()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NUMBERSUFFIXLAST$24) != null;
            }
        }
        
        /**
         * Sets the "numberSuffixLast" attribute
         */
        public void setNumberSuffixLast(java.lang.String numberSuffixLast)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBERSUFFIXLAST$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMBERSUFFIXLAST$24);
                }
                target.setStringValue(numberSuffixLast);
            }
        }
        
        /**
         * Sets (as xml) the "numberSuffixLast" attribute
         */
        public void xsetNumberSuffixLast(org.apache.xmlbeans.XmlString numberSuffixLast)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NUMBERSUFFIXLAST$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NUMBERSUFFIXLAST$24);
                }
                target.set(numberSuffixLast);
            }
        }
        
        /**
         * Unsets the "numberSuffixLast" attribute
         */
        public void unsetNumberSuffixLast()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NUMBERSUFFIXLAST$24);
            }
        }
    }
}
