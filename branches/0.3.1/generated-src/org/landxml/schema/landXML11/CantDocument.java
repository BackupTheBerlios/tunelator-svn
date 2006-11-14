/*
 * An XML document type.
 * Localname: Cant
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CantDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one Cant(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface CantDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CantDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("cant34f8doctype");
    
    /**
     * Gets the "Cant" element
     */
    org.landxml.schema.landXML11.CantDocument.Cant getCant();
    
    /**
     * Sets the "Cant" element
     */
    void setCant(org.landxml.schema.landXML11.CantDocument.Cant cant);
    
    /**
     * Appends and returns a new empty "Cant" element
     */
    org.landxml.schema.landXML11.CantDocument.Cant addNewCant();
    
    /**
     * An XML Cant(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface Cant extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Cant.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("cantf598elemtype");
        
        /**
         * Gets a List of "CantStation" elements
         */
        java.util.List<org.landxml.schema.landXML11.CantStationDocument.CantStation> getCantStationList();
        
        /**
         * Gets array of all "CantStation" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.CantStationDocument.CantStation[] getCantStationArray();
        
        /**
         * Gets ith "CantStation" element
         */
        org.landxml.schema.landXML11.CantStationDocument.CantStation getCantStationArray(int i);
        
        /**
         * Returns number of "CantStation" element
         */
        int sizeOfCantStationArray();
        
        /**
         * Sets array of all "CantStation" element
         */
        void setCantStationArray(org.landxml.schema.landXML11.CantStationDocument.CantStation[] cantStationArray);
        
        /**
         * Sets ith "CantStation" element
         */
        void setCantStationArray(int i, org.landxml.schema.landXML11.CantStationDocument.CantStation cantStation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CantStation" element
         */
        org.landxml.schema.landXML11.CantStationDocument.CantStation insertNewCantStation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CantStation" element
         */
        org.landxml.schema.landXML11.CantStationDocument.CantStation addNewCantStation();
        
        /**
         * Removes the ith "CantStation" element
         */
        void removeCantStation(int i);
        
        /**
         * Gets a List of "SpeedStation" elements
         */
        java.util.List<org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation> getSpeedStationList();
        
        /**
         * Gets array of all "SpeedStation" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation[] getSpeedStationArray();
        
        /**
         * Gets ith "SpeedStation" element
         */
        org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation getSpeedStationArray(int i);
        
        /**
         * Returns number of "SpeedStation" element
         */
        int sizeOfSpeedStationArray();
        
        /**
         * Sets array of all "SpeedStation" element
         */
        void setSpeedStationArray(org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation[] speedStationArray);
        
        /**
         * Sets ith "SpeedStation" element
         */
        void setSpeedStationArray(int i, org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation speedStation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SpeedStation" element
         */
        org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation insertNewSpeedStation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SpeedStation" element
         */
        org.landxml.schema.landXML11.SpeedStationDocument.SpeedStation addNewSpeedStation();
        
        /**
         * Removes the ith "SpeedStation" element
         */
        void removeSpeedStation(int i);
        
        /**
         * Gets a List of "Feature" elements
         */
        java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList();
        
        /**
         * Gets array of all "Feature" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.FeatureDocument.Feature[] getFeatureArray();
        
        /**
         * Gets ith "Feature" element
         */
        org.landxml.schema.landXML11.FeatureDocument.Feature getFeatureArray(int i);
        
        /**
         * Returns number of "Feature" element
         */
        int sizeOfFeatureArray();
        
        /**
         * Sets array of all "Feature" element
         */
        void setFeatureArray(org.landxml.schema.landXML11.FeatureDocument.Feature[] featureArray);
        
        /**
         * Sets ith "Feature" element
         */
        void setFeatureArray(int i, org.landxml.schema.landXML11.FeatureDocument.Feature feature);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Feature" element
         */
        org.landxml.schema.landXML11.FeatureDocument.Feature insertNewFeature(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Feature" element
         */
        org.landxml.schema.landXML11.FeatureDocument.Feature addNewFeature();
        
        /**
         * Removes the ith "Feature" element
         */
        void removeFeature(int i);
        
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
        org.landxml.schema.landXML11.StateType.Enum getState();
        
        /**
         * Gets (as xml) the "state" attribute
         */
        org.landxml.schema.landXML11.StateType xgetState();
        
        /**
         * True if has "state" attribute
         */
        boolean isSetState();
        
        /**
         * Sets the "state" attribute
         */
        void setState(org.landxml.schema.landXML11.StateType.Enum state);
        
        /**
         * Sets (as xml) the "state" attribute
         */
        void xsetState(org.landxml.schema.landXML11.StateType state);
        
        /**
         * Unsets the "state" attribute
         */
        void unsetState();
        
        /**
         * Gets the "equilibriumConstant" attribute
         */
        double getEquilibriumConstant();
        
        /**
         * Gets (as xml) the "equilibriumConstant" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetEquilibriumConstant();
        
        /**
         * True if has "equilibriumConstant" attribute
         */
        boolean isSetEquilibriumConstant();
        
        /**
         * Sets the "equilibriumConstant" attribute
         */
        void setEquilibriumConstant(double equilibriumConstant);
        
        /**
         * Sets (as xml) the "equilibriumConstant" attribute
         */
        void xsetEquilibriumConstant(org.apache.xmlbeans.XmlDouble equilibriumConstant);
        
        /**
         * Unsets the "equilibriumConstant" attribute
         */
        void unsetEquilibriumConstant();
        
        /**
         * Gets the "appliedCantConstant" attribute
         */
        double getAppliedCantConstant();
        
        /**
         * Gets (as xml) the "appliedCantConstant" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetAppliedCantConstant();
        
        /**
         * True if has "appliedCantConstant" attribute
         */
        boolean isSetAppliedCantConstant();
        
        /**
         * Sets the "appliedCantConstant" attribute
         */
        void setAppliedCantConstant(double appliedCantConstant);
        
        /**
         * Sets (as xml) the "appliedCantConstant" attribute
         */
        void xsetAppliedCantConstant(org.apache.xmlbeans.XmlDouble appliedCantConstant);
        
        /**
         * Unsets the "appliedCantConstant" attribute
         */
        void unsetAppliedCantConstant();
        
        /**
         * Gets the "gauge" attribute
         */
        double getGauge();
        
        /**
         * Gets (as xml) the "gauge" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetGauge();
        
        /**
         * Sets the "gauge" attribute
         */
        void setGauge(double gauge);
        
        /**
         * Sets (as xml) the "gauge" attribute
         */
        void xsetGauge(org.apache.xmlbeans.XmlDouble gauge);
        
        /**
         * Gets the "rotationPoint" attribute
         */
        java.lang.String getRotationPoint();
        
        /**
         * Gets (as xml) the "rotationPoint" attribute
         */
        org.apache.xmlbeans.XmlString xgetRotationPoint();
        
        /**
         * True if has "rotationPoint" attribute
         */
        boolean isSetRotationPoint();
        
        /**
         * Sets the "rotationPoint" attribute
         */
        void setRotationPoint(java.lang.String rotationPoint);
        
        /**
         * Sets (as xml) the "rotationPoint" attribute
         */
        void xsetRotationPoint(org.apache.xmlbeans.XmlString rotationPoint);
        
        /**
         * Unsets the "rotationPoint" attribute
         */
        void unsetRotationPoint();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.CantDocument.Cant newInstance() {
              return (org.landxml.schema.landXML11.CantDocument.Cant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.CantDocument.Cant newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.CantDocument.Cant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.CantDocument newInstance() {
          return (org.landxml.schema.landXML11.CantDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.CantDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.CantDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.CantDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CantDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.CantDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CantDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.CantDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CantDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.CantDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CantDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.CantDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CantDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.CantDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CantDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.CantDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CantDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.CantDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CantDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.CantDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CantDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.CantDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CantDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.CantDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CantDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.CantDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CantDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.CantDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CantDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.CantDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CantDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CantDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CantDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CantDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CantDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
