/*
 * An XML document type.
 * Localname: Pipe
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.PipeDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one Pipe(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class PipeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PipeDocument
{
    
    public PipeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PIPE$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Pipe");
    
    
    /**
     * Gets the "Pipe" element
     */
    public org.landxml.schema.landXML11.PipeDocument.Pipe getPipe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PipeDocument.Pipe target = null;
            target = (org.landxml.schema.landXML11.PipeDocument.Pipe)get_store().find_element_user(PIPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Pipe" element
     */
    public void setPipe(org.landxml.schema.landXML11.PipeDocument.Pipe pipe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PipeDocument.Pipe target = null;
            target = (org.landxml.schema.landXML11.PipeDocument.Pipe)get_store().find_element_user(PIPE$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.PipeDocument.Pipe)get_store().add_element_user(PIPE$0);
            }
            target.set(pipe);
        }
    }
    
    /**
     * Appends and returns a new empty "Pipe" element
     */
    public org.landxml.schema.landXML11.PipeDocument.Pipe addNewPipe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.PipeDocument.Pipe target = null;
            target = (org.landxml.schema.landXML11.PipeDocument.Pipe)get_store().add_element_user(PIPE$0);
            return target;
        }
    }
    /**
     * An XML Pipe(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class PipeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.PipeDocument.Pipe
    {
        
        public PipeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CIRCPIPE$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CircPipe");
        private static final javax.xml.namespace.QName EGGPIPE$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "EggPipe");
        private static final javax.xml.namespace.QName ELLIPIPE$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "ElliPipe");
        private static final javax.xml.namespace.QName RECTPIPE$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "RectPipe");
        private static final javax.xml.namespace.QName CHANNEL$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Channel");
        private static final javax.xml.namespace.QName PIPEFLOW$10 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PipeFlow");
        private static final javax.xml.namespace.QName CENTER$12 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Center");
        private static final javax.xml.namespace.QName FEATURE$14 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        private static final javax.xml.namespace.QName NAME$16 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName REFEND$18 = 
            new javax.xml.namespace.QName("", "refEnd");
        private static final javax.xml.namespace.QName REFSTART$20 = 
            new javax.xml.namespace.QName("", "refStart");
        private static final javax.xml.namespace.QName DESC$22 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName LENGTH$24 = 
            new javax.xml.namespace.QName("", "length");
        private static final javax.xml.namespace.QName OID$26 = 
            new javax.xml.namespace.QName("", "oID");
        private static final javax.xml.namespace.QName SLOPE$28 = 
            new javax.xml.namespace.QName("", "slope");
        private static final javax.xml.namespace.QName STATE$30 = 
            new javax.xml.namespace.QName("", "state");
        
        
        /**
         * Gets the "CircPipe" element
         */
        public org.landxml.schema.landXML11.CircPipeDocument.CircPipe getCircPipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CircPipeDocument.CircPipe target = null;
                target = (org.landxml.schema.landXML11.CircPipeDocument.CircPipe)get_store().find_element_user(CIRCPIPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "CircPipe" element
         */
        public boolean isSetCircPipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CIRCPIPE$0) != 0;
            }
        }
        
        /**
         * Sets the "CircPipe" element
         */
        public void setCircPipe(org.landxml.schema.landXML11.CircPipeDocument.CircPipe circPipe)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CircPipeDocument.CircPipe target = null;
                target = (org.landxml.schema.landXML11.CircPipeDocument.CircPipe)get_store().find_element_user(CIRCPIPE$0, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.CircPipeDocument.CircPipe)get_store().add_element_user(CIRCPIPE$0);
                }
                target.set(circPipe);
            }
        }
        
        /**
         * Appends and returns a new empty "CircPipe" element
         */
        public org.landxml.schema.landXML11.CircPipeDocument.CircPipe addNewCircPipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CircPipeDocument.CircPipe target = null;
                target = (org.landxml.schema.landXML11.CircPipeDocument.CircPipe)get_store().add_element_user(CIRCPIPE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "CircPipe" element
         */
        public void unsetCircPipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CIRCPIPE$0, 0);
            }
        }
        
        /**
         * Gets the "EggPipe" element
         */
        public org.landxml.schema.landXML11.EggPipeDocument.EggPipe getEggPipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.EggPipeDocument.EggPipe target = null;
                target = (org.landxml.schema.landXML11.EggPipeDocument.EggPipe)get_store().find_element_user(EGGPIPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "EggPipe" element
         */
        public boolean isSetEggPipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EGGPIPE$2) != 0;
            }
        }
        
        /**
         * Sets the "EggPipe" element
         */
        public void setEggPipe(org.landxml.schema.landXML11.EggPipeDocument.EggPipe eggPipe)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.EggPipeDocument.EggPipe target = null;
                target = (org.landxml.schema.landXML11.EggPipeDocument.EggPipe)get_store().find_element_user(EGGPIPE$2, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.EggPipeDocument.EggPipe)get_store().add_element_user(EGGPIPE$2);
                }
                target.set(eggPipe);
            }
        }
        
        /**
         * Appends and returns a new empty "EggPipe" element
         */
        public org.landxml.schema.landXML11.EggPipeDocument.EggPipe addNewEggPipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.EggPipeDocument.EggPipe target = null;
                target = (org.landxml.schema.landXML11.EggPipeDocument.EggPipe)get_store().add_element_user(EGGPIPE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "EggPipe" element
         */
        public void unsetEggPipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EGGPIPE$2, 0);
            }
        }
        
        /**
         * Gets the "ElliPipe" element
         */
        public org.landxml.schema.landXML11.ElliPipeDocument.ElliPipe getElliPipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ElliPipeDocument.ElliPipe target = null;
                target = (org.landxml.schema.landXML11.ElliPipeDocument.ElliPipe)get_store().find_element_user(ELLIPIPE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ElliPipe" element
         */
        public boolean isSetElliPipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ELLIPIPE$4) != 0;
            }
        }
        
        /**
         * Sets the "ElliPipe" element
         */
        public void setElliPipe(org.landxml.schema.landXML11.ElliPipeDocument.ElliPipe elliPipe)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ElliPipeDocument.ElliPipe target = null;
                target = (org.landxml.schema.landXML11.ElliPipeDocument.ElliPipe)get_store().find_element_user(ELLIPIPE$4, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ElliPipeDocument.ElliPipe)get_store().add_element_user(ELLIPIPE$4);
                }
                target.set(elliPipe);
            }
        }
        
        /**
         * Appends and returns a new empty "ElliPipe" element
         */
        public org.landxml.schema.landXML11.ElliPipeDocument.ElliPipe addNewElliPipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ElliPipeDocument.ElliPipe target = null;
                target = (org.landxml.schema.landXML11.ElliPipeDocument.ElliPipe)get_store().add_element_user(ELLIPIPE$4);
                return target;
            }
        }
        
        /**
         * Unsets the "ElliPipe" element
         */
        public void unsetElliPipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ELLIPIPE$4, 0);
            }
        }
        
        /**
         * Gets the "RectPipe" element
         */
        public org.landxml.schema.landXML11.RectPipeDocument.RectPipe getRectPipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RectPipeDocument.RectPipe target = null;
                target = (org.landxml.schema.landXML11.RectPipeDocument.RectPipe)get_store().find_element_user(RECTPIPE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "RectPipe" element
         */
        public boolean isSetRectPipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECTPIPE$6) != 0;
            }
        }
        
        /**
         * Sets the "RectPipe" element
         */
        public void setRectPipe(org.landxml.schema.landXML11.RectPipeDocument.RectPipe rectPipe)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RectPipeDocument.RectPipe target = null;
                target = (org.landxml.schema.landXML11.RectPipeDocument.RectPipe)get_store().find_element_user(RECTPIPE$6, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.RectPipeDocument.RectPipe)get_store().add_element_user(RECTPIPE$6);
                }
                target.set(rectPipe);
            }
        }
        
        /**
         * Appends and returns a new empty "RectPipe" element
         */
        public org.landxml.schema.landXML11.RectPipeDocument.RectPipe addNewRectPipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RectPipeDocument.RectPipe target = null;
                target = (org.landxml.schema.landXML11.RectPipeDocument.RectPipe)get_store().add_element_user(RECTPIPE$6);
                return target;
            }
        }
        
        /**
         * Unsets the "RectPipe" element
         */
        public void unsetRectPipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECTPIPE$6, 0);
            }
        }
        
        /**
         * Gets the "Channel" element
         */
        public org.landxml.schema.landXML11.ChannelDocument.Channel getChannel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ChannelDocument.Channel target = null;
                target = (org.landxml.schema.landXML11.ChannelDocument.Channel)get_store().find_element_user(CHANNEL$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Channel" element
         */
        public boolean isSetChannel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CHANNEL$8) != 0;
            }
        }
        
        /**
         * Sets the "Channel" element
         */
        public void setChannel(org.landxml.schema.landXML11.ChannelDocument.Channel channel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ChannelDocument.Channel target = null;
                target = (org.landxml.schema.landXML11.ChannelDocument.Channel)get_store().find_element_user(CHANNEL$8, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.ChannelDocument.Channel)get_store().add_element_user(CHANNEL$8);
                }
                target.set(channel);
            }
        }
        
        /**
         * Appends and returns a new empty "Channel" element
         */
        public org.landxml.schema.landXML11.ChannelDocument.Channel addNewChannel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ChannelDocument.Channel target = null;
                target = (org.landxml.schema.landXML11.ChannelDocument.Channel)get_store().add_element_user(CHANNEL$8);
                return target;
            }
        }
        
        /**
         * Unsets the "Channel" element
         */
        public void unsetChannel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CHANNEL$8, 0);
            }
        }
        
        /**
         * Gets the "PipeFlow" element
         */
        public org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow getPipeFlow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow target = null;
                target = (org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow)get_store().find_element_user(PIPEFLOW$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "PipeFlow" element
         */
        public boolean isSetPipeFlow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PIPEFLOW$10) != 0;
            }
        }
        
        /**
         * Sets the "PipeFlow" element
         */
        public void setPipeFlow(org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow pipeFlow)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow target = null;
                target = (org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow)get_store().find_element_user(PIPEFLOW$10, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow)get_store().add_element_user(PIPEFLOW$10);
                }
                target.set(pipeFlow);
            }
        }
        
        /**
         * Appends and returns a new empty "PipeFlow" element
         */
        public org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow addNewPipeFlow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow target = null;
                target = (org.landxml.schema.landXML11.PipeFlowDocument.PipeFlow)get_store().add_element_user(PIPEFLOW$10);
                return target;
            }
        }
        
        /**
         * Unsets the "PipeFlow" element
         */
        public void unsetPipeFlow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PIPEFLOW$10, 0);
            }
        }
        
        /**
         * Gets the "Center" element
         */
        public org.landxml.schema.landXML11.PointType getCenter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(CENTER$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Center" element
         */
        public boolean isSetCenter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CENTER$12) != 0;
            }
        }
        
        /**
         * Sets the "Center" element
         */
        public void setCenter(org.landxml.schema.landXML11.PointType center)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().find_element_user(CENTER$12, 0);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(CENTER$12);
                }
                target.set(center);
            }
        }
        
        /**
         * Appends and returns a new empty "Center" element
         */
        public org.landxml.schema.landXML11.PointType addNewCenter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointType target = null;
                target = (org.landxml.schema.landXML11.PointType)get_store().add_element_user(CENTER$12);
                return target;
            }
        }
        
        /**
         * Unsets the "Center" element
         */
        public void unsetCenter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CENTER$12, 0);
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
                    { return PipeImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = PipeImpl.this.getFeatureArray(i);
                    PipeImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { PipeImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = PipeImpl.this.getFeatureArray(i);
                    PipeImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return PipeImpl.this.sizeOfFeatureArray(); }
                
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
         * Gets the "refEnd" attribute
         */
        public java.lang.String getRefEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFEND$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "refEnd" attribute
         */
        public org.landxml.schema.landXML11.StructNameRef xgetRefEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StructNameRef target = null;
                target = (org.landxml.schema.landXML11.StructNameRef)get_store().find_attribute_user(REFEND$18);
                return target;
            }
        }
        
        /**
         * Sets the "refEnd" attribute
         */
        public void setRefEnd(java.lang.String refEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFEND$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFEND$18);
                }
                target.setStringValue(refEnd);
            }
        }
        
        /**
         * Sets (as xml) the "refEnd" attribute
         */
        public void xsetRefEnd(org.landxml.schema.landXML11.StructNameRef refEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StructNameRef target = null;
                target = (org.landxml.schema.landXML11.StructNameRef)get_store().find_attribute_user(REFEND$18);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StructNameRef)get_store().add_attribute_user(REFEND$18);
                }
                target.set(refEnd);
            }
        }
        
        /**
         * Gets the "refStart" attribute
         */
        public java.lang.String getRefStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFSTART$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "refStart" attribute
         */
        public org.landxml.schema.landXML11.StructNameRef xgetRefStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StructNameRef target = null;
                target = (org.landxml.schema.landXML11.StructNameRef)get_store().find_attribute_user(REFSTART$20);
                return target;
            }
        }
        
        /**
         * Sets the "refStart" attribute
         */
        public void setRefStart(java.lang.String refStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFSTART$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFSTART$20);
                }
                target.setStringValue(refStart);
            }
        }
        
        /**
         * Sets (as xml) the "refStart" attribute
         */
        public void xsetRefStart(org.landxml.schema.landXML11.StructNameRef refStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.StructNameRef target = null;
                target = (org.landxml.schema.landXML11.StructNameRef)get_store().find_attribute_user(REFSTART$20);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StructNameRef)get_store().add_attribute_user(REFSTART$20);
                }
                target.set(refStart);
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
         * Gets the "length" attribute
         */
        public double getLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$24);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "length" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTH$24);
                return target;
            }
        }
        
        /**
         * True if has "length" attribute
         */
        public boolean isSetLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LENGTH$24) != null;
            }
        }
        
        /**
         * Sets the "length" attribute
         */
        public void setLength(double length)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LENGTH$24);
                }
                target.setDoubleValue(length);
            }
        }
        
        /**
         * Sets (as xml) the "length" attribute
         */
        public void xsetLength(org.apache.xmlbeans.XmlDouble length)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LENGTH$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LENGTH$24);
                }
                target.set(length);
            }
        }
        
        /**
         * Unsets the "length" attribute
         */
        public void unsetLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LENGTH$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$26);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$26);
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
                return get_store().find_attribute_user(OID$26) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OID$26);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OID$26);
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
                get_store().remove_attribute(OID$26);
            }
        }
        
        /**
         * Gets the "slope" attribute
         */
        public double getSlope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SLOPE$28);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "slope" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSlope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SLOPE$28);
                return target;
            }
        }
        
        /**
         * True if has "slope" attribute
         */
        public boolean isSetSlope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SLOPE$28) != null;
            }
        }
        
        /**
         * Sets the "slope" attribute
         */
        public void setSlope(double slope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SLOPE$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SLOPE$28);
                }
                target.setDoubleValue(slope);
            }
        }
        
        /**
         * Sets (as xml) the "slope" attribute
         */
        public void xsetSlope(org.apache.xmlbeans.XmlDouble slope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SLOPE$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SLOPE$28);
                }
                target.set(slope);
            }
        }
        
        /**
         * Unsets the "slope" attribute
         */
        public void unsetSlope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SLOPE$28);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$30);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$30);
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
                return get_store().find_attribute_user(STATE$30) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$30);
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
                target = (org.landxml.schema.landXML11.StateType)get_store().find_attribute_user(STATE$30);
                if (target == null)
                {
                    target = (org.landxml.schema.landXML11.StateType)get_store().add_attribute_user(STATE$30);
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
                get_store().remove_attribute(STATE$30);
            }
        }
    }
}
