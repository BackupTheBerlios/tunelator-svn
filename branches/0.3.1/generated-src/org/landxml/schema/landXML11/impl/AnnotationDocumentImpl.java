/*
 * An XML document type.
 * Localname: Annotation
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.AnnotationDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Annotation(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class AnnotationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.AnnotationDocument
{
    
    public AnnotationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTATION$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Annotation");
    
    
    /**
     * Gets the "Annotation" element
     */
    public org.landxml.schema.landXML11.AnnotationDocument.Annotation getAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AnnotationDocument.Annotation target = null;
            target = (org.landxml.schema.landXML11.AnnotationDocument.Annotation)get_store().find_element_user(ANNOTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Annotation" element
     */
    public void setAnnotation(org.landxml.schema.landXML11.AnnotationDocument.Annotation annotation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AnnotationDocument.Annotation target = null;
            target = (org.landxml.schema.landXML11.AnnotationDocument.Annotation)get_store().find_element_user(ANNOTATION$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.AnnotationDocument.Annotation)get_store().add_element_user(ANNOTATION$0);
            }
            target.set(annotation);
        }
    }
    
    /**
     * Appends and returns a new empty "Annotation" element
     */
    public org.landxml.schema.landXML11.AnnotationDocument.Annotation addNewAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.AnnotationDocument.Annotation target = null;
            target = (org.landxml.schema.landXML11.AnnotationDocument.Annotation)get_store().add_element_user(ANNOTATION$0);
            return target;
        }
    }
    /**
     * An XML Annotation(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class AnnotationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.AnnotationDocument.Annotation
    {
        
        public AnnotationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESC$4 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName PCLREF$6 = 
            new javax.xml.namespace.QName("", "pclRef");
        
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.landxml.schema.landXML11.AnnotationType xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AnnotationType target = null;
                target = (org.landxml.schema.landXML11.AnnotationType)get_store().find_attribute_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.landxml.schema.landXML11.AnnotationType type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AnnotationType target = null;
                target = (org.landxml.schema.landXML11.AnnotationType)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.AnnotationType)get_store().add_attribute_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                return target;
            }
        }
        
        /**
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$2) != null;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$2);
            }
        }
        
        /**
         * Gets the "desc" attribute
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "desc" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$4);
                return target;
            }
        }
        
        /**
         * True if has "desc" attribute
         */
        public boolean isSetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DESC$4) != null;
            }
        }
        
        /**
         * Sets the "desc" attribute
         */
        public void setDesc(java.lang.String desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$4);
                }
                target.setStringValue(desc);
            }
        }
        
        /**
         * Sets (as xml) the "desc" attribute
         */
        public void xsetDesc(org.apache.xmlbeans.XmlString desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$4);
                }
                target.set(desc);
            }
        }
        
        /**
         * Unsets the "desc" attribute
         */
        public void unsetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DESC$4);
            }
        }
        
        /**
         * Gets the "pclRef" attribute
         */
        public java.util.List getPclRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PCLREF$6);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "pclRef" attribute
         */
        public org.landxml.schema.landXML11.ParcelNameRefs xgetPclRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParcelNameRefs target = null;
                target = (org.landxml.schema.landXML11.ParcelNameRefs)get_store().find_attribute_user(PCLREF$6);
                return target;
            }
        }
        
        /**
         * True if has "pclRef" attribute
         */
        public boolean isSetPclRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PCLREF$6) != null;
            }
        }
        
        /**
         * Sets the "pclRef" attribute
         */
        public void setPclRef(java.util.List pclRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PCLREF$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PCLREF$6);
                }
                target.setListValue(pclRef);
            }
        }
        
        /**
         * Sets (as xml) the "pclRef" attribute
         */
        public void xsetPclRef(org.landxml.schema.landXML11.ParcelNameRefs pclRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParcelNameRefs target = null;
                target = (org.landxml.schema.landXML11.ParcelNameRefs)get_store().find_attribute_user(PCLREF$6);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ParcelNameRefs)get_store().add_attribute_user(PCLREF$6);
                }
                target.set(pclRef);
            }
        }
        
        /**
         * Unsets the "pclRef" attribute
         */
        public void unsetPclRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PCLREF$6);
            }
        }
    }
}
