/*
 * An XML document type.
 * Localname: StartofRunoutSta
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.StartofRunoutStaDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one StartofRunoutSta(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class StartofRunoutStaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.StartofRunoutStaDocument
{
    
    public StartofRunoutStaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTOFRUNOUTSTA$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "StartofRunoutSta");
    
    
    /**
     * Gets the "StartofRunoutSta" element
     */
    public double getStartofRunoutSta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTOFRUNOUTSTA$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "StartofRunoutSta" element
     */
    public org.landxml.schema.landXML11.Station xgetStartofRunoutSta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Station target = null;
            target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(STARTOFRUNOUTSTA$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "StartofRunoutSta" element
     */
    public boolean isNilStartofRunoutSta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Station target = null;
            target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(STARTOFRUNOUTSTA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "StartofRunoutSta" element
     */
    public void setStartofRunoutSta(double startofRunoutSta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTOFRUNOUTSTA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTOFRUNOUTSTA$0);
            }
            target.setDoubleValue(startofRunoutSta);
        }
    }
    
    /**
     * Sets (as xml) the "StartofRunoutSta" element
     */
    public void xsetStartofRunoutSta(org.landxml.schema.landXML11.Station startofRunoutSta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Station target = null;
            target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(STARTOFRUNOUTSTA$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.Station)get_store().add_element_user(STARTOFRUNOUTSTA$0);
            }
            target.set(startofRunoutSta);
        }
    }
    
    /**
     * Nils the "StartofRunoutSta" element
     */
    public void setNilStartofRunoutSta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Station target = null;
            target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(STARTOFRUNOUTSTA$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.Station)get_store().add_element_user(STARTOFRUNOUTSTA$0);
            }
            target.setNil();
        }
    }
}
