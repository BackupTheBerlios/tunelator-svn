/*
 * An XML document type.
 * Localname: LocationAddress
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.LocationAddressDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one LocationAddress(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface LocationAddressDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocationAddressDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("locationaddress83c1doctype");
    
    /**
     * Gets the "LocationAddress" element
     */
    org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress getLocationAddress();
    
    /**
     * Sets the "LocationAddress" element
     */
    void setLocationAddress(org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress locationAddress);
    
    /**
     * Appends and returns a new empty "LocationAddress" element
     */
    org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress addNewLocationAddress();
    
    /**
     * An XML LocationAddress(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface LocationAddress extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocationAddress.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("locationaddressa40celemtype");
        
        /**
         * Gets a List of "ComplexName" elements
         */
        java.util.List<org.landxml.schema.landXML11.ComplexNameDocument.ComplexName> getComplexNameList();
        
        /**
         * Gets array of all "ComplexName" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ComplexNameDocument.ComplexName[] getComplexNameArray();
        
        /**
         * Gets ith "ComplexName" element
         */
        org.landxml.schema.landXML11.ComplexNameDocument.ComplexName getComplexNameArray(int i);
        
        /**
         * Returns number of "ComplexName" element
         */
        int sizeOfComplexNameArray();
        
        /**
         * Sets array of all "ComplexName" element
         */
        void setComplexNameArray(org.landxml.schema.landXML11.ComplexNameDocument.ComplexName[] complexNameArray);
        
        /**
         * Sets ith "ComplexName" element
         */
        void setComplexNameArray(int i, org.landxml.schema.landXML11.ComplexNameDocument.ComplexName complexName);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ComplexName" element
         */
        org.landxml.schema.landXML11.ComplexNameDocument.ComplexName insertNewComplexName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ComplexName" element
         */
        org.landxml.schema.landXML11.ComplexNameDocument.ComplexName addNewComplexName();
        
        /**
         * Removes the ith "ComplexName" element
         */
        void removeComplexName(int i);
        
        /**
         * Gets a List of "RoadName" elements
         */
        java.util.List<org.landxml.schema.landXML11.RoadNameDocument.RoadName> getRoadNameList();
        
        /**
         * Gets array of all "RoadName" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.RoadNameDocument.RoadName[] getRoadNameArray();
        
        /**
         * Gets ith "RoadName" element
         */
        org.landxml.schema.landXML11.RoadNameDocument.RoadName getRoadNameArray(int i);
        
        /**
         * Returns number of "RoadName" element
         */
        int sizeOfRoadNameArray();
        
        /**
         * Sets array of all "RoadName" element
         */
        void setRoadNameArray(org.landxml.schema.landXML11.RoadNameDocument.RoadName[] roadNameArray);
        
        /**
         * Sets ith "RoadName" element
         */
        void setRoadNameArray(int i, org.landxml.schema.landXML11.RoadNameDocument.RoadName roadName);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RoadName" element
         */
        org.landxml.schema.landXML11.RoadNameDocument.RoadName insertNewRoadName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RoadName" element
         */
        org.landxml.schema.landXML11.RoadNameDocument.RoadName addNewRoadName();
        
        /**
         * Removes the ith "RoadName" element
         */
        void removeRoadName(int i);
        
        /**
         * Gets a List of "AdministrativeArea" elements
         */
        java.util.List<org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea> getAdministrativeAreaList();
        
        /**
         * Gets array of all "AdministrativeArea" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea[] getAdministrativeAreaArray();
        
        /**
         * Gets ith "AdministrativeArea" element
         */
        org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea getAdministrativeAreaArray(int i);
        
        /**
         * Returns number of "AdministrativeArea" element
         */
        int sizeOfAdministrativeAreaArray();
        
        /**
         * Sets array of all "AdministrativeArea" element
         */
        void setAdministrativeAreaArray(org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea[] administrativeAreaArray);
        
        /**
         * Sets ith "AdministrativeArea" element
         */
        void setAdministrativeAreaArray(int i, org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea administrativeArea);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AdministrativeArea" element
         */
        org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea insertNewAdministrativeArea(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AdministrativeArea" element
         */
        org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea addNewAdministrativeArea();
        
        /**
         * Removes the ith "AdministrativeArea" element
         */
        void removeAdministrativeArea(int i);
        
        /**
         * Gets a List of "AddressPoint" elements
         */
        java.util.List<org.landxml.schema.landXML11.AddressPointDocument.AddressPoint> getAddressPointList();
        
        /**
         * Gets array of all "AddressPoint" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.AddressPointDocument.AddressPoint[] getAddressPointArray();
        
        /**
         * Gets ith "AddressPoint" element
         */
        org.landxml.schema.landXML11.AddressPointDocument.AddressPoint getAddressPointArray(int i);
        
        /**
         * Returns number of "AddressPoint" element
         */
        int sizeOfAddressPointArray();
        
        /**
         * Sets array of all "AddressPoint" element
         */
        void setAddressPointArray(org.landxml.schema.landXML11.AddressPointDocument.AddressPoint[] addressPointArray);
        
        /**
         * Sets ith "AddressPoint" element
         */
        void setAddressPointArray(int i, org.landxml.schema.landXML11.AddressPointDocument.AddressPoint addressPoint);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AddressPoint" element
         */
        org.landxml.schema.landXML11.AddressPointDocument.AddressPoint insertNewAddressPoint(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AddressPoint" element
         */
        org.landxml.schema.landXML11.AddressPointDocument.AddressPoint addNewAddressPoint();
        
        /**
         * Removes the ith "AddressPoint" element
         */
        void removeAddressPoint(int i);
        
        /**
         * Gets the "addressType" attribute
         */
        java.lang.String getAddressType();
        
        /**
         * Gets (as xml) the "addressType" attribute
         */
        org.landxml.schema.landXML11.AddressTypeType xgetAddressType();
        
        /**
         * True if has "addressType" attribute
         */
        boolean isSetAddressType();
        
        /**
         * Sets the "addressType" attribute
         */
        void setAddressType(java.lang.String addressType);
        
        /**
         * Sets (as xml) the "addressType" attribute
         */
        void xsetAddressType(org.landxml.schema.landXML11.AddressTypeType addressType);
        
        /**
         * Unsets the "addressType" attribute
         */
        void unsetAddressType();
        
        /**
         * Gets the "flatType" attribute
         */
        java.lang.String getFlatType();
        
        /**
         * Gets (as xml) the "flatType" attribute
         */
        org.landxml.schema.landXML11.FlatTypeType xgetFlatType();
        
        /**
         * True if has "flatType" attribute
         */
        boolean isSetFlatType();
        
        /**
         * Sets the "flatType" attribute
         */
        void setFlatType(java.lang.String flatType);
        
        /**
         * Sets (as xml) the "flatType" attribute
         */
        void xsetFlatType(org.landxml.schema.landXML11.FlatTypeType flatType);
        
        /**
         * Unsets the "flatType" attribute
         */
        void unsetFlatType();
        
        /**
         * Gets the "flatNumber" attribute
         */
        java.lang.String getFlatNumber();
        
        /**
         * Gets (as xml) the "flatNumber" attribute
         */
        org.apache.xmlbeans.XmlString xgetFlatNumber();
        
        /**
         * True if has "flatNumber" attribute
         */
        boolean isSetFlatNumber();
        
        /**
         * Sets the "flatNumber" attribute
         */
        void setFlatNumber(java.lang.String flatNumber);
        
        /**
         * Sets (as xml) the "flatNumber" attribute
         */
        void xsetFlatNumber(org.apache.xmlbeans.XmlString flatNumber);
        
        /**
         * Unsets the "flatNumber" attribute
         */
        void unsetFlatNumber();
        
        /**
         * Gets the "floorLevelType" attribute
         */
        java.lang.String getFloorLevelType();
        
        /**
         * Gets (as xml) the "floorLevelType" attribute
         */
        org.landxml.schema.landXML11.FloorLevelTypeType xgetFloorLevelType();
        
        /**
         * True if has "floorLevelType" attribute
         */
        boolean isSetFloorLevelType();
        
        /**
         * Sets the "floorLevelType" attribute
         */
        void setFloorLevelType(java.lang.String floorLevelType);
        
        /**
         * Sets (as xml) the "floorLevelType" attribute
         */
        void xsetFloorLevelType(org.landxml.schema.landXML11.FloorLevelTypeType floorLevelType);
        
        /**
         * Unsets the "floorLevelType" attribute
         */
        void unsetFloorLevelType();
        
        /**
         * Gets the "floorLevelNumber" attribute
         */
        java.lang.String getFloorLevelNumber();
        
        /**
         * Gets (as xml) the "floorLevelNumber" attribute
         */
        org.apache.xmlbeans.XmlString xgetFloorLevelNumber();
        
        /**
         * True if has "floorLevelNumber" attribute
         */
        boolean isSetFloorLevelNumber();
        
        /**
         * Sets the "floorLevelNumber" attribute
         */
        void setFloorLevelNumber(java.lang.String floorLevelNumber);
        
        /**
         * Sets (as xml) the "floorLevelNumber" attribute
         */
        void xsetFloorLevelNumber(org.apache.xmlbeans.XmlString floorLevelNumber);
        
        /**
         * Unsets the "floorLevelNumber" attribute
         */
        void unsetFloorLevelNumber();
        
        /**
         * Gets the "numberFirst" attribute
         */
        int getNumberFirst();
        
        /**
         * Gets (as xml) the "numberFirst" attribute
         */
        org.apache.xmlbeans.XmlInt xgetNumberFirst();
        
        /**
         * True if has "numberFirst" attribute
         */
        boolean isSetNumberFirst();
        
        /**
         * Sets the "numberFirst" attribute
         */
        void setNumberFirst(int numberFirst);
        
        /**
         * Sets (as xml) the "numberFirst" attribute
         */
        void xsetNumberFirst(org.apache.xmlbeans.XmlInt numberFirst);
        
        /**
         * Unsets the "numberFirst" attribute
         */
        void unsetNumberFirst();
        
        /**
         * Gets the "numberSuffixFirst" attribute
         */
        java.lang.String getNumberSuffixFirst();
        
        /**
         * Gets (as xml) the "numberSuffixFirst" attribute
         */
        org.apache.xmlbeans.XmlString xgetNumberSuffixFirst();
        
        /**
         * True if has "numberSuffixFirst" attribute
         */
        boolean isSetNumberSuffixFirst();
        
        /**
         * Sets the "numberSuffixFirst" attribute
         */
        void setNumberSuffixFirst(java.lang.String numberSuffixFirst);
        
        /**
         * Sets (as xml) the "numberSuffixFirst" attribute
         */
        void xsetNumberSuffixFirst(org.apache.xmlbeans.XmlString numberSuffixFirst);
        
        /**
         * Unsets the "numberSuffixFirst" attribute
         */
        void unsetNumberSuffixFirst();
        
        /**
         * Gets the "numberLast" attribute
         */
        int getNumberLast();
        
        /**
         * Gets (as xml) the "numberLast" attribute
         */
        org.apache.xmlbeans.XmlInt xgetNumberLast();
        
        /**
         * True if has "numberLast" attribute
         */
        boolean isSetNumberLast();
        
        /**
         * Sets the "numberLast" attribute
         */
        void setNumberLast(int numberLast);
        
        /**
         * Sets (as xml) the "numberLast" attribute
         */
        void xsetNumberLast(org.apache.xmlbeans.XmlInt numberLast);
        
        /**
         * Unsets the "numberLast" attribute
         */
        void unsetNumberLast();
        
        /**
         * Gets the "numberSuffixLast" attribute
         */
        java.lang.String getNumberSuffixLast();
        
        /**
         * Gets (as xml) the "numberSuffixLast" attribute
         */
        org.apache.xmlbeans.XmlString xgetNumberSuffixLast();
        
        /**
         * True if has "numberSuffixLast" attribute
         */
        boolean isSetNumberSuffixLast();
        
        /**
         * Sets the "numberSuffixLast" attribute
         */
        void setNumberSuffixLast(java.lang.String numberSuffixLast);
        
        /**
         * Sets (as xml) the "numberSuffixLast" attribute
         */
        void xsetNumberSuffixLast(org.apache.xmlbeans.XmlString numberSuffixLast);
        
        /**
         * Unsets the "numberSuffixLast" attribute
         */
        void unsetNumberSuffixLast();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress newInstance() {
              return (org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.LocationAddressDocument newInstance() {
          return (org.landxml.schema.landXML11.LocationAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.LocationAddressDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.LocationAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.LocationAddressDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.LocationAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.LocationAddressDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.LocationAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.LocationAddressDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LocationAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.LocationAddressDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LocationAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.LocationAddressDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LocationAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.LocationAddressDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LocationAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.LocationAddressDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LocationAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.LocationAddressDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LocationAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.LocationAddressDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LocationAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.LocationAddressDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LocationAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.LocationAddressDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.LocationAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.LocationAddressDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.LocationAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.LocationAddressDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.LocationAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.LocationAddressDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.LocationAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.LocationAddressDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.LocationAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.LocationAddressDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.LocationAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
