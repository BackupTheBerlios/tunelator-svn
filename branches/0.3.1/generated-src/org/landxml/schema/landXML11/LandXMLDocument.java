/*
 * An XML document type.
 * Localname: LandXML
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.LandXMLDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11;


/**
 * A document containing one LandXML(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public interface LandXMLDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LandXMLDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("landxml9a2edoctype");
    
    /**
     * Gets the "LandXML" element
     */
    org.landxml.schema.landXML11.LandXMLDocument.LandXML getLandXML();
    
    /**
     * Sets the "LandXML" element
     */
    void setLandXML(org.landxml.schema.landXML11.LandXMLDocument.LandXML landXML);
    
    /**
     * Appends and returns a new empty "LandXML" element
     */
    org.landxml.schema.landXML11.LandXMLDocument.LandXML addNewLandXML();
    
    /**
     * An XML LandXML(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public interface LandXML extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LandXML.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78E1CED5AEE3C33CCDF6CB018DD26479").resolveHandle("landxmlf8a6elemtype");
        
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
         * Gets a List of "Project" elements
         */
        java.util.List<org.landxml.schema.landXML11.ProjectDocument.Project> getProjectList();
        
        /**
         * Gets array of all "Project" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ProjectDocument.Project[] getProjectArray();
        
        /**
         * Gets ith "Project" element
         */
        org.landxml.schema.landXML11.ProjectDocument.Project getProjectArray(int i);
        
        /**
         * Returns number of "Project" element
         */
        int sizeOfProjectArray();
        
        /**
         * Sets array of all "Project" element
         */
        void setProjectArray(org.landxml.schema.landXML11.ProjectDocument.Project[] projectArray);
        
        /**
         * Sets ith "Project" element
         */
        void setProjectArray(int i, org.landxml.schema.landXML11.ProjectDocument.Project project);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Project" element
         */
        org.landxml.schema.landXML11.ProjectDocument.Project insertNewProject(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Project" element
         */
        org.landxml.schema.landXML11.ProjectDocument.Project addNewProject();
        
        /**
         * Removes the ith "Project" element
         */
        void removeProject(int i);
        
        /**
         * Gets a List of "Application" elements
         */
        java.util.List<org.landxml.schema.landXML11.ApplicationDocument.Application> getApplicationList();
        
        /**
         * Gets array of all "Application" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.ApplicationDocument.Application[] getApplicationArray();
        
        /**
         * Gets ith "Application" element
         */
        org.landxml.schema.landXML11.ApplicationDocument.Application getApplicationArray(int i);
        
        /**
         * Returns number of "Application" element
         */
        int sizeOfApplicationArray();
        
        /**
         * Sets array of all "Application" element
         */
        void setApplicationArray(org.landxml.schema.landXML11.ApplicationDocument.Application[] applicationArray);
        
        /**
         * Sets ith "Application" element
         */
        void setApplicationArray(int i, org.landxml.schema.landXML11.ApplicationDocument.Application application);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Application" element
         */
        org.landxml.schema.landXML11.ApplicationDocument.Application insertNewApplication(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Application" element
         */
        org.landxml.schema.landXML11.ApplicationDocument.Application addNewApplication();
        
        /**
         * Removes the ith "Application" element
         */
        void removeApplication(int i);
        
        /**
         * Gets a List of "Alignments" elements
         */
        java.util.List<org.landxml.schema.landXML11.AlignmentsDocument.Alignments> getAlignmentsList();
        
        /**
         * Gets array of all "Alignments" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.AlignmentsDocument.Alignments[] getAlignmentsArray();
        
        /**
         * Gets ith "Alignments" element
         */
        org.landxml.schema.landXML11.AlignmentsDocument.Alignments getAlignmentsArray(int i);
        
        /**
         * Returns number of "Alignments" element
         */
        int sizeOfAlignmentsArray();
        
        /**
         * Sets array of all "Alignments" element
         */
        void setAlignmentsArray(org.landxml.schema.landXML11.AlignmentsDocument.Alignments[] alignmentsArray);
        
        /**
         * Sets ith "Alignments" element
         */
        void setAlignmentsArray(int i, org.landxml.schema.landXML11.AlignmentsDocument.Alignments alignments);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Alignments" element
         */
        org.landxml.schema.landXML11.AlignmentsDocument.Alignments insertNewAlignments(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Alignments" element
         */
        org.landxml.schema.landXML11.AlignmentsDocument.Alignments addNewAlignments();
        
        /**
         * Removes the ith "Alignments" element
         */
        void removeAlignments(int i);
        
        /**
         * Gets a List of "CgPoints" elements
         */
        java.util.List<org.landxml.schema.landXML11.CgPointsDocument.CgPoints> getCgPointsList();
        
        /**
         * Gets array of all "CgPoints" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.CgPointsDocument.CgPoints[] getCgPointsArray();
        
        /**
         * Gets ith "CgPoints" element
         */
        org.landxml.schema.landXML11.CgPointsDocument.CgPoints getCgPointsArray(int i);
        
        /**
         * Returns number of "CgPoints" element
         */
        int sizeOfCgPointsArray();
        
        /**
         * Sets array of all "CgPoints" element
         */
        void setCgPointsArray(org.landxml.schema.landXML11.CgPointsDocument.CgPoints[] cgPointsArray);
        
        /**
         * Sets ith "CgPoints" element
         */
        void setCgPointsArray(int i, org.landxml.schema.landXML11.CgPointsDocument.CgPoints cgPoints);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CgPoints" element
         */
        org.landxml.schema.landXML11.CgPointsDocument.CgPoints insertNewCgPoints(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CgPoints" element
         */
        org.landxml.schema.landXML11.CgPointsDocument.CgPoints addNewCgPoints();
        
        /**
         * Removes the ith "CgPoints" element
         */
        void removeCgPoints(int i);
        
        /**
         * Gets a List of "Amendment" elements
         */
        java.util.List<org.landxml.schema.landXML11.AmendmentDocument.Amendment> getAmendmentList();
        
        /**
         * Gets array of all "Amendment" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.AmendmentDocument.Amendment[] getAmendmentArray();
        
        /**
         * Gets ith "Amendment" element
         */
        org.landxml.schema.landXML11.AmendmentDocument.Amendment getAmendmentArray(int i);
        
        /**
         * Returns number of "Amendment" element
         */
        int sizeOfAmendmentArray();
        
        /**
         * Sets array of all "Amendment" element
         */
        void setAmendmentArray(org.landxml.schema.landXML11.AmendmentDocument.Amendment[] amendmentArray);
        
        /**
         * Sets ith "Amendment" element
         */
        void setAmendmentArray(int i, org.landxml.schema.landXML11.AmendmentDocument.Amendment amendment);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Amendment" element
         */
        org.landxml.schema.landXML11.AmendmentDocument.Amendment insertNewAmendment(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Amendment" element
         */
        org.landxml.schema.landXML11.AmendmentDocument.Amendment addNewAmendment();
        
        /**
         * Removes the ith "Amendment" element
         */
        void removeAmendment(int i);
        
        /**
         * Gets a List of "GradeModel" elements
         */
        java.util.List<org.landxml.schema.landXML11.GradeModelDocument.GradeModel> getGradeModelList();
        
        /**
         * Gets array of all "GradeModel" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.GradeModelDocument.GradeModel[] getGradeModelArray();
        
        /**
         * Gets ith "GradeModel" element
         */
        org.landxml.schema.landXML11.GradeModelDocument.GradeModel getGradeModelArray(int i);
        
        /**
         * Returns number of "GradeModel" element
         */
        int sizeOfGradeModelArray();
        
        /**
         * Sets array of all "GradeModel" element
         */
        void setGradeModelArray(org.landxml.schema.landXML11.GradeModelDocument.GradeModel[] gradeModelArray);
        
        /**
         * Sets ith "GradeModel" element
         */
        void setGradeModelArray(int i, org.landxml.schema.landXML11.GradeModelDocument.GradeModel gradeModel);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GradeModel" element
         */
        org.landxml.schema.landXML11.GradeModelDocument.GradeModel insertNewGradeModel(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GradeModel" element
         */
        org.landxml.schema.landXML11.GradeModelDocument.GradeModel addNewGradeModel();
        
        /**
         * Removes the ith "GradeModel" element
         */
        void removeGradeModel(int i);
        
        /**
         * Gets a List of "Monuments" elements
         */
        java.util.List<org.landxml.schema.landXML11.MonumentsDocument.Monuments> getMonumentsList();
        
        /**
         * Gets array of all "Monuments" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.MonumentsDocument.Monuments[] getMonumentsArray();
        
        /**
         * Gets ith "Monuments" element
         */
        org.landxml.schema.landXML11.MonumentsDocument.Monuments getMonumentsArray(int i);
        
        /**
         * Returns number of "Monuments" element
         */
        int sizeOfMonumentsArray();
        
        /**
         * Sets array of all "Monuments" element
         */
        void setMonumentsArray(org.landxml.schema.landXML11.MonumentsDocument.Monuments[] monumentsArray);
        
        /**
         * Sets ith "Monuments" element
         */
        void setMonumentsArray(int i, org.landxml.schema.landXML11.MonumentsDocument.Monuments monuments);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Monuments" element
         */
        org.landxml.schema.landXML11.MonumentsDocument.Monuments insertNewMonuments(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Monuments" element
         */
        org.landxml.schema.landXML11.MonumentsDocument.Monuments addNewMonuments();
        
        /**
         * Removes the ith "Monuments" element
         */
        void removeMonuments(int i);
        
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
         * Gets a List of "PlanFeatures" elements
         */
        java.util.List<org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures> getPlanFeaturesList();
        
        /**
         * Gets array of all "PlanFeatures" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures[] getPlanFeaturesArray();
        
        /**
         * Gets ith "PlanFeatures" element
         */
        org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures getPlanFeaturesArray(int i);
        
        /**
         * Returns number of "PlanFeatures" element
         */
        int sizeOfPlanFeaturesArray();
        
        /**
         * Sets array of all "PlanFeatures" element
         */
        void setPlanFeaturesArray(org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures[] planFeaturesArray);
        
        /**
         * Sets ith "PlanFeatures" element
         */
        void setPlanFeaturesArray(int i, org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures planFeatures);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PlanFeatures" element
         */
        org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures insertNewPlanFeatures(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PlanFeatures" element
         */
        org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures addNewPlanFeatures();
        
        /**
         * Removes the ith "PlanFeatures" element
         */
        void removePlanFeatures(int i);
        
        /**
         * Gets a List of "PipeNetworks" elements
         */
        java.util.List<org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks> getPipeNetworksList();
        
        /**
         * Gets array of all "PipeNetworks" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks[] getPipeNetworksArray();
        
        /**
         * Gets ith "PipeNetworks" element
         */
        org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks getPipeNetworksArray(int i);
        
        /**
         * Returns number of "PipeNetworks" element
         */
        int sizeOfPipeNetworksArray();
        
        /**
         * Sets array of all "PipeNetworks" element
         */
        void setPipeNetworksArray(org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks[] pipeNetworksArray);
        
        /**
         * Sets ith "PipeNetworks" element
         */
        void setPipeNetworksArray(int i, org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks pipeNetworks);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PipeNetworks" element
         */
        org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks insertNewPipeNetworks(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PipeNetworks" element
         */
        org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks addNewPipeNetworks();
        
        /**
         * Removes the ith "PipeNetworks" element
         */
        void removePipeNetworks(int i);
        
        /**
         * Gets a List of "Roadways" elements
         */
        java.util.List<org.landxml.schema.landXML11.RoadwaysDocument.Roadways> getRoadwaysList();
        
        /**
         * Gets array of all "Roadways" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.RoadwaysDocument.Roadways[] getRoadwaysArray();
        
        /**
         * Gets ith "Roadways" element
         */
        org.landxml.schema.landXML11.RoadwaysDocument.Roadways getRoadwaysArray(int i);
        
        /**
         * Returns number of "Roadways" element
         */
        int sizeOfRoadwaysArray();
        
        /**
         * Sets array of all "Roadways" element
         */
        void setRoadwaysArray(org.landxml.schema.landXML11.RoadwaysDocument.Roadways[] roadwaysArray);
        
        /**
         * Sets ith "Roadways" element
         */
        void setRoadwaysArray(int i, org.landxml.schema.landXML11.RoadwaysDocument.Roadways roadways);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Roadways" element
         */
        org.landxml.schema.landXML11.RoadwaysDocument.Roadways insertNewRoadways(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Roadways" element
         */
        org.landxml.schema.landXML11.RoadwaysDocument.Roadways addNewRoadways();
        
        /**
         * Removes the ith "Roadways" element
         */
        void removeRoadways(int i);
        
        /**
         * Gets a List of "Surfaces" elements
         */
        java.util.List<org.landxml.schema.landXML11.SurfacesDocument.Surfaces> getSurfacesList();
        
        /**
         * Gets array of all "Surfaces" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.SurfacesDocument.Surfaces[] getSurfacesArray();
        
        /**
         * Gets ith "Surfaces" element
         */
        org.landxml.schema.landXML11.SurfacesDocument.Surfaces getSurfacesArray(int i);
        
        /**
         * Returns number of "Surfaces" element
         */
        int sizeOfSurfacesArray();
        
        /**
         * Sets array of all "Surfaces" element
         */
        void setSurfacesArray(org.landxml.schema.landXML11.SurfacesDocument.Surfaces[] surfacesArray);
        
        /**
         * Sets ith "Surfaces" element
         */
        void setSurfacesArray(int i, org.landxml.schema.landXML11.SurfacesDocument.Surfaces surfaces);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Surfaces" element
         */
        org.landxml.schema.landXML11.SurfacesDocument.Surfaces insertNewSurfaces(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Surfaces" element
         */
        org.landxml.schema.landXML11.SurfacesDocument.Surfaces addNewSurfaces();
        
        /**
         * Removes the ith "Surfaces" element
         */
        void removeSurfaces(int i);
        
        /**
         * Gets a List of "Survey" elements
         */
        java.util.List<org.landxml.schema.landXML11.SurveyDocument.Survey> getSurveyList();
        
        /**
         * Gets array of all "Survey" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.SurveyDocument.Survey[] getSurveyArray();
        
        /**
         * Gets ith "Survey" element
         */
        org.landxml.schema.landXML11.SurveyDocument.Survey getSurveyArray(int i);
        
        /**
         * Returns number of "Survey" element
         */
        int sizeOfSurveyArray();
        
        /**
         * Sets array of all "Survey" element
         */
        void setSurveyArray(org.landxml.schema.landXML11.SurveyDocument.Survey[] surveyArray);
        
        /**
         * Sets ith "Survey" element
         */
        void setSurveyArray(int i, org.landxml.schema.landXML11.SurveyDocument.Survey survey);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Survey" element
         */
        org.landxml.schema.landXML11.SurveyDocument.Survey insertNewSurvey(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Survey" element
         */
        org.landxml.schema.landXML11.SurveyDocument.Survey addNewSurvey();
        
        /**
         * Removes the ith "Survey" element
         */
        void removeSurvey(int i);
        
        /**
         * Gets a List of "FeatureDictionary" elements
         */
        java.util.List<org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary> getFeatureDictionaryList();
        
        /**
         * Gets array of all "FeatureDictionary" elements
         * @deprecated
         */
        org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary[] getFeatureDictionaryArray();
        
        /**
         * Gets ith "FeatureDictionary" element
         */
        org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary getFeatureDictionaryArray(int i);
        
        /**
         * Returns number of "FeatureDictionary" element
         */
        int sizeOfFeatureDictionaryArray();
        
        /**
         * Sets array of all "FeatureDictionary" element
         */
        void setFeatureDictionaryArray(org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary[] featureDictionaryArray);
        
        /**
         * Sets ith "FeatureDictionary" element
         */
        void setFeatureDictionaryArray(int i, org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary featureDictionary);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "FeatureDictionary" element
         */
        org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary insertNewFeatureDictionary(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "FeatureDictionary" element
         */
        org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary addNewFeatureDictionary();
        
        /**
         * Removes the ith "FeatureDictionary" element
         */
        void removeFeatureDictionary(int i);
        
        /**
         * Gets the "date" attribute
         */
        java.util.Calendar getDate();
        
        /**
         * Gets (as xml) the "date" attribute
         */
        org.apache.xmlbeans.XmlDate xgetDate();
        
        /**
         * Sets the "date" attribute
         */
        void setDate(java.util.Calendar date);
        
        /**
         * Sets (as xml) the "date" attribute
         */
        void xsetDate(org.apache.xmlbeans.XmlDate date);
        
        /**
         * Gets the "time" attribute
         */
        java.util.Calendar getTime();
        
        /**
         * Gets (as xml) the "time" attribute
         */
        org.apache.xmlbeans.XmlTime xgetTime();
        
        /**
         * Sets the "time" attribute
         */
        void setTime(java.util.Calendar time);
        
        /**
         * Sets (as xml) the "time" attribute
         */
        void xsetTime(org.apache.xmlbeans.XmlTime time);
        
        /**
         * Gets the "version" attribute
         */
        java.lang.String getVersion();
        
        /**
         * Gets (as xml) the "version" attribute
         */
        org.apache.xmlbeans.XmlString xgetVersion();
        
        /**
         * Sets the "version" attribute
         */
        void setVersion(java.lang.String version);
        
        /**
         * Sets (as xml) the "version" attribute
         */
        void xsetVersion(org.apache.xmlbeans.XmlString version);
        
        /**
         * Gets the "language" attribute
         */
        java.lang.String getLanguage();
        
        /**
         * Gets (as xml) the "language" attribute
         */
        org.apache.xmlbeans.XmlString xgetLanguage();
        
        /**
         * True if has "language" attribute
         */
        boolean isSetLanguage();
        
        /**
         * Sets the "language" attribute
         */
        void setLanguage(java.lang.String language);
        
        /**
         * Sets (as xml) the "language" attribute
         */
        void xsetLanguage(org.apache.xmlbeans.XmlString language);
        
        /**
         * Unsets the "language" attribute
         */
        void unsetLanguage();
        
        /**
         * Gets the "readOnly" attribute
         */
        boolean getReadOnly();
        
        /**
         * Gets (as xml) the "readOnly" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetReadOnly();
        
        /**
         * True if has "readOnly" attribute
         */
        boolean isSetReadOnly();
        
        /**
         * Sets the "readOnly" attribute
         */
        void setReadOnly(boolean readOnly);
        
        /**
         * Sets (as xml) the "readOnly" attribute
         */
        void xsetReadOnly(org.apache.xmlbeans.XmlBoolean readOnly);
        
        /**
         * Unsets the "readOnly" attribute
         */
        void unsetReadOnly();
        
        /**
         * Gets the "LandXMLId" attribute
         */
        int getLandXMLId();
        
        /**
         * Gets (as xml) the "LandXMLId" attribute
         */
        org.apache.xmlbeans.XmlInt xgetLandXMLId();
        
        /**
         * True if has "LandXMLId" attribute
         */
        boolean isSetLandXMLId();
        
        /**
         * Sets the "LandXMLId" attribute
         */
        void setLandXMLId(int landXMLId);
        
        /**
         * Sets (as xml) the "LandXMLId" attribute
         */
        void xsetLandXMLId(org.apache.xmlbeans.XmlInt landXMLId);
        
        /**
         * Unsets the "LandXMLId" attribute
         */
        void unsetLandXMLId();
        
        /**
         * Gets the "crc" attribute
         */
        java.math.BigInteger getCrc();
        
        /**
         * Gets (as xml) the "crc" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetCrc();
        
        /**
         * True if has "crc" attribute
         */
        boolean isSetCrc();
        
        /**
         * Sets the "crc" attribute
         */
        void setCrc(java.math.BigInteger crc);
        
        /**
         * Sets (as xml) the "crc" attribute
         */
        void xsetCrc(org.apache.xmlbeans.XmlInteger crc);
        
        /**
         * Unsets the "crc" attribute
         */
        void unsetCrc();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.landxml.schema.landXML11.LandXMLDocument.LandXML newInstance() {
              return (org.landxml.schema.landXML11.LandXMLDocument.LandXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.landxml.schema.landXML11.LandXMLDocument.LandXML newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.landxml.schema.landXML11.LandXMLDocument.LandXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.landxml.schema.landXML11.LandXMLDocument newInstance() {
          return (org.landxml.schema.landXML11.LandXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.landxml.schema.landXML11.LandXMLDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.landxml.schema.landXML11.LandXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.landxml.schema.landXML11.LandXMLDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.LandXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.landxml.schema.landXML11.LandXMLDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.LandXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.landxml.schema.landXML11.LandXMLDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LandXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.landxml.schema.landXML11.LandXMLDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LandXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.landxml.schema.landXML11.LandXMLDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LandXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.landxml.schema.landXML11.LandXMLDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LandXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.landxml.schema.landXML11.LandXMLDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LandXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.landxml.schema.landXML11.LandXMLDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LandXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.landxml.schema.landXML11.LandXMLDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LandXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.landxml.schema.landXML11.LandXMLDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.landxml.schema.landXML11.LandXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.landxml.schema.landXML11.LandXMLDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.LandXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.landxml.schema.landXML11.LandXMLDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.LandXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.landxml.schema.landXML11.LandXMLDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.LandXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.landxml.schema.landXML11.LandXMLDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.landxml.schema.landXML11.LandXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.LandXMLDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.LandXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.landxml.schema.landXML11.LandXMLDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.landxml.schema.landXML11.LandXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
