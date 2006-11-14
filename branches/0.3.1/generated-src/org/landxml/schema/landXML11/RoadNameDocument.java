/*
 * An XML document type.
 * Localname: RoadName
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.RoadNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one RoadName(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface RoadNameDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RoadNameDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("roadnamea2dfdoctype");
    
    /**
     * Gets the "RoadName" element
     */
    org.landxml.schema.landXML11.RoadNameDocument.RoadName getRoadName();
    
    /**
     * Sets the "RoadName" element
     */
    void setRoadName(org.landxml.schema.landXML11.RoadNameDocument.RoadName roadName);
    
    /**
     * Appends and returns a new empty "RoadName" element
     */
    org.landxml.schema.landXML11.RoadNameDocument.RoadName addNewRoadName();
    
    /**
     * An XML RoadName(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface RoadName extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RoadName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("roadname76b8elemtype");
        
        /**
         * Gets the "roadNameType" attribute
         */
        java.lang.String getRoadNameType();
        
        /**
         * Gets (as xml) the "roadNameType" attribute
         */
        org.landxml.schema.landXML11.RoadNameTypeType xgetRoadNameType();
        
        /**
         * True if has "roadNameType" attribute
         */
        boolean isSetRoadNameType();
        
        /**
         * Sets the "roadNameType" attribute
         */
        void setRoadNameType(java.lang.String roadNameType);
        
        /**
         * Sets (as xml) the "roadNameType" attribute
         */
        void xsetRoadNameType(org.landxml.schema.landXML11.RoadNameTypeType roadNameType);
        
        /**
         * Unsets the "roadNameType" attribute
         */
        void unsetRoadNameType();
        
        /**
         * Gets the "roadName" attribute
         */
        java.lang.String getRoadName();
        
        /**
         * Gets (as xml) the "roadName" attribute
         */
        org.apache.xmlbeans.XmlString xgetRoadName();
        
        /**
         * True if has "roadName" attribute
         */
        boolean isSetRoadName();
        
        /**
         * Sets the "roadName" attribute
         */
        void setRoadName(java.lang.String roadName);
        
        /**
         * Sets (as xml) the "roadName" attribute
         */
        void xsetRoadName(org.apache.xmlbeans.XmlString roadName);
        
        /**
         * Unsets the "roadName" attribute
         */
        void unsetRoadName();
        
        /**
         * Gets the "roadNameSuffix" attribute
         */
        java.lang.String getRoadNameSuffix();
        
        /**
         * Gets (as xml) the "roadNameSuffix" attribute
         */
        org.landxml.schema.landXML11.RoadNameSuffixType xgetRoadNameSuffix();
        
        /**
         * True if has "roadNameSuffix" attribute
         */
        boolean isSetRoadNameSuffix();
        
        /**
         * Sets the "roadNameSuffix" attribute
         */
        void setRoadNameSuffix(java.lang.String roadNameSuffix);
        
        /**
         * Sets (as xml) the "roadNameSuffix" attribute
         */
        void xsetRoadNameSuffix(org.landxml.schema.landXML11.RoadNameSuffixType roadNameSuffix);
        
        /**
         * Unsets the "roadNameSuffix" attribute
         */
        void unsetRoadNameSuffix();
        
        /**
         * Gets the "roadType" attribute
         */
        java.lang.String getRoadType();
        
        /**
         * Gets (as xml) the "roadType" attribute
         */
        org.landxml.schema.landXML11.RoadTypeType xgetRoadType();
        
        /**
         * True if has "roadType" attribute
         */
        boolean isSetRoadType();
        
        /**
         * Sets the "roadType" attribute
         */
        void setRoadType(java.lang.String roadType);
        
        /**
         * Sets (as xml) the "roadType" attribute
         */
        void xsetRoadType(org.landxml.schema.landXML11.RoadTypeType roadType);
        
        /**
         * Unsets the "roadType" attribute
         */
        void unsetRoadType();
        
        /**
         * Gets the "pclRef" attribute
         */
        java.util.List getPclRef();
        
        /**
         * Gets (as xml) the "pclRef" attribute
         */
        org.landxml.schema.landXML11.ParcelNameRefs xgetPclRef();
        
        /**
         * True if has "pclRef" attribute
         */
        boolean isSetPclRef();
        
        /**
         * Sets the "pclRef" attribute
         */
        void setPclRef(java.util.List pclRef);
        
        /**
         * Sets (as xml) the "pclRef" attribute
         */
        void xsetPclRef(org.landxml.schema.landXML11.ParcelNameRefs pclRef);
        
        /**
         * Unsets the "pclRef" attribute
         */
        void unsetPclRef();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.RoadNameDocument.RoadName newInstance() {
              return (org.landxml.schema.landXML11.RoadNameDocument.RoadName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.RoadNameDocument.RoadName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.RoadNameDocument.RoadName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.RoadNameDocument newInstance() {
          return (org.landxml.schema.landXML11.RoadNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.RoadNameDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.RoadNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.RoadNameDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RoadNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadNameDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RoadNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.RoadNameDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadNameDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.RoadNameDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadNameDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.RoadNameDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadNameDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.RoadNameDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadNameDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.RoadNameDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RoadNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadNameDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RoadNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.RoadNameDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RoadNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadNameDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RoadNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.RoadNameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.RoadNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.RoadNameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.RoadNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
