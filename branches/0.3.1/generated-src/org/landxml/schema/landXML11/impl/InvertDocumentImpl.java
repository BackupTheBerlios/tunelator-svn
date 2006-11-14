/*
 * An XML document type.
 * Localname: Invert
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.InvertDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Invert(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class InvertDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.InvertDocument
{
    
    public InvertDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVERT$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Invert");
    
    
    /**
     * Gets the "Invert" element
     */
    public org.landxml.schema.landXML11.InvertDocument.Invert getInvert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.InvertDocument.Invert target = null;
            target = (org.landxml.schema.landXML11.InvertDocument.Invert)get_store().find_element_user(INVERT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Invert" element
     */
    public void setInvert(org.landxml.schema.landXML11.InvertDocument.Invert invert)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.InvertDocument.Invert target = null;
            target = (org.landxml.schema.landXML11.InvertDocument.Invert)get_store().find_element_user(INVERT$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.InvertDocument.Invert)get_store().add_element_user(INVERT$0);
            }
            target.set(invert);
        }
    }
    
    /**
     * Appends and returns a new empty "Invert" element
     */
    public org.landxml.schema.landXML11.InvertDocument.Invert addNewInvert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.InvertDocument.Invert target = null;
            target = (org.landxml.schema.landXML11.InvertDocument.Invert)get_store().add_element_user(INVERT$0);
            return target;
        }
    }
    /**
     * An XML Invert(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class InvertImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.InvertDocument.Invert
    {
        
        public InvertImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESC$0 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName ELEV$2 = 
            new javax.xml.namespace.QName("", "elev");
        private static final javax.xml.namespace.QName FLOWDIR$4 = 
            new javax.xml.namespace.QName("", "flowDir");
        private static final javax.xml.namespace.QName REFPIPE$6 = 
            new javax.xml.namespace.QName("", "refPipe");
        
        
        /**
         * Gets the "desc" attribute
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$0);
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
                return get_store().find_attribute_user(DESC$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$0);
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
                get_store().remove_attribute(DESC$0);
            }
        }
        
        /**
         * Gets the "elev" attribute
         */
        public double getElev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEV$2);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "elev" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetElev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ELEV$2);
                return target;
            }
        }
        
        /**
         * Sets the "elev" attribute
         */
        public void setElev(double elev)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEV$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELEV$2);
                }
                target.setDoubleValue(elev);
            }
        }
        
        /**
         * Sets (as xml) the "elev" attribute
         */
        public void xsetElev(org.apache.xmlbeans.XmlDouble elev)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ELEV$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ELEV$2);
                }
                target.set(elev);
            }
        }
        
        /**
         * Gets the "flowDir" attribute
         */
        public org.landxml.schema.landXML11.InOut.Enum getFlowDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLOWDIR$4);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.InOut.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "flowDir" attribute
         */
        public org.landxml.schema.landXML11.InOut xgetFlowDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.InOut target = null;
                target = (org.landxml.schema.landXML11.InOut)get_store().find_attribute_user(FLOWDIR$4);
                return target;
            }
        }
        
        /**
         * Sets the "flowDir" attribute
         */
        public void setFlowDir(org.landxml.schema.landXML11.InOut.Enum flowDir)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLOWDIR$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLOWDIR$4);
                }
                target.setEnumValue(flowDir);
            }
        }
        
        /**
         * Sets (as xml) the "flowDir" attribute
         */
        public void xsetFlowDir(org.landxml.schema.landXML11.InOut flowDir)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.InOut target = null;
                target = (org.landxml.schema.landXML11.InOut)get_store().find_attribute_user(FLOWDIR$4);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.InOut)get_store().add_attribute_user(FLOWDIR$4);
                }
                target.set(flowDir);
            }
        }
        
        /**
         * Gets the "refPipe" attribute
         */
        public java.lang.String getRefPipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFPIPE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "refPipe" attribute
         */
        public org.landxml.schema.landXML11.PipeNameRef xgetRefPipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PipeNameRef target = null;
                target = (org.landxml.schema.landXML11.PipeNameRef)get_store().find_attribute_user(REFPIPE$6);
                return target;
            }
        }
        
        /**
         * Sets the "refPipe" attribute
         */
        public void setRefPipe(java.lang.String refPipe)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFPIPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFPIPE$6);
                }
                target.setStringValue(refPipe);
            }
        }
        
        /**
         * Sets (as xml) the "refPipe" attribute
         */
        public void xsetRefPipe(org.landxml.schema.landXML11.PipeNameRef refPipe)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PipeNameRef target = null;
                target = (org.landxml.schema.landXML11.PipeNameRef)get_store().find_attribute_user(REFPIPE$6);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PipeNameRef)get_store().add_attribute_user(REFPIPE$6);
                }
                target.set(refPipe);
            }
        }
    }
}
