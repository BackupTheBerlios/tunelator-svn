/*
 * An XML document type.
 * Localname: Units
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.UnitsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Units(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class UnitsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.UnitsDocument
{
    
    public UnitsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNITS$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Units");
    
    
    /**
     * Gets the "Units" element
     */
    public org.landxml.schema.landXML11.UnitsDocument.Units getUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.UnitsDocument.Units target = null;
            target = (org.landxml.schema.landXML11.UnitsDocument.Units)get_store().find_element_user(UNITS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Units" element
     */
    public void setUnits(org.landxml.schema.landXML11.UnitsDocument.Units units)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.UnitsDocument.Units target = null;
            target = (org.landxml.schema.landXML11.UnitsDocument.Units)get_store().find_element_user(UNITS$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.UnitsDocument.Units)get_store().add_element_user(UNITS$0);
            }
            target.set(units);
        }
    }
    
    /**
     * Appends and returns a new empty "Units" element
     */
    public org.landxml.schema.landXML11.UnitsDocument.Units addNewUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.UnitsDocument.Units target = null;
            target = (org.landxml.schema.landXML11.UnitsDocument.Units)get_store().add_element_user(UNITS$0);
            return target;
        }
    }
    /**
     * An XML Units(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class UnitsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.UnitsDocument.Units
    {
        
        public UnitsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName METRIC$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Metric");
        private static final javax.xml.namespace.QName IMPERIAL$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Imperial");
        
        
        /**
         * Gets the "Metric" element
         */
        public org.landxml.schema.landXML11.MetricDocument.Metric getMetric()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MetricDocument.Metric target = null;
                target = (org.landxml.schema.landXML11.MetricDocument.Metric)get_store().find_element_user(METRIC$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Metric" element
         */
        public boolean isSetMetric()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(METRIC$0) != 0;
            }
        }
        
        /**
         * Sets the "Metric" element
         */
        public void setMetric(org.landxml.schema.landXML11.MetricDocument.Metric metric)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MetricDocument.Metric target = null;
                target = (org.landxml.schema.landXML11.MetricDocument.Metric)get_store().find_element_user(METRIC$0, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.MetricDocument.Metric)get_store().add_element_user(METRIC$0);
                }
                target.set(metric);
            }
        }
        
        /**
         * Appends and returns a new empty "Metric" element
         */
        public org.landxml.schema.landXML11.MetricDocument.Metric addNewMetric()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MetricDocument.Metric target = null;
                target = (org.landxml.schema.landXML11.MetricDocument.Metric)get_store().add_element_user(METRIC$0);
                return target;
            }
        }
        
        /**
         * Unsets the "Metric" element
         */
        public void unsetMetric()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(METRIC$0, 0);
            }
        }
        
        /**
         * Gets the "Imperial" element
         */
        public org.landxml.schema.landXML11.ImperialDocument.Imperial getImperial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImperialDocument.Imperial target = null;
                target = (org.landxml.schema.landXML11.ImperialDocument.Imperial)get_store().find_element_user(IMPERIAL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Imperial" element
         */
        public boolean isSetImperial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IMPERIAL$2) != 0;
            }
        }
        
        /**
         * Sets the "Imperial" element
         */
        public void setImperial(org.landxml.schema.landXML11.ImperialDocument.Imperial imperial)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImperialDocument.Imperial target = null;
                target = (org.landxml.schema.landXML11.ImperialDocument.Imperial)get_store().find_element_user(IMPERIAL$2, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ImperialDocument.Imperial)get_store().add_element_user(IMPERIAL$2);
                }
                target.set(imperial);
            }
        }
        
        /**
         * Appends and returns a new empty "Imperial" element
         */
        public org.landxml.schema.landXML11.ImperialDocument.Imperial addNewImperial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImperialDocument.Imperial target = null;
                target = (org.landxml.schema.landXML11.ImperialDocument.Imperial)get_store().add_element_user(IMPERIAL$2);
                return target;
            }
        }
        
        /**
         * Unsets the "Imperial" element
         */
        public void unsetImperial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IMPERIAL$2, 0);
            }
        }
    }
}
