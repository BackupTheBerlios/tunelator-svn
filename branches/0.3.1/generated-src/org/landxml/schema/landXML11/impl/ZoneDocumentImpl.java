/*
 * An XML document type.
 * Localname: Zone
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ZoneDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Zone(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ZoneDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ZoneDocument
{
    
    public ZoneDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ZONE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Zone");
    
    
    /**
     * Gets the "Zone" element
     */
    public org.landxml.schema.landXML11.ZoneDocument.Zone getZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ZoneDocument.Zone target = null;
            target = (org.landxml.schema.landXML11.ZoneDocument.Zone)get_store().find_element_user(ZONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Zone" element
     */
    public void setZone(org.landxml.schema.landXML11.ZoneDocument.Zone zone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ZoneDocument.Zone target = null;
            target = (org.landxml.schema.landXML11.ZoneDocument.Zone)get_store().find_element_user(ZONE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ZoneDocument.Zone)get_store().add_element_user(ZONE$0);
            }
            target.set(zone);
        }
    }
    
    /**
     * Appends and returns a new empty "Zone" element
     */
    public org.landxml.schema.landXML11.ZoneDocument.Zone addNewZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ZoneDocument.Zone target = null;
            target = (org.landxml.schema.landXML11.ZoneDocument.Zone)get_store().add_element_user(ZONE$0);
            return target;
        }
    }
    /**
     * An XML Zone(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class ZoneImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ZoneDocument.Zone
    {
        
        public ZoneImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ZONEWIDTH$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ZoneWidth");
        private static final javax.xml.namespace.QName ZONESLOPE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ZoneSlope");
        private static final javax.xml.namespace.QName ZONECUTFILL$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ZoneCutFill");
        private static final javax.xml.namespace.QName ZONEMATERIAL$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ZoneMaterial");
        private static final javax.xml.namespace.QName ZONECROSSSECTSTRUCTURE$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ZoneCrossSectStructure");
        private static final javax.xml.namespace.QName FEATURE$10 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName DESC$12 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName NAME$14 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName STATE$16 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName PRIORITY$18 = 
            new javax.xml.namespace.QName("", "priority");
        private static final javax.xml.namespace.QName CATEGORY$20 = 
            new javax.xml.namespace.QName("", "category");
        private static final javax.xml.namespace.QName STASTART$22 = 
            new javax.xml.namespace.QName("", "staStart");
        private static final javax.xml.namespace.QName STAEND$24 = 
            new javax.xml.namespace.QName("", "staEnd");
        private static final javax.xml.namespace.QName STARTWIDTH$26 = 
            new javax.xml.namespace.QName("", "startWidth");
        private static final javax.xml.namespace.QName STARTVERTVALUE$28 = 
            new javax.xml.namespace.QName("", "startVertValue");
        private static final javax.xml.namespace.QName STARTVERTTYPE$30 = 
            new javax.xml.namespace.QName("", "startVertType");
        private static final javax.xml.namespace.QName ENDWIDTH$32 = 
            new javax.xml.namespace.QName("", "endWidth");
        private static final javax.xml.namespace.QName ENDVERTVALUE$34 = 
            new javax.xml.namespace.QName("", "endVertValue");
        private static final javax.xml.namespace.QName ENDVERTTYPE$36 = 
            new javax.xml.namespace.QName("", "endVertType");
        
        
        /**
         * Gets a List of "ZoneWidth" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth> getZoneWidthList()
        {
            final class ZoneWidthList extends java.util.AbstractList<org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth>
            {
                public org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth get(int i)
                    { return ZoneImpl.this.getZoneWidthArray(i); }
                
                public org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth set(int i, org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth o)
                {
                    org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth old = ZoneImpl.this.getZoneWidthArray(i);
                    ZoneImpl.this.setZoneWidthArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth o)
                    { ZoneImpl.this.insertNewZoneWidth(i).set(o); }
                
                public org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth remove(int i)
                {
                    org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth old = ZoneImpl.this.getZoneWidthArray(i);
                    ZoneImpl.this.removeZoneWidth(i);
                    return old;
                }
                
                public int size()
                    { return ZoneImpl.this.sizeOfZoneWidthArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ZoneWidthList();
            }
        }
        
        /**
         * Gets array of all "ZoneWidth" elements
         */
        public org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth[] getZoneWidthArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ZONEWIDTH$0, targetList);
                org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth[] result = new org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ZoneWidth" element
         */
        public org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth getZoneWidthArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth target = null;
                target = (org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth)get_store().find_element_user(ZONEWIDTH$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ZoneWidth" element
         */
        public int sizeOfZoneWidthArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ZONEWIDTH$0);
            }
        }
        
        /**
         * Sets array of all "ZoneWidth" element
         */
        public void setZoneWidthArray(org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth[] zoneWidthArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(zoneWidthArray, ZONEWIDTH$0);
            }
        }
        
        /**
         * Sets ith "ZoneWidth" element
         */
        public void setZoneWidthArray(int i, org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth zoneWidth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth target = null;
                target = (org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth)get_store().find_element_user(ZONEWIDTH$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(zoneWidth);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ZoneWidth" element
         */
        public org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth insertNewZoneWidth(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth target = null;
                target = (org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth)get_store().insert_element_user(ZONEWIDTH$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ZoneWidth" element
         */
        public org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth addNewZoneWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth target = null;
                target = (org.landxml.schema.landXML11.ZoneWidthDocument.ZoneWidth)get_store().add_element_user(ZONEWIDTH$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ZoneWidth" element
         */
        public void removeZoneWidth(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ZONEWIDTH$0, i);
            }
        }
        
        /**
         * Gets a List of "ZoneSlope" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope> getZoneSlopeList()
        {
            final class ZoneSlopeList extends java.util.AbstractList<org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope>
            {
                public org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope get(int i)
                    { return ZoneImpl.this.getZoneSlopeArray(i); }
                
                public org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope set(int i, org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope o)
                {
                    org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope old = ZoneImpl.this.getZoneSlopeArray(i);
                    ZoneImpl.this.setZoneSlopeArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope o)
                    { ZoneImpl.this.insertNewZoneSlope(i).set(o); }
                
                public org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope remove(int i)
                {
                    org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope old = ZoneImpl.this.getZoneSlopeArray(i);
                    ZoneImpl.this.removeZoneSlope(i);
                    return old;
                }
                
                public int size()
                    { return ZoneImpl.this.sizeOfZoneSlopeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ZoneSlopeList();
            }
        }
        
        /**
         * Gets array of all "ZoneSlope" elements
         */
        public org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope[] getZoneSlopeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ZONESLOPE$2, targetList);
                org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope[] result = new org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ZoneSlope" element
         */
        public org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope getZoneSlopeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope target = null;
                target = (org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope)get_store().find_element_user(ZONESLOPE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ZoneSlope" element
         */
        public int sizeOfZoneSlopeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ZONESLOPE$2);
            }
        }
        
        /**
         * Sets array of all "ZoneSlope" element
         */
        public void setZoneSlopeArray(org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope[] zoneSlopeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(zoneSlopeArray, ZONESLOPE$2);
            }
        }
        
        /**
         * Sets ith "ZoneSlope" element
         */
        public void setZoneSlopeArray(int i, org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope zoneSlope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope target = null;
                target = (org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope)get_store().find_element_user(ZONESLOPE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(zoneSlope);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ZoneSlope" element
         */
        public org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope insertNewZoneSlope(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope target = null;
                target = (org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope)get_store().insert_element_user(ZONESLOPE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ZoneSlope" element
         */
        public org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope addNewZoneSlope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope target = null;
                target = (org.landxml.schema.landXML11.ZoneSlopeDocument.ZoneSlope)get_store().add_element_user(ZONESLOPE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "ZoneSlope" element
         */
        public void removeZoneSlope(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ZONESLOPE$2, i);
            }
        }
        
        /**
         * Gets a List of "ZoneCutFill" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill> getZoneCutFillList()
        {
            final class ZoneCutFillList extends java.util.AbstractList<org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill>
            {
                public org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill get(int i)
                    { return ZoneImpl.this.getZoneCutFillArray(i); }
                
                public org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill set(int i, org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill o)
                {
                    org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill old = ZoneImpl.this.getZoneCutFillArray(i);
                    ZoneImpl.this.setZoneCutFillArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill o)
                    { ZoneImpl.this.insertNewZoneCutFill(i).set(o); }
                
                public org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill remove(int i)
                {
                    org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill old = ZoneImpl.this.getZoneCutFillArray(i);
                    ZoneImpl.this.removeZoneCutFill(i);
                    return old;
                }
                
                public int size()
                    { return ZoneImpl.this.sizeOfZoneCutFillArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ZoneCutFillList();
            }
        }
        
        /**
         * Gets array of all "ZoneCutFill" elements
         */
        public org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill[] getZoneCutFillArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ZONECUTFILL$4, targetList);
                org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill[] result = new org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ZoneCutFill" element
         */
        public org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill getZoneCutFillArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill target = null;
                target = (org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill)get_store().find_element_user(ZONECUTFILL$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ZoneCutFill" element
         */
        public int sizeOfZoneCutFillArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ZONECUTFILL$4);
            }
        }
        
        /**
         * Sets array of all "ZoneCutFill" element
         */
        public void setZoneCutFillArray(org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill[] zoneCutFillArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(zoneCutFillArray, ZONECUTFILL$4);
            }
        }
        
        /**
         * Sets ith "ZoneCutFill" element
         */
        public void setZoneCutFillArray(int i, org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill zoneCutFill)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill target = null;
                target = (org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill)get_store().find_element_user(ZONECUTFILL$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(zoneCutFill);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ZoneCutFill" element
         */
        public org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill insertNewZoneCutFill(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill target = null;
                target = (org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill)get_store().insert_element_user(ZONECUTFILL$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ZoneCutFill" element
         */
        public org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill addNewZoneCutFill()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill target = null;
                target = (org.landxml.schema.landXML11.ZoneCutFillDocument.ZoneCutFill)get_store().add_element_user(ZONECUTFILL$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "ZoneCutFill" element
         */
        public void removeZoneCutFill(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ZONECUTFILL$4, i);
            }
        }
        
        /**
         * Gets a List of "ZoneMaterial" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial> getZoneMaterialList()
        {
            final class ZoneMaterialList extends java.util.AbstractList<org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial>
            {
                public org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial get(int i)
                    { return ZoneImpl.this.getZoneMaterialArray(i); }
                
                public org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial set(int i, org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial o)
                {
                    org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial old = ZoneImpl.this.getZoneMaterialArray(i);
                    ZoneImpl.this.setZoneMaterialArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial o)
                    { ZoneImpl.this.insertNewZoneMaterial(i).set(o); }
                
                public org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial remove(int i)
                {
                    org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial old = ZoneImpl.this.getZoneMaterialArray(i);
                    ZoneImpl.this.removeZoneMaterial(i);
                    return old;
                }
                
                public int size()
                    { return ZoneImpl.this.sizeOfZoneMaterialArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ZoneMaterialList();
            }
        }
        
        /**
         * Gets array of all "ZoneMaterial" elements
         */
        public org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial[] getZoneMaterialArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ZONEMATERIAL$6, targetList);
                org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial[] result = new org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ZoneMaterial" element
         */
        public org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial getZoneMaterialArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial target = null;
                target = (org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial)get_store().find_element_user(ZONEMATERIAL$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ZoneMaterial" element
         */
        public int sizeOfZoneMaterialArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ZONEMATERIAL$6);
            }
        }
        
        /**
         * Sets array of all "ZoneMaterial" element
         */
        public void setZoneMaterialArray(org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial[] zoneMaterialArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(zoneMaterialArray, ZONEMATERIAL$6);
            }
        }
        
        /**
         * Sets ith "ZoneMaterial" element
         */
        public void setZoneMaterialArray(int i, org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial zoneMaterial)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial target = null;
                target = (org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial)get_store().find_element_user(ZONEMATERIAL$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(zoneMaterial);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ZoneMaterial" element
         */
        public org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial insertNewZoneMaterial(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial target = null;
                target = (org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial)get_store().insert_element_user(ZONEMATERIAL$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ZoneMaterial" element
         */
        public org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial addNewZoneMaterial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial target = null;
                target = (org.landxml.schema.landXML11.ZoneMaterialDocument.ZoneMaterial)get_store().add_element_user(ZONEMATERIAL$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "ZoneMaterial" element
         */
        public void removeZoneMaterial(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ZONEMATERIAL$6, i);
            }
        }
        
        /**
         * Gets a List of "ZoneCrossSectStructure" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure> getZoneCrossSectStructureList()
        {
            final class ZoneCrossSectStructureList extends java.util.AbstractList<org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure>
            {
                public org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure get(int i)
                    { return ZoneImpl.this.getZoneCrossSectStructureArray(i); }
                
                public org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure set(int i, org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure o)
                {
                    org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure old = ZoneImpl.this.getZoneCrossSectStructureArray(i);
                    ZoneImpl.this.setZoneCrossSectStructureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure o)
                    { ZoneImpl.this.insertNewZoneCrossSectStructure(i).set(o); }
                
                public org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure remove(int i)
                {
                    org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure old = ZoneImpl.this.getZoneCrossSectStructureArray(i);
                    ZoneImpl.this.removeZoneCrossSectStructure(i);
                    return old;
                }
                
                public int size()
                    { return ZoneImpl.this.sizeOfZoneCrossSectStructureArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ZoneCrossSectStructureList();
            }
        }
        
        /**
         * Gets array of all "ZoneCrossSectStructure" elements
         */
        public org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure[] getZoneCrossSectStructureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ZONECROSSSECTSTRUCTURE$8, targetList);
                org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure[] result = new org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ZoneCrossSectStructure" element
         */
        public org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure getZoneCrossSectStructureArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure target = null;
                target = (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure)get_store().find_element_user(ZONECROSSSECTSTRUCTURE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ZoneCrossSectStructure" element
         */
        public int sizeOfZoneCrossSectStructureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ZONECROSSSECTSTRUCTURE$8);
            }
        }
        
        /**
         * Sets array of all "ZoneCrossSectStructure" element
         */
        public void setZoneCrossSectStructureArray(org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure[] zoneCrossSectStructureArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(zoneCrossSectStructureArray, ZONECROSSSECTSTRUCTURE$8);
            }
        }
        
        /**
         * Sets ith "ZoneCrossSectStructure" element
         */
        public void setZoneCrossSectStructureArray(int i, org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure zoneCrossSectStructure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure target = null;
                target = (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure)get_store().find_element_user(ZONECROSSSECTSTRUCTURE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(zoneCrossSectStructure);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ZoneCrossSectStructure" element
         */
        public org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure insertNewZoneCrossSectStructure(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure target = null;
                target = (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure)get_store().insert_element_user(ZONECROSSSECTSTRUCTURE$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ZoneCrossSectStructure" element
         */
        public org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure addNewZoneCrossSectStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure target = null;
                target = (org.landxml.schema.landXML11.ZoneCrossSectStructureDocument.ZoneCrossSectStructure)get_store().add_element_user(ZONECROSSSECTSTRUCTURE$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "ZoneCrossSectStructure" element
         */
        public void removeZoneCrossSectStructure(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ZONECROSSSECTSTRUCTURE$8, i);
            }
        }
        
        /**
         * Gets a List of "Feature" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDocument.Feature> getFeatureList()
        {
            final class FeatureList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDocument.Feature>
            {
                public org.landxml.schema.landXML11.FeatureDocument.Feature get(int i)
                    { return ZoneImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ZoneImpl.this.getFeatureArray(i);
                    ZoneImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { ZoneImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ZoneImpl.this.getFeatureArray(i);
                    ZoneImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return ZoneImpl.this.sizeOfFeatureArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FeatureList();
            }
        }
        
        /**
         * Gets array of all "Feature" elements
         */
        public org.landxml.schema.landXML11.FeatureDocument.Feature[] getFeatureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FEATURE$10, targetList);
                org.landxml.schema.landXML11.FeatureDocument.Feature[] result = new org.landxml.schema.landXML11.FeatureDocument.Feature[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Feature" element
         */
        public org.landxml.schema.landXML11.FeatureDocument.Feature getFeatureArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FeatureDocument.Feature target = null;
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Feature" element
         */
        public int sizeOfFeatureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FEATURE$10);
            }
        }
        
        /**
         * Sets array of all "Feature" element
         */
        public void setFeatureArray(org.landxml.schema.landXML11.FeatureDocument.Feature[] featureArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(featureArray, FEATURE$10);
            }
        }
        
        /**
         * Sets ith "Feature" element
         */
        public void setFeatureArray(int i, org.landxml.schema.landXML11.FeatureDocument.Feature feature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FeatureDocument.Feature target = null;
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(feature);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Feature" element
         */
        public org.landxml.schema.landXML11.FeatureDocument.Feature insertNewFeature(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FeatureDocument.Feature target = null;
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Feature" element
         */
        public org.landxml.schema.landXML11.FeatureDocument.Feature addNewFeature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FeatureDocument.Feature target = null;
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "Feature" element
         */
        public void removeFeature(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FEATURE$10, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$12);
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
                return get_store().find_attribute_user(DESC$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$12);
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
                get_store().remove_attribute(DESC$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$14);
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
                return get_store().find_attribute_user(NAME$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$14);
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
                get_store().remove_attribute(NAME$14);
            }
        }
        
        /**
         * Gets the "state" attribute
         */
        public org.landxml.schema.landXML11.StateType.Enum getState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$16);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.StateType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "state" attribute
         */
        public org.landxml.schema.landXML11.StateType xgetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StateType target = null;
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$16);
                return target;
            }
        }
        
        /**
         * True if has "state" attribute
         */
        public boolean isSetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STATE$16) != null;
            }
        }
        
        /**
         * Sets the "state" attribute
         */
        public void setState(org.landxml.schema.landXML11.StateType.Enum state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$16);
                }
                target.setEnumValue(state);
            }
        }
        
        /**
         * Sets (as xml) the "state" attribute
         */
        public void xsetState(org.landxml.schema.landXML11.StateType state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StateType target = null;
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$16);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$16);
                }
                target.set(state);
            }
        }
        
        /**
         * Unsets the "state" attribute
         */
        public void unsetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STATE$16);
            }
        }
        
        /**
         * Gets the "priority" attribute
         */
        public int getPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$18);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "priority" attribute
         */
        public org.apache.xmlbeans.XmlInt xgetPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PRIORITY$18);
                return target;
            }
        }
        
        /**
         * Sets the "priority" attribute
         */
        public void setPriority(int priority)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRIORITY$18);
                }
                target.setIntValue(priority);
            }
        }
        
        /**
         * Sets (as xml) the "priority" attribute
         */
        public void xsetPriority(org.apache.xmlbeans.XmlInt priority)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PRIORITY$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PRIORITY$18);
                }
                target.set(priority);
            }
        }
        
        /**
         * Gets the "category" attribute
         */
        public org.landxml.schema.landXML11.ZoneCategoryType.Enum getCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORY$20);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ZoneCategoryType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "category" attribute
         */
        public org.landxml.schema.landXML11.ZoneCategoryType xgetCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneCategoryType target = null;
                target = (org.landxml.schema.landXML11.ZoneCategoryType)get_store().find_attribute_user(CATEGORY$20);
                return target;
            }
        }
        
        /**
         * Sets the "category" attribute
         */
        public void setCategory(org.landxml.schema.landXML11.ZoneCategoryType.Enum category)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORY$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATEGORY$20);
                }
                target.setEnumValue(category);
            }
        }
        
        /**
         * Sets (as xml) the "category" attribute
         */
        public void xsetCategory(org.landxml.schema.landXML11.ZoneCategoryType category)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneCategoryType target = null;
                target = (org.landxml.schema.landXML11.ZoneCategoryType)get_store().find_attribute_user(CATEGORY$20);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ZoneCategoryType)get_store().add_attribute_user(CATEGORY$20);
                }
                target.set(category);
            }
        }
        
        /**
         * Gets the "staStart" attribute
         */
        public double getStaStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STASTART$22);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "staStart" attribute
         */
        public org.landxml.schema.landXML11.Station xgetStaStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(STASTART$22);
                return target;
            }
        }
        
        /**
         * Sets the "staStart" attribute
         */
        public void setStaStart(double staStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STASTART$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STASTART$22);
                }
                target.setDoubleValue(staStart);
            }
        }
        
        /**
         * Sets (as xml) the "staStart" attribute
         */
        public void xsetStaStart(org.landxml.schema.landXML11.Station staStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(STASTART$22);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(STASTART$22);
                }
                target.set(staStart);
            }
        }
        
        /**
         * Gets the "staEnd" attribute
         */
        public double getStaEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STAEND$24);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "staEnd" attribute
         */
        public org.landxml.schema.landXML11.Station xgetStaEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(STAEND$24);
                return target;
            }
        }
        
        /**
         * True if has "staEnd" attribute
         */
        public boolean isSetStaEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STAEND$24) != null;
            }
        }
        
        /**
         * Sets the "staEnd" attribute
         */
        public void setStaEnd(double staEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STAEND$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STAEND$24);
                }
                target.setDoubleValue(staEnd);
            }
        }
        
        /**
         * Sets (as xml) the "staEnd" attribute
         */
        public void xsetStaEnd(org.landxml.schema.landXML11.Station staEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Station target = null;
                target = (org.landxml.schema.landXML11.Station)get_store().find_attribute_user(STAEND$24);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Station)get_store().add_attribute_user(STAEND$24);
                }
                target.set(staEnd);
            }
        }
        
        /**
         * Unsets the "staEnd" attribute
         */
        public void unsetStaEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STAEND$24);
            }
        }
        
        /**
         * Gets the "startWidth" attribute
         */
        public double getStartWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTWIDTH$26);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "startWidth" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetStartWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STARTWIDTH$26);
                return target;
            }
        }
        
        /**
         * Sets the "startWidth" attribute
         */
        public void setStartWidth(double startWidth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTWIDTH$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTWIDTH$26);
                }
                target.setDoubleValue(startWidth);
            }
        }
        
        /**
         * Sets (as xml) the "startWidth" attribute
         */
        public void xsetStartWidth(org.apache.xmlbeans.XmlDouble startWidth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STARTWIDTH$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(STARTWIDTH$26);
                }
                target.set(startWidth);
            }
        }
        
        /**
         * Gets the "startVertValue" attribute
         */
        public double getStartVertValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTVERTVALUE$28);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "startVertValue" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetStartVertValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STARTVERTVALUE$28);
                return target;
            }
        }
        
        /**
         * Sets the "startVertValue" attribute
         */
        public void setStartVertValue(double startVertValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTVERTVALUE$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTVERTVALUE$28);
                }
                target.setDoubleValue(startVertValue);
            }
        }
        
        /**
         * Sets (as xml) the "startVertValue" attribute
         */
        public void xsetStartVertValue(org.apache.xmlbeans.XmlDouble startVertValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STARTVERTVALUE$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(STARTVERTVALUE$28);
                }
                target.set(startVertValue);
            }
        }
        
        /**
         * Gets the "startVertType" attribute
         */
        public org.landxml.schema.landXML11.ZoneVertType.Enum getStartVertType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTVERTTYPE$30);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ZoneVertType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "startVertType" attribute
         */
        public org.landxml.schema.landXML11.ZoneVertType xgetStartVertType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneVertType target = null;
                target = (org.landxml.schema.landXML11.ZoneVertType)get_store().find_attribute_user(STARTVERTTYPE$30);
                return target;
            }
        }
        
        /**
         * Sets the "startVertType" attribute
         */
        public void setStartVertType(org.landxml.schema.landXML11.ZoneVertType.Enum startVertType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTVERTTYPE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTVERTTYPE$30);
                }
                target.setEnumValue(startVertType);
            }
        }
        
        /**
         * Sets (as xml) the "startVertType" attribute
         */
        public void xsetStartVertType(org.landxml.schema.landXML11.ZoneVertType startVertType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneVertType target = null;
                target = (org.landxml.schema.landXML11.ZoneVertType)get_store().find_attribute_user(STARTVERTTYPE$30);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ZoneVertType)get_store().add_attribute_user(STARTVERTTYPE$30);
                }
                target.set(startVertType);
            }
        }
        
        /**
         * Gets the "endWidth" attribute
         */
        public double getEndWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDWIDTH$32);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "endWidth" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetEndWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ENDWIDTH$32);
                return target;
            }
        }
        
        /**
         * True if has "endWidth" attribute
         */
        public boolean isSetEndWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENDWIDTH$32) != null;
            }
        }
        
        /**
         * Sets the "endWidth" attribute
         */
        public void setEndWidth(double endWidth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDWIDTH$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDWIDTH$32);
                }
                target.setDoubleValue(endWidth);
            }
        }
        
        /**
         * Sets (as xml) the "endWidth" attribute
         */
        public void xsetEndWidth(org.apache.xmlbeans.XmlDouble endWidth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ENDWIDTH$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ENDWIDTH$32);
                }
                target.set(endWidth);
            }
        }
        
        /**
         * Unsets the "endWidth" attribute
         */
        public void unsetEndWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENDWIDTH$32);
            }
        }
        
        /**
         * Gets the "endVertValue" attribute
         */
        public double getEndVertValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDVERTVALUE$34);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "endVertValue" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetEndVertValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ENDVERTVALUE$34);
                return target;
            }
        }
        
        /**
         * True if has "endVertValue" attribute
         */
        public boolean isSetEndVertValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENDVERTVALUE$34) != null;
            }
        }
        
        /**
         * Sets the "endVertValue" attribute
         */
        public void setEndVertValue(double endVertValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDVERTVALUE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDVERTVALUE$34);
                }
                target.setDoubleValue(endVertValue);
            }
        }
        
        /**
         * Sets (as xml) the "endVertValue" attribute
         */
        public void xsetEndVertValue(org.apache.xmlbeans.XmlDouble endVertValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ENDVERTVALUE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ENDVERTVALUE$34);
                }
                target.set(endVertValue);
            }
        }
        
        /**
         * Unsets the "endVertValue" attribute
         */
        public void unsetEndVertValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENDVERTVALUE$34);
            }
        }
        
        /**
         * Gets the "endVertType" attribute
         */
        public org.landxml.schema.landXML11.ZoneVertType.Enum getEndVertType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDVERTTYPE$36);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ZoneVertType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "endVertType" attribute
         */
        public org.landxml.schema.landXML11.ZoneVertType xgetEndVertType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneVertType target = null;
                target = (org.landxml.schema.landXML11.ZoneVertType)get_store().find_attribute_user(ENDVERTTYPE$36);
                return target;
            }
        }
        
        /**
         * True if has "endVertType" attribute
         */
        public boolean isSetEndVertType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENDVERTTYPE$36) != null;
            }
        }
        
        /**
         * Sets the "endVertType" attribute
         */
        public void setEndVertType(org.landxml.schema.landXML11.ZoneVertType.Enum endVertType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDVERTTYPE$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDVERTTYPE$36);
                }
                target.setEnumValue(endVertType);
            }
        }
        
        /**
         * Sets (as xml) the "endVertType" attribute
         */
        public void xsetEndVertType(org.landxml.schema.landXML11.ZoneVertType endVertType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneVertType target = null;
                target = (org.landxml.schema.landXML11.ZoneVertType)get_store().find_attribute_user(ENDVERTTYPE$36);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ZoneVertType)get_store().add_attribute_user(ENDVERTTYPE$36);
                }
                target.set(endVertType);
            }
        }
        
        /**
         * Unsets the "endVertType" attribute
         */
        public void unsetEndVertType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENDVERTTYPE$36);
            }
        }
    }
}
