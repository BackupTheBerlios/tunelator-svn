/*
 * An XML document type.
 * Localname: InstrumentSetup
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.InstrumentSetupDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one InstrumentSetup(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface InstrumentSetupDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InstrumentSetupDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("instrumentsetupf758doctype");
    
    /**
     * Gets the "InstrumentSetup" element
     */
    org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup getInstrumentSetup();
    
    /**
     * Sets the "InstrumentSetup" element
     */
    void setInstrumentSetup(org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup instrumentSetup);
    
    /**
     * Appends and returns a new empty "InstrumentSetup" element
     */
    org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup addNewInstrumentSetup();
    
    /**
     * An XML InstrumentSetup(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface InstrumentSetup extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InstrumentSetup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("instrumentsetup737aelemtype");
        
        /**
         * Gets a List of "InstrumentPoint" elements
         */
        java.util.List<org.landxml.schema.landXML11.PointType> getInstrumentPointList();
        
        /**
         * Gets array of all "InstrumentPoint" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.PointType[] getInstrumentPointArray();
        
        /**
         * Gets ith "InstrumentPoint" element
         */
        org.landxml.schema.landXML11.PointType getInstrumentPointArray(int i);
        
        /**
         * Returns number of "InstrumentPoint" element
         */
        int sizeOfInstrumentPointArray();
        
        /**
         * Sets array of all "InstrumentPoint" element
         */
        void setInstrumentPointArray(org.landxml.schema.landXML11.PointType[] instrumentPointArray);
        
        /**
         * Sets ith "InstrumentPoint" element
         */
        void setInstrumentPointArray(int i, org.landxml.schema.landXML11.PointType instrumentPoint);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "InstrumentPoint" element
         */
        org.landxml.schema.landXML11.PointType insertNewInstrumentPoint(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "InstrumentPoint" element
         */
        org.landxml.schema.landXML11.PointType addNewInstrumentPoint();
        
        /**
         * Removes the ith "InstrumentPoint" element
         */
        void removeInstrumentPoint(int i);
        
        /**
         * Gets a List of "Backsight" elements
         */
        java.util.List<org.landxml.schema.landXML11.BacksightDocument.Backsight> getBacksightList();
        
        /**
         * Gets array of all "Backsight" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.BacksightDocument.Backsight[] getBacksightArray();
        
        /**
         * Gets ith "Backsight" element
         */
        org.landxml.schema.landXML11.BacksightDocument.Backsight getBacksightArray(int i);
        
        /**
         * Returns number of "Backsight" element
         */
        int sizeOfBacksightArray();
        
        /**
         * Sets array of all "Backsight" element
         */
        void setBacksightArray(org.landxml.schema.landXML11.BacksightDocument.Backsight[] backsightArray);
        
        /**
         * Sets ith "Backsight" element
         */
        void setBacksightArray(int i, org.landxml.schema.landXML11.BacksightDocument.Backsight backsight);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Backsight" element
         */
        org.landxml.schema.landXML11.BacksightDocument.Backsight insertNewBacksight(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Backsight" element
         */
        org.landxml.schema.landXML11.BacksightDocument.Backsight addNewBacksight();
        
        /**
         * Removes the ith "Backsight" element
         */
        void removeBacksight(int i);
        
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
         * Gets a List of "RawObservation" elements
         */
        java.util.List<org.landxml.schema.landXML11.RawObservationDocument.RawObservation> getRawObservationList();
        
        /**
         * Gets array of all "RawObservation" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.RawObservationDocument.RawObservation[] getRawObservationArray();
        
        /**
         * Gets ith "RawObservation" element
         */
        org.landxml.schema.landXML11.RawObservationDocument.RawObservation getRawObservationArray(int i);
        
        /**
         * Returns number of "RawObservation" element
         */
        int sizeOfRawObservationArray();
        
        /**
         * Sets array of all "RawObservation" element
         */
        void setRawObservationArray(org.landxml.schema.landXML11.RawObservationDocument.RawObservation[] rawObservationArray);
        
        /**
         * Sets ith "RawObservation" element
         */
        void setRawObservationArray(int i, org.landxml.schema.landXML11.RawObservationDocument.RawObservation rawObservation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RawObservation" element
         */
        org.landxml.schema.landXML11.RawObservationDocument.RawObservation insertNewRawObservation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RawObservation" element
         */
        org.landxml.schema.landXML11.RawObservationDocument.RawObservation addNewRawObservation();
        
        /**
         * Removes the ith "RawObservation" element
         */
        void removeRawObservation(int i);
        
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
         * Gets the "instrumentDetailsID" attribute
         */
        java.lang.String getInstrumentDetailsID();
        
        /**
         * Gets (as xml) the "instrumentDetailsID" attribute
         */
        org.apache.xmlbeans.XmlIDREF xgetInstrumentDetailsID();
        
        /**
         * True if has "instrumentDetailsID" attribute
         */
        boolean isSetInstrumentDetailsID();
        
        /**
         * Sets the "instrumentDetailsID" attribute
         */
        void setInstrumentDetailsID(java.lang.String instrumentDetailsID);
        
        /**
         * Sets (as xml) the "instrumentDetailsID" attribute
         */
        void xsetInstrumentDetailsID(org.apache.xmlbeans.XmlIDREF instrumentDetailsID);
        
        /**
         * Unsets the "instrumentDetailsID" attribute
         */
        void unsetInstrumentDetailsID();
        
        /**
         * Gets the "stationName" attribute
         */
        java.lang.String getStationName();
        
        /**
         * Gets (as xml) the "stationName" attribute
         */
        org.apache.xmlbeans.XmlString xgetStationName();
        
        /**
         * Sets the "stationName" attribute
         */
        void setStationName(java.lang.String stationName);
        
        /**
         * Sets (as xml) the "stationName" attribute
         */
        void xsetStationName(org.apache.xmlbeans.XmlString stationName);
        
        /**
         * Gets the "instrumentHeight" attribute
         */
        double getInstrumentHeight();
        
        /**
         * Gets (as xml) the "instrumentHeight" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetInstrumentHeight();
        
        /**
         * Sets the "instrumentHeight" attribute
         */
        void setInstrumentHeight(double instrumentHeight);
        
        /**
         * Sets (as xml) the "instrumentHeight" attribute
         */
        void xsetInstrumentHeight(org.apache.xmlbeans.XmlDouble instrumentHeight);
        
        /**
         * Gets the "orientationAzimuth" attribute
         */
        double getOrientationAzimuth();
        
        /**
         * Gets (as xml) the "orientationAzimuth" attribute
         */
        org.landxml.schema.landXML11.Direction xgetOrientationAzimuth();
        
        /**
         * True if has "orientationAzimuth" attribute
         */
        boolean isSetOrientationAzimuth();
        
        /**
         * Sets the "orientationAzimuth" attribute
         */
        void setOrientationAzimuth(double orientationAzimuth);
        
        /**
         * Sets (as xml) the "orientationAzimuth" attribute
         */
        void xsetOrientationAzimuth(org.landxml.schema.landXML11.Direction orientationAzimuth);
        
        /**
         * Unsets the "orientationAzimuth" attribute
         */
        void unsetOrientationAzimuth();
        
        /**
         * Gets the "circleAzimuth" attribute
         */
        double getCircleAzimuth();
        
        /**
         * Gets (as xml) the "circleAzimuth" attribute
         */
        org.landxml.schema.landXML11.Direction xgetCircleAzimuth();
        
        /**
         * True if has "circleAzimuth" attribute
         */
        boolean isSetCircleAzimuth();
        
        /**
         * Sets the "circleAzimuth" attribute
         */
        void setCircleAzimuth(double circleAzimuth);
        
        /**
         * Sets (as xml) the "circleAzimuth" attribute
         */
        void xsetCircleAzimuth(org.landxml.schema.landXML11.Direction circleAzimuth);
        
        /**
         * Unsets the "circleAzimuth" attribute
         */
        void unsetCircleAzimuth();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup newInstance() {
              return (org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.InstrumentSetupDocument.InstrumentSetup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.InstrumentSetupDocument newInstance() {
          return (org.landxml.schema.landXML11.InstrumentSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.InstrumentSetupDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.InstrumentSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.InstrumentSetupDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.InstrumentSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.InstrumentSetupDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.InstrumentSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.InstrumentSetupDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.InstrumentSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.InstrumentSetupDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.InstrumentSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.InstrumentSetupDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.InstrumentSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.InstrumentSetupDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.InstrumentSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.InstrumentSetupDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.InstrumentSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.InstrumentSetupDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.InstrumentSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.InstrumentSetupDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.InstrumentSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.InstrumentSetupDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.InstrumentSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.InstrumentSetupDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.InstrumentSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.InstrumentSetupDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.InstrumentSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.InstrumentSetupDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.InstrumentSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.InstrumentSetupDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.InstrumentSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.InstrumentSetupDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.InstrumentSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.InstrumentSetupDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.InstrumentSetupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
