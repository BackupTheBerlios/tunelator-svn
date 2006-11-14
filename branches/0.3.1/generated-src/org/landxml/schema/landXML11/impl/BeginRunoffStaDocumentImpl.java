/*
 * An XML document type.
 * Localname: BeginRunoffSta
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.BeginRunoffStaDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one BeginRunoffSta(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class BeginRunoffStaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.BeginRunoffStaDocument
{
    
    public BeginRunoffStaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEGINRUNOFFSTA$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "BeginRunoffSta");
    
    
    /**
     * Gets the "BeginRunoffSta" element
     */
    public double getBeginRunoffSta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINRUNOFFSTA$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "BeginRunoffSta" element
     */
    public org.landxml.schema.landXML11.Station xgetBeginRunoffSta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Station target = null;
            target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(BEGINRUNOFFSTA$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "BeginRunoffSta" element
     */
    public boolean isNilBeginRunoffSta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Station target = null;
            target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(BEGINRUNOFFSTA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "BeginRunoffSta" element
     */
    public void setBeginRunoffSta(double beginRunoffSta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINRUNOFFSTA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEGINRUNOFFSTA$0);
            }
            target.setDoubleValue(beginRunoffSta);
        }
    }
    
    /**
     * Sets (as xml) the "BeginRunoffSta" element
     */
    public void xsetBeginRunoffSta(org.landxml.schema.landXML11.Station beginRunoffSta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Station target = null;
            target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(BEGINRUNOFFSTA$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.Station)get_store().add_element_user(BEGINRUNOFFSTA$0);
            }
            target.set(beginRunoffSta);
        }
    }
    
    /**
     * Nils the "BeginRunoffSta" element
     */
    public void setNilBeginRunoffSta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Station target = null;
            target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(BEGINRUNOFFSTA$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.Station)get_store().add_element_user(BEGINRUNOFFSTA$0);
            }
            target.setNil();
        }
    }
}
