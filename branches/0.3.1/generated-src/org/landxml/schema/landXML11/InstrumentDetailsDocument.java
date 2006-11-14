/*
 * An XML document type.
 * Localname: InstrumentDetails
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.InstrumentDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one InstrumentDetails(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface InstrumentDetailsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InstrumentDetailsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("instrumentdetails00dddoctype");
    
    /**
     * Gets the "InstrumentDetails" element
     */
    org.landxml.schema.landXML11.InstrumentDetailsDocument.InstrumentDetails getInstrumentDetails();
    
    /**
     * Sets the "InstrumentDetails" element
     */
    void setInstrumentDetails(org.landxml.schema.landXML11.InstrumentDetailsDocument.InstrumentDetails instrumentDetails);
    
    /**
     * Appends and returns a new empty "InstrumentDetails" element
     */
    org.landxml.schema.landXML11.InstrumentDetailsDocument.InstrumentDetails addNewInstrumentDetails();
    
    /**
     * An XML InstrumentDetails(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface InstrumentDetails extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InstrumentDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("instrumentdetails8544elemtype");
        
        /**
         * Gets the "Corrections" element
         */
        org.landxml.schema.landXML11.CorrectionsDocument.Corrections getCorrections();
        
        /**
         * Sets the "Corrections" element
         */
        void setCorrections(org.landxml.schema.landXML11.CorrectionsDocument.Corrections corrections);
        
        /**
         * Appends and returns a new empty "Corrections" element
         */
        org.landxml.schema.landXML11.CorrectionsDocument.Corrections addNewCorrections();
        
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
         * Gets the "edmAccuracyConstant" attribute
         */
        double getEdmAccuracyConstant();
        
        /**
         * Gets (as xml) the "edmAccuracyConstant" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetEdmAccuracyConstant();
        
        /**
         * True if has "edmAccuracyConstant" attribute
         */
        boolean isSetEdmAccuracyConstant();
        
        /**
         * Sets the "edmAccuracyConstant" attribute
         */
        void setEdmAccuracyConstant(double edmAccuracyConstant);
        
        /**
         * Sets (as xml) the "edmAccuracyConstant" attribute
         */
        void xsetEdmAccuracyConstant(org.apache.xmlbeans.XmlDouble edmAccuracyConstant);
        
        /**
         * Unsets the "edmAccuracyConstant" attribute
         */
        void unsetEdmAccuracyConstant();
        
        /**
         * Gets the "edmAccuracyppm" attribute
         */
        double getEdmAccuracyppm();
        
        /**
         * Gets (as xml) the "edmAccuracyppm" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetEdmAccuracyppm();
        
        /**
         * True if has "edmAccuracyppm" attribute
         */
        boolean isSetEdmAccuracyppm();
        
        /**
         * Sets the "edmAccuracyppm" attribute
         */
        void setEdmAccuracyppm(double edmAccuracyppm);
        
        /**
         * Sets (as xml) the "edmAccuracyppm" attribute
         */
        void xsetEdmAccuracyppm(org.apache.xmlbeans.XmlDouble edmAccuracyppm);
        
        /**
         * Unsets the "edmAccuracyppm" attribute
         */
        void unsetEdmAccuracyppm();
        
        /**
         * Gets the "edmVertOffset" attribute
         */
        double getEdmVertOffset();
        
        /**
         * Gets (as xml) the "edmVertOffset" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetEdmVertOffset();
        
        /**
         * True if has "edmVertOffset" attribute
         */
        boolean isSetEdmVertOffset();
        
        /**
         * Sets the "edmVertOffset" attribute
         */
        void setEdmVertOffset(double edmVertOffset);
        
        /**
         * Sets (as xml) the "edmVertOffset" attribute
         */
        void xsetEdmVertOffset(org.apache.xmlbeans.XmlDouble edmVertOffset);
        
        /**
         * Unsets the "edmVertOffset" attribute
         */
        void unsetEdmVertOffset();
        
        /**
         * Gets the "horizAnglePrecision" attribute
         */
        double getHorizAnglePrecision();
        
        /**
         * Gets (as xml) the "horizAnglePrecision" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetHorizAnglePrecision();
        
        /**
         * True if has "horizAnglePrecision" attribute
         */
        boolean isSetHorizAnglePrecision();
        
        /**
         * Sets the "horizAnglePrecision" attribute
         */
        void setHorizAnglePrecision(double horizAnglePrecision);
        
        /**
         * Sets (as xml) the "horizAnglePrecision" attribute
         */
        void xsetHorizAnglePrecision(org.apache.xmlbeans.XmlDouble horizAnglePrecision);
        
        /**
         * Unsets the "horizAnglePrecision" attribute
         */
        void unsetHorizAnglePrecision();
        
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
         * Gets the "zenithAnglePrecision" attribute
         */
        double getZenithAnglePrecision();
        
        /**
         * Gets (as xml) the "zenithAnglePrecision" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetZenithAnglePrecision();
        
        /**
         * True if has "zenithAnglePrecision" attribute
         */
        boolean isSetZenithAnglePrecision();
        
        /**
         * Sets the "zenithAnglePrecision" attribute
         */
        void setZenithAnglePrecision(double zenithAnglePrecision);
        
        /**
         * Sets (as xml) the "zenithAnglePrecision" attribute
         */
        void xsetZenithAnglePrecision(org.apache.xmlbeans.XmlDouble zenithAnglePrecision);
        
        /**
         * Unsets the "zenithAnglePrecision" attribute
         */
        void unsetZenithAnglePrecision();
        
        /**
         * Gets the "carrierWavelength" attribute
         */
        double getCarrierWavelength();
        
        /**
         * Gets (as xml) the "carrierWavelength" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetCarrierWavelength();
        
        /**
         * True if has "carrierWavelength" attribute
         */
        boolean isSetCarrierWavelength();
        
        /**
         * Sets the "carrierWavelength" attribute
         */
        void setCarrierWavelength(double carrierWavelength);
        
        /**
         * Sets (as xml) the "carrierWavelength" attribute
         */
        void xsetCarrierWavelength(org.apache.xmlbeans.XmlDouble carrierWavelength);
        
        /**
         * Unsets the "carrierWavelength" attribute
         */
        void unsetCarrierWavelength();
        
        /**
         * Gets the "refractiveIndex" attribute
         */
        double getRefractiveIndex();
        
        /**
         * Gets (as xml) the "refractiveIndex" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetRefractiveIndex();
        
        /**
         * True if has "refractiveIndex" attribute
         */
        boolean isSetRefractiveIndex();
        
        /**
         * Sets the "refractiveIndex" attribute
         */
        void setRefractiveIndex(double refractiveIndex);
        
        /**
         * Sets (as xml) the "refractiveIndex" attribute
         */
        void xsetRefractiveIndex(org.apache.xmlbeans.XmlDouble refractiveIndex);
        
        /**
         * Unsets the "refractiveIndex" attribute
         */
        void unsetRefractiveIndex();
        
        /**
         * Gets the "horizCollimation" attribute
         */
        double getHorizCollimation();
        
        /**
         * Gets (as xml) the "horizCollimation" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetHorizCollimation();
        
        /**
         * True if has "horizCollimation" attribute
         */
        boolean isSetHorizCollimation();
        
        /**
         * Sets the "horizCollimation" attribute
         */
        void setHorizCollimation(double horizCollimation);
        
        /**
         * Sets (as xml) the "horizCollimation" attribute
         */
        void xsetHorizCollimation(org.apache.xmlbeans.XmlDouble horizCollimation);
        
        /**
         * Unsets the "horizCollimation" attribute
         */
        void unsetHorizCollimation();
        
        /**
         * Gets the "vertCollimation" attribute
         */
        double getVertCollimation();
        
        /**
         * Gets (as xml) the "vertCollimation" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetVertCollimation();
        
        /**
         * True if has "vertCollimation" attribute
         */
        boolean isSetVertCollimation();
        
        /**
         * Sets the "vertCollimation" attribute
         */
        void setVertCollimation(double vertCollimation);
        
        /**
         * Sets (as xml) the "vertCollimation" attribute
         */
        void xsetVertCollimation(org.apache.xmlbeans.XmlDouble vertCollimation);
        
        /**
         * Unsets the "vertCollimation" attribute
         */
        void unsetVertCollimation();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.InstrumentDetailsDocument.InstrumentDetails newInstance() {
              return (org.landxml.schema.landXML11.InstrumentDetailsDocument.InstrumentDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.InstrumentDetailsDocument.InstrumentDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.InstrumentDetailsDocument.InstrumentDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.InstrumentDetailsDocument newInstance() {
          return (org.landxml.schema.landXML11.InstrumentDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.InstrumentDetailsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.InstrumentDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.InstrumentDetailsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.InstrumentDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.InstrumentDetailsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.InstrumentDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.InstrumentDetailsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.InstrumentDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.InstrumentDetailsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.InstrumentDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.InstrumentDetailsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.InstrumentDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.InstrumentDetailsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.InstrumentDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.InstrumentDetailsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.InstrumentDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.InstrumentDetailsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.InstrumentDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.InstrumentDetailsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.InstrumentDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.InstrumentDetailsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.InstrumentDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.InstrumentDetailsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.InstrumentDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.InstrumentDetailsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.InstrumentDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.InstrumentDetailsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.InstrumentDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.InstrumentDetailsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.InstrumentDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.InstrumentDetailsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.InstrumentDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.InstrumentDetailsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.InstrumentDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
