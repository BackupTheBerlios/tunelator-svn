/*
 * An XML document type.
 * Localname: RedVerticalObservation
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.RedVerticalObservationDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one RedVerticalObservation(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface RedVerticalObservationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RedVerticalObservationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("redverticalobservation9b59doctype");
    
    /**
     * Gets the "RedVerticalObservation" element
     */
    org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation getRedVerticalObservation();
    
    /**
     * Sets the "RedVerticalObservation" element
     */
    void setRedVerticalObservation(org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation redVerticalObservation);
    
    /**
     * Appends and returns a new empty "RedVerticalObservation" element
     */
    org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation addNewRedVerticalObservation();
    
    /**
     * An XML RedVerticalObservation(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface RedVerticalObservation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RedVerticalObservation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("redverticalobservationee78elemtype");
        
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
         * Gets the "height" attribute
         */
        double getHeight();
        
        /**
         * Gets (as xml) the "height" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetHeight();
        
        /**
         * True if has "height" attribute
         */
        boolean isSetHeight();
        
        /**
         * Sets the "height" attribute
         */
        void setHeight(double height);
        
        /**
         * Sets (as xml) the "height" attribute
         */
        void xsetHeight(org.apache.xmlbeans.XmlDouble height);
        
        /**
         * Unsets the "height" attribute
         */
        void unsetHeight();
        
        /**
         * Gets the "verticalAdjustment" attribute
         */
        java.lang.String getVerticalAdjustment();
        
        /**
         * Gets (as xml) the "verticalAdjustment" attribute
         */
        org.apache.xmlbeans.XmlString xgetVerticalAdjustment();
        
        /**
         * True if has "verticalAdjustment" attribute
         */
        boolean isSetVerticalAdjustment();
        
        /**
         * Sets the "verticalAdjustment" attribute
         */
        void setVerticalAdjustment(java.lang.String verticalAdjustment);
        
        /**
         * Sets (as xml) the "verticalAdjustment" attribute
         */
        void xsetVerticalAdjustment(org.apache.xmlbeans.XmlString verticalAdjustment);
        
        /**
         * Unsets the "verticalAdjustment" attribute
         */
        void unsetVerticalAdjustment();
        
        /**
         * Gets the "verticalFix" attribute
         */
        java.lang.String getVerticalFix();
        
        /**
         * Gets (as xml) the "verticalFix" attribute
         */
        org.apache.xmlbeans.XmlString xgetVerticalFix();
        
        /**
         * True if has "verticalFix" attribute
         */
        boolean isSetVerticalFix();
        
        /**
         * Sets the "verticalFix" attribute
         */
        void setVerticalFix(java.lang.String verticalFix);
        
        /**
         * Sets (as xml) the "verticalFix" attribute
         */
        void xsetVerticalFix(org.apache.xmlbeans.XmlString verticalFix);
        
        /**
         * Unsets the "verticalFix" attribute
         */
        void unsetVerticalFix();
        
        /**
         * Gets the "geosphoid" attribute
         */
        double getGeosphoid();
        
        /**
         * Gets (as xml) the "geosphoid" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetGeosphoid();
        
        /**
         * True if has "geosphoid" attribute
         */
        boolean isSetGeosphoid();
        
        /**
         * Sets the "geosphoid" attribute
         */
        void setGeosphoid(double geosphoid);
        
        /**
         * Sets (as xml) the "geosphoid" attribute
         */
        void xsetGeosphoid(org.apache.xmlbeans.XmlDouble geosphoid);
        
        /**
         * Unsets the "geosphoid" attribute
         */
        void unsetGeosphoid();
        
        /**
         * Gets the "gsDatum" attribute
         */
        java.lang.String getGsDatum();
        
        /**
         * Gets (as xml) the "gsDatum" attribute
         */
        org.apache.xmlbeans.XmlString xgetGsDatum();
        
        /**
         * True if has "gsDatum" attribute
         */
        boolean isSetGsDatum();
        
        /**
         * Sets the "gsDatum" attribute
         */
        void setGsDatum(java.lang.String gsDatum);
        
        /**
         * Sets (as xml) the "gsDatum" attribute
         */
        void xsetGsDatum(org.apache.xmlbeans.XmlString gsDatum);
        
        /**
         * Unsets the "gsDatum" attribute
         */
        void unsetGsDatum();
        
        /**
         * Gets the "gsModel" attribute
         */
        java.lang.String getGsModel();
        
        /**
         * Gets (as xml) the "gsModel" attribute
         */
        org.apache.xmlbeans.XmlString xgetGsModel();
        
        /**
         * True if has "gsModel" attribute
         */
        boolean isSetGsModel();
        
        /**
         * Sets the "gsModel" attribute
         */
        void setGsModel(java.lang.String gsModel);
        
        /**
         * Sets (as xml) the "gsModel" attribute
         */
        void xsetGsModel(org.apache.xmlbeans.XmlString gsModel);
        
        /**
         * Unsets the "gsModel" attribute
         */
        void unsetGsModel();
        
        /**
         * Gets the "gsMethod" attribute
         */
        java.lang.String getGsMethod();
        
        /**
         * Gets (as xml) the "gsMethod" attribute
         */
        org.apache.xmlbeans.XmlString xgetGsMethod();
        
        /**
         * True if has "gsMethod" attribute
         */
        boolean isSetGsMethod();
        
        /**
         * Sets the "gsMethod" attribute
         */
        void setGsMethod(java.lang.String gsMethod);
        
        /**
         * Sets (as xml) the "gsMethod" attribute
         */
        void xsetGsMethod(org.apache.xmlbeans.XmlString gsMethod);
        
        /**
         * Unsets the "gsMethod" attribute
         */
        void unsetGsMethod();
        
        /**
         * Gets the "originMark" attribute
         */
        java.lang.String getOriginMark();
        
        /**
         * Gets (as xml) the "originMark" attribute
         */
        org.apache.xmlbeans.XmlString xgetOriginMark();
        
        /**
         * True if has "originMark" attribute
         */
        boolean isSetOriginMark();
        
        /**
         * Sets the "originMark" attribute
         */
        void setOriginMark(java.lang.String originMark);
        
        /**
         * Sets (as xml) the "originMark" attribute
         */
        void xsetOriginMark(org.apache.xmlbeans.XmlString originMark);
        
        /**
         * Unsets the "originMark" attribute
         */
        void unsetOriginMark();
        
        /**
         * Gets the "verticalDatum" attribute
         */
        java.lang.String getVerticalDatum();
        
        /**
         * Gets (as xml) the "verticalDatum" attribute
         */
        org.apache.xmlbeans.XmlString xgetVerticalDatum();
        
        /**
         * True if has "verticalDatum" attribute
         */
        boolean isSetVerticalDatum();
        
        /**
         * Sets the "verticalDatum" attribute
         */
        void setVerticalDatum(java.lang.String verticalDatum);
        
        /**
         * Sets (as xml) the "verticalDatum" attribute
         */
        void xsetVerticalDatum(org.apache.xmlbeans.XmlString verticalDatum);
        
        /**
         * Unsets the "verticalDatum" attribute
         */
        void unsetVerticalDatum();
        
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
            public static org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation newInstance() {
              return (org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.RedVerticalObservationDocument.RedVerticalObservation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.RedVerticalObservationDocument newInstance() {
          return (org.landxml.schema.landXML11.RedVerticalObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.RedVerticalObservationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.RedVerticalObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.RedVerticalObservationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RedVerticalObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.RedVerticalObservationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RedVerticalObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.RedVerticalObservationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RedVerticalObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.RedVerticalObservationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RedVerticalObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.RedVerticalObservationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RedVerticalObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.RedVerticalObservationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RedVerticalObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.RedVerticalObservationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RedVerticalObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.RedVerticalObservationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RedVerticalObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.RedVerticalObservationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RedVerticalObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.RedVerticalObservationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.RedVerticalObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.RedVerticalObservationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RedVerticalObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.RedVerticalObservationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RedVerticalObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.RedVerticalObservationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RedVerticalObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.RedVerticalObservationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.RedVerticalObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.RedVerticalObservationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.RedVerticalObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.RedVerticalObservationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.RedVerticalObservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
