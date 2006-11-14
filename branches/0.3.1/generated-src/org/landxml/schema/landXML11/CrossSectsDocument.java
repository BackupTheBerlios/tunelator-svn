/*
 * An XML document type.
 * Localname: CrossSects
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CrossSectsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one CrossSects(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface CrossSectsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CrossSectsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("crosssects5ec4doctype");
    
    /**
     * Gets the "CrossSects" element
     */
    org.landxml.schema.landXML11.CrossSectsDocument.CrossSects getCrossSects();
    
    /**
     * Sets the "CrossSects" element
     */
    void setCrossSects(org.landxml.schema.landXML11.CrossSectsDocument.CrossSects crossSects);
    
    /**
     * Appends and returns a new empty "CrossSects" element
     */
    org.landxml.schema.landXML11.CrossSectsDocument.CrossSects addNewCrossSects();
    
    /**
     * An XML CrossSects(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface CrossSects extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CrossSects.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("crosssects2458elemtype");
        
        /**
         * Gets a List of "CrossSect" elements
         */
        java.util.List<org.landxml.schema.landXML11.CrossSectDocument.CrossSect> getCrossSectList();
        
        /**
         * Gets array of all "CrossSect" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.CrossSectDocument.CrossSect[] getCrossSectArray();
        
        /**
         * Gets ith "CrossSect" element
         */
        org.landxml.schema.landXML11.CrossSectDocument.CrossSect getCrossSectArray(int i);
        
        /**
         * Returns number of "CrossSect" element
         */
        int sizeOfCrossSectArray();
        
        /**
         * Sets array of all "CrossSect" element
         */
        void setCrossSectArray(org.landxml.schema.landXML11.CrossSectDocument.CrossSect[] crossSectArray);
        
        /**
         * Sets ith "CrossSect" element
         */
        void setCrossSectArray(int i, org.landxml.schema.landXML11.CrossSectDocument.CrossSect crossSect);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CrossSect" element
         */
        org.landxml.schema.landXML11.CrossSectDocument.CrossSect insertNewCrossSect(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CrossSect" element
         */
        org.landxml.schema.landXML11.CrossSectDocument.CrossSect addNewCrossSect();
        
        /**
         * Removes the ith "CrossSect" element
         */
        void removeCrossSect(int i);
        
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
         * Gets the "calcMethod" attribute
         */
        org.landxml.schema.landXML11.XsVolCalcMethodType.Enum getCalcMethod();
        
        /**
         * Gets (as xml) the "calcMethod" attribute
         */
        org.landxml.schema.landXML11.XsVolCalcMethodType xgetCalcMethod();
        
        /**
         * True if has "calcMethod" attribute
         */
        boolean isSetCalcMethod();
        
        /**
         * Sets the "calcMethod" attribute
         */
        void setCalcMethod(org.landxml.schema.landXML11.XsVolCalcMethodType.Enum calcMethod);
        
        /**
         * Sets (as xml) the "calcMethod" attribute
         */
        void xsetCalcMethod(org.landxml.schema.landXML11.XsVolCalcMethodType calcMethod);
        
        /**
         * Unsets the "calcMethod" attribute
         */
        void unsetCalcMethod();
        
        /**
         * Gets the "curveCorrection" attribute
         */
        boolean getCurveCorrection();
        
        /**
         * Gets (as xml) the "curveCorrection" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetCurveCorrection();
        
        /**
         * True if has "curveCorrection" attribute
         */
        boolean isSetCurveCorrection();
        
        /**
         * Sets the "curveCorrection" attribute
         */
        void setCurveCorrection(boolean curveCorrection);
        
        /**
         * Sets (as xml) the "curveCorrection" attribute
         */
        void xsetCurveCorrection(org.apache.xmlbeans.XmlBoolean curveCorrection);
        
        /**
         * Unsets the "curveCorrection" attribute
         */
        void unsetCurveCorrection();
        
        /**
         * Gets the "swellFactor" attribute
         */
        double getSwellFactor();
        
        /**
         * Gets (as xml) the "swellFactor" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSwellFactor();
        
        /**
         * True if has "swellFactor" attribute
         */
        boolean isSetSwellFactor();
        
        /**
         * Sets the "swellFactor" attribute
         */
        void setSwellFactor(double swellFactor);
        
        /**
         * Sets (as xml) the "swellFactor" attribute
         */
        void xsetSwellFactor(org.apache.xmlbeans.XmlDouble swellFactor);
        
        /**
         * Unsets the "swellFactor" attribute
         */
        void unsetSwellFactor();
        
        /**
         * Gets the "shrinkFactor" attribute
         */
        double getShrinkFactor();
        
        /**
         * Gets (as xml) the "shrinkFactor" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetShrinkFactor();
        
        /**
         * True if has "shrinkFactor" attribute
         */
        boolean isSetShrinkFactor();
        
        /**
         * Sets the "shrinkFactor" attribute
         */
        void setShrinkFactor(double shrinkFactor);
        
        /**
         * Sets (as xml) the "shrinkFactor" attribute
         */
        void xsetShrinkFactor(org.apache.xmlbeans.XmlDouble shrinkFactor);
        
        /**
         * Unsets the "shrinkFactor" attribute
         */
        void unsetShrinkFactor();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.CrossSectsDocument.CrossSects newInstance() {
              return (org.landxml.schema.landXML11.CrossSectsDocument.CrossSects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.CrossSectsDocument.CrossSects newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.CrossSectsDocument.CrossSects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.CrossSectsDocument newInstance() {
          return (org.landxml.schema.landXML11.CrossSectsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.CrossSectsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.CrossSectsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrossSectsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrossSectsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.CrossSectsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.CrossSectsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.CrossSectsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.CrossSectsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.CrossSectsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.CrossSectsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrossSectsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrossSectsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.CrossSectsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrossSectsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.CrossSectsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.CrossSectsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CrossSectsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CrossSectsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.CrossSectsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.CrossSectsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
