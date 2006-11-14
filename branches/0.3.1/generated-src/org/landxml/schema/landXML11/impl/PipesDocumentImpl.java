/*
 * An XML document type.
 * Localname: Pipes
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PipesDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Pipes(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class PipesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PipesDocument
{
    
    public PipesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PIPES$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Pipes");
    
    
    /**
     * Gets the "Pipes" element
     */
    public org.landxml.schema.landXML11.PipesDocument.Pipes getPipes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PipesDocument.Pipes target = null;
            target = (org.landxml.schema.landXML11.PipesDocument.Pipes)get_store().find_element_user(PIPES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Pipes" element
     */
    public void setPipes(org.landxml.schema.landXML11.PipesDocument.Pipes pipes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PipesDocument.Pipes target = null;
            target = (org.landxml.schema.landXML11.PipesDocument.Pipes)get_store().find_element_user(PIPES$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PipesDocument.Pipes)get_store().add_element_user(PIPES$0);
            }
            target.set(pipes);
        }
    }
    
    /**
     * Appends and returns a new empty "Pipes" element
     */
    public org.landxml.schema.landXML11.PipesDocument.Pipes addNewPipes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PipesDocument.Pipes target = null;
            target = (org.landxml.schema.landXML11.PipesDocument.Pipes)get_store().add_element_user(PIPES$0);
            return target;
        }
    }
    /**
     * An XML Pipes(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class PipesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PipesDocument.Pipes
    {
        
        public PipesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UNITS$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Units");
        private static final javax.xml.namespace.QName PIPE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Pipe");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        
        
        /**
         * Gets the "Units" element
         */
        public org.landxml.schema.landXML11.UnitsDocument.Units getUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.UnitsDocument.Units target = null;
                target = (org.landxml.schema.landXML11.UnitsDocument.Units)get_store().find_element_user(UNITS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Units" element
         */
        public boolean isSetUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UNITS$0) != 0;
            }
        }
        
        /**
         * Sets the "Units" element
         */
        public void setUnits(org.landxml.schema.landXML11.UnitsDocument.Units units)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.UnitsDocument.Units target = null;
                target = (org.landxml.schema.landXML11.UnitsDocument.Units)get_store().find_element_user(UNITS$0, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.UnitsDocument.Units)get_store().add_element_user(UNITS$0);
                }
                target.set(units);
            }
        }
        
        /**
         * Appends and returns a new empty "Units" element
         */
        public org.landxml.schema.landXML11.UnitsDocument.Units addNewUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.UnitsDocument.Units target = null;
                target = (org.landxml.schema.landXML11.UnitsDocument.Units)get_store().add_element_user(UNITS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "Units" element
         */
        public void unsetUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UNITS$0, 0);
            }
        }
        
        /**
         * Gets a List of "Pipe" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PipeDocument.Pipe> getPipeList()
        {
            final class PipeList extends java.util.AbstractList<org.landxml.schema.landXML11.PipeDocument.Pipe>
            {
                public org.landxml.schema.landXML11.PipeDocument.Pipe get(int i)
                    { return PipesImpl.this.getPipeArray(i); }
                
                public org.landxml.schema.landXML11.PipeDocument.Pipe set(int i, org.landxml.schema.landXML11.PipeDocument.Pipe o)
                {
                    org.landxml.schema.landXML11.PipeDocument.Pipe old = PipesImpl.this.getPipeArray(i);
                    PipesImpl.this.setPipeArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PipeDocument.Pipe o)
                    { PipesImpl.this.insertNewPipe(i).set(o); }
                
                public org.landxml.schema.landXML11.PipeDocument.Pipe remove(int i)
                {
                    org.landxml.schema.landXML11.PipeDocument.Pipe old = PipesImpl.this.getPipeArray(i);
                    PipesImpl.this.removePipe(i);
                    return old;
                }
                
                public int size()
                    { return PipesImpl.this.sizeOfPipeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PipeList();
            }
        }
        
        /**
         * Gets array of all "Pipe" elements
         */
        public org.landxml.schema.landXML11.PipeDocument.Pipe[] getPipeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PIPE$2, targetList);
                org.landxml.schema.landXML11.PipeDocument.Pipe[] result = new org.landxml.schema.landXML11.PipeDocument.Pipe[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Pipe" element
         */
        public org.landxml.schema.landXML11.PipeDocument.Pipe getPipeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PipeDocument.Pipe target = null;
                target = (org.landxml.schema.landXML11.PipeDocument.Pipe)get_store().find_element_user(PIPE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Pipe" element
         */
        public int sizeOfPipeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PIPE$2);
            }
        }
        
        /**
         * Sets array of all "Pipe" element
         */
        public void setPipeArray(org.landxml.schema.landXML11.PipeDocument.Pipe[] pipeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pipeArray, PIPE$2);
            }
        }
        
        /**
         * Sets ith "Pipe" element
         */
        public void setPipeArray(int i, org.landxml.schema.landXML11.PipeDocument.Pipe pipe)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PipeDocument.Pipe target = null;
                target = (org.landxml.schema.landXML11.PipeDocument.Pipe)get_store().find_element_user(PIPE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(pipe);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Pipe" element
         */
        public org.landxml.schema.landXML11.PipeDocument.Pipe insertNewPipe(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PipeDocument.Pipe target = null;
                target = (org.landxml.schema.landXML11.PipeDocument.Pipe)get_store().insert_element_user(PIPE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Pipe" element
         */
        public org.landxml.schema.landXML11.PipeDocument.Pipe addNewPipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PipeDocument.Pipe target = null;
                target = (org.landxml.schema.landXML11.PipeDocument.Pipe)get_store().add_element_user(PIPE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Pipe" element
         */
        public void removePipe(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PIPE$2, i);
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
                    { return PipesImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = PipesImpl.this.getFeatureArray(i);
                    PipesImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { PipesImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = PipesImpl.this.getFeatureArray(i);
                    PipesImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return PipesImpl.this.sizeOfFeatureArray(); }
                
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
