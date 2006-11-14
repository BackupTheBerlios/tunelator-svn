/*
 * An XML document type.
 * Localname: Curve
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CurveDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one Curve(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface CurveDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CurveDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("curvef6f1doctype");
    
    /**
     * Gets the "Curve" element
     */
    org.landxml.schema.landXML11.CurveDocument.Curve getCurve();
    
    /**
     * Sets the "Curve" element
     */
    void setCurve(org.landxml.schema.landXML11.CurveDocument.Curve curve);
    
    /**
     * Appends and returns a new empty "Curve" element
     */
    org.landxml.schema.landXML11.CurveDocument.Curve addNewCurve();
    
    /**
     * An XML Curve(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface Curve extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Curve.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("curveb96celemtype");
        
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
         * Gets a List of "Center" elements
         */
        java.util.List<org.landxml.schema.landXML11.PointType> getCenterList();
        
        /**
         * Gets array of all "Center" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.PointType[] getCenterArray();
        
        /**
         * Gets ith "Center" element
         */
        org.landxml.schema.landXML11.PointType getCenterArray(int i);
        
        /**
         * Returns number of "Center" element
         */
        int sizeOfCenterArray();
        
        /**
         * Sets array of all "Center" element
         */
        void setCenterArray(org.landxml.schema.landXML11.PointType[] centerArray);
        
        /**
         * Sets ith "Center" element
         */
        void setCenterArray(int i, org.landxml.schema.landXML11.PointType center);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Center" element
         */
        org.landxml.schema.landXML11.PointType insertNewCenter(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Center" element
         */
        org.landxml.schema.landXML11.PointType addNewCenter();
        
        /**
         * Removes the ith "Center" element
         */
        void removeCenter(int i);
        
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
         * Gets the "crvType" attribute
         */
        org.landxml.schema.landXML11.CurveType.Enum getCrvType();
        
        /**
         * Gets (as xml) the "crvType" attribute
         */
        org.landxml.schema.landXML11.CurveType xgetCrvType();
        
        /**
         * True if has "crvType" attribute
         */
        boolean isSetCrvType();
        
        /**
         * Sets the "crvType" attribute
         */
        void setCrvType(org.landxml.schema.landXML11.CurveType.Enum crvType);
        
        /**
         * Sets (as xml) the "crvType" attribute
         */
        void xsetCrvType(org.landxml.schema.landXML11.CurveType crvType);
        
        /**
         * Unsets the "crvType" attribute
         */
        void unsetCrvType();
        
        /**
         * Gets the "delta" attribute
         */
        double getDelta();
        
        /**
         * Gets (as xml) the "delta" attribute
         */
        org.landxml.schema.landXML11.Angle xgetDelta();
        
        /**
         * True if has "delta" attribute
         */
        boolean isSetDelta();
        
        /**
         * Sets the "delta" attribute
         */
        void setDelta(double delta);
        
        /**
         * Sets (as xml) the "delta" attribute
         */
        void xsetDelta(org.landxml.schema.landXML11.Angle delta);
        
        /**
         * Unsets the "delta" attribute
         */
        void unsetDelta();
        
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
         * Gets the "external" attribute
         */
        double getExternal();
        
        /**
         * Gets (as xml) the "external" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetExternal();
        
        /**
         * True if has "external" attribute
         */
        boolean isSetExternal();
        
        /**
         * Sets the "external" attribute
         */
        void setExternal(double external);
        
        /**
         * Sets (as xml) the "external" attribute
         */
        void xsetExternal(org.apache.xmlbeans.XmlDouble external);
        
        /**
         * Unsets the "external" attribute
         */
        void unsetExternal();
        
        /**
         * Gets the "length" attribute
         */
        double getLength();
        
        /**
         * Gets (as xml) the "length" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetLength();
        
        /**
         * True if has "length" attribute
         */
        boolean isSetLength();
        
        /**
         * Sets the "length" attribute
         */
        void setLength(double length);
        
        /**
         * Sets (as xml) the "length" attribute
         */
        void xsetLength(org.apache.xmlbeans.XmlDouble length);
        
        /**
         * Unsets the "length" attribute
         */
        void unsetLength();
        
        /**
         * Gets the "midOrd" attribute
         */
        double getMidOrd();
        
        /**
         * Gets (as xml) the "midOrd" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetMidOrd();
        
        /**
         * True if has "midOrd" attribute
         */
        boolean isSetMidOrd();
        
        /**
         * Sets the "midOrd" attribute
         */
        void setMidOrd(double midOrd);
        
        /**
         * Sets (as xml) the "midOrd" attribute
         */
        void xsetMidOrd(org.apache.xmlbeans.XmlDouble midOrd);
        
        /**
         * Unsets the "midOrd" attribute
         */
        void unsetMidOrd();
        
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
         * Gets the "radius" attribute
         */
        double getRadius();
        
        /**
         * Gets (as xml) the "radius" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetRadius();
        
        /**
         * True if has "radius" attribute
         */
        boolean isSetRadius();
        
        /**
         * Sets the "radius" attribute
         */
        void setRadius(double radius);
        
        /**
         * Sets (as xml) the "radius" attribute
         */
        void xsetRadius(org.apache.xmlbeans.XmlDouble radius);
        
        /**
         * Unsets the "radius" attribute
         */
        void unsetRadius();
        
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
         * Gets the "tangent" attribute
         */
        double getTangent();
        
        /**
         * Gets (as xml) the "tangent" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetTangent();
        
        /**
         * True if has "tangent" attribute
         */
        boolean isSetTangent();
        
        /**
         * Sets the "tangent" attribute
         */
        void setTangent(double tangent);
        
        /**
         * Sets (as xml) the "tangent" attribute
         */
        void xsetTangent(org.apache.xmlbeans.XmlDouble tangent);
        
        /**
         * Unsets the "tangent" attribute
         */
        void unsetTangent();
        
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
         * Gets the "note" attribute
         */
        java.lang.String getNote();
        
        /**
         * Gets (as xml) the "note" attribute
         */
        org.apache.xmlbeans.XmlString xgetNote();
        
        /**
         * True if has "note" attribute
         */
        boolean isSetNote();
        
        /**
         * Sets the "note" attribute
         */
        void setNote(java.lang.String note);
        
        /**
         * Sets (as xml) the "note" attribute
         */
        void xsetNote(org.apache.xmlbeans.XmlString note);
        
        /**
         * Unsets the "note" attribute
         */
        void unsetNote();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.CurveDocument.Curve newInstance() {
              return (org.landxml.schema.landXML11.CurveDocument.Curve) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.CurveDocument.Curve newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.CurveDocument.Curve) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.CurveDocument newInstance() {
          return (org.landxml.schema.landXML11.CurveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.CurveDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.CurveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.CurveDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CurveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.CurveDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CurveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.CurveDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CurveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.CurveDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CurveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.CurveDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CurveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.CurveDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CurveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.CurveDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CurveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.CurveDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CurveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.CurveDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CurveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.CurveDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CurveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.CurveDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CurveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.CurveDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CurveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.CurveDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CurveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.CurveDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CurveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CurveDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CurveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CurveDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CurveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
