/*
 * An XML document type.
 * Localname: ReducedArcObservation
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ReducedArcObservationDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one ReducedArcObservation(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface ReducedArcObservationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReducedArcObservationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("reducedarcobservation329adoctype");
    
    /**
     * Gets the "ReducedArcObservation" element
     */
    org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation getReducedArcObservation();
    
    /**
     * Sets the "ReducedArcObservation" element
     */
    void setReducedArcObservation(org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation reducedArcObservation);
    
    /**
     * Appends and returns a new empty "ReducedArcObservation" element
     */
    org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation addNewReducedArcObservation();
    
    /**
     * An XML ReducedArcObservation(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface ReducedArcObservation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReducedArcObservation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("reducedarcobservation8dbeelemtype");
        
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
         * Gets the "chordAzimuth" attribute
         */
        double getChordAzimuth();
        
        /**
         * Gets (as xml) the "chordAzimuth" attribute
         */
        org.landxml.schema.landXML11.Direction xgetChordAzimuth();
        
        /**
         * Sets the "chordAzimuth" attribute
         */
        void setChordAzimuth(double chordAzimuth);
        
        /**
         * Sets (as xml) the "chordAzimuth" attribute
         */
        void xsetChordAzimuth(org.landxml.schema.landXML11.Direction chordAzimuth);
        
        /**
         * Gets the "radius" attribute
         */
        double getRadius();
        
        /**
         * Gets (as xml) the "radius" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetRadius();
        
        /**
         * Sets the "radius" attribute
         */
        void setRadius(double radius);
        
        /**
         * Sets (as xml) the "radius" attribute
         */
        void xsetRadius(org.apache.xmlbeans.XmlDouble radius);
        
        /**
         * Gets the "length" attribute
         */
        double getLength();
        
        /**
         * Gets (as xml) the "length" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetLength();
        
        /**
         * Sets the "length" attribute
         */
        void setLength(double length);
        
        /**
         * Sets (as xml) the "length" attribute
         */
        void xsetLength(org.apache.xmlbeans.XmlDouble length);
        
        /**
         * Gets the "rot" attribute
         */
        org.landxml.schema.landXML11.Clockwise.Enum getRot();
        
        /**
         * Gets (as xml) the "rot" attribute
         */
        org.landxml.schema.landXML11.Clockwise xgetRot();
        
        /**
         * Sets the "rot" attribute
         */
        void setRot(org.landxml.schema.landXML11.Clockwise.Enum rot);
        
        /**
         * Sets (as xml) the "rot" attribute
         */
        void xsetRot(org.landxml.schema.landXML11.Clockwise rot);
        
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
         * Gets the "arcAzimuthAccuracy" attribute
         */
        double getArcAzimuthAccuracy();
        
        /**
         * Gets (as xml) the "arcAzimuthAccuracy" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetArcAzimuthAccuracy();
        
        /**
         * True if has "arcAzimuthAccuracy" attribute
         */
        boolean isSetArcAzimuthAccuracy();
        
        /**
         * Sets the "arcAzimuthAccuracy" attribute
         */
        void setArcAzimuthAccuracy(double arcAzimuthAccuracy);
        
        /**
         * Sets (as xml) the "arcAzimuthAccuracy" attribute
         */
        void xsetArcAzimuthAccuracy(org.apache.xmlbeans.XmlDouble arcAzimuthAccuracy);
        
        /**
         * Unsets the "arcAzimuthAccuracy" attribute
         */
        void unsetArcAzimuthAccuracy();
        
        /**
         * Gets the "arcLengthAccuracy" attribute
         */
        double getArcLengthAccuracy();
        
        /**
         * Gets (as xml) the "arcLengthAccuracy" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetArcLengthAccuracy();
        
        /**
         * True if has "arcLengthAccuracy" attribute
         */
        boolean isSetArcLengthAccuracy();
        
        /**
         * Sets the "arcLengthAccuracy" attribute
         */
        void setArcLengthAccuracy(double arcLengthAccuracy);
        
        /**
         * Sets (as xml) the "arcLengthAccuracy" attribute
         */
        void xsetArcLengthAccuracy(org.apache.xmlbeans.XmlDouble arcLengthAccuracy);
        
        /**
         * Unsets the "arcLengthAccuracy" attribute
         */
        void unsetArcLengthAccuracy();
        
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
         * Gets the "arcType" attribute
         */
        java.lang.String getArcType();
        
        /**
         * Gets (as xml) the "arcType" attribute
         */
        org.apache.xmlbeans.XmlString xgetArcType();
        
        /**
         * True if has "arcType" attribute
         */
        boolean isSetArcType();
        
        /**
         * Sets the "arcType" attribute
         */
        void setArcType(java.lang.String arcType);
        
        /**
         * Sets (as xml) the "arcType" attribute
         */
        void xsetArcType(org.apache.xmlbeans.XmlString arcType);
        
        /**
         * Unsets the "arcType" attribute
         */
        void unsetArcType();
        
        /**
         * Gets the "adoptedSurvey" attribute
         */
        java.lang.String getAdoptedSurvey();
        
        /**
         * Gets (as xml) the "adoptedSurvey" attribute
         */
        org.apache.xmlbeans.XmlString xgetAdoptedSurvey();
        
        /**
         * True if has "adoptedSurvey" attribute
         */
        boolean isSetAdoptedSurvey();
        
        /**
         * Sets the "adoptedSurvey" attribute
         */
        void setAdoptedSurvey(java.lang.String adoptedSurvey);
        
        /**
         * Sets (as xml) the "adoptedSurvey" attribute
         */
        void xsetAdoptedSurvey(org.apache.xmlbeans.XmlString adoptedSurvey);
        
        /**
         * Unsets the "adoptedSurvey" attribute
         */
        void unsetAdoptedSurvey();
        
        /**
         * Gets the "lengthAccClass" attribute
         */
        java.lang.String getLengthAccClass();
        
        /**
         * Gets (as xml) the "lengthAccClass" attribute
         */
        org.apache.xmlbeans.XmlString xgetLengthAccClass();
        
        /**
         * True if has "lengthAccClass" attribute
         */
        boolean isSetLengthAccClass();
        
        /**
         * Sets the "lengthAccClass" attribute
         */
        void setLengthAccClass(java.lang.String lengthAccClass);
        
        /**
         * Sets (as xml) the "lengthAccClass" attribute
         */
        void xsetLengthAccClass(org.apache.xmlbeans.XmlString lengthAccClass);
        
        /**
         * Unsets the "lengthAccClass" attribute
         */
        void unsetLengthAccClass();
        
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
         * Gets the "lengthAdoptionFactor" attribute
         */
        double getLengthAdoptionFactor();
        
        /**
         * Gets (as xml) the "lengthAdoptionFactor" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetLengthAdoptionFactor();
        
        /**
         * True if has "lengthAdoptionFactor" attribute
         */
        boolean isSetLengthAdoptionFactor();
        
        /**
         * Sets the "lengthAdoptionFactor" attribute
         */
        void setLengthAdoptionFactor(double lengthAdoptionFactor);
        
        /**
         * Sets (as xml) the "lengthAdoptionFactor" attribute
         */
        void xsetLengthAdoptionFactor(org.apache.xmlbeans.XmlDouble lengthAdoptionFactor);
        
        /**
         * Unsets the "lengthAdoptionFactor" attribute
         */
        void unsetLengthAdoptionFactor();
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation newInstance() {
              return (org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.ReducedArcObservationDocument newInstance() {
          return (org.landxml.schema.landXML11.ReducedArcObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.ReducedArcObservationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.ReducedArcObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.ReducedArcObservationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ReducedArcObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.ReducedArcObservationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ReducedArcObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.ReducedArcObservationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ReducedArcObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.ReducedArcObservationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ReducedArcObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.ReducedArcObservationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ReducedArcObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.ReducedArcObservationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ReducedArcObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.ReducedArcObservationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ReducedArcObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.ReducedArcObservationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ReducedArcObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.ReducedArcObservationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ReducedArcObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.ReducedArcObservationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ReducedArcObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.ReducedArcObservationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ReducedArcObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.ReducedArcObservationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ReducedArcObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.ReducedArcObservationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ReducedArcObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.ReducedArcObservationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ReducedArcObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ReducedArcObservationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ReducedArcObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ReducedArcObservationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ReducedArcObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
