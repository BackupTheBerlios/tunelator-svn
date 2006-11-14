/*
 * An XML document type.
 * Localname: Curve
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CurveDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Curve(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class CurveDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CurveDocument
{
    
    public CurveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Curve");
    
    
    /**
     * Gets the "Curve" element
     */
    public org.landxml.schema.landXML11.CurveDocument.Curve getCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CurveDocument.Curve target = null;
            target = (org.landxml.schema.landXML11.CurveDocument.Curve)get_store().find_element_user(CURVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Curve" element
     */
    public void setCurve(org.landxml.schema.landXML11.CurveDocument.Curve curve)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CurveDocument.Curve target = null;
            target = (org.landxml.schema.landXML11.CurveDocument.Curve)get_store().find_element_user(CURVE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.CurveDocument.Curve)get_store().add_element_user(CURVE$0);
            }
            target.set(curve);
        }
    }
    
    /**
     * Appends and returns a new empty "Curve" element
     */
    public org.landxml.schema.landXML11.CurveDocument.Curve addNewCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CurveDocument.Curve target = null;
            target = (org.landxml.schema.landXML11.CurveDocument.Curve)get_store().add_element_user(CURVE$0);
            return target;
        }
    }
    /**
     * An XML Curve(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class CurveImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CurveDocument.Curve
    {
        
        public CurveImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName START$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Start");
        private static final javax.xml.namespace.QName CENTER$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Center");
        private static final javax.xml.namespace.QName END$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "End");
        private static final javax.xml.namespace.QName PI$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PI");
        private static final javax.xml.namespace.QName FEATURE$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName ROT$10 = 
            new javax.xml.namespace.QName("", "rot");
        private static final javax.xml.namespace.QName CHORD$12 = 
            new javax.xml.namespace.QName("", "chord");
        private static final javax.xml.namespace.QName CRVTYPE$14 = 
            new javax.xml.namespace.QName("", "crvType");
        private static final javax.xml.namespace.QName DELTA$16 = 
            new javax.xml.namespace.QName("", "delta");
        private static final javax.xml.namespace.QName DESC$18 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName DIREND$20 = 
            new javax.xml.namespace.QName("", "dirEnd");
        private static final javax.xml.namespace.QName DIRSTART$22 = 
            new javax.xml.namespace.QName("", "dirStart");
        private static final javax.xml.namespace.QName EXTERNAL$24 = 
            new javax.xml.namespace.QName("", "external");
        private static final javax.xml.namespace.QName LENGTH$26 = 
            new javax.xml.namespace.QName("", "length");
        private static final javax.xml.namespace.QName MIDORD$28 = 
            new javax.xml.namespace.QName("", "midOrd");
        private static final javax.xml.namespace.QName NAME$30 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName RADIUS$32 = 
            new javax.xml.namespace.QName("", "radius");
        private static final javax.xml.namespace.QName STASTART$34 = 
            new javax.xml.namespace.QName("", "staStart");
        private static final javax.xml.namespace.QName STATE$36 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName TANGENT$38 = 
            new javax.xml.namespace.QName("", "tangent");
        private static final javax.xml.namespace.QName OID$40 = 
            new javax.xml.namespace.QName("", "oID");
        private static final javax.xml.namespace.QName NOTE$42 = 
            new javax.xml.namespace.QName("", "note");
        
        
        /**
         * Gets a List of "Start" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PointType> getStartList()
        {
            final class StartList extends java.util.AbstractList<org.landxml.schema.landXML11.PointType>
            {
                public org.landxml.schema.landXML11.PointType get(int i)
                    { return CurveImpl.this.getStartArray(i); }
                
                public org.landxml.schema.landXML11.PointType set(int i, org.landxml.schema.landXML11.PointType o)
                {
                    org.landxml.schema.landXML11.PointType old = CurveImpl.this.getStartArray(i);
                    CurveImpl.this.setStartArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PointType o)
                    { CurveImpl.this.insertNewStart(i).set(o); }
                
                public org.landxml.schema.landXML11.PointType remove(int i)
                {
                    org.landxml.schema.landXML11.PointType old = CurveImpl.this.getStartArray(i);
                    CurveImpl.this.removeStart(i);
                    return old;
                }
                
                public int size()
                    { return CurveImpl.this.sizeOfStartArray(); }
                
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
         * Gets a List of "Center" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PointType> getCenterList()
        {
            final class CenterList extends java.util.AbstractList<org.landxml.schema.landXML11.PointType>
            {
                public org.landxml.schema.landXML11.PointType get(int i)
                    { return CurveImpl.this.getCenterArray(i); }
                
                public org.landxml.schema.landXML11.PointType set(int i, org.landxml.schema.landXML11.PointType o)
                {
                    org.landxml.schema.landXML11.PointType old = CurveImpl.this.getCenterArray(i);
                    CurveImpl.this.setCenterArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PointType o)
                    { CurveImpl.this.insertNewCenter(i).set(o); }
                
                public org.landxml.schema.landXML11.PointType remove(int i)
                {
                    org.landxml.schema.landXML11.PointType old = CurveImpl.this.getCenterArray(i);
                    CurveImpl.this.removeCenter(i);
                    return old;
                }
                
                public int size()
                    { return CurveImpl.this.sizeOfCenterArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CenterList();
            }
        }
        
        /**
         * Gets array of all "Center" elements
         */
        public org.landxml.schema.landXML11.PointType[] getCenterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CENTER$2, targetList);
                org.landxml.schema.landXML11.PointType[] result = new org.landxml.schema.landXML11.PointType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Center" element
         */
        public org.landxml.schema.landXML11.PointType getCenterArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(CENTER$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Center" element
         */
        public int sizeOfCenterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CENTER$2);
            }
        }
        
        /**
         * Sets array of all "Center" element
         */
        public void setCenterArray(org.landxml.schema.landXML11.PointType[] centerArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(centerArray, CENTER$2);
            }
        }
        
        /**
         * Sets ith "Center" element
         */
        public void setCenterArray(int i, org.landxml.schema.landXML11.PointType center)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(CENTER$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(center);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Center" element
         */
        public org.landxml.schema.landXML11.PointType insertNewCenter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().insert_element_user(CENTER$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Center" element
         */
        public org.landxml.schema.landXML11.PointType addNewCenter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(CENTER$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Center" element
         */
        public void removeCenter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CENTER$2, i);
            }
        }
        
        /**
         * Gets a List of "End" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PointType> getEndList()
        {
            final class EndList extends java.util.AbstractList<org.landxml.schema.landXML11.PointType>
            {
                public org.landxml.schema.landXML11.PointType get(int i)
                    { return CurveImpl.this.getEndArray(i); }
                
                public org.landxml.schema.landXML11.PointType set(int i, org.landxml.schema.landXML11.PointType o)
                {
                    org.landxml.schema.landXML11.PointType old = CurveImpl.this.getEndArray(i);
                    CurveImpl.this.setEndArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PointType o)
                    { CurveImpl.this.insertNewEnd(i).set(o); }
                
                public org.landxml.schema.landXML11.PointType remove(int i)
                {
                    org.landxml.schema.landXML11.PointType old = CurveImpl.this.getEndArray(i);
                    CurveImpl.this.removeEnd(i);
                    return old;
                }
                
                public int size()
                    { return CurveImpl.this.sizeOfEndArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new EndList();
            }
        }
        
        /**
         * Gets array of all "End" elements
         */
        public org.landxml.schema.landXML11.PointType[] getEndArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(END$4, targetList);
                org.landxml.schema.landXML11.PointType[] result = new org.landxml.schema.landXML11.PointType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "End" element
         */
        public org.landxml.schema.landXML11.PointType getEndArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(END$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "End" element
         */
        public int sizeOfEndArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(END$4);
            }
        }
        
        /**
         * Sets array of all "End" element
         */
        public void setEndArray(org.landxml.schema.landXML11.PointType[] endArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(endArray, END$4);
            }
        }
        
        /**
         * Sets ith "End" element
         */
        public void setEndArray(int i, org.landxml.schema.landXML11.PointType end)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(END$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(end);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "End" element
         */
        public org.landxml.schema.landXML11.PointType insertNewEnd(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().insert_element_user(END$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "End" element
         */
        public org.landxml.schema.landXML11.PointType addNewEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(END$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "End" element
         */
        public void removeEnd(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(END$4, i);
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
                    { return CurveImpl.this.getPIArray(i); }
                
                public org.landxml.schema.landXML11.PointType set(int i, org.landxml.schema.landXML11.PointType o)
                {
                    org.landxml.schema.landXML11.PointType old = CurveImpl.this.getPIArray(i);
                    CurveImpl.this.setPIArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PointType o)
                    { CurveImpl.this.insertNewPI(i).set(o); }
                
                public org.landxml.schema.landXML11.PointType remove(int i)
                {
                    org.landxml.schema.landXML11.PointType old = CurveImpl.this.getPIArray(i);
                    CurveImpl.this.removePI(i);
                    return old;
                }
                
                public int size()
                    { return CurveImpl.this.sizeOfPIArray(); }
                
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
                get_store().find_all_element_users(PI$6, targetList);
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
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(PI$6, i);
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
                return get_store().count_elements(PI$6);
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
                arraySetterHelper(piArray, PI$6);
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
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(PI$6, i);
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
                target = (org.landxml.schema.landXML11.PointType)get_store().insert_element_user(PI$6, i);
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
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(PI$6);
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
                get_store().remove_element(PI$6, i);
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
                    { return CurveImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CurveImpl.this.getFeatureArray(i);
                    CurveImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { CurveImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = CurveImpl.this.getFeatureArray(i);
                    CurveImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return CurveImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "rot" attribute
         */
        public org.landxml.schema.landXML11.Clockwise.Enum getRot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROT$10);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.Clockwise.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "rot" attribute
         */
        public org.landxml.schema.landXML11.Clockwise xgetRot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Clockwise target = null;
                target = (org.landxml.schema.landXML11.Clockwise)get_store().find_attribute_user(ROT$10);
                return target;
            }
        }
        
        /**
         * Sets the "rot" attribute
         */
        public void setRot(org.landxml.schema.landXML11.Clockwise.Enum rot)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROT$10);
                }
                target.setEnumValue(rot);
            }
        }
        
        /**
         * Sets (as xml) the "rot" attribute
         */
        public void xsetRot(org.landxml.schema.landXML11.Clockwise rot)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Clockwise target = null;
                target = (org.landxml.schema.landXML11.Clockwise)get_store().find_attribute_user(ROT$10);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Clockwise)get_store().add_attribute_user(ROT$10);
                }
                target.set(rot);
            }
        }
        
        /**
         * Gets the "chord" attribute
         */
        public double getChord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHORD$12);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "chord" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetChord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CHORD$12);
                return target;
            }
        }
        
        /**
         * True if has "chord" attribute
         */
        public boolean isSetChord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CHORD$12) != null;
            }
        }
        
        /**
         * Sets the "chord" attribute
         */
        public void setChord(double chord)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHORD$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHORD$12);
                }
                target.setDoubleValue(chord);
            }
        }
        
        /**
         * Sets (as xml) the "chord" attribute
         */
        public void xsetChord(org.apache.xmlbeans.XmlDouble chord)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CHORD$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CHORD$12);
                }
                target.set(chord);
            }
        }
        
        /**
         * Unsets the "chord" attribute
         */
        public void unsetChord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CHORD$12);
            }
        }
        
        /**
         * Gets the "crvType" attribute
         */
        public org.landxml.schema.landXML11.CurveType.Enum getCrvType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRVTYPE$14);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.CurveType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "crvType" attribute
         */
        public org.landxml.schema.landXML11.CurveType xgetCrvType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CurveType target = null;
                target = (org.landxml.schema.landXML11.CurveType)get_store().find_attribute_user(CRVTYPE$14);
                return target;
            }
        }
        
        /**
         * True if has "crvType" attribute
         */
        public boolean isSetCrvType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CRVTYPE$14) != null;
            }
        }
        
        /**
         * Sets the "crvType" attribute
         */
        public void setCrvType(org.landxml.schema.landXML11.CurveType.Enum crvType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRVTYPE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRVTYPE$14);
                }
                target.setEnumValue(crvType);
            }
        }
        
        /**
         * Sets (as xml) the "crvType" attribute
         */
        public void xsetCrvType(org.landxml.schema.landXML11.CurveType crvType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CurveType target = null;
                target = (org.landxml.schema.landXML11.CurveType)get_store().find_attribute_user(CRVTYPE$14);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CurveType)get_store().add_attribute_user(CRVTYPE$14);
                }
                target.set(crvType);
            }
        }
        
        /**
         * Unsets the "crvType" attribute
         */
        public void unsetCrvType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CRVTYPE$14);
            }
        }
        
        /**
         * Gets the "delta" attribute
         */
        public double getDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELTA$16);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "delta" attribute
         */
        public org.landxml.schema.landXML11.Angle xgetDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Angle target = null;
                target = (org.landxml.schema.landXML11.Angle)get_store().find_attribute_user(DELTA$16);
                return target;
            }
        }
        
        /**
         * True if has "delta" attribute
         */
        public boolean isSetDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DELTA$16) != null;
            }
        }
        
        /**
         * Sets the "delta" attribute
         */
        public void setDelta(double delta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELTA$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELTA$16);
                }
                target.setDoubleValue(delta);
            }
        }
        
        /**
         * Sets (as xml) the "delta" attribute
         */
        public void xsetDelta(org.landxml.schema.landXML11.Angle delta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Angle target = null;
                target = (org.landxml.schema.landXML11.Angle)get_store().find_attribute_user(DELTA$16);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Angle)get_store().add_attribute_user(DELTA$16);
                }
                target.set(delta);
            }
        }
        
        /**
         * Unsets the "delta" attribute
         */
        public void unsetDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DELTA$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$18);
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
                return get_store().find_attribute_user(DESC$18) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$18);
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
                get_store().remove_attribute(DESC$18);
            }
        }
        
        /**
         * Gets the "dirEnd" attribute
         */
        public double getDirEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIREND$20);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "dirEnd" attribute
         */
        public org.landxml.schema.landXML11.Direction xgetDirEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Direction target = null;
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(DIREND$20);
                return target;
            }
        }
        
        /**
         * True if has "dirEnd" attribute
         */
        public boolean isSetDirEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DIREND$20) != null;
            }
        }
        
        /**
         * Sets the "dirEnd" attribute
         */
        public void setDirEnd(double dirEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIREND$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIREND$20);
                }
                target.setDoubleValue(dirEnd);
            }
        }
        
        /**
         * Sets (as xml) the "dirEnd" attribute
         */
        public void xsetDirEnd(org.landxml.schema.landXML11.Direction dirEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Direction target = null;
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(DIREND$20);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Direction)get_store().add_attribute_user(DIREND$20);
                }
                target.set(dirEnd);
            }
        }
        
        /**
         * Unsets the "dirEnd" attribute
         */
        public void unsetDirEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DIREND$20);
            }
        }
        
        /**
         * Gets the "dirStart" attribute
         */
        public double getDirStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRSTART$22);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "dirStart" attribute
         */
        public org.landxml.schema.landXML11.Direction xgetDirStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Direction target = null;
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(DIRSTART$22);
                return target;
            }
        }
        
        /**
         * True if has "dirStart" attribute
         */
        public boolean isSetDirStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DIRSTART$22) != null;
            }
        }
        
        /**
         * Sets the "dirStart" attribute
         */
        public void setDirStart(double dirStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRSTART$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIRSTART$22);
                }
                target.setDoubleValue(dirStart);
            }
        }
        
        /**
         * Sets (as xml) the "dirStart" attribute
         */
        public void xsetDirStart(org.landxml.schema.landXML11.Direction dirStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Direction target = null;
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(DIRSTART$22);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Direction)get_store().add_attribute_user(DIRSTART$22);
                }
                target.set(dirStart);
            }
        }
        
        /**
         * Unsets the "dirStart" attribute
         */
        public void unsetDirStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DIRSTART$22);
            }
        }
        
        /**
         * Gets the "external" attribute
         */
        public double getExternal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTERNAL$24);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "external" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetExternal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXTERNAL$24);
                return target;
            }
        }
        
        /**
         * True if has "external" attribute
         */
        public boolean isSetExternal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXTERNAL$24) != null;
            }
        }
        
        /**
         * Sets the "external" attribute
         */
        public void setExternal(double external)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTERNAL$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTERNAL$24);
                }
                target.setDoubleValue(external);
            }
        }
        
        /**
         * Sets (as xml) the "external" attribute
         */
        public void xsetExternal(org.apache.xmlbeans.XmlDouble external)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXTERNAL$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXTERNAL$24);
                }
                target.set(external);
            }
        }
        
        /**
         * Unsets the "external" attribute
         */
        public void unsetExternal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXTERNAL$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$26);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTH$26);
                return target;
            }
        }
        
        /**
         * True if has "length" attribute
         */
        public boolean isSetLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LENGTH$26) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LENGTH$26);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTH$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LENGTH$26);
                }
                target.set(length);
            }
        }
        
        /**
         * Unsets the "length" attribute
         */
        public void unsetLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LENGTH$26);
            }
        }
        
        /**
         * Gets the "midOrd" attribute
         */
        public double getMidOrd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIDORD$28);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "midOrd" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetMidOrd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MIDORD$28);
                return target;
            }
        }
        
        /**
         * True if has "midOrd" attribute
         */
        public boolean isSetMidOrd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MIDORD$28) != null;
            }
        }
        
        /**
         * Sets the "midOrd" attribute
         */
        public void setMidOrd(double midOrd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIDORD$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MIDORD$28);
                }
                target.setDoubleValue(midOrd);
            }
        }
        
        /**
         * Sets (as xml) the "midOrd" attribute
         */
        public void xsetMidOrd(org.apache.xmlbeans.XmlDouble midOrd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MIDORD$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MIDORD$28);
                }
                target.set(midOrd);
            }
        }
        
        /**
         * Unsets the "midOrd" attribute
         */
        public void unsetMidOrd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MIDORD$28);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$30);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$30);
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
                return get_store().find_attribute_user(NAME$30) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$30);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$30);
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
                get_store().remove_attribute(NAME$30);
            }
        }
        
        /**
         * Gets the "radius" attribute
         */
        public double getRadius()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RADIUS$32);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "radius" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetRadius()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RADIUS$32);
                return target;
            }
        }
        
        /**
         * True if has "radius" attribute
         */
        public boolean isSetRadius()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RADIUS$32) != null;
            }
        }
        
        /**
         * Sets the "radius" attribute
         */
        public void setRadius(double radius)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RADIUS$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RADIUS$32);
                }
                target.setDoubleValue(radius);
            }
        }
        
        /**
         * Sets (as xml) the "radius" attribute
         */
        public void xsetRadius(org.apache.xmlbeans.XmlDouble radius)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RADIUS$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RADIUS$32);
                }
                target.set(radius);
            }
        }
        
        /**
         * Unsets the "radius" attribute
         */
        public void unsetRadius()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RADIUS$32);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STASTART$34);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STASTART$34);
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
                return get_store().find_attribute_user(STASTART$34) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STASTART$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STASTART$34);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STASTART$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(STASTART$34);
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
                get_store().remove_attribute(STASTART$34);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$36);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$36);
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
                return get_store().find_attribute_user(STATE$36) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$36);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$36);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$36);
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
                get_store().remove_attribute(STATE$36);
            }
        }
        
        /**
         * Gets the "tangent" attribute
         */
        public double getTangent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TANGENT$38);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "tangent" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetTangent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TANGENT$38);
                return target;
            }
        }
        
        /**
         * True if has "tangent" attribute
         */
        public boolean isSetTangent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TANGENT$38) != null;
            }
        }
        
        /**
         * Sets the "tangent" attribute
         */
        public void setTangent(double tangent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TANGENT$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TANGENT$38);
                }
                target.setDoubleValue(tangent);
            }
        }
        
        /**
         * Sets (as xml) the "tangent" attribute
         */
        public void xsetTangent(org.apache.xmlbeans.XmlDouble tangent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TANGENT$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TANGENT$38);
                }
                target.set(tangent);
            }
        }
        
        /**
         * Unsets the "tangent" attribute
         */
        public void unsetTangent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TANGENT$38);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$40);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$40);
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
                return get_store().find_attribute_user(OID$40) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OID$40);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OID$40);
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
                get_store().remove_attribute(OID$40);
            }
        }
        
        /**
         * Gets the "note" attribute
         */
        public java.lang.String getNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOTE$42);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "note" attribute
         */
        public org.apache.xmlbeans.XmlString xgetNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NOTE$42);
                return target;
            }
        }
        
        /**
         * True if has "note" attribute
         */
        public boolean isSetNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NOTE$42) != null;
            }
        }
        
        /**
         * Sets the "note" attribute
         */
        public void setNote(java.lang.String note)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOTE$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOTE$42);
                }
                target.setStringValue(note);
            }
        }
        
        /**
         * Sets (as xml) the "note" attribute
         */
        public void xsetNote(org.apache.xmlbeans.XmlString note)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NOTE$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NOTE$42);
                }
                target.set(note);
            }
        }
        
        /**
         * Unsets the "note" attribute
         */
        public void unsetNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NOTE$42);
            }
        }
    }
}
