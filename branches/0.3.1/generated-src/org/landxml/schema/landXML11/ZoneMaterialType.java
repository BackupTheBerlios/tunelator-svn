/*
 * XML Type:  zoneMaterialType
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ZoneMaterialType
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * An XML zoneMaterialType(@http://www.landxml.org/schema/LandXML-1.1).
 *
 * This is an atomic type that is a restriction of org.landxml.schema.landXML11.ZoneMaterialType.
 */
public interface ZoneMaterialType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ZoneMaterialType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("zonematerialtype6631type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum PAVEMENT_HIGH_TYPE = Enum.forString("pavement-high-type");
    static final Enum PAVEMENT_INTERMEDIATE_TYPE = Enum.forString("pavement-intermediate-type");
    static final Enum PAVEMENT_LOW_TYPE = Enum.forString("pavement-low-type");
    static final Enum SOIL = Enum.forString("soil");
    static final Enum CONCRETE = Enum.forString("concrete");
    static final Enum STONE = Enum.forString("stone");
    static final Enum RIPRAP = Enum.forString("riprap");
    static final Enum TURF = Enum.forString("turf");
    static final Enum GRAVEL = Enum.forString("gravel");
    static final Enum PAVED = Enum.forString("paved");
    static final Enum METAL = Enum.forString("metal");
    static final Enum METAL_GRATE = Enum.forString("metal grate");
    static final Enum COMPOSITE = Enum.forString("composite");
    static final Enum TIMBER = Enum.forString("timber");
    static final Enum OTHER = Enum.forString("other");
    
    static final int INT_PAVEMENT_HIGH_TYPE = Enum.INT_PAVEMENT_HIGH_TYPE;
    static final int INT_PAVEMENT_INTERMEDIATE_TYPE = Enum.INT_PAVEMENT_INTERMEDIATE_TYPE;
    static final int INT_PAVEMENT_LOW_TYPE = Enum.INT_PAVEMENT_LOW_TYPE;
    static final int INT_SOIL = Enum.INT_SOIL;
    static final int INT_CONCRETE = Enum.INT_CONCRETE;
    static final int INT_STONE = Enum.INT_STONE;
    static final int INT_RIPRAP = Enum.INT_RIPRAP;
    static final int INT_TURF = Enum.INT_TURF;
    static final int INT_GRAVEL = Enum.INT_GRAVEL;
    static final int INT_PAVED = Enum.INT_PAVED;
    static final int INT_METAL = Enum.INT_METAL;
    static final int INT_METAL_GRATE = Enum.INT_METAL_GRATE;
    static final int INT_COMPOSITE = Enum.INT_COMPOSITE;
    static final int INT_TIMBER = Enum.INT_TIMBER;
    static final int INT_OTHER = Enum.INT_OTHER;
    
    /**
     * Enumeration value class for org.landxml.schema.landXML11.ZoneMaterialType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_PAVEMENT_HIGH_TYPE
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
        
        static final int INT_PAVEMENT_HIGH_TYPE = 1;
        static final int INT_PAVEMENT_INTERMEDIATE_TYPE = 2;
        static final int INT_PAVEMENT_LOW_TYPE = 3;
        static final int INT_SOIL = 4;
        static final int INT_CONCRETE = 5;
        static final int INT_STONE = 6;
        static final int INT_RIPRAP = 7;
        static final int INT_TURF = 8;
        static final int INT_GRAVEL = 9;
        static final int INT_PAVED = 10;
        static final int INT_METAL = 11;
        static final int INT_METAL_GRATE = 12;
        static final int INT_COMPOSITE = 13;
        static final int INT_TIMBER = 14;
        static final int INT_OTHER = 15;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("pavement-high-type", INT_PAVEMENT_HIGH_TYPE),
                new Enum("pavement-intermediate-type", INT_PAVEMENT_INTERMEDIATE_TYPE),
                new Enum("pavement-low-type", INT_PAVEMENT_LOW_TYPE),
                new Enum("soil", INT_SOIL),
                new Enum("concrete", INT_CONCRETE),
                new Enum("stone", INT_STONE),
                new Enum("riprap", INT_RIPRAP),
                new Enum("turf", INT_TURF),
                new Enum("gravel", INT_GRAVEL),
                new Enum("paved", INT_PAVED),
                new Enum("metal", INT_METAL),
                new Enum("metal grate", INT_METAL_GRATE),
                new Enum("composite", INT_COMPOSITE),
                new Enum("timber", INT_TIMBER),
                new Enum("other", INT_OTHER),
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
        public static org.landxml.schema.landXML11.ZoneMaterialType newValue(java.lang.Object obj) {
          return (org.landxml.schema.landXML11.ZoneMaterialType) type.newValue( obj ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialType newInstance() {
          return (org.landxml.schema.landXML11.ZoneMaterialType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.ZoneMaterialType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.ZoneMaterialType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneMaterialType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneMaterialType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.ZoneMaterialType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneMaterialType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneMaterialType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneMaterialType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneMaterialType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneMaterialType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneMaterialType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneMaterialType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ZoneMaterialType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneMaterialType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneMaterialType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneMaterialType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.ZoneMaterialType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ZoneMaterialType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ZoneMaterialType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ZoneMaterialType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ZoneMaterialType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ZoneMaterialType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
