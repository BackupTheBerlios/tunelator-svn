/*
 * An XML document type.
 * Localname: CrossSect
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CrossSectDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one CrossSect(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface CrossSectDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CrossSectDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("crosssectd425doctype");
    
    /**
     * Gets the "CrossSect" element
     */
    org.landxml.schema.landXML11.CrossSectDocument.CrossSect getCrossSect();
    
    /**
     * Sets the "CrossSect" element
     */
    void setCrossSect(org.landxml.schema.landXML11.CrossSectDocument.CrossSect crossSect);
    
    /**
     * Appends and returns a new empty "CrossSect" element
     */
    org.landxml.schema.landXML11.CrossSectDocument.CrossSect addNewCrossSect();
    
    /**
     * An XML CrossSect(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface CrossSect extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CrossSect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("crosssect67d4elemtype");
        
        /**
         * Gets a List of "CrossSectSurf" elements
         */
        java.util.List<org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf> getCrossSectSurfList();
        
        /**
         * Gets array of all "CrossSectSurf" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf[] getCrossSectSurfArray();
        
        /**
         * Gets ith "CrossSectSurf" element
         */
        org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf getCrossSectSurfArray(int i);
        
        /**
         * Returns number of "CrossSectSurf" element
         */
        int sizeOfCrossSectSurfArray();
        
        /**
         * Sets array of all "CrossSectSurf" element
         */
        void setCrossSectSurfArray(org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf[] crossSectSurfArray);
        
        /**
         * Sets ith "CrossSectSurf" element
         */
        void setCrossSectSurfArray(int i, org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf crossSectSurf);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CrossSectSurf" element
         */
        org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf insertNewCrossSectSurf(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CrossSectSurf" element
         */
        org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf addNewCrossSectSurf();
        
        /**
         * Removes the ith "CrossSectSurf" element
         */
        void removeCrossSectSurf(int i);
        
        /**
         * Gets a List of "DesignCrossSectSurf" elements
         */
        java.util.List<org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf> getDesignCrossSectSurfList();
        
        /**
         * Gets array of all "DesignCrossSectSurf" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf[] getDesignCrossSectSurfArray();
        
        /**
         * Gets ith "DesignCrossSectSurf" element
         */
        org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf getDesignCrossSectSurfArray(int i);
        
        /**
         * Returns number of "DesignCrossSectSurf" element
         */
        int sizeOfDesignCrossSectSurfArray();
        
        /**
         * Sets array of all "DesignCrossSectSurf" element
         */
        void setDesignCrossSectSurfArray(org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf[] designCrossSectSurfArray);
        
        /**
         * Sets ith "DesignCrossSectSurf" element
         */
        void setDesignCrossSectSurfArray(int i, org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf designCrossSectSurf);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DesignCrossSectSurf" element
         */
        org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf insertNewDesignCrossSectSurf(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DesignCrossSectSurf" element
         */
        org.landxml.schema.landXML11.DesignCrossSectSurfDocument.DesignCrossSectSurf addNewDesignCrossSectSurf();
        
        /**
         * Removes the ith "DesignCrossSectSurf" element
         */
        void removeDesignCrossSectSurf(int i);
        
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
         * Gets the "sta" attribute
         */
        double getSta();
        
        /**
         * Gets (as xml) the "sta" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSta();
        
        /**
         * Sets the "sta" attribute
         */
        void setSta(double sta);
        
        /**
         * Sets (as xml) the "sta" attribute
         */
        void xsetSta(org.apache.xmlbeans.XmlDouble sta);
        
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
         * Gets the "angleSkew" attribute
         */
        double getAngleSkew();
        
        /**
         * Gets (as xml) the "angleSkew" attribute
         */
        org.landxml.schema.landXML11.Angle xgetAngleSkew();
        
        /**
         * True if has "angleSkew" attribute
         */
        boolean isSetAngleSkew();
        
        /**
         * Sets the "angleSkew" attribute
         */
        void setAngleSkew(double angleSkew);
        
        /**
         * Sets (as xml) the "angleSkew" attribute
         */
        void xsetAngleSkew(org.landxml.schema.landXML11.Angle angleSkew);
        
        /**
         * Unsets the "angleSkew" attribute
         */
        void unsetAngleSkew();
        
        /**
         * Gets the "areaCut" attribute
         */
        double getAreaCut();
        
        /**
         * Gets (as xml) the "areaCut" attribute
         */
        org.landxml.schema.landXML11.CrossSectSurfaceArea xgetAreaCut();
        
        /**
         * True if has "areaCut" attribute
         */
        boolean isSetAreaCut();
        
        /**
         * Sets the "areaCut" attribute
         */
        void setAreaCut(double areaCut);
        
        /**
         * Sets (as xml) the "areaCut" attribute
         */
        void xsetAreaCut(org.landxml.schema.landXML11.CrossSectSurfaceArea areaCut);
        
        /**
         * Unsets the "areaCut" attribute
         */
        void unsetAreaCut();
        
        /**
         * Gets the "areaFill" attribute
         */
        double getAreaFill();
        
        /**
         * Gets (as xml) the "areaFill" attribute
         */
        org.landxml.schema.landXML11.CrossSectSurfaceArea xgetAreaFill();
        
        /**
         * True if has "areaFill" attribute
         */
        boolean isSetAreaFill();
        
        /**
         * Sets the "areaFill" attribute
         */
        void setAreaFill(double areaFill);
        
        /**
         * Sets (as xml) the "areaFill" attribute
         */
        void xsetAreaFill(org.landxml.schema.landXML11.CrossSectSurfaceArea areaFill);
        
        /**
         * Unsets the "areaFill" attribute
         */
        void unsetAreaFill();
        
        /**
         * Gets the "centroidCut" attribute
         */
        double getCentroidCut();
        
        /**
         * Gets (as xml) the "centroidCut" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetCentroidCut();
        
        /**
         * True if has "centroidCut" attribute
         */
        boolean isSetCentroidCut();
        
        /**
         * Sets the "centroidCut" attribute
         */
        void setCentroidCut(double centroidCut);
        
        /**
         * Sets (as xml) the "centroidCut" attribute
         */
        void xsetCentroidCut(org.apache.xmlbeans.XmlDouble centroidCut);
        
        /**
         * Unsets the "centroidCut" attribute
         */
        void unsetCentroidCut();
        
        /**
         * Gets the "centroidFill" attribute
         */
        double getCentroidFill();
        
        /**
         * Gets (as xml) the "centroidFill" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetCentroidFill();
        
        /**
         * True if has "centroidFill" attribute
         */
        boolean isSetCentroidFill();
        
        /**
         * Sets the "centroidFill" attribute
         */
        void setCentroidFill(double centroidFill);
        
        /**
         * Sets (as xml) the "centroidFill" attribute
         */
        void xsetCentroidFill(org.apache.xmlbeans.XmlDouble centroidFill);
        
        /**
         * Unsets the "centroidFill" attribute
         */
        void unsetCentroidFill();
        
        /**
         * Gets the "sectType" attribute
         */
        java.lang.String getSectType();
        
        /**
         * Gets (as xml) the "sectType" attribute
         */
        org.apache.xmlbeans.XmlString xgetSectType();
        
        /**
         * True if has "sectType" attribute
         */
        boolean isSetSectType();
        
        /**
         * Sets the "sectType" attribute
         */
        void setSectType(java.lang.String sectType);
        
        /**
         * Sets (as xml) the "sectType" attribute
         */
        void xsetSectType(org.apache.xmlbeans.XmlString sectType);
        
        /**
         * Unsets the "sectType" attribute
         */
        void unsetSectType();
        
        /**
         * Gets the "volumeCut" attribute
         */
        double getVolumeCut();
        
        /**
         * Gets (as xml) the "volumeCut" attribute
         */
        org.landxml.schema.landXML11.CrossSectSurfaceVolume xgetVolumeCut();
        
        /**
         * True if has "volumeCut" attribute
         */
        boolean isSetVolumeCut();
        
        /**
         * Sets the "volumeCut" attribute
         */
        void setVolumeCut(double volumeCut);
        
        /**
         * Sets (as xml) the "volumeCut" attribute
         */
        void xsetVolumeCut(org.landxml.schema.landXML11.CrossSectSurfaceVolume volumeCut);
        
        /**
         * Unsets the "volumeCut" attribute
         */
        void unsetVolumeCut();
        
        /**
         * Gets the "volumeFill" attribute
         */
        double getVolumeFill();
        
        /**
         * Gets (as xml) the "volumeFill" attribute
         */
        org.landxml.schema.landXML11.CrossSectSurfaceVolume xgetVolumeFill();
        
        /**
         * True if has "volumeFill" attribute
         */
        boolean isSetVolumeFill();
        
        /**
         * Sets the "volumeFill" attribute
         */
        void setVolumeFill(double volumeFill);
        
        /**
         * Sets (as xml) the "volumeFill" attribute
         */
        void xsetVolumeFill(org.landxml.schema.landXML11.CrossSectSurfaceVolume volumeFill);
        
        /**
         * Unsets the "volumeFill" attribute
         */
        void unsetVolumeFill();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.CrossSectDocument.CrossSect newInstance() {
              return (org.landxml.schema.landXML11.CrossSectDocument.CrossSect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.CrossSectDocument.CrossSect newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.CrossSectDocument.CrossSect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.CrossSectDocument newInstance() {
          return (org.landxml.schema.landXML11.CrossSectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.CrossSectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.CrossSectDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrossSectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrossSectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.CrossSectDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.CrossSectDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.CrossSectDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.CrossSectDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.CrossSectDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrossSectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrossSectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.CrossSectDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrossSectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrossSectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CrossSectDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CrossSectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CrossSectDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CrossSectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
