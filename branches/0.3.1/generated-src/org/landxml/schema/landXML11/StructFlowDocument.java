/*
 * An XML document type.
 * Localname: StructFlow
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.StructFlowDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one StructFlow(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface StructFlowDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StructFlowDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("structflow9377doctype");
    
    /**
     * Gets the "StructFlow" element
     */
    org.landxml.schema.landXML11.StructFlowDocument.StructFlow getStructFlow();
    
    /**
     * Sets the "StructFlow" element
     */
    void setStructFlow(org.landxml.schema.landXML11.StructFlowDocument.StructFlow structFlow);
    
    /**
     * Appends and returns a new empty "StructFlow" element
     */
    org.landxml.schema.landXML11.StructFlowDocument.StructFlow addNewStructFlow();
    
    /**
     * An XML StructFlow(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface StructFlow extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StructFlow.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("structflow9f38elemtype");
        
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
         * Gets the "lossIn" attribute
         */
        double getLossIn();
        
        /**
         * Gets (as xml) the "lossIn" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetLossIn();
        
        /**
         * Sets the "lossIn" attribute
         */
        void setLossIn(double lossIn);
        
        /**
         * Sets (as xml) the "lossIn" attribute
         */
        void xsetLossIn(org.apache.xmlbeans.XmlDouble lossIn);
        
        /**
         * Gets the "lossOut" attribute
         */
        double getLossOut();
        
        /**
         * Gets (as xml) the "lossOut" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetLossOut();
        
        /**
         * Sets the "lossOut" attribute
         */
        void setLossOut(double lossOut);
        
        /**
         * Sets (as xml) the "lossOut" attribute
         */
        void xsetLossOut(org.apache.xmlbeans.XmlDouble lossOut);
        
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
         * Gets the "hglIn" attribute
         */
        double getHglIn();
        
        /**
         * Gets (as xml) the "hglIn" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetHglIn();
        
        /**
         * True if has "hglIn" attribute
         */
        boolean isSetHglIn();
        
        /**
         * Sets the "hglIn" attribute
         */
        void setHglIn(double hglIn);
        
        /**
         * Sets (as xml) the "hglIn" attribute
         */
        void xsetHglIn(org.apache.xmlbeans.XmlDouble hglIn);
        
        /**
         * Unsets the "hglIn" attribute
         */
        void unsetHglIn();
        
        /**
         * Gets the "hglOut" attribute
         */
        double getHglOut();
        
        /**
         * Gets (as xml) the "hglOut" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetHglOut();
        
        /**
         * True if has "hglOut" attribute
         */
        boolean isSetHglOut();
        
        /**
         * Sets the "hglOut" attribute
         */
        void setHglOut(double hglOut);
        
        /**
         * Sets (as xml) the "hglOut" attribute
         */
        void xsetHglOut(org.apache.xmlbeans.XmlDouble hglOut);
        
        /**
         * Unsets the "hglOut" attribute
         */
        void unsetHglOut();
        
        /**
         * Gets the "localDepression" attribute
         */
        double getLocalDepression();
        
        /**
         * Gets (as xml) the "localDepression" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetLocalDepression();
        
        /**
         * True if has "localDepression" attribute
         */
        boolean isSetLocalDepression();
        
        /**
         * Sets the "localDepression" attribute
         */
        void setLocalDepression(double localDepression);
        
        /**
         * Sets (as xml) the "localDepression" attribute
         */
        void xsetLocalDepression(org.apache.xmlbeans.XmlDouble localDepression);
        
        /**
         * Unsets the "localDepression" attribute
         */
        void unsetLocalDepression();
        
        /**
         * Gets the "slopeSurf" attribute
         */
        double getSlopeSurf();
        
        /**
         * Gets (as xml) the "slopeSurf" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSlopeSurf();
        
        /**
         * True if has "slopeSurf" attribute
         */
        boolean isSetSlopeSurf();
        
        /**
         * Sets the "slopeSurf" attribute
         */
        void setSlopeSurf(double slopeSurf);
        
        /**
         * Sets (as xml) the "slopeSurf" attribute
         */
        void xsetSlopeSurf(org.apache.xmlbeans.XmlDouble slopeSurf);
        
        /**
         * Unsets the "slopeSurf" attribute
         */
        void unsetSlopeSurf();
        
        /**
         * Gets the "slopeGutter" attribute
         */
        double getSlopeGutter();
        
        /**
         * Gets (as xml) the "slopeGutter" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSlopeGutter();
        
        /**
         * True if has "slopeGutter" attribute
         */
        boolean isSetSlopeGutter();
        
        /**
         * Sets the "slopeGutter" attribute
         */
        void setSlopeGutter(double slopeGutter);
        
        /**
         * Sets (as xml) the "slopeGutter" attribute
         */
        void xsetSlopeGutter(org.apache.xmlbeans.XmlDouble slopeGutter);
        
        /**
         * Unsets the "slopeGutter" attribute
         */
        void unsetSlopeGutter();
        
        /**
         * Gets the "widthGutter" attribute
         */
        double getWidthGutter();
        
        /**
         * Gets (as xml) the "widthGutter" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetWidthGutter();
        
        /**
         * True if has "widthGutter" attribute
         */
        boolean isSetWidthGutter();
        
        /**
         * Sets the "widthGutter" attribute
         */
        void setWidthGutter(double widthGutter);
        
        /**
         * Sets (as xml) the "widthGutter" attribute
         */
        void xsetWidthGutter(org.apache.xmlbeans.XmlDouble widthGutter);
        
        /**
         * Unsets the "widthGutter" attribute
         */
        void unsetWidthGutter();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.StructFlowDocument.StructFlow newInstance() {
              return (org.landxml.schema.landXML11.StructFlowDocument.StructFlow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.StructFlowDocument.StructFlow newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.StructFlowDocument.StructFlow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.StructFlowDocument newInstance() {
          return (org.landxml.schema.landXML11.StructFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.StructFlowDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.StructFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.StructFlowDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.StructFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.StructFlowDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.StructFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.StructFlowDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.StructFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.StructFlowDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.StructFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.StructFlowDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.StructFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.StructFlowDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.StructFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.StructFlowDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.StructFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.StructFlowDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.StructFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.StructFlowDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.StructFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.StructFlowDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.StructFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.StructFlowDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.StructFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.StructFlowDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.StructFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.StructFlowDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.StructFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.StructFlowDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.StructFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.StructFlowDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.StructFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.StructFlowDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.StructFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
