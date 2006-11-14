/*
 * An XML document type.
 * Localname: Parcel
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ParcelDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Parcel(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ParcelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ParcelDocument
{
    
    public ParcelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARCEL$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Parcel");
    
    
    /**
     * Gets the "Parcel" element
     */
    public org.landxml.schema.landXML11.ParcelDocument.Parcel getParcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ParcelDocument.Parcel target = null;
            target = (org.landxml.schema.landXML11.ParcelDocument.Parcel)get_store().find_element_user(PARCEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Parcel" element
     */
    public void setParcel(org.landxml.schema.landXML11.ParcelDocument.Parcel parcel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ParcelDocument.Parcel target = null;
            target = (org.landxml.schema.landXML11.ParcelDocument.Parcel)get_store().find_element_user(PARCEL$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ParcelDocument.Parcel)get_store().add_element_user(PARCEL$0);
            }
            target.set(parcel);
        }
    }
    
    /**
     * Appends and returns a new empty "Parcel" element
     */
    public org.landxml.schema.landXML11.ParcelDocument.Parcel addNewParcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ParcelDocument.Parcel target = null;
            target = (org.landxml.schema.landXML11.ParcelDocument.Parcel)get_store().add_element_user(PARCEL$0);
            return target;
        }
    }
    /**
     * An XML Parcel(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class ParcelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ParcelDocument.Parcel
    {
        
        public ParcelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CENTER$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Center");
        private static final javax.xml.namespace.QName COORDGEOM$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CoordGeom");
        private static final javax.xml.namespace.QName VOLUMEGEOM$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "VolumeGeom");
        private static final javax.xml.namespace.QName PARCELS$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Parcels");
        private static final javax.xml.namespace.QName TITLE$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Title");
        private static final javax.xml.namespace.QName EXCLUSIONS$10 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Exclusions");
        private static final javax.xml.namespace.QName LOCATIONADDRESS$12 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "LocationAddress");
        private static final javax.xml.namespace.QName FEATURE$14 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName NAME$16 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName OID$18 = 
            new javax.xml.namespace.QName("", "oID");
        private static final javax.xml.namespace.QName AREA$20 = 
            new javax.xml.namespace.QName("", "area");
        private static final javax.xml.namespace.QName DESC$22 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName DIRCLOSURE$24 = 
            new javax.xml.namespace.QName("", "dirClosure");
        private static final javax.xml.namespace.QName DISTCLOSURE$26 = 
            new javax.xml.namespace.QName("", "distClosure");
        private static final javax.xml.namespace.QName OWNER$28 = 
            new javax.xml.namespace.QName("", "owner");
        private static final javax.xml.namespace.QName PARCELTYPE$30 = 
            new javax.xml.namespace.QName("", "parcelType");
        private static final javax.xml.namespace.QName SETBACKFRONT$32 = 
            new javax.xml.namespace.QName("", "setbackFront");
        private static final javax.xml.namespace.QName SETBACKREAR$34 = 
            new javax.xml.namespace.QName("", "setbackRear");
        private static final javax.xml.namespace.QName SETBACKSIDE$36 = 
            new javax.xml.namespace.QName("", "setbackSide");
        private static final javax.xml.namespace.QName STATE$38 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName TAXID$40 = 
            new javax.xml.namespace.QName("", "taxId");
        private static final javax.xml.namespace.QName CLASS1$42 = 
            new javax.xml.namespace.QName("", "class");
        private static final javax.xml.namespace.QName USEOFPARCEL$44 = 
            new javax.xml.namespace.QName("", "useOfParcel");
        private static final javax.xml.namespace.QName PARCELFORMAT$46 = 
            new javax.xml.namespace.QName("", "parcelFormat");
        private static final javax.xml.namespace.QName BUILDINGNO$48 = 
            new javax.xml.namespace.QName("", "buildingNo");
        private static final javax.xml.namespace.QName BUILDINGLEVELNO$50 = 
            new javax.xml.namespace.QName("", "buildingLevelNo");
        private static final javax.xml.namespace.QName VOLUME$52 = 
            new javax.xml.namespace.QName("", "volume");
        private static final javax.xml.namespace.QName PCLREF$54 = 
            new javax.xml.namespace.QName("", "pclRef");
        private static final javax.xml.namespace.QName LOTENTITLEMENTS$56 = 
            new javax.xml.namespace.QName("", "lotEntitlements");
        private static final javax.xml.namespace.QName LIABILITYAPPORTIONMENT$58 = 
            new javax.xml.namespace.QName("", "liabilityApportionment");
        
        
        /**
         * Gets a List of "Center" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PointType> getCenterList()
        {
            final class CenterList extends java.util.AbstractList<org.landxml.schema.landXML11.PointType>
            {
                public org.landxml.schema.landXML11.PointType get(int i)
                    { return ParcelImpl.this.getCenterArray(i); }
                
                public org.landxml.schema.landXML11.PointType set(int i, org.landxml.schema.landXML11.PointType o)
                {
                    org.landxml.schema.landXML11.PointType old = ParcelImpl.this.getCenterArray(i);
                    ParcelImpl.this.setCenterArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PointType o)
                    { ParcelImpl.this.insertNewCenter(i).set(o); }
                
                public org.landxml.schema.landXML11.PointType remove(int i)
                {
                    org.landxml.schema.landXML11.PointType old = ParcelImpl.this.getCenterArray(i);
                    ParcelImpl.this.removeCenter(i);
                    return old;
                }
                
                public int size()
                    { return ParcelImpl.this.sizeOfCenterArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CenterList();
            }
        }
        
        /**
         * Gets array of all "Center" elements
         */
        public org.landxml.schema.landXML11.PointType[] getCenterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CENTER$0, targetList);
                org.landxml.schema.landXML11.PointType[] result = new org.landxml.schema.landXML11.PointType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Center" element
         */
        public org.landxml.schema.landXML11.PointType getCenterArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(CENTER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Center" element
         */
        public int sizeOfCenterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CENTER$0);
            }
        }
        
        /**
         * Sets array of all "Center" element
         */
        public void setCenterArray(org.landxml.schema.landXML11.PointType[] centerArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(centerArray, CENTER$0);
            }
        }
        
        /**
         * Sets ith "Center" element
         */
        public void setCenterArray(int i, org.landxml.schema.landXML11.PointType center)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(CENTER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(center);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Center" element
         */
        public org.landxml.schema.landXML11.PointType insertNewCenter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().insert_element_user(CENTER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Center" element
         */
        public org.landxml.schema.landXML11.PointType addNewCenter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(CENTER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Center" element
         */
        public void removeCenter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CENTER$0, i);
            }
        }
        
        /**
         * Gets a List of "CoordGeom" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom> getCoordGeomList()
        {
            final class CoordGeomList extends java.util.AbstractList<org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom>
            {
                public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom get(int i)
                    { return ParcelImpl.this.getCoordGeomArray(i); }
                
                public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom set(int i, org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom o)
                {
                    org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom old = ParcelImpl.this.getCoordGeomArray(i);
                    ParcelImpl.this.setCoordGeomArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom o)
                    { ParcelImpl.this.insertNewCoordGeom(i).set(o); }
                
                public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom remove(int i)
                {
                    org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom old = ParcelImpl.this.getCoordGeomArray(i);
                    ParcelImpl.this.removeCoordGeom(i);
                    return old;
                }
                
                public int size()
                    { return ParcelImpl.this.sizeOfCoordGeomArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CoordGeomList();
            }
        }
        
        /**
         * Gets array of all "CoordGeom" elements
         */
        public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom[] getCoordGeomArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COORDGEOM$2, targetList);
                org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom[] result = new org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CoordGeom" element
         */
        public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom getCoordGeomArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom target = null;
                target = (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom)get_store().find_element_user(COORDGEOM$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CoordGeom" element
         */
        public int sizeOfCoordGeomArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COORDGEOM$2);
            }
        }
        
        /**
         * Sets array of all "CoordGeom" element
         */
        public void setCoordGeomArray(org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom[] coordGeomArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(coordGeomArray, COORDGEOM$2);
            }
        }
        
        /**
         * Sets ith "CoordGeom" element
         */
        public void setCoordGeomArray(int i, org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom coordGeom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom target = null;
                target = (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom)get_store().find_element_user(COORDGEOM$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(coordGeom);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CoordGeom" element
         */
        public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom insertNewCoordGeom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom target = null;
                target = (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom)get_store().insert_element_user(COORDGEOM$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CoordGeom" element
         */
        public org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom addNewCoordGeom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom target = null;
                target = (org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom)get_store().add_element_user(COORDGEOM$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "CoordGeom" element
         */
        public void removeCoordGeom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COORDGEOM$2, i);
            }
        }
        
        /**
         * Gets a List of "VolumeGeom" elements
         */
        public java.util.List<org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom> getVolumeGeomList()
        {
            final class VolumeGeomList extends java.util.AbstractList<org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom>
            {
                public org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom get(int i)
                    { return ParcelImpl.this.getVolumeGeomArray(i); }
                
                public org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom set(int i, org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom o)
                {
                    org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom old = ParcelImpl.this.getVolumeGeomArray(i);
                    ParcelImpl.this.setVolumeGeomArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom o)
                    { ParcelImpl.this.insertNewVolumeGeom(i).set(o); }
                
                public org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom remove(int i)
                {
                    org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom old = ParcelImpl.this.getVolumeGeomArray(i);
                    ParcelImpl.this.removeVolumeGeom(i);
                    return old;
                }
                
                public int size()
                    { return ParcelImpl.this.sizeOfVolumeGeomArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new VolumeGeomList();
            }
        }
        
        /**
         * Gets array of all "VolumeGeom" elements
         */
        public org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom[] getVolumeGeomArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VOLUMEGEOM$4, targetList);
                org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom[] result = new org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "VolumeGeom" element
         */
        public org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom getVolumeGeomArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom target = null;
                target = (org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom)get_store().find_element_user(VOLUMEGEOM$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "VolumeGeom" element
         */
        public int sizeOfVolumeGeomArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VOLUMEGEOM$4);
            }
        }
        
        /**
         * Sets array of all "VolumeGeom" element
         */
        public void setVolumeGeomArray(org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom[] volumeGeomArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(volumeGeomArray, VOLUMEGEOM$4);
            }
        }
        
        /**
         * Sets ith "VolumeGeom" element
         */
        public void setVolumeGeomArray(int i, org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom volumeGeom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom target = null;
                target = (org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom)get_store().find_element_user(VOLUMEGEOM$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(volumeGeom);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "VolumeGeom" element
         */
        public org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom insertNewVolumeGeom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom target = null;
                target = (org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom)get_store().insert_element_user(VOLUMEGEOM$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "VolumeGeom" element
         */
        public org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom addNewVolumeGeom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom target = null;
                target = (org.landxml.schema.landXML11.VolumeGeomDocument.VolumeGeom)get_store().add_element_user(VOLUMEGEOM$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "VolumeGeom" element
         */
        public void removeVolumeGeom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VOLUMEGEOM$4, i);
            }
        }
        
        /**
         * Gets a List of "Parcels" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ParcelsDocument.Parcels> getParcelsList()
        {
            final class ParcelsList extends java.util.AbstractList<org.landxml.schema.landXML11.ParcelsDocument.Parcels>
            {
                public org.landxml.schema.landXML11.ParcelsDocument.Parcels get(int i)
                    { return ParcelImpl.this.getParcelsArray(i); }
                
                public org.landxml.schema.landXML11.ParcelsDocument.Parcels set(int i, org.landxml.schema.landXML11.ParcelsDocument.Parcels o)
                {
                    org.landxml.schema.landXML11.ParcelsDocument.Parcels old = ParcelImpl.this.getParcelsArray(i);
                    ParcelImpl.this.setParcelsArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ParcelsDocument.Parcels o)
                    { ParcelImpl.this.insertNewParcels(i).set(o); }
                
                public org.landxml.schema.landXML11.ParcelsDocument.Parcels remove(int i)
                {
                    org.landxml.schema.landXML11.ParcelsDocument.Parcels old = ParcelImpl.this.getParcelsArray(i);
                    ParcelImpl.this.removeParcels(i);
                    return old;
                }
                
                public int size()
                    { return ParcelImpl.this.sizeOfParcelsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ParcelsList();
            }
        }
        
        /**
         * Gets array of all "Parcels" elements
         */
        public org.landxml.schema.landXML11.ParcelsDocument.Parcels[] getParcelsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PARCELS$6, targetList);
                org.landxml.schema.landXML11.ParcelsDocument.Parcels[] result = new org.landxml.schema.landXML11.ParcelsDocument.Parcels[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Parcels" element
         */
        public org.landxml.schema.landXML11.ParcelsDocument.Parcels getParcelsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParcelsDocument.Parcels target = null;
                target = (org.landxml.schema.landXML11.ParcelsDocument.Parcels)get_store().find_element_user(PARCELS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Parcels" element
         */
        public int sizeOfParcelsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARCELS$6);
            }
        }
        
        /**
         * Sets array of all "Parcels" element
         */
        public void setParcelsArray(org.landxml.schema.landXML11.ParcelsDocument.Parcels[] parcelsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(parcelsArray, PARCELS$6);
            }
        }
        
        /**
         * Sets ith "Parcels" element
         */
        public void setParcelsArray(int i, org.landxml.schema.landXML11.ParcelsDocument.Parcels parcels)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParcelsDocument.Parcels target = null;
                target = (org.landxml.schema.landXML11.ParcelsDocument.Parcels)get_store().find_element_user(PARCELS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(parcels);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Parcels" element
         */
        public org.landxml.schema.landXML11.ParcelsDocument.Parcels insertNewParcels(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParcelsDocument.Parcels target = null;
                target = (org.landxml.schema.landXML11.ParcelsDocument.Parcels)get_store().insert_element_user(PARCELS$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Parcels" element
         */
        public org.landxml.schema.landXML11.ParcelsDocument.Parcels addNewParcels()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParcelsDocument.Parcels target = null;
                target = (org.landxml.schema.landXML11.ParcelsDocument.Parcels)get_store().add_element_user(PARCELS$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "Parcels" element
         */
        public void removeParcels(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARCELS$6, i);
            }
        }
        
        /**
         * Gets a List of "Title" elements
         */
        public java.util.List<org.landxml.schema.landXML11.TitleDocument.Title> getTitleList()
        {
            final class TitleList extends java.util.AbstractList<org.landxml.schema.landXML11.TitleDocument.Title>
            {
                public org.landxml.schema.landXML11.TitleDocument.Title get(int i)
                    { return ParcelImpl.this.getTitleArray(i); }
                
                public org.landxml.schema.landXML11.TitleDocument.Title set(int i, org.landxml.schema.landXML11.TitleDocument.Title o)
                {
                    org.landxml.schema.landXML11.TitleDocument.Title old = ParcelImpl.this.getTitleArray(i);
                    ParcelImpl.this.setTitleArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.TitleDocument.Title o)
                    { ParcelImpl.this.insertNewTitle(i).set(o); }
                
                public org.landxml.schema.landXML11.TitleDocument.Title remove(int i)
                {
                    org.landxml.schema.landXML11.TitleDocument.Title old = ParcelImpl.this.getTitleArray(i);
                    ParcelImpl.this.removeTitle(i);
                    return old;
                }
                
                public int size()
                    { return ParcelImpl.this.sizeOfTitleArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new TitleList();
            }
        }
        
        /**
         * Gets array of all "Title" elements
         */
        public org.landxml.schema.landXML11.TitleDocument.Title[] getTitleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TITLE$8, targetList);
                org.landxml.schema.landXML11.TitleDocument.Title[] result = new org.landxml.schema.landXML11.TitleDocument.Title[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Title" element
         */
        public org.landxml.schema.landXML11.TitleDocument.Title getTitleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TitleDocument.Title target = null;
                target = (org.landxml.schema.landXML11.TitleDocument.Title)get_store().find_element_user(TITLE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Title" element
         */
        public int sizeOfTitleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TITLE$8);
            }
        }
        
        /**
         * Sets array of all "Title" element
         */
        public void setTitleArray(org.landxml.schema.landXML11.TitleDocument.Title[] titleArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(titleArray, TITLE$8);
            }
        }
        
        /**
         * Sets ith "Title" element
         */
        public void setTitleArray(int i, org.landxml.schema.landXML11.TitleDocument.Title title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TitleDocument.Title target = null;
                target = (org.landxml.schema.landXML11.TitleDocument.Title)get_store().find_element_user(TITLE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(title);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Title" element
         */
        public org.landxml.schema.landXML11.TitleDocument.Title insertNewTitle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TitleDocument.Title target = null;
                target = (org.landxml.schema.landXML11.TitleDocument.Title)get_store().insert_element_user(TITLE$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Title" element
         */
        public org.landxml.schema.landXML11.TitleDocument.Title addNewTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.TitleDocument.Title target = null;
                target = (org.landxml.schema.landXML11.TitleDocument.Title)get_store().add_element_user(TITLE$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "Title" element
         */
        public void removeTitle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TITLE$8, i);
            }
        }
        
        /**
         * Gets a List of "Exclusions" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ExclusionsDocument.Exclusions> getExclusionsList()
        {
            final class ExclusionsList extends java.util.AbstractList<org.landxml.schema.landXML11.ExclusionsDocument.Exclusions>
            {
                public org.landxml.schema.landXML11.ExclusionsDocument.Exclusions get(int i)
                    { return ParcelImpl.this.getExclusionsArray(i); }
                
                public org.landxml.schema.landXML11.ExclusionsDocument.Exclusions set(int i, org.landxml.schema.landXML11.ExclusionsDocument.Exclusions o)
                {
                    org.landxml.schema.landXML11.ExclusionsDocument.Exclusions old = ParcelImpl.this.getExclusionsArray(i);
                    ParcelImpl.this.setExclusionsArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ExclusionsDocument.Exclusions o)
                    { ParcelImpl.this.insertNewExclusions(i).set(o); }
                
                public org.landxml.schema.landXML11.ExclusionsDocument.Exclusions remove(int i)
                {
                    org.landxml.schema.landXML11.ExclusionsDocument.Exclusions old = ParcelImpl.this.getExclusionsArray(i);
                    ParcelImpl.this.removeExclusions(i);
                    return old;
                }
                
                public int size()
                    { return ParcelImpl.this.sizeOfExclusionsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ExclusionsList();
            }
        }
        
        /**
         * Gets array of all "Exclusions" elements
         */
        public org.landxml.schema.landXML11.ExclusionsDocument.Exclusions[] getExclusionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXCLUSIONS$10, targetList);
                org.landxml.schema.landXML11.ExclusionsDocument.Exclusions[] result = new org.landxml.schema.landXML11.ExclusionsDocument.Exclusions[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Exclusions" element
         */
        public org.landxml.schema.landXML11.ExclusionsDocument.Exclusions getExclusionsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ExclusionsDocument.Exclusions target = null;
                target = (org.landxml.schema.landXML11.ExclusionsDocument.Exclusions)get_store().find_element_user(EXCLUSIONS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Exclusions" element
         */
        public int sizeOfExclusionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXCLUSIONS$10);
            }
        }
        
        /**
         * Sets array of all "Exclusions" element
         */
        public void setExclusionsArray(org.landxml.schema.landXML11.ExclusionsDocument.Exclusions[] exclusionsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(exclusionsArray, EXCLUSIONS$10);
            }
        }
        
        /**
         * Sets ith "Exclusions" element
         */
        public void setExclusionsArray(int i, org.landxml.schema.landXML11.ExclusionsDocument.Exclusions exclusions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ExclusionsDocument.Exclusions target = null;
                target = (org.landxml.schema.landXML11.ExclusionsDocument.Exclusions)get_store().find_element_user(EXCLUSIONS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(exclusions);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Exclusions" element
         */
        public org.landxml.schema.landXML11.ExclusionsDocument.Exclusions insertNewExclusions(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ExclusionsDocument.Exclusions target = null;
                target = (org.landxml.schema.landXML11.ExclusionsDocument.Exclusions)get_store().insert_element_user(EXCLUSIONS$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Exclusions" element
         */
        public org.landxml.schema.landXML11.ExclusionsDocument.Exclusions addNewExclusions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ExclusionsDocument.Exclusions target = null;
                target = (org.landxml.schema.landXML11.ExclusionsDocument.Exclusions)get_store().add_element_user(EXCLUSIONS$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "Exclusions" element
         */
        public void removeExclusions(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXCLUSIONS$10, i);
            }
        }
        
        /**
         * Gets a List of "LocationAddress" elements
         */
        public java.util.List<org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress> getLocationAddressList()
        {
            final class LocationAddressList extends java.util.AbstractList<org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress>
            {
                public org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress get(int i)
                    { return ParcelImpl.this.getLocationAddressArray(i); }
                
                public org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress set(int i, org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress o)
                {
                    org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress old = ParcelImpl.this.getLocationAddressArray(i);
                    ParcelImpl.this.setLocationAddressArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress o)
                    { ParcelImpl.this.insertNewLocationAddress(i).set(o); }
                
                public org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress remove(int i)
                {
                    org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress old = ParcelImpl.this.getLocationAddressArray(i);
                    ParcelImpl.this.removeLocationAddress(i);
                    return old;
                }
                
                public int size()
                    { return ParcelImpl.this.sizeOfLocationAddressArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LocationAddressList();
            }
        }
        
        /**
         * Gets array of all "LocationAddress" elements
         */
        public org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress[] getLocationAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LOCATIONADDRESS$12, targetList);
                org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress[] result = new org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "LocationAddress" element
         */
        public org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress getLocationAddressArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress target = null;
                target = (org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress)get_store().find_element_user(LOCATIONADDRESS$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "LocationAddress" element
         */
        public int sizeOfLocationAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCATIONADDRESS$12);
            }
        }
        
        /**
         * Sets array of all "LocationAddress" element
         */
        public void setLocationAddressArray(org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress[] locationAddressArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(locationAddressArray, LOCATIONADDRESS$12);
            }
        }
        
        /**
         * Sets ith "LocationAddress" element
         */
        public void setLocationAddressArray(int i, org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress locationAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress target = null;
                target = (org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress)get_store().find_element_user(LOCATIONADDRESS$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(locationAddress);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "LocationAddress" element
         */
        public org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress insertNewLocationAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress target = null;
                target = (org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress)get_store().insert_element_user(LOCATIONADDRESS$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "LocationAddress" element
         */
        public org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress addNewLocationAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress target = null;
                target = (org.landxml.schema.landXML11.LocationAddressDocument.LocationAddress)get_store().add_element_user(LOCATIONADDRESS$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "LocationAddress" element
         */
        public void removeLocationAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCATIONADDRESS$12, i);
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
                    { return ParcelImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ParcelImpl.this.getFeatureArray(i);
                    ParcelImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { ParcelImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = ParcelImpl.this.getFeatureArray(i);
                    ParcelImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return ParcelImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$14, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$14, i);
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
                return get_store().count_elements(FEATURE$14);
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
                arraySetterHelper(featureArray, FEATURE$14);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$14, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$14, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$14);
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
                get_store().remove_element(FEATURE$14, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$16);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$16);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "oID" attribute
         */
        public java.lang.String getOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "oID" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$18);
                return target;
            }
        }
        
        /**
         * True if has "oID" attribute
         */
        public boolean isSetOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OID$18) != null;
            }
        }
        
        /**
         * Sets the "oID" attribute
         */
        public void setOID(java.lang.String oid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OID$18);
                }
                target.setStringValue(oid);
            }
        }
        
        /**
         * Sets (as xml) the "oID" attribute
         */
        public void xsetOID(org.apache.xmlbeans.XmlString oid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OID$18);
                }
                target.set(oid);
            }
        }
        
        /**
         * Unsets the "oID" attribute
         */
        public void unsetOID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OID$18);
            }
        }
        
        /**
         * Gets the "area" attribute
         */
        public double getArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREA$20);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "area" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AREA$20);
                return target;
            }
        }
        
        /**
         * True if has "area" attribute
         */
        public boolean isSetArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AREA$20) != null;
            }
        }
        
        /**
         * Sets the "area" attribute
         */
        public void setArea(double area)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREA$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AREA$20);
                }
                target.setDoubleValue(area);
            }
        }
        
        /**
         * Sets (as xml) the "area" attribute
         */
        public void xsetArea(org.apache.xmlbeans.XmlDouble area)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AREA$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(AREA$20);
                }
                target.set(area);
            }
        }
        
        /**
         * Unsets the "area" attribute
         */
        public void unsetArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AREA$20);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$22);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$22);
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
                return get_store().find_attribute_user(DESC$22) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$22);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$22);
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
                get_store().remove_attribute(DESC$22);
            }
        }
        
        /**
         * Gets the "dirClosure" attribute
         */
        public double getDirClosure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRCLOSURE$24);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "dirClosure" attribute
         */
        public org.landxml.schema.landXML11.Direction xgetDirClosure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Direction target = null;
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(DIRCLOSURE$24);
                return target;
            }
        }
        
        /**
         * True if has "dirClosure" attribute
         */
        public boolean isSetDirClosure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DIRCLOSURE$24) != null;
            }
        }
        
        /**
         * Sets the "dirClosure" attribute
         */
        public void setDirClosure(double dirClosure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRCLOSURE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIRCLOSURE$24);
                }
                target.setDoubleValue(dirClosure);
            }
        }
        
        /**
         * Sets (as xml) the "dirClosure" attribute
         */
        public void xsetDirClosure(org.landxml.schema.landXML11.Direction dirClosure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Direction target = null;
                target = (org.landxml.schema.landXML11.Direction)get_store().find_attribute_user(DIRCLOSURE$24);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Direction)get_store().add_attribute_user(DIRCLOSURE$24);
                }
                target.set(dirClosure);
            }
        }
        
        /**
         * Unsets the "dirClosure" attribute
         */
        public void unsetDirClosure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DIRCLOSURE$24);
            }
        }
        
        /**
         * Gets the "distClosure" attribute
         */
        public double getDistClosure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTCLOSURE$26);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "distClosure" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetDistClosure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DISTCLOSURE$26);
                return target;
            }
        }
        
        /**
         * True if has "distClosure" attribute
         */
        public boolean isSetDistClosure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DISTCLOSURE$26) != null;
            }
        }
        
        /**
         * Sets the "distClosure" attribute
         */
        public void setDistClosure(double distClosure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTCLOSURE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTCLOSURE$26);
                }
                target.setDoubleValue(distClosure);
            }
        }
        
        /**
         * Sets (as xml) the "distClosure" attribute
         */
        public void xsetDistClosure(org.apache.xmlbeans.XmlDouble distClosure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DISTCLOSURE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DISTCLOSURE$26);
                }
                target.set(distClosure);
            }
        }
        
        /**
         * Unsets the "distClosure" attribute
         */
        public void unsetDistClosure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DISTCLOSURE$26);
            }
        }
        
        /**
         * Gets the "owner" attribute
         */
        public java.lang.String getOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNER$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "owner" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OWNER$28);
                return target;
            }
        }
        
        /**
         * True if has "owner" attribute
         */
        public boolean isSetOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OWNER$28) != null;
            }
        }
        
        /**
         * Sets the "owner" attribute
         */
        public void setOwner(java.lang.String owner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNER$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OWNER$28);
                }
                target.setStringValue(owner);
            }
        }
        
        /**
         * Sets (as xml) the "owner" attribute
         */
        public void xsetOwner(org.apache.xmlbeans.XmlString owner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OWNER$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OWNER$28);
                }
                target.set(owner);
            }
        }
        
        /**
         * Unsets the "owner" attribute
         */
        public void unsetOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OWNER$28);
            }
        }
        
        /**
         * Gets the "parcelType" attribute
         */
        public java.lang.String getParcelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARCELTYPE$30);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "parcelType" attribute
         */
        public org.apache.xmlbeans.XmlString xgetParcelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARCELTYPE$30);
                return target;
            }
        }
        
        /**
         * True if has "parcelType" attribute
         */
        public boolean isSetParcelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARCELTYPE$30) != null;
            }
        }
        
        /**
         * Sets the "parcelType" attribute
         */
        public void setParcelType(java.lang.String parcelType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARCELTYPE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARCELTYPE$30);
                }
                target.setStringValue(parcelType);
            }
        }
        
        /**
         * Sets (as xml) the "parcelType" attribute
         */
        public void xsetParcelType(org.apache.xmlbeans.XmlString parcelType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARCELTYPE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PARCELTYPE$30);
                }
                target.set(parcelType);
            }
        }
        
        /**
         * Unsets the "parcelType" attribute
         */
        public void unsetParcelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARCELTYPE$30);
            }
        }
        
        /**
         * Gets the "setbackFront" attribute
         */
        public double getSetbackFront()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETBACKFRONT$32);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "setbackFront" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSetbackFront()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SETBACKFRONT$32);
                return target;
            }
        }
        
        /**
         * True if has "setbackFront" attribute
         */
        public boolean isSetSetbackFront()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SETBACKFRONT$32) != null;
            }
        }
        
        /**
         * Sets the "setbackFront" attribute
         */
        public void setSetbackFront(double setbackFront)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETBACKFRONT$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETBACKFRONT$32);
                }
                target.setDoubleValue(setbackFront);
            }
        }
        
        /**
         * Sets (as xml) the "setbackFront" attribute
         */
        public void xsetSetbackFront(org.apache.xmlbeans.XmlDouble setbackFront)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SETBACKFRONT$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SETBACKFRONT$32);
                }
                target.set(setbackFront);
            }
        }
        
        /**
         * Unsets the "setbackFront" attribute
         */
        public void unsetSetbackFront()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SETBACKFRONT$32);
            }
        }
        
        /**
         * Gets the "setbackRear" attribute
         */
        public double getSetbackRear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETBACKREAR$34);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "setbackRear" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSetbackRear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SETBACKREAR$34);
                return target;
            }
        }
        
        /**
         * True if has "setbackRear" attribute
         */
        public boolean isSetSetbackRear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SETBACKREAR$34) != null;
            }
        }
        
        /**
         * Sets the "setbackRear" attribute
         */
        public void setSetbackRear(double setbackRear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETBACKREAR$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETBACKREAR$34);
                }
                target.setDoubleValue(setbackRear);
            }
        }
        
        /**
         * Sets (as xml) the "setbackRear" attribute
         */
        public void xsetSetbackRear(org.apache.xmlbeans.XmlDouble setbackRear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SETBACKREAR$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SETBACKREAR$34);
                }
                target.set(setbackRear);
            }
        }
        
        /**
         * Unsets the "setbackRear" attribute
         */
        public void unsetSetbackRear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SETBACKREAR$34);
            }
        }
        
        /**
         * Gets the "setbackSide" attribute
         */
        public double getSetbackSide()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETBACKSIDE$36);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "setbackSide" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSetbackSide()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SETBACKSIDE$36);
                return target;
            }
        }
        
        /**
         * True if has "setbackSide" attribute
         */
        public boolean isSetSetbackSide()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SETBACKSIDE$36) != null;
            }
        }
        
        /**
         * Sets the "setbackSide" attribute
         */
        public void setSetbackSide(double setbackSide)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETBACKSIDE$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETBACKSIDE$36);
                }
                target.setDoubleValue(setbackSide);
            }
        }
        
        /**
         * Sets (as xml) the "setbackSide" attribute
         */
        public void xsetSetbackSide(org.apache.xmlbeans.XmlDouble setbackSide)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SETBACKSIDE$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SETBACKSIDE$36);
                }
                target.set(setbackSide);
            }
        }
        
        /**
         * Unsets the "setbackSide" attribute
         */
        public void unsetSetbackSide()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SETBACKSIDE$36);
            }
        }
        
        /**
         * Gets the "state" attribute
         */
        public org.landxml.schema.landXML11.ParcelStateType.Enum getState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$38);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ParcelStateType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "state" attribute
         */
        public org.landxml.schema.landXML11.ParcelStateType xgetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParcelStateType target = null;
                target = (org.landxml.schema.landXML11.ParcelStateType)get_store().find_attribute_user(STATE$38);
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
                return get_store().find_attribute_user(STATE$38) != null;
            }
        }
        
        /**
         * Sets the "state" attribute
         */
        public void setState(org.landxml.schema.landXML11.ParcelStateType.Enum state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$38);
                }
                target.setEnumValue(state);
            }
        }
        
        /**
         * Sets (as xml) the "state" attribute
         */
        public void xsetState(org.landxml.schema.landXML11.ParcelStateType state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParcelStateType target = null;
                target = (org.landxml.schema.landXML11.ParcelStateType)get_store().find_attribute_user(STATE$38);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ParcelStateType)get_store().add_attribute_user(STATE$38);
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
                get_store().remove_attribute(STATE$38);
            }
        }
        
        /**
         * Gets the "taxId" attribute
         */
        public java.lang.String getTaxId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TAXID$40);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "taxId" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTaxId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TAXID$40);
                return target;
            }
        }
        
        /**
         * True if has "taxId" attribute
         */
        public boolean isSetTaxId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TAXID$40) != null;
            }
        }
        
        /**
         * Sets the "taxId" attribute
         */
        public void setTaxId(java.lang.String taxId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TAXID$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TAXID$40);
                }
                target.setStringValue(taxId);
            }
        }
        
        /**
         * Sets (as xml) the "taxId" attribute
         */
        public void xsetTaxId(org.apache.xmlbeans.XmlString taxId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TAXID$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TAXID$40);
                }
                target.set(taxId);
            }
        }
        
        /**
         * Unsets the "taxId" attribute
         */
        public void unsetTaxId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TAXID$40);
            }
        }
        
        /**
         * Gets the "class" attribute
         */
        public java.lang.String getClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$42);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "class" attribute
         */
        public org.landxml.schema.landXML11.ParcelClass xgetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParcelClass target = null;
                target = (org.landxml.schema.landXML11.ParcelClass)get_store().find_attribute_user(CLASS1$42);
                return target;
            }
        }
        
        /**
         * True if has "class" attribute
         */
        public boolean isSetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CLASS1$42) != null;
            }
        }
        
        /**
         * Sets the "class" attribute
         */
        public void setClass1(java.lang.String class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$42);
                }
                target.setStringValue(class1);
            }
        }
        
        /**
         * Sets (as xml) the "class" attribute
         */
        public void xsetClass1(org.landxml.schema.landXML11.ParcelClass class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParcelClass target = null;
                target = (org.landxml.schema.landXML11.ParcelClass)get_store().find_attribute_user(CLASS1$42);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ParcelClass)get_store().add_attribute_user(CLASS1$42);
                }
                target.set(class1);
            }
        }
        
        /**
         * Unsets the "class" attribute
         */
        public void unsetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CLASS1$42);
            }
        }
        
        /**
         * Gets the "useOfParcel" attribute
         */
        public java.lang.String getUseOfParcel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEOFPARCEL$44);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "useOfParcel" attribute
         */
        public org.landxml.schema.landXML11.UseOfParcelType xgetUseOfParcel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.UseOfParcelType target = null;
                target = (org.landxml.schema.landXML11.UseOfParcelType)get_store().find_attribute_user(USEOFPARCEL$44);
                return target;
            }
        }
        
        /**
         * True if has "useOfParcel" attribute
         */
        public boolean isSetUseOfParcel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(USEOFPARCEL$44) != null;
            }
        }
        
        /**
         * Sets the "useOfParcel" attribute
         */
        public void setUseOfParcel(java.lang.String useOfParcel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEOFPARCEL$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEOFPARCEL$44);
                }
                target.setStringValue(useOfParcel);
            }
        }
        
        /**
         * Sets (as xml) the "useOfParcel" attribute
         */
        public void xsetUseOfParcel(org.landxml.schema.landXML11.UseOfParcelType useOfParcel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.UseOfParcelType target = null;
                target = (org.landxml.schema.landXML11.UseOfParcelType)get_store().find_attribute_user(USEOFPARCEL$44);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.UseOfParcelType)get_store().add_attribute_user(USEOFPARCEL$44);
                }
                target.set(useOfParcel);
            }
        }
        
        /**
         * Unsets the "useOfParcel" attribute
         */
        public void unsetUseOfParcel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(USEOFPARCEL$44);
            }
        }
        
        /**
         * Gets the "parcelFormat" attribute
         */
        public java.lang.String getParcelFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARCELFORMAT$46);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "parcelFormat" attribute
         */
        public org.landxml.schema.landXML11.ParcelFormat xgetParcelFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParcelFormat target = null;
                target = (org.landxml.schema.landXML11.ParcelFormat)get_store().find_attribute_user(PARCELFORMAT$46);
                return target;
            }
        }
        
        /**
         * True if has "parcelFormat" attribute
         */
        public boolean isSetParcelFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARCELFORMAT$46) != null;
            }
        }
        
        /**
         * Sets the "parcelFormat" attribute
         */
        public void setParcelFormat(java.lang.String parcelFormat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARCELFORMAT$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARCELFORMAT$46);
                }
                target.setStringValue(parcelFormat);
            }
        }
        
        /**
         * Sets (as xml) the "parcelFormat" attribute
         */
        public void xsetParcelFormat(org.landxml.schema.landXML11.ParcelFormat parcelFormat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParcelFormat target = null;
                target = (org.landxml.schema.landXML11.ParcelFormat)get_store().find_attribute_user(PARCELFORMAT$46);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ParcelFormat)get_store().add_attribute_user(PARCELFORMAT$46);
                }
                target.set(parcelFormat);
            }
        }
        
        /**
         * Unsets the "parcelFormat" attribute
         */
        public void unsetParcelFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARCELFORMAT$46);
            }
        }
        
        /**
         * Gets the "buildingNo" attribute
         */
        public java.lang.String getBuildingNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUILDINGNO$48);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "buildingNo" attribute
         */
        public org.apache.xmlbeans.XmlString xgetBuildingNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BUILDINGNO$48);
                return target;
            }
        }
        
        /**
         * True if has "buildingNo" attribute
         */
        public boolean isSetBuildingNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BUILDINGNO$48) != null;
            }
        }
        
        /**
         * Sets the "buildingNo" attribute
         */
        public void setBuildingNo(java.lang.String buildingNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUILDINGNO$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BUILDINGNO$48);
                }
                target.setStringValue(buildingNo);
            }
        }
        
        /**
         * Sets (as xml) the "buildingNo" attribute
         */
        public void xsetBuildingNo(org.apache.xmlbeans.XmlString buildingNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BUILDINGNO$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BUILDINGNO$48);
                }
                target.set(buildingNo);
            }
        }
        
        /**
         * Unsets the "buildingNo" attribute
         */
        public void unsetBuildingNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BUILDINGNO$48);
            }
        }
        
        /**
         * Gets the "buildingLevelNo" attribute
         */
        public java.lang.String getBuildingLevelNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUILDINGLEVELNO$50);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "buildingLevelNo" attribute
         */
        public org.apache.xmlbeans.XmlString xgetBuildingLevelNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BUILDINGLEVELNO$50);
                return target;
            }
        }
        
        /**
         * True if has "buildingLevelNo" attribute
         */
        public boolean isSetBuildingLevelNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BUILDINGLEVELNO$50) != null;
            }
        }
        
        /**
         * Sets the "buildingLevelNo" attribute
         */
        public void setBuildingLevelNo(java.lang.String buildingLevelNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUILDINGLEVELNO$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BUILDINGLEVELNO$50);
                }
                target.setStringValue(buildingLevelNo);
            }
        }
        
        /**
         * Sets (as xml) the "buildingLevelNo" attribute
         */
        public void xsetBuildingLevelNo(org.apache.xmlbeans.XmlString buildingLevelNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BUILDINGLEVELNO$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BUILDINGLEVELNO$50);
                }
                target.set(buildingLevelNo);
            }
        }
        
        /**
         * Unsets the "buildingLevelNo" attribute
         */
        public void unsetBuildingLevelNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BUILDINGLEVELNO$50);
            }
        }
        
        /**
         * Gets the "volume" attribute
         */
        public java.lang.String getVolume()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VOLUME$52);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "volume" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVolume()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VOLUME$52);
                return target;
            }
        }
        
        /**
         * True if has "volume" attribute
         */
        public boolean isSetVolume()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VOLUME$52) != null;
            }
        }
        
        /**
         * Sets the "volume" attribute
         */
        public void setVolume(java.lang.String volume)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VOLUME$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VOLUME$52);
                }
                target.setStringValue(volume);
            }
        }
        
        /**
         * Sets (as xml) the "volume" attribute
         */
        public void xsetVolume(org.apache.xmlbeans.XmlString volume)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VOLUME$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VOLUME$52);
                }
                target.set(volume);
            }
        }
        
        /**
         * Unsets the "volume" attribute
         */
        public void unsetVolume()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VOLUME$52);
            }
        }
        
        /**
         * Gets the "pclRef" attribute
         */
        public java.lang.String getPclRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PCLREF$54);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pclRef" attribute
         */
        public org.landxml.schema.landXML11.ParcelNameRef xgetPclRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParcelNameRef target = null;
                target = (org.landxml.schema.landXML11.ParcelNameRef)get_store().find_attribute_user(PCLREF$54);
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
                return get_store().find_attribute_user(PCLREF$54) != null;
            }
        }
        
        /**
         * Sets the "pclRef" attribute
         */
        public void setPclRef(java.lang.String pclRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PCLREF$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PCLREF$54);
                }
                target.setStringValue(pclRef);
            }
        }
        
        /**
         * Sets (as xml) the "pclRef" attribute
         */
        public void xsetPclRef(org.landxml.schema.landXML11.ParcelNameRef pclRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ParcelNameRef target = null;
                target = (org.landxml.schema.landXML11.ParcelNameRef)get_store().find_attribute_user(PCLREF$54);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ParcelNameRef)get_store().add_attribute_user(PCLREF$54);
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
                get_store().remove_attribute(PCLREF$54);
            }
        }
        
        /**
         * Gets the "lotEntitlements" attribute
         */
        public java.lang.String getLotEntitlements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOTENTITLEMENTS$56);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lotEntitlements" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLotEntitlements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOTENTITLEMENTS$56);
                return target;
            }
        }
        
        /**
         * True if has "lotEntitlements" attribute
         */
        public boolean isSetLotEntitlements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOTENTITLEMENTS$56) != null;
            }
        }
        
        /**
         * Sets the "lotEntitlements" attribute
         */
        public void setLotEntitlements(java.lang.String lotEntitlements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOTENTITLEMENTS$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOTENTITLEMENTS$56);
                }
                target.setStringValue(lotEntitlements);
            }
        }
        
        /**
         * Sets (as xml) the "lotEntitlements" attribute
         */
        public void xsetLotEntitlements(org.apache.xmlbeans.XmlString lotEntitlements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOTENTITLEMENTS$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOTENTITLEMENTS$56);
                }
                target.set(lotEntitlements);
            }
        }
        
        /**
         * Unsets the "lotEntitlements" attribute
         */
        public void unsetLotEntitlements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOTENTITLEMENTS$56);
            }
        }
        
        /**
         * Gets the "liabilityApportionment" attribute
         */
        public java.lang.String getLiabilityApportionment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIABILITYAPPORTIONMENT$58);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "liabilityApportionment" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLiabilityApportionment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIABILITYAPPORTIONMENT$58);
                return target;
            }
        }
        
        /**
         * True if has "liabilityApportionment" attribute
         */
        public boolean isSetLiabilityApportionment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LIABILITYAPPORTIONMENT$58) != null;
            }
        }
        
        /**
         * Sets the "liabilityApportionment" attribute
         */
        public void setLiabilityApportionment(java.lang.String liabilityApportionment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIABILITYAPPORTIONMENT$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIABILITYAPPORTIONMENT$58);
                }
                target.setStringValue(liabilityApportionment);
            }
        }
        
        /**
         * Sets (as xml) the "liabilityApportionment" attribute
         */
        public void xsetLiabilityApportionment(org.apache.xmlbeans.XmlString liabilityApportionment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIABILITYAPPORTIONMENT$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LIABILITYAPPORTIONMENT$58);
                }
                target.set(liabilityApportionment);
            }
        }
        
        /**
         * Unsets the "liabilityApportionment" attribute
         */
        public void unsetLiabilityApportionment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LIABILITYAPPORTIONMENT$58);
            }
        }
    }
}
