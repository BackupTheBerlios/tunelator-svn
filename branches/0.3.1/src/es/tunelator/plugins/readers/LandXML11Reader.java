/*
 * Created on 24-oct-2006
 * 
 * Copyright 2005, Logica Equipamientos Integrales, S.L.
 * 
 */
package es.tunelator.plugins.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.xmlbeans.XmlException;

import es.tunelator.UserMessageException;
import es.tunelator.log.Logger;
import es.tunelator.resources.Resourcer;
import es.tunelator.vo.AlignmentComponentVO;
import es.tunelator.vo.AlignmentLineVO;
import es.tunelator.vo.AlignmentVO;

import org.landxml.schema.landXML11.*;import org.landxml.schema.landXML11.CoordGeomDocument.CoordGeom;
import org.landxml.schema.landXML11.LandXMLDocument.LandXML;
import org.landxml.schema.landXML11.LineDocument.Line;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
;

/**
 * &COPY; 2006 Juan Alvarez Ferrando<p/>
 * 
 * Reads a LandXML v1.1 file.
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class LandXML11Reader {
    LandXMLDocument rootElement;
    
    List<AlignmentVO> alignmentsList = null;
    
    private static final String XMLNAME_LINE = "Line";

    /**
     * Returns the list of alignments found in the file, represented as
     * a List of AligmentVO objects.
     * @return
     */
    public List<AlignmentVO> getAlignmentsList() {
        return alignmentsList;
    }

    /**
     * Returns a list of AlignmentVO objects each one representing one of the 
     * <Alignment> elements found in the <Alignments> element received in the
     * parameter.
     * Each AlignmentVO holds the name and the list of geometries read from the
     * <Alignment> element.
     * 
     * @param alignments
     * @return
     */
    private List<AlignmentVO> readAlignments(AlignmentsDocument.Alignments alignments) {
        ArrayList<AlignmentVO> result = new ArrayList<AlignmentVO>();
        // Extract and process the <Alignment> elements.
        for(Iterator<AlignmentDocument.Alignment> alignIt = alignments.getAlignmentList().iterator();
            alignIt.hasNext();) {
            ArrayList<AlignmentComponentVO> geometriesList = new ArrayList<AlignmentComponentVO>();
            AlignmentDocument.Alignment alignment = alignIt.next();
            // Extract the geometric elements of the alignment.
            // Following the specification there could be more than
            // one <CoordGeom> element in each <Alignment>. As we
            // don't find any use in that, we join them all in a single
            // list of geometries.
            List<CoordGeom> geom = alignment.getCoordGeomList();
            for(Iterator<CoordGeom> geomIt=geom.iterator(); geomIt.hasNext();) {
                CoordGeom coords = geomIt.next();
                // To extract them in the same order found in the file we
                // drive the extraction using the DOM element, and then
                // find each element in the list of the corresponding type.
                // We want to preserve the order cause it usually follows the 
                // logical and geometric secuence, and it helps the user
                // match the original file to our GUI representations (lists,tables,etc.).
                Node domNode = coords.getDomNode();
                NodeList children = domNode.getChildNodes();
                for(int i=0; i<children.getLength(); i++) {
                    Node geomNode = children.item(i);
                    // Just for precaution, in case some comment or other type
                    // of node is found.
                    if((geomNode.getNodeType()==Node.ELEMENT_NODE)) {
                        // The node corresponds to a line geometry
                        if(geomNode.getNodeName().equals(XMLNAME_LINE)){
                            AlignmentLineVO lineVO = new AlignmentLineVO();
                            Line line = null;
                            // Search the corresponding object in the list of lines
                            for(int j=0;j<coords.getLineList().size();j++){
                                if(coords.getLineList().get(j).getDomNode().equals(geomNode)) {
                                    line = coords.getLineList().get(j);
                                    break;
                                }
                            }
                            // Something's terribly wrong if the DOM and the object representation
                            // do not match.
                            if(line == null) {
                                throw new Error("Could not find Line object for DOM element:\n"+geomNode.toString());
                            }
                            // Now feed the data into our DTO object and add it to the
                            // resulting list
                            double startX = ((Double)line.getStart().getListValue().get(0)).doubleValue();
                            double startY = ((Double)line.getStart().getListValue().get(1)).doubleValue();
                            double endX = ((Double)line.getEnd().getListValue().get(0)).doubleValue();;
                            double endY = ((Double)line.getEnd().getListValue().get(1)).doubleValue();
                            lineVO.setStart(startX,startY);
                            lineVO.setEnd(endX,endY);
                            geometriesList.add(lineVO);
                        }
                        // TODO: Add support for the rest of geometries of alignments
                    }
                }
            }
            // Create the alignment VO object and insert it into the result list
            AlignmentVO alignmentVO = new AlignmentVO();
            alignmentVO.setName(alignment.getName());
            alignmentVO.setComponents(geometriesList);
            result.add(alignmentVO);
        }
        return result;
    }
    /**
     * Reads the contents of a file into the internal 
     * representations.
     * 
     * @param file
     * @throws UserMessageException
     */
    public LandXML11Reader(File file) throws UserMessageException {
        try {
            rootElement = LandXMLDocument.Factory.parse(file);
            alignmentsList = readAlignments(rootElement.getLandXML().getAlignmentsList().get(0));
            // Just to test the result, dump line geometries read to the debug log
            for(int j=0; j< alignmentsList.size();j++) {
               Logger.logDebug(this.getClass(),"Alignment: "+alignmentsList.get(j).getName());
               List<AlignmentComponentVO> alignments = alignmentsList.get(j).getComponents();
               for(int i=0; i< alignments.size();i++){
                  AlignmentComponentVO comp = alignments.get(i);
                  switch (comp.getType()) {
                      case AlignmentComponentVO.AXIS_LINE:
                          AlignmentLineVO line = (AlignmentLineVO) comp;
                          String message = "Axis Line: ("+line.getStart()[0]+","+line.getStart()[1]+")->("+
                              line.getEnd()[0]+","+line.getEnd()[1]+")";
                          Logger.logDebug(this.getClass(),message);
                  }
               }
            }
        } catch (FileNotFoundException e) {
            Logger.logError(LandXML11Reader.class,e);
            throw new UserMessageException(Resourcer.getString(null,"error.fileNotFound"),e);
        } catch (XmlException e) {
            Logger.logError(LandXML11Reader.class,e);
            throw new UserMessageException(Resourcer.getString(null,"error.fileFormat"),e);
        } catch (IOException e) {
            Logger.logError(LandXML11Reader.class,e);
            throw new UserMessageException(Resourcer.getString(null,"error.fileFormat"),e);
        }
    }
}
