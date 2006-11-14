/*
 * An XML document type.
 * Localname: CoordGeom
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CoordGeomDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one CoordGeom(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class CoordGeomDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CoordGeomDocument
{
    
    public CoordGeomDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDGEOM$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CoordGeom");
    
    
    /**
     * Gets the "CoordGeom" element
     */
    public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom getCoordGeom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom target = null;
            target = (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom)get_store().find_element_user(COORDGEOM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CoordGeom" element
     */
    public void setCoordGeom(org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom coordGeom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom target = null;
            target = (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom)get_store().find_element_user(COORDGEOM$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom)get_store().add_element_user(COORDGEOM$0);
            }
            target.set(coordGeom);
        }
    }
    
    /**
     * Appends and returns a new empty "CoordGeom" element
     */
    public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom addNewCoordGeom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom target = null;
            target = (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom)get_store().add_element_user(COORDGEOM$0);
            return target;
        }
    }
    /**
     * An XML CoordGeom(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class CoordGeomImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom
    {
        
        public CoordGeomImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LINE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Line");
        private static final javax.xml.namespace.QName IRREGULARLINE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "IrregularLine");
        private static final javax.xml.namespace.QName CURVE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Curve");
        private static final javax.xml.namespace.QName SPIRAL$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Spiral");
        private static final javax.xml.namespace.QName CHAIN$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Chain");
        private static final javax.xml.namespace.QName FEATURE$10 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName DESC$12 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName NAME$14 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName STATE$16 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName OID$18 = 
            new javax.xml.namespace.QName("", "oID");
        
        
        /**
         * Gets a List of "Line" elements
         */
        public java.util.List<org.landxml.schema.landXML11.LineDocument.Line> getLineList()
        {
            final class LineList extends java.util.AbstractList<org.landxml.schema.landXML11.LineDocument.Line>
            {
                public org.landxml.schema.landXML11.LineDocument.Line get(int i)
                    { return CoordGeomImpl.this.getLineArray(i); }
                
                public org.landxml.schema.landXML11.LineDocument.Line set(int i, org.landxml.schema.landXML11.LineDocument.Line o)
                {
                    org.landxml.schema.landXML11.LineDocument.Line old = CoordGeomImpl.this.getLineArray(i);
                    CoordGeomImpl.this.setLineArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.LineDocument.Line o)
                    { CoordGeomImpl.this.insertNewLine(i).set(o); }
                
                public org.landxml.schema.landXML11.LineDocument.Line remove(int i)
                {
                    org.landxml.schema.landXML11.LineDocument.Line old = CoordGeomImpl.this.getLineArray(i);
                    CoordGeomImpl.this.removeLine(i);
                    return old;
                }
                
                public int size()
                    { return CoordGeomImpl.this.sizeOfLineArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LineList();
            }
        }
        
        /**
         * Gets array of all "Line" elements
         */
        public org.landxml.schema.landXML11.LineDocument.Line[] getLineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LINE$0, targetList);
                org.landxml.schema.landXML11.LineDocument.Line[] result = new org.landxml.schema.landXML11.LineDocument.Line[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Line" element
         */
        public org.landxml.schema.landXML11.LineDocument.Line getLineArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LineDocument.Line target = null;
                target = (org.landxml.schema.landXML11.LineDocument.Line)get_store().find_element_user(LINE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Line" element
         */
        public int sizeOfLineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINE$0);
            }
        }
        
        /**
         * Sets array of all "Line" element
         */
        public void setLineArray(org.landxml.schema.landXML11.LineDocument.Line[] lineArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(lineArray, LINE$0);
            }
        }
        
        /**
         * Sets ith "Line" element
         */
        public void setLineArray(int i, org.landxml.schema.landXML11.LineDocument.Line line)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LineDocument.Line target = null;
                target = (org.landxml.schema.landXML11.LineDocument.Line)get_store().find_element_user(LINE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(line);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Line" element
         */
        public org.landxml.schema.landXML11.LineDocument.Line insertNewLine(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LineDocument.Line target = null;
                target = (org.landxml.schema.landXML11.LineDocument.Line)get_store().insert_element_user(LINE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Line" element
         */
        public org.landxml.schema.landXML11.LineDocument.Line addNewLine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LineDocument.Line target = null;
                target = (org.landxml.schema.landXML11.LineDocument.Line)get_store().add_element_user(LINE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Line" element
         */
        public void removeLine(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINE$0, i);
            }
        }
        
        /**
         * Gets a List of "IrregularLine" elements
         */
        public java.util.List<org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine> getIrregularLineList()
        {
            final class IrregularLineList extends java.util.AbstractList<org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine>
            {
                public org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine get(int i)
                    { return CoordGeomImpl.this.getIrregularLineArray(i); }
                
                public org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine set(int i, org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine o)
                {
                    org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine old = CoordGeomImpl.this.getIrregularLineArray(i);
                    CoordGeomImpl.this.setIrregularLineArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine o)
                    { CoordGeomImpl.this.insertNewIrregularLine(i).set(o); }
                
                public org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine remove(int i)
                {
                    org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine old = CoordGeomImpl.this.getIrregularLineArray(i);
                    CoordGeomImpl.this.removeIrregularLine(i);
                    return old;
                }
                
                public int size()
                    { return CoordGeomImpl.this.sizeOfIrregularLineArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new IrregularLineList();
            }
        }
        
        /**
         * Gets array of all "IrregularLine" elements
         */
        public org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine[] getIrregularLineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IRREGULARLINE$2, targetList);
                org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine[] result = new org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "IrregularLine" element
         */
        public org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine getIrregularLineArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine target = null;
                target = (org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine)get_store().find_element_user(IRREGULARLINE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "IrregularLine" element
         */
        public int sizeOfIrregularLineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IRREGULARLINE$2);
            }
        }
        
        /**
         * Sets array of all "IrregularLine" element
         */
        public void setIrregularLineArray(org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine[] irregularLineArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(irregularLineArray, IRREGULARLINE$2);
            }
        }
        
        /**
         * Sets ith "IrregularLine" element
         */
        public void setIrregularLineArray(int i, org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine irregularLine)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine target = null;
                target = (org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine)get_store().find_element_user(IRREGULARLINE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(irregularLine);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "IrregularLine" element
         */
        public org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine insertNewIrregularLine(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine target = null;
                target = (org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine)get_store().insert_element_user(IRREGULARLINE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "IrregularLine" element
         */
        public org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine addNewIrregularLine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine target = null;
                target = (org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine)get_store().add_element_user(IRREGULARLINE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "IrregularLine" element
         */
        public void removeIrregularLine(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IRREGULARLINE$2, i);
            }
        }
        
        /**
         * Gets a List of "Curve" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CurveDocument.Curve> getCurveList()
        {
            final class CurveList extends java.util.AbstractList<org.landxml.schema.landXML11.CurveDocument.Curve>
            {
                public org.landxml.schema.landXML11.CurveDocument.Curve get(int i)
                    { return CoordGeomImpl.this.getCurveArray(i); }
                
                public org.landxml.schema.landXML11.CurveDocument.Curve set(int i, org.landxml.schema.landXML11.CurveDocument.Curve o)
                {
                    org.landxml.schema.landXML11.CurveDocument.Curve old = CoordGeomImpl.this.getCurveArray(i);
                    CoordGeomImpl.this.setCurveArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CurveDocument.Curve o)
                    { CoordGeomImpl.this.insertNewCurve(i).set(o); }
                
                public org.landxml.schema.landXML11.CurveDocument.Curve remove(int i)
                {
                    org.landxml.schema.landXML11.CurveDocument.Curve old = CoordGeomImpl.this.getCurveArray(i);
                    CoordGeomImpl.this.removeCurve(i);
                    return old;
                }
                
                public int size()
                    { return CoordGeomImpl.this.sizeOfCurveArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CurveList();
            }
        }
        
        /**
         * Gets array of all "Curve" elements
         */
        public org.landxml.schema.landXML11.CurveDocument.Curve[] getCurveArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CURVE$4, targetList);
                org.landxml.schema.landXML11.CurveDocument.Curve[] result = new org.landxml.schema.landXML11.CurveDocument.Curve[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Curve" element
         */
        public org.landxml.schema.landXML11.CurveDocument.Curve getCurveArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CurveDocument.Curve target = null;
                target = (org.landxml.schema.landXML11.CurveDocument.Curve)get_store().find_element_user(CURVE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Curve" element
         */
        public int sizeOfCurveArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CURVE$4);
            }
        }
        
        /**
         * Sets array of all "Curve" element
         */
        public void setCurveArray(org.landxml.schema.landXML11.CurveDocument.Curve[] curveArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(curveArray, CURVE$4);
            }
        }
        
        /**
         * Sets ith "Curve" element
         */
        public void setCurveArray(int i, org.landxml.schema.landXML11.CurveDocument.Curve curve)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CurveDocument.Curve target = null;
                target = (org.landxml.schema.landXML11.CurveDocument.Curve)get_store().find_element_user(CURVE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(curve);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Curve" element
         */
        public org.landxml.schema.landXML11.CurveDocument.Curve insertNewCurve(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CurveDocument.Curve target = null;
                target = (org.landxml.schema.landXML11.CurveDocument.Curve)get_store().insert_element_user(CURVE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Curve" element
         */
        public org.landxml.schema.landXML11.CurveDocument.Curve addNewCurve()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CurveDocument.Curve target = null;
                target = (org.landxml.schema.landXML11.CurveDocument.Curve)get_store().add_element_user(CURVE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "Curve" element
         */
        public void removeCurve(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CURVE$4, i);
            }
        }
        
        /**
         * Gets a List of "Spiral" elements
         */
        public java.util.List<org.landxml.schema.landXML11.SpiralDocument.Spiral> getSpiralList()
        {
            final class SpiralList extends java.util.AbstractList<org.landxml.schema.landXML11.SpiralDocument.Spiral>
            {
                public org.landxml.schema.landXML11.SpiralDocument.Spiral get(int i)
                    { return CoordGeomImpl.this.getSpiralArray(i); }
                
                public org.landxml.schema.landXML11.SpiralDocument.Spiral set(int i, org.landxml.schema.landXML11.SpiralDocument.Spiral o)
                {
                    org.landxml.schema.landXML11.SpiralDocument.Spiral old = CoordGeomImpl.this.getSpiralArray(i);
                    CoordGeomImpl.this.setSpiralArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.SpiralDocument.Spiral o)
                    { CoordGeomImpl.this.insertNewSpiral(i).set(o); }
                
                public org.landxml.schema.landXML11.SpiralDocument.Spiral remove(int i)
                {
                    org.landxml.schema.landXML11.SpiralDocument.Spiral old = CoordGeomImpl.this.getSpiralArray(i);
                    CoordGeomImpl.this.removeSpiral(i);
                    return old;
                }
                
                public int size()
                    { return CoordGeomImpl.this.sizeOfSpiralArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SpiralList();
            }
        }
        
        /**
         * Gets array of all "Spiral" elements
         */
        public org.landxml.schema.landXML11.SpiralDocument.Spiral[] getSpiralArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SPIRAL$6, targetList);
                org.landxml.schema.landXML11.SpiralDocument.Spiral[] result = new org.landxml.schema.landXML11.SpiralDocument.Spiral[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Spiral" element
         */
        public org.landxml.schema.landXML11.SpiralDocument.Spiral getSpiralArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SpiralDocument.Spiral target = null;
                target = (org.landxml.schema.landXML11.SpiralDocument.Spiral)get_store().find_element_user(SPIRAL$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Spiral" element
         */
        public int sizeOfSpiralArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SPIRAL$6);
            }
        }
        
        /**
         * Sets array of all "Spiral" element
         */
        public void setSpiralArray(org.landxml.schema.landXML11.SpiralDocument.Spiral[] spiralArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(spiralArray, SPIRAL$6);
            }
        }
        
        /**
         * Sets ith "Spiral" element
         */
        public void setSpiralArray(int i, org.landxml.schema.landXML11.SpiralDocument.Spiral spiral)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SpiralDocument.Spiral target = null;
                target = (org.landxml.schema.landXML11.SpiralDocument.Spiral)get_store().find_element_user(SPIRAL$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(spiral);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Spiral" element
         */
        public org.landxml.schema.landXML11.SpiralDocument.Spiral insertNewSpiral(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SpiralDocument.Spiral target = null;
                target = (org.landxml.schema.landXML11.SpiralDocument.Spiral)get_store().insert_element_user(SPIRAL$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Spiral" element
         */
        public org.landxml.schema.landXML11.SpiralDocument.Spiral addNewSpiral()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SpiralDocument.Spiral target = null;
                target = (org.landxml.schema.landXML11.SpiralDocument.Spiral)get_store().add_element_user(SPIRAL$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "Spiral" element
         */
        public void removeSpiral(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SPIRAL$6, i);
            }
        }
        
        /**
         * Gets a List of "Chain" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ChainDocument.Chain> getChainList()
        {
            final class ChainList extends java.util.AbstractList<org.landxml.schema.landXML11.ChainDocument.Chain>
            {
                public org.landxml.schema.landXML11.ChainDocument.Chain get(int i)
                    { return CoordGeomImpl.this.getChainArray(i); }
                
                public org.landxml.schema.landXML11.ChainDocument.Chain set(int i, org.landxml.schema.landXML11.ChainDocument.Chain o)
                {
                    org.landxml.schema.landXML11.ChainDocument.Chain old = CoordGeomImpl.this.getChainArray(i);
                    CoordGeomImpl.this.setChainArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ChainDocument.Chain o)
                    { CoordGeomImpl.this.insertNewChain(i).set(o); }
                
                public org.landxml.schema.landXML11.ChainDocument.Chain remove(int i)
                {
                    org.landxml.schema.landXML11.ChainDocument.Chain old = CoordGeomImpl.this.getChainArray(i);
                    CoordGeomImpl.this.removeChain(i);
                    return old;
                }
                
                public int size()
                    { return CoordGeomImpl.this.sizeOfChainArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ChainList();
            }
        }
        
        /**
         * Gets array of all "Chain" elements
         */
        public org.landxml.schema.landXML11.ChainDocument.Chain[] getChainArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CHAIN$8, targetList);
                org.landxml.schema.landXML11.ChainDocument.Chain[] result = new org.landxml.schema.landXML11.ChainDocument.Chain[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Chain" element
         */
        public org.landxml.schema.landXML11.ChainDocument.Chain getChainArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ChainDocument.Chain target = null;
                target = (org.landxml.schema.landXML11.ChainDocument.Chain)get_store().find_element_user(CHAIN$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Chain" element
         */
        public int sizeOfChainArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CHAIN$8);
            }
        }
        
        /**
         * Sets array of all "Chain" element
         */
        public void setChainArray(org.landxml.schema.landXML11.ChainDocument.Chain[] chainArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(chainArray, CHAIN$8);
            }
        }
        
        /**
         * Sets ith "Chain" element
         */
        public void setChainArray(int i, org.landxml.schema.landXML11.ChainDocument.Chain chain)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ChainDocument.Chain target = null;
                target = (org.landxml.schema.landXML11.ChainDocument.Chain)get_store().find_element_user(CHAIN$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(chain);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Chain" element
         */
        public org.landxml.schema.landXML11.ChainDocument.Chain insertNewChain(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ChainDocument.Chain target = null;
                target = (org.landxml.schema.landXML11.ChainDocument.Chain)get_store().insert_element_user(CHAIN$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Chain" element
         */
        public org.landxml.schema.landXML11.ChainDocument.Chain addNewChain()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ChainDocument.Chain target = null;
                target = (org.landxml.schema.landXML11.ChainDocument.Chain)get_store().add_element_user(CHAIN$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "Chain" element
         */
        public void removeChain(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CHAIN$8, i);
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
                    { return CoordGeomImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CoordGeomImpl.this.getFeatureArray(i);
                    CoordGeomImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { CoordGeomImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CoordGeomImpl.this.getFeatureArray(i);
                    CoordGeomImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return CoordGeomImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$10, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$10, i);
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
                return get_store().count_elements(FEATURE$10);
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
                arraySetterHelper(featureArray, FEATURE$10);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$10, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$10, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$10);
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
                get_store().remove_element(FEATURE$10, i);
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
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$14);
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
                return get_store().find_attribute_user(NAME$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$14);
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
                get_store().remove_attribute(NAME$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$16);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$16);
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
                return get_store().find_attribute_user(STATE$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$16);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$16);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$16);
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
                get_store().remove_attribute(STATE$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$18);
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
                return get_store().find_attribute_user(OID$18) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OID$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OID$18);
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
                get_store().remove_attribute(OID$18);
            }
        }
    }
}
