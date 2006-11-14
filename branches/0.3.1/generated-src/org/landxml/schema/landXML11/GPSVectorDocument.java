/*
 * An XML document type.
 * Localname: GPSVector
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.GPSVectorDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one GPSVector(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface GPSVectorDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GPSVectorDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("gpsvector478fdoctype");
    
    /**
     * Gets the "GPSVector" element
     */
    org.landxml.schema.landXML11.GPSVectorDocument.GPSVector getGPSVector();
    
    /**
     * Sets the "GPSVector" element
     */
    void setGPSVector(org.landxml.schema.landXML11.GPSVectorDocument.GPSVector gpsVector);
    
    /**
     * Appends and returns a new empty "GPSVector" element
     */
    org.landxml.schema.landXML11.GPSVectorDocument.GPSVector addNewGPSVector();
    
    /**
     * An XML GPSVector(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface GPSVector extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GPSVector.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("gpsvector7fa8elemtype");
        
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
         * Gets the "GPSQCInfoLevel1" element
         */
        org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1 getGPSQCInfoLevel1();
        
        /**
         * True if has "GPSQCInfoLevel1" element
         */
        boolean isSetGPSQCInfoLevel1();
        
        /**
         * Sets the "GPSQCInfoLevel1" element
         */
        void setGPSQCInfoLevel1(org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1 gpsqcInfoLevel1);
        
        /**
         * Appends and returns a new empty "GPSQCInfoLevel1" element
         */
        org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1 addNewGPSQCInfoLevel1();
        
        /**
         * Unsets the "GPSQCInfoLevel1" element
         */
        void unsetGPSQCInfoLevel1();
        
        /**
         * Gets the "GPSQCInfoLevel2" element
         */
        org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2 getGPSQCInfoLevel2();
        
        /**
         * True if has "GPSQCInfoLevel2" element
         */
        boolean isSetGPSQCInfoLevel2();
        
        /**
         * Sets the "GPSQCInfoLevel2" element
         */
        void setGPSQCInfoLevel2(org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2 gpsqcInfoLevel2);
        
        /**
         * Appends and returns a new empty "GPSQCInfoLevel2" element
         */
        org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2 addNewGPSQCInfoLevel2();
        
        /**
         * Unsets the "GPSQCInfoLevel2" element
         */
        void unsetGPSQCInfoLevel2();
        
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
         * Gets the "dX" attribute
         */
        double getDX();
        
        /**
         * Gets (as xml) the "dX" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetDX();
        
        /**
         * Sets the "dX" attribute
         */
        void setDX(double dx);
        
        /**
         * Sets (as xml) the "dX" attribute
         */
        void xsetDX(org.apache.xmlbeans.XmlDouble dx);
        
        /**
         * Gets the "dY" attribute
         */
        double getDY();
        
        /**
         * Gets (as xml) the "dY" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetDY();
        
        /**
         * Sets the "dY" attribute
         */
        void setDY(double dy);
        
        /**
         * Sets (as xml) the "dY" attribute
         */
        void xsetDY(org.apache.xmlbeans.XmlDouble dy);
        
        /**
         * Gets the "dZ" attribute
         */
        double getDZ();
        
        /**
         * Gets (as xml) the "dZ" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetDZ();
        
        /**
         * Sets the "dZ" attribute
         */
        void setDZ(double dz);
        
        /**
         * Sets (as xml) the "dZ" attribute
         */
        void xsetDZ(org.apache.xmlbeans.XmlDouble dz);
        
        /**
         * Gets the "setupID_A" attribute
         */
        java.lang.String getSetupIDA();
        
        /**
         * Gets (as xml) the "setupID_A" attribute
         */
        org.apache.xmlbeans.XmlIDREF xgetSetupIDA();
        
        /**
         * Sets the "setupID_A" attribute
         */
        void setSetupIDA(java.lang.String setupIDA);
        
        /**
         * Sets (as xml) the "setupID_A" attribute
         */
        void xsetSetupIDA(org.apache.xmlbeans.XmlIDREF setupIDA);
        
        /**
         * Gets the "setupID_B" attribute
         */
        java.lang.String getSetupIDB();
        
        /**
         * Gets (as xml) the "setupID_B" attribute
         */
        org.apache.xmlbeans.XmlIDREF xgetSetupIDB();
        
        /**
         * Sets the "setupID_B" attribute
         */
        void setSetupIDB(java.lang.String setupIDB);
        
        /**
         * Sets (as xml) the "setupID_B" attribute
         */
        void xsetSetupIDB(org.apache.xmlbeans.XmlIDREF setupIDB);
        
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
         * Gets the "horizontalPrecision" attribute
         */
        double getHorizontalPrecision();
        
        /**
         * Gets (as xml) the "horizontalPrecision" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetHorizontalPrecision();
        
        /**
         * True if has "horizontalPrecision" attribute
         */
        boolean isSetHorizontalPrecision();
        
        /**
         * Sets the "horizontalPrecision" attribute
         */
        void setHorizontalPrecision(double horizontalPrecision);
        
        /**
         * Sets (as xml) the "horizontalPrecision" attribute
         */
        void xsetHorizontalPrecision(org.apache.xmlbeans.XmlDouble horizontalPrecision);
        
        /**
         * Unsets the "horizontalPrecision" attribute
         */
        void unsetHorizontalPrecision();
        
        /**
         * Gets the "verticalPrecision" attribute
         */
        double getVerticalPrecision();
        
        /**
         * Gets (as xml) the "verticalPrecision" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetVerticalPrecision();
        
        /**
         * True if has "verticalPrecision" attribute
         */
        boolean isSetVerticalPrecision();
        
        /**
         * Sets the "verticalPrecision" attribute
         */
        void setVerticalPrecision(double verticalPrecision);
        
        /**
         * Sets (as xml) the "verticalPrecision" attribute
         */
        void xsetVerticalPrecision(org.apache.xmlbeans.XmlDouble verticalPrecision);
        
        /**
         * Unsets the "verticalPrecision" attribute
         */
        void unsetVerticalPrecision();
        
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
         * Gets the "solutionDataLink" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType getSolutionDataLink();
        
        /**
         * True if has "solutionDataLink" attribute
         */
        boolean isSetSolutionDataLink();
        
        /**
         * Sets the "solutionDataLink" attribute
         */
        void setSolutionDataLink(org.apache.xmlbeans.XmlAnySimpleType solutionDataLink);
        
        /**
         * Appends and returns a new empty "solutionDataLink" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType addNewSolutionDataLink();
        
        /**
         * Unsets the "solutionDataLink" attribute
         */
        void unsetSolutionDataLink();
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.GPSVectorDocument.GPSVector newInstance() {
              return (org.landxml.schema.landXML11.GPSVectorDocument.GPSVector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.GPSVectorDocument.GPSVector newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.GPSVectorDocument.GPSVector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.GPSVectorDocument newInstance() {
          return (org.landxml.schema.landXML11.GPSVectorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.GPSVectorDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.GPSVectorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.GPSVectorDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSVectorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSVectorDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSVectorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.GPSVectorDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSVectorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSVectorDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSVectorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSVectorDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSVectorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSVectorDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSVectorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSVectorDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSVectorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSVectorDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSVectorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSVectorDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSVectorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSVectorDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSVectorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSVectorDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSVectorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSVectorDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSVectorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSVectorDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSVectorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSVectorDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSVectorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.GPSVectorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.GPSVectorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.GPSVectorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.GPSVectorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
