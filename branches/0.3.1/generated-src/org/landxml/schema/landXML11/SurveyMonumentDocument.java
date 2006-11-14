/*
 * An XML document type.
 * Localname: SurveyMonument
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.SurveyMonumentDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one SurveyMonument(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface SurveyMonumentDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SurveyMonumentDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("surveymonument7015doctype");
    
    /**
     * Gets the "SurveyMonument" element
     */
    org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument getSurveyMonument();
    
    /**
     * Sets the "SurveyMonument" element
     */
    void setSurveyMonument(org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument surveyMonument);
    
    /**
     * Appends and returns a new empty "SurveyMonument" element
     */
    org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument addNewSurveyMonument();
    
    /**
     * An XML SurveyMonument(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface SurveyMonument extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SurveyMonument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("surveymonument5df8elemtype");
        
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
         * Gets the "mntRef" attribute
         */
        java.lang.String getMntRef();
        
        /**
         * Gets (as xml) the "mntRef" attribute
         */
        org.landxml.schema.landXML11.MonumentNameRef xgetMntRef();
        
        /**
         * Sets the "mntRef" attribute
         */
        void setMntRef(java.lang.String mntRef);
        
        /**
         * Sets (as xml) the "mntRef" attribute
         */
        void xsetMntRef(org.landxml.schema.landXML11.MonumentNameRef mntRef);
        
        /**
         * Gets the "purpose" attribute
         */
        java.lang.String getPurpose();
        
        /**
         * Gets (as xml) the "purpose" attribute
         */
        org.landxml.schema.landXML11.MonumentPurpose xgetPurpose();
        
        /**
         * Sets the "purpose" attribute
         */
        void setPurpose(java.lang.String purpose);
        
        /**
         * Sets (as xml) the "purpose" attribute
         */
        void xsetPurpose(org.landxml.schema.landXML11.MonumentPurpose purpose);
        
        /**
         * Gets the "state" attribute
         */
        java.lang.String getState();
        
        /**
         * Gets (as xml) the "state" attribute
         */
        org.landxml.schema.landXML11.MonumentState xgetState();
        
        /**
         * True if has "state" attribute
         */
        boolean isSetState();
        
        /**
         * Sets the "state" attribute
         */
        void setState(java.lang.String state);
        
        /**
         * Sets (as xml) the "state" attribute
         */
        void xsetState(org.landxml.schema.landXML11.MonumentState state);
        
        /**
         * Unsets the "state" attribute
         */
        void unsetState();
        
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
         * Gets the "disturbedMonument" attribute
         */
        java.lang.String getDisturbedMonument();
        
        /**
         * Gets (as xml) the "disturbedMonument" attribute
         */
        org.apache.xmlbeans.XmlString xgetDisturbedMonument();
        
        /**
         * True if has "disturbedMonument" attribute
         */
        boolean isSetDisturbedMonument();
        
        /**
         * Sets the "disturbedMonument" attribute
         */
        void setDisturbedMonument(java.lang.String disturbedMonument);
        
        /**
         * Sets (as xml) the "disturbedMonument" attribute
         */
        void xsetDisturbedMonument(org.apache.xmlbeans.XmlString disturbedMonument);
        
        /**
         * Unsets the "disturbedMonument" attribute
         */
        void unsetDisturbedMonument();
        
        /**
         * Gets the "disturbedDate" attribute
         */
        java.util.Calendar getDisturbedDate();
        
        /**
         * Gets (as xml) the "disturbedDate" attribute
         */
        org.apache.xmlbeans.XmlDate xgetDisturbedDate();
        
        /**
         * True if has "disturbedDate" attribute
         */
        boolean isSetDisturbedDate();
        
        /**
         * Sets the "disturbedDate" attribute
         */
        void setDisturbedDate(java.util.Calendar disturbedDate);
        
        /**
         * Sets (as xml) the "disturbedDate" attribute
         */
        void xsetDisturbedDate(org.apache.xmlbeans.XmlDate disturbedDate);
        
        /**
         * Unsets the "disturbedDate" attribute
         */
        void unsetDisturbedDate();
        
        /**
         * Gets the "disturbedAnnotation" attribute
         */
        java.lang.String getDisturbedAnnotation();
        
        /**
         * Gets (as xml) the "disturbedAnnotation" attribute
         */
        org.apache.xmlbeans.XmlString xgetDisturbedAnnotation();
        
        /**
         * True if has "disturbedAnnotation" attribute
         */
        boolean isSetDisturbedAnnotation();
        
        /**
         * Sets the "disturbedAnnotation" attribute
         */
        void setDisturbedAnnotation(java.lang.String disturbedAnnotation);
        
        /**
         * Sets (as xml) the "disturbedAnnotation" attribute
         */
        void xsetDisturbedAnnotation(org.apache.xmlbeans.XmlString disturbedAnnotation);
        
        /**
         * Unsets the "disturbedAnnotation" attribute
         */
        void unsetDisturbedAnnotation();
        
        /**
         * Gets the "replacedMonument" attribute
         */
        java.lang.String getReplacedMonument();
        
        /**
         * Gets (as xml) the "replacedMonument" attribute
         */
        org.apache.xmlbeans.XmlString xgetReplacedMonument();
        
        /**
         * True if has "replacedMonument" attribute
         */
        boolean isSetReplacedMonument();
        
        /**
         * Sets the "replacedMonument" attribute
         */
        void setReplacedMonument(java.lang.String replacedMonument);
        
        /**
         * Sets (as xml) the "replacedMonument" attribute
         */
        void xsetReplacedMonument(org.apache.xmlbeans.XmlString replacedMonument);
        
        /**
         * Unsets the "replacedMonument" attribute
         */
        void unsetReplacedMonument();
        
        /**
         * Gets the "replacedDate" attribute
         */
        java.util.Calendar getReplacedDate();
        
        /**
         * Gets (as xml) the "replacedDate" attribute
         */
        org.apache.xmlbeans.XmlDate xgetReplacedDate();
        
        /**
         * True if has "replacedDate" attribute
         */
        boolean isSetReplacedDate();
        
        /**
         * Sets the "replacedDate" attribute
         */
        void setReplacedDate(java.util.Calendar replacedDate);
        
        /**
         * Sets (as xml) the "replacedDate" attribute
         */
        void xsetReplacedDate(org.apache.xmlbeans.XmlDate replacedDate);
        
        /**
         * Unsets the "replacedDate" attribute
         */
        void unsetReplacedDate();
        
        /**
         * Gets the "replacedAnnotation" attribute
         */
        java.lang.String getReplacedAnnotation();
        
        /**
         * Gets (as xml) the "replacedAnnotation" attribute
         */
        org.apache.xmlbeans.XmlString xgetReplacedAnnotation();
        
        /**
         * True if has "replacedAnnotation" attribute
         */
        boolean isSetReplacedAnnotation();
        
        /**
         * Sets the "replacedAnnotation" attribute
         */
        void setReplacedAnnotation(java.lang.String replacedAnnotation);
        
        /**
         * Sets (as xml) the "replacedAnnotation" attribute
         */
        void xsetReplacedAnnotation(org.apache.xmlbeans.XmlString replacedAnnotation);
        
        /**
         * Unsets the "replacedAnnotation" attribute
         */
        void unsetReplacedAnnotation();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument newInstance() {
              return (org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.SurveyMonumentDocument newInstance() {
          return (org.landxml.schema.landXML11.SurveyMonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyMonumentDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.SurveyMonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.SurveyMonumentDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SurveyMonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyMonumentDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SurveyMonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.SurveyMonumentDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyMonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyMonumentDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyMonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.SurveyMonumentDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyMonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyMonumentDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyMonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.SurveyMonumentDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyMonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyMonumentDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyMonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.SurveyMonumentDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyMonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyMonumentDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyMonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.SurveyMonumentDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SurveyMonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyMonumentDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SurveyMonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.SurveyMonumentDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SurveyMonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyMonumentDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SurveyMonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.SurveyMonumentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.SurveyMonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.SurveyMonumentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.SurveyMonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
