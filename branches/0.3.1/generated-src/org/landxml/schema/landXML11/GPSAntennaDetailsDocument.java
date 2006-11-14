/*
 * An XML document type.
 * Localname: GPSAntennaDetails
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.GPSAntennaDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one GPSAntennaDetails(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface GPSAntennaDetailsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GPSAntennaDetailsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("gpsantennadetailsc88bdoctype");
    
    /**
     * Gets the "GPSAntennaDetails" element
     */
    org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails getGPSAntennaDetails();
    
    /**
     * Sets the "GPSAntennaDetails" element
     */
    void setGPSAntennaDetails(org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails gpsAntennaDetails);
    
    /**
     * Appends and returns a new empty "GPSAntennaDetails" element
     */
    org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails addNewGPSAntennaDetails();
    
    /**
     * An XML GPSAntennaDetails(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface GPSAntennaDetails extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GPSAntennaDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("gpsantennadetails71a0elemtype");
        
        /**
         * Gets a List of "Monument" elements
         */
        java.util.List<org.landxml.schema.landXML11.MonumentDocument.Monument> getMonumentList();
        
        /**
         * Gets array of all "Monument" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.MonumentDocument.Monument[] getMonumentArray();
        
        /**
         * Gets ith "Monument" element
         */
        org.landxml.schema.landXML11.MonumentDocument.Monument getMonumentArray(int i);
        
        /**
         * Returns number of "Monument" element
         */
        int sizeOfMonumentArray();
        
        /**
         * Sets array of all "Monument" element
         */
        void setMonumentArray(org.landxml.schema.landXML11.MonumentDocument.Monument[] monumentArray);
        
        /**
         * Sets ith "Monument" element
         */
        void setMonumentArray(int i, org.landxml.schema.landXML11.MonumentDocument.Monument monument);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Monument" element
         */
        org.landxml.schema.landXML11.MonumentDocument.Monument insertNewMonument(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Monument" element
         */
        org.landxml.schema.landXML11.MonumentDocument.Monument addNewMonument();
        
        /**
         * Removes the ith "Monument" element
         */
        void removeMonument(int i);
        
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
         * Gets the "manufacturer" attribute
         */
        java.lang.String getManufacturer();
        
        /**
         * Gets (as xml) the "manufacturer" attribute
         */
        org.apache.xmlbeans.XmlString xgetManufacturer();
        
        /**
         * True if has "manufacturer" attribute
         */
        boolean isSetManufacturer();
        
        /**
         * Sets the "manufacturer" attribute
         */
        void setManufacturer(java.lang.String manufacturer);
        
        /**
         * Sets (as xml) the "manufacturer" attribute
         */
        void xsetManufacturer(org.apache.xmlbeans.XmlString manufacturer);
        
        /**
         * Unsets the "manufacturer" attribute
         */
        void unsetManufacturer();
        
        /**
         * Gets the "model" attribute
         */
        java.lang.String getModel();
        
        /**
         * Gets (as xml) the "model" attribute
         */
        org.apache.xmlbeans.XmlString xgetModel();
        
        /**
         * True if has "model" attribute
         */
        boolean isSetModel();
        
        /**
         * Sets the "model" attribute
         */
        void setModel(java.lang.String model);
        
        /**
         * Sets (as xml) the "model" attribute
         */
        void xsetModel(org.apache.xmlbeans.XmlString model);
        
        /**
         * Unsets the "model" attribute
         */
        void unsetModel();
        
        /**
         * Gets the "serialNumber" attribute
         */
        java.lang.String getSerialNumber();
        
        /**
         * Gets (as xml) the "serialNumber" attribute
         */
        org.apache.xmlbeans.XmlString xgetSerialNumber();
        
        /**
         * True if has "serialNumber" attribute
         */
        boolean isSetSerialNumber();
        
        /**
         * Sets the "serialNumber" attribute
         */
        void setSerialNumber(java.lang.String serialNumber);
        
        /**
         * Sets (as xml) the "serialNumber" attribute
         */
        void xsetSerialNumber(org.apache.xmlbeans.XmlString serialNumber);
        
        /**
         * Unsets the "serialNumber" attribute
         */
        void unsetSerialNumber();
        
        /**
         * Gets the "latitude" attribute
         */
        double getLatitude();
        
        /**
         * Gets (as xml) the "latitude" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetLatitude();
        
        /**
         * True if has "latitude" attribute
         */
        boolean isSetLatitude();
        
        /**
         * Sets the "latitude" attribute
         */
        void setLatitude(double latitude);
        
        /**
         * Sets (as xml) the "latitude" attribute
         */
        void xsetLatitude(org.apache.xmlbeans.XmlDouble latitude);
        
        /**
         * Unsets the "latitude" attribute
         */
        void unsetLatitude();
        
        /**
         * Gets the "longitude" attribute
         */
        double getLongitude();
        
        /**
         * Gets (as xml) the "longitude" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetLongitude();
        
        /**
         * True if has "longitude" attribute
         */
        boolean isSetLongitude();
        
        /**
         * Sets the "longitude" attribute
         */
        void setLongitude(double longitude);
        
        /**
         * Sets (as xml) the "longitude" attribute
         */
        void xsetLongitude(org.apache.xmlbeans.XmlDouble longitude);
        
        /**
         * Unsets the "longitude" attribute
         */
        void unsetLongitude();
        
        /**
         * Gets the "altitude" attribute
         */
        double getAltitude();
        
        /**
         * Gets (as xml) the "altitude" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetAltitude();
        
        /**
         * True if has "altitude" attribute
         */
        boolean isSetAltitude();
        
        /**
         * Sets the "altitude" attribute
         */
        void setAltitude(double altitude);
        
        /**
         * Sets (as xml) the "altitude" attribute
         */
        void xsetAltitude(org.apache.xmlbeans.XmlDouble altitude);
        
        /**
         * Unsets the "altitude" attribute
         */
        void unsetAltitude();
        
        /**
         * Gets the "ellipsiodnalHeight" attribute
         */
        double getEllipsiodnalHeight();
        
        /**
         * Gets (as xml) the "ellipsiodnalHeight" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetEllipsiodnalHeight();
        
        /**
         * True if has "ellipsiodnalHeight" attribute
         */
        boolean isSetEllipsiodnalHeight();
        
        /**
         * Sets the "ellipsiodnalHeight" attribute
         */
        void setEllipsiodnalHeight(double ellipsiodnalHeight);
        
        /**
         * Sets (as xml) the "ellipsiodnalHeight" attribute
         */
        void xsetEllipsiodnalHeight(org.apache.xmlbeans.XmlDouble ellipsiodnalHeight);
        
        /**
         * Unsets the "ellipsiodnalHeight" attribute
         */
        void unsetEllipsiodnalHeight();
        
        /**
         * Gets the "orthometricHeight" attribute
         */
        double getOrthometricHeight();
        
        /**
         * Gets (as xml) the "orthometricHeight" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetOrthometricHeight();
        
        /**
         * True if has "orthometricHeight" attribute
         */
        boolean isSetOrthometricHeight();
        
        /**
         * Sets the "orthometricHeight" attribute
         */
        void setOrthometricHeight(double orthometricHeight);
        
        /**
         * Sets (as xml) the "orthometricHeight" attribute
         */
        void xsetOrthometricHeight(org.apache.xmlbeans.XmlDouble orthometricHeight);
        
        /**
         * Unsets the "orthometricHeight" attribute
         */
        void unsetOrthometricHeight();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails newInstance() {
              return (org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.GPSAntennaDetailsDocument.GPSAntennaDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.GPSAntennaDetailsDocument newInstance() {
          return (org.landxml.schema.landXML11.GPSAntennaDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.GPSAntennaDetailsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.GPSAntennaDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.GPSAntennaDetailsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSAntennaDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSAntennaDetailsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSAntennaDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.GPSAntennaDetailsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSAntennaDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSAntennaDetailsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSAntennaDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSAntennaDetailsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSAntennaDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSAntennaDetailsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSAntennaDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSAntennaDetailsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSAntennaDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSAntennaDetailsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSAntennaDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSAntennaDetailsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSAntennaDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSAntennaDetailsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSAntennaDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSAntennaDetailsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSAntennaDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSAntennaDetailsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSAntennaDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSAntennaDetailsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSAntennaDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSAntennaDetailsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSAntennaDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.GPSAntennaDetailsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.GPSAntennaDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.GPSAntennaDetailsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.GPSAntennaDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
