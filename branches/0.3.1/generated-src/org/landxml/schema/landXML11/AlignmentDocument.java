/*
 * An XML document type.
 * Localname: Alignment
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.AlignmentDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one Alignment(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface AlignmentDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlignmentDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("alignmentab65doctype");
    
    /**
     * Gets the "Alignment" element
     */
    org.landxml.schema.landXML11.AlignmentDocument.Alignment getAlignment();
    
    /**
     * Sets the "Alignment" element
     */
    void setAlignment(org.landxml.schema.landXML11.AlignmentDocument.Alignment alignment);
    
    /**
     * Appends and returns a new empty "Alignment" element
     */
    org.landxml.schema.landXML11.AlignmentDocument.Alignment addNewAlignment();
    
    /**
     * An XML Alignment(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface Alignment extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Alignment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("alignment3654elemtype");
        
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
         * Gets a List of "CoordGeom" elements
         */
        java.util.List<org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom> getCoordGeomList();
        
        /**
         * Gets array of all "CoordGeom" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom[] getCoordGeomArray();
        
        /**
         * Gets ith "CoordGeom" element
         */
        org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom getCoordGeomArray(int i);
        
        /**
         * Returns number of "CoordGeom" element
         */
        int sizeOfCoordGeomArray();
        
        /**
         * Sets array of all "CoordGeom" element
         */
        void setCoordGeomArray(org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom[] coordGeomArray);
        
        /**
         * Sets ith "CoordGeom" element
         */
        void setCoordGeomArray(int i, org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom coordGeom);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CoordGeom" element
         */
        org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom insertNewCoordGeom(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CoordGeom" element
         */
        org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom addNewCoordGeom();
        
        /**
         * Removes the ith "CoordGeom" element
         */
        void removeCoordGeom(int i);
        
        /**
         * Gets a List of "AlignPIs" elements
         */
        java.util.List<org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs> getAlignPIsList();
        
        /**
         * Gets array of all "AlignPIs" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs[] getAlignPIsArray();
        
        /**
         * Gets ith "AlignPIs" element
         */
        org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs getAlignPIsArray(int i);
        
        /**
         * Returns number of "AlignPIs" element
         */
        int sizeOfAlignPIsArray();
        
        /**
         * Sets array of all "AlignPIs" element
         */
        void setAlignPIsArray(org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs[] alignPIsArray);
        
        /**
         * Sets ith "AlignPIs" element
         */
        void setAlignPIsArray(int i, org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs alignPIs);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AlignPIs" element
         */
        org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs insertNewAlignPIs(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AlignPIs" element
         */
        org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs addNewAlignPIs();
        
        /**
         * Removes the ith "AlignPIs" element
         */
        void removeAlignPIs(int i);
        
        /**
         * Gets a List of "Cant" elements
         */
        java.util.List<org.landxml.schema.landXML11.CantDocument.Cant> getCantList();
        
        /**
         * Gets array of all "Cant" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.CantDocument.Cant[] getCantArray();
        
        /**
         * Gets ith "Cant" element
         */
        org.landxml.schema.landXML11.CantDocument.Cant getCantArray(int i);
        
        /**
         * Returns number of "Cant" element
         */
        int sizeOfCantArray();
        
        /**
         * Sets array of all "Cant" element
         */
        void setCantArray(org.landxml.schema.landXML11.CantDocument.Cant[] cantArray);
        
        /**
         * Sets ith "Cant" element
         */
        void setCantArray(int i, org.landxml.schema.landXML11.CantDocument.Cant cant);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Cant" element
         */
        org.landxml.schema.landXML11.CantDocument.Cant insertNewCant(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Cant" element
         */
        org.landxml.schema.landXML11.CantDocument.Cant addNewCant();
        
        /**
         * Removes the ith "Cant" element
         */
        void removeCant(int i);
        
        /**
         * Gets a List of "StaEquation" elements
         */
        java.util.List<org.landxml.schema.landXML11.StaEquationDocument.StaEquation> getStaEquationList();
        
        /**
         * Gets array of all "StaEquation" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.StaEquationDocument.StaEquation[] getStaEquationArray();
        
        /**
         * Gets ith "StaEquation" element
         */
        org.landxml.schema.landXML11.StaEquationDocument.StaEquation getStaEquationArray(int i);
        
        /**
         * Returns number of "StaEquation" element
         */
        int sizeOfStaEquationArray();
        
        /**
         * Sets array of all "StaEquation" element
         */
        void setStaEquationArray(org.landxml.schema.landXML11.StaEquationDocument.StaEquation[] staEquationArray);
        
        /**
         * Sets ith "StaEquation" element
         */
        void setStaEquationArray(int i, org.landxml.schema.landXML11.StaEquationDocument.StaEquation staEquation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "StaEquation" element
         */
        org.landxml.schema.landXML11.StaEquationDocument.StaEquation insertNewStaEquation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "StaEquation" element
         */
        org.landxml.schema.landXML11.StaEquationDocument.StaEquation addNewStaEquation();
        
        /**
         * Removes the ith "StaEquation" element
         */
        void removeStaEquation(int i);
        
        /**
         * Gets a List of "Profile" elements
         */
        java.util.List<org.landxml.schema.landXML11.ProfileDocument.Profile> getProfileList();
        
        /**
         * Gets array of all "Profile" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ProfileDocument.Profile[] getProfileArray();
        
        /**
         * Gets ith "Profile" element
         */
        org.landxml.schema.landXML11.ProfileDocument.Profile getProfileArray(int i);
        
        /**
         * Returns number of "Profile" element
         */
        int sizeOfProfileArray();
        
        /**
         * Sets array of all "Profile" element
         */
        void setProfileArray(org.landxml.schema.landXML11.ProfileDocument.Profile[] profileArray);
        
        /**
         * Sets ith "Profile" element
         */
        void setProfileArray(int i, org.landxml.schema.landXML11.ProfileDocument.Profile profile);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Profile" element
         */
        org.landxml.schema.landXML11.ProfileDocument.Profile insertNewProfile(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Profile" element
         */
        org.landxml.schema.landXML11.ProfileDocument.Profile addNewProfile();
        
        /**
         * Removes the ith "Profile" element
         */
        void removeProfile(int i);
        
        /**
         * Gets a List of "CrossSects" elements
         */
        java.util.List<org.landxml.schema.landXML11.CrossSectsDocument.CrossSects> getCrossSectsList();
        
        /**
         * Gets array of all "CrossSects" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.CrossSectsDocument.CrossSects[] getCrossSectsArray();
        
        /**
         * Gets ith "CrossSects" element
         */
        org.landxml.schema.landXML11.CrossSectsDocument.CrossSects getCrossSectsArray(int i);
        
        /**
         * Returns number of "CrossSects" element
         */
        int sizeOfCrossSectsArray();
        
        /**
         * Sets array of all "CrossSects" element
         */
        void setCrossSectsArray(org.landxml.schema.landXML11.CrossSectsDocument.CrossSects[] crossSectsArray);
        
        /**
         * Sets ith "CrossSects" element
         */
        void setCrossSectsArray(int i, org.landxml.schema.landXML11.CrossSectsDocument.CrossSects crossSects);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CrossSects" element
         */
        org.landxml.schema.landXML11.CrossSectsDocument.CrossSects insertNewCrossSects(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CrossSects" element
         */
        org.landxml.schema.landXML11.CrossSectsDocument.CrossSects addNewCrossSects();
        
        /**
         * Removes the ith "CrossSects" element
         */
        void removeCrossSects(int i);
        
        /**
         * Gets a List of "Superelevation" elements
         */
        java.util.List<org.landxml.schema.landXML11.SuperelevationDocument.Superelevation> getSuperelevationList();
        
        /**
         * Gets array of all "Superelevation" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.SuperelevationDocument.Superelevation[] getSuperelevationArray();
        
        /**
         * Gets ith "Superelevation" element
         */
        org.landxml.schema.landXML11.SuperelevationDocument.Superelevation getSuperelevationArray(int i);
        
        /**
         * Returns number of "Superelevation" element
         */
        int sizeOfSuperelevationArray();
        
        /**
         * Sets array of all "Superelevation" element
         */
        void setSuperelevationArray(org.landxml.schema.landXML11.SuperelevationDocument.Superelevation[] superelevationArray);
        
        /**
         * Sets ith "Superelevation" element
         */
        void setSuperelevationArray(int i, org.landxml.schema.landXML11.SuperelevationDocument.Superelevation superelevation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Superelevation" element
         */
        org.landxml.schema.landXML11.SuperelevationDocument.Superelevation insertNewSuperelevation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Superelevation" element
         */
        org.landxml.schema.landXML11.SuperelevationDocument.Superelevation addNewSuperelevation();
        
        /**
         * Removes the ith "Superelevation" element
         */
        void removeSuperelevation(int i);
        
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
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "length" attribute
         */
        double getLength();
        
        /**
         * Gets (as xml) the "length" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetLength();
        
        /**
         * Sets the "length" attribute
         */
        void setLength(double length);
        
        /**
         * Sets (as xml) the "length" attribute
         */
        void xsetLength(org.apache.xmlbeans.XmlDouble length);
        
        /**
         * Gets the "staStart" attribute
         */
        double getStaStart();
        
        /**
         * Gets (as xml) the "staStart" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetStaStart();
        
        /**
         * Sets the "staStart" attribute
         */
        void setStaStart(double staStart);
        
        /**
         * Sets (as xml) the "staStart" attribute
         */
        void xsetStaStart(org.apache.xmlbeans.XmlDouble staStart);
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.AlignmentDocument.Alignment newInstance() {
              return (org.landxml.schema.landXML11.AlignmentDocument.Alignment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.AlignmentDocument.Alignment newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.AlignmentDocument.Alignment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.AlignmentDocument newInstance() {
          return (org.landxml.schema.landXML11.AlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.AlignmentDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.AlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.AlignmentDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.AlignmentDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.AlignmentDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.AlignmentDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.AlignmentDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.AlignmentDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.AlignmentDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.AlignmentDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.AlignmentDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.AlignmentDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.AlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.AlignmentDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.AlignmentDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.AlignmentDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.AlignmentDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.AlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.AlignmentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.AlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.AlignmentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.AlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
