/*
 * An XML document type.
 * Localname: Roadside
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.RoadsideDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one Roadside(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface RoadsideDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RoadsideDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("roadside7a8bdoctype");
    
    /**
     * Gets the "Roadside" element
     */
    org.landxml.schema.landXML11.RoadsideDocument.Roadside getRoadside();
    
    /**
     * Sets the "Roadside" element
     */
    void setRoadside(org.landxml.schema.landXML11.RoadsideDocument.Roadside roadside);
    
    /**
     * Appends and returns a new empty "Roadside" element
     */
    org.landxml.schema.landXML11.RoadsideDocument.Roadside addNewRoadside();
    
    /**
     * An XML Roadside(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface Roadside extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Roadside.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("roadside3338elemtype");
        
        /**
         * Gets a List of "ObstructionOffset" elements
         */
        java.util.List<org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset> getObstructionOffsetList();
        
        /**
         * Gets array of all "ObstructionOffset" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset[] getObstructionOffsetArray();
        
        /**
         * Gets ith "ObstructionOffset" element
         */
        org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset getObstructionOffsetArray(int i);
        
        /**
         * Returns number of "ObstructionOffset" element
         */
        int sizeOfObstructionOffsetArray();
        
        /**
         * Sets array of all "ObstructionOffset" element
         */
        void setObstructionOffsetArray(org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset[] obstructionOffsetArray);
        
        /**
         * Sets ith "ObstructionOffset" element
         */
        void setObstructionOffsetArray(int i, org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset obstructionOffset);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ObstructionOffset" element
         */
        org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset insertNewObstructionOffset(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ObstructionOffset" element
         */
        org.landxml.schema.landXML11.ObstructionOffsetDocument.ObstructionOffset addNewObstructionOffset();
        
        /**
         * Removes the ith "ObstructionOffset" element
         */
        void removeObstructionOffset(int i);
        
        /**
         * Gets a List of "BikeFacilities" elements
         */
        java.util.List<org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities> getBikeFacilitiesList();
        
        /**
         * Gets array of all "BikeFacilities" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities[] getBikeFacilitiesArray();
        
        /**
         * Gets ith "BikeFacilities" element
         */
        org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities getBikeFacilitiesArray(int i);
        
        /**
         * Returns number of "BikeFacilities" element
         */
        int sizeOfBikeFacilitiesArray();
        
        /**
         * Sets array of all "BikeFacilities" element
         */
        void setBikeFacilitiesArray(org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities[] bikeFacilitiesArray);
        
        /**
         * Sets ith "BikeFacilities" element
         */
        void setBikeFacilitiesArray(int i, org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities bikeFacilities);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BikeFacilities" element
         */
        org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities insertNewBikeFacilities(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BikeFacilities" element
         */
        org.landxml.schema.landXML11.BikeFacilitiesDocument.BikeFacilities addNewBikeFacilities();
        
        /**
         * Removes the ith "BikeFacilities" element
         */
        void removeBikeFacilities(int i);
        
        /**
         * Gets a List of "RoadSign" elements
         */
        java.util.List<org.landxml.schema.landXML11.RoadSignDocument.RoadSign> getRoadSignList();
        
        /**
         * Gets array of all "RoadSign" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.RoadSignDocument.RoadSign[] getRoadSignArray();
        
        /**
         * Gets ith "RoadSign" element
         */
        org.landxml.schema.landXML11.RoadSignDocument.RoadSign getRoadSignArray(int i);
        
        /**
         * Returns number of "RoadSign" element
         */
        int sizeOfRoadSignArray();
        
        /**
         * Sets array of all "RoadSign" element
         */
        void setRoadSignArray(org.landxml.schema.landXML11.RoadSignDocument.RoadSign[] roadSignArray);
        
        /**
         * Sets ith "RoadSign" element
         */
        void setRoadSignArray(int i, org.landxml.schema.landXML11.RoadSignDocument.RoadSign roadSign);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RoadSign" element
         */
        org.landxml.schema.landXML11.RoadSignDocument.RoadSign insertNewRoadSign(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RoadSign" element
         */
        org.landxml.schema.landXML11.RoadSignDocument.RoadSign addNewRoadSign();
        
        /**
         * Removes the ith "RoadSign" element
         */
        void removeRoadSign(int i);
        
        /**
         * Gets a List of "DrivewayDensity" elements
         */
        java.util.List<org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity> getDrivewayDensityList();
        
        /**
         * Gets array of all "DrivewayDensity" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity[] getDrivewayDensityArray();
        
        /**
         * Gets ith "DrivewayDensity" element
         */
        org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity getDrivewayDensityArray(int i);
        
        /**
         * Returns number of "DrivewayDensity" element
         */
        int sizeOfDrivewayDensityArray();
        
        /**
         * Sets array of all "DrivewayDensity" element
         */
        void setDrivewayDensityArray(org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity[] drivewayDensityArray);
        
        /**
         * Sets ith "DrivewayDensity" element
         */
        void setDrivewayDensityArray(int i, org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity drivewayDensity);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DrivewayDensity" element
         */
        org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity insertNewDrivewayDensity(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DrivewayDensity" element
         */
        org.landxml.schema.landXML11.DrivewayDensityDocument.DrivewayDensity addNewDrivewayDensity();
        
        /**
         * Removes the ith "DrivewayDensity" element
         */
        void removeDrivewayDensity(int i);
        
        /**
         * Gets a List of "HazardRating" elements
         */
        java.util.List<org.landxml.schema.landXML11.HazardRatingDocument.HazardRating> getHazardRatingList();
        
        /**
         * Gets array of all "HazardRating" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.HazardRatingDocument.HazardRating[] getHazardRatingArray();
        
        /**
         * Gets ith "HazardRating" element
         */
        org.landxml.schema.landXML11.HazardRatingDocument.HazardRating getHazardRatingArray(int i);
        
        /**
         * Returns number of "HazardRating" element
         */
        int sizeOfHazardRatingArray();
        
        /**
         * Sets array of all "HazardRating" element
         */
        void setHazardRatingArray(org.landxml.schema.landXML11.HazardRatingDocument.HazardRating[] hazardRatingArray);
        
        /**
         * Sets ith "HazardRating" element
         */
        void setHazardRatingArray(int i, org.landxml.schema.landXML11.HazardRatingDocument.HazardRating hazardRating);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "HazardRating" element
         */
        org.landxml.schema.landXML11.HazardRatingDocument.HazardRating insertNewHazardRating(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "HazardRating" element
         */
        org.landxml.schema.landXML11.HazardRatingDocument.HazardRating addNewHazardRating();
        
        /**
         * Removes the ith "HazardRating" element
         */
        void removeHazardRating(int i);
        
        /**
         * Gets a List of "Ditch" elements
         */
        java.util.List<org.landxml.schema.landXML11.DitchDocument.Ditch> getDitchList();
        
        /**
         * Gets array of all "Ditch" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.DitchDocument.Ditch[] getDitchArray();
        
        /**
         * Gets ith "Ditch" element
         */
        org.landxml.schema.landXML11.DitchDocument.Ditch getDitchArray(int i);
        
        /**
         * Returns number of "Ditch" element
         */
        int sizeOfDitchArray();
        
        /**
         * Sets array of all "Ditch" element
         */
        void setDitchArray(org.landxml.schema.landXML11.DitchDocument.Ditch[] ditchArray);
        
        /**
         * Sets ith "Ditch" element
         */
        void setDitchArray(int i, org.landxml.schema.landXML11.DitchDocument.Ditch ditch);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Ditch" element
         */
        org.landxml.schema.landXML11.DitchDocument.Ditch insertNewDitch(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Ditch" element
         */
        org.landxml.schema.landXML11.DitchDocument.Ditch addNewDitch();
        
        /**
         * Removes the ith "Ditch" element
         */
        void removeDitch(int i);
        
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
            public static org.landxml.schema.landXML11.RoadsideDocument.Roadside newInstance() {
              return (org.landxml.schema.landXML11.RoadsideDocument.Roadside) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.RoadsideDocument.Roadside newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.RoadsideDocument.Roadside) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.RoadsideDocument newInstance() {
          return (org.landxml.schema.landXML11.RoadsideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.RoadsideDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.RoadsideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.RoadsideDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RoadsideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadsideDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RoadsideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.RoadsideDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadsideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadsideDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadsideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.RoadsideDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadsideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadsideDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadsideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.RoadsideDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadsideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadsideDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadsideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.RoadsideDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadsideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadsideDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RoadsideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.RoadsideDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RoadsideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadsideDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RoadsideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.RoadsideDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RoadsideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.RoadsideDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RoadsideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.RoadsideDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.RoadsideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.RoadsideDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.RoadsideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
