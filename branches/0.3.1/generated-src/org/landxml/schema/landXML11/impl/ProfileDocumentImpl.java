/*
 * An XML document type.
 * Localname: Profile
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ProfileDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Profile(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ProfileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ProfileDocument
{
    
    public ProfileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROFILE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Profile");
    
    
    /**
     * Gets the "Profile" element
     */
    public org.landxml.schema.landXML11.ProfileDocument.Profile getProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ProfileDocument.Profile target = null;
            target = (org.landxml.schema.landXML11.ProfileDocument.Profile)get_store().find_element_user(PROFILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Profile" element
     */
    public void setProfile(org.landxml.schema.landXML11.ProfileDocument.Profile profile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ProfileDocument.Profile target = null;
            target = (org.landxml.schema.landXML11.ProfileDocument.Profile)get_store().find_element_user(PROFILE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ProfileDocument.Profile)get_store().add_element_user(PROFILE$0);
            }
            target.set(profile);
        }
    }
    
    /**
     * Appends and returns a new empty "Profile" element
     */
    public org.landxml.schema.landXML11.ProfileDocument.Profile addNewProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ProfileDocument.Profile target = null;
            target = (org.landxml.schema.landXML11.ProfileDocument.Profile)get_store().add_element_user(PROFILE$0);
            return target;
        }
    }
    /**
     * An XML Profile(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class ProfileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ProfileDocument.Profile
    {
        
        public ProfileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROFSURF$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ProfSurf");
        private static final javax.xml.namespace.QName PROFALIGN$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ProfAlign");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName DESC$6 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName NAME$8 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName STASTART$10 = 
            new javax.xml.namespace.QName("", "staStart");
        private static final javax.xml.namespace.QName STATE$12 = 
            new javax.xml.namespace.QName("", "state");
        
        
        /**
         * Gets a List of "ProfSurf" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf> getProfSurfList()
        {
            final class ProfSurfList extends java.util.AbstractList<org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf>
            {
                public org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf get(int i)
                    { return ProfileImpl.this.getProfSurfArray(i); }
                
                public org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf set(int i, org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf o)
                {
                    org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf old = ProfileImpl.this.getProfSurfArray(i);
                    ProfileImpl.this.setProfSurfArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf o)
                    { ProfileImpl.this.insertNewProfSurf(i).set(o); }
                
                public org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf remove(int i)
                {
                    org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf old = ProfileImpl.this.getProfSurfArray(i);
                    ProfileImpl.this.removeProfSurf(i);
                    return old;
                }
                
                public int size()
                    { return ProfileImpl.this.sizeOfProfSurfArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ProfSurfList();
            }
        }
        
        /**
         * Gets array of all "ProfSurf" elements
         */
        public org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf[] getProfSurfArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROFSURF$0, targetList);
                org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf[] result = new org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ProfSurf" element
         */
        public org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf getProfSurfArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf target = null;
                target = (org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf)get_store().find_element_user(PROFSURF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ProfSurf" element
         */
        public int sizeOfProfSurfArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROFSURF$0);
            }
        }
        
        /**
         * Sets array of all "ProfSurf" element
         */
        public void setProfSurfArray(org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf[] profSurfArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(profSurfArray, PROFSURF$0);
            }
        }
        
        /**
         * Sets ith "ProfSurf" element
         */
        public void setProfSurfArray(int i, org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf profSurf)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf target = null;
                target = (org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf)get_store().find_element_user(PROFSURF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(profSurf);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ProfSurf" element
         */
        public org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf insertNewProfSurf(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf target = null;
                target = (org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf)get_store().insert_element_user(PROFSURF$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ProfSurf" element
         */
        public org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf addNewProfSurf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf target = null;
                target = (org.landxml.schema.landXML11.ProfSurfDocument.ProfSurf)get_store().add_element_user(PROFSURF$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ProfSurf" element
         */
        public void removeProfSurf(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROFSURF$0, i);
            }
        }
        
        /**
         * Gets a List of "ProfAlign" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign> getProfAlignList()
        {
            final class ProfAlignList extends java.util.AbstractList<org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign>
            {
                public org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign get(int i)
                    { return ProfileImpl.this.getProfAlignArray(i); }
                
                public org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign set(int i, org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign o)
                {
                    org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign old = ProfileImpl.this.getProfAlignArray(i);
                    ProfileImpl.this.setProfAlignArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign o)
                    { ProfileImpl.this.insertNewProfAlign(i).set(o); }
                
                public org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign remove(int i)
                {
                    org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign old = ProfileImpl.this.getProfAlignArray(i);
                    ProfileImpl.this.removeProfAlign(i);
                    return old;
                }
                
                public int size()
                    { return ProfileImpl.this.sizeOfProfAlignArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ProfAlignList();
            }
        }
        
        /**
         * Gets array of all "ProfAlign" elements
         */
        public org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign[] getProfAlignArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROFALIGN$2, targetList);
                org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign[] result = new org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ProfAlign" element
         */
        public org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign getProfAlignArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign target = null;
                target = (org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign)get_store().find_element_user(PROFALIGN$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ProfAlign" element
         */
        public int sizeOfProfAlignArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROFALIGN$2);
            }
        }
        
        /**
         * Sets array of all "ProfAlign" element
         */
        public void setProfAlignArray(org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign[] profAlignArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(profAlignArray, PROFALIGN$2);
            }
        }
        
        /**
         * Sets ith "ProfAlign" element
         */
        public void setProfAlignArray(int i, org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign profAlign)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign target = null;
                target = (org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign)get_store().find_element_user(PROFALIGN$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(profAlign);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ProfAlign" element
         */
        public org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign insertNewProfAlign(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign target = null;
                target = (org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign)get_store().insert_element_user(PROFALIGN$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ProfAlign" element
         */
        public org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign addNewProfAlign()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign target = null;
                target = (org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign)get_store().add_element_user(PROFALIGN$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "ProfAlign" element
         */
        public void removeProfAlign(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROFALIGN$2, i);
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
                    { return ProfileImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ProfileImpl.this.getFeatureArray(i);
                    ProfileImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { ProfileImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ProfileImpl.this.getFeatureArray(i);
                    ProfileImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return ProfileImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$4, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$4, i);
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
                return get_store().count_elements(FEATURE$4);
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
                arraySetterHelper(featureArray, FEATURE$4);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$4, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$4, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$4);
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
                get_store().remove_element(FEATURE$4, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$6);
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
                return get_store().find_attribute_user(DESC$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$6);
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
                get_store().remove_attribute(DESC$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
                return target;
            }
        }
        
        /**
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$8);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$8);
            }
        }
        
        /**
         * Gets the "staStart" attribute
         */
        public double getStaStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STASTART$10);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "staStart" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetStaStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STASTART$10);
                return target;
            }
        }
        
        /**
         * True if has "staStart" attribute
         */
        public boolean isSetStaStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STASTART$10) != null;
            }
        }
        
        /**
         * Sets the "staStart" attribute
         */
        public void setStaStart(double staStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STASTART$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STASTART$10);
                }
                target.setDoubleValue(staStart);
            }
        }
        
        /**
         * Sets (as xml) the "staStart" attribute
         */
        public void xsetStaStart(org.apache.xmlbeans.XmlDouble staStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STASTART$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(STASTART$10);
                }
                target.set(staStart);
            }
        }
        
        /**
         * Unsets the "staStart" attribute
         */
        public void unsetStaStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STASTART$10);
            }
        }
        
        /**
         * Gets the "state" attribute
         */
        public org.landxml.schema.landXML11.StateType.Enum getState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$12);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.StateType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "state" attribute
         */
        public org.landxml.schema.landXML11.StateType xgetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StateType target = null;
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$12);
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
                return get_store().find_attribute_user(STATE$12) != null;
            }
        }
        
        /**
         * Sets the "state" attribute
         */
        public void setState(org.landxml.schema.landXML11.StateType.Enum state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$12);
                }
                target.setEnumValue(state);
            }
        }
        
        /**
         * Sets (as xml) the "state" attribute
         */
        public void xsetState(org.landxml.schema.landXML11.StateType state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StateType target = null;
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$12);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$12);
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
                get_store().remove_attribute(STATE$12);
            }
        }
    }
}
