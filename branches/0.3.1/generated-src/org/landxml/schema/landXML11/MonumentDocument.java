/*
 * An XML document type.
 * Localname: Monument
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.MonumentDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one Monument(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface MonumentDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MonumentDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("monument3ddbdoctype");
    
    /**
     * Gets the "Monument" element
     */
    org.landxml.schema.landXML11.MonumentDocument.Monument getMonument();
    
    /**
     * Sets the "Monument" element
     */
    void setMonument(org.landxml.schema.landXML11.MonumentDocument.Monument monument);
    
    /**
     * Appends and returns a new empty "Monument" element
     */
    org.landxml.schema.landXML11.MonumentDocument.Monument addNewMonument();
    
    /**
     * An XML Monument(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface Monument extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Monument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("monument0138elemtype");
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "pntRef" attribute
         */
        java.lang.String getPntRef();
        
        /**
         * Gets (as xml) the "pntRef" attribute
         */
        org.landxml.schema.landXML11.PointNameRef xgetPntRef();
        
        /**
         * True if has "pntRef" attribute
         */
        boolean isSetPntRef();
        
        /**
         * Sets the "pntRef" attribute
         */
        void setPntRef(java.lang.String pntRef);
        
        /**
         * Sets (as xml) the "pntRef" attribute
         */
        void xsetPntRef(org.landxml.schema.landXML11.PointNameRef pntRef);
        
        /**
         * Unsets the "pntRef" attribute
         */
        void unsetPntRef();
        
        /**
         * Gets the "desc" attribute
         */
        java.lang.String getDesc();
        
        /**
         * Gets (as xml) the "desc" attribute
         */
        org.apache.xmlbeans.XmlString xgetDesc();
        
        /**
         * True if has "desc" attribute
         */
        boolean isSetDesc();
        
        /**
         * Sets the "desc" attribute
         */
        void setDesc(java.lang.String desc);
        
        /**
         * Sets (as xml) the "desc" attribute
         */
        void xsetDesc(org.apache.xmlbeans.XmlString desc);
        
        /**
         * Unsets the "desc" attribute
         */
        void unsetDesc();
        
        /**
         * Gets the "state" attribute
         */
        java.lang.String getState();
        
        /**
         * Gets (as xml) the "state" attribute
         */
        org.landxml.schema.landXML11.MonumentState xgetState();
        
        /**
         * True if has "state" attribute
         */
        boolean isSetState();
        
        /**
         * Sets the "state" attribute
         */
        void setState(java.lang.String state);
        
        /**
         * Sets (as xml) the "state" attribute
         */
        void xsetState(org.landxml.schema.landXML11.MonumentState state);
        
        /**
         * Unsets the "state" attribute
         */
        void unsetState();
        
        /**
         * Gets the "type" attribute
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        org.landxml.schema.landXML11.MonumentType xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(org.landxml.schema.landXML11.MonumentType type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * Gets the "condition" attribute
         */
        java.lang.String getCondition();
        
        /**
         * Gets (as xml) the "condition" attribute
         */
        org.landxml.schema.landXML11.MonumentCondition xgetCondition();
        
        /**
         * True if has "condition" attribute
         */
        boolean isSetCondition();
        
        /**
         * Sets the "condition" attribute
         */
        void setCondition(java.lang.String condition);
        
        /**
         * Sets (as xml) the "condition" attribute
         */
        void xsetCondition(org.landxml.schema.landXML11.MonumentCondition condition);
        
        /**
         * Unsets the "condition" attribute
         */
        void unsetCondition();
        
        /**
         * Gets the "category" attribute
         */
        org.landxml.schema.landXML11.MonumentCategory.Enum getCategory();
        
        /**
         * Gets (as xml) the "category" attribute
         */
        org.landxml.schema.landXML11.MonumentCategory xgetCategory();
        
        /**
         * True if has "category" attribute
         */
        boolean isSetCategory();
        
        /**
         * Sets the "category" attribute
         */
        void setCategory(org.landxml.schema.landXML11.MonumentCategory.Enum category);
        
        /**
         * Sets (as xml) the "category" attribute
         */
        void xsetCategory(org.landxml.schema.landXML11.MonumentCategory category);
        
        /**
         * Unsets the "category" attribute
         */
        void unsetCategory();
        
        /**
         * Gets the "beacon" attribute
         */
        org.landxml.schema.landXML11.BeaconType.Enum getBeacon();
        
        /**
         * Gets (as xml) the "beacon" attribute
         */
        org.landxml.schema.landXML11.BeaconType xgetBeacon();
        
        /**
         * True if has "beacon" attribute
         */
        boolean isSetBeacon();
        
        /**
         * Sets the "beacon" attribute
         */
        void setBeacon(org.landxml.schema.landXML11.BeaconType.Enum beacon);
        
        /**
         * Sets (as xml) the "beacon" attribute
         */
        void xsetBeacon(org.landxml.schema.landXML11.BeaconType beacon);
        
        /**
         * Unsets the "beacon" attribute
         */
        void unsetBeacon();
        
        /**
         * Gets the "beaconProtection" attribute
         */
        org.landxml.schema.landXML11.BeaconProtectionType.Enum getBeaconProtection();
        
        /**
         * Gets (as xml) the "beaconProtection" attribute
         */
        org.landxml.schema.landXML11.BeaconProtectionType xgetBeaconProtection();
        
        /**
         * True if has "beaconProtection" attribute
         */
        boolean isSetBeaconProtection();
        
        /**
         * Sets the "beaconProtection" attribute
         */
        void setBeaconProtection(org.landxml.schema.landXML11.BeaconProtectionType.Enum beaconProtection);
        
        /**
         * Sets (as xml) the "beaconProtection" attribute
         */
        void xsetBeaconProtection(org.landxml.schema.landXML11.BeaconProtectionType beaconProtection);
        
        /**
         * Unsets the "beaconProtection" attribute
         */
        void unsetBeaconProtection();
        
        /**
         * Gets the "oID" attribute
         */
        java.lang.String getOID();
        
        /**
         * Gets (as xml) the "oID" attribute
         */
        org.apache.xmlbeans.XmlString xgetOID();
        
        /**
         * True if has "oID" attribute
         */
        boolean isSetOID();
        
        /**
         * Sets the "oID" attribute
         */
        void setOID(java.lang.String oid);
        
        /**
         * Sets (as xml) the "oID" attribute
         */
        void xsetOID(org.apache.xmlbeans.XmlString oid);
        
        /**
         * Unsets the "oID" attribute
         */
        void unsetOID();
        
        /**
         * Gets the "reference" attribute
         */
        java.lang.String getReference();
        
        /**
         * Gets (as xml) the "reference" attribute
         */
        org.apache.xmlbeans.XmlString xgetReference();
        
        /**
         * True if has "reference" attribute
         */
        boolean isSetReference();
        
        /**
         * Sets the "reference" attribute
         */
        void setReference(java.lang.String reference);
        
        /**
         * Sets (as xml) the "reference" attribute
         */
        void xsetReference(org.apache.xmlbeans.XmlString reference);
        
        /**
         * Unsets the "reference" attribute
         */
        void unsetReference();
        
        /**
         * Gets the "originSurvey" attribute
         */
        java.lang.String getOriginSurvey();
        
        /**
         * Gets (as xml) the "originSurvey" attribute
         */
        org.apache.xmlbeans.XmlString xgetOriginSurvey();
        
        /**
         * True if has "originSurvey" attribute
         */
        boolean isSetOriginSurvey();
        
        /**
         * Sets the "originSurvey" attribute
         */
        void setOriginSurvey(java.lang.String originSurvey);
        
        /**
         * Sets (as xml) the "originSurvey" attribute
         */
        void xsetOriginSurvey(org.apache.xmlbeans.XmlString originSurvey);
        
        /**
         * Unsets the "originSurvey" attribute
         */
        void unsetOriginSurvey();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.MonumentDocument.Monument newInstance() {
              return (org.landxml.schema.landXML11.MonumentDocument.Monument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.MonumentDocument.Monument newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.MonumentDocument.Monument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.MonumentDocument newInstance() {
          return (org.landxml.schema.landXML11.MonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.MonumentDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.MonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.MonumentDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.MonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.MonumentDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.MonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.MonumentDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.MonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.MonumentDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.MonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.MonumentDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.MonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.MonumentDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.MonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.MonumentDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.MonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.MonumentDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.MonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.MonumentDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.MonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.MonumentDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.MonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.MonumentDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.MonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.MonumentDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.MonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.MonumentDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.MonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.MonumentDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.MonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.MonumentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.MonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.MonumentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.MonumentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
