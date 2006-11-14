/*
 * XML Type:  spiralType
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.SpiralType
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * An XML spiralType(@http://www.landxml.org/schema/LandXML-1.1).
 *
 * This is an atomic type that is a restriction of org.landxml.schema.landXML11.SpiralType.
 */
public interface SpiralType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SpiralType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("spiraltype766ftype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum BIQUADRATIC = Enum.forString("biquadratic");
    static final Enum BLOSS = Enum.forString("bloss");
    static final Enum CLOTHOID = Enum.forString("clothoid");
    static final Enum COSINE = Enum.forString("cosine");
    static final Enum CUBIC = Enum.forString("cubic");
    static final Enum SINUSOID = Enum.forString("sinusoid");
    static final Enum REV_BIQUADRATIC = Enum.forString("revBiquadratic");
    static final Enum REV_BLOSS = Enum.forString("revBloss");
    static final Enum REV_COSINE = Enum.forString("revCosine");
    static final Enum REV_SINUSOID = Enum.forString("revSinusoid");
    static final Enum SINE_HALF_WAVE = Enum.forString("sineHalfWave");
    static final Enum BIQUADRATIC_PARABOLA = Enum.forString("biquadraticParabola");
    static final Enum CUBIC_PARABOLA = Enum.forString("cubicParabola");
    static final Enum JAPANESE_CUBIC = Enum.forString("japaneseCubic");
    static final Enum RADIOID = Enum.forString("radioid");
    static final Enum WEINER_BOGEN = Enum.forString("weinerBogen");
    
    static final int INT_BIQUADRATIC = Enum.INT_BIQUADRATIC;
    static final int INT_BLOSS = Enum.INT_BLOSS;
    static final int INT_CLOTHOID = Enum.INT_CLOTHOID;
    static final int INT_COSINE = Enum.INT_COSINE;
    static final int INT_CUBIC = Enum.INT_CUBIC;
    static final int INT_SINUSOID = Enum.INT_SINUSOID;
    static final int INT_REV_BIQUADRATIC = Enum.INT_REV_BIQUADRATIC;
    static final int INT_REV_BLOSS = Enum.INT_REV_BLOSS;
    static final int INT_REV_COSINE = Enum.INT_REV_COSINE;
    static final int INT_REV_SINUSOID = Enum.INT_REV_SINUSOID;
    static final int INT_SINE_HALF_WAVE = Enum.INT_SINE_HALF_WAVE;
    static final int INT_BIQUADRATIC_PARABOLA = Enum.INT_BIQUADRATIC_PARABOLA;
    static final int INT_CUBIC_PARABOLA = Enum.INT_CUBIC_PARABOLA;
    static final int INT_JAPANESE_CUBIC = Enum.INT_JAPANESE_CUBIC;
    static final int INT_RADIOID = Enum.INT_RADIOID;
    static final int INT_WEINER_BOGEN = Enum.INT_WEINER_BOGEN;
    
    /**
     * Enumeration value class for org.landxml.schema.landXML11.SpiralType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_BIQUADRATIC
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
        
        static final int INT_BIQUADRATIC = 1;
        static final int INT_BLOSS = 2;
        static final int INT_CLOTHOID = 3;
        static final int INT_COSINE = 4;
        static final int INT_CUBIC = 5;
        static final int INT_SINUSOID = 6;
        static final int INT_REV_BIQUADRATIC = 7;
        static final int INT_REV_BLOSS = 8;
        static final int INT_REV_COSINE = 9;
        static final int INT_REV_SINUSOID = 10;
        static final int INT_SINE_HALF_WAVE = 11;
        static final int INT_BIQUADRATIC_PARABOLA = 12;
        static final int INT_CUBIC_PARABOLA = 13;
        static final int INT_JAPANESE_CUBIC = 14;
        static final int INT_RADIOID = 15;
        static final int INT_WEINER_BOGEN = 16;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("biquadratic", INT_BIQUADRATIC),
                new Enum("bloss", INT_BLOSS),
                new Enum("clothoid", INT_CLOTHOID),
                new Enum("cosine", INT_COSINE),
                new Enum("cubic", INT_CUBIC),
                new Enum("sinusoid", INT_SINUSOID),
                new Enum("revBiquadratic", INT_REV_BIQUADRATIC),
                new Enum("revBloss", INT_REV_BLOSS),
                new Enum("revCosine", INT_REV_COSINE),
                new Enum("revSinusoid", INT_REV_SINUSOID),
                new Enum("sineHalfWave", INT_SINE_HALF_WAVE),
                new Enum("biquadraticParabola", INT_BIQUADRATIC_PARABOLA),
                new Enum("cubicParabola", INT_CUBIC_PARABOLA),
                new Enum("japaneseCubic", INT_JAPANESE_CUBIC),
                new Enum("radioid", INT_RADIOID),
                new Enum("weinerBogen", INT_WEINER_BOGEN),
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
        public static org.landxml.schema.landXML11.SpiralType newValue(java.lang.Object obj) {
          return (org.landxml.schema.landXML11.SpiralType) type.newValue( obj ); }
        
        public static org.landxml.schema.landXML11.SpiralType newInstance() {
          return (org.landxml.schema.landXML11.SpiralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.SpiralType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.SpiralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.SpiralType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SpiralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.SpiralType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SpiralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.SpiralType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpiralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.SpiralType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpiralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.SpiralType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpiralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.SpiralType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpiralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.SpiralType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpiralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.SpiralType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpiralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.SpiralType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpiralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.SpiralType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SpiralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.SpiralType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SpiralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.SpiralType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SpiralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.SpiralType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SpiralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.SpiralType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SpiralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.SpiralType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.SpiralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.SpiralType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.SpiralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
