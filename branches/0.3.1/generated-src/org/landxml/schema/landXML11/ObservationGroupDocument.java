/*
 * An XML document type.
 * Localname: ObservationGroup
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ObservationGroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one ObservationGroup(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface ObservationGroupDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObservationGroupDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("observationgroup63c7doctype");
    
    /**
     * Gets the "ObservationGroup" element
     */
    org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup getObservationGroup();
    
    /**
     * Sets the "ObservationGroup" element
     */
    void setObservationGroup(org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup observationGroup);
    
    /**
     * Appends and returns a new empty "ObservationGroup" element
     */
    org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup addNewObservationGroup();
    
    /**
     * An XML ObservationGroup(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface ObservationGroup extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObservationGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("observationgroup03b8elemtype");
        
        /**
         * Gets the "TargetPoint" element
         */
        org.landxml.schema.landXML11.PointType getTargetPoint();
        
        /**
         * True if has "TargetPoint" element
         */
        boolean isSetTargetPoint();
        
        /**
         * Sets the "TargetPoint" element
         */
        void setTargetPoint(org.landxml.schema.landXML11.PointType targetPoint);
        
        /**
         * Appends and returns a new empty "TargetPoint" element
         */
        org.landxml.schema.landXML11.PointType addNewTargetPoint();
        
        /**
         * Unsets the "TargetPoint" element
         */
        void unsetTargetPoint();
        
        /**
         * Gets a List of "Backsight" elements
         */
        java.util.List<org.landxml.schema.landXML11.BacksightDocument.Backsight> getBacksightList();
        
        /**
         * Gets array of all "Backsight" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.BacksightDocument.Backsight[] getBacksightArray();
        
        /**
         * Gets ith "Backsight" element
         */
        org.landxml.schema.landXML11.BacksightDocument.Backsight getBacksightArray(int i);
        
        /**
         * Returns number of "Backsight" element
         */
        int sizeOfBacksightArray();
        
        /**
         * Sets array of all "Backsight" element
         */
        void setBacksightArray(org.landxml.schema.landXML11.BacksightDocument.Backsight[] backsightArray);
        
        /**
         * Sets ith "Backsight" element
         */
        void setBacksightArray(int i, org.landxml.schema.landXML11.BacksightDocument.Backsight backsight);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Backsight" element
         */
        org.landxml.schema.landXML11.BacksightDocument.Backsight insertNewBacksight(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Backsight" element
         */
        org.landxml.schema.landXML11.BacksightDocument.Backsight addNewBacksight();
        
        /**
         * Removes the ith "Backsight" element
         */
        void removeBacksight(int i);
        
        /**
         * Gets a List of "RawObservation" elements
         */
        java.util.List<org.landxml.schema.landXML11.RawObservationDocument.RawObservation> getRawObservationList();
        
        /**
         * Gets array of all "RawObservation" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.RawObservationDocument.RawObservation[] getRawObservationArray();
        
        /**
         * Gets ith "RawObservation" element
         */
        org.landxml.schema.landXML11.RawObservationDocument.RawObservation getRawObservationArray(int i);
        
        /**
         * Returns number of "RawObservation" element
         */
        int sizeOfRawObservationArray();
        
        /**
         * Sets array of all "RawObservation" element
         */
        void setRawObservationArray(org.landxml.schema.landXML11.RawObservationDocument.RawObservation[] rawObservationArray);
        
        /**
         * Sets ith "RawObservation" element
         */
        void setRawObservationArray(int i, org.landxml.schema.landXML11.RawObservationDocument.RawObservation rawObservation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RawObservation" element
         */
        org.landxml.schema.landXML11.RawObservationDocument.RawObservation insertNewRawObservation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RawObservation" element
         */
        org.landxml.schema.landXML11.RawObservationDocument.RawObservation addNewRawObservation();
        
        /**
         * Removes the ith "RawObservation" element
         */
        void removeRawObservation(int i);
        
        /**
         * Gets a List of "ReducedObservation" elements
         */
        java.util.List<org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation> getReducedObservationList();
        
        /**
         * Gets array of all "ReducedObservation" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation[] getReducedObservationArray();
        
        /**
         * Gets ith "ReducedObservation" element
         */
        org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation getReducedObservationArray(int i);
        
        /**
         * Returns number of "ReducedObservation" element
         */
        int sizeOfReducedObservationArray();
        
        /**
         * Sets array of all "ReducedObservation" element
         */
        void setReducedObservationArray(org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation[] reducedObservationArray);
        
        /**
         * Sets ith "ReducedObservation" element
         */
        void setReducedObservationArray(int i, org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation reducedObservation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ReducedObservation" element
         */
        org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation insertNewReducedObservation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ReducedObservation" element
         */
        org.landxml.schema.landXML11.ReducedObservationDocument.ReducedObservation addNewReducedObservation();
        
        /**
         * Removes the ith "ReducedObservation" element
         */
        void removeReducedObservation(int i);
        
        /**
         * Gets a List of "RedHorizontalPosition" elements
         */
        java.util.List<org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition> getRedHorizontalPositionList();
        
        /**
         * Gets array of all "RedHorizontalPosition" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition[] getRedHorizontalPositionArray();
        
        /**
         * Gets ith "RedHorizontalPosition" element
         */
        org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition getRedHorizontalPositionArray(int i);
        
        /**
         * Returns number of "RedHorizontalPosition" element
         */
        int sizeOfRedHorizontalPositionArray();
        
        /**
         * Sets array of all "RedHorizontalPosition" element
         */
        void setRedHorizontalPositionArray(org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition[] redHorizontalPositionArray);
        
        /**
         * Sets ith "RedHorizontalPosition" element
         */
        void setRedHorizontalPositionArray(int i, org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition redHorizontalPosition);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RedHorizontalPosition" element
         */
        org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition insertNewRedHorizontalPosition(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RedHorizontalPosition" element
         */
        org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition addNewRedHorizontalPosition();
        
        /**
         * Removes the ith "RedHorizontalPosition" element
         */
        void removeRedHorizontalPosition(int i);
        
        /**
         * Gets a List of "ReducedArcObservation" elements
         */
        java.util.List<org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation> getReducedArcObservationList();
        
        /**
         * Gets array of all "ReducedArcObservation" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation[] getReducedArcObservationArray();
        
        /**
         * Gets ith "ReducedArcObservation" element
         */
        org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation getReducedArcObservationArray(int i);
        
        /**
         * Returns number of "ReducedArcObservation" element
         */
        int sizeOfReducedArcObservationArray();
        
        /**
         * Sets array of all "ReducedArcObservation" element
         */
        void setReducedArcObservationArray(org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation[] reducedArcObservationArray);
        
        /**
         * Sets ith "ReducedArcObservation" element
         */
        void setReducedArcObservationArray(int i, org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation reducedArcObservation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ReducedArcObservation" element
         */
        org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation insertNewReducedArcObservation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ReducedArcObservation" element
         */
        org.landxml.schema.landXML11.ReducedArcObservationDocument.ReducedArcObservation addNewReducedArcObservation();
        
        /**
         * Removes the ith "ReducedArcObservation" element
         */
        void removeReducedArcObservation(int i);
        
        /**
         * Gets a List of "RedVerticalObservation" elements
         */
        java.util.List<org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation> getRedVerticalObservationList();
        
        /**
         * Gets array of all "RedVerticalObservation" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation[] getRedVerticalObservationArray();
        
        /**
         * Gets ith "RedVerticalObservation" element
         */
        org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation getRedVerticalObservationArray(int i);
        
        /**
         * Returns number of "RedVerticalObservation" element
         */
        int sizeOfRedVerticalObservationArray();
        
        /**
         * Sets array of all "RedVerticalObservation" element
         */
        void setRedVerticalObservationArray(org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation[] redVerticalObservationArray);
        
        /**
         * Sets ith "RedVerticalObservation" element
         */
        void setRedVerticalObservationArray(int i, org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation redVerticalObservation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RedVerticalObservation" element
         */
        org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation insertNewRedVerticalObservation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RedVerticalObservation" element
         */
        org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation addNewRedVerticalObservation();
        
        /**
         * Removes the ith "RedVerticalObservation" element
         */
        void removeRedVerticalObservation(int i);
        
        /**
         * Gets a List of "FieldNote" elements
         */
        java.util.List<org.landxml.schema.landXML11.FieldNoteDocument.FieldNote> getFieldNoteList();
        
        /**
         * Gets array of all "FieldNote" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.FieldNoteDocument.FieldNote[] getFieldNoteArray();
        
        /**
         * Gets ith "FieldNote" element
         */
        org.landxml.schema.landXML11.FieldNoteDocument.FieldNote getFieldNoteArray(int i);
        
        /**
         * Returns number of "FieldNote" element
         */
        int sizeOfFieldNoteArray();
        
        /**
         * Sets array of all "FieldNote" element
         */
        void setFieldNoteArray(org.landxml.schema.landXML11.FieldNoteDocument.FieldNote[] fieldNoteArray);
        
        /**
         * Sets ith "FieldNote" element
         */
        void setFieldNoteArray(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote fieldNote);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "FieldNote" element
         */
        org.landxml.schema.landXML11.FieldNoteDocument.FieldNote insertNewFieldNote(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "FieldNote" element
         */
        org.landxml.schema.landXML11.FieldNoteDocument.FieldNote addNewFieldNote();
        
        /**
         * Removes the ith "FieldNote" element
         */
        void removeFieldNote(int i);
        
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
         * Gets the "id" attribute
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlID xgetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlID id);
        
        /**
         * Gets the "purpose" attribute
         */
        org.landxml.schema.landXML11.PurposeType.Enum getPurpose();
        
        /**
         * Gets (as xml) the "purpose" attribute
         */
        org.landxml.schema.landXML11.PurposeType xgetPurpose();
        
        /**
         * True if has "purpose" attribute
         */
        boolean isSetPurpose();
        
        /**
         * Sets the "purpose" attribute
         */
        void setPurpose(org.landxml.schema.landXML11.PurposeType.Enum purpose);
        
        /**
         * Sets (as xml) the "purpose" attribute
         */
        void xsetPurpose(org.landxml.schema.landXML11.PurposeType purpose);
        
        /**
         * Unsets the "purpose" attribute
         */
        void unsetPurpose();
        
        /**
         * Gets the "setupID" attribute
         */
        java.lang.String getSetupID();
        
        /**
         * Gets (as xml) the "setupID" attribute
         */
        org.apache.xmlbeans.XmlIDREF xgetSetupID();
        
        /**
         * True if has "setupID" attribute
         */
        boolean isSetSetupID();
        
        /**
         * Sets the "setupID" attribute
         */
        void setSetupID(java.lang.String setupID);
        
        /**
         * Sets (as xml) the "setupID" attribute
         */
        void xsetSetupID(org.apache.xmlbeans.XmlIDREF setupID);
        
        /**
         * Unsets the "setupID" attribute
         */
        void unsetSetupID();
        
        /**
         * Gets the "targetSetupID" attribute
         */
        java.lang.String getTargetSetupID();
        
        /**
         * Gets (as xml) the "targetSetupID" attribute
         */
        org.apache.xmlbeans.XmlIDREF xgetTargetSetupID();
        
        /**
         * True if has "targetSetupID" attribute
         */
        boolean isSetTargetSetupID();
        
        /**
         * Sets the "targetSetupID" attribute
         */
        void setTargetSetupID(java.lang.String targetSetupID);
        
        /**
         * Sets (as xml) the "targetSetupID" attribute
         */
        void xsetTargetSetupID(org.apache.xmlbeans.XmlIDREF targetSetupID);
        
        /**
         * Unsets the "targetSetupID" attribute
         */
        void unsetTargetSetupID();
        
        /**
         * Gets the "setID" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType getSetID();
        
        /**
         * True if has "setID" attribute
         */
        boolean isSetSetID();
        
        /**
         * Sets the "setID" attribute
         */
        void setSetID(org.apache.xmlbeans.XmlAnySimpleType setID);
        
        /**
         * Appends and returns a new empty "setID" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType addNewSetID();
        
        /**
         * Unsets the "setID" attribute
         */
        void unsetSetID();
        
        /**
         * Gets the "coordGeomRefs" attribute
         */
        java.util.List getCoordGeomRefs();
        
        /**
         * Gets (as xml) the "coordGeomRefs" attribute
         */
        org.landxml.schema.landXML11.CoordGeomNameRefs xgetCoordGeomRefs();
        
        /**
         * True if has "coordGeomRefs" attribute
         */
        boolean isSetCoordGeomRefs();
        
        /**
         * Sets the "coordGeomRefs" attribute
         */
        void setCoordGeomRefs(java.util.List coordGeomRefs);
        
        /**
         * Sets (as xml) the "coordGeomRefs" attribute
         */
        void xsetCoordGeomRefs(org.landxml.schema.landXML11.CoordGeomNameRefs coordGeomRefs);
        
        /**
         * Unsets the "coordGeomRefs" attribute
         */
        void unsetCoordGeomRefs();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup newInstance() {
              return (org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.ObservationGroupDocument.ObservationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.ObservationGroupDocument newInstance() {
          return (org.landxml.schema.landXML11.ObservationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.ObservationGroupDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.ObservationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.ObservationGroupDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ObservationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.ObservationGroupDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ObservationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.ObservationGroupDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ObservationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.ObservationGroupDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ObservationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.ObservationGroupDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ObservationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.ObservationGroupDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ObservationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.ObservationGroupDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ObservationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.ObservationGroupDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ObservationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.ObservationGroupDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ObservationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.ObservationGroupDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ObservationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.ObservationGroupDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ObservationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.ObservationGroupDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ObservationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.ObservationGroupDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ObservationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.ObservationGroupDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ObservationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ObservationGroupDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ObservationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ObservationGroupDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ObservationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
