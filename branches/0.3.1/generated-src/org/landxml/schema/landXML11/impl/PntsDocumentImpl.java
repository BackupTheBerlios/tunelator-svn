/*
 * An XML document type.
 * Localname: Pnts
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PntsDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Pnts(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class PntsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PntsDocument
{
    
    public PntsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PNTS$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Pnts");
    
    
    /**
     * Gets the "Pnts" element
     */
    public org.landxml.schema.landXML11.PntsDocument.Pnts getPnts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PntsDocument.Pnts target = null;
            target = (org.landxml.schema.landXML11.PntsDocument.Pnts)get_store().find_element_user(PNTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Pnts" element
     */
    public void setPnts(org.landxml.schema.landXML11.PntsDocument.Pnts pnts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PntsDocument.Pnts target = null;
            target = (org.landxml.schema.landXML11.PntsDocument.Pnts)get_store().find_element_user(PNTS$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PntsDocument.Pnts)get_store().add_element_user(PNTS$0);
            }
            target.set(pnts);
        }
    }
    
    /**
     * Appends and returns a new empty "Pnts" element
     */
    public org.landxml.schema.landXML11.PntsDocument.Pnts addNewPnts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PntsDocument.Pnts target = null;
            target = (org.landxml.schema.landXML11.PntsDocument.Pnts)get_store().add_element_user(PNTS$0);
            return target;
        }
    }
    /**
     * An XML Pnts(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class PntsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PntsDocument.Pnts
    {
        
        public PntsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName P$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "P");
        
        
        /**
         * Gets a List of "P" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PDocument.P> getPList()
        {
            final class PList extends java.util.AbstractList<org.landxml.schema.landXML11.PDocument.P>
            {
                public org.landxml.schema.landXML11.PDocument.P get(int i)
                    { return PntsImpl.this.getPArray(i); }
                
                public org.landxml.schema.landXML11.PDocument.P set(int i, org.landxml.schema.landXML11.PDocument.P o)
                {
                    org.landxml.schema.landXML11.PDocument.P old = PntsImpl.this.getPArray(i);
                    PntsImpl.this.setPArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PDocument.P o)
                    { PntsImpl.this.insertNewP(i).set(o); }
                
                public org.landxml.schema.landXML11.PDocument.P remove(int i)
                {
                    org.landxml.schema.landXML11.PDocument.P old = PntsImpl.this.getPArray(i);
                    PntsImpl.this.removeP(i);
                    return old;
                }
                
                public int size()
                    { return PntsImpl.this.sizeOfPArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PList();
            }
        }
        
        /**
         * Gets array of all "P" elements
         */
        public org.landxml.schema.landXML11.PDocument.P[] getPArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(P$0, targetList);
                org.landxml.schema.landXML11.PDocument.P[] result = new org.landxml.schema.landXML11.PDocument.P[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "P" element
         */
        public org.landxml.schema.landXML11.PDocument.P getPArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PDocument.P target = null;
                target = (org.landxml.schema.landXML11.PDocument.P)get_store().find_element_user(P$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "P" element
         */
        public int sizeOfPArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(P$0);
            }
        }
        
        /**
         * Sets array of all "P" element
         */
        public void setPArray(org.landxml.schema.landXML11.PDocument.P[] pArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pArray, P$0);
            }
        }
        
        /**
         * Sets ith "P" element
         */
        public void setPArray(int i, org.landxml.schema.landXML11.PDocument.P p)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PDocument.P target = null;
                target = (org.landxml.schema.landXML11.PDocument.P)get_store().find_element_user(P$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(p);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "P" element
         */
        public org.landxml.schema.landXML11.PDocument.P insertNewP(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PDocument.P target = null;
                target = (org.landxml.schema.landXML11.PDocument.P)get_store().insert_element_user(P$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "P" element
         */
        public org.landxml.schema.landXML11.PDocument.P addNewP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PDocument.P target = null;
                target = (org.landxml.schema.landXML11.PDocument.P)get_store().add_element_user(P$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "P" element
         */
        public void removeP(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(P$0, i);
            }
        }
    }
}
