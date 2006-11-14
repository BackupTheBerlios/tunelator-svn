/*
 * An XML document type.
 * Localname: FieldNote
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.FieldNoteDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one FieldNote(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class FieldNoteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.FieldNoteDocument
{
    
    public FieldNoteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELDNOTE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FieldNote");
    
    
    /**
     * Gets the "FieldNote" element
     */
    public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote getFieldNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.FieldNoteDocument.FieldNote target = null;
            target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().find_element_user(FIELDNOTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FieldNote" element
     */
    public void setFieldNote(org.landxml.schema.landXML11.FieldNoteDocument.FieldNote fieldNote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.FieldNoteDocument.FieldNote target = null;
            target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().find_element_user(FIELDNOTE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().add_element_user(FIELDNOTE$0);
            }
            target.set(fieldNote);
        }
    }
    
    /**
     * Appends and returns a new empty "FieldNote" element
     */
    public org.landxml.schema.landXML11.FieldNoteDocument.FieldNote addNewFieldNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.FieldNoteDocument.FieldNote target = null;
            target = (org.landxml.schema.landXML11.FieldNoteDocument.FieldNote)get_store().add_element_user(FIELDNOTE$0);
            return target;
        }
    }
    /**
     * An XML FieldNote(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class FieldNoteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.FieldNoteDocument.FieldNote
    {
        
        public FieldNoteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
