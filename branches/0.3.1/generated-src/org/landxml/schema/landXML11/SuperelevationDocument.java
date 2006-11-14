/*
 * An XML document type.
 * Localname: Superelevation
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.SuperelevationDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one Superelevation(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface SuperelevationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SuperelevationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("superelevation12d6doctype");
    
    /**
     * Gets the "Superelevation" element
     */
    org.landxml.schema.landXML11.SuperelevationDocument.Superelevation getSuperelevation();
    
    /**
     * Sets the "Superelevation" element
     */
    void setSuperelevation(org.landxml.schema.landXML11.SuperelevationDocument.Superelevation superelevation);
    
    /**
     * Appends and returns a new empty "Superelevation" element
     */
    org.landxml.schema.landXML11.SuperelevationDocument.Superelevation addNewSuperelevation();
    
    /**
     * An XML Superelevation(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface Superelevation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Superelevation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("superelevation1818elemtype");
        
        /**
         * Gets a List of "BeginRunoutSta" elements
         */
        java.util.List<java.lang.Double> getBeginRunoutStaList();
        
        /**
         * Gets array of all "BeginRunoutSta" elements
         * @deprecated
         */
        double[] getBeginRunoutStaArray();
        
        /**
         * Gets ith "BeginRunoutSta" element
         */
        double getBeginRunoutStaArray(int i);
        
        /**
         * Gets (as xml) a List of "BeginRunoutSta" elements
         */
        java.util.List<org.landxml.schema.landXML11.Station> xgetBeginRunoutStaList();
        
        /**
         * Gets (as xml) array of all "BeginRunoutSta" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.Station[] xgetBeginRunoutStaArray();
        
        /**
         * Gets (as xml) ith "BeginRunoutSta" element
         */
        org.landxml.schema.landXML11.Station xgetBeginRunoutStaArray(int i);
        
        /**
         * Tests for nil ith "BeginRunoutSta" element
         */
        boolean isNilBeginRunoutStaArray(int i);
        
        /**
         * Returns number of "BeginRunoutSta" element
         */
        int sizeOfBeginRunoutStaArray();
        
        /**
         * Sets array of all "BeginRunoutSta" element
         */
        void setBeginRunoutStaArray(double[] beginRunoutStaArray);
        
        /**
         * Sets ith "BeginRunoutSta" element
         */
        void setBeginRunoutStaArray(int i, double beginRunoutSta);
        
        /**
         * Sets (as xml) array of all "BeginRunoutSta" element
         */
        void xsetBeginRunoutStaArray(org.landxml.schema.landXML11.Station[] beginRunoutStaArray);
        
        /**
         * Sets (as xml) ith "BeginRunoutSta" element
         */
        void xsetBeginRunoutStaArray(int i, org.landxml.schema.landXML11.Station beginRunoutSta);
        
        /**
         * Nils the ith "BeginRunoutSta" element
         */
        void setNilBeginRunoutStaArray(int i);
        
        /**
         * Inserts the value as the ith "BeginRunoutSta" element
         */
        void insertBeginRunoutSta(int i, double beginRunoutSta);
        
        /**
         * Appends the value as the last "BeginRunoutSta" element
         */
        void addBeginRunoutSta(double beginRunoutSta);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BeginRunoutSta" element
         */
        org.landxml.schema.landXML11.Station insertNewBeginRunoutSta(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BeginRunoutSta" element
         */
        org.landxml.schema.landXML11.Station addNewBeginRunoutSta();
        
        /**
         * Removes the ith "BeginRunoutSta" element
         */
        void removeBeginRunoutSta(int i);
        
        /**
         * Gets a List of "BeginRunoffSta" elements
         */
        java.util.List<java.lang.Double> getBeginRunoffStaList();
        
        /**
         * Gets array of all "BeginRunoffSta" elements
         * @deprecated
         */
        double[] getBeginRunoffStaArray();
        
        /**
         * Gets ith "BeginRunoffSta" element
         */
        double getBeginRunoffStaArray(int i);
        
        /**
         * Gets (as xml) a List of "BeginRunoffSta" elements
         */
        java.util.List<org.landxml.schema.landXML11.Station> xgetBeginRunoffStaList();
        
        /**
         * Gets (as xml) array of all "BeginRunoffSta" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.Station[] xgetBeginRunoffStaArray();
        
        /**
         * Gets (as xml) ith "BeginRunoffSta" element
         */
        org.landxml.schema.landXML11.Station xgetBeginRunoffStaArray(int i);
        
        /**
         * Tests for nil ith "BeginRunoffSta" element
         */
        boolean isNilBeginRunoffStaArray(int i);
        
        /**
         * Returns number of "BeginRunoffSta" element
         */
        int sizeOfBeginRunoffStaArray();
        
        /**
         * Sets array of all "BeginRunoffSta" element
         */
        void setBeginRunoffStaArray(double[] beginRunoffStaArray);
        
        /**
         * Sets ith "BeginRunoffSta" element
         */
        void setBeginRunoffStaArray(int i, double beginRunoffSta);
        
        /**
         * Sets (as xml) array of all "BeginRunoffSta" element
         */
        void xsetBeginRunoffStaArray(org.landxml.schema.landXML11.Station[] beginRunoffStaArray);
        
        /**
         * Sets (as xml) ith "BeginRunoffSta" element
         */
        void xsetBeginRunoffStaArray(int i, org.landxml.schema.landXML11.Station beginRunoffSta);
        
        /**
         * Nils the ith "BeginRunoffSta" element
         */
        void setNilBeginRunoffStaArray(int i);
        
        /**
         * Inserts the value as the ith "BeginRunoffSta" element
         */
        void insertBeginRunoffSta(int i, double beginRunoffSta);
        
        /**
         * Appends the value as the last "BeginRunoffSta" element
         */
        void addBeginRunoffSta(double beginRunoffSta);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BeginRunoffSta" element
         */
        org.landxml.schema.landXML11.Station insertNewBeginRunoffSta(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BeginRunoffSta" element
         */
        org.landxml.schema.landXML11.Station addNewBeginRunoffSta();
        
        /**
         * Removes the ith "BeginRunoffSta" element
         */
        void removeBeginRunoffSta(int i);
        
        /**
         * Gets a List of "FullSuperSta" elements
         */
        java.util.List<java.lang.Double> getFullSuperStaList();
        
        /**
         * Gets array of all "FullSuperSta" elements
         * @deprecated
         */
        double[] getFullSuperStaArray();
        
        /**
         * Gets ith "FullSuperSta" element
         */
        double getFullSuperStaArray(int i);
        
        /**
         * Gets (as xml) a List of "FullSuperSta" elements
         */
        java.util.List<org.landxml.schema.landXML11.Station> xgetFullSuperStaList();
        
        /**
         * Gets (as xml) array of all "FullSuperSta" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.Station[] xgetFullSuperStaArray();
        
        /**
         * Gets (as xml) ith "FullSuperSta" element
         */
        org.landxml.schema.landXML11.Station xgetFullSuperStaArray(int i);
        
        /**
         * Returns number of "FullSuperSta" element
         */
        int sizeOfFullSuperStaArray();
        
        /**
         * Sets array of all "FullSuperSta" element
         */
        void setFullSuperStaArray(double[] fullSuperStaArray);
        
        /**
         * Sets ith "FullSuperSta" element
         */
        void setFullSuperStaArray(int i, double fullSuperSta);
        
        /**
         * Sets (as xml) array of all "FullSuperSta" element
         */
        void xsetFullSuperStaArray(org.landxml.schema.landXML11.Station[] fullSuperStaArray);
        
        /**
         * Sets (as xml) ith "FullSuperSta" element
         */
        void xsetFullSuperStaArray(int i, org.landxml.schema.landXML11.Station fullSuperSta);
        
        /**
         * Inserts the value as the ith "FullSuperSta" element
         */
        void insertFullSuperSta(int i, double fullSuperSta);
        
        /**
         * Appends the value as the last "FullSuperSta" element
         */
        void addFullSuperSta(double fullSuperSta);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "FullSuperSta" element
         */
        org.landxml.schema.landXML11.Station insertNewFullSuperSta(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "FullSuperSta" element
         */
        org.landxml.schema.landXML11.Station addNewFullSuperSta();
        
        /**
         * Removes the ith "FullSuperSta" element
         */
        void removeFullSuperSta(int i);
        
        /**
         * Gets a List of "FullSuperelev" elements
         */
        java.util.List<java.lang.Double> getFullSuperelevList();
        
        /**
         * Gets array of all "FullSuperelev" elements
         * @deprecated
         */
        double[] getFullSuperelevArray();
        
        /**
         * Gets ith "FullSuperelev" element
         */
        double getFullSuperelevArray(int i);
        
        /**
         * Gets (as xml) a List of "FullSuperelev" elements
         */
        java.util.List<org.landxml.schema.landXML11.Slope> xgetFullSuperelevList();
        
        /**
         * Gets (as xml) array of all "FullSuperelev" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.Slope[] xgetFullSuperelevArray();
        
        /**
         * Gets (as xml) ith "FullSuperelev" element
         */
        org.landxml.schema.landXML11.Slope xgetFullSuperelevArray(int i);
        
        /**
         * Returns number of "FullSuperelev" element
         */
        int sizeOfFullSuperelevArray();
        
        /**
         * Sets array of all "FullSuperelev" element
         */
        void setFullSuperelevArray(double[] fullSuperelevArray);
        
        /**
         * Sets ith "FullSuperelev" element
         */
        void setFullSuperelevArray(int i, double fullSuperelev);
        
        /**
         * Sets (as xml) array of all "FullSuperelev" element
         */
        void xsetFullSuperelevArray(org.landxml.schema.landXML11.Slope[] fullSuperelevArray);
        
        /**
         * Sets (as xml) ith "FullSuperelev" element
         */
        void xsetFullSuperelevArray(int i, org.landxml.schema.landXML11.Slope fullSuperelev);
        
        /**
         * Inserts the value as the ith "FullSuperelev" element
         */
        void insertFullSuperelev(int i, double fullSuperelev);
        
        /**
         * Appends the value as the last "FullSuperelev" element
         */
        void addFullSuperelev(double fullSuperelev);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "FullSuperelev" element
         */
        org.landxml.schema.landXML11.Slope insertNewFullSuperelev(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "FullSuperelev" element
         */
        org.landxml.schema.landXML11.Slope addNewFullSuperelev();
        
        /**
         * Removes the ith "FullSuperelev" element
         */
        void removeFullSuperelev(int i);
        
        /**
         * Gets a List of "RunoffSta" elements
         */
        java.util.List<java.lang.Double> getRunoffStaList();
        
        /**
         * Gets array of all "RunoffSta" elements
         * @deprecated
         */
        double[] getRunoffStaArray();
        
        /**
         * Gets ith "RunoffSta" element
         */
        double getRunoffStaArray(int i);
        
        /**
         * Gets (as xml) a List of "RunoffSta" elements
         */
        java.util.List<org.landxml.schema.landXML11.Station> xgetRunoffStaList();
        
        /**
         * Gets (as xml) array of all "RunoffSta" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.Station[] xgetRunoffStaArray();
        
        /**
         * Gets (as xml) ith "RunoffSta" element
         */
        org.landxml.schema.landXML11.Station xgetRunoffStaArray(int i);
        
        /**
         * Tests for nil ith "RunoffSta" element
         */
        boolean isNilRunoffStaArray(int i);
        
        /**
         * Returns number of "RunoffSta" element
         */
        int sizeOfRunoffStaArray();
        
        /**
         * Sets array of all "RunoffSta" element
         */
        void setRunoffStaArray(double[] runoffStaArray);
        
        /**
         * Sets ith "RunoffSta" element
         */
        void setRunoffStaArray(int i, double runoffSta);
        
        /**
         * Sets (as xml) array of all "RunoffSta" element
         */
        void xsetRunoffStaArray(org.landxml.schema.landXML11.Station[] runoffStaArray);
        
        /**
         * Sets (as xml) ith "RunoffSta" element
         */
        void xsetRunoffStaArray(int i, org.landxml.schema.landXML11.Station runoffSta);
        
        /**
         * Nils the ith "RunoffSta" element
         */
        void setNilRunoffStaArray(int i);
        
        /**
         * Inserts the value as the ith "RunoffSta" element
         */
        void insertRunoffSta(int i, double runoffSta);
        
        /**
         * Appends the value as the last "RunoffSta" element
         */
        void addRunoffSta(double runoffSta);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RunoffSta" element
         */
        org.landxml.schema.landXML11.Station insertNewRunoffSta(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RunoffSta" element
         */
        org.landxml.schema.landXML11.Station addNewRunoffSta();
        
        /**
         * Removes the ith "RunoffSta" element
         */
        void removeRunoffSta(int i);
        
        /**
         * Gets a List of "StartofRunoutSta" elements
         */
        java.util.List<java.lang.Double> getStartofRunoutStaList();
        
        /**
         * Gets array of all "StartofRunoutSta" elements
         * @deprecated
         */
        double[] getStartofRunoutStaArray();
        
        /**
         * Gets ith "StartofRunoutSta" element
         */
        double getStartofRunoutStaArray(int i);
        
        /**
         * Gets (as xml) a List of "StartofRunoutSta" elements
         */
        java.util.List<org.landxml.schema.landXML11.Station> xgetStartofRunoutStaList();
        
        /**
         * Gets (as xml) array of all "StartofRunoutSta" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.Station[] xgetStartofRunoutStaArray();
        
        /**
         * Gets (as xml) ith "StartofRunoutSta" element
         */
        org.landxml.schema.landXML11.Station xgetStartofRunoutStaArray(int i);
        
        /**
         * Tests for nil ith "StartofRunoutSta" element
         */
        boolean isNilStartofRunoutStaArray(int i);
        
        /**
         * Returns number of "StartofRunoutSta" element
         */
        int sizeOfStartofRunoutStaArray();
        
        /**
         * Sets array of all "StartofRunoutSta" element
         */
        void setStartofRunoutStaArray(double[] startofRunoutStaArray);
        
        /**
         * Sets ith "StartofRunoutSta" element
         */
        void setStartofRunoutStaArray(int i, double startofRunoutSta);
        
        /**
         * Sets (as xml) array of all "StartofRunoutSta" element
         */
        void xsetStartofRunoutStaArray(org.landxml.schema.landXML11.Station[] startofRunoutStaArray);
        
        /**
         * Sets (as xml) ith "StartofRunoutSta" element
         */
        void xsetStartofRunoutStaArray(int i, org.landxml.schema.landXML11.Station startofRunoutSta);
        
        /**
         * Nils the ith "StartofRunoutSta" element
         */
        void setNilStartofRunoutStaArray(int i);
        
        /**
         * Inserts the value as the ith "StartofRunoutSta" element
         */
        void insertStartofRunoutSta(int i, double startofRunoutSta);
        
        /**
         * Appends the value as the last "StartofRunoutSta" element
         */
        void addStartofRunoutSta(double startofRunoutSta);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "StartofRunoutSta" element
         */
        org.landxml.schema.landXML11.Station insertNewStartofRunoutSta(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "StartofRunoutSta" element
         */
        org.landxml.schema.landXML11.Station addNewStartofRunoutSta();
        
        /**
         * Removes the ith "StartofRunoutSta" element
         */
        void removeStartofRunoutSta(int i);
        
        /**
         * Gets a List of "EndofRunoutSta" elements
         */
        java.util.List<java.lang.Double> getEndofRunoutStaList();
        
        /**
         * Gets array of all "EndofRunoutSta" elements
         * @deprecated
         */
        double[] getEndofRunoutStaArray();
        
        /**
         * Gets ith "EndofRunoutSta" element
         */
        double getEndofRunoutStaArray(int i);
        
        /**
         * Gets (as xml) a List of "EndofRunoutSta" elements
         */
        java.util.List<org.landxml.schema.landXML11.Station> xgetEndofRunoutStaList();
        
        /**
         * Gets (as xml) array of all "EndofRunoutSta" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.Station[] xgetEndofRunoutStaArray();
        
        /**
         * Gets (as xml) ith "EndofRunoutSta" element
         */
        org.landxml.schema.landXML11.Station xgetEndofRunoutStaArray(int i);
        
        /**
         * Tests for nil ith "EndofRunoutSta" element
         */
        boolean isNilEndofRunoutStaArray(int i);
        
        /**
         * Returns number of "EndofRunoutSta" element
         */
        int sizeOfEndofRunoutStaArray();
        
        /**
         * Sets array of all "EndofRunoutSta" element
         */
        void setEndofRunoutStaArray(double[] endofRunoutStaArray);
        
        /**
         * Sets ith "EndofRunoutSta" element
         */
        void setEndofRunoutStaArray(int i, double endofRunoutSta);
        
        /**
         * Sets (as xml) array of all "EndofRunoutSta" element
         */
        void xsetEndofRunoutStaArray(org.landxml.schema.landXML11.Station[] endofRunoutStaArray);
        
        /**
         * Sets (as xml) ith "EndofRunoutSta" element
         */
        void xsetEndofRunoutStaArray(int i, org.landxml.schema.landXML11.Station endofRunoutSta);
        
        /**
         * Nils the ith "EndofRunoutSta" element
         */
        void setNilEndofRunoutStaArray(int i);
        
        /**
         * Inserts the value as the ith "EndofRunoutSta" element
         */
        void insertEndofRunoutSta(int i, double endofRunoutSta);
        
        /**
         * Appends the value as the last "EndofRunoutSta" element
         */
        void addEndofRunoutSta(double endofRunoutSta);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "EndofRunoutSta" element
         */
        org.landxml.schema.landXML11.Station insertNewEndofRunoutSta(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "EndofRunoutSta" element
         */
        org.landxml.schema.landXML11.Station addNewEndofRunoutSta();
        
        /**
         * Removes the ith "EndofRunoutSta" element
         */
        void removeEndofRunoutSta(int i);
        
        /**
         * Gets a List of "AdverseSE" elements
         */
        java.util.List<org.landxml.schema.landXML11.AdverseSEType.Enum> getAdverseSEList();
        
        /**
         * Gets array of all "AdverseSE" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.AdverseSEType.Enum[] getAdverseSEArray();
        
        /**
         * Gets ith "AdverseSE" element
         */
        org.landxml.schema.landXML11.AdverseSEType.Enum getAdverseSEArray(int i);
        
        /**
         * Gets (as xml) a List of "AdverseSE" elements
         */
        java.util.List<org.landxml.schema.landXML11.AdverseSEType> xgetAdverseSEList();
        
        /**
         * Gets (as xml) array of all "AdverseSE" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.AdverseSEType[] xgetAdverseSEArray();
        
        /**
         * Gets (as xml) ith "AdverseSE" element
         */
        org.landxml.schema.landXML11.AdverseSEType xgetAdverseSEArray(int i);
        
        /**
         * Returns number of "AdverseSE" element
         */
        int sizeOfAdverseSEArray();
        
        /**
         * Sets array of all "AdverseSE" element
         */
        void setAdverseSEArray(org.landxml.schema.landXML11.AdverseSEType.Enum[] adverseSEArray);
        
        /**
         * Sets ith "AdverseSE" element
         */
        void setAdverseSEArray(int i, org.landxml.schema.landXML11.AdverseSEType.Enum adverseSE);
        
        /**
         * Sets (as xml) array of all "AdverseSE" element
         */
        void xsetAdverseSEArray(org.landxml.schema.landXML11.AdverseSEType[] adverseSEArray);
        
        /**
         * Sets (as xml) ith "AdverseSE" element
         */
        void xsetAdverseSEArray(int i, org.landxml.schema.landXML11.AdverseSEType adverseSE);
        
        /**
         * Inserts the value as the ith "AdverseSE" element
         */
        void insertAdverseSE(int i, org.landxml.schema.landXML11.AdverseSEType.Enum adverseSE);
        
        /**
         * Appends the value as the last "AdverseSE" element
         */
        void addAdverseSE(org.landxml.schema.landXML11.AdverseSEType.Enum adverseSE);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AdverseSE" element
         */
        org.landxml.schema.landXML11.AdverseSEType insertNewAdverseSE(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AdverseSE" element
         */
        org.landxml.schema.landXML11.AdverseSEType addNewAdverseSE();
        
        /**
         * Removes the ith "AdverseSE" element
         */
        void removeAdverseSE(int i);
        
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
         * Gets the "staStart" attribute
         */
        double getStaStart();
        
        /**
         * Gets (as xml) the "staStart" attribute
         */
        org.landxml.schema.landXML11.Station xgetStaStart();
        
        /**
         * True if has "staStart" attribute
         */
        boolean isSetStaStart();
        
        /**
         * Sets the "staStart" attribute
         */
        void setStaStart(double staStart);
        
        /**
         * Sets (as xml) the "staStart" attribute
         */
        void xsetStaStart(org.landxml.schema.landXML11.Station staStart);
        
        /**
         * Unsets the "staStart" attribute
         */
        void unsetStaStart();
        
        /**
         * Gets the "staEnd" attribute
         */
        double getStaEnd();
        
        /**
         * Gets (as xml) the "staEnd" attribute
         */
        org.landxml.schema.landXML11.Station xgetStaEnd();
        
        /**
         * True if has "staEnd" attribute
         */
        boolean isSetStaEnd();
        
        /**
         * Sets the "staEnd" attribute
         */
        void setStaEnd(double staEnd);
        
        /**
         * Sets (as xml) the "staEnd" attribute
         */
        void xsetStaEnd(org.landxml.schema.landXML11.Station staEnd);
        
        /**
         * Unsets the "staEnd" attribute
         */
        void unsetStaEnd();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.SuperelevationDocument.Superelevation newInstance() {
              return (org.landxml.schema.landXML11.SuperelevationDocument.Superelevation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.SuperelevationDocument.Superelevation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.SuperelevationDocument.Superelevation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.SuperelevationDocument newInstance() {
          return (org.landxml.schema.landXML11.SuperelevationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.SuperelevationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.SuperelevationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.SuperelevationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SuperelevationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.SuperelevationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SuperelevationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.SuperelevationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SuperelevationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.SuperelevationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SuperelevationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.SuperelevationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SuperelevationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.SuperelevationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SuperelevationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.SuperelevationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SuperelevationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.SuperelevationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SuperelevationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.SuperelevationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SuperelevationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.SuperelevationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SuperelevationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.SuperelevationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SuperelevationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.SuperelevationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SuperelevationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.SuperelevationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SuperelevationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.SuperelevationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SuperelevationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.SuperelevationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.SuperelevationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.SuperelevationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.SuperelevationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
