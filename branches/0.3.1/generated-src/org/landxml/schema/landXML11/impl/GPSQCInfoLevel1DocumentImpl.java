/*
 * An XML document type.
 * Localname: GPSQCInfoLevel1
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.GPSQCInfoLevel1Document
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one GPSQCInfoLevel1(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class GPSQCInfoLevel1DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.GPSQCInfoLevel1Document
{
    
    public GPSQCInfoLevel1DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GPSQCINFOLEVEL1$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "GPSQCInfoLevel1");
    
    
    /**
     * Gets the "GPSQCInfoLevel1" element
     */
    public org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1 getGPSQCInfoLevel1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1 target = null;
            target = (org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1)get_store().find_element_user(GPSQCINFOLEVEL1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GPSQCInfoLevel1" element
     */
    public void setGPSQCInfoLevel1(org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1 gpsqcInfoLevel1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1 target = null;
            target = (org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1)get_store().find_element_user(GPSQCINFOLEVEL1$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1)get_store().add_element_user(GPSQCINFOLEVEL1$0);
            }
            target.set(gpsqcInfoLevel1);
        }
    }
    
    /**
     * Appends and returns a new empty "GPSQCInfoLevel1" element
     */
    public org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1 addNewGPSQCInfoLevel1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1 target = null;
            target = (org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1)get_store().add_element_user(GPSQCINFOLEVEL1$0);
            return target;
        }
    }
    /**
     * An XML GPSQCInfoLevel1(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class GPSQCInfoLevel1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.GPSQCInfoLevel1Document.GPSQCInfoLevel1
    {
        
        public GPSQCInfoLevel1Impl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GPSSOLNTYPE$0 = 
            new javax.xml.namespace.QName("", "GPSSolnType");
        private static final javax.xml.namespace.QName GPSSOLNFREQ$2 = 
            new javax.xml.namespace.QName("", "GPSSolnFreq");
        private static final javax.xml.namespace.QName NBRSATELLITES$4 = 
            new javax.xml.namespace.QName("", "nbrSatellites");
        private static final javax.xml.namespace.QName RDOP$6 = 
            new javax.xml.namespace.QName("", "RDOP");
        
        
        /**
         * Gets the "GPSSolnType" attribute
         */
        public org.landxml.schema.landXML11.GPSSolutionTypeEnum.Enum getGPSSolnType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GPSSOLNTYPE$0);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.GPSSolutionTypeEnum.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "GPSSolnType" attribute
         */
        public org.landxml.schema.landXML11.GPSSolutionTypeEnum xgetGPSSolnType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSSolutionTypeEnum target = null;
                target = (org.landxml.schema.landXML11.GPSSolutionTypeEnum)get_store().find_attribute_user(GPSSOLNTYPE$0);
                return target;
            }
        }
        
        /**
         * True if has "GPSSolnType" attribute
         */
        public boolean isSetGPSSolnType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GPSSOLNTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "GPSSolnType" attribute
         */
        public void setGPSSolnType(org.landxml.schema.landXML11.GPSSolutionTypeEnum.Enum gpsSolnType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GPSSOLNTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GPSSOLNTYPE$0);
                }
                target.setEnumValue(gpsSolnType);
            }
        }
        
        /**
         * Sets (as xml) the "GPSSolnType" attribute
         */
        public void xsetGPSSolnType(org.landxml.schema.landXML11.GPSSolutionTypeEnum gpsSolnType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSSolutionTypeEnum target = null;
                target = (org.landxml.schema.landXML11.GPSSolutionTypeEnum)get_store().find_attribute_user(GPSSOLNTYPE$0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.GPSSolutionTypeEnum)get_store().add_attribute_user(GPSSOLNTYPE$0);
                }
                target.set(gpsSolnType);
            }
        }
        
        /**
         * Unsets the "GPSSolnType" attribute
         */
        public void unsetGPSSolnType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GPSSOLNTYPE$0);
            }
        }
        
        /**
         * Gets the "GPSSolnFreq" attribute
         */
        public org.landxml.schema.landXML11.GPSSolutionFrequencyEnum.Enum getGPSSolnFreq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GPSSOLNFREQ$2);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.GPSSolutionFrequencyEnum.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "GPSSolnFreq" attribute
         */
        public org.landxml.schema.landXML11.GPSSolutionFrequencyEnum xgetGPSSolnFreq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSSolutionFrequencyEnum target = null;
                target = (org.landxml.schema.landXML11.GPSSolutionFrequencyEnum)get_store().find_attribute_user(GPSSOLNFREQ$2);
                return target;
            }
        }
        
        /**
         * True if has "GPSSolnFreq" attribute
         */
        public boolean isSetGPSSolnFreq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GPSSOLNFREQ$2) != null;
            }
        }
        
        /**
         * Sets the "GPSSolnFreq" attribute
         */
        public void setGPSSolnFreq(org.landxml.schema.landXML11.GPSSolutionFrequencyEnum.Enum gpsSolnFreq)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GPSSOLNFREQ$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GPSSOLNFREQ$2);
                }
                target.setEnumValue(gpsSolnFreq);
            }
        }
        
        /**
         * Sets (as xml) the "GPSSolnFreq" attribute
         */
        public void xsetGPSSolnFreq(org.landxml.schema.landXML11.GPSSolutionFrequencyEnum gpsSolnFreq)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSSolutionFrequencyEnum target = null;
                target = (org.landxml.schema.landXML11.GPSSolutionFrequencyEnum)get_store().find_attribute_user(GPSSOLNFREQ$2);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.GPSSolutionFrequencyEnum)get_store().add_attribute_user(GPSSOLNFREQ$2);
                }
                target.set(gpsSolnFreq);
            }
        }
        
        /**
         * Unsets the "GPSSolnFreq" attribute
         */
        public void unsetGPSSolnFreq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GPSSOLNFREQ$2);
            }
        }
        
        /**
         * Gets the "nbrSatellites" attribute
         */
        public java.math.BigInteger getNbrSatellites()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NBRSATELLITES$4);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "nbrSatellites" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetNbrSatellites()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NBRSATELLITES$4);
                return target;
            }
        }
        
        /**
         * True if has "nbrSatellites" attribute
         */
        public boolean isSetNbrSatellites()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NBRSATELLITES$4) != null;
            }
        }
        
        /**
         * Sets the "nbrSatellites" attribute
         */
        public void setNbrSatellites(java.math.BigInteger nbrSatellites)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NBRSATELLITES$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NBRSATELLITES$4);
                }
                target.setBigIntegerValue(nbrSatellites);
            }
        }
        
        /**
         * Sets (as xml) the "nbrSatellites" attribute
         */
        public void xsetNbrSatellites(org.apache.xmlbeans.XmlInteger nbrSatellites)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NBRSATELLITES$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(NBRSATELLITES$4);
                }
                target.set(nbrSatellites);
            }
        }
        
        /**
         * Unsets the "nbrSatellites" attribute
         */
        public void unsetNbrSatellites()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NBRSATELLITES$4);
            }
        }
        
        /**
         * Gets the "RDOP" attribute
         */
        public double getRDOP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RDOP$6);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "RDOP" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetRDOP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RDOP$6);
                return target;
            }
        }
        
        /**
         * True if has "RDOP" attribute
         */
        public boolean isSetRDOP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RDOP$6) != null;
            }
        }
        
        /**
         * Sets the "RDOP" attribute
         */
        public void setRDOP(double rdop)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RDOP$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RDOP$6);
                }
                target.setDoubleValue(rdop);
            }
        }
        
        /**
         * Sets (as xml) the "RDOP" attribute
         */
        public void xsetRDOP(org.apache.xmlbeans.XmlDouble rdop)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RDOP$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RDOP$6);
                }
                target.set(rdop);
            }
        }
        
        /**
         * Unsets the "RDOP" attribute
         */
        public void unsetRDOP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RDOP$6);
            }
        }
    }
}
