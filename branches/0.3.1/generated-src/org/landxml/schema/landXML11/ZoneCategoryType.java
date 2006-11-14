/*
 * XML Type:  zoneCategoryType
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ZoneCategoryType
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * An XML zoneCategoryType(@http://www.landxml.org/schema/LandXML-1.1).
 *
 * This is an atomic type that is a restriction of org.landxml.schema.landXML11.ZoneCategoryType.
 */
public interface ZoneCategoryType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ZoneCategoryType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("zonecategorytype9dc8type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum ROAD_SURFACE = Enum.forString("road surface");
    static final Enum ROAD_SUBSURFACE = Enum.forString("road subsurface");
    static final Enum ROAD_SHOULDER = Enum.forString("road shoulder");
    static final Enum ROAD_FORE_SLOPE = Enum.forString("road foreSlope");
    static final Enum ROAD_BACK_SLOPE = Enum.forString("road backSlope");
    static final Enum ROAD_CURB_GUTTER = Enum.forString("road curb-gutter");
    static final Enum BRIDGE_SURFACE = Enum.forString("bridge surface");
    static final Enum BRIDGE_BODY = Enum.forString("bridge body");
    static final Enum SIDEWALK = Enum.forString("sidewalk");
    static final Enum GROUND = Enum.forString("ground");
    static final Enum DITCH = Enum.forString("ditch");
    static final Enum WALL = Enum.forString("wall");
    static final Enum CHANNEL = Enum.forString("channel");
    static final Enum BIKE_FACILITIES = Enum.forString("bike facilities");
    static final Enum OBSTRUCTION_OFFSET = Enum.forString("obstruction offset");
    static final Enum LONGITUDINAL_BARRIER = Enum.forString("longitudinal barrier");
    static final Enum SOUND_BARRIER = Enum.forString("sound barrier");
    static final Enum BRIDGE_ABUTMENT = Enum.forString("bridge abutment");
    static final Enum VERTICAL_PILLAR = Enum.forString("vertical pillar");
    
    static final int INT_ROAD_SURFACE = Enum.INT_ROAD_SURFACE;
    static final int INT_ROAD_SUBSURFACE = Enum.INT_ROAD_SUBSURFACE;
    static final int INT_ROAD_SHOULDER = Enum.INT_ROAD_SHOULDER;
    static final int INT_ROAD_FORE_SLOPE = Enum.INT_ROAD_FORE_SLOPE;
    static final int INT_ROAD_BACK_SLOPE = Enum.INT_ROAD_BACK_SLOPE;
    static final int INT_ROAD_CURB_GUTTER = Enum.INT_ROAD_CURB_GUTTER;
    static final int INT_BRIDGE_SURFACE = Enum.INT_BRIDGE_SURFACE;
    static final int INT_BRIDGE_BODY = Enum.INT_BRIDGE_BODY;
    static final int INT_SIDEWALK = Enum.INT_SIDEWALK;
    static final int INT_GROUND = Enum.INT_GROUND;
    static final int INT_DITCH = Enum.INT_DITCH;
    static final int INT_WALL = Enum.INT_WALL;
    static final int INT_CHANNEL = Enum.INT_CHANNEL;
    static final int INT_BIKE_FACILITIES = Enum.INT_BIKE_FACILITIES;
    static final int INT_OBSTRUCTION_OFFSET = Enum.INT_OBSTRUCTION_OFFSET;
    static final int INT_LONGITUDINAL_BARRIER = Enum.INT_LONGITUDINAL_BARRIER;
    static final int INT_SOUND_BARRIER = Enum.INT_SOUND_BARRIER;
    static final int INT_BRIDGE_ABUTMENT = Enum.INT_BRIDGE_ABUTMENT;
    static final int INT_VERTICAL_PILLAR = Enum.INT_VERTICAL_PILLAR;
    
    /**
     * Enumeration value class for org.landxml.schema.landXML11.ZoneCategoryType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ROAD_SURFACE
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_ROAD_SURFACE = 1;
        static final int INT_ROAD_SUBSURFACE = 2;
        static final int INT_ROAD_SHOULDER = 3;
        static final int INT_ROAD_FORE_SLOPE = 4;
        static final int INT_ROAD_BACK_SLOPE = 5;
        static final int INT_ROAD_CURB_GUTTER = 6;
        static final int INT_BRIDGE_SURFACE = 7;
        static final int INT_BRIDGE_BODY = 8;
        static final int INT_SIDEWALK = 9;
        static final int INT_GROUND = 10;
        static final int INT_DITCH = 11;
        static final int INT_WALL = 12;
        static final int INT_CHANNEL = 13;
        static final int INT_BIKE_FACILITIES = 14;
        static final int INT_OBSTRUCTION_OFFSET = 15;
        static final int INT_LONGITUDINAL_BARRIER = 16;
        static final int INT_SOUND_BARRIER = 17;
        static final int INT_BRIDGE_ABUTMENT = 18;
        static final int INT_VERTICAL_PILLAR = 19;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("road surface", INT_ROAD_SURFACE),
                new Enum("road subsurface", INT_ROAD_SUBSURFACE),
                new Enum("road shoulder", INT_ROAD_SHOULDER),
                new Enum("road foreSlope", INT_ROAD_FORE_SLOPE),
                new Enum("road backSlope", INT_ROAD_BACK_SLOPE),
                new Enum("road curb-gutter", INT_ROAD_CURB_GUTTER),
                new Enum("bridge surface", INT_BRIDGE_SURFACE),
                new Enum("bridge body", INT_BRIDGE_BODY),
                new Enum("sidewalk", INT_SIDEWALK),
                new Enum("ground", INT_GROUND),
                new Enum("ditch", INT_DITCH),
                new Enum("wall", INT_WALL),
                new Enum("channel", INT_CHANNEL),
                new Enum("bike facilities", INT_BIKE_FACILITIES),
                new Enum("obstruction offset", INT_OBSTRUCTION_OFFSET),
                new Enum("longitudinal barrier", INT_LONGITUDINAL_BARRIER),
                new Enum("sound barrier", INT_SOUND_BARRIER),
                new Enum("bridge abutment", INT_BRIDGE_ABUTMENT),
                new Enum("vertical pillar", INT_VERTICAL_PILLAR),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.ZoneCategoryType newValue(java.lang.Object obj) {
          return (org.landxml.schema.landXML11.ZoneCategoryType) type.newValue( obj ); }
        
        public static org.landxml.schema.landXML11.ZoneCategoryType newInstance() {
          return (org.landxml.schema.landXML11.ZoneCategoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneCategoryType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.ZoneCategoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.ZoneCategoryType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneCategoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneCategoryType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneCategoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.ZoneCategoryType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneCategoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneCategoryType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneCategoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneCategoryType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneCategoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneCategoryType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneCategoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneCategoryType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneCategoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneCategoryType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneCategoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneCategoryType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneCategoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneCategoryType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneCategoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneCategoryType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneCategoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneCategoryType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneCategoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneCategoryType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneCategoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneCategoryType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneCategoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ZoneCategoryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ZoneCategoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ZoneCategoryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ZoneCategoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
