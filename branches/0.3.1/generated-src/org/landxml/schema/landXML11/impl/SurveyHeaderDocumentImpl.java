/*
 * An XML document type.
 * Localname: SurveyHeader
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.SurveyHeaderDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one SurveyHeader(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class SurveyHeaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SurveyHeaderDocument
{
    
    public SurveyHeaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURVEYHEADER$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "SurveyHeader");
    
    
    /**
     * Gets the "SurveyHeader" element
     */
    public org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader getSurveyHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader target = null;
            target = (org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader)get_store().find_element_user(SURVEYHEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SurveyHeader" element
     */
    public void setSurveyHeader(org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader surveyHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader target = null;
            target = (org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader)get_store().find_element_user(SURVEYHEADER$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader)get_store().add_element_user(SURVEYHEADER$0);
            }
            target.set(surveyHeader);
        }
    }
    
    /**
     * Appends and returns a new empty "SurveyHeader" element
     */
    public org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader addNewSurveyHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader target = null;
            target = (org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader)get_store().add_element_user(SURVEYHEADER$0);
            return target;
        }
    }
    /**
     * An XML SurveyHeader(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class SurveyHeaderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SurveyHeaderDocument.SurveyHeader
    {
        
        public SurveyHeaderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ANNOTATION$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Annotation");
        private static final javax.xml.namespace.QName ADMINISTRATIVEAREA$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "AdministrativeArea");
        private static final javax.xml.namespace.QName ADMINISTRATIVEDATE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "AdministrativeDate");
        private static final javax.xml.namespace.QName COORDINATESYSTEM$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CoordinateSystem");
        private static final javax.xml.namespace.QName UNITS$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Units");
        private static final javax.xml.namespace.QName MAPPOINT$10 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "MapPoint");
        private static final javax.xml.namespace.QName PERSONNEL$12 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Personnel");
        private static final javax.xml.namespace.QName FIELDNOTE$14 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FieldNote");
        private static final javax.xml.namespace.QName FEATURE$16 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName SURVEYORCERTIFICATE$18 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "SurveyorCertificate");
        private static final javax.xml.namespace.QName PURPOSEOFSURVEY$20 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PurposeOfSurvey");
        private static final javax.xml.namespace.QName NAME$22 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESC$24 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName PURPOSE$26 = 
            new javax.xml.namespace.QName("", "purpose");
        private static final javax.xml.namespace.QName STARTTIME$28 = 
            new javax.xml.namespace.QName("", "startTime");
        private static final javax.xml.namespace.QName ENDTIME$30 = 
            new javax.xml.namespace.QName("", "endTime");
        private static final javax.xml.namespace.QName SURVEYOR$32 = 
            new javax.xml.namespace.QName("", "surveyor");
        private static final javax.xml.namespace.QName SURVEYORFIRM$34 = 
            new javax.xml.namespace.QName("", "surveyorFirm");
        private static final javax.xml.namespace.QName SURVEYORREFERENCE$36 = 
            new javax.xml.namespace.QName("", "surveyorReference");
        private static final javax.xml.namespace.QName SURVEYORREGISTRATION$38 = 
            new javax.xml.namespace.QName("", "surveyorRegistration");
        private static final javax.xml.namespace.QName SURVEYPURPOSE$40 = 
            new javax.xml.namespace.QName("", "surveyPurpose");
        private static final javax.xml.namespace.QName TYPE$42 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName CLASS1$44 = 
            new javax.xml.namespace.QName("", "class");
        private static final javax.xml.namespace.QName COUNTY$46 = 
            new javax.xml.namespace.QName("", "county");
        private static final javax.xml.namespace.QName APPLYATMOSPHERICCORRECTION$48 = 
            new javax.xml.namespace.QName("", "applyAtmosphericCorrection");
        private static final javax.xml.namespace.QName PRESSURE$50 = 
            new javax.xml.namespace.QName("", "pressure");
        private static final javax.xml.namespace.QName TEMPERATURE$52 = 
            new javax.xml.namespace.QName("", "temperature");
        private static final javax.xml.namespace.QName APPLYSEALEVELCORRECTION$54 = 
            new javax.xml.namespace.QName("", "applySeaLevelCorrection");
        private static final javax.xml.namespace.QName SCALEFACTOR$56 = 
            new javax.xml.namespace.QName("", "scaleFactor");
        private static final javax.xml.namespace.QName SEALEVELCORRECTIONFACTOR$58 = 
            new javax.xml.namespace.QName("", "seaLevelCorrectionFactor");
        private static final javax.xml.namespace.QName COMBINEDFACTOR$60 = 
            new javax.xml.namespace.QName("", "combinedFactor");
        private static final javax.xml.namespace.QName JURISDICTION$62 = 
            new javax.xml.namespace.QName("", "jurisdiction");
        private static final javax.xml.namespace.QName SUBMISSIONDATE$64 = 
            new javax.xml.namespace.QName("", "submissionDate");
        private static final javax.xml.namespace.QName DOCUMENTSTATUS$66 = 
            new javax.xml.namespace.QName("", "documentStatus");
        private static final javax.xml.namespace.QName HEADOFPOWER$68 = 
            new javax.xml.namespace.QName("", "headOfPower");
        private static final javax.xml.namespace.QName SURVEYFORMAT$70 = 
            new javax.xml.namespace.QName("", "surveyFormat");
        private static final javax.xml.namespace.QName SURVEYSTATUS$72 = 
            new javax.xml.namespace.QName("", "surveyStatus");
        private static final javax.xml.namespace.QName COMMUNITYTITLESCHEMENO$74 = 
            new javax.xml.namespace.QName("", "communityTitleSchemeNo");
        private static final javax.xml.namespace.QName COMMUNITYTITLESCHEMENAME$76 = 
            new javax.xml.namespace.QName("", "communityTitleSchemeName");
        private static final javax.xml.namespace.QName FIELDNOTEFLAG$78 = 
            new javax.xml.namespace.QName("", "fieldNoteFlag");
        private static final javax.xml.namespace.QName FIELDNOTEREFERENCE$80 = 
            new javax.xml.namespace.QName("", "fieldNoteReference");
        private static final javax.xml.namespace.QName FIELDREPORT$82 = 
            new javax.xml.namespace.QName("", "fieldReport");
        
        
        /**
         * Gets a List of "Annotation" elements
         */
        public java.util.List<org.landxml.schema.landXML11.AnnotationDocument.Annotation> getAnnotationList()
        {
            final class AnnotationList extends java.util.AbstractList<org.landxml.schema.landXML11.AnnotationDocument.Annotation>
            {
                public org.landxml.schema.landXML11.AnnotationDocument.Annotation get(int i)
                    { return SurveyHeaderImpl.this.getAnnotationArray(i); }
                
                public org.landxml.schema.landXML11.AnnotationDocument.Annotation set(int i, org.landxml.schema.landXML11.AnnotationDocument.Annotation o)
                {
                    org.landxml.schema.landXML11.AnnotationDocument.Annotation old = SurveyHeaderImpl.this.getAnnotationArray(i);
                    SurveyHeaderImpl.this.setAnnotationArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.AnnotationDocument.Annotation o)
                    { SurveyHeaderImpl.this.insertNewAnnotation(i).set(o); }
                
                public org.landxml.schema.landXML11.AnnotationDocument.Annotation remove(int i)
                {
                    org.landxml.schema.landXML11.AnnotationDocument.Annotation old = SurveyHeaderImpl.this.getAnnotationArray(i);
                    SurveyHeaderImpl.this.removeAnnotation(i);
                    return old;
                }
                
                public int size()
                    { return SurveyHeaderImpl.this.sizeOfAnnotationArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new AnnotationList();
            }
        }
        
        /**
         * Gets array of all "Annotation" elements
         */
        public org.landxml.schema.landXML11.AnnotationDocument.Annotation[] getAnnotationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ANNOTATION$0, targetList);
                org.landxml.schema.landXML11.AnnotationDocument.Annotation[] result = new org.landxml.schema.landXML11.AnnotationDocument.Annotation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Annotation" element
         */
        public org.landxml.schema.landXML11.AnnotationDocument.Annotation getAnnotationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AnnotationDocument.Annotation target = null;
                target = (org.landxml.schema.landXML11.AnnotationDocument.Annotation)get_store().find_element_user(ANNOTATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Annotation" element
         */
        public int sizeOfAnnotationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ANNOTATION$0);
            }
        }
        
        /**
         * Sets array of all "Annotation" element
         */
        public void setAnnotationArray(org.landxml.schema.landXML11.AnnotationDocument.Annotation[] annotationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(annotationArray, ANNOTATION$0);
            }
        }
        
        /**
         * Sets ith "Annotation" element
         */
        public void setAnnotationArray(int i, org.landxml.schema.landXML11.AnnotationDocument.Annotation annotation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AnnotationDocument.Annotation target = null;
                target = (org.landxml.schema.landXML11.AnnotationDocument.Annotation)get_store().find_element_user(ANNOTATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(annotation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Annotation" element
         */
        public org.landxml.schema.landXML11.AnnotationDocument.Annotation insertNewAnnotation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AnnotationDocument.Annotation target = null;
                target = (org.landxml.schema.landXML11.AnnotationDocument.Annotation)get_store().insert_element_user(ANNOTATION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Annotation" element
         */
        public org.landxml.schema.landXML11.AnnotationDocument.Annotation addNewAnnotation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AnnotationDocument.Annotation target = null;
                target = (org.landxml.schema.landXML11.AnnotationDocument.Annotation)get_store().add_element_user(ANNOTATION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Annotation" element
         */
        public void removeAnnotation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ANNOTATION$0, i);
            }
        }
        
        /**
         * Gets a List of "AdministrativeArea" elements
         */
        public java.util.List<org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea> getAdministrativeAreaList()
        {
            final class AdministrativeAreaList extends java.util.AbstractList<org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea>
            {
                public org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea get(int i)
                    { return SurveyHeaderImpl.this.getAdministrativeAreaArray(i); }
                
                public org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea set(int i, org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea o)
                {
                    org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea old = SurveyHeaderImpl.this.getAdministrativeAreaArray(i);
                    SurveyHeaderImpl.this.setAdministrativeAreaArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea o)
                    { SurveyHeaderImpl.this.insertNewAdministrativeArea(i).set(o); }
                
                public org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea remove(int i)
                {
                    org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea old = SurveyHeaderImpl.this.getAdministrativeAreaArray(i);
                    SurveyHeaderImpl.this.removeAdministrativeArea(i);
                    return old;
                }
                
                public int size()
                    { return SurveyHeaderImpl.this.sizeOfAdministrativeAreaArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new AdministrativeAreaList();
            }
        }
        
        /**
         * Gets array of all "AdministrativeArea" elements
         */
        public org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea[] getAdministrativeAreaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ADMINISTRATIVEAREA$2, targetList);
                org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea[] result = new org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AdministrativeArea" element
         */
        public org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea getAdministrativeAreaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea target = null;
                target = (org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea)get_store().find_element_user(ADMINISTRATIVEAREA$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AdministrativeArea" element
         */
        public int sizeOfAdministrativeAreaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADMINISTRATIVEAREA$2);
            }
        }
        
        /**
         * Sets array of all "AdministrativeArea" element
         */
        public void setAdministrativeAreaArray(org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea[] administrativeAreaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(administrativeAreaArray, ADMINISTRATIVEAREA$2);
            }
        }
        
        /**
         * Sets ith "AdministrativeArea" element
         */
        public void setAdministrativeAreaArray(int i, org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea administrativeArea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea target = null;
                target = (org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea)get_store().find_element_user(ADMINISTRATIVEAREA$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(administrativeArea);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AdministrativeArea" element
         */
        public org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea insertNewAdministrativeArea(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea target = null;
                target = (org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea)get_store().insert_element_user(ADMINISTRATIVEAREA$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AdministrativeArea" element
         */
        public org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea addNewAdministrativeArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea target = null;
                target = (org.landxml.schema.landXML11.AdministrativeAreaDocument.AdministrativeArea)get_store().add_element_user(ADMINISTRATIVEAREA$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "AdministrativeArea" element
         */
        public void removeAdministrativeArea(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADMINISTRATIVEAREA$2, i);
            }
        }
        
        /**
         * Gets a List of "AdministrativeDate" elements
         */
        public java.util.List<org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate> getAdministrativeDateList()
        {
            final class AdministrativeDateList extends java.util.AbstractList<org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate>
            {
                public org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate get(int i)
                    { return SurveyHeaderImpl.this.getAdministrativeDateArray(i); }
                
                public org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate set(int i, org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate o)
                {
                    org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate old = SurveyHeaderImpl.this.getAdministrativeDateArray(i);
                    SurveyHeaderImpl.this.setAdministrativeDateArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate o)
                    { SurveyHeaderImpl.this.insertNewAdministrativeDate(i).set(o); }
                
                public org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate remove(int i)
                {
                    org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate old = SurveyHeaderImpl.this.getAdministrativeDateArray(i);
                    SurveyHeaderImpl.this.removeAdministrativeDate(i);
                    return old;
                }
                
                public int size()
                    { return SurveyHeaderImpl.this.sizeOfAdministrativeDateArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new AdministrativeDateList();
            }
        }
        
        /**
         * Gets array of all "AdministrativeDate" elements
         */
        public org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate[] getAdministrativeDateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ADMINISTRATIVEDATE$4, targetList);
                org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate[] result = new org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AdministrativeDate" element
         */
        public org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate getAdministrativeDateArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate target = null;
                target = (org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate)get_store().find_element_user(ADMINISTRATIVEDATE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AdministrativeDate" element
         */
        public int sizeOfAdministrativeDateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADMINISTRATIVEDATE$4);
            }
        }
        
        /**
         * Sets array of all "AdministrativeDate" element
         */
        public void setAdministrativeDateArray(org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate[] administrativeDateArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(administrativeDateArray, ADMINISTRATIVEDATE$4);
            }
        }
        
        /**
         * Sets ith "AdministrativeDate" element
         */
        public void setAdministrativeDateArray(int i, org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate administrativeDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate target = null;
                target = (org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate)get_store().find_element_user(ADMINISTRATIVEDATE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(administrativeDate);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AdministrativeDate" element
         */
        public org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate insertNewAdministrativeDate(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate target = null;
                target = (org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate)get_store().insert_element_user(ADMINISTRATIVEDATE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AdministrativeDate" element
         */
        public org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate addNewAdministrativeDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate target = null;
                target = (org.landxml.schema.landXML11.AdministrativeDateDocument.AdministrativeDate)get_store().add_element_user(ADMINISTRATIVEDATE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "AdministrativeDate" element
         */
        public void removeAdministrativeDate(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADMINISTRATIVEDATE$4, i);
            }
        }
        
        /**
         * Gets a List of "CoordinateSystem" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem> getCoordinateSystemList()
        {
            final class CoordinateSystemList extends java.util.AbstractList<org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem>
            {
                public org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem get(int i)
                    { return SurveyHeaderImpl.this.getCoordinateSystemArray(i); }
                
                public org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem set(int i, org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem o)
                {
                    org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem old = SurveyHeaderImpl.this.getCoordinateSystemArray(i);
                    SurveyHeaderImpl.this.setCoordinateSystemArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem o)
                    { SurveyHeaderImpl.this.insertNewCoordinateSystem(i).set(o); }
                
                public org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem remove(int i)
                {
                    org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem old = SurveyHeaderImpl.this.getCoordinateSystemArray(i);
                    SurveyHeaderImpl.this.removeCoordinateSystem(i);
                    return old;
                }
                
                public int size()
                    { return SurveyHeaderImpl.this.sizeOfCoordinateSystemArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CoordinateSystemList();
            }
        }
        
        /**
         * Gets array of all "CoordinateSystem" elements
         */
        public org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem[] getCoordinateSystemArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COORDINATESYSTEM$6, targetList);
                org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem[] result = new org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CoordinateSystem" element
         */
        public org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem getCoordinateSystemArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem target = null;
                target = (org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem)get_store().find_element_user(COORDINATESYSTEM$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CoordinateSystem" element
         */
        public int sizeOfCoordinateSystemArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COORDINATESYSTEM$6);
            }
        }
        
        /**
         * Sets array of all "CoordinateSystem" element
         */
        public void setCoordinateSystemArray(org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem[] coordinateSystemArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(coordinateSystemArray, COORDINATESYSTEM$6);
            }
        }
        
        /**
         * Sets ith "CoordinateSystem" element
         */
        public void setCoordinateSystemArray(int i, org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem coordinateSystem)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem target = null;
                target = (org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem)get_store().find_element_user(COORDINATESYSTEM$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(coordinateSystem);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CoordinateSystem" element
         */
        public org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem insertNewCoordinateSystem(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem target = null;
                target = (org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem)get_store().insert_element_user(COORDINATESYSTEM$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CoordinateSystem" element
         */
        public org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem addNewCoordinateSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem target = null;
                target = (org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem)get_store().add_element_user(COORDINATESYSTEM$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "CoordinateSystem" element
         */
        public void removeCoordinateSystem(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COORDINATESYSTEM$6, i);
            }
        }
        
        /**
         * Gets a List of "Units" elements
         */
        public java.util.List<org.landxml.schema.landXML11.UnitsDocument.Units> getUnitsList()
        {
            final class UnitsList extends java.util.AbstractList<org.landxml.schema.landXML11.UnitsDocument.Units>
            {
                public org.landxml.schema.landXML11.UnitsDocument.Units get(int i)
                    { return SurveyHeaderImpl.this.getUnitsArray(i); }
                
                public org.landxml.schema.landXML11.UnitsDocument.Units set(int i, org.landxml.schema.landXML11.UnitsDocument.Units o)
                {
                    org.landxml.schema.landXML11.UnitsDocument.Units old = SurveyHeaderImpl.this.getUnitsArray(i);
                    SurveyHeaderImpl.this.setUnitsArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.UnitsDocument.Units o)
                    { SurveyHeaderImpl.this.insertNewUnits(i).set(o); }
                
                public org.landxml.schema.landXML11.UnitsDocument.Units remove(int i)
                {
                    org.landxml.schema.landXML11.UnitsDocument.Units old = SurveyHeaderImpl.this.getUnitsArray(i);
                    SurveyHeaderImpl.this.removeUnits(i);
                    return old;
                }
                
                public int size()
                    { return SurveyHeaderImpl.this.sizeOfUnitsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new UnitsList();
            }
        }
        
        /**
         * Gets array of all "Units" elements
         */
        public org.landxml.schema.landXML11.UnitsDocument.Units[] getUnitsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(UNITS$8, targetList);
                org.landxml.schema.landXML11.UnitsDocument.Units[] result = new org.landxml.schema.landXML11.UnitsDocument.Units[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Units" element
         */
        public org.landxml.schema.landXML11.UnitsDocument.Units getUnitsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.UnitsDocument.Units target = null;
                target = (org.landxml.schema.landXML11.UnitsDocument.Units)get_store().find_element_user(UNITS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Units" element
         */
        public int sizeOfUnitsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UNITS$8);
            }
        }
        
        /**
         * Sets array of all "Units" element
         */
        public void setUnitsArray(org.landxml.schema.landXML11.UnitsDocument.Units[] unitsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(unitsArray, UNITS$8);
            }
        }
        
        /**
         * Sets ith "Units" element
         */
        public void setUnitsArray(int i, org.landxml.schema.landXML11.UnitsDocument.Units units)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.UnitsDocument.Units target = null;
                target = (org.landxml.schema.landXML11.UnitsDocument.Units)get_store().find_element_user(UNITS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(units);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Units" element
         */
        public org.landxml.schema.landXML11.UnitsDocument.Units insertNewUnits(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.UnitsDocument.Units target = null;
                target = (org.landxml.schema.landXML11.UnitsDocument.Units)get_store().insert_element_user(UNITS$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Units" element
         */
        public org.landxml.schema.landXML11.UnitsDocument.Units addNewUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.UnitsDocument.Units target = null;
                target = (org.landxml.schema.landXML11.UnitsDocument.Units)get_store().add_element_user(UNITS$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "Units" element
         */
        public void removeUnits(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UNITS$8, i);
            }
        }
        
        /**
         * Gets a List of "MapPoint" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PointType> getMapPointList()
        {
            final class MapPointList extends java.util.AbstractList<org.landxml.schema.landXML11.PointType>
            {
                public org.landxml.schema.landXML11.PointType get(int i)
                    { return SurveyHeaderImpl.this.getMapPointArray(i); }
                
                public org.landxml.schema.landXML11.PointType set(int i, org.landxml.schema.landXML11.PointType o)
                {
                    org.landxml.schema.landXML11.PointType old = SurveyHeaderImpl.this.getMapPointArray(i);
                    SurveyHeaderImpl.this.setMapPointArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PointType o)
                    { SurveyHeaderImpl.this.insertNewMapPoint(i).set(o); }
                
                public org.landxml.schema.landXML11.PointType remove(int i)
                {
                    org.landxml.schema.landXML11.PointType old = SurveyHeaderImpl.this.getMapPointArray(i);
                    SurveyHeaderImpl.this.removeMapPoint(i);
                    return old;
                }
                
                public int size()
                    { return SurveyHeaderImpl.this.sizeOfMapPointArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new MapPointList();
            }
        }
        
        /**
         * Gets array of all "MapPoint" elements
         */
        public org.landxml.schema.landXML11.PointType[] getMapPointArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MAPPOINT$10, targetList);
                org.landxml.schema.landXML11.PointType[] result = new org.landxml.schema.landXML11.PointType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "MapPoint" element
         */
        public org.landxml.schema.landXML11.PointType getMapPointArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(MAPPOINT$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "MapPoint" element
         */
        public int sizeOfMapPointArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAPPOINT$10);
            }
        }
        
        /**
         * Sets array of all "MapPoint" element
         */
        public void setMapPointArray(org.landxml.schema.landXML11.PointType[] mapPointArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(mapPointArray, MAPPOINT$10);
            }
        }
        
        /**
         * Sets ith "MapPoint" element
         */
        public void setMapPointArray(int i, org.landxml.schema.landXML11.PointType mapPoint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(MAPPOINT$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(mapPoint);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "MapPoint" element
         */
        public org.landxml.schema.landXML11.PointType insertNewMapPoint(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().insert_element_user(MAPPOINT$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "MapPoint" element
         */
        public org.landxml.schema.landXML11.PointType addNewMapPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(MAPPOINT$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "MapPoint" element
         */
        public void removeMapPoint(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAPPOINT$10, i);
            }
        }
        
        /**
         * Gets a List of "Personnel" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PersonnelDocument.Personnel> getPersonnelList()
        {
            final class PersonnelList extends java.util.AbstractList<org.landxml.schema.landXML11.PersonnelDocument.Personnel>
            {
                public org.landxml.schema.landXML11.PersonnelDocument.Personnel get(int i)
                    { return SurveyHeaderImpl.this.getPersonnelArray(i); }
                
                public org.landxml.schema.landXML11.PersonnelDocument.Personnel set(int i, org.landxml.schema.landXML11.PersonnelDocument.Personnel o)
                {
                    org.landxml.schema.landXML11.PersonnelDocument.Personnel old = SurveyHeaderImpl.this.getPersonnelArray(i);
                    SurveyHeaderImpl.this.setPersonnelArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PersonnelDocument.Personnel o)
                    { SurveyHeaderImpl.this.insertNewPersonnel(i).set(o); }
                
                public org.landxml.schema.landXML11.PersonnelDocument.Personnel remove(int i)
                {
                    org.landxml.schema.landXML11.PersonnelDocument.Personnel old = SurveyHeaderImpl.this.getPersonnelArray(i);
                    SurveyHeaderImpl.this.removePersonnel(i);
                    return old;
                }
                
                public int size()
                    { return SurveyHeaderImpl.this.sizeOfPersonnelArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PersonnelList();
            }
        }
        
        /**
         * Gets array of all "Personnel" elements
         */
        public org.landxml.schema.landXML11.PersonnelDocument.Personnel[] getPersonnelArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PERSONNEL$12, targetList);
                org.landxml.schema.landXML11.PersonnelDocument.Personnel[] result = new org.landxml.schema.landXML11.PersonnelDocument.Personnel[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Personnel" element
         */
        public org.landxml.schema.landXML11.PersonnelDocument.Personnel getPersonnelArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PersonnelDocument.Personnel target = null;
                target = (org.landxml.schema.landXML11.PersonnelDocument.Personnel)get_store().find_element_user(PERSONNEL$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Personnel" element
         */
        public int sizeOfPersonnelArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PERSONNEL$12);
            }
        }
        
        /**
         * Sets array of all "Personnel" element
         */
        public void setPersonnelArray(org.landxml.schema.landXML11.PersonnelDocument.Personnel[] personnelArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(personnelArray, PERSONNEL$12);
            }
        }
        
        /**
         * Sets ith "Personnel" element
         */
        public void setPersonnelArray(int i, org.landxml.schema.landXML11.PersonnelDocument.Personnel personnel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PersonnelDocument.Personnel target = null;
                target = (org.landxml.schema.landXML11.PersonnelDocument.Personnel)get_store().find_element_user(PERSONNEL$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(personnel);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Personnel" element
         */
        public org.landxml.schema.landXML11.PersonnelDocument.Personnel insertNewPersonnel(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PersonnelDocument.Personnel target = null;
                target = (org.landxml.schema.landXML11.PersonnelDocument.Personnel)get_store().insert_element_user(PERSONNEL$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Personnel" element
         */
        public org.landxml.schema.landXML11.PersonnelDocument.Personnel addNewPersonnel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PersonnelDocument.Personnel target = null;
                target = (org.landxml.schema.landXML11.PersonnelDocument.Personnel)get_store().add_element_user(PERSONNEL$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "Personnel" element
         */
        public void removePersonnel(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PERSONNEL$12, i);
            }
        }
        
        /**
         * Gets a List of "FieldNote" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FieldNoteDocument.FieldNote> getFieldNoteList()
        {
            final class FieldNoteList extends java.util.AbstractList<org.landxml.schema.landXML11.FieldNoteDocument.FieldNote>
            {
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote get(int i)
                    { return SurveyHeaderImpl.this.getFieldNoteArray(i); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote set(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = SurveyHeaderImpl.this.getFieldNoteArray(i);
                    SurveyHeaderImpl.this.setFieldNoteArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote o)
                    { SurveyHeaderImpl.this.insertNewFieldNote(i).set(o); }
                
                public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote remove(int i)
                {
                    org.landxml.schema.landXML11.FieldNoteDocument.FieldNote old = SurveyHeaderImpl.this.getFieldNoteArray(i);
                    SurveyHeaderImpl.this.removeFieldNote(i);
                    return old;
                }
                
                public int size()
                    { return SurveyHeaderImpl.this.sizeOfFieldNoteArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FieldNoteList();
            }
        }
        
        /**
         * Gets array of all "FieldNote" elements
         */
        public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote[] getFieldNoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FIELDNOTE$14, targetList);
                org.landxml.schema.landXML11.FieldNoteDocument.FieldNote[] result = new org.landxml.schema.landXML11.FieldNoteDocument.FieldNote[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "FieldNote" element
         */
        public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote getFieldNoteArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FieldNoteDocument.FieldNote target = null;
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().find_element_user(FIELDNOTE$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "FieldNote" element
         */
        public int sizeOfFieldNoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELDNOTE$14);
            }
        }
        
        /**
         * Sets array of all "FieldNote" element
         */
        public void setFieldNoteArray(org.landxml.schema.landXML11.FieldNoteDocument.FieldNote[] fieldNoteArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(fieldNoteArray, FIELDNOTE$14);
            }
        }
        
        /**
         * Sets ith "FieldNote" element
         */
        public void setFieldNoteArray(int i, org.landxml.schema.landXML11.FieldNoteDocument.FieldNote fieldNote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FieldNoteDocument.FieldNote target = null;
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().find_element_user(FIELDNOTE$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(fieldNote);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "FieldNote" element
         */
        public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote insertNewFieldNote(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FieldNoteDocument.FieldNote target = null;
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().insert_element_user(FIELDNOTE$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "FieldNote" element
         */
        public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote addNewFieldNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FieldNoteDocument.FieldNote target = null;
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().add_element_user(FIELDNOTE$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "FieldNote" element
         */
        public void removeFieldNote(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELDNOTE$14, i);
            }
        }
        
        /**
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return SurveyHeaderImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = SurveyHeaderImpl.this.getFeatureArray(i);
                    SurveyHeaderImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { SurveyHeaderImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = SurveyHeaderImpl.this.getFeatureArray(i);
                    SurveyHeaderImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return SurveyHeaderImpl.this.sizeOfFeatureArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FeatureList();
            }
        }
        
        /**
         * Gets array of all "Feature" elements
         */
        public org.landxml.schema.landXML11.FeatureDocument.Feature[] getFeatureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FEATURE$16, targetList);
                org.landxml.schema.landXML11.FeatureDocument.Feature[] result = new org.landxml.schema.landXML11.FeatureDocument.Feature[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Feature" element
         */
        public org.landxml.schema.landXML11.FeatureDocument.Feature getFeatureArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FeatureDocument.Feature target = null;
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Feature" element
         */
        public int sizeOfFeatureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FEATURE$16);
            }
        }
        
        /**
         * Sets array of all "Feature" element
         */
        public void setFeatureArray(org.landxml.schema.landXML11.FeatureDocument.Feature[] featureArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(featureArray, FEATURE$16);
            }
        }
        
        /**
         * Sets ith "Feature" element
         */
        public void setFeatureArray(int i, org.landxml.schema.landXML11.FeatureDocument.Feature feature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FeatureDocument.Feature target = null;
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(feature);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Feature" element
         */
        public org.landxml.schema.landXML11.FeatureDocument.Feature insertNewFeature(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FeatureDocument.Feature target = null;
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Feature" element
         */
        public org.landxml.schema.landXML11.FeatureDocument.Feature addNewFeature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FeatureDocument.Feature target = null;
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "Feature" element
         */
        public void removeFeature(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FEATURE$16, i);
            }
        }
        
        /**
         * Gets a List of "SurveyorCertificate" elements
         */
        public java.util.List<org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate> getSurveyorCertificateList()
        {
            final class SurveyorCertificateList extends java.util.AbstractList<org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate>
            {
                public org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate get(int i)
                    { return SurveyHeaderImpl.this.getSurveyorCertificateArray(i); }
                
                public org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate set(int i, org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate o)
                {
                    org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate old = SurveyHeaderImpl.this.getSurveyorCertificateArray(i);
                    SurveyHeaderImpl.this.setSurveyorCertificateArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate o)
                    { SurveyHeaderImpl.this.insertNewSurveyorCertificate(i).set(o); }
                
                public org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate remove(int i)
                {
                    org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate old = SurveyHeaderImpl.this.getSurveyorCertificateArray(i);
                    SurveyHeaderImpl.this.removeSurveyorCertificate(i);
                    return old;
                }
                
                public int size()
                    { return SurveyHeaderImpl.this.sizeOfSurveyorCertificateArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SurveyorCertificateList();
            }
        }
        
        /**
         * Gets array of all "SurveyorCertificate" elements
         */
        public org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate[] getSurveyorCertificateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SURVEYORCERTIFICATE$18, targetList);
                org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate[] result = new org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "SurveyorCertificate" element
         */
        public org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate getSurveyorCertificateArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate target = null;
                target = (org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate)get_store().find_element_user(SURVEYORCERTIFICATE$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "SurveyorCertificate" element
         */
        public int sizeOfSurveyorCertificateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SURVEYORCERTIFICATE$18);
            }
        }
        
        /**
         * Sets array of all "SurveyorCertificate" element
         */
        public void setSurveyorCertificateArray(org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate[] surveyorCertificateArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(surveyorCertificateArray, SURVEYORCERTIFICATE$18);
            }
        }
        
        /**
         * Sets ith "SurveyorCertificate" element
         */
        public void setSurveyorCertificateArray(int i, org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate surveyorCertificate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate target = null;
                target = (org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate)get_store().find_element_user(SURVEYORCERTIFICATE$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(surveyorCertificate);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SurveyorCertificate" element
         */
        public org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate insertNewSurveyorCertificate(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate target = null;
                target = (org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate)get_store().insert_element_user(SURVEYORCERTIFICATE$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SurveyorCertificate" element
         */
        public org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate addNewSurveyorCertificate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate target = null;
                target = (org.landxml.schema.landXML11.SurveyorCertificateDocument.SurveyorCertificate)get_store().add_element_user(SURVEYORCERTIFICATE$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "SurveyorCertificate" element
         */
        public void removeSurveyorCertificate(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SURVEYORCERTIFICATE$18, i);
            }
        }
        
        /**
         * Gets a List of "PurposeOfSurvey" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey> getPurposeOfSurveyList()
        {
            final class PurposeOfSurveyList extends java.util.AbstractList<org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey>
            {
                public org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey get(int i)
                    { return SurveyHeaderImpl.this.getPurposeOfSurveyArray(i); }
                
                public org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey set(int i, org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey o)
                {
                    org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey old = SurveyHeaderImpl.this.getPurposeOfSurveyArray(i);
                    SurveyHeaderImpl.this.setPurposeOfSurveyArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey o)
                    { SurveyHeaderImpl.this.insertNewPurposeOfSurvey(i).set(o); }
                
                public org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey remove(int i)
                {
                    org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey old = SurveyHeaderImpl.this.getPurposeOfSurveyArray(i);
                    SurveyHeaderImpl.this.removePurposeOfSurvey(i);
                    return old;
                }
                
                public int size()
                    { return SurveyHeaderImpl.this.sizeOfPurposeOfSurveyArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PurposeOfSurveyList();
            }
        }
        
        /**
         * Gets array of all "PurposeOfSurvey" elements
         */
        public org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey[] getPurposeOfSurveyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PURPOSEOFSURVEY$20, targetList);
                org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey[] result = new org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PurposeOfSurvey" element
         */
        public org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey getPurposeOfSurveyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey target = null;
                target = (org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey)get_store().find_element_user(PURPOSEOFSURVEY$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PurposeOfSurvey" element
         */
        public int sizeOfPurposeOfSurveyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PURPOSEOFSURVEY$20);
            }
        }
        
        /**
         * Sets array of all "PurposeOfSurvey" element
         */
        public void setPurposeOfSurveyArray(org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey[] purposeOfSurveyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(purposeOfSurveyArray, PURPOSEOFSURVEY$20);
            }
        }
        
        /**
         * Sets ith "PurposeOfSurvey" element
         */
        public void setPurposeOfSurveyArray(int i, org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey purposeOfSurvey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey target = null;
                target = (org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey)get_store().find_element_user(PURPOSEOFSURVEY$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(purposeOfSurvey);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PurposeOfSurvey" element
         */
        public org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey insertNewPurposeOfSurvey(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey target = null;
                target = (org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey)get_store().insert_element_user(PURPOSEOFSURVEY$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PurposeOfSurvey" element
         */
        public org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey addNewPurposeOfSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey target = null;
                target = (org.landxml.schema.landXML11.PurposeOfSurveyDocument.PurposeOfSurvey)get_store().add_element_user(PURPOSEOFSURVEY$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "PurposeOfSurvey" element
         */
        public void removePurposeOfSurvey(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PURPOSEOFSURVEY$20, i);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$22);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$22);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$22);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "desc" attribute
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "desc" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$24);
                return target;
            }
        }
        
        /**
         * True if has "desc" attribute
         */
        public boolean isSetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DESC$24) != null;
            }
        }
        
        /**
         * Sets the "desc" attribute
         */
        public void setDesc(java.lang.String desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$24);
                }
                target.setStringValue(desc);
            }
        }
        
        /**
         * Sets (as xml) the "desc" attribute
         */
        public void xsetDesc(org.apache.xmlbeans.XmlString desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$24);
                }
                target.set(desc);
            }
        }
        
        /**
         * Unsets the "desc" attribute
         */
        public void unsetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DESC$24);
            }
        }
        
        /**
         * Gets the "purpose" attribute
         */
        public org.landxml.schema.landXML11.PurposeType.Enum getPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PURPOSE$26);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.PurposeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "purpose" attribute
         */
        public org.landxml.schema.landXML11.PurposeType xgetPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PurposeType target = null;
                target = (org.landxml.schema.landXML11.PurposeType)get_store().find_attribute_user(PURPOSE$26);
                return target;
            }
        }
        
        /**
         * True if has "purpose" attribute
         */
        public boolean isSetPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PURPOSE$26) != null;
            }
        }
        
        /**
         * Sets the "purpose" attribute
         */
        public void setPurpose(org.landxml.schema.landXML11.PurposeType.Enum purpose)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PURPOSE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PURPOSE$26);
                }
                target.setEnumValue(purpose);
            }
        }
        
        /**
         * Sets (as xml) the "purpose" attribute
         */
        public void xsetPurpose(org.landxml.schema.landXML11.PurposeType purpose)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PurposeType target = null;
                target = (org.landxml.schema.landXML11.PurposeType)get_store().find_attribute_user(PURPOSE$26);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PurposeType)get_store().add_attribute_user(PURPOSE$26);
                }
                target.set(purpose);
            }
        }
        
        /**
         * Unsets the "purpose" attribute
         */
        public void unsetPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PURPOSE$26);
            }
        }
        
        /**
         * Gets the "startTime" attribute
         */
        public java.util.Calendar getStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTTIME$28);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "startTime" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(STARTTIME$28);
                return target;
            }
        }
        
        /**
         * True if has "startTime" attribute
         */
        public boolean isSetStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STARTTIME$28) != null;
            }
        }
        
        /**
         * Sets the "startTime" attribute
         */
        public void setStartTime(java.util.Calendar startTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTTIME$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTTIME$28);
                }
                target.setCalendarValue(startTime);
            }
        }
        
        /**
         * Sets (as xml) the "startTime" attribute
         */
        public void xsetStartTime(org.apache.xmlbeans.XmlDateTime startTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(STARTTIME$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(STARTTIME$28);
                }
                target.set(startTime);
            }
        }
        
        /**
         * Unsets the "startTime" attribute
         */
        public void unsetStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STARTTIME$28);
            }
        }
        
        /**
         * Gets the "endTime" attribute
         */
        public java.util.Calendar getEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDTIME$30);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "endTime" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(ENDTIME$30);
                return target;
            }
        }
        
        /**
         * True if has "endTime" attribute
         */
        public boolean isSetEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENDTIME$30) != null;
            }
        }
        
        /**
         * Sets the "endTime" attribute
         */
        public void setEndTime(java.util.Calendar endTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDTIME$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDTIME$30);
                }
                target.setCalendarValue(endTime);
            }
        }
        
        /**
         * Sets (as xml) the "endTime" attribute
         */
        public void xsetEndTime(org.apache.xmlbeans.XmlDateTime endTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(ENDTIME$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(ENDTIME$30);
                }
                target.set(endTime);
            }
        }
        
        /**
         * Unsets the "endTime" attribute
         */
        public void unsetEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENDTIME$30);
            }
        }
        
        /**
         * Gets the "surveyor" attribute
         */
        public java.lang.String getSurveyor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYOR$32);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "surveyor" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSurveyor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SURVEYOR$32);
                return target;
            }
        }
        
        /**
         * True if has "surveyor" attribute
         */
        public boolean isSetSurveyor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SURVEYOR$32) != null;
            }
        }
        
        /**
         * Sets the "surveyor" attribute
         */
        public void setSurveyor(java.lang.String surveyor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYOR$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SURVEYOR$32);
                }
                target.setStringValue(surveyor);
            }
        }
        
        /**
         * Sets (as xml) the "surveyor" attribute
         */
        public void xsetSurveyor(org.apache.xmlbeans.XmlString surveyor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SURVEYOR$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SURVEYOR$32);
                }
                target.set(surveyor);
            }
        }
        
        /**
         * Unsets the "surveyor" attribute
         */
        public void unsetSurveyor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SURVEYOR$32);
            }
        }
        
        /**
         * Gets the "surveyorFirm" attribute
         */
        public java.lang.String getSurveyorFirm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYORFIRM$34);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "surveyorFirm" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSurveyorFirm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SURVEYORFIRM$34);
                return target;
            }
        }
        
        /**
         * True if has "surveyorFirm" attribute
         */
        public boolean isSetSurveyorFirm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SURVEYORFIRM$34) != null;
            }
        }
        
        /**
         * Sets the "surveyorFirm" attribute
         */
        public void setSurveyorFirm(java.lang.String surveyorFirm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYORFIRM$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SURVEYORFIRM$34);
                }
                target.setStringValue(surveyorFirm);
            }
        }
        
        /**
         * Sets (as xml) the "surveyorFirm" attribute
         */
        public void xsetSurveyorFirm(org.apache.xmlbeans.XmlString surveyorFirm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SURVEYORFIRM$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SURVEYORFIRM$34);
                }
                target.set(surveyorFirm);
            }
        }
        
        /**
         * Unsets the "surveyorFirm" attribute
         */
        public void unsetSurveyorFirm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SURVEYORFIRM$34);
            }
        }
        
        /**
         * Gets the "surveyorReference" attribute
         */
        public java.lang.String getSurveyorReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYORREFERENCE$36);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "surveyorReference" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSurveyorReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SURVEYORREFERENCE$36);
                return target;
            }
        }
        
        /**
         * True if has "surveyorReference" attribute
         */
        public boolean isSetSurveyorReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SURVEYORREFERENCE$36) != null;
            }
        }
        
        /**
         * Sets the "surveyorReference" attribute
         */
        public void setSurveyorReference(java.lang.String surveyorReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYORREFERENCE$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SURVEYORREFERENCE$36);
                }
                target.setStringValue(surveyorReference);
            }
        }
        
        /**
         * Sets (as xml) the "surveyorReference" attribute
         */
        public void xsetSurveyorReference(org.apache.xmlbeans.XmlString surveyorReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SURVEYORREFERENCE$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SURVEYORREFERENCE$36);
                }
                target.set(surveyorReference);
            }
        }
        
        /**
         * Unsets the "surveyorReference" attribute
         */
        public void unsetSurveyorReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SURVEYORREFERENCE$36);
            }
        }
        
        /**
         * Gets the "surveyorRegistration" attribute
         */
        public java.lang.String getSurveyorRegistration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYORREGISTRATION$38);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "surveyorRegistration" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSurveyorRegistration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SURVEYORREGISTRATION$38);
                return target;
            }
        }
        
        /**
         * True if has "surveyorRegistration" attribute
         */
        public boolean isSetSurveyorRegistration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SURVEYORREGISTRATION$38) != null;
            }
        }
        
        /**
         * Sets the "surveyorRegistration" attribute
         */
        public void setSurveyorRegistration(java.lang.String surveyorRegistration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYORREGISTRATION$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SURVEYORREGISTRATION$38);
                }
                target.setStringValue(surveyorRegistration);
            }
        }
        
        /**
         * Sets (as xml) the "surveyorRegistration" attribute
         */
        public void xsetSurveyorRegistration(org.apache.xmlbeans.XmlString surveyorRegistration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SURVEYORREGISTRATION$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SURVEYORREGISTRATION$38);
                }
                target.set(surveyorRegistration);
            }
        }
        
        /**
         * Unsets the "surveyorRegistration" attribute
         */
        public void unsetSurveyorRegistration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SURVEYORREGISTRATION$38);
            }
        }
        
        /**
         * Gets the "surveyPurpose" attribute
         */
        public java.lang.String getSurveyPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYPURPOSE$40);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "surveyPurpose" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSurveyPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SURVEYPURPOSE$40);
                return target;
            }
        }
        
        /**
         * True if has "surveyPurpose" attribute
         */
        public boolean isSetSurveyPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SURVEYPURPOSE$40) != null;
            }
        }
        
        /**
         * Sets the "surveyPurpose" attribute
         */
        public void setSurveyPurpose(java.lang.String surveyPurpose)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYPURPOSE$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SURVEYPURPOSE$40);
                }
                target.setStringValue(surveyPurpose);
            }
        }
        
        /**
         * Sets (as xml) the "surveyPurpose" attribute
         */
        public void xsetSurveyPurpose(org.apache.xmlbeans.XmlString surveyPurpose)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SURVEYPURPOSE$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SURVEYPURPOSE$40);
                }
                target.set(surveyPurpose);
            }
        }
        
        /**
         * Unsets the "surveyPurpose" attribute
         */
        public void unsetSurveyPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SURVEYPURPOSE$40);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public org.landxml.schema.landXML11.SurveyType.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$42);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.SurveyType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.landxml.schema.landXML11.SurveyType xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyType target = null;
                target = (org.landxml.schema.landXML11.SurveyType)get_store().find_attribute_user(TYPE$42);
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$42) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(org.landxml.schema.landXML11.SurveyType.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$42);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.landxml.schema.landXML11.SurveyType type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyType target = null;
                target = (org.landxml.schema.landXML11.SurveyType)get_store().find_attribute_user(TYPE$42);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SurveyType)get_store().add_attribute_user(TYPE$42);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$42);
            }
        }
        
        /**
         * Gets the "class" attribute
         */
        public java.lang.String getClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$44);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "class" attribute
         */
        public org.apache.xmlbeans.XmlString xgetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$44);
                return target;
            }
        }
        
        /**
         * True if has "class" attribute
         */
        public boolean isSetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CLASS1$44) != null;
            }
        }
        
        /**
         * Sets the "class" attribute
         */
        public void setClass1(java.lang.String class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$44);
                }
                target.setStringValue(class1);
            }
        }
        
        /**
         * Sets (as xml) the "class" attribute
         */
        public void xsetClass1(org.apache.xmlbeans.XmlString class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASS1$44);
                }
                target.set(class1);
            }
        }
        
        /**
         * Unsets the "class" attribute
         */
        public void unsetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CLASS1$44);
            }
        }
        
        /**
         * Gets the "county" attribute
         */
        public java.lang.String getCounty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTY$46);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "county" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCounty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COUNTY$46);
                return target;
            }
        }
        
        /**
         * True if has "county" attribute
         */
        public boolean isSetCounty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COUNTY$46) != null;
            }
        }
        
        /**
         * Sets the "county" attribute
         */
        public void setCounty(java.lang.String county)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTY$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTY$46);
                }
                target.setStringValue(county);
            }
        }
        
        /**
         * Sets (as xml) the "county" attribute
         */
        public void xsetCounty(org.apache.xmlbeans.XmlString county)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COUNTY$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COUNTY$46);
                }
                target.set(county);
            }
        }
        
        /**
         * Unsets the "county" attribute
         */
        public void unsetCounty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COUNTY$46);
            }
        }
        
        /**
         * Gets the "applyAtmosphericCorrection" attribute
         */
        public boolean getApplyAtmosphericCorrection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYATMOSPHERICCORRECTION$48);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "applyAtmosphericCorrection" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetApplyAtmosphericCorrection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYATMOSPHERICCORRECTION$48);
                return target;
            }
        }
        
        /**
         * True if has "applyAtmosphericCorrection" attribute
         */
        public boolean isSetApplyAtmosphericCorrection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(APPLYATMOSPHERICCORRECTION$48) != null;
            }
        }
        
        /**
         * Sets the "applyAtmosphericCorrection" attribute
         */
        public void setApplyAtmosphericCorrection(boolean applyAtmosphericCorrection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYATMOSPHERICCORRECTION$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYATMOSPHERICCORRECTION$48);
                }
                target.setBooleanValue(applyAtmosphericCorrection);
            }
        }
        
        /**
         * Sets (as xml) the "applyAtmosphericCorrection" attribute
         */
        public void xsetApplyAtmosphericCorrection(org.apache.xmlbeans.XmlBoolean applyAtmosphericCorrection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYATMOSPHERICCORRECTION$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYATMOSPHERICCORRECTION$48);
                }
                target.set(applyAtmosphericCorrection);
            }
        }
        
        /**
         * Unsets the "applyAtmosphericCorrection" attribute
         */
        public void unsetApplyAtmosphericCorrection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(APPLYATMOSPHERICCORRECTION$48);
            }
        }
        
        /**
         * Gets the "pressure" attribute
         */
        public double getPressure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESSURE$50);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "pressure" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetPressure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PRESSURE$50);
                return target;
            }
        }
        
        /**
         * True if has "pressure" attribute
         */
        public boolean isSetPressure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PRESSURE$50) != null;
            }
        }
        
        /**
         * Sets the "pressure" attribute
         */
        public void setPressure(double pressure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESSURE$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRESSURE$50);
                }
                target.setDoubleValue(pressure);
            }
        }
        
        /**
         * Sets (as xml) the "pressure" attribute
         */
        public void xsetPressure(org.apache.xmlbeans.XmlDouble pressure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PRESSURE$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PRESSURE$50);
                }
                target.set(pressure);
            }
        }
        
        /**
         * Unsets the "pressure" attribute
         */
        public void unsetPressure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PRESSURE$50);
            }
        }
        
        /**
         * Gets the "temperature" attribute
         */
        public double getTemperature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEMPERATURE$52);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "temperature" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetTemperature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TEMPERATURE$52);
                return target;
            }
        }
        
        /**
         * True if has "temperature" attribute
         */
        public boolean isSetTemperature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TEMPERATURE$52) != null;
            }
        }
        
        /**
         * Sets the "temperature" attribute
         */
        public void setTemperature(double temperature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEMPERATURE$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEMPERATURE$52);
                }
                target.setDoubleValue(temperature);
            }
        }
        
        /**
         * Sets (as xml) the "temperature" attribute
         */
        public void xsetTemperature(org.apache.xmlbeans.XmlDouble temperature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TEMPERATURE$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TEMPERATURE$52);
                }
                target.set(temperature);
            }
        }
        
        /**
         * Unsets the "temperature" attribute
         */
        public void unsetTemperature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TEMPERATURE$52);
            }
        }
        
        /**
         * Gets the "applySeaLevelCorrection" attribute
         */
        public boolean getApplySeaLevelCorrection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYSEALEVELCORRECTION$54);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "applySeaLevelCorrection" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetApplySeaLevelCorrection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYSEALEVELCORRECTION$54);
                return target;
            }
        }
        
        /**
         * True if has "applySeaLevelCorrection" attribute
         */
        public boolean isSetApplySeaLevelCorrection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(APPLYSEALEVELCORRECTION$54) != null;
            }
        }
        
        /**
         * Sets the "applySeaLevelCorrection" attribute
         */
        public void setApplySeaLevelCorrection(boolean applySeaLevelCorrection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYSEALEVELCORRECTION$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYSEALEVELCORRECTION$54);
                }
                target.setBooleanValue(applySeaLevelCorrection);
            }
        }
        
        /**
         * Sets (as xml) the "applySeaLevelCorrection" attribute
         */
        public void xsetApplySeaLevelCorrection(org.apache.xmlbeans.XmlBoolean applySeaLevelCorrection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYSEALEVELCORRECTION$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYSEALEVELCORRECTION$54);
                }
                target.set(applySeaLevelCorrection);
            }
        }
        
        /**
         * Unsets the "applySeaLevelCorrection" attribute
         */
        public void unsetApplySeaLevelCorrection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(APPLYSEALEVELCORRECTION$54);
            }
        }
        
        /**
         * Gets the "scaleFactor" attribute
         */
        public double getScaleFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALEFACTOR$56);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "scaleFactor" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetScaleFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SCALEFACTOR$56);
                return target;
            }
        }
        
        /**
         * True if has "scaleFactor" attribute
         */
        public boolean isSetScaleFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SCALEFACTOR$56) != null;
            }
        }
        
        /**
         * Sets the "scaleFactor" attribute
         */
        public void setScaleFactor(double scaleFactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALEFACTOR$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCALEFACTOR$56);
                }
                target.setDoubleValue(scaleFactor);
            }
        }
        
        /**
         * Sets (as xml) the "scaleFactor" attribute
         */
        public void xsetScaleFactor(org.apache.xmlbeans.XmlDouble scaleFactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SCALEFACTOR$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SCALEFACTOR$56);
                }
                target.set(scaleFactor);
            }
        }
        
        /**
         * Unsets the "scaleFactor" attribute
         */
        public void unsetScaleFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SCALEFACTOR$56);
            }
        }
        
        /**
         * Gets the "seaLevelCorrectionFactor" attribute
         */
        public double getSeaLevelCorrectionFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEALEVELCORRECTIONFACTOR$58);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "seaLevelCorrectionFactor" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSeaLevelCorrectionFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SEALEVELCORRECTIONFACTOR$58);
                return target;
            }
        }
        
        /**
         * True if has "seaLevelCorrectionFactor" attribute
         */
        public boolean isSetSeaLevelCorrectionFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SEALEVELCORRECTIONFACTOR$58) != null;
            }
        }
        
        /**
         * Sets the "seaLevelCorrectionFactor" attribute
         */
        public void setSeaLevelCorrectionFactor(double seaLevelCorrectionFactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEALEVELCORRECTIONFACTOR$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEALEVELCORRECTIONFACTOR$58);
                }
                target.setDoubleValue(seaLevelCorrectionFactor);
            }
        }
        
        /**
         * Sets (as xml) the "seaLevelCorrectionFactor" attribute
         */
        public void xsetSeaLevelCorrectionFactor(org.apache.xmlbeans.XmlDouble seaLevelCorrectionFactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SEALEVELCORRECTIONFACTOR$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SEALEVELCORRECTIONFACTOR$58);
                }
                target.set(seaLevelCorrectionFactor);
            }
        }
        
        /**
         * Unsets the "seaLevelCorrectionFactor" attribute
         */
        public void unsetSeaLevelCorrectionFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SEALEVELCORRECTIONFACTOR$58);
            }
        }
        
        /**
         * Gets the "combinedFactor" attribute
         */
        public double getCombinedFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMBINEDFACTOR$60);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "combinedFactor" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetCombinedFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COMBINEDFACTOR$60);
                return target;
            }
        }
        
        /**
         * True if has "combinedFactor" attribute
         */
        public boolean isSetCombinedFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COMBINEDFACTOR$60) != null;
            }
        }
        
        /**
         * Sets the "combinedFactor" attribute
         */
        public void setCombinedFactor(double combinedFactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMBINEDFACTOR$60);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMBINEDFACTOR$60);
                }
                target.setDoubleValue(combinedFactor);
            }
        }
        
        /**
         * Sets (as xml) the "combinedFactor" attribute
         */
        public void xsetCombinedFactor(org.apache.xmlbeans.XmlDouble combinedFactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COMBINEDFACTOR$60);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(COMBINEDFACTOR$60);
                }
                target.set(combinedFactor);
            }
        }
        
        /**
         * Unsets the "combinedFactor" attribute
         */
        public void unsetCombinedFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COMBINEDFACTOR$60);
            }
        }
        
        /**
         * Gets the "jurisdiction" attribute
         */
        public java.lang.String getJurisdiction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JURISDICTION$62);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "jurisdiction" attribute
         */
        public org.landxml.schema.landXML11.JurisdictionType xgetJurisdiction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.JurisdictionType target = null;
                target = (org.landxml.schema.landXML11.JurisdictionType)get_store().find_attribute_user(JURISDICTION$62);
                return target;
            }
        }
        
        /**
         * True if has "jurisdiction" attribute
         */
        public boolean isSetJurisdiction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(JURISDICTION$62) != null;
            }
        }
        
        /**
         * Sets the "jurisdiction" attribute
         */
        public void setJurisdiction(java.lang.String jurisdiction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JURISDICTION$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JURISDICTION$62);
                }
                target.setStringValue(jurisdiction);
            }
        }
        
        /**
         * Sets (as xml) the "jurisdiction" attribute
         */
        public void xsetJurisdiction(org.landxml.schema.landXML11.JurisdictionType jurisdiction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.JurisdictionType target = null;
                target = (org.landxml.schema.landXML11.JurisdictionType)get_store().find_attribute_user(JURISDICTION$62);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.JurisdictionType)get_store().add_attribute_user(JURISDICTION$62);
                }
                target.set(jurisdiction);
            }
        }
        
        /**
         * Unsets the "jurisdiction" attribute
         */
        public void unsetJurisdiction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(JURISDICTION$62);
            }
        }
        
        /**
         * Gets the "submissionDate" attribute
         */
        public java.util.Calendar getSubmissionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBMISSIONDATE$64);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "submissionDate" attribute
         */
        public org.apache.xmlbeans.XmlDate xgetSubmissionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(SUBMISSIONDATE$64);
                return target;
            }
        }
        
        /**
         * True if has "submissionDate" attribute
         */
        public boolean isSetSubmissionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SUBMISSIONDATE$64) != null;
            }
        }
        
        /**
         * Sets the "submissionDate" attribute
         */
        public void setSubmissionDate(java.util.Calendar submissionDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBMISSIONDATE$64);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUBMISSIONDATE$64);
                }
                target.setCalendarValue(submissionDate);
            }
        }
        
        /**
         * Sets (as xml) the "submissionDate" attribute
         */
        public void xsetSubmissionDate(org.apache.xmlbeans.XmlDate submissionDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(SUBMISSIONDATE$64);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(SUBMISSIONDATE$64);
                }
                target.set(submissionDate);
            }
        }
        
        /**
         * Unsets the "submissionDate" attribute
         */
        public void unsetSubmissionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SUBMISSIONDATE$64);
            }
        }
        
        /**
         * Gets the "documentStatus" attribute
         */
        public java.lang.String getDocumentStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCUMENTSTATUS$66);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "documentStatus" attribute
         */
        public org.landxml.schema.landXML11.DocumentStatusType xgetDocumentStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DocumentStatusType target = null;
                target = (org.landxml.schema.landXML11.DocumentStatusType)get_store().find_attribute_user(DOCUMENTSTATUS$66);
                return target;
            }
        }
        
        /**
         * True if has "documentStatus" attribute
         */
        public boolean isSetDocumentStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DOCUMENTSTATUS$66) != null;
            }
        }
        
        /**
         * Sets the "documentStatus" attribute
         */
        public void setDocumentStatus(java.lang.String documentStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCUMENTSTATUS$66);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOCUMENTSTATUS$66);
                }
                target.setStringValue(documentStatus);
            }
        }
        
        /**
         * Sets (as xml) the "documentStatus" attribute
         */
        public void xsetDocumentStatus(org.landxml.schema.landXML11.DocumentStatusType documentStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DocumentStatusType target = null;
                target = (org.landxml.schema.landXML11.DocumentStatusType)get_store().find_attribute_user(DOCUMENTSTATUS$66);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.DocumentStatusType)get_store().add_attribute_user(DOCUMENTSTATUS$66);
                }
                target.set(documentStatus);
            }
        }
        
        /**
         * Unsets the "documentStatus" attribute
         */
        public void unsetDocumentStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DOCUMENTSTATUS$66);
            }
        }
        
        /**
         * Gets the "headOfPower" attribute
         */
        public java.lang.String getHeadOfPower()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADOFPOWER$68);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "headOfPower" attribute
         */
        public org.landxml.schema.landXML11.HeadOfPowerType xgetHeadOfPower()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.HeadOfPowerType target = null;
                target = (org.landxml.schema.landXML11.HeadOfPowerType)get_store().find_attribute_user(HEADOFPOWER$68);
                return target;
            }
        }
        
        /**
         * True if has "headOfPower" attribute
         */
        public boolean isSetHeadOfPower()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HEADOFPOWER$68) != null;
            }
        }
        
        /**
         * Sets the "headOfPower" attribute
         */
        public void setHeadOfPower(java.lang.String headOfPower)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADOFPOWER$68);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADOFPOWER$68);
                }
                target.setStringValue(headOfPower);
            }
        }
        
        /**
         * Sets (as xml) the "headOfPower" attribute
         */
        public void xsetHeadOfPower(org.landxml.schema.landXML11.HeadOfPowerType headOfPower)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.HeadOfPowerType target = null;
                target = (org.landxml.schema.landXML11.HeadOfPowerType)get_store().find_attribute_user(HEADOFPOWER$68);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.HeadOfPowerType)get_store().add_attribute_user(HEADOFPOWER$68);
                }
                target.set(headOfPower);
            }
        }
        
        /**
         * Unsets the "headOfPower" attribute
         */
        public void unsetHeadOfPower()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HEADOFPOWER$68);
            }
        }
        
        /**
         * Gets the "surveyFormat" attribute
         */
        public java.lang.String getSurveyFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYFORMAT$70);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "surveyFormat" attribute
         */
        public org.landxml.schema.landXML11.SurveyFormatType xgetSurveyFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyFormatType target = null;
                target = (org.landxml.schema.landXML11.SurveyFormatType)get_store().find_attribute_user(SURVEYFORMAT$70);
                return target;
            }
        }
        
        /**
         * True if has "surveyFormat" attribute
         */
        public boolean isSetSurveyFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SURVEYFORMAT$70) != null;
            }
        }
        
        /**
         * Sets the "surveyFormat" attribute
         */
        public void setSurveyFormat(java.lang.String surveyFormat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYFORMAT$70);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SURVEYFORMAT$70);
                }
                target.setStringValue(surveyFormat);
            }
        }
        
        /**
         * Sets (as xml) the "surveyFormat" attribute
         */
        public void xsetSurveyFormat(org.landxml.schema.landXML11.SurveyFormatType surveyFormat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyFormatType target = null;
                target = (org.landxml.schema.landXML11.SurveyFormatType)get_store().find_attribute_user(SURVEYFORMAT$70);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SurveyFormatType)get_store().add_attribute_user(SURVEYFORMAT$70);
                }
                target.set(surveyFormat);
            }
        }
        
        /**
         * Unsets the "surveyFormat" attribute
         */
        public void unsetSurveyFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SURVEYFORMAT$70);
            }
        }
        
        /**
         * Gets the "surveyStatus" attribute
         */
        public java.lang.String getSurveyStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYSTATUS$72);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "surveyStatus" attribute
         */
        public org.landxml.schema.landXML11.SurveyStatusType xgetSurveyStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyStatusType target = null;
                target = (org.landxml.schema.landXML11.SurveyStatusType)get_store().find_attribute_user(SURVEYSTATUS$72);
                return target;
            }
        }
        
        /**
         * True if has "surveyStatus" attribute
         */
        public boolean isSetSurveyStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SURVEYSTATUS$72) != null;
            }
        }
        
        /**
         * Sets the "surveyStatus" attribute
         */
        public void setSurveyStatus(java.lang.String surveyStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYSTATUS$72);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SURVEYSTATUS$72);
                }
                target.setStringValue(surveyStatus);
            }
        }
        
        /**
         * Sets (as xml) the "surveyStatus" attribute
         */
        public void xsetSurveyStatus(org.landxml.schema.landXML11.SurveyStatusType surveyStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyStatusType target = null;
                target = (org.landxml.schema.landXML11.SurveyStatusType)get_store().find_attribute_user(SURVEYSTATUS$72);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SurveyStatusType)get_store().add_attribute_user(SURVEYSTATUS$72);
                }
                target.set(surveyStatus);
            }
        }
        
        /**
         * Unsets the "surveyStatus" attribute
         */
        public void unsetSurveyStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SURVEYSTATUS$72);
            }
        }
        
        /**
         * Gets the "communityTitleSchemeNo" attribute
         */
        public int getCommunityTitleSchemeNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMUNITYTITLESCHEMENO$74);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "communityTitleSchemeNo" attribute
         */
        public org.apache.xmlbeans.XmlInt xgetCommunityTitleSchemeNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(COMMUNITYTITLESCHEMENO$74);
                return target;
            }
        }
        
        /**
         * True if has "communityTitleSchemeNo" attribute
         */
        public boolean isSetCommunityTitleSchemeNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COMMUNITYTITLESCHEMENO$74) != null;
            }
        }
        
        /**
         * Sets the "communityTitleSchemeNo" attribute
         */
        public void setCommunityTitleSchemeNo(int communityTitleSchemeNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMUNITYTITLESCHEMENO$74);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMMUNITYTITLESCHEMENO$74);
                }
                target.setIntValue(communityTitleSchemeNo);
            }
        }
        
        /**
         * Sets (as xml) the "communityTitleSchemeNo" attribute
         */
        public void xsetCommunityTitleSchemeNo(org.apache.xmlbeans.XmlInt communityTitleSchemeNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(COMMUNITYTITLESCHEMENO$74);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(COMMUNITYTITLESCHEMENO$74);
                }
                target.set(communityTitleSchemeNo);
            }
        }
        
        /**
         * Unsets the "communityTitleSchemeNo" attribute
         */
        public void unsetCommunityTitleSchemeNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COMMUNITYTITLESCHEMENO$74);
            }
        }
        
        /**
         * Gets the "communityTitleSchemeName" attribute
         */
        public java.lang.String getCommunityTitleSchemeName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMUNITYTITLESCHEMENAME$76);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "communityTitleSchemeName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCommunityTitleSchemeName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COMMUNITYTITLESCHEMENAME$76);
                return target;
            }
        }
        
        /**
         * True if has "communityTitleSchemeName" attribute
         */
        public boolean isSetCommunityTitleSchemeName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COMMUNITYTITLESCHEMENAME$76) != null;
            }
        }
        
        /**
         * Sets the "communityTitleSchemeName" attribute
         */
        public void setCommunityTitleSchemeName(java.lang.String communityTitleSchemeName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMUNITYTITLESCHEMENAME$76);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMMUNITYTITLESCHEMENAME$76);
                }
                target.setStringValue(communityTitleSchemeName);
            }
        }
        
        /**
         * Sets (as xml) the "communityTitleSchemeName" attribute
         */
        public void xsetCommunityTitleSchemeName(org.apache.xmlbeans.XmlString communityTitleSchemeName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COMMUNITYTITLESCHEMENAME$76);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COMMUNITYTITLESCHEMENAME$76);
                }
                target.set(communityTitleSchemeName);
            }
        }
        
        /**
         * Unsets the "communityTitleSchemeName" attribute
         */
        public void unsetCommunityTitleSchemeName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COMMUNITYTITLESCHEMENAME$76);
            }
        }
        
        /**
         * Gets the "fieldNoteFlag" attribute
         */
        public boolean getFieldNoteFlag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDNOTEFLAG$78);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "fieldNoteFlag" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetFieldNoteFlag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FIELDNOTEFLAG$78);
                return target;
            }
        }
        
        /**
         * True if has "fieldNoteFlag" attribute
         */
        public boolean isSetFieldNoteFlag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FIELDNOTEFLAG$78) != null;
            }
        }
        
        /**
         * Sets the "fieldNoteFlag" attribute
         */
        public void setFieldNoteFlag(boolean fieldNoteFlag)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDNOTEFLAG$78);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDNOTEFLAG$78);
                }
                target.setBooleanValue(fieldNoteFlag);
            }
        }
        
        /**
         * Sets (as xml) the "fieldNoteFlag" attribute
         */
        public void xsetFieldNoteFlag(org.apache.xmlbeans.XmlBoolean fieldNoteFlag)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FIELDNOTEFLAG$78);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FIELDNOTEFLAG$78);
                }
                target.set(fieldNoteFlag);
            }
        }
        
        /**
         * Unsets the "fieldNoteFlag" attribute
         */
        public void unsetFieldNoteFlag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FIELDNOTEFLAG$78);
            }
        }
        
        /**
         * Gets the "fieldNoteReference" attribute
         */
        public java.lang.String getFieldNoteReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDNOTEREFERENCE$80);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fieldNoteReference" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFieldNoteReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDNOTEREFERENCE$80);
                return target;
            }
        }
        
        /**
         * True if has "fieldNoteReference" attribute
         */
        public boolean isSetFieldNoteReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FIELDNOTEREFERENCE$80) != null;
            }
        }
        
        /**
         * Sets the "fieldNoteReference" attribute
         */
        public void setFieldNoteReference(java.lang.String fieldNoteReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDNOTEREFERENCE$80);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDNOTEREFERENCE$80);
                }
                target.setStringValue(fieldNoteReference);
            }
        }
        
        /**
         * Sets (as xml) the "fieldNoteReference" attribute
         */
        public void xsetFieldNoteReference(org.apache.xmlbeans.XmlString fieldNoteReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDNOTEREFERENCE$80);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELDNOTEREFERENCE$80);
                }
                target.set(fieldNoteReference);
            }
        }
        
        /**
         * Unsets the "fieldNoteReference" attribute
         */
        public void unsetFieldNoteReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FIELDNOTEREFERENCE$80);
            }
        }
        
        /**
         * Gets the "fieldReport" attribute
         */
        public java.lang.String getFieldReport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDREPORT$82);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fieldReport" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFieldReport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDREPORT$82);
                return target;
            }
        }
        
        /**
         * True if has "fieldReport" attribute
         */
        public boolean isSetFieldReport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FIELDREPORT$82) != null;
            }
        }
        
        /**
         * Sets the "fieldReport" attribute
         */
        public void setFieldReport(java.lang.String fieldReport)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDREPORT$82);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDREPORT$82);
                }
                target.setStringValue(fieldReport);
            }
        }
        
        /**
         * Sets (as xml) the "fieldReport" attribute
         */
        public void xsetFieldReport(org.apache.xmlbeans.XmlString fieldReport)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDREPORT$82);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELDREPORT$82);
                }
                target.set(fieldReport);
            }
        }
        
        /**
         * Unsets the "fieldReport" attribute
         */
        public void unsetFieldReport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FIELDREPORT$82);
            }
        }
    }
}
