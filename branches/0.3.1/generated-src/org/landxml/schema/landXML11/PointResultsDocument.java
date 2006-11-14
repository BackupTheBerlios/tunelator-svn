/*
 * An XML document type.
 * Localname: PointResults
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PointResultsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one PointResults(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface PointResultsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PointResultsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("pointresultsc31adoctype");
    
    /**
     * Gets the "PointResults" element
     */
    org.landxml.schema.landXML11.PointResultsDocument.PointResults getPointResults();
    
    /**
     * Sets the "PointResults" element
     */
    void setPointResults(org.landxml.schema.landXML11.PointResultsDocument.PointResults pointResults);
    
    /**
     * Appends and returns a new empty "PointResults" element
     */
    org.landxml.schema.landXML11.PointResultsDocument.PointResults addNewPointResults();
    
    /**
     * An XML PointResults(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface PointResults extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PointResults.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("pointresults3c58elemtype");
        
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
         * Gets the "meanHorizAngle" attribute
         */
        double getMeanHorizAngle();
        
        /**
         * Gets (as xml) the "meanHorizAngle" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetMeanHorizAngle();
        
        /**
         * True if has "meanHorizAngle" attribute
         */
        boolean isSetMeanHorizAngle();
        
        /**
         * Sets the "meanHorizAngle" attribute
         */
        void setMeanHorizAngle(double meanHorizAngle);
        
        /**
         * Sets (as xml) the "meanHorizAngle" attribute
         */
        void xsetMeanHorizAngle(org.apache.xmlbeans.XmlDouble meanHorizAngle);
        
        /**
         * Unsets the "meanHorizAngle" attribute
         */
        void unsetMeanHorizAngle();
        
        /**
         * Gets the "horizStdDeviation" attribute
         */
        double getHorizStdDeviation();
        
        /**
         * Gets (as xml) the "horizStdDeviation" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetHorizStdDeviation();
        
        /**
         * True if has "horizStdDeviation" attribute
         */
        boolean isSetHorizStdDeviation();
        
        /**
         * Sets the "horizStdDeviation" attribute
         */
        void setHorizStdDeviation(double horizStdDeviation);
        
        /**
         * Sets (as xml) the "horizStdDeviation" attribute
         */
        void xsetHorizStdDeviation(org.apache.xmlbeans.XmlDouble horizStdDeviation);
        
        /**
         * Unsets the "horizStdDeviation" attribute
         */
        void unsetHorizStdDeviation();
        
        /**
         * Gets the "meanzenithAngle" attribute
         */
        double getMeanzenithAngle();
        
        /**
         * Gets (as xml) the "meanzenithAngle" attribute
         */
        org.landxml.schema.landXML11.ZenithAngle xgetMeanzenithAngle();
        
        /**
         * True if has "meanzenithAngle" attribute
         */
        boolean isSetMeanzenithAngle();
        
        /**
         * Sets the "meanzenithAngle" attribute
         */
        void setMeanzenithAngle(double meanzenithAngle);
        
        /**
         * Sets (as xml) the "meanzenithAngle" attribute
         */
        void xsetMeanzenithAngle(org.landxml.schema.landXML11.ZenithAngle meanzenithAngle);
        
        /**
         * Unsets the "meanzenithAngle" attribute
         */
        void unsetMeanzenithAngle();
        
        /**
         * Gets the "vertStdDeviation" attribute
         */
        double getVertStdDeviation();
        
        /**
         * Gets (as xml) the "vertStdDeviation" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetVertStdDeviation();
        
        /**
         * True if has "vertStdDeviation" attribute
         */
        boolean isSetVertStdDeviation();
        
        /**
         * Sets the "vertStdDeviation" attribute
         */
        void setVertStdDeviation(double vertStdDeviation);
        
        /**
         * Sets (as xml) the "vertStdDeviation" attribute
         */
        void xsetVertStdDeviation(org.apache.xmlbeans.XmlDouble vertStdDeviation);
        
        /**
         * Unsets the "vertStdDeviation" attribute
         */
        void unsetVertStdDeviation();
        
        /**
         * Gets the "meanSlopeDistance" attribute
         */
        double getMeanSlopeDistance();
        
        /**
         * Gets (as xml) the "meanSlopeDistance" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetMeanSlopeDistance();
        
        /**
         * True if has "meanSlopeDistance" attribute
         */
        boolean isSetMeanSlopeDistance();
        
        /**
         * Sets the "meanSlopeDistance" attribute
         */
        void setMeanSlopeDistance(double meanSlopeDistance);
        
        /**
         * Sets (as xml) the "meanSlopeDistance" attribute
         */
        void xsetMeanSlopeDistance(org.apache.xmlbeans.XmlDouble meanSlopeDistance);
        
        /**
         * Unsets the "meanSlopeDistance" attribute
         */
        void unsetMeanSlopeDistance();
        
        /**
         * Gets the "slopeDistanceStdDeviation" attribute
         */
        double getSlopeDistanceStdDeviation();
        
        /**
         * Gets (as xml) the "slopeDistanceStdDeviation" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSlopeDistanceStdDeviation();
        
        /**
         * True if has "slopeDistanceStdDeviation" attribute
         */
        boolean isSetSlopeDistanceStdDeviation();
        
        /**
         * Sets the "slopeDistanceStdDeviation" attribute
         */
        void setSlopeDistanceStdDeviation(double slopeDistanceStdDeviation);
        
        /**
         * Sets (as xml) the "slopeDistanceStdDeviation" attribute
         */
        void xsetSlopeDistanceStdDeviation(org.apache.xmlbeans.XmlDouble slopeDistanceStdDeviation);
        
        /**
         * Unsets the "slopeDistanceStdDeviation" attribute
         */
        void unsetSlopeDistanceStdDeviation();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.PointResultsDocument.PointResults newInstance() {
              return (org.landxml.schema.landXML11.PointResultsDocument.PointResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.PointResultsDocument.PointResults newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.PointResultsDocument.PointResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.PointResultsDocument newInstance() {
          return (org.landxml.schema.landXML11.PointResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.PointResultsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.PointResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.PointResultsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PointResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.PointResultsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PointResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.PointResultsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PointResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.PointResultsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PointResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.PointResultsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PointResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.PointResultsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PointResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.PointResultsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PointResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.PointResultsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PointResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.PointResultsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PointResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.PointResultsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PointResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.PointResultsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PointResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.PointResultsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PointResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.PointResultsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PointResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.PointResultsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PointResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.PointResultsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.PointResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.PointResultsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.PointResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
