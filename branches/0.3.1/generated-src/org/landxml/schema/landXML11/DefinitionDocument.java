/*
 * An XML document type.
 * Localname: Definition
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.DefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one Definition(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface DefinitionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DefinitionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("definition5e27doctype");
    
    /**
     * Gets the "Definition" element
     */
    org.landxml.schema.landXML11.DefinitionDocument.Definition getDefinition();
    
    /**
     * Sets the "Definition" element
     */
    void setDefinition(org.landxml.schema.landXML11.DefinitionDocument.Definition definition);
    
    /**
     * Appends and returns a new empty "Definition" element
     */
    org.landxml.schema.landXML11.DefinitionDocument.Definition addNewDefinition();
    
    /**
     * An XML Definition(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface Definition extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Definition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("definition7d38elemtype");
        
        /**
         * Gets the "Pnts" element
         */
        org.landxml.schema.landXML11.PntsDocument.Pnts getPnts();
        
        /**
         * Sets the "Pnts" element
         */
        void setPnts(org.landxml.schema.landXML11.PntsDocument.Pnts pnts);
        
        /**
         * Appends and returns a new empty "Pnts" element
         */
        org.landxml.schema.landXML11.PntsDocument.Pnts addNewPnts();
        
        /**
         * Gets a List of "Faces" elements
         */
        java.util.List<org.landxml.schema.landXML11.FacesDocument.Faces> getFacesList();
        
        /**
         * Gets array of all "Faces" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.FacesDocument.Faces[] getFacesArray();
        
        /**
         * Gets ith "Faces" element
         */
        org.landxml.schema.landXML11.FacesDocument.Faces getFacesArray(int i);
        
        /**
         * Returns number of "Faces" element
         */
        int sizeOfFacesArray();
        
        /**
         * Sets array of all "Faces" element
         */
        void setFacesArray(org.landxml.schema.landXML11.FacesDocument.Faces[] facesArray);
        
        /**
         * Sets ith "Faces" element
         */
        void setFacesArray(int i, org.landxml.schema.landXML11.FacesDocument.Faces faces);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Faces" element
         */
        org.landxml.schema.landXML11.FacesDocument.Faces insertNewFaces(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Faces" element
         */
        org.landxml.schema.landXML11.FacesDocument.Faces addNewFaces();
        
        /**
         * Removes the ith "Faces" element
         */
        void removeFaces(int i);
        
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
         * Gets the "surfType" attribute
         */
        org.landxml.schema.landXML11.SurfTypeEnum.Enum getSurfType();
        
        /**
         * Gets (as xml) the "surfType" attribute
         */
        org.landxml.schema.landXML11.SurfTypeEnum xgetSurfType();
        
        /**
         * Sets the "surfType" attribute
         */
        void setSurfType(org.landxml.schema.landXML11.SurfTypeEnum.Enum surfType);
        
        /**
         * Sets (as xml) the "surfType" attribute
         */
        void xsetSurfType(org.landxml.schema.landXML11.SurfTypeEnum surfType);
        
        /**
         * Gets the "area2DSurf" attribute
         */
        double getArea2DSurf();
        
        /**
         * Gets (as xml) the "area2DSurf" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetArea2DSurf();
        
        /**
         * True if has "area2DSurf" attribute
         */
        boolean isSetArea2DSurf();
        
        /**
         * Sets the "area2DSurf" attribute
         */
        void setArea2DSurf(double area2DSurf);
        
        /**
         * Sets (as xml) the "area2DSurf" attribute
         */
        void xsetArea2DSurf(org.apache.xmlbeans.XmlDouble area2DSurf);
        
        /**
         * Unsets the "area2DSurf" attribute
         */
        void unsetArea2DSurf();
        
        /**
         * Gets the "area3DSurf" attribute
         */
        double getArea3DSurf();
        
        /**
         * Gets (as xml) the "area3DSurf" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetArea3DSurf();
        
        /**
         * True if has "area3DSurf" attribute
         */
        boolean isSetArea3DSurf();
        
        /**
         * Sets the "area3DSurf" attribute
         */
        void setArea3DSurf(double area3DSurf);
        
        /**
         * Sets (as xml) the "area3DSurf" attribute
         */
        void xsetArea3DSurf(org.apache.xmlbeans.XmlDouble area3DSurf);
        
        /**
         * Unsets the "area3DSurf" attribute
         */
        void unsetArea3DSurf();
        
        /**
         * Gets the "elevMax" attribute
         */
        double getElevMax();
        
        /**
         * Gets (as xml) the "elevMax" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetElevMax();
        
        /**
         * True if has "elevMax" attribute
         */
        boolean isSetElevMax();
        
        /**
         * Sets the "elevMax" attribute
         */
        void setElevMax(double elevMax);
        
        /**
         * Sets (as xml) the "elevMax" attribute
         */
        void xsetElevMax(org.apache.xmlbeans.XmlDouble elevMax);
        
        /**
         * Unsets the "elevMax" attribute
         */
        void unsetElevMax();
        
        /**
         * Gets the "elevMin" attribute
         */
        double getElevMin();
        
        /**
         * Gets (as xml) the "elevMin" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetElevMin();
        
        /**
         * True if has "elevMin" attribute
         */
        boolean isSetElevMin();
        
        /**
         * Sets the "elevMin" attribute
         */
        void setElevMin(double elevMin);
        
        /**
         * Sets (as xml) the "elevMin" attribute
         */
        void xsetElevMin(org.apache.xmlbeans.XmlDouble elevMin);
        
        /**
         * Unsets the "elevMin" attribute
         */
        void unsetElevMin();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.DefinitionDocument.Definition newInstance() {
              return (org.landxml.schema.landXML11.DefinitionDocument.Definition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.DefinitionDocument.Definition newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.DefinitionDocument.Definition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.DefinitionDocument newInstance() {
          return (org.landxml.schema.landXML11.DefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.DefinitionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.DefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.DefinitionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.DefinitionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.DefinitionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.DefinitionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.DefinitionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.DefinitionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.DefinitionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.DefinitionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.DefinitionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.DefinitionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.DefinitionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.DefinitionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.DefinitionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.DefinitionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.DefinitionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.DefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.DefinitionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.DefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
