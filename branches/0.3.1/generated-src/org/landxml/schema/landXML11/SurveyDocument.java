/*
 * An XML document type.
 * Localname: Survey
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.SurveyDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one Survey(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface SurveyDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SurveyDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("survey4beedoctype");
    
    /**
     * Gets the "Survey" element
     */
    org.landxml.schema.landXML11.SurveyDocument.Survey getSurvey();
    
    /**
     * Sets the "Survey" element
     */
    void setSurvey(org.landxml.schema.landXML11.SurveyDocument.Survey survey);
    
    /**
     * Appends and returns a new empty "Survey" element
     */
    org.landxml.schema.landXML11.SurveyDocument.Survey addNewSurvey();
    
    /**
     * An XML Survey(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface Survey extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Survey.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("survey8618elemtype");
        
        /**
         * Gets the "SurveyHeader" element
         */
        org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader getSurveyHeader();
        
        /**
         * Sets the "SurveyHeader" element
         */
        void setSurveyHeader(org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader surveyHeader);
        
        /**
         * Appends and returns a new empty "SurveyHeader" element
         */
        org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader addNewSurveyHeader();
        
        /**
         * Gets the "Equipment" element
         */
        org.landxml.schema.landXML11.EquipmentDocument.Equipment getEquipment();
        
        /**
         * True if has "Equipment" element
         */
        boolean isSetEquipment();
        
        /**
         * Sets the "Equipment" element
         */
        void setEquipment(org.landxml.schema.landXML11.EquipmentDocument.Equipment equipment);
        
        /**
         * Appends and returns a new empty "Equipment" element
         */
        org.landxml.schema.landXML11.EquipmentDocument.Equipment addNewEquipment();
        
        /**
         * Unsets the "Equipment" element
         */
        void unsetEquipment();
        
        /**
         * Gets a List of "SurveyMonument" elements
         */
        java.util.List<org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument> getSurveyMonumentList();
        
        /**
         * Gets array of all "SurveyMonument" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument[] getSurveyMonumentArray();
        
        /**
         * Gets ith "SurveyMonument" element
         */
        org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument getSurveyMonumentArray(int i);
        
        /**
         * Returns number of "SurveyMonument" element
         */
        int sizeOfSurveyMonumentArray();
        
        /**
         * Sets array of all "SurveyMonument" element
         */
        void setSurveyMonumentArray(org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument[] surveyMonumentArray);
        
        /**
         * Sets ith "SurveyMonument" element
         */
        void setSurveyMonumentArray(int i, org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument surveyMonument);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SurveyMonument" element
         */
        org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument insertNewSurveyMonument(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SurveyMonument" element
         */
        org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument addNewSurveyMonument();
        
        /**
         * Removes the ith "SurveyMonument" element
         */
        void removeSurveyMonument(int i);
        
        /**
         * Gets a List of "CgPoints" elements
         */
        java.util.List<org.landxml.schema.landXML11.CgPointsDocument.CgPoints> getCgPointsList();
        
        /**
         * Gets array of all "CgPoints" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.CgPointsDocument.CgPoints[] getCgPointsArray();
        
        /**
         * Gets ith "CgPoints" element
         */
        org.landxml.schema.landXML11.CgPointsDocument.CgPoints getCgPointsArray(int i);
        
        /**
         * Returns number of "CgPoints" element
         */
        int sizeOfCgPointsArray();
        
        /**
         * Sets array of all "CgPoints" element
         */
        void setCgPointsArray(org.landxml.schema.landXML11.CgPointsDocument.CgPoints[] cgPointsArray);
        
        /**
         * Sets ith "CgPoints" element
         */
        void setCgPointsArray(int i, org.landxml.schema.landXML11.CgPointsDocument.CgPoints cgPoints);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CgPoints" element
         */
        org.landxml.schema.landXML11.CgPointsDocument.CgPoints insertNewCgPoints(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CgPoints" element
         */
        org.landxml.schema.landXML11.CgPointsDocument.CgPoints addNewCgPoints();
        
        /**
         * Removes the ith "CgPoints" element
         */
        void removeCgPoints(int i);
        
        /**
         * Gets a List of "InstrumentSetup" elements
         */
        java.util.List<org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup> getInstrumentSetupList();
        
        /**
         * Gets array of all "InstrumentSetup" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup[] getInstrumentSetupArray();
        
        /**
         * Gets ith "InstrumentSetup" element
         */
        org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup getInstrumentSetupArray(int i);
        
        /**
         * Returns number of "InstrumentSetup" element
         */
        int sizeOfInstrumentSetupArray();
        
        /**
         * Sets array of all "InstrumentSetup" element
         */
        void setInstrumentSetupArray(org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup[] instrumentSetupArray);
        
        /**
         * Sets ith "InstrumentSetup" element
         */
        void setInstrumentSetupArray(int i, org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup instrumentSetup);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "InstrumentSetup" element
         */
        org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup insertNewInstrumentSetup(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "InstrumentSetup" element
         */
        org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup addNewInstrumentSetup();
        
        /**
         * Removes the ith "InstrumentSetup" element
         */
        void removeInstrumentSetup(int i);
        
        /**
         * Gets a List of "LaserSetup" elements
         */
        java.util.List<org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup> getLaserSetupList();
        
        /**
         * Gets array of all "LaserSetup" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup[] getLaserSetupArray();
        
        /**
         * Gets ith "LaserSetup" element
         */
        org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup getLaserSetupArray(int i);
        
        /**
         * Returns number of "LaserSetup" element
         */
        int sizeOfLaserSetupArray();
        
        /**
         * Sets array of all "LaserSetup" element
         */
        void setLaserSetupArray(org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup[] laserSetupArray);
        
        /**
         * Sets ith "LaserSetup" element
         */
        void setLaserSetupArray(int i, org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup laserSetup);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "LaserSetup" element
         */
        org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup insertNewLaserSetup(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "LaserSetup" element
         */
        org.landxml.schema.landXML11.LaserSetupDocument.LaserSetup addNewLaserSetup();
        
        /**
         * Removes the ith "LaserSetup" element
         */
        void removeLaserSetup(int i);
        
        /**
         * Gets a List of "GPSSetup" elements
         */
        java.util.List<org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup> getGPSSetupList();
        
        /**
         * Gets array of all "GPSSetup" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup[] getGPSSetupArray();
        
        /**
         * Gets ith "GPSSetup" element
         */
        org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup getGPSSetupArray(int i);
        
        /**
         * Returns number of "GPSSetup" element
         */
        int sizeOfGPSSetupArray();
        
        /**
         * Sets array of all "GPSSetup" element
         */
        void setGPSSetupArray(org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup[] gpsSetupArray);
        
        /**
         * Sets ith "GPSSetup" element
         */
        void setGPSSetupArray(int i, org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup gpsSetup);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GPSSetup" element
         */
        org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup insertNewGPSSetup(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GPSSetup" element
         */
        org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup addNewGPSSetup();
        
        /**
         * Removes the ith "GPSSetup" element
         */
        void removeGPSSetup(int i);
        
        /**
         * Gets a List of "TargetSetup" elements
         */
        java.util.List<org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup> getTargetSetupList();
        
        /**
         * Gets array of all "TargetSetup" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup[] getTargetSetupArray();
        
        /**
         * Gets ith "TargetSetup" element
         */
        org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup getTargetSetupArray(int i);
        
        /**
         * Returns number of "TargetSetup" element
         */
        int sizeOfTargetSetupArray();
        
        /**
         * Sets array of all "TargetSetup" element
         */
        void setTargetSetupArray(org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup[] targetSetupArray);
        
        /**
         * Sets ith "TargetSetup" element
         */
        void setTargetSetupArray(int i, org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup targetSetup);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TargetSetup" element
         */
        org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup insertNewTargetSetup(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TargetSetup" element
         */
        org.landxml.schema.landXML11.TargetSetupDocument.TargetSetup addNewTargetSetup();
        
        /**
         * Removes the ith "TargetSetup" element
         */
        void removeTargetSetup(int i);
        
        /**
         * Gets a List of "GPSVector" elements
         */
        java.util.List<org.landxml.schema.landXML11.GPSVectorDocument.GPSVector> getGPSVectorList();
        
        /**
         * Gets array of all "GPSVector" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.GPSVectorDocument.GPSVector[] getGPSVectorArray();
        
        /**
         * Gets ith "GPSVector" element
         */
        org.landxml.schema.landXML11.GPSVectorDocument.GPSVector getGPSVectorArray(int i);
        
        /**
         * Returns number of "GPSVector" element
         */
        int sizeOfGPSVectorArray();
        
        /**
         * Sets array of all "GPSVector" element
         */
        void setGPSVectorArray(org.landxml.schema.landXML11.GPSVectorDocument.GPSVector[] gpsVectorArray);
        
        /**
         * Sets ith "GPSVector" element
         */
        void setGPSVectorArray(int i, org.landxml.schema.landXML11.GPSVectorDocument.GPSVector gpsVector);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GPSVector" element
         */
        org.landxml.schema.landXML11.GPSVectorDocument.GPSVector insertNewGPSVector(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GPSVector" element
         */
        org.landxml.schema.landXML11.GPSVectorDocument.GPSVector addNewGPSVector();
        
        /**
         * Removes the ith "GPSVector" element
         */
        void removeGPSVector(int i);
        
        /**
         * Gets a List of "GPSPosition" elements
         */
        java.util.List<org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition> getGPSPositionList();
        
        /**
         * Gets array of all "GPSPosition" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition[] getGPSPositionArray();
        
        /**
         * Gets ith "GPSPosition" element
         */
        org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition getGPSPositionArray(int i);
        
        /**
         * Returns number of "GPSPosition" element
         */
        int sizeOfGPSPositionArray();
        
        /**
         * Sets array of all "GPSPosition" element
         */
        void setGPSPositionArray(org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition[] gpsPositionArray);
        
        /**
         * Sets ith "GPSPosition" element
         */
        void setGPSPositionArray(int i, org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition gpsPosition);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GPSPosition" element
         */
        org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition insertNewGPSPosition(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GPSPosition" element
         */
        org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition addNewGPSPosition();
        
        /**
         * Removes the ith "GPSPosition" element
         */
        void removeGPSPosition(int i);
        
        /**
         * Gets a List of "ObservationGroup" elements
         */
        java.util.List<org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup> getObservationGroupList();
        
        /**
         * Gets array of all "ObservationGroup" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup[] getObservationGroupArray();
        
        /**
         * Gets ith "ObservationGroup" element
         */
        org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup getObservationGroupArray(int i);
        
        /**
         * Returns number of "ObservationGroup" element
         */
        int sizeOfObservationGroupArray();
        
        /**
         * Sets array of all "ObservationGroup" element
         */
        void setObservationGroupArray(org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup[] observationGroupArray);
        
        /**
         * Sets ith "ObservationGroup" element
         */
        void setObservationGroupArray(int i, org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup observationGroup);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ObservationGroup" element
         */
        org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup insertNewObservationGroup(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ObservationGroup" element
         */
        org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup addNewObservationGroup();
        
        /**
         * Removes the ith "ObservationGroup" element
         */
        void removeObservationGroup(int i);
        
        /**
         * Gets a List of "ControlChecks" elements
         */
        java.util.List<org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks> getControlChecksList();
        
        /**
         * Gets array of all "ControlChecks" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks[] getControlChecksArray();
        
        /**
         * Gets ith "ControlChecks" element
         */
        org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks getControlChecksArray(int i);
        
        /**
         * Returns number of "ControlChecks" element
         */
        int sizeOfControlChecksArray();
        
        /**
         * Sets array of all "ControlChecks" element
         */
        void setControlChecksArray(org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks[] controlChecksArray);
        
        /**
         * Sets ith "ControlChecks" element
         */
        void setControlChecksArray(int i, org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks controlChecks);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ControlChecks" element
         */
        org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks insertNewControlChecks(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ControlChecks" element
         */
        org.landxml.schema.landXML11.ControlChecksDocument.ControlChecks addNewControlChecks();
        
        /**
         * Removes the ith "ControlChecks" element
         */
        void removeControlChecks(int i);
        
        /**
         * Gets a List of "FieldNote" elements
         */
        java.util.List<org.landxml.schema.landXML11.FieldNoteDocument.FieldNote> getFieldNoteList();
        
        /**
         * Gets array of all "FieldNote" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.FieldNoteDocument.FieldNote[] getFieldNoteArray();
        
        /**
         * Gets ith "FieldNote" element
         */
        org.landxml.schema.landXML11.FieldNoteDocument.FieldNote getFieldNoteArray(int i);
        
        /**
         * Returns number of "FieldNote" element
         */
        int sizeOfFieldNoteArray();
        
        /**
         * Sets array of all "FieldNote" element
         */
        void setFieldNoteArray(org.landxml.schema.landXML11.FieldNoteDocument.FieldNote[] fieldNoteArray);
        
        /**
         * Sets ith "FieldNote" element
         */
        void setFieldNoteArray(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote fieldNote);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "FieldNote" element
         */
        org.landxml.schema.landXML11.FieldNoteDocument.FieldNote insertNewFieldNote(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "FieldNote" element
         */
        org.landxml.schema.landXML11.FieldNoteDocument.FieldNote addNewFieldNote();
        
        /**
         * Removes the ith "FieldNote" element
         */
        void removeFieldNote(int i);
        
        /**
         * Gets a List of "Feature" elements
         */
        java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList();
        
        /**
         * Gets array of all "Feature" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.FeatureDocument.Feature[] getFeatureArray();
        
        /**
         * Gets ith "Feature" element
         */
        org.landxml.schema.landXML11.FeatureDocument.Feature getFeatureArray(int i);
        
        /**
         * Returns number of "Feature" element
         */
        int sizeOfFeatureArray();
        
        /**
         * Sets array of all "Feature" element
         */
        void setFeatureArray(org.landxml.schema.landXML11.FeatureDocument.Feature[] featureArray);
        
        /**
         * Sets ith "Feature" element
         */
        void setFeatureArray(int i, org.landxml.schema.landXML11.FeatureDocument.Feature feature);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Feature" element
         */
        org.landxml.schema.landXML11.FeatureDocument.Feature insertNewFeature(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Feature" element
         */
        org.landxml.schema.landXML11.FeatureDocument.Feature addNewFeature();
        
        /**
         * Removes the ith "Feature" element
         */
        void removeFeature(int i);
        
        /**
         * Gets the "desc" attribute
         */
        java.lang.String getDesc();
        
        /**
         * Gets (as xml) the "desc" attribute
         */
        org.apache.xmlbeans.XmlString xgetDesc();
        
        /**
         * True if has "desc" attribute
         */
        boolean isSetDesc();
        
        /**
         * Sets the "desc" attribute
         */
        void setDesc(java.lang.String desc);
        
        /**
         * Sets (as xml) the "desc" attribute
         */
        void xsetDesc(org.apache.xmlbeans.XmlString desc);
        
        /**
         * Unsets the "desc" attribute
         */
        void unsetDesc();
        
        /**
         * Gets the "date" attribute
         */
        java.util.Calendar getDate();
        
        /**
         * Gets (as xml) the "date" attribute
         */
        org.apache.xmlbeans.XmlDate xgetDate();
        
        /**
         * True if has "date" attribute
         */
        boolean isSetDate();
        
        /**
         * Sets the "date" attribute
         */
        void setDate(java.util.Calendar date);
        
        /**
         * Sets (as xml) the "date" attribute
         */
        void xsetDate(org.apache.xmlbeans.XmlDate date);
        
        /**
         * Unsets the "date" attribute
         */
        void unsetDate();
        
        /**
         * Gets the "startTime" attribute
         */
        java.util.Calendar getStartTime();
        
        /**
         * Gets (as xml) the "startTime" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetStartTime();
        
        /**
         * True if has "startTime" attribute
         */
        boolean isSetStartTime();
        
        /**
         * Sets the "startTime" attribute
         */
        void setStartTime(java.util.Calendar startTime);
        
        /**
         * Sets (as xml) the "startTime" attribute
         */
        void xsetStartTime(org.apache.xmlbeans.XmlDateTime startTime);
        
        /**
         * Unsets the "startTime" attribute
         */
        void unsetStartTime();
        
        /**
         * Gets the "endTime" attribute
         */
        java.util.Calendar getEndTime();
        
        /**
         * Gets (as xml) the "endTime" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetEndTime();
        
        /**
         * True if has "endTime" attribute
         */
        boolean isSetEndTime();
        
        /**
         * Sets the "endTime" attribute
         */
        void setEndTime(java.util.Calendar endTime);
        
        /**
         * Sets (as xml) the "endTime" attribute
         */
        void xsetEndTime(org.apache.xmlbeans.XmlDateTime endTime);
        
        /**
         * Unsets the "endTime" attribute
         */
        void unsetEndTime();
        
        /**
         * Gets the "state" attribute
         */
        org.landxml.schema.landXML11.StateType.Enum getState();
        
        /**
         * Gets (as xml) the "state" attribute
         */
        org.landxml.schema.landXML11.StateType xgetState();
        
        /**
         * True if has "state" attribute
         */
        boolean isSetState();
        
        /**
         * Sets the "state" attribute
         */
        void setState(org.landxml.schema.landXML11.StateType.Enum state);
        
        /**
         * Sets (as xml) the "state" attribute
         */
        void xsetState(org.landxml.schema.landXML11.StateType state);
        
        /**
         * Unsets the "state" attribute
         */
        void unsetState();
        
        /**
         * Gets the "horizontalAccuracy" attribute
         */
        java.lang.String getHorizontalAccuracy();
        
        /**
         * Gets (as xml) the "horizontalAccuracy" attribute
         */
        org.apache.xmlbeans.XmlString xgetHorizontalAccuracy();
        
        /**
         * True if has "horizontalAccuracy" attribute
         */
        boolean isSetHorizontalAccuracy();
        
        /**
         * Sets the "horizontalAccuracy" attribute
         */
        void setHorizontalAccuracy(java.lang.String horizontalAccuracy);
        
        /**
         * Sets (as xml) the "horizontalAccuracy" attribute
         */
        void xsetHorizontalAccuracy(org.apache.xmlbeans.XmlString horizontalAccuracy);
        
        /**
         * Unsets the "horizontalAccuracy" attribute
         */
        void unsetHorizontalAccuracy();
        
        /**
         * Gets the "verticalAccuracy" attribute
         */
        java.lang.String getVerticalAccuracy();
        
        /**
         * Gets (as xml) the "verticalAccuracy" attribute
         */
        org.apache.xmlbeans.XmlString xgetVerticalAccuracy();
        
        /**
         * True if has "verticalAccuracy" attribute
         */
        boolean isSetVerticalAccuracy();
        
        /**
         * Sets the "verticalAccuracy" attribute
         */
        void setVerticalAccuracy(java.lang.String verticalAccuracy);
        
        /**
         * Sets (as xml) the "verticalAccuracy" attribute
         */
        void xsetVerticalAccuracy(org.apache.xmlbeans.XmlString verticalAccuracy);
        
        /**
         * Unsets the "verticalAccuracy" attribute
         */
        void unsetVerticalAccuracy();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.SurveyDocument.Survey newInstance() {
              return (org.landxml.schema.landXML11.SurveyDocument.Survey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.SurveyDocument.Survey newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.SurveyDocument.Survey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.SurveyDocument newInstance() {
          return (org.landxml.schema.landXML11.SurveyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.SurveyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.SurveyDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SurveyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SurveyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.SurveyDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.SurveyDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.SurveyDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.SurveyDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.SurveyDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SurveyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SurveyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.SurveyDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SurveyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SurveyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.SurveyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.SurveyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.SurveyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.SurveyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
