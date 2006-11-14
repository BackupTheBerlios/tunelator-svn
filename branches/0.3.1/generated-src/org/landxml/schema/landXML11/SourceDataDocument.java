/*
 * An XML document type.
 * Localname: SourceData
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.SourceDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one SourceData(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface SourceDataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SourceDataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("sourcedataf8b9doctype");
    
    /**
     * Gets the "SourceData" element
     */
    org.landxml.schema.landXML11.SourceDataDocument.SourceData getSourceData();
    
    /**
     * Sets the "SourceData" element
     */
    void setSourceData(org.landxml.schema.landXML11.SourceDataDocument.SourceData sourceData);
    
    /**
     * Appends and returns a new empty "SourceData" element
     */
    org.landxml.schema.landXML11.SourceDataDocument.SourceData addNewSourceData();
    
    /**
     * An XML SourceData(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface SourceData extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SourceData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("sourcedataba78elemtype");
        
        /**
         * Gets a List of "Chain" elements
         */
        java.util.List<org.landxml.schema.landXML11.ChainDocument.Chain> getChainList();
        
        /**
         * Gets array of all "Chain" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ChainDocument.Chain[] getChainArray();
        
        /**
         * Gets ith "Chain" element
         */
        org.landxml.schema.landXML11.ChainDocument.Chain getChainArray(int i);
        
        /**
         * Returns number of "Chain" element
         */
        int sizeOfChainArray();
        
        /**
         * Sets array of all "Chain" element
         */
        void setChainArray(org.landxml.schema.landXML11.ChainDocument.Chain[] chainArray);
        
        /**
         * Sets ith "Chain" element
         */
        void setChainArray(int i, org.landxml.schema.landXML11.ChainDocument.Chain chain);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Chain" element
         */
        org.landxml.schema.landXML11.ChainDocument.Chain insertNewChain(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Chain" element
         */
        org.landxml.schema.landXML11.ChainDocument.Chain addNewChain();
        
        /**
         * Removes the ith "Chain" element
         */
        void removeChain(int i);
        
        /**
         * Gets a List of "PointFiles" elements
         */
        java.util.List<org.landxml.schema.landXML11.PointFilesDocument.PointFiles> getPointFilesList();
        
        /**
         * Gets array of all "PointFiles" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.PointFilesDocument.PointFiles[] getPointFilesArray();
        
        /**
         * Gets ith "PointFiles" element
         */
        org.landxml.schema.landXML11.PointFilesDocument.PointFiles getPointFilesArray(int i);
        
        /**
         * Returns number of "PointFiles" element
         */
        int sizeOfPointFilesArray();
        
        /**
         * Sets array of all "PointFiles" element
         */
        void setPointFilesArray(org.landxml.schema.landXML11.PointFilesDocument.PointFiles[] pointFilesArray);
        
        /**
         * Sets ith "PointFiles" element
         */
        void setPointFilesArray(int i, org.landxml.schema.landXML11.PointFilesDocument.PointFiles pointFiles);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PointFiles" element
         */
        org.landxml.schema.landXML11.PointFilesDocument.PointFiles insertNewPointFiles(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PointFiles" element
         */
        org.landxml.schema.landXML11.PointFilesDocument.PointFiles addNewPointFiles();
        
        /**
         * Removes the ith "PointFiles" element
         */
        void removePointFiles(int i);
        
        /**
         * Gets a List of "Boundaries" elements
         */
        java.util.List<org.landxml.schema.landXML11.BoundariesDocument.Boundaries> getBoundariesList();
        
        /**
         * Gets array of all "Boundaries" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.BoundariesDocument.Boundaries[] getBoundariesArray();
        
        /**
         * Gets ith "Boundaries" element
         */
        org.landxml.schema.landXML11.BoundariesDocument.Boundaries getBoundariesArray(int i);
        
        /**
         * Returns number of "Boundaries" element
         */
        int sizeOfBoundariesArray();
        
        /**
         * Sets array of all "Boundaries" element
         */
        void setBoundariesArray(org.landxml.schema.landXML11.BoundariesDocument.Boundaries[] boundariesArray);
        
        /**
         * Sets ith "Boundaries" element
         */
        void setBoundariesArray(int i, org.landxml.schema.landXML11.BoundariesDocument.Boundaries boundaries);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Boundaries" element
         */
        org.landxml.schema.landXML11.BoundariesDocument.Boundaries insertNewBoundaries(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Boundaries" element
         */
        org.landxml.schema.landXML11.BoundariesDocument.Boundaries addNewBoundaries();
        
        /**
         * Removes the ith "Boundaries" element
         */
        void removeBoundaries(int i);
        
        /**
         * Gets a List of "Breaklines" elements
         */
        java.util.List<org.landxml.schema.landXML11.BreaklinesDocument.Breaklines> getBreaklinesList();
        
        /**
         * Gets array of all "Breaklines" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.BreaklinesDocument.Breaklines[] getBreaklinesArray();
        
        /**
         * Gets ith "Breaklines" element
         */
        org.landxml.schema.landXML11.BreaklinesDocument.Breaklines getBreaklinesArray(int i);
        
        /**
         * Returns number of "Breaklines" element
         */
        int sizeOfBreaklinesArray();
        
        /**
         * Sets array of all "Breaklines" element
         */
        void setBreaklinesArray(org.landxml.schema.landXML11.BreaklinesDocument.Breaklines[] breaklinesArray);
        
        /**
         * Sets ith "Breaklines" element
         */
        void setBreaklinesArray(int i, org.landxml.schema.landXML11.BreaklinesDocument.Breaklines breaklines);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Breaklines" element
         */
        org.landxml.schema.landXML11.BreaklinesDocument.Breaklines insertNewBreaklines(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Breaklines" element
         */
        org.landxml.schema.landXML11.BreaklinesDocument.Breaklines addNewBreaklines();
        
        /**
         * Removes the ith "Breaklines" element
         */
        void removeBreaklines(int i);
        
        /**
         * Gets a List of "Contours" elements
         */
        java.util.List<org.landxml.schema.landXML11.ContoursDocument.Contours> getContoursList();
        
        /**
         * Gets array of all "Contours" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ContoursDocument.Contours[] getContoursArray();
        
        /**
         * Gets ith "Contours" element
         */
        org.landxml.schema.landXML11.ContoursDocument.Contours getContoursArray(int i);
        
        /**
         * Returns number of "Contours" element
         */
        int sizeOfContoursArray();
        
        /**
         * Sets array of all "Contours" element
         */
        void setContoursArray(org.landxml.schema.landXML11.ContoursDocument.Contours[] contoursArray);
        
        /**
         * Sets ith "Contours" element
         */
        void setContoursArray(int i, org.landxml.schema.landXML11.ContoursDocument.Contours contours);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Contours" element
         */
        org.landxml.schema.landXML11.ContoursDocument.Contours insertNewContours(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Contours" element
         */
        org.landxml.schema.landXML11.ContoursDocument.Contours addNewContours();
        
        /**
         * Removes the ith "Contours" element
         */
        void removeContours(int i);
        
        /**
         * Gets a List of "DataPoints" elements
         */
        java.util.List<org.landxml.schema.landXML11.DataPointsDocument.DataPoints> getDataPointsList();
        
        /**
         * Gets array of all "DataPoints" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.DataPointsDocument.DataPoints[] getDataPointsArray();
        
        /**
         * Gets ith "DataPoints" element
         */
        org.landxml.schema.landXML11.DataPointsDocument.DataPoints getDataPointsArray(int i);
        
        /**
         * Returns number of "DataPoints" element
         */
        int sizeOfDataPointsArray();
        
        /**
         * Sets array of all "DataPoints" element
         */
        void setDataPointsArray(org.landxml.schema.landXML11.DataPointsDocument.DataPoints[] dataPointsArray);
        
        /**
         * Sets ith "DataPoints" element
         */
        void setDataPointsArray(int i, org.landxml.schema.landXML11.DataPointsDocument.DataPoints dataPoints);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DataPoints" element
         */
        org.landxml.schema.landXML11.DataPointsDocument.DataPoints insertNewDataPoints(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DataPoints" element
         */
        org.landxml.schema.landXML11.DataPointsDocument.DataPoints addNewDataPoints();
        
        /**
         * Removes the ith "DataPoints" element
         */
        void removeDataPoints(int i);
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.SourceDataDocument.SourceData newInstance() {
              return (org.landxml.schema.landXML11.SourceDataDocument.SourceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.SourceDataDocument.SourceData newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.SourceDataDocument.SourceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.SourceDataDocument newInstance() {
          return (org.landxml.schema.landXML11.SourceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.SourceDataDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.SourceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.SourceDataDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SourceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.SourceDataDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SourceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.SourceDataDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SourceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.SourceDataDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SourceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.SourceDataDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SourceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.SourceDataDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SourceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.SourceDataDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SourceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.SourceDataDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SourceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.SourceDataDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SourceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.SourceDataDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SourceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.SourceDataDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SourceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.SourceDataDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SourceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.SourceDataDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SourceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.SourceDataDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SourceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.SourceDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.SourceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.SourceDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.SourceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
