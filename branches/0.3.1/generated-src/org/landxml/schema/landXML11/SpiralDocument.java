/*
 * An XML document type.
 * Localname: Spiral
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.SpiralDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one Spiral(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface SpiralDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SpiralDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("spiral42c5doctype");
    
    /**
     * Gets the "Spiral" element
     */
    org.landxml.schema.landXML11.SpiralDocument.Spiral getSpiral();
    
    /**
     * Sets the "Spiral" element
     */
    void setSpiral(org.landxml.schema.landXML11.SpiralDocument.Spiral spiral);
    
    /**
     * Appends and returns a new empty "Spiral" element
     */
    org.landxml.schema.landXML11.SpiralDocument.Spiral addNewSpiral();
    
    /**
     * An XML Spiral(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface Spiral extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Spiral.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("spiral47f8elemtype");
        
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
         * Gets a List of "PI" elements
         */
        java.util.List<org.landxml.schema.landXML11.PointType> getPIList();
        
        /**
         * Gets array of all "PI" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.PointType[] getPIArray();
        
        /**
         * Gets ith "PI" element
         */
        org.landxml.schema.landXML11.PointType getPIArray(int i);
        
        /**
         * Returns number of "PI" element
         */
        int sizeOfPIArray();
        
        /**
         * Sets array of all "PI" element
         */
        void setPIArray(org.landxml.schema.landXML11.PointType[] piArray);
        
        /**
         * Sets ith "PI" element
         */
        void setPIArray(int i, org.landxml.schema.landXML11.PointType pi);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PI" element
         */
        org.landxml.schema.landXML11.PointType insertNewPI(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PI" element
         */
        org.landxml.schema.landXML11.PointType addNewPI();
        
        /**
         * Removes the ith "PI" element
         */
        void removePI(int i);
        
        /**
         * Gets a List of "End" elements
         */
        java.util.List<org.landxml.schema.landXML11.PointType> getEndList();
        
        /**
         * Gets array of all "End" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.PointType[] getEndArray();
        
        /**
         * Gets ith "End" element
         */
        org.landxml.schema.landXML11.PointType getEndArray(int i);
        
        /**
         * Returns number of "End" element
         */
        int sizeOfEndArray();
        
        /**
         * Sets array of all "End" element
         */
        void setEndArray(org.landxml.schema.landXML11.PointType[] endArray);
        
        /**
         * Sets ith "End" element
         */
        void setEndArray(int i, org.landxml.schema.landXML11.PointType end);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "End" element
         */
        org.landxml.schema.landXML11.PointType insertNewEnd(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "End" element
         */
        org.landxml.schema.landXML11.PointType addNewEnd();
        
        /**
         * Removes the ith "End" element
         */
        void removeEnd(int i);
        
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
         * Gets the "length" attribute
         */
        double getLength();
        
        /**
         * Gets (as xml) the "length" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetLength();
        
        /**
         * Sets the "length" attribute
         */
        void setLength(double length);
        
        /**
         * Sets (as xml) the "length" attribute
         */
        void xsetLength(org.apache.xmlbeans.XmlDouble length);
        
        /**
         * Gets the "radiusEnd" attribute
         */
        double getRadiusEnd();
        
        /**
         * Gets (as xml) the "radiusEnd" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetRadiusEnd();
        
        /**
         * Sets the "radiusEnd" attribute
         */
        void setRadiusEnd(double radiusEnd);
        
        /**
         * Sets (as xml) the "radiusEnd" attribute
         */
        void xsetRadiusEnd(org.apache.xmlbeans.XmlDouble radiusEnd);
        
        /**
         * Gets the "radiusStart" attribute
         */
        double getRadiusStart();
        
        /**
         * Gets (as xml) the "radiusStart" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetRadiusStart();
        
        /**
         * Sets the "radiusStart" attribute
         */
        void setRadiusStart(double radiusStart);
        
        /**
         * Sets (as xml) the "radiusStart" attribute
         */
        void xsetRadiusStart(org.apache.xmlbeans.XmlDouble radiusStart);
        
        /**
         * Gets the "rot" attribute
         */
        org.landxml.schema.landXML11.Clockwise.Enum getRot();
        
        /**
         * Gets (as xml) the "rot" attribute
         */
        org.landxml.schema.landXML11.Clockwise xgetRot();
        
        /**
         * Sets the "rot" attribute
         */
        void setRot(org.landxml.schema.landXML11.Clockwise.Enum rot);
        
        /**
         * Sets (as xml) the "rot" attribute
         */
        void xsetRot(org.landxml.schema.landXML11.Clockwise rot);
        
        /**
         * Gets the "spiType" attribute
         */
        org.landxml.schema.landXML11.SpiralType.Enum getSpiType();
        
        /**
         * Gets (as xml) the "spiType" attribute
         */
        org.landxml.schema.landXML11.SpiralType xgetSpiType();
        
        /**
         * Sets the "spiType" attribute
         */
        void setSpiType(org.landxml.schema.landXML11.SpiralType.Enum spiType);
        
        /**
         * Sets (as xml) the "spiType" attribute
         */
        void xsetSpiType(org.landxml.schema.landXML11.SpiralType spiType);
        
        /**
         * Gets the "chord" attribute
         */
        double getChord();
        
        /**
         * Gets (as xml) the "chord" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetChord();
        
        /**
         * True if has "chord" attribute
         */
        boolean isSetChord();
        
        /**
         * Sets the "chord" attribute
         */
        void setChord(double chord);
        
        /**
         * Sets (as xml) the "chord" attribute
         */
        void xsetChord(org.apache.xmlbeans.XmlDouble chord);
        
        /**
         * Unsets the "chord" attribute
         */
        void unsetChord();
        
        /**
         * Gets the "constant" attribute
         */
        double getConstant();
        
        /**
         * Gets (as xml) the "constant" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetConstant();
        
        /**
         * True if has "constant" attribute
         */
        boolean isSetConstant();
        
        /**
         * Sets the "constant" attribute
         */
        void setConstant(double constant);
        
        /**
         * Sets (as xml) the "constant" attribute
         */
        void xsetConstant(org.apache.xmlbeans.XmlDouble constant);
        
        /**
         * Unsets the "constant" attribute
         */
        void unsetConstant();
        
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
         * Gets the "dirEnd" attribute
         */
        double getDirEnd();
        
        /**
         * Gets (as xml) the "dirEnd" attribute
         */
        org.landxml.schema.landXML11.Direction xgetDirEnd();
        
        /**
         * True if has "dirEnd" attribute
         */
        boolean isSetDirEnd();
        
        /**
         * Sets the "dirEnd" attribute
         */
        void setDirEnd(double dirEnd);
        
        /**
         * Sets (as xml) the "dirEnd" attribute
         */
        void xsetDirEnd(org.landxml.schema.landXML11.Direction dirEnd);
        
        /**
         * Unsets the "dirEnd" attribute
         */
        void unsetDirEnd();
        
        /**
         * Gets the "dirStart" attribute
         */
        double getDirStart();
        
        /**
         * Gets (as xml) the "dirStart" attribute
         */
        org.landxml.schema.landXML11.Direction xgetDirStart();
        
        /**
         * True if has "dirStart" attribute
         */
        boolean isSetDirStart();
        
        /**
         * Sets the "dirStart" attribute
         */
        void setDirStart(double dirStart);
        
        /**
         * Sets (as xml) the "dirStart" attribute
         */
        void xsetDirStart(org.landxml.schema.landXML11.Direction dirStart);
        
        /**
         * Unsets the "dirStart" attribute
         */
        void unsetDirStart();
        
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
         * Gets the "theta" attribute
         */
        double getTheta();
        
        /**
         * Gets (as xml) the "theta" attribute
         */
        org.landxml.schema.landXML11.Angle xgetTheta();
        
        /**
         * True if has "theta" attribute
         */
        boolean isSetTheta();
        
        /**
         * Sets the "theta" attribute
         */
        void setTheta(double theta);
        
        /**
         * Sets (as xml) the "theta" attribute
         */
        void xsetTheta(org.landxml.schema.landXML11.Angle theta);
        
        /**
         * Unsets the "theta" attribute
         */
        void unsetTheta();
        
        /**
         * Gets the "totalY" attribute
         */
        double getTotalY();
        
        /**
         * Gets (as xml) the "totalY" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetTotalY();
        
        /**
         * True if has "totalY" attribute
         */
        boolean isSetTotalY();
        
        /**
         * Sets the "totalY" attribute
         */
        void setTotalY(double totalY);
        
        /**
         * Sets (as xml) the "totalY" attribute
         */
        void xsetTotalY(org.apache.xmlbeans.XmlDouble totalY);
        
        /**
         * Unsets the "totalY" attribute
         */
        void unsetTotalY();
        
        /**
         * Gets the "totalX" attribute
         */
        double getTotalX();
        
        /**
         * Gets (as xml) the "totalX" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetTotalX();
        
        /**
         * True if has "totalX" attribute
         */
        boolean isSetTotalX();
        
        /**
         * Sets the "totalX" attribute
         */
        void setTotalX(double totalX);
        
        /**
         * Sets (as xml) the "totalX" attribute
         */
        void xsetTotalX(org.apache.xmlbeans.XmlDouble totalX);
        
        /**
         * Unsets the "totalX" attribute
         */
        void unsetTotalX();
        
        /**
         * Gets the "staStart" attribute
         */
        double getStaStart();
        
        /**
         * Gets (as xml) the "staStart" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetStaStart();
        
        /**
         * True if has "staStart" attribute
         */
        boolean isSetStaStart();
        
        /**
         * Sets the "staStart" attribute
         */
        void setStaStart(double staStart);
        
        /**
         * Sets (as xml) the "staStart" attribute
         */
        void xsetStaStart(org.apache.xmlbeans.XmlDouble staStart);
        
        /**
         * Unsets the "staStart" attribute
         */
        void unsetStaStart();
        
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
         * Gets the "tanLong" attribute
         */
        double getTanLong();
        
        /**
         * Gets (as xml) the "tanLong" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetTanLong();
        
        /**
         * True if has "tanLong" attribute
         */
        boolean isSetTanLong();
        
        /**
         * Sets the "tanLong" attribute
         */
        void setTanLong(double tanLong);
        
        /**
         * Sets (as xml) the "tanLong" attribute
         */
        void xsetTanLong(org.apache.xmlbeans.XmlDouble tanLong);
        
        /**
         * Unsets the "tanLong" attribute
         */
        void unsetTanLong();
        
        /**
         * Gets the "tanShort" attribute
         */
        double getTanShort();
        
        /**
         * Gets (as xml) the "tanShort" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetTanShort();
        
        /**
         * True if has "tanShort" attribute
         */
        boolean isSetTanShort();
        
        /**
         * Sets the "tanShort" attribute
         */
        void setTanShort(double tanShort);
        
        /**
         * Sets (as xml) the "tanShort" attribute
         */
        void xsetTanShort(org.apache.xmlbeans.XmlDouble tanShort);
        
        /**
         * Unsets the "tanShort" attribute
         */
        void unsetTanShort();
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.SpiralDocument.Spiral newInstance() {
              return (org.landxml.schema.landXML11.SpiralDocument.Spiral) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.SpiralDocument.Spiral newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.SpiralDocument.Spiral) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.SpiralDocument newInstance() {
          return (org.landxml.schema.landXML11.SpiralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.SpiralDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.SpiralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.SpiralDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SpiralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.SpiralDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SpiralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.SpiralDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpiralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.SpiralDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpiralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.SpiralDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpiralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.SpiralDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpiralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.SpiralDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpiralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.SpiralDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpiralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.SpiralDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpiralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.SpiralDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpiralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.SpiralDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SpiralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.SpiralDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SpiralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.SpiralDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SpiralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.SpiralDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SpiralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.SpiralDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.SpiralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.SpiralDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.SpiralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
