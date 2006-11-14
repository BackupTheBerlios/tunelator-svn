/*
 * An XML document type.
 * Localname: Curve2
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.Curve2Document
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Curve2(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class Curve2DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.Curve2Document
{
    
    public Curve2DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVE2$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Curve2");
    
    
    /**
     * Gets the "Curve2" element
     */
    public org.landxml.schema.landXML11.Curve2Document.Curve2 getCurve2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Curve2Document.Curve2 target = null;
            target = (org.landxml.schema.landXML11.Curve2Document.Curve2)get_store().find_element_user(CURVE2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Curve2" element
     */
    public void setCurve2(org.landxml.schema.landXML11.Curve2Document.Curve2 curve2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Curve2Document.Curve2 target = null;
            target = (org.landxml.schema.landXML11.Curve2Document.Curve2)get_store().find_element_user(CURVE2$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.Curve2Document.Curve2)get_store().add_element_user(CURVE2$0);
            }
            target.set(curve2);
        }
    }
    
    /**
     * Appends and returns a new empty "Curve2" element
     */
    public org.landxml.schema.landXML11.Curve2Document.Curve2 addNewCurve2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Curve2Document.Curve2 target = null;
            target = (org.landxml.schema.landXML11.Curve2Document.Curve2)get_store().add_element_user(CURVE2$0);
            return target;
        }
    }
    /**
     * An XML Curve2(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class Curve2Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.Curve2Document.Curve2
    {
        
        public Curve2Impl(org.apache.xmlbeans.SchemaType sType)
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
