/*
 * An XML document type.
 * Localname: DailyTrafficVolume
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.DailyTrafficVolumeDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one DailyTrafficVolume(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface DailyTrafficVolumeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DailyTrafficVolumeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("dailytrafficvolumea7f2doctype");
    
    /**
     * Gets the "DailyTrafficVolume" element
     */
    org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume getDailyTrafficVolume();
    
    /**
     * Sets the "DailyTrafficVolume" element
     */
    void setDailyTrafficVolume(org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume dailyTrafficVolume);
    
    /**
     * Appends and returns a new empty "DailyTrafficVolume" element
     */
    org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume addNewDailyTrafficVolume();
    
    /**
     * An XML DailyTrafficVolume(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface DailyTrafficVolume extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DailyTrafficVolume.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("dailytrafficvolume2818elemtype");
        
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
         * Gets the "ADT" attribute
         */
        double getADT();
        
        /**
         * Gets (as xml) the "ADT" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetADT();
        
        /**
         * True if has "ADT" attribute
         */
        boolean isSetADT();
        
        /**
         * Sets the "ADT" attribute
         */
        void setADT(double adt);
        
        /**
         * Sets (as xml) the "ADT" attribute
         */
        void xsetADT(org.apache.xmlbeans.XmlDouble adt);
        
        /**
         * Unsets the "ADT" attribute
         */
        void unsetADT();
        
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
         * Gets the "escFactor" attribute
         */
        double getEscFactor();
        
        /**
         * Gets (as xml) the "escFactor" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetEscFactor();
        
        /**
         * True if has "escFactor" attribute
         */
        boolean isSetEscFactor();
        
        /**
         * Sets the "escFactor" attribute
         */
        void setEscFactor(double escFactor);
        
        /**
         * Sets (as xml) the "escFactor" attribute
         */
        void xsetEscFactor(org.apache.xmlbeans.XmlDouble escFactor);
        
        /**
         * Unsets the "escFactor" attribute
         */
        void unsetEscFactor();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume newInstance() {
              return (org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.DailyTrafficVolumeDocument.DailyTrafficVolume) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.DailyTrafficVolumeDocument newInstance() {
          return (org.landxml.schema.landXML11.DailyTrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.DailyTrafficVolumeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.DailyTrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.DailyTrafficVolumeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DailyTrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.DailyTrafficVolumeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DailyTrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.DailyTrafficVolumeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DailyTrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.DailyTrafficVolumeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DailyTrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.DailyTrafficVolumeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DailyTrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.DailyTrafficVolumeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DailyTrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.DailyTrafficVolumeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DailyTrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.DailyTrafficVolumeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DailyTrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.DailyTrafficVolumeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DailyTrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.DailyTrafficVolumeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DailyTrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.DailyTrafficVolumeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DailyTrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.DailyTrafficVolumeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DailyTrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.DailyTrafficVolumeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DailyTrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.DailyTrafficVolumeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DailyTrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.DailyTrafficVolumeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.DailyTrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.DailyTrafficVolumeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.DailyTrafficVolumeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
