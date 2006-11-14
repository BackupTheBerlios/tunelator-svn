/*
 * An XML document type.
 * Localname: PipeFlow
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PipeFlowDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one PipeFlow(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface PipeFlowDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PipeFlowDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("pipeflowe7d0doctype");
    
    /**
     * Gets the "PipeFlow" element
     */
    org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow getPipeFlow();
    
    /**
     * Sets the "PipeFlow" element
     */
    void setPipeFlow(org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow pipeFlow);
    
    /**
     * Appends and returns a new empty "PipeFlow" element
     */
    org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow addNewPipeFlow();
    
    /**
     * An XML PipeFlow(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface PipeFlow extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PipeFlow.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("pipeflowa618elemtype");
        
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
         * Gets the "flowIn" attribute
         */
        double getFlowIn();
        
        /**
         * Gets (as xml) the "flowIn" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetFlowIn();
        
        /**
         * Sets the "flowIn" attribute
         */
        void setFlowIn(double flowIn);
        
        /**
         * Sets (as xml) the "flowIn" attribute
         */
        void xsetFlowIn(org.apache.xmlbeans.XmlDouble flowIn);
        
        /**
         * Gets the "areaCatchment" attribute
         */
        double getAreaCatchment();
        
        /**
         * Gets (as xml) the "areaCatchment" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetAreaCatchment();
        
        /**
         * True if has "areaCatchment" attribute
         */
        boolean isSetAreaCatchment();
        
        /**
         * Sets the "areaCatchment" attribute
         */
        void setAreaCatchment(double areaCatchment);
        
        /**
         * Sets (as xml) the "areaCatchment" attribute
         */
        void xsetAreaCatchment(org.apache.xmlbeans.XmlDouble areaCatchment);
        
        /**
         * Unsets the "areaCatchment" attribute
         */
        void unsetAreaCatchment();
        
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
         * Gets the "depthCritical" attribute
         */
        double getDepthCritical();
        
        /**
         * Gets (as xml) the "depthCritical" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetDepthCritical();
        
        /**
         * True if has "depthCritical" attribute
         */
        boolean isSetDepthCritical();
        
        /**
         * Sets the "depthCritical" attribute
         */
        void setDepthCritical(double depthCritical);
        
        /**
         * Sets (as xml) the "depthCritical" attribute
         */
        void xsetDepthCritical(org.apache.xmlbeans.XmlDouble depthCritical);
        
        /**
         * Unsets the "depthCritical" attribute
         */
        void unsetDepthCritical();
        
        /**
         * Gets the "hglDown" attribute
         */
        double getHglDown();
        
        /**
         * Gets (as xml) the "hglDown" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetHglDown();
        
        /**
         * True if has "hglDown" attribute
         */
        boolean isSetHglDown();
        
        /**
         * Sets the "hglDown" attribute
         */
        void setHglDown(double hglDown);
        
        /**
         * Sets (as xml) the "hglDown" attribute
         */
        void xsetHglDown(org.apache.xmlbeans.XmlDouble hglDown);
        
        /**
         * Unsets the "hglDown" attribute
         */
        void unsetHglDown();
        
        /**
         * Gets the "hglUp" attribute
         */
        double getHglUp();
        
        /**
         * Gets (as xml) the "hglUp" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetHglUp();
        
        /**
         * True if has "hglUp" attribute
         */
        boolean isSetHglUp();
        
        /**
         * Sets the "hglUp" attribute
         */
        void setHglUp(double hglUp);
        
        /**
         * Sets (as xml) the "hglUp" attribute
         */
        void xsetHglUp(org.apache.xmlbeans.XmlDouble hglUp);
        
        /**
         * Unsets the "hglUp" attribute
         */
        void unsetHglUp();
        
        /**
         * Gets the "intensity" attribute
         */
        double getIntensity();
        
        /**
         * Gets (as xml) the "intensity" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetIntensity();
        
        /**
         * True if has "intensity" attribute
         */
        boolean isSetIntensity();
        
        /**
         * Sets the "intensity" attribute
         */
        void setIntensity(double intensity);
        
        /**
         * Sets (as xml) the "intensity" attribute
         */
        void xsetIntensity(org.apache.xmlbeans.XmlDouble intensity);
        
        /**
         * Unsets the "intensity" attribute
         */
        void unsetIntensity();
        
        /**
         * Gets the "runoffCoeff" attribute
         */
        double getRunoffCoeff();
        
        /**
         * Gets (as xml) the "runoffCoeff" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetRunoffCoeff();
        
        /**
         * True if has "runoffCoeff" attribute
         */
        boolean isSetRunoffCoeff();
        
        /**
         * Sets the "runoffCoeff" attribute
         */
        void setRunoffCoeff(double runoffCoeff);
        
        /**
         * Sets (as xml) the "runoffCoeff" attribute
         */
        void xsetRunoffCoeff(org.apache.xmlbeans.XmlDouble runoffCoeff);
        
        /**
         * Unsets the "runoffCoeff" attribute
         */
        void unsetRunoffCoeff();
        
        /**
         * Gets the "slopeCritical" attribute
         */
        double getSlopeCritical();
        
        /**
         * Gets (as xml) the "slopeCritical" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSlopeCritical();
        
        /**
         * True if has "slopeCritical" attribute
         */
        boolean isSetSlopeCritical();
        
        /**
         * Sets the "slopeCritical" attribute
         */
        void setSlopeCritical(double slopeCritical);
        
        /**
         * Sets (as xml) the "slopeCritical" attribute
         */
        void xsetSlopeCritical(org.apache.xmlbeans.XmlDouble slopeCritical);
        
        /**
         * Unsets the "slopeCritical" attribute
         */
        void unsetSlopeCritical();
        
        /**
         * Gets the "timeInlet" attribute
         */
        double getTimeInlet();
        
        /**
         * Gets (as xml) the "timeInlet" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetTimeInlet();
        
        /**
         * True if has "timeInlet" attribute
         */
        boolean isSetTimeInlet();
        
        /**
         * Sets the "timeInlet" attribute
         */
        void setTimeInlet(double timeInlet);
        
        /**
         * Sets (as xml) the "timeInlet" attribute
         */
        void xsetTimeInlet(org.apache.xmlbeans.XmlDouble timeInlet);
        
        /**
         * Unsets the "timeInlet" attribute
         */
        void unsetTimeInlet();
        
        /**
         * Gets the "velocityCritical" attribute
         */
        double getVelocityCritical();
        
        /**
         * Gets (as xml) the "velocityCritical" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetVelocityCritical();
        
        /**
         * True if has "velocityCritical" attribute
         */
        boolean isSetVelocityCritical();
        
        /**
         * Sets the "velocityCritical" attribute
         */
        void setVelocityCritical(double velocityCritical);
        
        /**
         * Sets (as xml) the "velocityCritical" attribute
         */
        void xsetVelocityCritical(org.apache.xmlbeans.XmlDouble velocityCritical);
        
        /**
         * Unsets the "velocityCritical" attribute
         */
        void unsetVelocityCritical();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow newInstance() {
              return (org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.PipeFlowDocument newInstance() {
          return (org.landxml.schema.landXML11.PipeFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.PipeFlowDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.PipeFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.PipeFlowDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PipeFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeFlowDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PipeFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.PipeFlowDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeFlowDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.PipeFlowDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeFlowDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.PipeFlowDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeFlowDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.PipeFlowDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeFlowDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PipeFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.PipeFlowDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PipeFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeFlowDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PipeFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.PipeFlowDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PipeFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.PipeFlowDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PipeFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.PipeFlowDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.PipeFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.PipeFlowDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.PipeFlowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
