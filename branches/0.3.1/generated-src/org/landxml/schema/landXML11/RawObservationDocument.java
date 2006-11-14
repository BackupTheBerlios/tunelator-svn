/*
 * An XML document type.
 * Localname: RawObservation
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.RawObservationDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one RawObservation(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface RawObservationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RawObservationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("rawobservation8df8doctype");
    
    /**
     * Gets the "RawObservation" element
     */
    org.landxml.schema.landXML11.RawObservationDocument.RawObservation getRawObservation();
    
    /**
     * Sets the "RawObservation" element
     */
    void setRawObservation(org.landxml.schema.landXML11.RawObservationDocument.RawObservation rawObservation);
    
    /**
     * Appends and returns a new empty "RawObservation" element
     */
    org.landxml.schema.landXML11.RawObservationDocument.RawObservation addNewRawObservation();
    
    /**
     * An XML RawObservation(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface RawObservation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RawObservation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("rawobservation8058elemtype");
        
        /**
         * Gets the "TargetPoint" element
         */
        org.landxml.schema.landXML11.PointType getTargetPoint();
        
        /**
         * Sets the "TargetPoint" element
         */
        void setTargetPoint(org.landxml.schema.landXML11.PointType targetPoint);
        
        /**
         * Appends and returns a new empty "TargetPoint" element
         */
        org.landxml.schema.landXML11.PointType addNewTargetPoint();
        
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
         * Gets the "unused" attribute
         */
        boolean getUnused();
        
        /**
         * Gets (as xml) the "unused" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetUnused();
        
        /**
         * True if has "unused" attribute
         */
        boolean isSetUnused();
        
        /**
         * Sets the "unused" attribute
         */
        void setUnused(boolean unused);
        
        /**
         * Sets (as xml) the "unused" attribute
         */
        void xsetUnused(org.apache.xmlbeans.XmlBoolean unused);
        
        /**
         * Unsets the "unused" attribute
         */
        void unsetUnused();
        
        /**
         * Gets the "directFace" attribute
         */
        boolean getDirectFace();
        
        /**
         * Gets (as xml) the "directFace" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetDirectFace();
        
        /**
         * True if has "directFace" attribute
         */
        boolean isSetDirectFace();
        
        /**
         * Sets the "directFace" attribute
         */
        void setDirectFace(boolean directFace);
        
        /**
         * Sets (as xml) the "directFace" attribute
         */
        void xsetDirectFace(org.apache.xmlbeans.XmlBoolean directFace);
        
        /**
         * Unsets the "directFace" attribute
         */
        void unsetDirectFace();
        
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
         * Gets the "timeStamp" attribute
         */
        java.util.Calendar getTimeStamp();
        
        /**
         * Gets (as xml) the "timeStamp" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetTimeStamp();
        
        /**
         * True if has "timeStamp" attribute
         */
        boolean isSetTimeStamp();
        
        /**
         * Sets the "timeStamp" attribute
         */
        void setTimeStamp(java.util.Calendar timeStamp);
        
        /**
         * Sets (as xml) the "timeStamp" attribute
         */
        void xsetTimeStamp(org.apache.xmlbeans.XmlDateTime timeStamp);
        
        /**
         * Unsets the "timeStamp" attribute
         */
        void unsetTimeStamp();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.RawObservationDocument.RawObservation newInstance() {
              return (org.landxml.schema.landXML11.RawObservationDocument.RawObservation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.RawObservationDocument.RawObservation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.RawObservationDocument.RawObservation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.RawObservationDocument newInstance() {
          return (org.landxml.schema.landXML11.RawObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.RawObservationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.RawObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.RawObservationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RawObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.RawObservationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RawObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.RawObservationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RawObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.RawObservationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RawObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.RawObservationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RawObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.RawObservationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RawObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.RawObservationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RawObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.RawObservationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RawObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.RawObservationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RawObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.RawObservationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RawObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.RawObservationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RawObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.RawObservationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RawObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.RawObservationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RawObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.RawObservationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RawObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.RawObservationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.RawObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.RawObservationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.RawObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
