/*
 * An XML document type.
 * Localname: CoordGeom
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CoordGeomDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one CoordGeom(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface CoordGeomDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CoordGeomDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("coordgeom47d3doctype");
    
    /**
     * Gets the "CoordGeom" element
     */
    org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom getCoordGeom();
    
    /**
     * Sets the "CoordGeom" element
     */
    void setCoordGeom(org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom coordGeom);
    
    /**
     * Appends and returns a new empty "CoordGeom" element
     */
    org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom addNewCoordGeom();
    
    /**
     * An XML CoordGeom(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface CoordGeom extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CoordGeom.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("coordgeom3a30elemtype");
        
        /**
         * Gets a List of "Line" elements
         */
        java.util.List<org.landxml.schema.landXML11.LineDocument.Line> getLineList();
        
        /**
         * Gets array of all "Line" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.LineDocument.Line[] getLineArray();
        
        /**
         * Gets ith "Line" element
         */
        org.landxml.schema.landXML11.LineDocument.Line getLineArray(int i);
        
        /**
         * Returns number of "Line" element
         */
        int sizeOfLineArray();
        
        /**
         * Sets array of all "Line" element
         */
        void setLineArray(org.landxml.schema.landXML11.LineDocument.Line[] lineArray);
        
        /**
         * Sets ith "Line" element
         */
        void setLineArray(int i, org.landxml.schema.landXML11.LineDocument.Line line);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Line" element
         */
        org.landxml.schema.landXML11.LineDocument.Line insertNewLine(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Line" element
         */
        org.landxml.schema.landXML11.LineDocument.Line addNewLine();
        
        /**
         * Removes the ith "Line" element
         */
        void removeLine(int i);
        
        /**
         * Gets a List of "IrregularLine" elements
         */
        java.util.List<org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine> getIrregularLineList();
        
        /**
         * Gets array of all "IrregularLine" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine[] getIrregularLineArray();
        
        /**
         * Gets ith "IrregularLine" element
         */
        org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine getIrregularLineArray(int i);
        
        /**
         * Returns number of "IrregularLine" element
         */
        int sizeOfIrregularLineArray();
        
        /**
         * Sets array of all "IrregularLine" element
         */
        void setIrregularLineArray(org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine[] irregularLineArray);
        
        /**
         * Sets ith "IrregularLine" element
         */
        void setIrregularLineArray(int i, org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine irregularLine);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "IrregularLine" element
         */
        org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine insertNewIrregularLine(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "IrregularLine" element
         */
        org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine addNewIrregularLine();
        
        /**
         * Removes the ith "IrregularLine" element
         */
        void removeIrregularLine(int i);
        
        /**
         * Gets a List of "Curve" elements
         */
        java.util.List<org.landxml.schema.landXML11.CurveDocument.Curve> getCurveList();
        
        /**
         * Gets array of all "Curve" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.CurveDocument.Curve[] getCurveArray();
        
        /**
         * Gets ith "Curve" element
         */
        org.landxml.schema.landXML11.CurveDocument.Curve getCurveArray(int i);
        
        /**
         * Returns number of "Curve" element
         */
        int sizeOfCurveArray();
        
        /**
         * Sets array of all "Curve" element
         */
        void setCurveArray(org.landxml.schema.landXML11.CurveDocument.Curve[] curveArray);
        
        /**
         * Sets ith "Curve" element
         */
        void setCurveArray(int i, org.landxml.schema.landXML11.CurveDocument.Curve curve);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Curve" element
         */
        org.landxml.schema.landXML11.CurveDocument.Curve insertNewCurve(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Curve" element
         */
        org.landxml.schema.landXML11.CurveDocument.Curve addNewCurve();
        
        /**
         * Removes the ith "Curve" element
         */
        void removeCurve(int i);
        
        /**
         * Gets a List of "Spiral" elements
         */
        java.util.List<org.landxml.schema.landXML11.SpiralDocument.Spiral> getSpiralList();
        
        /**
         * Gets array of all "Spiral" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.SpiralDocument.Spiral[] getSpiralArray();
        
        /**
         * Gets ith "Spiral" element
         */
        org.landxml.schema.landXML11.SpiralDocument.Spiral getSpiralArray(int i);
        
        /**
         * Returns number of "Spiral" element
         */
        int sizeOfSpiralArray();
        
        /**
         * Sets array of all "Spiral" element
         */
        void setSpiralArray(org.landxml.schema.landXML11.SpiralDocument.Spiral[] spiralArray);
        
        /**
         * Sets ith "Spiral" element
         */
        void setSpiralArray(int i, org.landxml.schema.landXML11.SpiralDocument.Spiral spiral);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Spiral" element
         */
        org.landxml.schema.landXML11.SpiralDocument.Spiral insertNewSpiral(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Spiral" element
         */
        org.landxml.schema.landXML11.SpiralDocument.Spiral addNewSpiral();
        
        /**
         * Removes the ith "Spiral" element
         */
        void removeSpiral(int i);
        
        /**
         * Gets a List of "Chain" elements
         */
        java.util.List<org.landxml.schema.landXML11.ChainDocument.Chain> getChainList();
        
        /**
         * Gets array of all "Chain" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ChainDocument.Chain[] getChainArray();
        
        /**
         * Gets ith "Chain" element
         */
        org.landxml.schema.landXML11.ChainDocument.Chain getChainArray(int i);
        
        /**
         * Returns number of "Chain" element
         */
        int sizeOfChainArray();
        
        /**
         * Sets array of all "Chain" element
         */
        void setChainArray(org.landxml.schema.landXML11.ChainDocument.Chain[] chainArray);
        
        /**
         * Sets ith "Chain" element
         */
        void setChainArray(int i, org.landxml.schema.landXML11.ChainDocument.Chain chain);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Chain" element
         */
        org.landxml.schema.landXML11.ChainDocument.Chain insertNewChain(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Chain" element
         */
        org.landxml.schema.landXML11.ChainDocument.Chain addNewChain();
        
        /**
         * Removes the ith "Chain" element
         */
        void removeChain(int i);
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom newInstance() {
              return (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.CoordGeomDocument newInstance() {
          return (org.landxml.schema.landXML11.CoordGeomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.CoordGeomDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.CoordGeomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.CoordGeomDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CoordGeomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.CoordGeomDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CoordGeomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.CoordGeomDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CoordGeomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.CoordGeomDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CoordGeomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.CoordGeomDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CoordGeomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.CoordGeomDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CoordGeomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.CoordGeomDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CoordGeomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.CoordGeomDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CoordGeomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.CoordGeomDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CoordGeomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.CoordGeomDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CoordGeomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.CoordGeomDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CoordGeomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.CoordGeomDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CoordGeomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.CoordGeomDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CoordGeomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.CoordGeomDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CoordGeomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CoordGeomDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CoordGeomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CoordGeomDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CoordGeomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
