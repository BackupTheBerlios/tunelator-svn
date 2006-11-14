/*
 * An XML document type.
 * Localname: Breaklines
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.BreaklinesDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Breaklines(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class BreaklinesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.BreaklinesDocument
{
    
    public BreaklinesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BREAKLINES$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Breaklines");
    
    
    /**
     * Gets the "Breaklines" element
     */
    public org.landxml.schema.landXML11.BreaklinesDocument.Breaklines getBreaklines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.BreaklinesDocument.Breaklines target = null;
            target = (org.landxml.schema.landXML11.BreaklinesDocument.Breaklines)get_store().find_element_user(BREAKLINES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Breaklines" element
     */
    public void setBreaklines(org.landxml.schema.landXML11.BreaklinesDocument.Breaklines breaklines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.BreaklinesDocument.Breaklines target = null;
            target = (org.landxml.schema.landXML11.BreaklinesDocument.Breaklines)get_store().find_element_user(BREAKLINES$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.BreaklinesDocument.Breaklines)get_store().add_element_user(BREAKLINES$0);
            }
            target.set(breaklines);
        }
    }
    
    /**
     * Appends and returns a new empty "Breaklines" element
     */
    public org.landxml.schema.landXML11.BreaklinesDocument.Breaklines addNewBreaklines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.BreaklinesDocument.Breaklines target = null;
            target = (org.landxml.schema.landXML11.BreaklinesDocument.Breaklines)get_store().add_element_user(BREAKLINES$0);
            return target;
        }
    }
    /**
     * An XML Breaklines(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class BreaklinesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.BreaklinesDocument.Breaklines
    {
        
        public BreaklinesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BREAKLINE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Breakline");
        private static final javax.xml.namespace.QName RETWALL$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "RetWall");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        
        
        /**
         * Gets a List of "Breakline" elements
         */
        public java.util.List<org.landxml.schema.landXML11.BreaklineDocument.Breakline> getBreaklineList()
        {
            final class BreaklineList extends java.util.AbstractList<org.landxml.schema.landXML11.BreaklineDocument.Breakline>
            {
                public org.landxml.schema.landXML11.BreaklineDocument.Breakline get(int i)
                    { return BreaklinesImpl.this.getBreaklineArray(i); }
                
                public org.landxml.schema.landXML11.BreaklineDocument.Breakline set(int i, org.landxml.schema.landXML11.BreaklineDocument.Breakline o)
                {
                    org.landxml.schema.landXML11.BreaklineDocument.Breakline old = BreaklinesImpl.this.getBreaklineArray(i);
                    BreaklinesImpl.this.setBreaklineArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.BreaklineDocument.Breakline o)
                    { BreaklinesImpl.this.insertNewBreakline(i).set(o); }
                
                public org.landxml.schema.landXML11.BreaklineDocument.Breakline remove(int i)
                {
                    org.landxml.schema.landXML11.BreaklineDocument.Breakline old = BreaklinesImpl.this.getBreaklineArray(i);
                    BreaklinesImpl.this.removeBreakline(i);
                    return old;
                }
                
                public int size()
                    { return BreaklinesImpl.this.sizeOfBreaklineArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new BreaklineList();
            }
        }
        
        /**
         * Gets array of all "Breakline" elements
         */
        public org.landxml.schema.landXML11.BreaklineDocument.Breakline[] getBreaklineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BREAKLINE$0, targetList);
                org.landxml.schema.landXML11.BreaklineDocument.Breakline[] result = new org.landxml.schema.landXML11.BreaklineDocument.Breakline[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Breakline" element
         */
        public org.landxml.schema.landXML11.BreaklineDocument.Breakline getBreaklineArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BreaklineDocument.Breakline target = null;
                target = (org.landxml.schema.landXML11.BreaklineDocument.Breakline)get_store().find_element_user(BREAKLINE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Breakline" element
         */
        public int sizeOfBreaklineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BREAKLINE$0);
            }
        }
        
        /**
         * Sets array of all "Breakline" element
         */
        public void setBreaklineArray(org.landxml.schema.landXML11.BreaklineDocument.Breakline[] breaklineArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(breaklineArray, BREAKLINE$0);
            }
        }
        
        /**
         * Sets ith "Breakline" element
         */
        public void setBreaklineArray(int i, org.landxml.schema.landXML11.BreaklineDocument.Breakline breakline)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BreaklineDocument.Breakline target = null;
                target = (org.landxml.schema.landXML11.BreaklineDocument.Breakline)get_store().find_element_user(BREAKLINE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(breakline);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Breakline" element
         */
        public org.landxml.schema.landXML11.BreaklineDocument.Breakline insertNewBreakline(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BreaklineDocument.Breakline target = null;
                target = (org.landxml.schema.landXML11.BreaklineDocument.Breakline)get_store().insert_element_user(BREAKLINE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Breakline" element
         */
        public org.landxml.schema.landXML11.BreaklineDocument.Breakline addNewBreakline()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BreaklineDocument.Breakline target = null;
                target = (org.landxml.schema.landXML11.BreaklineDocument.Breakline)get_store().add_element_user(BREAKLINE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Breakline" element
         */
        public void removeBreakline(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BREAKLINE$0, i);
            }
        }
        
        /**
         * Gets a List of "RetWall" elements
         */
        public java.util.List<org.landxml.schema.landXML11.RetWallDocument.RetWall> getRetWallList()
        {
            final class RetWallList extends java.util.AbstractList<org.landxml.schema.landXML11.RetWallDocument.RetWall>
            {
                public org.landxml.schema.landXML11.RetWallDocument.RetWall get(int i)
                    { return BreaklinesImpl.this.getRetWallArray(i); }
                
                public org.landxml.schema.landXML11.RetWallDocument.RetWall set(int i, org.landxml.schema.landXML11.RetWallDocument.RetWall o)
                {
                    org.landxml.schema.landXML11.RetWallDocument.RetWall old = BreaklinesImpl.this.getRetWallArray(i);
                    BreaklinesImpl.this.setRetWallArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.RetWallDocument.RetWall o)
                    { BreaklinesImpl.this.insertNewRetWall(i).set(o); }
                
                public org.landxml.schema.landXML11.RetWallDocument.RetWall remove(int i)
                {
                    org.landxml.schema.landXML11.RetWallDocument.RetWall old = BreaklinesImpl.this.getRetWallArray(i);
                    BreaklinesImpl.this.removeRetWall(i);
                    return old;
                }
                
                public int size()
                    { return BreaklinesImpl.this.sizeOfRetWallArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RetWallList();
            }
        }
        
        /**
         * Gets array of all "RetWall" elements
         */
        public org.landxml.schema.landXML11.RetWallDocument.RetWall[] getRetWallArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RETWALL$2, targetList);
                org.landxml.schema.landXML11.RetWallDocument.RetWall[] result = new org.landxml.schema.landXML11.RetWallDocument.RetWall[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "RetWall" element
         */
        public org.landxml.schema.landXML11.RetWallDocument.RetWall getRetWallArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RetWallDocument.RetWall target = null;
                target = (org.landxml.schema.landXML11.RetWallDocument.RetWall)get_store().find_element_user(RETWALL$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "RetWall" element
         */
        public int sizeOfRetWallArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETWALL$2);
            }
        }
        
        /**
         * Sets array of all "RetWall" element
         */
        public void setRetWallArray(org.landxml.schema.landXML11.RetWallDocument.RetWall[] retWallArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(retWallArray, RETWALL$2);
            }
        }
        
        /**
         * Sets ith "RetWall" element
         */
        public void setRetWallArray(int i, org.landxml.schema.landXML11.RetWallDocument.RetWall retWall)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RetWallDocument.RetWall target = null;
                target = (org.landxml.schema.landXML11.RetWallDocument.RetWall)get_store().find_element_user(RETWALL$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(retWall);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RetWall" element
         */
        public org.landxml.schema.landXML11.RetWallDocument.RetWall insertNewRetWall(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RetWallDocument.RetWall target = null;
                target = (org.landxml.schema.landXML11.RetWallDocument.RetWall)get_store().insert_element_user(RETWALL$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RetWall" element
         */
        public org.landxml.schema.landXML11.RetWallDocument.RetWall addNewRetWall()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RetWallDocument.RetWall target = null;
                target = (org.landxml.schema.landXML11.RetWallDocument.RetWall)get_store().add_element_user(RETWALL$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "RetWall" element
         */
        public void removeRetWall(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETWALL$2, i);
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
                    { return BreaklinesImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = BreaklinesImpl.this.getFeatureArray(i);
                    BreaklinesImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { BreaklinesImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = BreaklinesImpl.this.getFeatureArray(i);
                    BreaklinesImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return BreaklinesImpl.this.sizeOfFeatureArray(); }
                
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
    }
}
