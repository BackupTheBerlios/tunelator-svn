/*
 * XML Type:  PointType
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PointType
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * An XML PointType(@http://www.landxml.org/schema/LandXML-1.1).
 *
 * This is a list type whose items are org.apache.xmlbeans.XmlDouble.
 */
public interface PointType extends org.landxml.schema.landXML11.Point3DOpt
{
    java.util.List getListValue();
    java.util.List xgetListValue();
    void setListValue(java.util.List list);
    /** @deprecated */
    java.util.List listValue();
    /** @deprecated */
    java.util.List xlistValue();
    /** @deprecated */
    void set(java.util.List list);
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PointType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("pointtype79bctype");
    
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
     * Gets the "timeStamp" attribute
     */
    java.util.Calendar getTimeStamp();
    
    /**
     * Gets (as xml) the "timeStamp" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetTimeStamp();
    
    /**
     * True if has "timeStamp" attribute
     */
    boolean isSetTimeStamp();
    
    /**
     * Sets the "timeStamp" attribute
     */
    void setTimeStamp(java.util.Calendar timeStamp);
    
    /**
     * Sets (as xml) the "timeStamp" attribute
     */
    void xsetTimeStamp(org.apache.xmlbeans.XmlDateTime timeStamp);
    
    /**
     * Unsets the "timeStamp" attribute
     */
    void unsetTimeStamp();
    
    /**
     * Gets the "role" attribute
     */
    org.landxml.schema.landXML11.SurveyRoleType.Enum getRole();
    
    /**
     * Gets (as xml) the "role" attribute
     */
    org.landxml.schema.landXML11.SurveyRoleType xgetRole();
    
    /**
     * True if has "role" attribute
     */
    boolean isSetRole();
    
    /**
     * Sets the "role" attribute
     */
    void setRole(org.landxml.schema.landXML11.SurveyRoleType.Enum role);
    
    /**
     * Sets (as xml) the "role" attribute
     */
    void xsetRole(org.landxml.schema.landXML11.SurveyRoleType role);
    
    /**
     * Unsets the "role" attribute
     */
    void unsetRole();
    
    /**
     * Gets the "determinedTimeStamp" attribute
     */
    java.util.Calendar getDeterminedTimeStamp();
    
    /**
     * Gets (as xml) the "determinedTimeStamp" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetDeterminedTimeStamp();
    
    /**
     * True if has "determinedTimeStamp" attribute
     */
    boolean isSetDeterminedTimeStamp();
    
    /**
     * Sets the "determinedTimeStamp" attribute
     */
    void setDeterminedTimeStamp(java.util.Calendar determinedTimeStamp);
    
    /**
     * Sets (as xml) the "determinedTimeStamp" attribute
     */
    void xsetDeterminedTimeStamp(org.apache.xmlbeans.XmlDateTime determinedTimeStamp);
    
    /**
     * Unsets the "determinedTimeStamp" attribute
     */
    void unsetDeterminedTimeStamp();
    
    /**
     * Gets the "ellipsoidElev" attribute
     */
    double getEllipsoidElev();
    
    /**
     * Gets (as xml) the "ellipsoidElev" attribute
     */
    org.landxml.schema.landXML11.EllipsoidElevationType xgetEllipsoidElev();
    
    /**
     * True if has "ellipsoidElev" attribute
     */
    boolean isSetEllipsoidElev();
    
    /**
     * Sets the "ellipsoidElev" attribute
     */
    void setEllipsoidElev(double ellipsoidElev);
    
    /**
     * Sets (as xml) the "ellipsoidElev" attribute
     */
    void xsetEllipsoidElev(org.landxml.schema.landXML11.EllipsoidElevationType ellipsoidElev);
    
    /**
     * Unsets the "ellipsoidElev" attribute
     */
    void unsetEllipsoidElev();
    
    /**
     * Gets the "latitude" attribute
     */
    double getLatitude();
    
    /**
     * Gets (as xml) the "latitude" attribute
     */
    org.landxml.schema.landXML11.LatLongAngle xgetLatitude();
    
    /**
     * True if has "latitude" attribute
     */
    boolean isSetLatitude();
    
    /**
     * Sets the "latitude" attribute
     */
    void setLatitude(double latitude);
    
    /**
     * Sets (as xml) the "latitude" attribute
     */
    void xsetLatitude(org.landxml.schema.landXML11.LatLongAngle latitude);
    
    /**
     * Unsets the "latitude" attribute
     */
    void unsetLatitude();
    
    /**
     * Gets the "longitude" attribute
     */
    double getLongitude();
    
    /**
     * Gets (as xml) the "longitude" attribute
     */
    org.landxml.schema.landXML11.LatLongAngle xgetLongitude();
    
    /**
     * True if has "longitude" attribute
     */
    boolean isSetLongitude();
    
    /**
     * Sets the "longitude" attribute
     */
    void setLongitude(double longitude);
    
    /**
     * Sets (as xml) the "longitude" attribute
     */
    void xsetLongitude(org.landxml.schema.landXML11.LatLongAngle longitude);
    
    /**
     * Unsets the "longitude" attribute
     */
    void unsetLongitude();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.PointType newInstance() {
          return (org.landxml.schema.landXML11.PointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.PointType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.PointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.PointType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.PointType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.PointType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.PointType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.PointType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.PointType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.PointType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.PointType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.PointType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.PointType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.PointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.PointType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.PointType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.PointType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.PointType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.PointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.PointType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.PointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.PointType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.PointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
