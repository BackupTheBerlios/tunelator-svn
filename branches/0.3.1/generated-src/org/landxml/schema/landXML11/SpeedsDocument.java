/*
 * An XML document type.
 * Localname: Speeds
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.SpeedsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one Speeds(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface SpeedsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SpeedsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("speeds6f20doctype");
    
    /**
     * Gets the "Speeds" element
     */
    org.landxml.schema.landXML11.SpeedsDocument.Speeds getSpeeds();
    
    /**
     * Sets the "Speeds" element
     */
    void setSpeeds(org.landxml.schema.landXML11.SpeedsDocument.Speeds speeds);
    
    /**
     * Appends and returns a new empty "Speeds" element
     */
    org.landxml.schema.landXML11.SpeedsDocument.Speeds addNewSpeeds();
    
    /**
     * An XML Speeds(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface Speeds extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Speeds.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("speedsfe58elemtype");
        
        /**
         * Gets a List of "DesignSpeed" elements
         */
        java.util.List<org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed> getDesignSpeedList();
        
        /**
         * Gets array of all "DesignSpeed" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed[] getDesignSpeedArray();
        
        /**
         * Gets ith "DesignSpeed" element
         */
        org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed getDesignSpeedArray(int i);
        
        /**
         * Returns number of "DesignSpeed" element
         */
        int sizeOfDesignSpeedArray();
        
        /**
         * Sets array of all "DesignSpeed" element
         */
        void setDesignSpeedArray(org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed[] designSpeedArray);
        
        /**
         * Sets ith "DesignSpeed" element
         */
        void setDesignSpeedArray(int i, org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed designSpeed);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DesignSpeed" element
         */
        org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed insertNewDesignSpeed(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DesignSpeed" element
         */
        org.landxml.schema.landXML11.DesignSpeedDocument.DesignSpeed addNewDesignSpeed();
        
        /**
         * Removes the ith "DesignSpeed" element
         */
        void removeDesignSpeed(int i);
        
        /**
         * Gets a List of "DesignSpeed85th" elements
         */
        java.util.List<org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th> getDesignSpeed85ThList();
        
        /**
         * Gets array of all "DesignSpeed85th" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th[] getDesignSpeed85ThArray();
        
        /**
         * Gets ith "DesignSpeed85th" element
         */
        org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th getDesignSpeed85ThArray(int i);
        
        /**
         * Returns number of "DesignSpeed85th" element
         */
        int sizeOfDesignSpeed85ThArray();
        
        /**
         * Sets array of all "DesignSpeed85th" element
         */
        void setDesignSpeed85ThArray(org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th[] designSpeed85ThArray);
        
        /**
         * Sets ith "DesignSpeed85th" element
         */
        void setDesignSpeed85ThArray(int i, org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th designSpeed85Th);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DesignSpeed85th" element
         */
        org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th insertNewDesignSpeed85Th(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DesignSpeed85th" element
         */
        org.landxml.schema.landXML11.DesignSpeed85ThDocument.DesignSpeed85Th addNewDesignSpeed85Th();
        
        /**
         * Removes the ith "DesignSpeed85th" element
         */
        void removeDesignSpeed85Th(int i);
        
        /**
         * Gets a List of "PostedSpeed" elements
         */
        java.util.List<org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed> getPostedSpeedList();
        
        /**
         * Gets array of all "PostedSpeed" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed[] getPostedSpeedArray();
        
        /**
         * Gets ith "PostedSpeed" element
         */
        org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed getPostedSpeedArray(int i);
        
        /**
         * Returns number of "PostedSpeed" element
         */
        int sizeOfPostedSpeedArray();
        
        /**
         * Sets array of all "PostedSpeed" element
         */
        void setPostedSpeedArray(org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed[] postedSpeedArray);
        
        /**
         * Sets ith "PostedSpeed" element
         */
        void setPostedSpeedArray(int i, org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed postedSpeed);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PostedSpeed" element
         */
        org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed insertNewPostedSpeed(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PostedSpeed" element
         */
        org.landxml.schema.landXML11.PostedSpeedDocument.PostedSpeed addNewPostedSpeed();
        
        /**
         * Removes the ith "PostedSpeed" element
         */
        void removePostedSpeed(int i);
        
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
            public static org.landxml.schema.landXML11.SpeedsDocument.Speeds newInstance() {
              return (org.landxml.schema.landXML11.SpeedsDocument.Speeds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.SpeedsDocument.Speeds newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.SpeedsDocument.Speeds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.SpeedsDocument newInstance() {
          return (org.landxml.schema.landXML11.SpeedsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.SpeedsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.SpeedsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.SpeedsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SpeedsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.SpeedsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SpeedsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.SpeedsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpeedsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.SpeedsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpeedsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.SpeedsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpeedsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.SpeedsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpeedsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.SpeedsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpeedsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.SpeedsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpeedsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.SpeedsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpeedsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.SpeedsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpeedsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.SpeedsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SpeedsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.SpeedsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SpeedsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.SpeedsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SpeedsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.SpeedsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SpeedsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.SpeedsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.SpeedsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.SpeedsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.SpeedsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
