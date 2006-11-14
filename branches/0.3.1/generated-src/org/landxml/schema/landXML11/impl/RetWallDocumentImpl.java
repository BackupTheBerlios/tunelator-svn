/*
 * An XML document type.
 * Localname: RetWall
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.RetWallDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one RetWall(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class RetWallDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.RetWallDocument
{
    
    public RetWallDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETWALL$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "RetWall");
    
    
    /**
     * Gets the "RetWall" element
     */
    public org.landxml.schema.landXML11.RetWallDocument.RetWall getRetWall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RetWallDocument.RetWall target = null;
            target = (org.landxml.schema.landXML11.RetWallDocument.RetWall)get_store().find_element_user(RETWALL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RetWall" element
     */
    public void setRetWall(org.landxml.schema.landXML11.RetWallDocument.RetWall retWall)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RetWallDocument.RetWall target = null;
            target = (org.landxml.schema.landXML11.RetWallDocument.RetWall)get_store().find_element_user(RETWALL$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.RetWallDocument.RetWall)get_store().add_element_user(RETWALL$0);
            }
            target.set(retWall);
        }
    }
    
    /**
     * Appends and returns a new empty "RetWall" element
     */
    public org.landxml.schema.landXML11.RetWallDocument.RetWall addNewRetWall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RetWallDocument.RetWall target = null;
            target = (org.landxml.schema.landXML11.RetWallDocument.RetWall)get_store().add_element_user(RETWALL$0);
            return target;
        }
    }
    /**
     * An XML RetWall(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class RetWallImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.RetWallDocument.RetWall
    {
        
        public RetWallImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETWALLPNT$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "RetWallPnt");
        private static final javax.xml.namespace.QName FEATURE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName DESC$4 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName NAME$6 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName STATE$8 = 
            new javax.xml.namespace.QName("", "state");
        
        
        /**
         * Gets a List of "RetWallPnt" elements
         */
        public java.util.List<org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt> getRetWallPntList()
        {
            final class RetWallPntList extends java.util.AbstractList<org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt>
            {
                public org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt get(int i)
                    { return RetWallImpl.this.getRetWallPntArray(i); }
                
                public org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt set(int i, org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt o)
                {
                    org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt old = RetWallImpl.this.getRetWallPntArray(i);
                    RetWallImpl.this.setRetWallPntArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt o)
                    { RetWallImpl.this.insertNewRetWallPnt(i).set(o); }
                
                public org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt remove(int i)
                {
                    org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt old = RetWallImpl.this.getRetWallPntArray(i);
                    RetWallImpl.this.removeRetWallPnt(i);
                    return old;
                }
                
                public int size()
                    { return RetWallImpl.this.sizeOfRetWallPntArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RetWallPntList();
            }
        }
        
        /**
         * Gets array of all "RetWallPnt" elements
         */
        public org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt[] getRetWallPntArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RETWALLPNT$0, targetList);
                org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt[] result = new org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "RetWallPnt" element
         */
        public org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt getRetWallPntArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt target = null;
                target = (org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt)get_store().find_element_user(RETWALLPNT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "RetWallPnt" element
         */
        public int sizeOfRetWallPntArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETWALLPNT$0);
            }
        }
        
        /**
         * Sets array of all "RetWallPnt" element
         */
        public void setRetWallPntArray(org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt[] retWallPntArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(retWallPntArray, RETWALLPNT$0);
            }
        }
        
        /**
         * Sets ith "RetWallPnt" element
         */
        public void setRetWallPntArray(int i, org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt retWallPnt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt target = null;
                target = (org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt)get_store().find_element_user(RETWALLPNT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(retWallPnt);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RetWallPnt" element
         */
        public org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt insertNewRetWallPnt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt target = null;
                target = (org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt)get_store().insert_element_user(RETWALLPNT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RetWallPnt" element
         */
        public org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt addNewRetWallPnt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt target = null;
                target = (org.landxml.schema.landXML11.RetWallPntDocument.RetWallPnt)get_store().add_element_user(RETWALLPNT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "RetWallPnt" element
         */
        public void removeRetWallPnt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETWALLPNT$0, i);
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
                    { return RetWallImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = RetWallImpl.this.getFeatureArray(i);
                    RetWallImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { RetWallImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = RetWallImpl.this.getFeatureArray(i);
                    RetWallImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return RetWallImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "desc" attribute
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$4);
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
                return get_store().find_attribute_user(DESC$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$4);
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
                get_store().remove_attribute(DESC$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
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
                return get_store().find_attribute_user(NAME$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
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
                get_store().remove_attribute(NAME$6);
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
