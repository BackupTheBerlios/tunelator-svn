/*
 * An XML document type.
 * Localname: BacksightPoint
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.BacksightPointDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one BacksightPoint(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class BacksightPointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.BacksightPointDocument
{
    
    public BacksightPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BACKSIGHTPOINT$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "BacksightPoint");
    
    
    /**
     * Gets the "BacksightPoint" element
     */
    public org.landxml.schema.landXML11.PointType getBacksightPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointType target = null;
            target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(BACKSIGHTPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BacksightPoint" element
     */
    public void setBacksightPoint(org.landxml.schema.landXML11.PointType backsightPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointType target = null;
            target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(BACKSIGHTPOINT$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(BACKSIGHTPOINT$0);
            }
            target.set(backsightPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "BacksightPoint" element
     */
    public org.landxml.schema.landXML11.PointType addNewBacksightPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointType target = null;
            target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(BACKSIGHTPOINT$0);
            return target;
        }
    }
}
