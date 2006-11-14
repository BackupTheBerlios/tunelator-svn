/*
 * An XML document type.
 * Localname: ProfAlign
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ProfAlignDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one ProfAlign(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface ProfAlignDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProfAlignDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("profalign916edoctype");
    
    /**
     * Gets the "ProfAlign" element
     */
    org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign getProfAlign();
    
    /**
     * Sets the "ProfAlign" element
     */
    void setProfAlign(org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign profAlign);
    
    /**
     * Appends and returns a new empty "ProfAlign" element
     */
    org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign addNewProfAlign();
    
    /**
     * An XML ProfAlign(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface ProfAlign extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProfAlign.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("profalign3ce6elemtype");
        
        /**
         * Gets a List of "PVI" elements
         */
        java.util.List<org.landxml.schema.landXML11.PVIDocument.PVI> getPVIList();
        
        /**
         * Gets array of all "PVI" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.PVIDocument.PVI[] getPVIArray();
        
        /**
         * Gets ith "PVI" element
         */
        org.landxml.schema.landXML11.PVIDocument.PVI getPVIArray(int i);
        
        /**
         * Returns number of "PVI" element
         */
        int sizeOfPVIArray();
        
        /**
         * Sets array of all "PVI" element
         */
        void setPVIArray(org.landxml.schema.landXML11.PVIDocument.PVI[] pviArray);
        
        /**
         * Sets ith "PVI" element
         */
        void setPVIArray(int i, org.landxml.schema.landXML11.PVIDocument.PVI pvi);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PVI" element
         */
        org.landxml.schema.landXML11.PVIDocument.PVI insertNewPVI(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PVI" element
         */
        org.landxml.schema.landXML11.PVIDocument.PVI addNewPVI();
        
        /**
         * Removes the ith "PVI" element
         */
        void removePVI(int i);
        
        /**
         * Gets a List of "ParaCurve" elements
         */
        java.util.List<org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve> getParaCurveList();
        
        /**
         * Gets array of all "ParaCurve" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve[] getParaCurveArray();
        
        /**
         * Gets ith "ParaCurve" element
         */
        org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve getParaCurveArray(int i);
        
        /**
         * Returns number of "ParaCurve" element
         */
        int sizeOfParaCurveArray();
        
        /**
         * Sets array of all "ParaCurve" element
         */
        void setParaCurveArray(org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve[] paraCurveArray);
        
        /**
         * Sets ith "ParaCurve" element
         */
        void setParaCurveArray(int i, org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve paraCurve);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ParaCurve" element
         */
        org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve insertNewParaCurve(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ParaCurve" element
         */
        org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve addNewParaCurve();
        
        /**
         * Removes the ith "ParaCurve" element
         */
        void removeParaCurve(int i);
        
        /**
         * Gets a List of "UnsymParaCurve" elements
         */
        java.util.List<org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve> getUnsymParaCurveList();
        
        /**
         * Gets array of all "UnsymParaCurve" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve[] getUnsymParaCurveArray();
        
        /**
         * Gets ith "UnsymParaCurve" element
         */
        org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve getUnsymParaCurveArray(int i);
        
        /**
         * Returns number of "UnsymParaCurve" element
         */
        int sizeOfUnsymParaCurveArray();
        
        /**
         * Sets array of all "UnsymParaCurve" element
         */
        void setUnsymParaCurveArray(org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve[] unsymParaCurveArray);
        
        /**
         * Sets ith "UnsymParaCurve" element
         */
        void setUnsymParaCurveArray(int i, org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve unsymParaCurve);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "UnsymParaCurve" element
         */
        org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve insertNewUnsymParaCurve(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "UnsymParaCurve" element
         */
        org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve addNewUnsymParaCurve();
        
        /**
         * Removes the ith "UnsymParaCurve" element
         */
        void removeUnsymParaCurve(int i);
        
        /**
         * Gets a List of "CircCurve" elements
         */
        java.util.List<org.landxml.schema.landXML11.CircCurveDocument.CircCurve> getCircCurveList();
        
        /**
         * Gets array of all "CircCurve" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.CircCurveDocument.CircCurve[] getCircCurveArray();
        
        /**
         * Gets ith "CircCurve" element
         */
        org.landxml.schema.landXML11.CircCurveDocument.CircCurve getCircCurveArray(int i);
        
        /**
         * Returns number of "CircCurve" element
         */
        int sizeOfCircCurveArray();
        
        /**
         * Sets array of all "CircCurve" element
         */
        void setCircCurveArray(org.landxml.schema.landXML11.CircCurveDocument.CircCurve[] circCurveArray);
        
        /**
         * Sets ith "CircCurve" element
         */
        void setCircCurveArray(int i, org.landxml.schema.landXML11.CircCurveDocument.CircCurve circCurve);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CircCurve" element
         */
        org.landxml.schema.landXML11.CircCurveDocument.CircCurve insertNewCircCurve(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CircCurve" element
         */
        org.landxml.schema.landXML11.CircCurveDocument.CircCurve addNewCircCurve();
        
        /**
         * Removes the ith "CircCurve" element
         */
        void removeCircCurve(int i);
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign newInstance() {
              return (org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.ProfAlignDocument newInstance() {
          return (org.landxml.schema.landXML11.ProfAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.ProfAlignDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.ProfAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.ProfAlignDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ProfAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.ProfAlignDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ProfAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.ProfAlignDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ProfAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.ProfAlignDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ProfAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.ProfAlignDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ProfAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.ProfAlignDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ProfAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.ProfAlignDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ProfAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.ProfAlignDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ProfAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.ProfAlignDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ProfAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.ProfAlignDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ProfAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.ProfAlignDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ProfAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.ProfAlignDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ProfAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.ProfAlignDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ProfAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.ProfAlignDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ProfAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ProfAlignDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ProfAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ProfAlignDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ProfAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
