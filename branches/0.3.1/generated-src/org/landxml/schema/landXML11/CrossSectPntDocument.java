/*
 * An XML document type.
 * Localname: CrossSectPnt
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CrossSectPntDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one CrossSectPnt(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface CrossSectPntDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CrossSectPntDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("crosssectpnt4f27doctype");
    
    /**
     * Gets the "CrossSectPnt" element
     */
    org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt getCrossSectPnt();
    
    /**
     * Sets the "CrossSectPnt" element
     */
    void setCrossSectPnt(org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt crossSectPnt);
    
    /**
     * Appends and returns a new empty "CrossSectPnt" element
     */
    org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt addNewCrossSectPnt();
    
    /**
     * An XML CrossSectPnt(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlDouble.
     */
    public interface CrossSectPnt extends org.landxml.schema.landXML11.PointType
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CrossSectPnt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("crosssectpnt00b8elemtype");
        
        /**
         * Gets the "dataFormat" attribute
         */
        org.landxml.schema.landXML11.DataFormatType.Enum getDataFormat();
        
        /**
         * Gets (as xml) the "dataFormat" attribute
         */
        org.landxml.schema.landXML11.DataFormatType xgetDataFormat();
        
        /**
         * True if has "dataFormat" attribute
         */
        boolean isSetDataFormat();
        
        /**
         * Sets the "dataFormat" attribute
         */
        void setDataFormat(org.landxml.schema.landXML11.DataFormatType.Enum dataFormat);
        
        /**
         * Sets (as xml) the "dataFormat" attribute
         */
        void xsetDataFormat(org.landxml.schema.landXML11.DataFormatType dataFormat);
        
        /**
         * Unsets the "dataFormat" attribute
         */
        void unsetDataFormat();
        
        /**
         * Gets the "alignRef" attribute
         */
        java.lang.String getAlignRef();
        
        /**
         * Gets (as xml) the "alignRef" attribute
         */
        org.landxml.schema.landXML11.AlignmentNameRef xgetAlignRef();
        
        /**
         * True if has "alignRef" attribute
         */
        boolean isSetAlignRef();
        
        /**
         * Sets the "alignRef" attribute
         */
        void setAlignRef(java.lang.String alignRef);
        
        /**
         * Sets (as xml) the "alignRef" attribute
         */
        void xsetAlignRef(org.landxml.schema.landXML11.AlignmentNameRef alignRef);
        
        /**
         * Unsets the "alignRef" attribute
         */
        void unsetAlignRef();
        
        /**
         * Gets the "alignRefStation" attribute
         */
        double getAlignRefStation();
        
        /**
         * Gets (as xml) the "alignRefStation" attribute
         */
        org.landxml.schema.landXML11.Station xgetAlignRefStation();
        
        /**
         * True if has "alignRefStation" attribute
         */
        boolean isSetAlignRefStation();
        
        /**
         * Sets the "alignRefStation" attribute
         */
        void setAlignRefStation(double alignRefStation);
        
        /**
         * Sets (as xml) the "alignRefStation" attribute
         */
        void xsetAlignRefStation(org.landxml.schema.landXML11.Station alignRefStation);
        
        /**
         * Unsets the "alignRefStation" attribute
         */
        void unsetAlignRefStation();
        
        /**
         * Gets the "planFeatureRef" attribute
         */
        java.lang.String getPlanFeatureRef();
        
        /**
         * Gets (as xml) the "planFeatureRef" attribute
         */
        org.landxml.schema.landXML11.PlanFeatureNameRef xgetPlanFeatureRef();
        
        /**
         * True if has "planFeatureRef" attribute
         */
        boolean isSetPlanFeatureRef();
        
        /**
         * Sets the "planFeatureRef" attribute
         */
        void setPlanFeatureRef(java.lang.String planFeatureRef);
        
        /**
         * Sets (as xml) the "planFeatureRef" attribute
         */
        void xsetPlanFeatureRef(org.landxml.schema.landXML11.PlanFeatureNameRef planFeatureRef);
        
        /**
         * Unsets the "planFeatureRef" attribute
         */
        void unsetPlanFeatureRef();
        
        /**
         * Gets the "planFeatureRefStation" attribute
         */
        double getPlanFeatureRefStation();
        
        /**
         * Gets (as xml) the "planFeatureRefStation" attribute
         */
        org.landxml.schema.landXML11.Station xgetPlanFeatureRefStation();
        
        /**
         * True if has "planFeatureRefStation" attribute
         */
        boolean isSetPlanFeatureRefStation();
        
        /**
         * Sets the "planFeatureRefStation" attribute
         */
        void setPlanFeatureRefStation(double planFeatureRefStation);
        
        /**
         * Sets (as xml) the "planFeatureRefStation" attribute
         */
        void xsetPlanFeatureRefStation(org.landxml.schema.landXML11.Station planFeatureRefStation);
        
        /**
         * Unsets the "planFeatureRefStation" attribute
         */
        void unsetPlanFeatureRefStation();
        
        /**
         * Gets the "parcelRef" attribute
         */
        java.lang.String getParcelRef();
        
        /**
         * Gets (as xml) the "parcelRef" attribute
         */
        org.landxml.schema.landXML11.ParcelNameRef xgetParcelRef();
        
        /**
         * True if has "parcelRef" attribute
         */
        boolean isSetParcelRef();
        
        /**
         * Sets the "parcelRef" attribute
         */
        void setParcelRef(java.lang.String parcelRef);
        
        /**
         * Sets (as xml) the "parcelRef" attribute
         */
        void xsetParcelRef(org.landxml.schema.landXML11.ParcelNameRef parcelRef);
        
        /**
         * Unsets the "parcelRef" attribute
         */
        void unsetParcelRef();
        
        /**
         * Gets the "parcelRefStation" attribute
         */
        double getParcelRefStation();
        
        /**
         * Gets (as xml) the "parcelRefStation" attribute
         */
        org.landxml.schema.landXML11.Station xgetParcelRefStation();
        
        /**
         * True if has "parcelRefStation" attribute
         */
        boolean isSetParcelRefStation();
        
        /**
         * Sets the "parcelRefStation" attribute
         */
        void setParcelRefStation(double parcelRefStation);
        
        /**
         * Sets (as xml) the "parcelRefStation" attribute
         */
        void xsetParcelRefStation(org.landxml.schema.landXML11.Station parcelRefStation);
        
        /**
         * Unsets the "parcelRefStation" attribute
         */
        void unsetParcelRefStation();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt newInstance() {
              return (org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.CrossSectPntDocument newInstance() {
          return (org.landxml.schema.landXML11.CrossSectPntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectPntDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.CrossSectPntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.CrossSectPntDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrossSectPntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectPntDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrossSectPntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.CrossSectPntDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectPntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectPntDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectPntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.CrossSectPntDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectPntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectPntDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectPntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.CrossSectPntDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectPntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectPntDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectPntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.CrossSectPntDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectPntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectPntDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectPntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.CrossSectPntDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrossSectPntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectPntDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrossSectPntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.CrossSectPntDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrossSectPntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectPntDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrossSectPntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CrossSectPntDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CrossSectPntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CrossSectPntDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CrossSectPntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
