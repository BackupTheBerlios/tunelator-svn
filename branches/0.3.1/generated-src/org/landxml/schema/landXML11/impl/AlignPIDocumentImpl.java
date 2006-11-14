/*
 * An XML document type.
 * Localname: AlignPI
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.AlignPIDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one AlignPI(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class AlignPIDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.AlignPIDocument
{
    
    public AlignPIDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALIGNPI$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "AlignPI");
    
    
    /**
     * Gets the "AlignPI" element
     */
    public org.landxml.schema.landXML11.AlignPIDocument.AlignPI getAlignPI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AlignPIDocument.AlignPI target = null;
            target = (org.landxml.schema.landXML11.AlignPIDocument.AlignPI)get_store().find_element_user(ALIGNPI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AlignPI" element
     */
    public void setAlignPI(org.landxml.schema.landXML11.AlignPIDocument.AlignPI alignPI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AlignPIDocument.AlignPI target = null;
            target = (org.landxml.schema.landXML11.AlignPIDocument.AlignPI)get_store().find_element_user(ALIGNPI$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.AlignPIDocument.AlignPI)get_store().add_element_user(ALIGNPI$0);
            }
            target.set(alignPI);
        }
    }
    
    /**
     * Appends and returns a new empty "AlignPI" element
     */
    public org.landxml.schema.landXML11.AlignPIDocument.AlignPI addNewAlignPI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AlignPIDocument.AlignPI target = null;
            target = (org.landxml.schema.landXML11.AlignPIDocument.AlignPI)get_store().add_element_user(ALIGNPI$0);
            return target;
        }
    }
    /**
     * An XML AlignPI(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class AlignPIImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.AlignPIDocument.AlignPI
    {
        
        public AlignPIImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATION$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Station");
        private static final javax.xml.namespace.QName PI$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PI");
        private static final javax.xml.namespace.QName INSPIRAL$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "InSpiral");
        private static final javax.xml.namespace.QName CURVE1$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Curve1");
        private static final javax.xml.namespace.QName CONNSPIRAL$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ConnSpiral");
        private static final javax.xml.namespace.QName CURVE2$10 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Curve2");
        private static final javax.xml.namespace.QName OUTSPIRAL$12 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "OutSpiral");
        
        
        /**
         * Gets a List of "Station" elements
         */
        public java.util.List<java.lang.Double> getStationList()
        {
            final class StationList extends java.util.AbstractList<java.lang.Double>
            {
                public java.lang.Double get(int i)
                    { return AlignPIImpl.this.getStationArray(i); }
                
                public java.lang.Double set(int i, java.lang.Double o)
                {
                    java.lang.Double old = AlignPIImpl.this.getStationArray(i);
                    AlignPIImpl.this.setStationArray(i, o);
                    return old;
                }
                
                public void add(int i, java.lang.Double o)
                    { AlignPIImpl.this.insertStation(i, o); }
                
                public java.lang.Double remove(int i)
                {
                    java.lang.Double old = AlignPIImpl.this.getStationArray(i);
                    AlignPIImpl.this.removeStation(i);
                    return old;
                }
                
                public int size()
                    { return AlignPIImpl.this.sizeOfStationArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new StationList();
            }
        }
        
        /**
         * Gets array of all "Station" elements
         */
        public double[] getStationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STATION$0, targetList);
                double[] result = new double[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
                return result;
            }
        }
        
        /**
         * Gets ith "Station" element
         */
        public double getStationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "Station" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlDouble> xgetStationList()
        {
            final class StationList extends java.util.AbstractList<org.apache.xmlbeans.XmlDouble>
            {
                public org.apache.xmlbeans.XmlDouble get(int i)
                    { return AlignPIImpl.this.xgetStationArray(i); }
                
                public org.apache.xmlbeans.XmlDouble set(int i, org.apache.xmlbeans.XmlDouble o)
                {
                    org.apache.xmlbeans.XmlDouble old = AlignPIImpl.this.xgetStationArray(i);
                    AlignPIImpl.this.xsetStationArray(i, o);
                    return old;
                }
                
                public void add(int i, org.apache.xmlbeans.XmlDouble o)
                    { AlignPIImpl.this.insertNewStation(i).set(o); }
                
                public org.apache.xmlbeans.XmlDouble remove(int i)
                {
                    org.apache.xmlbeans.XmlDouble old = AlignPIImpl.this.xgetStationArray(i);
                    AlignPIImpl.this.removeStation(i);
                    return old;
                }
                
                public int size()
                    { return AlignPIImpl.this.sizeOfStationArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new StationList();
            }
        }
        
        /**
         * Gets (as xml) array of all "Station" elements
         */
        public org.apache.xmlbeans.XmlDouble[] xgetStationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STATION$0, targetList);
                org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "Station" element
         */
        public org.apache.xmlbeans.XmlDouble xgetStationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(STATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlDouble)target;
            }
        }
        
        /**
         * Returns number of "Station" element
         */
        public int sizeOfStationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATION$0);
            }
        }
        
        /**
         * Sets array of all "Station" element
         */
        public void setStationArray(double[] stationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(stationArray, STATION$0);
            }
        }
        
        /**
         * Sets ith "Station" element
         */
        public void setStationArray(int i, double station)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setDoubleValue(station);
            }
        }
        
        /**
         * Sets (as xml) array of all "Station" element
         */
        public void xsetStationArray(org.apache.xmlbeans.XmlDouble[]stationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(stationArray, STATION$0);
            }
        }
        
        /**
         * Sets (as xml) ith "Station" element
         */
        public void xsetStationArray(int i, org.apache.xmlbeans.XmlDouble station)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(STATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(station);
            }
        }
        
        /**
         * Inserts the value as the ith "Station" element
         */
        public void insertStation(int i, double station)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STATION$0, i);
                target.setDoubleValue(station);
            }
        }
        
        /**
         * Appends the value as the last "Station" element
         */
        public void addStation(double station)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATION$0);
                target.setDoubleValue(station);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Station" element
         */
        public org.apache.xmlbeans.XmlDouble insertNewStation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(STATION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Station" element
         */
        public org.apache.xmlbeans.XmlDouble addNewStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(STATION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Station" element
         */
        public void removeStation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATION$0, i);
            }
        }
        
        /**
         * Gets a List of "PI" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PointType> getPIList()
        {
            final class PIList extends java.util.AbstractList<org.landxml.schema.landXML11.PointType>
            {
                public org.landxml.schema.landXML11.PointType get(int i)
                    { return AlignPIImpl.this.getPIArray(i); }
                
                public org.landxml.schema.landXML11.PointType set(int i, org.landxml.schema.landXML11.PointType o)
                {
                    org.landxml.schema.landXML11.PointType old = AlignPIImpl.this.getPIArray(i);
                    AlignPIImpl.this.setPIArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PointType o)
                    { AlignPIImpl.this.insertNewPI(i).set(o); }
                
                public org.landxml.schema.landXML11.PointType remove(int i)
                {
                    org.landxml.schema.landXML11.PointType old = AlignPIImpl.this.getPIArray(i);
                    AlignPIImpl.this.removePI(i);
                    return old;
                }
                
                public int size()
                    { return AlignPIImpl.this.sizeOfPIArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PIList();
            }
        }
        
        /**
         * Gets array of all "PI" elements
         */
        public org.landxml.schema.landXML11.PointType[] getPIArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PI$2, targetList);
                org.landxml.schema.landXML11.PointType[] result = new org.landxml.schema.landXML11.PointType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PI" element
         */
        public org.landxml.schema.landXML11.PointType getPIArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(PI$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PI" element
         */
        public int sizeOfPIArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PI$2);
            }
        }
        
        /**
         * Sets array of all "PI" element
         */
        public void setPIArray(org.landxml.schema.landXML11.PointType[] piArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(piArray, PI$2);
            }
        }
        
        /**
         * Sets ith "PI" element
         */
        public void setPIArray(int i, org.landxml.schema.landXML11.PointType pi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(PI$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(pi);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PI" element
         */
        public org.landxml.schema.landXML11.PointType insertNewPI(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().insert_element_user(PI$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PI" element
         */
        public org.landxml.schema.landXML11.PointType addNewPI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(PI$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "PI" element
         */
        public void removePI(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PI$2, i);
            }
        }
        
        /**
         * Gets a List of "InSpiral" elements
         */
        public java.util.List<org.landxml.schema.landXML11.InSpiralDocument.InSpiral> getInSpiralList()
        {
            final class InSpiralList extends java.util.AbstractList<org.landxml.schema.landXML11.InSpiralDocument.InSpiral>
            {
                public org.landxml.schema.landXML11.InSpiralDocument.InSpiral get(int i)
                    { return AlignPIImpl.this.getInSpiralArray(i); }
                
                public org.landxml.schema.landXML11.InSpiralDocument.InSpiral set(int i, org.landxml.schema.landXML11.InSpiralDocument.InSpiral o)
                {
                    org.landxml.schema.landXML11.InSpiralDocument.InSpiral old = AlignPIImpl.this.getInSpiralArray(i);
                    AlignPIImpl.this.setInSpiralArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.InSpiralDocument.InSpiral o)
                    { AlignPIImpl.this.insertNewInSpiral(i).set(o); }
                
                public org.landxml.schema.landXML11.InSpiralDocument.InSpiral remove(int i)
                {
                    org.landxml.schema.landXML11.InSpiralDocument.InSpiral old = AlignPIImpl.this.getInSpiralArray(i);
                    AlignPIImpl.this.removeInSpiral(i);
                    return old;
                }
                
                public int size()
                    { return AlignPIImpl.this.sizeOfInSpiralArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new InSpiralList();
            }
        }
        
        /**
         * Gets array of all "InSpiral" elements
         */
        public org.landxml.schema.landXML11.InSpiralDocument.InSpiral[] getInSpiralArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INSPIRAL$4, targetList);
                org.landxml.schema.landXML11.InSpiralDocument.InSpiral[] result = new org.landxml.schema.landXML11.InSpiralDocument.InSpiral[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "InSpiral" element
         */
        public org.landxml.schema.landXML11.InSpiralDocument.InSpiral getInSpiralArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.InSpiralDocument.InSpiral target = null;
                target = (org.landxml.schema.landXML11.InSpiralDocument.InSpiral)get_store().find_element_user(INSPIRAL$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "InSpiral" element
         */
        public int sizeOfInSpiralArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INSPIRAL$4);
            }
        }
        
        /**
         * Sets array of all "InSpiral" element
         */
        public void setInSpiralArray(org.landxml.schema.landXML11.InSpiralDocument.InSpiral[] inSpiralArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(inSpiralArray, INSPIRAL$4);
            }
        }
        
        /**
         * Sets ith "InSpiral" element
         */
        public void setInSpiralArray(int i, org.landxml.schema.landXML11.InSpiralDocument.InSpiral inSpiral)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.InSpiralDocument.InSpiral target = null;
                target = (org.landxml.schema.landXML11.InSpiralDocument.InSpiral)get_store().find_element_user(INSPIRAL$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(inSpiral);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "InSpiral" element
         */
        public org.landxml.schema.landXML11.InSpiralDocument.InSpiral insertNewInSpiral(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.InSpiralDocument.InSpiral target = null;
                target = (org.landxml.schema.landXML11.InSpiralDocument.InSpiral)get_store().insert_element_user(INSPIRAL$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "InSpiral" element
         */
        public org.landxml.schema.landXML11.InSpiralDocument.InSpiral addNewInSpiral()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.InSpiralDocument.InSpiral target = null;
                target = (org.landxml.schema.landXML11.InSpiralDocument.InSpiral)get_store().add_element_user(INSPIRAL$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "InSpiral" element
         */
        public void removeInSpiral(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INSPIRAL$4, i);
            }
        }
        
        /**
         * Gets a List of "Curve1" elements
         */
        public java.util.List<org.landxml.schema.landXML11.Curve1Document.Curve1> getCurve1List()
        {
            final class Curve1List extends java.util.AbstractList<org.landxml.schema.landXML11.Curve1Document.Curve1>
            {
                public org.landxml.schema.landXML11.Curve1Document.Curve1 get(int i)
                    { return AlignPIImpl.this.getCurve1Array(i); }
                
                public org.landxml.schema.landXML11.Curve1Document.Curve1 set(int i, org.landxml.schema.landXML11.Curve1Document.Curve1 o)
                {
                    org.landxml.schema.landXML11.Curve1Document.Curve1 old = AlignPIImpl.this.getCurve1Array(i);
                    AlignPIImpl.this.setCurve1Array(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.Curve1Document.Curve1 o)
                    { AlignPIImpl.this.insertNewCurve1(i).set(o); }
                
                public org.landxml.schema.landXML11.Curve1Document.Curve1 remove(int i)
                {
                    org.landxml.schema.landXML11.Curve1Document.Curve1 old = AlignPIImpl.this.getCurve1Array(i);
                    AlignPIImpl.this.removeCurve1(i);
                    return old;
                }
                
                public int size()
                    { return AlignPIImpl.this.sizeOfCurve1Array(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new Curve1List();
            }
        }
        
        /**
         * Gets array of all "Curve1" elements
         */
        public org.landxml.schema.landXML11.Curve1Document.Curve1[] getCurve1Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CURVE1$6, targetList);
                org.landxml.schema.landXML11.Curve1Document.Curve1[] result = new org.landxml.schema.landXML11.Curve1Document.Curve1[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Curve1" element
         */
        public org.landxml.schema.landXML11.Curve1Document.Curve1 getCurve1Array(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Curve1Document.Curve1 target = null;
                target = (org.landxml.schema.landXML11.Curve1Document.Curve1)get_store().find_element_user(CURVE1$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Curve1" element
         */
        public int sizeOfCurve1Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CURVE1$6);
            }
        }
        
        /**
         * Sets array of all "Curve1" element
         */
        public void setCurve1Array(org.landxml.schema.landXML11.Curve1Document.Curve1[] curve1Array)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(curve1Array, CURVE1$6);
            }
        }
        
        /**
         * Sets ith "Curve1" element
         */
        public void setCurve1Array(int i, org.landxml.schema.landXML11.Curve1Document.Curve1 curve1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Curve1Document.Curve1 target = null;
                target = (org.landxml.schema.landXML11.Curve1Document.Curve1)get_store().find_element_user(CURVE1$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(curve1);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Curve1" element
         */
        public org.landxml.schema.landXML11.Curve1Document.Curve1 insertNewCurve1(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Curve1Document.Curve1 target = null;
                target = (org.landxml.schema.landXML11.Curve1Document.Curve1)get_store().insert_element_user(CURVE1$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Curve1" element
         */
        public org.landxml.schema.landXML11.Curve1Document.Curve1 addNewCurve1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Curve1Document.Curve1 target = null;
                target = (org.landxml.schema.landXML11.Curve1Document.Curve1)get_store().add_element_user(CURVE1$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "Curve1" element
         */
        public void removeCurve1(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CURVE1$6, i);
            }
        }
        
        /**
         * Gets a List of "ConnSpiral" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral> getConnSpiralList()
        {
            final class ConnSpiralList extends java.util.AbstractList<org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral>
            {
                public org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral get(int i)
                    { return AlignPIImpl.this.getConnSpiralArray(i); }
                
                public org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral set(int i, org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral o)
                {
                    org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral old = AlignPIImpl.this.getConnSpiralArray(i);
                    AlignPIImpl.this.setConnSpiralArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral o)
                    { AlignPIImpl.this.insertNewConnSpiral(i).set(o); }
                
                public org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral remove(int i)
                {
                    org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral old = AlignPIImpl.this.getConnSpiralArray(i);
                    AlignPIImpl.this.removeConnSpiral(i);
                    return old;
                }
                
                public int size()
                    { return AlignPIImpl.this.sizeOfConnSpiralArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ConnSpiralList();
            }
        }
        
        /**
         * Gets array of all "ConnSpiral" elements
         */
        public org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral[] getConnSpiralArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONNSPIRAL$8, targetList);
                org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral[] result = new org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ConnSpiral" element
         */
        public org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral getConnSpiralArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral target = null;
                target = (org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral)get_store().find_element_user(CONNSPIRAL$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ConnSpiral" element
         */
        public int sizeOfConnSpiralArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONNSPIRAL$8);
            }
        }
        
        /**
         * Sets array of all "ConnSpiral" element
         */
        public void setConnSpiralArray(org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral[] connSpiralArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(connSpiralArray, CONNSPIRAL$8);
            }
        }
        
        /**
         * Sets ith "ConnSpiral" element
         */
        public void setConnSpiralArray(int i, org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral connSpiral)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral target = null;
                target = (org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral)get_store().find_element_user(CONNSPIRAL$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(connSpiral);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ConnSpiral" element
         */
        public org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral insertNewConnSpiral(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral target = null;
                target = (org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral)get_store().insert_element_user(CONNSPIRAL$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ConnSpiral" element
         */
        public org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral addNewConnSpiral()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral target = null;
                target = (org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral)get_store().add_element_user(CONNSPIRAL$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "ConnSpiral" element
         */
        public void removeConnSpiral(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONNSPIRAL$8, i);
            }
        }
        
        /**
         * Gets a List of "Curve2" elements
         */
        public java.util.List<org.landxml.schema.landXML11.Curve2Document.Curve2> getCurve2List()
        {
            final class Curve2List extends java.util.AbstractList<org.landxml.schema.landXML11.Curve2Document.Curve2>
            {
                public org.landxml.schema.landXML11.Curve2Document.Curve2 get(int i)
                    { return AlignPIImpl.this.getCurve2Array(i); }
                
                public org.landxml.schema.landXML11.Curve2Document.Curve2 set(int i, org.landxml.schema.landXML11.Curve2Document.Curve2 o)
                {
                    org.landxml.schema.landXML11.Curve2Document.Curve2 old = AlignPIImpl.this.getCurve2Array(i);
                    AlignPIImpl.this.setCurve2Array(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.Curve2Document.Curve2 o)
                    { AlignPIImpl.this.insertNewCurve2(i).set(o); }
                
                public org.landxml.schema.landXML11.Curve2Document.Curve2 remove(int i)
                {
                    org.landxml.schema.landXML11.Curve2Document.Curve2 old = AlignPIImpl.this.getCurve2Array(i);
                    AlignPIImpl.this.removeCurve2(i);
                    return old;
                }
                
                public int size()
                    { return AlignPIImpl.this.sizeOfCurve2Array(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new Curve2List();
            }
        }
        
        /**
         * Gets array of all "Curve2" elements
         */
        public org.landxml.schema.landXML11.Curve2Document.Curve2[] getCurve2Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CURVE2$10, targetList);
                org.landxml.schema.landXML11.Curve2Document.Curve2[] result = new org.landxml.schema.landXML11.Curve2Document.Curve2[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Curve2" element
         */
        public org.landxml.schema.landXML11.Curve2Document.Curve2 getCurve2Array(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Curve2Document.Curve2 target = null;
                target = (org.landxml.schema.landXML11.Curve2Document.Curve2)get_store().find_element_user(CURVE2$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Curve2" element
         */
        public int sizeOfCurve2Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CURVE2$10);
            }
        }
        
        /**
         * Sets array of all "Curve2" element
         */
        public void setCurve2Array(org.landxml.schema.landXML11.Curve2Document.Curve2[] curve2Array)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(curve2Array, CURVE2$10);
            }
        }
        
        /**
         * Sets ith "Curve2" element
         */
        public void setCurve2Array(int i, org.landxml.schema.landXML11.Curve2Document.Curve2 curve2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Curve2Document.Curve2 target = null;
                target = (org.landxml.schema.landXML11.Curve2Document.Curve2)get_store().find_element_user(CURVE2$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(curve2);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Curve2" element
         */
        public org.landxml.schema.landXML11.Curve2Document.Curve2 insertNewCurve2(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Curve2Document.Curve2 target = null;
                target = (org.landxml.schema.landXML11.Curve2Document.Curve2)get_store().insert_element_user(CURVE2$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Curve2" element
         */
        public org.landxml.schema.landXML11.Curve2Document.Curve2 addNewCurve2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Curve2Document.Curve2 target = null;
                target = (org.landxml.schema.landXML11.Curve2Document.Curve2)get_store().add_element_user(CURVE2$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "Curve2" element
         */
        public void removeCurve2(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CURVE2$10, i);
            }
        }
        
        /**
         * Gets a List of "OutSpiral" elements
         */
        public java.util.List<org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral> getOutSpiralList()
        {
            final class OutSpiralList extends java.util.AbstractList<org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral>
            {
                public org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral get(int i)
                    { return AlignPIImpl.this.getOutSpiralArray(i); }
                
                public org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral set(int i, org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral o)
                {
                    org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral old = AlignPIImpl.this.getOutSpiralArray(i);
                    AlignPIImpl.this.setOutSpiralArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral o)
                    { AlignPIImpl.this.insertNewOutSpiral(i).set(o); }
                
                public org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral remove(int i)
                {
                    org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral old = AlignPIImpl.this.getOutSpiralArray(i);
                    AlignPIImpl.this.removeOutSpiral(i);
                    return old;
                }
                
                public int size()
                    { return AlignPIImpl.this.sizeOfOutSpiralArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new OutSpiralList();
            }
        }
        
        /**
         * Gets array of all "OutSpiral" elements
         */
        public org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral[] getOutSpiralArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OUTSPIRAL$12, targetList);
                org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral[] result = new org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "OutSpiral" element
         */
        public org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral getOutSpiralArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral target = null;
                target = (org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral)get_store().find_element_user(OUTSPIRAL$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "OutSpiral" element
         */
        public int sizeOfOutSpiralArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OUTSPIRAL$12);
            }
        }
        
        /**
         * Sets array of all "OutSpiral" element
         */
        public void setOutSpiralArray(org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral[] outSpiralArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(outSpiralArray, OUTSPIRAL$12);
            }
        }
        
        /**
         * Sets ith "OutSpiral" element
         */
        public void setOutSpiralArray(int i, org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral outSpiral)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral target = null;
                target = (org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral)get_store().find_element_user(OUTSPIRAL$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(outSpiral);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OutSpiral" element
         */
        public org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral insertNewOutSpiral(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral target = null;
                target = (org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral)get_store().insert_element_user(OUTSPIRAL$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OutSpiral" element
         */
        public org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral addNewOutSpiral()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral target = null;
                target = (org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral)get_store().add_element_user(OUTSPIRAL$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "OutSpiral" element
         */
        public void removeOutSpiral(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OUTSPIRAL$12, i);
            }
        }
    }
}
