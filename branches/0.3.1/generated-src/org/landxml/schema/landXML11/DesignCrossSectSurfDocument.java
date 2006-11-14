/*
 * An XML document type.
 * Localname: DesignCrossSectSurf
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.DesignCrossSectSurfDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one DesignCrossSectSurf(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface DesignCrossSectSurfDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DesignCrossSectSurfDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("designcrosssectsurff2fddoctype");
    
    /**
     * Gets the "DesignCrossSectSurf" element
     */
    org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf getDesignCrossSectSurf();
    
    /**
     * Sets the "DesignCrossSectSurf" element
     */
    void setDesignCrossSectSurf(org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf designCrossSectSurf);
    
    /**
     * Appends and returns a new empty "DesignCrossSectSurf" element
     */
    org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf addNewDesignCrossSectSurf();
    
    /**
     * An XML DesignCrossSectSurf(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface DesignCrossSectSurf extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DesignCrossSectSurf.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("designcrosssectsurf2784elemtype");
        
        /**
         * Gets a List of "CrossSectPnt" elements
         */
        java.util.List<org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt> getCrossSectPntList();
        
        /**
         * Gets array of all "CrossSectPnt" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt[] getCrossSectPntArray();
        
        /**
         * Gets ith "CrossSectPnt" element
         */
        org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt getCrossSectPntArray(int i);
        
        /**
         * Returns number of "CrossSectPnt" element
         */
        int sizeOfCrossSectPntArray();
        
        /**
         * Sets array of all "CrossSectPnt" element
         */
        void setCrossSectPntArray(org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt[] crossSectPntArray);
        
        /**
         * Sets ith "CrossSectPnt" element
         */
        void setCrossSectPntArray(int i, org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt crossSectPnt);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CrossSectPnt" element
         */
        org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt insertNewCrossSectPnt(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CrossSectPnt" element
         */
        org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt addNewCrossSectPnt();
        
        /**
         * Removes the ith "CrossSectPnt" element
         */
        void removeCrossSectPnt(int i);
        
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
         * True if has "name" attribute
         */
        boolean isSetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Unsets the "name" attribute
         */
        void unsetName();
        
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
         * Gets the "side" attribute
         */
        org.landxml.schema.landXML11.SideofRoadType.Enum getSide();
        
        /**
         * Gets (as xml) the "side" attribute
         */
        org.landxml.schema.landXML11.SideofRoadType xgetSide();
        
        /**
         * True if has "side" attribute
         */
        boolean isSetSide();
        
        /**
         * Sets the "side" attribute
         */
        void setSide(org.landxml.schema.landXML11.SideofRoadType.Enum side);
        
        /**
         * Sets (as xml) the "side" attribute
         */
        void xsetSide(org.landxml.schema.landXML11.SideofRoadType side);
        
        /**
         * Unsets the "side" attribute
         */
        void unsetSide();
        
        /**
         * Gets the "material" attribute
         */
        java.lang.String getMaterial();
        
        /**
         * Gets (as xml) the "material" attribute
         */
        org.apache.xmlbeans.XmlString xgetMaterial();
        
        /**
         * True if has "material" attribute
         */
        boolean isSetMaterial();
        
        /**
         * Sets the "material" attribute
         */
        void setMaterial(java.lang.String material);
        
        /**
         * Sets (as xml) the "material" attribute
         */
        void xsetMaterial(org.apache.xmlbeans.XmlString material);
        
        /**
         * Unsets the "material" attribute
         */
        void unsetMaterial();
        
        /**
         * Gets the "closedArea" attribute
         */
        boolean getClosedArea();
        
        /**
         * Gets (as xml) the "closedArea" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetClosedArea();
        
        /**
         * True if has "closedArea" attribute
         */
        boolean isSetClosedArea();
        
        /**
         * Sets the "closedArea" attribute
         */
        void setClosedArea(boolean closedArea);
        
        /**
         * Sets (as xml) the "closedArea" attribute
         */
        void xsetClosedArea(org.apache.xmlbeans.XmlBoolean closedArea);
        
        /**
         * Unsets the "closedArea" attribute
         */
        void unsetClosedArea();
        
        /**
         * Gets the "typicalThickness" attribute
         */
        double getTypicalThickness();
        
        /**
         * Gets (as xml) the "typicalThickness" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetTypicalThickness();
        
        /**
         * True if has "typicalThickness" attribute
         */
        boolean isSetTypicalThickness();
        
        /**
         * Sets the "typicalThickness" attribute
         */
        void setTypicalThickness(double typicalThickness);
        
        /**
         * Sets (as xml) the "typicalThickness" attribute
         */
        void xsetTypicalThickness(org.apache.xmlbeans.XmlDouble typicalThickness);
        
        /**
         * Unsets the "typicalThickness" attribute
         */
        void unsetTypicalThickness();
        
        /**
         * Gets the "typicalWidth" attribute
         */
        double getTypicalWidth();
        
        /**
         * Gets (as xml) the "typicalWidth" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetTypicalWidth();
        
        /**
         * True if has "typicalWidth" attribute
         */
        boolean isSetTypicalWidth();
        
        /**
         * Sets the "typicalWidth" attribute
         */
        void setTypicalWidth(double typicalWidth);
        
        /**
         * Sets (as xml) the "typicalWidth" attribute
         */
        void xsetTypicalWidth(org.apache.xmlbeans.XmlDouble typicalWidth);
        
        /**
         * Unsets the "typicalWidth" attribute
         */
        void unsetTypicalWidth();
        
        /**
         * Gets the "area" attribute
         */
        double getArea();
        
        /**
         * Gets (as xml) the "area" attribute
         */
        org.landxml.schema.landXML11.CrossSectSurfaceArea xgetArea();
        
        /**
         * True if has "area" attribute
         */
        boolean isSetArea();
        
        /**
         * Sets the "area" attribute
         */
        void setArea(double area);
        
        /**
         * Sets (as xml) the "area" attribute
         */
        void xsetArea(org.landxml.schema.landXML11.CrossSectSurfaceArea area);
        
        /**
         * Unsets the "area" attribute
         */
        void unsetArea();
        
        /**
         * Gets the "volume" attribute
         */
        double getVolume();
        
        /**
         * Gets (as xml) the "volume" attribute
         */
        org.landxml.schema.landXML11.CrossSectSurfaceVolume xgetVolume();
        
        /**
         * True if has "volume" attribute
         */
        boolean isSetVolume();
        
        /**
         * Sets the "volume" attribute
         */
        void setVolume(double volume);
        
        /**
         * Sets (as xml) the "volume" attribute
         */
        void xsetVolume(org.landxml.schema.landXML11.CrossSectSurfaceVolume volume);
        
        /**
         * Unsets the "volume" attribute
         */
        void unsetVolume();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf newInstance() {
              return (org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.DesignCrossSectSurfDocument newInstance() {
          return (org.landxml.schema.landXML11.DesignCrossSectSurfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.DesignCrossSectSurfDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.DesignCrossSectSurfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.DesignCrossSectSurfDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DesignCrossSectSurfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.DesignCrossSectSurfDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DesignCrossSectSurfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.DesignCrossSectSurfDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DesignCrossSectSurfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.DesignCrossSectSurfDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DesignCrossSectSurfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.DesignCrossSectSurfDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DesignCrossSectSurfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.DesignCrossSectSurfDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DesignCrossSectSurfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.DesignCrossSectSurfDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DesignCrossSectSurfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.DesignCrossSectSurfDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DesignCrossSectSurfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.DesignCrossSectSurfDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DesignCrossSectSurfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.DesignCrossSectSurfDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DesignCrossSectSurfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.DesignCrossSectSurfDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DesignCrossSectSurfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.DesignCrossSectSurfDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DesignCrossSectSurfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.DesignCrossSectSurfDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DesignCrossSectSurfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.DesignCrossSectSurfDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DesignCrossSectSurfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.DesignCrossSectSurfDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.DesignCrossSectSurfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.DesignCrossSectSurfDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.DesignCrossSectSurfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
