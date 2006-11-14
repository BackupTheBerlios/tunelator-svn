/*
 * An XML document type.
 * Localname: PipeNetwork
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PipeNetworkDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one PipeNetwork(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface PipeNetworkDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PipeNetworkDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("pipenetwork8822doctype");
    
    /**
     * Gets the "PipeNetwork" element
     */
    org.landxml.schema.landXML11.PipeNetworkDocument.PipeNetwork getPipeNetwork();
    
    /**
     * Sets the "PipeNetwork" element
     */
    void setPipeNetwork(org.landxml.schema.landXML11.PipeNetworkDocument.PipeNetwork pipeNetwork);
    
    /**
     * Appends and returns a new empty "PipeNetwork" element
     */
    org.landxml.schema.landXML11.PipeNetworkDocument.PipeNetwork addNewPipeNetwork();
    
    /**
     * An XML PipeNetwork(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface PipeNetwork extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PipeNetwork.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("pipenetwork750eelemtype");
        
        /**
         * Gets the "Structs" element
         */
        org.landxml.schema.landXML11.StructsDocument.Structs getStructs();
        
        /**
         * Sets the "Structs" element
         */
        void setStructs(org.landxml.schema.landXML11.StructsDocument.Structs structs);
        
        /**
         * Appends and returns a new empty "Structs" element
         */
        org.landxml.schema.landXML11.StructsDocument.Structs addNewStructs();
        
        /**
         * Gets the "Pipes" element
         */
        org.landxml.schema.landXML11.PipesDocument.Pipes getPipes();
        
        /**
         * Sets the "Pipes" element
         */
        void setPipes(org.landxml.schema.landXML11.PipesDocument.Pipes pipes);
        
        /**
         * Appends and returns a new empty "Pipes" element
         */
        org.landxml.schema.landXML11.PipesDocument.Pipes addNewPipes();
        
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
         * Gets the "pipeNetType" attribute
         */
        org.landxml.schema.landXML11.PipeNetworkType.Enum getPipeNetType();
        
        /**
         * Gets (as xml) the "pipeNetType" attribute
         */
        org.landxml.schema.landXML11.PipeNetworkType xgetPipeNetType();
        
        /**
         * Sets the "pipeNetType" attribute
         */
        void setPipeNetType(org.landxml.schema.landXML11.PipeNetworkType.Enum pipeNetType);
        
        /**
         * Sets (as xml) the "pipeNetType" attribute
         */
        void xsetPipeNetType(org.landxml.schema.landXML11.PipeNetworkType pipeNetType);
        
        /**
         * Gets the "alignmentRef" attribute
         */
        java.lang.String getAlignmentRef();
        
        /**
         * Gets (as xml) the "alignmentRef" attribute
         */
        org.landxml.schema.landXML11.AlignmentNameRef xgetAlignmentRef();
        
        /**
         * True if has "alignmentRef" attribute
         */
        boolean isSetAlignmentRef();
        
        /**
         * Sets the "alignmentRef" attribute
         */
        void setAlignmentRef(java.lang.String alignmentRef);
        
        /**
         * Sets (as xml) the "alignmentRef" attribute
         */
        void xsetAlignmentRef(org.landxml.schema.landXML11.AlignmentNameRef alignmentRef);
        
        /**
         * Unsets the "alignmentRef" attribute
         */
        void unsetAlignmentRef();
        
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
            public static org.landxml.schema.landXML11.PipeNetworkDocument.PipeNetwork newInstance() {
              return (org.landxml.schema.landXML11.PipeNetworkDocument.PipeNetwork) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.PipeNetworkDocument.PipeNetwork newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.PipeNetworkDocument.PipeNetwork) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.PipeNetworkDocument newInstance() {
          return (org.landxml.schema.landXML11.PipeNetworkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.PipeNetworkDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.PipeNetworkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.PipeNetworkDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PipeNetworkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeNetworkDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PipeNetworkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.PipeNetworkDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeNetworkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeNetworkDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeNetworkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.PipeNetworkDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeNetworkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeNetworkDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeNetworkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.PipeNetworkDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeNetworkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeNetworkDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeNetworkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.PipeNetworkDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeNetworkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeNetworkDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeNetworkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.PipeNetworkDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PipeNetworkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeNetworkDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PipeNetworkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.PipeNetworkDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PipeNetworkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeNetworkDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PipeNetworkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.PipeNetworkDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.PipeNetworkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.PipeNetworkDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.PipeNetworkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
