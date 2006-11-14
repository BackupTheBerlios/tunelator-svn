/*
 * An XML document type.
 * Localname: CantStation
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CantStationDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one CantStation(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface CantStationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CantStationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("cantstationb172doctype");
    
    /**
     * Gets the "CantStation" element
     */
    org.landxml.schema.landXML11.CantStationDocument.CantStation getCantStation();
    
    /**
     * Sets the "CantStation" element
     */
    void setCantStation(org.landxml.schema.landXML11.CantStationDocument.CantStation cantStation);
    
    /**
     * Appends and returns a new empty "CantStation" element
     */
    org.landxml.schema.landXML11.CantStationDocument.CantStation addNewCantStation();
    
    /**
     * An XML CantStation(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface CantStation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CantStation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("cantstation3baeelemtype");
        
        /**
         * Gets the "station" attribute
         */
        double getStation();
        
        /**
         * Gets (as xml) the "station" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetStation();
        
        /**
         * Sets the "station" attribute
         */
        void setStation(double station);
        
        /**
         * Sets (as xml) the "station" attribute
         */
        void xsetStation(org.apache.xmlbeans.XmlDouble station);
        
        /**
         * Gets the "equilibriumCant" attribute
         */
        double getEquilibriumCant();
        
        /**
         * Gets (as xml) the "equilibriumCant" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetEquilibriumCant();
        
        /**
         * True if has "equilibriumCant" attribute
         */
        boolean isSetEquilibriumCant();
        
        /**
         * Sets the "equilibriumCant" attribute
         */
        void setEquilibriumCant(double equilibriumCant);
        
        /**
         * Sets (as xml) the "equilibriumCant" attribute
         */
        void xsetEquilibriumCant(org.apache.xmlbeans.XmlDouble equilibriumCant);
        
        /**
         * Unsets the "equilibriumCant" attribute
         */
        void unsetEquilibriumCant();
        
        /**
         * Gets the "appliedCant" attribute
         */
        double getAppliedCant();
        
        /**
         * Gets (as xml) the "appliedCant" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetAppliedCant();
        
        /**
         * Sets the "appliedCant" attribute
         */
        void setAppliedCant(double appliedCant);
        
        /**
         * Sets (as xml) the "appliedCant" attribute
         */
        void xsetAppliedCant(org.apache.xmlbeans.XmlDouble appliedCant);
        
        /**
         * Gets the "cantDeficiency" attribute
         */
        double getCantDeficiency();
        
        /**
         * Gets (as xml) the "cantDeficiency" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetCantDeficiency();
        
        /**
         * True if has "cantDeficiency" attribute
         */
        boolean isSetCantDeficiency();
        
        /**
         * Sets the "cantDeficiency" attribute
         */
        void setCantDeficiency(double cantDeficiency);
        
        /**
         * Sets (as xml) the "cantDeficiency" attribute
         */
        void xsetCantDeficiency(org.apache.xmlbeans.XmlDouble cantDeficiency);
        
        /**
         * Unsets the "cantDeficiency" attribute
         */
        void unsetCantDeficiency();
        
        /**
         * Gets the "cantExcess" attribute
         */
        double getCantExcess();
        
        /**
         * Gets (as xml) the "cantExcess" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetCantExcess();
        
        /**
         * True if has "cantExcess" attribute
         */
        boolean isSetCantExcess();
        
        /**
         * Sets the "cantExcess" attribute
         */
        void setCantExcess(double cantExcess);
        
        /**
         * Sets (as xml) the "cantExcess" attribute
         */
        void xsetCantExcess(org.apache.xmlbeans.XmlDouble cantExcess);
        
        /**
         * Unsets the "cantExcess" attribute
         */
        void unsetCantExcess();
        
        /**
         * Gets the "rateOfChangeOfAppliedCantOverTime" attribute
         */
        double getRateOfChangeOfAppliedCantOverTime();
        
        /**
         * Gets (as xml) the "rateOfChangeOfAppliedCantOverTime" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetRateOfChangeOfAppliedCantOverTime();
        
        /**
         * True if has "rateOfChangeOfAppliedCantOverTime" attribute
         */
        boolean isSetRateOfChangeOfAppliedCantOverTime();
        
        /**
         * Sets the "rateOfChangeOfAppliedCantOverTime" attribute
         */
        void setRateOfChangeOfAppliedCantOverTime(double rateOfChangeOfAppliedCantOverTime);
        
        /**
         * Sets (as xml) the "rateOfChangeOfAppliedCantOverTime" attribute
         */
        void xsetRateOfChangeOfAppliedCantOverTime(org.apache.xmlbeans.XmlDouble rateOfChangeOfAppliedCantOverTime);
        
        /**
         * Unsets the "rateOfChangeOfAppliedCantOverTime" attribute
         */
        void unsetRateOfChangeOfAppliedCantOverTime();
        
        /**
         * Gets the "rateOfChangeOfAppliedCantOverLength" attribute
         */
        double getRateOfChangeOfAppliedCantOverLength();
        
        /**
         * Gets (as xml) the "rateOfChangeOfAppliedCantOverLength" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetRateOfChangeOfAppliedCantOverLength();
        
        /**
         * True if has "rateOfChangeOfAppliedCantOverLength" attribute
         */
        boolean isSetRateOfChangeOfAppliedCantOverLength();
        
        /**
         * Sets the "rateOfChangeOfAppliedCantOverLength" attribute
         */
        void setRateOfChangeOfAppliedCantOverLength(double rateOfChangeOfAppliedCantOverLength);
        
        /**
         * Sets (as xml) the "rateOfChangeOfAppliedCantOverLength" attribute
         */
        void xsetRateOfChangeOfAppliedCantOverLength(org.apache.xmlbeans.XmlDouble rateOfChangeOfAppliedCantOverLength);
        
        /**
         * Unsets the "rateOfChangeOfAppliedCantOverLength" attribute
         */
        void unsetRateOfChangeOfAppliedCantOverLength();
        
        /**
         * Gets the "rateOfChangeOfCantDeficiencyOverTime" attribute
         */
        double getRateOfChangeOfCantDeficiencyOverTime();
        
        /**
         * Gets (as xml) the "rateOfChangeOfCantDeficiencyOverTime" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetRateOfChangeOfCantDeficiencyOverTime();
        
        /**
         * True if has "rateOfChangeOfCantDeficiencyOverTime" attribute
         */
        boolean isSetRateOfChangeOfCantDeficiencyOverTime();
        
        /**
         * Sets the "rateOfChangeOfCantDeficiencyOverTime" attribute
         */
        void setRateOfChangeOfCantDeficiencyOverTime(double rateOfChangeOfCantDeficiencyOverTime);
        
        /**
         * Sets (as xml) the "rateOfChangeOfCantDeficiencyOverTime" attribute
         */
        void xsetRateOfChangeOfCantDeficiencyOverTime(org.apache.xmlbeans.XmlDouble rateOfChangeOfCantDeficiencyOverTime);
        
        /**
         * Unsets the "rateOfChangeOfCantDeficiencyOverTime" attribute
         */
        void unsetRateOfChangeOfCantDeficiencyOverTime();
        
        /**
         * Gets the "cantGradient" attribute
         */
        double getCantGradient();
        
        /**
         * Gets (as xml) the "cantGradient" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetCantGradient();
        
        /**
         * True if has "cantGradient" attribute
         */
        boolean isSetCantGradient();
        
        /**
         * Sets the "cantGradient" attribute
         */
        void setCantGradient(double cantGradient);
        
        /**
         * Sets (as xml) the "cantGradient" attribute
         */
        void xsetCantGradient(org.apache.xmlbeans.XmlDouble cantGradient);
        
        /**
         * Unsets the "cantGradient" attribute
         */
        void unsetCantGradient();
        
        /**
         * Gets the "speed" attribute
         */
        double getSpeed();
        
        /**
         * Gets (as xml) the "speed" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSpeed();
        
        /**
         * True if has "speed" attribute
         */
        boolean isSetSpeed();
        
        /**
         * Sets the "speed" attribute
         */
        void setSpeed(double speed);
        
        /**
         * Sets (as xml) the "speed" attribute
         */
        void xsetSpeed(org.apache.xmlbeans.XmlDouble speed);
        
        /**
         * Unsets the "speed" attribute
         */
        void unsetSpeed();
        
        /**
         * Gets the "transitionType" attribute
         */
        org.landxml.schema.landXML11.SpiralType.Enum getTransitionType();
        
        /**
         * Gets (as xml) the "transitionType" attribute
         */
        org.landxml.schema.landXML11.SpiralType xgetTransitionType();
        
        /**
         * True if has "transitionType" attribute
         */
        boolean isSetTransitionType();
        
        /**
         * Sets the "transitionType" attribute
         */
        void setTransitionType(org.landxml.schema.landXML11.SpiralType.Enum transitionType);
        
        /**
         * Sets (as xml) the "transitionType" attribute
         */
        void xsetTransitionType(org.landxml.schema.landXML11.SpiralType transitionType);
        
        /**
         * Unsets the "transitionType" attribute
         */
        void unsetTransitionType();
        
        /**
         * Gets the "curvature" attribute
         */
        org.landxml.schema.landXML11.Clockwise.Enum getCurvature();
        
        /**
         * Gets (as xml) the "curvature" attribute
         */
        org.landxml.schema.landXML11.Clockwise xgetCurvature();
        
        /**
         * Sets the "curvature" attribute
         */
        void setCurvature(org.landxml.schema.landXML11.Clockwise.Enum curvature);
        
        /**
         * Sets (as xml) the "curvature" attribute
         */
        void xsetCurvature(org.landxml.schema.landXML11.Clockwise curvature);
        
        /**
         * Gets the "adverse" attribute
         */
        boolean getAdverse();
        
        /**
         * Gets (as xml) the "adverse" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetAdverse();
        
        /**
         * True if has "adverse" attribute
         */
        boolean isSetAdverse();
        
        /**
         * Sets the "adverse" attribute
         */
        void setAdverse(boolean adverse);
        
        /**
         * Sets (as xml) the "adverse" attribute
         */
        void xsetAdverse(org.apache.xmlbeans.XmlBoolean adverse);
        
        /**
         * Unsets the "adverse" attribute
         */
        void unsetAdverse();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.CantStationDocument.CantStation newInstance() {
              return (org.landxml.schema.landXML11.CantStationDocument.CantStation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.CantStationDocument.CantStation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.CantStationDocument.CantStation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.CantStationDocument newInstance() {
          return (org.landxml.schema.landXML11.CantStationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.CantStationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.CantStationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.CantStationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CantStationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.CantStationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CantStationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.CantStationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CantStationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.CantStationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CantStationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.CantStationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CantStationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.CantStationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CantStationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.CantStationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CantStationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.CantStationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CantStationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.CantStationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CantStationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.CantStationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CantStationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.CantStationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CantStationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.CantStationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CantStationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.CantStationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CantStationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.CantStationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CantStationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CantStationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CantStationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CantStationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CantStationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
