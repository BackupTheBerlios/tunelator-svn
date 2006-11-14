/*
 * An XML document type.
 * Localname: AdverseSE
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.AdverseSEDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one AdverseSE(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class AdverseSEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.AdverseSEDocument
{
    
    public AdverseSEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADVERSESE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "AdverseSE");
    
    
    /**
     * Gets the "AdverseSE" element
     */
    public org.landxml.schema.landXML11.AdverseSEType.Enum getAdverseSE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADVERSESE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.landxml.schema.landXML11.AdverseSEType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "AdverseSE" element
     */
    public org.landxml.schema.landXML11.AdverseSEType xgetAdverseSE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AdverseSEType target = null;
            target = (org.landxml.schema.landXML11.AdverseSEType)get_store().find_element_user(ADVERSESE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AdverseSE" element
     */
    public void setAdverseSE(org.landxml.schema.landXML11.AdverseSEType.Enum adverseSE)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADVERSESE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADVERSESE$0);
            }
            target.setEnumValue(adverseSE);
        }
    }
    
    /**
     * Sets (as xml) the "AdverseSE" element
     */
    public void xsetAdverseSE(org.landxml.schema.landXML11.AdverseSEType adverseSE)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AdverseSEType target = null;
            target = (org.landxml.schema.landXML11.AdverseSEType)get_store().find_element_user(ADVERSESE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.AdverseSEType)get_store().add_element_user(ADVERSESE$0);
            }
            target.set(adverseSE);
        }
    }
}
