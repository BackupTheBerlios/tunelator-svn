/*
 * An XML document type.
 * Localname: Pipe
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PipeDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one Pipe(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface PipeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PipeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("pipecf82doctype");
    
    /**
     * Gets the "Pipe" element
     */
    org.landxml.schema.landXML11.PipeDocument.Pipe getPipe();
    
    /**
     * Sets the "Pipe" element
     */
    void setPipe(org.landxml.schema.landXML11.PipeDocument.Pipe pipe);
    
    /**
     * Appends and returns a new empty "Pipe" element
     */
    org.landxml.schema.landXML11.PipeDocument.Pipe addNewPipe();
    
    /**
     * An XML Pipe(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface Pipe extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pipe.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("pipee658elemtype");
        
        /**
         * Gets the "CircPipe" element
         */
        org.landxml.schema.landXML11.CircPipeDocument.CircPipe getCircPipe();
        
        /**
         * True if has "CircPipe" element
         */
        boolean isSetCircPipe();
        
        /**
         * Sets the "CircPipe" element
         */
        void setCircPipe(org.landxml.schema.landXML11.CircPipeDocument.CircPipe circPipe);
        
        /**
         * Appends and returns a new empty "CircPipe" element
         */
        org.landxml.schema.landXML11.CircPipeDocument.CircPipe addNewCircPipe();
        
        /**
         * Unsets the "CircPipe" element
         */
        void unsetCircPipe();
        
        /**
         * Gets the "EggPipe" element
         */
        org.landxml.schema.landXML11.EggPipeDocument.EggPipe getEggPipe();
        
        /**
         * True if has "EggPipe" element
         */
        boolean isSetEggPipe();
        
        /**
         * Sets the "EggPipe" element
         */
        void setEggPipe(org.landxml.schema.landXML11.EggPipeDocument.EggPipe eggPipe);
        
        /**
         * Appends and returns a new empty "EggPipe" element
         */
        org.landxml.schema.landXML11.EggPipeDocument.EggPipe addNewEggPipe();
        
        /**
         * Unsets the "EggPipe" element
         */
        void unsetEggPipe();
        
        /**
         * Gets the "ElliPipe" element
         */
        org.landxml.schema.landXML11.ElliPipeDocument.ElliPipe getElliPipe();
        
        /**
         * True if has "ElliPipe" element
         */
        boolean isSetElliPipe();
        
        /**
         * Sets the "ElliPipe" element
         */
        void setElliPipe(org.landxml.schema.landXML11.ElliPipeDocument.ElliPipe elliPipe);
        
        /**
         * Appends and returns a new empty "ElliPipe" element
         */
        org.landxml.schema.landXML11.ElliPipeDocument.ElliPipe addNewElliPipe();
        
        /**
         * Unsets the "ElliPipe" element
         */
        void unsetElliPipe();
        
        /**
         * Gets the "RectPipe" element
         */
        org.landxml.schema.landXML11.RectPipeDocument.RectPipe getRectPipe();
        
        /**
         * True if has "RectPipe" element
         */
        boolean isSetRectPipe();
        
        /**
         * Sets the "RectPipe" element
         */
        void setRectPipe(org.landxml.schema.landXML11.RectPipeDocument.RectPipe rectPipe);
        
        /**
         * Appends and returns a new empty "RectPipe" element
         */
        org.landxml.schema.landXML11.RectPipeDocument.RectPipe addNewRectPipe();
        
        /**
         * Unsets the "RectPipe" element
         */
        void unsetRectPipe();
        
        /**
         * Gets the "Channel" element
         */
        org.landxml.schema.landXML11.ChannelDocument.Channel getChannel();
        
        /**
         * True if has "Channel" element
         */
        boolean isSetChannel();
        
        /**
         * Sets the "Channel" element
         */
        void setChannel(org.landxml.schema.landXML11.ChannelDocument.Channel channel);
        
        /**
         * Appends and returns a new empty "Channel" element
         */
        org.landxml.schema.landXML11.ChannelDocument.Channel addNewChannel();
        
        /**
         * Unsets the "Channel" element
         */
        void unsetChannel();
        
        /**
         * Gets the "PipeFlow" element
         */
        org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow getPipeFlow();
        
        /**
         * True if has "PipeFlow" element
         */
        boolean isSetPipeFlow();
        
        /**
         * Sets the "PipeFlow" element
         */
        void setPipeFlow(org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow pipeFlow);
        
        /**
         * Appends and returns a new empty "PipeFlow" element
         */
        org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow addNewPipeFlow();
        
        /**
         * Unsets the "PipeFlow" element
         */
        void unsetPipeFlow();
        
        /**
         * Gets the "Center" element
         */
        org.landxml.schema.landXML11.PointType getCenter();
        
        /**
         * True if has "Center" element
         */
        boolean isSetCenter();
        
        /**
         * Sets the "Center" element
         */
        void setCenter(org.landxml.schema.landXML11.PointType center);
        
        /**
         * Appends and returns a new empty "Center" element
         */
        org.landxml.schema.landXML11.PointType addNewCenter();
        
        /**
         * Unsets the "Center" element
         */
        void unsetCenter();
        
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
         * Gets the "refEnd" attribute
         */
        java.lang.String getRefEnd();
        
        /**
         * Gets (as xml) the "refEnd" attribute
         */
        org.landxml.schema.landXML11.StructNameRef xgetRefEnd();
        
        /**
         * Sets the "refEnd" attribute
         */
        void setRefEnd(java.lang.String refEnd);
        
        /**
         * Sets (as xml) the "refEnd" attribute
         */
        void xsetRefEnd(org.landxml.schema.landXML11.StructNameRef refEnd);
        
        /**
         * Gets the "refStart" attribute
         */
        java.lang.String getRefStart();
        
        /**
         * Gets (as xml) the "refStart" attribute
         */
        org.landxml.schema.landXML11.StructNameRef xgetRefStart();
        
        /**
         * Sets the "refStart" attribute
         */
        void setRefStart(java.lang.String refStart);
        
        /**
         * Sets (as xml) the "refStart" attribute
         */
        void xsetRefStart(org.landxml.schema.landXML11.StructNameRef refStart);
        
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
         * Gets the "length" attribute
         */
        double getLength();
        
        /**
         * Gets (as xml) the "length" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetLength();
        
        /**
         * True if has "length" attribute
         */
        boolean isSetLength();
        
        /**
         * Sets the "length" attribute
         */
        void setLength(double length);
        
        /**
         * Sets (as xml) the "length" attribute
         */
        void xsetLength(org.apache.xmlbeans.XmlDouble length);
        
        /**
         * Unsets the "length" attribute
         */
        void unsetLength();
        
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
         * Gets the "slope" attribute
         */
        double getSlope();
        
        /**
         * Gets (as xml) the "slope" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSlope();
        
        /**
         * True if has "slope" attribute
         */
        boolean isSetSlope();
        
        /**
         * Sets the "slope" attribute
         */
        void setSlope(double slope);
        
        /**
         * Sets (as xml) the "slope" attribute
         */
        void xsetSlope(org.apache.xmlbeans.XmlDouble slope);
        
        /**
         * Unsets the "slope" attribute
         */
        void unsetSlope();
        
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
            public static org.landxml.schema.landXML11.PipeDocument.Pipe newInstance() {
              return (org.landxml.schema.landXML11.PipeDocument.Pipe) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.PipeDocument.Pipe newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.PipeDocument.Pipe) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.PipeDocument newInstance() {
          return (org.landxml.schema.landXML11.PipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.PipeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.PipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.PipeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.PipeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.PipeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.PipeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.PipeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.PipeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.PipeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.PipeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.PipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.PipeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.PipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
