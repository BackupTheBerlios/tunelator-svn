/*
 * An XML document type.
 * Localname: Curve1
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.Curve1Document
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Curve1(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class Curve1DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.Curve1Document
{
    
    public Curve1DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVE1$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Curve1");
    
    
    /**
     * Gets the "Curve1" element
     */
    public org.landxml.schema.landXML11.Curve1Document.Curve1 getCurve1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Curve1Document.Curve1 target = null;
            target = (org.landxml.schema.landXML11.Curve1Document.Curve1)get_store().find_element_user(CURVE1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Curve1" element
     */
    public void setCurve1(org.landxml.schema.landXML11.Curve1Document.Curve1 curve1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Curve1Document.Curve1 target = null;
            target = (org.landxml.schema.landXML11.Curve1Document.Curve1)get_store().find_element_user(CURVE1$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.Curve1Document.Curve1)get_store().add_element_user(CURVE1$0);
            }
            target.set(curve1);
        }
    }
    
    /**
     * Appends and returns a new empty "Curve1" element
     */
    public org.landxml.schema.landXML11.Curve1Document.Curve1 addNewCurve1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Curve1Document.Curve1 target = null;
            target = (org.landxml.schema.landXML11.Curve1Document.Curve1)get_store().add_element_user(CURVE1$0);
            return target;
        }
    }
    /**
     * An XML Curve1(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class Curve1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.Curve1Document.Curve1
    {
        
        public Curve1Impl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CURVE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Curve");
        
        
        /**
         * Gets the "Curve" element
         */
        public org.landxml.schema.landXML11.CurveDocument.Curve getCurve()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CurveDocument.Curve target = null;
                target = (org.landxml.schema.landXML11.CurveDocument.Curve)get_store().find_element_user(CURVE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Curve" element
         */
        public void setCurve(org.landxml.schema.landXML11.CurveDocument.Curve curve)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CurveDocument.Curve target = null;
                target = (org.landxml.schema.landXML11.CurveDocument.Curve)get_store().find_element_user(CURVE$0, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CurveDocument.Curve)get_store().add_element_user(CURVE$0);
                }
                target.set(curve);
            }
        }
        
        /**
         * Appends and returns a new empty "Curve" element
         */
        public org.landxml.schema.landXML11.CurveDocument.Curve addNewCurve()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CurveDocument.Curve target = null;
                target = (org.landxml.schema.landXML11.CurveDocument.Curve)get_store().add_element_user(CURVE$0);
                return target;
            }
        }
    }
}
