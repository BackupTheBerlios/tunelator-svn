/*
 * An XML document type.
 * Localname: OutSpiral
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.OutSpiralDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one OutSpiral(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class OutSpiralDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.OutSpiralDocument
{
    
    public OutSpiralDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OUTSPIRAL$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "OutSpiral");
    
    
    /**
     * Gets the "OutSpiral" element
     */
    public org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral getOutSpiral()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral target = null;
            target = (org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral)get_store().find_element_user(OUTSPIRAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OutSpiral" element
     */
    public void setOutSpiral(org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral outSpiral)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral target = null;
            target = (org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral)get_store().find_element_user(OUTSPIRAL$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral)get_store().add_element_user(OUTSPIRAL$0);
            }
            target.set(outSpiral);
        }
    }
    
    /**
     * Appends and returns a new empty "OutSpiral" element
     */
    public org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral addNewOutSpiral()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral target = null;
            target = (org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral)get_store().add_element_user(OUTSPIRAL$0);
            return target;
        }
    }
    /**
     * An XML OutSpiral(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class OutSpiralImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.OutSpiralDocument.OutSpiral
    {
        
        public OutSpiralImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SPIRAL$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Spiral");
        
        
        /**
         * Gets the "Spiral" element
         */
        public org.landxml.schema.landXML11.SpiralDocument.Spiral getSpiral()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SpiralDocument.Spiral target = null;
                target = (org.landxml.schema.landXML11.SpiralDocument.Spiral)get_store().find_element_user(SPIRAL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Spiral" element
         */
        public void setSpiral(org.landxml.schema.landXML11.SpiralDocument.Spiral spiral)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SpiralDocument.Spiral target = null;
                target = (org.landxml.schema.landXML11.SpiralDocument.Spiral)get_store().find_element_user(SPIRAL$0, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SpiralDocument.Spiral)get_store().add_element_user(SPIRAL$0);
                }
                target.set(spiral);
            }
        }
        
        /**
         * Appends and returns a new empty "Spiral" element
         */
        public org.landxml.schema.landXML11.SpiralDocument.Spiral addNewSpiral()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SpiralDocument.Spiral target = null;
                target = (org.landxml.schema.landXML11.SpiralDocument.Spiral)get_store().add_element_user(SPIRAL$0);
                return target;
            }
        }
    }
}
