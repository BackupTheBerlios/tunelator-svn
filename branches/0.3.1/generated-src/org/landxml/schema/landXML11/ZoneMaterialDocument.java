/*
 * An XML document type.
 * Localname: ZoneMaterial
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ZoneMaterialDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one ZoneMaterial(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface ZoneMaterialDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ZoneMaterialDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("zonematerialff87doctype");
    
    /**
     * Gets the "ZoneMaterial" element
     */
    org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial getZoneMaterial();
    
    /**
     * Sets the "ZoneMaterial" element
     */
    void setZoneMaterial(org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial zoneMaterial);
    
    /**
     * Appends and returns a new empty "ZoneMaterial" element
     */
    org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial addNewZoneMaterial();
    
    /**
     * An XML ZoneMaterial(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface ZoneMaterial extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ZoneMaterial.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("zonematerial34b8elemtype");
        
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
         * Gets the "material" attribute
         */
        org.landxml.schema.landXML11.ZoneMaterialType.Enum getMaterial();
        
        /**
         * Gets (as xml) the "material" attribute
         */
        org.landxml.schema.landXML11.ZoneMaterialType xgetMaterial();
        
        /**
         * Sets the "material" attribute
         */
        void setMaterial(org.landxml.schema.landXML11.ZoneMaterialType.Enum material);
        
        /**
         * Sets (as xml) the "material" attribute
         */
        void xsetMaterial(org.landxml.schema.landXML11.ZoneMaterialType material);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial newInstance() {
              return (org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.ZoneMaterialDocument newInstance() {
          return (org.landxml.schema.landXML11.ZoneMaterialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.ZoneMaterialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.ZoneMaterialDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneMaterialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneMaterialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.ZoneMaterialDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneMaterialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneMaterialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneMaterialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneMaterialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneMaterialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneMaterialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneMaterialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneMaterialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneMaterialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneMaterialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneMaterialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneMaterialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ZoneMaterialDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ZoneMaterialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ZoneMaterialDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ZoneMaterialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
