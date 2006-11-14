/*
 * An XML document type.
 * Localname: AdverseSE
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.AdverseSEDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one AdverseSE(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface AdverseSEDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdverseSEDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("adversese8106doctype");
    
    /**
     * Gets the "AdverseSE" element
     */
    org.landxml.schema.landXML11.AdverseSEType.Enum getAdverseSE();
    
    /**
     * Gets (as xml) the "AdverseSE" element
     */
    org.landxml.schema.landXML11.AdverseSEType xgetAdverseSE();
    
    /**
     * Sets the "AdverseSE" element
     */
    void setAdverseSE(org.landxml.schema.landXML11.AdverseSEType.Enum adverseSE);
    
    /**
     * Sets (as xml) the "AdverseSE" element
     */
    void xsetAdverseSE(org.landxml.schema.landXML11.AdverseSEType adverseSE);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.AdverseSEDocument newInstance() {
          return (org.landxml.schema.landXML11.AdverseSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.AdverseSEDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.AdverseSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.AdverseSEDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AdverseSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.AdverseSEDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AdverseSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.AdverseSEDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AdverseSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.AdverseSEDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AdverseSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.AdverseSEDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AdverseSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.AdverseSEDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AdverseSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.AdverseSEDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AdverseSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.AdverseSEDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AdverseSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.AdverseSEDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AdverseSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.AdverseSEDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AdverseSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.AdverseSEDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AdverseSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.AdverseSEDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AdverseSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.AdverseSEDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AdverseSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.AdverseSEDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AdverseSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.AdverseSEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.AdverseSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.AdverseSEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.AdverseSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
