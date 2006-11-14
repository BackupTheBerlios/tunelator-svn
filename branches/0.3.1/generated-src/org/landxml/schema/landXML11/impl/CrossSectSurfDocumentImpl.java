/*
 * An XML document type.
 * Localname: CrossSectSurf
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CrossSectSurfDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one CrossSectSurf(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class CrossSectSurfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CrossSectSurfDocument
{
    
    public CrossSectSurfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CROSSSECTSURF$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CrossSectSurf");
    
    
    /**
     * Gets the "CrossSectSurf" element
     */
    public org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf getCrossSectSurf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf target = null;
            target = (org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf)get_store().find_element_user(CROSSSECTSURF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CrossSectSurf" element
     */
    public void setCrossSectSurf(org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf crossSectSurf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf target = null;
            target = (org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf)get_store().find_element_user(CROSSSECTSURF$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf)get_store().add_element_user(CROSSSECTSURF$0);
            }
            target.set(crossSectSurf);
        }
    }
    
    /**
     * Appends and returns a new empty "CrossSectSurf" element
     */
    public org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf addNewCrossSectSurf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf target = null;
            target = (org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf)get_store().add_element_user(CROSSSECTSURF$0);
            return target;
        }
    }
    /**
     * An XML CrossSectSurf(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class CrossSectSurfImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CrossSectSurfDocument.CrossSectSurf
    {
        
        public CrossSectSurfImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PNTLIST2D$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PntList2D");
        private static final javax.xml.namespace.QName FEATURE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESC$6 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName STATE$8 = 
            new javax.xml.namespace.QName("", "state");
        
        
        /**
         * Gets a List of "PntList2D" elements
         */
        public java.util.List<java.util.List> getPntList2DList()
        {
            final class PntList2DList extends java.util.AbstractList<java.util.List>
            {
                public java.util.List get(int i)
                    { return CrossSectSurfImpl.this.getPntList2DArray(i); }
                
                public java.util.List set(int i, java.util.List o)
                {
                    java.util.List old = CrossSectSurfImpl.this.getPntList2DArray(i);
                    CrossSectSurfImpl.this.setPntList2DArray(i, o);
                    return old;
                }
                
                public void add(int i, java.util.List o)
                    { CrossSectSurfImpl.this.insertPntList2D(i, o); }
                
                public java.util.List remove(int i)
                {
                    java.util.List old = CrossSectSurfImpl.this.getPntList2DArray(i);
                    CrossSectSurfImpl.this.removePntList2D(i);
                    return old;
                }
                
                public int size()
                    { return CrossSectSurfImpl.this.sizeOfPntList2DArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PntList2DList();
            }
        }
        
        /**
         * Gets array of all "PntList2D" elements
         */
        public java.util.List[] getPntList2DArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PNTLIST2D$0, targetList);
                java.util.List[] result = new java.util.List[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getListValue();
                return result;
            }
        }
        
        /**
         * Gets ith "PntList2D" element
         */
        public java.util.List getPntList2DArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PNTLIST2D$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "PntList2D" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PntList2DDocument.PntList2D> xgetPntList2DList()
        {
            final class PntList2DList extends java.util.AbstractList<org.landxml.schema.landXML11.PntList2DDocument.PntList2D>
            {
                public org.landxml.schema.landXML11.PntList2DDocument.PntList2D get(int i)
                    { return CrossSectSurfImpl.this.xgetPntList2DArray(i); }
                
                public org.landxml.schema.landXML11.PntList2DDocument.PntList2D set(int i, org.landxml.schema.landXML11.PntList2DDocument.PntList2D o)
                {
                    org.landxml.schema.landXML11.PntList2DDocument.PntList2D old = CrossSectSurfImpl.this.xgetPntList2DArray(i);
                    CrossSectSurfImpl.this.xsetPntList2DArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PntList2DDocument.PntList2D o)
                    { CrossSectSurfImpl.this.insertNewPntList2D(i).set(o); }
                
                public org.landxml.schema.landXML11.PntList2DDocument.PntList2D remove(int i)
                {
                    org.landxml.schema.landXML11.PntList2DDocument.PntList2D old = CrossSectSurfImpl.this.xgetPntList2DArray(i);
                    CrossSectSurfImpl.this.removePntList2D(i);
                    return old;
                }
                
                public int size()
                    { return CrossSectSurfImpl.this.sizeOfPntList2DArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PntList2DList();
            }
        }
        
        /**
         * Gets (as xml) array of all "PntList2D" elements
         */
        public org.landxml.schema.landXML11.PntList2DDocument.PntList2D[] xgetPntList2DArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PNTLIST2D$0, targetList);
                org.landxml.schema.landXML11.PntList2DDocument.PntList2D[] result = new org.landxml.schema.landXML11.PntList2DDocument.PntList2D[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "PntList2D" element
         */
        public org.landxml.schema.landXML11.PntList2DDocument.PntList2D xgetPntList2DArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntList2DDocument.PntList2D target = null;
                target = (org.landxml.schema.landXML11.PntList2DDocument.PntList2D)get_store().find_element_user(PNTLIST2D$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.landxml.schema.landXML11.PntList2DDocument.PntList2D)target;
            }
        }
        
        /**
         * Returns number of "PntList2D" element
         */
        public int sizeOfPntList2DArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PNTLIST2D$0);
            }
        }
        
        /**
         * Sets array of all "PntList2D" element
         */
        public void setPntList2DArray(java.util.List[] pntList2DArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pntList2DArray, PNTLIST2D$0);
            }
        }
        
        /**
         * Sets ith "PntList2D" element
         */
        public void setPntList2DArray(int i, java.util.List pntList2D)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PNTLIST2D$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setListValue(pntList2D);
            }
        }
        
        /**
         * Sets (as xml) array of all "PntList2D" element
         */
        public void xsetPntList2DArray(org.landxml.schema.landXML11.PntList2DDocument.PntList2D[]pntList2DArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pntList2DArray, PNTLIST2D$0);
            }
        }
        
        /**
         * Sets (as xml) ith "PntList2D" element
         */
        public void xsetPntList2DArray(int i, org.landxml.schema.landXML11.PntList2DDocument.PntList2D pntList2D)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntList2DDocument.PntList2D target = null;
                target = (org.landxml.schema.landXML11.PntList2DDocument.PntList2D)get_store().find_element_user(PNTLIST2D$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(pntList2D);
            }
        }
        
        /**
         * Inserts the value as the ith "PntList2D" element
         */
        public void insertPntList2D(int i, java.util.List pntList2D)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PNTLIST2D$0, i);
                target.setListValue(pntList2D);
            }
        }
        
        /**
         * Appends the value as the last "PntList2D" element
         */
        public void addPntList2D(java.util.List pntList2D)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PNTLIST2D$0);
                target.setListValue(pntList2D);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PntList2D" element
         */
        public org.landxml.schema.landXML11.PntList2DDocument.PntList2D insertNewPntList2D(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntList2DDocument.PntList2D target = null;
                target = (org.landxml.schema.landXML11.PntList2DDocument.PntList2D)get_store().insert_element_user(PNTLIST2D$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PntList2D" element
         */
        public org.landxml.schema.landXML11.PntList2DDocument.PntList2D addNewPntList2D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntList2DDocument.PntList2D target = null;
                target = (org.landxml.schema.landXML11.PntList2DDocument.PntList2D)get_store().add_element_user(PNTLIST2D$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "PntList2D" element
         */
        public void removePntList2D(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PNTLIST2D$0, i);
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
                    { return CrossSectSurfImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CrossSectSurfImpl.this.getFeatureArray(i);
                    CrossSectSurfImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { CrossSectSurfImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CrossSectSurfImpl.this.getFeatureArray(i);
                    CrossSectSurfImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return CrossSectSurfImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$2, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$2, i);
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
                return get_store().count_elements(FEATURE$2);
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
                arraySetterHelper(featureArray, FEATURE$2);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$2, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$2, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$2);
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
                get_store().remove_element(FEATURE$2, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
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
         * Gets the "state" attribute
         */
        public org.landxml.schema.landXML11.StateType.Enum getState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$8);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$8);
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
                return get_store().find_attribute_user(STATE$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$8);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$8);
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
                get_store().remove_attribute(STATE$8);
            }
        }
    }
}
