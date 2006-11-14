/*
 * An XML document type.
 * Localname: Amendment
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.AmendmentDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Amendment(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class AmendmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.AmendmentDocument
{
    
    public AmendmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AMENDMENT$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Amendment");
    
    
    /**
     * Gets the "Amendment" element
     */
    public org.landxml.schema.landXML11.AmendmentDocument.Amendment getAmendment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AmendmentDocument.Amendment target = null;
            target = (org.landxml.schema.landXML11.AmendmentDocument.Amendment)get_store().find_element_user(AMENDMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Amendment" element
     */
    public void setAmendment(org.landxml.schema.landXML11.AmendmentDocument.Amendment amendment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AmendmentDocument.Amendment target = null;
            target = (org.landxml.schema.landXML11.AmendmentDocument.Amendment)get_store().find_element_user(AMENDMENT$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.AmendmentDocument.Amendment)get_store().add_element_user(AMENDMENT$0);
            }
            target.set(amendment);
        }
    }
    
    /**
     * Appends and returns a new empty "Amendment" element
     */
    public org.landxml.schema.landXML11.AmendmentDocument.Amendment addNewAmendment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AmendmentDocument.Amendment target = null;
            target = (org.landxml.schema.landXML11.AmendmentDocument.Amendment)get_store().add_element_user(AMENDMENT$0);
            return target;
        }
    }
    /**
     * An XML Amendment(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class AmendmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.AmendmentDocument.Amendment
    {
        
        public AmendmentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AMENDMENTITEM$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "AmendmentItem");
        private static final javax.xml.namespace.QName DEALINGNUMBER$2 = 
            new javax.xml.namespace.QName("", "dealingNumber");
        private static final javax.xml.namespace.QName AMENDMENTDATE$4 = 
            new javax.xml.namespace.QName("", "amendmentDate");
        private static final javax.xml.namespace.QName COMMENTS$6 = 
            new javax.xml.namespace.QName("", "comments");
        
        
        /**
         * Gets a List of "AmendmentItem" elements
         */
        public java.util.List<org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem> getAmendmentItemList()
        {
            final class AmendmentItemList extends java.util.AbstractList<org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem>
            {
                public org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem get(int i)
                    { return AmendmentImpl.this.getAmendmentItemArray(i); }
                
                public org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem set(int i, org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem o)
                {
                    org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem old = AmendmentImpl.this.getAmendmentItemArray(i);
                    AmendmentImpl.this.setAmendmentItemArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem o)
                    { AmendmentImpl.this.insertNewAmendmentItem(i).set(o); }
                
                public org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem remove(int i)
                {
                    org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem old = AmendmentImpl.this.getAmendmentItemArray(i);
                    AmendmentImpl.this.removeAmendmentItem(i);
                    return old;
                }
                
                public int size()
                    { return AmendmentImpl.this.sizeOfAmendmentItemArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new AmendmentItemList();
            }
        }
        
        /**
         * Gets array of all "AmendmentItem" elements
         */
        public org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem[] getAmendmentItemArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(AMENDMENTITEM$0, targetList);
                org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem[] result = new org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AmendmentItem" element
         */
        public org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem getAmendmentItemArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem target = null;
                target = (org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem)get_store().find_element_user(AMENDMENTITEM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AmendmentItem" element
         */
        public int sizeOfAmendmentItemArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AMENDMENTITEM$0);
            }
        }
        
        /**
         * Sets array of all "AmendmentItem" element
         */
        public void setAmendmentItemArray(org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem[] amendmentItemArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(amendmentItemArray, AMENDMENTITEM$0);
            }
        }
        
        /**
         * Sets ith "AmendmentItem" element
         */
        public void setAmendmentItemArray(int i, org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem amendmentItem)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem target = null;
                target = (org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem)get_store().find_element_user(AMENDMENTITEM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(amendmentItem);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AmendmentItem" element
         */
        public org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem insertNewAmendmentItem(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem target = null;
                target = (org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem)get_store().insert_element_user(AMENDMENTITEM$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AmendmentItem" element
         */
        public org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem addNewAmendmentItem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem target = null;
                target = (org.landxml.schema.landXML11.AmendmentItemDocument.AmendmentItem)get_store().add_element_user(AMENDMENTITEM$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "AmendmentItem" element
         */
        public void removeAmendmentItem(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AMENDMENTITEM$0, i);
            }
        }
        
        /**
         * Gets the "dealingNumber" attribute
         */
        public java.lang.String getDealingNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEALINGNUMBER$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "dealingNumber" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDealingNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEALINGNUMBER$2);
                return target;
            }
        }
        
        /**
         * True if has "dealingNumber" attribute
         */
        public boolean isSetDealingNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEALINGNUMBER$2) != null;
            }
        }
        
        /**
         * Sets the "dealingNumber" attribute
         */
        public void setDealingNumber(java.lang.String dealingNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEALINGNUMBER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEALINGNUMBER$2);
                }
                target.setStringValue(dealingNumber);
            }
        }
        
        /**
         * Sets (as xml) the "dealingNumber" attribute
         */
        public void xsetDealingNumber(org.apache.xmlbeans.XmlString dealingNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEALINGNUMBER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEALINGNUMBER$2);
                }
                target.set(dealingNumber);
            }
        }
        
        /**
         * Unsets the "dealingNumber" attribute
         */
        public void unsetDealingNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEALINGNUMBER$2);
            }
        }
        
        /**
         * Gets the "amendmentDate" attribute
         */
        public java.util.Calendar getAmendmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMENDMENTDATE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "amendmentDate" attribute
         */
        public org.apache.xmlbeans.XmlDate xgetAmendmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(AMENDMENTDATE$4);
                return target;
            }
        }
        
        /**
         * True if has "amendmentDate" attribute
         */
        public boolean isSetAmendmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AMENDMENTDATE$4) != null;
            }
        }
        
        /**
         * Sets the "amendmentDate" attribute
         */
        public void setAmendmentDate(java.util.Calendar amendmentDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMENDMENTDATE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AMENDMENTDATE$4);
                }
                target.setCalendarValue(amendmentDate);
            }
        }
        
        /**
         * Sets (as xml) the "amendmentDate" attribute
         */
        public void xsetAmendmentDate(org.apache.xmlbeans.XmlDate amendmentDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(AMENDMENTDATE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(AMENDMENTDATE$4);
                }
                target.set(amendmentDate);
            }
        }
        
        /**
         * Unsets the "amendmentDate" attribute
         */
        public void unsetAmendmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AMENDMENTDATE$4);
            }
        }
        
        /**
         * Gets the "comments" attribute
         */
        public java.lang.String getComments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMENTS$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "comments" attribute
         */
        public org.apache.xmlbeans.XmlString xgetComments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COMMENTS$6);
                return target;
            }
        }
        
        /**
         * True if has "comments" attribute
         */
        public boolean isSetComments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COMMENTS$6) != null;
            }
        }
        
        /**
         * Sets the "comments" attribute
         */
        public void setComments(java.lang.String comments)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMENTS$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMMENTS$6);
                }
                target.setStringValue(comments);
            }
        }
        
        /**
         * Sets (as xml) the "comments" attribute
         */
        public void xsetComments(org.apache.xmlbeans.XmlString comments)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COMMENTS$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COMMENTS$6);
                }
                target.set(comments);
            }
        }
        
        /**
         * Unsets the "comments" attribute
         */
        public void unsetComments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COMMENTS$6);
            }
        }
    }
}
