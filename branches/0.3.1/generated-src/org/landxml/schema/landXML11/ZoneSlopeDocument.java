/*
 * An XML document type.
 * Localname: ZoneSlope
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ZoneSlopeDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one ZoneSlope(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface ZoneSlopeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ZoneSlopeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("zoneslope9be1doctype");
    
    /**
     * Gets the "ZoneSlope" element
     */
    org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope getZoneSlope();
    
    /**
     * Sets the "ZoneSlope" element
     */
    void setZoneSlope(org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope zoneSlope);
    
    /**
     * Appends and returns a new empty "ZoneSlope" element
     */
    org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope addNewZoneSlope();
    
    /**
     * An XML ZoneSlope(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface ZoneSlope extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ZoneSlope.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("zoneslope3d4celemtype");
        
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
         * Sets the "staStart" attribute
         */
        void setStaStart(double staStart);
        
        /**
         * Sets (as xml) the "staStart" attribute
         */
        void xsetStaStart(org.landxml.schema.landXML11.Station staStart);
        
        /**
         * Gets the "staEnd" attribute
         */
        double getStaEnd();
        
        /**
         * Gets (as xml) the "staEnd" attribute
         */
        org.landxml.schema.landXML11.Station xgetStaEnd();
        
        /**
         * Sets the "staEnd" attribute
         */
        void setStaEnd(double staEnd);
        
        /**
         * Sets (as xml) the "staEnd" attribute
         */
        void xsetStaEnd(org.landxml.schema.landXML11.Station staEnd);
        
        /**
         * Gets the "startVertValue" attribute
         */
        double getStartVertValue();
        
        /**
         * Gets (as xml) the "startVertValue" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetStartVertValue();
        
        /**
         * True if has "startVertValue" attribute
         */
        boolean isSetStartVertValue();
        
        /**
         * Sets the "startVertValue" attribute
         */
        void setStartVertValue(double startVertValue);
        
        /**
         * Sets (as xml) the "startVertValue" attribute
         */
        void xsetStartVertValue(org.apache.xmlbeans.XmlDouble startVertValue);
        
        /**
         * Unsets the "startVertValue" attribute
         */
        void unsetStartVertValue();
        
        /**
         * Gets the "startVertType" attribute
         */
        org.landxml.schema.landXML11.ZoneVertType.Enum getStartVertType();
        
        /**
         * Gets (as xml) the "startVertType" attribute
         */
        org.landxml.schema.landXML11.ZoneVertType xgetStartVertType();
        
        /**
         * True if has "startVertType" attribute
         */
        boolean isSetStartVertType();
        
        /**
         * Sets the "startVertType" attribute
         */
        void setStartVertType(org.landxml.schema.landXML11.ZoneVertType.Enum startVertType);
        
        /**
         * Sets (as xml) the "startVertType" attribute
         */
        void xsetStartVertType(org.landxml.schema.landXML11.ZoneVertType startVertType);
        
        /**
         * Unsets the "startVertType" attribute
         */
        void unsetStartVertType();
        
        /**
         * Gets the "endVertValue" attribute
         */
        double getEndVertValue();
        
        /**
         * Gets (as xml) the "endVertValue" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetEndVertValue();
        
        /**
         * Sets the "endVertValue" attribute
         */
        void setEndVertValue(double endVertValue);
        
        /**
         * Sets (as xml) the "endVertValue" attribute
         */
        void xsetEndVertValue(org.apache.xmlbeans.XmlDouble endVertValue);
        
        /**
         * Gets the "endVertType" attribute
         */
        org.landxml.schema.landXML11.ZoneVertType.Enum getEndVertType();
        
        /**
         * Gets (as xml) the "endVertType" attribute
         */
        org.landxml.schema.landXML11.ZoneVertType xgetEndVertType();
        
        /**
         * Sets the "endVertType" attribute
         */
        void setEndVertType(org.landxml.schema.landXML11.ZoneVertType.Enum endVertType);
        
        /**
         * Sets (as xml) the "endVertType" attribute
         */
        void xsetEndVertType(org.landxml.schema.landXML11.ZoneVertType endVertType);
        
        /**
         * Gets the "parabolicStartStation" attribute
         */
        double getParabolicStartStation();
        
        /**
         * Gets (as xml) the "parabolicStartStation" attribute
         */
        org.landxml.schema.landXML11.Station xgetParabolicStartStation();
        
        /**
         * True if has "parabolicStartStation" attribute
         */
        boolean isSetParabolicStartStation();
        
        /**
         * Sets the "parabolicStartStation" attribute
         */
        void setParabolicStartStation(double parabolicStartStation);
        
        /**
         * Sets (as xml) the "parabolicStartStation" attribute
         */
        void xsetParabolicStartStation(org.landxml.schema.landXML11.Station parabolicStartStation);
        
        /**
         * Unsets the "parabolicStartStation" attribute
         */
        void unsetParabolicStartStation();
        
        /**
         * Gets the "parabolicEndStation" attribute
         */
        double getParabolicEndStation();
        
        /**
         * Gets (as xml) the "parabolicEndStation" attribute
         */
        org.landxml.schema.landXML11.Station xgetParabolicEndStation();
        
        /**
         * True if has "parabolicEndStation" attribute
         */
        boolean isSetParabolicEndStation();
        
        /**
         * Sets the "parabolicEndStation" attribute
         */
        void setParabolicEndStation(double parabolicEndStation);
        
        /**
         * Sets (as xml) the "parabolicEndStation" attribute
         */
        void xsetParabolicEndStation(org.landxml.schema.landXML11.Station parabolicEndStation);
        
        /**
         * Unsets the "parabolicEndStation" attribute
         */
        void unsetParabolicEndStation();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope newInstance() {
              return (org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.ZoneSlopeDocument newInstance() {
          return (org.landxml.schema.landXML11.ZoneSlopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneSlopeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.ZoneSlopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.ZoneSlopeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneSlopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneSlopeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneSlopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.ZoneSlopeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneSlopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneSlopeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneSlopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneSlopeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneSlopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneSlopeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneSlopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneSlopeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneSlopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneSlopeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneSlopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneSlopeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneSlopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneSlopeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneSlopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneSlopeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneSlopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneSlopeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneSlopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneSlopeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneSlopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneSlopeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneSlopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ZoneSlopeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ZoneSlopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ZoneSlopeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ZoneSlopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
