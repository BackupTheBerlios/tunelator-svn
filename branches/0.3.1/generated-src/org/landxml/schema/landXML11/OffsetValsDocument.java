/*
 * An XML document type.
 * Localname: OffsetVals
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.OffsetValsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one OffsetVals(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface OffsetValsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OffsetValsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("offsetvals56f9doctype");
    
    /**
     * Gets the "OffsetVals" element
     */
    org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals getOffsetVals();
    
    /**
     * Sets the "OffsetVals" element
     */
    void setOffsetVals(org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals offsetVals);
    
    /**
     * Appends and returns a new empty "OffsetVals" element
     */
    org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals addNewOffsetVals();
    
    /**
     * An XML OffsetVals(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface OffsetVals extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OffsetVals.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("offsetvalse278elemtype");
        
        /**
         * Gets the "offsetInOut" attribute
         */
        double getOffsetInOut();
        
        /**
         * Gets (as xml) the "offsetInOut" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetOffsetInOut();
        
        /**
         * True if has "offsetInOut" attribute
         */
        boolean isSetOffsetInOut();
        
        /**
         * Sets the "offsetInOut" attribute
         */
        void setOffsetInOut(double offsetInOut);
        
        /**
         * Sets (as xml) the "offsetInOut" attribute
         */
        void xsetOffsetInOut(org.apache.xmlbeans.XmlDouble offsetInOut);
        
        /**
         * Unsets the "offsetInOut" attribute
         */
        void unsetOffsetInOut();
        
        /**
         * Gets the "offsetLeftRight" attribute
         */
        double getOffsetLeftRight();
        
        /**
         * Gets (as xml) the "offsetLeftRight" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetOffsetLeftRight();
        
        /**
         * True if has "offsetLeftRight" attribute
         */
        boolean isSetOffsetLeftRight();
        
        /**
         * Sets the "offsetLeftRight" attribute
         */
        void setOffsetLeftRight(double offsetLeftRight);
        
        /**
         * Sets (as xml) the "offsetLeftRight" attribute
         */
        void xsetOffsetLeftRight(org.apache.xmlbeans.XmlDouble offsetLeftRight);
        
        /**
         * Unsets the "offsetLeftRight" attribute
         */
        void unsetOffsetLeftRight();
        
        /**
         * Gets the "offsetUpDown" attribute
         */
        double getOffsetUpDown();
        
        /**
         * Gets (as xml) the "offsetUpDown" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetOffsetUpDown();
        
        /**
         * True if has "offsetUpDown" attribute
         */
        boolean isSetOffsetUpDown();
        
        /**
         * Sets the "offsetUpDown" attribute
         */
        void setOffsetUpDown(double offsetUpDown);
        
        /**
         * Sets (as xml) the "offsetUpDown" attribute
         */
        void xsetOffsetUpDown(org.apache.xmlbeans.XmlDouble offsetUpDown);
        
        /**
         * Unsets the "offsetUpDown" attribute
         */
        void unsetOffsetUpDown();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals newInstance() {
              return (org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.OffsetValsDocument newInstance() {
          return (org.landxml.schema.landXML11.OffsetValsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.OffsetValsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.OffsetValsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.OffsetValsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.OffsetValsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.OffsetValsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.OffsetValsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.OffsetValsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.OffsetValsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.OffsetValsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.OffsetValsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.OffsetValsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.OffsetValsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.OffsetValsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.OffsetValsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.OffsetValsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.OffsetValsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.OffsetValsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.OffsetValsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.OffsetValsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.OffsetValsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.OffsetValsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.OffsetValsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.OffsetValsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.OffsetValsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.OffsetValsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.OffsetValsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.OffsetValsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.OffsetValsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.OffsetValsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.OffsetValsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.OffsetValsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.OffsetValsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.OffsetValsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.OffsetValsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
