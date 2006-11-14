/*
 * An XML document type.
 * Localname: EndofRunoutSta
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.EndofRunoutStaDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one EndofRunoutSta(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class EndofRunoutStaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.EndofRunoutStaDocument
{
    
    public EndofRunoutStaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDOFRUNOUTSTA$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "EndofRunoutSta");
    
    
    /**
     * Gets the "EndofRunoutSta" element
     */
    public double getEndofRunoutSta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDOFRUNOUTSTA$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndofRunoutSta" element
     */
    public org.landxml.schema.landXML11.Station xgetEndofRunoutSta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Station target = null;
            target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(ENDOFRUNOUTSTA$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EndofRunoutSta" element
     */
    public boolean isNilEndofRunoutSta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Station target = null;
            target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(ENDOFRUNOUTSTA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EndofRunoutSta" element
     */
    public void setEndofRunoutSta(double endofRunoutSta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDOFRUNOUTSTA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDOFRUNOUTSTA$0);
            }
            target.setDoubleValue(endofRunoutSta);
        }
    }
    
    /**
     * Sets (as xml) the "EndofRunoutSta" element
     */
    public void xsetEndofRunoutSta(org.landxml.schema.landXML11.Station endofRunoutSta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Station target = null;
            target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(ENDOFRUNOUTSTA$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.Station)get_store().add_element_user(ENDOFRUNOUTSTA$0);
            }
            target.set(endofRunoutSta);
        }
    }
    
    /**
     * Nils the "EndofRunoutSta" element
     */
    public void setNilEndofRunoutSta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Station target = null;
            target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(ENDOFRUNOUTSTA$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.Station)get_store().add_element_user(ENDOFRUNOUTSTA$0);
            }
            target.setNil();
        }
    }
}
