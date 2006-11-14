/*
 * An XML document type.
 * Localname: Amendment
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.AmendmentDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one Amendment(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface AmendmentDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AmendmentDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("amendmentd80fdoctype");
    
    /**
     * Gets the "Amendment" element
     */
    org.landxml.schema.landXML11.AmendmentDocument.Amendment getAmendment();
    
    /**
     * Sets the "Amendment" element
     */
    void setAmendment(org.landxml.schema.landXML11.AmendmentDocument.Amendment amendment);
    
    /**
     * Appends and returns a new empty "Amendment" element
     */
    org.landxml.schema.landXML11.AmendmentDocument.Amendment addNewAmendment();
    
    /**
     * An XML Amendment(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface Amendment extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Amendment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("amendmente0a8elemtype");
        
        /**
         * Gets a List of "AmendmentItem" elements
         */
        java.util.List<org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem> getAmendmentItemList();
        
        /**
         * Gets array of all "AmendmentItem" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem[] getAmendmentItemArray();
        
        /**
         * Gets ith "AmendmentItem" element
         */
        org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem getAmendmentItemArray(int i);
        
        /**
         * Returns number of "AmendmentItem" element
         */
        int sizeOfAmendmentItemArray();
        
        /**
         * Sets array of all "AmendmentItem" element
         */
        void setAmendmentItemArray(org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem[] amendmentItemArray);
        
        /**
         * Sets ith "AmendmentItem" element
         */
        void setAmendmentItemArray(int i, org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem amendmentItem);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AmendmentItem" element
         */
        org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem insertNewAmendmentItem(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AmendmentItem" element
         */
        org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem addNewAmendmentItem();
        
        /**
         * Removes the ith "AmendmentItem" element
         */
        void removeAmendmentItem(int i);
        
        /**
         * Gets the "dealingNumber" attribute
         */
        java.lang.String getDealingNumber();
        
        /**
         * Gets (as xml) the "dealingNumber" attribute
         */
        org.apache.xmlbeans.XmlString xgetDealingNumber();
        
        /**
         * True if has "dealingNumber" attribute
         */
        boolean isSetDealingNumber();
        
        /**
         * Sets the "dealingNumber" attribute
         */
        void setDealingNumber(java.lang.String dealingNumber);
        
        /**
         * Sets (as xml) the "dealingNumber" attribute
         */
        void xsetDealingNumber(org.apache.xmlbeans.XmlString dealingNumber);
        
        /**
         * Unsets the "dealingNumber" attribute
         */
        void unsetDealingNumber();
        
        /**
         * Gets the "amendmentDate" attribute
         */
        java.util.Calendar getAmendmentDate();
        
        /**
         * Gets (as xml) the "amendmentDate" attribute
         */
        org.apache.xmlbeans.XmlDate xgetAmendmentDate();
        
        /**
         * True if has "amendmentDate" attribute
         */
        boolean isSetAmendmentDate();
        
        /**
         * Sets the "amendmentDate" attribute
         */
        void setAmendmentDate(java.util.Calendar amendmentDate);
        
        /**
         * Sets (as xml) the "amendmentDate" attribute
         */
        void xsetAmendmentDate(org.apache.xmlbeans.XmlDate amendmentDate);
        
        /**
         * Unsets the "amendmentDate" attribute
         */
        void unsetAmendmentDate();
        
        /**
         * Gets the "comments" attribute
         */
        java.lang.String getComments();
        
        /**
         * Gets (as xml) the "comments" attribute
         */
        org.apache.xmlbeans.XmlString xgetComments();
        
        /**
         * True if has "comments" attribute
         */
        boolean isSetComments();
        
        /**
         * Sets the "comments" attribute
         */
        void setComments(java.lang.String comments);
        
        /**
         * Sets (as xml) the "comments" attribute
         */
        void xsetComments(org.apache.xmlbeans.XmlString comments);
        
        /**
         * Unsets the "comments" attribute
         */
        void unsetComments();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.AmendmentDocument.Amendment newInstance() {
              return (org.landxml.schema.landXML11.AmendmentDocument.Amendment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.AmendmentDocument.Amendment newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.AmendmentDocument.Amendment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.AmendmentDocument newInstance() {
          return (org.landxml.schema.landXML11.AmendmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.AmendmentDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.AmendmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.AmendmentDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AmendmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.AmendmentDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AmendmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.AmendmentDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AmendmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.AmendmentDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AmendmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.AmendmentDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AmendmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.AmendmentDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AmendmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.AmendmentDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AmendmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.AmendmentDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AmendmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.AmendmentDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AmendmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.AmendmentDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AmendmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.AmendmentDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AmendmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.AmendmentDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AmendmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.AmendmentDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AmendmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.AmendmentDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AmendmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.AmendmentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.AmendmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.AmendmentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.AmendmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
