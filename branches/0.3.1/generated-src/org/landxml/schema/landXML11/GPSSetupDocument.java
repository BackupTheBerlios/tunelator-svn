/*
 * An XML document type.
 * Localname: GPSSetup
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.GPSSetupDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one GPSSetup(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface GPSSetupDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GPSSetupDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("gpssetupab07doctype");
    
    /**
     * Gets the "GPSSetup" element
     */
    org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup getGPSSetup();
    
    /**
     * Sets the "GPSSetup" element
     */
    void setGPSSetup(org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup gpsSetup);
    
    /**
     * Appends and returns a new empty "GPSSetup" element
     */
    org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup addNewGPSSetup();
    
    /**
     * An XML GPSSetup(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface GPSSetup extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GPSSetup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("gpssetup4db8elemtype");
        
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
         * Gets the "id" attribute
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlID xgetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlID id);
        
        /**
         * Gets the "antennaHeight" attribute
         */
        double getAntennaHeight();
        
        /**
         * Gets (as xml) the "antennaHeight" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetAntennaHeight();
        
        /**
         * Sets the "antennaHeight" attribute
         */
        void setAntennaHeight(double antennaHeight);
        
        /**
         * Sets (as xml) the "antennaHeight" attribute
         */
        void xsetAntennaHeight(org.apache.xmlbeans.XmlDouble antennaHeight);
        
        /**
         * Gets the "stationName" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType getStationName();
        
        /**
         * Sets the "stationName" attribute
         */
        void setStationName(org.apache.xmlbeans.XmlAnySimpleType stationName);
        
        /**
         * Appends and returns a new empty "stationName" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType addNewStationName();
        
        /**
         * Gets the "GPSAntennaDetailsID" attribute
         */
        java.lang.String getGPSAntennaDetailsID();
        
        /**
         * Gets (as xml) the "GPSAntennaDetailsID" attribute
         */
        org.apache.xmlbeans.XmlIDREF xgetGPSAntennaDetailsID();
        
        /**
         * True if has "GPSAntennaDetailsID" attribute
         */
        boolean isSetGPSAntennaDetailsID();
        
        /**
         * Sets the "GPSAntennaDetailsID" attribute
         */
        void setGPSAntennaDetailsID(java.lang.String gpsAntennaDetailsID);
        
        /**
         * Sets (as xml) the "GPSAntennaDetailsID" attribute
         */
        void xsetGPSAntennaDetailsID(org.apache.xmlbeans.XmlIDREF gpsAntennaDetailsID);
        
        /**
         * Unsets the "GPSAntennaDetailsID" attribute
         */
        void unsetGPSAntennaDetailsID();
        
        /**
         * Gets the "GPSReceiverDetailsID" attribute
         */
        java.lang.String getGPSReceiverDetailsID();
        
        /**
         * Gets (as xml) the "GPSReceiverDetailsID" attribute
         */
        org.apache.xmlbeans.XmlIDREF xgetGPSReceiverDetailsID();
        
        /**
         * True if has "GPSReceiverDetailsID" attribute
         */
        boolean isSetGPSReceiverDetailsID();
        
        /**
         * Sets the "GPSReceiverDetailsID" attribute
         */
        void setGPSReceiverDetailsID(java.lang.String gpsReceiverDetailsID);
        
        /**
         * Sets (as xml) the "GPSReceiverDetailsID" attribute
         */
        void xsetGPSReceiverDetailsID(org.apache.xmlbeans.XmlIDREF gpsReceiverDetailsID);
        
        /**
         * Unsets the "GPSReceiverDetailsID" attribute
         */
        void unsetGPSReceiverDetailsID();
        
        /**
         * Gets the "observationDataLink" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType getObservationDataLink();
        
        /**
         * True if has "observationDataLink" attribute
         */
        boolean isSetObservationDataLink();
        
        /**
         * Sets the "observationDataLink" attribute
         */
        void setObservationDataLink(org.apache.xmlbeans.XmlAnySimpleType observationDataLink);
        
        /**
         * Appends and returns a new empty "observationDataLink" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType addNewObservationDataLink();
        
        /**
         * Unsets the "observationDataLink" attribute
         */
        void unsetObservationDataLink();
        
        /**
         * Gets the "stationDescription" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType getStationDescription();
        
        /**
         * True if has "stationDescription" attribute
         */
        boolean isSetStationDescription();
        
        /**
         * Sets the "stationDescription" attribute
         */
        void setStationDescription(org.apache.xmlbeans.XmlAnySimpleType stationDescription);
        
        /**
         * Appends and returns a new empty "stationDescription" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType addNewStationDescription();
        
        /**
         * Unsets the "stationDescription" attribute
         */
        void unsetStationDescription();
        
        /**
         * Gets the "startTime" attribute
         */
        double getStartTime();
        
        /**
         * Gets (as xml) the "startTime" attribute
         */
        org.landxml.schema.landXML11.GPSTime xgetStartTime();
        
        /**
         * True if has "startTime" attribute
         */
        boolean isSetStartTime();
        
        /**
         * Sets the "startTime" attribute
         */
        void setStartTime(double startTime);
        
        /**
         * Sets (as xml) the "startTime" attribute
         */
        void xsetStartTime(org.landxml.schema.landXML11.GPSTime startTime);
        
        /**
         * Unsets the "startTime" attribute
         */
        void unsetStartTime();
        
        /**
         * Gets the "stopTime" attribute
         */
        double getStopTime();
        
        /**
         * Gets (as xml) the "stopTime" attribute
         */
        org.landxml.schema.landXML11.GPSTime xgetStopTime();
        
        /**
         * True if has "stopTime" attribute
         */
        boolean isSetStopTime();
        
        /**
         * Sets the "stopTime" attribute
         */
        void setStopTime(double stopTime);
        
        /**
         * Sets (as xml) the "stopTime" attribute
         */
        void xsetStopTime(org.landxml.schema.landXML11.GPSTime stopTime);
        
        /**
         * Unsets the "stopTime" attribute
         */
        void unsetStopTime();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup newInstance() {
              return (org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.GPSSetupDocument.GPSSetup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.GPSSetupDocument newInstance() {
          return (org.landxml.schema.landXML11.GPSSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.GPSSetupDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.GPSSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.GPSSetupDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSSetupDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.GPSSetupDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSSetupDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSSetupDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSSetupDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSSetupDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSSetupDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSSetupDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSSetupDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSSetupDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSSetupDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSSetupDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSSetupDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.GPSSetupDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.GPSSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.GPSSetupDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.GPSSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
