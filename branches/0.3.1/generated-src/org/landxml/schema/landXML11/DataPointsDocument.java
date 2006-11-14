/*
 * An XML document type.
 * Localname: DataPoints
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.DataPointsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one DataPoints(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface DataPointsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataPointsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("datapoints0981doctype");
    
    /**
     * Gets the "DataPoints" element
     */
    org.landxml.schema.landXML11.DataPointsDocument.DataPoints getDataPoints();
    
    /**
     * Sets the "DataPoints" element
     */
    void setDataPoints(org.landxml.schema.landXML11.DataPointsDocument.DataPoints dataPoints);
    
    /**
     * Appends and returns a new empty "DataPoints" element
     */
    org.landxml.schema.landXML11.DataPointsDocument.DataPoints addNewDataPoints();
    
    /**
     * An XML DataPoints(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface DataPoints extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataPoints.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("datapoints3f78elemtype");
        
        /**
         * Gets a List of "PntList3D" elements
         */
        java.util.List<java.util.List> getPntList3DList();
        
        /**
         * Gets array of all "PntList3D" elements
         * @deprecated
         */
        java.util.List[] getPntList3DArray();
        
        /**
         * Gets ith "PntList3D" element
         */
        java.util.List getPntList3DArray(int i);
        
        /**
         * Gets (as xml) a List of "PntList3D" elements
         */
        java.util.List<org.landxml.schema.landXML11.PntList3DDocument.PntList3D> xgetPntList3DList();
        
        /**
         * Gets (as xml) array of all "PntList3D" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.PntList3DDocument.PntList3D[] xgetPntList3DArray();
        
        /**
         * Gets (as xml) ith "PntList3D" element
         */
        org.landxml.schema.landXML11.PntList3DDocument.PntList3D xgetPntList3DArray(int i);
        
        /**
         * Returns number of "PntList3D" element
         */
        int sizeOfPntList3DArray();
        
        /**
         * Sets array of all "PntList3D" element
         */
        void setPntList3DArray(java.util.List[] pntList3DArray);
        
        /**
         * Sets ith "PntList3D" element
         */
        void setPntList3DArray(int i, java.util.List pntList3D);
        
        /**
         * Sets (as xml) array of all "PntList3D" element
         */
        void xsetPntList3DArray(org.landxml.schema.landXML11.PntList3DDocument.PntList3D[] pntList3DArray);
        
        /**
         * Sets (as xml) ith "PntList3D" element
         */
        void xsetPntList3DArray(int i, org.landxml.schema.landXML11.PntList3DDocument.PntList3D pntList3D);
        
        /**
         * Inserts the value as the ith "PntList3D" element
         */
        void insertPntList3D(int i, java.util.List pntList3D);
        
        /**
         * Appends the value as the last "PntList3D" element
         */
        void addPntList3D(java.util.List pntList3D);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PntList3D" element
         */
        org.landxml.schema.landXML11.PntList3DDocument.PntList3D insertNewPntList3D(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PntList3D" element
         */
        org.landxml.schema.landXML11.PntList3DDocument.PntList3D addNewPntList3D();
        
        /**
         * Removes the ith "PntList3D" element
         */
        void removePntList3D(int i);
        
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
         * Gets the "pntRef" attribute
         */
        java.lang.String getPntRef();
        
        /**
         * Gets (as xml) the "pntRef" attribute
         */
        org.landxml.schema.landXML11.PointNameRef xgetPntRef();
        
        /**
         * True if has "pntRef" attribute
         */
        boolean isSetPntRef();
        
        /**
         * Sets the "pntRef" attribute
         */
        void setPntRef(java.lang.String pntRef);
        
        /**
         * Sets (as xml) the "pntRef" attribute
         */
        void xsetPntRef(org.landxml.schema.landXML11.PointNameRef pntRef);
        
        /**
         * Unsets the "pntRef" attribute
         */
        void unsetPntRef();
        
        /**
         * Gets the "pointGeometry" attribute
         */
        org.landxml.schema.landXML11.PointGeometryType.Enum getPointGeometry();
        
        /**
         * Gets (as xml) the "pointGeometry" attribute
         */
        org.landxml.schema.landXML11.PointGeometryType xgetPointGeometry();
        
        /**
         * True if has "pointGeometry" attribute
         */
        boolean isSetPointGeometry();
        
        /**
         * Sets the "pointGeometry" attribute
         */
        void setPointGeometry(org.landxml.schema.landXML11.PointGeometryType.Enum pointGeometry);
        
        /**
         * Sets (as xml) the "pointGeometry" attribute
         */
        void xsetPointGeometry(org.landxml.schema.landXML11.PointGeometryType pointGeometry);
        
        /**
         * Unsets the "pointGeometry" attribute
         */
        void unsetPointGeometry();
        
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
            public static org.landxml.schema.landXML11.DataPointsDocument.DataPoints newInstance() {
              return (org.landxml.schema.landXML11.DataPointsDocument.DataPoints) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.DataPointsDocument.DataPoints newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.DataPointsDocument.DataPoints) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.DataPointsDocument newInstance() {
          return (org.landxml.schema.landXML11.DataPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.DataPointsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.DataPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.DataPointsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DataPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.DataPointsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DataPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.DataPointsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DataPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.DataPointsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DataPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.DataPointsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DataPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.DataPointsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DataPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.DataPointsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DataPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.DataPointsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DataPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.DataPointsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DataPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.DataPointsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.DataPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.DataPointsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DataPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.DataPointsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DataPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.DataPointsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DataPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.DataPointsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.DataPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.DataPointsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.DataPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.DataPointsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.DataPointsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
