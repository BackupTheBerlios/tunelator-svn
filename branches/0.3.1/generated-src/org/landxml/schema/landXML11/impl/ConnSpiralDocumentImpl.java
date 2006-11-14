/*
 * An XML document type.
 * Localname: ConnSpiral
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ConnSpiralDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one ConnSpiral(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ConnSpiralDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ConnSpiralDocument
{
    
    public ConnSpiralDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNSPIRAL$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ConnSpiral");
    
    
    /**
     * Gets the "ConnSpiral" element
     */
    public org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral getConnSpiral()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral target = null;
            target = (org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral)get_store().find_element_user(CONNSPIRAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConnSpiral" element
     */
    public void setConnSpiral(org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral connSpiral)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral target = null;
            target = (org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral)get_store().find_element_user(CONNSPIRAL$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral)get_store().add_element_user(CONNSPIRAL$0);
            }
            target.set(connSpiral);
        }
    }
    
    /**
     * Appends and returns a new empty "ConnSpiral" element
     */
    public org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral addNewConnSpiral()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral target = null;
            target = (org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral)get_store().add_element_user(CONNSPIRAL$0);
            return target;
        }
    }
    /**
     * An XML ConnSpiral(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class ConnSpiralImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ConnSpiralDocument.ConnSpiral
    {
        
        public ConnSpiralImpl(org.apache.xmlbeans.SchemaType sType)
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
