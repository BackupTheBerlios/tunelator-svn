/*
 * An XML document type.
 * Localname: Intersection
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.IntersectionDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Intersection(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class IntersectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.IntersectionDocument
{
    
    public IntersectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERSECTION$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Intersection");
    
    
    /**
     * Gets the "Intersection" element
     */
    public org.landxml.schema.landXML11.IntersectionDocument.Intersection getIntersection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.IntersectionDocument.Intersection target = null;
            target = (org.landxml.schema.landXML11.IntersectionDocument.Intersection)get_store().find_element_user(INTERSECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Intersection" element
     */
    public void setIntersection(org.landxml.schema.landXML11.IntersectionDocument.Intersection intersection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.IntersectionDocument.Intersection target = null;
            target = (org.landxml.schema.landXML11.IntersectionDocument.Intersection)get_store().find_element_user(INTERSECTION$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.IntersectionDocument.Intersection)get_store().add_element_user(INTERSECTION$0);
            }
            target.set(intersection);
        }
    }
    
    /**
     * Appends and returns a new empty "Intersection" element
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
     * An XML Intersection(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class IntersectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.IntersectionDocument.Intersection
    {
        
        public IntersectionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TRAFFICCONTROL$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "TrafficControl");
        private static final javax.xml.namespace.QName TIMING$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Timing");
        private static final javax.xml.namespace.QName VOLUME$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Volume");
        private static final javax.xml.namespace.QName TURNSPEED$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "TurnSpeed");
        private static final javax.xml.namespace.QName TURNRESTRICTION$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "TurnRestriction");
        private static final javax.xml.namespace.QName CURB$10 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Curb");
        private static final javax.xml.namespace.QName CORNER$12 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Corner");
        private static final javax.xml.namespace.QName FEATURE$14 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName ROADWAYREF$16 = 
            new javax.xml.namespace.QName("", "roadwayRef");
        private static final javax.xml.namespace.QName ROADWAYPI$18 = 
            new javax.xml.namespace.QName("", "roadwayPI");
        private static final javax.xml.namespace.QName INTERSECTINGROADWAYREF$20 = 
            new javax.xml.namespace.QName("", "intersectingRoadwayRef");
        private static final javax.xml.namespace.QName INTERSECTROADWAYPI$22 = 
            new javax.xml.namespace.QName("", "intersectRoadwayPI");
        private static final javax.xml.namespace.QName CONTRUCTIONTYPE$24 = 
            new javax.xml.namespace.QName("", "contructionType");
        
        
        /**
         * Gets a List of "TrafficControl" elements
         */
        public java.util.List<org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl> getTrafficControlList()
        {
            final class TrafficControlList extends java.util.AbstractList<org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl>
            {
                public org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl get(int i)
                    { return IntersectionImpl.this.getTrafficControlArray(i); }
                
                public org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl set(int i, org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl o)
                {
                    org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl old = IntersectionImpl.this.getTrafficControlArray(i);
                    IntersectionImpl.this.setTrafficControlArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl o)
                    { IntersectionImpl.this.insertNewTrafficControl(i).set(o); }
                
                public org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl remove(int i)
                {
                    org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl old = IntersectionImpl.this.getTrafficControlArray(i);
                    IntersectionImpl.this.removeTrafficControl(i);
                    return old;
                }
                
                public int size()
                    { return IntersectionImpl.this.sizeOfTrafficControlArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new TrafficControlList();
            }
        }
        
        /**
         * Gets array of all "TrafficControl" elements
         */
        public org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl[] getTrafficControlArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TRAFFICCONTROL$0, targetList);
                org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl[] result = new org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "TrafficControl" element
         */
        public org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl getTrafficControlArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl target = null;
                target = (org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl)get_store().find_element_user(TRAFFICCONTROL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "TrafficControl" element
         */
        public int sizeOfTrafficControlArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRAFFICCONTROL$0);
            }
        }
        
        /**
         * Sets array of all "TrafficControl" element
         */
        public void setTrafficControlArray(org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl[] trafficControlArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(trafficControlArray, TRAFFICCONTROL$0);
            }
        }
        
        /**
         * Sets ith "TrafficControl" element
         */
        public void setTrafficControlArray(int i, org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl trafficControl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl target = null;
                target = (org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl)get_store().find_element_user(TRAFFICCONTROL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(trafficControl);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TrafficControl" element
         */
        public org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl insertNewTrafficControl(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl target = null;
                target = (org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl)get_store().insert_element_user(TRAFFICCONTROL$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TrafficControl" element
         */
        public org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl addNewTrafficControl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl target = null;
                target = (org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl)get_store().add_element_user(TRAFFICCONTROL$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "TrafficControl" element
         */
        public void removeTrafficControl(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRAFFICCONTROL$0, i);
            }
        }
        
        /**
         * Gets a List of "Timing" elements
         */
        public java.util.List<org.landxml.schema.landXML11.TimingDocument.Timing> getTimingList()
        {
            final class TimingList extends java.util.AbstractList<org.landxml.schema.landXML11.TimingDocument.Timing>
            {
                public org.landxml.schema.landXML11.TimingDocument.Timing get(int i)
                    { return IntersectionImpl.this.getTimingArray(i); }
                
                public org.landxml.schema.landXML11.TimingDocument.Timing set(int i, org.landxml.schema.landXML11.TimingDocument.Timing o)
                {
                    org.landxml.schema.landXML11.TimingDocument.Timing old = IntersectionImpl.this.getTimingArray(i);
                    IntersectionImpl.this.setTimingArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.TimingDocument.Timing o)
                    { IntersectionImpl.this.insertNewTiming(i).set(o); }
                
                public org.landxml.schema.landXML11.TimingDocument.Timing remove(int i)
                {
                    org.landxml.schema.landXML11.TimingDocument.Timing old = IntersectionImpl.this.getTimingArray(i);
                    IntersectionImpl.this.removeTiming(i);
                    return old;
                }
                
                public int size()
                    { return IntersectionImpl.this.sizeOfTimingArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new TimingList();
            }
        }
        
        /**
         * Gets array of all "Timing" elements
         */
        public org.landxml.schema.landXML11.TimingDocument.Timing[] getTimingArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TIMING$2, targetList);
                org.landxml.schema.landXML11.TimingDocument.Timing[] result = new org.landxml.schema.landXML11.TimingDocument.Timing[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Timing" element
         */
        public org.landxml.schema.landXML11.TimingDocument.Timing getTimingArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TimingDocument.Timing target = null;
                target = (org.landxml.schema.landXML11.TimingDocument.Timing)get_store().find_element_user(TIMING$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Timing" element
         */
        public int sizeOfTimingArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TIMING$2);
            }
        }
        
        /**
         * Sets array of all "Timing" element
         */
        public void setTimingArray(org.landxml.schema.landXML11.TimingDocument.Timing[] timingArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(timingArray, TIMING$2);
            }
        }
        
        /**
         * Sets ith "Timing" element
         */
        public void setTimingArray(int i, org.landxml.schema.landXML11.TimingDocument.Timing timing)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TimingDocument.Timing target = null;
                target = (org.landxml.schema.landXML11.TimingDocument.Timing)get_store().find_element_user(TIMING$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(timing);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Timing" element
         */
        public org.landxml.schema.landXML11.TimingDocument.Timing insertNewTiming(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TimingDocument.Timing target = null;
                target = (org.landxml.schema.landXML11.TimingDocument.Timing)get_store().insert_element_user(TIMING$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Timing" element
         */
        public org.landxml.schema.landXML11.TimingDocument.Timing addNewTiming()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TimingDocument.Timing target = null;
                target = (org.landxml.schema.landXML11.TimingDocument.Timing)get_store().add_element_user(TIMING$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Timing" element
         */
        public void removeTiming(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TIMING$2, i);
            }
        }
        
        /**
         * Gets a List of "Volume" elements
         */
        public java.util.List<org.landxml.schema.landXML11.VolumeDocument.Volume> getVolumeList()
        {
            final class VolumeList extends java.util.AbstractList<org.landxml.schema.landXML11.VolumeDocument.Volume>
            {
                public org.landxml.schema.landXML11.VolumeDocument.Volume get(int i)
                    { return IntersectionImpl.this.getVolumeArray(i); }
                
                public org.landxml.schema.landXML11.VolumeDocument.Volume set(int i, org.landxml.schema.landXML11.VolumeDocument.Volume o)
                {
                    org.landxml.schema.landXML11.VolumeDocument.Volume old = IntersectionImpl.this.getVolumeArray(i);
                    IntersectionImpl.this.setVolumeArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.VolumeDocument.Volume o)
                    { IntersectionImpl.this.insertNewVolume(i).set(o); }
                
                public org.landxml.schema.landXML11.VolumeDocument.Volume remove(int i)
                {
                    org.landxml.schema.landXML11.VolumeDocument.Volume old = IntersectionImpl.this.getVolumeArray(i);
                    IntersectionImpl.this.removeVolume(i);
                    return old;
                }
                
                public int size()
                    { return IntersectionImpl.this.sizeOfVolumeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new VolumeList();
            }
        }
        
        /**
         * Gets array of all "Volume" elements
         */
        public org.landxml.schema.landXML11.VolumeDocument.Volume[] getVolumeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VOLUME$4, targetList);
                org.landxml.schema.landXML11.VolumeDocument.Volume[] result = new org.landxml.schema.landXML11.VolumeDocument.Volume[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Volume" element
         */
        public org.landxml.schema.landXML11.VolumeDocument.Volume getVolumeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.VolumeDocument.Volume target = null;
                target = (org.landxml.schema.landXML11.VolumeDocument.Volume)get_store().find_element_user(VOLUME$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Volume" element
         */
        public int sizeOfVolumeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VOLUME$4);
            }
        }
        
        /**
         * Sets array of all "Volume" element
         */
        public void setVolumeArray(org.landxml.schema.landXML11.VolumeDocument.Volume[] volumeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(volumeArray, VOLUME$4);
            }
        }
        
        /**
         * Sets ith "Volume" element
         */
        public void setVolumeArray(int i, org.landxml.schema.landXML11.VolumeDocument.Volume volume)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.VolumeDocument.Volume target = null;
                target = (org.landxml.schema.landXML11.VolumeDocument.Volume)get_store().find_element_user(VOLUME$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(volume);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Volume" element
         */
        public org.landxml.schema.landXML11.VolumeDocument.Volume insertNewVolume(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.VolumeDocument.Volume target = null;
                target = (org.landxml.schema.landXML11.VolumeDocument.Volume)get_store().insert_element_user(VOLUME$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Volume" element
         */
        public org.landxml.schema.landXML11.VolumeDocument.Volume addNewVolume()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.VolumeDocument.Volume target = null;
                target = (org.landxml.schema.landXML11.VolumeDocument.Volume)get_store().add_element_user(VOLUME$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "Volume" element
         */
        public void removeVolume(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VOLUME$4, i);
            }
        }
        
        /**
         * Gets a List of "TurnSpeed" elements
         */
        public java.util.List<org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed> getTurnSpeedList()
        {
            final class TurnSpeedList extends java.util.AbstractList<org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed>
            {
                public org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed get(int i)
                    { return IntersectionImpl.this.getTurnSpeedArray(i); }
                
                public org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed set(int i, org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed o)
                {
                    org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed old = IntersectionImpl.this.getTurnSpeedArray(i);
                    IntersectionImpl.this.setTurnSpeedArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed o)
                    { IntersectionImpl.this.insertNewTurnSpeed(i).set(o); }
                
                public org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed remove(int i)
                {
                    org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed old = IntersectionImpl.this.getTurnSpeedArray(i);
                    IntersectionImpl.this.removeTurnSpeed(i);
                    return old;
                }
                
                public int size()
                    { return IntersectionImpl.this.sizeOfTurnSpeedArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new TurnSpeedList();
            }
        }
        
        /**
         * Gets array of all "TurnSpeed" elements
         */
        public org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed[] getTurnSpeedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TURNSPEED$6, targetList);
                org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed[] result = new org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "TurnSpeed" element
         */
        public org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed getTurnSpeedArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed target = null;
                target = (org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed)get_store().find_element_user(TURNSPEED$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "TurnSpeed" element
         */
        public int sizeOfTurnSpeedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TURNSPEED$6);
            }
        }
        
        /**
         * Sets array of all "TurnSpeed" element
         */
        public void setTurnSpeedArray(org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed[] turnSpeedArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(turnSpeedArray, TURNSPEED$6);
            }
        }
        
        /**
         * Sets ith "TurnSpeed" element
         */
        public void setTurnSpeedArray(int i, org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed turnSpeed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed target = null;
                target = (org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed)get_store().find_element_user(TURNSPEED$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(turnSpeed);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TurnSpeed" element
         */
        public org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed insertNewTurnSpeed(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed target = null;
                target = (org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed)get_store().insert_element_user(TURNSPEED$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TurnSpeed" element
         */
        public org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed addNewTurnSpeed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed target = null;
                target = (org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed)get_store().add_element_user(TURNSPEED$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "TurnSpeed" element
         */
        public void removeTurnSpeed(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TURNSPEED$6, i);
            }
        }
        
        /**
         * Gets a List of "TurnRestriction" elements
         */
        public java.util.List<org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction> getTurnRestrictionList()
        {
            final class TurnRestrictionList extends java.util.AbstractList<org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction>
            {
                public org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction get(int i)
                    { return IntersectionImpl.this.getTurnRestrictionArray(i); }
                
                public org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction set(int i, org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction o)
                {
                    org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction old = IntersectionImpl.this.getTurnRestrictionArray(i);
                    IntersectionImpl.this.setTurnRestrictionArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction o)
                    { IntersectionImpl.this.insertNewTurnRestriction(i).set(o); }
                
                public org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction remove(int i)
                {
                    org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction old = IntersectionImpl.this.getTurnRestrictionArray(i);
                    IntersectionImpl.this.removeTurnRestriction(i);
                    return old;
                }
                
                public int size()
                    { return IntersectionImpl.this.sizeOfTurnRestrictionArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new TurnRestrictionList();
            }
        }
        
        /**
         * Gets array of all "TurnRestriction" elements
         */
        public org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction[] getTurnRestrictionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TURNRESTRICTION$8, targetList);
                org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction[] result = new org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "TurnRestriction" element
         */
        public org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction getTurnRestrictionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction target = null;
                target = (org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction)get_store().find_element_user(TURNRESTRICTION$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "TurnRestriction" element
         */
        public int sizeOfTurnRestrictionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TURNRESTRICTION$8);
            }
        }
        
        /**
         * Sets array of all "TurnRestriction" element
         */
        public void setTurnRestrictionArray(org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction[] turnRestrictionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(turnRestrictionArray, TURNRESTRICTION$8);
            }
        }
        
        /**
         * Sets ith "TurnRestriction" element
         */
        public void setTurnRestrictionArray(int i, org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction turnRestriction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction target = null;
                target = (org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction)get_store().find_element_user(TURNRESTRICTION$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(turnRestriction);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TurnRestriction" element
         */
        public org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction insertNewTurnRestriction(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction target = null;
                target = (org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction)get_store().insert_element_user(TURNRESTRICTION$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TurnRestriction" element
         */
        public org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction addNewTurnRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction target = null;
                target = (org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction)get_store().add_element_user(TURNRESTRICTION$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "TurnRestriction" element
         */
        public void removeTurnRestriction(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TURNRESTRICTION$8, i);
            }
        }
        
        /**
         * Gets a List of "Curb" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CurbDocument.Curb> getCurbList()
        {
            final class CurbList extends java.util.AbstractList<org.landxml.schema.landXML11.CurbDocument.Curb>
            {
                public org.landxml.schema.landXML11.CurbDocument.Curb get(int i)
                    { return IntersectionImpl.this.getCurbArray(i); }
                
                public org.landxml.schema.landXML11.CurbDocument.Curb set(int i, org.landxml.schema.landXML11.CurbDocument.Curb o)
                {
                    org.landxml.schema.landXML11.CurbDocument.Curb old = IntersectionImpl.this.getCurbArray(i);
                    IntersectionImpl.this.setCurbArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CurbDocument.Curb o)
                    { IntersectionImpl.this.insertNewCurb(i).set(o); }
                
                public org.landxml.schema.landXML11.CurbDocument.Curb remove(int i)
                {
                    org.landxml.schema.landXML11.CurbDocument.Curb old = IntersectionImpl.this.getCurbArray(i);
                    IntersectionImpl.this.removeCurb(i);
                    return old;
                }
                
                public int size()
                    { return IntersectionImpl.this.sizeOfCurbArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CurbList();
            }
        }
        
        /**
         * Gets array of all "Curb" elements
         */
        public org.landxml.schema.landXML11.CurbDocument.Curb[] getCurbArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CURB$10, targetList);
                org.landxml.schema.landXML11.CurbDocument.Curb[] result = new org.landxml.schema.landXML11.CurbDocument.Curb[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Curb" element
         */
        public org.landxml.schema.landXML11.CurbDocument.Curb getCurbArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CurbDocument.Curb target = null;
                target = (org.landxml.schema.landXML11.CurbDocument.Curb)get_store().find_element_user(CURB$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Curb" element
         */
        public int sizeOfCurbArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CURB$10);
            }
        }
        
        /**
         * Sets array of all "Curb" element
         */
        public void setCurbArray(org.landxml.schema.landXML11.CurbDocument.Curb[] curbArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(curbArray, CURB$10);
            }
        }
        
        /**
         * Sets ith "Curb" element
         */
        public void setCurbArray(int i, org.landxml.schema.landXML11.CurbDocument.Curb curb)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CurbDocument.Curb target = null;
                target = (org.landxml.schema.landXML11.CurbDocument.Curb)get_store().find_element_user(CURB$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(curb);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Curb" element
         */
        public org.landxml.schema.landXML11.CurbDocument.Curb insertNewCurb(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CurbDocument.Curb target = null;
                target = (org.landxml.schema.landXML11.CurbDocument.Curb)get_store().insert_element_user(CURB$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Curb" element
         */
        public org.landxml.schema.landXML11.CurbDocument.Curb addNewCurb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CurbDocument.Curb target = null;
                target = (org.landxml.schema.landXML11.CurbDocument.Curb)get_store().add_element_user(CURB$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "Curb" element
         */
        public void removeCurb(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CURB$10, i);
            }
        }
        
        /**
         * Gets a List of "Corner" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CornerDocument.Corner> getCornerList()
        {
            final class CornerList extends java.util.AbstractList<org.landxml.schema.landXML11.CornerDocument.Corner>
            {
                public org.landxml.schema.landXML11.CornerDocument.Corner get(int i)
                    { return IntersectionImpl.this.getCornerArray(i); }
                
                public org.landxml.schema.landXML11.CornerDocument.Corner set(int i, org.landxml.schema.landXML11.CornerDocument.Corner o)
                {
                    org.landxml.schema.landXML11.CornerDocument.Corner old = IntersectionImpl.this.getCornerArray(i);
                    IntersectionImpl.this.setCornerArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CornerDocument.Corner o)
                    { IntersectionImpl.this.insertNewCorner(i).set(o); }
                
                public org.landxml.schema.landXML11.CornerDocument.Corner remove(int i)
                {
                    org.landxml.schema.landXML11.CornerDocument.Corner old = IntersectionImpl.this.getCornerArray(i);
                    IntersectionImpl.this.removeCorner(i);
                    return old;
                }
                
                public int size()
                    { return IntersectionImpl.this.sizeOfCornerArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CornerList();
            }
        }
        
        /**
         * Gets array of all "Corner" elements
         */
        public org.landxml.schema.landXML11.CornerDocument.Corner[] getCornerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CORNER$12, targetList);
                org.landxml.schema.landXML11.CornerDocument.Corner[] result = new org.landxml.schema.landXML11.CornerDocument.Corner[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Corner" element
         */
        public org.landxml.schema.landXML11.CornerDocument.Corner getCornerArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CornerDocument.Corner target = null;
                target = (org.landxml.schema.landXML11.CornerDocument.Corner)get_store().find_element_user(CORNER$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Corner" element
         */
        public int sizeOfCornerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CORNER$12);
            }
        }
        
        /**
         * Sets array of all "Corner" element
         */
        public void setCornerArray(org.landxml.schema.landXML11.CornerDocument.Corner[] cornerArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(cornerArray, CORNER$12);
            }
        }
        
        /**
         * Sets ith "Corner" element
         */
        public void setCornerArray(int i, org.landxml.schema.landXML11.CornerDocument.Corner corner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CornerDocument.Corner target = null;
                target = (org.landxml.schema.landXML11.CornerDocument.Corner)get_store().find_element_user(CORNER$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(corner);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Corner" element
         */
        public org.landxml.schema.landXML11.CornerDocument.Corner insertNewCorner(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CornerDocument.Corner target = null;
                target = (org.landxml.schema.landXML11.CornerDocument.Corner)get_store().insert_element_user(CORNER$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Corner" element
         */
        public org.landxml.schema.landXML11.CornerDocument.Corner addNewCorner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CornerDocument.Corner target = null;
                target = (org.landxml.schema.landXML11.CornerDocument.Corner)get_store().add_element_user(CORNER$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "Corner" element
         */
        public void removeCorner(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CORNER$12, i);
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
                    { return IntersectionImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = IntersectionImpl.this.getFeatureArray(i);
                    IntersectionImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { IntersectionImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = IntersectionImpl.this.getFeatureArray(i);
                    IntersectionImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return IntersectionImpl.this.sizeOfFeatureArray(); }
                
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
        
        /**
         * Gets the "roadwayRef" attribute
         */
        public java.lang.String getRoadwayRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROADWAYREF$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "roadwayRef" attribute
         */
        public org.landxml.schema.landXML11.RoadwayNameRef xgetRoadwayRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadwayNameRef target = null;
                target = (org.landxml.schema.landXML11.RoadwayNameRef)get_store().find_attribute_user(ROADWAYREF$16);
                return target;
            }
        }
        
        /**
         * True if has "roadwayRef" attribute
         */
        public boolean isSetRoadwayRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ROADWAYREF$16) != null;
            }
        }
        
        /**
         * Sets the "roadwayRef" attribute
         */
        public void setRoadwayRef(java.lang.String roadwayRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROADWAYREF$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROADWAYREF$16);
                }
                target.setStringValue(roadwayRef);
            }
        }
        
        /**
         * Sets (as xml) the "roadwayRef" attribute
         */
        public void xsetRoadwayRef(org.landxml.schema.landXML11.RoadwayNameRef roadwayRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadwayNameRef target = null;
                target = (org.landxml.schema.landXML11.RoadwayNameRef)get_store().find_attribute_user(ROADWAYREF$16);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.RoadwayNameRef)get_store().add_attribute_user(ROADWAYREF$16);
                }
                target.set(roadwayRef);
            }
        }
        
        /**
         * Unsets the "roadwayRef" attribute
         */
        public void unsetRoadwayRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ROADWAYREF$16);
            }
        }
        
        /**
         * Gets the "roadwayPI" attribute
         */
        public double getRoadwayPI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROADWAYPI$18);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "roadwayPI" attribute
         */
        public org.landxml.schema.landXML11.Station xgetRoadwayPI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(ROADWAYPI$18);
                return target;
            }
        }
        
        /**
         * True if has "roadwayPI" attribute
         */
        public boolean isSetRoadwayPI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ROADWAYPI$18) != null;
            }
        }
        
        /**
         * Sets the "roadwayPI" attribute
         */
        public void setRoadwayPI(double roadwayPI)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROADWAYPI$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROADWAYPI$18);
                }
                target.setDoubleValue(roadwayPI);
            }
        }
        
        /**
         * Sets (as xml) the "roadwayPI" attribute
         */
        public void xsetRoadwayPI(org.landxml.schema.landXML11.Station roadwayPI)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(ROADWAYPI$18);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(ROADWAYPI$18);
                }
                target.set(roadwayPI);
            }
        }
        
        /**
         * Unsets the "roadwayPI" attribute
         */
        public void unsetRoadwayPI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ROADWAYPI$18);
            }
        }
        
        /**
         * Gets the "intersectingRoadwayRef" attribute
         */
        public java.lang.String getIntersectingRoadwayRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERSECTINGROADWAYREF$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "intersectingRoadwayRef" attribute
         */
        public org.landxml.schema.landXML11.RoadwayNameRef xgetIntersectingRoadwayRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadwayNameRef target = null;
                target = (org.landxml.schema.landXML11.RoadwayNameRef)get_store().find_attribute_user(INTERSECTINGROADWAYREF$20);
                return target;
            }
        }
        
        /**
         * True if has "intersectingRoadwayRef" attribute
         */
        public boolean isSetIntersectingRoadwayRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INTERSECTINGROADWAYREF$20) != null;
            }
        }
        
        /**
         * Sets the "intersectingRoadwayRef" attribute
         */
        public void setIntersectingRoadwayRef(java.lang.String intersectingRoadwayRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERSECTINGROADWAYREF$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERSECTINGROADWAYREF$20);
                }
                target.setStringValue(intersectingRoadwayRef);
            }
        }
        
        /**
         * Sets (as xml) the "intersectingRoadwayRef" attribute
         */
        public void xsetIntersectingRoadwayRef(org.landxml.schema.landXML11.RoadwayNameRef intersectingRoadwayRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadwayNameRef target = null;
                target = (org.landxml.schema.landXML11.RoadwayNameRef)get_store().find_attribute_user(INTERSECTINGROADWAYREF$20);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.RoadwayNameRef)get_store().add_attribute_user(INTERSECTINGROADWAYREF$20);
                }
                target.set(intersectingRoadwayRef);
            }
        }
        
        /**
         * Unsets the "intersectingRoadwayRef" attribute
         */
        public void unsetIntersectingRoadwayRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INTERSECTINGROADWAYREF$20);
            }
        }
        
        /**
         * Gets the "intersectRoadwayPI" attribute
         */
        public double getIntersectRoadwayPI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERSECTROADWAYPI$22);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "intersectRoadwayPI" attribute
         */
        public org.landxml.schema.landXML11.Station xgetIntersectRoadwayPI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(INTERSECTROADWAYPI$22);
                return target;
            }
        }
        
        /**
         * True if has "intersectRoadwayPI" attribute
         */
        public boolean isSetIntersectRoadwayPI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INTERSECTROADWAYPI$22) != null;
            }
        }
        
        /**
         * Sets the "intersectRoadwayPI" attribute
         */
        public void setIntersectRoadwayPI(double intersectRoadwayPI)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERSECTROADWAYPI$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERSECTROADWAYPI$22);
                }
                target.setDoubleValue(intersectRoadwayPI);
            }
        }
        
        /**
         * Sets (as xml) the "intersectRoadwayPI" attribute
         */
        public void xsetIntersectRoadwayPI(org.landxml.schema.landXML11.Station intersectRoadwayPI)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(INTERSECTROADWAYPI$22);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(INTERSECTROADWAYPI$22);
                }
                target.set(intersectRoadwayPI);
            }
        }
        
        /**
         * Unsets the "intersectRoadwayPI" attribute
         */
        public void unsetIntersectRoadwayPI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INTERSECTROADWAYPI$22);
            }
        }
        
        /**
         * Gets the "contructionType" attribute
         */
        public org.landxml.schema.landXML11.IntersectionConstructionType.Enum getContructionType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTRUCTIONTYPE$24);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.IntersectionConstructionType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "contructionType" attribute
         */
        public org.landxml.schema.landXML11.IntersectionConstructionType xgetContructionType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.IntersectionConstructionType target = null;
                target = (org.landxml.schema.landXML11.IntersectionConstructionType)get_store().find_attribute_user(CONTRUCTIONTYPE$24);
                return target;
            }
        }
        
        /**
         * True if has "contructionType" attribute
         */
        public boolean isSetContructionType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CONTRUCTIONTYPE$24) != null;
            }
        }
        
        /**
         * Sets the "contructionType" attribute
         */
        public void setContructionType(org.landxml.schema.landXML11.IntersectionConstructionType.Enum contructionType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTRUCTIONTYPE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTRUCTIONTYPE$24);
                }
                target.setEnumValue(contructionType);
            }
        }
        
        /**
         * Sets (as xml) the "contructionType" attribute
         */
        public void xsetContructionType(org.landxml.schema.landXML11.IntersectionConstructionType contructionType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.IntersectionConstructionType target = null;
                target = (org.landxml.schema.landXML11.IntersectionConstructionType)get_store().find_attribute_user(CONTRUCTIONTYPE$24);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.IntersectionConstructionType)get_store().add_attribute_user(CONTRUCTIONTYPE$24);
                }
                target.set(contructionType);
            }
        }
        
        /**
         * Unsets the "contructionType" attribute
         */
        public void unsetContructionType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CONTRUCTIONTYPE$24);
            }
        }
    }
}
