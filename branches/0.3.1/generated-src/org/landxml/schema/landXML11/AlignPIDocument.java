/*
 * An XML document type.
 * Localname: AlignPI
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.AlignPIDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one AlignPI(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface AlignPIDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlignPIDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("alignpi8140doctype");
    
    /**
     * Gets the "AlignPI" element
     */
    org.landxml.schema.landXML11.AlignPIDocument.AlignPI getAlignPI();
    
    /**
     * Sets the "AlignPI" element
     */
    void setAlignPI(org.landxml.schema.landXML11.AlignPIDocument.AlignPI alignPI);
    
    /**
     * Appends and returns a new empty "AlignPI" element
     */
    org.landxml.schema.landXML11.AlignPIDocument.AlignPI addNewAlignPI();
    
    /**
     * An XML AlignPI(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface AlignPI extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlignPI.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("alignpi984aelemtype");
        
        /**
         * Gets a List of "Station" elements
         */
        java.util.List<java.lang.Double> getStationList();
        
        /**
         * Gets array of all "Station" elements
         * @deprecated
         */
        double[] getStationArray();
        
        /**
         * Gets ith "Station" element
         */
        double getStationArray(int i);
        
        /**
         * Gets (as xml) a List of "Station" elements
         */
        java.util.List<org.apache.xmlbeans.XmlDouble> xgetStationList();
        
        /**
         * Gets (as xml) array of all "Station" elements
         * @deprecated
         */
        org.apache.xmlbeans.XmlDouble[] xgetStationArray();
        
        /**
         * Gets (as xml) ith "Station" element
         */
        org.apache.xmlbeans.XmlDouble xgetStationArray(int i);
        
        /**
         * Returns number of "Station" element
         */
        int sizeOfStationArray();
        
        /**
         * Sets array of all "Station" element
         */
        void setStationArray(double[] stationArray);
        
        /**
         * Sets ith "Station" element
         */
        void setStationArray(int i, double station);
        
        /**
         * Sets (as xml) array of all "Station" element
         */
        void xsetStationArray(org.apache.xmlbeans.XmlDouble[] stationArray);
        
        /**
         * Sets (as xml) ith "Station" element
         */
        void xsetStationArray(int i, org.apache.xmlbeans.XmlDouble station);
        
        /**
         * Inserts the value as the ith "Station" element
         */
        void insertStation(int i, double station);
        
        /**
         * Appends the value as the last "Station" element
         */
        void addStation(double station);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Station" element
         */
        org.apache.xmlbeans.XmlDouble insertNewStation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Station" element
         */
        org.apache.xmlbeans.XmlDouble addNewStation();
        
        /**
         * Removes the ith "Station" element
         */
        void removeStation(int i);
        
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
         * Gets a List of "InSpiral" elements
         */
        java.util.List<org.landxml.schema.landXML11.InSpiralDocument.InSpiral> getInSpiralList();
        
        /**
         * Gets array of all "InSpiral" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.InSpiralDocument.InSpiral[] getInSpiralArray();
        
        /**
         * Gets ith "InSpiral" element
         */
        org.landxml.schema.landXML11.InSpiralDocument.InSpiral getInSpiralArray(int i);
        
        /**
         * Returns number of "InSpiral" element
         */
        int sizeOfInSpiralArray();
        
        /**
         * Sets array of all "InSpiral" element
         */
        void setInSpiralArray(org.landxml.schema.landXML11.InSpiralDocument.InSpiral[] inSpiralArray);
        
        /**
         * Sets ith "InSpiral" element
         */
        void setInSpiralArray(int i, org.landxml.schema.landXML11.InSpiralDocument.InSpiral inSpiral);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "InSpiral" element
         */
        org.landxml.schema.landXML11.InSpiralDocument.InSpiral insertNewInSpiral(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "InSpiral" element
         */
        org.landxml.schema.landXML11.InSpiralDocument.InSpiral addNewInSpiral();
        
        /**
         * Removes the ith "InSpiral" element
         */
        void removeInSpiral(int i);
        
        /**
         * Gets a List of "Curve1" elements
         */
        java.util.List<org.landxml.schema.landXML11.Curve1Document.Curve1> getCurve1List();
        
        /**
         * Gets array of all "Curve1" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.Curve1Document.Curve1[] getCurve1Array();
        
        /**
         * Gets ith "Curve1" element
         */
        org.landxml.schema.landXML11.Curve1Document.Curve1 getCurve1Array(int i);
        
        /**
         * Returns number of "Curve1" element
         */
        int sizeOfCurve1Array();
        
        /**
         * Sets array of all "Curve1" element
         */
        void setCurve1Array(org.landxml.schema.landXML11.Curve1Document.Curve1[] curve1Array);
        
        /**
         * Sets ith "Curve1" element
         */
        void setCurve1Array(int i, org.landxml.schema.landXML11.Curve1Document.Curve1 curve1);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Curve1" element
         */
        org.landxml.schema.landXML11.Curve1Document.Curve1 insertNewCurve1(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Curve1" element
         */
        org.landxml.schema.landXML11.Curve1Document.Curve1 addNewCurve1();
        
        /**
         * Removes the ith "Curve1" element
         */
        void removeCurve1(int i);
        
        /**
         * Gets a List of "ConnSpiral" elements
         */
        java.util.List<org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral> getConnSpiralList();
        
        /**
         * Gets array of all "ConnSpiral" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral[] getConnSpiralArray();
        
        /**
         * Gets ith "ConnSpiral" element
         */
        org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral getConnSpiralArray(int i);
        
        /**
         * Returns number of "ConnSpiral" element
         */
        int sizeOfConnSpiralArray();
        
        /**
         * Sets array of all "ConnSpiral" element
         */
        void setConnSpiralArray(org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral[] connSpiralArray);
        
        /**
         * Sets ith "ConnSpiral" element
         */
        void setConnSpiralArray(int i, org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral connSpiral);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ConnSpiral" element
         */
        org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral insertNewConnSpiral(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ConnSpiral" element
         */
        org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral addNewConnSpiral();
        
        /**
         * Removes the ith "ConnSpiral" element
         */
        void removeConnSpiral(int i);
        
        /**
         * Gets a List of "Curve2" elements
         */
        java.util.List<org.landxml.schema.landXML11.Curve2Document.Curve2> getCurve2List();
        
        /**
         * Gets array of all "Curve2" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.Curve2Document.Curve2[] getCurve2Array();
        
        /**
         * Gets ith "Curve2" element
         */
        org.landxml.schema.landXML11.Curve2Document.Curve2 getCurve2Array(int i);
        
        /**
         * Returns number of "Curve2" element
         */
        int sizeOfCurve2Array();
        
        /**
         * Sets array of all "Curve2" element
         */
        void setCurve2Array(org.landxml.schema.landXML11.Curve2Document.Curve2[] curve2Array);
        
        /**
         * Sets ith "Curve2" element
         */
        void setCurve2Array(int i, org.landxml.schema.landXML11.Curve2Document.Curve2 curve2);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Curve2" element
         */
        org.landxml.schema.landXML11.Curve2Document.Curve2 insertNewCurve2(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Curve2" element
         */
        org.landxml.schema.landXML11.Curve2Document.Curve2 addNewCurve2();
        
        /**
         * Removes the ith "Curve2" element
         */
        void removeCurve2(int i);
        
        /**
         * Gets a List of "OutSpiral" elements
         */
        java.util.List<org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral> getOutSpiralList();
        
        /**
         * Gets array of all "OutSpiral" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral[] getOutSpiralArray();
        
        /**
         * Gets ith "OutSpiral" element
         */
        org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral getOutSpiralArray(int i);
        
        /**
         * Returns number of "OutSpiral" element
         */
        int sizeOfOutSpiralArray();
        
        /**
         * Sets array of all "OutSpiral" element
         */
        void setOutSpiralArray(org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral[] outSpiralArray);
        
        /**
         * Sets ith "OutSpiral" element
         */
        void setOutSpiralArray(int i, org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral outSpiral);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OutSpiral" element
         */
        org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral insertNewOutSpiral(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OutSpiral" element
         */
        org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral addNewOutSpiral();
        
        /**
         * Removes the ith "OutSpiral" element
         */
        void removeOutSpiral(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.AlignPIDocument.AlignPI newInstance() {
              return (org.landxml.schema.landXML11.AlignPIDocument.AlignPI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.AlignPIDocument.AlignPI newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.AlignPIDocument.AlignPI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.AlignPIDocument newInstance() {
          return (org.landxml.schema.landXML11.AlignPIDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.AlignPIDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.AlignPIDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.AlignPIDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AlignPIDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.AlignPIDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AlignPIDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.AlignPIDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AlignPIDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.AlignPIDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AlignPIDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.AlignPIDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AlignPIDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.AlignPIDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AlignPIDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.AlignPIDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AlignPIDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.AlignPIDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AlignPIDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.AlignPIDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AlignPIDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.AlignPIDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AlignPIDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.AlignPIDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AlignPIDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.AlignPIDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AlignPIDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.AlignPIDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AlignPIDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.AlignPIDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AlignPIDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.AlignPIDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.AlignPIDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.AlignPIDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.AlignPIDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
