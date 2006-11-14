/*
 * An XML document type.
 * Localname: Lanes
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.LanesDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one Lanes(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface LanesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LanesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("lanes4409doctype");
    
    /**
     * Gets the "Lanes" element
     */
    org.landxml.schema.landXML11.LanesDocument.Lanes getLanes();
    
    /**
     * Sets the "Lanes" element
     */
    void setLanes(org.landxml.schema.landXML11.LanesDocument.Lanes lanes);
    
    /**
     * Appends and returns a new empty "Lanes" element
     */
    org.landxml.schema.landXML11.LanesDocument.Lanes addNewLanes();
    
    /**
     * An XML Lanes(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface Lanes extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Lanes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("lanesbb9celemtype");
        
        /**
         * Gets a List of "ThruLane" elements
         */
        java.util.List<org.landxml.schema.landXML11.ThruLaneDocument.ThruLane> getThruLaneList();
        
        /**
         * Gets array of all "ThruLane" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ThruLaneDocument.ThruLane[] getThruLaneArray();
        
        /**
         * Gets ith "ThruLane" element
         */
        org.landxml.schema.landXML11.ThruLaneDocument.ThruLane getThruLaneArray(int i);
        
        /**
         * Returns number of "ThruLane" element
         */
        int sizeOfThruLaneArray();
        
        /**
         * Sets array of all "ThruLane" element
         */
        void setThruLaneArray(org.landxml.schema.landXML11.ThruLaneDocument.ThruLane[] thruLaneArray);
        
        /**
         * Sets ith "ThruLane" element
         */
        void setThruLaneArray(int i, org.landxml.schema.landXML11.ThruLaneDocument.ThruLane thruLane);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ThruLane" element
         */
        org.landxml.schema.landXML11.ThruLaneDocument.ThruLane insertNewThruLane(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ThruLane" element
         */
        org.landxml.schema.landXML11.ThruLaneDocument.ThruLane addNewThruLane();
        
        /**
         * Removes the ith "ThruLane" element
         */
        void removeThruLane(int i);
        
        /**
         * Gets a List of "PassingLane" elements
         */
        java.util.List<org.landxml.schema.landXML11.PassingLaneDocument.PassingLane> getPassingLaneList();
        
        /**
         * Gets array of all "PassingLane" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.PassingLaneDocument.PassingLane[] getPassingLaneArray();
        
        /**
         * Gets ith "PassingLane" element
         */
        org.landxml.schema.landXML11.PassingLaneDocument.PassingLane getPassingLaneArray(int i);
        
        /**
         * Returns number of "PassingLane" element
         */
        int sizeOfPassingLaneArray();
        
        /**
         * Sets array of all "PassingLane" element
         */
        void setPassingLaneArray(org.landxml.schema.landXML11.PassingLaneDocument.PassingLane[] passingLaneArray);
        
        /**
         * Sets ith "PassingLane" element
         */
        void setPassingLaneArray(int i, org.landxml.schema.landXML11.PassingLaneDocument.PassingLane passingLane);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PassingLane" element
         */
        org.landxml.schema.landXML11.PassingLaneDocument.PassingLane insertNewPassingLane(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PassingLane" element
         */
        org.landxml.schema.landXML11.PassingLaneDocument.PassingLane addNewPassingLane();
        
        /**
         * Removes the ith "PassingLane" element
         */
        void removePassingLane(int i);
        
        /**
         * Gets a List of "TurnLane" elements
         */
        java.util.List<org.landxml.schema.landXML11.TurnLaneDocument.TurnLane> getTurnLaneList();
        
        /**
         * Gets array of all "TurnLane" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.TurnLaneDocument.TurnLane[] getTurnLaneArray();
        
        /**
         * Gets ith "TurnLane" element
         */
        org.landxml.schema.landXML11.TurnLaneDocument.TurnLane getTurnLaneArray(int i);
        
        /**
         * Returns number of "TurnLane" element
         */
        int sizeOfTurnLaneArray();
        
        /**
         * Sets array of all "TurnLane" element
         */
        void setTurnLaneArray(org.landxml.schema.landXML11.TurnLaneDocument.TurnLane[] turnLaneArray);
        
        /**
         * Sets ith "TurnLane" element
         */
        void setTurnLaneArray(int i, org.landxml.schema.landXML11.TurnLaneDocument.TurnLane turnLane);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TurnLane" element
         */
        org.landxml.schema.landXML11.TurnLaneDocument.TurnLane insertNewTurnLane(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TurnLane" element
         */
        org.landxml.schema.landXML11.TurnLaneDocument.TurnLane addNewTurnLane();
        
        /**
         * Removes the ith "TurnLane" element
         */
        void removeTurnLane(int i);
        
        /**
         * Gets a List of "TwoWayLeftTurnLane" elements
         */
        java.util.List<org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane> getTwoWayLeftTurnLaneList();
        
        /**
         * Gets array of all "TwoWayLeftTurnLane" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane[] getTwoWayLeftTurnLaneArray();
        
        /**
         * Gets ith "TwoWayLeftTurnLane" element
         */
        org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane getTwoWayLeftTurnLaneArray(int i);
        
        /**
         * Returns number of "TwoWayLeftTurnLane" element
         */
        int sizeOfTwoWayLeftTurnLaneArray();
        
        /**
         * Sets array of all "TwoWayLeftTurnLane" element
         */
        void setTwoWayLeftTurnLaneArray(org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane[] twoWayLeftTurnLaneArray);
        
        /**
         * Sets ith "TwoWayLeftTurnLane" element
         */
        void setTwoWayLeftTurnLaneArray(int i, org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane twoWayLeftTurnLane);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TwoWayLeftTurnLane" element
         */
        org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane insertNewTwoWayLeftTurnLane(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TwoWayLeftTurnLane" element
         */
        org.landxml.schema.landXML11.TwoWayLeftTurnLaneDocument.TwoWayLeftTurnLane addNewTwoWayLeftTurnLane();
        
        /**
         * Removes the ith "TwoWayLeftTurnLane" element
         */
        void removeTwoWayLeftTurnLane(int i);
        
        /**
         * Gets a List of "ClimbLane" elements
         */
        java.util.List<org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane> getClimbLaneList();
        
        /**
         * Gets array of all "ClimbLane" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane[] getClimbLaneArray();
        
        /**
         * Gets ith "ClimbLane" element
         */
        org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane getClimbLaneArray(int i);
        
        /**
         * Returns number of "ClimbLane" element
         */
        int sizeOfClimbLaneArray();
        
        /**
         * Sets array of all "ClimbLane" element
         */
        void setClimbLaneArray(org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane[] climbLaneArray);
        
        /**
         * Sets ith "ClimbLane" element
         */
        void setClimbLaneArray(int i, org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane climbLane);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ClimbLane" element
         */
        org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane insertNewClimbLane(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ClimbLane" element
         */
        org.landxml.schema.landXML11.ClimbLaneDocument.ClimbLane addNewClimbLane();
        
        /**
         * Removes the ith "ClimbLane" element
         */
        void removeClimbLane(int i);
        
        /**
         * Gets a List of "OffsetLane" elements
         */
        java.util.List<org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane> getOffsetLaneList();
        
        /**
         * Gets array of all "OffsetLane" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane[] getOffsetLaneArray();
        
        /**
         * Gets ith "OffsetLane" element
         */
        org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane getOffsetLaneArray(int i);
        
        /**
         * Returns number of "OffsetLane" element
         */
        int sizeOfOffsetLaneArray();
        
        /**
         * Sets array of all "OffsetLane" element
         */
        void setOffsetLaneArray(org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane[] offsetLaneArray);
        
        /**
         * Sets ith "OffsetLane" element
         */
        void setOffsetLaneArray(int i, org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane offsetLane);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OffsetLane" element
         */
        org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane insertNewOffsetLane(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OffsetLane" element
         */
        org.landxml.schema.landXML11.OffsetLaneDocument.OffsetLane addNewOffsetLane();
        
        /**
         * Removes the ith "OffsetLane" element
         */
        void removeOffsetLane(int i);
        
        /**
         * Gets a List of "WideningLane" elements
         */
        java.util.List<org.landxml.schema.landXML11.WideningLaneDocument.WideningLane> getWideningLaneList();
        
        /**
         * Gets array of all "WideningLane" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.WideningLaneDocument.WideningLane[] getWideningLaneArray();
        
        /**
         * Gets ith "WideningLane" element
         */
        org.landxml.schema.landXML11.WideningLaneDocument.WideningLane getWideningLaneArray(int i);
        
        /**
         * Returns number of "WideningLane" element
         */
        int sizeOfWideningLaneArray();
        
        /**
         * Sets array of all "WideningLane" element
         */
        void setWideningLaneArray(org.landxml.schema.landXML11.WideningLaneDocument.WideningLane[] wideningLaneArray);
        
        /**
         * Sets ith "WideningLane" element
         */
        void setWideningLaneArray(int i, org.landxml.schema.landXML11.WideningLaneDocument.WideningLane wideningLane);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "WideningLane" element
         */
        org.landxml.schema.landXML11.WideningLaneDocument.WideningLane insertNewWideningLane(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "WideningLane" element
         */
        org.landxml.schema.landXML11.WideningLaneDocument.WideningLane addNewWideningLane();
        
        /**
         * Removes the ith "WideningLane" element
         */
        void removeWideningLane(int i);
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.LanesDocument.Lanes newInstance() {
              return (org.landxml.schema.landXML11.LanesDocument.Lanes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.LanesDocument.Lanes newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.LanesDocument.Lanes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.LanesDocument newInstance() {
          return (org.landxml.schema.landXML11.LanesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.LanesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.LanesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.LanesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.LanesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.LanesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.LanesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.LanesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LanesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.LanesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LanesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.LanesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LanesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.LanesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LanesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.LanesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LanesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.LanesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LanesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.LanesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LanesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.LanesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LanesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.LanesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.LanesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.LanesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.LanesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.LanesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.LanesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.LanesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.LanesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.LanesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.LanesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.LanesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.LanesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
