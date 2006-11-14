/*
 * An XML document type.
 * Localname: Struct
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.StructDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one Struct(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface StructDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StructDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("struct66a9doctype");
    
    /**
     * Gets the "Struct" element
     */
    org.landxml.schema.landXML11.StructDocument.Struct getStruct();
    
    /**
     * Sets the "Struct" element
     */
    void setStruct(org.landxml.schema.landXML11.StructDocument.Struct struct);
    
    /**
     * Appends and returns a new empty "Struct" element
     */
    org.landxml.schema.landXML11.StructDocument.Struct addNewStruct();
    
    /**
     * An XML Struct(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface Struct extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Struct.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("struct6878elemtype");
        
        /**
         * Gets the "Center" element
         */
        org.landxml.schema.landXML11.PointType getCenter();
        
        /**
         * Sets the "Center" element
         */
        void setCenter(org.landxml.schema.landXML11.PointType center);
        
        /**
         * Appends and returns a new empty "Center" element
         */
        org.landxml.schema.landXML11.PointType addNewCenter();
        
        /**
         * Gets the "CircStruct" element
         */
        org.landxml.schema.landXML11.CircStructDocument.CircStruct getCircStruct();
        
        /**
         * True if has "CircStruct" element
         */
        boolean isSetCircStruct();
        
        /**
         * Sets the "CircStruct" element
         */
        void setCircStruct(org.landxml.schema.landXML11.CircStructDocument.CircStruct circStruct);
        
        /**
         * Appends and returns a new empty "CircStruct" element
         */
        org.landxml.schema.landXML11.CircStructDocument.CircStruct addNewCircStruct();
        
        /**
         * Unsets the "CircStruct" element
         */
        void unsetCircStruct();
        
        /**
         * Gets the "RectStruct" element
         */
        org.landxml.schema.landXML11.RectStructDocument.RectStruct getRectStruct();
        
        /**
         * True if has "RectStruct" element
         */
        boolean isSetRectStruct();
        
        /**
         * Sets the "RectStruct" element
         */
        void setRectStruct(org.landxml.schema.landXML11.RectStructDocument.RectStruct rectStruct);
        
        /**
         * Appends and returns a new empty "RectStruct" element
         */
        org.landxml.schema.landXML11.RectStructDocument.RectStruct addNewRectStruct();
        
        /**
         * Unsets the "RectStruct" element
         */
        void unsetRectStruct();
        
        /**
         * Gets the "InletStruct" element
         */
        org.landxml.schema.landXML11.InletStructDocument.InletStruct getInletStruct();
        
        /**
         * True if has "InletStruct" element
         */
        boolean isSetInletStruct();
        
        /**
         * Sets the "InletStruct" element
         */
        void setInletStruct(org.landxml.schema.landXML11.InletStructDocument.InletStruct inletStruct);
        
        /**
         * Appends and returns a new empty "InletStruct" element
         */
        org.landxml.schema.landXML11.InletStructDocument.InletStruct addNewInletStruct();
        
        /**
         * Unsets the "InletStruct" element
         */
        void unsetInletStruct();
        
        /**
         * Gets the "OutletStruct" element
         */
        org.landxml.schema.landXML11.OutletStructDocument.OutletStruct getOutletStruct();
        
        /**
         * True if has "OutletStruct" element
         */
        boolean isSetOutletStruct();
        
        /**
         * Sets the "OutletStruct" element
         */
        void setOutletStruct(org.landxml.schema.landXML11.OutletStructDocument.OutletStruct outletStruct);
        
        /**
         * Appends and returns a new empty "OutletStruct" element
         */
        org.landxml.schema.landXML11.OutletStructDocument.OutletStruct addNewOutletStruct();
        
        /**
         * Unsets the "OutletStruct" element
         */
        void unsetOutletStruct();
        
        /**
         * Gets the "Connection" element
         */
        org.landxml.schema.landXML11.ConnectionDocument.Connection getConnection();
        
        /**
         * True if has "Connection" element
         */
        boolean isSetConnection();
        
        /**
         * Sets the "Connection" element
         */
        void setConnection(org.landxml.schema.landXML11.ConnectionDocument.Connection connection);
        
        /**
         * Appends and returns a new empty "Connection" element
         */
        org.landxml.schema.landXML11.ConnectionDocument.Connection addNewConnection();
        
        /**
         * Unsets the "Connection" element
         */
        void unsetConnection();
        
        /**
         * Gets a List of "Invert" elements
         */
        java.util.List<org.landxml.schema.landXML11.InvertDocument.Invert> getInvertList();
        
        /**
         * Gets array of all "Invert" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.InvertDocument.Invert[] getInvertArray();
        
        /**
         * Gets ith "Invert" element
         */
        org.landxml.schema.landXML11.InvertDocument.Invert getInvertArray(int i);
        
        /**
         * Returns number of "Invert" element
         */
        int sizeOfInvertArray();
        
        /**
         * Sets array of all "Invert" element
         */
        void setInvertArray(org.landxml.schema.landXML11.InvertDocument.Invert[] invertArray);
        
        /**
         * Sets ith "Invert" element
         */
        void setInvertArray(int i, org.landxml.schema.landXML11.InvertDocument.Invert invert);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Invert" element
         */
        org.landxml.schema.landXML11.InvertDocument.Invert insertNewInvert(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Invert" element
         */
        org.landxml.schema.landXML11.InvertDocument.Invert addNewInvert();
        
        /**
         * Removes the ith "Invert" element
         */
        void removeInvert(int i);
        
        /**
         * Gets the "StructFlow" element
         */
        org.landxml.schema.landXML11.StructFlowDocument.StructFlow getStructFlow();
        
        /**
         * True if has "StructFlow" element
         */
        boolean isSetStructFlow();
        
        /**
         * Sets the "StructFlow" element
         */
        void setStructFlow(org.landxml.schema.landXML11.StructFlowDocument.StructFlow structFlow);
        
        /**
         * Appends and returns a new empty "StructFlow" element
         */
        org.landxml.schema.landXML11.StructFlowDocument.StructFlow addNewStructFlow();
        
        /**
         * Unsets the "StructFlow" element
         */
        void unsetStructFlow();
        
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
         * Gets the "elevRim" attribute
         */
        double getElevRim();
        
        /**
         * Gets (as xml) the "elevRim" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetElevRim();
        
        /**
         * True if has "elevRim" attribute
         */
        boolean isSetElevRim();
        
        /**
         * Sets the "elevRim" attribute
         */
        void setElevRim(double elevRim);
        
        /**
         * Sets (as xml) the "elevRim" attribute
         */
        void xsetElevRim(org.apache.xmlbeans.XmlDouble elevRim);
        
        /**
         * Unsets the "elevRim" attribute
         */
        void unsetElevRim();
        
        /**
         * Gets the "elevSump" attribute
         */
        double getElevSump();
        
        /**
         * Gets (as xml) the "elevSump" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetElevSump();
        
        /**
         * True if has "elevSump" attribute
         */
        boolean isSetElevSump();
        
        /**
         * Sets the "elevSump" attribute
         */
        void setElevSump(double elevSump);
        
        /**
         * Sets (as xml) the "elevSump" attribute
         */
        void xsetElevSump(org.apache.xmlbeans.XmlDouble elevSump);
        
        /**
         * Unsets the "elevSump" attribute
         */
        void unsetElevSump();
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.StructDocument.Struct newInstance() {
              return (org.landxml.schema.landXML11.StructDocument.Struct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.StructDocument.Struct newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.StructDocument.Struct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.StructDocument newInstance() {
          return (org.landxml.schema.landXML11.StructDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.StructDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.StructDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.StructDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.StructDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.StructDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.StructDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.StructDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.StructDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.StructDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.StructDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.StructDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.StructDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.StructDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.StructDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.StructDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.StructDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.StructDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.StructDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.StructDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.StructDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.StructDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.StructDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.StructDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.StructDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.StructDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.StructDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.StructDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.StructDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.StructDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.StructDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.StructDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.StructDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.StructDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.StructDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
