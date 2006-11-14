/*
 * An XML document type.
 * Localname: BeginRunoutSta
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.BeginRunoutStaDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one BeginRunoutSta(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class BeginRunoutStaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.BeginRunoutStaDocument
{
    
    public BeginRunoutStaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEGINRUNOUTSTA$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "BeginRunoutSta");
    
    
    /**
     * Gets the "BeginRunoutSta" element
     */
    public double getBeginRunoutSta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINRUNOUTSTA$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "BeginRunoutSta" element
     */
    public org.landxml.schema.landXML11.Station xgetBeginRunoutSta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Station target = null;
            target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(BEGINRUNOUTSTA$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "BeginRunoutSta" element
     */
    public boolean isNilBeginRunoutSta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Station target = null;
            target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(BEGINRUNOUTSTA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "BeginRunoutSta" element
     */
    public void setBeginRunoutSta(double beginRunoutSta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINRUNOUTSTA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEGINRUNOUTSTA$0);
            }
            target.setDoubleValue(beginRunoutSta);
        }
    }
    
    /**
     * Sets (as xml) the "BeginRunoutSta" element
     */
    public void xsetBeginRunoutSta(org.landxml.schema.landXML11.Station beginRunoutSta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Station target = null;
            target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(BEGINRUNOUTSTA$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.Station)get_store().add_element_user(BEGINRUNOUTSTA$0);
            }
            target.set(beginRunoutSta);
        }
    }
    
    /**
     * Nils the "BeginRunoutSta" element
     */
    public void setNilBeginRunoutSta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Station target = null;
            target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(BEGINRUNOUTSTA$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.Station)get_store().add_element_user(BEGINRUNOUTSTA$0);
            }
            target.setNil();
        }
    }
}
