/*
 * An XML document type.
 * Localname: Roadside
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.RoadsideDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Roadside(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class RoadsideDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.RoadsideDocument
{
    
    public RoadsideDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROADSIDE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Roadside");
    
    
    /**
     * Gets the "Roadside" element
     */
    public org.landxml.schema.landXML11.RoadsideDocument.Roadside getRoadside()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RoadsideDocument.Roadside target = null;
            target = (org.landxml.schema.landXML11.RoadsideDocument.Roadside)get_store().find_element_user(ROADSIDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Roadside" element
     */
    public void setRoadside(org.landxml.schema.landXML11.RoadsideDocument.Roadside roadside)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RoadsideDocument.Roadside target = null;
            target = (org.landxml.schema.landXML11.RoadsideDocument.Roadside)get_store().find_element_user(ROADSIDE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.RoadsideDocument.Roadside)get_store().add_element_user(ROADSIDE$0);
            }
            target.set(roadside);
        }
    }
    
    /**
     * Appends and returns a new empty "Roadside" element
     */
    public org.landxml.schema.landXML11.RoadsideDocument.Roadside addNewRoadside()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RoadsideDocument.Roadside target = null;
            target = (org.landxml.schema.landXML11.RoadsideDocument.Roadside)get_store().add_element_user(ROADSIDE$0);
            return target;
        }
    }
    /**
     * An XML Roadside(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class RoadsideImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.RoadsideDocument.Roadside
    {
        
        public RoadsideImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OBSTRUCTIONOFFSET$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ObstructionOffset");
        private static final javax.xml.namespace.QName BIKEFACILITIES$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "BikeFacilities");
        private static final javax.xml.namespace.QName ROADSIGN$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "RoadSign");
        private static final javax.xml.namespace.QName DRIVEWAYDENSITY$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "DrivewayDensity");
        private static final javax.xml.namespace.QName HAZARDRATING$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "HazardRating");
        private static final javax.xml.namespace.QName DITCH$10 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Ditch");
        private static final javax.xml.namespace.QName FEATURE$12 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        
        
        /**
         * Gets a List of "ObstructionOffset" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset> getObstructionOffsetList()
        {
            final class ObstructionOffsetList extends java.util.AbstractList<org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset>
            {
                public org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset get(int i)
                    { return RoadsideImpl.this.getObstructionOffsetArray(i); }
                
                public org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset set(int i, org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset o)
                {
                    org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset old = RoadsideImpl.this.getObstructionOffsetArray(i);
                    RoadsideImpl.this.setObstructionOffsetArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset o)
                    { RoadsideImpl.this.insertNewObstructionOffset(i).set(o); }
                
                public org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset remove(int i)
                {
                    org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset old = RoadsideImpl.this.getObstructionOffsetArray(i);
                    RoadsideImpl.this.removeObstructionOffset(i);
                    return old;
                }
                
                public int size()
                    { return RoadsideImpl.this.sizeOfObstructionOffsetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ObstructionOffsetList();
            }
        }
        
        /**
         * Gets array of all "ObstructionOffset" elements
         */
        public org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset[] getObstructionOffsetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OBSTRUCTIONOFFSET$0, targetList);
                org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset[] result = new org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ObstructionOffset" element
         */
        public org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset getObstructionOffsetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset target = null;
                target = (org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset)get_store().find_element_user(OBSTRUCTIONOFFSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ObstructionOffset" element
         */
        public int sizeOfObstructionOffsetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OBSTRUCTIONOFFSET$0);
            }
        }
        
        /**
         * Sets array of all "ObstructionOffset" element
         */
        public void setObstructionOffsetArray(org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset[] obstructionOffsetArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(obstructionOffsetArray, OBSTRUCTIONOFFSET$0);
            }
        }
        
        /**
         * Sets ith "ObstructionOffset" element
         */
        public void setObstructionOffsetArray(int i, org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset obstructionOffset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset target = null;
                target = (org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset)get_store().find_element_user(OBSTRUCTIONOFFSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(obstructionOffset);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ObstructionOffset" element
         */
        public org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset insertNewObstructionOffset(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset target = null;
                target = (org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset)get_store().insert_element_user(OBSTRUCTIONOFFSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ObstructionOffset" element
         */
        public org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset addNewObstructionOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset target = null;
                target = (org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset)get_store().add_element_user(OBSTRUCTIONOFFSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ObstructionOffset" element
         */
        public void removeObstructionOffset(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OBSTRUCTIONOFFSET$0, i);
            }
        }
        
        /**
         * Gets a List of "BikeFacilities" elements
         */
        public java.util.List<org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities> getBikeFacilitiesList()
        {
            final class BikeFacilitiesList extends java.util.AbstractList<org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities>
            {
                public org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities get(int i)
                    { return RoadsideImpl.this.getBikeFacilitiesArray(i); }
                
                public org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities set(int i, org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities o)
                {
                    org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities old = RoadsideImpl.this.getBikeFacilitiesArray(i);
                    RoadsideImpl.this.setBikeFacilitiesArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities o)
                    { RoadsideImpl.this.insertNewBikeFacilities(i).set(o); }
                
                public org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities remove(int i)
                {
                    org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities old = RoadsideImpl.this.getBikeFacilitiesArray(i);
                    RoadsideImpl.this.removeBikeFacilities(i);
                    return old;
                }
                
                public int size()
                    { return RoadsideImpl.this.sizeOfBikeFacilitiesArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new BikeFacilitiesList();
            }
        }
        
        /**
         * Gets array of all "BikeFacilities" elements
         */
        public org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities[] getBikeFacilitiesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BIKEFACILITIES$2, targetList);
                org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities[] result = new org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "BikeFacilities" element
         */
        public org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities getBikeFacilitiesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities target = null;
                target = (org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities)get_store().find_element_user(BIKEFACILITIES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "BikeFacilities" element
         */
        public int sizeOfBikeFacilitiesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BIKEFACILITIES$2);
            }
        }
        
        /**
         * Sets array of all "BikeFacilities" element
         */
        public void setBikeFacilitiesArray(org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities[] bikeFacilitiesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bikeFacilitiesArray, BIKEFACILITIES$2);
            }
        }
        
        /**
         * Sets ith "BikeFacilities" element
         */
        public void setBikeFacilitiesArray(int i, org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities bikeFacilities)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities target = null;
                target = (org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities)get_store().find_element_user(BIKEFACILITIES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(bikeFacilities);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BikeFacilities" element
         */
        public org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities insertNewBikeFacilities(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities target = null;
                target = (org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities)get_store().insert_element_user(BIKEFACILITIES$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BikeFacilities" element
         */
        public org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities addNewBikeFacilities()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities target = null;
                target = (org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities)get_store().add_element_user(BIKEFACILITIES$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "BikeFacilities" element
         */
        public void removeBikeFacilities(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BIKEFACILITIES$2, i);
            }
        }
        
        /**
         * Gets a List of "RoadSign" elements
         */
        public java.util.List<org.landxml.schema.landXML11.RoadSignDocument.RoadSign> getRoadSignList()
        {
            final class RoadSignList extends java.util.AbstractList<org.landxml.schema.landXML11.RoadSignDocument.RoadSign>
            {
                public org.landxml.schema.landXML11.RoadSignDocument.RoadSign get(int i)
                    { return RoadsideImpl.this.getRoadSignArray(i); }
                
                public org.landxml.schema.landXML11.RoadSignDocument.RoadSign set(int i, org.landxml.schema.landXML11.RoadSignDocument.RoadSign o)
                {
                    org.landxml.schema.landXML11.RoadSignDocument.RoadSign old = RoadsideImpl.this.getRoadSignArray(i);
                    RoadsideImpl.this.setRoadSignArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.RoadSignDocument.RoadSign o)
                    { RoadsideImpl.this.insertNewRoadSign(i).set(o); }
                
                public org.landxml.schema.landXML11.RoadSignDocument.RoadSign remove(int i)
                {
                    org.landxml.schema.landXML11.RoadSignDocument.RoadSign old = RoadsideImpl.this.getRoadSignArray(i);
                    RoadsideImpl.this.removeRoadSign(i);
                    return old;
                }
                
                public int size()
                    { return RoadsideImpl.this.sizeOfRoadSignArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RoadSignList();
            }
        }
        
        /**
         * Gets array of all "RoadSign" elements
         */
        public org.landxml.schema.landXML11.RoadSignDocument.RoadSign[] getRoadSignArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ROADSIGN$4, targetList);
                org.landxml.schema.landXML11.RoadSignDocument.RoadSign[] result = new org.landxml.schema.landXML11.RoadSignDocument.RoadSign[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "RoadSign" element
         */
        public org.landxml.schema.landXML11.RoadSignDocument.RoadSign getRoadSignArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadSignDocument.RoadSign target = null;
                target = (org.landxml.schema.landXML11.RoadSignDocument.RoadSign)get_store().find_element_user(ROADSIGN$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "RoadSign" element
         */
        public int sizeOfRoadSignArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROADSIGN$4);
            }
        }
        
        /**
         * Sets array of all "RoadSign" element
         */
        public void setRoadSignArray(org.landxml.schema.landXML11.RoadSignDocument.RoadSign[] roadSignArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(roadSignArray, ROADSIGN$4);
            }
        }
        
        /**
         * Sets ith "RoadSign" element
         */
        public void setRoadSignArray(int i, org.landxml.schema.landXML11.RoadSignDocument.RoadSign roadSign)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadSignDocument.RoadSign target = null;
                target = (org.landxml.schema.landXML11.RoadSignDocument.RoadSign)get_store().find_element_user(ROADSIGN$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(roadSign);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RoadSign" element
         */
        public org.landxml.schema.landXML11.RoadSignDocument.RoadSign insertNewRoadSign(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadSignDocument.RoadSign target = null;
                target = (org.landxml.schema.landXML11.RoadSignDocument.RoadSign)get_store().insert_element_user(ROADSIGN$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RoadSign" element
         */
        public org.landxml.schema.landXML11.RoadSignDocument.RoadSign addNewRoadSign()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadSignDocument.RoadSign target = null;
                target = (org.landxml.schema.landXML11.RoadSignDocument.RoadSign)get_store().add_element_user(ROADSIGN$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "RoadSign" element
         */
        public void removeRoadSign(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROADSIGN$4, i);
            }
        }
        
        /**
         * Gets a List of "DrivewayDensity" elements
         */
        public java.util.List<org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity> getDrivewayDensityList()
        {
            final class DrivewayDensityList extends java.util.AbstractList<org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity>
            {
                public org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity get(int i)
                    { return RoadsideImpl.this.getDrivewayDensityArray(i); }
                
                public org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity set(int i, org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity o)
                {
                    org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity old = RoadsideImpl.this.getDrivewayDensityArray(i);
                    RoadsideImpl.this.setDrivewayDensityArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity o)
                    { RoadsideImpl.this.insertNewDrivewayDensity(i).set(o); }
                
                public org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity remove(int i)
                {
                    org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity old = RoadsideImpl.this.getDrivewayDensityArray(i);
                    RoadsideImpl.this.removeDrivewayDensity(i);
                    return old;
                }
                
                public int size()
                    { return RoadsideImpl.this.sizeOfDrivewayDensityArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DrivewayDensityList();
            }
        }
        
        /**
         * Gets array of all "DrivewayDensity" elements
         */
        public org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity[] getDrivewayDensityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DRIVEWAYDENSITY$6, targetList);
                org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity[] result = new org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "DrivewayDensity" element
         */
        public org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity getDrivewayDensityArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity target = null;
                target = (org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity)get_store().find_element_user(DRIVEWAYDENSITY$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "DrivewayDensity" element
         */
        public int sizeOfDrivewayDensityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DRIVEWAYDENSITY$6);
            }
        }
        
        /**
         * Sets array of all "DrivewayDensity" element
         */
        public void setDrivewayDensityArray(org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity[] drivewayDensityArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(drivewayDensityArray, DRIVEWAYDENSITY$6);
            }
        }
        
        /**
         * Sets ith "DrivewayDensity" element
         */
        public void setDrivewayDensityArray(int i, org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity drivewayDensity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity target = null;
                target = (org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity)get_store().find_element_user(DRIVEWAYDENSITY$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(drivewayDensity);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DrivewayDensity" element
         */
        public org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity insertNewDrivewayDensity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity target = null;
                target = (org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity)get_store().insert_element_user(DRIVEWAYDENSITY$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DrivewayDensity" element
         */
        public org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity addNewDrivewayDensity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity target = null;
                target = (org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity)get_store().add_element_user(DRIVEWAYDENSITY$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "DrivewayDensity" element
         */
        public void removeDrivewayDensity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DRIVEWAYDENSITY$6, i);
            }
        }
        
        /**
         * Gets a List of "HazardRating" elements
         */
        public java.util.List<org.landxml.schema.landXML11.HazardRatingDocument.HazardRating> getHazardRatingList()
        {
            final class HazardRatingList extends java.util.AbstractList<org.landxml.schema.landXML11.HazardRatingDocument.HazardRating>
            {
                public org.landxml.schema.landXML11.HazardRatingDocument.HazardRating get(int i)
                    { return RoadsideImpl.this.getHazardRatingArray(i); }
                
                public org.landxml.schema.landXML11.HazardRatingDocument.HazardRating set(int i, org.landxml.schema.landXML11.HazardRatingDocument.HazardRating o)
                {
                    org.landxml.schema.landXML11.HazardRatingDocument.HazardRating old = RoadsideImpl.this.getHazardRatingArray(i);
                    RoadsideImpl.this.setHazardRatingArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.HazardRatingDocument.HazardRating o)
                    { RoadsideImpl.this.insertNewHazardRating(i).set(o); }
                
                public org.landxml.schema.landXML11.HazardRatingDocument.HazardRating remove(int i)
                {
                    org.landxml.schema.landXML11.HazardRatingDocument.HazardRating old = RoadsideImpl.this.getHazardRatingArray(i);
                    RoadsideImpl.this.removeHazardRating(i);
                    return old;
                }
                
                public int size()
                    { return RoadsideImpl.this.sizeOfHazardRatingArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new HazardRatingList();
            }
        }
        
        /**
         * Gets array of all "HazardRating" elements
         */
        public org.landxml.schema.landXML11.HazardRatingDocument.HazardRating[] getHazardRatingArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(HAZARDRATING$8, targetList);
                org.landxml.schema.landXML11.HazardRatingDocument.HazardRating[] result = new org.landxml.schema.landXML11.HazardRatingDocument.HazardRating[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "HazardRating" element
         */
        public org.landxml.schema.landXML11.HazardRatingDocument.HazardRating getHazardRatingArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.HazardRatingDocument.HazardRating target = null;
                target = (org.landxml.schema.landXML11.HazardRatingDocument.HazardRating)get_store().find_element_user(HAZARDRATING$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "HazardRating" element
         */
        public int sizeOfHazardRatingArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HAZARDRATING$8);
            }
        }
        
        /**
         * Sets array of all "HazardRating" element
         */
        public void setHazardRatingArray(org.landxml.schema.landXML11.HazardRatingDocument.HazardRating[] hazardRatingArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(hazardRatingArray, HAZARDRATING$8);
            }
        }
        
        /**
         * Sets ith "HazardRating" element
         */
        public void setHazardRatingArray(int i, org.landxml.schema.landXML11.HazardRatingDocument.HazardRating hazardRating)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.HazardRatingDocument.HazardRating target = null;
                target = (org.landxml.schema.landXML11.HazardRatingDocument.HazardRating)get_store().find_element_user(HAZARDRATING$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(hazardRating);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "HazardRating" element
         */
        public org.landxml.schema.landXML11.HazardRatingDocument.HazardRating insertNewHazardRating(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.HazardRatingDocument.HazardRating target = null;
                target = (org.landxml.schema.landXML11.HazardRatingDocument.HazardRating)get_store().insert_element_user(HAZARDRATING$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "HazardRating" element
         */
        public org.landxml.schema.landXML11.HazardRatingDocument.HazardRating addNewHazardRating()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.HazardRatingDocument.HazardRating target = null;
                target = (org.landxml.schema.landXML11.HazardRatingDocument.HazardRating)get_store().add_element_user(HAZARDRATING$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "HazardRating" element
         */
        public void removeHazardRating(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HAZARDRATING$8, i);
            }
        }
        
        /**
         * Gets a List of "Ditch" elements
         */
        public java.util.List<org.landxml.schema.landXML11.DitchDocument.Ditch> getDitchList()
        {
            final class DitchList extends java.util.AbstractList<org.landxml.schema.landXML11.DitchDocument.Ditch>
            {
                public org.landxml.schema.landXML11.DitchDocument.Ditch get(int i)
                    { return RoadsideImpl.this.getDitchArray(i); }
                
                public org.landxml.schema.landXML11.DitchDocument.Ditch set(int i, org.landxml.schema.landXML11.DitchDocument.Ditch o)
                {
                    org.landxml.schema.landXML11.DitchDocument.Ditch old = RoadsideImpl.this.getDitchArray(i);
                    RoadsideImpl.this.setDitchArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.DitchDocument.Ditch o)
                    { RoadsideImpl.this.insertNewDitch(i).set(o); }
                
                public org.landxml.schema.landXML11.DitchDocument.Ditch remove(int i)
                {
                    org.landxml.schema.landXML11.DitchDocument.Ditch old = RoadsideImpl.this.getDitchArray(i);
                    RoadsideImpl.this.removeDitch(i);
                    return old;
                }
                
                public int size()
                    { return RoadsideImpl.this.sizeOfDitchArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DitchList();
            }
        }
        
        /**
         * Gets array of all "Ditch" elements
         */
        public org.landxml.schema.landXML11.DitchDocument.Ditch[] getDitchArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DITCH$10, targetList);
                org.landxml.schema.landXML11.DitchDocument.Ditch[] result = new org.landxml.schema.landXML11.DitchDocument.Ditch[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Ditch" element
         */
        public org.landxml.schema.landXML11.DitchDocument.Ditch getDitchArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DitchDocument.Ditch target = null;
                target = (org.landxml.schema.landXML11.DitchDocument.Ditch)get_store().find_element_user(DITCH$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Ditch" element
         */
        public int sizeOfDitchArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DITCH$10);
            }
        }
        
        /**
         * Sets array of all "Ditch" element
         */
        public void setDitchArray(org.landxml.schema.landXML11.DitchDocument.Ditch[] ditchArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(ditchArray, DITCH$10);
            }
        }
        
        /**
         * Sets ith "Ditch" element
         */
        public void setDitchArray(int i, org.landxml.schema.landXML11.DitchDocument.Ditch ditch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DitchDocument.Ditch target = null;
                target = (org.landxml.schema.landXML11.DitchDocument.Ditch)get_store().find_element_user(DITCH$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ditch);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Ditch" element
         */
        public org.landxml.schema.landXML11.DitchDocument.Ditch insertNewDitch(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DitchDocument.Ditch target = null;
                target = (org.landxml.schema.landXML11.DitchDocument.Ditch)get_store().insert_element_user(DITCH$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Ditch" element
         */
        public org.landxml.schema.landXML11.DitchDocument.Ditch addNewDitch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DitchDocument.Ditch target = null;
                target = (org.landxml.schema.landXML11.DitchDocument.Ditch)get_store().add_element_user(DITCH$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "Ditch" element
         */
        public void removeDitch(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DITCH$10, i);
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
                    { return RoadsideImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = RoadsideImpl.this.getFeatureArray(i);
                    RoadsideImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { RoadsideImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = RoadsideImpl.this.getFeatureArray(i);
                    RoadsideImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return RoadsideImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$12, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$12, i);
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
                return get_store().count_elements(FEATURE$12);
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
                arraySetterHelper(featureArray, FEATURE$12);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$12, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$12, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$12);
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
                get_store().remove_element(FEATURE$12, i);
            }
        }
    }
}
