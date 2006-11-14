/*
 * An XML document type.
 * Localname: PntList2D
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PntList2DDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one PntList2D(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class PntList2DDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PntList2DDocument
{
    
    public PntList2DDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PNTLIST2D$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PntList2D");
    
    
    /**
     * Gets the "PntList2D" element
     */
    public java.util.List getPntList2D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PNTLIST2D$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "PntList2D" element
     */
    public org.landxml.schema.landXML11.PntList2DDocument.PntList2D xgetPntList2D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PntList2DDocument.PntList2D target = null;
            target = (org.landxml.schema.landXML11.PntList2DDocument.PntList2D)get_store().find_element_user(PNTLIST2D$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PntList2D" element
     */
    public void setPntList2D(java.util.List pntList2D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PNTLIST2D$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PNTLIST2D$0);
            }
            target.setListValue(pntList2D);
        }
    }
    
    /**
     * Sets (as xml) the "PntList2D" element
     */
    public void xsetPntList2D(org.landxml.schema.landXML11.PntList2DDocument.PntList2D pntList2D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PntList2DDocument.PntList2D target = null;
            target = (org.landxml.schema.landXML11.PntList2DDocument.PntList2D)get_store().find_element_user(PNTLIST2D$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PntList2DDocument.PntList2D)get_store().add_element_user(PNTLIST2D$0);
            }
            target.set(pntList2D);
        }
    }
    /**
     * An XML PntList2D(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlDouble.
     */
    public static class PntList2DImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.landxml.schema.landXML11.PntList2DDocument.PntList2D
    {
        
        public PntList2DImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected PntList2DImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
