/*
 * XML Type:  beaconType
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.BeaconType
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * An XML beaconType(@http://www.landxml.org/schema/LandXML-1.1).
 *
 * This is an atomic type that is a restriction of org.landxml.schema.landXML11.BeaconType.
 */
public interface BeaconType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BeaconType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("beacontypede82type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CAIRN = Enum.forString("cairn");
    static final Enum CHIMNEY = Enum.forString("chimney");
    static final Enum LARGE_QUADRIPOD = Enum.forString("large quadripod");
    static final Enum LIGHTHOUSE = Enum.forString("lighthouse");
    static final Enum MARINE_BEACON = Enum.forString("marine beacon");
    static final Enum MAST = Enum.forString("mast");
    static final Enum MAST_WITH_TARGETS = Enum.forString("mast with targets");
    static final Enum NO_BEACON = Enum.forString("no beacon");
    static final Enum OTHER = Enum.forString("other");
    static final Enum PILLAR = Enum.forString("pillar");
    static final Enum POST = Enum.forString("post");
    static final Enum SMALL_QUADRIPOD = Enum.forString("small quadripod");
    static final Enum TOWER = Enum.forString("tower");
    static final Enum TRIPOD = Enum.forString("tripod");
    static final Enum UNKNOWN = Enum.forString("unknown");
    
    static final int INT_CAIRN = Enum.INT_CAIRN;
    static final int INT_CHIMNEY = Enum.INT_CHIMNEY;
    static final int INT_LARGE_QUADRIPOD = Enum.INT_LARGE_QUADRIPOD;
    static final int INT_LIGHTHOUSE = Enum.INT_LIGHTHOUSE;
    static final int INT_MARINE_BEACON = Enum.INT_MARINE_BEACON;
    static final int INT_MAST = Enum.INT_MAST;
    static final int INT_MAST_WITH_TARGETS = Enum.INT_MAST_WITH_TARGETS;
    static final int INT_NO_BEACON = Enum.INT_NO_BEACON;
    static final int INT_OTHER = Enum.INT_OTHER;
    static final int INT_PILLAR = Enum.INT_PILLAR;
    static final int INT_POST = Enum.INT_POST;
    static final int INT_SMALL_QUADRIPOD = Enum.INT_SMALL_QUADRIPOD;
    static final int INT_TOWER = Enum.INT_TOWER;
    static final int INT_TRIPOD = Enum.INT_TRIPOD;
    static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
    
    /**
     * Enumeration value class for org.landxml.schema.landXML11.BeaconType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CAIRN
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
        
        static final int INT_CAIRN = 1;
        static final int INT_CHIMNEY = 2;
        static final int INT_LARGE_QUADRIPOD = 3;
        static final int INT_LIGHTHOUSE = 4;
        static final int INT_MARINE_BEACON = 5;
        static final int INT_MAST = 6;
        static final int INT_MAST_WITH_TARGETS = 7;
        static final int INT_NO_BEACON = 8;
        static final int INT_OTHER = 9;
        static final int INT_PILLAR = 10;
        static final int INT_POST = 11;
        static final int INT_SMALL_QUADRIPOD = 12;
        static final int INT_TOWER = 13;
        static final int INT_TRIPOD = 14;
        static final int INT_UNKNOWN = 15;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("cairn", INT_CAIRN),
                new Enum("chimney", INT_CHIMNEY),
                new Enum("large quadripod", INT_LARGE_QUADRIPOD),
                new Enum("lighthouse", INT_LIGHTHOUSE),
                new Enum("marine beacon", INT_MARINE_BEACON),
                new Enum("mast", INT_MAST),
                new Enum("mast with targets", INT_MAST_WITH_TARGETS),
                new Enum("no beacon", INT_NO_BEACON),
                new Enum("other", INT_OTHER),
                new Enum("pillar", INT_PILLAR),
                new Enum("post", INT_POST),
                new Enum("small quadripod", INT_SMALL_QUADRIPOD),
                new Enum("tower", INT_TOWER),
                new Enum("tripod", INT_TRIPOD),
                new Enum("unknown", INT_UNKNOWN),
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
        public static org.landxml.schema.landXML11.BeaconType newValue(java.lang.Object obj) {
          return (org.landxml.schema.landXML11.BeaconType) type.newValue( obj ); }
        
        public static org.landxml.schema.landXML11.BeaconType newInstance() {
          return (org.landxml.schema.landXML11.BeaconType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.BeaconType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.BeaconType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.BeaconType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.BeaconType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.BeaconType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.BeaconType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.BeaconType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.BeaconType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.BeaconType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.BeaconType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.BeaconType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.BeaconType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.BeaconType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.BeaconType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.BeaconType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.BeaconType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.BeaconType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.BeaconType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.BeaconType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.BeaconType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.BeaconType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.BeaconType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.BeaconType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.BeaconType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.BeaconType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.BeaconType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.BeaconType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.BeaconType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.BeaconType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.BeaconType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.BeaconType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.BeaconType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.BeaconType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.BeaconType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
