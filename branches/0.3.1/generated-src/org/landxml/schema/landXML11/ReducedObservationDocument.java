/*
 * An XML document type.
 * Localname: ReducedObservation
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ReducedObservationDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one ReducedObservation(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface ReducedObservationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReducedObservationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("reducedobservationaba2doctype");
    
    /**
     * Gets the "ReducedObservation" element
     */
    org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation getReducedObservation();
    
    /**
     * Sets the "ReducedObservation" element
     */
    void setReducedObservation(org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation reducedObservation);
    
    /**
     * Appends and returns a new empty "ReducedObservation" element
     */
    org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation addNewReducedObservation();
    
    /**
     * An XML ReducedObservation(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface ReducedObservation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReducedObservation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("reducedobservation5618elemtype");
        
        /**
         * Gets the "TargetPoint" element
         */
        org.landxml.schema.landXML11.PointType getTargetPoint();
        
        /**
         * True if has "TargetPoint" element
         */
        boolean isSetTargetPoint();
        
        /**
         * Sets the "TargetPoint" element
         */
        void setTargetPoint(org.landxml.schema.landXML11.PointType targetPoint);
        
        /**
         * Appends and returns a new empty "TargetPoint" element
         */
        org.landxml.schema.landXML11.PointType addNewTargetPoint();
        
        /**
         * Unsets the "TargetPoint" element
         */
        void unsetTargetPoint();
        
        /**
         * Gets the "OffsetVals" element
         */
        org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals getOffsetVals();
        
        /**
         * True if has "OffsetVals" element
         */
        boolean isSetOffsetVals();
        
        /**
         * Sets the "OffsetVals" element
         */
        void setOffsetVals(org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals offsetVals);
        
        /**
         * Appends and returns a new empty "OffsetVals" element
         */
        org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals addNewOffsetVals();
        
        /**
         * Unsets the "OffsetVals" element
         */
        void unsetOffsetVals();
        
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
         * Gets the "purpose" attribute
         */
        org.landxml.schema.landXML11.PurposeType.Enum getPurpose();
        
        /**
         * Gets (as xml) the "purpose" attribute
         */
        org.landxml.schema.landXML11.PurposeType xgetPurpose();
        
        /**
         * True if has "purpose" attribute
         */
        boolean isSetPurpose();
        
        /**
         * Sets the "purpose" attribute
         */
        void setPurpose(org.landxml.schema.landXML11.PurposeType.Enum purpose);
        
        /**
         * Sets (as xml) the "purpose" attribute
         */
        void xsetPurpose(org.landxml.schema.landXML11.PurposeType purpose);
        
        /**
         * Unsets the "purpose" attribute
         */
        void unsetPurpose();
        
        /**
         * Gets the "setupID" attribute
         */
        java.lang.String getSetupID();
        
        /**
         * Gets (as xml) the "setupID" attribute
         */
        org.apache.xmlbeans.XmlIDREF xgetSetupID();
        
        /**
         * True if has "setupID" attribute
         */
        boolean isSetSetupID();
        
        /**
         * Sets the "setupID" attribute
         */
        void setSetupID(java.lang.String setupID);
        
        /**
         * Sets (as xml) the "setupID" attribute
         */
        void xsetSetupID(org.apache.xmlbeans.XmlIDREF setupID);
        
        /**
         * Unsets the "setupID" attribute
         */
        void unsetSetupID();
        
        /**
         * Gets the "targetSetupID" attribute
         */
        java.lang.String getTargetSetupID();
        
        /**
         * Gets (as xml) the "targetSetupID" attribute
         */
        org.apache.xmlbeans.XmlIDREF xgetTargetSetupID();
        
        /**
         * True if has "targetSetupID" attribute
         */
        boolean isSetTargetSetupID();
        
        /**
         * Sets the "targetSetupID" attribute
         */
        void setTargetSetupID(java.lang.String targetSetupID);
        
        /**
         * Sets (as xml) the "targetSetupID" attribute
         */
        void xsetTargetSetupID(org.apache.xmlbeans.XmlIDREF targetSetupID);
        
        /**
         * Unsets the "targetSetupID" attribute
         */
        void unsetTargetSetupID();
        
        /**
         * Gets the "setID" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType getSetID();
        
        /**
         * True if has "setID" attribute
         */
        boolean isSetSetID();
        
        /**
         * Sets the "setID" attribute
         */
        void setSetID(org.apache.xmlbeans.XmlAnySimpleType setID);
        
        /**
         * Appends and returns a new empty "setID" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType addNewSetID();
        
        /**
         * Unsets the "setID" attribute
         */
        void unsetSetID();
        
        /**
         * Gets the "targetHeight" attribute
         */
        double getTargetHeight();
        
        /**
         * Gets (as xml) the "targetHeight" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetTargetHeight();
        
        /**
         * True if has "targetHeight" attribute
         */
        boolean isSetTargetHeight();
        
        /**
         * Sets the "targetHeight" attribute
         */
        void setTargetHeight(double targetHeight);
        
        /**
         * Sets (as xml) the "targetHeight" attribute
         */
        void xsetTargetHeight(org.apache.xmlbeans.XmlDouble targetHeight);
        
        /**
         * Unsets the "targetHeight" attribute
         */
        void unsetTargetHeight();
        
        /**
         * Gets the "azimuth" attribute
         */
        double getAzimuth();
        
        /**
         * Gets (as xml) the "azimuth" attribute
         */
        org.landxml.schema.landXML11.Direction xgetAzimuth();
        
        /**
         * True if has "azimuth" attribute
         */
        boolean isSetAzimuth();
        
        /**
         * Sets the "azimuth" attribute
         */
        void setAzimuth(double azimuth);
        
        /**
         * Sets (as xml) the "azimuth" attribute
         */
        void xsetAzimuth(org.landxml.schema.landXML11.Direction azimuth);
        
        /**
         * Unsets the "azimuth" attribute
         */
        void unsetAzimuth();
        
        /**
         * Gets the "horizDistance" attribute
         */
        double getHorizDistance();
        
        /**
         * Gets (as xml) the "horizDistance" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetHorizDistance();
        
        /**
         * True if has "horizDistance" attribute
         */
        boolean isSetHorizDistance();
        
        /**
         * Sets the "horizDistance" attribute
         */
        void setHorizDistance(double horizDistance);
        
        /**
         * Sets (as xml) the "horizDistance" attribute
         */
        void xsetHorizDistance(org.apache.xmlbeans.XmlDouble horizDistance);
        
        /**
         * Unsets the "horizDistance" attribute
         */
        void unsetHorizDistance();
        
        /**
         * Gets the "vertDistance" attribute
         */
        double getVertDistance();
        
        /**
         * Gets (as xml) the "vertDistance" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetVertDistance();
        
        /**
         * True if has "vertDistance" attribute
         */
        boolean isSetVertDistance();
        
        /**
         * Sets the "vertDistance" attribute
         */
        void setVertDistance(double vertDistance);
        
        /**
         * Sets (as xml) the "vertDistance" attribute
         */
        void xsetVertDistance(org.apache.xmlbeans.XmlDouble vertDistance);
        
        /**
         * Unsets the "vertDistance" attribute
         */
        void unsetVertDistance();
        
        /**
         * Gets the "horizAngle" attribute
         */
        double getHorizAngle();
        
        /**
         * Gets (as xml) the "horizAngle" attribute
         */
        org.landxml.schema.landXML11.Angle xgetHorizAngle();
        
        /**
         * True if has "horizAngle" attribute
         */
        boolean isSetHorizAngle();
        
        /**
         * Sets the "horizAngle" attribute
         */
        void setHorizAngle(double horizAngle);
        
        /**
         * Sets (as xml) the "horizAngle" attribute
         */
        void xsetHorizAngle(org.landxml.schema.landXML11.Angle horizAngle);
        
        /**
         * Unsets the "horizAngle" attribute
         */
        void unsetHorizAngle();
        
        /**
         * Gets the "slopeDistance" attribute
         */
        double getSlopeDistance();
        
        /**
         * Gets (as xml) the "slopeDistance" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSlopeDistance();
        
        /**
         * True if has "slopeDistance" attribute
         */
        boolean isSetSlopeDistance();
        
        /**
         * Sets the "slopeDistance" attribute
         */
        void setSlopeDistance(double slopeDistance);
        
        /**
         * Sets (as xml) the "slopeDistance" attribute
         */
        void xsetSlopeDistance(org.apache.xmlbeans.XmlDouble slopeDistance);
        
        /**
         * Unsets the "slopeDistance" attribute
         */
        void unsetSlopeDistance();
        
        /**
         * Gets the "zenithAngle" attribute
         */
        double getZenithAngle();
        
        /**
         * Gets (as xml) the "zenithAngle" attribute
         */
        org.landxml.schema.landXML11.ZenithAngle xgetZenithAngle();
        
        /**
         * True if has "zenithAngle" attribute
         */
        boolean isSetZenithAngle();
        
        /**
         * Sets the "zenithAngle" attribute
         */
        void setZenithAngle(double zenithAngle);
        
        /**
         * Sets (as xml) the "zenithAngle" attribute
         */
        void xsetZenithAngle(org.landxml.schema.landXML11.ZenithAngle zenithAngle);
        
        /**
         * Unsets the "zenithAngle" attribute
         */
        void unsetZenithAngle();
        
        /**
         * Gets the "equipmentUsed" attribute
         */
        java.lang.String getEquipmentUsed();
        
        /**
         * Gets (as xml) the "equipmentUsed" attribute
         */
        org.landxml.schema.landXML11.EquipmentType xgetEquipmentUsed();
        
        /**
         * True if has "equipmentUsed" attribute
         */
        boolean isSetEquipmentUsed();
        
        /**
         * Sets the "equipmentUsed" attribute
         */
        void setEquipmentUsed(java.lang.String equipmentUsed);
        
        /**
         * Sets (as xml) the "equipmentUsed" attribute
         */
        void xsetEquipmentUsed(org.landxml.schema.landXML11.EquipmentType equipmentUsed);
        
        /**
         * Unsets the "equipmentUsed" attribute
         */
        void unsetEquipmentUsed();
        
        /**
         * Gets the "azimuthAccuracy" attribute
         */
        double getAzimuthAccuracy();
        
        /**
         * Gets (as xml) the "azimuthAccuracy" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetAzimuthAccuracy();
        
        /**
         * True if has "azimuthAccuracy" attribute
         */
        boolean isSetAzimuthAccuracy();
        
        /**
         * Sets the "azimuthAccuracy" attribute
         */
        void setAzimuthAccuracy(double azimuthAccuracy);
        
        /**
         * Sets (as xml) the "azimuthAccuracy" attribute
         */
        void xsetAzimuthAccuracy(org.apache.xmlbeans.XmlDouble azimuthAccuracy);
        
        /**
         * Unsets the "azimuthAccuracy" attribute
         */
        void unsetAzimuthAccuracy();
        
        /**
         * Gets the "distanceAccuracy" attribute
         */
        double getDistanceAccuracy();
        
        /**
         * Gets (as xml) the "distanceAccuracy" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetDistanceAccuracy();
        
        /**
         * True if has "distanceAccuracy" attribute
         */
        boolean isSetDistanceAccuracy();
        
        /**
         * Sets the "distanceAccuracy" attribute
         */
        void setDistanceAccuracy(double distanceAccuracy);
        
        /**
         * Sets (as xml) the "distanceAccuracy" attribute
         */
        void xsetDistanceAccuracy(org.apache.xmlbeans.XmlDouble distanceAccuracy);
        
        /**
         * Unsets the "distanceAccuracy" attribute
         */
        void unsetDistanceAccuracy();
        
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
         * Gets the "distanceType" attribute
         */
        java.lang.String getDistanceType();
        
        /**
         * Gets (as xml) the "distanceType" attribute
         */
        org.landxml.schema.landXML11.ObservationType xgetDistanceType();
        
        /**
         * True if has "distanceType" attribute
         */
        boolean isSetDistanceType();
        
        /**
         * Sets the "distanceType" attribute
         */
        void setDistanceType(java.lang.String distanceType);
        
        /**
         * Sets (as xml) the "distanceType" attribute
         */
        void xsetDistanceType(org.landxml.schema.landXML11.ObservationType distanceType);
        
        /**
         * Unsets the "distanceType" attribute
         */
        void unsetDistanceType();
        
        /**
         * Gets the "azimuthType" attribute
         */
        java.lang.String getAzimuthType();
        
        /**
         * Gets (as xml) the "azimuthType" attribute
         */
        org.landxml.schema.landXML11.ObservationType xgetAzimuthType();
        
        /**
         * True if has "azimuthType" attribute
         */
        boolean isSetAzimuthType();
        
        /**
         * Sets the "azimuthType" attribute
         */
        void setAzimuthType(java.lang.String azimuthType);
        
        /**
         * Sets (as xml) the "azimuthType" attribute
         */
        void xsetAzimuthType(org.landxml.schema.landXML11.ObservationType azimuthType);
        
        /**
         * Unsets the "azimuthType" attribute
         */
        void unsetAzimuthType();
        
        /**
         * Gets the "adoptedAzimuthSurvey" attribute
         */
        java.lang.String getAdoptedAzimuthSurvey();
        
        /**
         * Gets (as xml) the "adoptedAzimuthSurvey" attribute
         */
        org.apache.xmlbeans.XmlString xgetAdoptedAzimuthSurvey();
        
        /**
         * True if has "adoptedAzimuthSurvey" attribute
         */
        boolean isSetAdoptedAzimuthSurvey();
        
        /**
         * Sets the "adoptedAzimuthSurvey" attribute
         */
        void setAdoptedAzimuthSurvey(java.lang.String adoptedAzimuthSurvey);
        
        /**
         * Sets (as xml) the "adoptedAzimuthSurvey" attribute
         */
        void xsetAdoptedAzimuthSurvey(org.apache.xmlbeans.XmlString adoptedAzimuthSurvey);
        
        /**
         * Unsets the "adoptedAzimuthSurvey" attribute
         */
        void unsetAdoptedAzimuthSurvey();
        
        /**
         * Gets the "adoptedDistanceSurvey" attribute
         */
        java.lang.String getAdoptedDistanceSurvey();
        
        /**
         * Gets (as xml) the "adoptedDistanceSurvey" attribute
         */
        org.apache.xmlbeans.XmlString xgetAdoptedDistanceSurvey();
        
        /**
         * True if has "adoptedDistanceSurvey" attribute
         */
        boolean isSetAdoptedDistanceSurvey();
        
        /**
         * Sets the "adoptedDistanceSurvey" attribute
         */
        void setAdoptedDistanceSurvey(java.lang.String adoptedDistanceSurvey);
        
        /**
         * Sets (as xml) the "adoptedDistanceSurvey" attribute
         */
        void xsetAdoptedDistanceSurvey(org.apache.xmlbeans.XmlString adoptedDistanceSurvey);
        
        /**
         * Unsets the "adoptedDistanceSurvey" attribute
         */
        void unsetAdoptedDistanceSurvey();
        
        /**
         * Gets the "distanceAccClass" attribute
         */
        java.lang.String getDistanceAccClass();
        
        /**
         * Gets (as xml) the "distanceAccClass" attribute
         */
        org.apache.xmlbeans.XmlString xgetDistanceAccClass();
        
        /**
         * True if has "distanceAccClass" attribute
         */
        boolean isSetDistanceAccClass();
        
        /**
         * Sets the "distanceAccClass" attribute
         */
        void setDistanceAccClass(java.lang.String distanceAccClass);
        
        /**
         * Sets (as xml) the "distanceAccClass" attribute
         */
        void xsetDistanceAccClass(org.apache.xmlbeans.XmlString distanceAccClass);
        
        /**
         * Unsets the "distanceAccClass" attribute
         */
        void unsetDistanceAccClass();
        
        /**
         * Gets the "azimuthAccClass" attribute
         */
        java.lang.String getAzimuthAccClass();
        
        /**
         * Gets (as xml) the "azimuthAccClass" attribute
         */
        org.apache.xmlbeans.XmlString xgetAzimuthAccClass();
        
        /**
         * True if has "azimuthAccClass" attribute
         */
        boolean isSetAzimuthAccClass();
        
        /**
         * Sets the "azimuthAccClass" attribute
         */
        void setAzimuthAccClass(java.lang.String azimuthAccClass);
        
        /**
         * Sets (as xml) the "azimuthAccClass" attribute
         */
        void xsetAzimuthAccClass(org.apache.xmlbeans.XmlString azimuthAccClass);
        
        /**
         * Unsets the "azimuthAccClass" attribute
         */
        void unsetAzimuthAccClass();
        
        /**
         * Gets the "azimuthAdoptionFactor" attribute
         */
        double getAzimuthAdoptionFactor();
        
        /**
         * Gets (as xml) the "azimuthAdoptionFactor" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetAzimuthAdoptionFactor();
        
        /**
         * True if has "azimuthAdoptionFactor" attribute
         */
        boolean isSetAzimuthAdoptionFactor();
        
        /**
         * Sets the "azimuthAdoptionFactor" attribute
         */
        void setAzimuthAdoptionFactor(double azimuthAdoptionFactor);
        
        /**
         * Sets (as xml) the "azimuthAdoptionFactor" attribute
         */
        void xsetAzimuthAdoptionFactor(org.apache.xmlbeans.XmlDouble azimuthAdoptionFactor);
        
        /**
         * Unsets the "azimuthAdoptionFactor" attribute
         */
        void unsetAzimuthAdoptionFactor();
        
        /**
         * Gets the "distanceAdoptionFactor" attribute
         */
        double getDistanceAdoptionFactor();
        
        /**
         * Gets (as xml) the "distanceAdoptionFactor" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetDistanceAdoptionFactor();
        
        /**
         * True if has "distanceAdoptionFactor" attribute
         */
        boolean isSetDistanceAdoptionFactor();
        
        /**
         * Sets the "distanceAdoptionFactor" attribute
         */
        void setDistanceAdoptionFactor(double distanceAdoptionFactor);
        
        /**
         * Sets (as xml) the "distanceAdoptionFactor" attribute
         */
        void xsetDistanceAdoptionFactor(org.apache.xmlbeans.XmlDouble distanceAdoptionFactor);
        
        /**
         * Unsets the "distanceAdoptionFactor" attribute
         */
        void unsetDistanceAdoptionFactor();
        
        /**
         * Gets the "coordGeomRefs" attribute
         */
        java.util.List getCoordGeomRefs();
        
        /**
         * Gets (as xml) the "coordGeomRefs" attribute
         */
        org.landxml.schema.landXML11.CoordGeomNameRefs xgetCoordGeomRefs();
        
        /**
         * True if has "coordGeomRefs" attribute
         */
        boolean isSetCoordGeomRefs();
        
        /**
         * Sets the "coordGeomRefs" attribute
         */
        void setCoordGeomRefs(java.util.List coordGeomRefs);
        
        /**
         * Sets (as xml) the "coordGeomRefs" attribute
         */
        void xsetCoordGeomRefs(org.landxml.schema.landXML11.CoordGeomNameRefs coordGeomRefs);
        
        /**
         * Unsets the "coordGeomRefs" attribute
         */
        void unsetCoordGeomRefs();
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * True if has "name" attribute
         */
        boolean isSetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Unsets the "name" attribute
         */
        void unsetName();
        
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
         * Gets the "oID" attribute
         */
        java.lang.String getOID();
        
        /**
         * Gets (as xml) the "oID" attribute
         */
        org.apache.xmlbeans.XmlString xgetOID();
        
        /**
         * True if has "oID" attribute
         */
        boolean isSetOID();
        
        /**
         * Sets the "oID" attribute
         */
        void setOID(java.lang.String oid);
        
        /**
         * Sets (as xml) the "oID" attribute
         */
        void xsetOID(org.apache.xmlbeans.XmlString oid);
        
        /**
         * Unsets the "oID" attribute
         */
        void unsetOID();
        
        /**
         * Gets the "MSLDistance" attribute
         */
        java.lang.String getMSLDistance();
        
        /**
         * Gets (as xml) the "MSLDistance" attribute
         */
        org.apache.xmlbeans.XmlString xgetMSLDistance();
        
        /**
         * True if has "MSLDistance" attribute
         */
        boolean isSetMSLDistance();
        
        /**
         * Sets the "MSLDistance" attribute
         */
        void setMSLDistance(java.lang.String mslDistance);
        
        /**
         * Sets (as xml) the "MSLDistance" attribute
         */
        void xsetMSLDistance(org.apache.xmlbeans.XmlString mslDistance);
        
        /**
         * Unsets the "MSLDistance" attribute
         */
        void unsetMSLDistance();
        
        /**
         * Gets the "spherDistance" attribute
         */
        java.lang.String getSpherDistance();
        
        /**
         * Gets (as xml) the "spherDistance" attribute
         */
        org.apache.xmlbeans.XmlString xgetSpherDistance();
        
        /**
         * True if has "spherDistance" attribute
         */
        boolean isSetSpherDistance();
        
        /**
         * Sets the "spherDistance" attribute
         */
        void setSpherDistance(java.lang.String spherDistance);
        
        /**
         * Sets (as xml) the "spherDistance" attribute
         */
        void xsetSpherDistance(org.apache.xmlbeans.XmlString spherDistance);
        
        /**
         * Unsets the "spherDistance" attribute
         */
        void unsetSpherDistance();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation newInstance() {
              return (org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.ReducedObservationDocument newInstance() {
          return (org.landxml.schema.landXML11.ReducedObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.ReducedObservationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.ReducedObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.ReducedObservationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ReducedObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.ReducedObservationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ReducedObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.ReducedObservationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ReducedObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.ReducedObservationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ReducedObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.ReducedObservationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ReducedObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.ReducedObservationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ReducedObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.ReducedObservationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ReducedObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.ReducedObservationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ReducedObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.ReducedObservationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ReducedObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.ReducedObservationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ReducedObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.ReducedObservationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ReducedObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.ReducedObservationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ReducedObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.ReducedObservationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ReducedObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.ReducedObservationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ReducedObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ReducedObservationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ReducedObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ReducedObservationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ReducedObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
