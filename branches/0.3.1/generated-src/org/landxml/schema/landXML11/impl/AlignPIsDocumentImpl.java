/*
 * An XML document type.
 * Localname: AlignPIs
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.AlignPIsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one AlignPIs(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class AlignPIsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.AlignPIsDocument
{
    
    public AlignPIsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALIGNPIS$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "AlignPIs");
    
    
    /**
     * Gets the "AlignPIs" element
     */
    public org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs getAlignPIs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs target = null;
            target = (org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs)get_store().find_element_user(ALIGNPIS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AlignPIs" element
     */
    public void setAlignPIs(org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs alignPIs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs target = null;
            target = (org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs)get_store().find_element_user(ALIGNPIS$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs)get_store().add_element_user(ALIGNPIS$0);
            }
            target.set(alignPIs);
        }
    }
    
    /**
     * Appends and returns a new empty "AlignPIs" element
     */
    public org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs addNewAlignPIs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs target = null;
            target = (org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs)get_store().add_element_user(ALIGNPIS$0);
            return target;
        }
    }
    /**
     * An XML AlignPIs(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class AlignPIsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.AlignPIsDocument.AlignPIs
    {
        
        public AlignPIsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ALIGNPI$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "AlignPI");
        
        
        /**
         * Gets a List of "AlignPI" elements
         */
        public java.util.List<org.landxml.schema.landXML11.AlignPIDocument.AlignPI> getAlignPIList()
        {
            final class AlignPIList extends java.util.AbstractList<org.landxml.schema.landXML11.AlignPIDocument.AlignPI>
            {
                public org.landxml.schema.landXML11.AlignPIDocument.AlignPI get(int i)
                    { return AlignPIsImpl.this.getAlignPIArray(i); }
                
                public org.landxml.schema.landXML11.AlignPIDocument.AlignPI set(int i, org.landxml.schema.landXML11.AlignPIDocument.AlignPI o)
                {
                    org.landxml.schema.landXML11.AlignPIDocument.AlignPI old = AlignPIsImpl.this.getAlignPIArray(i);
                    AlignPIsImpl.this.setAlignPIArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.AlignPIDocument.AlignPI o)
                    { AlignPIsImpl.this.insertNewAlignPI(i).set(o); }
                
                public org.landxml.schema.landXML11.AlignPIDocument.AlignPI remove(int i)
                {
                    org.landxml.schema.landXML11.AlignPIDocument.AlignPI old = AlignPIsImpl.this.getAlignPIArray(i);
                    AlignPIsImpl.this.removeAlignPI(i);
                    return old;
                }
                
                public int size()
                    { return AlignPIsImpl.this.sizeOfAlignPIArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new AlignPIList();
            }
        }
        
        /**
         * Gets array of all "AlignPI" elements
         */
        public org.landxml.schema.landXML11.AlignPIDocument.AlignPI[] getAlignPIArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALIGNPI$0, targetList);
                org.landxml.schema.landXML11.AlignPIDocument.AlignPI[] result = new org.landxml.schema.landXML11.AlignPIDocument.AlignPI[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AlignPI" element
         */
        public org.landxml.schema.landXML11.AlignPIDocument.AlignPI getAlignPIArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignPIDocument.AlignPI target = null;
                target = (org.landxml.schema.landXML11.AlignPIDocument.AlignPI)get_store().find_element_user(ALIGNPI$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AlignPI" element
         */
        public int sizeOfAlignPIArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALIGNPI$0);
            }
        }
        
        /**
         * Sets array of all "AlignPI" element
         */
        public void setAlignPIArray(org.landxml.schema.landXML11.AlignPIDocument.AlignPI[] alignPIArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(alignPIArray, ALIGNPI$0);
            }
        }
        
        /**
         * Sets ith "AlignPI" element
         */
        public void setAlignPIArray(int i, org.landxml.schema.landXML11.AlignPIDocument.AlignPI alignPI)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignPIDocument.AlignPI target = null;
                target = (org.landxml.schema.landXML11.AlignPIDocument.AlignPI)get_store().find_element_user(ALIGNPI$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(alignPI);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AlignPI" element
         */
        public org.landxml.schema.landXML11.AlignPIDocument.AlignPI insertNewAlignPI(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignPIDocument.AlignPI target = null;
                target = (org.landxml.schema.landXML11.AlignPIDocument.AlignPI)get_store().insert_element_user(ALIGNPI$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AlignPI" element
         */
        public org.landxml.schema.landXML11.AlignPIDocument.AlignPI addNewAlignPI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignPIDocument.AlignPI target = null;
                target = (org.landxml.schema.landXML11.AlignPIDocument.AlignPI)get_store().add_element_user(ALIGNPI$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "AlignPI" element
         */
        public void removeAlignPI(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALIGNPI$0, i);
            }
        }
    }
}
