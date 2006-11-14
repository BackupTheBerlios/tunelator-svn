/*
 * An XML document type.
 * Localname: CantStation
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.CantStationDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one CantStation(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class CantStationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CantStationDocument
{
    
    public CantStationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANTSTATION$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CantStation");
    
    
    /**
     * Gets the "CantStation" element
     */
    public org.landxml.schema.landXML11.CantStationDocument.CantStation getCantStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CantStationDocument.CantStation target = null;
            target = (org.landxml.schema.landXML11.CantStationDocument.CantStation)get_store().find_element_user(CANTSTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CantStation" element
     */
    public void setCantStation(org.landxml.schema.landXML11.CantStationDocument.CantStation cantStation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CantStationDocument.CantStation target = null;
            target = (org.landxml.schema.landXML11.CantStationDocument.CantStation)get_store().find_element_user(CANTSTATION$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.CantStationDocument.CantStation)get_store().add_element_user(CANTSTATION$0);
            }
            target.set(cantStation);
        }
    }
    
    /**
     * Appends and returns a new empty "CantStation" element
     */
    public org.landxml.schema.landXML11.CantStationDocument.CantStation addNewCantStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.CantStationDocument.CantStation target = null;
            target = (org.landxml.schema.landXML11.CantStationDocument.CantStation)get_store().add_element_user(CANTSTATION$0);
            return target;
        }
    }
    /**
     * An XML CantStation(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class CantStationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.CantStationDocument.CantStation
    {
        
        public CantStationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATION$0 = 
            new javax.xml.namespace.QName("", "station");
        private static final javax.xml.namespace.QName EQUILIBRIUMCANT$2 = 
            new javax.xml.namespace.QName("", "equilibriumCant");
        private static final javax.xml.namespace.QName APPLIEDCANT$4 = 
            new javax.xml.namespace.QName("", "appliedCant");
        private static final javax.xml.namespace.QName CANTDEFICIENCY$6 = 
            new javax.xml.namespace.QName("", "cantDeficiency");
        private static final javax.xml.namespace.QName CANTEXCESS$8 = 
            new javax.xml.namespace.QName("", "cantExcess");
        private static final javax.xml.namespace.QName RATEOFCHANGEOFAPPLIEDCANTOVERTIME$10 = 
            new javax.xml.namespace.QName("", "rateOfChangeOfAppliedCantOverTime");
        private static final javax.xml.namespace.QName RATEOFCHANGEOFAPPLIEDCANTOVERLENGTH$12 = 
            new javax.xml.namespace.QName("", "rateOfChangeOfAppliedCantOverLength");
        private static final javax.xml.namespace.QName RATEOFCHANGEOFCANTDEFICIENCYOVERTIME$14 = 
            new javax.xml.namespace.QName("", "rateOfChangeOfCantDeficiencyOverTime");
        private static final javax.xml.namespace.QName CANTGRADIENT$16 = 
            new javax.xml.namespace.QName("", "cantGradient");
        private static final javax.xml.namespace.QName SPEED$18 = 
            new javax.xml.namespace.QName("", "speed");
        private static final javax.xml.namespace.QName TRANSITIONTYPE$20 = 
            new javax.xml.namespace.QName("", "transitionType");
        private static final javax.xml.namespace.QName CURVATURE$22 = 
            new javax.xml.namespace.QName("", "curvature");
        private static final javax.xml.namespace.QName ADVERSE$24 = 
            new javax.xml.namespace.QName("", "adverse");
        
        
        /**
         * Gets the "station" attribute
         */
        public double getStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATION$0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "station" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STATION$0);
                return target;
            }
        }
        
        /**
         * Sets the "station" attribute
         */
        public void setStation(double station)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATION$0);
                }
                target.setDoubleValue(station);
            }
        }
        
        /**
         * Sets (as xml) the "station" attribute
         */
        public void xsetStation(org.apache.xmlbeans.XmlDouble station)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STATION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(STATION$0);
                }
                target.set(station);
            }
        }
        
        /**
         * Gets the "equilibriumCant" attribute
         */
        public double getEquilibriumCant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EQUILIBRIUMCANT$2);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "equilibriumCant" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetEquilibriumCant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EQUILIBRIUMCANT$2);
                return target;
            }
        }
        
        /**
         * True if has "equilibriumCant" attribute
         */
        public boolean isSetEquilibriumCant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EQUILIBRIUMCANT$2) != null;
            }
        }
        
        /**
         * Sets the "equilibriumCant" attribute
         */
        public void setEquilibriumCant(double equilibriumCant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EQUILIBRIUMCANT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EQUILIBRIUMCANT$2);
                }
                target.setDoubleValue(equilibriumCant);
            }
        }
        
        /**
         * Sets (as xml) the "equilibriumCant" attribute
         */
        public void xsetEquilibriumCant(org.apache.xmlbeans.XmlDouble equilibriumCant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EQUILIBRIUMCANT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EQUILIBRIUMCANT$2);
                }
                target.set(equilibriumCant);
            }
        }
        
        /**
         * Unsets the "equilibriumCant" attribute
         */
        public void unsetEquilibriumCant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EQUILIBRIUMCANT$2);
            }
        }
        
        /**
         * Gets the "appliedCant" attribute
         */
        public double getAppliedCant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLIEDCANT$4);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "appliedCant" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetAppliedCant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(APPLIEDCANT$4);
                return target;
            }
        }
        
        /**
         * Sets the "appliedCant" attribute
         */
        public void setAppliedCant(double appliedCant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLIEDCANT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLIEDCANT$4);
                }
                target.setDoubleValue(appliedCant);
            }
        }
        
        /**
         * Sets (as xml) the "appliedCant" attribute
         */
        public void xsetAppliedCant(org.apache.xmlbeans.XmlDouble appliedCant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(APPLIEDCANT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(APPLIEDCANT$4);
                }
                target.set(appliedCant);
            }
        }
        
        /**
         * Gets the "cantDeficiency" attribute
         */
        public double getCantDeficiency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CANTDEFICIENCY$6);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "cantDeficiency" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetCantDeficiency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CANTDEFICIENCY$6);
                return target;
            }
        }
        
        /**
         * True if has "cantDeficiency" attribute
         */
        public boolean isSetCantDeficiency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CANTDEFICIENCY$6) != null;
            }
        }
        
        /**
         * Sets the "cantDeficiency" attribute
         */
        public void setCantDeficiency(double cantDeficiency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CANTDEFICIENCY$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CANTDEFICIENCY$6);
                }
                target.setDoubleValue(cantDeficiency);
            }
        }
        
        /**
         * Sets (as xml) the "cantDeficiency" attribute
         */
        public void xsetCantDeficiency(org.apache.xmlbeans.XmlDouble cantDeficiency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CANTDEFICIENCY$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CANTDEFICIENCY$6);
                }
                target.set(cantDeficiency);
            }
        }
        
        /**
         * Unsets the "cantDeficiency" attribute
         */
        public void unsetCantDeficiency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CANTDEFICIENCY$6);
            }
        }
        
        /**
         * Gets the "cantExcess" attribute
         */
        public double getCantExcess()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CANTEXCESS$8);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "cantExcess" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetCantExcess()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CANTEXCESS$8);
                return target;
            }
        }
        
        /**
         * True if has "cantExcess" attribute
         */
        public boolean isSetCantExcess()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CANTEXCESS$8) != null;
            }
        }
        
        /**
         * Sets the "cantExcess" attribute
         */
        public void setCantExcess(double cantExcess)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CANTEXCESS$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CANTEXCESS$8);
                }
                target.setDoubleValue(cantExcess);
            }
        }
        
        /**
         * Sets (as xml) the "cantExcess" attribute
         */
        public void xsetCantExcess(org.apache.xmlbeans.XmlDouble cantExcess)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CANTEXCESS$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CANTEXCESS$8);
                }
                target.set(cantExcess);
            }
        }
        
        /**
         * Unsets the "cantExcess" attribute
         */
        public void unsetCantExcess()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CANTEXCESS$8);
            }
        }
        
        /**
         * Gets the "rateOfChangeOfAppliedCantOverTime" attribute
         */
        public double getRateOfChangeOfAppliedCantOverTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATEOFCHANGEOFAPPLIEDCANTOVERTIME$10);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "rateOfChangeOfAppliedCantOverTime" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetRateOfChangeOfAppliedCantOverTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RATEOFCHANGEOFAPPLIEDCANTOVERTIME$10);
                return target;
            }
        }
        
        /**
         * True if has "rateOfChangeOfAppliedCantOverTime" attribute
         */
        public boolean isSetRateOfChangeOfAppliedCantOverTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RATEOFCHANGEOFAPPLIEDCANTOVERTIME$10) != null;
            }
        }
        
        /**
         * Sets the "rateOfChangeOfAppliedCantOverTime" attribute
         */
        public void setRateOfChangeOfAppliedCantOverTime(double rateOfChangeOfAppliedCantOverTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATEOFCHANGEOFAPPLIEDCANTOVERTIME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RATEOFCHANGEOFAPPLIEDCANTOVERTIME$10);
                }
                target.setDoubleValue(rateOfChangeOfAppliedCantOverTime);
            }
        }
        
        /**
         * Sets (as xml) the "rateOfChangeOfAppliedCantOverTime" attribute
         */
        public void xsetRateOfChangeOfAppliedCantOverTime(org.apache.xmlbeans.XmlDouble rateOfChangeOfAppliedCantOverTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RATEOFCHANGEOFAPPLIEDCANTOVERTIME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RATEOFCHANGEOFAPPLIEDCANTOVERTIME$10);
                }
                target.set(rateOfChangeOfAppliedCantOverTime);
            }
        }
        
        /**
         * Unsets the "rateOfChangeOfAppliedCantOverTime" attribute
         */
        public void unsetRateOfChangeOfAppliedCantOverTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RATEOFCHANGEOFAPPLIEDCANTOVERTIME$10);
            }
        }
        
        /**
         * Gets the "rateOfChangeOfAppliedCantOverLength" attribute
         */
        public double getRateOfChangeOfAppliedCantOverLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATEOFCHANGEOFAPPLIEDCANTOVERLENGTH$12);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "rateOfChangeOfAppliedCantOverLength" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetRateOfChangeOfAppliedCantOverLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RATEOFCHANGEOFAPPLIEDCANTOVERLENGTH$12);
                return target;
            }
        }
        
        /**
         * True if has "rateOfChangeOfAppliedCantOverLength" attribute
         */
        public boolean isSetRateOfChangeOfAppliedCantOverLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RATEOFCHANGEOFAPPLIEDCANTOVERLENGTH$12) != null;
            }
        }
        
        /**
         * Sets the "rateOfChangeOfAppliedCantOverLength" attribute
         */
        public void setRateOfChangeOfAppliedCantOverLength(double rateOfChangeOfAppliedCantOverLength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATEOFCHANGEOFAPPLIEDCANTOVERLENGTH$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RATEOFCHANGEOFAPPLIEDCANTOVERLENGTH$12);
                }
                target.setDoubleValue(rateOfChangeOfAppliedCantOverLength);
            }
        }
        
        /**
         * Sets (as xml) the "rateOfChangeOfAppliedCantOverLength" attribute
         */
        public void xsetRateOfChangeOfAppliedCantOverLength(org.apache.xmlbeans.XmlDouble rateOfChangeOfAppliedCantOverLength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RATEOFCHANGEOFAPPLIEDCANTOVERLENGTH$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RATEOFCHANGEOFAPPLIEDCANTOVERLENGTH$12);
                }
                target.set(rateOfChangeOfAppliedCantOverLength);
            }
        }
        
        /**
         * Unsets the "rateOfChangeOfAppliedCantOverLength" attribute
         */
        public void unsetRateOfChangeOfAppliedCantOverLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RATEOFCHANGEOFAPPLIEDCANTOVERLENGTH$12);
            }
        }
        
        /**
         * Gets the "rateOfChangeOfCantDeficiencyOverTime" attribute
         */
        public double getRateOfChangeOfCantDeficiencyOverTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATEOFCHANGEOFCANTDEFICIENCYOVERTIME$14);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "rateOfChangeOfCantDeficiencyOverTime" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetRateOfChangeOfCantDeficiencyOverTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RATEOFCHANGEOFCANTDEFICIENCYOVERTIME$14);
                return target;
            }
        }
        
        /**
         * True if has "rateOfChangeOfCantDeficiencyOverTime" attribute
         */
        public boolean isSetRateOfChangeOfCantDeficiencyOverTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RATEOFCHANGEOFCANTDEFICIENCYOVERTIME$14) != null;
            }
        }
        
        /**
         * Sets the "rateOfChangeOfCantDeficiencyOverTime" attribute
         */
        public void setRateOfChangeOfCantDeficiencyOverTime(double rateOfChangeOfCantDeficiencyOverTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATEOFCHANGEOFCANTDEFICIENCYOVERTIME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RATEOFCHANGEOFCANTDEFICIENCYOVERTIME$14);
                }
                target.setDoubleValue(rateOfChangeOfCantDeficiencyOverTime);
            }
        }
        
        /**
         * Sets (as xml) the "rateOfChangeOfCantDeficiencyOverTime" attribute
         */
        public void xsetRateOfChangeOfCantDeficiencyOverTime(org.apache.xmlbeans.XmlDouble rateOfChangeOfCantDeficiencyOverTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RATEOFCHANGEOFCANTDEFICIENCYOVERTIME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RATEOFCHANGEOFCANTDEFICIENCYOVERTIME$14);
                }
                target.set(rateOfChangeOfCantDeficiencyOverTime);
            }
        }
        
        /**
         * Unsets the "rateOfChangeOfCantDeficiencyOverTime" attribute
         */
        public void unsetRateOfChangeOfCantDeficiencyOverTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RATEOFCHANGEOFCANTDEFICIENCYOVERTIME$14);
            }
        }
        
        /**
         * Gets the "cantGradient" attribute
         */
        public double getCantGradient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CANTGRADIENT$16);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "cantGradient" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetCantGradient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CANTGRADIENT$16);
                return target;
            }
        }
        
        /**
         * True if has "cantGradient" attribute
         */
        public boolean isSetCantGradient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CANTGRADIENT$16) != null;
            }
        }
        
        /**
         * Sets the "cantGradient" attribute
         */
        public void setCantGradient(double cantGradient)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CANTGRADIENT$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CANTGRADIENT$16);
                }
                target.setDoubleValue(cantGradient);
            }
        }
        
        /**
         * Sets (as xml) the "cantGradient" attribute
         */
        public void xsetCantGradient(org.apache.xmlbeans.XmlDouble cantGradient)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CANTGRADIENT$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CANTGRADIENT$16);
                }
                target.set(cantGradient);
            }
        }
        
        /**
         * Unsets the "cantGradient" attribute
         */
        public void unsetCantGradient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CANTGRADIENT$16);
            }
        }
        
        /**
         * Gets the "speed" attribute
         */
        public double getSpeed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPEED$18);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "speed" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSpeed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SPEED$18);
                return target;
            }
        }
        
        /**
         * True if has "speed" attribute
         */
        public boolean isSetSpeed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SPEED$18) != null;
            }
        }
        
        /**
         * Sets the "speed" attribute
         */
        public void setSpeed(double speed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPEED$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPEED$18);
                }
                target.setDoubleValue(speed);
            }
        }
        
        /**
         * Sets (as xml) the "speed" attribute
         */
        public void xsetSpeed(org.apache.xmlbeans.XmlDouble speed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SPEED$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SPEED$18);
                }
                target.set(speed);
            }
        }
        
        /**
         * Unsets the "speed" attribute
         */
        public void unsetSpeed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SPEED$18);
            }
        }
        
        /**
         * Gets the "transitionType" attribute
         */
        public org.landxml.schema.landXML11.SpiralType.Enum getTransitionType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSITIONTYPE$20);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.SpiralType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "transitionType" attribute
         */
        public org.landxml.schema.landXML11.SpiralType xgetTransitionType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SpiralType target = null;
                target = (org.landxml.schema.landXML11.SpiralType)get_store().find_attribute_user(TRANSITIONTYPE$20);
                return target;
            }
        }
        
        /**
         * True if has "transitionType" attribute
         */
        public boolean isSetTransitionType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TRANSITIONTYPE$20) != null;
            }
        }
        
        /**
         * Sets the "transitionType" attribute
         */
        public void setTransitionType(org.landxml.schema.landXML11.SpiralType.Enum transitionType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSITIONTYPE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRANSITIONTYPE$20);
                }
                target.setEnumValue(transitionType);
            }
        }
        
        /**
         * Sets (as xml) the "transitionType" attribute
         */
        public void xsetTransitionType(org.landxml.schema.landXML11.SpiralType transitionType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SpiralType target = null;
                target = (org.landxml.schema.landXML11.SpiralType)get_store().find_attribute_user(TRANSITIONTYPE$20);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.SpiralType)get_store().add_attribute_user(TRANSITIONTYPE$20);
                }
                target.set(transitionType);
            }
        }
        
        /**
         * Unsets the "transitionType" attribute
         */
        public void unsetTransitionType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TRANSITIONTYPE$20);
            }
        }
        
        /**
         * Gets the "curvature" attribute
         */
        public org.landxml.schema.landXML11.Clockwise.Enum getCurvature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURVATURE$22);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.Clockwise.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "curvature" attribute
         */
        public org.landxml.schema.landXML11.Clockwise xgetCurvature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Clockwise target = null;
                target = (org.landxml.schema.landXML11.Clockwise)get_store().find_attribute_user(CURVATURE$22);
                return target;
            }
        }
        
        /**
         * Sets the "curvature" attribute
         */
        public void setCurvature(org.landxml.schema.landXML11.Clockwise.Enum curvature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURVATURE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CURVATURE$22);
                }
                target.setEnumValue(curvature);
            }
        }
        
        /**
         * Sets (as xml) the "curvature" attribute
         */
        public void xsetCurvature(org.landxml.schema.landXML11.Clockwise curvature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.Clockwise target = null;
                target = (org.landxml.schema.landXML11.Clockwise)get_store().find_attribute_user(CURVATURE$22);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.Clockwise)get_store().add_attribute_user(CURVATURE$22);
                }
                target.set(curvature);
            }
        }
        
        /**
         * Gets the "adverse" attribute
         */
        public boolean getAdverse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADVERSE$24);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "adverse" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetAdverse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADVERSE$24);
                return target;
            }
        }
        
        /**
         * True if has "adverse" attribute
         */
        public boolean isSetAdverse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ADVERSE$24) != null;
            }
        }
        
        /**
         * Sets the "adverse" attribute
         */
        public void setAdverse(boolean adverse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADVERSE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADVERSE$24);
                }
                target.setBooleanValue(adverse);
            }
        }
        
        /**
         * Sets (as xml) the "adverse" attribute
         */
        public void xsetAdverse(org.apache.xmlbeans.XmlBoolean adverse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADVERSE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ADVERSE$24);
                }
                target.set(adverse);
            }
        }
        
        /**
         * Unsets the "adverse" attribute
         */
        public void unsetAdverse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ADVERSE$24);
            }
        }
    }
}
