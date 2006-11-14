/*
 * An XML document type.
 * Localname: PntList3D
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PntList3DDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one PntList3D(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class PntList3DDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PntList3DDocument
{
    
    public PntList3DDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PNTLIST3D$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PntList3D");
    
    
    /**
     * Gets the "PntList3D" element
     */
    public java.util.List getPntList3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PNTLIST3D$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "PntList3D" element
     */
    public org.landxml.schema.landXML11.PntList3DDocument.PntList3D xgetPntList3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PntList3DDocument.PntList3D target = null;
            target = (org.landxml.schema.landXML11.PntList3DDocument.PntList3D)get_store().find_element_user(PNTLIST3D$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PntList3D" element
     */
    public void setPntList3D(java.util.List pntList3D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PNTLIST3D$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PNTLIST3D$0);
            }
            target.setListValue(pntList3D);
        }
    }
    
    /**
     * Sets (as xml) the "PntList3D" element
     */
    public void xsetPntList3D(org.landxml.schema.landXML11.PntList3DDocument.PntList3D pntList3D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PntList3DDocument.PntList3D target = null;
            target = (org.landxml.schema.landXML11.PntList3DDocument.PntList3D)get_store().find_element_user(PNTLIST3D$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PntList3DDocument.PntList3D)get_store().add_element_user(PNTLIST3D$0);
            }
            target.set(pntList3D);
        }
    }
    /**
     * An XML PntList3D(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlDouble.
     */
    public static class PntList3DImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.landxml.schema.landXML11.PntList3DDocument.PntList3D
    {
        
        public PntList3DImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected PntList3DImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
