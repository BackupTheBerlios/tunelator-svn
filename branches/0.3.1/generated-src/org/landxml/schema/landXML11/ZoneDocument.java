/*
 * An XML document type.
 * Localname: Zone
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ZoneDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one Zone(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface ZoneDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ZoneDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("zone1400doctype");
    
    /**
     * Gets the "Zone" element
     */
    org.landxml.schema.landXML11.ZoneDocument.Zone getZone();
    
    /**
     * Sets the "Zone" element
     */
    void setZone(org.landxml.schema.landXML11.ZoneDocument.Zone zone);
    
    /**
     * Appends and returns a new empty "Zone" element
     */
    org.landxml.schema.landXML11.ZoneDocument.Zone addNewZone();
    
    /**
     * An XML Zone(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface Zone extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Zone.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("zone7c98elemtype");
        
        /**
         * Gets a List of "ZoneWidth" elements
         */
        java.util.List<org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth> getZoneWidthList();
        
        /**
         * Gets array of all "ZoneWidth" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth[] getZoneWidthArray();
        
        /**
         * Gets ith "ZoneWidth" element
         */
        org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth getZoneWidthArray(int i);
        
        /**
         * Returns number of "ZoneWidth" element
         */
        int sizeOfZoneWidthArray();
        
        /**
         * Sets array of all "ZoneWidth" element
         */
        void setZoneWidthArray(org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth[] zoneWidthArray);
        
        /**
         * Sets ith "ZoneWidth" element
         */
        void setZoneWidthArray(int i, org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth zoneWidth);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ZoneWidth" element
         */
        org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth insertNewZoneWidth(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ZoneWidth" element
         */
        org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth addNewZoneWidth();
        
        /**
         * Removes the ith "ZoneWidth" element
         */
        void removeZoneWidth(int i);
        
        /**
         * Gets a List of "ZoneSlope" elements
         */
        java.util.List<org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope> getZoneSlopeList();
        
        /**
         * Gets array of all "ZoneSlope" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope[] getZoneSlopeArray();
        
        /**
         * Gets ith "ZoneSlope" element
         */
        org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope getZoneSlopeArray(int i);
        
        /**
         * Returns number of "ZoneSlope" element
         */
        int sizeOfZoneSlopeArray();
        
        /**
         * Sets array of all "ZoneSlope" element
         */
        void setZoneSlopeArray(org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope[] zoneSlopeArray);
        
        /**
         * Sets ith "ZoneSlope" element
         */
        void setZoneSlopeArray(int i, org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope zoneSlope);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ZoneSlope" element
         */
        org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope insertNewZoneSlope(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ZoneSlope" element
         */
        org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope addNewZoneSlope();
        
        /**
         * Removes the ith "ZoneSlope" element
         */
        void removeZoneSlope(int i);
        
        /**
         * Gets a List of "ZoneCutFill" elements
         */
        java.util.List<org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill> getZoneCutFillList();
        
        /**
         * Gets array of all "ZoneCutFill" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill[] getZoneCutFillArray();
        
        /**
         * Gets ith "ZoneCutFill" element
         */
        org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill getZoneCutFillArray(int i);
        
        /**
         * Returns number of "ZoneCutFill" element
         */
        int sizeOfZoneCutFillArray();
        
        /**
         * Sets array of all "ZoneCutFill" element
         */
        void setZoneCutFillArray(org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill[] zoneCutFillArray);
        
        /**
         * Sets ith "ZoneCutFill" element
         */
        void setZoneCutFillArray(int i, org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill zoneCutFill);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ZoneCutFill" element
         */
        org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill insertNewZoneCutFill(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ZoneCutFill" element
         */
        org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill addNewZoneCutFill();
        
        /**
         * Removes the ith "ZoneCutFill" element
         */
        void removeZoneCutFill(int i);
        
        /**
         * Gets a List of "ZoneMaterial" elements
         */
        java.util.List<org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial> getZoneMaterialList();
        
        /**
         * Gets array of all "ZoneMaterial" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial[] getZoneMaterialArray();
        
        /**
         * Gets ith "ZoneMaterial" element
         */
        org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial getZoneMaterialArray(int i);
        
        /**
         * Returns number of "ZoneMaterial" element
         */
        int sizeOfZoneMaterialArray();
        
        /**
         * Sets array of all "ZoneMaterial" element
         */
        void setZoneMaterialArray(org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial[] zoneMaterialArray);
        
        /**
         * Sets ith "ZoneMaterial" element
         */
        void setZoneMaterialArray(int i, org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial zoneMaterial);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ZoneMaterial" element
         */
        org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial insertNewZoneMaterial(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ZoneMaterial" element
         */
        org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial addNewZoneMaterial();
        
        /**
         * Removes the ith "ZoneMaterial" element
         */
        void removeZoneMaterial(int i);
        
        /**
         * Gets a List of "ZoneCrossSectStructure" elements
         */
        java.util.List<org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure> getZoneCrossSectStructureList();
        
        /**
         * Gets array of all "ZoneCrossSectStructure" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure[] getZoneCrossSectStructureArray();
        
        /**
         * Gets ith "ZoneCrossSectStructure" element
         */
        org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure getZoneCrossSectStructureArray(int i);
        
        /**
         * Returns number of "ZoneCrossSectStructure" element
         */
        int sizeOfZoneCrossSectStructureArray();
        
        /**
         * Sets array of all "ZoneCrossSectStructure" element
         */
        void setZoneCrossSectStructureArray(org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure[] zoneCrossSectStructureArray);
        
        /**
         * Sets ith "ZoneCrossSectStructure" element
         */
        void setZoneCrossSectStructureArray(int i, org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure zoneCrossSectStructure);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ZoneCrossSectStructure" element
         */
        org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure insertNewZoneCrossSectStructure(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ZoneCrossSectStructure" element
         */
        org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure addNewZoneCrossSectStructure();
        
        /**
         * Removes the ith "ZoneCrossSectStructure" element
         */
        void removeZoneCrossSectStructure(int i);
        
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
         * Gets the "priority" attribute
         */
        int getPriority();
        
        /**
         * Gets (as xml) the "priority" attribute
         */
        org.apache.xmlbeans.XmlInt xgetPriority();
        
        /**
         * Sets the "priority" attribute
         */
        void setPriority(int priority);
        
        /**
         * Sets (as xml) the "priority" attribute
         */
        void xsetPriority(org.apache.xmlbeans.XmlInt priority);
        
        /**
         * Gets the "category" attribute
         */
        org.landxml.schema.landXML11.ZoneCategoryType.Enum getCategory();
        
        /**
         * Gets (as xml) the "category" attribute
         */
        org.landxml.schema.landXML11.ZoneCategoryType xgetCategory();
        
        /**
         * Sets the "category" attribute
         */
        void setCategory(org.landxml.schema.landXML11.ZoneCategoryType.Enum category);
        
        /**
         * Sets (as xml) the "category" attribute
         */
        void xsetCategory(org.landxml.schema.landXML11.ZoneCategoryType category);
        
        /**
         * Gets the "staStart" attribute
         */
        double getStaStart();
        
        /**
         * Gets (as xml) the "staStart" attribute
         */
        org.landxml.schema.landXML11.Station xgetStaStart();
        
        /**
         * Sets the "staStart" attribute
         */
        void setStaStart(double staStart);
        
        /**
         * Sets (as xml) the "staStart" attribute
         */
        void xsetStaStart(org.landxml.schema.landXML11.Station staStart);
        
        /**
         * Gets the "staEnd" attribute
         */
        double getStaEnd();
        
        /**
         * Gets (as xml) the "staEnd" attribute
         */
        org.landxml.schema.landXML11.Station xgetStaEnd();
        
        /**
         * True if has "staEnd" attribute
         */
        boolean isSetStaEnd();
        
        /**
         * Sets the "staEnd" attribute
         */
        void setStaEnd(double staEnd);
        
        /**
         * Sets (as xml) the "staEnd" attribute
         */
        void xsetStaEnd(org.landxml.schema.landXML11.Station staEnd);
        
        /**
         * Unsets the "staEnd" attribute
         */
        void unsetStaEnd();
        
        /**
         * Gets the "startWidth" attribute
         */
        double getStartWidth();
        
        /**
         * Gets (as xml) the "startWidth" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetStartWidth();
        
        /**
         * Sets the "startWidth" attribute
         */
        void setStartWidth(double startWidth);
        
        /**
         * Sets (as xml) the "startWidth" attribute
         */
        void xsetStartWidth(org.apache.xmlbeans.XmlDouble startWidth);
        
        /**
         * Gets the "startVertValue" attribute
         */
        double getStartVertValue();
        
        /**
         * Gets (as xml) the "startVertValue" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetStartVertValue();
        
        /**
         * Sets the "startVertValue" attribute
         */
        void setStartVertValue(double startVertValue);
        
        /**
         * Sets (as xml) the "startVertValue" attribute
         */
        void xsetStartVertValue(org.apache.xmlbeans.XmlDouble startVertValue);
        
        /**
         * Gets the "startVertType" attribute
         */
        org.landxml.schema.landXML11.ZoneVertType.Enum getStartVertType();
        
        /**
         * Gets (as xml) the "startVertType" attribute
         */
        org.landxml.schema.landXML11.ZoneVertType xgetStartVertType();
        
        /**
         * Sets the "startVertType" attribute
         */
        void setStartVertType(org.landxml.schema.landXML11.ZoneVertType.Enum startVertType);
        
        /**
         * Sets (as xml) the "startVertType" attribute
         */
        void xsetStartVertType(org.landxml.schema.landXML11.ZoneVertType startVertType);
        
        /**
         * Gets the "endWidth" attribute
         */
        double getEndWidth();
        
        /**
         * Gets (as xml) the "endWidth" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetEndWidth();
        
        /**
         * True if has "endWidth" attribute
         */
        boolean isSetEndWidth();
        
        /**
         * Sets the "endWidth" attribute
         */
        void setEndWidth(double endWidth);
        
        /**
         * Sets (as xml) the "endWidth" attribute
         */
        void xsetEndWidth(org.apache.xmlbeans.XmlDouble endWidth);
        
        /**
         * Unsets the "endWidth" attribute
         */
        void unsetEndWidth();
        
        /**
         * Gets the "endVertValue" attribute
         */
        double getEndVertValue();
        
        /**
         * Gets (as xml) the "endVertValue" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetEndVertValue();
        
        /**
         * True if has "endVertValue" attribute
         */
        boolean isSetEndVertValue();
        
        /**
         * Sets the "endVertValue" attribute
         */
        void setEndVertValue(double endVertValue);
        
        /**
         * Sets (as xml) the "endVertValue" attribute
         */
        void xsetEndVertValue(org.apache.xmlbeans.XmlDouble endVertValue);
        
        /**
         * Unsets the "endVertValue" attribute
         */
        void unsetEndVertValue();
        
        /**
         * Gets the "endVertType" attribute
         */
        org.landxml.schema.landXML11.ZoneVertType.Enum getEndVertType();
        
        /**
         * Gets (as xml) the "endVertType" attribute
         */
        org.landxml.schema.landXML11.ZoneVertType xgetEndVertType();
        
        /**
         * True if has "endVertType" attribute
         */
        boolean isSetEndVertType();
        
        /**
         * Sets the "endVertType" attribute
         */
        void setEndVertType(org.landxml.schema.landXML11.ZoneVertType.Enum endVertType);
        
        /**
         * Sets (as xml) the "endVertType" attribute
         */
        void xsetEndVertType(org.landxml.schema.landXML11.ZoneVertType endVertType);
        
        /**
         * Unsets the "endVertType" attribute
         */
        void unsetEndVertType();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.ZoneDocument.Zone newInstance() {
              return (org.landxml.schema.landXML11.ZoneDocument.Zone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.ZoneDocument.Zone newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.ZoneDocument.Zone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.ZoneDocument newInstance() {
          return (org.landxml.schema.landXML11.ZoneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.ZoneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.ZoneDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.ZoneDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ZoneDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ZoneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ZoneDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ZoneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
