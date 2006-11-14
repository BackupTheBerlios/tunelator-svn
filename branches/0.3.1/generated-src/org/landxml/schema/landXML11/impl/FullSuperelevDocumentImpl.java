/*
 * An XML document type.
 * Localname: FullSuperelev
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.FullSuperelevDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one FullSuperelev(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class FullSuperelevDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.FullSuperelevDocument
{
    
    public FullSuperelevDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULLSUPERELEV$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FullSuperelev");
    
    
    /**
     * Gets the "FullSuperelev" element
     */
    public double getFullSuperelev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULLSUPERELEV$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "FullSuperelev" element
     */
    public org.landxml.schema.landXML11.Slope xgetFullSuperelev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Slope target = null;
            target = (org.landxml.schema.landXML11.Slope)get_store().find_element_user(FULLSUPERELEV$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FullSuperelev" element
     */
    public void setFullSuperelev(double fullSuperelev)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULLSUPERELEV$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FULLSUPERELEV$0);
            }
            target.setDoubleValue(fullSuperelev);
        }
    }
    
    /**
     * Sets (as xml) the "FullSuperelev" element
     */
    public void xsetFullSuperelev(org.landxml.schema.landXML11.Slope fullSuperelev)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.Slope target = null;
            target = (org.landxml.schema.landXML11.Slope)get_store().find_element_user(FULLSUPERELEV$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.Slope)get_store().add_element_user(FULLSUPERELEV$0);
            }
            target.set(fullSuperelev);
        }
    }
}
