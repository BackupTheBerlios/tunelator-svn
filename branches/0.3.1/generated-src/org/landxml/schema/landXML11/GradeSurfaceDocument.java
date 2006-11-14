/*
 * An XML document type.
 * Localname: GradeSurface
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.GradeSurfaceDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one GradeSurface(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface GradeSurfaceDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GradeSurfaceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("gradesurface87aadoctype");
    
    /**
     * Gets the "GradeSurface" element
     */
    org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface getGradeSurface();
    
    /**
     * Sets the "GradeSurface" element
     */
    void setGradeSurface(org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface gradeSurface);
    
    /**
     * Appends and returns a new empty "GradeSurface" element
     */
    org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface addNewGradeSurface();
    
    /**
     * An XML GradeSurface(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface GradeSurface extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GradeSurface.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("gradesurface8a58elemtype");
        
        /**
         * Gets a List of "Start" elements
         */
        java.util.List<org.landxml.schema.landXML11.PointType> getStartList();
        
        /**
         * Gets array of all "Start" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.PointType[] getStartArray();
        
        /**
         * Gets ith "Start" element
         */
        org.landxml.schema.landXML11.PointType getStartArray(int i);
        
        /**
         * Returns number of "Start" element
         */
        int sizeOfStartArray();
        
        /**
         * Sets array of all "Start" element
         */
        void setStartArray(org.landxml.schema.landXML11.PointType[] startArray);
        
        /**
         * Sets ith "Start" element
         */
        void setStartArray(int i, org.landxml.schema.landXML11.PointType start);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Start" element
         */
        org.landxml.schema.landXML11.PointType insertNewStart(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Start" element
         */
        org.landxml.schema.landXML11.PointType addNewStart();
        
        /**
         * Removes the ith "Start" element
         */
        void removeStart(int i);
        
        /**
         * Gets a List of "Zones" elements
         */
        java.util.List<org.landxml.schema.landXML11.ZonesDocument.Zones> getZonesList();
        
        /**
         * Gets array of all "Zones" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ZonesDocument.Zones[] getZonesArray();
        
        /**
         * Gets ith "Zones" element
         */
        org.landxml.schema.landXML11.ZonesDocument.Zones getZonesArray(int i);
        
        /**
         * Returns number of "Zones" element
         */
        int sizeOfZonesArray();
        
        /**
         * Sets array of all "Zones" element
         */
        void setZonesArray(org.landxml.schema.landXML11.ZonesDocument.Zones[] zonesArray);
        
        /**
         * Sets ith "Zones" element
         */
        void setZonesArray(int i, org.landxml.schema.landXML11.ZonesDocument.Zones zones);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Zones" element
         */
        org.landxml.schema.landXML11.ZonesDocument.Zones insertNewZones(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Zones" element
         */
        org.landxml.schema.landXML11.ZonesDocument.Zones addNewZones();
        
        /**
         * Removes the ith "Zones" element
         */
        void removeZones(int i);
        
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
         * Gets the "alignmentRef" attribute
         */
        java.lang.String getAlignmentRef();
        
        /**
         * Gets (as xml) the "alignmentRef" attribute
         */
        org.landxml.schema.landXML11.AlignmentNameRef xgetAlignmentRef();
        
        /**
         * Sets the "alignmentRef" attribute
         */
        void setAlignmentRef(java.lang.String alignmentRef);
        
        /**
         * Sets (as xml) the "alignmentRef" attribute
         */
        void xsetAlignmentRef(org.landxml.schema.landXML11.AlignmentNameRef alignmentRef);
        
        /**
         * Gets the "stationAlignmentRef" attribute
         */
        java.lang.String getStationAlignmentRef();
        
        /**
         * Gets (as xml) the "stationAlignmentRef" attribute
         */
        org.landxml.schema.landXML11.AlignmentNameRef xgetStationAlignmentRef();
        
        /**
         * True if has "stationAlignmentRef" attribute
         */
        boolean isSetStationAlignmentRef();
        
        /**
         * Sets the "stationAlignmentRef" attribute
         */
        void setStationAlignmentRef(java.lang.String stationAlignmentRef);
        
        /**
         * Sets (as xml) the "stationAlignmentRef" attribute
         */
        void xsetStationAlignmentRef(org.landxml.schema.landXML11.AlignmentNameRef stationAlignmentRef);
        
        /**
         * Unsets the "stationAlignmentRef" attribute
         */
        void unsetStationAlignmentRef();
        
        /**
         * Gets the "surfaceType" attribute
         */
        org.landxml.schema.landXML11.ZoneSurfaceType.Enum getSurfaceType();
        
        /**
         * Gets (as xml) the "surfaceType" attribute
         */
        org.landxml.schema.landXML11.ZoneSurfaceType xgetSurfaceType();
        
        /**
         * Sets the "surfaceType" attribute
         */
        void setSurfaceType(org.landxml.schema.landXML11.ZoneSurfaceType.Enum surfaceType);
        
        /**
         * Sets (as xml) the "surfaceType" attribute
         */
        void xsetSurfaceType(org.landxml.schema.landXML11.ZoneSurfaceType surfaceType);
        
        /**
         * Gets the "surfaceRef" attribute
         */
        java.lang.String getSurfaceRef();
        
        /**
         * Gets (as xml) the "surfaceRef" attribute
         */
        org.landxml.schema.landXML11.SurfaceNameRef xgetSurfaceRef();
        
        /**
         * True if has "surfaceRef" attribute
         */
        boolean isSetSurfaceRef();
        
        /**
         * Sets the "surfaceRef" attribute
         */
        void setSurfaceRef(java.lang.String surfaceRef);
        
        /**
         * Sets (as xml) the "surfaceRef" attribute
         */
        void xsetSurfaceRef(org.landxml.schema.landXML11.SurfaceNameRef surfaceRef);
        
        /**
         * Unsets the "surfaceRef" attribute
         */
        void unsetSurfaceRef();
        
        /**
         * Gets the "surfaceRefs" attribute
         */
        java.util.List getSurfaceRefs();
        
        /**
         * Gets (as xml) the "surfaceRefs" attribute
         */
        org.landxml.schema.landXML11.SurfaceNameRefs xgetSurfaceRefs();
        
        /**
         * True if has "surfaceRefs" attribute
         */
        boolean isSetSurfaceRefs();
        
        /**
         * Sets the "surfaceRefs" attribute
         */
        void setSurfaceRefs(java.util.List surfaceRefs);
        
        /**
         * Sets (as xml) the "surfaceRefs" attribute
         */
        void xsetSurfaceRefs(org.landxml.schema.landXML11.SurfaceNameRefs surfaceRefs);
        
        /**
         * Unsets the "surfaceRefs" attribute
         */
        void unsetSurfaceRefs();
        
        /**
         * Gets the "cgPointRefs" attribute
         */
        java.util.List getCgPointRefs();
        
        /**
         * Gets (as xml) the "cgPointRefs" attribute
         */
        org.landxml.schema.landXML11.PointNameRefs xgetCgPointRefs();
        
        /**
         * True if has "cgPointRefs" attribute
         */
        boolean isSetCgPointRefs();
        
        /**
         * Sets the "cgPointRefs" attribute
         */
        void setCgPointRefs(java.util.List cgPointRefs);
        
        /**
         * Sets (as xml) the "cgPointRefs" attribute
         */
        void xsetCgPointRefs(org.landxml.schema.landXML11.PointNameRefs cgPointRefs);
        
        /**
         * Unsets the "cgPointRefs" attribute
         */
        void unsetCgPointRefs();
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface newInstance() {
              return (org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.GradeSurfaceDocument newInstance() {
          return (org.landxml.schema.landXML11.GradeSurfaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.GradeSurfaceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.GradeSurfaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.GradeSurfaceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GradeSurfaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.GradeSurfaceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GradeSurfaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.GradeSurfaceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GradeSurfaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.GradeSurfaceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GradeSurfaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.GradeSurfaceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GradeSurfaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.GradeSurfaceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GradeSurfaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.GradeSurfaceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GradeSurfaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.GradeSurfaceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GradeSurfaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.GradeSurfaceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GradeSurfaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.GradeSurfaceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.GradeSurfaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.GradeSurfaceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GradeSurfaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.GradeSurfaceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GradeSurfaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.GradeSurfaceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GradeSurfaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.GradeSurfaceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.GradeSurfaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.GradeSurfaceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.GradeSurfaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.GradeSurfaceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.GradeSurfaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
