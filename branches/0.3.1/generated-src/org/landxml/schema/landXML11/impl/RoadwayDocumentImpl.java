/*
 * An XML document type.
 * Localname: Roadway
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.RoadwayDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Roadway(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class RoadwayDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.RoadwayDocument
{
    
    public RoadwayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROADWAY$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Roadway");
    
    
    /**
     * Gets the "Roadway" element
     */
    public org.landxml.schema.landXML11.RoadwayDocument.Roadway getRoadway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RoadwayDocument.Roadway target = null;
            target = (org.landxml.schema.landXML11.RoadwayDocument.Roadway)get_store().find_element_user(ROADWAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Roadway" element
     */
    public void setRoadway(org.landxml.schema.landXML11.RoadwayDocument.Roadway roadway)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RoadwayDocument.Roadway target = null;
            target = (org.landxml.schema.landXML11.RoadwayDocument.Roadway)get_store().find_element_user(ROADWAY$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.RoadwayDocument.Roadway)get_store().add_element_user(ROADWAY$0);
            }
            target.set(roadway);
        }
    }
    
    /**
     * Appends and returns a new empty "Roadway" element
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
     * An XML Roadway(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class RoadwayImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.RoadwayDocument.Roadway
    {
        
        public RoadwayImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLASSIFICATION$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Classification");
        private static final javax.xml.namespace.QName LANES$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Lanes");
        private static final javax.xml.namespace.QName ROADSIDE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Roadside");
        private static final javax.xml.namespace.QName SPEEDS$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Speeds");
        private static final javax.xml.namespace.QName NOPASSINGZONE$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "NoPassingZone");
        private static final javax.xml.namespace.QName TRAFFICVOLUME$10 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "TrafficVolume");
        private static final javax.xml.namespace.QName CRASHDATA$12 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CrashData");
        private static final javax.xml.namespace.QName DECISIONSIGHTDISTANCE$14 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "DecisionSightDistance");
        private static final javax.xml.namespace.QName BRIDGEELEMENT$16 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "BridgeElement");
        private static final javax.xml.namespace.QName PLANFEATURE$18 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PlanFeature");
        private static final javax.xml.namespace.QName FEATURE$20 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName NAME$22 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName ALIGNMENTREFS$24 = 
            new javax.xml.namespace.QName("", "alignmentRefs");
        private static final javax.xml.namespace.QName SURFACEREFS$26 = 
            new javax.xml.namespace.QName("", "surfaceRefs");
        private static final javax.xml.namespace.QName GRADEMODELREFS$28 = 
            new javax.xml.namespace.QName("", "gradeModelRefs");
        private static final javax.xml.namespace.QName STASTART$30 = 
            new javax.xml.namespace.QName("", "staStart");
        private static final javax.xml.namespace.QName STAEND$32 = 
            new javax.xml.namespace.QName("", "staEnd");
        private static final javax.xml.namespace.QName DESC$34 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName ROADTERRAIN$36 = 
            new javax.xml.namespace.QName("", "roadTerrain");
        private static final javax.xml.namespace.QName STATE$38 = 
            new javax.xml.namespace.QName("", "state");
        
        
        /**
         * Gets a List of "Classification" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ClassificationDocument.Classification> getClassificationList()
        {
            final class ClassificationList extends java.util.AbstractList<org.landxml.schema.landXML11.ClassificationDocument.Classification>
            {
                public org.landxml.schema.landXML11.ClassificationDocument.Classification get(int i)
                    { return RoadwayImpl.this.getClassificationArray(i); }
                
                public org.landxml.schema.landXML11.ClassificationDocument.Classification set(int i, org.landxml.schema.landXML11.ClassificationDocument.Classification o)
                {
                    org.landxml.schema.landXML11.ClassificationDocument.Classification old = RoadwayImpl.this.getClassificationArray(i);
                    RoadwayImpl.this.setClassificationArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ClassificationDocument.Classification o)
                    { RoadwayImpl.this.insertNewClassification(i).set(o); }
                
                public org.landxml.schema.landXML11.ClassificationDocument.Classification remove(int i)
                {
                    org.landxml.schema.landXML11.ClassificationDocument.Classification old = RoadwayImpl.this.getClassificationArray(i);
                    RoadwayImpl.this.removeClassification(i);
                    return old;
                }
                
                public int size()
                    { return RoadwayImpl.this.sizeOfClassificationArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ClassificationList();
            }
        }
        
        /**
         * Gets array of all "Classification" elements
         */
        public org.landxml.schema.landXML11.ClassificationDocument.Classification[] getClassificationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CLASSIFICATION$0, targetList);
                org.landxml.schema.landXML11.ClassificationDocument.Classification[] result = new org.landxml.schema.landXML11.ClassificationDocument.Classification[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Classification" element
         */
        public org.landxml.schema.landXML11.ClassificationDocument.Classification getClassificationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ClassificationDocument.Classification target = null;
                target = (org.landxml.schema.landXML11.ClassificationDocument.Classification)get_store().find_element_user(CLASSIFICATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Classification" element
         */
        public int sizeOfClassificationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLASSIFICATION$0);
            }
        }
        
        /**
         * Sets array of all "Classification" element
         */
        public void setClassificationArray(org.landxml.schema.landXML11.ClassificationDocument.Classification[] classificationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(classificationArray, CLASSIFICATION$0);
            }
        }
        
        /**
         * Sets ith "Classification" element
         */
        public void setClassificationArray(int i, org.landxml.schema.landXML11.ClassificationDocument.Classification classification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ClassificationDocument.Classification target = null;
                target = (org.landxml.schema.landXML11.ClassificationDocument.Classification)get_store().find_element_user(CLASSIFICATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(classification);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Classification" element
         */
        public org.landxml.schema.landXML11.ClassificationDocument.Classification insertNewClassification(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ClassificationDocument.Classification target = null;
                target = (org.landxml.schema.landXML11.ClassificationDocument.Classification)get_store().insert_element_user(CLASSIFICATION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Classification" element
         */
        public org.landxml.schema.landXML11.ClassificationDocument.Classification addNewClassification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ClassificationDocument.Classification target = null;
                target = (org.landxml.schema.landXML11.ClassificationDocument.Classification)get_store().add_element_user(CLASSIFICATION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Classification" element
         */
        public void removeClassification(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLASSIFICATION$0, i);
            }
        }
        
        /**
         * Gets a List of "Lanes" elements
         */
        public java.util.List<org.landxml.schema.landXML11.LanesDocument.Lanes> getLanesList()
        {
            final class LanesList extends java.util.AbstractList<org.landxml.schema.landXML11.LanesDocument.Lanes>
            {
                public org.landxml.schema.landXML11.LanesDocument.Lanes get(int i)
                    { return RoadwayImpl.this.getLanesArray(i); }
                
                public org.landxml.schema.landXML11.LanesDocument.Lanes set(int i, org.landxml.schema.landXML11.LanesDocument.Lanes o)
                {
                    org.landxml.schema.landXML11.LanesDocument.Lanes old = RoadwayImpl.this.getLanesArray(i);
                    RoadwayImpl.this.setLanesArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.LanesDocument.Lanes o)
                    { RoadwayImpl.this.insertNewLanes(i).set(o); }
                
                public org.landxml.schema.landXML11.LanesDocument.Lanes remove(int i)
                {
                    org.landxml.schema.landXML11.LanesDocument.Lanes old = RoadwayImpl.this.getLanesArray(i);
                    RoadwayImpl.this.removeLanes(i);
                    return old;
                }
                
                public int size()
                    { return RoadwayImpl.this.sizeOfLanesArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LanesList();
            }
        }
        
        /**
         * Gets array of all "Lanes" elements
         */
        public org.landxml.schema.landXML11.LanesDocument.Lanes[] getLanesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LANES$2, targetList);
                org.landxml.schema.landXML11.LanesDocument.Lanes[] result = new org.landxml.schema.landXML11.LanesDocument.Lanes[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Lanes" element
         */
        public org.landxml.schema.landXML11.LanesDocument.Lanes getLanesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LanesDocument.Lanes target = null;
                target = (org.landxml.schema.landXML11.LanesDocument.Lanes)get_store().find_element_user(LANES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Lanes" element
         */
        public int sizeOfLanesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LANES$2);
            }
        }
        
        /**
         * Sets array of all "Lanes" element
         */
        public void setLanesArray(org.landxml.schema.landXML11.LanesDocument.Lanes[] lanesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(lanesArray, LANES$2);
            }
        }
        
        /**
         * Sets ith "Lanes" element
         */
        public void setLanesArray(int i, org.landxml.schema.landXML11.LanesDocument.Lanes lanes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LanesDocument.Lanes target = null;
                target = (org.landxml.schema.landXML11.LanesDocument.Lanes)get_store().find_element_user(LANES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(lanes);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Lanes" element
         */
        public org.landxml.schema.landXML11.LanesDocument.Lanes insertNewLanes(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LanesDocument.Lanes target = null;
                target = (org.landxml.schema.landXML11.LanesDocument.Lanes)get_store().insert_element_user(LANES$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Lanes" element
         */
        public org.landxml.schema.landXML11.LanesDocument.Lanes addNewLanes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LanesDocument.Lanes target = null;
                target = (org.landxml.schema.landXML11.LanesDocument.Lanes)get_store().add_element_user(LANES$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Lanes" element
         */
        public void removeLanes(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LANES$2, i);
            }
        }
        
        /**
         * Gets a List of "Roadside" elements
         */
        public java.util.List<org.landxml.schema.landXML11.RoadsideDocument.Roadside> getRoadsideList()
        {
            final class RoadsideList extends java.util.AbstractList<org.landxml.schema.landXML11.RoadsideDocument.Roadside>
            {
                public org.landxml.schema.landXML11.RoadsideDocument.Roadside get(int i)
                    { return RoadwayImpl.this.getRoadsideArray(i); }
                
                public org.landxml.schema.landXML11.RoadsideDocument.Roadside set(int i, org.landxml.schema.landXML11.RoadsideDocument.Roadside o)
                {
                    org.landxml.schema.landXML11.RoadsideDocument.Roadside old = RoadwayImpl.this.getRoadsideArray(i);
                    RoadwayImpl.this.setRoadsideArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.RoadsideDocument.Roadside o)
                    { RoadwayImpl.this.insertNewRoadside(i).set(o); }
                
                public org.landxml.schema.landXML11.RoadsideDocument.Roadside remove(int i)
                {
                    org.landxml.schema.landXML11.RoadsideDocument.Roadside old = RoadwayImpl.this.getRoadsideArray(i);
                    RoadwayImpl.this.removeRoadside(i);
                    return old;
                }
                
                public int size()
                    { return RoadwayImpl.this.sizeOfRoadsideArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RoadsideList();
            }
        }
        
        /**
         * Gets array of all "Roadside" elements
         */
        public org.landxml.schema.landXML11.RoadsideDocument.Roadside[] getRoadsideArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ROADSIDE$4, targetList);
                org.landxml.schema.landXML11.RoadsideDocument.Roadside[] result = new org.landxml.schema.landXML11.RoadsideDocument.Roadside[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Roadside" element
         */
        public org.landxml.schema.landXML11.RoadsideDocument.Roadside getRoadsideArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadsideDocument.Roadside target = null;
                target = (org.landxml.schema.landXML11.RoadsideDocument.Roadside)get_store().find_element_user(ROADSIDE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Roadside" element
         */
        public int sizeOfRoadsideArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROADSIDE$4);
            }
        }
        
        /**
         * Sets array of all "Roadside" element
         */
        public void setRoadsideArray(org.landxml.schema.landXML11.RoadsideDocument.Roadside[] roadsideArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(roadsideArray, ROADSIDE$4);
            }
        }
        
        /**
         * Sets ith "Roadside" element
         */
        public void setRoadsideArray(int i, org.landxml.schema.landXML11.RoadsideDocument.Roadside roadside)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadsideDocument.Roadside target = null;
                target = (org.landxml.schema.landXML11.RoadsideDocument.Roadside)get_store().find_element_user(ROADSIDE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(roadside);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Roadside" element
         */
        public org.landxml.schema.landXML11.RoadsideDocument.Roadside insertNewRoadside(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadsideDocument.Roadside target = null;
                target = (org.landxml.schema.landXML11.RoadsideDocument.Roadside)get_store().insert_element_user(ROADSIDE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Roadside" element
         */
        public org.landxml.schema.landXML11.RoadsideDocument.Roadside addNewRoadside()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadsideDocument.Roadside target = null;
                target = (org.landxml.schema.landXML11.RoadsideDocument.Roadside)get_store().add_element_user(ROADSIDE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "Roadside" element
         */
        public void removeRoadside(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROADSIDE$4, i);
            }
        }
        
        /**
         * Gets a List of "Speeds" elements
         */
        public java.util.List<org.landxml.schema.landXML11.SpeedsDocument.Speeds> getSpeedsList()
        {
            final class SpeedsList extends java.util.AbstractList<org.landxml.schema.landXML11.SpeedsDocument.Speeds>
            {
                public org.landxml.schema.landXML11.SpeedsDocument.Speeds get(int i)
                    { return RoadwayImpl.this.getSpeedsArray(i); }
                
                public org.landxml.schema.landXML11.SpeedsDocument.Speeds set(int i, org.landxml.schema.landXML11.SpeedsDocument.Speeds o)
                {
                    org.landxml.schema.landXML11.SpeedsDocument.Speeds old = RoadwayImpl.this.getSpeedsArray(i);
                    RoadwayImpl.this.setSpeedsArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.SpeedsDocument.Speeds o)
                    { RoadwayImpl.this.insertNewSpeeds(i).set(o); }
                
                public org.landxml.schema.landXML11.SpeedsDocument.Speeds remove(int i)
                {
                    org.landxml.schema.landXML11.SpeedsDocument.Speeds old = RoadwayImpl.this.getSpeedsArray(i);
                    RoadwayImpl.this.removeSpeeds(i);
                    return old;
                }
                
                public int size()
                    { return RoadwayImpl.this.sizeOfSpeedsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SpeedsList();
            }
        }
        
        /**
         * Gets array of all "Speeds" elements
         */
        public org.landxml.schema.landXML11.SpeedsDocument.Speeds[] getSpeedsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SPEEDS$6, targetList);
                org.landxml.schema.landXML11.SpeedsDocument.Speeds[] result = new org.landxml.schema.landXML11.SpeedsDocument.Speeds[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Speeds" element
         */
        public org.landxml.schema.landXML11.SpeedsDocument.Speeds getSpeedsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SpeedsDocument.Speeds target = null;
                target = (org.landxml.schema.landXML11.SpeedsDocument.Speeds)get_store().find_element_user(SPEEDS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Speeds" element
         */
        public int sizeOfSpeedsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SPEEDS$6);
            }
        }
        
        /**
         * Sets array of all "Speeds" element
         */
        public void setSpeedsArray(org.landxml.schema.landXML11.SpeedsDocument.Speeds[] speedsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(speedsArray, SPEEDS$6);
            }
        }
        
        /**
         * Sets ith "Speeds" element
         */
        public void setSpeedsArray(int i, org.landxml.schema.landXML11.SpeedsDocument.Speeds speeds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SpeedsDocument.Speeds target = null;
                target = (org.landxml.schema.landXML11.SpeedsDocument.Speeds)get_store().find_element_user(SPEEDS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(speeds);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Speeds" element
         */
        public org.landxml.schema.landXML11.SpeedsDocument.Speeds insertNewSpeeds(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SpeedsDocument.Speeds target = null;
                target = (org.landxml.schema.landXML11.SpeedsDocument.Speeds)get_store().insert_element_user(SPEEDS$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Speeds" element
         */
        public org.landxml.schema.landXML11.SpeedsDocument.Speeds addNewSpeeds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SpeedsDocument.Speeds target = null;
                target = (org.landxml.schema.landXML11.SpeedsDocument.Speeds)get_store().add_element_user(SPEEDS$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "Speeds" element
         */
        public void removeSpeeds(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SPEEDS$6, i);
            }
        }
        
        /**
         * Gets a List of "NoPassingZone" elements
         */
        public java.util.List<org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone> getNoPassingZoneList()
        {
            final class NoPassingZoneList extends java.util.AbstractList<org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone>
            {
                public org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone get(int i)
                    { return RoadwayImpl.this.getNoPassingZoneArray(i); }
                
                public org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone set(int i, org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone o)
                {
                    org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone old = RoadwayImpl.this.getNoPassingZoneArray(i);
                    RoadwayImpl.this.setNoPassingZoneArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone o)
                    { RoadwayImpl.this.insertNewNoPassingZone(i).set(o); }
                
                public org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone remove(int i)
                {
                    org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone old = RoadwayImpl.this.getNoPassingZoneArray(i);
                    RoadwayImpl.this.removeNoPassingZone(i);
                    return old;
                }
                
                public int size()
                    { return RoadwayImpl.this.sizeOfNoPassingZoneArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new NoPassingZoneList();
            }
        }
        
        /**
         * Gets array of all "NoPassingZone" elements
         */
        public org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone[] getNoPassingZoneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NOPASSINGZONE$8, targetList);
                org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone[] result = new org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "NoPassingZone" element
         */
        public org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone getNoPassingZoneArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone target = null;
                target = (org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone)get_store().find_element_user(NOPASSINGZONE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "NoPassingZone" element
         */
        public int sizeOfNoPassingZoneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NOPASSINGZONE$8);
            }
        }
        
        /**
         * Sets array of all "NoPassingZone" element
         */
        public void setNoPassingZoneArray(org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone[] noPassingZoneArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(noPassingZoneArray, NOPASSINGZONE$8);
            }
        }
        
        /**
         * Sets ith "NoPassingZone" element
         */
        public void setNoPassingZoneArray(int i, org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone noPassingZone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone target = null;
                target = (org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone)get_store().find_element_user(NOPASSINGZONE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(noPassingZone);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "NoPassingZone" element
         */
        public org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone insertNewNoPassingZone(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone target = null;
                target = (org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone)get_store().insert_element_user(NOPASSINGZONE$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "NoPassingZone" element
         */
        public org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone addNewNoPassingZone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone target = null;
                target = (org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone)get_store().add_element_user(NOPASSINGZONE$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "NoPassingZone" element
         */
        public void removeNoPassingZone(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NOPASSINGZONE$8, i);
            }
        }
        
        /**
         * Gets a List of "TrafficVolume" elements
         */
        public java.util.List<org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume> getTrafficVolumeList()
        {
            final class TrafficVolumeList extends java.util.AbstractList<org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume>
            {
                public org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume get(int i)
                    { return RoadwayImpl.this.getTrafficVolumeArray(i); }
                
                public org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume set(int i, org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume o)
                {
                    org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume old = RoadwayImpl.this.getTrafficVolumeArray(i);
                    RoadwayImpl.this.setTrafficVolumeArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume o)
                    { RoadwayImpl.this.insertNewTrafficVolume(i).set(o); }
                
                public org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume remove(int i)
                {
                    org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume old = RoadwayImpl.this.getTrafficVolumeArray(i);
                    RoadwayImpl.this.removeTrafficVolume(i);
                    return old;
                }
                
                public int size()
                    { return RoadwayImpl.this.sizeOfTrafficVolumeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new TrafficVolumeList();
            }
        }
        
        /**
         * Gets array of all "TrafficVolume" elements
         */
        public org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume[] getTrafficVolumeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TRAFFICVOLUME$10, targetList);
                org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume[] result = new org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "TrafficVolume" element
         */
        public org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume getTrafficVolumeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume target = null;
                target = (org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume)get_store().find_element_user(TRAFFICVOLUME$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "TrafficVolume" element
         */
        public int sizeOfTrafficVolumeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRAFFICVOLUME$10);
            }
        }
        
        /**
         * Sets array of all "TrafficVolume" element
         */
        public void setTrafficVolumeArray(org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume[] trafficVolumeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(trafficVolumeArray, TRAFFICVOLUME$10);
            }
        }
        
        /**
         * Sets ith "TrafficVolume" element
         */
        public void setTrafficVolumeArray(int i, org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume trafficVolume)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume target = null;
                target = (org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume)get_store().find_element_user(TRAFFICVOLUME$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(trafficVolume);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TrafficVolume" element
         */
        public org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume insertNewTrafficVolume(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume target = null;
                target = (org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume)get_store().insert_element_user(TRAFFICVOLUME$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TrafficVolume" element
         */
        public org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume addNewTrafficVolume()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume target = null;
                target = (org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume)get_store().add_element_user(TRAFFICVOLUME$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "TrafficVolume" element
         */
        public void removeTrafficVolume(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRAFFICVOLUME$10, i);
            }
        }
        
        /**
         * Gets a List of "CrashData" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CrashDataDocument.CrashData> getCrashDataList()
        {
            final class CrashDataList extends java.util.AbstractList<org.landxml.schema.landXML11.CrashDataDocument.CrashData>
            {
                public org.landxml.schema.landXML11.CrashDataDocument.CrashData get(int i)
                    { return RoadwayImpl.this.getCrashDataArray(i); }
                
                public org.landxml.schema.landXML11.CrashDataDocument.CrashData set(int i, org.landxml.schema.landXML11.CrashDataDocument.CrashData o)
                {
                    org.landxml.schema.landXML11.CrashDataDocument.CrashData old = RoadwayImpl.this.getCrashDataArray(i);
                    RoadwayImpl.this.setCrashDataArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CrashDataDocument.CrashData o)
                    { RoadwayImpl.this.insertNewCrashData(i).set(o); }
                
                public org.landxml.schema.landXML11.CrashDataDocument.CrashData remove(int i)
                {
                    org.landxml.schema.landXML11.CrashDataDocument.CrashData old = RoadwayImpl.this.getCrashDataArray(i);
                    RoadwayImpl.this.removeCrashData(i);
                    return old;
                }
                
                public int size()
                    { return RoadwayImpl.this.sizeOfCrashDataArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CrashDataList();
            }
        }
        
        /**
         * Gets array of all "CrashData" elements
         */
        public org.landxml.schema.landXML11.CrashDataDocument.CrashData[] getCrashDataArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CRASHDATA$12, targetList);
                org.landxml.schema.landXML11.CrashDataDocument.CrashData[] result = new org.landxml.schema.landXML11.CrashDataDocument.CrashData[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CrashData" element
         */
        public org.landxml.schema.landXML11.CrashDataDocument.CrashData getCrashDataArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrashDataDocument.CrashData target = null;
                target = (org.landxml.schema.landXML11.CrashDataDocument.CrashData)get_store().find_element_user(CRASHDATA$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CrashData" element
         */
        public int sizeOfCrashDataArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CRASHDATA$12);
            }
        }
        
        /**
         * Sets array of all "CrashData" element
         */
        public void setCrashDataArray(org.landxml.schema.landXML11.CrashDataDocument.CrashData[] crashDataArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(crashDataArray, CRASHDATA$12);
            }
        }
        
        /**
         * Sets ith "CrashData" element
         */
        public void setCrashDataArray(int i, org.landxml.schema.landXML11.CrashDataDocument.CrashData crashData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrashDataDocument.CrashData target = null;
                target = (org.landxml.schema.landXML11.CrashDataDocument.CrashData)get_store().find_element_user(CRASHDATA$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(crashData);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CrashData" element
         */
        public org.landxml.schema.landXML11.CrashDataDocument.CrashData insertNewCrashData(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrashDataDocument.CrashData target = null;
                target = (org.landxml.schema.landXML11.CrashDataDocument.CrashData)get_store().insert_element_user(CRASHDATA$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CrashData" element
         */
        public org.landxml.schema.landXML11.CrashDataDocument.CrashData addNewCrashData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrashDataDocument.CrashData target = null;
                target = (org.landxml.schema.landXML11.CrashDataDocument.CrashData)get_store().add_element_user(CRASHDATA$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "CrashData" element
         */
        public void removeCrashData(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CRASHDATA$12, i);
            }
        }
        
        /**
         * Gets a List of "DecisionSightDistance" elements
         */
        public java.util.List<org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance> getDecisionSightDistanceList()
        {
            final class DecisionSightDistanceList extends java.util.AbstractList<org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance>
            {
                public org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance get(int i)
                    { return RoadwayImpl.this.getDecisionSightDistanceArray(i); }
                
                public org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance set(int i, org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance o)
                {
                    org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance old = RoadwayImpl.this.getDecisionSightDistanceArray(i);
                    RoadwayImpl.this.setDecisionSightDistanceArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance o)
                    { RoadwayImpl.this.insertNewDecisionSightDistance(i).set(o); }
                
                public org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance remove(int i)
                {
                    org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance old = RoadwayImpl.this.getDecisionSightDistanceArray(i);
                    RoadwayImpl.this.removeDecisionSightDistance(i);
                    return old;
                }
                
                public int size()
                    { return RoadwayImpl.this.sizeOfDecisionSightDistanceArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DecisionSightDistanceList();
            }
        }
        
        /**
         * Gets array of all "DecisionSightDistance" elements
         */
        public org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance[] getDecisionSightDistanceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DECISIONSIGHTDISTANCE$14, targetList);
                org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance[] result = new org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "DecisionSightDistance" element
         */
        public org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance getDecisionSightDistanceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance target = null;
                target = (org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance)get_store().find_element_user(DECISIONSIGHTDISTANCE$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "DecisionSightDistance" element
         */
        public int sizeOfDecisionSightDistanceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DECISIONSIGHTDISTANCE$14);
            }
        }
        
        /**
         * Sets array of all "DecisionSightDistance" element
         */
        public void setDecisionSightDistanceArray(org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance[] decisionSightDistanceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(decisionSightDistanceArray, DECISIONSIGHTDISTANCE$14);
            }
        }
        
        /**
         * Sets ith "DecisionSightDistance" element
         */
        public void setDecisionSightDistanceArray(int i, org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance decisionSightDistance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance target = null;
                target = (org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance)get_store().find_element_user(DECISIONSIGHTDISTANCE$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(decisionSightDistance);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DecisionSightDistance" element
         */
        public org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance insertNewDecisionSightDistance(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance target = null;
                target = (org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance)get_store().insert_element_user(DECISIONSIGHTDISTANCE$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DecisionSightDistance" element
         */
        public org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance addNewDecisionSightDistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance target = null;
                target = (org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance)get_store().add_element_user(DECISIONSIGHTDISTANCE$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "DecisionSightDistance" element
         */
        public void removeDecisionSightDistance(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DECISIONSIGHTDISTANCE$14, i);
            }
        }
        
        /**
         * Gets a List of "BridgeElement" elements
         */
        public java.util.List<org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement> getBridgeElementList()
        {
            final class BridgeElementList extends java.util.AbstractList<org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement>
            {
                public org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement get(int i)
                    { return RoadwayImpl.this.getBridgeElementArray(i); }
                
                public org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement set(int i, org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement o)
                {
                    org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement old = RoadwayImpl.this.getBridgeElementArray(i);
                    RoadwayImpl.this.setBridgeElementArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement o)
                    { RoadwayImpl.this.insertNewBridgeElement(i).set(o); }
                
                public org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement remove(int i)
                {
                    org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement old = RoadwayImpl.this.getBridgeElementArray(i);
                    RoadwayImpl.this.removeBridgeElement(i);
                    return old;
                }
                
                public int size()
                    { return RoadwayImpl.this.sizeOfBridgeElementArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new BridgeElementList();
            }
        }
        
        /**
         * Gets array of all "BridgeElement" elements
         */
        public org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement[] getBridgeElementArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BRIDGEELEMENT$16, targetList);
                org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement[] result = new org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "BridgeElement" element
         */
        public org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement getBridgeElementArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement target = null;
                target = (org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement)get_store().find_element_user(BRIDGEELEMENT$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "BridgeElement" element
         */
        public int sizeOfBridgeElementArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BRIDGEELEMENT$16);
            }
        }
        
        /**
         * Sets array of all "BridgeElement" element
         */
        public void setBridgeElementArray(org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement[] bridgeElementArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bridgeElementArray, BRIDGEELEMENT$16);
            }
        }
        
        /**
         * Sets ith "BridgeElement" element
         */
        public void setBridgeElementArray(int i, org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement bridgeElement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement target = null;
                target = (org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement)get_store().find_element_user(BRIDGEELEMENT$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(bridgeElement);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BridgeElement" element
         */
        public org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement insertNewBridgeElement(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement target = null;
                target = (org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement)get_store().insert_element_user(BRIDGEELEMENT$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BridgeElement" element
         */
        public org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement addNewBridgeElement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement target = null;
                target = (org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement)get_store().add_element_user(BRIDGEELEMENT$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "BridgeElement" element
         */
        public void removeBridgeElement(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BRIDGEELEMENT$16, i);
            }
        }
        
        /**
         * Gets a List of "PlanFeature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature> getPlanFeatureList()
        {
            final class PlanFeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature>
            {
                public org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature get(int i)
                    { return RoadwayImpl.this.getPlanFeatureArray(i); }
                
                public org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature set(int i, org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature o)
                {
                    org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature old = RoadwayImpl.this.getPlanFeatureArray(i);
                    RoadwayImpl.this.setPlanFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature o)
                    { RoadwayImpl.this.insertNewPlanFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature remove(int i)
                {
                    org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature old = RoadwayImpl.this.getPlanFeatureArray(i);
                    RoadwayImpl.this.removePlanFeature(i);
                    return old;
                }
                
                public int size()
                    { return RoadwayImpl.this.sizeOfPlanFeatureArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PlanFeatureList();
            }
        }
        
        /**
         * Gets array of all "PlanFeature" elements
         */
        public org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature[] getPlanFeatureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PLANFEATURE$18, targetList);
                org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature[] result = new org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PlanFeature" element
         */
        public org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature getPlanFeatureArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature target = null;
                target = (org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature)get_store().find_element_user(PLANFEATURE$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PlanFeature" element
         */
        public int sizeOfPlanFeatureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PLANFEATURE$18);
            }
        }
        
        /**
         * Sets array of all "PlanFeature" element
         */
        public void setPlanFeatureArray(org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature[] planFeatureArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(planFeatureArray, PLANFEATURE$18);
            }
        }
        
        /**
         * Sets ith "PlanFeature" element
         */
        public void setPlanFeatureArray(int i, org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature planFeature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature target = null;
                target = (org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature)get_store().find_element_user(PLANFEATURE$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(planFeature);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PlanFeature" element
         */
        public org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature insertNewPlanFeature(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature target = null;
                target = (org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature)get_store().insert_element_user(PLANFEATURE$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PlanFeature" element
         */
        public org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature addNewPlanFeature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature target = null;
                target = (org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature)get_store().add_element_user(PLANFEATURE$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "PlanFeature" element
         */
        public void removePlanFeature(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PLANFEATURE$18, i);
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
                    { return RoadwayImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = RoadwayImpl.this.getFeatureArray(i);
                    RoadwayImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { RoadwayImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = RoadwayImpl.this.getFeatureArray(i);
                    RoadwayImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return RoadwayImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$20, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$20, i);
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
                return get_store().count_elements(FEATURE$20);
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
                arraySetterHelper(featureArray, FEATURE$20);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$20, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$20, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$20);
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
                get_store().remove_element(FEATURE$20, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$22);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$22);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$22);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$22);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "alignmentRefs" attribute
         */
        public java.util.List getAlignmentRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNMENTREFS$24);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "alignmentRefs" attribute
         */
        public org.landxml.schema.landXML11.AlignmentNameRefs xgetAlignmentRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignmentNameRefs target = null;
                target = (org.landxml.schema.landXML11.AlignmentNameRefs)get_store().find_attribute_user(ALIGNMENTREFS$24);
                return target;
            }
        }
        
        /**
         * Sets the "alignmentRefs" attribute
         */
        public void setAlignmentRefs(java.util.List alignmentRefs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNMENTREFS$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALIGNMENTREFS$24);
                }
                target.setListValue(alignmentRefs);
            }
        }
        
        /**
         * Sets (as xml) the "alignmentRefs" attribute
         */
        public void xsetAlignmentRefs(org.landxml.schema.landXML11.AlignmentNameRefs alignmentRefs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignmentNameRefs target = null;
                target = (org.landxml.schema.landXML11.AlignmentNameRefs)get_store().find_attribute_user(ALIGNMENTREFS$24);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.AlignmentNameRefs)get_store().add_attribute_user(ALIGNMENTREFS$24);
                }
                target.set(alignmentRefs);
            }
        }
        
        /**
         * Gets the "surfaceRefs" attribute
         */
        public java.util.List getSurfaceRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURFACEREFS$26);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "surfaceRefs" attribute
         */
        public org.landxml.schema.landXML11.SurfaceNameRefs xgetSurfaceRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfaceNameRefs target = null;
                target = (org.landxml.schema.landXML11.SurfaceNameRefs)get_store().find_attribute_user(SURFACEREFS$26);
                return target;
            }
        }
        
        /**
         * True if has "surfaceRefs" attribute
         */
        public boolean isSetSurfaceRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SURFACEREFS$26) != null;
            }
        }
        
        /**
         * Sets the "surfaceRefs" attribute
         */
        public void setSurfaceRefs(java.util.List surfaceRefs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURFACEREFS$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SURFACEREFS$26);
                }
                target.setListValue(surfaceRefs);
            }
        }
        
        /**
         * Sets (as xml) the "surfaceRefs" attribute
         */
        public void xsetSurfaceRefs(org.landxml.schema.landXML11.SurfaceNameRefs surfaceRefs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfaceNameRefs target = null;
                target = (org.landxml.schema.landXML11.SurfaceNameRefs)get_store().find_attribute_user(SURFACEREFS$26);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SurfaceNameRefs)get_store().add_attribute_user(SURFACEREFS$26);
                }
                target.set(surfaceRefs);
            }
        }
        
        /**
         * Unsets the "surfaceRefs" attribute
         */
        public void unsetSurfaceRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SURFACEREFS$26);
            }
        }
        
        /**
         * Gets the "gradeModelRefs" attribute
         */
        public java.util.List getGradeModelRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRADEMODELREFS$28);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "gradeModelRefs" attribute
         */
        public org.landxml.schema.landXML11.GradeModelNameRefs xgetGradeModelRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GradeModelNameRefs target = null;
                target = (org.landxml.schema.landXML11.GradeModelNameRefs)get_store().find_attribute_user(GRADEMODELREFS$28);
                return target;
            }
        }
        
        /**
         * True if has "gradeModelRefs" attribute
         */
        public boolean isSetGradeModelRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GRADEMODELREFS$28) != null;
            }
        }
        
        /**
         * Sets the "gradeModelRefs" attribute
         */
        public void setGradeModelRefs(java.util.List gradeModelRefs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRADEMODELREFS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GRADEMODELREFS$28);
                }
                target.setListValue(gradeModelRefs);
            }
        }
        
        /**
         * Sets (as xml) the "gradeModelRefs" attribute
         */
        public void xsetGradeModelRefs(org.landxml.schema.landXML11.GradeModelNameRefs gradeModelRefs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GradeModelNameRefs target = null;
                target = (org.landxml.schema.landXML11.GradeModelNameRefs)get_store().find_attribute_user(GRADEMODELREFS$28);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.GradeModelNameRefs)get_store().add_attribute_user(GRADEMODELREFS$28);
                }
                target.set(gradeModelRefs);
            }
        }
        
        /**
         * Unsets the "gradeModelRefs" attribute
         */
        public void unsetGradeModelRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GRADEMODELREFS$28);
            }
        }
        
        /**
         * Gets the "staStart" attribute
         */
        public double getStaStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STASTART$30);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "staStart" attribute
         */
        public org.landxml.schema.landXML11.Station xgetStaStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(STASTART$30);
                return target;
            }
        }
        
        /**
         * True if has "staStart" attribute
         */
        public boolean isSetStaStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STASTART$30) != null;
            }
        }
        
        /**
         * Sets the "staStart" attribute
         */
        public void setStaStart(double staStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STASTART$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STASTART$30);
                }
                target.setDoubleValue(staStart);
            }
        }
        
        /**
         * Sets (as xml) the "staStart" attribute
         */
        public void xsetStaStart(org.landxml.schema.landXML11.Station staStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(STASTART$30);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(STASTART$30);
                }
                target.set(staStart);
            }
        }
        
        /**
         * Unsets the "staStart" attribute
         */
        public void unsetStaStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STASTART$30);
            }
        }
        
        /**
         * Gets the "staEnd" attribute
         */
        public double getStaEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STAEND$32);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "staEnd" attribute
         */
        public org.landxml.schema.landXML11.Station xgetStaEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(STAEND$32);
                return target;
            }
        }
        
        /**
         * True if has "staEnd" attribute
         */
        public boolean isSetStaEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STAEND$32) != null;
            }
        }
        
        /**
         * Sets the "staEnd" attribute
         */
        public void setStaEnd(double staEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STAEND$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STAEND$32);
                }
                target.setDoubleValue(staEnd);
            }
        }
        
        /**
         * Sets (as xml) the "staEnd" attribute
         */
        public void xsetStaEnd(org.landxml.schema.landXML11.Station staEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(STAEND$32);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(STAEND$32);
                }
                target.set(staEnd);
            }
        }
        
        /**
         * Unsets the "staEnd" attribute
         */
        public void unsetStaEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STAEND$32);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$34);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$34);
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
                return get_store().find_attribute_user(DESC$34) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$34);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$34);
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
                get_store().remove_attribute(DESC$34);
            }
        }
        
        /**
         * Gets the "roadTerrain" attribute
         */
        public org.landxml.schema.landXML11.RoadTerrainType.Enum getRoadTerrain()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROADTERRAIN$36);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.RoadTerrainType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "roadTerrain" attribute
         */
        public org.landxml.schema.landXML11.RoadTerrainType xgetRoadTerrain()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadTerrainType target = null;
                target = (org.landxml.schema.landXML11.RoadTerrainType)get_store().find_attribute_user(ROADTERRAIN$36);
                return target;
            }
        }
        
        /**
         * True if has "roadTerrain" attribute
         */
        public boolean isSetRoadTerrain()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ROADTERRAIN$36) != null;
            }
        }
        
        /**
         * Sets the "roadTerrain" attribute
         */
        public void setRoadTerrain(org.landxml.schema.landXML11.RoadTerrainType.Enum roadTerrain)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROADTERRAIN$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROADTERRAIN$36);
                }
                target.setEnumValue(roadTerrain);
            }
        }
        
        /**
         * Sets (as xml) the "roadTerrain" attribute
         */
        public void xsetRoadTerrain(org.landxml.schema.landXML11.RoadTerrainType roadTerrain)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadTerrainType target = null;
                target = (org.landxml.schema.landXML11.RoadTerrainType)get_store().find_attribute_user(ROADTERRAIN$36);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.RoadTerrainType)get_store().add_attribute_user(ROADTERRAIN$36);
                }
                target.set(roadTerrain);
            }
        }
        
        /**
         * Unsets the "roadTerrain" attribute
         */
        public void unsetRoadTerrain()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ROADTERRAIN$36);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$38);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$38);
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
                return get_store().find_attribute_user(STATE$38) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$38);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$38);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$38);
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
                get_store().remove_attribute(STATE$38);
            }
        }
    }
}
