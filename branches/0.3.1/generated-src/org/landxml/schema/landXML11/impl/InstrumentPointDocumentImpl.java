/*
 * An XML document type.
 * Localname: InstrumentPoint
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.InstrumentPointDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one InstrumentPoint(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class InstrumentPointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.InstrumentPointDocument
{
    
    public InstrumentPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTRUMENTPOINT$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "InstrumentPoint");
    
    
    /**
     * Gets the "InstrumentPoint" element
     */
    public org.landxml.schema.landXML11.PointType getInstrumentPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointType target = null;
            target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(INSTRUMENTPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InstrumentPoint" element
     */
    public void setInstrumentPoint(org.landxml.schema.landXML11.PointType instrumentPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointType target = null;
            target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(INSTRUMENTPOINT$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(INSTRUMENTPOINT$0);
            }
            target.set(instrumentPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "InstrumentPoint" element
     */
    public org.landxml.schema.landXML11.PointType addNewInstrumentPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointType target = null;
            target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(INSTRUMENTPOINT$0);
            return target;
        }
    }
}
