/*
 * An XML document type.
 * Localname: TrafficVolume
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.TrafficVolumeDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one TrafficVolume(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface TrafficVolumeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TrafficVolumeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("trafficvolumed879doctype");
    
    /**
     * Gets the "TrafficVolume" element
     */
    org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume getTrafficVolume();
    
    /**
     * Sets the "TrafficVolume" element
     */
    void setTrafficVolume(org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume trafficVolume);
    
    /**
     * Appends and returns a new empty "TrafficVolume" element
     */
    org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume addNewTrafficVolume();
    
    /**
     * An XML TrafficVolume(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface TrafficVolume extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TrafficVolume.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("trafficvolume307celemtype");
        
        /**
         * Gets a List of "DailyTrafficVolume" elements
         */
        java.util.List<org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume> getDailyTrafficVolumeList();
        
        /**
         * Gets array of all "DailyTrafficVolume" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume[] getDailyTrafficVolumeArray();
        
        /**
         * Gets ith "DailyTrafficVolume" element
         */
        org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume getDailyTrafficVolumeArray(int i);
        
        /**
         * Returns number of "DailyTrafficVolume" element
         */
        int sizeOfDailyTrafficVolumeArray();
        
        /**
         * Sets array of all "DailyTrafficVolume" element
         */
        void setDailyTrafficVolumeArray(org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume[] dailyTrafficVolumeArray);
        
        /**
         * Sets ith "DailyTrafficVolume" element
         */
        void setDailyTrafficVolumeArray(int i, org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume dailyTrafficVolume);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DailyTrafficVolume" element
         */
        org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume insertNewDailyTrafficVolume(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DailyTrafficVolume" element
         */
        org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume addNewDailyTrafficVolume();
        
        /**
         * Removes the ith "DailyTrafficVolume" element
         */
        void removeDailyTrafficVolume(int i);
        
        /**
         * Gets a List of "DesignHour" elements
         */
        java.util.List<org.landxml.schema.landXML11.DesignHourDocument.DesignHour> getDesignHourList();
        
        /**
         * Gets array of all "DesignHour" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.DesignHourDocument.DesignHour[] getDesignHourArray();
        
        /**
         * Gets ith "DesignHour" element
         */
        org.landxml.schema.landXML11.DesignHourDocument.DesignHour getDesignHourArray(int i);
        
        /**
         * Returns number of "DesignHour" element
         */
        int sizeOfDesignHourArray();
        
        /**
         * Sets array of all "DesignHour" element
         */
        void setDesignHourArray(org.landxml.schema.landXML11.DesignHourDocument.DesignHour[] designHourArray);
        
        /**
         * Sets ith "DesignHour" element
         */
        void setDesignHourArray(int i, org.landxml.schema.landXML11.DesignHourDocument.DesignHour designHour);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DesignHour" element
         */
        org.landxml.schema.landXML11.DesignHourDocument.DesignHour insertNewDesignHour(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DesignHour" element
         */
        org.landxml.schema.landXML11.DesignHourDocument.DesignHour addNewDesignHour();
        
        /**
         * Removes the ith "DesignHour" element
         */
        void removeDesignHour(int i);
        
        /**
         * Gets a List of "PeakHour" elements
         */
        java.util.List<org.landxml.schema.landXML11.PeakHourDocument.PeakHour> getPeakHourList();
        
        /**
         * Gets array of all "PeakHour" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.PeakHourDocument.PeakHour[] getPeakHourArray();
        
        /**
         * Gets ith "PeakHour" element
         */
        org.landxml.schema.landXML11.PeakHourDocument.PeakHour getPeakHourArray(int i);
        
        /**
         * Returns number of "PeakHour" element
         */
        int sizeOfPeakHourArray();
        
        /**
         * Sets array of all "PeakHour" element
         */
        void setPeakHourArray(org.landxml.schema.landXML11.PeakHourDocument.PeakHour[] peakHourArray);
        
        /**
         * Sets ith "PeakHour" element
         */
        void setPeakHourArray(int i, org.landxml.schema.landXML11.PeakHourDocument.PeakHour peakHour);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PeakHour" element
         */
        org.landxml.schema.landXML11.PeakHourDocument.PeakHour insertNewPeakHour(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PeakHour" element
         */
        org.landxml.schema.landXML11.PeakHourDocument.PeakHour addNewPeakHour();
        
        /**
         * Removes the ith "PeakHour" element
         */
        void removePeakHour(int i);
        
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
            public static org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume newInstance() {
              return (org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.TrafficVolumeDocument.TrafficVolume) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.TrafficVolumeDocument newInstance() {
          return (org.landxml.schema.landXML11.TrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.TrafficVolumeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.TrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.TrafficVolumeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.TrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.TrafficVolumeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.TrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.TrafficVolumeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.TrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.TrafficVolumeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.TrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.TrafficVolumeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.TrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.TrafficVolumeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.TrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.TrafficVolumeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.TrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.TrafficVolumeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.TrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.TrafficVolumeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.TrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.TrafficVolumeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.TrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.TrafficVolumeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.TrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.TrafficVolumeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.TrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.TrafficVolumeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.TrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.TrafficVolumeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.TrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.TrafficVolumeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.TrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.TrafficVolumeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.TrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
