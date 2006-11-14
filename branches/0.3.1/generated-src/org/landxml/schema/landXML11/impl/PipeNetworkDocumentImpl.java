/*
 * An XML document type.
 * Localname: PipeNetwork
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PipeNetworkDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one PipeNetwork(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class PipeNetworkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PipeNetworkDocument
{
    
    public PipeNetworkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PIPENETWORK$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PipeNetwork");
    
    
    /**
     * Gets the "PipeNetwork" element
     */
    public org.landxml.schema.landXML11.PipeNetworkDocument.PipeNetwork getPipeNetwork()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PipeNetworkDocument.PipeNetwork target = null;
            target = (org.landxml.schema.landXML11.PipeNetworkDocument.PipeNetwork)get_store().find_element_user(PIPENETWORK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PipeNetwork" element
     */
    public void setPipeNetwork(org.landxml.schema.landXML11.PipeNetworkDocument.PipeNetwork pipeNetwork)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PipeNetworkDocument.PipeNetwork target = null;
            target = (org.landxml.schema.landXML11.PipeNetworkDocument.PipeNetwork)get_store().find_element_user(PIPENETWORK$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PipeNetworkDocument.PipeNetwork)get_store().add_element_user(PIPENETWORK$0);
            }
            target.set(pipeNetwork);
        }
    }
    
    /**
     * Appends and returns a new empty "PipeNetwork" element
     */
    public org.landxml.schema.landXML11.PipeNetworkDocument.PipeNetwork addNewPipeNetwork()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PipeNetworkDocument.PipeNetwork target = null;
            target = (org.landxml.schema.landXML11.PipeNetworkDocument.PipeNetwork)get_store().add_element_user(PIPENETWORK$0);
            return target;
        }
    }
    /**
     * An XML PipeNetwork(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class PipeNetworkImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PipeNetworkDocument.PipeNetwork
    {
        
        public PipeNetworkImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STRUCTS$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Structs");
        private static final javax.xml.namespace.QName PIPES$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Pipes");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName NAME$6 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName PIPENETTYPE$8 = 
            new javax.xml.namespace.QName("", "pipeNetType");
        private static final javax.xml.namespace.QName ALIGNMENTREF$10 = 
            new javax.xml.namespace.QName("", "alignmentRef");
        private static final javax.xml.namespace.QName DESC$12 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName OID$14 = 
            new javax.xml.namespace.QName("", "oID");
        private static final javax.xml.namespace.QName STATE$16 = 
            new javax.xml.namespace.QName("", "state");
        
        
        /**
         * Gets the "Structs" element
         */
        public org.landxml.schema.landXML11.StructsDocument.Structs getStructs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StructsDocument.Structs target = null;
                target = (org.landxml.schema.landXML11.StructsDocument.Structs)get_store().find_element_user(STRUCTS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Structs" element
         */
        public void setStructs(org.landxml.schema.landXML11.StructsDocument.Structs structs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StructsDocument.Structs target = null;
                target = (org.landxml.schema.landXML11.StructsDocument.Structs)get_store().find_element_user(STRUCTS$0, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StructsDocument.Structs)get_store().add_element_user(STRUCTS$0);
                }
                target.set(structs);
            }
        }
        
        /**
         * Appends and returns a new empty "Structs" element
         */
        public org.landxml.schema.landXML11.StructsDocument.Structs addNewStructs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StructsDocument.Structs target = null;
                target = (org.landxml.schema.landXML11.StructsDocument.Structs)get_store().add_element_user(STRUCTS$0);
                return target;
            }
        }
        
        /**
         * Gets the "Pipes" element
         */
        public org.landxml.schema.landXML11.PipesDocument.Pipes getPipes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PipesDocument.Pipes target = null;
                target = (org.landxml.schema.landXML11.PipesDocument.Pipes)get_store().find_element_user(PIPES$2, 0);
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
                target = (org.landxml.schema.landXML11.PipesDocument.Pipes)get_store().find_element_user(PIPES$2, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PipesDocument.Pipes)get_store().add_element_user(PIPES$2);
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
                target = (org.landxml.schema.landXML11.PipesDocument.Pipes)get_store().add_element_user(PIPES$2);
                return target;
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
                    { return PipeNetworkImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = PipeNetworkImpl.this.getFeatureArray(i);
                    PipeNetworkImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { PipeNetworkImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = PipeNetworkImpl.this.getFeatureArray(i);
                    PipeNetworkImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return PipeNetworkImpl.this.sizeOfFeatureArray(); }
                
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
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "pipeNetType" attribute
         */
        public org.landxml.schema.landXML11.PipeNetworkType.Enum getPipeNetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PIPENETTYPE$8);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.PipeNetworkType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "pipeNetType" attribute
         */
        public org.landxml.schema.landXML11.PipeNetworkType xgetPipeNetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PipeNetworkType target = null;
                target = (org.landxml.schema.landXML11.PipeNetworkType)get_store().find_attribute_user(PIPENETTYPE$8);
                return target;
            }
        }
        
        /**
         * Sets the "pipeNetType" attribute
         */
        public void setPipeNetType(org.landxml.schema.landXML11.PipeNetworkType.Enum pipeNetType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PIPENETTYPE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PIPENETTYPE$8);
                }
                target.setEnumValue(pipeNetType);
            }
        }
        
        /**
         * Sets (as xml) the "pipeNetType" attribute
         */
        public void xsetPipeNetType(org.landxml.schema.landXML11.PipeNetworkType pipeNetType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PipeNetworkType target = null;
                target = (org.landxml.schema.landXML11.PipeNetworkType)get_store().find_attribute_user(PIPENETTYPE$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PipeNetworkType)get_store().add_attribute_user(PIPENETTYPE$8);
                }
                target.set(pipeNetType);
            }
        }
        
        /**
         * Gets the "alignmentRef" attribute
         */
        public java.lang.String getAlignmentRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNMENTREF$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "alignmentRef" attribute
         */
        public org.landxml.schema.landXML11.AlignmentNameRef xgetAlignmentRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignmentNameRef target = null;
                target = (org.landxml.schema.landXML11.AlignmentNameRef)get_store().find_attribute_user(ALIGNMENTREF$10);
                return target;
            }
        }
        
        /**
         * True if has "alignmentRef" attribute
         */
        public boolean isSetAlignmentRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ALIGNMENTREF$10) != null;
            }
        }
        
        /**
         * Sets the "alignmentRef" attribute
         */
        public void setAlignmentRef(java.lang.String alignmentRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNMENTREF$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALIGNMENTREF$10);
                }
                target.setStringValue(alignmentRef);
            }
        }
        
        /**
         * Sets (as xml) the "alignmentRef" attribute
         */
        public void xsetAlignmentRef(org.landxml.schema.landXML11.AlignmentNameRef alignmentRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignmentNameRef target = null;
                target = (org.landxml.schema.landXML11.AlignmentNameRef)get_store().find_attribute_user(ALIGNMENTREF$10);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.AlignmentNameRef)get_store().add_attribute_user(ALIGNMENTREF$10);
                }
                target.set(alignmentRef);
            }
        }
        
        /**
         * Unsets the "alignmentRef" attribute
         */
        public void unsetAlignmentRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ALIGNMENTREF$10);
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
         * Gets the "oID" attribute
         */
        public java.lang.String getOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$14);
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
                return get_store().find_attribute_user(OID$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OID$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OID$14);
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
                get_store().remove_attribute(OID$14);
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
    }
}
