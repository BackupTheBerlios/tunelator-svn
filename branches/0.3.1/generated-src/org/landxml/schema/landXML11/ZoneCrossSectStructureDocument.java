/*
 * An XML document type.
 * Localname: ZoneCrossSectStructure
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ZoneCrossSectStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one ZoneCrossSectStructure(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface ZoneCrossSectStructureDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ZoneCrossSectStructureDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("zonecrosssectstructure76f0doctype");
    
    /**
     * Gets the "ZoneCrossSectStructure" element
     */
    org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure getZoneCrossSectStructure();
    
    /**
     * Sets the "ZoneCrossSectStructure" element
     */
    void setZoneCrossSectStructure(org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure zoneCrossSectStructure);
    
    /**
     * Appends and returns a new empty "ZoneCrossSectStructure" element
     */
    org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure addNewZoneCrossSectStructure();
    
    /**
     * An XML ZoneCrossSectStructure(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface ZoneCrossSectStructure extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ZoneCrossSectStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("zonecrosssectstructure5658elemtype");
        
        /**
         * Gets the "PntList2D" element
         */
        java.util.List getPntList2D();
        
        /**
         * Gets (as xml) the "PntList2D" element
         */
        org.landxml.schema.landXML11.PntList2DDocument.PntList2D xgetPntList2D();
        
        /**
         * Sets the "PntList2D" element
         */
        void setPntList2D(java.util.List pntList2D);
        
        /**
         * Sets (as xml) the "PntList2D" element
         */
        void xsetPntList2D(org.landxml.schema.landXML11.PntList2DDocument.PntList2D pntList2D);
        
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
         * Gets the "innerConnectPnt" attribute
         */
        java.util.List getInnerConnectPnt();
        
        /**
         * Gets (as xml) the "innerConnectPnt" attribute
         */
        org.landxml.schema.landXML11.CrossSectionPnt xgetInnerConnectPnt();
        
        /**
         * Sets the "innerConnectPnt" attribute
         */
        void setInnerConnectPnt(java.util.List innerConnectPnt);
        
        /**
         * Sets (as xml) the "innerConnectPnt" attribute
         */
        void xsetInnerConnectPnt(org.landxml.schema.landXML11.CrossSectionPnt innerConnectPnt);
        
        /**
         * Gets the "outerConnectPnt" attribute
         */
        java.util.List getOuterConnectPnt();
        
        /**
         * Gets (as xml) the "outerConnectPnt" attribute
         */
        org.landxml.schema.landXML11.CrossSectionPnt xgetOuterConnectPnt();
        
        /**
         * Sets the "outerConnectPnt" attribute
         */
        void setOuterConnectPnt(java.util.List outerConnectPnt);
        
        /**
         * Sets (as xml) the "outerConnectPnt" attribute
         */
        void xsetOuterConnectPnt(org.landxml.schema.landXML11.CrossSectionPnt outerConnectPnt);
        
        /**
         * Gets the "offsetMode" attribute
         */
        org.landxml.schema.landXML11.ZoneOffsetType.Enum getOffsetMode();
        
        /**
         * Gets (as xml) the "offsetMode" attribute
         */
        org.landxml.schema.landXML11.ZoneOffsetType xgetOffsetMode();
        
        /**
         * True if has "offsetMode" attribute
         */
        boolean isSetOffsetMode();
        
        /**
         * Sets the "offsetMode" attribute
         */
        void setOffsetMode(org.landxml.schema.landXML11.ZoneOffsetType.Enum offsetMode);
        
        /**
         * Sets (as xml) the "offsetMode" attribute
         */
        void xsetOffsetMode(org.landxml.schema.landXML11.ZoneOffsetType offsetMode);
        
        /**
         * Unsets the "offsetMode" attribute
         */
        void unsetOffsetMode();
        
        /**
         * Gets the "startOffset" attribute
         */
        double getStartOffset();
        
        /**
         * Gets (as xml) the "startOffset" attribute
         */
        org.landxml.schema.landXML11.OffsetDistance xgetStartOffset();
        
        /**
         * True if has "startOffset" attribute
         */
        boolean isSetStartOffset();
        
        /**
         * Sets the "startOffset" attribute
         */
        void setStartOffset(double startOffset);
        
        /**
         * Sets (as xml) the "startOffset" attribute
         */
        void xsetStartOffset(org.landxml.schema.landXML11.OffsetDistance startOffset);
        
        /**
         * Unsets the "startOffset" attribute
         */
        void unsetStartOffset();
        
        /**
         * Gets the "startOffsetElev" attribute
         */
        double getStartOffsetElev();
        
        /**
         * Gets (as xml) the "startOffsetElev" attribute
         */
        org.landxml.schema.landXML11.OffsetElevation xgetStartOffsetElev();
        
        /**
         * True if has "startOffsetElev" attribute
         */
        boolean isSetStartOffsetElev();
        
        /**
         * Sets the "startOffsetElev" attribute
         */
        void setStartOffsetElev(double startOffsetElev);
        
        /**
         * Sets (as xml) the "startOffsetElev" attribute
         */
        void xsetStartOffsetElev(org.landxml.schema.landXML11.OffsetElevation startOffsetElev);
        
        /**
         * Unsets the "startOffsetElev" attribute
         */
        void unsetStartOffsetElev();
        
        /**
         * Gets the "endOffset" attribute
         */
        double getEndOffset();
        
        /**
         * Gets (as xml) the "endOffset" attribute
         */
        org.landxml.schema.landXML11.OffsetDistance xgetEndOffset();
        
        /**
         * True if has "endOffset" attribute
         */
        boolean isSetEndOffset();
        
        /**
         * Sets the "endOffset" attribute
         */
        void setEndOffset(double endOffset);
        
        /**
         * Sets (as xml) the "endOffset" attribute
         */
        void xsetEndOffset(org.landxml.schema.landXML11.OffsetDistance endOffset);
        
        /**
         * Unsets the "endOffset" attribute
         */
        void unsetEndOffset();
        
        /**
         * Gets the "endOffsetElev" attribute
         */
        double getEndOffsetElev();
        
        /**
         * Gets (as xml) the "endOffsetElev" attribute
         */
        org.landxml.schema.landXML11.OffsetElevation xgetEndOffsetElev();
        
        /**
         * True if has "endOffsetElev" attribute
         */
        boolean isSetEndOffsetElev();
        
        /**
         * Sets the "endOffsetElev" attribute
         */
        void setEndOffsetElev(double endOffsetElev);
        
        /**
         * Sets (as xml) the "endOffsetElev" attribute
         */
        void xsetEndOffsetElev(org.landxml.schema.landXML11.OffsetElevation endOffsetElev);
        
        /**
         * Unsets the "endOffsetElev" attribute
         */
        void unsetEndOffsetElev();
        
        /**
         * Gets the "transition" attribute
         */
        org.landxml.schema.landXML11.ZoneTransitionType.Enum getTransition();
        
        /**
         * Gets (as xml) the "transition" attribute
         */
        org.landxml.schema.landXML11.ZoneTransitionType xgetTransition();
        
        /**
         * True if has "transition" attribute
         */
        boolean isSetTransition();
        
        /**
         * Sets the "transition" attribute
         */
        void setTransition(org.landxml.schema.landXML11.ZoneTransitionType.Enum transition);
        
        /**
         * Sets (as xml) the "transition" attribute
         */
        void xsetTransition(org.landxml.schema.landXML11.ZoneTransitionType transition);
        
        /**
         * Unsets the "transition" attribute
         */
        void unsetTransition();
        
        /**
         * Gets the "placement" attribute
         */
        org.landxml.schema.landXML11.ZonePlacementType.Enum getPlacement();
        
        /**
         * Gets (as xml) the "placement" attribute
         */
        org.landxml.schema.landXML11.ZonePlacementType xgetPlacement();
        
        /**
         * True if has "placement" attribute
         */
        boolean isSetPlacement();
        
        /**
         * Sets the "placement" attribute
         */
        void setPlacement(org.landxml.schema.landXML11.ZonePlacementType.Enum placement);
        
        /**
         * Sets (as xml) the "placement" attribute
         */
        void xsetPlacement(org.landxml.schema.landXML11.ZonePlacementType placement);
        
        /**
         * Unsets the "placement" attribute
         */
        void unsetPlacement();
        
        /**
         * Gets the "catalogReference" attribute
         */
        java.lang.String getCatalogReference();
        
        /**
         * Gets (as xml) the "catalogReference" attribute
         */
        org.apache.xmlbeans.XmlAnyURI xgetCatalogReference();
        
        /**
         * True if has "catalogReference" attribute
         */
        boolean isSetCatalogReference();
        
        /**
         * Sets the "catalogReference" attribute
         */
        void setCatalogReference(java.lang.String catalogReference);
        
        /**
         * Sets (as xml) the "catalogReference" attribute
         */
        void xsetCatalogReference(org.apache.xmlbeans.XmlAnyURI catalogReference);
        
        /**
         * Unsets the "catalogReference" attribute
         */
        void unsetCatalogReference();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure newInstance() {
              return (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.ZoneCrossSectStructureDocument newInstance() {
          return (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneCrossSectStructureDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.ZoneCrossSectStructureDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneCrossSectStructureDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.ZoneCrossSectStructureDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneCrossSectStructureDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneCrossSectStructureDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneCrossSectStructureDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneCrossSectStructureDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneCrossSectStructureDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneCrossSectStructureDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneCrossSectStructureDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneCrossSectStructureDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneCrossSectStructureDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneCrossSectStructureDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneCrossSectStructureDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ZoneCrossSectStructureDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ZoneCrossSectStructureDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
