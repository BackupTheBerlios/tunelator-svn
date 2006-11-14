/*
 * An XML document type.
 * Localname: WideningLane
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.WideningLaneDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one WideningLane(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface WideningLaneDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WideningLaneDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("wideninglane4727doctype");
    
    /**
     * Gets the "WideningLane" element
     */
    org.landxml.schema.landXML11.WideningLaneDocument.WideningLane getWideningLane();
    
    /**
     * Sets the "WideningLane" element
     */
    void setWideningLane(org.landxml.schema.landXML11.WideningLaneDocument.WideningLane wideningLane);
    
    /**
     * Appends and returns a new empty "WideningLane" element
     */
    org.landxml.schema.landXML11.WideningLaneDocument.WideningLane addNewWideningLane();
    
    /**
     * An XML WideningLane(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface WideningLane extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WideningLane.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("wideninglane00b8elemtype");
        
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
         * Gets the "staStart" attribute
         */
        double getStaStart();
        
        /**
         * Gets (as xml) the "staStart" attribute
         */
        org.landxml.schema.landXML11.Station xgetStaStart();
        
        /**
         * True if has "staStart" attribute
         */
        boolean isSetStaStart();
        
        /**
         * Sets the "staStart" attribute
         */
        void setStaStart(double staStart);
        
        /**
         * Sets (as xml) the "staStart" attribute
         */
        void xsetStaStart(org.landxml.schema.landXML11.Station staStart);
        
        /**
         * Unsets the "staStart" attribute
         */
        void unsetStaStart();
        
        /**
         * Gets the "staEnd" attribute
         */
        double getStaEnd();
        
        /**
         * Gets (as xml) the "staEnd" attribute
         */
        org.landxml.schema.landXML11.Station xgetStaEnd();
        
        /**
         * True if has "staEnd" attribute
         */
        boolean isSetStaEnd();
        
        /**
         * Sets the "staEnd" attribute
         */
        void setStaEnd(double staEnd);
        
        /**
         * Sets (as xml) the "staEnd" attribute
         */
        void xsetStaEnd(org.landxml.schema.landXML11.Station staEnd);
        
        /**
         * Unsets the "staEnd" attribute
         */
        void unsetStaEnd();
        
        /**
         * Gets the "beginFullWidthSta" attribute
         */
        double getBeginFullWidthSta();
        
        /**
         * Gets (as xml) the "beginFullWidthSta" attribute
         */
        org.landxml.schema.landXML11.Station xgetBeginFullWidthSta();
        
        /**
         * True if has "beginFullWidthSta" attribute
         */
        boolean isSetBeginFullWidthSta();
        
        /**
         * Sets the "beginFullWidthSta" attribute
         */
        void setBeginFullWidthSta(double beginFullWidthSta);
        
        /**
         * Sets (as xml) the "beginFullWidthSta" attribute
         */
        void xsetBeginFullWidthSta(org.landxml.schema.landXML11.Station beginFullWidthSta);
        
        /**
         * Unsets the "beginFullWidthSta" attribute
         */
        void unsetBeginFullWidthSta();
        
        /**
         * Gets the "endFullWidthSta" attribute
         */
        double getEndFullWidthSta();
        
        /**
         * Gets (as xml) the "endFullWidthSta" attribute
         */
        org.landxml.schema.landXML11.Station xgetEndFullWidthSta();
        
        /**
         * True if has "endFullWidthSta" attribute
         */
        boolean isSetEndFullWidthSta();
        
        /**
         * Sets the "endFullWidthSta" attribute
         */
        void setEndFullWidthSta(double endFullWidthSta);
        
        /**
         * Sets (as xml) the "endFullWidthSta" attribute
         */
        void xsetEndFullWidthSta(org.landxml.schema.landXML11.Station endFullWidthSta);
        
        /**
         * Unsets the "endFullWidthSta" attribute
         */
        void unsetEndFullWidthSta();
        
        /**
         * Gets the "offset" attribute
         */
        double getOffset();
        
        /**
         * Gets (as xml) the "offset" attribute
         */
        org.landxml.schema.landXML11.OffsetDistance xgetOffset();
        
        /**
         * True if has "offset" attribute
         */
        boolean isSetOffset();
        
        /**
         * Sets the "offset" attribute
         */
        void setOffset(double offset);
        
        /**
         * Sets (as xml) the "offset" attribute
         */
        void xsetOffset(org.landxml.schema.landXML11.OffsetDistance offset);
        
        /**
         * Unsets the "offset" attribute
         */
        void unsetOffset();
        
        /**
         * Gets the "widening" attribute
         */
        double getWidening();
        
        /**
         * Gets (as xml) the "widening" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetWidening();
        
        /**
         * True if has "widening" attribute
         */
        boolean isSetWidening();
        
        /**
         * Sets the "widening" attribute
         */
        void setWidening(double widening);
        
        /**
         * Sets (as xml) the "widening" attribute
         */
        void xsetWidening(org.apache.xmlbeans.XmlDouble widening);
        
        /**
         * Unsets the "widening" attribute
         */
        void unsetWidening();
        
        /**
         * Gets the "width" attribute
         */
        double getWidth();
        
        /**
         * Gets (as xml) the "width" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetWidth();
        
        /**
         * True if has "width" attribute
         */
        boolean isSetWidth();
        
        /**
         * Sets the "width" attribute
         */
        void setWidth(double width);
        
        /**
         * Sets (as xml) the "width" attribute
         */
        void xsetWidth(org.apache.xmlbeans.XmlDouble width);
        
        /**
         * Unsets the "width" attribute
         */
        void unsetWidth();
        
        /**
         * Gets the "sideofRoad" attribute
         */
        org.landxml.schema.landXML11.SideofRoadType.Enum getSideofRoad();
        
        /**
         * Gets (as xml) the "sideofRoad" attribute
         */
        org.landxml.schema.landXML11.SideofRoadType xgetSideofRoad();
        
        /**
         * True if has "sideofRoad" attribute
         */
        boolean isSetSideofRoad();
        
        /**
         * Sets the "sideofRoad" attribute
         */
        void setSideofRoad(org.landxml.schema.landXML11.SideofRoadType.Enum sideofRoad);
        
        /**
         * Sets (as xml) the "sideofRoad" attribute
         */
        void xsetSideofRoad(org.landxml.schema.landXML11.SideofRoadType sideofRoad);
        
        /**
         * Unsets the "sideofRoad" attribute
         */
        void unsetSideofRoad();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.WideningLaneDocument.WideningLane newInstance() {
              return (org.landxml.schema.landXML11.WideningLaneDocument.WideningLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.WideningLaneDocument.WideningLane newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.WideningLaneDocument.WideningLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.WideningLaneDocument newInstance() {
          return (org.landxml.schema.landXML11.WideningLaneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.WideningLaneDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.WideningLaneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.WideningLaneDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.WideningLaneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.WideningLaneDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.WideningLaneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.WideningLaneDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.WideningLaneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.WideningLaneDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.WideningLaneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.WideningLaneDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.WideningLaneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.WideningLaneDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.WideningLaneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.WideningLaneDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.WideningLaneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.WideningLaneDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.WideningLaneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.WideningLaneDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.WideningLaneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.WideningLaneDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.WideningLaneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.WideningLaneDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.WideningLaneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.WideningLaneDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.WideningLaneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.WideningLaneDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.WideningLaneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.WideningLaneDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.WideningLaneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.WideningLaneDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.WideningLaneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.WideningLaneDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.WideningLaneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
