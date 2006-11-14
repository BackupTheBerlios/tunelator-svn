/*
 * An XML document type.
 * Localname: Parcel
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ParcelDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one Parcel(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface ParcelDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ParcelDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("parcel59dddoctype");
    
    /**
     * Gets the "Parcel" element
     */
    org.landxml.schema.landXML11.ParcelDocument.Parcel getParcel();
    
    /**
     * Sets the "Parcel" element
     */
    void setParcel(org.landxml.schema.landXML11.ParcelDocument.Parcel parcel);
    
    /**
     * Appends and returns a new empty "Parcel" element
     */
    org.landxml.schema.landXML11.ParcelDocument.Parcel addNewParcel();
    
    /**
     * An XML Parcel(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface Parcel extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Parcel.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("parcelc2f8elemtype");
        
        /**
         * Gets a List of "Center" elements
         */
        java.util.List<org.landxml.schema.landXML11.PointType> getCenterList();
        
        /**
         * Gets array of all "Center" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.PointType[] getCenterArray();
        
        /**
         * Gets ith "Center" element
         */
        org.landxml.schema.landXML11.PointType getCenterArray(int i);
        
        /**
         * Returns number of "Center" element
         */
        int sizeOfCenterArray();
        
        /**
         * Sets array of all "Center" element
         */
        void setCenterArray(org.landxml.schema.landXML11.PointType[] centerArray);
        
        /**
         * Sets ith "Center" element
         */
        void setCenterArray(int i, org.landxml.schema.landXML11.PointType center);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Center" element
         */
        org.landxml.schema.landXML11.PointType insertNewCenter(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Center" element
         */
        org.landxml.schema.landXML11.PointType addNewCenter();
        
        /**
         * Removes the ith "Center" element
         */
        void removeCenter(int i);
        
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
         * Gets a List of "VolumeGeom" elements
         */
        java.util.List<org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom> getVolumeGeomList();
        
        /**
         * Gets array of all "VolumeGeom" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom[] getVolumeGeomArray();
        
        /**
         * Gets ith "VolumeGeom" element
         */
        org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom getVolumeGeomArray(int i);
        
        /**
         * Returns number of "VolumeGeom" element
         */
        int sizeOfVolumeGeomArray();
        
        /**
         * Sets array of all "VolumeGeom" element
         */
        void setVolumeGeomArray(org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom[] volumeGeomArray);
        
        /**
         * Sets ith "VolumeGeom" element
         */
        void setVolumeGeomArray(int i, org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom volumeGeom);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "VolumeGeom" element
         */
        org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom insertNewVolumeGeom(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "VolumeGeom" element
         */
        org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom addNewVolumeGeom();
        
        /**
         * Removes the ith "VolumeGeom" element
         */
        void removeVolumeGeom(int i);
        
        /**
         * Gets a List of "Parcels" elements
         */
        java.util.List<org.landxml.schema.landXML11.ParcelsDocument.Parcels> getParcelsList();
        
        /**
         * Gets array of all "Parcels" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ParcelsDocument.Parcels[] getParcelsArray();
        
        /**
         * Gets ith "Parcels" element
         */
        org.landxml.schema.landXML11.ParcelsDocument.Parcels getParcelsArray(int i);
        
        /**
         * Returns number of "Parcels" element
         */
        int sizeOfParcelsArray();
        
        /**
         * Sets array of all "Parcels" element
         */
        void setParcelsArray(org.landxml.schema.landXML11.ParcelsDocument.Parcels[] parcelsArray);
        
        /**
         * Sets ith "Parcels" element
         */
        void setParcelsArray(int i, org.landxml.schema.landXML11.ParcelsDocument.Parcels parcels);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Parcels" element
         */
        org.landxml.schema.landXML11.ParcelsDocument.Parcels insertNewParcels(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Parcels" element
         */
        org.landxml.schema.landXML11.ParcelsDocument.Parcels addNewParcels();
        
        /**
         * Removes the ith "Parcels" element
         */
        void removeParcels(int i);
        
        /**
         * Gets a List of "Title" elements
         */
        java.util.List<org.landxml.schema.landXML11.TitleDocument.Title> getTitleList();
        
        /**
         * Gets array of all "Title" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.TitleDocument.Title[] getTitleArray();
        
        /**
         * Gets ith "Title" element
         */
        org.landxml.schema.landXML11.TitleDocument.Title getTitleArray(int i);
        
        /**
         * Returns number of "Title" element
         */
        int sizeOfTitleArray();
        
        /**
         * Sets array of all "Title" element
         */
        void setTitleArray(org.landxml.schema.landXML11.TitleDocument.Title[] titleArray);
        
        /**
         * Sets ith "Title" element
         */
        void setTitleArray(int i, org.landxml.schema.landXML11.TitleDocument.Title title);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Title" element
         */
        org.landxml.schema.landXML11.TitleDocument.Title insertNewTitle(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Title" element
         */
        org.landxml.schema.landXML11.TitleDocument.Title addNewTitle();
        
        /**
         * Removes the ith "Title" element
         */
        void removeTitle(int i);
        
        /**
         * Gets a List of "Exclusions" elements
         */
        java.util.List<org.landxml.schema.landXML11.ExclusionsDocument.Exclusions> getExclusionsList();
        
        /**
         * Gets array of all "Exclusions" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ExclusionsDocument.Exclusions[] getExclusionsArray();
        
        /**
         * Gets ith "Exclusions" element
         */
        org.landxml.schema.landXML11.ExclusionsDocument.Exclusions getExclusionsArray(int i);
        
        /**
         * Returns number of "Exclusions" element
         */
        int sizeOfExclusionsArray();
        
        /**
         * Sets array of all "Exclusions" element
         */
        void setExclusionsArray(org.landxml.schema.landXML11.ExclusionsDocument.Exclusions[] exclusionsArray);
        
        /**
         * Sets ith "Exclusions" element
         */
        void setExclusionsArray(int i, org.landxml.schema.landXML11.ExclusionsDocument.Exclusions exclusions);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Exclusions" element
         */
        org.landxml.schema.landXML11.ExclusionsDocument.Exclusions insertNewExclusions(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Exclusions" element
         */
        org.landxml.schema.landXML11.ExclusionsDocument.Exclusions addNewExclusions();
        
        /**
         * Removes the ith "Exclusions" element
         */
        void removeExclusions(int i);
        
        /**
         * Gets a List of "LocationAddress" elements
         */
        java.util.List<org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress> getLocationAddressList();
        
        /**
         * Gets array of all "LocationAddress" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress[] getLocationAddressArray();
        
        /**
         * Gets ith "LocationAddress" element
         */
        org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress getLocationAddressArray(int i);
        
        /**
         * Returns number of "LocationAddress" element
         */
        int sizeOfLocationAddressArray();
        
        /**
         * Sets array of all "LocationAddress" element
         */
        void setLocationAddressArray(org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress[] locationAddressArray);
        
        /**
         * Sets ith "LocationAddress" element
         */
        void setLocationAddressArray(int i, org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress locationAddress);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "LocationAddress" element
         */
        org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress insertNewLocationAddress(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "LocationAddress" element
         */
        org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress addNewLocationAddress();
        
        /**
         * Removes the ith "LocationAddress" element
         */
        void removeLocationAddress(int i);
        
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
         * Gets the "area" attribute
         */
        double getArea();
        
        /**
         * Gets (as xml) the "area" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetArea();
        
        /**
         * True if has "area" attribute
         */
        boolean isSetArea();
        
        /**
         * Sets the "area" attribute
         */
        void setArea(double area);
        
        /**
         * Sets (as xml) the "area" attribute
         */
        void xsetArea(org.apache.xmlbeans.XmlDouble area);
        
        /**
         * Unsets the "area" attribute
         */
        void unsetArea();
        
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
         * Gets the "dirClosure" attribute
         */
        double getDirClosure();
        
        /**
         * Gets (as xml) the "dirClosure" attribute
         */
        org.landxml.schema.landXML11.Direction xgetDirClosure();
        
        /**
         * True if has "dirClosure" attribute
         */
        boolean isSetDirClosure();
        
        /**
         * Sets the "dirClosure" attribute
         */
        void setDirClosure(double dirClosure);
        
        /**
         * Sets (as xml) the "dirClosure" attribute
         */
        void xsetDirClosure(org.landxml.schema.landXML11.Direction dirClosure);
        
        /**
         * Unsets the "dirClosure" attribute
         */
        void unsetDirClosure();
        
        /**
         * Gets the "distClosure" attribute
         */
        double getDistClosure();
        
        /**
         * Gets (as xml) the "distClosure" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetDistClosure();
        
        /**
         * True if has "distClosure" attribute
         */
        boolean isSetDistClosure();
        
        /**
         * Sets the "distClosure" attribute
         */
        void setDistClosure(double distClosure);
        
        /**
         * Sets (as xml) the "distClosure" attribute
         */
        void xsetDistClosure(org.apache.xmlbeans.XmlDouble distClosure);
        
        /**
         * Unsets the "distClosure" attribute
         */
        void unsetDistClosure();
        
        /**
         * Gets the "owner" attribute
         */
        java.lang.String getOwner();
        
        /**
         * Gets (as xml) the "owner" attribute
         */
        org.apache.xmlbeans.XmlString xgetOwner();
        
        /**
         * True if has "owner" attribute
         */
        boolean isSetOwner();
        
        /**
         * Sets the "owner" attribute
         */
        void setOwner(java.lang.String owner);
        
        /**
         * Sets (as xml) the "owner" attribute
         */
        void xsetOwner(org.apache.xmlbeans.XmlString owner);
        
        /**
         * Unsets the "owner" attribute
         */
        void unsetOwner();
        
        /**
         * Gets the "parcelType" attribute
         */
        java.lang.String getParcelType();
        
        /**
         * Gets (as xml) the "parcelType" attribute
         */
        org.apache.xmlbeans.XmlString xgetParcelType();
        
        /**
         * True if has "parcelType" attribute
         */
        boolean isSetParcelType();
        
        /**
         * Sets the "parcelType" attribute
         */
        void setParcelType(java.lang.String parcelType);
        
        /**
         * Sets (as xml) the "parcelType" attribute
         */
        void xsetParcelType(org.apache.xmlbeans.XmlString parcelType);
        
        /**
         * Unsets the "parcelType" attribute
         */
        void unsetParcelType();
        
        /**
         * Gets the "setbackFront" attribute
         */
        double getSetbackFront();
        
        /**
         * Gets (as xml) the "setbackFront" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSetbackFront();
        
        /**
         * True if has "setbackFront" attribute
         */
        boolean isSetSetbackFront();
        
        /**
         * Sets the "setbackFront" attribute
         */
        void setSetbackFront(double setbackFront);
        
        /**
         * Sets (as xml) the "setbackFront" attribute
         */
        void xsetSetbackFront(org.apache.xmlbeans.XmlDouble setbackFront);
        
        /**
         * Unsets the "setbackFront" attribute
         */
        void unsetSetbackFront();
        
        /**
         * Gets the "setbackRear" attribute
         */
        double getSetbackRear();
        
        /**
         * Gets (as xml) the "setbackRear" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSetbackRear();
        
        /**
         * True if has "setbackRear" attribute
         */
        boolean isSetSetbackRear();
        
        /**
         * Sets the "setbackRear" attribute
         */
        void setSetbackRear(double setbackRear);
        
        /**
         * Sets (as xml) the "setbackRear" attribute
         */
        void xsetSetbackRear(org.apache.xmlbeans.XmlDouble setbackRear);
        
        /**
         * Unsets the "setbackRear" attribute
         */
        void unsetSetbackRear();
        
        /**
         * Gets the "setbackSide" attribute
         */
        double getSetbackSide();
        
        /**
         * Gets (as xml) the "setbackSide" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSetbackSide();
        
        /**
         * True if has "setbackSide" attribute
         */
        boolean isSetSetbackSide();
        
        /**
         * Sets the "setbackSide" attribute
         */
        void setSetbackSide(double setbackSide);
        
        /**
         * Sets (as xml) the "setbackSide" attribute
         */
        void xsetSetbackSide(org.apache.xmlbeans.XmlDouble setbackSide);
        
        /**
         * Unsets the "setbackSide" attribute
         */
        void unsetSetbackSide();
        
        /**
         * Gets the "state" attribute
         */
        org.landxml.schema.landXML11.ParcelStateType.Enum getState();
        
        /**
         * Gets (as xml) the "state" attribute
         */
        org.landxml.schema.landXML11.ParcelStateType xgetState();
        
        /**
         * True if has "state" attribute
         */
        boolean isSetState();
        
        /**
         * Sets the "state" attribute
         */
        void setState(org.landxml.schema.landXML11.ParcelStateType.Enum state);
        
        /**
         * Sets (as xml) the "state" attribute
         */
        void xsetState(org.landxml.schema.landXML11.ParcelStateType state);
        
        /**
         * Unsets the "state" attribute
         */
        void unsetState();
        
        /**
         * Gets the "taxId" attribute
         */
        java.lang.String getTaxId();
        
        /**
         * Gets (as xml) the "taxId" attribute
         */
        org.apache.xmlbeans.XmlString xgetTaxId();
        
        /**
         * True if has "taxId" attribute
         */
        boolean isSetTaxId();
        
        /**
         * Sets the "taxId" attribute
         */
        void setTaxId(java.lang.String taxId);
        
        /**
         * Sets (as xml) the "taxId" attribute
         */
        void xsetTaxId(org.apache.xmlbeans.XmlString taxId);
        
        /**
         * Unsets the "taxId" attribute
         */
        void unsetTaxId();
        
        /**
         * Gets the "class" attribute
         */
        java.lang.String getClass1();
        
        /**
         * Gets (as xml) the "class" attribute
         */
        org.landxml.schema.landXML11.ParcelClass xgetClass1();
        
        /**
         * True if has "class" attribute
         */
        boolean isSetClass1();
        
        /**
         * Sets the "class" attribute
         */
        void setClass1(java.lang.String class1);
        
        /**
         * Sets (as xml) the "class" attribute
         */
        void xsetClass1(org.landxml.schema.landXML11.ParcelClass class1);
        
        /**
         * Unsets the "class" attribute
         */
        void unsetClass1();
        
        /**
         * Gets the "useOfParcel" attribute
         */
        java.lang.String getUseOfParcel();
        
        /**
         * Gets (as xml) the "useOfParcel" attribute
         */
        org.landxml.schema.landXML11.UseOfParcelType xgetUseOfParcel();
        
        /**
         * True if has "useOfParcel" attribute
         */
        boolean isSetUseOfParcel();
        
        /**
         * Sets the "useOfParcel" attribute
         */
        void setUseOfParcel(java.lang.String useOfParcel);
        
        /**
         * Sets (as xml) the "useOfParcel" attribute
         */
        void xsetUseOfParcel(org.landxml.schema.landXML11.UseOfParcelType useOfParcel);
        
        /**
         * Unsets the "useOfParcel" attribute
         */
        void unsetUseOfParcel();
        
        /**
         * Gets the "parcelFormat" attribute
         */
        java.lang.String getParcelFormat();
        
        /**
         * Gets (as xml) the "parcelFormat" attribute
         */
        org.landxml.schema.landXML11.ParcelFormat xgetParcelFormat();
        
        /**
         * True if has "parcelFormat" attribute
         */
        boolean isSetParcelFormat();
        
        /**
         * Sets the "parcelFormat" attribute
         */
        void setParcelFormat(java.lang.String parcelFormat);
        
        /**
         * Sets (as xml) the "parcelFormat" attribute
         */
        void xsetParcelFormat(org.landxml.schema.landXML11.ParcelFormat parcelFormat);
        
        /**
         * Unsets the "parcelFormat" attribute
         */
        void unsetParcelFormat();
        
        /**
         * Gets the "buildingNo" attribute
         */
        java.lang.String getBuildingNo();
        
        /**
         * Gets (as xml) the "buildingNo" attribute
         */
        org.apache.xmlbeans.XmlString xgetBuildingNo();
        
        /**
         * True if has "buildingNo" attribute
         */
        boolean isSetBuildingNo();
        
        /**
         * Sets the "buildingNo" attribute
         */
        void setBuildingNo(java.lang.String buildingNo);
        
        /**
         * Sets (as xml) the "buildingNo" attribute
         */
        void xsetBuildingNo(org.apache.xmlbeans.XmlString buildingNo);
        
        /**
         * Unsets the "buildingNo" attribute
         */
        void unsetBuildingNo();
        
        /**
         * Gets the "buildingLevelNo" attribute
         */
        java.lang.String getBuildingLevelNo();
        
        /**
         * Gets (as xml) the "buildingLevelNo" attribute
         */
        org.apache.xmlbeans.XmlString xgetBuildingLevelNo();
        
        /**
         * True if has "buildingLevelNo" attribute
         */
        boolean isSetBuildingLevelNo();
        
        /**
         * Sets the "buildingLevelNo" attribute
         */
        void setBuildingLevelNo(java.lang.String buildingLevelNo);
        
        /**
         * Sets (as xml) the "buildingLevelNo" attribute
         */
        void xsetBuildingLevelNo(org.apache.xmlbeans.XmlString buildingLevelNo);
        
        /**
         * Unsets the "buildingLevelNo" attribute
         */
        void unsetBuildingLevelNo();
        
        /**
         * Gets the "volume" attribute
         */
        java.lang.String getVolume();
        
        /**
         * Gets (as xml) the "volume" attribute
         */
        org.apache.xmlbeans.XmlString xgetVolume();
        
        /**
         * True if has "volume" attribute
         */
        boolean isSetVolume();
        
        /**
         * Sets the "volume" attribute
         */
        void setVolume(java.lang.String volume);
        
        /**
         * Sets (as xml) the "volume" attribute
         */
        void xsetVolume(org.apache.xmlbeans.XmlString volume);
        
        /**
         * Unsets the "volume" attribute
         */
        void unsetVolume();
        
        /**
         * Gets the "pclRef" attribute
         */
        java.lang.String getPclRef();
        
        /**
         * Gets (as xml) the "pclRef" attribute
         */
        org.landxml.schema.landXML11.ParcelNameRef xgetPclRef();
        
        /**
         * True if has "pclRef" attribute
         */
        boolean isSetPclRef();
        
        /**
         * Sets the "pclRef" attribute
         */
        void setPclRef(java.lang.String pclRef);
        
        /**
         * Sets (as xml) the "pclRef" attribute
         */
        void xsetPclRef(org.landxml.schema.landXML11.ParcelNameRef pclRef);
        
        /**
         * Unsets the "pclRef" attribute
         */
        void unsetPclRef();
        
        /**
         * Gets the "lotEntitlements" attribute
         */
        java.lang.String getLotEntitlements();
        
        /**
         * Gets (as xml) the "lotEntitlements" attribute
         */
        org.apache.xmlbeans.XmlString xgetLotEntitlements();
        
        /**
         * True if has "lotEntitlements" attribute
         */
        boolean isSetLotEntitlements();
        
        /**
         * Sets the "lotEntitlements" attribute
         */
        void setLotEntitlements(java.lang.String lotEntitlements);
        
        /**
         * Sets (as xml) the "lotEntitlements" attribute
         */
        void xsetLotEntitlements(org.apache.xmlbeans.XmlString lotEntitlements);
        
        /**
         * Unsets the "lotEntitlements" attribute
         */
        void unsetLotEntitlements();
        
        /**
         * Gets the "liabilityApportionment" attribute
         */
        java.lang.String getLiabilityApportionment();
        
        /**
         * Gets (as xml) the "liabilityApportionment" attribute
         */
        org.apache.xmlbeans.XmlString xgetLiabilityApportionment();
        
        /**
         * True if has "liabilityApportionment" attribute
         */
        boolean isSetLiabilityApportionment();
        
        /**
         * Sets the "liabilityApportionment" attribute
         */
        void setLiabilityApportionment(java.lang.String liabilityApportionment);
        
        /**
         * Sets (as xml) the "liabilityApportionment" attribute
         */
        void xsetLiabilityApportionment(org.apache.xmlbeans.XmlString liabilityApportionment);
        
        /**
         * Unsets the "liabilityApportionment" attribute
         */
        void unsetLiabilityApportionment();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.ParcelDocument.Parcel newInstance() {
              return (org.landxml.schema.landXML11.ParcelDocument.Parcel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.ParcelDocument.Parcel newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.ParcelDocument.Parcel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.ParcelDocument newInstance() {
          return (org.landxml.schema.landXML11.ParcelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.ParcelDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.ParcelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.ParcelDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ParcelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.ParcelDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ParcelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.ParcelDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ParcelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.ParcelDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ParcelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.ParcelDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ParcelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.ParcelDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ParcelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.ParcelDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ParcelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.ParcelDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ParcelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.ParcelDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ParcelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.ParcelDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.ParcelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.ParcelDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ParcelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.ParcelDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ParcelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.ParcelDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ParcelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.ParcelDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.ParcelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ParcelDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ParcelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.ParcelDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.ParcelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
