/*
 * An XML document type.
 * Localname: Struct
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.StructDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Struct(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class StructDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.StructDocument
{
    
    public StructDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCT$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Struct");
    
    
    /**
     * Gets the "Struct" element
     */
    public org.landxml.schema.landXML11.StructDocument.Struct getStruct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.StructDocument.Struct target = null;
            target = (org.landxml.schema.landXML11.StructDocument.Struct)get_store().find_element_user(STRUCT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Struct" element
     */
    public void setStruct(org.landxml.schema.landXML11.StructDocument.Struct struct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.StructDocument.Struct target = null;
            target = (org.landxml.schema.landXML11.StructDocument.Struct)get_store().find_element_user(STRUCT$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.StructDocument.Struct)get_store().add_element_user(STRUCT$0);
            }
            target.set(struct);
        }
    }
    
    /**
     * Appends and returns a new empty "Struct" element
     */
    public org.landxml.schema.landXML11.StructDocument.Struct addNewStruct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.StructDocument.Struct target = null;
            target = (org.landxml.schema.landXML11.StructDocument.Struct)get_store().add_element_user(STRUCT$0);
            return target;
        }
    }
    /**
     * An XML Struct(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class StructImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.StructDocument.Struct
    {
        
        public StructImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CENTER$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Center");
        private static final javax.xml.namespace.QName CIRCSTRUCT$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CircStruct");
        private static final javax.xml.namespace.QName RECTSTRUCT$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "RectStruct");
        private static final javax.xml.namespace.QName INLETSTRUCT$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "InletStruct");
        private static final javax.xml.namespace.QName OUTLETSTRUCT$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "OutletStruct");
        private static final javax.xml.namespace.QName CONNECTION$10 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Connection");
        private static final javax.xml.namespace.QName INVERT$12 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Invert");
        private static final javax.xml.namespace.QName STRUCTFLOW$14 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "StructFlow");
        private static final javax.xml.namespace.QName FEATURE$16 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName NAME$18 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESC$20 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName ELEVRIM$22 = 
            new javax.xml.namespace.QName("", "elevRim");
        private static final javax.xml.namespace.QName ELEVSUMP$24 = 
            new javax.xml.namespace.QName("", "elevSump");
        private static final javax.xml.namespace.QName OID$26 = 
            new javax.xml.namespace.QName("", "oID");
        private static final javax.xml.namespace.QName STATE$28 = 
            new javax.xml.namespace.QName("", "state");
        
        
        /**
         * Gets the "Center" element
         */
        public org.landxml.schema.landXML11.PointType getCenter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(CENTER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Center" element
         */
        public void setCenter(org.landxml.schema.landXML11.PointType center)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(CENTER$0, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(CENTER$0);
                }
                target.set(center);
            }
        }
        
        /**
         * Appends and returns a new empty "Center" element
         */
        public org.landxml.schema.landXML11.PointType addNewCenter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(CENTER$0);
                return target;
            }
        }
        
        /**
         * Gets the "CircStruct" element
         */
        public org.landxml.schema.landXML11.CircStructDocument.CircStruct getCircStruct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CircStructDocument.CircStruct target = null;
                target = (org.landxml.schema.landXML11.CircStructDocument.CircStruct)get_store().find_element_user(CIRCSTRUCT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "CircStruct" element
         */
        public boolean isSetCircStruct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CIRCSTRUCT$2) != 0;
            }
        }
        
        /**
         * Sets the "CircStruct" element
         */
        public void setCircStruct(org.landxml.schema.landXML11.CircStructDocument.CircStruct circStruct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CircStructDocument.CircStruct target = null;
                target = (org.landxml.schema.landXML11.CircStructDocument.CircStruct)get_store().find_element_user(CIRCSTRUCT$2, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CircStructDocument.CircStruct)get_store().add_element_user(CIRCSTRUCT$2);
                }
                target.set(circStruct);
            }
        }
        
        /**
         * Appends and returns a new empty "CircStruct" element
         */
        public org.landxml.schema.landXML11.CircStructDocument.CircStruct addNewCircStruct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CircStructDocument.CircStruct target = null;
                target = (org.landxml.schema.landXML11.CircStructDocument.CircStruct)get_store().add_element_user(CIRCSTRUCT$2);
                return target;
            }
        }
        
        /**
         * Unsets the "CircStruct" element
         */
        public void unsetCircStruct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CIRCSTRUCT$2, 0);
            }
        }
        
        /**
         * Gets the "RectStruct" element
         */
        public org.landxml.schema.landXML11.RectStructDocument.RectStruct getRectStruct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RectStructDocument.RectStruct target = null;
                target = (org.landxml.schema.landXML11.RectStructDocument.RectStruct)get_store().find_element_user(RECTSTRUCT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "RectStruct" element
         */
        public boolean isSetRectStruct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECTSTRUCT$4) != 0;
            }
        }
        
        /**
         * Sets the "RectStruct" element
         */
        public void setRectStruct(org.landxml.schema.landXML11.RectStructDocument.RectStruct rectStruct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RectStructDocument.RectStruct target = null;
                target = (org.landxml.schema.landXML11.RectStructDocument.RectStruct)get_store().find_element_user(RECTSTRUCT$4, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.RectStructDocument.RectStruct)get_store().add_element_user(RECTSTRUCT$4);
                }
                target.set(rectStruct);
            }
        }
        
        /**
         * Appends and returns a new empty "RectStruct" element
         */
        public org.landxml.schema.landXML11.RectStructDocument.RectStruct addNewRectStruct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RectStructDocument.RectStruct target = null;
                target = (org.landxml.schema.landXML11.RectStructDocument.RectStruct)get_store().add_element_user(RECTSTRUCT$4);
                return target;
            }
        }
        
        /**
         * Unsets the "RectStruct" element
         */
        public void unsetRectStruct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECTSTRUCT$4, 0);
            }
        }
        
        /**
         * Gets the "InletStruct" element
         */
        public org.landxml.schema.landXML11.InletStructDocument.InletStruct getInletStruct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.InletStructDocument.InletStruct target = null;
                target = (org.landxml.schema.landXML11.InletStructDocument.InletStruct)get_store().find_element_user(INLETSTRUCT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "InletStruct" element
         */
        public boolean isSetInletStruct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INLETSTRUCT$6) != 0;
            }
        }
        
        /**
         * Sets the "InletStruct" element
         */
        public void setInletStruct(org.landxml.schema.landXML11.InletStructDocument.InletStruct inletStruct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.InletStructDocument.InletStruct target = null;
                target = (org.landxml.schema.landXML11.InletStructDocument.InletStruct)get_store().find_element_user(INLETSTRUCT$6, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.InletStructDocument.InletStruct)get_store().add_element_user(INLETSTRUCT$6);
                }
                target.set(inletStruct);
            }
        }
        
        /**
         * Appends and returns a new empty "InletStruct" element
         */
        public org.landxml.schema.landXML11.InletStructDocument.InletStruct addNewInletStruct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.InletStructDocument.InletStruct target = null;
                target = (org.landxml.schema.landXML11.InletStructDocument.InletStruct)get_store().add_element_user(INLETSTRUCT$6);
                return target;
            }
        }
        
        /**
         * Unsets the "InletStruct" element
         */
        public void unsetInletStruct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INLETSTRUCT$6, 0);
            }
        }
        
        /**
         * Gets the "OutletStruct" element
         */
        public org.landxml.schema.landXML11.OutletStructDocument.OutletStruct getOutletStruct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OutletStructDocument.OutletStruct target = null;
                target = (org.landxml.schema.landXML11.OutletStructDocument.OutletStruct)get_store().find_element_user(OUTLETSTRUCT$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "OutletStruct" element
         */
        public boolean isSetOutletStruct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OUTLETSTRUCT$8) != 0;
            }
        }
        
        /**
         * Sets the "OutletStruct" element
         */
        public void setOutletStruct(org.landxml.schema.landXML11.OutletStructDocument.OutletStruct outletStruct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OutletStructDocument.OutletStruct target = null;
                target = (org.landxml.schema.landXML11.OutletStructDocument.OutletStruct)get_store().find_element_user(OUTLETSTRUCT$8, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.OutletStructDocument.OutletStruct)get_store().add_element_user(OUTLETSTRUCT$8);
                }
                target.set(outletStruct);
            }
        }
        
        /**
         * Appends and returns a new empty "OutletStruct" element
         */
        public org.landxml.schema.landXML11.OutletStructDocument.OutletStruct addNewOutletStruct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.OutletStructDocument.OutletStruct target = null;
                target = (org.landxml.schema.landXML11.OutletStructDocument.OutletStruct)get_store().add_element_user(OUTLETSTRUCT$8);
                return target;
            }
        }
        
        /**
         * Unsets the "OutletStruct" element
         */
        public void unsetOutletStruct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OUTLETSTRUCT$8, 0);
            }
        }
        
        /**
         * Gets the "Connection" element
         */
        public org.landxml.schema.landXML11.ConnectionDocument.Connection getConnection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ConnectionDocument.Connection target = null;
                target = (org.landxml.schema.landXML11.ConnectionDocument.Connection)get_store().find_element_user(CONNECTION$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Connection" element
         */
        public boolean isSetConnection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONNECTION$10) != 0;
            }
        }
        
        /**
         * Sets the "Connection" element
         */
        public void setConnection(org.landxml.schema.landXML11.ConnectionDocument.Connection connection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ConnectionDocument.Connection target = null;
                target = (org.landxml.schema.landXML11.ConnectionDocument.Connection)get_store().find_element_user(CONNECTION$10, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ConnectionDocument.Connection)get_store().add_element_user(CONNECTION$10);
                }
                target.set(connection);
            }
        }
        
        /**
         * Appends and returns a new empty "Connection" element
         */
        public org.landxml.schema.landXML11.ConnectionDocument.Connection addNewConnection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ConnectionDocument.Connection target = null;
                target = (org.landxml.schema.landXML11.ConnectionDocument.Connection)get_store().add_element_user(CONNECTION$10);
                return target;
            }
        }
        
        /**
         * Unsets the "Connection" element
         */
        public void unsetConnection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONNECTION$10, 0);
            }
        }
        
        /**
         * Gets a List of "Invert" elements
         */
        public java.util.List<org.landxml.schema.landXML11.InvertDocument.Invert> getInvertList()
        {
            final class InvertList extends java.util.AbstractList<org.landxml.schema.landXML11.InvertDocument.Invert>
            {
                public org.landxml.schema.landXML11.InvertDocument.Invert get(int i)
                    { return StructImpl.this.getInvertArray(i); }
                
                public org.landxml.schema.landXML11.InvertDocument.Invert set(int i, org.landxml.schema.landXML11.InvertDocument.Invert o)
                {
                    org.landxml.schema.landXML11.InvertDocument.Invert old = StructImpl.this.getInvertArray(i);
                    StructImpl.this.setInvertArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.InvertDocument.Invert o)
                    { StructImpl.this.insertNewInvert(i).set(o); }
                
                public org.landxml.schema.landXML11.InvertDocument.Invert remove(int i)
                {
                    org.landxml.schema.landXML11.InvertDocument.Invert old = StructImpl.this.getInvertArray(i);
                    StructImpl.this.removeInvert(i);
                    return old;
                }
                
                public int size()
                    { return StructImpl.this.sizeOfInvertArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new InvertList();
            }
        }
        
        /**
         * Gets array of all "Invert" elements
         */
        public org.landxml.schema.landXML11.InvertDocument.Invert[] getInvertArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INVERT$12, targetList);
                org.landxml.schema.landXML11.InvertDocument.Invert[] result = new org.landxml.schema.landXML11.InvertDocument.Invert[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Invert" element
         */
        public org.landxml.schema.landXML11.InvertDocument.Invert getInvertArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.InvertDocument.Invert target = null;
                target = (org.landxml.schema.landXML11.InvertDocument.Invert)get_store().find_element_user(INVERT$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Invert" element
         */
        public int sizeOfInvertArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INVERT$12);
            }
        }
        
        /**
         * Sets array of all "Invert" element
         */
        public void setInvertArray(org.landxml.schema.landXML11.InvertDocument.Invert[] invertArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(invertArray, INVERT$12);
            }
        }
        
        /**
         * Sets ith "Invert" element
         */
        public void setInvertArray(int i, org.landxml.schema.landXML11.InvertDocument.Invert invert)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.InvertDocument.Invert target = null;
                target = (org.landxml.schema.landXML11.InvertDocument.Invert)get_store().find_element_user(INVERT$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(invert);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Invert" element
         */
        public org.landxml.schema.landXML11.InvertDocument.Invert insertNewInvert(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.InvertDocument.Invert target = null;
                target = (org.landxml.schema.landXML11.InvertDocument.Invert)get_store().insert_element_user(INVERT$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Invert" element
         */
        public org.landxml.schema.landXML11.InvertDocument.Invert addNewInvert()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.InvertDocument.Invert target = null;
                target = (org.landxml.schema.landXML11.InvertDocument.Invert)get_store().add_element_user(INVERT$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "Invert" element
         */
        public void removeInvert(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INVERT$12, i);
            }
        }
        
        /**
         * Gets the "StructFlow" element
         */
        public org.landxml.schema.landXML11.StructFlowDocument.StructFlow getStructFlow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StructFlowDocument.StructFlow target = null;
                target = (org.landxml.schema.landXML11.StructFlowDocument.StructFlow)get_store().find_element_user(STRUCTFLOW$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "StructFlow" element
         */
        public boolean isSetStructFlow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRUCTFLOW$14) != 0;
            }
        }
        
        /**
         * Sets the "StructFlow" element
         */
        public void setStructFlow(org.landxml.schema.landXML11.StructFlowDocument.StructFlow structFlow)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StructFlowDocument.StructFlow target = null;
                target = (org.landxml.schema.landXML11.StructFlowDocument.StructFlow)get_store().find_element_user(STRUCTFLOW$14, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StructFlowDocument.StructFlow)get_store().add_element_user(STRUCTFLOW$14);
                }
                target.set(structFlow);
            }
        }
        
        /**
         * Appends and returns a new empty "StructFlow" element
         */
        public org.landxml.schema.landXML11.StructFlowDocument.StructFlow addNewStructFlow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StructFlowDocument.StructFlow target = null;
                target = (org.landxml.schema.landXML11.StructFlowDocument.StructFlow)get_store().add_element_user(STRUCTFLOW$14);
                return target;
            }
        }
        
        /**
         * Unsets the "StructFlow" element
         */
        public void unsetStructFlow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRUCTFLOW$14, 0);
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
                    { return StructImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = StructImpl.this.getFeatureArray(i);
                    StructImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { StructImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = StructImpl.this.getFeatureArray(i);
                    StructImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return StructImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "desc" attribute
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$20);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$20);
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
                return get_store().find_attribute_user(DESC$20) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$20);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$20);
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
                get_store().remove_attribute(DESC$20);
            }
        }
        
        /**
         * Gets the "elevRim" attribute
         */
        public double getElevRim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEVRIM$22);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "elevRim" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetElevRim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ELEVRIM$22);
                return target;
            }
        }
        
        /**
         * True if has "elevRim" attribute
         */
        public boolean isSetElevRim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ELEVRIM$22) != null;
            }
        }
        
        /**
         * Sets the "elevRim" attribute
         */
        public void setElevRim(double elevRim)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEVRIM$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELEVRIM$22);
                }
                target.setDoubleValue(elevRim);
            }
        }
        
        /**
         * Sets (as xml) the "elevRim" attribute
         */
        public void xsetElevRim(org.apache.xmlbeans.XmlDouble elevRim)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ELEVRIM$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ELEVRIM$22);
                }
                target.set(elevRim);
            }
        }
        
        /**
         * Unsets the "elevRim" attribute
         */
        public void unsetElevRim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ELEVRIM$22);
            }
        }
        
        /**
         * Gets the "elevSump" attribute
         */
        public double getElevSump()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEVSUMP$24);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "elevSump" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetElevSump()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ELEVSUMP$24);
                return target;
            }
        }
        
        /**
         * True if has "elevSump" attribute
         */
        public boolean isSetElevSump()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ELEVSUMP$24) != null;
            }
        }
        
        /**
         * Sets the "elevSump" attribute
         */
        public void setElevSump(double elevSump)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEVSUMP$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELEVSUMP$24);
                }
                target.setDoubleValue(elevSump);
            }
        }
        
        /**
         * Sets (as xml) the "elevSump" attribute
         */
        public void xsetElevSump(org.apache.xmlbeans.XmlDouble elevSump)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ELEVSUMP$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ELEVSUMP$24);
                }
                target.set(elevSump);
            }
        }
        
        /**
         * Unsets the "elevSump" attribute
         */
        public void unsetElevSump()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ELEVSUMP$24);
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
