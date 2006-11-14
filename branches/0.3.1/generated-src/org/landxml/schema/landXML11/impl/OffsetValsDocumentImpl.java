/*
 * An XML document type.
 * Localname: OffsetVals
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.OffsetValsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one OffsetVals(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class OffsetValsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.OffsetValsDocument
{
    
    public OffsetValsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFSETVALS$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "OffsetVals");
    
    
    /**
     * Gets the "OffsetVals" element
     */
    public org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals getOffsetVals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals target = null;
            target = (org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals)get_store().find_element_user(OFFSETVALS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OffsetVals" element
     */
    public void setOffsetVals(org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals offsetVals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals target = null;
            target = (org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals)get_store().find_element_user(OFFSETVALS$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals)get_store().add_element_user(OFFSETVALS$0);
            }
            target.set(offsetVals);
        }
    }
    
    /**
     * Appends and returns a new empty "OffsetVals" element
     */
    public org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals addNewOffsetVals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals target = null;
            target = (org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals)get_store().add_element_user(OFFSETVALS$0);
            return target;
        }
    }
    /**
     * An XML OffsetVals(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class OffsetValsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.OffsetValsDocument.OffsetVals
    {
        
        public OffsetValsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OFFSETINOUT$0 = 
            new javax.xml.namespace.QName("", "offsetInOut");
        private static final javax.xml.namespace.QName OFFSETLEFTRIGHT$2 = 
            new javax.xml.namespace.QName("", "offsetLeftRight");
        private static final javax.xml.namespace.QName OFFSETUPDOWN$4 = 
            new javax.xml.namespace.QName("", "offsetUpDown");
        
        
        /**
         * Gets the "offsetInOut" attribute
         */
        public double getOffsetInOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFSETINOUT$0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "offsetInOut" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetOffsetInOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(OFFSETINOUT$0);
                return target;
            }
        }
        
        /**
         * True if has "offsetInOut" attribute
         */
        public boolean isSetOffsetInOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OFFSETINOUT$0) != null;
            }
        }
        
        /**
         * Sets the "offsetInOut" attribute
         */
        public void setOffsetInOut(double offsetInOut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFSETINOUT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OFFSETINOUT$0);
                }
                target.setDoubleValue(offsetInOut);
            }
        }
        
        /**
         * Sets (as xml) the "offsetInOut" attribute
         */
        public void xsetOffsetInOut(org.apache.xmlbeans.XmlDouble offsetInOut)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(OFFSETINOUT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(OFFSETINOUT$0);
                }
                target.set(offsetInOut);
            }
        }
        
        /**
         * Unsets the "offsetInOut" attribute
         */
        public void unsetOffsetInOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OFFSETINOUT$0);
            }
        }
        
        /**
         * Gets the "offsetLeftRight" attribute
         */
        public double getOffsetLeftRight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFSETLEFTRIGHT$2);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "offsetLeftRight" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetOffsetLeftRight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(OFFSETLEFTRIGHT$2);
                return target;
            }
        }
        
        /**
         * True if has "offsetLeftRight" attribute
         */
        public boolean isSetOffsetLeftRight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OFFSETLEFTRIGHT$2) != null;
            }
        }
        
        /**
         * Sets the "offsetLeftRight" attribute
         */
        public void setOffsetLeftRight(double offsetLeftRight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFSETLEFTRIGHT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OFFSETLEFTRIGHT$2);
                }
                target.setDoubleValue(offsetLeftRight);
            }
        }
        
        /**
         * Sets (as xml) the "offsetLeftRight" attribute
         */
        public void xsetOffsetLeftRight(org.apache.xmlbeans.XmlDouble offsetLeftRight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(OFFSETLEFTRIGHT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(OFFSETLEFTRIGHT$2);
                }
                target.set(offsetLeftRight);
            }
        }
        
        /**
         * Unsets the "offsetLeftRight" attribute
         */
        public void unsetOffsetLeftRight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OFFSETLEFTRIGHT$2);
            }
        }
        
        /**
         * Gets the "offsetUpDown" attribute
         */
        public double getOffsetUpDown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFSETUPDOWN$4);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "offsetUpDown" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetOffsetUpDown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(OFFSETUPDOWN$4);
                return target;
            }
        }
        
        /**
         * True if has "offsetUpDown" attribute
         */
        public boolean isSetOffsetUpDown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OFFSETUPDOWN$4) != null;
            }
        }
        
        /**
         * Sets the "offsetUpDown" attribute
         */
        public void setOffsetUpDown(double offsetUpDown)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFSETUPDOWN$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OFFSETUPDOWN$4);
                }
                target.setDoubleValue(offsetUpDown);
            }
        }
        
        /**
         * Sets (as xml) the "offsetUpDown" attribute
         */
        public void xsetOffsetUpDown(org.apache.xmlbeans.XmlDouble offsetUpDown)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(OFFSETUPDOWN$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(OFFSETUPDOWN$4);
                }
                target.set(offsetUpDown);
            }
        }
        
        /**
         * Unsets the "offsetUpDown" attribute
         */
        public void unsetOffsetUpDown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OFFSETUPDOWN$4);
            }
        }
    }
}
