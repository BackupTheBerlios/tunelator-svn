/*
 * An XML document type.
 * Localname: ObservationGroup
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ObservationGroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one ObservationGroup(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ObservationGroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ObservationGroupDocument
{
    
    public ObservationGroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBSERVATIONGROUP$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ObservationGroup");
    
    
    /**
     * Gets the "ObservationGroup" element
     */
    public org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup getObservationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup target = null;
            target = (org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup)get_store().find_element_user(OBSERVATIONGROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ObservationGroup" element
     */
    public void setObservationGroup(org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup observationGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup target = null;
            target = (org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup)get_store().find_element_user(OBSERVATIONGROUP$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup)get_store().add_element_user(OBSERVATIONGROUP$0);
            }
            target.set(observationGroup);
        }
    }
    
    /**
     * Appends and returns a new empty "ObservationGroup" element
     */
    public org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup addNewObservationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup target = null;
            target = (org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup)get_store().add_element_user(OBSERVATIONGROUP$0);
            return target;
        }
    }
    /**
     * An XML ObservationGroup(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class ObservationGroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup
    {
        
        public ObservationGroupImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TARGETPOINT$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "TargetPoint");
        private static final javax.xml.namespace.QName BACKSIGHT$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Backsight");
        private static final javax.xml.namespace.QName RAWOBSERVATION$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "RawObservation");
        private static final javax.xml.namespace.QName REDUCEDOBSERVATION$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ReducedObservation");
        private static final javax.xml.namespace.QName REDHORIZONTALPOSITION$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "RedHorizontalPosition");
        private static final javax.xml.namespace.QName REDUCEDARCOBSERVATION$10 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ReducedArcObservation");
        private static final javax.xml.namespace.QName REDVERTICALOBSERVATION$12 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "RedVerticalObservation");
        private static final javax.xml.namespace.QName FIELDNOTE$14 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FieldNote");
        private static final javax.xml.namespace.QName FEATURE$16 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName ID$18 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName PURPOSE$20 = 
            new javax.xml.namespace.QName("", "purpose");
        private static final javax.xml.namespace.QName SETUPID$22 = 
            new javax.xml.namespace.QName("", "setupID");
        private static final javax.xml.namespace.QName TARGETSETUPID$24 = 
            new javax.xml.namespace.QName("", "targetSetupID");
        private static final javax.xml.namespace.QName SETID$26 = 
            new javax.xml.namespace.QName("", "setID");
        private static final javax.xml.namespace.QName COORDGEOMREFS$28 = 
            new javax.xml.namespace.QName("", "coordGeomRefs");
        
        
        /**
         * Gets the "TargetPoint" element
         */
        public org.landxml.schema.landXML11.PointType getTargetPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(TARGETPOINT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "TargetPoint" element
         */
        public boolean isSetTargetPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TARGETPOINT$0) != 0;
            }
        }
        
        /**
         * Sets the "TargetPoint" element
         */
        public void setTargetPoint(org.landxml.schema.landXML11.PointType targetPoint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(TARGETPOINT$0, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(TARGETPOINT$0);
                }
                target.set(targetPoint);
            }
        }
        
        /**
         * Appends and returns a new empty "TargetPoint" element
         */
        public org.landxml.schema.landXML11.PointType addNewTargetPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(TARGETPOINT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "TargetPoint" element
         */
        public void unsetTargetPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TARGETPOINT$0, 0);
            }
        }
        
        /**
         * Gets a List of "Backsight" elements
         */
        public java.util.List<org.landxml.schema.landXML11.BacksightDocument.Backsight> getBacksightList()
        {
            final class BacksightList extends java.util.AbstractList<org.landxml.schema.landXML11.BacksightDocument.Backsight>
            {
                public org.landxml.schema.landXML11.BacksightDocument.Backsight get(int i)
                    { return ObservationGroupImpl.this.getBacksightArray(i); }
                
                public org.landxml.schema.landXML11.BacksightDocument.Backsight set(int i, org.landxml.schema.landXML11.BacksightDocument.Backsight o)
                {
                    org.landxml.schema.landXML11.BacksightDocument.Backsight old = ObservationGroupImpl.this.getBacksightArray(i);
                    ObservationGroupImpl.this.setBacksightArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.BacksightDocument.Backsight o)
                    { ObservationGroupImpl.this.insertNewBacksight(i).set(o); }
                
                public org.landxml.schema.landXML11.BacksightDocument.Backsight remove(int i)
                {
                    org.landxml.schema.landXML11.BacksightDocument.Backsight old = ObservationGroupImpl.this.getBacksightArray(i);
                    ObservationGroupImpl.this.removeBacksight(i);
                    return old;
                }
                
                public int size()
                    { return ObservationGroupImpl.this.sizeOfBacksightArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new BacksightList();
            }
        }
        
        /**
         * Gets array of all "Backsight" elements
         */
        public org.landxml.schema.landXML11.BacksightDocument.Backsight[] getBacksightArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BACKSIGHT$2, targetList);
                org.landxml.schema.landXML11.BacksightDocument.Backsight[] result = new org.landxml.schema.landXML11.BacksightDocument.Backsight[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Backsight" element
         */
        public org.landxml.schema.landXML11.BacksightDocument.Backsight getBacksightArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BacksightDocument.Backsight target = null;
                target = (org.landxml.schema.landXML11.BacksightDocument.Backsight)get_store().find_element_user(BACKSIGHT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Backsight" element
         */
        public int sizeOfBacksightArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BACKSIGHT$2);
            }
        }
        
        /**
         * Sets array of all "Backsight" element
         */
        public void setBacksightArray(org.landxml.schema.landXML11.BacksightDocument.Backsight[] backsightArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(backsightArray, BACKSIGHT$2);
            }
        }
        
        /**
         * Sets ith "Backsight" element
         */
        public void setBacksightArray(int i, org.landxml.schema.landXML11.BacksightDocument.Backsight backsight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BacksightDocument.Backsight target = null;
                target = (org.landxml.schema.landXML11.BacksightDocument.Backsight)get_store().find_element_user(BACKSIGHT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(backsight);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Backsight" element
         */
        public org.landxml.schema.landXML11.BacksightDocument.Backsight insertNewBacksight(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BacksightDocument.Backsight target = null;
                target = (org.landxml.schema.landXML11.BacksightDocument.Backsight)get_store().insert_element_user(BACKSIGHT$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Backsight" element
         */
        public org.landxml.schema.landXML11.BacksightDocument.Backsight addNewBacksight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BacksightDocument.Backsight target = null;
                target = (org.landxml.schema.landXML11.BacksightDocument.Backsight)get_store().add_element_user(BACKSIGHT$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Backsight" element
         */
        public void removeBacksight(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BACKSIGHT$2, i);
            }
        }
        
        /**
         * Gets a List of "RawObservation" elements
         */
        public java.util.List<org.landxml.schema.landXML11.RawObservationDocument.RawObservation> getRawObservationList()
        {
            final class RawObservationList extends java.util.AbstractList<org.landxml.schema.landXML11.RawObservationDocument.RawObservation>
            {
                public org.landxml.schema.landXML11.RawObservationDocument.RawObservation get(int i)
                    { return ObservationGroupImpl.this.getRawObservationArray(i); }
                
                public org.landxml.schema.landXML11.RawObservationDocument.RawObservation set(int i, org.landxml.schema.landXML11.RawObservationDocument.RawObservation o)
                {
                    org.landxml.schema.landXML11.RawObservationDocument.RawObservation old = ObservationGroupImpl.this.getRawObservationArray(i);
                    ObservationGroupImpl.this.setRawObservationArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.RawObservationDocument.RawObservation o)
                    { ObservationGroupImpl.this.insertNewRawObservation(i).set(o); }
                
                public org.landxml.schema.landXML11.RawObservationDocument.RawObservation remove(int i)
                {
                    org.landxml.schema.landXML11.RawObservationDocument.RawObservation old = ObservationGroupImpl.this.getRawObservationArray(i);
                    ObservationGroupImpl.this.removeRawObservation(i);
                    return old;
                }
                
                public int size()
                    { return ObservationGroupImpl.this.sizeOfRawObservationArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RawObservationList();
            }
        }
        
        /**
         * Gets array of all "RawObservation" elements
         */
        public org.landxml.schema.landXML11.RawObservationDocument.RawObservation[] getRawObservationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RAWOBSERVATION$4, targetList);
                org.landxml.schema.landXML11.RawObservationDocument.RawObservation[] result = new org.landxml.schema.landXML11.RawObservationDocument.RawObservation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "RawObservation" element
         */
        public org.landxml.schema.landXML11.RawObservationDocument.RawObservation getRawObservationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RawObservationDocument.RawObservation target = null;
                target = (org.landxml.schema.landXML11.RawObservationDocument.RawObservation)get_store().find_element_user(RAWOBSERVATION$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "RawObservation" element
         */
        public int sizeOfRawObservationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RAWOBSERVATION$4);
            }
        }
        
        /**
         * Sets array of all "RawObservation" element
         */
        public void setRawObservationArray(org.landxml.schema.landXML11.RawObservationDocument.RawObservation[] rawObservationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(rawObservationArray, RAWOBSERVATION$4);
            }
        }
        
        /**
         * Sets ith "RawObservation" element
         */
        public void setRawObservationArray(int i, org.landxml.schema.landXML11.RawObservationDocument.RawObservation rawObservation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RawObservationDocument.RawObservation target = null;
                target = (org.landxml.schema.landXML11.RawObservationDocument.RawObservation)get_store().find_element_user(RAWOBSERVATION$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(rawObservation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RawObservation" element
         */
        public org.landxml.schema.landXML11.RawObservationDocument.RawObservation insertNewRawObservation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RawObservationDocument.RawObservation target = null;
                target = (org.landxml.schema.landXML11.RawObservationDocument.RawObservation)get_store().insert_element_user(RAWOBSERVATION$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RawObservation" element
         */
        public org.landxml.schema.landXML11.RawObservationDocument.RawObservation addNewRawObservation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RawObservationDocument.RawObservation target = null;
                target = (org.landxml.schema.landXML11.RawObservationDocument.RawObservation)get_store().add_element_user(RAWOBSERVATION$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "RawObservation" element
         */
        public void removeRawObservation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RAWOBSERVATION$4, i);
            }
        }
        
        /**
         * Gets a List of "ReducedObservation" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation> getReducedObservationList()
        {
            final class ReducedObservationList extends java.util.AbstractList<org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation>
            {
                public org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation get(int i)
                    { return ObservationGroupImpl.this.getReducedObservationArray(i); }
                
                public org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation set(int i, org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation o)
                {
                    org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation old = ObservationGroupImpl.this.getReducedObservationArray(i);
                    ObservationGroupImpl.this.setReducedObservationArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation o)
                    { ObservationGroupImpl.this.insertNewReducedObservation(i).set(o); }
                
                public org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation remove(int i)
                {
                    org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation old = ObservationGroupImpl.this.getReducedObservationArray(i);
                    ObservationGroupImpl.this.removeReducedObservation(i);
                    return old;
                }
                
                public int size()
                    { return ObservationGroupImpl.this.sizeOfReducedObservationArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ReducedObservationList();
            }
        }
        
        /**
         * Gets array of all "ReducedObservation" elements
         */
        public org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation[] getReducedObservationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REDUCEDOBSERVATION$6, targetList);
                org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation[] result = new org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ReducedObservation" element
         */
        public org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation getReducedObservationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation target = null;
                target = (org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation)get_store().find_element_user(REDUCEDOBSERVATION$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ReducedObservation" element
         */
        public int sizeOfReducedObservationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REDUCEDOBSERVATION$6);
            }
        }
        
        /**
         * Sets array of all "ReducedObservation" element
         */
        public void setReducedObservationArray(org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation[] reducedObservationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(reducedObservationArray, REDUCEDOBSERVATION$6);
            }
        }
        
        /**
         * Sets ith "ReducedObservation" element
         */
        public void setReducedObservationArray(int i, org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation reducedObservation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation target = null;
                target = (org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation)get_store().find_element_user(REDUCEDOBSERVATION$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(reducedObservation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ReducedObservation" element
         */
        public org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation insertNewReducedObservation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation target = null;
                target = (org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation)get_store().insert_element_user(REDUCEDOBSERVATION$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ReducedObservation" element
         */
        public org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation addNewReducedObservation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation target = null;
                target = (org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation)get_store().add_element_user(REDUCEDOBSERVATION$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "ReducedObservation" element
         */
        public void removeReducedObservation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REDUCEDOBSERVATION$6, i);
            }
        }
        
        /**
         * Gets a List of "RedHorizontalPosition" elements
         */
        public java.util.List<org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition> getRedHorizontalPositionList()
        {
            final class RedHorizontalPositionList extends java.util.AbstractList<org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition>
            {
                public org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition get(int i)
                    { return ObservationGroupImpl.this.getRedHorizontalPositionArray(i); }
                
                public org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition set(int i, org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition o)
                {
                    org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition old = ObservationGroupImpl.this.getRedHorizontalPositionArray(i);
                    ObservationGroupImpl.this.setRedHorizontalPositionArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition o)
                    { ObservationGroupImpl.this.insertNewRedHorizontalPosition(i).set(o); }
                
                public org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition remove(int i)
                {
                    org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition old = ObservationGroupImpl.this.getRedHorizontalPositionArray(i);
                    ObservationGroupImpl.this.removeRedHorizontalPosition(i);
                    return old;
                }
                
                public int size()
                    { return ObservationGroupImpl.this.sizeOfRedHorizontalPositionArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RedHorizontalPositionList();
            }
        }
        
        /**
         * Gets array of all "RedHorizontalPosition" elements
         */
        public org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition[] getRedHorizontalPositionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REDHORIZONTALPOSITION$8, targetList);
                org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition[] result = new org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "RedHorizontalPosition" element
         */
        public org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition getRedHorizontalPositionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition target = null;
                target = (org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition)get_store().find_element_user(REDHORIZONTALPOSITION$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "RedHorizontalPosition" element
         */
        public int sizeOfRedHorizontalPositionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REDHORIZONTALPOSITION$8);
            }
        }
        
        /**
         * Sets array of all "RedHorizontalPosition" element
         */
        public void setRedHorizontalPositionArray(org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition[] redHorizontalPositionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(redHorizontalPositionArray, REDHORIZONTALPOSITION$8);
            }
        }
        
        /**
         * Sets ith "RedHorizontalPosition" element
         */
        public void setRedHorizontalPositionArray(int i, org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition redHorizontalPosition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition target = null;
                target = (org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition)get_store().find_element_user(REDHORIZONTALPOSITION$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(redHorizontalPosition);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RedHorizontalPosition" element
         */
        public org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition insertNewRedHorizontalPosition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition target = null;
                target = (org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition)get_store().insert_element_user(REDHORIZONTALPOSITION$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RedHorizontalPosition" element
         */
        public org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition addNewRedHorizontalPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition target = null;
                target = (org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition)get_store().add_element_user(REDHORIZONTALPOSITION$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "RedHorizontalPosition" element
         */
        public void removeRedHorizontalPosition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REDHORIZONTALPOSITION$8, i);
            }
        }
        
        /**
         * Gets a List of "ReducedArcObservation" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation> getReducedArcObservationList()
        {
            final class ReducedArcObservationList extends java.util.AbstractList<org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation>
            {
                public org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation get(int i)
                    { return ObservationGroupImpl.this.getReducedArcObservationArray(i); }
                
                public org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation set(int i, org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation o)
                {
                    org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation old = ObservationGroupImpl.this.getReducedArcObservationArray(i);
                    ObservationGroupImpl.this.setReducedArcObservationArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation o)
                    { ObservationGroupImpl.this.insertNewReducedArcObservation(i).set(o); }
                
                public org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation remove(int i)
                {
                    org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation old = ObservationGroupImpl.this.getReducedArcObservationArray(i);
                    ObservationGroupImpl.this.removeReducedArcObservation(i);
                    return old;
                }
                
                public int size()
                    { return ObservationGroupImpl.this.sizeOfReducedArcObservationArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ReducedArcObservationList();
            }
        }
        
        /**
         * Gets array of all "ReducedArcObservation" elements
         */
        public org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation[] getReducedArcObservationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REDUCEDARCOBSERVATION$10, targetList);
                org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation[] result = new org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ReducedArcObservation" element
         */
        public org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation getReducedArcObservationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation target = null;
                target = (org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation)get_store().find_element_user(REDUCEDARCOBSERVATION$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ReducedArcObservation" element
         */
        public int sizeOfReducedArcObservationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REDUCEDARCOBSERVATION$10);
            }
        }
        
        /**
         * Sets array of all "ReducedArcObservation" element
         */
        public void setReducedArcObservationArray(org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation[] reducedArcObservationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(reducedArcObservationArray, REDUCEDARCOBSERVATION$10);
            }
        }
        
        /**
         * Sets ith "ReducedArcObservation" element
         */
        public void setReducedArcObservationArray(int i, org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation reducedArcObservation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation target = null;
                target = (org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation)get_store().find_element_user(REDUCEDARCOBSERVATION$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(reducedArcObservation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ReducedArcObservation" element
         */
        public org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation insertNewReducedArcObservation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation target = null;
                target = (org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation)get_store().insert_element_user(REDUCEDARCOBSERVATION$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ReducedArcObservation" element
         */
        public org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation addNewReducedArcObservation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation target = null;
                target = (org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation)get_store().add_element_user(REDUCEDARCOBSERVATION$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "ReducedArcObservation" element
         */
        public void removeReducedArcObservation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REDUCEDARCOBSERVATION$10, i);
            }
        }
        
        /**
         * Gets a List of "RedVerticalObservation" elements
         */
        public java.util.List<org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation> getRedVerticalObservationList()
        {
            final class RedVerticalObservationList extends java.util.AbstractList<org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation>
            {
                public org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation get(int i)
                    { return ObservationGroupImpl.this.getRedVerticalObservationArray(i); }
                
                public org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation set(int i, org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation o)
                {
                    org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation old = ObservationGroupImpl.this.getRedVerticalObservationArray(i);
                    ObservationGroupImpl.this.setRedVerticalObservationArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation o)
                    { ObservationGroupImpl.this.insertNewRedVerticalObservation(i).set(o); }
                
                public org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation remove(int i)
                {
                    org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation old = ObservationGroupImpl.this.getRedVerticalObservationArray(i);
                    ObservationGroupImpl.this.removeRedVerticalObservation(i);
                    return old;
                }
                
                public int size()
                    { return ObservationGroupImpl.this.sizeOfRedVerticalObservationArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RedVerticalObservationList();
            }
        }
        
        /**
         * Gets array of all "RedVerticalObservation" elements
         */
        public org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation[] getRedVerticalObservationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REDVERTICALOBSERVATION$12, targetList);
                org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation[] result = new org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "RedVerticalObservation" element
         */
        public org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation getRedVerticalObservationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation target = null;
                target = (org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation)get_store().find_element_user(REDVERTICALOBSERVATION$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "RedVerticalObservation" element
         */
        public int sizeOfRedVerticalObservationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REDVERTICALOBSERVATION$12);
            }
        }
        
        /**
         * Sets array of all "RedVerticalObservation" element
         */
        public void setRedVerticalObservationArray(org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation[] redVerticalObservationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(redVerticalObservationArray, REDVERTICALOBSERVATION$12);
            }
        }
        
        /**
         * Sets ith "RedVerticalObservation" element
         */
        public void setRedVerticalObservationArray(int i, org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation redVerticalObservation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation target = null;
                target = (org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation)get_store().find_element_user(REDVERTICALOBSERVATION$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(redVerticalObservation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RedVerticalObservation" element
         */
        public org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation insertNewRedVerticalObservation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation target = null;
                target = (org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation)get_store().insert_element_user(REDVERTICALOBSERVATION$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RedVerticalObservation" element
         */
        public org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation addNewRedVerticalObservation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation target = null;
                target = (org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation)get_store().add_element_user(REDVERTICALOBSERVATION$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "RedVerticalObservation" element
         */
        public void removeRedVerticalObservation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REDVERTICALOBSERVATION$12, i);
            }
        }
        
        /**
         * Gets a List of "FieldNote" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FieldNoteDocument.FieldNote> getFieldNoteList()
        {
            final class FieldNoteList extends java.util.AbstractList<org.landxml.schema.landXML11.FieldNoteDocument.FieldNote>
            {
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote get(int i)
                    { return ObservationGroupImpl.this.getFieldNoteArray(i); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote set(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = ObservationGroupImpl.this.getFieldNoteArray(i);
                    ObservationGroupImpl.this.setFieldNoteArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                    { ObservationGroupImpl.this.insertNewFieldNote(i).set(o); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote remove(int i)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = ObservationGroupImpl.this.getFieldNoteArray(i);
                    ObservationGroupImpl.this.removeFieldNote(i);
                    return old;
                }
                
                public int size()
                    { return ObservationGroupImpl.this.sizeOfFieldNoteArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FieldNoteList();
            }
        }
        
        /**
         * Gets array of all "FieldNote" elements
         */
        public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote[] getFieldNoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FIELDNOTE$14, targetList);
                org.landxml.schema.landXML11.FieldNoteDocument.FieldNote[] result = new org.landxml.schema.landXML11.FieldNoteDocument.FieldNote[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "FieldNote" element
         */
        public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote getFieldNoteArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FieldNoteDocument.FieldNote target = null;
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().find_element_user(FIELDNOTE$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "FieldNote" element
         */
        public int sizeOfFieldNoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELDNOTE$14);
            }
        }
        
        /**
         * Sets array of all "FieldNote" element
         */
        public void setFieldNoteArray(org.landxml.schema.landXML11.FieldNoteDocument.FieldNote[] fieldNoteArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(fieldNoteArray, FIELDNOTE$14);
            }
        }
        
        /**
         * Sets ith "FieldNote" element
         */
        public void setFieldNoteArray(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote fieldNote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FieldNoteDocument.FieldNote target = null;
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().find_element_user(FIELDNOTE$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(fieldNote);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "FieldNote" element
         */
        public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote insertNewFieldNote(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FieldNoteDocument.FieldNote target = null;
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().insert_element_user(FIELDNOTE$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "FieldNote" element
         */
        public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote addNewFieldNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FieldNoteDocument.FieldNote target = null;
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().add_element_user(FIELDNOTE$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "FieldNote" element
         */
        public void removeFieldNote(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELDNOTE$14, i);
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
                    { return ObservationGroupImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ObservationGroupImpl.this.getFeatureArray(i);
                    ObservationGroupImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { ObservationGroupImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ObservationGroupImpl.this.getFeatureArray(i);
                    ObservationGroupImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return ObservationGroupImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$16, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$16, i);
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
                return get_store().count_elements(FEATURE$16);
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
                arraySetterHelper(featureArray, FEATURE$16);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$16, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$16, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$16);
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
                get_store().remove_element(FEATURE$16, i);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlID xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlID target = null;
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$18);
                return target;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$18);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlID id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlID target = null;
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$18);
                }
                target.set(id);
            }
        }
        
        /**
         * Gets the "purpose" attribute
         */
        public org.landxml.schema.landXML11.PurposeType.Enum getPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PURPOSE$20);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.PurposeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "purpose" attribute
         */
        public org.landxml.schema.landXML11.PurposeType xgetPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PurposeType target = null;
                target = (org.landxml.schema.landXML11.PurposeType)get_store().find_attribute_user(PURPOSE$20);
                return target;
            }
        }
        
        /**
         * True if has "purpose" attribute
         */
        public boolean isSetPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PURPOSE$20) != null;
            }
        }
        
        /**
         * Sets the "purpose" attribute
         */
        public void setPurpose(org.landxml.schema.landXML11.PurposeType.Enum purpose)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PURPOSE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PURPOSE$20);
                }
                target.setEnumValue(purpose);
            }
        }
        
        /**
         * Sets (as xml) the "purpose" attribute
         */
        public void xsetPurpose(org.landxml.schema.landXML11.PurposeType purpose)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PurposeType target = null;
                target = (org.landxml.schema.landXML11.PurposeType)get_store().find_attribute_user(PURPOSE$20);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PurposeType)get_store().add_attribute_user(PURPOSE$20);
                }
                target.set(purpose);
            }
        }
        
        /**
         * Unsets the "purpose" attribute
         */
        public void unsetPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PURPOSE$20);
            }
        }
        
        /**
         * Gets the "setupID" attribute
         */
        public java.lang.String getSetupID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETUPID$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "setupID" attribute
         */
        public org.apache.xmlbeans.XmlIDREF xgetSetupID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(SETUPID$22);
                return target;
            }
        }
        
        /**
         * True if has "setupID" attribute
         */
        public boolean isSetSetupID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SETUPID$22) != null;
            }
        }
        
        /**
         * Sets the "setupID" attribute
         */
        public void setSetupID(java.lang.String setupID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETUPID$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETUPID$22);
                }
                target.setStringValue(setupID);
            }
        }
        
        /**
         * Sets (as xml) the "setupID" attribute
         */
        public void xsetSetupID(org.apache.xmlbeans.XmlIDREF setupID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(SETUPID$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(SETUPID$22);
                }
                target.set(setupID);
            }
        }
        
        /**
         * Unsets the "setupID" attribute
         */
        public void unsetSetupID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SETUPID$22);
            }
        }
        
        /**
         * Gets the "targetSetupID" attribute
         */
        public java.lang.String getTargetSetupID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETSETUPID$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "targetSetupID" attribute
         */
        public org.apache.xmlbeans.XmlIDREF xgetTargetSetupID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(TARGETSETUPID$24);
                return target;
            }
        }
        
        /**
         * True if has "targetSetupID" attribute
         */
        public boolean isSetTargetSetupID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TARGETSETUPID$24) != null;
            }
        }
        
        /**
         * Sets the "targetSetupID" attribute
         */
        public void setTargetSetupID(java.lang.String targetSetupID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETSETUPID$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETSETUPID$24);
                }
                target.setStringValue(targetSetupID);
            }
        }
        
        /**
         * Sets (as xml) the "targetSetupID" attribute
         */
        public void xsetTargetSetupID(org.apache.xmlbeans.XmlIDREF targetSetupID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(TARGETSETUPID$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(TARGETSETUPID$24);
                }
                target.set(targetSetupID);
            }
        }
        
        /**
         * Unsets the "targetSetupID" attribute
         */
        public void unsetTargetSetupID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TARGETSETUPID$24);
            }
        }
        
        /**
         * Gets the "setID" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getSetID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(SETID$26);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "setID" attribute
         */
        public boolean isSetSetID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SETID$26) != null;
            }
        }
        
        /**
         * Sets the "setID" attribute
         */
        public void setSetID(org.apache.xmlbeans.XmlAnySimpleType setID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(SETID$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(SETID$26);
                }
                target.set(setID);
            }
        }
        
        /**
         * Appends and returns a new empty "setID" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewSetID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(SETID$26);
                return target;
            }
        }
        
        /**
         * Unsets the "setID" attribute
         */
        public void unsetSetID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SETID$26);
            }
        }
        
        /**
         * Gets the "coordGeomRefs" attribute
         */
        public java.util.List getCoordGeomRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COORDGEOMREFS$28);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "coordGeomRefs" attribute
         */
        public org.landxml.schema.landXML11.CoordGeomNameRefs xgetCoordGeomRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordGeomNameRefs target = null;
                target = (org.landxml.schema.landXML11.CoordGeomNameRefs)get_store().find_attribute_user(COORDGEOMREFS$28);
                return target;
            }
        }
        
        /**
         * True if has "coordGeomRefs" attribute
         */
        public boolean isSetCoordGeomRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COORDGEOMREFS$28) != null;
            }
        }
        
        /**
         * Sets the "coordGeomRefs" attribute
         */
        public void setCoordGeomRefs(java.util.List coordGeomRefs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COORDGEOMREFS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COORDGEOMREFS$28);
                }
                target.setListValue(coordGeomRefs);
            }
        }
        
        /**
         * Sets (as xml) the "coordGeomRefs" attribute
         */
        public void xsetCoordGeomRefs(org.landxml.schema.landXML11.CoordGeomNameRefs coordGeomRefs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordGeomNameRefs target = null;
                target = (org.landxml.schema.landXML11.CoordGeomNameRefs)get_store().find_attribute_user(COORDGEOMREFS$28);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CoordGeomNameRefs)get_store().add_attribute_user(COORDGEOMREFS$28);
                }
                target.set(coordGeomRefs);
            }
        }
        
        /**
         * Unsets the "coordGeomRefs" attribute
         */
        public void unsetCoordGeomRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COORDGEOMREFS$28);
            }
        }
    }
}
