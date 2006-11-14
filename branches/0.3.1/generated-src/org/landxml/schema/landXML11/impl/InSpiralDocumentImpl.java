/*
 * An XML document type.
 * Localname: InSpiral
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.InSpiralDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one InSpiral(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class InSpiralDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.InSpiralDocument
{
    
    public InSpiralDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSPIRAL$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "InSpiral");
    
    
    /**
     * Gets the "InSpiral" element
     */
    public org.landxml.schema.landXML11.InSpiralDocument.InSpiral getInSpiral()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.InSpiralDocument.InSpiral target = null;
            target = (org.landxml.schema.landXML11.InSpiralDocument.InSpiral)get_store().find_element_user(INSPIRAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InSpiral" element
     */
    public void setInSpiral(org.landxml.schema.landXML11.InSpiralDocument.InSpiral inSpiral)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.InSpiralDocument.InSpiral target = null;
            target = (org.landxml.schema.landXML11.InSpiralDocument.InSpiral)get_store().find_element_user(INSPIRAL$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.InSpiralDocument.InSpiral)get_store().add_element_user(INSPIRAL$0);
            }
            target.set(inSpiral);
        }
    }
    
    /**
     * Appends and returns a new empty "InSpiral" element
     */
    public org.landxml.schema.landXML11.InSpiralDocument.InSpiral addNewInSpiral()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.InSpiralDocument.InSpiral target = null;
            target = (org.landxml.schema.landXML11.InSpiralDocument.InSpiral)get_store().add_element_user(INSPIRAL$0);
            return target;
        }
    }
    /**
     * An XML InSpiral(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class InSpiralImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.InSpiralDocument.InSpiral
    {
        
        public InSpiralImpl(org.apache.xmlbeans.SchemaType sType)
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
