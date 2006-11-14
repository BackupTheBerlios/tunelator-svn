/*
 * An XML document type.
 * Localname: GradeSurface
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.GradeSurfaceDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one GradeSurface(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class GradeSurfaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.GradeSurfaceDocument
{
    
    public GradeSurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRADESURFACE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "GradeSurface");
    
    
    /**
     * Gets the "GradeSurface" element
     */
    public org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface getGradeSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface target = null;
            target = (org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface)get_store().find_element_user(GRADESURFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GradeSurface" element
     */
    public void setGradeSurface(org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface gradeSurface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface target = null;
            target = (org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface)get_store().find_element_user(GRADESURFACE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface)get_store().add_element_user(GRADESURFACE$0);
            }
            target.set(gradeSurface);
        }
    }
    
    /**
     * Appends and returns a new empty "GradeSurface" element
     */
    public org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface addNewGradeSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface target = null;
            target = (org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface)get_store().add_element_user(GRADESURFACE$0);
            return target;
        }
    }
    /**
     * An XML GradeSurface(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class GradeSurfaceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.GradeSurfaceDocument.GradeSurface
    {
        
        public GradeSurfaceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName START$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Start");
        private static final javax.xml.namespace.QName ZONES$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Zones");
        private static final javax.xml.namespace.QName FEATURE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName ALIGNMENTREF$6 = 
            new javax.xml.namespace.QName("", "alignmentRef");
        private static final javax.xml.namespace.QName STATIONALIGNMENTREF$8 = 
            new javax.xml.namespace.QName("", "stationAlignmentRef");
        private static final javax.xml.namespace.QName SURFACETYPE$10 = 
            new javax.xml.namespace.QName("", "surfaceType");
        private static final javax.xml.namespace.QName SURFACEREF$12 = 
            new javax.xml.namespace.QName("", "surfaceRef");
        private static final javax.xml.namespace.QName SURFACEREFS$14 = 
            new javax.xml.namespace.QName("", "surfaceRefs");
        private static final javax.xml.namespace.QName CGPOINTREFS$16 = 
            new javax.xml.namespace.QName("", "cgPointRefs");
        private static final javax.xml.namespace.QName NAME$18 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESC$20 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName STATE$22 = 
            new javax.xml.namespace.QName("", "state");
        
        
        /**
         * Gets a List of "Start" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PointType> getStartList()
        {
            final class StartList extends java.util.AbstractList<org.landxml.schema.landXML11.PointType>
            {
                public org.landxml.schema.landXML11.PointType get(int i)
                    { return GradeSurfaceImpl.this.getStartArray(i); }
                
                public org.landxml.schema.landXML11.PointType set(int i, org.landxml.schema.landXML11.PointType o)
                {
                    org.landxml.schema.landXML11.PointType old = GradeSurfaceImpl.this.getStartArray(i);
                    GradeSurfaceImpl.this.setStartArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PointType o)
                    { GradeSurfaceImpl.this.insertNewStart(i).set(o); }
                
                public org.landxml.schema.landXML11.PointType remove(int i)
                {
                    org.landxml.schema.landXML11.PointType old = GradeSurfaceImpl.this.getStartArray(i);
                    GradeSurfaceImpl.this.removeStart(i);
                    return old;
                }
                
                public int size()
                    { return GradeSurfaceImpl.this.sizeOfStartArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new StartList();
            }
        }
        
        /**
         * Gets array of all "Start" elements
         */
        public org.landxml.schema.landXML11.PointType[] getStartArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(START$0, targetList);
                org.landxml.schema.landXML11.PointType[] result = new org.landxml.schema.landXML11.PointType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Start" element
         */
        public org.landxml.schema.landXML11.PointType getStartArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(START$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Start" element
         */
        public int sizeOfStartArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(START$0);
            }
        }
        
        /**
         * Sets array of all "Start" element
         */
        public void setStartArray(org.landxml.schema.landXML11.PointType[] startArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(startArray, START$0);
            }
        }
        
        /**
         * Sets ith "Start" element
         */
        public void setStartArray(int i, org.landxml.schema.landXML11.PointType start)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(START$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(start);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Start" element
         */
        public org.landxml.schema.landXML11.PointType insertNewStart(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().insert_element_user(START$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Start" element
         */
        public org.landxml.schema.landXML11.PointType addNewStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(START$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Start" element
         */
        public void removeStart(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(START$0, i);
            }
        }
        
        /**
         * Gets a List of "Zones" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ZonesDocument.Zones> getZonesList()
        {
            final class ZonesList extends java.util.AbstractList<org.landxml.schema.landXML11.ZonesDocument.Zones>
            {
                public org.landxml.schema.landXML11.ZonesDocument.Zones get(int i)
                    { return GradeSurfaceImpl.this.getZonesArray(i); }
                
                public org.landxml.schema.landXML11.ZonesDocument.Zones set(int i, org.landxml.schema.landXML11.ZonesDocument.Zones o)
                {
                    org.landxml.schema.landXML11.ZonesDocument.Zones old = GradeSurfaceImpl.this.getZonesArray(i);
                    GradeSurfaceImpl.this.setZonesArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ZonesDocument.Zones o)
                    { GradeSurfaceImpl.this.insertNewZones(i).set(o); }
                
                public org.landxml.schema.landXML11.ZonesDocument.Zones remove(int i)
                {
                    org.landxml.schema.landXML11.ZonesDocument.Zones old = GradeSurfaceImpl.this.getZonesArray(i);
                    GradeSurfaceImpl.this.removeZones(i);
                    return old;
                }
                
                public int size()
                    { return GradeSurfaceImpl.this.sizeOfZonesArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ZonesList();
            }
        }
        
        /**
         * Gets array of all "Zones" elements
         */
        public org.landxml.schema.landXML11.ZonesDocument.Zones[] getZonesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ZONES$2, targetList);
                org.landxml.schema.landXML11.ZonesDocument.Zones[] result = new org.landxml.schema.landXML11.ZonesDocument.Zones[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Zones" element
         */
        public org.landxml.schema.landXML11.ZonesDocument.Zones getZonesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZonesDocument.Zones target = null;
                target = (org.landxml.schema.landXML11.ZonesDocument.Zones)get_store().find_element_user(ZONES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Zones" element
         */
        public int sizeOfZonesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ZONES$2);
            }
        }
        
        /**
         * Sets array of all "Zones" element
         */
        public void setZonesArray(org.landxml.schema.landXML11.ZonesDocument.Zones[] zonesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(zonesArray, ZONES$2);
            }
        }
        
        /**
         * Sets ith "Zones" element
         */
        public void setZonesArray(int i, org.landxml.schema.landXML11.ZonesDocument.Zones zones)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZonesDocument.Zones target = null;
                target = (org.landxml.schema.landXML11.ZonesDocument.Zones)get_store().find_element_user(ZONES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(zones);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Zones" element
         */
        public org.landxml.schema.landXML11.ZonesDocument.Zones insertNewZones(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZonesDocument.Zones target = null;
                target = (org.landxml.schema.landXML11.ZonesDocument.Zones)get_store().insert_element_user(ZONES$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Zones" element
         */
        public org.landxml.schema.landXML11.ZonesDocument.Zones addNewZones()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZonesDocument.Zones target = null;
                target = (org.landxml.schema.landXML11.ZonesDocument.Zones)get_store().add_element_user(ZONES$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Zones" element
         */
        public void removeZones(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ZONES$2, i);
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
                    { return GradeSurfaceImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = GradeSurfaceImpl.this.getFeatureArray(i);
                    GradeSurfaceImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { GradeSurfaceImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = GradeSurfaceImpl.this.getFeatureArray(i);
                    GradeSurfaceImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return GradeSurfaceImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$4, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$4, i);
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
                return get_store().count_elements(FEATURE$4);
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
                arraySetterHelper(featureArray, FEATURE$4);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$4, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$4, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$4);
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
                get_store().remove_element(FEATURE$4, i);
            }
        }
        
        /**
         * Gets the "alignmentRef" attribute
         */
        public java.lang.String getAlignmentRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNMENTREF$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "alignmentRef" attribute
         */
        public org.landxml.schema.landXML11.AlignmentNameRef xgetAlignmentRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignmentNameRef target = null;
                target = (org.landxml.schema.landXML11.AlignmentNameRef)get_store().find_attribute_user(ALIGNMENTREF$6);
                return target;
            }
        }
        
        /**
         * Sets the "alignmentRef" attribute
         */
        public void setAlignmentRef(java.lang.String alignmentRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNMENTREF$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALIGNMENTREF$6);
                }
                target.setStringValue(alignmentRef);
            }
        }
        
        /**
         * Sets (as xml) the "alignmentRef" attribute
         */
        public void xsetAlignmentRef(org.landxml.schema.landXML11.AlignmentNameRef alignmentRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignmentNameRef target = null;
                target = (org.landxml.schema.landXML11.AlignmentNameRef)get_store().find_attribute_user(ALIGNMENTREF$6);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.AlignmentNameRef)get_store().add_attribute_user(ALIGNMENTREF$6);
                }
                target.set(alignmentRef);
            }
        }
        
        /**
         * Gets the "stationAlignmentRef" attribute
         */
        public java.lang.String getStationAlignmentRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATIONALIGNMENTREF$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "stationAlignmentRef" attribute
         */
        public org.landxml.schema.landXML11.AlignmentNameRef xgetStationAlignmentRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignmentNameRef target = null;
                target = (org.landxml.schema.landXML11.AlignmentNameRef)get_store().find_attribute_user(STATIONALIGNMENTREF$8);
                return target;
            }
        }
        
        /**
         * True if has "stationAlignmentRef" attribute
         */
        public boolean isSetStationAlignmentRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STATIONALIGNMENTREF$8) != null;
            }
        }
        
        /**
         * Sets the "stationAlignmentRef" attribute
         */
        public void setStationAlignmentRef(java.lang.String stationAlignmentRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATIONALIGNMENTREF$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATIONALIGNMENTREF$8);
                }
                target.setStringValue(stationAlignmentRef);
            }
        }
        
        /**
         * Sets (as xml) the "stationAlignmentRef" attribute
         */
        public void xsetStationAlignmentRef(org.landxml.schema.landXML11.AlignmentNameRef stationAlignmentRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignmentNameRef target = null;
                target = (org.landxml.schema.landXML11.AlignmentNameRef)get_store().find_attribute_user(STATIONALIGNMENTREF$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.AlignmentNameRef)get_store().add_attribute_user(STATIONALIGNMENTREF$8);
                }
                target.set(stationAlignmentRef);
            }
        }
        
        /**
         * Unsets the "stationAlignmentRef" attribute
         */
        public void unsetStationAlignmentRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STATIONALIGNMENTREF$8);
            }
        }
        
        /**
         * Gets the "surfaceType" attribute
         */
        public org.landxml.schema.landXML11.ZoneSurfaceType.Enum getSurfaceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURFACETYPE$10);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ZoneSurfaceType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "surfaceType" attribute
         */
        public org.landxml.schema.landXML11.ZoneSurfaceType xgetSurfaceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneSurfaceType target = null;
                target = (org.landxml.schema.landXML11.ZoneSurfaceType)get_store().find_attribute_user(SURFACETYPE$10);
                return target;
            }
        }
        
        /**
         * Sets the "surfaceType" attribute
         */
        public void setSurfaceType(org.landxml.schema.landXML11.ZoneSurfaceType.Enum surfaceType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURFACETYPE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SURFACETYPE$10);
                }
                target.setEnumValue(surfaceType);
            }
        }
        
        /**
         * Sets (as xml) the "surfaceType" attribute
         */
        public void xsetSurfaceType(org.landxml.schema.landXML11.ZoneSurfaceType surfaceType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ZoneSurfaceType target = null;
                target = (org.landxml.schema.landXML11.ZoneSurfaceType)get_store().find_attribute_user(SURFACETYPE$10);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ZoneSurfaceType)get_store().add_attribute_user(SURFACETYPE$10);
                }
                target.set(surfaceType);
            }
        }
        
        /**
         * Gets the "surfaceRef" attribute
         */
        public java.lang.String getSurfaceRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURFACEREF$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "surfaceRef" attribute
         */
        public org.landxml.schema.landXML11.SurfaceNameRef xgetSurfaceRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfaceNameRef target = null;
                target = (org.landxml.schema.landXML11.SurfaceNameRef)get_store().find_attribute_user(SURFACEREF$12);
                return target;
            }
        }
        
        /**
         * True if has "surfaceRef" attribute
         */
        public boolean isSetSurfaceRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SURFACEREF$12) != null;
            }
        }
        
        /**
         * Sets the "surfaceRef" attribute
         */
        public void setSurfaceRef(java.lang.String surfaceRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURFACEREF$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SURFACEREF$12);
                }
                target.setStringValue(surfaceRef);
            }
        }
        
        /**
         * Sets (as xml) the "surfaceRef" attribute
         */
        public void xsetSurfaceRef(org.landxml.schema.landXML11.SurfaceNameRef surfaceRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfaceNameRef target = null;
                target = (org.landxml.schema.landXML11.SurfaceNameRef)get_store().find_attribute_user(SURFACEREF$12);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SurfaceNameRef)get_store().add_attribute_user(SURFACEREF$12);
                }
                target.set(surfaceRef);
            }
        }
        
        /**
         * Unsets the "surfaceRef" attribute
         */
        public void unsetSurfaceRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SURFACEREF$12);
            }
        }
        
        /**
         * Gets the "surfaceRefs" attribute
         */
        public java.util.List getSurfaceRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURFACEREFS$14);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "surfaceRefs" attribute
         */
        public org.landxml.schema.landXML11.SurfaceNameRefs xgetSurfaceRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfaceNameRefs target = null;
                target = (org.landxml.schema.landXML11.SurfaceNameRefs)get_store().find_attribute_user(SURFACEREFS$14);
                return target;
            }
        }
        
        /**
         * True if has "surfaceRefs" attribute
         */
        public boolean isSetSurfaceRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SURFACEREFS$14) != null;
            }
        }
        
        /**
         * Sets the "surfaceRefs" attribute
         */
        public void setSurfaceRefs(java.util.List surfaceRefs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURFACEREFS$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SURFACEREFS$14);
                }
                target.setListValue(surfaceRefs);
            }
        }
        
        /**
         * Sets (as xml) the "surfaceRefs" attribute
         */
        public void xsetSurfaceRefs(org.landxml.schema.landXML11.SurfaceNameRefs surfaceRefs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfaceNameRefs target = null;
                target = (org.landxml.schema.landXML11.SurfaceNameRefs)get_store().find_attribute_user(SURFACEREFS$14);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SurfaceNameRefs)get_store().add_attribute_user(SURFACEREFS$14);
                }
                target.set(surfaceRefs);
            }
        }
        
        /**
         * Unsets the "surfaceRefs" attribute
         */
        public void unsetSurfaceRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SURFACEREFS$14);
            }
        }
        
        /**
         * Gets the "cgPointRefs" attribute
         */
        public java.util.List getCgPointRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CGPOINTREFS$16);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "cgPointRefs" attribute
         */
        public org.landxml.schema.landXML11.PointNameRefs xgetCgPointRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointNameRefs target = null;
                target = (org.landxml.schema.landXML11.PointNameRefs)get_store().find_attribute_user(CGPOINTREFS$16);
                return target;
            }
        }
        
        /**
         * True if has "cgPointRefs" attribute
         */
        public boolean isSetCgPointRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CGPOINTREFS$16) != null;
            }
        }
        
        /**
         * Sets the "cgPointRefs" attribute
         */
        public void setCgPointRefs(java.util.List cgPointRefs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CGPOINTREFS$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CGPOINTREFS$16);
                }
                target.setListValue(cgPointRefs);
            }
        }
        
        /**
         * Sets (as xml) the "cgPointRefs" attribute
         */
        public void xsetCgPointRefs(org.landxml.schema.landXML11.PointNameRefs cgPointRefs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointNameRefs target = null;
                target = (org.landxml.schema.landXML11.PointNameRefs)get_store().find_attribute_user(CGPOINTREFS$16);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PointNameRefs)get_store().add_attribute_user(CGPOINTREFS$16);
                }
                target.set(cgPointRefs);
            }
        }
        
        /**
         * Unsets the "cgPointRefs" attribute
         */
        public void unsetCgPointRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CGPOINTREFS$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$18);
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
                return get_store().find_attribute_user(NAME$18) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$18);
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
                get_store().remove_attribute(NAME$18);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$20);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$20);
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
                return get_store().find_attribute_user(DESC$20) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$20);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$20);
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
                get_store().remove_attribute(DESC$20);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$22);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$22);
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
                return get_store().find_attribute_user(STATE$22) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$22);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$22);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$22);
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
                get_store().remove_attribute(STATE$22);
            }
        }
    }
}
