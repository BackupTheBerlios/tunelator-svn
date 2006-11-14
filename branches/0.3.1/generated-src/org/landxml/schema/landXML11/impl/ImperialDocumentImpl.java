/*
 * An XML document type.
 * Localname: Imperial
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.ImperialDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Imperial(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class ImperialDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ImperialDocument
{
    
    public ImperialDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPERIAL$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Imperial");
    
    
    /**
     * Gets the "Imperial" element
     */
    public org.landxml.schema.landXML11.ImperialDocument.Imperial getImperial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ImperialDocument.Imperial target = null;
            target = (org.landxml.schema.landXML11.ImperialDocument.Imperial)get_store().find_element_user(IMPERIAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Imperial" element
     */
    public void setImperial(org.landxml.schema.landXML11.ImperialDocument.Imperial imperial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ImperialDocument.Imperial target = null;
            target = (org.landxml.schema.landXML11.ImperialDocument.Imperial)get_store().find_element_user(IMPERIAL$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.ImperialDocument.Imperial)get_store().add_element_user(IMPERIAL$0);
            }
            target.set(imperial);
        }
    }
    
    /**
     * Appends and returns a new empty "Imperial" element
     */
    public org.landxml.schema.landXML11.ImperialDocument.Imperial addNewImperial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.ImperialDocument.Imperial target = null;
            target = (org.landxml.schema.landXML11.ImperialDocument.Imperial)get_store().add_element_user(IMPERIAL$0);
            return target;
        }
    }
    /**
     * An XML Imperial(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class ImperialImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.ImperialDocument.Imperial
    {
        
        public ImperialImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AREAUNIT$0 = 
            new javax.xml.namespace.QName("", "areaUnit");
        private static final javax.xml.namespace.QName LINEARUNIT$2 = 
            new javax.xml.namespace.QName("", "linearUnit");
        private static final javax.xml.namespace.QName VOLUMEUNIT$4 = 
            new javax.xml.namespace.QName("", "volumeUnit");
        private static final javax.xml.namespace.QName TEMPERATUREUNIT$6 = 
            new javax.xml.namespace.QName("", "temperatureUnit");
        private static final javax.xml.namespace.QName PRESSUREUNIT$8 = 
            new javax.xml.namespace.QName("", "pressureUnit");
        private static final javax.xml.namespace.QName DIAMETERUNIT$10 = 
            new javax.xml.namespace.QName("", "diameterUnit");
        private static final javax.xml.namespace.QName WIDTHUNIT$12 = 
            new javax.xml.namespace.QName("", "widthUnit");
        private static final javax.xml.namespace.QName HEIGHTUNIT$14 = 
            new javax.xml.namespace.QName("", "heightUnit");
        private static final javax.xml.namespace.QName VELOCITYUNIT$16 = 
            new javax.xml.namespace.QName("", "velocityUnit");
        private static final javax.xml.namespace.QName FLOWUNIT$18 = 
            new javax.xml.namespace.QName("", "flowUnit");
        private static final javax.xml.namespace.QName ANGULARUNIT$20 = 
            new javax.xml.namespace.QName("", "angularUnit");
        private static final javax.xml.namespace.QName DIRECTIONUNIT$22 = 
            new javax.xml.namespace.QName("", "directionUnit");
        private static final javax.xml.namespace.QName LATLONGANGULARUNIT$24 = 
            new javax.xml.namespace.QName("", "latLongAngularUnit");
        private static final javax.xml.namespace.QName ELEVATIONUNIT$26 = 
            new javax.xml.namespace.QName("", "elevationUnit");
        
        
        /**
         * Gets the "areaUnit" attribute
         */
        public org.landxml.schema.landXML11.ImpArea.Enum getAreaUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREAUNIT$0);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ImpArea.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "areaUnit" attribute
         */
        public org.landxml.schema.landXML11.ImpArea xgetAreaUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImpArea target = null;
                target = (org.landxml.schema.landXML11.ImpArea)get_store().find_attribute_user(AREAUNIT$0);
                return target;
            }
        }
        
        /**
         * Sets the "areaUnit" attribute
         */
        public void setAreaUnit(org.landxml.schema.landXML11.ImpArea.Enum areaUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREAUNIT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AREAUNIT$0);
                }
                target.setEnumValue(areaUnit);
            }
        }
        
        /**
         * Sets (as xml) the "areaUnit" attribute
         */
        public void xsetAreaUnit(org.landxml.schema.landXML11.ImpArea areaUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImpArea target = null;
                target = (org.landxml.schema.landXML11.ImpArea)get_store().find_attribute_user(AREAUNIT$0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ImpArea)get_store().add_attribute_user(AREAUNIT$0);
                }
                target.set(areaUnit);
            }
        }
        
        /**
         * Gets the "linearUnit" attribute
         */
        public org.landxml.schema.landXML11.ImpLinear.Enum getLinearUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINEARUNIT$2);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ImpLinear.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "linearUnit" attribute
         */
        public org.landxml.schema.landXML11.ImpLinear xgetLinearUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImpLinear target = null;
                target = (org.landxml.schema.landXML11.ImpLinear)get_store().find_attribute_user(LINEARUNIT$2);
                return target;
            }
        }
        
        /**
         * Sets the "linearUnit" attribute
         */
        public void setLinearUnit(org.landxml.schema.landXML11.ImpLinear.Enum linearUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINEARUNIT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINEARUNIT$2);
                }
                target.setEnumValue(linearUnit);
            }
        }
        
        /**
         * Sets (as xml) the "linearUnit" attribute
         */
        public void xsetLinearUnit(org.landxml.schema.landXML11.ImpLinear linearUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImpLinear target = null;
                target = (org.landxml.schema.landXML11.ImpLinear)get_store().find_attribute_user(LINEARUNIT$2);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ImpLinear)get_store().add_attribute_user(LINEARUNIT$2);
                }
                target.set(linearUnit);
            }
        }
        
        /**
         * Gets the "volumeUnit" attribute
         */
        public org.landxml.schema.landXML11.ImpVolume.Enum getVolumeUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VOLUMEUNIT$4);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ImpVolume.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "volumeUnit" attribute
         */
        public org.landxml.schema.landXML11.ImpVolume xgetVolumeUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImpVolume target = null;
                target = (org.landxml.schema.landXML11.ImpVolume)get_store().find_attribute_user(VOLUMEUNIT$4);
                return target;
            }
        }
        
        /**
         * Sets the "volumeUnit" attribute
         */
        public void setVolumeUnit(org.landxml.schema.landXML11.ImpVolume.Enum volumeUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VOLUMEUNIT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VOLUMEUNIT$4);
                }
                target.setEnumValue(volumeUnit);
            }
        }
        
        /**
         * Sets (as xml) the "volumeUnit" attribute
         */
        public void xsetVolumeUnit(org.landxml.schema.landXML11.ImpVolume volumeUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImpVolume target = null;
                target = (org.landxml.schema.landXML11.ImpVolume)get_store().find_attribute_user(VOLUMEUNIT$4);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ImpVolume)get_store().add_attribute_user(VOLUMEUNIT$4);
                }
                target.set(volumeUnit);
            }
        }
        
        /**
         * Gets the "temperatureUnit" attribute
         */
        public org.landxml.schema.landXML11.ImpTemperature.Enum getTemperatureUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEMPERATUREUNIT$6);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ImpTemperature.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "temperatureUnit" attribute
         */
        public org.landxml.schema.landXML11.ImpTemperature xgetTemperatureUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImpTemperature target = null;
                target = (org.landxml.schema.landXML11.ImpTemperature)get_store().find_attribute_user(TEMPERATUREUNIT$6);
                return target;
            }
        }
        
        /**
         * Sets the "temperatureUnit" attribute
         */
        public void setTemperatureUnit(org.landxml.schema.landXML11.ImpTemperature.Enum temperatureUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEMPERATUREUNIT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEMPERATUREUNIT$6);
                }
                target.setEnumValue(temperatureUnit);
            }
        }
        
        /**
         * Sets (as xml) the "temperatureUnit" attribute
         */
        public void xsetTemperatureUnit(org.landxml.schema.landXML11.ImpTemperature temperatureUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImpTemperature target = null;
                target = (org.landxml.schema.landXML11.ImpTemperature)get_store().find_attribute_user(TEMPERATUREUNIT$6);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ImpTemperature)get_store().add_attribute_user(TEMPERATUREUNIT$6);
                }
                target.set(temperatureUnit);
            }
        }
        
        /**
         * Gets the "pressureUnit" attribute
         */
        public org.landxml.schema.landXML11.ImpPressure.Enum getPressureUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESSUREUNIT$8);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ImpPressure.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "pressureUnit" attribute
         */
        public org.landxml.schema.landXML11.ImpPressure xgetPressureUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImpPressure target = null;
                target = (org.landxml.schema.landXML11.ImpPressure)get_store().find_attribute_user(PRESSUREUNIT$8);
                return target;
            }
        }
        
        /**
         * Sets the "pressureUnit" attribute
         */
        public void setPressureUnit(org.landxml.schema.landXML11.ImpPressure.Enum pressureUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESSUREUNIT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRESSUREUNIT$8);
                }
                target.setEnumValue(pressureUnit);
            }
        }
        
        /**
         * Sets (as xml) the "pressureUnit" attribute
         */
        public void xsetPressureUnit(org.landxml.schema.landXML11.ImpPressure pressureUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImpPressure target = null;
                target = (org.landxml.schema.landXML11.ImpPressure)get_store().find_attribute_user(PRESSUREUNIT$8);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ImpPressure)get_store().add_attribute_user(PRESSUREUNIT$8);
                }
                target.set(pressureUnit);
            }
        }
        
        /**
         * Gets the "diameterUnit" attribute
         */
        public org.landxml.schema.landXML11.ImpDiameter.Enum getDiameterUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIAMETERUNIT$10);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ImpDiameter.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "diameterUnit" attribute
         */
        public org.landxml.schema.landXML11.ImpDiameter xgetDiameterUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImpDiameter target = null;
                target = (org.landxml.schema.landXML11.ImpDiameter)get_store().find_attribute_user(DIAMETERUNIT$10);
                return target;
            }
        }
        
        /**
         * True if has "diameterUnit" attribute
         */
        public boolean isSetDiameterUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DIAMETERUNIT$10) != null;
            }
        }
        
        /**
         * Sets the "diameterUnit" attribute
         */
        public void setDiameterUnit(org.landxml.schema.landXML11.ImpDiameter.Enum diameterUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIAMETERUNIT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIAMETERUNIT$10);
                }
                target.setEnumValue(diameterUnit);
            }
        }
        
        /**
         * Sets (as xml) the "diameterUnit" attribute
         */
        public void xsetDiameterUnit(org.landxml.schema.landXML11.ImpDiameter diameterUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImpDiameter target = null;
                target = (org.landxml.schema.landXML11.ImpDiameter)get_store().find_attribute_user(DIAMETERUNIT$10);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ImpDiameter)get_store().add_attribute_user(DIAMETERUNIT$10);
                }
                target.set(diameterUnit);
            }
        }
        
        /**
         * Unsets the "diameterUnit" attribute
         */
        public void unsetDiameterUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DIAMETERUNIT$10);
            }
        }
        
        /**
         * Gets the "widthUnit" attribute
         */
        public org.landxml.schema.landXML11.ImpWidth.Enum getWidthUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTHUNIT$12);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ImpWidth.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "widthUnit" attribute
         */
        public org.landxml.schema.landXML11.ImpWidth xgetWidthUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImpWidth target = null;
                target = (org.landxml.schema.landXML11.ImpWidth)get_store().find_attribute_user(WIDTHUNIT$12);
                return target;
            }
        }
        
        /**
         * True if has "widthUnit" attribute
         */
        public boolean isSetWidthUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(WIDTHUNIT$12) != null;
            }
        }
        
        /**
         * Sets the "widthUnit" attribute
         */
        public void setWidthUnit(org.landxml.schema.landXML11.ImpWidth.Enum widthUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTHUNIT$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WIDTHUNIT$12);
                }
                target.setEnumValue(widthUnit);
            }
        }
        
        /**
         * Sets (as xml) the "widthUnit" attribute
         */
        public void xsetWidthUnit(org.landxml.schema.landXML11.ImpWidth widthUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImpWidth target = null;
                target = (org.landxml.schema.landXML11.ImpWidth)get_store().find_attribute_user(WIDTHUNIT$12);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ImpWidth)get_store().add_attribute_user(WIDTHUNIT$12);
                }
                target.set(widthUnit);
            }
        }
        
        /**
         * Unsets the "widthUnit" attribute
         */
        public void unsetWidthUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(WIDTHUNIT$12);
            }
        }
        
        /**
         * Gets the "heightUnit" attribute
         */
        public org.landxml.schema.landXML11.ImpHeight.Enum getHeightUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEIGHTUNIT$14);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ImpHeight.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "heightUnit" attribute
         */
        public org.landxml.schema.landXML11.ImpHeight xgetHeightUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImpHeight target = null;
                target = (org.landxml.schema.landXML11.ImpHeight)get_store().find_attribute_user(HEIGHTUNIT$14);
                return target;
            }
        }
        
        /**
         * True if has "heightUnit" attribute
         */
        public boolean isSetHeightUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HEIGHTUNIT$14) != null;
            }
        }
        
        /**
         * Sets the "heightUnit" attribute
         */
        public void setHeightUnit(org.landxml.schema.landXML11.ImpHeight.Enum heightUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEIGHTUNIT$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEIGHTUNIT$14);
                }
                target.setEnumValue(heightUnit);
            }
        }
        
        /**
         * Sets (as xml) the "heightUnit" attribute
         */
        public void xsetHeightUnit(org.landxml.schema.landXML11.ImpHeight heightUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImpHeight target = null;
                target = (org.landxml.schema.landXML11.ImpHeight)get_store().find_attribute_user(HEIGHTUNIT$14);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ImpHeight)get_store().add_attribute_user(HEIGHTUNIT$14);
                }
                target.set(heightUnit);
            }
        }
        
        /**
         * Unsets the "heightUnit" attribute
         */
        public void unsetHeightUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HEIGHTUNIT$14);
            }
        }
        
        /**
         * Gets the "velocityUnit" attribute
         */
        public org.landxml.schema.landXML11.ImpVelocity.Enum getVelocityUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VELOCITYUNIT$16);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ImpVelocity.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "velocityUnit" attribute
         */
        public org.landxml.schema.landXML11.ImpVelocity xgetVelocityUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImpVelocity target = null;
                target = (org.landxml.schema.landXML11.ImpVelocity)get_store().find_attribute_user(VELOCITYUNIT$16);
                return target;
            }
        }
        
        /**
         * True if has "velocityUnit" attribute
         */
        public boolean isSetVelocityUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VELOCITYUNIT$16) != null;
            }
        }
        
        /**
         * Sets the "velocityUnit" attribute
         */
        public void setVelocityUnit(org.landxml.schema.landXML11.ImpVelocity.Enum velocityUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VELOCITYUNIT$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VELOCITYUNIT$16);
                }
                target.setEnumValue(velocityUnit);
            }
        }
        
        /**
         * Sets (as xml) the "velocityUnit" attribute
         */
        public void xsetVelocityUnit(org.landxml.schema.landXML11.ImpVelocity velocityUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImpVelocity target = null;
                target = (org.landxml.schema.landXML11.ImpVelocity)get_store().find_attribute_user(VELOCITYUNIT$16);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ImpVelocity)get_store().add_attribute_user(VELOCITYUNIT$16);
                }
                target.set(velocityUnit);
            }
        }
        
        /**
         * Unsets the "velocityUnit" attribute
         */
        public void unsetVelocityUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VELOCITYUNIT$16);
            }
        }
        
        /**
         * Gets the "flowUnit" attribute
         */
        public org.landxml.schema.landXML11.ImpFlow.Enum getFlowUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLOWUNIT$18);
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ImpFlow.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "flowUnit" attribute
         */
        public org.landxml.schema.landXML11.ImpFlow xgetFlowUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImpFlow target = null;
                target = (org.landxml.schema.landXML11.ImpFlow)get_store().find_attribute_user(FLOWUNIT$18);
                return target;
            }
        }
        
        /**
         * True if has "flowUnit" attribute
         */
        public boolean isSetFlowUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FLOWUNIT$18) != null;
            }
        }
        
        /**
         * Sets the "flowUnit" attribute
         */
        public void setFlowUnit(org.landxml.schema.landXML11.ImpFlow.Enum flowUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLOWUNIT$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLOWUNIT$18);
                }
                target.setEnumValue(flowUnit);
            }
        }
        
        /**
         * Sets (as xml) the "flowUnit" attribute
         */
        public void xsetFlowUnit(org.landxml.schema.landXML11.ImpFlow flowUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ImpFlow target = null;
                target = (org.landxml.schema.landXML11.ImpFlow)get_store().find_attribute_user(FLOWUNIT$18);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ImpFlow)get_store().add_attribute_user(FLOWUNIT$18);
                }
                target.set(flowUnit);
            }
        }
        
        /**
         * Unsets the "flowUnit" attribute
         */
        public void unsetFlowUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FLOWUNIT$18);
            }
        }
        
        /**
         * Gets the "angularUnit" attribute
         */
        public org.landxml.schema.landXML11.AngularType.Enum getAngularUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANGULARUNIT$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ANGULARUNIT$20);
                }
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.AngularType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "angularUnit" attribute
         */
        public org.landxml.schema.landXML11.AngularType xgetAngularUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AngularType target = null;
                target = (org.landxml.schema.landXML11.AngularType)get_store().find_attribute_user(ANGULARUNIT$20);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.AngularType)get_default_attribute_value(ANGULARUNIT$20);
                }
                return target;
            }
        }
        
        /**
         * True if has "angularUnit" attribute
         */
        public boolean isSetAngularUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ANGULARUNIT$20) != null;
            }
        }
        
        /**
         * Sets the "angularUnit" attribute
         */
        public void setAngularUnit(org.landxml.schema.landXML11.AngularType.Enum angularUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANGULARUNIT$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ANGULARUNIT$20);
                }
                target.setEnumValue(angularUnit);
            }
        }
        
        /**
         * Sets (as xml) the "angularUnit" attribute
         */
        public void xsetAngularUnit(org.landxml.schema.landXML11.AngularType angularUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AngularType target = null;
                target = (org.landxml.schema.landXML11.AngularType)get_store().find_attribute_user(ANGULARUNIT$20);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.AngularType)get_store().add_attribute_user(ANGULARUNIT$20);
                }
                target.set(angularUnit);
            }
        }
        
        /**
         * Unsets the "angularUnit" attribute
         */
        public void unsetAngularUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ANGULARUNIT$20);
            }
        }
        
        /**
         * Gets the "directionUnit" attribute
         */
        public org.landxml.schema.landXML11.AngularType.Enum getDirectionUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTIONUNIT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DIRECTIONUNIT$22);
                }
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.AngularType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "directionUnit" attribute
         */
        public org.landxml.schema.landXML11.AngularType xgetDirectionUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AngularType target = null;
                target = (org.landxml.schema.landXML11.AngularType)get_store().find_attribute_user(DIRECTIONUNIT$22);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.AngularType)get_default_attribute_value(DIRECTIONUNIT$22);
                }
                return target;
            }
        }
        
        /**
         * True if has "directionUnit" attribute
         */
        public boolean isSetDirectionUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DIRECTIONUNIT$22) != null;
            }
        }
        
        /**
         * Sets the "directionUnit" attribute
         */
        public void setDirectionUnit(org.landxml.schema.landXML11.AngularType.Enum directionUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTIONUNIT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIRECTIONUNIT$22);
                }
                target.setEnumValue(directionUnit);
            }
        }
        
        /**
         * Sets (as xml) the "directionUnit" attribute
         */
        public void xsetDirectionUnit(org.landxml.schema.landXML11.AngularType directionUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AngularType target = null;
                target = (org.landxml.schema.landXML11.AngularType)get_store().find_attribute_user(DIRECTIONUNIT$22);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.AngularType)get_store().add_attribute_user(DIRECTIONUNIT$22);
                }
                target.set(directionUnit);
            }
        }
        
        /**
         * Unsets the "directionUnit" attribute
         */
        public void unsetDirectionUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DIRECTIONUNIT$22);
            }
        }
        
        /**
         * Gets the "latLongAngularUnit" attribute
         */
        public org.landxml.schema.landXML11.LatLongAngularType.Enum getLatLongAngularUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATLONGANGULARUNIT$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LATLONGANGULARUNIT$24);
                }
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.LatLongAngularType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "latLongAngularUnit" attribute
         */
        public org.landxml.schema.landXML11.LatLongAngularType xgetLatLongAngularUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LatLongAngularType target = null;
                target = (org.landxml.schema.landXML11.LatLongAngularType)get_store().find_attribute_user(LATLONGANGULARUNIT$24);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.LatLongAngularType)get_default_attribute_value(LATLONGANGULARUNIT$24);
                }
                return target;
            }
        }
        
        /**
         * True if has "latLongAngularUnit" attribute
         */
        public boolean isSetLatLongAngularUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LATLONGANGULARUNIT$24) != null;
            }
        }
        
        /**
         * Sets the "latLongAngularUnit" attribute
         */
        public void setLatLongAngularUnit(org.landxml.schema.landXML11.LatLongAngularType.Enum latLongAngularUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATLONGANGULARUNIT$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LATLONGANGULARUNIT$24);
                }
                target.setEnumValue(latLongAngularUnit);
            }
        }
        
        /**
         * Sets (as xml) the "latLongAngularUnit" attribute
         */
        public void xsetLatLongAngularUnit(org.landxml.schema.landXML11.LatLongAngularType latLongAngularUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.LatLongAngularType target = null;
                target = (org.landxml.schema.landXML11.LatLongAngularType)get_store().find_attribute_user(LATLONGANGULARUNIT$24);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.LatLongAngularType)get_store().add_attribute_user(LATLONGANGULARUNIT$24);
                }
                target.set(latLongAngularUnit);
            }
        }
        
        /**
         * Unsets the "latLongAngularUnit" attribute
         */
        public void unsetLatLongAngularUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LATLONGANGULARUNIT$24);
            }
        }
        
        /**
         * Gets the "elevationUnit" attribute
         */
        public org.landxml.schema.landXML11.ElevationType.Enum getElevationUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEVATIONUNIT$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ELEVATIONUNIT$26);
                }
                if (target == null)
                {
                    return null;
                }
                return (org.landxml.schema.landXML11.ElevationType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "elevationUnit" attribute
         */
        public org.landxml.schema.landXML11.ElevationType xgetElevationUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ElevationType target = null;
                target = (org.landxml.schema.landXML11.ElevationType)get_store().find_attribute_user(ELEVATIONUNIT$26);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ElevationType)get_default_attribute_value(ELEVATIONUNIT$26);
                }
                return target;
            }
        }
        
        /**
         * True if has "elevationUnit" attribute
         */
        public boolean isSetElevationUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ELEVATIONUNIT$26) != null;
            }
        }
        
        /**
         * Sets the "elevationUnit" attribute
         */
        public void setElevationUnit(org.landxml.schema.landXML11.ElevationType.Enum elevationUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEVATIONUNIT$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELEVATIONUNIT$26);
                }
                target.setEnumValue(elevationUnit);
            }
        }
        
        /**
         * Sets (as xml) the "elevationUnit" attribute
         */
        public void xsetElevationUnit(org.landxml.schema.landXML11.ElevationType elevationUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ElevationType target = null;
                target = (org.landxml.schema.landXML11.ElevationType)get_store().find_attribute_user(ELEVATIONUNIT$26);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ElevationType)get_store().add_attribute_user(ELEVATIONUNIT$26);
                }
                target.set(elevationUnit);
            }
        }
        
        /**
         * Unsets the "elevationUnit" attribute
         */
        public void unsetElevationUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ELEVATIONUNIT$26);
            }
        }
    }
}
