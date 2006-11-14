/*
 * An XML document type.
 * Localname: MapPoint
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.MapPointDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one MapPoint(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class MapPointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.MapPointDocument
{
    
    public MapPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPPOINT$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "MapPoint");
    
    
    /**
     * Gets the "MapPoint" element
     */
    public org.landxml.schema.landXML11.PointType getMapPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointType target = null;
            target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(MAPPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MapPoint" element
     */
    public void setMapPoint(org.landxml.schema.landXML11.PointType mapPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointType target = null;
            target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(MAPPOINT$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(MAPPOINT$0);
            }
            target.set(mapPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "MapPoint" element
     */
    public org.landxml.schema.landXML11.PointType addNewMapPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PointType target = null;
            target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(MAPPOINT$0);
            return target;
        }
    }
}
