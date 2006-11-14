/*
 * An XML document type.
 * Localname: CrashHistory
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CrashHistoryDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one CrashHistory(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface CrashHistoryDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CrashHistoryDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("crashhistory6501doctype");
    
    /**
     * Gets the "CrashHistory" element
     */
    org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory getCrashHistory();
    
    /**
     * Sets the "CrashHistory" element
     */
    void setCrashHistory(org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory crashHistory);
    
    /**
     * Appends and returns a new empty "CrashHistory" element
     */
    org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory addNewCrashHistory();
    
    /**
     * An XML CrashHistory(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface CrashHistory extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CrashHistory.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("crashhistory5178elemtype");
        
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
         * Gets the "year" attribute
         */
        java.util.Calendar getYear();
        
        /**
         * Gets (as xml) the "year" attribute
         */
        org.apache.xmlbeans.XmlDate xgetYear();
        
        /**
         * True if has "year" attribute
         */
        boolean isSetYear();
        
        /**
         * Sets the "year" attribute
         */
        void setYear(java.util.Calendar year);
        
        /**
         * Sets (as xml) the "year" attribute
         */
        void xsetYear(org.apache.xmlbeans.XmlDate year);
        
        /**
         * Unsets the "year" attribute
         */
        void unsetYear();
        
        /**
         * Gets the "location-1" attribute
         */
        double getLocation1();
        
        /**
         * Gets (as xml) the "location-1" attribute
         */
        org.landxml.schema.landXML11.Station xgetLocation1();
        
        /**
         * True if has "location-1" attribute
         */
        boolean isSetLocation1();
        
        /**
         * Sets the "location-1" attribute
         */
        void setLocation1(double location1);
        
        /**
         * Sets (as xml) the "location-1" attribute
         */
        void xsetLocation1(org.landxml.schema.landXML11.Station location1);
        
        /**
         * Unsets the "location-1" attribute
         */
        void unsetLocation1();
        
        /**
         * Gets the "location-2" attribute
         */
        double getLocation2();
        
        /**
         * Gets (as xml) the "location-2" attribute
         */
        org.landxml.schema.landXML11.Station xgetLocation2();
        
        /**
         * True if has "location-2" attribute
         */
        boolean isSetLocation2();
        
        /**
         * Sets the "location-2" attribute
         */
        void setLocation2(double location2);
        
        /**
         * Sets (as xml) the "location-2" attribute
         */
        void xsetLocation2(org.landxml.schema.landXML11.Station location2);
        
        /**
         * Unsets the "location-2" attribute
         */
        void unsetLocation2();
        
        /**
         * Gets the "severity" attribute
         */
        org.landxml.schema.landXML11.CrashSeverityType.Enum getSeverity();
        
        /**
         * Gets (as xml) the "severity" attribute
         */
        org.landxml.schema.landXML11.CrashSeverityType xgetSeverity();
        
        /**
         * True if has "severity" attribute
         */
        boolean isSetSeverity();
        
        /**
         * Sets the "severity" attribute
         */
        void setSeverity(org.landxml.schema.landXML11.CrashSeverityType.Enum severity);
        
        /**
         * Sets (as xml) the "severity" attribute
         */
        void xsetSeverity(org.landxml.schema.landXML11.CrashSeverityType severity);
        
        /**
         * Unsets the "severity" attribute
         */
        void unsetSeverity();
        
        /**
         * Gets the "intersectionRelation" attribute
         */
        org.landxml.schema.landXML11.CrashIntersectionRelation.Enum getIntersectionRelation();
        
        /**
         * Gets (as xml) the "intersectionRelation" attribute
         */
        org.landxml.schema.landXML11.CrashIntersectionRelation xgetIntersectionRelation();
        
        /**
         * True if has "intersectionRelation" attribute
         */
        boolean isSetIntersectionRelation();
        
        /**
         * Sets the "intersectionRelation" attribute
         */
        void setIntersectionRelation(org.landxml.schema.landXML11.CrashIntersectionRelation.Enum intersectionRelation);
        
        /**
         * Sets (as xml) the "intersectionRelation" attribute
         */
        void xsetIntersectionRelation(org.landxml.schema.landXML11.CrashIntersectionRelation intersectionRelation);
        
        /**
         * Unsets the "intersectionRelation" attribute
         */
        void unsetIntersectionRelation();
        
        /**
         * Gets the "intersectionLocation" attribute
         */
        double getIntersectionLocation();
        
        /**
         * Gets (as xml) the "intersectionLocation" attribute
         */
        org.landxml.schema.landXML11.Station xgetIntersectionLocation();
        
        /**
         * True if has "intersectionLocation" attribute
         */
        boolean isSetIntersectionLocation();
        
        /**
         * Sets the "intersectionLocation" attribute
         */
        void setIntersectionLocation(double intersectionLocation);
        
        /**
         * Sets (as xml) the "intersectionLocation" attribute
         */
        void xsetIntersectionLocation(org.landxml.schema.landXML11.Station intersectionLocation);
        
        /**
         * Unsets the "intersectionLocation" attribute
         */
        void unsetIntersectionLocation();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory newInstance() {
              return (org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.CrashHistoryDocument.CrashHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.CrashHistoryDocument newInstance() {
          return (org.landxml.schema.landXML11.CrashHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.CrashHistoryDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.CrashHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.CrashHistoryDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrashHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.CrashHistoryDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrashHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.CrashHistoryDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrashHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.CrashHistoryDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrashHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.CrashHistoryDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrashHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.CrashHistoryDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrashHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.CrashHistoryDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrashHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.CrashHistoryDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrashHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.CrashHistoryDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrashHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.CrashHistoryDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrashHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.CrashHistoryDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrashHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.CrashHistoryDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrashHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.CrashHistoryDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrashHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.CrashHistoryDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrashHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CrashHistoryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CrashHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CrashHistoryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CrashHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
