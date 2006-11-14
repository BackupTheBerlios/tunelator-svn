/*
 * An XML document type.
 * Localname: Lanes
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.LanesDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Lanes(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class LanesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.LanesDocument
{
    
    public LanesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANES$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Lanes");
    
    
    /**
     * Gets the "Lanes" element
     */
    public org.landxml.schema.landXML11.LanesDocument.Lanes getLanes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.LanesDocument.Lanes target = null;
            target = (org.landxml.schema.landXML11.LanesDocument.Lanes)get_store().find_element_user(LANES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Lanes" element
     */
    public void setLanes(org.landxml.schema.landXML11.LanesDocument.Lanes lanes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.LanesDocument.Lanes target = null;
            target = (org.landxml.schema.landXML11.LanesDocument.Lanes)get_store().find_element_user(LANES$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.LanesDocument.Lanes)get_store().add_element_user(LANES$0);
            }
            target.set(lanes);
        }
    }
    
    /**
     * Appends and returns a new empty "Lanes" element
     */
    public org.landxml.schema.landXML11.LanesDocument.Lanes addNewLanes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.LanesDocument.Lanes target = null;
            target = (org.landxml.schema.landXML11.LanesDocument.Lanes)get_store().add_element_user(LANES$0);
            return target;
        }
    }
    /**
     * An XML Lanes(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class LanesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.LanesDocument.Lanes
    {
        
        public LanesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName THRULANE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ThruLane");
        private static final javax.xml.namespace.QName PASSINGLANE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PassingLane");
        private static final javax.xml.namespace.QName TURNLANE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "TurnLane");
        private static final javax.xml.namespace.QName TWOWAYLEFTTURNLANE$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "TwoWayLeftTurnLane");
        private static final javax.xml.namespace.QName CLIMBLANE$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ClimbLane");
        private static final javax.xml.namespace.QName OFFSETLANE$10 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "OffsetLane");
        private static final javax.xml.namespace.QName WIDENINGLANE$12 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "WideningLane");
        private static final javax.xml.namespace.QName FEATURE$14 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        
        
        /**
         * Gets a List of "ThruLane" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ThruLaneDocument.ThruLane> getThruLaneList()
        {
            final class ThruLaneList extends java.util.AbstractList<org.landxml.schema.landXML11.ThruLaneDocument.ThruLane>
            {
                public org.landxml.schema.landXML11.ThruLaneDocument.ThruLane get(int i)
                    { return LanesImpl.this.getThruLaneArray(i); }
                
                public org.landxml.schema.landXML11.ThruLaneDocument.ThruLane set(int i, org.landxml.schema.landXML11.ThruLaneDocument.ThruLane o)
                {
                    org.landxml.schema.landXML11.ThruLaneDocument.ThruLane old = LanesImpl.this.getThruLaneArray(i);
                    LanesImpl.this.setThruLaneArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ThruLaneDocument.ThruLane o)
                    { LanesImpl.this.insertNewThruLane(i).set(o); }
                
                public org.landxml.schema.landXML11.ThruLaneDocument.ThruLane remove(int i)
                {
                    org.landxml.schema.landXML11.ThruLaneDocument.ThruLane old = LanesImpl.this.getThruLaneArray(i);
                    LanesImpl.this.removeThruLane(i);
                    return old;
                }
                
                public int size()
                    { return LanesImpl.this.sizeOfThruLaneArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ThruLaneList();
            }
        }
        
        /**
         * Gets array of all "ThruLane" elements
         */
        public org.landxml.schema.landXML11.ThruLaneDocument.ThruLane[] getThruLaneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(THRULANE$0, targetList);
                org.landxml.schema.landXML11.ThruLaneDocument.ThruLane[] result = new org.landxml.schema.landXML11.ThruLaneDocument.ThruLane[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ThruLane" element
         */
        public org.landxml.schema.landXML11.ThruLaneDocument.ThruLane getThruLaneArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ThruLaneDocument.ThruLane target = null;
                target = (org.landxml.schema.landXML11.ThruLaneDocument.ThruLane)get_store().find_element_user(THRULANE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ThruLane" element
         */
        public int sizeOfThruLaneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(THRULANE$0);
            }
        }
        
        /**
         * Sets array of all "ThruLane" element
         */
        public void setThruLaneArray(org.landxml.schema.landXML11.ThruLaneDocument.ThruLane[] thruLaneArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(thruLaneArray, THRULANE$0);
            }
        }
        
        /**
         * Sets ith "ThruLane" element
         */
        public void setThruLaneArray(int i, org.landxml.schema.landXML11.ThruLaneDocument.ThruLane thruLane)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ThruLaneDocument.ThruLane target = null;
                target = (org.landxml.schema.landXML11.ThruLaneDocument.ThruLane)get_store().find_element_user(THRULANE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(thruLane);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ThruLane" element
         */
        public org.landxml.schema.landXML11.ThruLaneDocument.ThruLane insertNewThruLane(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ThruLaneDocument.ThruLane target = null;
                target = (org.landxml.schema.landXML11.ThruLaneDocument.ThruLane)get_store().insert_element_user(THRULANE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ThruLane" element
         */
        public org.landxml.schema.landXML11.ThruLaneDocument.ThruLane addNewThruLane()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ThruLaneDocument.ThruLane target = null;
                target = (org.landxml.schema.landXML11.ThruLaneDocument.ThruLane)get_store().add_element_user(THRULANE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ThruLane" element
         */
        public void removeThruLane(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(THRULANE$0, i);
            }
        }
        
        /**
         * Gets a List of "PassingLane" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PassingLaneDocument.PassingLane> getPassingLaneList()
        {
            final class PassingLaneList extends java.util.AbstractList<org.landxml.schema.landXML11.PassingLaneDocument.PassingLane>
            {
                public org.landxml.schema.landXML11.PassingLaneDocument.PassingLane get(int i)
                    { return LanesImpl.this.getPassingLaneArray(i); }
                
                public org.landxml.schema.landXML11.PassingLaneDocument.PassingLane set(int i, org.landxml.schema.landXML11.PassingLaneDocument.PassingLane o)
                {
                    org.landxml.schema.landXML11.PassingLaneDocument.PassingLane old = LanesImpl.this.getPassingLaneArray(i);
                    LanesImpl.this.setPassingLaneArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PassingLaneDocument.PassingLane o)
                    { LanesImpl.this.insertNewPassingLane(i).set(o); }
                
                public org.landxml.schema.landXML11.PassingLaneDocument.PassingLane remove(int i)
                {
                    org.landxml.schema.landXML11.PassingLaneDocument.PassingLane old = LanesImpl.this.getPassingLaneArray(i);
                    LanesImpl.this.removePassingLane(i);
                    return old;
                }
                
                public int size()
                    { return LanesImpl.this.sizeOfPassingLaneArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PassingLaneList();
            }
        }
        
        /**
         * Gets array of all "PassingLane" elements
         */
        public org.landxml.schema.landXML11.PassingLaneDocument.PassingLane[] getPassingLaneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PASSINGLANE$2, targetList);
                org.landxml.schema.landXML11.PassingLaneDocument.PassingLane[] result = new org.landxml.schema.landXML11.PassingLaneDocument.PassingLane[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PassingLane" element
         */
        public org.landxml.schema.landXML11.PassingLaneDocument.PassingLane getPassingLaneArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PassingLaneDocument.PassingLane target = null;
                target = (org.landxml.schema.landXML11.PassingLaneDocument.PassingLane)get_store().find_element_user(PASSINGLANE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PassingLane" element
         */
        public int sizeOfPassingLaneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PASSINGLANE$2);
            }
        }
        
        /**
         * Sets array of all "PassingLane" element
         */
        public void setPassingLaneArray(org.landxml.schema.landXML11.PassingLaneDocument.PassingLane[] passingLaneArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(passingLaneArray, PASSINGLANE$2);
            }
        }
        
        /**
         * Sets ith "PassingLane" element
         */
        public void setPassingLaneArray(int i, org.landxml.schema.landXML11.PassingLaneDocument.PassingLane passingLane)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PassingLaneDocument.PassingLane target = null;
                target = (org.landxml.schema.landXML11.PassingLaneDocument.PassingLane)get_store().find_element_user(PASSINGLANE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(passingLane);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PassingLane" element
         */
        public org.landxml.schema.landXML11.PassingLaneDocument.PassingLane insertNewPassingLane(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PassingLaneDocument.PassingLane target = null;
                target = (org.landxml.schema.landXML11.PassingLaneDocument.PassingLane)get_store().insert_element_user(PASSINGLANE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PassingLane" element
         */
        public org.landxml.schema.landXML11.PassingLaneDocument.PassingLane addNewPassingLane()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PassingLaneDocument.PassingLane target = null;
                target = (org.landxml.schema.landXML11.PassingLaneDocument.PassingLane)get_store().add_element_user(PASSINGLANE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "PassingLane" element
         */
        public void removePassingLane(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PASSINGLANE$2, i);
            }
        }
        
        /**
         * Gets a List of "TurnLane" elements
         */
        public java.util.List<org.landxml.schema.landXML11.TurnLaneDocument.TurnLane> getTurnLaneList()
        {
            final class TurnLaneList extends java.util.AbstractList<org.landxml.schema.landXML11.TurnLaneDocument.TurnLane>
            {
                public org.landxml.schema.landXML11.TurnLaneDocument.TurnLane get(int i)
                    { return LanesImpl.this.getTurnLaneArray(i); }
                
                public org.landxml.schema.landXML11.TurnLaneDocument.TurnLane set(int i, org.landxml.schema.landXML11.TurnLaneDocument.TurnLane o)
                {
                    org.landxml.schema.landXML11.TurnLaneDocument.TurnLane old = LanesImpl.this.getTurnLaneArray(i);
                    LanesImpl.this.setTurnLaneArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.TurnLaneDocument.TurnLane o)
                    { LanesImpl.this.insertNewTurnLane(i).set(o); }
                
                public org.landxml.schema.landXML11.TurnLaneDocument.TurnLane remove(int i)
                {
                    org.landxml.schema.landXML11.TurnLaneDocument.TurnLane old = LanesImpl.this.getTurnLaneArray(i);
                    LanesImpl.this.removeTurnLane(i);
                    return old;
                }
                
                public int size()
                    { return LanesImpl.this.sizeOfTurnLaneArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new TurnLaneList();
            }
        }
        
        /**
         * Gets array of all "TurnLane" elements
         */
        public org.landxml.schema.landXML11.TurnLaneDocument.TurnLane[] getTurnLaneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TURNLANE$4, targetList);
                org.landxml.schema.landXML11.TurnLaneDocument.TurnLane[] result = new org.landxml.schema.landXML11.TurnLaneDocument.TurnLane[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "TurnLane" element
         */
        public org.landxml.schema.landXML11.TurnLaneDocument.TurnLane getTurnLaneArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TurnLaneDocument.TurnLane target = null;
                target = (org.landxml.schema.landXML11.TurnLaneDocument.TurnLane)get_store().find_element_user(TURNLANE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "TurnLane" element
         */
        public int sizeOfTurnLaneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TURNLANE$4);
            }
        }
        
        /**
         * Sets array of all "TurnLane" element
         */
        public void setTurnLaneArray(org.landxml.schema.landXML11.TurnLaneDocument.TurnLane[] turnLaneArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(turnLaneArray, TURNLANE$4);
            }
        }
        
        /**
         * Sets ith "TurnLane" element
         */
        public void setTurnLaneArray(int i, org.landxml.schema.landXML11.TurnLaneDocument.TurnLane turnLane)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TurnLaneDocument.TurnLane target = null;
                target = (org.landxml.schema.landXML11.TurnLaneDocument.TurnLane)get_store().find_element_user(TURNLANE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(turnLane);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TurnLane" element
         */
        public org.landxml.schema.landXML11.TurnLaneDocument.TurnLane insertNewTurnLane(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TurnLaneDocument.TurnLane target = null;
                target = (org.landxml.schema.landXML11.TurnLaneDocument.TurnLane)get_store().insert_element_user(TURNLANE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TurnLane" element
         */
        public org.landxml.schema.landXML11.TurnLaneDocument.TurnLane addNewTurnLane()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TurnLaneDocument.TurnLane target = null;
                target = (org.landxml.schema.landXML11.TurnLaneDocument.TurnLane)get_store().add_element_user(TURNLANE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "TurnLane" element
         */
        public void removeTurnLane(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TURNLANE$4, i);
            }
        }
        
        /**
         * Gets a List of "TwoWayLeftTurnLane" elements
         */
        public java.util.List<org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane> getTwoWayLeftTurnLaneList()
        {
            final class TwoWayLeftTurnLaneList extends java.util.AbstractList<org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane>
            {
                public org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane get(int i)
                    { return LanesImpl.this.getTwoWayLeftTurnLaneArray(i); }
                
                public org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane set(int i, org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane o)
                {
                    org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane old = LanesImpl.this.getTwoWayLeftTurnLaneArray(i);
                    LanesImpl.this.setTwoWayLeftTurnLaneArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane o)
                    { LanesImpl.this.insertNewTwoWayLeftTurnLane(i).set(o); }
                
                public org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane remove(int i)
                {
                    org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane old = LanesImpl.this.getTwoWayLeftTurnLaneArray(i);
                    LanesImpl.this.removeTwoWayLeftTurnLane(i);
                    return old;
                }
                
                public int size()
                    { return LanesImpl.this.sizeOfTwoWayLeftTurnLaneArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new TwoWayLeftTurnLaneList();
            }
        }
        
        /**
         * Gets array of all "TwoWayLeftTurnLane" elements
         */
        public org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane[] getTwoWayLeftTurnLaneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TWOWAYLEFTTURNLANE$6, targetList);
                org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane[] result = new org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "TwoWayLeftTurnLane" element
         */
        public org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane getTwoWayLeftTurnLaneArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane target = null;
                target = (org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane)get_store().find_element_user(TWOWAYLEFTTURNLANE$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "TwoWayLeftTurnLane" element
         */
        public int sizeOfTwoWayLeftTurnLaneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TWOWAYLEFTTURNLANE$6);
            }
        }
        
        /**
         * Sets array of all "TwoWayLeftTurnLane" element
         */
        public void setTwoWayLeftTurnLaneArray(org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane[] twoWayLeftTurnLaneArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(twoWayLeftTurnLaneArray, TWOWAYLEFTTURNLANE$6);
            }
        }
        
        /**
         * Sets ith "TwoWayLeftTurnLane" element
         */
        public void setTwoWayLeftTurnLaneArray(int i, org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane twoWayLeftTurnLane)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane target = null;
                target = (org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane)get_store().find_element_user(TWOWAYLEFTTURNLANE$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(twoWayLeftTurnLane);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TwoWayLeftTurnLane" element
         */
        public org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane insertNewTwoWayLeftTurnLane(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane target = null;
                target = (org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane)get_store().insert_element_user(TWOWAYLEFTTURNLANE$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TwoWayLeftTurnLane" element
         */
        public org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane addNewTwoWayLeftTurnLane()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane target = null;
                target = (org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane)get_store().add_element_user(TWOWAYLEFTTURNLANE$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "TwoWayLeftTurnLane" element
         */
        public void removeTwoWayLeftTurnLane(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TWOWAYLEFTTURNLANE$6, i);
            }
        }
        
        /**
         * Gets a List of "ClimbLane" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane> getClimbLaneList()
        {
            final class ClimbLaneList extends java.util.AbstractList<org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane>
            {
                public org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane get(int i)
                    { return LanesImpl.this.getClimbLaneArray(i); }
                
                public org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane set(int i, org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane o)
                {
                    org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane old = LanesImpl.this.getClimbLaneArray(i);
                    LanesImpl.this.setClimbLaneArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane o)
                    { LanesImpl.this.insertNewClimbLane(i).set(o); }
                
                public org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane remove(int i)
                {
                    org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane old = LanesImpl.this.getClimbLaneArray(i);
                    LanesImpl.this.removeClimbLane(i);
                    return old;
                }
                
                public int size()
                    { return LanesImpl.this.sizeOfClimbLaneArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ClimbLaneList();
            }
        }
        
        /**
         * Gets array of all "ClimbLane" elements
         */
        public org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane[] getClimbLaneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CLIMBLANE$8, targetList);
                org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane[] result = new org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ClimbLane" element
         */
        public org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane getClimbLaneArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane target = null;
                target = (org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane)get_store().find_element_user(CLIMBLANE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ClimbLane" element
         */
        public int sizeOfClimbLaneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLIMBLANE$8);
            }
        }
        
        /**
         * Sets array of all "ClimbLane" element
         */
        public void setClimbLaneArray(org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane[] climbLaneArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(climbLaneArray, CLIMBLANE$8);
            }
        }
        
        /**
         * Sets ith "ClimbLane" element
         */
        public void setClimbLaneArray(int i, org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane climbLane)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane target = null;
                target = (org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane)get_store().find_element_user(CLIMBLANE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(climbLane);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ClimbLane" element
         */
        public org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane insertNewClimbLane(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane target = null;
                target = (org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane)get_store().insert_element_user(CLIMBLANE$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ClimbLane" element
         */
        public org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane addNewClimbLane()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane target = null;
                target = (org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane)get_store().add_element_user(CLIMBLANE$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "ClimbLane" element
         */
        public void removeClimbLane(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLIMBLANE$8, i);
            }
        }
        
        /**
         * Gets a List of "OffsetLane" elements
         */
        public java.util.List<org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane> getOffsetLaneList()
        {
            final class OffsetLaneList extends java.util.AbstractList<org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane>
            {
                public org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane get(int i)
                    { return LanesImpl.this.getOffsetLaneArray(i); }
                
                public org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane set(int i, org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane o)
                {
                    org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane old = LanesImpl.this.getOffsetLaneArray(i);
                    LanesImpl.this.setOffsetLaneArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane o)
                    { LanesImpl.this.insertNewOffsetLane(i).set(o); }
                
                public org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane remove(int i)
                {
                    org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane old = LanesImpl.this.getOffsetLaneArray(i);
                    LanesImpl.this.removeOffsetLane(i);
                    return old;
                }
                
                public int size()
                    { return LanesImpl.this.sizeOfOffsetLaneArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new OffsetLaneList();
            }
        }
        
        /**
         * Gets array of all "OffsetLane" elements
         */
        public org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane[] getOffsetLaneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OFFSETLANE$10, targetList);
                org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane[] result = new org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "OffsetLane" element
         */
        public org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane getOffsetLaneArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane target = null;
                target = (org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane)get_store().find_element_user(OFFSETLANE$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "OffsetLane" element
         */
        public int sizeOfOffsetLaneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OFFSETLANE$10);
            }
        }
        
        /**
         * Sets array of all "OffsetLane" element
         */
        public void setOffsetLaneArray(org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane[] offsetLaneArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(offsetLaneArray, OFFSETLANE$10);
            }
        }
        
        /**
         * Sets ith "OffsetLane" element
         */
        public void setOffsetLaneArray(int i, org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane offsetLane)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane target = null;
                target = (org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane)get_store().find_element_user(OFFSETLANE$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(offsetLane);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OffsetLane" element
         */
        public org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane insertNewOffsetLane(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane target = null;
                target = (org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane)get_store().insert_element_user(OFFSETLANE$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OffsetLane" element
         */
        public org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane addNewOffsetLane()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane target = null;
                target = (org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane)get_store().add_element_user(OFFSETLANE$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "OffsetLane" element
         */
        public void removeOffsetLane(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OFFSETLANE$10, i);
            }
        }
        
        /**
         * Gets a List of "WideningLane" elements
         */
        public java.util.List<org.landxml.schema.landXML11.WideningLaneDocument.WideningLane> getWideningLaneList()
        {
            final class WideningLaneList extends java.util.AbstractList<org.landxml.schema.landXML11.WideningLaneDocument.WideningLane>
            {
                public org.landxml.schema.landXML11.WideningLaneDocument.WideningLane get(int i)
                    { return LanesImpl.this.getWideningLaneArray(i); }
                
                public org.landxml.schema.landXML11.WideningLaneDocument.WideningLane set(int i, org.landxml.schema.landXML11.WideningLaneDocument.WideningLane o)
                {
                    org.landxml.schema.landXML11.WideningLaneDocument.WideningLane old = LanesImpl.this.getWideningLaneArray(i);
                    LanesImpl.this.setWideningLaneArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.WideningLaneDocument.WideningLane o)
                    { LanesImpl.this.insertNewWideningLane(i).set(o); }
                
                public org.landxml.schema.landXML11.WideningLaneDocument.WideningLane remove(int i)
                {
                    org.landxml.schema.landXML11.WideningLaneDocument.WideningLane old = LanesImpl.this.getWideningLaneArray(i);
                    LanesImpl.this.removeWideningLane(i);
                    return old;
                }
                
                public int size()
                    { return LanesImpl.this.sizeOfWideningLaneArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new WideningLaneList();
            }
        }
        
        /**
         * Gets array of all "WideningLane" elements
         */
        public org.landxml.schema.landXML11.WideningLaneDocument.WideningLane[] getWideningLaneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(WIDENINGLANE$12, targetList);
                org.landxml.schema.landXML11.WideningLaneDocument.WideningLane[] result = new org.landxml.schema.landXML11.WideningLaneDocument.WideningLane[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "WideningLane" element
         */
        public org.landxml.schema.landXML11.WideningLaneDocument.WideningLane getWideningLaneArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.WideningLaneDocument.WideningLane target = null;
                target = (org.landxml.schema.landXML11.WideningLaneDocument.WideningLane)get_store().find_element_user(WIDENINGLANE$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "WideningLane" element
         */
        public int sizeOfWideningLaneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WIDENINGLANE$12);
            }
        }
        
        /**
         * Sets array of all "WideningLane" element
         */
        public void setWideningLaneArray(org.landxml.schema.landXML11.WideningLaneDocument.WideningLane[] wideningLaneArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(wideningLaneArray, WIDENINGLANE$12);
            }
        }
        
        /**
         * Sets ith "WideningLane" element
         */
        public void setWideningLaneArray(int i, org.landxml.schema.landXML11.WideningLaneDocument.WideningLane wideningLane)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.WideningLaneDocument.WideningLane target = null;
                target = (org.landxml.schema.landXML11.WideningLaneDocument.WideningLane)get_store().find_element_user(WIDENINGLANE$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(wideningLane);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "WideningLane" element
         */
        public org.landxml.schema.landXML11.WideningLaneDocument.WideningLane insertNewWideningLane(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.WideningLaneDocument.WideningLane target = null;
                target = (org.landxml.schema.landXML11.WideningLaneDocument.WideningLane)get_store().insert_element_user(WIDENINGLANE$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "WideningLane" element
         */
        public org.landxml.schema.landXML11.WideningLaneDocument.WideningLane addNewWideningLane()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.WideningLaneDocument.WideningLane target = null;
                target = (org.landxml.schema.landXML11.WideningLaneDocument.WideningLane)get_store().add_element_user(WIDENINGLANE$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "WideningLane" element
         */
        public void removeWideningLane(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WIDENINGLANE$12, i);
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
                    { return LanesImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = LanesImpl.this.getFeatureArray(i);
                    LanesImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { LanesImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = LanesImpl.this.getFeatureArray(i);
                    LanesImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return LanesImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$14, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$14, i);
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
                return get_store().count_elements(FEATURE$14);
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
                arraySetterHelper(featureArray, FEATURE$14);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$14, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$14, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$14);
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
                get_store().remove_element(FEATURE$14, i);
            }
        }
    }
}
