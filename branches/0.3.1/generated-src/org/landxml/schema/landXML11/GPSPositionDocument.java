/*
 * An XML document type.
 * Localname: GPSPosition
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.GPSPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one GPSPosition(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface GPSPositionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GPSPositionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("gpsposition1fb5doctype");
    
    /**
     * Gets the "GPSPosition" element
     */
    org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition getGPSPosition();
    
    /**
     * Sets the "GPSPosition" element
     */
    void setGPSPosition(org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition gpsPosition);
    
    /**
     * Appends and returns a new empty "GPSPosition" element
     */
    org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition addNewGPSPosition();
    
    /**
     * An XML GPSPosition(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface GPSPosition extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GPSPosition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("gpsposition66f4elemtype");
        
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
         * Gets the "wgsHeight" attribute
         */
        double getWgsHeight();
        
        /**
         * Gets (as xml) the "wgsHeight" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetWgsHeight();
        
        /**
         * Sets the "wgsHeight" attribute
         */
        void setWgsHeight(double wgsHeight);
        
        /**
         * Sets (as xml) the "wgsHeight" attribute
         */
        void xsetWgsHeight(org.apache.xmlbeans.XmlDouble wgsHeight);
        
        /**
         * Gets the "wgsLatitude" attribute
         */
        double getWgsLatitude();
        
        /**
         * Gets (as xml) the "wgsLatitude" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetWgsLatitude();
        
        /**
         * Sets the "wgsLatitude" attribute
         */
        void setWgsLatitude(double wgsLatitude);
        
        /**
         * Sets (as xml) the "wgsLatitude" attribute
         */
        void xsetWgsLatitude(org.apache.xmlbeans.XmlDouble wgsLatitude);
        
        /**
         * Gets the "wgsLongitude" attribute
         */
        double getWgsLongitude();
        
        /**
         * Gets (as xml) the "wgsLongitude" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetWgsLongitude();
        
        /**
         * Sets the "wgsLongitude" attribute
         */
        void setWgsLongitude(double wgsLongitude);
        
        /**
         * Sets (as xml) the "wgsLongitude" attribute
         */
        void xsetWgsLongitude(org.apache.xmlbeans.XmlDouble wgsLongitude);
        
        /**
         * Gets the "purpose" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType getPurpose();
        
        /**
         * True if has "purpose" attribute
         */
        boolean isSetPurpose();
        
        /**
         * Sets the "purpose" attribute
         */
        void setPurpose(org.apache.xmlbeans.XmlAnySimpleType purpose);
        
        /**
         * Appends and returns a new empty "purpose" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType addNewPurpose();
        
        /**
         * Unsets the "purpose" attribute
         */
        void unsetPurpose();
        
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
         * Gets the "pntRef" attribute
         */
        java.lang.String getPntRef();
        
        /**
         * Gets (as xml) the "pntRef" attribute
         */
        org.landxml.schema.landXML11.PointNameRef xgetPntRef();
        
        /**
         * True if has "pntRef" attribute
         */
        boolean isSetPntRef();
        
        /**
         * Sets the "pntRef" attribute
         */
        void setPntRef(java.lang.String pntRef);
        
        /**
         * Sets (as xml) the "pntRef" attribute
         */
        void xsetPntRef(org.landxml.schema.landXML11.PointNameRef pntRef);
        
        /**
         * Unsets the "pntRef" attribute
         */
        void unsetPntRef();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition newInstance() {
              return (org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.GPSPositionDocument.GPSPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.GPSPositionDocument newInstance() {
          return (org.landxml.schema.landXML11.GPSPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.GPSPositionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.GPSPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.GPSPositionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSPositionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.GPSPositionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSPositionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSPositionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSPositionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSPositionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSPositionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSPositionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSPositionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSPositionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSPositionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSPositionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSPositionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.GPSPositionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.GPSPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.GPSPositionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.GPSPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
