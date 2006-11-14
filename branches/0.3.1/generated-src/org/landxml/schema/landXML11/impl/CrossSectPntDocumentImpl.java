/*
 * An XML document type.
 * Localname: CrossSectPnt
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CrossSectPntDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one CrossSectPnt(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class CrossSectPntDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CrossSectPntDocument
{
    
    public CrossSectPntDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CROSSSECTPNT$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CrossSectPnt");
    
    
    /**
     * Gets the "CrossSectPnt" element
     */
    public org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt getCrossSectPnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt target = null;
            target = (org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt)get_store().find_element_user(CROSSSECTPNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CrossSectPnt" element
     */
    public void setCrossSectPnt(org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt crossSectPnt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt target = null;
            target = (org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt)get_store().find_element_user(CROSSSECTPNT$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt)get_store().add_element_user(CROSSSECTPNT$0);
            }
            target.set(crossSectPnt);
        }
    }
    
    /**
     * Appends and returns a new empty "CrossSectPnt" element
     */
    public org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt addNewCrossSectPnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt target = null;
            target = (org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt)get_store().add_element_user(CROSSSECTPNT$0);
            return target;
        }
    }
    /**
     * An XML CrossSectPnt(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlDouble.
     */
    public static class CrossSectPntImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.landxml.schema.landXML11.CrossSectPntDocument.CrossSectPnt
    {
        
        public CrossSectPntImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected CrossSectPntImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
        private static final javax.xml.namespace.QName DATAFORMAT$26 = 
            new javax.xml.namespace.QName("", "dataFormat");
        private static final javax.xml.namespace.QName ALIGNREF$28 = 
            new javax.xml.namespace.QName("", "alignRef");
        private static final javax.xml.namespace.QName ALIGNREFSTATION$30 = 
            new javax.xml.namespace.QName("", "alignRefStation");
        private static final javax.xml.namespace.QName PLANFEATUREREF$32 = 
            new javax.xml.namespace.QName("", "planFeatureRef");
        private static final javax.xml.namespace.QName PLANFEATUREREFSTATION$34 = 
            new javax.xml.namespace.QName("", "planFeatureRefStation");
        private static final javax.xml.namespace.QName PARCELREF$36 = 
            new javax.xml.namespace.QName("", "parcelRef");
        private static final javax.xml.namespace.QName PARCELREFSTATION$38 = 
            new javax.xml.namespace.QName("", "parcelRefStation");
        
        
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
         * Gets the "dataFormat" attribute
         */
        public org.landxml.schema.landXML11.DataFormatType.Enum getDataFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAFORMAT$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DATAFORMAT$26);
                }
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.DataFormatType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "dataFormat" attribute
         */
        public org.landxml.schema.landXML11.DataFormatType xgetDataFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DataFormatType target = null;
                target = (org.landxml.schema.landXML11.DataFormatType)get_store().find_attribute_user(DATAFORMAT$26);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.DataFormatType)get_default_attribute_value(DATAFORMAT$26);
                }
                return target;
            }
        }
        
        /**
         * True if has "dataFormat" attribute
         */
        public boolean isSetDataFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DATAFORMAT$26) != null;
            }
        }
        
        /**
         * Sets the "dataFormat" attribute
         */
        public void setDataFormat(org.landxml.schema.landXML11.DataFormatType.Enum dataFormat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAFORMAT$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAFORMAT$26);
                }
                target.setEnumValue(dataFormat);
            }
        }
        
        /**
         * Sets (as xml) the "dataFormat" attribute
         */
        public void xsetDataFormat(org.landxml.schema.landXML11.DataFormatType dataFormat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DataFormatType target = null;
                target = (org.landxml.schema.landXML11.DataFormatType)get_store().find_attribute_user(DATAFORMAT$26);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.DataFormatType)get_store().add_attribute_user(DATAFORMAT$26);
                }
                target.set(dataFormat);
            }
        }
        
        /**
         * Unsets the "dataFormat" attribute
         */
        public void unsetDataFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DATAFORMAT$26);
            }
        }
        
        /**
         * Gets the "alignRef" attribute
         */
        public java.lang.String getAlignRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNREF$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "alignRef" attribute
         */
        public org.landxml.schema.landXML11.AlignmentNameRef xgetAlignRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignmentNameRef target = null;
                target = (org.landxml.schema.landXML11.AlignmentNameRef)get_store().find_attribute_user(ALIGNREF$28);
                return target;
            }
        }
        
        /**
         * True if has "alignRef" attribute
         */
        public boolean isSetAlignRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ALIGNREF$28) != null;
            }
        }
        
        /**
         * Sets the "alignRef" attribute
         */
        public void setAlignRef(java.lang.String alignRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNREF$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALIGNREF$28);
                }
                target.setStringValue(alignRef);
            }
        }
        
        /**
         * Sets (as xml) the "alignRef" attribute
         */
        public void xsetAlignRef(org.landxml.schema.landXML11.AlignmentNameRef alignRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignmentNameRef target = null;
                target = (org.landxml.schema.landXML11.AlignmentNameRef)get_store().find_attribute_user(ALIGNREF$28);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.AlignmentNameRef)get_store().add_attribute_user(ALIGNREF$28);
                }
                target.set(alignRef);
            }
        }
        
        /**
         * Unsets the "alignRef" attribute
         */
        public void unsetAlignRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ALIGNREF$28);
            }
        }
        
        /**
         * Gets the "alignRefStation" attribute
         */
        public double getAlignRefStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNREFSTATION$30);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "alignRefStation" attribute
         */
        public org.landxml.schema.landXML11.Station xgetAlignRefStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(ALIGNREFSTATION$30);
                return target;
            }
        }
        
        /**
         * True if has "alignRefStation" attribute
         */
        public boolean isSetAlignRefStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ALIGNREFSTATION$30) != null;
            }
        }
        
        /**
         * Sets the "alignRefStation" attribute
         */
        public void setAlignRefStation(double alignRefStation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNREFSTATION$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALIGNREFSTATION$30);
                }
                target.setDoubleValue(alignRefStation);
            }
        }
        
        /**
         * Sets (as xml) the "alignRefStation" attribute
         */
        public void xsetAlignRefStation(org.landxml.schema.landXML11.Station alignRefStation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(ALIGNREFSTATION$30);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(ALIGNREFSTATION$30);
                }
                target.set(alignRefStation);
            }
        }
        
        /**
         * Unsets the "alignRefStation" attribute
         */
        public void unsetAlignRefStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ALIGNREFSTATION$30);
            }
        }
        
        /**
         * Gets the "planFeatureRef" attribute
         */
        public java.lang.String getPlanFeatureRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLANFEATUREREF$32);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "planFeatureRef" attribute
         */
        public org.landxml.schema.landXML11.PlanFeatureNameRef xgetPlanFeatureRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PlanFeatureNameRef target = null;
                target = (org.landxml.schema.landXML11.PlanFeatureNameRef)get_store().find_attribute_user(PLANFEATUREREF$32);
                return target;
            }
        }
        
        /**
         * True if has "planFeatureRef" attribute
         */
        public boolean isSetPlanFeatureRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PLANFEATUREREF$32) != null;
            }
        }
        
        /**
         * Sets the "planFeatureRef" attribute
         */
        public void setPlanFeatureRef(java.lang.String planFeatureRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLANFEATUREREF$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PLANFEATUREREF$32);
                }
                target.setStringValue(planFeatureRef);
            }
        }
        
        /**
         * Sets (as xml) the "planFeatureRef" attribute
         */
        public void xsetPlanFeatureRef(org.landxml.schema.landXML11.PlanFeatureNameRef planFeatureRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PlanFeatureNameRef target = null;
                target = (org.landxml.schema.landXML11.PlanFeatureNameRef)get_store().find_attribute_user(PLANFEATUREREF$32);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PlanFeatureNameRef)get_store().add_attribute_user(PLANFEATUREREF$32);
                }
                target.set(planFeatureRef);
            }
        }
        
        /**
         * Unsets the "planFeatureRef" attribute
         */
        public void unsetPlanFeatureRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PLANFEATUREREF$32);
            }
        }
        
        /**
         * Gets the "planFeatureRefStation" attribute
         */
        public double getPlanFeatureRefStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLANFEATUREREFSTATION$34);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "planFeatureRefStation" attribute
         */
        public org.landxml.schema.landXML11.Station xgetPlanFeatureRefStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(PLANFEATUREREFSTATION$34);
                return target;
            }
        }
        
        /**
         * True if has "planFeatureRefStation" attribute
         */
        public boolean isSetPlanFeatureRefStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PLANFEATUREREFSTATION$34) != null;
            }
        }
        
        /**
         * Sets the "planFeatureRefStation" attribute
         */
        public void setPlanFeatureRefStation(double planFeatureRefStation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLANFEATUREREFSTATION$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PLANFEATUREREFSTATION$34);
                }
                target.setDoubleValue(planFeatureRefStation);
            }
        }
        
        /**
         * Sets (as xml) the "planFeatureRefStation" attribute
         */
        public void xsetPlanFeatureRefStation(org.landxml.schema.landXML11.Station planFeatureRefStation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(PLANFEATUREREFSTATION$34);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(PLANFEATUREREFSTATION$34);
                }
                target.set(planFeatureRefStation);
            }
        }
        
        /**
         * Unsets the "planFeatureRefStation" attribute
         */
        public void unsetPlanFeatureRefStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PLANFEATUREREFSTATION$34);
            }
        }
        
        /**
         * Gets the "parcelRef" attribute
         */
        public java.lang.String getParcelRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARCELREF$36);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "parcelRef" attribute
         */
        public org.landxml.schema.landXML11.ParcelNameRef xgetParcelRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParcelNameRef target = null;
                target = (org.landxml.schema.landXML11.ParcelNameRef)get_store().find_attribute_user(PARCELREF$36);
                return target;
            }
        }
        
        /**
         * True if has "parcelRef" attribute
         */
        public boolean isSetParcelRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARCELREF$36) != null;
            }
        }
        
        /**
         * Sets the "parcelRef" attribute
         */
        public void setParcelRef(java.lang.String parcelRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARCELREF$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARCELREF$36);
                }
                target.setStringValue(parcelRef);
            }
        }
        
        /**
         * Sets (as xml) the "parcelRef" attribute
         */
        public void xsetParcelRef(org.landxml.schema.landXML11.ParcelNameRef parcelRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParcelNameRef target = null;
                target = (org.landxml.schema.landXML11.ParcelNameRef)get_store().find_attribute_user(PARCELREF$36);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ParcelNameRef)get_store().add_attribute_user(PARCELREF$36);
                }
                target.set(parcelRef);
            }
        }
        
        /**
         * Unsets the "parcelRef" attribute
         */
        public void unsetParcelRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARCELREF$36);
            }
        }
        
        /**
         * Gets the "parcelRefStation" attribute
         */
        public double getParcelRefStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARCELREFSTATION$38);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "parcelRefStation" attribute
         */
        public org.landxml.schema.landXML11.Station xgetParcelRefStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(PARCELREFSTATION$38);
                return target;
            }
        }
        
        /**
         * True if has "parcelRefStation" attribute
         */
        public boolean isSetParcelRefStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARCELREFSTATION$38) != null;
            }
        }
        
        /**
         * Sets the "parcelRefStation" attribute
         */
        public void setParcelRefStation(double parcelRefStation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARCELREFSTATION$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARCELREFSTATION$38);
                }
                target.setDoubleValue(parcelRefStation);
            }
        }
        
        /**
         * Sets (as xml) the "parcelRefStation" attribute
         */
        public void xsetParcelRefStation(org.landxml.schema.landXML11.Station parcelRefStation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(PARCELREFSTATION$38);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(PARCELREFSTATION$38);
                }
                target.set(parcelRefStation);
            }
        }
        
        /**
         * Unsets the "parcelRefStation" attribute
         */
        public void unsetParcelRefStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARCELREFSTATION$38);
            }
        }
    }
}
