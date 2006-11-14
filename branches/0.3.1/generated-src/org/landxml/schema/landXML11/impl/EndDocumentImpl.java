/*
 * An XML document type.
 * Localname: End
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.EndDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one End(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class EndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.EndDocument
{
    
    public EndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName END$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "End");
    
    
    /**
     * Gets the "End" element
     */
    public org.landxml.schema.landXML11.PointType getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointType target = null;
            target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(END$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "End" element
     */
    public void setEnd(org.landxml.schema.landXML11.PointType end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointType target = null;
            target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(END$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(END$0);
            }
            target.set(end);
        }
    }
    
    /**
     * Appends and returns a new empty "End" element
     */
    public org.landxml.schema.landXML11.PointType addNewEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointType target = null;
            target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(END$0);
            return target;
        }
    }
}
