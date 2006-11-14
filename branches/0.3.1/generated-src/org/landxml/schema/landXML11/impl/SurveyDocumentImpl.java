/*
 * An XML document type.
 * Localname: Survey
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.SurveyDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Survey(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class SurveyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SurveyDocument
{
    
    public SurveyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURVEY$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Survey");
    
    
    /**
     * Gets the "Survey" element
     */
    public org.landxml.schema.landXML11.SurveyDocument.Survey getSurvey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SurveyDocument.Survey target = null;
            target = (org.landxml.schema.landXML11.SurveyDocument.Survey)get_store().find_element_user(SURVEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Survey" element
     */
    public void setSurvey(org.landxml.schema.landXML11.SurveyDocument.Survey survey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SurveyDocument.Survey target = null;
            target = (org.landxml.schema.landXML11.SurveyDocument.Survey)get_store().find_element_user(SURVEY$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.SurveyDocument.Survey)get_store().add_element_user(SURVEY$0);
            }
            target.set(survey);
        }
    }
    
    /**
     * Appends and returns a new empty "Survey" element
     */
    public org.landxml.schema.landXML11.SurveyDocument.Survey addNewSurvey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SurveyDocument.Survey target = null;
            target = (org.landxml.schema.landXML11.SurveyDocument.Survey)get_store().add_element_user(SURVEY$0);
            return target;
        }
    }
    /**
     * An XML Survey(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class SurveyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SurveyDocument.Survey
    {
        
        public SurveyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SURVEYHEADER$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "SurveyHeader");
        private static final javax.xml.namespace.QName EQUIPMENT$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Equipment");
        private static final javax.xml.namespace.QName SURVEYMONUMENT$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "SurveyMonument");
        private static final javax.xml.namespace.QName CGPOINTS$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CgPoints");
        private static final javax.xml.namespace.QName INSTRUMENTSETUP$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "InstrumentSetup");
        private static final javax.xml.namespace.QName LASERSETUP$10 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "LaserSetup");
        private static final javax.xml.namespace.QName GPSSETUP$12 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "GPSSetup");
        private static final javax.xml.namespace.QName TARGETSETUP$14 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "TargetSetup");
        private static final javax.xml.namespace.QName GPSVECTOR$16 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "GPSVector");
        private static final javax.xml.namespace.QName GPSPOSITION$18 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "GPSPosition");
        private static final javax.xml.namespace.QName OBSERVATIONGROUP$20 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ObservationGroup");
        private static final javax.xml.namespace.QName CONTROLCHECKS$22 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ControlChecks");
        private static final javax.xml.namespace.QName FIELDNOTE$24 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FieldNote");
        private static final javax.xml.namespace.QName FEATURE$26 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName DESC$28 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName DATE$30 = 
            new javax.xml.namespace.QName("", "date");
        private static final javax.xml.namespace.QName STARTTIME$32 = 
            new javax.xml.namespace.QName("", "startTime");
        private static final javax.xml.namespace.QName ENDTIME$34 = 
            new javax.xml.namespace.QName("", "endTime");
        private static final javax.xml.namespace.QName STATE$36 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName HORIZONTALACCURACY$38 = 
            new javax.xml.namespace.QName("", "horizontalAccuracy");
        private static final javax.xml.namespace.QName VERTICALACCURACY$40 = 
            new javax.xml.namespace.QName("", "verticalAccuracy");
        
        
        /**
         * Gets the "SurveyHeader" element
         */
        public org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader getSurveyHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader target = null;
                target = (org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader)get_store().find_element_user(SURVEYHEADER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "SurveyHeader" element
         */
        public void setSurveyHeader(org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader surveyHeader)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader target = null;
                target = (org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader)get_store().find_element_user(SURVEYHEADER$0, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader)get_store().add_element_user(SURVEYHEADER$0);
                }
                target.set(surveyHeader);
            }
        }
        
        /**
         * Appends and returns a new empty "SurveyHeader" element
         */
        public org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader addNewSurveyHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader target = null;
                target = (org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader)get_store().add_element_user(SURVEYHEADER$0);
                return target;
            }
        }
        
        /**
         * Gets the "Equipment" element
         */
        public org.landxml.schema.landXML11.EquipmentDocument.Equipment getEquipment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.EquipmentDocument.Equipment target = null;
                target = (org.landxml.schema.landXML11.EquipmentDocument.Equipment)get_store().find_element_user(EQUIPMENT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Equipment" element
         */
        public boolean isSetEquipment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EQUIPMENT$2) != 0;
            }
        }
        
        /**
         * Sets the "Equipment" element
         */
        public void setEquipment(org.landxml.schema.landXML11.EquipmentDocument.Equipment equipment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.EquipmentDocument.Equipment target = null;
                target = (org.landxml.schema.landXML11.EquipmentDocument.Equipment)get_store().find_element_user(EQUIPMENT$2, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.EquipmentDocument.Equipment)get_store().add_element_user(EQUIPMENT$2);
                }
                target.set(equipment);
            }
        }
        
        /**
         * Appends and returns a new empty "Equipment" element
         */
        public org.landxml.schema.landXML11.EquipmentDocument.Equipment addNewEquipment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.EquipmentDocument.Equipment target = null;
                target = (org.landxml.schema.landXML11.EquipmentDocument.Equipment)get_store().add_element_user(EQUIPMENT$2);
                return target;
            }
        }
        
        /**
         * Unsets the "Equipment" element
         */
        public void unsetEquipment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EQUIPMENT$2, 0);
            }
        }
        
        /**
         * Gets a List of "SurveyMonument" elements
         */
        public java.util.List<org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument> getSurveyMonumentList()
        {
            final class SurveyMonumentList extends java.util.AbstractList<org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument>
            {
                public org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument get(int i)
                    { return SurveyImpl.this.getSurveyMonumentArray(i); }
                
                public org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument set(int i, org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument o)
                {
                    org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument old = SurveyImpl.this.getSurveyMonumentArray(i);
                    SurveyImpl.this.setSurveyMonumentArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument o)
                    { SurveyImpl.this.insertNewSurveyMonument(i).set(o); }
                
                public org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument remove(int i)
                {
                    org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument old = SurveyImpl.this.getSurveyMonumentArray(i);
                    SurveyImpl.this.removeSurveyMonument(i);
                    return old;
                }
                
                public int size()
                    { return SurveyImpl.this.sizeOfSurveyMonumentArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SurveyMonumentList();
            }
        }
        
        /**
         * Gets array of all "SurveyMonument" elements
         */
        public org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument[] getSurveyMonumentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SURVEYMONUMENT$4, targetList);
                org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument[] result = new org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "SurveyMonument" element
         */
        public org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument getSurveyMonumentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument target = null;
                target = (org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument)get_store().find_element_user(SURVEYMONUMENT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "SurveyMonument" element
         */
        public int sizeOfSurveyMonumentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SURVEYMONUMENT$4);
            }
        }
        
        /**
         * Sets array of all "SurveyMonument" element
         */
        public void setSurveyMonumentArray(org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument[] surveyMonumentArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(surveyMonumentArray, SURVEYMONUMENT$4);
            }
        }
        
        /**
         * Sets ith "SurveyMonument" element
         */
        public void setSurveyMonumentArray(int i, org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument surveyMonument)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument target = null;
                target = (org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument)get_store().find_element_user(SURVEYMONUMENT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(surveyMonument);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SurveyMonument" element
         */
        public org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument insertNewSurveyMonument(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument target = null;
                target = (org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument)get_store().insert_element_user(SURVEYMONUMENT$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SurveyMonument" element
         */
        public org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument addNewSurveyMonument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument target = null;
                target = (org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument)get_store().add_element_user(SURVEYMONUMENT$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "SurveyMonument" element
         */
        public void removeSurveyMonument(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SURVEYMONUMENT$4, i);
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
                    { return SurveyImpl.this.getCgPointsArray(i); }
                
                public org.landxml.schema.landXML11.CgPointsDocument.CgPoints set(int i, org.landxml.schema.landXML11.CgPointsDocument.CgPoints o)
                {
                    org.landxml.schema.landXML11.CgPointsDocument.CgPoints old = SurveyImpl.this.getCgPointsArray(i);
                    SurveyImpl.this.setCgPointsArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CgPointsDocument.CgPoints o)
                    { SurveyImpl.this.insertNewCgPoints(i).set(o); }
                
                public org.landxml.schema.landXML11.CgPointsDocument.CgPoints remove(int i)
                {
                    org.landxml.schema.landXML11.CgPointsDocument.CgPoints old = SurveyImpl.this.getCgPointsArray(i);
                    SurveyImpl.this.removeCgPoints(i);
                    return old;
                }
                
                public int size()
                    { return SurveyImpl.this.sizeOfCgPointsArray(); }
                
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
                get_store().find_all_element_users(CGPOINTS$6, targetList);
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
                target = (org.landxml.schema.landXML11.CgPointsDocument.CgPoints)get_store().find_element_user(CGPOINTS$6, i);
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
                return get_store().count_elements(CGPOINTS$6);
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
                arraySetterHelper(cgPointsArray, CGPOINTS$6);
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
                target = (org.landxml.schema.landXML11.CgPointsDocument.CgPoints)get_store().find_element_user(CGPOINTS$6, i);
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
                target = (org.landxml.schema.landXML11.CgPointsDocument.CgPoints)get_store().insert_element_user(CGPOINTS$6, i);
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
                target = (org.landxml.schema.landXML11.CgPointsDocument.CgPoints)get_store().add_element_user(CGPOINTS$6);
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
                get_store().remove_element(CGPOINTS$6, i);
            }
        }
        
        /**
         * Gets a List of "InstrumentSetup" elements
         */
        public java.util.List<org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup> getInstrumentSetupList()
        {
            final class InstrumentSetupList extends java.util.AbstractList<org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup>
            {
                public org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup get(int i)
                    { return SurveyImpl.this.getInstrumentSetupArray(i); }
                
                public org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup set(int i, org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup o)
                {
                    org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup old = SurveyImpl.this.getInstrumentSetupArray(i);
                    SurveyImpl.this.setInstrumentSetupArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup o)
                    { SurveyImpl.this.insertNewInstrumentSetup(i).set(o); }
                
                public org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup remove(int i)
                {
                    org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup old = SurveyImpl.this.getInstrumentSetupArray(i);
                    SurveyImpl.this.removeInstrumentSetup(i);
                    return old;
                }
                
                public int size()
                    { return SurveyImpl.this.sizeOfInstrumentSetupArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new InstrumentSetupList();
            }
        }
        
        /**
         * Gets array of all "InstrumentSetup" elements
         */
        public org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup[] getInstrumentSetupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INSTRUMENTSETUP$8, targetList);
                org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup[] result = new org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "InstrumentSetup" element
         */
        public org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup getInstrumentSetupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup target = null;
                target = (org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup)get_store().find_element_user(INSTRUMENTSETUP$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "InstrumentSetup" element
         */
        public int sizeOfInstrumentSetupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INSTRUMENTSETUP$8);
            }
        }
        
        /**
         * Sets array of all "InstrumentSetup" element
         */
        public void setInstrumentSetupArray(org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup[] instrumentSetupArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(instrumentSetupArray, INSTRUMENTSETUP$8);
            }
        }
        
        /**
         * Sets ith "InstrumentSetup" element
         */
        public void setInstrumentSetupArray(int i, org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup instrumentSetup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup target = null;
                target = (org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup)get_store().find_element_user(INSTRUMENTSETUP$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(instrumentSetup);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "InstrumentSetup" element
         */
        public org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup insertNewInstrumentSetup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup target = null;
                target = (org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup)get_store().insert_element_user(INSTRUMENTSETUP$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "InstrumentSetup" element
         */
        public org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup addNewInstrumentSetup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup target = null;
                target = (org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup)get_store().add_element_user(INSTRUMENTSETUP$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "InstrumentSetup" element
         */
        public void removeInstrumentSetup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INSTRUMENTSETUP$8, i);
            }
        }
        
        /**
         * Gets a List of "LaserSetup" elements
         */
        public java.util.List<org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup> getLaserSetupList()
        {
            final class LaserSetupList extends java.util.AbstractList<org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup>
            {
                public org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup get(int i)
                    { return SurveyImpl.this.getLaserSetupArray(i); }
                
                public org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup set(int i, org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup o)
                {
                    org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup old = SurveyImpl.this.getLaserSetupArray(i);
                    SurveyImpl.this.setLaserSetupArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup o)
                    { SurveyImpl.this.insertNewLaserSetup(i).set(o); }
                
                public org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup remove(int i)
                {
                    org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup old = SurveyImpl.this.getLaserSetupArray(i);
                    SurveyImpl.this.removeLaserSetup(i);
                    return old;
                }
                
                public int size()
                    { return SurveyImpl.this.sizeOfLaserSetupArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LaserSetupList();
            }
        }
        
        /**
         * Gets array of all "LaserSetup" elements
         */
        public org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup[] getLaserSetupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LASERSETUP$10, targetList);
                org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup[] result = new org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "LaserSetup" element
         */
        public org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup getLaserSetupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup target = null;
                target = (org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup)get_store().find_element_user(LASERSETUP$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "LaserSetup" element
         */
        public int sizeOfLaserSetupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LASERSETUP$10);
            }
        }
        
        /**
         * Sets array of all "LaserSetup" element
         */
        public void setLaserSetupArray(org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup[] laserSetupArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(laserSetupArray, LASERSETUP$10);
            }
        }
        
        /**
         * Sets ith "LaserSetup" element
         */
        public void setLaserSetupArray(int i, org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup laserSetup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup target = null;
                target = (org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup)get_store().find_element_user(LASERSETUP$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(laserSetup);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "LaserSetup" element
         */
        public org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup insertNewLaserSetup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup target = null;
                target = (org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup)get_store().insert_element_user(LASERSETUP$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "LaserSetup" element
         */
        public org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup addNewLaserSetup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup target = null;
                target = (org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup)get_store().add_element_user(LASERSETUP$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "LaserSetup" element
         */
        public void removeLaserSetup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LASERSETUP$10, i);
            }
        }
        
        /**
         * Gets a List of "GPSSetup" elements
         */
        public java.util.List<org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup> getGPSSetupList()
        {
            final class GPSSetupList extends java.util.AbstractList<org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup>
            {
                public org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup get(int i)
                    { return SurveyImpl.this.getGPSSetupArray(i); }
                
                public org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup set(int i, org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup o)
                {
                    org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup old = SurveyImpl.this.getGPSSetupArray(i);
                    SurveyImpl.this.setGPSSetupArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup o)
                    { SurveyImpl.this.insertNewGPSSetup(i).set(o); }
                
                public org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup remove(int i)
                {
                    org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup old = SurveyImpl.this.getGPSSetupArray(i);
                    SurveyImpl.this.removeGPSSetup(i);
                    return old;
                }
                
                public int size()
                    { return SurveyImpl.this.sizeOfGPSSetupArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new GPSSetupList();
            }
        }
        
        /**
         * Gets array of all "GPSSetup" elements
         */
        public org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup[] getGPSSetupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GPSSETUP$12, targetList);
                org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup[] result = new org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "GPSSetup" element
         */
        public org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup getGPSSetupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup target = null;
                target = (org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup)get_store().find_element_user(GPSSETUP$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "GPSSetup" element
         */
        public int sizeOfGPSSetupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GPSSETUP$12);
            }
        }
        
        /**
         * Sets array of all "GPSSetup" element
         */
        public void setGPSSetupArray(org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup[] gpsSetupArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(gpsSetupArray, GPSSETUP$12);
            }
        }
        
        /**
         * Sets ith "GPSSetup" element
         */
        public void setGPSSetupArray(int i, org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup gpsSetup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup target = null;
                target = (org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup)get_store().find_element_user(GPSSETUP$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(gpsSetup);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GPSSetup" element
         */
        public org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup insertNewGPSSetup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup target = null;
                target = (org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup)get_store().insert_element_user(GPSSETUP$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GPSSetup" element
         */
        public org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup addNewGPSSetup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup target = null;
                target = (org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup)get_store().add_element_user(GPSSETUP$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "GPSSetup" element
         */
        public void removeGPSSetup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GPSSETUP$12, i);
            }
        }
        
        /**
         * Gets a List of "TargetSetup" elements
         */
        public java.util.List<org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup> getTargetSetupList()
        {
            final class TargetSetupList extends java.util.AbstractList<org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup>
            {
                public org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup get(int i)
                    { return SurveyImpl.this.getTargetSetupArray(i); }
                
                public org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup set(int i, org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup o)
                {
                    org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup old = SurveyImpl.this.getTargetSetupArray(i);
                    SurveyImpl.this.setTargetSetupArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup o)
                    { SurveyImpl.this.insertNewTargetSetup(i).set(o); }
                
                public org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup remove(int i)
                {
                    org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup old = SurveyImpl.this.getTargetSetupArray(i);
                    SurveyImpl.this.removeTargetSetup(i);
                    return old;
                }
                
                public int size()
                    { return SurveyImpl.this.sizeOfTargetSetupArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new TargetSetupList();
            }
        }
        
        /**
         * Gets array of all "TargetSetup" elements
         */
        public org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup[] getTargetSetupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TARGETSETUP$14, targetList);
                org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup[] result = new org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "TargetSetup" element
         */
        public org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup getTargetSetupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup target = null;
                target = (org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup)get_store().find_element_user(TARGETSETUP$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "TargetSetup" element
         */
        public int sizeOfTargetSetupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TARGETSETUP$14);
            }
        }
        
        /**
         * Sets array of all "TargetSetup" element
         */
        public void setTargetSetupArray(org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup[] targetSetupArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(targetSetupArray, TARGETSETUP$14);
            }
        }
        
        /**
         * Sets ith "TargetSetup" element
         */
        public void setTargetSetupArray(int i, org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup targetSetup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup target = null;
                target = (org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup)get_store().find_element_user(TARGETSETUP$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(targetSetup);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TargetSetup" element
         */
        public org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup insertNewTargetSetup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup target = null;
                target = (org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup)get_store().insert_element_user(TARGETSETUP$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TargetSetup" element
         */
        public org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup addNewTargetSetup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup target = null;
                target = (org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup)get_store().add_element_user(TARGETSETUP$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "TargetSetup" element
         */
        public void removeTargetSetup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TARGETSETUP$14, i);
            }
        }
        
        /**
         * Gets a List of "GPSVector" elements
         */
        public java.util.List<org.landxml.schema.landXML11.GPSVectorDocument.GPSVector> getGPSVectorList()
        {
            final class GPSVectorList extends java.util.AbstractList<org.landxml.schema.landXML11.GPSVectorDocument.GPSVector>
            {
                public org.landxml.schema.landXML11.GPSVectorDocument.GPSVector get(int i)
                    { return SurveyImpl.this.getGPSVectorArray(i); }
                
                public org.landxml.schema.landXML11.GPSVectorDocument.GPSVector set(int i, org.landxml.schema.landXML11.GPSVectorDocument.GPSVector o)
                {
                    org.landxml.schema.landXML11.GPSVectorDocument.GPSVector old = SurveyImpl.this.getGPSVectorArray(i);
                    SurveyImpl.this.setGPSVectorArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.GPSVectorDocument.GPSVector o)
                    { SurveyImpl.this.insertNewGPSVector(i).set(o); }
                
                public org.landxml.schema.landXML11.GPSVectorDocument.GPSVector remove(int i)
                {
                    org.landxml.schema.landXML11.GPSVectorDocument.GPSVector old = SurveyImpl.this.getGPSVectorArray(i);
                    SurveyImpl.this.removeGPSVector(i);
                    return old;
                }
                
                public int size()
                    { return SurveyImpl.this.sizeOfGPSVectorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new GPSVectorList();
            }
        }
        
        /**
         * Gets array of all "GPSVector" elements
         */
        public org.landxml.schema.landXML11.GPSVectorDocument.GPSVector[] getGPSVectorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GPSVECTOR$16, targetList);
                org.landxml.schema.landXML11.GPSVectorDocument.GPSVector[] result = new org.landxml.schema.landXML11.GPSVectorDocument.GPSVector[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "GPSVector" element
         */
        public org.landxml.schema.landXML11.GPSVectorDocument.GPSVector getGPSVectorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSVectorDocument.GPSVector target = null;
                target = (org.landxml.schema.landXML11.GPSVectorDocument.GPSVector)get_store().find_element_user(GPSVECTOR$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "GPSVector" element
         */
        public int sizeOfGPSVectorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GPSVECTOR$16);
            }
        }
        
        /**
         * Sets array of all "GPSVector" element
         */
        public void setGPSVectorArray(org.landxml.schema.landXML11.GPSVectorDocument.GPSVector[] gpsVectorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(gpsVectorArray, GPSVECTOR$16);
            }
        }
        
        /**
         * Sets ith "GPSVector" element
         */
        public void setGPSVectorArray(int i, org.landxml.schema.landXML11.GPSVectorDocument.GPSVector gpsVector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSVectorDocument.GPSVector target = null;
                target = (org.landxml.schema.landXML11.GPSVectorDocument.GPSVector)get_store().find_element_user(GPSVECTOR$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(gpsVector);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GPSVector" element
         */
        public org.landxml.schema.landXML11.GPSVectorDocument.GPSVector insertNewGPSVector(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSVectorDocument.GPSVector target = null;
                target = (org.landxml.schema.landXML11.GPSVectorDocument.GPSVector)get_store().insert_element_user(GPSVECTOR$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GPSVector" element
         */
        public org.landxml.schema.landXML11.GPSVectorDocument.GPSVector addNewGPSVector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSVectorDocument.GPSVector target = null;
                target = (org.landxml.schema.landXML11.GPSVectorDocument.GPSVector)get_store().add_element_user(GPSVECTOR$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "GPSVector" element
         */
        public void removeGPSVector(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GPSVECTOR$16, i);
            }
        }
        
        /**
         * Gets a List of "GPSPosition" elements
         */
        public java.util.List<org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition> getGPSPositionList()
        {
            final class GPSPositionList extends java.util.AbstractList<org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition>
            {
                public org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition get(int i)
                    { return SurveyImpl.this.getGPSPositionArray(i); }
                
                public org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition set(int i, org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition o)
                {
                    org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition old = SurveyImpl.this.getGPSPositionArray(i);
                    SurveyImpl.this.setGPSPositionArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition o)
                    { SurveyImpl.this.insertNewGPSPosition(i).set(o); }
                
                public org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition remove(int i)
                {
                    org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition old = SurveyImpl.this.getGPSPositionArray(i);
                    SurveyImpl.this.removeGPSPosition(i);
                    return old;
                }
                
                public int size()
                    { return SurveyImpl.this.sizeOfGPSPositionArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new GPSPositionList();
            }
        }
        
        /**
         * Gets array of all "GPSPosition" elements
         */
        public org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition[] getGPSPositionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GPSPOSITION$18, targetList);
                org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition[] result = new org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "GPSPosition" element
         */
        public org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition getGPSPositionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition target = null;
                target = (org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition)get_store().find_element_user(GPSPOSITION$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "GPSPosition" element
         */
        public int sizeOfGPSPositionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GPSPOSITION$18);
            }
        }
        
        /**
         * Sets array of all "GPSPosition" element
         */
        public void setGPSPositionArray(org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition[] gpsPositionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(gpsPositionArray, GPSPOSITION$18);
            }
        }
        
        /**
         * Sets ith "GPSPosition" element
         */
        public void setGPSPositionArray(int i, org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition gpsPosition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition target = null;
                target = (org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition)get_store().find_element_user(GPSPOSITION$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(gpsPosition);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GPSPosition" element
         */
        public org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition insertNewGPSPosition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition target = null;
                target = (org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition)get_store().insert_element_user(GPSPOSITION$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GPSPosition" element
         */
        public org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition addNewGPSPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition target = null;
                target = (org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition)get_store().add_element_user(GPSPOSITION$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "GPSPosition" element
         */
        public void removeGPSPosition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GPSPOSITION$18, i);
            }
        }
        
        /**
         * Gets a List of "ObservationGroup" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup> getObservationGroupList()
        {
            final class ObservationGroupList extends java.util.AbstractList<org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup>
            {
                public org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup get(int i)
                    { return SurveyImpl.this.getObservationGroupArray(i); }
                
                public org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup set(int i, org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup o)
                {
                    org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup old = SurveyImpl.this.getObservationGroupArray(i);
                    SurveyImpl.this.setObservationGroupArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup o)
                    { SurveyImpl.this.insertNewObservationGroup(i).set(o); }
                
                public org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup remove(int i)
                {
                    org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup old = SurveyImpl.this.getObservationGroupArray(i);
                    SurveyImpl.this.removeObservationGroup(i);
                    return old;
                }
                
                public int size()
                    { return SurveyImpl.this.sizeOfObservationGroupArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ObservationGroupList();
            }
        }
        
        /**
         * Gets array of all "ObservationGroup" elements
         */
        public org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup[] getObservationGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OBSERVATIONGROUP$20, targetList);
                org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup[] result = new org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ObservationGroup" element
         */
        public org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup getObservationGroupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup target = null;
                target = (org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup)get_store().find_element_user(OBSERVATIONGROUP$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ObservationGroup" element
         */
        public int sizeOfObservationGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OBSERVATIONGROUP$20);
            }
        }
        
        /**
         * Sets array of all "ObservationGroup" element
         */
        public void setObservationGroupArray(org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup[] observationGroupArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(observationGroupArray, OBSERVATIONGROUP$20);
            }
        }
        
        /**
         * Sets ith "ObservationGroup" element
         */
        public void setObservationGroupArray(int i, org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup observationGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup target = null;
                target = (org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup)get_store().find_element_user(OBSERVATIONGROUP$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(observationGroup);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ObservationGroup" element
         */
        public org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup insertNewObservationGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup target = null;
                target = (org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup)get_store().insert_element_user(OBSERVATIONGROUP$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ObservationGroup" element
         */
        public org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup addNewObservationGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup target = null;
                target = (org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup)get_store().add_element_user(OBSERVATIONGROUP$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "ObservationGroup" element
         */
        public void removeObservationGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OBSERVATIONGROUP$20, i);
            }
        }
        
        /**
         * Gets a List of "ControlChecks" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks> getControlChecksList()
        {
            final class ControlChecksList extends java.util.AbstractList<org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks>
            {
                public org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks get(int i)
                    { return SurveyImpl.this.getControlChecksArray(i); }
                
                public org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks set(int i, org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks o)
                {
                    org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks old = SurveyImpl.this.getControlChecksArray(i);
                    SurveyImpl.this.setControlChecksArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks o)
                    { SurveyImpl.this.insertNewControlChecks(i).set(o); }
                
                public org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks remove(int i)
                {
                    org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks old = SurveyImpl.this.getControlChecksArray(i);
                    SurveyImpl.this.removeControlChecks(i);
                    return old;
                }
                
                public int size()
                    { return SurveyImpl.this.sizeOfControlChecksArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ControlChecksList();
            }
        }
        
        /**
         * Gets array of all "ControlChecks" elements
         */
        public org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks[] getControlChecksArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONTROLCHECKS$22, targetList);
                org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks[] result = new org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ControlChecks" element
         */
        public org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks getControlChecksArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks target = null;
                target = (org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks)get_store().find_element_user(CONTROLCHECKS$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ControlChecks" element
         */
        public int sizeOfControlChecksArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTROLCHECKS$22);
            }
        }
        
        /**
         * Sets array of all "ControlChecks" element
         */
        public void setControlChecksArray(org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks[] controlChecksArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(controlChecksArray, CONTROLCHECKS$22);
            }
        }
        
        /**
         * Sets ith "ControlChecks" element
         */
        public void setControlChecksArray(int i, org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks controlChecks)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks target = null;
                target = (org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks)get_store().find_element_user(CONTROLCHECKS$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(controlChecks);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ControlChecks" element
         */
        public org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks insertNewControlChecks(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks target = null;
                target = (org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks)get_store().insert_element_user(CONTROLCHECKS$22, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ControlChecks" element
         */
        public org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks addNewControlChecks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks target = null;
                target = (org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks)get_store().add_element_user(CONTROLCHECKS$22);
                return target;
            }
        }
        
        /**
         * Removes the ith "ControlChecks" element
         */
        public void removeControlChecks(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTROLCHECKS$22, i);
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
                    { return SurveyImpl.this.getFieldNoteArray(i); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote set(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = SurveyImpl.this.getFieldNoteArray(i);
                    SurveyImpl.this.setFieldNoteArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                    { SurveyImpl.this.insertNewFieldNote(i).set(o); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote remove(int i)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = SurveyImpl.this.getFieldNoteArray(i);
                    SurveyImpl.this.removeFieldNote(i);
                    return old;
                }
                
                public int size()
                    { return SurveyImpl.this.sizeOfFieldNoteArray(); }
                
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
                get_store().find_all_element_users(FIELDNOTE$24, targetList);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().find_element_user(FIELDNOTE$24, i);
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
                return get_store().count_elements(FIELDNOTE$24);
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
                arraySetterHelper(fieldNoteArray, FIELDNOTE$24);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().find_element_user(FIELDNOTE$24, i);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().insert_element_user(FIELDNOTE$24, i);
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
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().add_element_user(FIELDNOTE$24);
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
                get_store().remove_element(FIELDNOTE$24, i);
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
                    { return SurveyImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = SurveyImpl.this.getFeatureArray(i);
                    SurveyImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { SurveyImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = SurveyImpl.this.getFeatureArray(i);
                    SurveyImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return SurveyImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$26, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$26, i);
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
                return get_store().count_elements(FEATURE$26);
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
                arraySetterHelper(featureArray, FEATURE$26);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$26, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$26, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$26);
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
                get_store().remove_element(FEATURE$26, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$28);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$28);
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
                return get_store().find_attribute_user(DESC$28) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$28);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$28);
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
                get_store().remove_attribute(DESC$28);
            }
        }
        
        /**
         * Gets the "date" attribute
         */
        public java.util.Calendar getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$30);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "date" attribute
         */
        public org.apache.xmlbeans.XmlDate xgetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(DATE$30);
                return target;
            }
        }
        
        /**
         * True if has "date" attribute
         */
        public boolean isSetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DATE$30) != null;
            }
        }
        
        /**
         * Sets the "date" attribute
         */
        public void setDate(java.util.Calendar date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATE$30);
                }
                target.setCalendarValue(date);
            }
        }
        
        /**
         * Sets (as xml) the "date" attribute
         */
        public void xsetDate(org.apache.xmlbeans.XmlDate date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(DATE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(DATE$30);
                }
                target.set(date);
            }
        }
        
        /**
         * Unsets the "date" attribute
         */
        public void unsetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DATE$30);
            }
        }
        
        /**
         * Gets the "startTime" attribute
         */
        public java.util.Calendar getStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTTIME$32);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "startTime" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(STARTTIME$32);
                return target;
            }
        }
        
        /**
         * True if has "startTime" attribute
         */
        public boolean isSetStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STARTTIME$32) != null;
            }
        }
        
        /**
         * Sets the "startTime" attribute
         */
        public void setStartTime(java.util.Calendar startTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTTIME$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTTIME$32);
                }
                target.setCalendarValue(startTime);
            }
        }
        
        /**
         * Sets (as xml) the "startTime" attribute
         */
        public void xsetStartTime(org.apache.xmlbeans.XmlDateTime startTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(STARTTIME$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(STARTTIME$32);
                }
                target.set(startTime);
            }
        }
        
        /**
         * Unsets the "startTime" attribute
         */
        public void unsetStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STARTTIME$32);
            }
        }
        
        /**
         * Gets the "endTime" attribute
         */
        public java.util.Calendar getEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDTIME$34);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "endTime" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(ENDTIME$34);
                return target;
            }
        }
        
        /**
         * True if has "endTime" attribute
         */
        public boolean isSetEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENDTIME$34) != null;
            }
        }
        
        /**
         * Sets the "endTime" attribute
         */
        public void setEndTime(java.util.Calendar endTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDTIME$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDTIME$34);
                }
                target.setCalendarValue(endTime);
            }
        }
        
        /**
         * Sets (as xml) the "endTime" attribute
         */
        public void xsetEndTime(org.apache.xmlbeans.XmlDateTime endTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(ENDTIME$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(ENDTIME$34);
                }
                target.set(endTime);
            }
        }
        
        /**
         * Unsets the "endTime" attribute
         */
        public void unsetEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENDTIME$34);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$36);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$36);
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
                return get_store().find_attribute_user(STATE$36) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$36);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$36);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$36);
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
                get_store().remove_attribute(STATE$36);
            }
        }
        
        /**
         * Gets the "horizontalAccuracy" attribute
         */
        public java.lang.String getHorizontalAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTALACCURACY$38);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "horizontalAccuracy" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHorizontalAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HORIZONTALACCURACY$38);
                return target;
            }
        }
        
        /**
         * True if has "horizontalAccuracy" attribute
         */
        public boolean isSetHorizontalAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HORIZONTALACCURACY$38) != null;
            }
        }
        
        /**
         * Sets the "horizontalAccuracy" attribute
         */
        public void setHorizontalAccuracy(java.lang.String horizontalAccuracy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTALACCURACY$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORIZONTALACCURACY$38);
                }
                target.setStringValue(horizontalAccuracy);
            }
        }
        
        /**
         * Sets (as xml) the "horizontalAccuracy" attribute
         */
        public void xsetHorizontalAccuracy(org.apache.xmlbeans.XmlString horizontalAccuracy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HORIZONTALACCURACY$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HORIZONTALACCURACY$38);
                }
                target.set(horizontalAccuracy);
            }
        }
        
        /**
         * Unsets the "horizontalAccuracy" attribute
         */
        public void unsetHorizontalAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HORIZONTALACCURACY$38);
            }
        }
        
        /**
         * Gets the "verticalAccuracy" attribute
         */
        public java.lang.String getVerticalAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALACCURACY$40);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "verticalAccuracy" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVerticalAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERTICALACCURACY$40);
                return target;
            }
        }
        
        /**
         * True if has "verticalAccuracy" attribute
         */
        public boolean isSetVerticalAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VERTICALACCURACY$40) != null;
            }
        }
        
        /**
         * Sets the "verticalAccuracy" attribute
         */
        public void setVerticalAccuracy(java.lang.String verticalAccuracy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALACCURACY$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTICALACCURACY$40);
                }
                target.setStringValue(verticalAccuracy);
            }
        }
        
        /**
         * Sets (as xml) the "verticalAccuracy" attribute
         */
        public void xsetVerticalAccuracy(org.apache.xmlbeans.XmlString verticalAccuracy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERTICALACCURACY$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERTICALACCURACY$40);
                }
                target.set(verticalAccuracy);
            }
        }
        
        /**
         * Unsets the "verticalAccuracy" attribute
         */
        public void unsetVerticalAccuracy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VERTICALACCURACY$40);
            }
        }
    }
}
