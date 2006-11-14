/*
 * An XML document type.
 * Localname: LandXML
 * Namespace: http://www.landxml.org/schema/LandXML-1.1
 * Java type: org.landxml.schema.landXML11.LandXMLDocument
 *
 * Automatically generated - do not modify.
 */
package org.landxml.schema.landXML11.impl;
/**
 * A document containing one LandXML(@http://www.landxml.org/schema/LandXML-1.1) element.
 *
 * This is a complex type.
 */
public class LandXMLDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.LandXMLDocument
{
    
    public LandXMLDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANDXML$0 = 
        new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "LandXML");
    
    
    /**
     * Gets the "LandXML" element
     */
    public org.landxml.schema.landXML11.LandXMLDocument.LandXML getLandXML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.LandXMLDocument.LandXML target = null;
            target = (org.landxml.schema.landXML11.LandXMLDocument.LandXML)get_store().find_element_user(LANDXML$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LandXML" element
     */
    public void setLandXML(org.landxml.schema.landXML11.LandXMLDocument.LandXML landXML)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.LandXMLDocument.LandXML target = null;
            target = (org.landxml.schema.landXML11.LandXMLDocument.LandXML)get_store().find_element_user(LANDXML$0, 0);
            if (target == null)
            {
                target = (org.landxml.schema.landXML11.LandXMLDocument.LandXML)get_store().add_element_user(LANDXML$0);
            }
            target.set(landXML);
        }
    }
    
    /**
     * Appends and returns a new empty "LandXML" element
     */
    public org.landxml.schema.landXML11.LandXMLDocument.LandXML addNewLandXML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.landxml.schema.landXML11.LandXMLDocument.LandXML target = null;
            target = (org.landxml.schema.landXML11.LandXMLDocument.LandXML)get_store().add_element_user(LANDXML$0);
            return target;
        }
    }
    /**
     * An XML LandXML(@http://www.landxml.org/schema/LandXML-1.1).
     *
     * This is a complex type.
     */
    public static class LandXMLImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.landxml.schema.landXML11.LandXMLDocument.LandXML
    {
        
        public LandXMLImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UNITS$0 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Units");
        private static final javax.xml.namespace.QName COORDINATESYSTEM$2 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CoordinateSystem");
        private static final javax.xml.namespace.QName PROJECT$4 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Project");
        private static final javax.xml.namespace.QName APPLICATION$6 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Application");
        private static final javax.xml.namespace.QName ALIGNMENTS$8 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Alignments");
        private static final javax.xml.namespace.QName CGPOINTS$10 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "CgPoints");
        private static final javax.xml.namespace.QName AMENDMENT$12 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Amendment");
        private static final javax.xml.namespace.QName GRADEMODEL$14 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "GradeModel");
        private static final javax.xml.namespace.QName MONUMENTS$16 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Monuments");
        private static final javax.xml.namespace.QName PARCELS$18 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Parcels");
        private static final javax.xml.namespace.QName PLANFEATURES$20 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PlanFeatures");
        private static final javax.xml.namespace.QName PIPENETWORKS$22 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "PipeNetworks");
        private static final javax.xml.namespace.QName ROADWAYS$24 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Roadways");
        private static final javax.xml.namespace.QName SURFACES$26 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Surfaces");
        private static final javax.xml.namespace.QName SURVEY$28 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "Survey");
        private static final javax.xml.namespace.QName FEATUREDICTIONARY$30 = 
            new javax.xml.namespace.QName("http://www.landxml.org/schema/LandXML-1.1", "FeatureDictionary");
        private static final javax.xml.namespace.QName DATE$32 = 
            new javax.xml.namespace.QName("", "date");
        private static final javax.xml.namespace.QName TIME$34 = 
            new javax.xml.namespace.QName("", "time");
        private static final javax.xml.namespace.QName VERSION$36 = 
            new javax.xml.namespace.QName("", "version");
        private static final javax.xml.namespace.QName LANGUAGE$38 = 
            new javax.xml.namespace.QName("", "language");
        private static final javax.xml.namespace.QName READONLY$40 = 
            new javax.xml.namespace.QName("", "readOnly");
        private static final javax.xml.namespace.QName LANDXMLID$42 = 
            new javax.xml.namespace.QName("", "LandXMLId");
        private static final javax.xml.namespace.QName CRC$44 = 
            new javax.xml.namespace.QName("", "crc");
        
        
        /**
         * Gets a List of "Units" elements
         */
        public java.util.List<org.landxml.schema.landXML11.UnitsDocument.Units> getUnitsList()
        {
            final class UnitsList extends java.util.AbstractList<org.landxml.schema.landXML11.UnitsDocument.Units>
            {
                public org.landxml.schema.landXML11.UnitsDocument.Units get(int i)
                    { return LandXMLImpl.this.getUnitsArray(i); }
                
                public org.landxml.schema.landXML11.UnitsDocument.Units set(int i, org.landxml.schema.landXML11.UnitsDocument.Units o)
                {
                    org.landxml.schema.landXML11.UnitsDocument.Units old = LandXMLImpl.this.getUnitsArray(i);
                    LandXMLImpl.this.setUnitsArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.UnitsDocument.Units o)
                    { LandXMLImpl.this.insertNewUnits(i).set(o); }
                
                public org.landxml.schema.landXML11.UnitsDocument.Units remove(int i)
                {
                    org.landxml.schema.landXML11.UnitsDocument.Units old = LandXMLImpl.this.getUnitsArray(i);
                    LandXMLImpl.this.removeUnits(i);
                    return old;
                }
                
                public int size()
                    { return LandXMLImpl.this.sizeOfUnitsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new UnitsList();
            }
        }
        
        /**
         * Gets array of all "Units" elements
         */
        public org.landxml.schema.landXML11.UnitsDocument.Units[] getUnitsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(UNITS$0, targetList);
                org.landxml.schema.landXML11.UnitsDocument.Units[] result = new org.landxml.schema.landXML11.UnitsDocument.Units[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Units" element
         */
        public org.landxml.schema.landXML11.UnitsDocument.Units getUnitsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.UnitsDocument.Units target = null;
                target = (org.landxml.schema.landXML11.UnitsDocument.Units)get_store().find_element_user(UNITS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Units" element
         */
        public int sizeOfUnitsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UNITS$0);
            }
        }
        
        /**
         * Sets array of all "Units" element
         */
        public void setUnitsArray(org.landxml.schema.landXML11.UnitsDocument.Units[] unitsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(unitsArray, UNITS$0);
            }
        }
        
        /**
         * Sets ith "Units" element
         */
        public void setUnitsArray(int i, org.landxml.schema.landXML11.UnitsDocument.Units units)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.UnitsDocument.Units target = null;
                target = (org.landxml.schema.landXML11.UnitsDocument.Units)get_store().find_element_user(UNITS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(units);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Units" element
         */
        public org.landxml.schema.landXML11.UnitsDocument.Units insertNewUnits(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.UnitsDocument.Units target = null;
                target = (org.landxml.schema.landXML11.UnitsDocument.Units)get_store().insert_element_user(UNITS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Units" element
         */
        public org.landxml.schema.landXML11.UnitsDocument.Units addNewUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.UnitsDocument.Units target = null;
                target = (org.landxml.schema.landXML11.UnitsDocument.Units)get_store().add_element_user(UNITS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Units" element
         */
        public void removeUnits(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UNITS$0, i);
            }
        }
        
        /**
         * Gets a List of "CoordinateSystem" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem> getCoordinateSystemList()
        {
            final class CoordinateSystemList extends java.util.AbstractList<org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem>
            {
                public org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem get(int i)
                    { return LandXMLImpl.this.getCoordinateSystemArray(i); }
                
                public org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem set(int i, org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem o)
                {
                    org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem old = LandXMLImpl.this.getCoordinateSystemArray(i);
                    LandXMLImpl.this.setCoordinateSystemArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem o)
                    { LandXMLImpl.this.insertNewCoordinateSystem(i).set(o); }
                
                public org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem remove(int i)
                {
                    org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem old = LandXMLImpl.this.getCoordinateSystemArray(i);
                    LandXMLImpl.this.removeCoordinateSystem(i);
                    return old;
                }
                
                public int size()
                    { return LandXMLImpl.this.sizeOfCoordinateSystemArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CoordinateSystemList();
            }
        }
        
        /**
         * Gets array of all "CoordinateSystem" elements
         */
        public org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem[] getCoordinateSystemArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COORDINATESYSTEM$2, targetList);
                org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem[] result = new org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CoordinateSystem" element
         */
        public org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem getCoordinateSystemArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem target = null;
                target = (org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem)get_store().find_element_user(COORDINATESYSTEM$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CoordinateSystem" element
         */
        public int sizeOfCoordinateSystemArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COORDINATESYSTEM$2);
            }
        }
        
        /**
         * Sets array of all "CoordinateSystem" element
         */
        public void setCoordinateSystemArray(org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem[] coordinateSystemArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(coordinateSystemArray, COORDINATESYSTEM$2);
            }
        }
        
        /**
         * Sets ith "CoordinateSystem" element
         */
        public void setCoordinateSystemArray(int i, org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem coordinateSystem)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem target = null;
                target = (org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem)get_store().find_element_user(COORDINATESYSTEM$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(coordinateSystem);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CoordinateSystem" element
         */
        public org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem insertNewCoordinateSystem(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem target = null;
                target = (org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem)get_store().insert_element_user(COORDINATESYSTEM$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CoordinateSystem" element
         */
        public org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem addNewCoordinateSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem target = null;
                target = (org.landxml.schema.landXML11.CoordinateSystemDocument.CoordinateSystem)get_store().add_element_user(COORDINATESYSTEM$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "CoordinateSystem" element
         */
        public void removeCoordinateSystem(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COORDINATESYSTEM$2, i);
            }
        }
        
        /**
         * Gets a List of "Project" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ProjectDocument.Project> getProjectList()
        {
            final class ProjectList extends java.util.AbstractList<org.landxml.schema.landXML11.ProjectDocument.Project>
            {
                public org.landxml.schema.landXML11.ProjectDocument.Project get(int i)
                    { return LandXMLImpl.this.getProjectArray(i); }
                
                public org.landxml.schema.landXML11.ProjectDocument.Project set(int i, org.landxml.schema.landXML11.ProjectDocument.Project o)
                {
                    org.landxml.schema.landXML11.ProjectDocument.Project old = LandXMLImpl.this.getProjectArray(i);
                    LandXMLImpl.this.setProjectArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ProjectDocument.Project o)
                    { LandXMLImpl.this.insertNewProject(i).set(o); }
                
                public org.landxml.schema.landXML11.ProjectDocument.Project remove(int i)
                {
                    org.landxml.schema.landXML11.ProjectDocument.Project old = LandXMLImpl.this.getProjectArray(i);
                    LandXMLImpl.this.removeProject(i);
                    return old;
                }
                
                public int size()
                    { return LandXMLImpl.this.sizeOfProjectArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ProjectList();
            }
        }
        
        /**
         * Gets array of all "Project" elements
         */
        public org.landxml.schema.landXML11.ProjectDocument.Project[] getProjectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROJECT$4, targetList);
                org.landxml.schema.landXML11.ProjectDocument.Project[] result = new org.landxml.schema.landXML11.ProjectDocument.Project[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Project" element
         */
        public org.landxml.schema.landXML11.ProjectDocument.Project getProjectArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ProjectDocument.Project target = null;
                target = (org.landxml.schema.landXML11.ProjectDocument.Project)get_store().find_element_user(PROJECT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Project" element
         */
        public int sizeOfProjectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROJECT$4);
            }
        }
        
        /**
         * Sets array of all "Project" element
         */
        public void setProjectArray(org.landxml.schema.landXML11.ProjectDocument.Project[] projectArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(projectArray, PROJECT$4);
            }
        }
        
        /**
         * Sets ith "Project" element
         */
        public void setProjectArray(int i, org.landxml.schema.landXML11.ProjectDocument.Project project)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ProjectDocument.Project target = null;
                target = (org.landxml.schema.landXML11.ProjectDocument.Project)get_store().find_element_user(PROJECT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(project);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Project" element
         */
        public org.landxml.schema.landXML11.ProjectDocument.Project insertNewProject(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ProjectDocument.Project target = null;
                target = (org.landxml.schema.landXML11.ProjectDocument.Project)get_store().insert_element_user(PROJECT$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Project" element
         */
        public org.landxml.schema.landXML11.ProjectDocument.Project addNewProject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ProjectDocument.Project target = null;
                target = (org.landxml.schema.landXML11.ProjectDocument.Project)get_store().add_element_user(PROJECT$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "Project" element
         */
        public void removeProject(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROJECT$4, i);
            }
        }
        
        /**
         * Gets a List of "Application" elements
         */
        public java.util.List<org.landxml.schema.landXML11.ApplicationDocument.Application> getApplicationList()
        {
            final class ApplicationList extends java.util.AbstractList<org.landxml.schema.landXML11.ApplicationDocument.Application>
            {
                public org.landxml.schema.landXML11.ApplicationDocument.Application get(int i)
                    { return LandXMLImpl.this.getApplicationArray(i); }
                
                public org.landxml.schema.landXML11.ApplicationDocument.Application set(int i, org.landxml.schema.landXML11.ApplicationDocument.Application o)
                {
                    org.landxml.schema.landXML11.ApplicationDocument.Application old = LandXMLImpl.this.getApplicationArray(i);
                    LandXMLImpl.this.setApplicationArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ApplicationDocument.Application o)
                    { LandXMLImpl.this.insertNewApplication(i).set(o); }
                
                public org.landxml.schema.landXML11.ApplicationDocument.Application remove(int i)
                {
                    org.landxml.schema.landXML11.ApplicationDocument.Application old = LandXMLImpl.this.getApplicationArray(i);
                    LandXMLImpl.this.removeApplication(i);
                    return old;
                }
                
                public int size()
                    { return LandXMLImpl.this.sizeOfApplicationArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ApplicationList();
            }
        }
        
        /**
         * Gets array of all "Application" elements
         */
        public org.landxml.schema.landXML11.ApplicationDocument.Application[] getApplicationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(APPLICATION$6, targetList);
                org.landxml.schema.landXML11.ApplicationDocument.Application[] result = new org.landxml.schema.landXML11.ApplicationDocument.Application[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Application" element
         */
        public org.landxml.schema.landXML11.ApplicationDocument.Application getApplicationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ApplicationDocument.Application target = null;
                target = (org.landxml.schema.landXML11.ApplicationDocument.Application)get_store().find_element_user(APPLICATION$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Application" element
         */
        public int sizeOfApplicationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(APPLICATION$6);
            }
        }
        
        /**
         * Sets array of all "Application" element
         */
        public void setApplicationArray(org.landxml.schema.landXML11.ApplicationDocument.Application[] applicationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(applicationArray, APPLICATION$6);
            }
        }
        
        /**
         * Sets ith "Application" element
         */
        public void setApplicationArray(int i, org.landxml.schema.landXML11.ApplicationDocument.Application application)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ApplicationDocument.Application target = null;
                target = (org.landxml.schema.landXML11.ApplicationDocument.Application)get_store().find_element_user(APPLICATION$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(application);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Application" element
         */
        public org.landxml.schema.landXML11.ApplicationDocument.Application insertNewApplication(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ApplicationDocument.Application target = null;
                target = (org.landxml.schema.landXML11.ApplicationDocument.Application)get_store().insert_element_user(APPLICATION$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Application" element
         */
        public org.landxml.schema.landXML11.ApplicationDocument.Application addNewApplication()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.ApplicationDocument.Application target = null;
                target = (org.landxml.schema.landXML11.ApplicationDocument.Application)get_store().add_element_user(APPLICATION$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "Application" element
         */
        public void removeApplication(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(APPLICATION$6, i);
            }
        }
        
        /**
         * Gets a List of "Alignments" elements
         */
        public java.util.List<org.landxml.schema.landXML11.AlignmentsDocument.Alignments> getAlignmentsList()
        {
            final class AlignmentsList extends java.util.AbstractList<org.landxml.schema.landXML11.AlignmentsDocument.Alignments>
            {
                public org.landxml.schema.landXML11.AlignmentsDocument.Alignments get(int i)
                    { return LandXMLImpl.this.getAlignmentsArray(i); }
                
                public org.landxml.schema.landXML11.AlignmentsDocument.Alignments set(int i, org.landxml.schema.landXML11.AlignmentsDocument.Alignments o)
                {
                    org.landxml.schema.landXML11.AlignmentsDocument.Alignments old = LandXMLImpl.this.getAlignmentsArray(i);
                    LandXMLImpl.this.setAlignmentsArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.AlignmentsDocument.Alignments o)
                    { LandXMLImpl.this.insertNewAlignments(i).set(o); }
                
                public org.landxml.schema.landXML11.AlignmentsDocument.Alignments remove(int i)
                {
                    org.landxml.schema.landXML11.AlignmentsDocument.Alignments old = LandXMLImpl.this.getAlignmentsArray(i);
                    LandXMLImpl.this.removeAlignments(i);
                    return old;
                }
                
                public int size()
                    { return LandXMLImpl.this.sizeOfAlignmentsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new AlignmentsList();
            }
        }
        
        /**
         * Gets array of all "Alignments" elements
         */
        public org.landxml.schema.landXML11.AlignmentsDocument.Alignments[] getAlignmentsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALIGNMENTS$8, targetList);
                org.landxml.schema.landXML11.AlignmentsDocument.Alignments[] result = new org.landxml.schema.landXML11.AlignmentsDocument.Alignments[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Alignments" element
         */
        public org.landxml.schema.landXML11.AlignmentsDocument.Alignments getAlignmentsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignmentsDocument.Alignments target = null;
                target = (org.landxml.schema.landXML11.AlignmentsDocument.Alignments)get_store().find_element_user(ALIGNMENTS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Alignments" element
         */
        public int sizeOfAlignmentsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALIGNMENTS$8);
            }
        }
        
        /**
         * Sets array of all "Alignments" element
         */
        public void setAlignmentsArray(org.landxml.schema.landXML11.AlignmentsDocument.Alignments[] alignmentsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(alignmentsArray, ALIGNMENTS$8);
            }
        }
        
        /**
         * Sets ith "Alignments" element
         */
        public void setAlignmentsArray(int i, org.landxml.schema.landXML11.AlignmentsDocument.Alignments alignments)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignmentsDocument.Alignments target = null;
                target = (org.landxml.schema.landXML11.AlignmentsDocument.Alignments)get_store().find_element_user(ALIGNMENTS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(alignments);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Alignments" element
         */
        public org.landxml.schema.landXML11.AlignmentsDocument.Alignments insertNewAlignments(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignmentsDocument.Alignments target = null;
                target = (org.landxml.schema.landXML11.AlignmentsDocument.Alignments)get_store().insert_element_user(ALIGNMENTS$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Alignments" element
         */
        public org.landxml.schema.landXML11.AlignmentsDocument.Alignments addNewAlignments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AlignmentsDocument.Alignments target = null;
                target = (org.landxml.schema.landXML11.AlignmentsDocument.Alignments)get_store().add_element_user(ALIGNMENTS$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "Alignments" element
         */
        public void removeAlignments(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALIGNMENTS$8, i);
            }
        }
        
        /**
         * Gets a List of "CgPoints" elements
         */
        public java.util.List<org.landxml.schema.landXML11.CgPointsDocument.CgPoints> getCgPointsList()
        {
            final class CgPointsList extends java.util.AbstractList<org.landxml.schema.landXML11.CgPointsDocument.CgPoints>
            {
                public org.landxml.schema.landXML11.CgPointsDocument.CgPoints get(int i)
                    { return LandXMLImpl.this.getCgPointsArray(i); }
                
                public org.landxml.schema.landXML11.CgPointsDocument.CgPoints set(int i, org.landxml.schema.landXML11.CgPointsDocument.CgPoints o)
                {
                    org.landxml.schema.landXML11.CgPointsDocument.CgPoints old = LandXMLImpl.this.getCgPointsArray(i);
                    LandXMLImpl.this.setCgPointsArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.CgPointsDocument.CgPoints o)
                    { LandXMLImpl.this.insertNewCgPoints(i).set(o); }
                
                public org.landxml.schema.landXML11.CgPointsDocument.CgPoints remove(int i)
                {
                    org.landxml.schema.landXML11.CgPointsDocument.CgPoints old = LandXMLImpl.this.getCgPointsArray(i);
                    LandXMLImpl.this.removeCgPoints(i);
                    return old;
                }
                
                public int size()
                    { return LandXMLImpl.this.sizeOfCgPointsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CgPointsList();
            }
        }
        
        /**
         * Gets array of all "CgPoints" elements
         */
        public org.landxml.schema.landXML11.CgPointsDocument.CgPoints[] getCgPointsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CGPOINTS$10, targetList);
                org.landxml.schema.landXML11.CgPointsDocument.CgPoints[] result = new org.landxml.schema.landXML11.CgPointsDocument.CgPoints[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CgPoints" element
         */
        public org.landxml.schema.landXML11.CgPointsDocument.CgPoints getCgPointsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CgPointsDocument.CgPoints target = null;
                target = (org.landxml.schema.landXML11.CgPointsDocument.CgPoints)get_store().find_element_user(CGPOINTS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CgPoints" element
         */
        public int sizeOfCgPointsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CGPOINTS$10);
            }
        }
        
        /**
         * Sets array of all "CgPoints" element
         */
        public void setCgPointsArray(org.landxml.schema.landXML11.CgPointsDocument.CgPoints[] cgPointsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(cgPointsArray, CGPOINTS$10);
            }
        }
        
        /**
         * Sets ith "CgPoints" element
         */
        public void setCgPointsArray(int i, org.landxml.schema.landXML11.CgPointsDocument.CgPoints cgPoints)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CgPointsDocument.CgPoints target = null;
                target = (org.landxml.schema.landXML11.CgPointsDocument.CgPoints)get_store().find_element_user(CGPOINTS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(cgPoints);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CgPoints" element
         */
        public org.landxml.schema.landXML11.CgPointsDocument.CgPoints insertNewCgPoints(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CgPointsDocument.CgPoints target = null;
                target = (org.landxml.schema.landXML11.CgPointsDocument.CgPoints)get_store().insert_element_user(CGPOINTS$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CgPoints" element
         */
        public org.landxml.schema.landXML11.CgPointsDocument.CgPoints addNewCgPoints()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.CgPointsDocument.CgPoints target = null;
                target = (org.landxml.schema.landXML11.CgPointsDocument.CgPoints)get_store().add_element_user(CGPOINTS$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "CgPoints" element
         */
        public void removeCgPoints(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CGPOINTS$10, i);
            }
        }
        
        /**
         * Gets a List of "Amendment" elements
         */
        public java.util.List<org.landxml.schema.landXML11.AmendmentDocument.Amendment> getAmendmentList()
        {
            final class AmendmentList extends java.util.AbstractList<org.landxml.schema.landXML11.AmendmentDocument.Amendment>
            {
                public org.landxml.schema.landXML11.AmendmentDocument.Amendment get(int i)
                    { return LandXMLImpl.this.getAmendmentArray(i); }
                
                public org.landxml.schema.landXML11.AmendmentDocument.Amendment set(int i, org.landxml.schema.landXML11.AmendmentDocument.Amendment o)
                {
                    org.landxml.schema.landXML11.AmendmentDocument.Amendment old = LandXMLImpl.this.getAmendmentArray(i);
                    LandXMLImpl.this.setAmendmentArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.AmendmentDocument.Amendment o)
                    { LandXMLImpl.this.insertNewAmendment(i).set(o); }
                
                public org.landxml.schema.landXML11.AmendmentDocument.Amendment remove(int i)
                {
                    org.landxml.schema.landXML11.AmendmentDocument.Amendment old = LandXMLImpl.this.getAmendmentArray(i);
                    LandXMLImpl.this.removeAmendment(i);
                    return old;
                }
                
                public int size()
                    { return LandXMLImpl.this.sizeOfAmendmentArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new AmendmentList();
            }
        }
        
        /**
         * Gets array of all "Amendment" elements
         */
        public org.landxml.schema.landXML11.AmendmentDocument.Amendment[] getAmendmentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(AMENDMENT$12, targetList);
                org.landxml.schema.landXML11.AmendmentDocument.Amendment[] result = new org.landxml.schema.landXML11.AmendmentDocument.Amendment[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Amendment" element
         */
        public org.landxml.schema.landXML11.AmendmentDocument.Amendment getAmendmentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AmendmentDocument.Amendment target = null;
                target = (org.landxml.schema.landXML11.AmendmentDocument.Amendment)get_store().find_element_user(AMENDMENT$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Amendment" element
         */
        public int sizeOfAmendmentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AMENDMENT$12);
            }
        }
        
        /**
         * Sets array of all "Amendment" element
         */
        public void setAmendmentArray(org.landxml.schema.landXML11.AmendmentDocument.Amendment[] amendmentArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(amendmentArray, AMENDMENT$12);
            }
        }
        
        /**
         * Sets ith "Amendment" element
         */
        public void setAmendmentArray(int i, org.landxml.schema.landXML11.AmendmentDocument.Amendment amendment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AmendmentDocument.Amendment target = null;
                target = (org.landxml.schema.landXML11.AmendmentDocument.Amendment)get_store().find_element_user(AMENDMENT$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(amendment);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Amendment" element
         */
        public org.landxml.schema.landXML11.AmendmentDocument.Amendment insertNewAmendment(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AmendmentDocument.Amendment target = null;
                target = (org.landxml.schema.landXML11.AmendmentDocument.Amendment)get_store().insert_element_user(AMENDMENT$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Amendment" element
         */
        public org.landxml.schema.landXML11.AmendmentDocument.Amendment addNewAmendment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.AmendmentDocument.Amendment target = null;
                target = (org.landxml.schema.landXML11.AmendmentDocument.Amendment)get_store().add_element_user(AMENDMENT$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "Amendment" element
         */
        public void removeAmendment(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AMENDMENT$12, i);
            }
        }
        
        /**
         * Gets a List of "GradeModel" elements
         */
        public java.util.List<org.landxml.schema.landXML11.GradeModelDocument.GradeModel> getGradeModelList()
        {
            final class GradeModelList extends java.util.AbstractList<org.landxml.schema.landXML11.GradeModelDocument.GradeModel>
            {
                public org.landxml.schema.landXML11.GradeModelDocument.GradeModel get(int i)
                    { return LandXMLImpl.this.getGradeModelArray(i); }
                
                public org.landxml.schema.landXML11.GradeModelDocument.GradeModel set(int i, org.landxml.schema.landXML11.GradeModelDocument.GradeModel o)
                {
                    org.landxml.schema.landXML11.GradeModelDocument.GradeModel old = LandXMLImpl.this.getGradeModelArray(i);
                    LandXMLImpl.this.setGradeModelArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.GradeModelDocument.GradeModel o)
                    { LandXMLImpl.this.insertNewGradeModel(i).set(o); }
                
                public org.landxml.schema.landXML11.GradeModelDocument.GradeModel remove(int i)
                {
                    org.landxml.schema.landXML11.GradeModelDocument.GradeModel old = LandXMLImpl.this.getGradeModelArray(i);
                    LandXMLImpl.this.removeGradeModel(i);
                    return old;
                }
                
                public int size()
                    { return LandXMLImpl.this.sizeOfGradeModelArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new GradeModelList();
            }
        }
        
        /**
         * Gets array of all "GradeModel" elements
         */
        public org.landxml.schema.landXML11.GradeModelDocument.GradeModel[] getGradeModelArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GRADEMODEL$14, targetList);
                org.landxml.schema.landXML11.GradeModelDocument.GradeModel[] result = new org.landxml.schema.landXML11.GradeModelDocument.GradeModel[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "GradeModel" element
         */
        public org.landxml.schema.landXML11.GradeModelDocument.GradeModel getGradeModelArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GradeModelDocument.GradeModel target = null;
                target = (org.landxml.schema.landXML11.GradeModelDocument.GradeModel)get_store().find_element_user(GRADEMODEL$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "GradeModel" element
         */
        public int sizeOfGradeModelArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GRADEMODEL$14);
            }
        }
        
        /**
         * Sets array of all "GradeModel" element
         */
        public void setGradeModelArray(org.landxml.schema.landXML11.GradeModelDocument.GradeModel[] gradeModelArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(gradeModelArray, GRADEMODEL$14);
            }
        }
        
        /**
         * Sets ith "GradeModel" element
         */
        public void setGradeModelArray(int i, org.landxml.schema.landXML11.GradeModelDocument.GradeModel gradeModel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GradeModelDocument.GradeModel target = null;
                target = (org.landxml.schema.landXML11.GradeModelDocument.GradeModel)get_store().find_element_user(GRADEMODEL$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(gradeModel);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GradeModel" element
         */
        public org.landxml.schema.landXML11.GradeModelDocument.GradeModel insertNewGradeModel(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GradeModelDocument.GradeModel target = null;
                target = (org.landxml.schema.landXML11.GradeModelDocument.GradeModel)get_store().insert_element_user(GRADEMODEL$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GradeModel" element
         */
        public org.landxml.schema.landXML11.GradeModelDocument.GradeModel addNewGradeModel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.GradeModelDocument.GradeModel target = null;
                target = (org.landxml.schema.landXML11.GradeModelDocument.GradeModel)get_store().add_element_user(GRADEMODEL$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "GradeModel" element
         */
        public void removeGradeModel(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GRADEMODEL$14, i);
            }
        }
        
        /**
         * Gets a List of "Monuments" elements
         */
        public java.util.List<org.landxml.schema.landXML11.MonumentsDocument.Monuments> getMonumentsList()
        {
            final class MonumentsList extends java.util.AbstractList<org.landxml.schema.landXML11.MonumentsDocument.Monuments>
            {
                public org.landxml.schema.landXML11.MonumentsDocument.Monuments get(int i)
                    { return LandXMLImpl.this.getMonumentsArray(i); }
                
                public org.landxml.schema.landXML11.MonumentsDocument.Monuments set(int i, org.landxml.schema.landXML11.MonumentsDocument.Monuments o)
                {
                    org.landxml.schema.landXML11.MonumentsDocument.Monuments old = LandXMLImpl.this.getMonumentsArray(i);
                    LandXMLImpl.this.setMonumentsArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.MonumentsDocument.Monuments o)
                    { LandXMLImpl.this.insertNewMonuments(i).set(o); }
                
                public org.landxml.schema.landXML11.MonumentsDocument.Monuments remove(int i)
                {
                    org.landxml.schema.landXML11.MonumentsDocument.Monuments old = LandXMLImpl.this.getMonumentsArray(i);
                    LandXMLImpl.this.removeMonuments(i);
                    return old;
                }
                
                public int size()
                    { return LandXMLImpl.this.sizeOfMonumentsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new MonumentsList();
            }
        }
        
        /**
         * Gets array of all "Monuments" elements
         */
        public org.landxml.schema.landXML11.MonumentsDocument.Monuments[] getMonumentsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MONUMENTS$16, targetList);
                org.landxml.schema.landXML11.MonumentsDocument.Monuments[] result = new org.landxml.schema.landXML11.MonumentsDocument.Monuments[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Monuments" element
         */
        public org.landxml.schema.landXML11.MonumentsDocument.Monuments getMonumentsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentsDocument.Monuments target = null;
                target = (org.landxml.schema.landXML11.MonumentsDocument.Monuments)get_store().find_element_user(MONUMENTS$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Monuments" element
         */
        public int sizeOfMonumentsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MONUMENTS$16);
            }
        }
        
        /**
         * Sets array of all "Monuments" element
         */
        public void setMonumentsArray(org.landxml.schema.landXML11.MonumentsDocument.Monuments[] monumentsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(monumentsArray, MONUMENTS$16);
            }
        }
        
        /**
         * Sets ith "Monuments" element
         */
        public void setMonumentsArray(int i, org.landxml.schema.landXML11.MonumentsDocument.Monuments monuments)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentsDocument.Monuments target = null;
                target = (org.landxml.schema.landXML11.MonumentsDocument.Monuments)get_store().find_element_user(MONUMENTS$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(monuments);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Monuments" element
         */
        public org.landxml.schema.landXML11.MonumentsDocument.Monuments insertNewMonuments(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentsDocument.Monuments target = null;
                target = (org.landxml.schema.landXML11.MonumentsDocument.Monuments)get_store().insert_element_user(MONUMENTS$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Monuments" element
         */
        public org.landxml.schema.landXML11.MonumentsDocument.Monuments addNewMonuments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.MonumentsDocument.Monuments target = null;
                target = (org.landxml.schema.landXML11.MonumentsDocument.Monuments)get_store().add_element_user(MONUMENTS$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "Monuments" element
         */
        public void removeMonuments(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MONUMENTS$16, i);
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
                    { return LandXMLImpl.this.getParcelsArray(i); }
                
                public org.landxml.schema.landXML11.ParcelsDocument.Parcels set(int i, org.landxml.schema.landXML11.ParcelsDocument.Parcels o)
                {
                    org.landxml.schema.landXML11.ParcelsDocument.Parcels old = LandXMLImpl.this.getParcelsArray(i);
                    LandXMLImpl.this.setParcelsArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.ParcelsDocument.Parcels o)
                    { LandXMLImpl.this.insertNewParcels(i).set(o); }
                
                public org.landxml.schema.landXML11.ParcelsDocument.Parcels remove(int i)
                {
                    org.landxml.schema.landXML11.ParcelsDocument.Parcels old = LandXMLImpl.this.getParcelsArray(i);
                    LandXMLImpl.this.removeParcels(i);
                    return old;
                }
                
                public int size()
                    { return LandXMLImpl.this.sizeOfParcelsArray(); }
                
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
                get_store().find_all_element_users(PARCELS$18, targetList);
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
                target = (org.landxml.schema.landXML11.ParcelsDocument.Parcels)get_store().find_element_user(PARCELS$18, i);
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
                return get_store().count_elements(PARCELS$18);
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
                arraySetterHelper(parcelsArray, PARCELS$18);
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
                target = (org.landxml.schema.landXML11.ParcelsDocument.Parcels)get_store().find_element_user(PARCELS$18, i);
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
                target = (org.landxml.schema.landXML11.ParcelsDocument.Parcels)get_store().insert_element_user(PARCELS$18, i);
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
                target = (org.landxml.schema.landXML11.ParcelsDocument.Parcels)get_store().add_element_user(PARCELS$18);
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
                get_store().remove_element(PARCELS$18, i);
            }
        }
        
        /**
         * Gets a List of "PlanFeatures" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures> getPlanFeaturesList()
        {
            final class PlanFeaturesList extends java.util.AbstractList<org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures>
            {
                public org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures get(int i)
                    { return LandXMLImpl.this.getPlanFeaturesArray(i); }
                
                public org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures set(int i, org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures o)
                {
                    org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures old = LandXMLImpl.this.getPlanFeaturesArray(i);
                    LandXMLImpl.this.setPlanFeaturesArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures o)
                    { LandXMLImpl.this.insertNewPlanFeatures(i).set(o); }
                
                public org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures remove(int i)
                {
                    org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures old = LandXMLImpl.this.getPlanFeaturesArray(i);
                    LandXMLImpl.this.removePlanFeatures(i);
                    return old;
                }
                
                public int size()
                    { return LandXMLImpl.this.sizeOfPlanFeaturesArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PlanFeaturesList();
            }
        }
        
        /**
         * Gets array of all "PlanFeatures" elements
         */
        public org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures[] getPlanFeaturesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PLANFEATURES$20, targetList);
                org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures[] result = new org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PlanFeatures" element
         */
        public org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures getPlanFeaturesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures target = null;
                target = (org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures)get_store().find_element_user(PLANFEATURES$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PlanFeatures" element
         */
        public int sizeOfPlanFeaturesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PLANFEATURES$20);
            }
        }
        
        /**
         * Sets array of all "PlanFeatures" element
         */
        public void setPlanFeaturesArray(org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures[] planFeaturesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(planFeaturesArray, PLANFEATURES$20);
            }
        }
        
        /**
         * Sets ith "PlanFeatures" element
         */
        public void setPlanFeaturesArray(int i, org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures planFeatures)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures target = null;
                target = (org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures)get_store().find_element_user(PLANFEATURES$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(planFeatures);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PlanFeatures" element
         */
        public org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures insertNewPlanFeatures(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures target = null;
                target = (org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures)get_store().insert_element_user(PLANFEATURES$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PlanFeatures" element
         */
        public org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures addNewPlanFeatures()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures target = null;
                target = (org.landxml.schema.landXML11.PlanFeaturesDocument.PlanFeatures)get_store().add_element_user(PLANFEATURES$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "PlanFeatures" element
         */
        public void removePlanFeatures(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PLANFEATURES$20, i);
            }
        }
        
        /**
         * Gets a List of "PipeNetworks" elements
         */
        public java.util.List<org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks> getPipeNetworksList()
        {
            final class PipeNetworksList extends java.util.AbstractList<org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks>
            {
                public org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks get(int i)
                    { return LandXMLImpl.this.getPipeNetworksArray(i); }
                
                public org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks set(int i, org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks o)
                {
                    org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks old = LandXMLImpl.this.getPipeNetworksArray(i);
                    LandXMLImpl.this.setPipeNetworksArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks o)
                    { LandXMLImpl.this.insertNewPipeNetworks(i).set(o); }
                
                public org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks remove(int i)
                {
                    org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks old = LandXMLImpl.this.getPipeNetworksArray(i);
                    LandXMLImpl.this.removePipeNetworks(i);
                    return old;
                }
                
                public int size()
                    { return LandXMLImpl.this.sizeOfPipeNetworksArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PipeNetworksList();
            }
        }
        
        /**
         * Gets array of all "PipeNetworks" elements
         */
        public org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks[] getPipeNetworksArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PIPENETWORKS$22, targetList);
                org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks[] result = new org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PipeNetworks" element
         */
        public org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks getPipeNetworksArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks target = null;
                target = (org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks)get_store().find_element_user(PIPENETWORKS$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PipeNetworks" element
         */
        public int sizeOfPipeNetworksArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PIPENETWORKS$22);
            }
        }
        
        /**
         * Sets array of all "PipeNetworks" element
         */
        public void setPipeNetworksArray(org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks[] pipeNetworksArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pipeNetworksArray, PIPENETWORKS$22);
            }
        }
        
        /**
         * Sets ith "PipeNetworks" element
         */
        public void setPipeNetworksArray(int i, org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks pipeNetworks)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks target = null;
                target = (org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks)get_store().find_element_user(PIPENETWORKS$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(pipeNetworks);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PipeNetworks" element
         */
        public org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks insertNewPipeNetworks(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks target = null;
                target = (org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks)get_store().insert_element_user(PIPENETWORKS$22, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PipeNetworks" element
         */
        public org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks addNewPipeNetworks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks target = null;
                target = (org.landxml.schema.landXML11.PipeNetworksDocument.PipeNetworks)get_store().add_element_user(PIPENETWORKS$22);
                return target;
            }
        }
        
        /**
         * Removes the ith "PipeNetworks" element
         */
        public void removePipeNetworks(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PIPENETWORKS$22, i);
            }
        }
        
        /**
         * Gets a List of "Roadways" elements
         */
        public java.util.List<org.landxml.schema.landXML11.RoadwaysDocument.Roadways> getRoadwaysList()
        {
            final class RoadwaysList extends java.util.AbstractList<org.landxml.schema.landXML11.RoadwaysDocument.Roadways>
            {
                public org.landxml.schema.landXML11.RoadwaysDocument.Roadways get(int i)
                    { return LandXMLImpl.this.getRoadwaysArray(i); }
                
                public org.landxml.schema.landXML11.RoadwaysDocument.Roadways set(int i, org.landxml.schema.landXML11.RoadwaysDocument.Roadways o)
                {
                    org.landxml.schema.landXML11.RoadwaysDocument.Roadways old = LandXMLImpl.this.getRoadwaysArray(i);
                    LandXMLImpl.this.setRoadwaysArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.RoadwaysDocument.Roadways o)
                    { LandXMLImpl.this.insertNewRoadways(i).set(o); }
                
                public org.landxml.schema.landXML11.RoadwaysDocument.Roadways remove(int i)
                {
                    org.landxml.schema.landXML11.RoadwaysDocument.Roadways old = LandXMLImpl.this.getRoadwaysArray(i);
                    LandXMLImpl.this.removeRoadways(i);
                    return old;
                }
                
                public int size()
                    { return LandXMLImpl.this.sizeOfRoadwaysArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RoadwaysList();
            }
        }
        
        /**
         * Gets array of all "Roadways" elements
         */
        public org.landxml.schema.landXML11.RoadwaysDocument.Roadways[] getRoadwaysArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ROADWAYS$24, targetList);
                org.landxml.schema.landXML11.RoadwaysDocument.Roadways[] result = new org.landxml.schema.landXML11.RoadwaysDocument.Roadways[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Roadways" element
         */
        public org.landxml.schema.landXML11.RoadwaysDocument.Roadways getRoadwaysArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadwaysDocument.Roadways target = null;
                target = (org.landxml.schema.landXML11.RoadwaysDocument.Roadways)get_store().find_element_user(ROADWAYS$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Roadways" element
         */
        public int sizeOfRoadwaysArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROADWAYS$24);
            }
        }
        
        /**
         * Sets array of all "Roadways" element
         */
        public void setRoadwaysArray(org.landxml.schema.landXML11.RoadwaysDocument.Roadways[] roadwaysArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(roadwaysArray, ROADWAYS$24);
            }
        }
        
        /**
         * Sets ith "Roadways" element
         */
        public void setRoadwaysArray(int i, org.landxml.schema.landXML11.RoadwaysDocument.Roadways roadways)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadwaysDocument.Roadways target = null;
                target = (org.landxml.schema.landXML11.RoadwaysDocument.Roadways)get_store().find_element_user(ROADWAYS$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(roadways);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Roadways" element
         */
        public org.landxml.schema.landXML11.RoadwaysDocument.Roadways insertNewRoadways(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadwaysDocument.Roadways target = null;
                target = (org.landxml.schema.landXML11.RoadwaysDocument.Roadways)get_store().insert_element_user(ROADWAYS$24, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Roadways" element
         */
        public org.landxml.schema.landXML11.RoadwaysDocument.Roadways addNewRoadways()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.RoadwaysDocument.Roadways target = null;
                target = (org.landxml.schema.landXML11.RoadwaysDocument.Roadways)get_store().add_element_user(ROADWAYS$24);
                return target;
            }
        }
        
        /**
         * Removes the ith "Roadways" element
         */
        public void removeRoadways(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROADWAYS$24, i);
            }
        }
        
        /**
         * Gets a List of "Surfaces" elements
         */
        public java.util.List<org.landxml.schema.landXML11.SurfacesDocument.Surfaces> getSurfacesList()
        {
            final class SurfacesList extends java.util.AbstractList<org.landxml.schema.landXML11.SurfacesDocument.Surfaces>
            {
                public org.landxml.schema.landXML11.SurfacesDocument.Surfaces get(int i)
                    { return LandXMLImpl.this.getSurfacesArray(i); }
                
                public org.landxml.schema.landXML11.SurfacesDocument.Surfaces set(int i, org.landxml.schema.landXML11.SurfacesDocument.Surfaces o)
                {
                    org.landxml.schema.landXML11.SurfacesDocument.Surfaces old = LandXMLImpl.this.getSurfacesArray(i);
                    LandXMLImpl.this.setSurfacesArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.SurfacesDocument.Surfaces o)
                    { LandXMLImpl.this.insertNewSurfaces(i).set(o); }
                
                public org.landxml.schema.landXML11.SurfacesDocument.Surfaces remove(int i)
                {
                    org.landxml.schema.landXML11.SurfacesDocument.Surfaces old = LandXMLImpl.this.getSurfacesArray(i);
                    LandXMLImpl.this.removeSurfaces(i);
                    return old;
                }
                
                public int size()
                    { return LandXMLImpl.this.sizeOfSurfacesArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SurfacesList();
            }
        }
        
        /**
         * Gets array of all "Surfaces" elements
         */
        public org.landxml.schema.landXML11.SurfacesDocument.Surfaces[] getSurfacesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SURFACES$26, targetList);
                org.landxml.schema.landXML11.SurfacesDocument.Surfaces[] result = new org.landxml.schema.landXML11.SurfacesDocument.Surfaces[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Surfaces" element
         */
        public org.landxml.schema.landXML11.SurfacesDocument.Surfaces getSurfacesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfacesDocument.Surfaces target = null;
                target = (org.landxml.schema.landXML11.SurfacesDocument.Surfaces)get_store().find_element_user(SURFACES$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Surfaces" element
         */
        public int sizeOfSurfacesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SURFACES$26);
            }
        }
        
        /**
         * Sets array of all "Surfaces" element
         */
        public void setSurfacesArray(org.landxml.schema.landXML11.SurfacesDocument.Surfaces[] surfacesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(surfacesArray, SURFACES$26);
            }
        }
        
        /**
         * Sets ith "Surfaces" element
         */
        public void setSurfacesArray(int i, org.landxml.schema.landXML11.SurfacesDocument.Surfaces surfaces)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfacesDocument.Surfaces target = null;
                target = (org.landxml.schema.landXML11.SurfacesDocument.Surfaces)get_store().find_element_user(SURFACES$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(surfaces);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Surfaces" element
         */
        public org.landxml.schema.landXML11.SurfacesDocument.Surfaces insertNewSurfaces(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfacesDocument.Surfaces target = null;
                target = (org.landxml.schema.landXML11.SurfacesDocument.Surfaces)get_store().insert_element_user(SURFACES$26, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Surfaces" element
         */
        public org.landxml.schema.landXML11.SurfacesDocument.Surfaces addNewSurfaces()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurfacesDocument.Surfaces target = null;
                target = (org.landxml.schema.landXML11.SurfacesDocument.Surfaces)get_store().add_element_user(SURFACES$26);
                return target;
            }
        }
        
        /**
         * Removes the ith "Surfaces" element
         */
        public void removeSurfaces(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SURFACES$26, i);
            }
        }
        
        /**
         * Gets a List of "Survey" elements
         */
        public java.util.List<org.landxml.schema.landXML11.SurveyDocument.Survey> getSurveyList()
        {
            final class SurveyList extends java.util.AbstractList<org.landxml.schema.landXML11.SurveyDocument.Survey>
            {
                public org.landxml.schema.landXML11.SurveyDocument.Survey get(int i)
                    { return LandXMLImpl.this.getSurveyArray(i); }
                
                public org.landxml.schema.landXML11.SurveyDocument.Survey set(int i, org.landxml.schema.landXML11.SurveyDocument.Survey o)
                {
                    org.landxml.schema.landXML11.SurveyDocument.Survey old = LandXMLImpl.this.getSurveyArray(i);
                    LandXMLImpl.this.setSurveyArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.SurveyDocument.Survey o)
                    { LandXMLImpl.this.insertNewSurvey(i).set(o); }
                
                public org.landxml.schema.landXML11.SurveyDocument.Survey remove(int i)
                {
                    org.landxml.schema.landXML11.SurveyDocument.Survey old = LandXMLImpl.this.getSurveyArray(i);
                    LandXMLImpl.this.removeSurvey(i);
                    return old;
                }
                
                public int size()
                    { return LandXMLImpl.this.sizeOfSurveyArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SurveyList();
            }
        }
        
        /**
         * Gets array of all "Survey" elements
         */
        public org.landxml.schema.landXML11.SurveyDocument.Survey[] getSurveyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SURVEY$28, targetList);
                org.landxml.schema.landXML11.SurveyDocument.Survey[] result = new org.landxml.schema.landXML11.SurveyDocument.Survey[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Survey" element
         */
        public org.landxml.schema.landXML11.SurveyDocument.Survey getSurveyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyDocument.Survey target = null;
                target = (org.landxml.schema.landXML11.SurveyDocument.Survey)get_store().find_element_user(SURVEY$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Survey" element
         */
        public int sizeOfSurveyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SURVEY$28);
            }
        }
        
        /**
         * Sets array of all "Survey" element
         */
        public void setSurveyArray(org.landxml.schema.landXML11.SurveyDocument.Survey[] surveyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(surveyArray, SURVEY$28);
            }
        }
        
        /**
         * Sets ith "Survey" element
         */
        public void setSurveyArray(int i, org.landxml.schema.landXML11.SurveyDocument.Survey survey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyDocument.Survey target = null;
                target = (org.landxml.schema.landXML11.SurveyDocument.Survey)get_store().find_element_user(SURVEY$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(survey);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Survey" element
         */
        public org.landxml.schema.landXML11.SurveyDocument.Survey insertNewSurvey(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyDocument.Survey target = null;
                target = (org.landxml.schema.landXML11.SurveyDocument.Survey)get_store().insert_element_user(SURVEY$28, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Survey" element
         */
        public org.landxml.schema.landXML11.SurveyDocument.Survey addNewSurvey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.SurveyDocument.Survey target = null;
                target = (org.landxml.schema.landXML11.SurveyDocument.Survey)get_store().add_element_user(SURVEY$28);
                return target;
            }
        }
        
        /**
         * Removes the ith "Survey" element
         */
        public void removeSurvey(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SURVEY$28, i);
            }
        }
        
        /**
         * Gets a List of "FeatureDictionary" elements
         */
        public java.util.List<org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary> getFeatureDictionaryList()
        {
            final class FeatureDictionaryList extends java.util.AbstractList<org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary>
            {
                public org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary get(int i)
                    { return LandXMLImpl.this.getFeatureDictionaryArray(i); }
                
                public org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary set(int i, org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary o)
                {
                    org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary old = LandXMLImpl.this.getFeatureDictionaryArray(i);
                    LandXMLImpl.this.setFeatureDictionaryArray(i, o);
                    return old;
                }
                
                public void add(int i, org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary o)
                    { LandXMLImpl.this.insertNewFeatureDictionary(i).set(o); }
                
                public org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary remove(int i)
                {
                    org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary old = LandXMLImpl.this.getFeatureDictionaryArray(i);
                    LandXMLImpl.this.removeFeatureDictionary(i);
                    return old;
                }
                
                public int size()
                    { return LandXMLImpl.this.sizeOfFeatureDictionaryArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FeatureDictionaryList();
            }
        }
        
        /**
         * Gets array of all "FeatureDictionary" elements
         */
        public org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary[] getFeatureDictionaryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FEATUREDICTIONARY$30, targetList);
                org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary[] result = new org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "FeatureDictionary" element
         */
        public org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary getFeatureDictionaryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary target = null;
                target = (org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary)get_store().find_element_user(FEATUREDICTIONARY$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "FeatureDictionary" element
         */
        public int sizeOfFeatureDictionaryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FEATUREDICTIONARY$30);
            }
        }
        
        /**
         * Sets array of all "FeatureDictionary" element
         */
        public void setFeatureDictionaryArray(org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary[] featureDictionaryArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(featureDictionaryArray, FEATUREDICTIONARY$30);
            }
        }
        
        /**
         * Sets ith "FeatureDictionary" element
         */
        public void setFeatureDictionaryArray(int i, org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary featureDictionary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary target = null;
                target = (org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary)get_store().find_element_user(FEATUREDICTIONARY$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(featureDictionary);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "FeatureDictionary" element
         */
        public org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary insertNewFeatureDictionary(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary target = null;
                target = (org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary)get_store().insert_element_user(FEATUREDICTIONARY$30, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "FeatureDictionary" element
         */
        public org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary addNewFeatureDictionary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary target = null;
                target = (org.landxml.schema.landXML11.FeatureDictionaryDocument.FeatureDictionary)get_store().add_element_user(FEATUREDICTIONARY$30);
                return target;
            }
        }
        
        /**
         * Removes the ith "FeatureDictionary" element
         */
        public void removeFeatureDictionary(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FEATUREDICTIONARY$30, i);
            }
        }
        
        /**
         * Gets the "date" attribute
         */
        public java.util.Calendar getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$32);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "date" attribute
         */
        public org.apache.xmlbeans.XmlDate xgetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(DATE$32);
                return target;
            }
        }
        
        /**
         * Sets the "date" attribute
         */
        public void setDate(java.util.Calendar date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATE$32);
                }
                target.setCalendarValue(date);
            }
        }
        
        /**
         * Sets (as xml) the "date" attribute
         */
        public void xsetDate(org.apache.xmlbeans.XmlDate date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(DATE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(DATE$32);
                }
                target.set(date);
            }
        }
        
        /**
         * Gets the "time" attribute
         */
        public java.util.Calendar getTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$34);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "time" attribute
         */
        public org.apache.xmlbeans.XmlTime xgetTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_attribute_user(TIME$34);
                return target;
            }
        }
        
        /**
         * Sets the "time" attribute
         */
        public void setTime(java.util.Calendar time)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIME$34);
                }
                target.setCalendarValue(time);
            }
        }
        
        /**
         * Sets (as xml) the "time" attribute
         */
        public void xsetTime(org.apache.xmlbeans.XmlTime time)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_attribute_user(TIME$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlTime)get_store().add_attribute_user(TIME$34);
                }
                target.set(time);
            }
        }
        
        /**
         * Gets the "version" attribute
         */
        public java.lang.String getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$36);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "version" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$36);
                return target;
            }
        }
        
        /**
         * Sets the "version" attribute
         */
        public void setVersion(java.lang.String version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$36);
                }
                target.setStringValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "version" attribute
         */
        public void xsetVersion(org.apache.xmlbeans.XmlString version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSION$36);
                }
                target.set(version);
            }
        }
        
        /**
         * Gets the "language" attribute
         */
        public java.lang.String getLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$38);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "language" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANGUAGE$38);
                return target;
            }
        }
        
        /**
         * True if has "language" attribute
         */
        public boolean isSetLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANGUAGE$38) != null;
            }
        }
        
        /**
         * Sets the "language" attribute
         */
        public void setLanguage(java.lang.String language)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGE$38);
                }
                target.setStringValue(language);
            }
        }
        
        /**
         * Sets (as xml) the "language" attribute
         */
        public void xsetLanguage(org.apache.xmlbeans.XmlString language)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANGUAGE$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LANGUAGE$38);
                }
                target.set(language);
            }
        }
        
        /**
         * Unsets the "language" attribute
         */
        public void unsetLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANGUAGE$38);
            }
        }
        
        /**
         * Gets the "readOnly" attribute
         */
        public boolean getReadOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(READONLY$40);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "readOnly" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetReadOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(READONLY$40);
                return target;
            }
        }
        
        /**
         * True if has "readOnly" attribute
         */
        public boolean isSetReadOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(READONLY$40) != null;
            }
        }
        
        /**
         * Sets the "readOnly" attribute
         */
        public void setReadOnly(boolean readOnly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(READONLY$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(READONLY$40);
                }
                target.setBooleanValue(readOnly);
            }
        }
        
        /**
         * Sets (as xml) the "readOnly" attribute
         */
        public void xsetReadOnly(org.apache.xmlbeans.XmlBoolean readOnly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(READONLY$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(READONLY$40);
                }
                target.set(readOnly);
            }
        }
        
        /**
         * Unsets the "readOnly" attribute
         */
        public void unsetReadOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(READONLY$40);
            }
        }
        
        /**
         * Gets the "LandXMLId" attribute
         */
        public int getLandXMLId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANDXMLID$42);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "LandXMLId" attribute
         */
        public org.apache.xmlbeans.XmlInt xgetLandXMLId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(LANDXMLID$42);
                return target;
            }
        }
        
        /**
         * True if has "LandXMLId" attribute
         */
        public boolean isSetLandXMLId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANDXMLID$42) != null;
            }
        }
        
        /**
         * Sets the "LandXMLId" attribute
         */
        public void setLandXMLId(int landXMLId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANDXMLID$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANDXMLID$42);
                }
                target.setIntValue(landXMLId);
            }
        }
        
        /**
         * Sets (as xml) the "LandXMLId" attribute
         */
        public void xsetLandXMLId(org.apache.xmlbeans.XmlInt landXMLId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(LANDXMLID$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(LANDXMLID$42);
                }
                target.set(landXMLId);
            }
        }
        
        /**
         * Unsets the "LandXMLId" attribute
         */
        public void unsetLandXMLId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANDXMLID$42);
            }
        }
        
        /**
         * Gets the "crc" attribute
         */
        public java.math.BigInteger getCrc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRC$44);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "crc" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetCrc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CRC$44);
                return target;
            }
        }
        
        /**
         * True if has "crc" attribute
         */
        public boolean isSetCrc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CRC$44) != null;
            }
        }
        
        /**
         * Sets the "crc" attribute
         */
        public void setCrc(java.math.BigInteger crc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRC$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRC$44);
                }
                target.setBigIntegerValue(crc);
            }
        }
        
        /**
         * Sets (as xml) the "crc" attribute
         */
        public void xsetCrc(org.apache.xmlbeans.XmlInteger crc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CRC$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CRC$44);
                }
                target.set(crc);
            }
        }
        
        /**
         * Unsets the "crc" attribute
         */
        public void unsetCrc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CRC$44);
            }
        }
    }
}
