/*
 * An XML document type.
 * Localname: Monument
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.MonumentDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Monument(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class MonumentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.MonumentDocument
{
    
    public MonumentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MONUMENT$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Monument");
    
    
    /**
     * Gets the "Monument" element
     */
    public org.landxml.schema.landXML11.MonumentDocument.Monument getMonument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.MonumentDocument.Monument target = null;
            target = (org.landxml.schema.landXML11.MonumentDocument.Monument)get_store().find_element_user(MONUMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Monument" element
     */
    public void setMonument(org.landxml.schema.landXML11.MonumentDocument.Monument monument)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.MonumentDocument.Monument target = null;
            target = (org.landxml.schema.landXML11.MonumentDocument.Monument)get_store().find_element_user(MONUMENT$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.MonumentDocument.Monument)get_store().add_element_user(MONUMENT$0);
            }
            target.set(monument);
        }
    }
    
    /**
     * Appends and returns a new empty "Monument" element
     */
    public org.landxml.schema.landXML11.MonumentDocument.Monument addNewMonument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.MonumentDocument.Monument target = null;
            target = (org.landxml.schema.landXML11.MonumentDocument.Monument)get_store().add_element_user(MONUMENT$0);
            return target;
        }
    }
    /**
     * An XML Monument(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class MonumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.MonumentDocument.Monument
    {
        
        public MonumentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName PNTREF$2 = 
            new javax.xml.namespace.QName("", "pntRef");
        private static final javax.xml.namespace.QName DESC$4 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName STATE$6 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName TYPE$8 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName CONDITION$10 = 
            new javax.xml.namespace.QName("", "condition");
        private static final javax.xml.namespace.QName CATEGORY$12 = 
            new javax.xml.namespace.QName("", "category");
        private static final javax.xml.namespace.QName BEACON$14 = 
            new javax.xml.namespace.QName("", "beacon");
        private static final javax.xml.namespace.QName BEACONPROTECTION$16 = 
            new javax.xml.namespace.QName("", "beaconProtection");
        private static final javax.xml.namespace.QName OID$18 = 
            new javax.xml.namespace.QName("", "oID");
        private static final javax.xml.namespace.QName REFERENCE$20 = 
            new javax.xml.namespace.QName("", "reference");
        private static final javax.xml.namespace.QName ORIGINSURVEY$22 = 
            new javax.xml.namespace.QName("", "originSurvey");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "pntRef" attribute
         */
        public java.lang.String getPntRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PNTREF$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pntRef" attribute
         */
        public org.landxml.schema.landXML11.PointNameRef xgetPntRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointNameRef target = null;
                target = (org.landxml.schema.landXML11.PointNameRef)get_store().find_attribute_user(PNTREF$2);
                return target;
            }
        }
        
        /**
         * True if has "pntRef" attribute
         */
        public boolean isSetPntRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PNTREF$2) != null;
            }
        }
        
        /**
         * Sets the "pntRef" attribute
         */
        public void setPntRef(java.lang.String pntRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PNTREF$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PNTREF$2);
                }
                target.setStringValue(pntRef);
            }
        }
        
        /**
         * Sets (as xml) the "pntRef" attribute
         */
        public void xsetPntRef(org.landxml.schema.landXML11.PointNameRef pntRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointNameRef target = null;
                target = (org.landxml.schema.landXML11.PointNameRef)get_store().find_attribute_user(PNTREF$2);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PointNameRef)get_store().add_attribute_user(PNTREF$2);
                }
                target.set(pntRef);
            }
        }
        
        /**
         * Unsets the "pntRef" attribute
         */
        public void unsetPntRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PNTREF$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$4);
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
                return get_store().find_attribute_user(DESC$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$4);
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
                get_store().remove_attribute(DESC$4);
            }
        }
        
        /**
         * Gets the "state" attribute
         */
        public java.lang.String getState()
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
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "state" attribute
         */
        public org.landxml.schema.landXML11.MonumentState xgetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentState target = null;
                target = (org.landxml.schema.landXML11.MonumentState)get_store().find_attribute_user(STATE$6);
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
        public void setState(java.lang.String state)
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
                target.setStringValue(state);
            }
        }
        
        /**
         * Sets (as xml) the "state" attribute
         */
        public void xsetState(org.landxml.schema.landXML11.MonumentState state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentState target = null;
                target = (org.landxml.schema.landXML11.MonumentState)get_store().find_attribute_user(STATE$6);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.MonumentState)get_store().add_attribute_user(STATE$6);
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
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.landxml.schema.landXML11.MonumentType xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentType target = null;
                target = (org.landxml.schema.landXML11.MonumentType)get_store().find_attribute_user(TYPE$8);
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$8) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$8);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.landxml.schema.landXML11.MonumentType type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentType target = null;
                target = (org.landxml.schema.landXML11.MonumentType)get_store().find_attribute_user(TYPE$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.MonumentType)get_store().add_attribute_user(TYPE$8);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$8);
            }
        }
        
        /**
         * Gets the "condition" attribute
         */
        public java.lang.String getCondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONDITION$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "condition" attribute
         */
        public org.landxml.schema.landXML11.MonumentCondition xgetCondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentCondition target = null;
                target = (org.landxml.schema.landXML11.MonumentCondition)get_store().find_attribute_user(CONDITION$10);
                return target;
            }
        }
        
        /**
         * True if has "condition" attribute
         */
        public boolean isSetCondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CONDITION$10) != null;
            }
        }
        
        /**
         * Sets the "condition" attribute
         */
        public void setCondition(java.lang.String condition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONDITION$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONDITION$10);
                }
                target.setStringValue(condition);
            }
        }
        
        /**
         * Sets (as xml) the "condition" attribute
         */
        public void xsetCondition(org.landxml.schema.landXML11.MonumentCondition condition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentCondition target = null;
                target = (org.landxml.schema.landXML11.MonumentCondition)get_store().find_attribute_user(CONDITION$10);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.MonumentCondition)get_store().add_attribute_user(CONDITION$10);
                }
                target.set(condition);
            }
        }
        
        /**
         * Unsets the "condition" attribute
         */
        public void unsetCondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CONDITION$10);
            }
        }
        
        /**
         * Gets the "category" attribute
         */
        public org.landxml.schema.landXML11.MonumentCategory.Enum getCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORY$12);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.MonumentCategory.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "category" attribute
         */
        public org.landxml.schema.landXML11.MonumentCategory xgetCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentCategory target = null;
                target = (org.landxml.schema.landXML11.MonumentCategory)get_store().find_attribute_user(CATEGORY$12);
                return target;
            }
        }
        
        /**
         * True if has "category" attribute
         */
        public boolean isSetCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CATEGORY$12) != null;
            }
        }
        
        /**
         * Sets the "category" attribute
         */
        public void setCategory(org.landxml.schema.landXML11.MonumentCategory.Enum category)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORY$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATEGORY$12);
                }
                target.setEnumValue(category);
            }
        }
        
        /**
         * Sets (as xml) the "category" attribute
         */
        public void xsetCategory(org.landxml.schema.landXML11.MonumentCategory category)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentCategory target = null;
                target = (org.landxml.schema.landXML11.MonumentCategory)get_store().find_attribute_user(CATEGORY$12);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.MonumentCategory)get_store().add_attribute_user(CATEGORY$12);
                }
                target.set(category);
            }
        }
        
        /**
         * Unsets the "category" attribute
         */
        public void unsetCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CATEGORY$12);
            }
        }
        
        /**
         * Gets the "beacon" attribute
         */
        public org.landxml.schema.landXML11.BeaconType.Enum getBeacon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEACON$14);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.BeaconType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "beacon" attribute
         */
        public org.landxml.schema.landXML11.BeaconType xgetBeacon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BeaconType target = null;
                target = (org.landxml.schema.landXML11.BeaconType)get_store().find_attribute_user(BEACON$14);
                return target;
            }
        }
        
        /**
         * True if has "beacon" attribute
         */
        public boolean isSetBeacon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BEACON$14) != null;
            }
        }
        
        /**
         * Sets the "beacon" attribute
         */
        public void setBeacon(org.landxml.schema.landXML11.BeaconType.Enum beacon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEACON$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BEACON$14);
                }
                target.setEnumValue(beacon);
            }
        }
        
        /**
         * Sets (as xml) the "beacon" attribute
         */
        public void xsetBeacon(org.landxml.schema.landXML11.BeaconType beacon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BeaconType target = null;
                target = (org.landxml.schema.landXML11.BeaconType)get_store().find_attribute_user(BEACON$14);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.BeaconType)get_store().add_attribute_user(BEACON$14);
                }
                target.set(beacon);
            }
        }
        
        /**
         * Unsets the "beacon" attribute
         */
        public void unsetBeacon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BEACON$14);
            }
        }
        
        /**
         * Gets the "beaconProtection" attribute
         */
        public org.landxml.schema.landXML11.BeaconProtectionType.Enum getBeaconProtection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEACONPROTECTION$16);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.BeaconProtectionType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "beaconProtection" attribute
         */
        public org.landxml.schema.landXML11.BeaconProtectionType xgetBeaconProtection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BeaconProtectionType target = null;
                target = (org.landxml.schema.landXML11.BeaconProtectionType)get_store().find_attribute_user(BEACONPROTECTION$16);
                return target;
            }
        }
        
        /**
         * True if has "beaconProtection" attribute
         */
        public boolean isSetBeaconProtection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BEACONPROTECTION$16) != null;
            }
        }
        
        /**
         * Sets the "beaconProtection" attribute
         */
        public void setBeaconProtection(org.landxml.schema.landXML11.BeaconProtectionType.Enum beaconProtection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEACONPROTECTION$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BEACONPROTECTION$16);
                }
                target.setEnumValue(beaconProtection);
            }
        }
        
        /**
         * Sets (as xml) the "beaconProtection" attribute
         */
        public void xsetBeaconProtection(org.landxml.schema.landXML11.BeaconProtectionType beaconProtection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BeaconProtectionType target = null;
                target = (org.landxml.schema.landXML11.BeaconProtectionType)get_store().find_attribute_user(BEACONPROTECTION$16);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.BeaconProtectionType)get_store().add_attribute_user(BEACONPROTECTION$16);
                }
                target.set(beaconProtection);
            }
        }
        
        /**
         * Unsets the "beaconProtection" attribute
         */
        public void unsetBeaconProtection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BEACONPROTECTION$16);
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
        
        /**
         * Gets the "reference" attribute
         */
        public java.lang.String getReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFERENCE$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "reference" attribute
         */
        public org.apache.xmlbeans.XmlString xgetReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REFERENCE$20);
                return target;
            }
        }
        
        /**
         * True if has "reference" attribute
         */
        public boolean isSetReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REFERENCE$20) != null;
            }
        }
        
        /**
         * Sets the "reference" attribute
         */
        public void setReference(java.lang.String reference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFERENCE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFERENCE$20);
                }
                target.setStringValue(reference);
            }
        }
        
        /**
         * Sets (as xml) the "reference" attribute
         */
        public void xsetReference(org.apache.xmlbeans.XmlString reference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REFERENCE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REFERENCE$20);
                }
                target.set(reference);
            }
        }
        
        /**
         * Unsets the "reference" attribute
         */
        public void unsetReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REFERENCE$20);
            }
        }
        
        /**
         * Gets the "originSurvey" attribute
         */
        public java.lang.String getOriginSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIGINSURVEY$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "originSurvey" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOriginSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORIGINSURVEY$22);
                return target;
            }
        }
        
        /**
         * True if has "originSurvey" attribute
         */
        public boolean isSetOriginSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ORIGINSURVEY$22) != null;
            }
        }
        
        /**
         * Sets the "originSurvey" attribute
         */
        public void setOriginSurvey(java.lang.String originSurvey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIGINSURVEY$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIGINSURVEY$22);
                }
                target.setStringValue(originSurvey);
            }
        }
        
        /**
         * Sets (as xml) the "originSurvey" attribute
         */
        public void xsetOriginSurvey(org.apache.xmlbeans.XmlString originSurvey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORIGINSURVEY$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ORIGINSURVEY$22);
                }
                target.set(originSurvey);
            }
        }
        
        /**
         * Unsets the "originSurvey" attribute
         */
        public void unsetOriginSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ORIGINSURVEY$22);
            }
        }
    }
}
