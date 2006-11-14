/*
 * An XML document type.
 * Localname: SurveyMonument
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.SurveyMonumentDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one SurveyMonument(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class SurveyMonumentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SurveyMonumentDocument
{
    
    public SurveyMonumentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURVEYMONUMENT$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "SurveyMonument");
    
    
    /**
     * Gets the "SurveyMonument" element
     */
    public org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument getSurveyMonument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument target = null;
            target = (org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument)get_store().find_element_user(SURVEYMONUMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SurveyMonument" element
     */
    public void setSurveyMonument(org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument surveyMonument)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument target = null;
            target = (org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument)get_store().find_element_user(SURVEYMONUMENT$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument)get_store().add_element_user(SURVEYMONUMENT$0);
            }
            target.set(surveyMonument);
        }
    }
    
    /**
     * Appends and returns a new empty "SurveyMonument" element
     */
    public org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument addNewSurveyMonument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument target = null;
            target = (org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument)get_store().add_element_user(SURVEYMONUMENT$0);
            return target;
        }
    }
    /**
     * An XML SurveyMonument(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class SurveyMonumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SurveyMonumentDocument.SurveyMonument
    {
        
        public SurveyMonumentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FEATURE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName MNTREF$2 = 
            new javax.xml.namespace.QName("", "mntRef");
        private static final javax.xml.namespace.QName PURPOSE$4 = 
            new javax.xml.namespace.QName("", "purpose");
        private static final javax.xml.namespace.QName STATE$6 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName ADOPTEDSURVEY$8 = 
            new javax.xml.namespace.QName("", "adoptedSurvey");
        private static final javax.xml.namespace.QName DISTURBEDMONUMENT$10 = 
            new javax.xml.namespace.QName("", "disturbedMonument");
        private static final javax.xml.namespace.QName DISTURBEDDATE$12 = 
            new javax.xml.namespace.QName("", "disturbedDate");
        private static final javax.xml.namespace.QName DISTURBEDANNOTATION$14 = 
            new javax.xml.namespace.QName("", "disturbedAnnotation");
        private static final javax.xml.namespace.QName REPLACEDMONUMENT$16 = 
            new javax.xml.namespace.QName("", "replacedMonument");
        private static final javax.xml.namespace.QName REPLACEDDATE$18 = 
            new javax.xml.namespace.QName("", "replacedDate");
        private static final javax.xml.namespace.QName REPLACEDANNOTATION$20 = 
            new javax.xml.namespace.QName("", "replacedAnnotation");
        
        
        /**
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return SurveyMonumentImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = SurveyMonumentImpl.this.getFeatureArray(i);
                    SurveyMonumentImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { SurveyMonumentImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = SurveyMonumentImpl.this.getFeatureArray(i);
                    SurveyMonumentImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return SurveyMonumentImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$0, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$0, i);
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
                return get_store().count_elements(FEATURE$0);
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
                arraySetterHelper(featureArray, FEATURE$0);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$0, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$0, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$0);
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
                get_store().remove_element(FEATURE$0, i);
            }
        }
        
        /**
         * Gets the "mntRef" attribute
         */
        public java.lang.String getMntRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MNTREF$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mntRef" attribute
         */
        public org.landxml.schema.landXML11.MonumentNameRef xgetMntRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentNameRef target = null;
                target = (org.landxml.schema.landXML11.MonumentNameRef)get_store().find_attribute_user(MNTREF$2);
                return target;
            }
        }
        
        /**
         * Sets the "mntRef" attribute
         */
        public void setMntRef(java.lang.String mntRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MNTREF$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MNTREF$2);
                }
                target.setStringValue(mntRef);
            }
        }
        
        /**
         * Sets (as xml) the "mntRef" attribute
         */
        public void xsetMntRef(org.landxml.schema.landXML11.MonumentNameRef mntRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentNameRef target = null;
                target = (org.landxml.schema.landXML11.MonumentNameRef)get_store().find_attribute_user(MNTREF$2);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.MonumentNameRef)get_store().add_attribute_user(MNTREF$2);
                }
                target.set(mntRef);
            }
        }
        
        /**
         * Gets the "purpose" attribute
         */
        public java.lang.String getPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PURPOSE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "purpose" attribute
         */
        public org.landxml.schema.landXML11.MonumentPurpose xgetPurpose()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentPurpose target = null;
                target = (org.landxml.schema.landXML11.MonumentPurpose)get_store().find_attribute_user(PURPOSE$4);
                return target;
            }
        }
        
        /**
         * Sets the "purpose" attribute
         */
        public void setPurpose(java.lang.String purpose)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PURPOSE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PURPOSE$4);
                }
                target.setStringValue(purpose);
            }
        }
        
        /**
         * Sets (as xml) the "purpose" attribute
         */
        public void xsetPurpose(org.landxml.schema.landXML11.MonumentPurpose purpose)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentPurpose target = null;
                target = (org.landxml.schema.landXML11.MonumentPurpose)get_store().find_attribute_user(PURPOSE$4);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.MonumentPurpose)get_store().add_attribute_user(PURPOSE$4);
                }
                target.set(purpose);
            }
        }
        
        /**
         * Gets the "state" attribute
         */
        public java.lang.String getState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "state" attribute
         */
        public org.landxml.schema.landXML11.MonumentState xgetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentState target = null;
                target = (org.landxml.schema.landXML11.MonumentState)get_store().find_attribute_user(STATE$6);
                return target;
            }
        }
        
        /**
         * True if has "state" attribute
         */
        public boolean isSetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STATE$6) != null;
            }
        }
        
        /**
         * Sets the "state" attribute
         */
        public void setState(java.lang.String state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$6);
                }
                target.setStringValue(state);
            }
        }
        
        /**
         * Sets (as xml) the "state" attribute
         */
        public void xsetState(org.landxml.schema.landXML11.MonumentState state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentState target = null;
                target = (org.landxml.schema.landXML11.MonumentState)get_store().find_attribute_user(STATE$6);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.MonumentState)get_store().add_attribute_user(STATE$6);
                }
                target.set(state);
            }
        }
        
        /**
         * Unsets the "state" attribute
         */
        public void unsetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STATE$6);
            }
        }
        
        /**
         * Gets the "adoptedSurvey" attribute
         */
        public java.lang.String getAdoptedSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADOPTEDSURVEY$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "adoptedSurvey" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAdoptedSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADOPTEDSURVEY$8);
                return target;
            }
        }
        
        /**
         * True if has "adoptedSurvey" attribute
         */
        public boolean isSetAdoptedSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ADOPTEDSURVEY$8) != null;
            }
        }
        
        /**
         * Sets the "adoptedSurvey" attribute
         */
        public void setAdoptedSurvey(java.lang.String adoptedSurvey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADOPTEDSURVEY$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADOPTEDSURVEY$8);
                }
                target.setStringValue(adoptedSurvey);
            }
        }
        
        /**
         * Sets (as xml) the "adoptedSurvey" attribute
         */
        public void xsetAdoptedSurvey(org.apache.xmlbeans.XmlString adoptedSurvey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADOPTEDSURVEY$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADOPTEDSURVEY$8);
                }
                target.set(adoptedSurvey);
            }
        }
        
        /**
         * Unsets the "adoptedSurvey" attribute
         */
        public void unsetAdoptedSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ADOPTEDSURVEY$8);
            }
        }
        
        /**
         * Gets the "disturbedMonument" attribute
         */
        public java.lang.String getDisturbedMonument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTURBEDMONUMENT$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "disturbedMonument" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDisturbedMonument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISTURBEDMONUMENT$10);
                return target;
            }
        }
        
        /**
         * True if has "disturbedMonument" attribute
         */
        public boolean isSetDisturbedMonument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DISTURBEDMONUMENT$10) != null;
            }
        }
        
        /**
         * Sets the "disturbedMonument" attribute
         */
        public void setDisturbedMonument(java.lang.String disturbedMonument)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTURBEDMONUMENT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTURBEDMONUMENT$10);
                }
                target.setStringValue(disturbedMonument);
            }
        }
        
        /**
         * Sets (as xml) the "disturbedMonument" attribute
         */
        public void xsetDisturbedMonument(org.apache.xmlbeans.XmlString disturbedMonument)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISTURBEDMONUMENT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DISTURBEDMONUMENT$10);
                }
                target.set(disturbedMonument);
            }
        }
        
        /**
         * Unsets the "disturbedMonument" attribute
         */
        public void unsetDisturbedMonument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DISTURBEDMONUMENT$10);
            }
        }
        
        /**
         * Gets the "disturbedDate" attribute
         */
        public java.util.Calendar getDisturbedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTURBEDDATE$12);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "disturbedDate" attribute
         */
        public org.apache.xmlbeans.XmlDate xgetDisturbedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(DISTURBEDDATE$12);
                return target;
            }
        }
        
        /**
         * True if has "disturbedDate" attribute
         */
        public boolean isSetDisturbedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DISTURBEDDATE$12) != null;
            }
        }
        
        /**
         * Sets the "disturbedDate" attribute
         */
        public void setDisturbedDate(java.util.Calendar disturbedDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTURBEDDATE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTURBEDDATE$12);
                }
                target.setCalendarValue(disturbedDate);
            }
        }
        
        /**
         * Sets (as xml) the "disturbedDate" attribute
         */
        public void xsetDisturbedDate(org.apache.xmlbeans.XmlDate disturbedDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(DISTURBEDDATE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(DISTURBEDDATE$12);
                }
                target.set(disturbedDate);
            }
        }
        
        /**
         * Unsets the "disturbedDate" attribute
         */
        public void unsetDisturbedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DISTURBEDDATE$12);
            }
        }
        
        /**
         * Gets the "disturbedAnnotation" attribute
         */
        public java.lang.String getDisturbedAnnotation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTURBEDANNOTATION$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "disturbedAnnotation" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDisturbedAnnotation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISTURBEDANNOTATION$14);
                return target;
            }
        }
        
        /**
         * True if has "disturbedAnnotation" attribute
         */
        public boolean isSetDisturbedAnnotation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DISTURBEDANNOTATION$14) != null;
            }
        }
        
        /**
         * Sets the "disturbedAnnotation" attribute
         */
        public void setDisturbedAnnotation(java.lang.String disturbedAnnotation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTURBEDANNOTATION$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTURBEDANNOTATION$14);
                }
                target.setStringValue(disturbedAnnotation);
            }
        }
        
        /**
         * Sets (as xml) the "disturbedAnnotation" attribute
         */
        public void xsetDisturbedAnnotation(org.apache.xmlbeans.XmlString disturbedAnnotation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISTURBEDANNOTATION$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DISTURBEDANNOTATION$14);
                }
                target.set(disturbedAnnotation);
            }
        }
        
        /**
         * Unsets the "disturbedAnnotation" attribute
         */
        public void unsetDisturbedAnnotation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DISTURBEDANNOTATION$14);
            }
        }
        
        /**
         * Gets the "replacedMonument" attribute
         */
        public java.lang.String getReplacedMonument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPLACEDMONUMENT$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "replacedMonument" attribute
         */
        public org.apache.xmlbeans.XmlString xgetReplacedMonument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REPLACEDMONUMENT$16);
                return target;
            }
        }
        
        /**
         * True if has "replacedMonument" attribute
         */
        public boolean isSetReplacedMonument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REPLACEDMONUMENT$16) != null;
            }
        }
        
        /**
         * Sets the "replacedMonument" attribute
         */
        public void setReplacedMonument(java.lang.String replacedMonument)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPLACEDMONUMENT$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPLACEDMONUMENT$16);
                }
                target.setStringValue(replacedMonument);
            }
        }
        
        /**
         * Sets (as xml) the "replacedMonument" attribute
         */
        public void xsetReplacedMonument(org.apache.xmlbeans.XmlString replacedMonument)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REPLACEDMONUMENT$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REPLACEDMONUMENT$16);
                }
                target.set(replacedMonument);
            }
        }
        
        /**
         * Unsets the "replacedMonument" attribute
         */
        public void unsetReplacedMonument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REPLACEDMONUMENT$16);
            }
        }
        
        /**
         * Gets the "replacedDate" attribute
         */
        public java.util.Calendar getReplacedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPLACEDDATE$18);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "replacedDate" attribute
         */
        public org.apache.xmlbeans.XmlDate xgetReplacedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(REPLACEDDATE$18);
                return target;
            }
        }
        
        /**
         * True if has "replacedDate" attribute
         */
        public boolean isSetReplacedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REPLACEDDATE$18) != null;
            }
        }
        
        /**
         * Sets the "replacedDate" attribute
         */
        public void setReplacedDate(java.util.Calendar replacedDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPLACEDDATE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPLACEDDATE$18);
                }
                target.setCalendarValue(replacedDate);
            }
        }
        
        /**
         * Sets (as xml) the "replacedDate" attribute
         */
        public void xsetReplacedDate(org.apache.xmlbeans.XmlDate replacedDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(REPLACEDDATE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(REPLACEDDATE$18);
                }
                target.set(replacedDate);
            }
        }
        
        /**
         * Unsets the "replacedDate" attribute
         */
        public void unsetReplacedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REPLACEDDATE$18);
            }
        }
        
        /**
         * Gets the "replacedAnnotation" attribute
         */
        public java.lang.String getReplacedAnnotation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPLACEDANNOTATION$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "replacedAnnotation" attribute
         */
        public org.apache.xmlbeans.XmlString xgetReplacedAnnotation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REPLACEDANNOTATION$20);
                return target;
            }
        }
        
        /**
         * True if has "replacedAnnotation" attribute
         */
        public boolean isSetReplacedAnnotation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REPLACEDANNOTATION$20) != null;
            }
        }
        
        /**
         * Sets the "replacedAnnotation" attribute
         */
        public void setReplacedAnnotation(java.lang.String replacedAnnotation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPLACEDANNOTATION$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPLACEDANNOTATION$20);
                }
                target.setStringValue(replacedAnnotation);
            }
        }
        
        /**
         * Sets (as xml) the "replacedAnnotation" attribute
         */
        public void xsetReplacedAnnotation(org.apache.xmlbeans.XmlString replacedAnnotation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REPLACEDANNOTATION$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REPLACEDANNOTATION$20);
                }
                target.set(replacedAnnotation);
            }
        }
        
        /**
         * Unsets the "replacedAnnotation" attribute
         */
        public void unsetReplacedAnnotation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REPLACEDANNOTATION$20);
            }
        }
    }
}
