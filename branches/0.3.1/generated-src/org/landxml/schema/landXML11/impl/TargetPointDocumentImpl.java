/*
 * An XML document type.
 * Localname: TargetPoint
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.TargetPointDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one TargetPoint(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class TargetPointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.TargetPointDocument
{
    
    public TargetPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETPOINT$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "TargetPoint");
    
    
    /**
     * Gets the "TargetPoint" element
     */
    public org.landxml.schema.landXML11.PointType getTargetPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointType target = null;
            target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(TARGETPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TargetPoint" element
     */
    public void setTargetPoint(org.landxml.schema.landXML11.PointType targetPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointType target = null;
            target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(TARGETPOINT$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(TARGETPOINT$0);
            }
            target.set(targetPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "TargetPoint" element
     */
    public org.landxml.schema.landXML11.PointType addNewTargetPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointType target = null;
            target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(TARGETPOINT$0);
            return target;
        }
    }
}
