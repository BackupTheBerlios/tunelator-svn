/*
 * An XML document type.
 * Localname: FullSuperelev
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.FullSuperelevDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one FullSuperelev(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface FullSuperelevDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FullSuperelevDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("fullsuperelev9886doctype");
    
    /**
     * Gets the "FullSuperelev" element
     */
    double getFullSuperelev();
    
    /**
     * Gets (as xml) the "FullSuperelev" element
     */
    org.landxml.schema.landXML11.Slope xgetFullSuperelev();
    
    /**
     * Sets the "FullSuperelev" element
     */
    void setFullSuperelev(double fullSuperelev);
    
    /**
     * Sets (as xml) the "FullSuperelev" element
     */
    void xsetFullSuperelev(org.landxml.schema.landXML11.Slope fullSuperelev);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.FullSuperelevDocument newInstance() {
          return (org.landxml.schema.landXML11.FullSuperelevDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.FullSuperelevDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.FullSuperelevDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.FullSuperelevDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.FullSuperelevDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.FullSuperelevDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.FullSuperelevDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.FullSuperelevDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.FullSuperelevDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.FullSuperelevDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.FullSuperelevDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.FullSuperelevDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.FullSuperelevDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.FullSuperelevDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.FullSuperelevDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.FullSuperelevDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.FullSuperelevDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.FullSuperelevDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.FullSuperelevDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.FullSuperelevDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.FullSuperelevDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.FullSuperelevDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.FullSuperelevDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.FullSuperelevDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.FullSuperelevDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.FullSuperelevDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.FullSuperelevDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.FullSuperelevDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.FullSuperelevDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.FullSuperelevDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.FullSuperelevDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.FullSuperelevDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.FullSuperelevDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.FullSuperelevDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.FullSuperelevDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
