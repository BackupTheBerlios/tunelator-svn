/*
 * An XML document type.
 * Localname: Alignment
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.AlignmentDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Alignment(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class AlignmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.AlignmentDocument
{
    
    public AlignmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALIGNMENT$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Alignment");
    
    
    /**
     * Gets the "Alignment" element
     */
    public org.landxml.schema.landXML11.AlignmentDocument.Alignment getAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AlignmentDocument.Alignment target = null;
            target = (org.landxml.schema.landXML11.AlignmentDocument.Alignment)get_store().find_element_user(ALIGNMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Alignment" element
     */
    public void setAlignment(org.landxml.schema.landXML11.AlignmentDocument.Alignment alignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AlignmentDocument.Alignment target = null;
            target = (org.landxml.schema.landXML11.AlignmentDocument.Alignment)get_store().find_element_user(ALIGNMENT$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.AlignmentDocument.Alignment)get_store().add_element_user(ALIGNMENT$0);
            }
            target.set(alignment);
        }
    }
    
    /**
     * Appends and returns a new empty "Alignment" element
     */
    public org.landxml.schema.landXML11.AlignmentDocument.Alignment addNewAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AlignmentDocument.Alignment target = null;
            target = (org.landxml.schema.landXML11.AlignmentDocument.Alignment)get_store().add_element_user(ALIGNMENT$0);
            return target;
        }
    }
    /**
     * An XML Alignment(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class AlignmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.AlignmentDocument.Alignment
    {
        
        public AlignmentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName START$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Start");
        private static final javax.xml.namespace.QName COORDGEOM$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CoordGeom");
        private static final javax.xml.namespace.QName ALIGNPIS$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "AlignPIs");
        private static final javax.xml.namespace.QName CANT$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Cant");
        private static final javax.xml.namespace.QName STAEQUATION$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "StaEquation");
        private static final javax.xml.namespace.QName PROFILE$10 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Profile");
        private static final javax.xml.namespace.QName CROSSSECTS$12 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CrossSects");
        private static final javax.xml.namespace.QName SUPERELEVATION$14 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Superelevation");
        private static final javax.xml.namespace.QName FEATURE$16 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName NAME$18 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName LENGTH$20 = 
            new javax.xml.namespace.QName("", "length");
        private static final javax.xml.namespace.QName STASTART$22 = 
            new javax.xml.namespace.QName("", "staStart");
        private static final javax.xml.namespace.QName DESC$24 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName OID$26 = 
            new javax.xml.namespace.QName("", "oID");
        private static final javax.xml.namespace.QName STATE$28 = 
            new javax.xml.namespace.QName("", "state");
        
        
        /**
         * Gets a List of "Start" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PointType> getStartList()
        {
            final class StartList extends java.util.AbstractList<org.landxml.schema.landXML11.PointType>
            {
                public org.landxml.schema.landXML11.PointType get(int i)
                    { return AlignmentImpl.this.getStartArray(i); }
                
                public org.landxml.schema.landXML11.PointType set(int i, org.landxml.schema.landXML11.PointType o)
                {
                    org.landxml.schema.landXML11.PointType old = AlignmentImpl.this.getStartArray(i);
                    AlignmentImpl.this.setStartArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PointType o)
                    { AlignmentImpl.this.insertNewStart(i).set(o); }
                
                public org.landxml.schema.landXML11.PointType remove(int i)
                {
                    org.landxml.schema.landXML11.PointType old = AlignmentImpl.this.getStartArray(i);
                    AlignmentImpl.this.removeStart(i);
                    return old;
                }
                
                public int size()
                    { return AlignmentImpl.this.sizeOfStartArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new StartList();
            }
        }
        
        /**
         * Gets array of all "Start" elements
         */
        public org.landxml.schema.landXML11.PointType[] getStartArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(START$0, targetList);
                org.landxml.schema.landXML11.PointType[] result = new org.landxml.schema.landXML11.PointType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Start" element
         */
        public org.landxml.schema.landXML11.PointType getStartArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(START$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Start" element
         */
        public int sizeOfStartArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(START$0);
            }
        }
        
        /**
         * Sets array of all "Start" element
         */
        public void setStartArray(org.landxml.schema.landXML11.PointType[] startArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(startArray, START$0);
            }
        }
        
        /**
         * Sets ith "Start" element
         */
        public void setStartArray(int i, org.landxml.schema.landXML11.PointType start)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(START$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(start);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Start" element
         */
        public org.landxml.schema.landXML11.PointType insertNewStart(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().insert_element_user(START$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Start" element
         */
        public org.landxml.schema.landXML11.PointType addNewStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(START$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Start" element
         */
        public void removeStart(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(START$0, i);
            }
        }
        
        /**
         * Gets a List of "CoordGeom" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom> getCoordGeomList()
        {
            final class CoordGeomList extends java.util.AbstractList<org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom>
            {
                public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom get(int i)
                    { return AlignmentImpl.this.getCoordGeomArray(i); }
                
                public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom set(int i, org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom o)
                {
                    org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom old = AlignmentImpl.this.getCoordGeomArray(i);
                    AlignmentImpl.this.setCoordGeomArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom o)
                    { AlignmentImpl.this.insertNewCoordGeom(i).set(o); }
                
                public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom remove(int i)
                {
                    org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom old = AlignmentImpl.this.getCoordGeomArray(i);
                    AlignmentImpl.this.removeCoordGeom(i);
                    return old;
                }
                
                public int size()
                    { return AlignmentImpl.this.sizeOfCoordGeomArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CoordGeomList();
            }
        }
        
        /**
         * Gets array of all "CoordGeom" elements
         */
        public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom[] getCoordGeomArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COORDGEOM$2, targetList);
                org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom[] result = new org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CoordGeom" element
         */
        public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom getCoordGeomArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom target = null;
                target = (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom)get_store().find_element_user(COORDGEOM$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CoordGeom" element
         */
        public int sizeOfCoordGeomArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COORDGEOM$2);
            }
        }
        
        /**
         * Sets array of all "CoordGeom" element
         */
        public void setCoordGeomArray(org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom[] coordGeomArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(coordGeomArray, COORDGEOM$2);
            }
        }
        
        /**
         * Sets ith "CoordGeom" element
         */
        public void setCoordGeomArray(int i, org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom coordGeom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom target = null;
                target = (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom)get_store().find_element_user(COORDGEOM$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(coordGeom);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CoordGeom" element
         */
        public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom insertNewCoordGeom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom target = null;
                target = (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom)get_store().insert_element_user(COORDGEOM$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CoordGeom" element
         */
        public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom addNewCoordGeom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom target = null;
                target = (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom)get_store().add_element_user(COORDGEOM$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "CoordGeom" element
         */
        public void removeCoordGeom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COORDGEOM$2, i);
            }
        }
        
        /**
         * Gets a List of "AlignPIs" elements
         */
        public java.util.List<org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs> getAlignPIsList()
        {
            final class AlignPIsList extends java.util.AbstractList<org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs>
            {
                public org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs get(int i)
                    { return AlignmentImpl.this.getAlignPIsArray(i); }
                
                public org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs set(int i, org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs o)
                {
                    org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs old = AlignmentImpl.this.getAlignPIsArray(i);
                    AlignmentImpl.this.setAlignPIsArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs o)
                    { AlignmentImpl.this.insertNewAlignPIs(i).set(o); }
                
                public org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs remove(int i)
                {
                    org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs old = AlignmentImpl.this.getAlignPIsArray(i);
                    AlignmentImpl.this.removeAlignPIs(i);
                    return old;
                }
                
                public int size()
                    { return AlignmentImpl.this.sizeOfAlignPIsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new AlignPIsList();
            }
        }
        
        /**
         * Gets array of all "AlignPIs" elements
         */
        public org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs[] getAlignPIsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALIGNPIS$4, targetList);
                org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs[] result = new org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AlignPIs" element
         */
        public org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs getAlignPIsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs target = null;
                target = (org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs)get_store().find_element_user(ALIGNPIS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AlignPIs" element
         */
        public int sizeOfAlignPIsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALIGNPIS$4);
            }
        }
        
        /**
         * Sets array of all "AlignPIs" element
         */
        public void setAlignPIsArray(org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs[] alignPIsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(alignPIsArray, ALIGNPIS$4);
            }
        }
        
        /**
         * Sets ith "AlignPIs" element
         */
        public void setAlignPIsArray(int i, org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs alignPIs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs target = null;
                target = (org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs)get_store().find_element_user(ALIGNPIS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(alignPIs);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AlignPIs" element
         */
        public org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs insertNewAlignPIs(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs target = null;
                target = (org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs)get_store().insert_element_user(ALIGNPIS$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AlignPIs" element
         */
        public org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs addNewAlignPIs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs target = null;
                target = (org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs)get_store().add_element_user(ALIGNPIS$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "AlignPIs" element
         */
        public void removeAlignPIs(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALIGNPIS$4, i);
            }
        }
        
        /**
         * Gets a List of "Cant" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CantDocument.Cant> getCantList()
        {
            final class CantList extends java.util.AbstractList<org.landxml.schema.landXML11.CantDocument.Cant>
            {
                public org.landxml.schema.landXML11.CantDocument.Cant get(int i)
                    { return AlignmentImpl.this.getCantArray(i); }
                
                public org.landxml.schema.landXML11.CantDocument.Cant set(int i, org.landxml.schema.landXML11.CantDocument.Cant o)
                {
                    org.landxml.schema.landXML11.CantDocument.Cant old = AlignmentImpl.this.getCantArray(i);
                    AlignmentImpl.this.setCantArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CantDocument.Cant o)
                    { AlignmentImpl.this.insertNewCant(i).set(o); }
                
                public org.landxml.schema.landXML11.CantDocument.Cant remove(int i)
                {
                    org.landxml.schema.landXML11.CantDocument.Cant old = AlignmentImpl.this.getCantArray(i);
                    AlignmentImpl.this.removeCant(i);
                    return old;
                }
                
                public int size()
                    { return AlignmentImpl.this.sizeOfCantArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CantList();
            }
        }
        
        /**
         * Gets array of all "Cant" elements
         */
        public org.landxml.schema.landXML11.CantDocument.Cant[] getCantArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CANT$6, targetList);
                org.landxml.schema.landXML11.CantDocument.Cant[] result = new org.landxml.schema.landXML11.CantDocument.Cant[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Cant" element
         */
        public org.landxml.schema.landXML11.CantDocument.Cant getCantArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CantDocument.Cant target = null;
                target = (org.landxml.schema.landXML11.CantDocument.Cant)get_store().find_element_user(CANT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Cant" element
         */
        public int sizeOfCantArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CANT$6);
            }
        }
        
        /**
         * Sets array of all "Cant" element
         */
        public void setCantArray(org.landxml.schema.landXML11.CantDocument.Cant[] cantArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(cantArray, CANT$6);
            }
        }
        
        /**
         * Sets ith "Cant" element
         */
        public void setCantArray(int i, org.landxml.schema.landXML11.CantDocument.Cant cant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CantDocument.Cant target = null;
                target = (org.landxml.schema.landXML11.CantDocument.Cant)get_store().find_element_user(CANT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(cant);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Cant" element
         */
        public org.landxml.schema.landXML11.CantDocument.Cant insertNewCant(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CantDocument.Cant target = null;
                target = (org.landxml.schema.landXML11.CantDocument.Cant)get_store().insert_element_user(CANT$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Cant" element
         */
        public org.landxml.schema.landXML11.CantDocument.Cant addNewCant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CantDocument.Cant target = null;
                target = (org.landxml.schema.landXML11.CantDocument.Cant)get_store().add_element_user(CANT$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "Cant" element
         */
        public void removeCant(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CANT$6, i);
            }
        }
        
        /**
         * Gets a List of "StaEquation" elements
         */
        public java.util.List<org.landxml.schema.landXML11.StaEquationDocument.StaEquation> getStaEquationList()
        {
            final class StaEquationList extends java.util.AbstractList<org.landxml.schema.landXML11.StaEquationDocument.StaEquation>
            {
                public org.landxml.schema.landXML11.StaEquationDocument.StaEquation get(int i)
                    { return AlignmentImpl.this.getStaEquationArray(i); }
                
                public org.landxml.schema.landXML11.StaEquationDocument.StaEquation set(int i, org.landxml.schema.landXML11.StaEquationDocument.StaEquation o)
                {
                    org.landxml.schema.landXML11.StaEquationDocument.StaEquation old = AlignmentImpl.this.getStaEquationArray(i);
                    AlignmentImpl.this.setStaEquationArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.StaEquationDocument.StaEquation o)
                    { AlignmentImpl.this.insertNewStaEquation(i).set(o); }
                
                public org.landxml.schema.landXML11.StaEquationDocument.StaEquation remove(int i)
                {
                    org.landxml.schema.landXML11.StaEquationDocument.StaEquation old = AlignmentImpl.this.getStaEquationArray(i);
                    AlignmentImpl.this.removeStaEquation(i);
                    return old;
                }
                
                public int size()
                    { return AlignmentImpl.this.sizeOfStaEquationArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new StaEquationList();
            }
        }
        
        /**
         * Gets array of all "StaEquation" elements
         */
        public org.landxml.schema.landXML11.StaEquationDocument.StaEquation[] getStaEquationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STAEQUATION$8, targetList);
                org.landxml.schema.landXML11.StaEquationDocument.StaEquation[] result = new org.landxml.schema.landXML11.StaEquationDocument.StaEquation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "StaEquation" element
         */
        public org.landxml.schema.landXML11.StaEquationDocument.StaEquation getStaEquationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StaEquationDocument.StaEquation target = null;
                target = (org.landxml.schema.landXML11.StaEquationDocument.StaEquation)get_store().find_element_user(STAEQUATION$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "StaEquation" element
         */
        public int sizeOfStaEquationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STAEQUATION$8);
            }
        }
        
        /**
         * Sets array of all "StaEquation" element
         */
        public void setStaEquationArray(org.landxml.schema.landXML11.StaEquationDocument.StaEquation[] staEquationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(staEquationArray, STAEQUATION$8);
            }
        }
        
        /**
         * Sets ith "StaEquation" element
         */
        public void setStaEquationArray(int i, org.landxml.schema.landXML11.StaEquationDocument.StaEquation staEquation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StaEquationDocument.StaEquation target = null;
                target = (org.landxml.schema.landXML11.StaEquationDocument.StaEquation)get_store().find_element_user(STAEQUATION$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(staEquation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "StaEquation" element
         */
        public org.landxml.schema.landXML11.StaEquationDocument.StaEquation insertNewStaEquation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StaEquationDocument.StaEquation target = null;
                target = (org.landxml.schema.landXML11.StaEquationDocument.StaEquation)get_store().insert_element_user(STAEQUATION$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "StaEquation" element
         */
        public org.landxml.schema.landXML11.StaEquationDocument.StaEquation addNewStaEquation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StaEquationDocument.StaEquation target = null;
                target = (org.landxml.schema.landXML11.StaEquationDocument.StaEquation)get_store().add_element_user(STAEQUATION$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "StaEquation" element
         */
        public void removeStaEquation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STAEQUATION$8, i);
            }
        }
        
        /**
         * Gets a List of "Profile" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ProfileDocument.Profile> getProfileList()
        {
            final class ProfileList extends java.util.AbstractList<org.landxml.schema.landXML11.ProfileDocument.Profile>
            {
                public org.landxml.schema.landXML11.ProfileDocument.Profile get(int i)
                    { return AlignmentImpl.this.getProfileArray(i); }
                
                public org.landxml.schema.landXML11.ProfileDocument.Profile set(int i, org.landxml.schema.landXML11.ProfileDocument.Profile o)
                {
                    org.landxml.schema.landXML11.ProfileDocument.Profile old = AlignmentImpl.this.getProfileArray(i);
                    AlignmentImpl.this.setProfileArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ProfileDocument.Profile o)
                    { AlignmentImpl.this.insertNewProfile(i).set(o); }
                
                public org.landxml.schema.landXML11.ProfileDocument.Profile remove(int i)
                {
                    org.landxml.schema.landXML11.ProfileDocument.Profile old = AlignmentImpl.this.getProfileArray(i);
                    AlignmentImpl.this.removeProfile(i);
                    return old;
                }
                
                public int size()
                    { return AlignmentImpl.this.sizeOfProfileArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ProfileList();
            }
        }
        
        /**
         * Gets array of all "Profile" elements
         */
        public org.landxml.schema.landXML11.ProfileDocument.Profile[] getProfileArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROFILE$10, targetList);
                org.landxml.schema.landXML11.ProfileDocument.Profile[] result = new org.landxml.schema.landXML11.ProfileDocument.Profile[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Profile" element
         */
        public org.landxml.schema.landXML11.ProfileDocument.Profile getProfileArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ProfileDocument.Profile target = null;
                target = (org.landxml.schema.landXML11.ProfileDocument.Profile)get_store().find_element_user(PROFILE$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Profile" element
         */
        public int sizeOfProfileArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROFILE$10);
            }
        }
        
        /**
         * Sets array of all "Profile" element
         */
        public void setProfileArray(org.landxml.schema.landXML11.ProfileDocument.Profile[] profileArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(profileArray, PROFILE$10);
            }
        }
        
        /**
         * Sets ith "Profile" element
         */
        public void setProfileArray(int i, org.landxml.schema.landXML11.ProfileDocument.Profile profile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ProfileDocument.Profile target = null;
                target = (org.landxml.schema.landXML11.ProfileDocument.Profile)get_store().find_element_user(PROFILE$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(profile);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Profile" element
         */
        public org.landxml.schema.landXML11.ProfileDocument.Profile insertNewProfile(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ProfileDocument.Profile target = null;
                target = (org.landxml.schema.landXML11.ProfileDocument.Profile)get_store().insert_element_user(PROFILE$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Profile" element
         */
        public org.landxml.schema.landXML11.ProfileDocument.Profile addNewProfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ProfileDocument.Profile target = null;
                target = (org.landxml.schema.landXML11.ProfileDocument.Profile)get_store().add_element_user(PROFILE$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "Profile" element
         */
        public void removeProfile(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROFILE$10, i);
            }
        }
        
        /**
         * Gets a List of "CrossSects" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CrossSectsDocument.CrossSects> getCrossSectsList()
        {
            final class CrossSectsList extends java.util.AbstractList<org.landxml.schema.landXML11.CrossSectsDocument.CrossSects>
            {
                public org.landxml.schema.landXML11.CrossSectsDocument.CrossSects get(int i)
                    { return AlignmentImpl.this.getCrossSectsArray(i); }
                
                public org.landxml.schema.landXML11.CrossSectsDocument.CrossSects set(int i, org.landxml.schema.landXML11.CrossSectsDocument.CrossSects o)
                {
                    org.landxml.schema.landXML11.CrossSectsDocument.CrossSects old = AlignmentImpl.this.getCrossSectsArray(i);
                    AlignmentImpl.this.setCrossSectsArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CrossSectsDocument.CrossSects o)
                    { AlignmentImpl.this.insertNewCrossSects(i).set(o); }
                
                public org.landxml.schema.landXML11.CrossSectsDocument.CrossSects remove(int i)
                {
                    org.landxml.schema.landXML11.CrossSectsDocument.CrossSects old = AlignmentImpl.this.getCrossSectsArray(i);
                    AlignmentImpl.this.removeCrossSects(i);
                    return old;
                }
                
                public int size()
                    { return AlignmentImpl.this.sizeOfCrossSectsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CrossSectsList();
            }
        }
        
        /**
         * Gets array of all "CrossSects" elements
         */
        public org.landxml.schema.landXML11.CrossSectsDocument.CrossSects[] getCrossSectsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CROSSSECTS$12, targetList);
                org.landxml.schema.landXML11.CrossSectsDocument.CrossSects[] result = new org.landxml.schema.landXML11.CrossSectsDocument.CrossSects[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CrossSects" element
         */
        public org.landxml.schema.landXML11.CrossSectsDocument.CrossSects getCrossSectsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectsDocument.CrossSects target = null;
                target = (org.landxml.schema.landXML11.CrossSectsDocument.CrossSects)get_store().find_element_user(CROSSSECTS$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CrossSects" element
         */
        public int sizeOfCrossSectsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CROSSSECTS$12);
            }
        }
        
        /**
         * Sets array of all "CrossSects" element
         */
        public void setCrossSectsArray(org.landxml.schema.landXML11.CrossSectsDocument.CrossSects[] crossSectsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(crossSectsArray, CROSSSECTS$12);
            }
        }
        
        /**
         * Sets ith "CrossSects" element
         */
        public void setCrossSectsArray(int i, org.landxml.schema.landXML11.CrossSectsDocument.CrossSects crossSects)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectsDocument.CrossSects target = null;
                target = (org.landxml.schema.landXML11.CrossSectsDocument.CrossSects)get_store().find_element_user(CROSSSECTS$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(crossSects);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CrossSects" element
         */
        public org.landxml.schema.landXML11.CrossSectsDocument.CrossSects insertNewCrossSects(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectsDocument.CrossSects target = null;
                target = (org.landxml.schema.landXML11.CrossSectsDocument.CrossSects)get_store().insert_element_user(CROSSSECTS$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CrossSects" element
         */
        public org.landxml.schema.landXML11.CrossSectsDocument.CrossSects addNewCrossSects()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CrossSectsDocument.CrossSects target = null;
                target = (org.landxml.schema.landXML11.CrossSectsDocument.CrossSects)get_store().add_element_user(CROSSSECTS$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "CrossSects" element
         */
        public void removeCrossSects(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CROSSSECTS$12, i);
            }
        }
        
        /**
         * Gets a List of "Superelevation" elements
         */
        public java.util.List<org.landxml.schema.landXML11.SuperelevationDocument.Superelevation> getSuperelevationList()
        {
            final class SuperelevationList extends java.util.AbstractList<org.landxml.schema.landXML11.SuperelevationDocument.Superelevation>
            {
                public org.landxml.schema.landXML11.SuperelevationDocument.Superelevation get(int i)
                    { return AlignmentImpl.this.getSuperelevationArray(i); }
                
                public org.landxml.schema.landXML11.SuperelevationDocument.Superelevation set(int i, org.landxml.schema.landXML11.SuperelevationDocument.Superelevation o)
                {
                    org.landxml.schema.landXML11.SuperelevationDocument.Superelevation old = AlignmentImpl.this.getSuperelevationArray(i);
                    AlignmentImpl.this.setSuperelevationArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.SuperelevationDocument.Superelevation o)
                    { AlignmentImpl.this.insertNewSuperelevation(i).set(o); }
                
                public org.landxml.schema.landXML11.SuperelevationDocument.Superelevation remove(int i)
                {
                    org.landxml.schema.landXML11.SuperelevationDocument.Superelevation old = AlignmentImpl.this.getSuperelevationArray(i);
                    AlignmentImpl.this.removeSuperelevation(i);
                    return old;
                }
                
                public int size()
                    { return AlignmentImpl.this.sizeOfSuperelevationArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SuperelevationList();
            }
        }
        
        /**
         * Gets array of all "Superelevation" elements
         */
        public org.landxml.schema.landXML11.SuperelevationDocument.Superelevation[] getSuperelevationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUPERELEVATION$14, targetList);
                org.landxml.schema.landXML11.SuperelevationDocument.Superelevation[] result = new org.landxml.schema.landXML11.SuperelevationDocument.Superelevation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Superelevation" element
         */
        public org.landxml.schema.landXML11.SuperelevationDocument.Superelevation getSuperelevationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SuperelevationDocument.Superelevation target = null;
                target = (org.landxml.schema.landXML11.SuperelevationDocument.Superelevation)get_store().find_element_user(SUPERELEVATION$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Superelevation" element
         */
        public int sizeOfSuperelevationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUPERELEVATION$14);
            }
        }
        
        /**
         * Sets array of all "Superelevation" element
         */
        public void setSuperelevationArray(org.landxml.schema.landXML11.SuperelevationDocument.Superelevation[] superelevationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(superelevationArray, SUPERELEVATION$14);
            }
        }
        
        /**
         * Sets ith "Superelevation" element
         */
        public void setSuperelevationArray(int i, org.landxml.schema.landXML11.SuperelevationDocument.Superelevation superelevation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SuperelevationDocument.Superelevation target = null;
                target = (org.landxml.schema.landXML11.SuperelevationDocument.Superelevation)get_store().find_element_user(SUPERELEVATION$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(superelevation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Superelevation" element
         */
        public org.landxml.schema.landXML11.SuperelevationDocument.Superelevation insertNewSuperelevation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SuperelevationDocument.Superelevation target = null;
                target = (org.landxml.schema.landXML11.SuperelevationDocument.Superelevation)get_store().insert_element_user(SUPERELEVATION$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Superelevation" element
         */
        public org.landxml.schema.landXML11.SuperelevationDocument.Superelevation addNewSuperelevation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SuperelevationDocument.Superelevation target = null;
                target = (org.landxml.schema.landXML11.SuperelevationDocument.Superelevation)get_store().add_element_user(SUPERELEVATION$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "Superelevation" element
         */
        public void removeSuperelevation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUPERELEVATION$14, i);
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
                    { return AlignmentImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = AlignmentImpl.this.getFeatureArray(i);
                    AlignmentImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { AlignmentImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = AlignmentImpl.this.getFeatureArray(i);
                    AlignmentImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return AlignmentImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$18);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$18);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "length" attribute
         */
        public double getLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$20);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "length" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTH$20);
                return target;
            }
        }
        
        /**
         * Sets the "length" attribute
         */
        public void setLength(double length)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LENGTH$20);
                }
                target.setDoubleValue(length);
            }
        }
        
        /**
         * Sets (as xml) the "length" attribute
         */
        public void xsetLength(org.apache.xmlbeans.XmlDouble length)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTH$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LENGTH$20);
                }
                target.set(length);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STASTART$22);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STASTART$22);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STASTART$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STASTART$22);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STASTART$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(STASTART$22);
                }
                target.set(staStart);
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
         * Gets the "oID" attribute
         */
        public java.lang.String getOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$26);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "oID" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$26);
                return target;
            }
        }
        
        /**
         * True if has "oID" attribute
         */
        public boolean isSetOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OID$26) != null;
            }
        }
        
        /**
         * Sets the "oID" attribute
         */
        public void setOID(java.lang.String oid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OID$26);
                }
                target.setStringValue(oid);
            }
        }
        
        /**
         * Sets (as xml) the "oID" attribute
         */
        public void xsetOID(org.apache.xmlbeans.XmlString oid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OID$26);
                }
                target.set(oid);
            }
        }
        
        /**
         * Unsets the "oID" attribute
         */
        public void unsetOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OID$26);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$28);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$28);
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
                return get_store().find_attribute_user(STATE$28) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$28);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$28);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$28);
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
                get_store().remove_attribute(STATE$28);
            }
        }
    }
}
