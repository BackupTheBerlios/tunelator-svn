/*
 * An XML document type.
 * Localname: Author
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.AuthorDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one Author(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface AuthorDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AuthorDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("author78dfdoctype");
    
    /**
     * Gets the "Author" element
     */
    org.landxml.schema.landXML11.AuthorDocument.Author getAuthor();
    
    /**
     * Sets the "Author" element
     */
    void setAuthor(org.landxml.schema.landXML11.AuthorDocument.Author author);
    
    /**
     * Appends and returns a new empty "Author" element
     */
    org.landxml.schema.landXML11.AuthorDocument.Author addNewAuthor();
    
    /**
     * An XML Author(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface Author extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Author.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("author8538elemtype");
        
        /**
         * Gets the "createdBy" attribute
         */
        java.lang.String getCreatedBy();
        
        /**
         * Gets (as xml) the "createdBy" attribute
         */
        org.apache.xmlbeans.XmlString xgetCreatedBy();
        
        /**
         * True if has "createdBy" attribute
         */
        boolean isSetCreatedBy();
        
        /**
         * Sets the "createdBy" attribute
         */
        void setCreatedBy(java.lang.String createdBy);
        
        /**
         * Sets (as xml) the "createdBy" attribute
         */
        void xsetCreatedBy(org.apache.xmlbeans.XmlString createdBy);
        
        /**
         * Unsets the "createdBy" attribute
         */
        void unsetCreatedBy();
        
        /**
         * Gets the "createdByEmail" attribute
         */
        java.lang.String getCreatedByEmail();
        
        /**
         * Gets (as xml) the "createdByEmail" attribute
         */
        org.apache.xmlbeans.XmlString xgetCreatedByEmail();
        
        /**
         * True if has "createdByEmail" attribute
         */
        boolean isSetCreatedByEmail();
        
        /**
         * Sets the "createdByEmail" attribute
         */
        void setCreatedByEmail(java.lang.String createdByEmail);
        
        /**
         * Sets (as xml) the "createdByEmail" attribute
         */
        void xsetCreatedByEmail(org.apache.xmlbeans.XmlString createdByEmail);
        
        /**
         * Unsets the "createdByEmail" attribute
         */
        void unsetCreatedByEmail();
        
        /**
         * Gets the "company" attribute
         */
        java.lang.String getCompany();
        
        /**
         * Gets (as xml) the "company" attribute
         */
        org.apache.xmlbeans.XmlString xgetCompany();
        
        /**
         * True if has "company" attribute
         */
        boolean isSetCompany();
        
        /**
         * Sets the "company" attribute
         */
        void setCompany(java.lang.String company);
        
        /**
         * Sets (as xml) the "company" attribute
         */
        void xsetCompany(org.apache.xmlbeans.XmlString company);
        
        /**
         * Unsets the "company" attribute
         */
        void unsetCompany();
        
        /**
         * Gets the "companyURL" attribute
         */
        java.lang.String getCompanyURL();
        
        /**
         * Gets (as xml) the "companyURL" attribute
         */
        org.apache.xmlbeans.XmlString xgetCompanyURL();
        
        /**
         * True if has "companyURL" attribute
         */
        boolean isSetCompanyURL();
        
        /**
         * Sets the "companyURL" attribute
         */
        void setCompanyURL(java.lang.String companyURL);
        
        /**
         * Sets (as xml) the "companyURL" attribute
         */
        void xsetCompanyURL(org.apache.xmlbeans.XmlString companyURL);
        
        /**
         * Unsets the "companyURL" attribute
         */
        void unsetCompanyURL();
        
        /**
         * Gets the "timeStamp" attribute
         */
        java.util.Calendar getTimeStamp();
        
        /**
         * Gets (as xml) the "timeStamp" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetTimeStamp();
        
        /**
         * True if has "timeStamp" attribute
         */
        boolean isSetTimeStamp();
        
        /**
         * Sets the "timeStamp" attribute
         */
        void setTimeStamp(java.util.Calendar timeStamp);
        
        /**
         * Sets (as xml) the "timeStamp" attribute
         */
        void xsetTimeStamp(org.apache.xmlbeans.XmlDateTime timeStamp);
        
        /**
         * Unsets the "timeStamp" attribute
         */
        void unsetTimeStamp();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.AuthorDocument.Author newInstance() {
              return (org.landxml.schema.landXML11.AuthorDocument.Author) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.AuthorDocument.Author newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.AuthorDocument.Author) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.AuthorDocument newInstance() {
          return (org.landxml.schema.landXML11.AuthorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.AuthorDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.AuthorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.AuthorDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AuthorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.AuthorDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AuthorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.AuthorDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AuthorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.AuthorDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AuthorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.AuthorDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AuthorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.AuthorDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AuthorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.AuthorDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AuthorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.AuthorDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AuthorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.AuthorDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AuthorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.AuthorDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AuthorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.AuthorDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AuthorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.AuthorDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AuthorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.AuthorDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AuthorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.AuthorDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AuthorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.AuthorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.AuthorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.AuthorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.AuthorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
