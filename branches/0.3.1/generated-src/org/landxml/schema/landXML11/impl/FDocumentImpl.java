/*
 * An XML document type.
 * Localname: F
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.FDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one F(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class FDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.FDocument
{
    
    public FDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName F$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "F");
    
    
    /**
     * Gets the "F" element
     */
    public org.landxml.schema.landXML11.FDocument.F getF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.FDocument.F target = null;
            target = (org.landxml.schema.landXML11.FDocument.F)get_store().find_element_user(F$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "F" element
     */
    public void setF(org.landxml.schema.landXML11.FDocument.F f)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.FDocument.F target = null;
            target = (org.landxml.schema.landXML11.FDocument.F)get_store().find_element_user(F$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.FDocument.F)get_store().add_element_user(F$0);
            }
            target.set(f);
        }
    }
    
    /**
     * Appends and returns a new empty "F" element
     */
    public org.landxml.schema.landXML11.FDocument.F addNewF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.FDocument.F target = null;
            target = (org.landxml.schema.landXML11.FDocument.F)get_store().add_element_user(F$0);
            return target;
        }
    }
    /**
     * An XML F(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlInteger.
     */
    public static class FImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.landxml.schema.landXML11.FDocument.F
    {
        
        public FImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected FImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName I$0 = 
            new javax.xml.namespace.QName("", "i");
        private static final javax.xml.namespace.QName N$2 = 
            new javax.xml.namespace.QName("", "n");
        
        
        /**
         * Gets the "i" attribute
         */
        public java.math.BigInteger getI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(I$0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "i" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(I$0);
                return target;
            }
        }
        
        /**
         * True if has "i" attribute
         */
        public boolean isSetI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(I$0) != null;
            }
        }
        
        /**
         * Sets the "i" attribute
         */
        public void setI(java.math.BigInteger iValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(I$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(I$0);
                }
                target.setBigIntegerValue(iValue);
            }
        }
        
        /**
         * Sets (as xml) the "i" attribute
         */
        public void xsetI(org.apache.xmlbeans.XmlInteger iValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(I$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(I$0);
                }
                target.set(iValue);
            }
        }
        
        /**
         * Unsets the "i" attribute
         */
        public void unsetI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(I$0);
            }
        }
        
        /**
         * Gets the "n" attribute
         */
        public java.util.List getN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(N$2);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "n" attribute
         */
        public org.landxml.schema.landXML11.FaceType xgetN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FaceType target = null;
                target = (org.landxml.schema.landXML11.FaceType)get_store().find_attribute_user(N$2);
                return target;
            }
        }
        
        /**
         * True if has "n" attribute
         */
        public boolean isSetN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(N$2) != null;
            }
        }
        
        /**
         * Sets the "n" attribute
         */
        public void setN(java.util.List n)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(N$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(N$2);
                }
                target.setListValue(n);
            }
        }
        
        /**
         * Sets (as xml) the "n" attribute
         */
        public void xsetN(org.landxml.schema.landXML11.FaceType n)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FaceType target = null;
                target = (org.landxml.schema.landXML11.FaceType)get_store().find_attribute_user(N$2);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.FaceType)get_store().add_attribute_user(N$2);
                }
                target.set(n);
            }
        }
        
        /**
         * Unsets the "n" attribute
         */
        public void unsetN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(N$2);
            }
        }
    }
}
