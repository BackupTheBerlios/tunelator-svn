/*
 * An XML document type.
 * Localname: VolumeGeom
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.VolumeGeomDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one VolumeGeom(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class VolumeGeomDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.VolumeGeomDocument
{
    
    public VolumeGeomDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VOLUMEGEOM$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "VolumeGeom");
    
    
    /**
     * Gets the "VolumeGeom" element
     */
    public org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom getVolumeGeom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom target = null;
            target = (org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom)get_store().find_element_user(VOLUMEGEOM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "VolumeGeom" element
     */
    public void setVolumeGeom(org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom volumeGeom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom target = null;
            target = (org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom)get_store().find_element_user(VOLUMEGEOM$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom)get_store().add_element_user(VOLUMEGEOM$0);
            }
            target.set(volumeGeom);
        }
    }
    
    /**
     * Appends and returns a new empty "VolumeGeom" element
     */
    public org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom addNewVolumeGeom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom target = null;
            target = (org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom)get_store().add_element_user(VOLUMEGEOM$0);
            return target;
        }
    }
    /**
     * An XML VolumeGeom(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class VolumeGeomImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom
    {
        
        public VolumeGeomImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COORDGEOM$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CoordGeom");
        private static final javax.xml.namespace.QName DESC$2 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName STATE$6 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName OID$8 = 
            new javax.xml.namespace.QName("", "oID");
        
        
        /**
         * Gets a List of "CoordGeom" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom> getCoordGeomList()
        {
            final class CoordGeomList extends java.util.AbstractList<org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom>
            {
                public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom get(int i)
                    { return VolumeGeomImpl.this.getCoordGeomArray(i); }
                
                public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom set(int i, org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom o)
                {
                    org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom old = VolumeGeomImpl.this.getCoordGeomArray(i);
                    VolumeGeomImpl.this.setCoordGeomArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom o)
                    { VolumeGeomImpl.this.insertNewCoordGeom(i).set(o); }
                
                public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom remove(int i)
                {
                    org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom old = VolumeGeomImpl.this.getCoordGeomArray(i);
                    VolumeGeomImpl.this.removeCoordGeom(i);
                    return old;
                }
                
                public int size()
                    { return VolumeGeomImpl.this.sizeOfCoordGeomArray(); }
                
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
                get_store().find_all_element_users(COORDGEOM$0, targetList);
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
                target = (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom)get_store().find_element_user(COORDGEOM$0, i);
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
                return get_store().count_elements(COORDGEOM$0);
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
                arraySetterHelper(coordGeomArray, COORDGEOM$0);
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
                target = (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom)get_store().find_element_user(COORDGEOM$0, i);
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
                target = (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom)get_store().insert_element_user(COORDGEOM$0, i);
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
                target = (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom)get_store().add_element_user(COORDGEOM$0);
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
                get_store().remove_element(COORDGEOM$0, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$2);
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
                return get_store().find_attribute_user(DESC$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$2);
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
                get_store().remove_attribute(DESC$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
                }
                target.set(name);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$6);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$6);
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
                return get_store().find_attribute_user(STATE$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$6);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$6);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$6);
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
                get_store().remove_attribute(STATE$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$8);
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
                return get_store().find_attribute_user(OID$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OID$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OID$8);
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
                get_store().remove_attribute(OID$8);
            }
        }
    }
}
