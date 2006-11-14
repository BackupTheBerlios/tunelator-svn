/*
 * An XML document type.
 * Localname: Imperial
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ImperialDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one Imperial(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface ImperialDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ImperialDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("imperial4f4fdoctype");
    
    /**
     * Gets the "Imperial" element
     */
    org.landxml.schema.landXML11.ImperialDocument.Imperial getImperial();
    
    /**
     * Sets the "Imperial" element
     */
    void setImperial(org.landxml.schema.landXML11.ImperialDocument.Imperial imperial);
    
    /**
     * Appends and returns a new empty "Imperial" element
     */
    org.landxml.schema.landXML11.ImperialDocument.Imperial addNewImperial();
    
    /**
     * An XML Imperial(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface Imperial extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Imperial.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("imperial50b8elemtype");
        
        /**
         * Gets the "areaUnit" attribute
         */
        org.landxml.schema.landXML11.ImpArea.Enum getAreaUnit();
        
        /**
         * Gets (as xml) the "areaUnit" attribute
         */
        org.landxml.schema.landXML11.ImpArea xgetAreaUnit();
        
        /**
         * Sets the "areaUnit" attribute
         */
        void setAreaUnit(org.landxml.schema.landXML11.ImpArea.Enum areaUnit);
        
        /**
         * Sets (as xml) the "areaUnit" attribute
         */
        void xsetAreaUnit(org.landxml.schema.landXML11.ImpArea areaUnit);
        
        /**
         * Gets the "linearUnit" attribute
         */
        org.landxml.schema.landXML11.ImpLinear.Enum getLinearUnit();
        
        /**
         * Gets (as xml) the "linearUnit" attribute
         */
        org.landxml.schema.landXML11.ImpLinear xgetLinearUnit();
        
        /**
         * Sets the "linearUnit" attribute
         */
        void setLinearUnit(org.landxml.schema.landXML11.ImpLinear.Enum linearUnit);
        
        /**
         * Sets (as xml) the "linearUnit" attribute
         */
        void xsetLinearUnit(org.landxml.schema.landXML11.ImpLinear linearUnit);
        
        /**
         * Gets the "volumeUnit" attribute
         */
        org.landxml.schema.landXML11.ImpVolume.Enum getVolumeUnit();
        
        /**
         * Gets (as xml) the "volumeUnit" attribute
         */
        org.landxml.schema.landXML11.ImpVolume xgetVolumeUnit();
        
        /**
         * Sets the "volumeUnit" attribute
         */
        void setVolumeUnit(org.landxml.schema.landXML11.ImpVolume.Enum volumeUnit);
        
        /**
         * Sets (as xml) the "volumeUnit" attribute
         */
        void xsetVolumeUnit(org.landxml.schema.landXML11.ImpVolume volumeUnit);
        
        /**
         * Gets the "temperatureUnit" attribute
         */
        org.landxml.schema.landXML11.ImpTemperature.Enum getTemperatureUnit();
        
        /**
         * Gets (as xml) the "temperatureUnit" attribute
         */
        org.landxml.schema.landXML11.ImpTemperature xgetTemperatureUnit();
        
        /**
         * Sets the "temperatureUnit" attribute
         */
        void setTemperatureUnit(org.landxml.schema.landXML11.ImpTemperature.Enum temperatureUnit);
        
        /**
         * Sets (as xml) the "temperatureUnit" attribute
         */
        void xsetTemperatureUnit(org.landxml.schema.landXML11.ImpTemperature temperatureUnit);
        
        /**
         * Gets the "pressureUnit" attribute
         */
        org.landxml.schema.landXML11.ImpPressure.Enum getPressureUnit();
        
        /**
         * Gets (as xml) the "pressureUnit" attribute
         */
        org.landxml.schema.landXML11.ImpPressure xgetPressureUnit();
        
        /**
         * Sets the "pressureUnit" attribute
         */
        void setPressureUnit(org.landxml.schema.landXML11.ImpPressure.Enum pressureUnit);
        
        /**
         * Sets (as xml) the "pressureUnit" attribute
         */
        void xsetPressureUnit(org.landxml.schema.landXML11.ImpPressure pressureUnit);
        
        /**
         * Gets the "diameterUnit" attribute
         */
        org.landxml.schema.landXML11.ImpDiameter.Enum getDiameterUnit();
        
        /**
         * Gets (as xml) the "diameterUnit" attribute
         */
        org.landxml.schema.landXML11.ImpDiameter xgetDiameterUnit();
        
        /**
         * True if has "diameterUnit" attribute
         */
        boolean isSetDiameterUnit();
        
        /**
         * Sets the "diameterUnit" attribute
         */
        void setDiameterUnit(org.landxml.schema.landXML11.ImpDiameter.Enum diameterUnit);
        
        /**
         * Sets (as xml) the "diameterUnit" attribute
         */
        void xsetDiameterUnit(org.landxml.schema.landXML11.ImpDiameter diameterUnit);
        
        /**
         * Unsets the "diameterUnit" attribute
         */
        void unsetDiameterUnit();
        
        /**
         * Gets the "widthUnit" attribute
         */
        org.landxml.schema.landXML11.ImpWidth.Enum getWidthUnit();
        
        /**
         * Gets (as xml) the "widthUnit" attribute
         */
        org.landxml.schema.landXML11.ImpWidth xgetWidthUnit();
        
        /**
         * True if has "widthUnit" attribute
         */
        boolean isSetWidthUnit();
        
        /**
         * Sets the "widthUnit" attribute
         */
        void setWidthUnit(org.landxml.schema.landXML11.ImpWidth.Enum widthUnit);
        
        /**
         * Sets (as xml) the "widthUnit" attribute
         */
        void xsetWidthUnit(org.landxml.schema.landXML11.ImpWidth widthUnit);
        
        /**
         * Unsets the "widthUnit" attribute
         */
        void unsetWidthUnit();
        
        /**
         * Gets the "heightUnit" attribute
         */
        org.landxml.schema.landXML11.ImpHeight.Enum getHeightUnit();
        
        /**
         * Gets (as xml) the "heightUnit" attribute
         */
        org.landxml.schema.landXML11.ImpHeight xgetHeightUnit();
        
        /**
         * True if has "heightUnit" attribute
         */
        boolean isSetHeightUnit();
        
        /**
         * Sets the "heightUnit" attribute
         */
        void setHeightUnit(org.landxml.schema.landXML11.ImpHeight.Enum heightUnit);
        
        /**
         * Sets (as xml) the "heightUnit" attribute
         */
        void xsetHeightUnit(org.landxml.schema.landXML11.ImpHeight heightUnit);
        
        /**
         * Unsets the "heightUnit" attribute
         */
        void unsetHeightUnit();
        
        /**
         * Gets the "velocityUnit" attribute
         */
        org.landxml.schema.landXML11.ImpVelocity.Enum getVelocityUnit();
        
        /**
         * Gets (as xml) the "velocityUnit" attribute
         */
        org.landxml.schema.landXML11.ImpVelocity xgetVelocityUnit();
        
        /**
         * True if has "velocityUnit" attribute
         */
        boolean isSetVelocityUnit();
        
        /**
         * Sets the "velocityUnit" attribute
         */
        void setVelocityUnit(org.landxml.schema.landXML11.ImpVelocity.Enum velocityUnit);
        
        /**
         * Sets (as xml) the "velocityUnit" attribute
         */
        void xsetVelocityUnit(org.landxml.schema.landXML11.ImpVelocity velocityUnit);
        
        /**
         * Unsets the "velocityUnit" attribute
         */
        void unsetVelocityUnit();
        
        /**
         * Gets the "flowUnit" attribute
         */
        org.landxml.schema.landXML11.ImpFlow.Enum getFlowUnit();
        
        /**
         * Gets (as xml) the "flowUnit" attribute
         */
        org.landxml.schema.landXML11.ImpFlow xgetFlowUnit();
        
        /**
         * True if has "flowUnit" attribute
         */
        boolean isSetFlowUnit();
        
        /**
         * Sets the "flowUnit" attribute
         */
        void setFlowUnit(org.landxml.schema.landXML11.ImpFlow.Enum flowUnit);
        
        /**
         * Sets (as xml) the "flowUnit" attribute
         */
        void xsetFlowUnit(org.landxml.schema.landXML11.ImpFlow flowUnit);
        
        /**
         * Unsets the "flowUnit" attribute
         */
        void unsetFlowUnit();
        
        /**
         * Gets the "angularUnit" attribute
         */
        org.landxml.schema.landXML11.AngularType.Enum getAngularUnit();
        
        /**
         * Gets (as xml) the "angularUnit" attribute
         */
        org.landxml.schema.landXML11.AngularType xgetAngularUnit();
        
        /**
         * True if has "angularUnit" attribute
         */
        boolean isSetAngularUnit();
        
        /**
         * Sets the "angularUnit" attribute
         */
        void setAngularUnit(org.landxml.schema.landXML11.AngularType.Enum angularUnit);
        
        /**
         * Sets (as xml) the "angularUnit" attribute
         */
        void xsetAngularUnit(org.landxml.schema.landXML11.AngularType angularUnit);
        
        /**
         * Unsets the "angularUnit" attribute
         */
        void unsetAngularUnit();
        
        /**
         * Gets the "directionUnit" attribute
         */
        org.landxml.schema.landXML11.AngularType.Enum getDirectionUnit();
        
        /**
         * Gets (as xml) the "directionUnit" attribute
         */
        org.landxml.schema.landXML11.AngularType xgetDirectionUnit();
        
        /**
         * True if has "directionUnit" attribute
         */
        boolean isSetDirectionUnit();
        
        /**
         * Sets the "directionUnit" attribute
         */
        void setDirectionUnit(org.landxml.schema.landXML11.AngularType.Enum directionUnit);
        
        /**
         * Sets (as xml) the "directionUnit" attribute
         */
        void xsetDirectionUnit(org.landxml.schema.landXML11.AngularType directionUnit);
        
        /**
         * Unsets the "directionUnit" attribute
         */
        void unsetDirectionUnit();
        
        /**
         * Gets the "latLongAngularUnit" attribute
         */
        org.landxml.schema.landXML11.LatLongAngularType.Enum getLatLongAngularUnit();
        
        /**
         * Gets (as xml) the "latLongAngularUnit" attribute
         */
        org.landxml.schema.landXML11.LatLongAngularType xgetLatLongAngularUnit();
        
        /**
         * True if has "latLongAngularUnit" attribute
         */
        boolean isSetLatLongAngularUnit();
        
        /**
         * Sets the "latLongAngularUnit" attribute
         */
        void setLatLongAngularUnit(org.landxml.schema.landXML11.LatLongAngularType.Enum latLongAngularUnit);
        
        /**
         * Sets (as xml) the "latLongAngularUnit" attribute
         */
        void xsetLatLongAngularUnit(org.landxml.schema.landXML11.LatLongAngularType latLongAngularUnit);
        
        /**
         * Unsets the "latLongAngularUnit" attribute
         */
        void unsetLatLongAngularUnit();
        
        /**
         * Gets the "elevationUnit" attribute
         */
        org.landxml.schema.landXML11.ElevationType.Enum getElevationUnit();
        
        /**
         * Gets (as xml) the "elevationUnit" attribute
         */
        org.landxml.schema.landXML11.ElevationType xgetElevationUnit();
        
        /**
         * True if has "elevationUnit" attribute
         */
        boolean isSetElevationUnit();
        
        /**
         * Sets the "elevationUnit" attribute
         */
        void setElevationUnit(org.landxml.schema.landXML11.ElevationType.Enum elevationUnit);
        
        /**
         * Sets (as xml) the "elevationUnit" attribute
         */
        void xsetElevationUnit(org.landxml.schema.landXML11.ElevationType elevationUnit);
        
        /**
         * Unsets the "elevationUnit" attribute
         */
        void unsetElevationUnit();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.ImperialDocument.Imperial newInstance() {
              return (org.landxml.schema.landXML11.ImperialDocument.Imperial) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.ImperialDocument.Imperial newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.ImperialDocument.Imperial) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.ImperialDocument newInstance() {
          return (org.landxml.schema.landXML11.ImperialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.ImperialDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.ImperialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.ImperialDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ImperialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.ImperialDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ImperialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.ImperialDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ImperialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.ImperialDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ImperialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.ImperialDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ImperialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.ImperialDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ImperialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.ImperialDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ImperialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.ImperialDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ImperialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.ImperialDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ImperialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.ImperialDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ImperialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.ImperialDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ImperialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.ImperialDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ImperialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.ImperialDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ImperialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.ImperialDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ImperialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ImperialDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ImperialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ImperialDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ImperialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
