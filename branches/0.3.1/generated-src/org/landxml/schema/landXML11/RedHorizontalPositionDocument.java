/*
 * An XML document type.
 * Localname: RedHorizontalPosition
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.RedHorizontalPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one RedHorizontalPosition(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface RedHorizontalPositionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RedHorizontalPositionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("redhorizontalposition6520doctype");
    
    /**
     * Gets the "RedHorizontalPosition" element
     */
    org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition getRedHorizontalPosition();
    
    /**
     * Sets the "RedHorizontalPosition" element
     */
    void setRedHorizontalPosition(org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition redHorizontalPosition);
    
    /**
     * Appends and returns a new empty "RedHorizontalPosition" element
     */
    org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition addNewRedHorizontalPosition();
    
    /**
     * An XML RedHorizontalPosition(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface RedHorizontalPosition extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RedHorizontalPosition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("redhorizontalposition40caelemtype");
        
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
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "state" attribute
         */
        java.lang.String getState();
        
        /**
         * Gets (as xml) the "state" attribute
         */
        org.apache.xmlbeans.XmlString xgetState();
        
        /**
         * True if has "state" attribute
         */
        boolean isSetState();
        
        /**
         * Sets the "state" attribute
         */
        void setState(java.lang.String state);
        
        /**
         * Sets (as xml) the "state" attribute
         */
        void xsetState(org.apache.xmlbeans.XmlString state);
        
        /**
         * Unsets the "state" attribute
         */
        void unsetState();
        
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
         * Gets the "date" attribute
         */
        java.util.Calendar getDate();
        
        /**
         * Gets (as xml) the "date" attribute
         */
        org.apache.xmlbeans.XmlDate xgetDate();
        
        /**
         * True if has "date" attribute
         */
        boolean isSetDate();
        
        /**
         * Sets the "date" attribute
         */
        void setDate(java.util.Calendar date);
        
        /**
         * Sets (as xml) the "date" attribute
         */
        void xsetDate(org.apache.xmlbeans.XmlDate date);
        
        /**
         * Unsets the "date" attribute
         */
        void unsetDate();
        
        /**
         * Gets the "equipmentUsed" attribute
         */
        java.lang.String getEquipmentUsed();
        
        /**
         * Gets (as xml) the "equipmentUsed" attribute
         */
        org.landxml.schema.landXML11.EquipmentType xgetEquipmentUsed();
        
        /**
         * True if has "equipmentUsed" attribute
         */
        boolean isSetEquipmentUsed();
        
        /**
         * Sets the "equipmentUsed" attribute
         */
        void setEquipmentUsed(java.lang.String equipmentUsed);
        
        /**
         * Sets (as xml) the "equipmentUsed" attribute
         */
        void xsetEquipmentUsed(org.landxml.schema.landXML11.EquipmentType equipmentUsed);
        
        /**
         * Unsets the "equipmentUsed" attribute
         */
        void unsetEquipmentUsed();
        
        /**
         * Gets the "horizontalDatum" attribute
         */
        java.lang.String getHorizontalDatum();
        
        /**
         * Gets (as xml) the "horizontalDatum" attribute
         */
        org.apache.xmlbeans.XmlString xgetHorizontalDatum();
        
        /**
         * True if has "horizontalDatum" attribute
         */
        boolean isSetHorizontalDatum();
        
        /**
         * Sets the "horizontalDatum" attribute
         */
        void setHorizontalDatum(java.lang.String horizontalDatum);
        
        /**
         * Sets (as xml) the "horizontalDatum" attribute
         */
        void xsetHorizontalDatum(org.apache.xmlbeans.XmlString horizontalDatum);
        
        /**
         * Unsets the "horizontalDatum" attribute
         */
        void unsetHorizontalDatum();
        
        /**
         * Gets the "horizontalAdjustment" attribute
         */
        java.lang.String getHorizontalAdjustment();
        
        /**
         * Gets (as xml) the "horizontalAdjustment" attribute
         */
        org.apache.xmlbeans.XmlString xgetHorizontalAdjustment();
        
        /**
         * True if has "horizontalAdjustment" attribute
         */
        boolean isSetHorizontalAdjustment();
        
        /**
         * Sets the "horizontalAdjustment" attribute
         */
        void setHorizontalAdjustment(java.lang.String horizontalAdjustment);
        
        /**
         * Sets (as xml) the "horizontalAdjustment" attribute
         */
        void xsetHorizontalAdjustment(org.apache.xmlbeans.XmlString horizontalAdjustment);
        
        /**
         * Unsets the "horizontalAdjustment" attribute
         */
        void unsetHorizontalAdjustment();
        
        /**
         * Gets the "latitude" attribute
         */
        java.lang.String getLatitude();
        
        /**
         * Gets (as xml) the "latitude" attribute
         */
        org.apache.xmlbeans.XmlString xgetLatitude();
        
        /**
         * True if has "latitude" attribute
         */
        boolean isSetLatitude();
        
        /**
         * Sets the "latitude" attribute
         */
        void setLatitude(java.lang.String latitude);
        
        /**
         * Sets (as xml) the "latitude" attribute
         */
        void xsetLatitude(org.apache.xmlbeans.XmlString latitude);
        
        /**
         * Unsets the "latitude" attribute
         */
        void unsetLatitude();
        
        /**
         * Gets the "longitude" attribute
         */
        java.lang.String getLongitude();
        
        /**
         * Gets (as xml) the "longitude" attribute
         */
        org.apache.xmlbeans.XmlString xgetLongitude();
        
        /**
         * True if has "longitude" attribute
         */
        boolean isSetLongitude();
        
        /**
         * Sets the "longitude" attribute
         */
        void setLongitude(java.lang.String longitude);
        
        /**
         * Sets (as xml) the "longitude" attribute
         */
        void xsetLongitude(org.apache.xmlbeans.XmlString longitude);
        
        /**
         * Unsets the "longitude" attribute
         */
        void unsetLongitude();
        
        /**
         * Gets the "horizontalFix" attribute
         */
        java.lang.String getHorizontalFix();
        
        /**
         * Gets (as xml) the "horizontalFix" attribute
         */
        org.apache.xmlbeans.XmlString xgetHorizontalFix();
        
        /**
         * True if has "horizontalFix" attribute
         */
        boolean isSetHorizontalFix();
        
        /**
         * Sets the "horizontalFix" attribute
         */
        void setHorizontalFix(java.lang.String horizontalFix);
        
        /**
         * Sets (as xml) the "horizontalFix" attribute
         */
        void xsetHorizontalFix(org.apache.xmlbeans.XmlString horizontalFix);
        
        /**
         * Unsets the "horizontalFix" attribute
         */
        void unsetHorizontalFix();
        
        /**
         * Gets the "currencyDate" attribute
         */
        java.lang.String getCurrencyDate();
        
        /**
         * Gets (as xml) the "currencyDate" attribute
         */
        org.apache.xmlbeans.XmlString xgetCurrencyDate();
        
        /**
         * True if has "currencyDate" attribute
         */
        boolean isSetCurrencyDate();
        
        /**
         * Sets the "currencyDate" attribute
         */
        void setCurrencyDate(java.lang.String currencyDate);
        
        /**
         * Sets (as xml) the "currencyDate" attribute
         */
        void xsetCurrencyDate(org.apache.xmlbeans.XmlString currencyDate);
        
        /**
         * Unsets the "currencyDate" attribute
         */
        void unsetCurrencyDate();
        
        /**
         * Gets the "localUncertainity" attribute
         */
        double getLocalUncertainity();
        
        /**
         * Gets (as xml) the "localUncertainity" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetLocalUncertainity();
        
        /**
         * True if has "localUncertainity" attribute
         */
        boolean isSetLocalUncertainity();
        
        /**
         * Sets the "localUncertainity" attribute
         */
        void setLocalUncertainity(double localUncertainity);
        
        /**
         * Sets (as xml) the "localUncertainity" attribute
         */
        void xsetLocalUncertainity(org.apache.xmlbeans.XmlDouble localUncertainity);
        
        /**
         * Unsets the "localUncertainity" attribute
         */
        void unsetLocalUncertainity();
        
        /**
         * Gets the "class" attribute
         */
        java.lang.String getClass1();
        
        /**
         * Gets (as xml) the "class" attribute
         */
        org.apache.xmlbeans.XmlString xgetClass1();
        
        /**
         * True if has "class" attribute
         */
        boolean isSetClass1();
        
        /**
         * Sets the "class" attribute
         */
        void setClass1(java.lang.String class1);
        
        /**
         * Sets (as xml) the "class" attribute
         */
        void xsetClass1(org.apache.xmlbeans.XmlString class1);
        
        /**
         * Unsets the "class" attribute
         */
        void unsetClass1();
        
        /**
         * Gets the "order" attribute
         */
        java.lang.String getOrder();
        
        /**
         * Gets (as xml) the "order" attribute
         */
        org.apache.xmlbeans.XmlString xgetOrder();
        
        /**
         * True if has "order" attribute
         */
        boolean isSetOrder();
        
        /**
         * Sets the "order" attribute
         */
        void setOrder(java.lang.String order);
        
        /**
         * Sets (as xml) the "order" attribute
         */
        void xsetOrder(org.apache.xmlbeans.XmlString order);
        
        /**
         * Unsets the "order" attribute
         */
        void unsetOrder();
        
        /**
         * Gets the "positionalUncertainity" attribute
         */
        double getPositionalUncertainity();
        
        /**
         * Gets (as xml) the "positionalUncertainity" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetPositionalUncertainity();
        
        /**
         * True if has "positionalUncertainity" attribute
         */
        boolean isSetPositionalUncertainity();
        
        /**
         * Sets the "positionalUncertainity" attribute
         */
        void setPositionalUncertainity(double positionalUncertainity);
        
        /**
         * Sets (as xml) the "positionalUncertainity" attribute
         */
        void xsetPositionalUncertainity(org.apache.xmlbeans.XmlDouble positionalUncertainity);
        
        /**
         * Unsets the "positionalUncertainity" attribute
         */
        void unsetPositionalUncertainity();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition newInstance() {
              return (org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.RedHorizontalPositionDocument.RedHorizontalPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.RedHorizontalPositionDocument newInstance() {
          return (org.landxml.schema.landXML11.RedHorizontalPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.RedHorizontalPositionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.RedHorizontalPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.RedHorizontalPositionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RedHorizontalPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.RedHorizontalPositionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RedHorizontalPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.RedHorizontalPositionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RedHorizontalPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.RedHorizontalPositionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RedHorizontalPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.RedHorizontalPositionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RedHorizontalPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.RedHorizontalPositionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RedHorizontalPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.RedHorizontalPositionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RedHorizontalPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.RedHorizontalPositionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RedHorizontalPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.RedHorizontalPositionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RedHorizontalPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.RedHorizontalPositionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RedHorizontalPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.RedHorizontalPositionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RedHorizontalPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.RedHorizontalPositionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RedHorizontalPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.RedHorizontalPositionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RedHorizontalPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.RedHorizontalPositionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RedHorizontalPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.RedHorizontalPositionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.RedHorizontalPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.RedHorizontalPositionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.RedHorizontalPositionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
