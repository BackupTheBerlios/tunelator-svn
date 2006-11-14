/*
 * An XML document type.
 * Localname: GPSQCInfoLevel1
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.GPSQCInfoLevel1Document
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one GPSQCInfoLevel1(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface GPSQCInfoLevel1Document extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GPSQCInfoLevel1Document.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("gpsqcinfolevel1e819doctype");
    
    /**
     * Gets the "GPSQCInfoLevel1" element
     */
    org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1 getGPSQCInfoLevel1();
    
    /**
     * Sets the "GPSQCInfoLevel1" element
     */
    void setGPSQCInfoLevel1(org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1 gpsqcInfoLevel1);
    
    /**
     * Appends and returns a new empty "GPSQCInfoLevel1" element
     */
    org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1 addNewGPSQCInfoLevel1();
    
    /**
     * An XML GPSQCInfoLevel1(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface GPSQCInfoLevel1 extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GPSQCInfoLevel1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("gpsqcinfolevel106bcelemtype");
        
        /**
         * Gets the "GPSSolnType" attribute
         */
        org.landxml.schema.landXML11.GPSSolutionTypeEnum.Enum getGPSSolnType();
        
        /**
         * Gets (as xml) the "GPSSolnType" attribute
         */
        org.landxml.schema.landXML11.GPSSolutionTypeEnum xgetGPSSolnType();
        
        /**
         * True if has "GPSSolnType" attribute
         */
        boolean isSetGPSSolnType();
        
        /**
         * Sets the "GPSSolnType" attribute
         */
        void setGPSSolnType(org.landxml.schema.landXML11.GPSSolutionTypeEnum.Enum gpsSolnType);
        
        /**
         * Sets (as xml) the "GPSSolnType" attribute
         */
        void xsetGPSSolnType(org.landxml.schema.landXML11.GPSSolutionTypeEnum gpsSolnType);
        
        /**
         * Unsets the "GPSSolnType" attribute
         */
        void unsetGPSSolnType();
        
        /**
         * Gets the "GPSSolnFreq" attribute
         */
        org.landxml.schema.landXML11.GPSSolutionFrequencyEnum.Enum getGPSSolnFreq();
        
        /**
         * Gets (as xml) the "GPSSolnFreq" attribute
         */
        org.landxml.schema.landXML11.GPSSolutionFrequencyEnum xgetGPSSolnFreq();
        
        /**
         * True if has "GPSSolnFreq" attribute
         */
        boolean isSetGPSSolnFreq();
        
        /**
         * Sets the "GPSSolnFreq" attribute
         */
        void setGPSSolnFreq(org.landxml.schema.landXML11.GPSSolutionFrequencyEnum.Enum gpsSolnFreq);
        
        /**
         * Sets (as xml) the "GPSSolnFreq" attribute
         */
        void xsetGPSSolnFreq(org.landxml.schema.landXML11.GPSSolutionFrequencyEnum gpsSolnFreq);
        
        /**
         * Unsets the "GPSSolnFreq" attribute
         */
        void unsetGPSSolnFreq();
        
        /**
         * Gets the "nbrSatellites" attribute
         */
        java.math.BigInteger getNbrSatellites();
        
        /**
         * Gets (as xml) the "nbrSatellites" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetNbrSatellites();
        
        /**
         * True if has "nbrSatellites" attribute
         */
        boolean isSetNbrSatellites();
        
        /**
         * Sets the "nbrSatellites" attribute
         */
        void setNbrSatellites(java.math.BigInteger nbrSatellites);
        
        /**
         * Sets (as xml) the "nbrSatellites" attribute
         */
        void xsetNbrSatellites(org.apache.xmlbeans.XmlInteger nbrSatellites);
        
        /**
         * Unsets the "nbrSatellites" attribute
         */
        void unsetNbrSatellites();
        
        /**
         * Gets the "RDOP" attribute
         */
        double getRDOP();
        
        /**
         * Gets (as xml) the "RDOP" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetRDOP();
        
        /**
         * True if has "RDOP" attribute
         */
        boolean isSetRDOP();
        
        /**
         * Sets the "RDOP" attribute
         */
        void setRDOP(double rdop);
        
        /**
         * Sets (as xml) the "RDOP" attribute
         */
        void xsetRDOP(org.apache.xmlbeans.XmlDouble rdop);
        
        /**
         * Unsets the "RDOP" attribute
         */
        void unsetRDOP();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1 newInstance() {
              return (org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1 newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.GPSQCInfoLevel1Document newInstance() {
          return (org.landxml.schema.landXML11.GPSQCInfoLevel1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.GPSQCInfoLevel1Document newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.GPSQCInfoLevel1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.GPSQCInfoLevel1Document parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSQCInfoLevel1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSQCInfoLevel1Document parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSQCInfoLevel1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.GPSQCInfoLevel1Document parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSQCInfoLevel1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSQCInfoLevel1Document parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSQCInfoLevel1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSQCInfoLevel1Document parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSQCInfoLevel1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSQCInfoLevel1Document parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSQCInfoLevel1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSQCInfoLevel1Document parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSQCInfoLevel1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSQCInfoLevel1Document parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSQCInfoLevel1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSQCInfoLevel1Document parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSQCInfoLevel1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSQCInfoLevel1Document parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GPSQCInfoLevel1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSQCInfoLevel1Document parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSQCInfoLevel1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSQCInfoLevel1Document parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSQCInfoLevel1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.GPSQCInfoLevel1Document parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSQCInfoLevel1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.GPSQCInfoLevel1Document parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GPSQCInfoLevel1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.GPSQCInfoLevel1Document parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.GPSQCInfoLevel1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.GPSQCInfoLevel1Document parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.GPSQCInfoLevel1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
