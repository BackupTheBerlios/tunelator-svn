/*
 * An XML document type.
 * Localname: IrregularLine
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.IrregularLineDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one IrregularLine(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class IrregularLineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.IrregularLineDocument
{
    
    public IrregularLineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IRREGULARLINE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "IrregularLine");
    
    
    /**
     * Gets the "IrregularLine" element
     */
    public org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine getIrregularLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine target = null;
            target = (org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine)get_store().find_element_user(IRREGULARLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IrregularLine" element
     */
    public void setIrregularLine(org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine irregularLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine target = null;
            target = (org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine)get_store().find_element_user(IRREGULARLINE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine)get_store().add_element_user(IRREGULARLINE$0);
            }
            target.set(irregularLine);
        }
    }
    
    /**
     * Appends and returns a new empty "IrregularLine" element
     */
    public org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine addNewIrregularLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine target = null;
            target = (org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine)get_store().add_element_user(IRREGULARLINE$0);
            return target;
        }
    }
    /**
     * An XML IrregularLine(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class IrregularLineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.IrregularLineDocument.IrregularLine
    {
        
        public IrregularLineImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName START$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Start");
        private static final javax.xml.namespace.QName END$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "End");
        private static final javax.xml.namespace.QName PNTLIST2D$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PntList2D");
        private static final javax.xml.namespace.QName PNTLIST3D$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PntList3D");
        private static final javax.xml.namespace.QName FEATURE$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName DESC$10 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName DIR$12 = 
            new javax.xml.namespace.QName("", "dir");
        private static final javax.xml.namespace.QName LENGTH$14 = 
            new javax.xml.namespace.QName("", "length");
        private static final javax.xml.namespace.QName NAME$16 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName STASTART$18 = 
            new javax.xml.namespace.QName("", "staStart");
        private static final javax.xml.namespace.QName STATE$20 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName OID$22 = 
            new javax.xml.namespace.QName("", "oID");
        private static final javax.xml.namespace.QName SOURCE$24 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName NOTE$26 = 
            new javax.xml.namespace.QName("", "note");
        
        
        /**
         * Gets the "Start" element
         */
        public org.landxml.schema.landXML11.PointType getStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(START$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Start" element
         */
        public void setStart(org.landxml.schema.landXML11.PointType start)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(START$0, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(START$0);
                }
                target.set(start);
            }
        }
        
        /**
         * Appends and returns a new empty "Start" element
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
         * Gets the "End" element
         */
        public org.landxml.schema.landXML11.PointType getEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(END$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "End" element
         */
        public void setEnd(org.landxml.schema.landXML11.PointType end)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(END$2, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(END$2);
                }
                target.set(end);
            }
        }
        
        /**
         * Appends and returns a new empty "End" element
         */
        public org.landxml.schema.landXML11.PointType addNewEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(END$2);
                return target;
            }
        }
        
        /**
         * Gets the "PntList2D" element
         */
        public java.util.List getPntList2D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PNTLIST2D$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "PntList2D" element
         */
        public org.landxml.schema.landXML11.PntList2DDocument.PntList2D xgetPntList2D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntList2DDocument.PntList2D target = null;
                target = (org.landxml.schema.landXML11.PntList2DDocument.PntList2D)get_store().find_element_user(PNTLIST2D$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "PntList2D" element
         */
        public boolean isSetPntList2D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PNTLIST2D$4) != 0;
            }
        }
        
        /**
         * Sets the "PntList2D" element
         */
        public void setPntList2D(java.util.List pntList2D)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PNTLIST2D$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PNTLIST2D$4);
                }
                target.setListValue(pntList2D);
            }
        }
        
        /**
         * Sets (as xml) the "PntList2D" element
         */
        public void xsetPntList2D(org.landxml.schema.landXML11.PntList2DDocument.PntList2D pntList2D)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntList2DDocument.PntList2D target = null;
                target = (org.landxml.schema.landXML11.PntList2DDocument.PntList2D)get_store().find_element_user(PNTLIST2D$4, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PntList2DDocument.PntList2D)get_store().add_element_user(PNTLIST2D$4);
                }
                target.set(pntList2D);
            }
        }
        
        /**
         * Unsets the "PntList2D" element
         */
        public void unsetPntList2D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PNTLIST2D$4, 0);
            }
        }
        
        /**
         * Gets the "PntList3D" element
         */
        public java.util.List getPntList3D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PNTLIST3D$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "PntList3D" element
         */
        public org.landxml.schema.landXML11.PntList3DDocument.PntList3D xgetPntList3D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntList3DDocument.PntList3D target = null;
                target = (org.landxml.schema.landXML11.PntList3DDocument.PntList3D)get_store().find_element_user(PNTLIST3D$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "PntList3D" element
         */
        public boolean isSetPntList3D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PNTLIST3D$6) != 0;
            }
        }
        
        /**
         * Sets the "PntList3D" element
         */
        public void setPntList3D(java.util.List pntList3D)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PNTLIST3D$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PNTLIST3D$6);
                }
                target.setListValue(pntList3D);
            }
        }
        
        /**
         * Sets (as xml) the "PntList3D" element
         */
        public void xsetPntList3D(org.landxml.schema.landXML11.PntList3DDocument.PntList3D pntList3D)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PntList3DDocument.PntList3D target = null;
                target = (org.landxml.schema.landXML11.PntList3DDocument.PntList3D)get_store().find_element_user(PNTLIST3D$6, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PntList3DDocument.PntList3D)get_store().add_element_user(PNTLIST3D$6);
                }
                target.set(pntList3D);
            }
        }
        
        /**
         * Unsets the "PntList3D" element
         */
        public void unsetPntList3D()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PNTLIST3D$6, 0);
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
                    { return IrregularLineImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = IrregularLineImpl.this.getFeatureArray(i);
                    IrregularLineImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { IrregularLineImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = IrregularLineImpl.this.getFeatureArray(i);
                    IrregularLineImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return IrregularLineImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "desc" attribute
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$10);
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
                return get_store().find_attribute_user(DESC$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$10);
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
                get_store().remove_attribute(DESC$10);
            }
        }
        
        /**
         * Gets the "dir" attribute
         */
        public double getDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$12);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "dir" attribute
         */
        public org.landxml.schema.landXML11.Direction xgetDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Direction target = null;
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(DIR$12);
                return target;
            }
        }
        
        /**
         * True if has "dir" attribute
         */
        public boolean isSetDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DIR$12) != null;
            }
        }
        
        /**
         * Sets the "dir" attribute
         */
        public void setDir(double dir)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIR$12);
                }
                target.setDoubleValue(dir);
            }
        }
        
        /**
         * Sets (as xml) the "dir" attribute
         */
        public void xsetDir(org.landxml.schema.landXML11.Direction dir)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Direction target = null;
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(DIR$12);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Direction)get_store().add_attribute_user(DIR$12);
                }
                target.set(dir);
            }
        }
        
        /**
         * Unsets the "dir" attribute
         */
        public void unsetDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DIR$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$14);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTH$14);
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
                return get_store().find_attribute_user(LENGTH$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LENGTH$14);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTH$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LENGTH$14);
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
                get_store().remove_attribute(LENGTH$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$16);
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
                return get_store().find_attribute_user(NAME$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$16);
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
                get_store().remove_attribute(NAME$16);
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
        public org.apache.xmlbeans.XmlDouble xgetStaStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STASTART$18);
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
        public void xsetStaStart(org.apache.xmlbeans.XmlDouble staStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STASTART$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(STASTART$18);
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
         * Gets the "state" attribute
         */
        public org.landxml.schema.landXML11.StateType.Enum getState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$20);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$20);
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
                return get_store().find_attribute_user(STATE$20) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$20);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$20);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$20);
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
                get_store().remove_attribute(STATE$20);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$22);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$22);
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
                return get_store().find_attribute_user(OID$22) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OID$22);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OID$22);
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
                get_store().remove_attribute(OID$22);
            }
        }
        
        /**
         * Gets the "source" attribute
         */
        public java.lang.String getSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "source" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOURCE$24);
                return target;
            }
        }
        
        /**
         * True if has "source" attribute
         */
        public boolean isSetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SOURCE$24) != null;
            }
        }
        
        /**
         * Sets the "source" attribute
         */
        public void setSource(java.lang.String source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$24);
                }
                target.setStringValue(source);
            }
        }
        
        /**
         * Sets (as xml) the "source" attribute
         */
        public void xsetSource(org.apache.xmlbeans.XmlString source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOURCE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SOURCE$24);
                }
                target.set(source);
            }
        }
        
        /**
         * Unsets the "source" attribute
         */
        public void unsetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SOURCE$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOTE$26);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NOTE$26);
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
                return get_store().find_attribute_user(NOTE$26) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOTE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOTE$26);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NOTE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NOTE$26);
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
                get_store().remove_attribute(NOTE$26);
            }
        }
    }
}
