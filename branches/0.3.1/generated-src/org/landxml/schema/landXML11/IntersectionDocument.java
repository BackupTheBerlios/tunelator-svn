/*
 * An XML document type.
 * Localname: Intersection
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.IntersectionDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one Intersection(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface IntersectionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IntersectionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("intersection4d9ddoctype");
    
    /**
     * Gets the "Intersection" element
     */
    org.landxml.schema.landXML11.IntersectionDocument.Intersection getIntersection();
    
    /**
     * Sets the "Intersection" element
     */
    void setIntersection(org.landxml.schema.landXML11.IntersectionDocument.Intersection intersection);
    
    /**
     * Appends and returns a new empty "Intersection" element
     */
    org.landxml.schema.landXML11.IntersectionDocument.Intersection addNewIntersection();
    
    /**
     * An XML Intersection(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface Intersection extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Intersection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("intersection85f8elemtype");
        
        /**
         * Gets a List of "TrafficControl" elements
         */
        java.util.List<org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl> getTrafficControlList();
        
        /**
         * Gets array of all "TrafficControl" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl[] getTrafficControlArray();
        
        /**
         * Gets ith "TrafficControl" element
         */
        org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl getTrafficControlArray(int i);
        
        /**
         * Returns number of "TrafficControl" element
         */
        int sizeOfTrafficControlArray();
        
        /**
         * Sets array of all "TrafficControl" element
         */
        void setTrafficControlArray(org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl[] trafficControlArray);
        
        /**
         * Sets ith "TrafficControl" element
         */
        void setTrafficControlArray(int i, org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl trafficControl);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TrafficControl" element
         */
        org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl insertNewTrafficControl(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TrafficControl" element
         */
        org.landxml.schema.landXML11.TrafficControlDocument.TrafficControl addNewTrafficControl();
        
        /**
         * Removes the ith "TrafficControl" element
         */
        void removeTrafficControl(int i);
        
        /**
         * Gets a List of "Timing" elements
         */
        java.util.List<org.landxml.schema.landXML11.TimingDocument.Timing> getTimingList();
        
        /**
         * Gets array of all "Timing" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.TimingDocument.Timing[] getTimingArray();
        
        /**
         * Gets ith "Timing" element
         */
        org.landxml.schema.landXML11.TimingDocument.Timing getTimingArray(int i);
        
        /**
         * Returns number of "Timing" element
         */
        int sizeOfTimingArray();
        
        /**
         * Sets array of all "Timing" element
         */
        void setTimingArray(org.landxml.schema.landXML11.TimingDocument.Timing[] timingArray);
        
        /**
         * Sets ith "Timing" element
         */
        void setTimingArray(int i, org.landxml.schema.landXML11.TimingDocument.Timing timing);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Timing" element
         */
        org.landxml.schema.landXML11.TimingDocument.Timing insertNewTiming(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Timing" element
         */
        org.landxml.schema.landXML11.TimingDocument.Timing addNewTiming();
        
        /**
         * Removes the ith "Timing" element
         */
        void removeTiming(int i);
        
        /**
         * Gets a List of "Volume" elements
         */
        java.util.List<org.landxml.schema.landXML11.VolumeDocument.Volume> getVolumeList();
        
        /**
         * Gets array of all "Volume" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.VolumeDocument.Volume[] getVolumeArray();
        
        /**
         * Gets ith "Volume" element
         */
        org.landxml.schema.landXML11.VolumeDocument.Volume getVolumeArray(int i);
        
        /**
         * Returns number of "Volume" element
         */
        int sizeOfVolumeArray();
        
        /**
         * Sets array of all "Volume" element
         */
        void setVolumeArray(org.landxml.schema.landXML11.VolumeDocument.Volume[] volumeArray);
        
        /**
         * Sets ith "Volume" element
         */
        void setVolumeArray(int i, org.landxml.schema.landXML11.VolumeDocument.Volume volume);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Volume" element
         */
        org.landxml.schema.landXML11.VolumeDocument.Volume insertNewVolume(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Volume" element
         */
        org.landxml.schema.landXML11.VolumeDocument.Volume addNewVolume();
        
        /**
         * Removes the ith "Volume" element
         */
        void removeVolume(int i);
        
        /**
         * Gets a List of "TurnSpeed" elements
         */
        java.util.List<org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed> getTurnSpeedList();
        
        /**
         * Gets array of all "TurnSpeed" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed[] getTurnSpeedArray();
        
        /**
         * Gets ith "TurnSpeed" element
         */
        org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed getTurnSpeedArray(int i);
        
        /**
         * Returns number of "TurnSpeed" element
         */
        int sizeOfTurnSpeedArray();
        
        /**
         * Sets array of all "TurnSpeed" element
         */
        void setTurnSpeedArray(org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed[] turnSpeedArray);
        
        /**
         * Sets ith "TurnSpeed" element
         */
        void setTurnSpeedArray(int i, org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed turnSpeed);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TurnSpeed" element
         */
        org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed insertNewTurnSpeed(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TurnSpeed" element
         */
        org.landxml.schema.landXML11.TurnSpeedDocument.TurnSpeed addNewTurnSpeed();
        
        /**
         * Removes the ith "TurnSpeed" element
         */
        void removeTurnSpeed(int i);
        
        /**
         * Gets a List of "TurnRestriction" elements
         */
        java.util.List<org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction> getTurnRestrictionList();
        
        /**
         * Gets array of all "TurnRestriction" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction[] getTurnRestrictionArray();
        
        /**
         * Gets ith "TurnRestriction" element
         */
        org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction getTurnRestrictionArray(int i);
        
        /**
         * Returns number of "TurnRestriction" element
         */
        int sizeOfTurnRestrictionArray();
        
        /**
         * Sets array of all "TurnRestriction" element
         */
        void setTurnRestrictionArray(org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction[] turnRestrictionArray);
        
        /**
         * Sets ith "TurnRestriction" element
         */
        void setTurnRestrictionArray(int i, org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction turnRestriction);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TurnRestriction" element
         */
        org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction insertNewTurnRestriction(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TurnRestriction" element
         */
        org.landxml.schema.landXML11.TurnRestrictionDocument.TurnRestriction addNewTurnRestriction();
        
        /**
         * Removes the ith "TurnRestriction" element
         */
        void removeTurnRestriction(int i);
        
        /**
         * Gets a List of "Curb" elements
         */
        java.util.List<org.landxml.schema.landXML11.CurbDocument.Curb> getCurbList();
        
        /**
         * Gets array of all "Curb" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.CurbDocument.Curb[] getCurbArray();
        
        /**
         * Gets ith "Curb" element
         */
        org.landxml.schema.landXML11.CurbDocument.Curb getCurbArray(int i);
        
        /**
         * Returns number of "Curb" element
         */
        int sizeOfCurbArray();
        
        /**
         * Sets array of all "Curb" element
         */
        void setCurbArray(org.landxml.schema.landXML11.CurbDocument.Curb[] curbArray);
        
        /**
         * Sets ith "Curb" element
         */
        void setCurbArray(int i, org.landxml.schema.landXML11.CurbDocument.Curb curb);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Curb" element
         */
        org.landxml.schema.landXML11.CurbDocument.Curb insertNewCurb(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Curb" element
         */
        org.landxml.schema.landXML11.CurbDocument.Curb addNewCurb();
        
        /**
         * Removes the ith "Curb" element
         */
        void removeCurb(int i);
        
        /**
         * Gets a List of "Corner" elements
         */
        java.util.List<org.landxml.schema.landXML11.CornerDocument.Corner> getCornerList();
        
        /**
         * Gets array of all "Corner" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.CornerDocument.Corner[] getCornerArray();
        
        /**
         * Gets ith "Corner" element
         */
        org.landxml.schema.landXML11.CornerDocument.Corner getCornerArray(int i);
        
        /**
         * Returns number of "Corner" element
         */
        int sizeOfCornerArray();
        
        /**
         * Sets array of all "Corner" element
         */
        void setCornerArray(org.landxml.schema.landXML11.CornerDocument.Corner[] cornerArray);
        
        /**
         * Sets ith "Corner" element
         */
        void setCornerArray(int i, org.landxml.schema.landXML11.CornerDocument.Corner corner);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Corner" element
         */
        org.landxml.schema.landXML11.CornerDocument.Corner insertNewCorner(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Corner" element
         */
        org.landxml.schema.landXML11.CornerDocument.Corner addNewCorner();
        
        /**
         * Removes the ith "Corner" element
         */
        void removeCorner(int i);
        
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
         * Gets the "roadwayRef" attribute
         */
        java.lang.String getRoadwayRef();
        
        /**
         * Gets (as xml) the "roadwayRef" attribute
         */
        org.landxml.schema.landXML11.RoadwayNameRef xgetRoadwayRef();
        
        /**
         * True if has "roadwayRef" attribute
         */
        boolean isSetRoadwayRef();
        
        /**
         * Sets the "roadwayRef" attribute
         */
        void setRoadwayRef(java.lang.String roadwayRef);
        
        /**
         * Sets (as xml) the "roadwayRef" attribute
         */
        void xsetRoadwayRef(org.landxml.schema.landXML11.RoadwayNameRef roadwayRef);
        
        /**
         * Unsets the "roadwayRef" attribute
         */
        void unsetRoadwayRef();
        
        /**
         * Gets the "roadwayPI" attribute
         */
        double getRoadwayPI();
        
        /**
         * Gets (as xml) the "roadwayPI" attribute
         */
        org.landxml.schema.landXML11.Station xgetRoadwayPI();
        
        /**
         * True if has "roadwayPI" attribute
         */
        boolean isSetRoadwayPI();
        
        /**
         * Sets the "roadwayPI" attribute
         */
        void setRoadwayPI(double roadwayPI);
        
        /**
         * Sets (as xml) the "roadwayPI" attribute
         */
        void xsetRoadwayPI(org.landxml.schema.landXML11.Station roadwayPI);
        
        /**
         * Unsets the "roadwayPI" attribute
         */
        void unsetRoadwayPI();
        
        /**
         * Gets the "intersectingRoadwayRef" attribute
         */
        java.lang.String getIntersectingRoadwayRef();
        
        /**
         * Gets (as xml) the "intersectingRoadwayRef" attribute
         */
        org.landxml.schema.landXML11.RoadwayNameRef xgetIntersectingRoadwayRef();
        
        /**
         * True if has "intersectingRoadwayRef" attribute
         */
        boolean isSetIntersectingRoadwayRef();
        
        /**
         * Sets the "intersectingRoadwayRef" attribute
         */
        void setIntersectingRoadwayRef(java.lang.String intersectingRoadwayRef);
        
        /**
         * Sets (as xml) the "intersectingRoadwayRef" attribute
         */
        void xsetIntersectingRoadwayRef(org.landxml.schema.landXML11.RoadwayNameRef intersectingRoadwayRef);
        
        /**
         * Unsets the "intersectingRoadwayRef" attribute
         */
        void unsetIntersectingRoadwayRef();
        
        /**
         * Gets the "intersectRoadwayPI" attribute
         */
        double getIntersectRoadwayPI();
        
        /**
         * Gets (as xml) the "intersectRoadwayPI" attribute
         */
        org.landxml.schema.landXML11.Station xgetIntersectRoadwayPI();
        
        /**
         * True if has "intersectRoadwayPI" attribute
         */
        boolean isSetIntersectRoadwayPI();
        
        /**
         * Sets the "intersectRoadwayPI" attribute
         */
        void setIntersectRoadwayPI(double intersectRoadwayPI);
        
        /**
         * Sets (as xml) the "intersectRoadwayPI" attribute
         */
        void xsetIntersectRoadwayPI(org.landxml.schema.landXML11.Station intersectRoadwayPI);
        
        /**
         * Unsets the "intersectRoadwayPI" attribute
         */
        void unsetIntersectRoadwayPI();
        
        /**
         * Gets the "contructionType" attribute
         */
        org.landxml.schema.landXML11.IntersectionConstructionType.Enum getContructionType();
        
        /**
         * Gets (as xml) the "contructionType" attribute
         */
        org.landxml.schema.landXML11.IntersectionConstructionType xgetContructionType();
        
        /**
         * True if has "contructionType" attribute
         */
        boolean isSetContructionType();
        
        /**
         * Sets the "contructionType" attribute
         */
        void setContructionType(org.landxml.schema.landXML11.IntersectionConstructionType.Enum contructionType);
        
        /**
         * Sets (as xml) the "contructionType" attribute
         */
        void xsetContructionType(org.landxml.schema.landXML11.IntersectionConstructionType contructionType);
        
        /**
         * Unsets the "contructionType" attribute
         */
        void unsetContructionType();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.IntersectionDocument.Intersection newInstance() {
              return (org.landxml.schema.landXML11.IntersectionDocument.Intersection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.IntersectionDocument.Intersection newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.IntersectionDocument.Intersection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.IntersectionDocument newInstance() {
          return (org.landxml.schema.landXML11.IntersectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.IntersectionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.IntersectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.IntersectionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.IntersectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.IntersectionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.IntersectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.IntersectionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.IntersectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.IntersectionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.IntersectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.IntersectionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.IntersectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.IntersectionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.IntersectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.IntersectionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.IntersectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.IntersectionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.IntersectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.IntersectionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.IntersectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.IntersectionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.IntersectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.IntersectionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.IntersectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.IntersectionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.IntersectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.IntersectionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.IntersectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.IntersectionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.IntersectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.IntersectionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.IntersectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.IntersectionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.IntersectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
