/*
 * An XML document type.
 * Localname: GPSQCInfoLevel2
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.GPSQCInfoLevel2Document
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one GPSQCInfoLevel2(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class GPSQCInfoLevel2DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.GPSQCInfoLevel2Document
{
    
    public GPSQCInfoLevel2DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GPSQCINFOLEVEL2$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "GPSQCInfoLevel2");
    
    
    /**
     * Gets the "GPSQCInfoLevel2" element
     */
    public org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2 getGPSQCInfoLevel2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2 target = null;
            target = (org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2)get_store().find_element_user(GPSQCINFOLEVEL2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GPSQCInfoLevel2" element
     */
    public void setGPSQCInfoLevel2(org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2 gpsqcInfoLevel2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2 target = null;
            target = (org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2)get_store().find_element_user(GPSQCINFOLEVEL2$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2)get_store().add_element_user(GPSQCINFOLEVEL2$0);
            }
            target.set(gpsqcInfoLevel2);
        }
    }
    
    /**
     * Appends and returns a new empty "GPSQCInfoLevel2" element
     */
    public org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2 addNewGPSQCInfoLevel2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2 target = null;
            target = (org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2)get_store().add_element_user(GPSQCINFOLEVEL2$0);
            return target;
        }
    }
    /**
     * An XML GPSQCInfoLevel2(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class GPSQCInfoLevel2Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.GPSQCInfoLevel2Document.GPSQCInfoLevel2
    {
        
        public GPSQCInfoLevel2Impl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COVARIANCEXX$0 = 
            new javax.xml.namespace.QName("", "covarianceXX");
        private static final javax.xml.namespace.QName COVARIANCEXY$2 = 
            new javax.xml.namespace.QName("", "covarianceXY");
        private static final javax.xml.namespace.QName COVARIANCEXZ$4 = 
            new javax.xml.namespace.QName("", "covarianceXZ");
        private static final javax.xml.namespace.QName COVARIANCEYY$6 = 
            new javax.xml.namespace.QName("", "covarianceYY");
        private static final javax.xml.namespace.QName COVARIANCEYZ$8 = 
            new javax.xml.namespace.QName("", "covarianceYZ");
        private static final javax.xml.namespace.QName COVARIANCEZZ$10 = 
            new javax.xml.namespace.QName("", "covarianceZZ");
        private static final javax.xml.namespace.QName GPSSOLNTYPE$12 = 
            new javax.xml.namespace.QName("", "GPSSolnType");
        private static final javax.xml.namespace.QName GPSSOLNFREQ$14 = 
            new javax.xml.namespace.QName("", "GPSSolnFreq");
        private static final javax.xml.namespace.QName RMS$16 = 
            new javax.xml.namespace.QName("", "RMS");
        private static final javax.xml.namespace.QName RATIO$18 = 
            new javax.xml.namespace.QName("", "ratio");
        private static final javax.xml.namespace.QName REFERENCEVARIANCE$20 = 
            new javax.xml.namespace.QName("", "referenceVariance");
        private static final javax.xml.namespace.QName NBRSATELLITES$22 = 
            new javax.xml.namespace.QName("", "nbrSatellites");
        private static final javax.xml.namespace.QName STARTTIME$24 = 
            new javax.xml.namespace.QName("", "startTime");
        private static final javax.xml.namespace.QName STOPTIME$26 = 
            new javax.xml.namespace.QName("", "stopTime");
        
        
        /**
         * Gets the "covarianceXX" attribute
         */
        public double getCovarianceXX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COVARIANCEXX$0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "covarianceXX" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetCovarianceXX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COVARIANCEXX$0);
                return target;
            }
        }
        
        /**
         * True if has "covarianceXX" attribute
         */
        public boolean isSetCovarianceXX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COVARIANCEXX$0) != null;
            }
        }
        
        /**
         * Sets the "covarianceXX" attribute
         */
        public void setCovarianceXX(double covarianceXX)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COVARIANCEXX$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COVARIANCEXX$0);
                }
                target.setDoubleValue(covarianceXX);
            }
        }
        
        /**
         * Sets (as xml) the "covarianceXX" attribute
         */
        public void xsetCovarianceXX(org.apache.xmlbeans.XmlDouble covarianceXX)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COVARIANCEXX$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(COVARIANCEXX$0);
                }
                target.set(covarianceXX);
            }
        }
        
        /**
         * Unsets the "covarianceXX" attribute
         */
        public void unsetCovarianceXX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COVARIANCEXX$0);
            }
        }
        
        /**
         * Gets the "covarianceXY" attribute
         */
        public double getCovarianceXY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COVARIANCEXY$2);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "covarianceXY" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetCovarianceXY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COVARIANCEXY$2);
                return target;
            }
        }
        
        /**
         * True if has "covarianceXY" attribute
         */
        public boolean isSetCovarianceXY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COVARIANCEXY$2) != null;
            }
        }
        
        /**
         * Sets the "covarianceXY" attribute
         */
        public void setCovarianceXY(double covarianceXY)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COVARIANCEXY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COVARIANCEXY$2);
                }
                target.setDoubleValue(covarianceXY);
            }
        }
        
        /**
         * Sets (as xml) the "covarianceXY" attribute
         */
        public void xsetCovarianceXY(org.apache.xmlbeans.XmlDouble covarianceXY)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COVARIANCEXY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(COVARIANCEXY$2);
                }
                target.set(covarianceXY);
            }
        }
        
        /**
         * Unsets the "covarianceXY" attribute
         */
        public void unsetCovarianceXY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COVARIANCEXY$2);
            }
        }
        
        /**
         * Gets the "covarianceXZ" attribute
         */
        public double getCovarianceXZ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COVARIANCEXZ$4);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "covarianceXZ" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetCovarianceXZ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COVARIANCEXZ$4);
                return target;
            }
        }
        
        /**
         * True if has "covarianceXZ" attribute
         */
        public boolean isSetCovarianceXZ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COVARIANCEXZ$4) != null;
            }
        }
        
        /**
         * Sets the "covarianceXZ" attribute
         */
        public void setCovarianceXZ(double covarianceXZ)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COVARIANCEXZ$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COVARIANCEXZ$4);
                }
                target.setDoubleValue(covarianceXZ);
            }
        }
        
        /**
         * Sets (as xml) the "covarianceXZ" attribute
         */
        public void xsetCovarianceXZ(org.apache.xmlbeans.XmlDouble covarianceXZ)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COVARIANCEXZ$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(COVARIANCEXZ$4);
                }
                target.set(covarianceXZ);
            }
        }
        
        /**
         * Unsets the "covarianceXZ" attribute
         */
        public void unsetCovarianceXZ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COVARIANCEXZ$4);
            }
        }
        
        /**
         * Gets the "covarianceYY" attribute
         */
        public double getCovarianceYY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COVARIANCEYY$6);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "covarianceYY" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetCovarianceYY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COVARIANCEYY$6);
                return target;
            }
        }
        
        /**
         * True if has "covarianceYY" attribute
         */
        public boolean isSetCovarianceYY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COVARIANCEYY$6) != null;
            }
        }
        
        /**
         * Sets the "covarianceYY" attribute
         */
        public void setCovarianceYY(double covarianceYY)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COVARIANCEYY$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COVARIANCEYY$6);
                }
                target.setDoubleValue(covarianceYY);
            }
        }
        
        /**
         * Sets (as xml) the "covarianceYY" attribute
         */
        public void xsetCovarianceYY(org.apache.xmlbeans.XmlDouble covarianceYY)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COVARIANCEYY$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(COVARIANCEYY$6);
                }
                target.set(covarianceYY);
            }
        }
        
        /**
         * Unsets the "covarianceYY" attribute
         */
        public void unsetCovarianceYY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COVARIANCEYY$6);
            }
        }
        
        /**
         * Gets the "covarianceYZ" attribute
         */
        public double getCovarianceYZ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COVARIANCEYZ$8);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "covarianceYZ" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetCovarianceYZ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COVARIANCEYZ$8);
                return target;
            }
        }
        
        /**
         * True if has "covarianceYZ" attribute
         */
        public boolean isSetCovarianceYZ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COVARIANCEYZ$8) != null;
            }
        }
        
        /**
         * Sets the "covarianceYZ" attribute
         */
        public void setCovarianceYZ(double covarianceYZ)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COVARIANCEYZ$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COVARIANCEYZ$8);
                }
                target.setDoubleValue(covarianceYZ);
            }
        }
        
        /**
         * Sets (as xml) the "covarianceYZ" attribute
         */
        public void xsetCovarianceYZ(org.apache.xmlbeans.XmlDouble covarianceYZ)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COVARIANCEYZ$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(COVARIANCEYZ$8);
                }
                target.set(covarianceYZ);
            }
        }
        
        /**
         * Unsets the "covarianceYZ" attribute
         */
        public void unsetCovarianceYZ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COVARIANCEYZ$8);
            }
        }
        
        /**
         * Gets the "covarianceZZ" attribute
         */
        public double getCovarianceZZ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COVARIANCEZZ$10);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "covarianceZZ" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetCovarianceZZ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COVARIANCEZZ$10);
                return target;
            }
        }
        
        /**
         * True if has "covarianceZZ" attribute
         */
        public boolean isSetCovarianceZZ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COVARIANCEZZ$10) != null;
            }
        }
        
        /**
         * Sets the "covarianceZZ" attribute
         */
        public void setCovarianceZZ(double covarianceZZ)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COVARIANCEZZ$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COVARIANCEZZ$10);
                }
                target.setDoubleValue(covarianceZZ);
            }
        }
        
        /**
         * Sets (as xml) the "covarianceZZ" attribute
         */
        public void xsetCovarianceZZ(org.apache.xmlbeans.XmlDouble covarianceZZ)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COVARIANCEZZ$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(COVARIANCEZZ$10);
                }
                target.set(covarianceZZ);
            }
        }
        
        /**
         * Unsets the "covarianceZZ" attribute
         */
        public void unsetCovarianceZZ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COVARIANCEZZ$10);
            }
        }
        
        /**
         * Gets the "GPSSolnType" attribute
         */
        public org.landxml.schema.landXML11.GPSSolutionTypeEnum.Enum getGPSSolnType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GPSSOLNTYPE$12);
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
                target = (org.landxml.schema.landXML11.GPSSolutionTypeEnum)get_store().find_attribute_user(GPSSOLNTYPE$12);
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
                return get_store().find_attribute_user(GPSSOLNTYPE$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GPSSOLNTYPE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GPSSOLNTYPE$12);
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
                target = (org.landxml.schema.landXML11.GPSSolutionTypeEnum)get_store().find_attribute_user(GPSSOLNTYPE$12);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.GPSSolutionTypeEnum)get_store().add_attribute_user(GPSSOLNTYPE$12);
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
                get_store().remove_attribute(GPSSOLNTYPE$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GPSSOLNFREQ$14);
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
                target = (org.landxml.schema.landXML11.GPSSolutionFrequencyEnum)get_store().find_attribute_user(GPSSOLNFREQ$14);
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
                return get_store().find_attribute_user(GPSSOLNFREQ$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GPSSOLNFREQ$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GPSSOLNFREQ$14);
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
                target = (org.landxml.schema.landXML11.GPSSolutionFrequencyEnum)get_store().find_attribute_user(GPSSOLNFREQ$14);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.GPSSolutionFrequencyEnum)get_store().add_attribute_user(GPSSOLNFREQ$14);
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
                get_store().remove_attribute(GPSSOLNFREQ$14);
            }
        }
        
        /**
         * Gets the "RMS" attribute
         */
        public double getRMS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RMS$16);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "RMS" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetRMS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RMS$16);
                return target;
            }
        }
        
        /**
         * True if has "RMS" attribute
         */
        public boolean isSetRMS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RMS$16) != null;
            }
        }
        
        /**
         * Sets the "RMS" attribute
         */
        public void setRMS(double rms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RMS$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RMS$16);
                }
                target.setDoubleValue(rms);
            }
        }
        
        /**
         * Sets (as xml) the "RMS" attribute
         */
        public void xsetRMS(org.apache.xmlbeans.XmlDouble rms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RMS$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RMS$16);
                }
                target.set(rms);
            }
        }
        
        /**
         * Unsets the "RMS" attribute
         */
        public void unsetRMS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RMS$16);
            }
        }
        
        /**
         * Gets the "ratio" attribute
         */
        public double getRatio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATIO$18);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "ratio" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetRatio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RATIO$18);
                return target;
            }
        }
        
        /**
         * True if has "ratio" attribute
         */
        public boolean isSetRatio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RATIO$18) != null;
            }
        }
        
        /**
         * Sets the "ratio" attribute
         */
        public void setRatio(double ratio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATIO$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RATIO$18);
                }
                target.setDoubleValue(ratio);
            }
        }
        
        /**
         * Sets (as xml) the "ratio" attribute
         */
        public void xsetRatio(org.apache.xmlbeans.XmlDouble ratio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RATIO$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RATIO$18);
                }
                target.set(ratio);
            }
        }
        
        /**
         * Unsets the "ratio" attribute
         */
        public void unsetRatio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RATIO$18);
            }
        }
        
        /**
         * Gets the "referenceVariance" attribute
         */
        public double getReferenceVariance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFERENCEVARIANCE$20);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "referenceVariance" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetReferenceVariance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(REFERENCEVARIANCE$20);
                return target;
            }
        }
        
        /**
         * True if has "referenceVariance" attribute
         */
        public boolean isSetReferenceVariance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REFERENCEVARIANCE$20) != null;
            }
        }
        
        /**
         * Sets the "referenceVariance" attribute
         */
        public void setReferenceVariance(double referenceVariance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFERENCEVARIANCE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFERENCEVARIANCE$20);
                }
                target.setDoubleValue(referenceVariance);
            }
        }
        
        /**
         * Sets (as xml) the "referenceVariance" attribute
         */
        public void xsetReferenceVariance(org.apache.xmlbeans.XmlDouble referenceVariance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(REFERENCEVARIANCE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(REFERENCEVARIANCE$20);
                }
                target.set(referenceVariance);
            }
        }
        
        /**
         * Unsets the "referenceVariance" attribute
         */
        public void unsetReferenceVariance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REFERENCEVARIANCE$20);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NBRSATELLITES$22);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NBRSATELLITES$22);
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
                return get_store().find_attribute_user(NBRSATELLITES$22) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NBRSATELLITES$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NBRSATELLITES$22);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NBRSATELLITES$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(NBRSATELLITES$22);
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
                get_store().remove_attribute(NBRSATELLITES$22);
            }
        }
        
        /**
         * Gets the "startTime" attribute
         */
        public double getStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTTIME$24);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "startTime" attribute
         */
        public org.landxml.schema.landXML11.GPSTime xgetStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSTime target = null;
                target = (org.landxml.schema.landXML11.GPSTime)get_store().find_attribute_user(STARTTIME$24);
                return target;
            }
        }
        
        /**
         * True if has "startTime" attribute
         */
        public boolean isSetStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STARTTIME$24) != null;
            }
        }
        
        /**
         * Sets the "startTime" attribute
         */
        public void setStartTime(double startTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTTIME$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTTIME$24);
                }
                target.setDoubleValue(startTime);
            }
        }
        
        /**
         * Sets (as xml) the "startTime" attribute
         */
        public void xsetStartTime(org.landxml.schema.landXML11.GPSTime startTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSTime target = null;
                target = (org.landxml.schema.landXML11.GPSTime)get_store().find_attribute_user(STARTTIME$24);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.GPSTime)get_store().add_attribute_user(STARTTIME$24);
                }
                target.set(startTime);
            }
        }
        
        /**
         * Unsets the "startTime" attribute
         */
        public void unsetStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STARTTIME$24);
            }
        }
        
        /**
         * Gets the "stopTime" attribute
         */
        public double getStopTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STOPTIME$26);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "stopTime" attribute
         */
        public org.landxml.schema.landXML11.GPSTime xgetStopTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSTime target = null;
                target = (org.landxml.schema.landXML11.GPSTime)get_store().find_attribute_user(STOPTIME$26);
                return target;
            }
        }
        
        /**
         * True if has "stopTime" attribute
         */
        public boolean isSetStopTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STOPTIME$26) != null;
            }
        }
        
        /**
         * Sets the "stopTime" attribute
         */
        public void setStopTime(double stopTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STOPTIME$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STOPTIME$26);
                }
                target.setDoubleValue(stopTime);
            }
        }
        
        /**
         * Sets (as xml) the "stopTime" attribute
         */
        public void xsetStopTime(org.landxml.schema.landXML11.GPSTime stopTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GPSTime target = null;
                target = (org.landxml.schema.landXML11.GPSTime)get_store().find_attribute_user(STOPTIME$26);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.GPSTime)get_store().add_attribute_user(STOPTIME$26);
                }
                target.set(stopTime);
            }
        }
        
        /**
         * Unsets the "stopTime" attribute
         */
        public void unsetStopTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STOPTIME$26);
            }
        }
    }
}
