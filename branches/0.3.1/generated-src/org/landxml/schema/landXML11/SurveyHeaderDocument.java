/*
 * An XML document type.
 * Localname: SurveyHeader
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.SurveyHeaderDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one SurveyHeader(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface SurveyHeaderDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SurveyHeaderDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("surveyheader501bdoctype");
    
    /**
     * Gets the "SurveyHeader" element
     */
    org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader getSurveyHeader();
    
    /**
     * Sets the "SurveyHeader" element
     */
    void setSurveyHeader(org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader surveyHeader);
    
    /**
     * Appends and returns a new empty "SurveyHeader" element
     */
    org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader addNewSurveyHeader();
    
    /**
     * An XML SurveyHeader(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface SurveyHeader extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SurveyHeader.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("surveyheader7a38elemtype");
        
        /**
         * Gets a List of "Annotation" elements
         */
        java.util.List<org.landxml.schema.landXML11.AnnotationDocument.Annotation> getAnnotationList();
        
        /**
         * Gets array of all "Annotation" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.AnnotationDocument.Annotation[] getAnnotationArray();
        
        /**
         * Gets ith "Annotation" element
         */
        org.landxml.schema.landXML11.AnnotationDocument.Annotation getAnnotationArray(int i);
        
        /**
         * Returns number of "Annotation" element
         */
        int sizeOfAnnotationArray();
        
        /**
         * Sets array of all "Annotation" element
         */
        void setAnnotationArray(org.landxml.schema.landXML11.AnnotationDocument.Annotation[] annotationArray);
        
        /**
         * Sets ith "Annotation" element
         */
        void setAnnotationArray(int i, org.landxml.schema.landXML11.AnnotationDocument.Annotation annotation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Annotation" element
         */
        org.landxml.schema.landXML11.AnnotationDocument.Annotation insertNewAnnotation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Annotation" element
         */
        org.landxml.schema.landXML11.AnnotationDocument.Annotation addNewAnnotation();
        
        /**
         * Removes the ith "Annotation" element
         */
        void removeAnnotation(int i);
        
        /**
         * Gets a List of "AdministrativeArea" elements
         */
        java.util.List<org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea> getAdministrativeAreaList();
        
        /**
         * Gets array of all "AdministrativeArea" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea[] getAdministrativeAreaArray();
        
        /**
         * Gets ith "AdministrativeArea" element
         */
        org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea getAdministrativeAreaArray(int i);
        
        /**
         * Returns number of "AdministrativeArea" element
         */
        int sizeOfAdministrativeAreaArray();
        
        /**
         * Sets array of all "AdministrativeArea" element
         */
        void setAdministrativeAreaArray(org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea[] administrativeAreaArray);
        
        /**
         * Sets ith "AdministrativeArea" element
         */
        void setAdministrativeAreaArray(int i, org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea administrativeArea);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AdministrativeArea" element
         */
        org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea insertNewAdministrativeArea(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AdministrativeArea" element
         */
        org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea addNewAdministrativeArea();
        
        /**
         * Removes the ith "AdministrativeArea" element
         */
        void removeAdministrativeArea(int i);
        
        /**
         * Gets a List of "AdministrativeDate" elements
         */
        java.util.List<org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate> getAdministrativeDateList();
        
        /**
         * Gets array of all "AdministrativeDate" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate[] getAdministrativeDateArray();
        
        /**
         * Gets ith "AdministrativeDate" element
         */
        org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate getAdministrativeDateArray(int i);
        
        /**
         * Returns number of "AdministrativeDate" element
         */
        int sizeOfAdministrativeDateArray();
        
        /**
         * Sets array of all "AdministrativeDate" element
         */
        void setAdministrativeDateArray(org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate[] administrativeDateArray);
        
        /**
         * Sets ith "AdministrativeDate" element
         */
        void setAdministrativeDateArray(int i, org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate administrativeDate);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AdministrativeDate" element
         */
        org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate insertNewAdministrativeDate(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AdministrativeDate" element
         */
        org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate addNewAdministrativeDate();
        
        /**
         * Removes the ith "AdministrativeDate" element
         */
        void removeAdministrativeDate(int i);
        
        /**
         * Gets a List of "CoordinateSystem" elements
         */
        java.util.List<org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem> getCoordinateSystemList();
        
        /**
         * Gets array of all "CoordinateSystem" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem[] getCoordinateSystemArray();
        
        /**
         * Gets ith "CoordinateSystem" element
         */
        org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem getCoordinateSystemArray(int i);
        
        /**
         * Returns number of "CoordinateSystem" element
         */
        int sizeOfCoordinateSystemArray();
        
        /**
         * Sets array of all "CoordinateSystem" element
         */
        void setCoordinateSystemArray(org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem[] coordinateSystemArray);
        
        /**
         * Sets ith "CoordinateSystem" element
         */
        void setCoordinateSystemArray(int i, org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem coordinateSystem);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CoordinateSystem" element
         */
        org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem insertNewCoordinateSystem(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CoordinateSystem" element
         */
        org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem addNewCoordinateSystem();
        
        /**
         * Removes the ith "CoordinateSystem" element
         */
        void removeCoordinateSystem(int i);
        
        /**
         * Gets a List of "Units" elements
         */
        java.util.List<org.landxml.schema.landXML11.UnitsDocument.Units> getUnitsList();
        
        /**
         * Gets array of all "Units" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.UnitsDocument.Units[] getUnitsArray();
        
        /**
         * Gets ith "Units" element
         */
        org.landxml.schema.landXML11.UnitsDocument.Units getUnitsArray(int i);
        
        /**
         * Returns number of "Units" element
         */
        int sizeOfUnitsArray();
        
        /**
         * Sets array of all "Units" element
         */
        void setUnitsArray(org.landxml.schema.landXML11.UnitsDocument.Units[] unitsArray);
        
        /**
         * Sets ith "Units" element
         */
        void setUnitsArray(int i, org.landxml.schema.landXML11.UnitsDocument.Units units);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Units" element
         */
        org.landxml.schema.landXML11.UnitsDocument.Units insertNewUnits(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Units" element
         */
        org.landxml.schema.landXML11.UnitsDocument.Units addNewUnits();
        
        /**
         * Removes the ith "Units" element
         */
        void removeUnits(int i);
        
        /**
         * Gets a List of "MapPoint" elements
         */
        java.util.List<org.landxml.schema.landXML11.PointType> getMapPointList();
        
        /**
         * Gets array of all "MapPoint" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.PointType[] getMapPointArray();
        
        /**
         * Gets ith "MapPoint" element
         */
        org.landxml.schema.landXML11.PointType getMapPointArray(int i);
        
        /**
         * Returns number of "MapPoint" element
         */
        int sizeOfMapPointArray();
        
        /**
         * Sets array of all "MapPoint" element
         */
        void setMapPointArray(org.landxml.schema.landXML11.PointType[] mapPointArray);
        
        /**
         * Sets ith "MapPoint" element
         */
        void setMapPointArray(int i, org.landxml.schema.landXML11.PointType mapPoint);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "MapPoint" element
         */
        org.landxml.schema.landXML11.PointType insertNewMapPoint(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "MapPoint" element
         */
        org.landxml.schema.landXML11.PointType addNewMapPoint();
        
        /**
         * Removes the ith "MapPoint" element
         */
        void removeMapPoint(int i);
        
        /**
         * Gets a List of "Personnel" elements
         */
        java.util.List<org.landxml.schema.landXML11.PersonnelDocument.Personnel> getPersonnelList();
        
        /**
         * Gets array of all "Personnel" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.PersonnelDocument.Personnel[] getPersonnelArray();
        
        /**
         * Gets ith "Personnel" element
         */
        org.landxml.schema.landXML11.PersonnelDocument.Personnel getPersonnelArray(int i);
        
        /**
         * Returns number of "Personnel" element
         */
        int sizeOfPersonnelArray();
        
        /**
         * Sets array of all "Personnel" element
         */
        void setPersonnelArray(org.landxml.schema.landXML11.PersonnelDocument.Personnel[] personnelArray);
        
        /**
         * Sets ith "Personnel" element
         */
        void setPersonnelArray(int i, org.landxml.schema.landXML11.PersonnelDocument.Personnel personnel);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Personnel" element
         */
        org.landxml.schema.landXML11.PersonnelDocument.Personnel insertNewPersonnel(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Personnel" element
         */
        org.landxml.schema.landXML11.PersonnelDocument.Personnel addNewPersonnel();
        
        /**
         * Removes the ith "Personnel" element
         */
        void removePersonnel(int i);
        
        /**
         * Gets a List of "FieldNote" elements
         */
        java.util.List<org.landxml.schema.landXML11.FieldNoteDocument.FieldNote> getFieldNoteList();
        
        /**
         * Gets array of all "FieldNote" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.FieldNoteDocument.FieldNote[] getFieldNoteArray();
        
        /**
         * Gets ith "FieldNote" element
         */
        org.landxml.schema.landXML11.FieldNoteDocument.FieldNote getFieldNoteArray(int i);
        
        /**
         * Returns number of "FieldNote" element
         */
        int sizeOfFieldNoteArray();
        
        /**
         * Sets array of all "FieldNote" element
         */
        void setFieldNoteArray(org.landxml.schema.landXML11.FieldNoteDocument.FieldNote[] fieldNoteArray);
        
        /**
         * Sets ith "FieldNote" element
         */
        void setFieldNoteArray(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote fieldNote);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "FieldNote" element
         */
        org.landxml.schema.landXML11.FieldNoteDocument.FieldNote insertNewFieldNote(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "FieldNote" element
         */
        org.landxml.schema.landXML11.FieldNoteDocument.FieldNote addNewFieldNote();
        
        /**
         * Removes the ith "FieldNote" element
         */
        void removeFieldNote(int i);
        
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
         * Gets a List of "SurveyorCertificate" elements
         */
        java.util.List<org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate> getSurveyorCertificateList();
        
        /**
         * Gets array of all "SurveyorCertificate" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate[] getSurveyorCertificateArray();
        
        /**
         * Gets ith "SurveyorCertificate" element
         */
        org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate getSurveyorCertificateArray(int i);
        
        /**
         * Returns number of "SurveyorCertificate" element
         */
        int sizeOfSurveyorCertificateArray();
        
        /**
         * Sets array of all "SurveyorCertificate" element
         */
        void setSurveyorCertificateArray(org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate[] surveyorCertificateArray);
        
        /**
         * Sets ith "SurveyorCertificate" element
         */
        void setSurveyorCertificateArray(int i, org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate surveyorCertificate);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SurveyorCertificate" element
         */
        org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate insertNewSurveyorCertificate(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SurveyorCertificate" element
         */
        org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate addNewSurveyorCertificate();
        
        /**
         * Removes the ith "SurveyorCertificate" element
         */
        void removeSurveyorCertificate(int i);
        
        /**
         * Gets a List of "PurposeOfSurvey" elements
         */
        java.util.List<org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey> getPurposeOfSurveyList();
        
        /**
         * Gets array of all "PurposeOfSurvey" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey[] getPurposeOfSurveyArray();
        
        /**
         * Gets ith "PurposeOfSurvey" element
         */
        org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey getPurposeOfSurveyArray(int i);
        
        /**
         * Returns number of "PurposeOfSurvey" element
         */
        int sizeOfPurposeOfSurveyArray();
        
        /**
         * Sets array of all "PurposeOfSurvey" element
         */
        void setPurposeOfSurveyArray(org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey[] purposeOfSurveyArray);
        
        /**
         * Sets ith "PurposeOfSurvey" element
         */
        void setPurposeOfSurveyArray(int i, org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey purposeOfSurvey);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PurposeOfSurvey" element
         */
        org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey insertNewPurposeOfSurvey(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PurposeOfSurvey" element
         */
        org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey addNewPurposeOfSurvey();
        
        /**
         * Removes the ith "PurposeOfSurvey" element
         */
        void removePurposeOfSurvey(int i);
        
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
         * Gets the "purpose" attribute
         */
        org.landxml.schema.landXML11.PurposeType.Enum getPurpose();
        
        /**
         * Gets (as xml) the "purpose" attribute
         */
        org.landxml.schema.landXML11.PurposeType xgetPurpose();
        
        /**
         * True if has "purpose" attribute
         */
        boolean isSetPurpose();
        
        /**
         * Sets the "purpose" attribute
         */
        void setPurpose(org.landxml.schema.landXML11.PurposeType.Enum purpose);
        
        /**
         * Sets (as xml) the "purpose" attribute
         */
        void xsetPurpose(org.landxml.schema.landXML11.PurposeType purpose);
        
        /**
         * Unsets the "purpose" attribute
         */
        void unsetPurpose();
        
        /**
         * Gets the "startTime" attribute
         */
        java.util.Calendar getStartTime();
        
        /**
         * Gets (as xml) the "startTime" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetStartTime();
        
        /**
         * True if has "startTime" attribute
         */
        boolean isSetStartTime();
        
        /**
         * Sets the "startTime" attribute
         */
        void setStartTime(java.util.Calendar startTime);
        
        /**
         * Sets (as xml) the "startTime" attribute
         */
        void xsetStartTime(org.apache.xmlbeans.XmlDateTime startTime);
        
        /**
         * Unsets the "startTime" attribute
         */
        void unsetStartTime();
        
        /**
         * Gets the "endTime" attribute
         */
        java.util.Calendar getEndTime();
        
        /**
         * Gets (as xml) the "endTime" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetEndTime();
        
        /**
         * True if has "endTime" attribute
         */
        boolean isSetEndTime();
        
        /**
         * Sets the "endTime" attribute
         */
        void setEndTime(java.util.Calendar endTime);
        
        /**
         * Sets (as xml) the "endTime" attribute
         */
        void xsetEndTime(org.apache.xmlbeans.XmlDateTime endTime);
        
        /**
         * Unsets the "endTime" attribute
         */
        void unsetEndTime();
        
        /**
         * Gets the "surveyor" attribute
         */
        java.lang.String getSurveyor();
        
        /**
         * Gets (as xml) the "surveyor" attribute
         */
        org.apache.xmlbeans.XmlString xgetSurveyor();
        
        /**
         * True if has "surveyor" attribute
         */
        boolean isSetSurveyor();
        
        /**
         * Sets the "surveyor" attribute
         */
        void setSurveyor(java.lang.String surveyor);
        
        /**
         * Sets (as xml) the "surveyor" attribute
         */
        void xsetSurveyor(org.apache.xmlbeans.XmlString surveyor);
        
        /**
         * Unsets the "surveyor" attribute
         */
        void unsetSurveyor();
        
        /**
         * Gets the "surveyorFirm" attribute
         */
        java.lang.String getSurveyorFirm();
        
        /**
         * Gets (as xml) the "surveyorFirm" attribute
         */
        org.apache.xmlbeans.XmlString xgetSurveyorFirm();
        
        /**
         * True if has "surveyorFirm" attribute
         */
        boolean isSetSurveyorFirm();
        
        /**
         * Sets the "surveyorFirm" attribute
         */
        void setSurveyorFirm(java.lang.String surveyorFirm);
        
        /**
         * Sets (as xml) the "surveyorFirm" attribute
         */
        void xsetSurveyorFirm(org.apache.xmlbeans.XmlString surveyorFirm);
        
        /**
         * Unsets the "surveyorFirm" attribute
         */
        void unsetSurveyorFirm();
        
        /**
         * Gets the "surveyorReference" attribute
         */
        java.lang.String getSurveyorReference();
        
        /**
         * Gets (as xml) the "surveyorReference" attribute
         */
        org.apache.xmlbeans.XmlString xgetSurveyorReference();
        
        /**
         * True if has "surveyorReference" attribute
         */
        boolean isSetSurveyorReference();
        
        /**
         * Sets the "surveyorReference" attribute
         */
        void setSurveyorReference(java.lang.String surveyorReference);
        
        /**
         * Sets (as xml) the "surveyorReference" attribute
         */
        void xsetSurveyorReference(org.apache.xmlbeans.XmlString surveyorReference);
        
        /**
         * Unsets the "surveyorReference" attribute
         */
        void unsetSurveyorReference();
        
        /**
         * Gets the "surveyorRegistration" attribute
         */
        java.lang.String getSurveyorRegistration();
        
        /**
         * Gets (as xml) the "surveyorRegistration" attribute
         */
        org.apache.xmlbeans.XmlString xgetSurveyorRegistration();
        
        /**
         * True if has "surveyorRegistration" attribute
         */
        boolean isSetSurveyorRegistration();
        
        /**
         * Sets the "surveyorRegistration" attribute
         */
        void setSurveyorRegistration(java.lang.String surveyorRegistration);
        
        /**
         * Sets (as xml) the "surveyorRegistration" attribute
         */
        void xsetSurveyorRegistration(org.apache.xmlbeans.XmlString surveyorRegistration);
        
        /**
         * Unsets the "surveyorRegistration" attribute
         */
        void unsetSurveyorRegistration();
        
        /**
         * Gets the "surveyPurpose" attribute
         */
        java.lang.String getSurveyPurpose();
        
        /**
         * Gets (as xml) the "surveyPurpose" attribute
         */
        org.apache.xmlbeans.XmlString xgetSurveyPurpose();
        
        /**
         * True if has "surveyPurpose" attribute
         */
        boolean isSetSurveyPurpose();
        
        /**
         * Sets the "surveyPurpose" attribute
         */
        void setSurveyPurpose(java.lang.String surveyPurpose);
        
        /**
         * Sets (as xml) the "surveyPurpose" attribute
         */
        void xsetSurveyPurpose(org.apache.xmlbeans.XmlString surveyPurpose);
        
        /**
         * Unsets the "surveyPurpose" attribute
         */
        void unsetSurveyPurpose();
        
        /**
         * Gets the "type" attribute
         */
        org.landxml.schema.landXML11.SurveyType.Enum getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        org.landxml.schema.landXML11.SurveyType xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(org.landxml.schema.landXML11.SurveyType.Enum type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(org.landxml.schema.landXML11.SurveyType type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * Gets the "class" attribute
         */
        java.lang.String getClass1();
        
        /**
         * Gets (as xml) the "class" attribute
         */
        org.apache.xmlbeans.XmlString xgetClass1();
        
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
        void xsetClass1(org.apache.xmlbeans.XmlString class1);
        
        /**
         * Unsets the "class" attribute
         */
        void unsetClass1();
        
        /**
         * Gets the "county" attribute
         */
        java.lang.String getCounty();
        
        /**
         * Gets (as xml) the "county" attribute
         */
        org.apache.xmlbeans.XmlString xgetCounty();
        
        /**
         * True if has "county" attribute
         */
        boolean isSetCounty();
        
        /**
         * Sets the "county" attribute
         */
        void setCounty(java.lang.String county);
        
        /**
         * Sets (as xml) the "county" attribute
         */
        void xsetCounty(org.apache.xmlbeans.XmlString county);
        
        /**
         * Unsets the "county" attribute
         */
        void unsetCounty();
        
        /**
         * Gets the "applyAtmosphericCorrection" attribute
         */
        boolean getApplyAtmosphericCorrection();
        
        /**
         * Gets (as xml) the "applyAtmosphericCorrection" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetApplyAtmosphericCorrection();
        
        /**
         * True if has "applyAtmosphericCorrection" attribute
         */
        boolean isSetApplyAtmosphericCorrection();
        
        /**
         * Sets the "applyAtmosphericCorrection" attribute
         */
        void setApplyAtmosphericCorrection(boolean applyAtmosphericCorrection);
        
        /**
         * Sets (as xml) the "applyAtmosphericCorrection" attribute
         */
        void xsetApplyAtmosphericCorrection(org.apache.xmlbeans.XmlBoolean applyAtmosphericCorrection);
        
        /**
         * Unsets the "applyAtmosphericCorrection" attribute
         */
        void unsetApplyAtmosphericCorrection();
        
        /**
         * Gets the "pressure" attribute
         */
        double getPressure();
        
        /**
         * Gets (as xml) the "pressure" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetPressure();
        
        /**
         * True if has "pressure" attribute
         */
        boolean isSetPressure();
        
        /**
         * Sets the "pressure" attribute
         */
        void setPressure(double pressure);
        
        /**
         * Sets (as xml) the "pressure" attribute
         */
        void xsetPressure(org.apache.xmlbeans.XmlDouble pressure);
        
        /**
         * Unsets the "pressure" attribute
         */
        void unsetPressure();
        
        /**
         * Gets the "temperature" attribute
         */
        double getTemperature();
        
        /**
         * Gets (as xml) the "temperature" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetTemperature();
        
        /**
         * True if has "temperature" attribute
         */
        boolean isSetTemperature();
        
        /**
         * Sets the "temperature" attribute
         */
        void setTemperature(double temperature);
        
        /**
         * Sets (as xml) the "temperature" attribute
         */
        void xsetTemperature(org.apache.xmlbeans.XmlDouble temperature);
        
        /**
         * Unsets the "temperature" attribute
         */
        void unsetTemperature();
        
        /**
         * Gets the "applySeaLevelCorrection" attribute
         */
        boolean getApplySeaLevelCorrection();
        
        /**
         * Gets (as xml) the "applySeaLevelCorrection" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetApplySeaLevelCorrection();
        
        /**
         * True if has "applySeaLevelCorrection" attribute
         */
        boolean isSetApplySeaLevelCorrection();
        
        /**
         * Sets the "applySeaLevelCorrection" attribute
         */
        void setApplySeaLevelCorrection(boolean applySeaLevelCorrection);
        
        /**
         * Sets (as xml) the "applySeaLevelCorrection" attribute
         */
        void xsetApplySeaLevelCorrection(org.apache.xmlbeans.XmlBoolean applySeaLevelCorrection);
        
        /**
         * Unsets the "applySeaLevelCorrection" attribute
         */
        void unsetApplySeaLevelCorrection();
        
        /**
         * Gets the "scaleFactor" attribute
         */
        double getScaleFactor();
        
        /**
         * Gets (as xml) the "scaleFactor" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetScaleFactor();
        
        /**
         * True if has "scaleFactor" attribute
         */
        boolean isSetScaleFactor();
        
        /**
         * Sets the "scaleFactor" attribute
         */
        void setScaleFactor(double scaleFactor);
        
        /**
         * Sets (as xml) the "scaleFactor" attribute
         */
        void xsetScaleFactor(org.apache.xmlbeans.XmlDouble scaleFactor);
        
        /**
         * Unsets the "scaleFactor" attribute
         */
        void unsetScaleFactor();
        
        /**
         * Gets the "seaLevelCorrectionFactor" attribute
         */
        double getSeaLevelCorrectionFactor();
        
        /**
         * Gets (as xml) the "seaLevelCorrectionFactor" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSeaLevelCorrectionFactor();
        
        /**
         * True if has "seaLevelCorrectionFactor" attribute
         */
        boolean isSetSeaLevelCorrectionFactor();
        
        /**
         * Sets the "seaLevelCorrectionFactor" attribute
         */
        void setSeaLevelCorrectionFactor(double seaLevelCorrectionFactor);
        
        /**
         * Sets (as xml) the "seaLevelCorrectionFactor" attribute
         */
        void xsetSeaLevelCorrectionFactor(org.apache.xmlbeans.XmlDouble seaLevelCorrectionFactor);
        
        /**
         * Unsets the "seaLevelCorrectionFactor" attribute
         */
        void unsetSeaLevelCorrectionFactor();
        
        /**
         * Gets the "combinedFactor" attribute
         */
        double getCombinedFactor();
        
        /**
         * Gets (as xml) the "combinedFactor" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetCombinedFactor();
        
        /**
         * True if has "combinedFactor" attribute
         */
        boolean isSetCombinedFactor();
        
        /**
         * Sets the "combinedFactor" attribute
         */
        void setCombinedFactor(double combinedFactor);
        
        /**
         * Sets (as xml) the "combinedFactor" attribute
         */
        void xsetCombinedFactor(org.apache.xmlbeans.XmlDouble combinedFactor);
        
        /**
         * Unsets the "combinedFactor" attribute
         */
        void unsetCombinedFactor();
        
        /**
         * Gets the "jurisdiction" attribute
         */
        java.lang.String getJurisdiction();
        
        /**
         * Gets (as xml) the "jurisdiction" attribute
         */
        org.landxml.schema.landXML11.JurisdictionType xgetJurisdiction();
        
        /**
         * True if has "jurisdiction" attribute
         */
        boolean isSetJurisdiction();
        
        /**
         * Sets the "jurisdiction" attribute
         */
        void setJurisdiction(java.lang.String jurisdiction);
        
        /**
         * Sets (as xml) the "jurisdiction" attribute
         */
        void xsetJurisdiction(org.landxml.schema.landXML11.JurisdictionType jurisdiction);
        
        /**
         * Unsets the "jurisdiction" attribute
         */
        void unsetJurisdiction();
        
        /**
         * Gets the "submissionDate" attribute
         */
        java.util.Calendar getSubmissionDate();
        
        /**
         * Gets (as xml) the "submissionDate" attribute
         */
        org.apache.xmlbeans.XmlDate xgetSubmissionDate();
        
        /**
         * True if has "submissionDate" attribute
         */
        boolean isSetSubmissionDate();
        
        /**
         * Sets the "submissionDate" attribute
         */
        void setSubmissionDate(java.util.Calendar submissionDate);
        
        /**
         * Sets (as xml) the "submissionDate" attribute
         */
        void xsetSubmissionDate(org.apache.xmlbeans.XmlDate submissionDate);
        
        /**
         * Unsets the "submissionDate" attribute
         */
        void unsetSubmissionDate();
        
        /**
         * Gets the "documentStatus" attribute
         */
        java.lang.String getDocumentStatus();
        
        /**
         * Gets (as xml) the "documentStatus" attribute
         */
        org.landxml.schema.landXML11.DocumentStatusType xgetDocumentStatus();
        
        /**
         * True if has "documentStatus" attribute
         */
        boolean isSetDocumentStatus();
        
        /**
         * Sets the "documentStatus" attribute
         */
        void setDocumentStatus(java.lang.String documentStatus);
        
        /**
         * Sets (as xml) the "documentStatus" attribute
         */
        void xsetDocumentStatus(org.landxml.schema.landXML11.DocumentStatusType documentStatus);
        
        /**
         * Unsets the "documentStatus" attribute
         */
        void unsetDocumentStatus();
        
        /**
         * Gets the "headOfPower" attribute
         */
        java.lang.String getHeadOfPower();
        
        /**
         * Gets (as xml) the "headOfPower" attribute
         */
        org.landxml.schema.landXML11.HeadOfPowerType xgetHeadOfPower();
        
        /**
         * True if has "headOfPower" attribute
         */
        boolean isSetHeadOfPower();
        
        /**
         * Sets the "headOfPower" attribute
         */
        void setHeadOfPower(java.lang.String headOfPower);
        
        /**
         * Sets (as xml) the "headOfPower" attribute
         */
        void xsetHeadOfPower(org.landxml.schema.landXML11.HeadOfPowerType headOfPower);
        
        /**
         * Unsets the "headOfPower" attribute
         */
        void unsetHeadOfPower();
        
        /**
         * Gets the "surveyFormat" attribute
         */
        java.lang.String getSurveyFormat();
        
        /**
         * Gets (as xml) the "surveyFormat" attribute
         */
        org.landxml.schema.landXML11.SurveyFormatType xgetSurveyFormat();
        
        /**
         * True if has "surveyFormat" attribute
         */
        boolean isSetSurveyFormat();
        
        /**
         * Sets the "surveyFormat" attribute
         */
        void setSurveyFormat(java.lang.String surveyFormat);
        
        /**
         * Sets (as xml) the "surveyFormat" attribute
         */
        void xsetSurveyFormat(org.landxml.schema.landXML11.SurveyFormatType surveyFormat);
        
        /**
         * Unsets the "surveyFormat" attribute
         */
        void unsetSurveyFormat();
        
        /**
         * Gets the "surveyStatus" attribute
         */
        java.lang.String getSurveyStatus();
        
        /**
         * Gets (as xml) the "surveyStatus" attribute
         */
        org.landxml.schema.landXML11.SurveyStatusType xgetSurveyStatus();
        
        /**
         * True if has "surveyStatus" attribute
         */
        boolean isSetSurveyStatus();
        
        /**
         * Sets the "surveyStatus" attribute
         */
        void setSurveyStatus(java.lang.String surveyStatus);
        
        /**
         * Sets (as xml) the "surveyStatus" attribute
         */
        void xsetSurveyStatus(org.landxml.schema.landXML11.SurveyStatusType surveyStatus);
        
        /**
         * Unsets the "surveyStatus" attribute
         */
        void unsetSurveyStatus();
        
        /**
         * Gets the "communityTitleSchemeNo" attribute
         */
        int getCommunityTitleSchemeNo();
        
        /**
         * Gets (as xml) the "communityTitleSchemeNo" attribute
         */
        org.apache.xmlbeans.XmlInt xgetCommunityTitleSchemeNo();
        
        /**
         * True if has "communityTitleSchemeNo" attribute
         */
        boolean isSetCommunityTitleSchemeNo();
        
        /**
         * Sets the "communityTitleSchemeNo" attribute
         */
        void setCommunityTitleSchemeNo(int communityTitleSchemeNo);
        
        /**
         * Sets (as xml) the "communityTitleSchemeNo" attribute
         */
        void xsetCommunityTitleSchemeNo(org.apache.xmlbeans.XmlInt communityTitleSchemeNo);
        
        /**
         * Unsets the "communityTitleSchemeNo" attribute
         */
        void unsetCommunityTitleSchemeNo();
        
        /**
         * Gets the "communityTitleSchemeName" attribute
         */
        java.lang.String getCommunityTitleSchemeName();
        
        /**
         * Gets (as xml) the "communityTitleSchemeName" attribute
         */
        org.apache.xmlbeans.XmlString xgetCommunityTitleSchemeName();
        
        /**
         * True if has "communityTitleSchemeName" attribute
         */
        boolean isSetCommunityTitleSchemeName();
        
        /**
         * Sets the "communityTitleSchemeName" attribute
         */
        void setCommunityTitleSchemeName(java.lang.String communityTitleSchemeName);
        
        /**
         * Sets (as xml) the "communityTitleSchemeName" attribute
         */
        void xsetCommunityTitleSchemeName(org.apache.xmlbeans.XmlString communityTitleSchemeName);
        
        /**
         * Unsets the "communityTitleSchemeName" attribute
         */
        void unsetCommunityTitleSchemeName();
        
        /**
         * Gets the "fieldNoteFlag" attribute
         */
        boolean getFieldNoteFlag();
        
        /**
         * Gets (as xml) the "fieldNoteFlag" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetFieldNoteFlag();
        
        /**
         * True if has "fieldNoteFlag" attribute
         */
        boolean isSetFieldNoteFlag();
        
        /**
         * Sets the "fieldNoteFlag" attribute
         */
        void setFieldNoteFlag(boolean fieldNoteFlag);
        
        /**
         * Sets (as xml) the "fieldNoteFlag" attribute
         */
        void xsetFieldNoteFlag(org.apache.xmlbeans.XmlBoolean fieldNoteFlag);
        
        /**
         * Unsets the "fieldNoteFlag" attribute
         */
        void unsetFieldNoteFlag();
        
        /**
         * Gets the "fieldNoteReference" attribute
         */
        java.lang.String getFieldNoteReference();
        
        /**
         * Gets (as xml) the "fieldNoteReference" attribute
         */
        org.apache.xmlbeans.XmlString xgetFieldNoteReference();
        
        /**
         * True if has "fieldNoteReference" attribute
         */
        boolean isSetFieldNoteReference();
        
        /**
         * Sets the "fieldNoteReference" attribute
         */
        void setFieldNoteReference(java.lang.String fieldNoteReference);
        
        /**
         * Sets (as xml) the "fieldNoteReference" attribute
         */
        void xsetFieldNoteReference(org.apache.xmlbeans.XmlString fieldNoteReference);
        
        /**
         * Unsets the "fieldNoteReference" attribute
         */
        void unsetFieldNoteReference();
        
        /**
         * Gets the "fieldReport" attribute
         */
        java.lang.String getFieldReport();
        
        /**
         * Gets (as xml) the "fieldReport" attribute
         */
        org.apache.xmlbeans.XmlString xgetFieldReport();
        
        /**
         * True if has "fieldReport" attribute
         */
        boolean isSetFieldReport();
        
        /**
         * Sets the "fieldReport" attribute
         */
        void setFieldReport(java.lang.String fieldReport);
        
        /**
         * Sets (as xml) the "fieldReport" attribute
         */
        void xsetFieldReport(org.apache.xmlbeans.XmlString fieldReport);
        
        /**
         * Unsets the "fieldReport" attribute
         */
        void unsetFieldReport();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader newInstance() {
              return (org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.SurveyHeaderDocument newInstance() {
          return (org.landxml.schema.landXML11.SurveyHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyHeaderDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.SurveyHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.SurveyHeaderDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SurveyHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyHeaderDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SurveyHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.SurveyHeaderDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyHeaderDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.SurveyHeaderDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyHeaderDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.SurveyHeaderDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyHeaderDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.SurveyHeaderDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyHeaderDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.SurveyHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.SurveyHeaderDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SurveyHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyHeaderDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SurveyHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.SurveyHeaderDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SurveyHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.SurveyHeaderDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.SurveyHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.SurveyHeaderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.SurveyHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.SurveyHeaderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.SurveyHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
