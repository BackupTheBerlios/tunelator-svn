/*
 * An XML document type.
 * Localname: CgPoint
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CgPointDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one CgPoint(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class CgPointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CgPointDocument
{
    
    public CgPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CGPOINT$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CgPoint");
    
    
    /**
     * Gets the "CgPoint" element
     */
    public org.landxml.schema.landXML11.CgPointDocument.CgPoint getCgPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CgPointDocument.CgPoint target = null;
            target = (org.landxml.schema.landXML11.CgPointDocument.CgPoint)get_store().find_element_user(CGPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CgPoint" element
     */
    public void setCgPoint(org.landxml.schema.landXML11.CgPointDocument.CgPoint cgPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CgPointDocument.CgPoint target = null;
            target = (org.landxml.schema.landXML11.CgPointDocument.CgPoint)get_store().find_element_user(CGPOINT$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.CgPointDocument.CgPoint)get_store().add_element_user(CGPOINT$0);
            }
            target.set(cgPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "CgPoint" element
     */
    public org.landxml.schema.landXML11.CgPointDocument.CgPoint addNewCgPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CgPointDocument.CgPoint target = null;
            target = (org.landxml.schema.landXML11.CgPointDocument.CgPoint)get_store().add_element_user(CGPOINT$0);
            return target;
        }
    }
    /**
     * An XML CgPoint(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlDouble.
     */
    public static class CgPointImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.landxml.schema.landXML11.CgPointDocument.CgPoint
    {
        
        public CgPointImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected CgPointImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
        private static final javax.xml.namespace.QName PNTREF$8 = 
            new javax.xml.namespace.QName("", "pntRef");
        private static final javax.xml.namespace.QName POINTGEOMETRY$10 = 
            new javax.xml.namespace.QName("", "pointGeometry");
        private static final javax.xml.namespace.QName DTMATTRIBUTE$12 = 
            new javax.xml.namespace.QName("", "DTMAttribute");
        private static final javax.xml.namespace.QName TIMESTAMP$14 = 
            new javax.xml.namespace.QName("", "timeStamp");
        private static final javax.xml.namespace.QName ROLE$16 = 
            new javax.xml.namespace.QName("", "role");
        private static final javax.xml.namespace.QName DETERMINEDTIMESTAMP$18 = 
            new javax.xml.namespace.QName("", "determinedTimeStamp");
        private static final javax.xml.namespace.QName ELLIPSOIDELEV$20 = 
            new javax.xml.namespace.QName("", "ellipsoidElev");
        private static final javax.xml.namespace.QName LATITUDE$22 = 
            new javax.xml.namespace.QName("", "latitude");
        private static final javax.xml.namespace.QName LONGITUDE$24 = 
            new javax.xml.namespace.QName("", "longitude");
        private static final javax.xml.namespace.QName OID$26 = 
            new javax.xml.namespace.QName("", "oID");
        private static final javax.xml.namespace.QName SURVEYORDER$28 = 
            new javax.xml.namespace.QName("", "surveyOrder");
        private static final javax.xml.namespace.QName PNTSURV$30 = 
            new javax.xml.namespace.QName("", "pntSurv");
        private static final javax.xml.namespace.QName ZONENUMBER$32 = 
            new javax.xml.namespace.QName("", "zoneNumber");
        private static final javax.xml.namespace.QName SURVEYHORIZONTALORDER$34 = 
            new javax.xml.namespace.QName("", "surveyHorizontalOrder");
        private static final javax.xml.namespace.QName SURVEYVERTICALORDER$36 = 
            new javax.xml.namespace.QName("", "surveyVerticalOrder");
        private static final javax.xml.namespace.QName LOCALUNCERTAINITY$38 = 
            new javax.xml.namespace.QName("", "localUncertainity");
        private static final javax.xml.namespace.QName POSITIONALUNCERTAINITY$40 = 
            new javax.xml.namespace.QName("", "positionalUncertainity");
        
        
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
         * Gets the "pntRef" attribute
         */
        public java.lang.String getPntRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PNTREF$8);
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
                target = (org.landxml.schema.landXML11.PointNameRef)get_store().find_attribute_user(PNTREF$8);
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
                return get_store().find_attribute_user(PNTREF$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PNTREF$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PNTREF$8);
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
                target = (org.landxml.schema.landXML11.PointNameRef)get_store().find_attribute_user(PNTREF$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PointNameRef)get_store().add_attribute_user(PNTREF$8);
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
                get_store().remove_attribute(PNTREF$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POINTGEOMETRY$10);
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
                target = (org.landxml.schema.landXML11.PointGeometryType)get_store().find_attribute_user(POINTGEOMETRY$10);
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
                return get_store().find_attribute_user(POINTGEOMETRY$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POINTGEOMETRY$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POINTGEOMETRY$10);
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
                target = (org.landxml.schema.landXML11.PointGeometryType)get_store().find_attribute_user(POINTGEOMETRY$10);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PointGeometryType)get_store().add_attribute_user(POINTGEOMETRY$10);
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
                get_store().remove_attribute(POINTGEOMETRY$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DTMATTRIBUTE$12);
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
                target = (org.landxml.schema.landXML11.DTMAttributeType)get_store().find_attribute_user(DTMATTRIBUTE$12);
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
                return get_store().find_attribute_user(DTMATTRIBUTE$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DTMATTRIBUTE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DTMATTRIBUTE$12);
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
                target = (org.landxml.schema.landXML11.DTMAttributeType)get_store().find_attribute_user(DTMATTRIBUTE$12);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.DTMAttributeType)get_store().add_attribute_user(DTMATTRIBUTE$12);
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
                get_store().remove_attribute(DTMATTRIBUTE$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$14);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$14);
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
                return get_store().find_attribute_user(TIMESTAMP$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESTAMP$14);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(TIMESTAMP$14);
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
                get_store().remove_attribute(TIMESTAMP$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$16);
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
                target = (org.landxml.schema.landXML11.SurveyRoleType)get_store().find_attribute_user(ROLE$16);
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
                return get_store().find_attribute_user(ROLE$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLE$16);
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
                target = (org.landxml.schema.landXML11.SurveyRoleType)get_store().find_attribute_user(ROLE$16);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SurveyRoleType)get_store().add_attribute_user(ROLE$16);
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
                get_store().remove_attribute(ROLE$16);
            }
        }
        
        /**
         * Gets the "determinedTimeStamp" attribute
         */
        public java.util.Calendar getDeterminedTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETERMINEDTIMESTAMP$18);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "determinedTimeStamp" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetDeterminedTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DETERMINEDTIMESTAMP$18);
                return target;
            }
        }
        
        /**
         * True if has "determinedTimeStamp" attribute
         */
        public boolean isSetDeterminedTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DETERMINEDTIMESTAMP$18) != null;
            }
        }
        
        /**
         * Sets the "determinedTimeStamp" attribute
         */
        public void setDeterminedTimeStamp(java.util.Calendar determinedTimeStamp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETERMINEDTIMESTAMP$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DETERMINEDTIMESTAMP$18);
                }
                target.setCalendarValue(determinedTimeStamp);
            }
        }
        
        /**
         * Sets (as xml) the "determinedTimeStamp" attribute
         */
        public void xsetDeterminedTimeStamp(org.apache.xmlbeans.XmlDateTime determinedTimeStamp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DETERMINEDTIMESTAMP$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DETERMINEDTIMESTAMP$18);
                }
                target.set(determinedTimeStamp);
            }
        }
        
        /**
         * Unsets the "determinedTimeStamp" attribute
         */
        public void unsetDeterminedTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DETERMINEDTIMESTAMP$18);
            }
        }
        
        /**
         * Gets the "ellipsoidElev" attribute
         */
        public double getEllipsoidElev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELLIPSOIDELEV$20);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "ellipsoidElev" attribute
         */
        public org.landxml.schema.landXML11.EllipsoidElevationType xgetEllipsoidElev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.EllipsoidElevationType target = null;
                target = (org.landxml.schema.landXML11.EllipsoidElevationType)get_store().find_attribute_user(ELLIPSOIDELEV$20);
                return target;
            }
        }
        
        /**
         * True if has "ellipsoidElev" attribute
         */
        public boolean isSetEllipsoidElev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ELLIPSOIDELEV$20) != null;
            }
        }
        
        /**
         * Sets the "ellipsoidElev" attribute
         */
        public void setEllipsoidElev(double ellipsoidElev)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELLIPSOIDELEV$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELLIPSOIDELEV$20);
                }
                target.setDoubleValue(ellipsoidElev);
            }
        }
        
        /**
         * Sets (as xml) the "ellipsoidElev" attribute
         */
        public void xsetEllipsoidElev(org.landxml.schema.landXML11.EllipsoidElevationType ellipsoidElev)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.EllipsoidElevationType target = null;
                target = (org.landxml.schema.landXML11.EllipsoidElevationType)get_store().find_attribute_user(ELLIPSOIDELEV$20);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.EllipsoidElevationType)get_store().add_attribute_user(ELLIPSOIDELEV$20);
                }
                target.set(ellipsoidElev);
            }
        }
        
        /**
         * Unsets the "ellipsoidElev" attribute
         */
        public void unsetEllipsoidElev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ELLIPSOIDELEV$20);
            }
        }
        
        /**
         * Gets the "latitude" attribute
         */
        public double getLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATITUDE$22);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "latitude" attribute
         */
        public org.landxml.schema.landXML11.LatLongAngle xgetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LatLongAngle target = null;
                target = (org.landxml.schema.landXML11.LatLongAngle)get_store().find_attribute_user(LATITUDE$22);
                return target;
            }
        }
        
        /**
         * True if has "latitude" attribute
         */
        public boolean isSetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LATITUDE$22) != null;
            }
        }
        
        /**
         * Sets the "latitude" attribute
         */
        public void setLatitude(double latitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATITUDE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LATITUDE$22);
                }
                target.setDoubleValue(latitude);
            }
        }
        
        /**
         * Sets (as xml) the "latitude" attribute
         */
        public void xsetLatitude(org.landxml.schema.landXML11.LatLongAngle latitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LatLongAngle target = null;
                target = (org.landxml.schema.landXML11.LatLongAngle)get_store().find_attribute_user(LATITUDE$22);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.LatLongAngle)get_store().add_attribute_user(LATITUDE$22);
                }
                target.set(latitude);
            }
        }
        
        /**
         * Unsets the "latitude" attribute
         */
        public void unsetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LATITUDE$22);
            }
        }
        
        /**
         * Gets the "longitude" attribute
         */
        public double getLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LONGITUDE$24);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "longitude" attribute
         */
        public org.landxml.schema.landXML11.LatLongAngle xgetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LatLongAngle target = null;
                target = (org.landxml.schema.landXML11.LatLongAngle)get_store().find_attribute_user(LONGITUDE$24);
                return target;
            }
        }
        
        /**
         * True if has "longitude" attribute
         */
        public boolean isSetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LONGITUDE$24) != null;
            }
        }
        
        /**
         * Sets the "longitude" attribute
         */
        public void setLongitude(double longitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LONGITUDE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LONGITUDE$24);
                }
                target.setDoubleValue(longitude);
            }
        }
        
        /**
         * Sets (as xml) the "longitude" attribute
         */
        public void xsetLongitude(org.landxml.schema.landXML11.LatLongAngle longitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LatLongAngle target = null;
                target = (org.landxml.schema.landXML11.LatLongAngle)get_store().find_attribute_user(LONGITUDE$24);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.LatLongAngle)get_store().add_attribute_user(LONGITUDE$24);
                }
                target.set(longitude);
            }
        }
        
        /**
         * Unsets the "longitude" attribute
         */
        public void unsetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LONGITUDE$24);
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
         * Gets the "surveyOrder" attribute
         */
        public java.lang.String getSurveyOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYORDER$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "surveyOrder" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSurveyOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SURVEYORDER$28);
                return target;
            }
        }
        
        /**
         * True if has "surveyOrder" attribute
         */
        public boolean isSetSurveyOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SURVEYORDER$28) != null;
            }
        }
        
        /**
         * Sets the "surveyOrder" attribute
         */
        public void setSurveyOrder(java.lang.String surveyOrder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYORDER$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SURVEYORDER$28);
                }
                target.setStringValue(surveyOrder);
            }
        }
        
        /**
         * Sets (as xml) the "surveyOrder" attribute
         */
        public void xsetSurveyOrder(org.apache.xmlbeans.XmlString surveyOrder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SURVEYORDER$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SURVEYORDER$28);
                }
                target.set(surveyOrder);
            }
        }
        
        /**
         * Unsets the "surveyOrder" attribute
         */
        public void unsetSurveyOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SURVEYORDER$28);
            }
        }
        
        /**
         * Gets the "pntSurv" attribute
         */
        public org.landxml.schema.landXML11.SurvPntType.Enum getPntSurv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PNTSURV$30);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.SurvPntType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "pntSurv" attribute
         */
        public org.landxml.schema.landXML11.SurvPntType xgetPntSurv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurvPntType target = null;
                target = (org.landxml.schema.landXML11.SurvPntType)get_store().find_attribute_user(PNTSURV$30);
                return target;
            }
        }
        
        /**
         * True if has "pntSurv" attribute
         */
        public boolean isSetPntSurv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PNTSURV$30) != null;
            }
        }
        
        /**
         * Sets the "pntSurv" attribute
         */
        public void setPntSurv(org.landxml.schema.landXML11.SurvPntType.Enum pntSurv)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PNTSURV$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PNTSURV$30);
                }
                target.setEnumValue(pntSurv);
            }
        }
        
        /**
         * Sets (as xml) the "pntSurv" attribute
         */
        public void xsetPntSurv(org.landxml.schema.landXML11.SurvPntType pntSurv)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurvPntType target = null;
                target = (org.landxml.schema.landXML11.SurvPntType)get_store().find_attribute_user(PNTSURV$30);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SurvPntType)get_store().add_attribute_user(PNTSURV$30);
                }
                target.set(pntSurv);
            }
        }
        
        /**
         * Unsets the "pntSurv" attribute
         */
        public void unsetPntSurv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PNTSURV$30);
            }
        }
        
        /**
         * Gets the "zoneNumber" attribute
         */
        public int getZoneNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZONENUMBER$32);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "zoneNumber" attribute
         */
        public org.landxml.schema.landXML11.ZoneNumberType xgetZoneNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneNumberType target = null;
                target = (org.landxml.schema.landXML11.ZoneNumberType)get_store().find_attribute_user(ZONENUMBER$32);
                return target;
            }
        }
        
        /**
         * True if has "zoneNumber" attribute
         */
        public boolean isSetZoneNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ZONENUMBER$32) != null;
            }
        }
        
        /**
         * Sets the "zoneNumber" attribute
         */
        public void setZoneNumber(int zoneNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZONENUMBER$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZONENUMBER$32);
                }
                target.setIntValue(zoneNumber);
            }
        }
        
        /**
         * Sets (as xml) the "zoneNumber" attribute
         */
        public void xsetZoneNumber(org.landxml.schema.landXML11.ZoneNumberType zoneNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneNumberType target = null;
                target = (org.landxml.schema.landXML11.ZoneNumberType)get_store().find_attribute_user(ZONENUMBER$32);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ZoneNumberType)get_store().add_attribute_user(ZONENUMBER$32);
                }
                target.set(zoneNumber);
            }
        }
        
        /**
         * Unsets the "zoneNumber" attribute
         */
        public void unsetZoneNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ZONENUMBER$32);
            }
        }
        
        /**
         * Gets the "surveyHorizontalOrder" attribute
         */
        public java.lang.String getSurveyHorizontalOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYHORIZONTALORDER$34);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "surveyHorizontalOrder" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSurveyHorizontalOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SURVEYHORIZONTALORDER$34);
                return target;
            }
        }
        
        /**
         * True if has "surveyHorizontalOrder" attribute
         */
        public boolean isSetSurveyHorizontalOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SURVEYHORIZONTALORDER$34) != null;
            }
        }
        
        /**
         * Sets the "surveyHorizontalOrder" attribute
         */
        public void setSurveyHorizontalOrder(java.lang.String surveyHorizontalOrder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYHORIZONTALORDER$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SURVEYHORIZONTALORDER$34);
                }
                target.setStringValue(surveyHorizontalOrder);
            }
        }
        
        /**
         * Sets (as xml) the "surveyHorizontalOrder" attribute
         */
        public void xsetSurveyHorizontalOrder(org.apache.xmlbeans.XmlString surveyHorizontalOrder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SURVEYHORIZONTALORDER$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SURVEYHORIZONTALORDER$34);
                }
                target.set(surveyHorizontalOrder);
            }
        }
        
        /**
         * Unsets the "surveyHorizontalOrder" attribute
         */
        public void unsetSurveyHorizontalOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SURVEYHORIZONTALORDER$34);
            }
        }
        
        /**
         * Gets the "surveyVerticalOrder" attribute
         */
        public java.lang.String getSurveyVerticalOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYVERTICALORDER$36);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "surveyVerticalOrder" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSurveyVerticalOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SURVEYVERTICALORDER$36);
                return target;
            }
        }
        
        /**
         * True if has "surveyVerticalOrder" attribute
         */
        public boolean isSetSurveyVerticalOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SURVEYVERTICALORDER$36) != null;
            }
        }
        
        /**
         * Sets the "surveyVerticalOrder" attribute
         */
        public void setSurveyVerticalOrder(java.lang.String surveyVerticalOrder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURVEYVERTICALORDER$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SURVEYVERTICALORDER$36);
                }
                target.setStringValue(surveyVerticalOrder);
            }
        }
        
        /**
         * Sets (as xml) the "surveyVerticalOrder" attribute
         */
        public void xsetSurveyVerticalOrder(org.apache.xmlbeans.XmlString surveyVerticalOrder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SURVEYVERTICALORDER$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SURVEYVERTICALORDER$36);
                }
                target.set(surveyVerticalOrder);
            }
        }
        
        /**
         * Unsets the "surveyVerticalOrder" attribute
         */
        public void unsetSurveyVerticalOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SURVEYVERTICALORDER$36);
            }
        }
        
        /**
         * Gets the "localUncertainity" attribute
         */
        public double getLocalUncertainity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALUNCERTAINITY$38);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "localUncertainity" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetLocalUncertainity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LOCALUNCERTAINITY$38);
                return target;
            }
        }
        
        /**
         * True if has "localUncertainity" attribute
         */
        public boolean isSetLocalUncertainity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOCALUNCERTAINITY$38) != null;
            }
        }
        
        /**
         * Sets the "localUncertainity" attribute
         */
        public void setLocalUncertainity(double localUncertainity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALUNCERTAINITY$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCALUNCERTAINITY$38);
                }
                target.setDoubleValue(localUncertainity);
            }
        }
        
        /**
         * Sets (as xml) the "localUncertainity" attribute
         */
        public void xsetLocalUncertainity(org.apache.xmlbeans.XmlDouble localUncertainity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LOCALUNCERTAINITY$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LOCALUNCERTAINITY$38);
                }
                target.set(localUncertainity);
            }
        }
        
        /**
         * Unsets the "localUncertainity" attribute
         */
        public void unsetLocalUncertainity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOCALUNCERTAINITY$38);
            }
        }
        
        /**
         * Gets the "positionalUncertainity" attribute
         */
        public double getPositionalUncertainity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITIONALUNCERTAINITY$40);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "positionalUncertainity" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetPositionalUncertainity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POSITIONALUNCERTAINITY$40);
                return target;
            }
        }
        
        /**
         * True if has "positionalUncertainity" attribute
         */
        public boolean isSetPositionalUncertainity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POSITIONALUNCERTAINITY$40) != null;
            }
        }
        
        /**
         * Sets the "positionalUncertainity" attribute
         */
        public void setPositionalUncertainity(double positionalUncertainity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITIONALUNCERTAINITY$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSITIONALUNCERTAINITY$40);
                }
                target.setDoubleValue(positionalUncertainity);
            }
        }
        
        /**
         * Sets (as xml) the "positionalUncertainity" attribute
         */
        public void xsetPositionalUncertainity(org.apache.xmlbeans.XmlDouble positionalUncertainity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POSITIONALUNCERTAINITY$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(POSITIONALUNCERTAINITY$40);
                }
                target.set(positionalUncertainity);
            }
        }
        
        /**
         * Unsets the "positionalUncertainity" attribute
         */
        public void unsetPositionalUncertainity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POSITIONALUNCERTAINITY$40);
            }
        }
    }
}
