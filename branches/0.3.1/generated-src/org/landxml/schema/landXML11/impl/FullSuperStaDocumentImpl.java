/*
 * An XML document type.
 * Localname: FullSuperSta
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.FullSuperStaDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one FullSuperSta(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class FullSuperStaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.FullSuperStaDocument
{
    
    public FullSuperStaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULLSUPERSTA$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FullSuperSta");
    
    
    /**
     * Gets the "FullSuperSta" element
     */
    public double getFullSuperSta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULLSUPERSTA$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "FullSuperSta" element
     */
    public org.landxml.schema.landXML11.Station xgetFullSuperSta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Station target = null;
            target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(FULLSUPERSTA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FullSuperSta" element
     */
    public void setFullSuperSta(double fullSuperSta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULLSUPERSTA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FULLSUPERSTA$0);
            }
            target.setDoubleValue(fullSuperSta);
        }
    }
    
    /**
     * Sets (as xml) the "FullSuperSta" element
     */
    public void xsetFullSuperSta(org.landxml.schema.landXML11.Station fullSuperSta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Station target = null;
            target = (org.landxml.schema.landXML11.Station)get_store().find_element_user(FULLSUPERSTA$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.Station)get_store().add_element_user(FULLSUPERSTA$0);
            }
            target.set(fullSuperSta);
        }
    }
}
