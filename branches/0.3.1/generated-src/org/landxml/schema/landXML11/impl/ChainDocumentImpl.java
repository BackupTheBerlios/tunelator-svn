/*
 * An XML document type.
 * Localname: Chain
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ChainDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Chain(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ChainDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ChainDocument
{
    
    public ChainDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHAIN$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Chain");
    
    
    /**
     * Gets the "Chain" element
     */
    public org.landxml.schema.landXML11.ChainDocument.Chain getChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ChainDocument.Chain target = null;
            target = (org.landxml.schema.landXML11.ChainDocument.Chain)get_store().find_element_user(CHAIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Chain" element
     */
    public void setChain(org.landxml.schema.landXML11.ChainDocument.Chain chain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ChainDocument.Chain target = null;
            target = (org.landxml.schema.landXML11.ChainDocument.Chain)get_store().find_element_user(CHAIN$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ChainDocument.Chain)get_store().add_element_user(CHAIN$0);
            }
            target.set(chain);
        }
    }
    
    /**
     * Appends and returns a new empty "Chain" element
     */
    public org.landxml.schema.landXML11.ChainDocument.Chain addNewChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ChainDocument.Chain target = null;
            target = (org.landxml.schema.landXML11.ChainDocument.Chain)get_store().add_element_user(CHAIN$0);
            return target;
        }
    }
    /**
     * An XML Chain(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a list type whose items are org.landxml.schema.landXML11.PointNameRef.
     */
    public static class ChainImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.landxml.schema.landXML11.ChainDocument.Chain
    {
        
        public ChainImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected ChainImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESC$2 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName CODE$4 = 
            new javax.xml.namespace.QName("", "code");
        private static final javax.xml.namespace.QName STATE$6 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName POINTGEOMETRY$8 = 
            new javax.xml.namespace.QName("", "pointGeometry");
        private static final javax.xml.namespace.QName DTMATTRIBUTE$10 = 
            new javax.xml.namespace.QName("", "DTMAttribute");
        private static final javax.xml.namespace.QName TIMESTAMP$12 = 
            new javax.xml.namespace.QName("", "timeStamp");
        private static final javax.xml.namespace.QName ROLE$14 = 
            new javax.xml.namespace.QName("", "role");
        
        
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
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$0) != null;
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
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$0);
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
         * Gets the "code" attribute
         */
        public java.lang.String getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "code" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODE$4);
                return target;
            }
        }
        
        /**
         * True if has "code" attribute
         */
        public boolean isSetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CODE$4) != null;
            }
        }
        
        /**
         * Sets the "code" attribute
         */
        public void setCode(java.lang.String code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$4);
                }
                target.setStringValue(code);
            }
        }
        
        /**
         * Sets (as xml) the "code" attribute
         */
        public void xsetCode(org.apache.xmlbeans.XmlString code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODE$4);
                }
                target.set(code);
            }
        }
        
        /**
         * Unsets the "code" attribute
         */
        public void unsetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CODE$4);
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
         * Gets the "pointGeometry" attribute
         */
        public org.landxml.schema.landXML11.PointGeometryType.Enum getPointGeometry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POINTGEOMETRY$8);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.PointGeometryType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "pointGeometry" attribute
         */
        public org.landxml.schema.landXML11.PointGeometryType xgetPointGeometry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointGeometryType target = null;
                target = (org.landxml.schema.landXML11.PointGeometryType)get_store().find_attribute_user(POINTGEOMETRY$8);
                return target;
            }
        }
        
        /**
         * True if has "pointGeometry" attribute
         */
        public boolean isSetPointGeometry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POINTGEOMETRY$8) != null;
            }
        }
        
        /**
         * Sets the "pointGeometry" attribute
         */
        public void setPointGeometry(org.landxml.schema.landXML11.PointGeometryType.Enum pointGeometry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POINTGEOMETRY$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POINTGEOMETRY$8);
                }
                target.setEnumValue(pointGeometry);
            }
        }
        
        /**
         * Sets (as xml) the "pointGeometry" attribute
         */
        public void xsetPointGeometry(org.landxml.schema.landXML11.PointGeometryType pointGeometry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointGeometryType target = null;
                target = (org.landxml.schema.landXML11.PointGeometryType)get_store().find_attribute_user(POINTGEOMETRY$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PointGeometryType)get_store().add_attribute_user(POINTGEOMETRY$8);
                }
                target.set(pointGeometry);
            }
        }
        
        /**
         * Unsets the "pointGeometry" attribute
         */
        public void unsetPointGeometry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POINTGEOMETRY$8);
            }
        }
        
        /**
         * Gets the "DTMAttribute" attribute
         */
        public org.landxml.schema.landXML11.DTMAttributeType.Enum getDTMAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DTMATTRIBUTE$10);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.DTMAttributeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "DTMAttribute" attribute
         */
        public org.landxml.schema.landXML11.DTMAttributeType xgetDTMAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DTMAttributeType target = null;
                target = (org.landxml.schema.landXML11.DTMAttributeType)get_store().find_attribute_user(DTMATTRIBUTE$10);
                return target;
            }
        }
        
        /**
         * True if has "DTMAttribute" attribute
         */
        public boolean isSetDTMAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DTMATTRIBUTE$10) != null;
            }
        }
        
        /**
         * Sets the "DTMAttribute" attribute
         */
        public void setDTMAttribute(org.landxml.schema.landXML11.DTMAttributeType.Enum dtmAttribute)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DTMATTRIBUTE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DTMATTRIBUTE$10);
                }
                target.setEnumValue(dtmAttribute);
            }
        }
        
        /**
         * Sets (as xml) the "DTMAttribute" attribute
         */
        public void xsetDTMAttribute(org.landxml.schema.landXML11.DTMAttributeType dtmAttribute)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DTMAttributeType target = null;
                target = (org.landxml.schema.landXML11.DTMAttributeType)get_store().find_attribute_user(DTMATTRIBUTE$10);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.DTMAttributeType)get_store().add_attribute_user(DTMATTRIBUTE$10);
                }
                target.set(dtmAttribute);
            }
        }
        
        /**
         * Unsets the "DTMAttribute" attribute
         */
        public void unsetDTMAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DTMATTRIBUTE$10);
            }
        }
        
        /**
         * Gets the "timeStamp" attribute
         */
        public java.util.Calendar getTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$12);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "timeStamp" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$12);
                return target;
            }
        }
        
        /**
         * True if has "timeStamp" attribute
         */
        public boolean isSetTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TIMESTAMP$12) != null;
            }
        }
        
        /**
         * Sets the "timeStamp" attribute
         */
        public void setTimeStamp(java.util.Calendar timeStamp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESTAMP$12);
                }
                target.setCalendarValue(timeStamp);
            }
        }
        
        /**
         * Sets (as xml) the "timeStamp" attribute
         */
        public void xsetTimeStamp(org.apache.xmlbeans.XmlDateTime timeStamp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(TIMESTAMP$12);
                }
                target.set(timeStamp);
            }
        }
        
        /**
         * Unsets the "timeStamp" attribute
         */
        public void unsetTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TIMESTAMP$12);
            }
        }
        
        /**
         * Gets the "role" attribute
         */
        public org.landxml.schema.landXML11.SurveyRoleType.Enum getRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$14);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.SurveyRoleType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "role" attribute
         */
        public org.landxml.schema.landXML11.SurveyRoleType xgetRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyRoleType target = null;
                target = (org.landxml.schema.landXML11.SurveyRoleType)get_store().find_attribute_user(ROLE$14);
                return target;
            }
        }
        
        /**
         * True if has "role" attribute
         */
        public boolean isSetRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ROLE$14) != null;
            }
        }
        
        /**
         * Sets the "role" attribute
         */
        public void setRole(org.landxml.schema.landXML11.SurveyRoleType.Enum role)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLE$14);
                }
                target.setEnumValue(role);
            }
        }
        
        /**
         * Sets (as xml) the "role" attribute
         */
        public void xsetRole(org.landxml.schema.landXML11.SurveyRoleType role)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyRoleType target = null;
                target = (org.landxml.schema.landXML11.SurveyRoleType)get_store().find_attribute_user(ROLE$14);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SurveyRoleType)get_store().add_attribute_user(ROLE$14);
                }
                target.set(role);
            }
        }
        
        /**
         * Unsets the "role" attribute
         */
        public void unsetRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ROLE$14);
            }
        }
    }
}
