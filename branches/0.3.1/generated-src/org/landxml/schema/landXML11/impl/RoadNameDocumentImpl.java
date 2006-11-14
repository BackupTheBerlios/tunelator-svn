/*
 * An XML document type.
 * Localname: RoadName
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.RoadNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one RoadName(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class RoadNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.RoadNameDocument
{
    
    public RoadNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROADNAME$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "RoadName");
    
    
    /**
     * Gets the "RoadName" element
     */
    public org.landxml.schema.landXML11.RoadNameDocument.RoadName getRoadName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RoadNameDocument.RoadName target = null;
            target = (org.landxml.schema.landXML11.RoadNameDocument.RoadName)get_store().find_element_user(ROADNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RoadName" element
     */
    public void setRoadName(org.landxml.schema.landXML11.RoadNameDocument.RoadName roadName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RoadNameDocument.RoadName target = null;
            target = (org.landxml.schema.landXML11.RoadNameDocument.RoadName)get_store().find_element_user(ROADNAME$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.RoadNameDocument.RoadName)get_store().add_element_user(ROADNAME$0);
            }
            target.set(roadName);
        }
    }
    
    /**
     * Appends and returns a new empty "RoadName" element
     */
    public org.landxml.schema.landXML11.RoadNameDocument.RoadName addNewRoadName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.RoadNameDocument.RoadName target = null;
            target = (org.landxml.schema.landXML11.RoadNameDocument.RoadName)get_store().add_element_user(ROADNAME$0);
            return target;
        }
    }
    /**
     * An XML RoadName(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class RoadNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.RoadNameDocument.RoadName
    {
        
        public RoadNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROADNAMETYPE$0 = 
            new javax.xml.namespace.QName("", "roadNameType");
        private static final javax.xml.namespace.QName ROADNAME$2 = 
            new javax.xml.namespace.QName("", "roadName");
        private static final javax.xml.namespace.QName ROADNAMESUFFIX$4 = 
            new javax.xml.namespace.QName("", "roadNameSuffix");
        private static final javax.xml.namespace.QName ROADTYPE$6 = 
            new javax.xml.namespace.QName("", "roadType");
        private static final javax.xml.namespace.QName PCLREF$8 = 
            new javax.xml.namespace.QName("", "pclRef");
        
        
        /**
         * Gets the "roadNameType" attribute
         */
        public java.lang.String getRoadNameType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROADNAMETYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "roadNameType" attribute
         */
        public org.landxml.schema.landXML11.RoadNameTypeType xgetRoadNameType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadNameTypeType target = null;
                target = (org.landxml.schema.landXML11.RoadNameTypeType)get_store().find_attribute_user(ROADNAMETYPE$0);
                return target;
            }
        }
        
        /**
         * True if has "roadNameType" attribute
         */
        public boolean isSetRoadNameType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ROADNAMETYPE$0) != null;
            }
        }
        
        /**
         * Sets the "roadNameType" attribute
         */
        public void setRoadNameType(java.lang.String roadNameType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROADNAMETYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROADNAMETYPE$0);
                }
                target.setStringValue(roadNameType);
            }
        }
        
        /**
         * Sets (as xml) the "roadNameType" attribute
         */
        public void xsetRoadNameType(org.landxml.schema.landXML11.RoadNameTypeType roadNameType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadNameTypeType target = null;
                target = (org.landxml.schema.landXML11.RoadNameTypeType)get_store().find_attribute_user(ROADNAMETYPE$0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.RoadNameTypeType)get_store().add_attribute_user(ROADNAMETYPE$0);
                }
                target.set(roadNameType);
            }
        }
        
        /**
         * Unsets the "roadNameType" attribute
         */
        public void unsetRoadNameType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ROADNAMETYPE$0);
            }
        }
        
        /**
         * Gets the "roadName" attribute
         */
        public java.lang.String getRoadName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROADNAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "roadName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRoadName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROADNAME$2);
                return target;
            }
        }
        
        /**
         * True if has "roadName" attribute
         */
        public boolean isSetRoadName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ROADNAME$2) != null;
            }
        }
        
        /**
         * Sets the "roadName" attribute
         */
        public void setRoadName(java.lang.String roadName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROADNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROADNAME$2);
                }
                target.setStringValue(roadName);
            }
        }
        
        /**
         * Sets (as xml) the "roadName" attribute
         */
        public void xsetRoadName(org.apache.xmlbeans.XmlString roadName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROADNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROADNAME$2);
                }
                target.set(roadName);
            }
        }
        
        /**
         * Unsets the "roadName" attribute
         */
        public void unsetRoadName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ROADNAME$2);
            }
        }
        
        /**
         * Gets the "roadNameSuffix" attribute
         */
        public java.lang.String getRoadNameSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROADNAMESUFFIX$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "roadNameSuffix" attribute
         */
        public org.landxml.schema.landXML11.RoadNameSuffixType xgetRoadNameSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadNameSuffixType target = null;
                target = (org.landxml.schema.landXML11.RoadNameSuffixType)get_store().find_attribute_user(ROADNAMESUFFIX$4);
                return target;
            }
        }
        
        /**
         * True if has "roadNameSuffix" attribute
         */
        public boolean isSetRoadNameSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ROADNAMESUFFIX$4) != null;
            }
        }
        
        /**
         * Sets the "roadNameSuffix" attribute
         */
        public void setRoadNameSuffix(java.lang.String roadNameSuffix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROADNAMESUFFIX$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROADNAMESUFFIX$4);
                }
                target.setStringValue(roadNameSuffix);
            }
        }
        
        /**
         * Sets (as xml) the "roadNameSuffix" attribute
         */
        public void xsetRoadNameSuffix(org.landxml.schema.landXML11.RoadNameSuffixType roadNameSuffix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadNameSuffixType target = null;
                target = (org.landxml.schema.landXML11.RoadNameSuffixType)get_store().find_attribute_user(ROADNAMESUFFIX$4);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.RoadNameSuffixType)get_store().add_attribute_user(ROADNAMESUFFIX$4);
                }
                target.set(roadNameSuffix);
            }
        }
        
        /**
         * Unsets the "roadNameSuffix" attribute
         */
        public void unsetRoadNameSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ROADNAMESUFFIX$4);
            }
        }
        
        /**
         * Gets the "roadType" attribute
         */
        public java.lang.String getRoadType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROADTYPE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "roadType" attribute
         */
        public org.landxml.schema.landXML11.RoadTypeType xgetRoadType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadTypeType target = null;
                target = (org.landxml.schema.landXML11.RoadTypeType)get_store().find_attribute_user(ROADTYPE$6);
                return target;
            }
        }
        
        /**
         * True if has "roadType" attribute
         */
        public boolean isSetRoadType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ROADTYPE$6) != null;
            }
        }
        
        /**
         * Sets the "roadType" attribute
         */
        public void setRoadType(java.lang.String roadType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROADTYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROADTYPE$6);
                }
                target.setStringValue(roadType);
            }
        }
        
        /**
         * Sets (as xml) the "roadType" attribute
         */
        public void xsetRoadType(org.landxml.schema.landXML11.RoadTypeType roadType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadTypeType target = null;
                target = (org.landxml.schema.landXML11.RoadTypeType)get_store().find_attribute_user(ROADTYPE$6);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.RoadTypeType)get_store().add_attribute_user(ROADTYPE$6);
                }
                target.set(roadType);
            }
        }
        
        /**
         * Unsets the "roadType" attribute
         */
        public void unsetRoadType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ROADTYPE$6);
            }
        }
        
        /**
         * Gets the "pclRef" attribute
         */
        public java.util.List getPclRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PCLREF$8);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "pclRef" attribute
         */
        public org.landxml.schema.landXML11.ParcelNameRefs xgetPclRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParcelNameRefs target = null;
                target = (org.landxml.schema.landXML11.ParcelNameRefs)get_store().find_attribute_user(PCLREF$8);
                return target;
            }
        }
        
        /**
         * True if has "pclRef" attribute
         */
        public boolean isSetPclRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PCLREF$8) != null;
            }
        }
        
        /**
         * Sets the "pclRef" attribute
         */
        public void setPclRef(java.util.List pclRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PCLREF$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PCLREF$8);
                }
                target.setListValue(pclRef);
            }
        }
        
        /**
         * Sets (as xml) the "pclRef" attribute
         */
        public void xsetPclRef(org.landxml.schema.landXML11.ParcelNameRefs pclRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParcelNameRefs target = null;
                target = (org.landxml.schema.landXML11.ParcelNameRefs)get_store().find_attribute_user(PCLREF$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ParcelNameRefs)get_store().add_attribute_user(PCLREF$8);
                }
                target.set(pclRef);
            }
        }
        
        /**
         * Unsets the "pclRef" attribute
         */
        public void unsetPclRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PCLREF$8);
            }
        }
    }
}
