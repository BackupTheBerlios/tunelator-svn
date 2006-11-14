/*
 * An XML document type.
 * Localname: CgPoints
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CgPointsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one CgPoints(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface CgPointsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CgPointsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("cgpointsbc7bdoctype");
    
    /**
     * Gets the "CgPoints" element
     */
    org.landxml.schema.landXML11.CgPointsDocument.CgPoints getCgPoints();
    
    /**
     * Sets the "CgPoints" element
     */
    void setCgPoints(org.landxml.schema.landXML11.CgPointsDocument.CgPoints cgPoints);
    
    /**
     * Appends and returns a new empty "CgPoints" element
     */
    org.landxml.schema.landXML11.CgPointsDocument.CgPoints addNewCgPoints();
    
    /**
     * An XML CgPoints(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface CgPoints extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CgPoints.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("cgpoints9d38elemtype");
        
        /**
         * Gets a List of "CgPoint" elements
         */
        java.util.List<org.landxml.schema.landXML11.CgPointDocument.CgPoint> getCgPointList();
        
        /**
         * Gets array of all "CgPoint" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.CgPointDocument.CgPoint[] getCgPointArray();
        
        /**
         * Gets ith "CgPoint" element
         */
        org.landxml.schema.landXML11.CgPointDocument.CgPoint getCgPointArray(int i);
        
        /**
         * Returns number of "CgPoint" element
         */
        int sizeOfCgPointArray();
        
        /**
         * Sets array of all "CgPoint" element
         */
        void setCgPointArray(org.landxml.schema.landXML11.CgPointDocument.CgPoint[] cgPointArray);
        
        /**
         * Sets ith "CgPoint" element
         */
        void setCgPointArray(int i, org.landxml.schema.landXML11.CgPointDocument.CgPoint cgPoint);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CgPoint" element
         */
        org.landxml.schema.landXML11.CgPointDocument.CgPoint insertNewCgPoint(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CgPoint" element
         */
        org.landxml.schema.landXML11.CgPointDocument.CgPoint addNewCgPoint();
        
        /**
         * Removes the ith "CgPoint" element
         */
        void removeCgPoint(int i);
        
        /**
         * Gets a List of "CgPoints" elements
         */
        java.util.List<org.landxml.schema.landXML11.CgPointsDocument.CgPoints> getCgPointsList();
        
        /**
         * Gets array of all "CgPoints" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.CgPointsDocument.CgPoints[] getCgPointsArray();
        
        /**
         * Gets ith "CgPoints" element
         */
        org.landxml.schema.landXML11.CgPointsDocument.CgPoints getCgPointsArray(int i);
        
        /**
         * Returns number of "CgPoints" element
         */
        int sizeOfCgPointsArray();
        
        /**
         * Sets array of all "CgPoints" element
         */
        void setCgPointsArray(org.landxml.schema.landXML11.CgPointsDocument.CgPoints[] cgPointsArray);
        
        /**
         * Sets ith "CgPoints" element
         */
        void setCgPointsArray(int i, org.landxml.schema.landXML11.CgPointsDocument.CgPoints cgPoints);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CgPoints" element
         */
        org.landxml.schema.landXML11.CgPointsDocument.CgPoints insertNewCgPoints(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CgPoints" element
         */
        org.landxml.schema.landXML11.CgPointsDocument.CgPoints addNewCgPoints();
        
        /**
         * Removes the ith "CgPoints" element
         */
        void removeCgPoints(int i);
        
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
         * Gets the "code" attribute
         */
        java.lang.String getCode();
        
        /**
         * Gets (as xml) the "code" attribute
         */
        org.apache.xmlbeans.XmlString xgetCode();
        
        /**
         * True if has "code" attribute
         */
        boolean isSetCode();
        
        /**
         * Sets the "code" attribute
         */
        void setCode(java.lang.String code);
        
        /**
         * Sets (as xml) the "code" attribute
         */
        void xsetCode(org.apache.xmlbeans.XmlString code);
        
        /**
         * Unsets the "code" attribute
         */
        void unsetCode();
        
        /**
         * Gets the "zoneNumber" attribute
         */
        int getZoneNumber();
        
        /**
         * Gets (as xml) the "zoneNumber" attribute
         */
        org.landxml.schema.landXML11.ZoneNumberType xgetZoneNumber();
        
        /**
         * True if has "zoneNumber" attribute
         */
        boolean isSetZoneNumber();
        
        /**
         * Sets the "zoneNumber" attribute
         */
        void setZoneNumber(int zoneNumber);
        
        /**
         * Sets (as xml) the "zoneNumber" attribute
         */
        void xsetZoneNumber(org.landxml.schema.landXML11.ZoneNumberType zoneNumber);
        
        /**
         * Unsets the "zoneNumber" attribute
         */
        void unsetZoneNumber();
        
        /**
         * Gets the "DTMAttribute" attribute
         */
        org.landxml.schema.landXML11.DTMAttributeType.Enum getDTMAttribute();
        
        /**
         * Gets (as xml) the "DTMAttribute" attribute
         */
        org.landxml.schema.landXML11.DTMAttributeType xgetDTMAttribute();
        
        /**
         * True if has "DTMAttribute" attribute
         */
        boolean isSetDTMAttribute();
        
        /**
         * Sets the "DTMAttribute" attribute
         */
        void setDTMAttribute(org.landxml.schema.landXML11.DTMAttributeType.Enum dtmAttribute);
        
        /**
         * Sets (as xml) the "DTMAttribute" attribute
         */
        void xsetDTMAttribute(org.landxml.schema.landXML11.DTMAttributeType dtmAttribute);
        
        /**
         * Unsets the "DTMAttribute" attribute
         */
        void unsetDTMAttribute();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.CgPointsDocument.CgPoints newInstance() {
              return (org.landxml.schema.landXML11.CgPointsDocument.CgPoints) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.CgPointsDocument.CgPoints newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.CgPointsDocument.CgPoints) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.CgPointsDocument newInstance() {
          return (org.landxml.schema.landXML11.CgPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.CgPointsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.CgPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.CgPointsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CgPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.CgPointsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CgPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.CgPointsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CgPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.CgPointsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CgPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.CgPointsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CgPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.CgPointsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CgPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.CgPointsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CgPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.CgPointsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CgPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.CgPointsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CgPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.CgPointsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CgPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.CgPointsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CgPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.CgPointsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CgPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.CgPointsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CgPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.CgPointsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CgPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CgPointsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CgPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CgPointsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CgPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
