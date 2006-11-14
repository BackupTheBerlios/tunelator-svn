/*
 * An XML document type.
 * Localname: Superelevation
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.SuperelevationDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Superelevation(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class SuperelevationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SuperelevationDocument
{
    
    public SuperelevationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPERELEVATION$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Superelevation");
    
    
    /**
     * Gets the "Superelevation" element
     */
    public org.landxml.schema.landXML11.SuperelevationDocument.Superelevation getSuperelevation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SuperelevationDocument.Superelevation target = null;
            target = (org.landxml.schema.landXML11.SuperelevationDocument.Superelevation)get_store().find_element_user(SUPERELEVATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Superelevation" element
     */
    public void setSuperelevation(org.landxml.schema.landXML11.SuperelevationDocument.Superelevation superelevation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SuperelevationDocument.Superelevation target = null;
            target = (org.landxml.schema.landXML11.SuperelevationDocument.Superelevation)get_store().find_element_user(SUPERELEVATION$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.SuperelevationDocument.Superelevation)get_store().add_element_user(SUPERELEVATION$0);
            }
            target.set(superelevation);
        }
    }
    
    /**
     * Appends and returns a new empty "Superelevation" element
     */
    public org.landxml.schema.landXML11.SuperelevationDocument.Superelevation addNewSuperelevation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SuperelevationDocument.Superelevation target = null;
            target = (org.landxml.schema.landXML11.SuperelevationDocument.Superelevation)get_store().add_element_user(SUPERELEVATION$0);
            return target;
        }
    }
    /**
     * An XML Superelevation(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class SuperelevationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SuperelevationDocument.Superelevation
    {
        
        public SuperelevationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BEGINRUNOUTSTA$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "BeginRunoutSta");
        private static final javax.xml.namespace.QName BEGINRUNOFFSTA$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "BeginRunoffSta");
        private static final javax.xml.namespace.QName FULLSUPERSTA$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FullSuperSta");
        private static final javax.xml.namespace.QName FULLSUPERELEV$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FullSuperelev");
        private static final javax.xml.namespace.QName RUNOFFSTA$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "RunoffSta");
        private static final javax.xml.namespace.QName STARTOFRUNOUTSTA$10 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "StartofRunoutSta");
        private static final javax.xml.namespace.QName ENDOFRUNOUTSTA$12 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "EndofRunoutSta");
        private static final javax.xml.namespace.QName ADVERSESE$14 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "AdverseSE");
        private static final javax.xml.namespace.QName FEATURE$16 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName STASTART$18 = 
            new javax.xml.namespace.QName("", "staStart");
        private static final javax.xml.namespace.QName STAEND$20 = 
            new javax.xml.namespace.QName("", "staEnd");
        
        
        /**
         * Gets a List of "BeginRunoutSta" elements
         */
        public java.util.List<java.lang.Double> getBeginRunoutStaList()
        {
            final class BeginRunoutStaList extends java.util.AbstractList<java.lang.Double>
            {
                public java.lang.Double get(int i)
                    { return SuperelevationImpl.this.getBeginRunoutStaArray(i); }
                
                public java.lang.Double set(int i, java.lang.Double o)
                {
                    java.lang.Double old = SuperelevationImpl.this.getBeginRunoutStaArray(i);
                    SuperelevationImpl.this.setBeginRunoutStaArray(i, o);
                    return old;
                }
                
                public void add(int i, java.lang.Double o)
                    { SuperelevationImpl.this.insertBeginRunoutSta(i, o); }
                
                public java.lang.Double remove(int i)
                {
                    java.lang.Double old = SuperelevationImpl.this.getBeginRunoutStaArray(i);
                    SuperelevationImpl.this.removeBeginRunoutSta(i);
                    return old;
                }
                
                public int size()
                    { return SuperelevationImpl.this.sizeOfBeginRunoutStaArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new BeginRunoutStaList();
            }
        }
        
        /**
         * Gets array of all "BeginRunoutSta" elements
         */
        public double[] getBeginRunoutStaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BEGINRUNOUTSTA$0, targetList);
                double[] result = new double[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
                return result;
            }
        }
        
        /**
         * Gets ith "BeginRunoutSta" element
         */
        public double getBeginRunoutStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINRUNOUTSTA$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "BeginRunoutSta" elements
         */
        public java.util.List<org.landxml.schema.landXML11.Station> xgetBeginRunoutStaList()
        {
            final class BeginRunoutStaList extends java.util.AbstractList<org.landxml.schema.landXML11.Station>
            {
                public org.landxml.schema.landXML11.Station get(int i)
                    { return SuperelevationImpl.this.xgetBeginRunoutStaArray(i); }
                
                public org.landxml.schema.landXML11.Station set(int i, org.landxml.schema.landXML11.Station o)
                {
                    org.landxml.schema.landXML11.Station old = SuperelevationImpl.this.xgetBeginRunoutStaArray(i);
                    SuperelevationImpl.this.xsetBeginRunoutStaArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.Station o)
                    { SuperelevationImpl.this.insertNewBeginRunoutSta(i).set(o); }
                
                public org.landxml.schema.landXML11.Station remove(int i)
                {
                    org.landxml.schema.landXML11.Station old = SuperelevationImpl.this.xgetBeginRunoutStaArray(i);
                    SuperelevationImpl.this.removeBeginRunoutSta(i);
                    return old;
                }
                
                public int size()
                    { return SuperelevationImpl.this.sizeOfBeginRunoutStaArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new BeginRunoutStaList();
            }
        }
        
        /**
         * Gets (as xml) array of all "BeginRunoutSta" elements
         */
        public org.landxml.schema.landXML11.Station[] xgetBeginRunoutStaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BEGINRUNOUTSTA$0, targetList);
                org.landxml.schema.landXML11.Station[] result = new org.landxml.schema.landXML11.Station[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "BeginRunoutSta" element
         */
        public org.landxml.schema.landXML11.Station xgetBeginRunoutStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(BEGINRUNOUTSTA$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.landxml.schema.landXML11.Station)target;
            }
        }
        
        /**
         * Tests for nil ith "BeginRunoutSta" element
         */
        public boolean isNilBeginRunoutStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(BEGINRUNOUTSTA$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "BeginRunoutSta" element
         */
        public int sizeOfBeginRunoutStaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BEGINRUNOUTSTA$0);
            }
        }
        
        /**
         * Sets array of all "BeginRunoutSta" element
         */
        public void setBeginRunoutStaArray(double[] beginRunoutStaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(beginRunoutStaArray, BEGINRUNOUTSTA$0);
            }
        }
        
        /**
         * Sets ith "BeginRunoutSta" element
         */
        public void setBeginRunoutStaArray(int i, double beginRunoutSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINRUNOUTSTA$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setDoubleValue(beginRunoutSta);
            }
        }
        
        /**
         * Sets (as xml) array of all "BeginRunoutSta" element
         */
        public void xsetBeginRunoutStaArray(org.landxml.schema.landXML11.Station[]beginRunoutStaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(beginRunoutStaArray, BEGINRUNOUTSTA$0);
            }
        }
        
        /**
         * Sets (as xml) ith "BeginRunoutSta" element
         */
        public void xsetBeginRunoutStaArray(int i, org.landxml.schema.landXML11.Station beginRunoutSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(BEGINRUNOUTSTA$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(beginRunoutSta);
            }
        }
        
        /**
         * Nils the ith "BeginRunoutSta" element
         */
        public void setNilBeginRunoutStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(BEGINRUNOUTSTA$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts the value as the ith "BeginRunoutSta" element
         */
        public void insertBeginRunoutSta(int i, double beginRunoutSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BEGINRUNOUTSTA$0, i);
                target.setDoubleValue(beginRunoutSta);
            }
        }
        
        /**
         * Appends the value as the last "BeginRunoutSta" element
         */
        public void addBeginRunoutSta(double beginRunoutSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEGINRUNOUTSTA$0);
                target.setDoubleValue(beginRunoutSta);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BeginRunoutSta" element
         */
        public org.landxml.schema.landXML11.Station insertNewBeginRunoutSta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().insert_element_user(BEGINRUNOUTSTA$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BeginRunoutSta" element
         */
        public org.landxml.schema.landXML11.Station addNewBeginRunoutSta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().add_element_user(BEGINRUNOUTSTA$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "BeginRunoutSta" element
         */
        public void removeBeginRunoutSta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BEGINRUNOUTSTA$0, i);
            }
        }
        
        /**
         * Gets a List of "BeginRunoffSta" elements
         */
        public java.util.List<java.lang.Double> getBeginRunoffStaList()
        {
            final class BeginRunoffStaList extends java.util.AbstractList<java.lang.Double>
            {
                public java.lang.Double get(int i)
                    { return SuperelevationImpl.this.getBeginRunoffStaArray(i); }
                
                public java.lang.Double set(int i, java.lang.Double o)
                {
                    java.lang.Double old = SuperelevationImpl.this.getBeginRunoffStaArray(i);
                    SuperelevationImpl.this.setBeginRunoffStaArray(i, o);
                    return old;
                }
                
                public void add(int i, java.lang.Double o)
                    { SuperelevationImpl.this.insertBeginRunoffSta(i, o); }
                
                public java.lang.Double remove(int i)
                {
                    java.lang.Double old = SuperelevationImpl.this.getBeginRunoffStaArray(i);
                    SuperelevationImpl.this.removeBeginRunoffSta(i);
                    return old;
                }
                
                public int size()
                    { return SuperelevationImpl.this.sizeOfBeginRunoffStaArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new BeginRunoffStaList();
            }
        }
        
        /**
         * Gets array of all "BeginRunoffSta" elements
         */
        public double[] getBeginRunoffStaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BEGINRUNOFFSTA$2, targetList);
                double[] result = new double[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
                return result;
            }
        }
        
        /**
         * Gets ith "BeginRunoffSta" element
         */
        public double getBeginRunoffStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINRUNOFFSTA$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "BeginRunoffSta" elements
         */
        public java.util.List<org.landxml.schema.landXML11.Station> xgetBeginRunoffStaList()
        {
            final class BeginRunoffStaList extends java.util.AbstractList<org.landxml.schema.landXML11.Station>
            {
                public org.landxml.schema.landXML11.Station get(int i)
                    { return SuperelevationImpl.this.xgetBeginRunoffStaArray(i); }
                
                public org.landxml.schema.landXML11.Station set(int i, org.landxml.schema.landXML11.Station o)
                {
                    org.landxml.schema.landXML11.Station old = SuperelevationImpl.this.xgetBeginRunoffStaArray(i);
                    SuperelevationImpl.this.xsetBeginRunoffStaArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.Station o)
                    { SuperelevationImpl.this.insertNewBeginRunoffSta(i).set(o); }
                
                public org.landxml.schema.landXML11.Station remove(int i)
                {
                    org.landxml.schema.landXML11.Station old = SuperelevationImpl.this.xgetBeginRunoffStaArray(i);
                    SuperelevationImpl.this.removeBeginRunoffSta(i);
                    return old;
                }
                
                public int size()
                    { return SuperelevationImpl.this.sizeOfBeginRunoffStaArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new BeginRunoffStaList();
            }
        }
        
        /**
         * Gets (as xml) array of all "BeginRunoffSta" elements
         */
        public org.landxml.schema.landXML11.Station[] xgetBeginRunoffStaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BEGINRUNOFFSTA$2, targetList);
                org.landxml.schema.landXML11.Station[] result = new org.landxml.schema.landXML11.Station[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "BeginRunoffSta" element
         */
        public org.landxml.schema.landXML11.Station xgetBeginRunoffStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(BEGINRUNOFFSTA$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.landxml.schema.landXML11.Station)target;
            }
        }
        
        /**
         * Tests for nil ith "BeginRunoffSta" element
         */
        public boolean isNilBeginRunoffStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(BEGINRUNOFFSTA$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "BeginRunoffSta" element
         */
        public int sizeOfBeginRunoffStaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BEGINRUNOFFSTA$2);
            }
        }
        
        /**
         * Sets array of all "BeginRunoffSta" element
         */
        public void setBeginRunoffStaArray(double[] beginRunoffStaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(beginRunoffStaArray, BEGINRUNOFFSTA$2);
            }
        }
        
        /**
         * Sets ith "BeginRunoffSta" element
         */
        public void setBeginRunoffStaArray(int i, double beginRunoffSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINRUNOFFSTA$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setDoubleValue(beginRunoffSta);
            }
        }
        
        /**
         * Sets (as xml) array of all "BeginRunoffSta" element
         */
        public void xsetBeginRunoffStaArray(org.landxml.schema.landXML11.Station[]beginRunoffStaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(beginRunoffStaArray, BEGINRUNOFFSTA$2);
            }
        }
        
        /**
         * Sets (as xml) ith "BeginRunoffSta" element
         */
        public void xsetBeginRunoffStaArray(int i, org.landxml.schema.landXML11.Station beginRunoffSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(BEGINRUNOFFSTA$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(beginRunoffSta);
            }
        }
        
        /**
         * Nils the ith "BeginRunoffSta" element
         */
        public void setNilBeginRunoffStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(BEGINRUNOFFSTA$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts the value as the ith "BeginRunoffSta" element
         */
        public void insertBeginRunoffSta(int i, double beginRunoffSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BEGINRUNOFFSTA$2, i);
                target.setDoubleValue(beginRunoffSta);
            }
        }
        
        /**
         * Appends the value as the last "BeginRunoffSta" element
         */
        public void addBeginRunoffSta(double beginRunoffSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEGINRUNOFFSTA$2);
                target.setDoubleValue(beginRunoffSta);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BeginRunoffSta" element
         */
        public org.landxml.schema.landXML11.Station insertNewBeginRunoffSta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().insert_element_user(BEGINRUNOFFSTA$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BeginRunoffSta" element
         */
        public org.landxml.schema.landXML11.Station addNewBeginRunoffSta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().add_element_user(BEGINRUNOFFSTA$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "BeginRunoffSta" element
         */
        public void removeBeginRunoffSta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BEGINRUNOFFSTA$2, i);
            }
        }
        
        /**
         * Gets a List of "FullSuperSta" elements
         */
        public java.util.List<java.lang.Double> getFullSuperStaList()
        {
            final class FullSuperStaList extends java.util.AbstractList<java.lang.Double>
            {
                public java.lang.Double get(int i)
                    { return SuperelevationImpl.this.getFullSuperStaArray(i); }
                
                public java.lang.Double set(int i, java.lang.Double o)
                {
                    java.lang.Double old = SuperelevationImpl.this.getFullSuperStaArray(i);
                    SuperelevationImpl.this.setFullSuperStaArray(i, o);
                    return old;
                }
                
                public void add(int i, java.lang.Double o)
                    { SuperelevationImpl.this.insertFullSuperSta(i, o); }
                
                public java.lang.Double remove(int i)
                {
                    java.lang.Double old = SuperelevationImpl.this.getFullSuperStaArray(i);
                    SuperelevationImpl.this.removeFullSuperSta(i);
                    return old;
                }
                
                public int size()
                    { return SuperelevationImpl.this.sizeOfFullSuperStaArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FullSuperStaList();
            }
        }
        
        /**
         * Gets array of all "FullSuperSta" elements
         */
        public double[] getFullSuperStaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FULLSUPERSTA$4, targetList);
                double[] result = new double[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
                return result;
            }
        }
        
        /**
         * Gets ith "FullSuperSta" element
         */
        public double getFullSuperStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULLSUPERSTA$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "FullSuperSta" elements
         */
        public java.util.List<org.landxml.schema.landXML11.Station> xgetFullSuperStaList()
        {
            final class FullSuperStaList extends java.util.AbstractList<org.landxml.schema.landXML11.Station>
            {
                public org.landxml.schema.landXML11.Station get(int i)
                    { return SuperelevationImpl.this.xgetFullSuperStaArray(i); }
                
                public org.landxml.schema.landXML11.Station set(int i, org.landxml.schema.landXML11.Station o)
                {
                    org.landxml.schema.landXML11.Station old = SuperelevationImpl.this.xgetFullSuperStaArray(i);
                    SuperelevationImpl.this.xsetFullSuperStaArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.Station o)
                    { SuperelevationImpl.this.insertNewFullSuperSta(i).set(o); }
                
                public org.landxml.schema.landXML11.Station remove(int i)
                {
                    org.landxml.schema.landXML11.Station old = SuperelevationImpl.this.xgetFullSuperStaArray(i);
                    SuperelevationImpl.this.removeFullSuperSta(i);
                    return old;
                }
                
                public int size()
                    { return SuperelevationImpl.this.sizeOfFullSuperStaArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FullSuperStaList();
            }
        }
        
        /**
         * Gets (as xml) array of all "FullSuperSta" elements
         */
        public org.landxml.schema.landXML11.Station[] xgetFullSuperStaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FULLSUPERSTA$4, targetList);
                org.landxml.schema.landXML11.Station[] result = new org.landxml.schema.landXML11.Station[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "FullSuperSta" element
         */
        public org.landxml.schema.landXML11.Station xgetFullSuperStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(FULLSUPERSTA$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.landxml.schema.landXML11.Station)target;
            }
        }
        
        /**
         * Returns number of "FullSuperSta" element
         */
        public int sizeOfFullSuperStaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FULLSUPERSTA$4);
            }
        }
        
        /**
         * Sets array of all "FullSuperSta" element
         */
        public void setFullSuperStaArray(double[] fullSuperStaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(fullSuperStaArray, FULLSUPERSTA$4);
            }
        }
        
        /**
         * Sets ith "FullSuperSta" element
         */
        public void setFullSuperStaArray(int i, double fullSuperSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULLSUPERSTA$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setDoubleValue(fullSuperSta);
            }
        }
        
        /**
         * Sets (as xml) array of all "FullSuperSta" element
         */
        public void xsetFullSuperStaArray(org.landxml.schema.landXML11.Station[]fullSuperStaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(fullSuperStaArray, FULLSUPERSTA$4);
            }
        }
        
        /**
         * Sets (as xml) ith "FullSuperSta" element
         */
        public void xsetFullSuperStaArray(int i, org.landxml.schema.landXML11.Station fullSuperSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(FULLSUPERSTA$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(fullSuperSta);
            }
        }
        
        /**
         * Inserts the value as the ith "FullSuperSta" element
         */
        public void insertFullSuperSta(int i, double fullSuperSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FULLSUPERSTA$4, i);
                target.setDoubleValue(fullSuperSta);
            }
        }
        
        /**
         * Appends the value as the last "FullSuperSta" element
         */
        public void addFullSuperSta(double fullSuperSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FULLSUPERSTA$4);
                target.setDoubleValue(fullSuperSta);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "FullSuperSta" element
         */
        public org.landxml.schema.landXML11.Station insertNewFullSuperSta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().insert_element_user(FULLSUPERSTA$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "FullSuperSta" element
         */
        public org.landxml.schema.landXML11.Station addNewFullSuperSta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().add_element_user(FULLSUPERSTA$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "FullSuperSta" element
         */
        public void removeFullSuperSta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FULLSUPERSTA$4, i);
            }
        }
        
        /**
         * Gets a List of "FullSuperelev" elements
         */
        public java.util.List<java.lang.Double> getFullSuperelevList()
        {
            final class FullSuperelevList extends java.util.AbstractList<java.lang.Double>
            {
                public java.lang.Double get(int i)
                    { return SuperelevationImpl.this.getFullSuperelevArray(i); }
                
                public java.lang.Double set(int i, java.lang.Double o)
                {
                    java.lang.Double old = SuperelevationImpl.this.getFullSuperelevArray(i);
                    SuperelevationImpl.this.setFullSuperelevArray(i, o);
                    return old;
                }
                
                public void add(int i, java.lang.Double o)
                    { SuperelevationImpl.this.insertFullSuperelev(i, o); }
                
                public java.lang.Double remove(int i)
                {
                    java.lang.Double old = SuperelevationImpl.this.getFullSuperelevArray(i);
                    SuperelevationImpl.this.removeFullSuperelev(i);
                    return old;
                }
                
                public int size()
                    { return SuperelevationImpl.this.sizeOfFullSuperelevArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FullSuperelevList();
            }
        }
        
        /**
         * Gets array of all "FullSuperelev" elements
         */
        public double[] getFullSuperelevArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FULLSUPERELEV$6, targetList);
                double[] result = new double[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
                return result;
            }
        }
        
        /**
         * Gets ith "FullSuperelev" element
         */
        public double getFullSuperelevArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULLSUPERELEV$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "FullSuperelev" elements
         */
        public java.util.List<org.landxml.schema.landXML11.Slope> xgetFullSuperelevList()
        {
            final class FullSuperelevList extends java.util.AbstractList<org.landxml.schema.landXML11.Slope>
            {
                public org.landxml.schema.landXML11.Slope get(int i)
                    { return SuperelevationImpl.this.xgetFullSuperelevArray(i); }
                
                public org.landxml.schema.landXML11.Slope set(int i, org.landxml.schema.landXML11.Slope o)
                {
                    org.landxml.schema.landXML11.Slope old = SuperelevationImpl.this.xgetFullSuperelevArray(i);
                    SuperelevationImpl.this.xsetFullSuperelevArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.Slope o)
                    { SuperelevationImpl.this.insertNewFullSuperelev(i).set(o); }
                
                public org.landxml.schema.landXML11.Slope remove(int i)
                {
                    org.landxml.schema.landXML11.Slope old = SuperelevationImpl.this.xgetFullSuperelevArray(i);
                    SuperelevationImpl.this.removeFullSuperelev(i);
                    return old;
                }
                
                public int size()
                    { return SuperelevationImpl.this.sizeOfFullSuperelevArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FullSuperelevList();
            }
        }
        
        /**
         * Gets (as xml) array of all "FullSuperelev" elements
         */
        public org.landxml.schema.landXML11.Slope[] xgetFullSuperelevArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FULLSUPERELEV$6, targetList);
                org.landxml.schema.landXML11.Slope[] result = new org.landxml.schema.landXML11.Slope[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "FullSuperelev" element
         */
        public org.landxml.schema.landXML11.Slope xgetFullSuperelevArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Slope target = null;
                target = (org.landxml.schema.landXML11.Slope)get_store().find_element_user(FULLSUPERELEV$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.landxml.schema.landXML11.Slope)target;
            }
        }
        
        /**
         * Returns number of "FullSuperelev" element
         */
        public int sizeOfFullSuperelevArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FULLSUPERELEV$6);
            }
        }
        
        /**
         * Sets array of all "FullSuperelev" element
         */
        public void setFullSuperelevArray(double[] fullSuperelevArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(fullSuperelevArray, FULLSUPERELEV$6);
            }
        }
        
        /**
         * Sets ith "FullSuperelev" element
         */
        public void setFullSuperelevArray(int i, double fullSuperelev)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULLSUPERELEV$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setDoubleValue(fullSuperelev);
            }
        }
        
        /**
         * Sets (as xml) array of all "FullSuperelev" element
         */
        public void xsetFullSuperelevArray(org.landxml.schema.landXML11.Slope[]fullSuperelevArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(fullSuperelevArray, FULLSUPERELEV$6);
            }
        }
        
        /**
         * Sets (as xml) ith "FullSuperelev" element
         */
        public void xsetFullSuperelevArray(int i, org.landxml.schema.landXML11.Slope fullSuperelev)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Slope target = null;
                target = (org.landxml.schema.landXML11.Slope)get_store().find_element_user(FULLSUPERELEV$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(fullSuperelev);
            }
        }
        
        /**
         * Inserts the value as the ith "FullSuperelev" element
         */
        public void insertFullSuperelev(int i, double fullSuperelev)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FULLSUPERELEV$6, i);
                target.setDoubleValue(fullSuperelev);
            }
        }
        
        /**
         * Appends the value as the last "FullSuperelev" element
         */
        public void addFullSuperelev(double fullSuperelev)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FULLSUPERELEV$6);
                target.setDoubleValue(fullSuperelev);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "FullSuperelev" element
         */
        public org.landxml.schema.landXML11.Slope insertNewFullSuperelev(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Slope target = null;
                target = (org.landxml.schema.landXML11.Slope)get_store().insert_element_user(FULLSUPERELEV$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "FullSuperelev" element
         */
        public org.landxml.schema.landXML11.Slope addNewFullSuperelev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Slope target = null;
                target = (org.landxml.schema.landXML11.Slope)get_store().add_element_user(FULLSUPERELEV$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "FullSuperelev" element
         */
        public void removeFullSuperelev(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FULLSUPERELEV$6, i);
            }
        }
        
        /**
         * Gets a List of "RunoffSta" elements
         */
        public java.util.List<java.lang.Double> getRunoffStaList()
        {
            final class RunoffStaList extends java.util.AbstractList<java.lang.Double>
            {
                public java.lang.Double get(int i)
                    { return SuperelevationImpl.this.getRunoffStaArray(i); }
                
                public java.lang.Double set(int i, java.lang.Double o)
                {
                    java.lang.Double old = SuperelevationImpl.this.getRunoffStaArray(i);
                    SuperelevationImpl.this.setRunoffStaArray(i, o);
                    return old;
                }
                
                public void add(int i, java.lang.Double o)
                    { SuperelevationImpl.this.insertRunoffSta(i, o); }
                
                public java.lang.Double remove(int i)
                {
                    java.lang.Double old = SuperelevationImpl.this.getRunoffStaArray(i);
                    SuperelevationImpl.this.removeRunoffSta(i);
                    return old;
                }
                
                public int size()
                    { return SuperelevationImpl.this.sizeOfRunoffStaArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RunoffStaList();
            }
        }
        
        /**
         * Gets array of all "RunoffSta" elements
         */
        public double[] getRunoffStaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RUNOFFSTA$8, targetList);
                double[] result = new double[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
                return result;
            }
        }
        
        /**
         * Gets ith "RunoffSta" element
         */
        public double getRunoffStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNOFFSTA$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "RunoffSta" elements
         */
        public java.util.List<org.landxml.schema.landXML11.Station> xgetRunoffStaList()
        {
            final class RunoffStaList extends java.util.AbstractList<org.landxml.schema.landXML11.Station>
            {
                public org.landxml.schema.landXML11.Station get(int i)
                    { return SuperelevationImpl.this.xgetRunoffStaArray(i); }
                
                public org.landxml.schema.landXML11.Station set(int i, org.landxml.schema.landXML11.Station o)
                {
                    org.landxml.schema.landXML11.Station old = SuperelevationImpl.this.xgetRunoffStaArray(i);
                    SuperelevationImpl.this.xsetRunoffStaArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.Station o)
                    { SuperelevationImpl.this.insertNewRunoffSta(i).set(o); }
                
                public org.landxml.schema.landXML11.Station remove(int i)
                {
                    org.landxml.schema.landXML11.Station old = SuperelevationImpl.this.xgetRunoffStaArray(i);
                    SuperelevationImpl.this.removeRunoffSta(i);
                    return old;
                }
                
                public int size()
                    { return SuperelevationImpl.this.sizeOfRunoffStaArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RunoffStaList();
            }
        }
        
        /**
         * Gets (as xml) array of all "RunoffSta" elements
         */
        public org.landxml.schema.landXML11.Station[] xgetRunoffStaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RUNOFFSTA$8, targetList);
                org.landxml.schema.landXML11.Station[] result = new org.landxml.schema.landXML11.Station[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "RunoffSta" element
         */
        public org.landxml.schema.landXML11.Station xgetRunoffStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(RUNOFFSTA$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.landxml.schema.landXML11.Station)target;
            }
        }
        
        /**
         * Tests for nil ith "RunoffSta" element
         */
        public boolean isNilRunoffStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(RUNOFFSTA$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "RunoffSta" element
         */
        public int sizeOfRunoffStaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RUNOFFSTA$8);
            }
        }
        
        /**
         * Sets array of all "RunoffSta" element
         */
        public void setRunoffStaArray(double[] runoffStaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(runoffStaArray, RUNOFFSTA$8);
            }
        }
        
        /**
         * Sets ith "RunoffSta" element
         */
        public void setRunoffStaArray(int i, double runoffSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNOFFSTA$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setDoubleValue(runoffSta);
            }
        }
        
        /**
         * Sets (as xml) array of all "RunoffSta" element
         */
        public void xsetRunoffStaArray(org.landxml.schema.landXML11.Station[]runoffStaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(runoffStaArray, RUNOFFSTA$8);
            }
        }
        
        /**
         * Sets (as xml) ith "RunoffSta" element
         */
        public void xsetRunoffStaArray(int i, org.landxml.schema.landXML11.Station runoffSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(RUNOFFSTA$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(runoffSta);
            }
        }
        
        /**
         * Nils the ith "RunoffSta" element
         */
        public void setNilRunoffStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(RUNOFFSTA$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts the value as the ith "RunoffSta" element
         */
        public void insertRunoffSta(int i, double runoffSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(RUNOFFSTA$8, i);
                target.setDoubleValue(runoffSta);
            }
        }
        
        /**
         * Appends the value as the last "RunoffSta" element
         */
        public void addRunoffSta(double runoffSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUNOFFSTA$8);
                target.setDoubleValue(runoffSta);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RunoffSta" element
         */
        public org.landxml.schema.landXML11.Station insertNewRunoffSta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().insert_element_user(RUNOFFSTA$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RunoffSta" element
         */
        public org.landxml.schema.landXML11.Station addNewRunoffSta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().add_element_user(RUNOFFSTA$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "RunoffSta" element
         */
        public void removeRunoffSta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RUNOFFSTA$8, i);
            }
        }
        
        /**
         * Gets a List of "StartofRunoutSta" elements
         */
        public java.util.List<java.lang.Double> getStartofRunoutStaList()
        {
            final class StartofRunoutStaList extends java.util.AbstractList<java.lang.Double>
            {
                public java.lang.Double get(int i)
                    { return SuperelevationImpl.this.getStartofRunoutStaArray(i); }
                
                public java.lang.Double set(int i, java.lang.Double o)
                {
                    java.lang.Double old = SuperelevationImpl.this.getStartofRunoutStaArray(i);
                    SuperelevationImpl.this.setStartofRunoutStaArray(i, o);
                    return old;
                }
                
                public void add(int i, java.lang.Double o)
                    { SuperelevationImpl.this.insertStartofRunoutSta(i, o); }
                
                public java.lang.Double remove(int i)
                {
                    java.lang.Double old = SuperelevationImpl.this.getStartofRunoutStaArray(i);
                    SuperelevationImpl.this.removeStartofRunoutSta(i);
                    return old;
                }
                
                public int size()
                    { return SuperelevationImpl.this.sizeOfStartofRunoutStaArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new StartofRunoutStaList();
            }
        }
        
        /**
         * Gets array of all "StartofRunoutSta" elements
         */
        public double[] getStartofRunoutStaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STARTOFRUNOUTSTA$10, targetList);
                double[] result = new double[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
                return result;
            }
        }
        
        /**
         * Gets ith "StartofRunoutSta" element
         */
        public double getStartofRunoutStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTOFRUNOUTSTA$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "StartofRunoutSta" elements
         */
        public java.util.List<org.landxml.schema.landXML11.Station> xgetStartofRunoutStaList()
        {
            final class StartofRunoutStaList extends java.util.AbstractList<org.landxml.schema.landXML11.Station>
            {
                public org.landxml.schema.landXML11.Station get(int i)
                    { return SuperelevationImpl.this.xgetStartofRunoutStaArray(i); }
                
                public org.landxml.schema.landXML11.Station set(int i, org.landxml.schema.landXML11.Station o)
                {
                    org.landxml.schema.landXML11.Station old = SuperelevationImpl.this.xgetStartofRunoutStaArray(i);
                    SuperelevationImpl.this.xsetStartofRunoutStaArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.Station o)
                    { SuperelevationImpl.this.insertNewStartofRunoutSta(i).set(o); }
                
                public org.landxml.schema.landXML11.Station remove(int i)
                {
                    org.landxml.schema.landXML11.Station old = SuperelevationImpl.this.xgetStartofRunoutStaArray(i);
                    SuperelevationImpl.this.removeStartofRunoutSta(i);
                    return old;
                }
                
                public int size()
                    { return SuperelevationImpl.this.sizeOfStartofRunoutStaArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new StartofRunoutStaList();
            }
        }
        
        /**
         * Gets (as xml) array of all "StartofRunoutSta" elements
         */
        public org.landxml.schema.landXML11.Station[] xgetStartofRunoutStaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STARTOFRUNOUTSTA$10, targetList);
                org.landxml.schema.landXML11.Station[] result = new org.landxml.schema.landXML11.Station[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "StartofRunoutSta" element
         */
        public org.landxml.schema.landXML11.Station xgetStartofRunoutStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(STARTOFRUNOUTSTA$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.landxml.schema.landXML11.Station)target;
            }
        }
        
        /**
         * Tests for nil ith "StartofRunoutSta" element
         */
        public boolean isNilStartofRunoutStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(STARTOFRUNOUTSTA$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "StartofRunoutSta" element
         */
        public int sizeOfStartofRunoutStaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STARTOFRUNOUTSTA$10);
            }
        }
        
        /**
         * Sets array of all "StartofRunoutSta" element
         */
        public void setStartofRunoutStaArray(double[] startofRunoutStaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(startofRunoutStaArray, STARTOFRUNOUTSTA$10);
            }
        }
        
        /**
         * Sets ith "StartofRunoutSta" element
         */
        public void setStartofRunoutStaArray(int i, double startofRunoutSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTOFRUNOUTSTA$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setDoubleValue(startofRunoutSta);
            }
        }
        
        /**
         * Sets (as xml) array of all "StartofRunoutSta" element
         */
        public void xsetStartofRunoutStaArray(org.landxml.schema.landXML11.Station[]startofRunoutStaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(startofRunoutStaArray, STARTOFRUNOUTSTA$10);
            }
        }
        
        /**
         * Sets (as xml) ith "StartofRunoutSta" element
         */
        public void xsetStartofRunoutStaArray(int i, org.landxml.schema.landXML11.Station startofRunoutSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(STARTOFRUNOUTSTA$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(startofRunoutSta);
            }
        }
        
        /**
         * Nils the ith "StartofRunoutSta" element
         */
        public void setNilStartofRunoutStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(STARTOFRUNOUTSTA$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts the value as the ith "StartofRunoutSta" element
         */
        public void insertStartofRunoutSta(int i, double startofRunoutSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STARTOFRUNOUTSTA$10, i);
                target.setDoubleValue(startofRunoutSta);
            }
        }
        
        /**
         * Appends the value as the last "StartofRunoutSta" element
         */
        public void addStartofRunoutSta(double startofRunoutSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTOFRUNOUTSTA$10);
                target.setDoubleValue(startofRunoutSta);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "StartofRunoutSta" element
         */
        public org.landxml.schema.landXML11.Station insertNewStartofRunoutSta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().insert_element_user(STARTOFRUNOUTSTA$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "StartofRunoutSta" element
         */
        public org.landxml.schema.landXML11.Station addNewStartofRunoutSta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().add_element_user(STARTOFRUNOUTSTA$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "StartofRunoutSta" element
         */
        public void removeStartofRunoutSta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STARTOFRUNOUTSTA$10, i);
            }
        }
        
        /**
         * Gets a List of "EndofRunoutSta" elements
         */
        public java.util.List<java.lang.Double> getEndofRunoutStaList()
        {
            final class EndofRunoutStaList extends java.util.AbstractList<java.lang.Double>
            {
                public java.lang.Double get(int i)
                    { return SuperelevationImpl.this.getEndofRunoutStaArray(i); }
                
                public java.lang.Double set(int i, java.lang.Double o)
                {
                    java.lang.Double old = SuperelevationImpl.this.getEndofRunoutStaArray(i);
                    SuperelevationImpl.this.setEndofRunoutStaArray(i, o);
                    return old;
                }
                
                public void add(int i, java.lang.Double o)
                    { SuperelevationImpl.this.insertEndofRunoutSta(i, o); }
                
                public java.lang.Double remove(int i)
                {
                    java.lang.Double old = SuperelevationImpl.this.getEndofRunoutStaArray(i);
                    SuperelevationImpl.this.removeEndofRunoutSta(i);
                    return old;
                }
                
                public int size()
                    { return SuperelevationImpl.this.sizeOfEndofRunoutStaArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new EndofRunoutStaList();
            }
        }
        
        /**
         * Gets array of all "EndofRunoutSta" elements
         */
        public double[] getEndofRunoutStaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ENDOFRUNOUTSTA$12, targetList);
                double[] result = new double[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
                return result;
            }
        }
        
        /**
         * Gets ith "EndofRunoutSta" element
         */
        public double getEndofRunoutStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDOFRUNOUTSTA$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "EndofRunoutSta" elements
         */
        public java.util.List<org.landxml.schema.landXML11.Station> xgetEndofRunoutStaList()
        {
            final class EndofRunoutStaList extends java.util.AbstractList<org.landxml.schema.landXML11.Station>
            {
                public org.landxml.schema.landXML11.Station get(int i)
                    { return SuperelevationImpl.this.xgetEndofRunoutStaArray(i); }
                
                public org.landxml.schema.landXML11.Station set(int i, org.landxml.schema.landXML11.Station o)
                {
                    org.landxml.schema.landXML11.Station old = SuperelevationImpl.this.xgetEndofRunoutStaArray(i);
                    SuperelevationImpl.this.xsetEndofRunoutStaArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.Station o)
                    { SuperelevationImpl.this.insertNewEndofRunoutSta(i).set(o); }
                
                public org.landxml.schema.landXML11.Station remove(int i)
                {
                    org.landxml.schema.landXML11.Station old = SuperelevationImpl.this.xgetEndofRunoutStaArray(i);
                    SuperelevationImpl.this.removeEndofRunoutSta(i);
                    return old;
                }
                
                public int size()
                    { return SuperelevationImpl.this.sizeOfEndofRunoutStaArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new EndofRunoutStaList();
            }
        }
        
        /**
         * Gets (as xml) array of all "EndofRunoutSta" elements
         */
        public org.landxml.schema.landXML11.Station[] xgetEndofRunoutStaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ENDOFRUNOUTSTA$12, targetList);
                org.landxml.schema.landXML11.Station[] result = new org.landxml.schema.landXML11.Station[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "EndofRunoutSta" element
         */
        public org.landxml.schema.landXML11.Station xgetEndofRunoutStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(ENDOFRUNOUTSTA$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.landxml.schema.landXML11.Station)target;
            }
        }
        
        /**
         * Tests for nil ith "EndofRunoutSta" element
         */
        public boolean isNilEndofRunoutStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(ENDOFRUNOUTSTA$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "EndofRunoutSta" element
         */
        public int sizeOfEndofRunoutStaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENDOFRUNOUTSTA$12);
            }
        }
        
        /**
         * Sets array of all "EndofRunoutSta" element
         */
        public void setEndofRunoutStaArray(double[] endofRunoutStaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(endofRunoutStaArray, ENDOFRUNOUTSTA$12);
            }
        }
        
        /**
         * Sets ith "EndofRunoutSta" element
         */
        public void setEndofRunoutStaArray(int i, double endofRunoutSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDOFRUNOUTSTA$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setDoubleValue(endofRunoutSta);
            }
        }
        
        /**
         * Sets (as xml) array of all "EndofRunoutSta" element
         */
        public void xsetEndofRunoutStaArray(org.landxml.schema.landXML11.Station[]endofRunoutStaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(endofRunoutStaArray, ENDOFRUNOUTSTA$12);
            }
        }
        
        /**
         * Sets (as xml) ith "EndofRunoutSta" element
         */
        public void xsetEndofRunoutStaArray(int i, org.landxml.schema.landXML11.Station endofRunoutSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(ENDOFRUNOUTSTA$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(endofRunoutSta);
            }
        }
        
        /**
         * Nils the ith "EndofRunoutSta" element
         */
        public void setNilEndofRunoutStaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(ENDOFRUNOUTSTA$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts the value as the ith "EndofRunoutSta" element
         */
        public void insertEndofRunoutSta(int i, double endofRunoutSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ENDOFRUNOUTSTA$12, i);
                target.setDoubleValue(endofRunoutSta);
            }
        }
        
        /**
         * Appends the value as the last "EndofRunoutSta" element
         */
        public void addEndofRunoutSta(double endofRunoutSta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDOFRUNOUTSTA$12);
                target.setDoubleValue(endofRunoutSta);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "EndofRunoutSta" element
         */
        public org.landxml.schema.landXML11.Station insertNewEndofRunoutSta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().insert_element_user(ENDOFRUNOUTSTA$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "EndofRunoutSta" element
         */
        public org.landxml.schema.landXML11.Station addNewEndofRunoutSta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().add_element_user(ENDOFRUNOUTSTA$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "EndofRunoutSta" element
         */
        public void removeEndofRunoutSta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENDOFRUNOUTSTA$12, i);
            }
        }
        
        /**
         * Gets a List of "AdverseSE" elements
         */
        public java.util.List<org.landxml.schema.landXML11.AdverseSEType.Enum> getAdverseSEList()
        {
            final class AdverseSEList extends java.util.AbstractList<org.landxml.schema.landXML11.AdverseSEType.Enum>
            {
                public org.landxml.schema.landXML11.AdverseSEType.Enum get(int i)
                    { return SuperelevationImpl.this.getAdverseSEArray(i); }
                
                public org.landxml.schema.landXML11.AdverseSEType.Enum set(int i, org.landxml.schema.landXML11.AdverseSEType.Enum o)
                {
                    org.landxml.schema.landXML11.AdverseSEType.Enum old = SuperelevationImpl.this.getAdverseSEArray(i);
                    SuperelevationImpl.this.setAdverseSEArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.AdverseSEType.Enum o)
                    { SuperelevationImpl.this.insertAdverseSE(i, o); }
                
                public org.landxml.schema.landXML11.AdverseSEType.Enum remove(int i)
                {
                    org.landxml.schema.landXML11.AdverseSEType.Enum old = SuperelevationImpl.this.getAdverseSEArray(i);
                    SuperelevationImpl.this.removeAdverseSE(i);
                    return old;
                }
                
                public int size()
                    { return SuperelevationImpl.this.sizeOfAdverseSEArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new AdverseSEList();
            }
        }
        
        /**
         * Gets array of all "AdverseSE" elements
         */
        public org.landxml.schema.landXML11.AdverseSEType.Enum[] getAdverseSEArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ADVERSESE$14, targetList);
                org.landxml.schema.landXML11.AdverseSEType.Enum[] result = new org.landxml.schema.landXML11.AdverseSEType.Enum[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = (org.landxml.schema.landXML11.AdverseSEType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
                return result;
            }
        }
        
        /**
         * Gets ith "AdverseSE" element
         */
        public org.landxml.schema.landXML11.AdverseSEType.Enum getAdverseSEArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADVERSESE$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.landxml.schema.landXML11.AdverseSEType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "AdverseSE" elements
         */
        public java.util.List<org.landxml.schema.landXML11.AdverseSEType> xgetAdverseSEList()
        {
            final class AdverseSEList extends java.util.AbstractList<org.landxml.schema.landXML11.AdverseSEType>
            {
                public org.landxml.schema.landXML11.AdverseSEType get(int i)
                    { return SuperelevationImpl.this.xgetAdverseSEArray(i); }
                
                public org.landxml.schema.landXML11.AdverseSEType set(int i, org.landxml.schema.landXML11.AdverseSEType o)
                {
                    org.landxml.schema.landXML11.AdverseSEType old = SuperelevationImpl.this.xgetAdverseSEArray(i);
                    SuperelevationImpl.this.xsetAdverseSEArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.AdverseSEType o)
                    { SuperelevationImpl.this.insertNewAdverseSE(i).set(o); }
                
                public org.landxml.schema.landXML11.AdverseSEType remove(int i)
                {
                    org.landxml.schema.landXML11.AdverseSEType old = SuperelevationImpl.this.xgetAdverseSEArray(i);
                    SuperelevationImpl.this.removeAdverseSE(i);
                    return old;
                }
                
                public int size()
                    { return SuperelevationImpl.this.sizeOfAdverseSEArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new AdverseSEList();
            }
        }
        
        /**
         * Gets (as xml) array of all "AdverseSE" elements
         */
        public org.landxml.schema.landXML11.AdverseSEType[] xgetAdverseSEArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ADVERSESE$14, targetList);
                org.landxml.schema.landXML11.AdverseSEType[] result = new org.landxml.schema.landXML11.AdverseSEType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "AdverseSE" element
         */
        public org.landxml.schema.landXML11.AdverseSEType xgetAdverseSEArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AdverseSEType target = null;
                target = (org.landxml.schema.landXML11.AdverseSEType)get_store().find_element_user(ADVERSESE$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.landxml.schema.landXML11.AdverseSEType)target;
            }
        }
        
        /**
         * Returns number of "AdverseSE" element
         */
        public int sizeOfAdverseSEArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADVERSESE$14);
            }
        }
        
        /**
         * Sets array of all "AdverseSE" element
         */
        public void setAdverseSEArray(org.landxml.schema.landXML11.AdverseSEType.Enum[] adverseSEArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(adverseSEArray, ADVERSESE$14);
            }
        }
        
        /**
         * Sets ith "AdverseSE" element
         */
        public void setAdverseSEArray(int i, org.landxml.schema.landXML11.AdverseSEType.Enum adverseSE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADVERSESE$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setEnumValue(adverseSE);
            }
        }
        
        /**
         * Sets (as xml) array of all "AdverseSE" element
         */
        public void xsetAdverseSEArray(org.landxml.schema.landXML11.AdverseSEType[]adverseSEArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(adverseSEArray, ADVERSESE$14);
            }
        }
        
        /**
         * Sets (as xml) ith "AdverseSE" element
         */
        public void xsetAdverseSEArray(int i, org.landxml.schema.landXML11.AdverseSEType adverseSE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AdverseSEType target = null;
                target = (org.landxml.schema.landXML11.AdverseSEType)get_store().find_element_user(ADVERSESE$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(adverseSE);
            }
        }
        
        /**
         * Inserts the value as the ith "AdverseSE" element
         */
        public void insertAdverseSE(int i, org.landxml.schema.landXML11.AdverseSEType.Enum adverseSE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ADVERSESE$14, i);
                target.setEnumValue(adverseSE);
            }
        }
        
        /**
         * Appends the value as the last "AdverseSE" element
         */
        public void addAdverseSE(org.landxml.schema.landXML11.AdverseSEType.Enum adverseSE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADVERSESE$14);
                target.setEnumValue(adverseSE);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AdverseSE" element
         */
        public org.landxml.schema.landXML11.AdverseSEType insertNewAdverseSE(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AdverseSEType target = null;
                target = (org.landxml.schema.landXML11.AdverseSEType)get_store().insert_element_user(ADVERSESE$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AdverseSE" element
         */
        public org.landxml.schema.landXML11.AdverseSEType addNewAdverseSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AdverseSEType target = null;
                target = (org.landxml.schema.landXML11.AdverseSEType)get_store().add_element_user(ADVERSESE$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "AdverseSE" element
         */
        public void removeAdverseSE(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADVERSESE$14, i);
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
                    { return SuperelevationImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = SuperelevationImpl.this.getFeatureArray(i);
                    SuperelevationImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { SuperelevationImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = SuperelevationImpl.this.getFeatureArray(i);
                    SuperelevationImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return SuperelevationImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "staStart" attribute
         */
        public double getStaStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STASTART$18);
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
        public org.landxml.schema.landXML11.Station xgetStaStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(STASTART$18);
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
                return get_store().find_attribute_user(STASTART$18) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STASTART$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STASTART$18);
                }
                target.setDoubleValue(staStart);
            }
        }
        
        /**
         * Sets (as xml) the "staStart" attribute
         */
        public void xsetStaStart(org.landxml.schema.landXML11.Station staStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(STASTART$18);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(STASTART$18);
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
                get_store().remove_attribute(STASTART$18);
            }
        }
        
        /**
         * Gets the "staEnd" attribute
         */
        public double getStaEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STAEND$20);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "staEnd" attribute
         */
        public org.landxml.schema.landXML11.Station xgetStaEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(STAEND$20);
                return target;
            }
        }
        
        /**
         * True if has "staEnd" attribute
         */
        public boolean isSetStaEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STAEND$20) != null;
            }
        }
        
        /**
         * Sets the "staEnd" attribute
         */
        public void setStaEnd(double staEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STAEND$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STAEND$20);
                }
                target.setDoubleValue(staEnd);
            }
        }
        
        /**
         * Sets (as xml) the "staEnd" attribute
         */
        public void xsetStaEnd(org.landxml.schema.landXML11.Station staEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(STAEND$20);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(STAEND$20);
                }
                target.set(staEnd);
            }
        }
        
        /**
         * Unsets the "staEnd" attribute
         */
        public void unsetStaEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STAEND$20);
            }
        }
    }
}
