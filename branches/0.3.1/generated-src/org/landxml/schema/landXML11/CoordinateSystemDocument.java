/*
 * An XML document type.
 * Localname: CoordinateSystem
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CoordinateSystemDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one CoordinateSystem(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface CoordinateSystemDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CoordinateSystemDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("coordinatesystem7adbdoctype");
    
    /**
     * Gets the "CoordinateSystem" element
     */
    org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem getCoordinateSystem();
    
    /**
     * Sets the "CoordinateSystem" element
     */
    void setCoordinateSystem(org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem coordinateSystem);
    
    /**
     * Appends and returns a new empty "CoordinateSystem" element
     */
    org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem addNewCoordinateSystem();
    
    /**
     * An XML CoordinateSystem(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface CoordinateSystem extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CoordinateSystem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("coordinatesystem6338elemtype");
        
        /**
         * Gets the "Start" element
         */
        org.landxml.schema.landXML11.PointType getStart();
        
        /**
         * True if has "Start" element
         */
        boolean isSetStart();
        
        /**
         * Sets the "Start" element
         */
        void setStart(org.landxml.schema.landXML11.PointType start);
        
        /**
         * Appends and returns a new empty "Start" element
         */
        org.landxml.schema.landXML11.PointType addNewStart();
        
        /**
         * Unsets the "Start" element
         */
        void unsetStart();
        
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
         * Gets the "epsgCode" attribute
         */
        java.lang.String getEpsgCode();
        
        /**
         * Gets (as xml) the "epsgCode" attribute
         */
        org.apache.xmlbeans.XmlString xgetEpsgCode();
        
        /**
         * True if has "epsgCode" attribute
         */
        boolean isSetEpsgCode();
        
        /**
         * Sets the "epsgCode" attribute
         */
        void setEpsgCode(java.lang.String epsgCode);
        
        /**
         * Sets (as xml) the "epsgCode" attribute
         */
        void xsetEpsgCode(org.apache.xmlbeans.XmlString epsgCode);
        
        /**
         * Unsets the "epsgCode" attribute
         */
        void unsetEpsgCode();
        
        /**
         * Gets the "ogcWktCode" attribute
         */
        java.lang.String getOgcWktCode();
        
        /**
         * Gets (as xml) the "ogcWktCode" attribute
         */
        org.apache.xmlbeans.XmlString xgetOgcWktCode();
        
        /**
         * True if has "ogcWktCode" attribute
         */
        boolean isSetOgcWktCode();
        
        /**
         * Sets the "ogcWktCode" attribute
         */
        void setOgcWktCode(java.lang.String ogcWktCode);
        
        /**
         * Sets (as xml) the "ogcWktCode" attribute
         */
        void xsetOgcWktCode(org.apache.xmlbeans.XmlString ogcWktCode);
        
        /**
         * Unsets the "ogcWktCode" attribute
         */
        void unsetOgcWktCode();
        
        /**
         * Gets the "horizontalDatum" attribute
         */
        java.lang.String getHorizontalDatum();
        
        /**
         * Gets (as xml) the "horizontalDatum" attribute
         */
        org.apache.xmlbeans.XmlString xgetHorizontalDatum();
        
        /**
         * True if has "horizontalDatum" attribute
         */
        boolean isSetHorizontalDatum();
        
        /**
         * Sets the "horizontalDatum" attribute
         */
        void setHorizontalDatum(java.lang.String horizontalDatum);
        
        /**
         * Sets (as xml) the "horizontalDatum" attribute
         */
        void xsetHorizontalDatum(org.apache.xmlbeans.XmlString horizontalDatum);
        
        /**
         * Unsets the "horizontalDatum" attribute
         */
        void unsetHorizontalDatum();
        
        /**
         * Gets the "verticalDatum" attribute
         */
        java.lang.String getVerticalDatum();
        
        /**
         * Gets (as xml) the "verticalDatum" attribute
         */
        org.apache.xmlbeans.XmlString xgetVerticalDatum();
        
        /**
         * True if has "verticalDatum" attribute
         */
        boolean isSetVerticalDatum();
        
        /**
         * Sets the "verticalDatum" attribute
         */
        void setVerticalDatum(java.lang.String verticalDatum);
        
        /**
         * Sets (as xml) the "verticalDatum" attribute
         */
        void xsetVerticalDatum(org.apache.xmlbeans.XmlString verticalDatum);
        
        /**
         * Unsets the "verticalDatum" attribute
         */
        void unsetVerticalDatum();
        
        /**
         * Gets the "ellipsoidName" attribute
         */
        java.lang.String getEllipsoidName();
        
        /**
         * Gets (as xml) the "ellipsoidName" attribute
         */
        org.apache.xmlbeans.XmlString xgetEllipsoidName();
        
        /**
         * True if has "ellipsoidName" attribute
         */
        boolean isSetEllipsoidName();
        
        /**
         * Sets the "ellipsoidName" attribute
         */
        void setEllipsoidName(java.lang.String ellipsoidName);
        
        /**
         * Sets (as xml) the "ellipsoidName" attribute
         */
        void xsetEllipsoidName(org.apache.xmlbeans.XmlString ellipsoidName);
        
        /**
         * Unsets the "ellipsoidName" attribute
         */
        void unsetEllipsoidName();
        
        /**
         * Gets the "horizontalCoordinateSystemName" attribute
         */
        java.lang.String getHorizontalCoordinateSystemName();
        
        /**
         * Gets (as xml) the "horizontalCoordinateSystemName" attribute
         */
        org.apache.xmlbeans.XmlString xgetHorizontalCoordinateSystemName();
        
        /**
         * True if has "horizontalCoordinateSystemName" attribute
         */
        boolean isSetHorizontalCoordinateSystemName();
        
        /**
         * Sets the "horizontalCoordinateSystemName" attribute
         */
        void setHorizontalCoordinateSystemName(java.lang.String horizontalCoordinateSystemName);
        
        /**
         * Sets (as xml) the "horizontalCoordinateSystemName" attribute
         */
        void xsetHorizontalCoordinateSystemName(org.apache.xmlbeans.XmlString horizontalCoordinateSystemName);
        
        /**
         * Unsets the "horizontalCoordinateSystemName" attribute
         */
        void unsetHorizontalCoordinateSystemName();
        
        /**
         * Gets the "geocentricCoordinateSystemName" attribute
         */
        java.lang.String getGeocentricCoordinateSystemName();
        
        /**
         * Gets (as xml) the "geocentricCoordinateSystemName" attribute
         */
        org.apache.xmlbeans.XmlString xgetGeocentricCoordinateSystemName();
        
        /**
         * True if has "geocentricCoordinateSystemName" attribute
         */
        boolean isSetGeocentricCoordinateSystemName();
        
        /**
         * Sets the "geocentricCoordinateSystemName" attribute
         */
        void setGeocentricCoordinateSystemName(java.lang.String geocentricCoordinateSystemName);
        
        /**
         * Sets (as xml) the "geocentricCoordinateSystemName" attribute
         */
        void xsetGeocentricCoordinateSystemName(org.apache.xmlbeans.XmlString geocentricCoordinateSystemName);
        
        /**
         * Unsets the "geocentricCoordinateSystemName" attribute
         */
        void unsetGeocentricCoordinateSystemName();
        
        /**
         * Gets the "fileLocation" attribute
         */
        java.lang.String getFileLocation();
        
        /**
         * Gets (as xml) the "fileLocation" attribute
         */
        org.apache.xmlbeans.XmlAnyURI xgetFileLocation();
        
        /**
         * True if has "fileLocation" attribute
         */
        boolean isSetFileLocation();
        
        /**
         * Sets the "fileLocation" attribute
         */
        void setFileLocation(java.lang.String fileLocation);
        
        /**
         * Sets (as xml) the "fileLocation" attribute
         */
        void xsetFileLocation(org.apache.xmlbeans.XmlAnyURI fileLocation);
        
        /**
         * Unsets the "fileLocation" attribute
         */
        void unsetFileLocation();
        
        /**
         * Gets the "rotationAngle" attribute
         */
        double getRotationAngle();
        
        /**
         * Gets (as xml) the "rotationAngle" attribute
         */
        org.landxml.schema.landXML11.Angle xgetRotationAngle();
        
        /**
         * True if has "rotationAngle" attribute
         */
        boolean isSetRotationAngle();
        
        /**
         * Sets the "rotationAngle" attribute
         */
        void setRotationAngle(double rotationAngle);
        
        /**
         * Sets (as xml) the "rotationAngle" attribute
         */
        void xsetRotationAngle(org.landxml.schema.landXML11.Angle rotationAngle);
        
        /**
         * Unsets the "rotationAngle" attribute
         */
        void unsetRotationAngle();
        
        /**
         * Gets the "datum" attribute
         */
        java.lang.String getDatum();
        
        /**
         * Gets (as xml) the "datum" attribute
         */
        org.apache.xmlbeans.XmlString xgetDatum();
        
        /**
         * True if has "datum" attribute
         */
        boolean isSetDatum();
        
        /**
         * Sets the "datum" attribute
         */
        void setDatum(java.lang.String datum);
        
        /**
         * Sets (as xml) the "datum" attribute
         */
        void xsetDatum(org.apache.xmlbeans.XmlString datum);
        
        /**
         * Unsets the "datum" attribute
         */
        void unsetDatum();
        
        /**
         * Gets the "fittedCoordinateSystemName" attribute
         */
        java.lang.String getFittedCoordinateSystemName();
        
        /**
         * Gets (as xml) the "fittedCoordinateSystemName" attribute
         */
        org.apache.xmlbeans.XmlString xgetFittedCoordinateSystemName();
        
        /**
         * True if has "fittedCoordinateSystemName" attribute
         */
        boolean isSetFittedCoordinateSystemName();
        
        /**
         * Sets the "fittedCoordinateSystemName" attribute
         */
        void setFittedCoordinateSystemName(java.lang.String fittedCoordinateSystemName);
        
        /**
         * Sets (as xml) the "fittedCoordinateSystemName" attribute
         */
        void xsetFittedCoordinateSystemName(org.apache.xmlbeans.XmlString fittedCoordinateSystemName);
        
        /**
         * Unsets the "fittedCoordinateSystemName" attribute
         */
        void unsetFittedCoordinateSystemName();
        
        /**
         * Gets the "compoundCoordinateSystemName" attribute
         */
        java.lang.String getCompoundCoordinateSystemName();
        
        /**
         * Gets (as xml) the "compoundCoordinateSystemName" attribute
         */
        org.apache.xmlbeans.XmlString xgetCompoundCoordinateSystemName();
        
        /**
         * True if has "compoundCoordinateSystemName" attribute
         */
        boolean isSetCompoundCoordinateSystemName();
        
        /**
         * Sets the "compoundCoordinateSystemName" attribute
         */
        void setCompoundCoordinateSystemName(java.lang.String compoundCoordinateSystemName);
        
        /**
         * Sets (as xml) the "compoundCoordinateSystemName" attribute
         */
        void xsetCompoundCoordinateSystemName(org.apache.xmlbeans.XmlString compoundCoordinateSystemName);
        
        /**
         * Unsets the "compoundCoordinateSystemName" attribute
         */
        void unsetCompoundCoordinateSystemName();
        
        /**
         * Gets the "localCoordinateSystemName" attribute
         */
        java.lang.String getLocalCoordinateSystemName();
        
        /**
         * Gets (as xml) the "localCoordinateSystemName" attribute
         */
        org.apache.xmlbeans.XmlString xgetLocalCoordinateSystemName();
        
        /**
         * True if has "localCoordinateSystemName" attribute
         */
        boolean isSetLocalCoordinateSystemName();
        
        /**
         * Sets the "localCoordinateSystemName" attribute
         */
        void setLocalCoordinateSystemName(java.lang.String localCoordinateSystemName);
        
        /**
         * Sets (as xml) the "localCoordinateSystemName" attribute
         */
        void xsetLocalCoordinateSystemName(org.apache.xmlbeans.XmlString localCoordinateSystemName);
        
        /**
         * Unsets the "localCoordinateSystemName" attribute
         */
        void unsetLocalCoordinateSystemName();
        
        /**
         * Gets the "geographicCoordinateSystemName" attribute
         */
        java.lang.String getGeographicCoordinateSystemName();
        
        /**
         * Gets (as xml) the "geographicCoordinateSystemName" attribute
         */
        org.apache.xmlbeans.XmlString xgetGeographicCoordinateSystemName();
        
        /**
         * True if has "geographicCoordinateSystemName" attribute
         */
        boolean isSetGeographicCoordinateSystemName();
        
        /**
         * Sets the "geographicCoordinateSystemName" attribute
         */
        void setGeographicCoordinateSystemName(java.lang.String geographicCoordinateSystemName);
        
        /**
         * Sets (as xml) the "geographicCoordinateSystemName" attribute
         */
        void xsetGeographicCoordinateSystemName(org.apache.xmlbeans.XmlString geographicCoordinateSystemName);
        
        /**
         * Unsets the "geographicCoordinateSystemName" attribute
         */
        void unsetGeographicCoordinateSystemName();
        
        /**
         * Gets the "projectedCoordinateSystemName" attribute
         */
        java.lang.String getProjectedCoordinateSystemName();
        
        /**
         * Gets (as xml) the "projectedCoordinateSystemName" attribute
         */
        org.apache.xmlbeans.XmlString xgetProjectedCoordinateSystemName();
        
        /**
         * True if has "projectedCoordinateSystemName" attribute
         */
        boolean isSetProjectedCoordinateSystemName();
        
        /**
         * Sets the "projectedCoordinateSystemName" attribute
         */
        void setProjectedCoordinateSystemName(java.lang.String projectedCoordinateSystemName);
        
        /**
         * Sets (as xml) the "projectedCoordinateSystemName" attribute
         */
        void xsetProjectedCoordinateSystemName(org.apache.xmlbeans.XmlString projectedCoordinateSystemName);
        
        /**
         * Unsets the "projectedCoordinateSystemName" attribute
         */
        void unsetProjectedCoordinateSystemName();
        
        /**
         * Gets the "verticalCoordinateSystemName" attribute
         */
        java.lang.String getVerticalCoordinateSystemName();
        
        /**
         * Gets (as xml) the "verticalCoordinateSystemName" attribute
         */
        org.apache.xmlbeans.XmlString xgetVerticalCoordinateSystemName();
        
        /**
         * True if has "verticalCoordinateSystemName" attribute
         */
        boolean isSetVerticalCoordinateSystemName();
        
        /**
         * Sets the "verticalCoordinateSystemName" attribute
         */
        void setVerticalCoordinateSystemName(java.lang.String verticalCoordinateSystemName);
        
        /**
         * Sets (as xml) the "verticalCoordinateSystemName" attribute
         */
        void xsetVerticalCoordinateSystemName(org.apache.xmlbeans.XmlString verticalCoordinateSystemName);
        
        /**
         * Unsets the "verticalCoordinateSystemName" attribute
         */
        void unsetVerticalCoordinateSystemName();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem newInstance() {
              return (org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.CoordinateSystemDocument newInstance() {
          return (org.landxml.schema.landXML11.CoordinateSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.CoordinateSystemDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.CoordinateSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.CoordinateSystemDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CoordinateSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.CoordinateSystemDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CoordinateSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.CoordinateSystemDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CoordinateSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.CoordinateSystemDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CoordinateSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.CoordinateSystemDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CoordinateSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.CoordinateSystemDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CoordinateSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.CoordinateSystemDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CoordinateSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.CoordinateSystemDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CoordinateSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.CoordinateSystemDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CoordinateSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.CoordinateSystemDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CoordinateSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.CoordinateSystemDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CoordinateSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.CoordinateSystemDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CoordinateSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.CoordinateSystemDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CoordinateSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.CoordinateSystemDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CoordinateSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CoordinateSystemDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CoordinateSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CoordinateSystemDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CoordinateSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
