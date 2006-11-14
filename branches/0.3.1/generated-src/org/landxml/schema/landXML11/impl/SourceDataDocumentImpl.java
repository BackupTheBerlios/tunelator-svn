/*
 * An XML document type.
 * Localname: SourceData
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.SourceDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one SourceData(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class SourceDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SourceDataDocument
{
    
    public SourceDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCEDATA$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "SourceData");
    
    
    /**
     * Gets the "SourceData" element
     */
    public org.landxml.schema.landXML11.SourceDataDocument.SourceData getSourceData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SourceDataDocument.SourceData target = null;
            target = (org.landxml.schema.landXML11.SourceDataDocument.SourceData)get_store().find_element_user(SOURCEDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SourceData" element
     */
    public void setSourceData(org.landxml.schema.landXML11.SourceDataDocument.SourceData sourceData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SourceDataDocument.SourceData target = null;
            target = (org.landxml.schema.landXML11.SourceDataDocument.SourceData)get_store().find_element_user(SOURCEDATA$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.SourceDataDocument.SourceData)get_store().add_element_user(SOURCEDATA$0);
            }
            target.set(sourceData);
        }
    }
    
    /**
     * Appends and returns a new empty "SourceData" element
     */
    public org.landxml.schema.landXML11.SourceDataDocument.SourceData addNewSourceData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.SourceDataDocument.SourceData target = null;
            target = (org.landxml.schema.landXML11.SourceDataDocument.SourceData)get_store().add_element_user(SOURCEDATA$0);
            return target;
        }
    }
    /**
     * An XML SourceData(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class SourceDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.SourceDataDocument.SourceData
    {
        
        public SourceDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CHAIN$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Chain");
        private static final javax.xml.namespace.QName POINTFILES$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PointFiles");
        private static final javax.xml.namespace.QName BOUNDARIES$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Boundaries");
        private static final javax.xml.namespace.QName BREAKLINES$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Breaklines");
        private static final javax.xml.namespace.QName CONTOURS$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Contours");
        private static final javax.xml.namespace.QName DATAPOINTS$10 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "DataPoints");
        private static final javax.xml.namespace.QName FEATURE$12 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Feature");
        
        
        /**
         * Gets a List of "Chain" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ChainDocument.Chain> getChainList()
        {
            final class ChainList extends java.util.AbstractList<org.landxml.schema.landXML11.ChainDocument.Chain>
            {
                public org.landxml.schema.landXML11.ChainDocument.Chain get(int i)
                    { return SourceDataImpl.this.getChainArray(i); }
                
                public org.landxml.schema.landXML11.ChainDocument.Chain set(int i, org.landxml.schema.landXML11.ChainDocument.Chain o)
                {
                    org.landxml.schema.landXML11.ChainDocument.Chain old = SourceDataImpl.this.getChainArray(i);
                    SourceDataImpl.this.setChainArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ChainDocument.Chain o)
                    { SourceDataImpl.this.insertNewChain(i).set(o); }
                
                public org.landxml.schema.landXML11.ChainDocument.Chain remove(int i)
                {
                    org.landxml.schema.landXML11.ChainDocument.Chain old = SourceDataImpl.this.getChainArray(i);
                    SourceDataImpl.this.removeChain(i);
                    return old;
                }
                
                public int size()
                    { return SourceDataImpl.this.sizeOfChainArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ChainList();
            }
        }
        
        /**
         * Gets array of all "Chain" elements
         */
        public org.landxml.schema.landXML11.ChainDocument.Chain[] getChainArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CHAIN$0, targetList);
                org.landxml.schema.landXML11.ChainDocument.Chain[] result = new org.landxml.schema.landXML11.ChainDocument.Chain[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Chain" element
         */
        public org.landxml.schema.landXML11.ChainDocument.Chain getChainArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ChainDocument.Chain target = null;
                target = (org.landxml.schema.landXML11.ChainDocument.Chain)get_store().find_element_user(CHAIN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Chain" element
         */
        public int sizeOfChainArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CHAIN$0);
            }
        }
        
        /**
         * Sets array of all "Chain" element
         */
        public void setChainArray(org.landxml.schema.landXML11.ChainDocument.Chain[] chainArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(chainArray, CHAIN$0);
            }
        }
        
        /**
         * Sets ith "Chain" element
         */
        public void setChainArray(int i, org.landxml.schema.landXML11.ChainDocument.Chain chain)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ChainDocument.Chain target = null;
                target = (org.landxml.schema.landXML11.ChainDocument.Chain)get_store().find_element_user(CHAIN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(chain);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Chain" element
         */
        public org.landxml.schema.landXML11.ChainDocument.Chain insertNewChain(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ChainDocument.Chain target = null;
                target = (org.landxml.schema.landXML11.ChainDocument.Chain)get_store().insert_element_user(CHAIN$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Chain" element
         */
        public org.landxml.schema.landXML11.ChainDocument.Chain addNewChain()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ChainDocument.Chain target = null;
                target = (org.landxml.schema.landXML11.ChainDocument.Chain)get_store().add_element_user(CHAIN$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Chain" element
         */
        public void removeChain(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CHAIN$0, i);
            }
        }
        
        /**
         * Gets a List of "PointFiles" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PointFilesDocument.PointFiles> getPointFilesList()
        {
            final class PointFilesList extends java.util.AbstractList<org.landxml.schema.landXML11.PointFilesDocument.PointFiles>
            {
                public org.landxml.schema.landXML11.PointFilesDocument.PointFiles get(int i)
                    { return SourceDataImpl.this.getPointFilesArray(i); }
                
                public org.landxml.schema.landXML11.PointFilesDocument.PointFiles set(int i, org.landxml.schema.landXML11.PointFilesDocument.PointFiles o)
                {
                    org.landxml.schema.landXML11.PointFilesDocument.PointFiles old = SourceDataImpl.this.getPointFilesArray(i);
                    SourceDataImpl.this.setPointFilesArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PointFilesDocument.PointFiles o)
                    { SourceDataImpl.this.insertNewPointFiles(i).set(o); }
                
                public org.landxml.schema.landXML11.PointFilesDocument.PointFiles remove(int i)
                {
                    org.landxml.schema.landXML11.PointFilesDocument.PointFiles old = SourceDataImpl.this.getPointFilesArray(i);
                    SourceDataImpl.this.removePointFiles(i);
                    return old;
                }
                
                public int size()
                    { return SourceDataImpl.this.sizeOfPointFilesArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PointFilesList();
            }
        }
        
        /**
         * Gets array of all "PointFiles" elements
         */
        public org.landxml.schema.landXML11.PointFilesDocument.PointFiles[] getPointFilesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(POINTFILES$2, targetList);
                org.landxml.schema.landXML11.PointFilesDocument.PointFiles[] result = new org.landxml.schema.landXML11.PointFilesDocument.PointFiles[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PointFiles" element
         */
        public org.landxml.schema.landXML11.PointFilesDocument.PointFiles getPointFilesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointFilesDocument.PointFiles target = null;
                target = (org.landxml.schema.landXML11.PointFilesDocument.PointFiles)get_store().find_element_user(POINTFILES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PointFiles" element
         */
        public int sizeOfPointFilesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(POINTFILES$2);
            }
        }
        
        /**
         * Sets array of all "PointFiles" element
         */
        public void setPointFilesArray(org.landxml.schema.landXML11.PointFilesDocument.PointFiles[] pointFilesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pointFilesArray, POINTFILES$2);
            }
        }
        
        /**
         * Sets ith "PointFiles" element
         */
        public void setPointFilesArray(int i, org.landxml.schema.landXML11.PointFilesDocument.PointFiles pointFiles)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointFilesDocument.PointFiles target = null;
                target = (org.landxml.schema.landXML11.PointFilesDocument.PointFiles)get_store().find_element_user(POINTFILES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(pointFiles);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PointFiles" element
         */
        public org.landxml.schema.landXML11.PointFilesDocument.PointFiles insertNewPointFiles(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointFilesDocument.PointFiles target = null;
                target = (org.landxml.schema.landXML11.PointFilesDocument.PointFiles)get_store().insert_element_user(POINTFILES$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PointFiles" element
         */
        public org.landxml.schema.landXML11.PointFilesDocument.PointFiles addNewPointFiles()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PointFilesDocument.PointFiles target = null;
                target = (org.landxml.schema.landXML11.PointFilesDocument.PointFiles)get_store().add_element_user(POINTFILES$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "PointFiles" element
         */
        public void removePointFiles(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(POINTFILES$2, i);
            }
        }
        
        /**
         * Gets a List of "Boundaries" elements
         */
        public java.util.List<org.landxml.schema.landXML11.BoundariesDocument.Boundaries> getBoundariesList()
        {
            final class BoundariesList extends java.util.AbstractList<org.landxml.schema.landXML11.BoundariesDocument.Boundaries>
            {
                public org.landxml.schema.landXML11.BoundariesDocument.Boundaries get(int i)
                    { return SourceDataImpl.this.getBoundariesArray(i); }
                
                public org.landxml.schema.landXML11.BoundariesDocument.Boundaries set(int i, org.landxml.schema.landXML11.BoundariesDocument.Boundaries o)
                {
                    org.landxml.schema.landXML11.BoundariesDocument.Boundaries old = SourceDataImpl.this.getBoundariesArray(i);
                    SourceDataImpl.this.setBoundariesArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.BoundariesDocument.Boundaries o)
                    { SourceDataImpl.this.insertNewBoundaries(i).set(o); }
                
                public org.landxml.schema.landXML11.BoundariesDocument.Boundaries remove(int i)
                {
                    org.landxml.schema.landXML11.BoundariesDocument.Boundaries old = SourceDataImpl.this.getBoundariesArray(i);
                    SourceDataImpl.this.removeBoundaries(i);
                    return old;
                }
                
                public int size()
                    { return SourceDataImpl.this.sizeOfBoundariesArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new BoundariesList();
            }
        }
        
        /**
         * Gets array of all "Boundaries" elements
         */
        public org.landxml.schema.landXML11.BoundariesDocument.Boundaries[] getBoundariesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BOUNDARIES$4, targetList);
                org.landxml.schema.landXML11.BoundariesDocument.Boundaries[] result = new org.landxml.schema.landXML11.BoundariesDocument.Boundaries[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Boundaries" element
         */
        public org.landxml.schema.landXML11.BoundariesDocument.Boundaries getBoundariesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BoundariesDocument.Boundaries target = null;
                target = (org.landxml.schema.landXML11.BoundariesDocument.Boundaries)get_store().find_element_user(BOUNDARIES$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Boundaries" element
         */
        public int sizeOfBoundariesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BOUNDARIES$4);
            }
        }
        
        /**
         * Sets array of all "Boundaries" element
         */
        public void setBoundariesArray(org.landxml.schema.landXML11.BoundariesDocument.Boundaries[] boundariesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(boundariesArray, BOUNDARIES$4);
            }
        }
        
        /**
         * Sets ith "Boundaries" element
         */
        public void setBoundariesArray(int i, org.landxml.schema.landXML11.BoundariesDocument.Boundaries boundaries)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BoundariesDocument.Boundaries target = null;
                target = (org.landxml.schema.landXML11.BoundariesDocument.Boundaries)get_store().find_element_user(BOUNDARIES$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(boundaries);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Boundaries" element
         */
        public org.landxml.schema.landXML11.BoundariesDocument.Boundaries insertNewBoundaries(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BoundariesDocument.Boundaries target = null;
                target = (org.landxml.schema.landXML11.BoundariesDocument.Boundaries)get_store().insert_element_user(BOUNDARIES$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Boundaries" element
         */
        public org.landxml.schema.landXML11.BoundariesDocument.Boundaries addNewBoundaries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BoundariesDocument.Boundaries target = null;
                target = (org.landxml.schema.landXML11.BoundariesDocument.Boundaries)get_store().add_element_user(BOUNDARIES$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "Boundaries" element
         */
        public void removeBoundaries(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BOUNDARIES$4, i);
            }
        }
        
        /**
         * Gets a List of "Breaklines" elements
         */
        public java.util.List<org.landxml.schema.landXML11.BreaklinesDocument.Breaklines> getBreaklinesList()
        {
            final class BreaklinesList extends java.util.AbstractList<org.landxml.schema.landXML11.BreaklinesDocument.Breaklines>
            {
                public org.landxml.schema.landXML11.BreaklinesDocument.Breaklines get(int i)
                    { return SourceDataImpl.this.getBreaklinesArray(i); }
                
                public org.landxml.schema.landXML11.BreaklinesDocument.Breaklines set(int i, org.landxml.schema.landXML11.BreaklinesDocument.Breaklines o)
                {
                    org.landxml.schema.landXML11.BreaklinesDocument.Breaklines old = SourceDataImpl.this.getBreaklinesArray(i);
                    SourceDataImpl.this.setBreaklinesArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.BreaklinesDocument.Breaklines o)
                    { SourceDataImpl.this.insertNewBreaklines(i).set(o); }
                
                public org.landxml.schema.landXML11.BreaklinesDocument.Breaklines remove(int i)
                {
                    org.landxml.schema.landXML11.BreaklinesDocument.Breaklines old = SourceDataImpl.this.getBreaklinesArray(i);
                    SourceDataImpl.this.removeBreaklines(i);
                    return old;
                }
                
                public int size()
                    { return SourceDataImpl.this.sizeOfBreaklinesArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new BreaklinesList();
            }
        }
        
        /**
         * Gets array of all "Breaklines" elements
         */
        public org.landxml.schema.landXML11.BreaklinesDocument.Breaklines[] getBreaklinesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BREAKLINES$6, targetList);
                org.landxml.schema.landXML11.BreaklinesDocument.Breaklines[] result = new org.landxml.schema.landXML11.BreaklinesDocument.Breaklines[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Breaklines" element
         */
        public org.landxml.schema.landXML11.BreaklinesDocument.Breaklines getBreaklinesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BreaklinesDocument.Breaklines target = null;
                target = (org.landxml.schema.landXML11.BreaklinesDocument.Breaklines)get_store().find_element_user(BREAKLINES$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Breaklines" element
         */
        public int sizeOfBreaklinesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BREAKLINES$6);
            }
        }
        
        /**
         * Sets array of all "Breaklines" element
         */
        public void setBreaklinesArray(org.landxml.schema.landXML11.BreaklinesDocument.Breaklines[] breaklinesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(breaklinesArray, BREAKLINES$6);
            }
        }
        
        /**
         * Sets ith "Breaklines" element
         */
        public void setBreaklinesArray(int i, org.landxml.schema.landXML11.BreaklinesDocument.Breaklines breaklines)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BreaklinesDocument.Breaklines target = null;
                target = (org.landxml.schema.landXML11.BreaklinesDocument.Breaklines)get_store().find_element_user(BREAKLINES$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(breaklines);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Breaklines" element
         */
        public org.landxml.schema.landXML11.BreaklinesDocument.Breaklines insertNewBreaklines(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BreaklinesDocument.Breaklines target = null;
                target = (org.landxml.schema.landXML11.BreaklinesDocument.Breaklines)get_store().insert_element_user(BREAKLINES$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Breaklines" element
         */
        public org.landxml.schema.landXML11.BreaklinesDocument.Breaklines addNewBreaklines()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.BreaklinesDocument.Breaklines target = null;
                target = (org.landxml.schema.landXML11.BreaklinesDocument.Breaklines)get_store().add_element_user(BREAKLINES$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "Breaklines" element
         */
        public void removeBreaklines(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BREAKLINES$6, i);
            }
        }
        
        /**
         * Gets a List of "Contours" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ContoursDocument.Contours> getContoursList()
        {
            final class ContoursList extends java.util.AbstractList<org.landxml.schema.landXML11.ContoursDocument.Contours>
            {
                public org.landxml.schema.landXML11.ContoursDocument.Contours get(int i)
                    { return SourceDataImpl.this.getContoursArray(i); }
                
                public org.landxml.schema.landXML11.ContoursDocument.Contours set(int i, org.landxml.schema.landXML11.ContoursDocument.Contours o)
                {
                    org.landxml.schema.landXML11.ContoursDocument.Contours old = SourceDataImpl.this.getContoursArray(i);
                    SourceDataImpl.this.setContoursArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ContoursDocument.Contours o)
                    { SourceDataImpl.this.insertNewContours(i).set(o); }
                
                public org.landxml.schema.landXML11.ContoursDocument.Contours remove(int i)
                {
                    org.landxml.schema.landXML11.ContoursDocument.Contours old = SourceDataImpl.this.getContoursArray(i);
                    SourceDataImpl.this.removeContours(i);
                    return old;
                }
                
                public int size()
                    { return SourceDataImpl.this.sizeOfContoursArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ContoursList();
            }
        }
        
        /**
         * Gets array of all "Contours" elements
         */
        public org.landxml.schema.landXML11.ContoursDocument.Contours[] getContoursArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONTOURS$8, targetList);
                org.landxml.schema.landXML11.ContoursDocument.Contours[] result = new org.landxml.schema.landXML11.ContoursDocument.Contours[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Contours" element
         */
        public org.landxml.schema.landXML11.ContoursDocument.Contours getContoursArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ContoursDocument.Contours target = null;
                target = (org.landxml.schema.landXML11.ContoursDocument.Contours)get_store().find_element_user(CONTOURS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Contours" element
         */
        public int sizeOfContoursArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTOURS$8);
            }
        }
        
        /**
         * Sets array of all "Contours" element
         */
        public void setContoursArray(org.landxml.schema.landXML11.ContoursDocument.Contours[] contoursArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(contoursArray, CONTOURS$8);
            }
        }
        
        /**
         * Sets ith "Contours" element
         */
        public void setContoursArray(int i, org.landxml.schema.landXML11.ContoursDocument.Contours contours)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ContoursDocument.Contours target = null;
                target = (org.landxml.schema.landXML11.ContoursDocument.Contours)get_store().find_element_user(CONTOURS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(contours);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Contours" element
         */
        public org.landxml.schema.landXML11.ContoursDocument.Contours insertNewContours(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ContoursDocument.Contours target = null;
                target = (org.landxml.schema.landXML11.ContoursDocument.Contours)get_store().insert_element_user(CONTOURS$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Contours" element
         */
        public org.landxml.schema.landXML11.ContoursDocument.Contours addNewContours()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ContoursDocument.Contours target = null;
                target = (org.landxml.schema.landXML11.ContoursDocument.Contours)get_store().add_element_user(CONTOURS$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "Contours" element
         */
        public void removeContours(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTOURS$8, i);
            }
        }
        
        /**
         * Gets a List of "DataPoints" elements
         */
        public java.util.List<org.landxml.schema.landXML11.DataPointsDocument.DataPoints> getDataPointsList()
        {
            final class DataPointsList extends java.util.AbstractList<org.landxml.schema.landXML11.DataPointsDocument.DataPoints>
            {
                public org.landxml.schema.landXML11.DataPointsDocument.DataPoints get(int i)
                    { return SourceDataImpl.this.getDataPointsArray(i); }
                
                public org.landxml.schema.landXML11.DataPointsDocument.DataPoints set(int i, org.landxml.schema.landXML11.DataPointsDocument.DataPoints o)
                {
                    org.landxml.schema.landXML11.DataPointsDocument.DataPoints old = SourceDataImpl.this.getDataPointsArray(i);
                    SourceDataImpl.this.setDataPointsArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.DataPointsDocument.DataPoints o)
                    { SourceDataImpl.this.insertNewDataPoints(i).set(o); }
                
                public org.landxml.schema.landXML11.DataPointsDocument.DataPoints remove(int i)
                {
                    org.landxml.schema.landXML11.DataPointsDocument.DataPoints old = SourceDataImpl.this.getDataPointsArray(i);
                    SourceDataImpl.this.removeDataPoints(i);
                    return old;
                }
                
                public int size()
                    { return SourceDataImpl.this.sizeOfDataPointsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DataPointsList();
            }
        }
        
        /**
         * Gets array of all "DataPoints" elements
         */
        public org.landxml.schema.landXML11.DataPointsDocument.DataPoints[] getDataPointsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DATAPOINTS$10, targetList);
                org.landxml.schema.landXML11.DataPointsDocument.DataPoints[] result = new org.landxml.schema.landXML11.DataPointsDocument.DataPoints[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "DataPoints" element
         */
        public org.landxml.schema.landXML11.DataPointsDocument.DataPoints getDataPointsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DataPointsDocument.DataPoints target = null;
                target = (org.landxml.schema.landXML11.DataPointsDocument.DataPoints)get_store().find_element_user(DATAPOINTS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "DataPoints" element
         */
        public int sizeOfDataPointsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATAPOINTS$10);
            }
        }
        
        /**
         * Sets array of all "DataPoints" element
         */
        public void setDataPointsArray(org.landxml.schema.landXML11.DataPointsDocument.DataPoints[] dataPointsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dataPointsArray, DATAPOINTS$10);
            }
        }
        
        /**
         * Sets ith "DataPoints" element
         */
        public void setDataPointsArray(int i, org.landxml.schema.landXML11.DataPointsDocument.DataPoints dataPoints)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DataPointsDocument.DataPoints target = null;
                target = (org.landxml.schema.landXML11.DataPointsDocument.DataPoints)get_store().find_element_user(DATAPOINTS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dataPoints);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DataPoints" element
         */
        public org.landxml.schema.landXML11.DataPointsDocument.DataPoints insertNewDataPoints(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DataPointsDocument.DataPoints target = null;
                target = (org.landxml.schema.landXML11.DataPointsDocument.DataPoints)get_store().insert_element_user(DATAPOINTS$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DataPoints" element
         */
        public org.landxml.schema.landXML11.DataPointsDocument.DataPoints addNewDataPoints()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.DataPointsDocument.DataPoints target = null;
                target = (org.landxml.schema.landXML11.DataPointsDocument.DataPoints)get_store().add_element_user(DATAPOINTS$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "DataPoints" element
         */
        public void removeDataPoints(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATAPOINTS$10, i);
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
                    { return SourceDataImpl.this.getFeatureArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature set(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = SourceDataImpl.this.getFeatureArray(i);
                    SourceDataImpl.this.setFeatureArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDocument.Feature o)
                    { SourceDataImpl.this.insertNewFeature(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDocument.Feature remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDocument.Feature old = SourceDataImpl.this.getFeatureArray(i);
                    SourceDataImpl.this.removeFeature(i);
                    return old;
                }
                
                public int size()
                    { return SourceDataImpl.this.sizeOfFeatureArray(); }
                
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
                get_store().find_all_element_users(FEATURE$12, targetList);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$12, i);
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
                return get_store().count_elements(FEATURE$12);
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
                arraySetterHelper(featureArray, FEATURE$12);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().find_element_user(FEATURE$12, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().insert_element_user(FEATURE$12, i);
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
                target = (org.landxml.schema.landXML11.FeatureDocument.Feature)get_store().add_element_user(FEATURE$12);
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
                get_store().remove_element(FEATURE$12, i);
            }
        }
    }
}
