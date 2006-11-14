/*
 * An XML document type.
 * Localname: Spiral
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.SpiralDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Spiral(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class SpiralDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SpiralDocument
{
    
    public SpiralDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPIRAL$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Spiral");
    
    
    /**
     * Gets the "Spiral" element
     */
    public org.landxml.schema.landXML11.SpiralDocument.Spiral getSpiral()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SpiralDocument.Spiral target = null;
            target = (org.landxml.schema.landXML11.SpiralDocument.Spiral)get_store().find_element_user(SPIRAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Spiral" element
     */
    public void setSpiral(org.landxml.schema.landXML11.SpiralDocument.Spiral spiral)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SpiralDocument.Spiral target = null;
            target = (org.landxml.schema.landXML11.SpiralDocument.Spiral)get_store().find_element_user(SPIRAL$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.SpiralDocument.Spiral)get_store().add_element_user(SPIRAL$0);
            }
            target.set(spiral);
        }
    }
    
    /**
     * Appends and returns a new empty "Spiral" element
     */
    public org.landxml.schema.landXML11.SpiralDocument.Spiral addNewSpiral()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SpiralDocument.Spiral target = null;
            target = (org.landxml.schema.landXML11.SpiralDocument.Spiral)get_store().add_element_user(SPIRAL$0);
            return target;
        }
    }
    /**
     * An XML Spiral(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class SpiralImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SpiralDocument.Spiral
    {
        
        public SpiralImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName START$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Start");
        private static final javax.xml.namespace.QName PI$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PI");
        private static final javax.xml.namespace.QName END$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "End");
        private static final javax.xml.namespace.QName FEATURE$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName LENGTH$8 = 
            new javax.xml.namespace.QName("", "length");
        private static final javax.xml.namespace.QName RADIUSEND$10 = 
            new javax.xml.namespace.QName("", "radiusEnd");
        private static final javax.xml.namespace.QName RADIUSSTART$12 = 
            new javax.xml.namespace.QName("", "radiusStart");
        private static final javax.xml.namespace.QName ROT$14 = 
            new javax.xml.namespace.QName("", "rot");
        private static final javax.xml.namespace.QName SPITYPE$16 = 
            new javax.xml.namespace.QName("", "spiType");
        private static final javax.xml.namespace.QName CHORD$18 = 
            new javax.xml.namespace.QName("", "chord");
        private static final javax.xml.namespace.QName CONSTANT$20 = 
            new javax.xml.namespace.QName("", "constant");
        private static final javax.xml.namespace.QName DESC$22 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName DIREND$24 = 
            new javax.xml.namespace.QName("", "dirEnd");
        private static final javax.xml.namespace.QName DIRSTART$26 = 
            new javax.xml.namespace.QName("", "dirStart");
        private static final javax.xml.namespace.QName NAME$28 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName THETA$30 = 
            new javax.xml.namespace.QName("", "theta");
        private static final javax.xml.namespace.QName TOTALY$32 = 
            new javax.xml.namespace.QName("", "totalY");
        private static final javax.xml.namespace.QName TOTALX$34 = 
            new javax.xml.namespace.QName("", "totalX");
        private static final javax.xml.namespace.QName STASTART$36 = 
            new javax.xml.namespace.QName("", "staStart");
        private static final javax.xml.namespace.QName STATE$38 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName TANLONG$40 = 
            new javax.xml.namespace.QName("", "tanLong");
        private static final javax.xml.namespace.QName TANSHORT$42 = 
            new javax.xml.namespace.QName("", "tanShort");
        private static final javax.xml.namespace.QName OID$44 = 
            new javax.xml.namespace.QName("", "oID");
        
        
        /**
         * Gets a List of "Start" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PointType> getStartList()
        {
            final class StartList extends java.util.AbstractList<org.landxml.schema.landXML11.PointType>
            {
                public org.landxml.schema.landXML11.PointType get(int i)
                    { return SpiralImpl.this.getStartArray(i); }
                
                public org.landxml.schema.landXML11.PointType set(int i, org.landxml.schema.landXML11.PointType o)
                {
                    org.landxml.schema.landXML11.PointType old = SpiralImpl.this.getStartArray(i);
                    SpiralImpl.this.setStartArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PointType o)
                    { SpiralImpl.this.insertNewStart(i).set(o); }
                
                public org.landxml.schema.landXML11.PointType remove(int i)
                {
                    org.landxml.schema.landXML11.PointType old = SpiralImpl.this.getStartArray(i);
                    SpiralImpl.this.removeStart(i);
                    return old;
                }
                
                public int size()
                    { return SpiralImpl.this.sizeOfStartArray(); }
                
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
         * Gets a List of "PI" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PointType> getPIList()
        {
            final class PIList extends java.util.AbstractList<org.landxml.schema.landXML11.PointType>
            {
                public org.landxml.schema.landXML11.PointType get(int i)
                    { return SpiralImpl.this.getPIArray(i); }
                
                public org.landxml.schema.landXML11.PointType set(int i, org.landxml.schema.landXML11.PointType o)
                {
                    org.landxml.schema.landXML11.PointType old = SpiralImpl.this.getPIArray(i);
                    SpiralImpl.this.setPIArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PointType o)
                    { SpiralImpl.this.insertNewPI(i).set(o); }
                
                public org.landxml.schema.landXML11.PointType remove(int i)
                {
                    org.landxml.schema.landXML11.PointType old = SpiralImpl.this.getPIArray(i);
                    SpiralImpl.this.removePI(i);
                    return old;
                }
                
                public int size()
                    { return SpiralImpl.this.sizeOfPIArray(); }
                
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
         * Gets a List of "End" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PointType> getEndList()
        {
            final class EndList extends java.util.AbstractList<org.landxml.schema.landXML11.PointType>
            {
                public org.landxml.schema.landXML11.PointType get(int i)
                    { return SpiralImpl.this.getEndArray(i); }
                
                public org.landxml.schema.landXML11.PointType set(int i, org.landxml.schema.landXML11.PointType o)
                {
                    org.landxml.schema.landXML11.PointType old = SpiralImpl.this.getEndArray(i);
                    SpiralImpl.this.setEndArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PointType o)
                    { SpiralImpl.this.insertNewEnd(i).set(o); }
                
                public org.landxml.schema.landXML11.PointType remove(int i)
                {
                    org.landxml.schema.landXML11.PointType old = SpiralImpl.this.getEndArray(i);
                    SpiralImpl.this.removeEnd(i);
                    return old;
                }
                
                public int size()
                    { return SpiralImpl.this.sizeOfEndArray(); }
                
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
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return SpiralImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = SpiralImpl.this.getFeatureArray(i);
                    SpiralImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { SpiralImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = SpiralImpl.this.getFeatureArray(i);
                    SpiralImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return SpiralImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$6, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$6, i);
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
                return get_store().count_elements(FEATURE$6);
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
                arraySetterHelper(featureArray, FEATURE$6);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$6, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$6, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$6);
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
                get_store().remove_element(FEATURE$6, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$8);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTH$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LENGTH$8);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTH$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LENGTH$8);
                }
                target.set(length);
            }
        }
        
        /**
         * Gets the "radiusEnd" attribute
         */
        public double getRadiusEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RADIUSEND$10);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "radiusEnd" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetRadiusEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RADIUSEND$10);
                return target;
            }
        }
        
        /**
         * Sets the "radiusEnd" attribute
         */
        public void setRadiusEnd(double radiusEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RADIUSEND$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RADIUSEND$10);
                }
                target.setDoubleValue(radiusEnd);
            }
        }
        
        /**
         * Sets (as xml) the "radiusEnd" attribute
         */
        public void xsetRadiusEnd(org.apache.xmlbeans.XmlDouble radiusEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RADIUSEND$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RADIUSEND$10);
                }
                target.set(radiusEnd);
            }
        }
        
        /**
         * Gets the "radiusStart" attribute
         */
        public double getRadiusStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RADIUSSTART$12);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "radiusStart" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetRadiusStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RADIUSSTART$12);
                return target;
            }
        }
        
        /**
         * Sets the "radiusStart" attribute
         */
        public void setRadiusStart(double radiusStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RADIUSSTART$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RADIUSSTART$12);
                }
                target.setDoubleValue(radiusStart);
            }
        }
        
        /**
         * Sets (as xml) the "radiusStart" attribute
         */
        public void xsetRadiusStart(org.apache.xmlbeans.XmlDouble radiusStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RADIUSSTART$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RADIUSSTART$12);
                }
                target.set(radiusStart);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROT$14);
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
                target = (org.landxml.schema.landXML11.Clockwise)get_store().find_attribute_user(ROT$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROT$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROT$14);
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
                target = (org.landxml.schema.landXML11.Clockwise)get_store().find_attribute_user(ROT$14);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Clockwise)get_store().add_attribute_user(ROT$14);
                }
                target.set(rot);
            }
        }
        
        /**
         * Gets the "spiType" attribute
         */
        public org.landxml.schema.landXML11.SpiralType.Enum getSpiType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPITYPE$16);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.SpiralType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "spiType" attribute
         */
        public org.landxml.schema.landXML11.SpiralType xgetSpiType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SpiralType target = null;
                target = (org.landxml.schema.landXML11.SpiralType)get_store().find_attribute_user(SPITYPE$16);
                return target;
            }
        }
        
        /**
         * Sets the "spiType" attribute
         */
        public void setSpiType(org.landxml.schema.landXML11.SpiralType.Enum spiType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPITYPE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPITYPE$16);
                }
                target.setEnumValue(spiType);
            }
        }
        
        /**
         * Sets (as xml) the "spiType" attribute
         */
        public void xsetSpiType(org.landxml.schema.landXML11.SpiralType spiType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SpiralType target = null;
                target = (org.landxml.schema.landXML11.SpiralType)get_store().find_attribute_user(SPITYPE$16);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SpiralType)get_store().add_attribute_user(SPITYPE$16);
                }
                target.set(spiType);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHORD$18);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CHORD$18);
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
                return get_store().find_attribute_user(CHORD$18) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHORD$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHORD$18);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CHORD$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CHORD$18);
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
                get_store().remove_attribute(CHORD$18);
            }
        }
        
        /**
         * Gets the "constant" attribute
         */
        public double getConstant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONSTANT$20);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "constant" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetConstant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CONSTANT$20);
                return target;
            }
        }
        
        /**
         * True if has "constant" attribute
         */
        public boolean isSetConstant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CONSTANT$20) != null;
            }
        }
        
        /**
         * Sets the "constant" attribute
         */
        public void setConstant(double constant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONSTANT$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONSTANT$20);
                }
                target.setDoubleValue(constant);
            }
        }
        
        /**
         * Sets (as xml) the "constant" attribute
         */
        public void xsetConstant(org.apache.xmlbeans.XmlDouble constant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CONSTANT$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CONSTANT$20);
                }
                target.set(constant);
            }
        }
        
        /**
         * Unsets the "constant" attribute
         */
        public void unsetConstant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CONSTANT$20);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$22);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$22);
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
                return get_store().find_attribute_user(DESC$22) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$22);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$22);
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
                get_store().remove_attribute(DESC$22);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIREND$24);
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
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(DIREND$24);
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
                return get_store().find_attribute_user(DIREND$24) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIREND$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIREND$24);
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
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(DIREND$24);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Direction)get_store().add_attribute_user(DIREND$24);
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
                get_store().remove_attribute(DIREND$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRSTART$26);
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
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(DIRSTART$26);
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
                return get_store().find_attribute_user(DIRSTART$26) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRSTART$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIRSTART$26);
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
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(DIRSTART$26);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Direction)get_store().add_attribute_user(DIRSTART$26);
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
                get_store().remove_attribute(DIRSTART$26);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$28);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$28);
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
                return get_store().find_attribute_user(NAME$28) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$28);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$28);
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
                get_store().remove_attribute(NAME$28);
            }
        }
        
        /**
         * Gets the "theta" attribute
         */
        public double getTheta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THETA$30);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "theta" attribute
         */
        public org.landxml.schema.landXML11.Angle xgetTheta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Angle target = null;
                target = (org.landxml.schema.landXML11.Angle)get_store().find_attribute_user(THETA$30);
                return target;
            }
        }
        
        /**
         * True if has "theta" attribute
         */
        public boolean isSetTheta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(THETA$30) != null;
            }
        }
        
        /**
         * Sets the "theta" attribute
         */
        public void setTheta(double theta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THETA$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THETA$30);
                }
                target.setDoubleValue(theta);
            }
        }
        
        /**
         * Sets (as xml) the "theta" attribute
         */
        public void xsetTheta(org.landxml.schema.landXML11.Angle theta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Angle target = null;
                target = (org.landxml.schema.landXML11.Angle)get_store().find_attribute_user(THETA$30);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Angle)get_store().add_attribute_user(THETA$30);
                }
                target.set(theta);
            }
        }
        
        /**
         * Unsets the "theta" attribute
         */
        public void unsetTheta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(THETA$30);
            }
        }
        
        /**
         * Gets the "totalY" attribute
         */
        public double getTotalY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALY$32);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "totalY" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetTotalY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALY$32);
                return target;
            }
        }
        
        /**
         * True if has "totalY" attribute
         */
        public boolean isSetTotalY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TOTALY$32) != null;
            }
        }
        
        /**
         * Sets the "totalY" attribute
         */
        public void setTotalY(double totalY)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALY$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALY$32);
                }
                target.setDoubleValue(totalY);
            }
        }
        
        /**
         * Sets (as xml) the "totalY" attribute
         */
        public void xsetTotalY(org.apache.xmlbeans.XmlDouble totalY)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALY$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TOTALY$32);
                }
                target.set(totalY);
            }
        }
        
        /**
         * Unsets the "totalY" attribute
         */
        public void unsetTotalY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TOTALY$32);
            }
        }
        
        /**
         * Gets the "totalX" attribute
         */
        public double getTotalX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALX$34);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "totalX" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetTotalX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALX$34);
                return target;
            }
        }
        
        /**
         * True if has "totalX" attribute
         */
        public boolean isSetTotalX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TOTALX$34) != null;
            }
        }
        
        /**
         * Sets the "totalX" attribute
         */
        public void setTotalX(double totalX)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALX$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALX$34);
                }
                target.setDoubleValue(totalX);
            }
        }
        
        /**
         * Sets (as xml) the "totalX" attribute
         */
        public void xsetTotalX(org.apache.xmlbeans.XmlDouble totalX)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALX$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TOTALX$34);
                }
                target.set(totalX);
            }
        }
        
        /**
         * Unsets the "totalX" attribute
         */
        public void unsetTotalX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TOTALX$34);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STASTART$36);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STASTART$36);
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
                return get_store().find_attribute_user(STASTART$36) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STASTART$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STASTART$36);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STASTART$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(STASTART$36);
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
                get_store().remove_attribute(STASTART$36);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$38);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$38);
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
                return get_store().find_attribute_user(STATE$38) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$38);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$38);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$38);
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
                get_store().remove_attribute(STATE$38);
            }
        }
        
        /**
         * Gets the "tanLong" attribute
         */
        public double getTanLong()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TANLONG$40);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "tanLong" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetTanLong()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TANLONG$40);
                return target;
            }
        }
        
        /**
         * True if has "tanLong" attribute
         */
        public boolean isSetTanLong()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TANLONG$40) != null;
            }
        }
        
        /**
         * Sets the "tanLong" attribute
         */
        public void setTanLong(double tanLong)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TANLONG$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TANLONG$40);
                }
                target.setDoubleValue(tanLong);
            }
        }
        
        /**
         * Sets (as xml) the "tanLong" attribute
         */
        public void xsetTanLong(org.apache.xmlbeans.XmlDouble tanLong)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TANLONG$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TANLONG$40);
                }
                target.set(tanLong);
            }
        }
        
        /**
         * Unsets the "tanLong" attribute
         */
        public void unsetTanLong()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TANLONG$40);
            }
        }
        
        /**
         * Gets the "tanShort" attribute
         */
        public double getTanShort()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TANSHORT$42);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "tanShort" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetTanShort()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TANSHORT$42);
                return target;
            }
        }
        
        /**
         * True if has "tanShort" attribute
         */
        public boolean isSetTanShort()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TANSHORT$42) != null;
            }
        }
        
        /**
         * Sets the "tanShort" attribute
         */
        public void setTanShort(double tanShort)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TANSHORT$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TANSHORT$42);
                }
                target.setDoubleValue(tanShort);
            }
        }
        
        /**
         * Sets (as xml) the "tanShort" attribute
         */
        public void xsetTanShort(org.apache.xmlbeans.XmlDouble tanShort)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TANSHORT$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TANSHORT$42);
                }
                target.set(tanShort);
            }
        }
        
        /**
         * Unsets the "tanShort" attribute
         */
        public void unsetTanShort()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TANSHORT$42);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$44);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$44);
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
                return get_store().find_attribute_user(OID$44) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OID$44);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OID$44);
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
                get_store().remove_attribute(OID$44);
            }
        }
    }
}
