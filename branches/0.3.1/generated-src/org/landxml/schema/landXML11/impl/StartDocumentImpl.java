/*
 * An XML document type.
 * Localname: Start
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.StartDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Start(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class StartDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.StartDocument
{
    
    public StartDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName START$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Start");
    
    
    /**
     * Gets the "Start" element
     */
    public org.landxml.schema.landXML11.PointType getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointType target = null;
            target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(START$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Start" element
     */
    public void setStart(org.landxml.schema.landXML11.PointType start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointType target = null;
            target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(START$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(START$0);
            }
            target.set(start);
        }
    }
    
    /**
     * Appends and returns a new empty "Start" element
     */
    public org.landxml.schema.landXML11.PointType addNewStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointType target = null;
            target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(START$0);
            return target;
        }
    }
}
