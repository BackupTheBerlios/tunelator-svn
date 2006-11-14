/*
 * An XML document type.
 * Localname: ProfAlign
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ProfAlignDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one ProfAlign(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ProfAlignDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ProfAlignDocument
{
    
    public ProfAlignDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROFALIGN$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ProfAlign");
    
    
    /**
     * Gets the "ProfAlign" element
     */
    public org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign getProfAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign target = null;
            target = (org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign)get_store().find_element_user(PROFALIGN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProfAlign" element
     */
    public void setProfAlign(org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign profAlign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign target = null;
            target = (org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign)get_store().find_element_user(PROFALIGN$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign)get_store().add_element_user(PROFALIGN$0);
            }
            target.set(profAlign);
        }
    }
    
    /**
     * Appends and returns a new empty "ProfAlign" element
     */
    public org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign addNewProfAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign target = null;
            target = (org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign)get_store().add_element_user(PROFALIGN$0);
            return target;
        }
    }
    /**
     * An XML ProfAlign(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class ProfAlignImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ProfAlignDocument.ProfAlign
    {
        
        public ProfAlignImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PVI$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PVI");
        private static final javax.xml.namespace.QName PARACURVE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ParaCurve");
        private static final javax.xml.namespace.QName UNSYMPARACURVE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "UnsymParaCurve");
        private static final javax.xml.namespace.QName CIRCCURVE$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CircCurve");
        private static final javax.xml.namespace.QName FEATURE$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName NAME$10 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESC$12 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName STATE$14 = 
            new javax.xml.namespace.QName("", "state");
        
        
        /**
         * Gets a List of "PVI" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PVIDocument.PVI> getPVIList()
        {
            final class PVIList extends java.util.AbstractList<org.landxml.schema.landXML11.PVIDocument.PVI>
            {
                public org.landxml.schema.landXML11.PVIDocument.PVI get(int i)
                    { return ProfAlignImpl.this.getPVIArray(i); }
                
                public org.landxml.schema.landXML11.PVIDocument.PVI set(int i, org.landxml.schema.landXML11.PVIDocument.PVI o)
                {
                    org.landxml.schema.landXML11.PVIDocument.PVI old = ProfAlignImpl.this.getPVIArray(i);
                    ProfAlignImpl.this.setPVIArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PVIDocument.PVI o)
                    { ProfAlignImpl.this.insertNewPVI(i).set(o); }
                
                public org.landxml.schema.landXML11.PVIDocument.PVI remove(int i)
                {
                    org.landxml.schema.landXML11.PVIDocument.PVI old = ProfAlignImpl.this.getPVIArray(i);
                    ProfAlignImpl.this.removePVI(i);
                    return old;
                }
                
                public int size()
                    { return ProfAlignImpl.this.sizeOfPVIArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PVIList();
            }
        }
        
        /**
         * Gets array of all "PVI" elements
         */
        public org.landxml.schema.landXML11.PVIDocument.PVI[] getPVIArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PVI$0, targetList);
                org.landxml.schema.landXML11.PVIDocument.PVI[] result = new org.landxml.schema.landXML11.PVIDocument.PVI[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PVI" element
         */
        public org.landxml.schema.landXML11.PVIDocument.PVI getPVIArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PVIDocument.PVI target = null;
                target = (org.landxml.schema.landXML11.PVIDocument.PVI)get_store().find_element_user(PVI$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PVI" element
         */
        public int sizeOfPVIArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PVI$0);
            }
        }
        
        /**
         * Sets array of all "PVI" element
         */
        public void setPVIArray(org.landxml.schema.landXML11.PVIDocument.PVI[] pviArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pviArray, PVI$0);
            }
        }
        
        /**
         * Sets ith "PVI" element
         */
        public void setPVIArray(int i, org.landxml.schema.landXML11.PVIDocument.PVI pvi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PVIDocument.PVI target = null;
                target = (org.landxml.schema.landXML11.PVIDocument.PVI)get_store().find_element_user(PVI$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(pvi);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PVI" element
         */
        public org.landxml.schema.landXML11.PVIDocument.PVI insertNewPVI(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PVIDocument.PVI target = null;
                target = (org.landxml.schema.landXML11.PVIDocument.PVI)get_store().insert_element_user(PVI$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PVI" element
         */
        public org.landxml.schema.landXML11.PVIDocument.PVI addNewPVI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PVIDocument.PVI target = null;
                target = (org.landxml.schema.landXML11.PVIDocument.PVI)get_store().add_element_user(PVI$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "PVI" element
         */
        public void removePVI(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PVI$0, i);
            }
        }
        
        /**
         * Gets a List of "ParaCurve" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve> getParaCurveList()
        {
            final class ParaCurveList extends java.util.AbstractList<org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve>
            {
                public org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve get(int i)
                    { return ProfAlignImpl.this.getParaCurveArray(i); }
                
                public org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve set(int i, org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve o)
                {
                    org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve old = ProfAlignImpl.this.getParaCurveArray(i);
                    ProfAlignImpl.this.setParaCurveArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve o)
                    { ProfAlignImpl.this.insertNewParaCurve(i).set(o); }
                
                public org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve remove(int i)
                {
                    org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve old = ProfAlignImpl.this.getParaCurveArray(i);
                    ProfAlignImpl.this.removeParaCurve(i);
                    return old;
                }
                
                public int size()
                    { return ProfAlignImpl.this.sizeOfParaCurveArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ParaCurveList();
            }
        }
        
        /**
         * Gets array of all "ParaCurve" elements
         */
        public org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve[] getParaCurveArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PARACURVE$2, targetList);
                org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve[] result = new org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ParaCurve" element
         */
        public org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve getParaCurveArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve target = null;
                target = (org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve)get_store().find_element_user(PARACURVE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ParaCurve" element
         */
        public int sizeOfParaCurveArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARACURVE$2);
            }
        }
        
        /**
         * Sets array of all "ParaCurve" element
         */
        public void setParaCurveArray(org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve[] paraCurveArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(paraCurveArray, PARACURVE$2);
            }
        }
        
        /**
         * Sets ith "ParaCurve" element
         */
        public void setParaCurveArray(int i, org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve paraCurve)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve target = null;
                target = (org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve)get_store().find_element_user(PARACURVE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(paraCurve);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ParaCurve" element
         */
        public org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve insertNewParaCurve(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve target = null;
                target = (org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve)get_store().insert_element_user(PARACURVE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ParaCurve" element
         */
        public org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve addNewParaCurve()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve target = null;
                target = (org.landxml.schema.landXML11.ParaCurveDocument.ParaCurve)get_store().add_element_user(PARACURVE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "ParaCurve" element
         */
        public void removeParaCurve(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARACURVE$2, i);
            }
        }
        
        /**
         * Gets a List of "UnsymParaCurve" elements
         */
        public java.util.List<org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve> getUnsymParaCurveList()
        {
            final class UnsymParaCurveList extends java.util.AbstractList<org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve>
            {
                public org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve get(int i)
                    { return ProfAlignImpl.this.getUnsymParaCurveArray(i); }
                
                public org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve set(int i, org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve o)
                {
                    org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve old = ProfAlignImpl.this.getUnsymParaCurveArray(i);
                    ProfAlignImpl.this.setUnsymParaCurveArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve o)
                    { ProfAlignImpl.this.insertNewUnsymParaCurve(i).set(o); }
                
                public org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve remove(int i)
                {
                    org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve old = ProfAlignImpl.this.getUnsymParaCurveArray(i);
                    ProfAlignImpl.this.removeUnsymParaCurve(i);
                    return old;
                }
                
                public int size()
                    { return ProfAlignImpl.this.sizeOfUnsymParaCurveArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new UnsymParaCurveList();
            }
        }
        
        /**
         * Gets array of all "UnsymParaCurve" elements
         */
        public org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve[] getUnsymParaCurveArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(UNSYMPARACURVE$4, targetList);
                org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve[] result = new org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "UnsymParaCurve" element
         */
        public org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve getUnsymParaCurveArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve target = null;
                target = (org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve)get_store().find_element_user(UNSYMPARACURVE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "UnsymParaCurve" element
         */
        public int sizeOfUnsymParaCurveArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UNSYMPARACURVE$4);
            }
        }
        
        /**
         * Sets array of all "UnsymParaCurve" element
         */
        public void setUnsymParaCurveArray(org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve[] unsymParaCurveArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(unsymParaCurveArray, UNSYMPARACURVE$4);
            }
        }
        
        /**
         * Sets ith "UnsymParaCurve" element
         */
        public void setUnsymParaCurveArray(int i, org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve unsymParaCurve)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve target = null;
                target = (org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve)get_store().find_element_user(UNSYMPARACURVE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(unsymParaCurve);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "UnsymParaCurve" element
         */
        public org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve insertNewUnsymParaCurve(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve target = null;
                target = (org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve)get_store().insert_element_user(UNSYMPARACURVE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "UnsymParaCurve" element
         */
        public org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve addNewUnsymParaCurve()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve target = null;
                target = (org.landxml.schema.landXML11.UnsymParaCurveDocument.UnsymParaCurve)get_store().add_element_user(UNSYMPARACURVE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "UnsymParaCurve" element
         */
        public void removeUnsymParaCurve(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UNSYMPARACURVE$4, i);
            }
        }
        
        /**
         * Gets a List of "CircCurve" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CircCurveDocument.CircCurve> getCircCurveList()
        {
            final class CircCurveList extends java.util.AbstractList<org.landxml.schema.landXML11.CircCurveDocument.CircCurve>
            {
                public org.landxml.schema.landXML11.CircCurveDocument.CircCurve get(int i)
                    { return ProfAlignImpl.this.getCircCurveArray(i); }
                
                public org.landxml.schema.landXML11.CircCurveDocument.CircCurve set(int i, org.landxml.schema.landXML11.CircCurveDocument.CircCurve o)
                {
                    org.landxml.schema.landXML11.CircCurveDocument.CircCurve old = ProfAlignImpl.this.getCircCurveArray(i);
                    ProfAlignImpl.this.setCircCurveArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CircCurveDocument.CircCurve o)
                    { ProfAlignImpl.this.insertNewCircCurve(i).set(o); }
                
                public org.landxml.schema.landXML11.CircCurveDocument.CircCurve remove(int i)
                {
                    org.landxml.schema.landXML11.CircCurveDocument.CircCurve old = ProfAlignImpl.this.getCircCurveArray(i);
                    ProfAlignImpl.this.removeCircCurve(i);
                    return old;
                }
                
                public int size()
                    { return ProfAlignImpl.this.sizeOfCircCurveArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CircCurveList();
            }
        }
        
        /**
         * Gets array of all "CircCurve" elements
         */
        public org.landxml.schema.landXML11.CircCurveDocument.CircCurve[] getCircCurveArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CIRCCURVE$6, targetList);
                org.landxml.schema.landXML11.CircCurveDocument.CircCurve[] result = new org.landxml.schema.landXML11.CircCurveDocument.CircCurve[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CircCurve" element
         */
        public org.landxml.schema.landXML11.CircCurveDocument.CircCurve getCircCurveArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CircCurveDocument.CircCurve target = null;
                target = (org.landxml.schema.landXML11.CircCurveDocument.CircCurve)get_store().find_element_user(CIRCCURVE$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CircCurve" element
         */
        public int sizeOfCircCurveArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CIRCCURVE$6);
            }
        }
        
        /**
         * Sets array of all "CircCurve" element
         */
        public void setCircCurveArray(org.landxml.schema.landXML11.CircCurveDocument.CircCurve[] circCurveArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(circCurveArray, CIRCCURVE$6);
            }
        }
        
        /**
         * Sets ith "CircCurve" element
         */
        public void setCircCurveArray(int i, org.landxml.schema.landXML11.CircCurveDocument.CircCurve circCurve)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CircCurveDocument.CircCurve target = null;
                target = (org.landxml.schema.landXML11.CircCurveDocument.CircCurve)get_store().find_element_user(CIRCCURVE$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(circCurve);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CircCurve" element
         */
        public org.landxml.schema.landXML11.CircCurveDocument.CircCurve insertNewCircCurve(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CircCurveDocument.CircCurve target = null;
                target = (org.landxml.schema.landXML11.CircCurveDocument.CircCurve)get_store().insert_element_user(CIRCCURVE$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CircCurve" element
         */
        public org.landxml.schema.landXML11.CircCurveDocument.CircCurve addNewCircCurve()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CircCurveDocument.CircCurve target = null;
                target = (org.landxml.schema.landXML11.CircCurveDocument.CircCurve)get_store().add_element_user(CIRCCURVE$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "CircCurve" element
         */
        public void removeCircCurve(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CIRCCURVE$6, i);
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
                    { return ProfAlignImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ProfAlignImpl.this.getFeatureArray(i);
                    ProfAlignImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { ProfAlignImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ProfAlignImpl.this.getFeatureArray(i);
                    ProfAlignImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return ProfAlignImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$8, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$8, i);
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
                return get_store().count_elements(FEATURE$8);
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
                arraySetterHelper(featureArray, FEATURE$8);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$8, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$8, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$8);
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
                get_store().remove_element(FEATURE$8, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$12);
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
                return get_store().find_attribute_user(DESC$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$12);
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
                get_store().remove_attribute(DESC$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$14);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$14);
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
                return get_store().find_attribute_user(STATE$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$14);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$14);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$14);
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
                get_store().remove_attribute(STATE$14);
            }
        }
    }
}
