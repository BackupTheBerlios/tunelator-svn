/*
 * An XML document type.
 * Localname: Roadway
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.RoadwayDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one Roadway(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface RoadwayDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RoadwayDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("roadway6011doctype");
    
    /**
     * Gets the "Roadway" element
     */
    org.landxml.schema.landXML11.RoadwayDocument.Roadway getRoadway();
    
    /**
     * Sets the "Roadway" element
     */
    void setRoadway(org.landxml.schema.landXML11.RoadwayDocument.Roadway roadway);
    
    /**
     * Appends and returns a new empty "Roadway" element
     */
    org.landxml.schema.landXML11.RoadwayDocument.Roadway addNewRoadway();
    
    /**
     * An XML Roadway(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface Roadway extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Roadway.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("roadwayc4acelemtype");
        
        /**
         * Gets a List of "Classification" elements
         */
        java.util.List<org.landxml.schema.landXML11.ClassificationDocument.Classification> getClassificationList();
        
        /**
         * Gets array of all "Classification" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ClassificationDocument.Classification[] getClassificationArray();
        
        /**
         * Gets ith "Classification" element
         */
        org.landxml.schema.landXML11.ClassificationDocument.Classification getClassificationArray(int i);
        
        /**
         * Returns number of "Classification" element
         */
        int sizeOfClassificationArray();
        
        /**
         * Sets array of all "Classification" element
         */
        void setClassificationArray(org.landxml.schema.landXML11.ClassificationDocument.Classification[] classificationArray);
        
        /**
         * Sets ith "Classification" element
         */
        void setClassificationArray(int i, org.landxml.schema.landXML11.ClassificationDocument.Classification classification);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Classification" element
         */
        org.landxml.schema.landXML11.ClassificationDocument.Classification insertNewClassification(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Classification" element
         */
        org.landxml.schema.landXML11.ClassificationDocument.Classification addNewClassification();
        
        /**
         * Removes the ith "Classification" element
         */
        void removeClassification(int i);
        
        /**
         * Gets a List of "Lanes" elements
         */
        java.util.List<org.landxml.schema.landXML11.LanesDocument.Lanes> getLanesList();
        
        /**
         * Gets array of all "Lanes" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.LanesDocument.Lanes[] getLanesArray();
        
        /**
         * Gets ith "Lanes" element
         */
        org.landxml.schema.landXML11.LanesDocument.Lanes getLanesArray(int i);
        
        /**
         * Returns number of "Lanes" element
         */
        int sizeOfLanesArray();
        
        /**
         * Sets array of all "Lanes" element
         */
        void setLanesArray(org.landxml.schema.landXML11.LanesDocument.Lanes[] lanesArray);
        
        /**
         * Sets ith "Lanes" element
         */
        void setLanesArray(int i, org.landxml.schema.landXML11.LanesDocument.Lanes lanes);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Lanes" element
         */
        org.landxml.schema.landXML11.LanesDocument.Lanes insertNewLanes(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Lanes" element
         */
        org.landxml.schema.landXML11.LanesDocument.Lanes addNewLanes();
        
        /**
         * Removes the ith "Lanes" element
         */
        void removeLanes(int i);
        
        /**
         * Gets a List of "Roadside" elements
         */
        java.util.List<org.landxml.schema.landXML11.RoadsideDocument.Roadside> getRoadsideList();
        
        /**
         * Gets array of all "Roadside" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.RoadsideDocument.Roadside[] getRoadsideArray();
        
        /**
         * Gets ith "Roadside" element
         */
        org.landxml.schema.landXML11.RoadsideDocument.Roadside getRoadsideArray(int i);
        
        /**
         * Returns number of "Roadside" element
         */
        int sizeOfRoadsideArray();
        
        /**
         * Sets array of all "Roadside" element
         */
        void setRoadsideArray(org.landxml.schema.landXML11.RoadsideDocument.Roadside[] roadsideArray);
        
        /**
         * Sets ith "Roadside" element
         */
        void setRoadsideArray(int i, org.landxml.schema.landXML11.RoadsideDocument.Roadside roadside);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Roadside" element
         */
        org.landxml.schema.landXML11.RoadsideDocument.Roadside insertNewRoadside(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Roadside" element
         */
        org.landxml.schema.landXML11.RoadsideDocument.Roadside addNewRoadside();
        
        /**
         * Removes the ith "Roadside" element
         */
        void removeRoadside(int i);
        
        /**
         * Gets a List of "Speeds" elements
         */
        java.util.List<org.landxml.schema.landXML11.SpeedsDocument.Speeds> getSpeedsList();
        
        /**
         * Gets array of all "Speeds" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.SpeedsDocument.Speeds[] getSpeedsArray();
        
        /**
         * Gets ith "Speeds" element
         */
        org.landxml.schema.landXML11.SpeedsDocument.Speeds getSpeedsArray(int i);
        
        /**
         * Returns number of "Speeds" element
         */
        int sizeOfSpeedsArray();
        
        /**
         * Sets array of all "Speeds" element
         */
        void setSpeedsArray(org.landxml.schema.landXML11.SpeedsDocument.Speeds[] speedsArray);
        
        /**
         * Sets ith "Speeds" element
         */
        void setSpeedsArray(int i, org.landxml.schema.landXML11.SpeedsDocument.Speeds speeds);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Speeds" element
         */
        org.landxml.schema.landXML11.SpeedsDocument.Speeds insertNewSpeeds(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Speeds" element
         */
        org.landxml.schema.landXML11.SpeedsDocument.Speeds addNewSpeeds();
        
        /**
         * Removes the ith "Speeds" element
         */
        void removeSpeeds(int i);
        
        /**
         * Gets a List of "NoPassingZone" elements
         */
        java.util.List<org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone> getNoPassingZoneList();
        
        /**
         * Gets array of all "NoPassingZone" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone[] getNoPassingZoneArray();
        
        /**
         * Gets ith "NoPassingZone" element
         */
        org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone getNoPassingZoneArray(int i);
        
        /**
         * Returns number of "NoPassingZone" element
         */
        int sizeOfNoPassingZoneArray();
        
        /**
         * Sets array of all "NoPassingZone" element
         */
        void setNoPassingZoneArray(org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone[] noPassingZoneArray);
        
        /**
         * Sets ith "NoPassingZone" element
         */
        void setNoPassingZoneArray(int i, org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone noPassingZone);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "NoPassingZone" element
         */
        org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone insertNewNoPassingZone(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "NoPassingZone" element
         */
        org.landxml.schema.landXML11.NoPassingZoneDocument.NoPassingZone addNewNoPassingZone();
        
        /**
         * Removes the ith "NoPassingZone" element
         */
        void removeNoPassingZone(int i);
        
        /**
         * Gets a List of "TrafficVolume" elements
         */
        java.util.List<org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume> getTrafficVolumeList();
        
        /**
         * Gets array of all "TrafficVolume" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume[] getTrafficVolumeArray();
        
        /**
         * Gets ith "TrafficVolume" element
         */
        org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume getTrafficVolumeArray(int i);
        
        /**
         * Returns number of "TrafficVolume" element
         */
        int sizeOfTrafficVolumeArray();
        
        /**
         * Sets array of all "TrafficVolume" element
         */
        void setTrafficVolumeArray(org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume[] trafficVolumeArray);
        
        /**
         * Sets ith "TrafficVolume" element
         */
        void setTrafficVolumeArray(int i, org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume trafficVolume);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TrafficVolume" element
         */
        org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume insertNewTrafficVolume(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TrafficVolume" element
         */
        org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume addNewTrafficVolume();
        
        /**
         * Removes the ith "TrafficVolume" element
         */
        void removeTrafficVolume(int i);
        
        /**
         * Gets a List of "CrashData" elements
         */
        java.util.List<org.landxml.schema.landXML11.CrashDataDocument.CrashData> getCrashDataList();
        
        /**
         * Gets array of all "CrashData" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.CrashDataDocument.CrashData[] getCrashDataArray();
        
        /**
         * Gets ith "CrashData" element
         */
        org.landxml.schema.landXML11.CrashDataDocument.CrashData getCrashDataArray(int i);
        
        /**
         * Returns number of "CrashData" element
         */
        int sizeOfCrashDataArray();
        
        /**
         * Sets array of all "CrashData" element
         */
        void setCrashDataArray(org.landxml.schema.landXML11.CrashDataDocument.CrashData[] crashDataArray);
        
        /**
         * Sets ith "CrashData" element
         */
        void setCrashDataArray(int i, org.landxml.schema.landXML11.CrashDataDocument.CrashData crashData);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CrashData" element
         */
        org.landxml.schema.landXML11.CrashDataDocument.CrashData insertNewCrashData(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CrashData" element
         */
        org.landxml.schema.landXML11.CrashDataDocument.CrashData addNewCrashData();
        
        /**
         * Removes the ith "CrashData" element
         */
        void removeCrashData(int i);
        
        /**
         * Gets a List of "DecisionSightDistance" elements
         */
        java.util.List<org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance> getDecisionSightDistanceList();
        
        /**
         * Gets array of all "DecisionSightDistance" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance[] getDecisionSightDistanceArray();
        
        /**
         * Gets ith "DecisionSightDistance" element
         */
        org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance getDecisionSightDistanceArray(int i);
        
        /**
         * Returns number of "DecisionSightDistance" element
         */
        int sizeOfDecisionSightDistanceArray();
        
        /**
         * Sets array of all "DecisionSightDistance" element
         */
        void setDecisionSightDistanceArray(org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance[] decisionSightDistanceArray);
        
        /**
         * Sets ith "DecisionSightDistance" element
         */
        void setDecisionSightDistanceArray(int i, org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance decisionSightDistance);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DecisionSightDistance" element
         */
        org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance insertNewDecisionSightDistance(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DecisionSightDistance" element
         */
        org.landxml.schema.landXML11.DecisionSightDistanceDocument.DecisionSightDistance addNewDecisionSightDistance();
        
        /**
         * Removes the ith "DecisionSightDistance" element
         */
        void removeDecisionSightDistance(int i);
        
        /**
         * Gets a List of "BridgeElement" elements
         */
        java.util.List<org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement> getBridgeElementList();
        
        /**
         * Gets array of all "BridgeElement" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement[] getBridgeElementArray();
        
        /**
         * Gets ith "BridgeElement" element
         */
        org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement getBridgeElementArray(int i);
        
        /**
         * Returns number of "BridgeElement" element
         */
        int sizeOfBridgeElementArray();
        
        /**
         * Sets array of all "BridgeElement" element
         */
        void setBridgeElementArray(org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement[] bridgeElementArray);
        
        /**
         * Sets ith "BridgeElement" element
         */
        void setBridgeElementArray(int i, org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement bridgeElement);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BridgeElement" element
         */
        org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement insertNewBridgeElement(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BridgeElement" element
         */
        org.landxml.schema.landXML11.BridgeElementDocument.BridgeElement addNewBridgeElement();
        
        /**
         * Removes the ith "BridgeElement" element
         */
        void removeBridgeElement(int i);
        
        /**
         * Gets a List of "PlanFeature" elements
         */
        java.util.List<org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature> getPlanFeatureList();
        
        /**
         * Gets array of all "PlanFeature" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature[] getPlanFeatureArray();
        
        /**
         * Gets ith "PlanFeature" element
         */
        org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature getPlanFeatureArray(int i);
        
        /**
         * Returns number of "PlanFeature" element
         */
        int sizeOfPlanFeatureArray();
        
        /**
         * Sets array of all "PlanFeature" element
         */
        void setPlanFeatureArray(org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature[] planFeatureArray);
        
        /**
         * Sets ith "PlanFeature" element
         */
        void setPlanFeatureArray(int i, org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature planFeature);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PlanFeature" element
         */
        org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature insertNewPlanFeature(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PlanFeature" element
         */
        org.landxml.schema.landXML11.PlanFeatureDocument.PlanFeature addNewPlanFeature();
        
        /**
         * Removes the ith "PlanFeature" element
         */
        void removePlanFeature(int i);
        
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
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "alignmentRefs" attribute
         */
        java.util.List getAlignmentRefs();
        
        /**
         * Gets (as xml) the "alignmentRefs" attribute
         */
        org.landxml.schema.landXML11.AlignmentNameRefs xgetAlignmentRefs();
        
        /**
         * Sets the "alignmentRefs" attribute
         */
        void setAlignmentRefs(java.util.List alignmentRefs);
        
        /**
         * Sets (as xml) the "alignmentRefs" attribute
         */
        void xsetAlignmentRefs(org.landxml.schema.landXML11.AlignmentNameRefs alignmentRefs);
        
        /**
         * Gets the "surfaceRefs" attribute
         */
        java.util.List getSurfaceRefs();
        
        /**
         * Gets (as xml) the "surfaceRefs" attribute
         */
        org.landxml.schema.landXML11.SurfaceNameRefs xgetSurfaceRefs();
        
        /**
         * True if has "surfaceRefs" attribute
         */
        boolean isSetSurfaceRefs();
        
        /**
         * Sets the "surfaceRefs" attribute
         */
        void setSurfaceRefs(java.util.List surfaceRefs);
        
        /**
         * Sets (as xml) the "surfaceRefs" attribute
         */
        void xsetSurfaceRefs(org.landxml.schema.landXML11.SurfaceNameRefs surfaceRefs);
        
        /**
         * Unsets the "surfaceRefs" attribute
         */
        void unsetSurfaceRefs();
        
        /**
         * Gets the "gradeModelRefs" attribute
         */
        java.util.List getGradeModelRefs();
        
        /**
         * Gets (as xml) the "gradeModelRefs" attribute
         */
        org.landxml.schema.landXML11.GradeModelNameRefs xgetGradeModelRefs();
        
        /**
         * True if has "gradeModelRefs" attribute
         */
        boolean isSetGradeModelRefs();
        
        /**
         * Sets the "gradeModelRefs" attribute
         */
        void setGradeModelRefs(java.util.List gradeModelRefs);
        
        /**
         * Sets (as xml) the "gradeModelRefs" attribute
         */
        void xsetGradeModelRefs(org.landxml.schema.landXML11.GradeModelNameRefs gradeModelRefs);
        
        /**
         * Unsets the "gradeModelRefs" attribute
         */
        void unsetGradeModelRefs();
        
        /**
         * Gets the "staStart" attribute
         */
        double getStaStart();
        
        /**
         * Gets (as xml) the "staStart" attribute
         */
        org.landxml.schema.landXML11.Station xgetStaStart();
        
        /**
         * True if has "staStart" attribute
         */
        boolean isSetStaStart();
        
        /**
         * Sets the "staStart" attribute
         */
        void setStaStart(double staStart);
        
        /**
         * Sets (as xml) the "staStart" attribute
         */
        void xsetStaStart(org.landxml.schema.landXML11.Station staStart);
        
        /**
         * Unsets the "staStart" attribute
         */
        void unsetStaStart();
        
        /**
         * Gets the "staEnd" attribute
         */
        double getStaEnd();
        
        /**
         * Gets (as xml) the "staEnd" attribute
         */
        org.landxml.schema.landXML11.Station xgetStaEnd();
        
        /**
         * True if has "staEnd" attribute
         */
        boolean isSetStaEnd();
        
        /**
         * Sets the "staEnd" attribute
         */
        void setStaEnd(double staEnd);
        
        /**
         * Sets (as xml) the "staEnd" attribute
         */
        void xsetStaEnd(org.landxml.schema.landXML11.Station staEnd);
        
        /**
         * Unsets the "staEnd" attribute
         */
        void unsetStaEnd();
        
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
         * Gets the "roadTerrain" attribute
         */
        org.landxml.schema.landXML11.RoadTerrainType.Enum getRoadTerrain();
        
        /**
         * Gets (as xml) the "roadTerrain" attribute
         */
        org.landxml.schema.landXML11.RoadTerrainType xgetRoadTerrain();
        
        /**
         * True if has "roadTerrain" attribute
         */
        boolean isSetRoadTerrain();
        
        /**
         * Sets the "roadTerrain" attribute
         */
        void setRoadTerrain(org.landxml.schema.landXML11.RoadTerrainType.Enum roadTerrain);
        
        /**
         * Sets (as xml) the "roadTerrain" attribute
         */
        void xsetRoadTerrain(org.landxml.schema.landXML11.RoadTerrainType roadTerrain);
        
        /**
         * Unsets the "roadTerrain" attribute
         */
        void unsetRoadTerrain();
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.RoadwayDocument.Roadway newInstance() {
              return (org.landxml.schema.landXML11.RoadwayDocument.Roadway) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.RoadwayDocument.Roadway newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.RoadwayDocument.Roadway) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.RoadwayDocument newInstance() {
          return (org.landxml.schema.landXML11.RoadwayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.RoadwayDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.RoadwayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.RoadwayDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RoadwayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadwayDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RoadwayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.RoadwayDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadwayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadwayDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadwayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.RoadwayDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadwayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadwayDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadwayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.RoadwayDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadwayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadwayDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadwayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.RoadwayDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadwayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadwayDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadwayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.RoadwayDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RoadwayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadwayDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RoadwayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.RoadwayDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RoadwayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadwayDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RoadwayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.RoadwayDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.RoadwayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.RoadwayDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.RoadwayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
