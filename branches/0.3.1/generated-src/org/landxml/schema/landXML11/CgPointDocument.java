/*
 * An XML document type.
 * Localname: CgPoint
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CgPointDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one CgPoint(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface CgPointDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CgPointDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("cgpoint638edoctype");
    
    /**
     * Gets the "CgPoint" element
     */
    org.landxml.schema.landXML11.CgPointDocument.CgPoint getCgPoint();
    
    /**
     * Sets the "CgPoint" element
     */
    void setCgPoint(org.landxml.schema.landXML11.CgPointDocument.CgPoint cgPoint);
    
    /**
     * Appends and returns a new empty "CgPoint" element
     */
    org.landxml.schema.landXML11.CgPointDocument.CgPoint addNewCgPoint();
    
    /**
     * An XML CgPoint(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlDouble.
     */
    public interface CgPoint extends org.landxml.schema.landXML11.PointType
    {
        java.util.List getListValue();
        java.util.List xgetListValue();
        void setListValue(java.util.List list);
        /** @deprecated */
        java.util.List listValue();
        /** @deprecated */
        java.util.List xlistValue();
        /** @deprecated */
        void set(java.util.List list);
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CgPoint.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("cgpoint5366elemtype");
        
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
         * Gets the "surveyOrder" attribute
         */
        java.lang.String getSurveyOrder();
        
        /**
         * Gets (as xml) the "surveyOrder" attribute
         */
        org.apache.xmlbeans.XmlString xgetSurveyOrder();
        
        /**
         * True if has "surveyOrder" attribute
         */
        boolean isSetSurveyOrder();
        
        /**
         * Sets the "surveyOrder" attribute
         */
        void setSurveyOrder(java.lang.String surveyOrder);
        
        /**
         * Sets (as xml) the "surveyOrder" attribute
         */
        void xsetSurveyOrder(org.apache.xmlbeans.XmlString surveyOrder);
        
        /**
         * Unsets the "surveyOrder" attribute
         */
        void unsetSurveyOrder();
        
        /**
         * Gets the "pntSurv" attribute
         */
        org.landxml.schema.landXML11.SurvPntType.Enum getPntSurv();
        
        /**
         * Gets (as xml) the "pntSurv" attribute
         */
        org.landxml.schema.landXML11.SurvPntType xgetPntSurv();
        
        /**
         * True if has "pntSurv" attribute
         */
        boolean isSetPntSurv();
        
        /**
         * Sets the "pntSurv" attribute
         */
        void setPntSurv(org.landxml.schema.landXML11.SurvPntType.Enum pntSurv);
        
        /**
         * Sets (as xml) the "pntSurv" attribute
         */
        void xsetPntSurv(org.landxml.schema.landXML11.SurvPntType pntSurv);
        
        /**
         * Unsets the "pntSurv" attribute
         */
        void unsetPntSurv();
        
        /**
         * Gets the "zoneNumber" attribute
         */
        int getZoneNumber();
        
        /**
         * Gets (as xml) the "zoneNumber" attribute
         */
        org.landxml.schema.landXML11.ZoneNumberType xgetZoneNumber();
        
        /**
         * True if has "zoneNumber" attribute
         */
        boolean isSetZoneNumber();
        
        /**
         * Sets the "zoneNumber" attribute
         */
        void setZoneNumber(int zoneNumber);
        
        /**
         * Sets (as xml) the "zoneNumber" attribute
         */
        void xsetZoneNumber(org.landxml.schema.landXML11.ZoneNumberType zoneNumber);
        
        /**
         * Unsets the "zoneNumber" attribute
         */
        void unsetZoneNumber();
        
        /**
         * Gets the "surveyHorizontalOrder" attribute
         */
        java.lang.String getSurveyHorizontalOrder();
        
        /**
         * Gets (as xml) the "surveyHorizontalOrder" attribute
         */
        org.apache.xmlbeans.XmlString xgetSurveyHorizontalOrder();
        
        /**
         * True if has "surveyHorizontalOrder" attribute
         */
        boolean isSetSurveyHorizontalOrder();
        
        /**
         * Sets the "surveyHorizontalOrder" attribute
         */
        void setSurveyHorizontalOrder(java.lang.String surveyHorizontalOrder);
        
        /**
         * Sets (as xml) the "surveyHorizontalOrder" attribute
         */
        void xsetSurveyHorizontalOrder(org.apache.xmlbeans.XmlString surveyHorizontalOrder);
        
        /**
         * Unsets the "surveyHorizontalOrder" attribute
         */
        void unsetSurveyHorizontalOrder();
        
        /**
         * Gets the "surveyVerticalOrder" attribute
         */
        java.lang.String getSurveyVerticalOrder();
        
        /**
         * Gets (as xml) the "surveyVerticalOrder" attribute
         */
        org.apache.xmlbeans.XmlString xgetSurveyVerticalOrder();
        
        /**
         * True if has "surveyVerticalOrder" attribute
         */
        boolean isSetSurveyVerticalOrder();
        
        /**
         * Sets the "surveyVerticalOrder" attribute
         */
        void setSurveyVerticalOrder(java.lang.String surveyVerticalOrder);
        
        /**
         * Sets (as xml) the "surveyVerticalOrder" attribute
         */
        void xsetSurveyVerticalOrder(org.apache.xmlbeans.XmlString surveyVerticalOrder);
        
        /**
         * Unsets the "surveyVerticalOrder" attribute
         */
        void unsetSurveyVerticalOrder();
        
        /**
         * Gets the "localUncertainity" attribute
         */
        double getLocalUncertainity();
        
        /**
         * Gets (as xml) the "localUncertainity" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetLocalUncertainity();
        
        /**
         * True if has "localUncertainity" attribute
         */
        boolean isSetLocalUncertainity();
        
        /**
         * Sets the "localUncertainity" attribute
         */
        void setLocalUncertainity(double localUncertainity);
        
        /**
         * Sets (as xml) the "localUncertainity" attribute
         */
        void xsetLocalUncertainity(org.apache.xmlbeans.XmlDouble localUncertainity);
        
        /**
         * Unsets the "localUncertainity" attribute
         */
        void unsetLocalUncertainity();
        
        /**
         * Gets the "positionalUncertainity" attribute
         */
        double getPositionalUncertainity();
        
        /**
         * Gets (as xml) the "positionalUncertainity" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetPositionalUncertainity();
        
        /**
         * True if has "positionalUncertainity" attribute
         */
        boolean isSetPositionalUncertainity();
        
        /**
         * Sets the "positionalUncertainity" attribute
         */
        void setPositionalUncertainity(double positionalUncertainity);
        
        /**
         * Sets (as xml) the "positionalUncertainity" attribute
         */
        void xsetPositionalUncertainity(org.apache.xmlbeans.XmlDouble positionalUncertainity);
        
        /**
         * Unsets the "positionalUncertainity" attribute
         */
        void unsetPositionalUncertainity();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.CgPointDocument.CgPoint newInstance() {
              return (org.landxml.schema.landXML11.CgPointDocument.CgPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.CgPointDocument.CgPoint newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.CgPointDocument.CgPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.CgPointDocument newInstance() {
          return (org.landxml.schema.landXML11.CgPointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.CgPointDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.CgPointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.CgPointDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CgPointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.CgPointDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CgPointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.CgPointDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CgPointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.CgPointDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CgPointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.CgPointDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CgPointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.CgPointDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CgPointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.CgPointDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CgPointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.CgPointDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CgPointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.CgPointDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CgPointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.CgPointDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CgPointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.CgPointDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CgPointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.CgPointDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CgPointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.CgPointDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CgPointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.CgPointDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CgPointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CgPointDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CgPointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CgPointDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CgPointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
