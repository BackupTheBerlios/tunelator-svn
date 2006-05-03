/*
 * Created on 14-jul-2005
 *
 * Tunelator surveying software.
 * 
 * Copyright (C) 2005 Juan Alvarez Ferrando
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 2 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 * 
 */
package es.tunelator.plugins.writers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.tunelator.Constants;
import es.tunelator.log.Logger;
import es.tunelator.plugins.transformers.TransformException;
import es.tunelator.plugins.transformers.vo.Point3D;
import es.tunelator.resources.Resourcer;
import es.tunelator.vo.PuntoVO;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * Generates a DXF file with a 2D graphic representation of the data.
 * Profiles are presented in a grid, with one in each cell.
 * The axis is represented as a point, with a text showing
 * the Theoric PK of the profile.
 * 
 * One layer is generated with the points in each profile<br/>
 * One layer is generated with the lines in each profile<br/>
 * One layer is generated with the texts of the point IDs in each profile<br/>
 * One layer is generated with the texts of the point heghts<br/>
 * One layer is generated with the axis points and the texts of the PKs<br/>
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class DXF12_2DWriter {
    /**
     * Stores the maximum width of the profiles
     * If <code>calculateDimensions</code> has not been called, has <code>0.0d</code> value
     * @see #calculateDimensions(List)
     */
    private double maxWidth = 0.0d;
    /**
     * Stores the maximum height of the profiles.
     * If <code>calculateDimensions</code> has not been called, has <code>0.0d</code> value
     * @see #calculateDimensions(List)
     */
    private double maxHeight = 0.0d;
    /**
     * Amount to be added to the points in each profile to place them in the
     * positive X axis relative to the upper left corner of the cell where the
     * profile is to be drawn.
     */
    private ArrayList xTranslations = new ArrayList();
    /**
     * No horizontal justification
     */
    public static int JUSTH_NONE = -1;
    /**
     * Horizontally justify to the right
     */
    public static int JUSTH_RIGHT = 2;
    /**
     * Horizontally justify centered
     */
    public static int JUSTH_CENTER = 1;
    /**
     * Horizontally justify to the left
     */
    public static int JUSTH_LEFT = 0;
    /**
     * No vertical justification
     */
    public static int JUSTV_NONE = -1;
    /**
     * Vertically justify to the top
     */
    public static int JUSTV_TOP = 3;
    /**
     * Vertically justify centered
     */
    public static int JUSTV_MIDDLE = 2;
    /**
     * Vertically justify to the bottom
     */
    public static int JUSTV_BOTTOM = 1;
    /**
     * Vertically justify on the baseline of the text
     */
    public static int JUSTV_BASELINE = 0;
    /**
     * Convenience method to invoke the resource access mechanism.
     * Also includes a hack to make possible that values in the properties file contain
     * leading or trailing spaces by surroundin them in double quotes.
     * 
     * @param key Key of the requested resource in this class's resource file
     * @return Value obtained from the resource file
     */
    protected String getResourceString(String key){
        String value = Resourcer.getString(DXF12_2DWriter.class,key);
        // This is done to be able to specify leading or trailing spaces in values of the properties file
        // Those values are surounded by double quotes which are here removed
        if(value.charAt(0)=='\"') {
            value = value.substring(1,value.length()-1);
        }
        return value;
    }
    /**
     * Returns the appropiate <code>Format</code> object to format or parse double values
     * to/from DXF files.
     * The pattern used is "#######0.000000", with a dot as decimal separator and no thousands
     * separator.
     * 
     * @return A <code>DecimalFormat</code> for the "#######0.000000" pattern, using a dot as decimal separator
     */
    protected DecimalFormat getDoubleFormat() {
		DecimalFormat formatter = (DecimalFormat) DecimalFormat.getInstance();
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setDecimalSeparator('.');
		formatter.setDecimalFormatSymbols(symbols);
		formatter.applyPattern("#######0.000000");
		return formatter;
    }
    /**
     * Writes into de received <code>Writer</code> the codes in DXF format required to create
     * a line entity in the DXF file, taiking only X and Y coordinates and placing the entity
     * in a layer of the specified name.
     * @param x1 X coordinate of the first point
     * @param y1 Y coordinate of the first point
     * @param x2 X coordinate of the second point
     * @param y2 Y coordinate of the second point
     * @param layer Name of the layer to which the entity will belong
     * @param writer <code>Writer</code> where results are written
     * @throws IOException As forwarded from the <code>Writer.write(String)</code> method
     */
    protected void writeEntity2DLine(double x1, double y1, double x2, double y2, String layer, Writer writer) throws IOException {
        try {
	        writer.write(getResourceString("groupcode.0")+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("entity.line")+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("groupcode.8")+Constants.LINE_SEPARATOR);
	        writer.write(layer+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("groupcode.10")+Constants.LINE_SEPARATOR);
	        writer.write(getDoubleFormat().format(x1)+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("groupcode.20")+Constants.LINE_SEPARATOR);
	        writer.write(getDoubleFormat().format(y1)+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("groupcode.11")+Constants.LINE_SEPARATOR);
	        writer.write(getDoubleFormat().format(x2)+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("groupcode.21")+Constants.LINE_SEPARATOR);
	        writer.write(getDoubleFormat().format(y2)+Constants.LINE_SEPARATOR);
        } catch(IOException e){
            Logger.logError(DXF12_2DWriter.class,e);
            throw e;
        }
    }
    /**
     * Creates the DXF codes for a 2D line on the given writer, assigning the entity to a layer of the
     * specified name.
     * This convenience method directly takes <code>Point3D</code> objects as arguments.
     * @param p1 First point
     * @param p2 Second point
     * @param layer Name of the layer to which the entity belongs
     * @param writer Where results will be written
     * @throws IOException As forwarded from <code>Writer.write(String)</code>
     */
    protected void write2DLine(Point3D p1, Point3D p2, String layer, Writer writer) throws IOException {
        writeEntity2DLine(p1.getX(),p1.getY(),p2.getX(),p2.getY(),layer, writer);
    }
    /**
     * Writes the DXF codes for a 2D point in the given writer and assigned to a layer of the specified
     * name.
     * @param x X coordinate
     * @param y Y coordinate
     * @param layer Name of the layer to which the entity belongs
     * @param writer Where results will be written
     * @throws IOException As forwarded from <code>Writer.write(String)</code>
     */
    protected void writeEntity2DPoint(double x, double y, String layer, Writer writer) throws IOException {
        writer.write(getResourceString("groupcode.0")+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("entity.point")+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.8")+Constants.LINE_SEPARATOR);
        writer.write(layer+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.10")+Constants.LINE_SEPARATOR);
        writer.write(getDoubleFormat().format(x)+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.20")+Constants.LINE_SEPARATOR);
        writer.write(getDoubleFormat().format(y)+Constants.LINE_SEPARATOR);
    }
    /**
     * Creates the DXF codes for a text string placed in 2D space.
     * Valid values for <code>justH</code> are:<br><br>
     * <dir>
     * <li>JUSTH_NONE</li>
     * <li>JUSTH_RIGHT</li>
     * <li>JUSTH_CENTER</li>
     * <li>JUSTH_LEFT</li>
     * </dir>
     * Valid values for <code>justV</code> are:<br><br>
     * <dir>
     * <li>JUSTV_NONE</li>
     * <li>JUSTV_TOP</li>
     * <li>JUSTV_MIDDLE</li>
     * <li>JUSTV_BOTTOM</li>
     * <li>JUSTV_BASELINE</li>
     * </dir>
     * @param x X coordinate to place the text
     * @param y Y coordinate to place the text
     * @param value Text to represent
     * @param alignX X alignment
     * @param alignY Y alignment
     * @param size Size of the text (in drawing's measure units: meters)
     * @param layer Name of the layer to which the entity will belong
     * @param justH Horizontal justification
     * @param justV Vertical justification
     * @param writer Where results will be written 
     * @throws IOException As forwarded from <code>Writer.write(String)</code>
     */
    protected void writeEntity2DText(double x, double y, String value,double alignX, double alignY,
            								double size, String layer, int justH, int justV, Writer writer) throws IOException {
        writer.write(getResourceString("groupcode.0")+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("entity.text")+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.8")+Constants.LINE_SEPARATOR);
        writer.write(layer+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.10")+Constants.LINE_SEPARATOR);
        writer.write(getDoubleFormat().format(x)+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.20")+Constants.LINE_SEPARATOR);
        writer.write(getDoubleFormat().format(y)+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.40")+Constants.LINE_SEPARATOR);
        writer.write(getDoubleFormat().format(size)+Constants.LINE_SEPARATOR);
        writeGroupCode72(justH,writer);
        writeGroupCode73(justV,writer);
        writer.write(getResourceString("groupcode.11")+Constants.LINE_SEPARATOR);
        writer.write(getDoubleFormat().format(alignX)+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.21")+Constants.LINE_SEPARATOR);
        writer.write(getDoubleFormat().format(alignY)+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.1")+Constants.LINE_SEPARATOR);
        writer.write(value+Constants.LINE_SEPARATOR);
    }
    /**
     * Writes a groupcode 72 as described by the DXF format.<br>
     * Groupcode 72 specifies the horizontal justification attribute for text entities.<br>
     * Valid values for <code>justH</code> are:<br><br>
     * <dir>
     * <li>JUSTH_NONE</li>
     * <li>JUSTH_RIGHT</li>
     * <li>JUSTH_CENTER</li>
     * <li>JUSTH_LEFT</li>
     * </dir>
     * @param just Code value of the horizontal justification
     * @param writer Where results will be written
     * @throws IOException As forwarded from <code>Writer.write(String)</code>
     */
    protected void writeGroupCode72(int just, Writer writer) throws IOException {
        if(just != JUSTH_NONE) {
	        writer.write(getResourceString("groupcode.72")+Constants.LINE_SEPARATOR);
	        switch (just) {
	        	case 2:writer.write(getResourceString("justification.h.right")+Constants.LINE_SEPARATOR);
	        					 break;
	        	case 1:writer.write(getResourceString("justification.h.center")+Constants.LINE_SEPARATOR);
	        					  break;
	        	case 0:writer.write(getResourceString("justification.h.left")+Constants.LINE_SEPARATOR);
				 				break;
	        }
        }
    }
    /**
     * Writes a groupcode 73 as described by the DXF format.<br>
     * Groupcode 73 specifies the vertical justification attribute for text entities.<br>
     * Valid values for <code>justV</code> are:<br><br>
     * <dir>
     * <li>JUSTV_NONE</li>
     * <li>JUSTV_TOP</li>
     * <li>JUSTV_MIDDLE</li>
     * <li>JUSTV_BOTTOM</li>
     * <li>JUSTV_BASELINE</li>
     * </dir>
     * @param just Code value of the vertical justification
     * @param writer Where results will be written
     * @throws IOException As forwarded from <code>Writer.write(String)</code>
     */
    protected void writeGroupCode73(int just, Writer writer) throws IOException {
        if(just != JUSTV_NONE) {
	        writer.write(getResourceString("groupcode.73")+Constants.LINE_SEPARATOR);
	        switch (just) {
	        	case 3:writer.write(getResourceString("justification.v.top")+Constants.LINE_SEPARATOR);
	        			break;
	        	case 2:writer.write(getResourceString("justification.v.middle")+Constants.LINE_SEPARATOR);
	        					 break;
	        	case 1:writer.write(getResourceString("justification.v.bottom")+Constants.LINE_SEPARATOR);
	        					  break;
	        	case 0:writer.write(getResourceString("justification.v.baseline")+Constants.LINE_SEPARATOR);
				 				break;
	        }
        }
    }
    /**
     * Writes the codes in DXF format to represent a point in 2D.
     * This convenience method takes a <code>Point3D</code> object as parameter.
     * @param p1 Point to represent
     * @param layer Name of the layer to which the entity belongs
     * @param writer Where results will be written
     * @throws IOException As forwarded from <code>Writer.write(String)</code>
     */
    protected void write2DPoint(Point3D p1, String layer, Writer writer) throws IOException {
        writeEntity2DPoint(p1.getX(),p1.getY(),layer,writer);
    }
    /**
     * Writes to the received <code>Writer</code> the DXF codes to represent a point in 2D 
     * with two texts:
     * <dir>
     * <li> The point ID at (X-0.05,Y+0.05)</li>
     * <li> The Height at (X+0.05,Y-0.05)</li>
     * <dir>
     * @param p1
     * @param pt
     * @param writer
     * @throws IOException
     */
    protected void write2DPointTexts (Point3D p1, PuntoVO pt, Writer writer) throws IOException {
        String pointIDLayer = getResourceString("layer.pointID.label");
        String heightLayer = getResourceString("layer.height.label");
	    writeEntity2DText(p1.getX(),p1.getY(),pt.getPointID(),p1.getX()-0.05,p1.getY()+0.05,0.15,pointIDLayer,JUSTH_RIGHT,JUSTV_NONE,writer);
	    writeEntity2DText(p1.getX(),p1.getY(),pt.getHeight(),p1.getX()+0.05,p1.getY()-0.05,0.15,heightLayer,JUSTH_NONE,JUSTV_TOP,writer);
    }
    /**
     * Convenience function that returns the maximum of two <code>double</double> values
     * @param v1 First <code>double</code>
     * @param v2 Second <code>double</code>
     * @return Maximum of v1 and v2
     */
    private double doubleMax(double v1, double v2){
        return (v1 >= v2) ? v1:v2;
    }
    /**
     * Convenience function that returns the minimum of two <code>double</double> values
     * @param v1 First <code>double</code>
     * @param v2 Second <code>double</code>
     * @return Minimum of v1 and v2
     */
    private double doubleMin(double v1, double v2){
        return (v1 >= v2) ? v2:v1;
    }
    /**
     * Calculates the maximum height and with of the enclosing square of each of the
     * profiles that appear in the <code>List</code> of <code>PuntoVO</code>.
     * It also saves in the <code>xTranslations</code> attibute the minimum distance to the
     * axis of the points in each profile if it is a negative value, or <code>0.0d</code> otherwise.
     * Negative axis distances represent points that are to the left of the axis (as seen 
     * perpendicularly to the profile vertical plane).
     * When calculating drawing coordinates the figure is placed in the (+,-) quadrant of a 
     * coordinate system centered on the upper left corner of the cell where the profile has to be
     * displayed. The values in <code>xTranslations</code> are used to translate the points so all
     * of them have positive x coordinates.
     * The points are supposed to be grouped by profile and in linear sequence inside the profile. 
     * Although not necessary the profiles should also be ordered by their PK, so the 
     * drawing shows them in the proper sequence.     
     * @param listPK <code>List</code> of <code>PuntoVO</code>
     * @throws TransformException If some attribute of a point is not convertible to its native value
     * when using <code>PuntoVO.getPoint3D()</code>
     */
    protected void calculateDimensions(List listPK) throws TransformException {
        // To treat each profile in the List
        Iterator it = listPK.iterator();
        PuntoVO p1=null;
        PuntoVO p2=null;
        // To detect when we change of profile
        String currentPK = "";
        // Initialize acumulated values to the range limits, so
        // any calculated value will replace them when compared.
        // Maximum with of all the profiles
        maxWidth = -Double.MAX_VALUE;
        // Maximum heigth of all the profiles
        maxHeight = Double.MIN_VALUE;
        // Maximum horizontal distance to the axis of all the points of the current profile
        double maxDeje = -Double.MAX_VALUE;
        // Minimum horizontal distance to the axis of all the points of the current profile
        double minDeje = Double.MAX_VALUE;
        // Maximum vertical distance to the axis of all the points in the current profile
        double maxHeightInc = -Double.MAX_VALUE;
        // Minimum vertical distance to the axis of all the points in the current profile
        double minHeightInc = Double.MAX_VALUE;
        // Height of the 2D tetrahedron that encloses the current profile
        double height = 0.0d;
        // Width of the 2D tetrahedron that encloses the current profile
        double width = 0.0d;
        // To detect the special case of the first profile
        int profileIndex = 0;
        while(it.hasNext()){
            PuntoVO currentPoint = (PuntoVO) it.next();
            Point3D point = currentPoint.getPoint3D();
            double deje = point.getDeje();
            double heightInc = point.getHeightInc();
            if(!currentPoint.getPkTeor().equals(currentPK)){
                currentPK = currentPoint.getPkTeor();
                height = maxHeightInc - minHeightInc;
                width = maxDeje - minDeje;
                maxHeight = doubleMax(maxHeight,height);
                maxWidth = doubleMax(maxWidth,width);
                if(profileIndex > 0) {
                    if(minDeje < 0) {
                        xTranslations.add(new Double(-minDeje));
                    } else {
                        xTranslations.add(new Double(0.0d));
                    }
                }
                maxDeje = -Double.MAX_VALUE;
                minDeje = Double.MAX_VALUE;
                maxHeightInc = -Double.MAX_VALUE;
                minHeightInc = Double.MIN_VALUE;
                profileIndex++;
            }
            // Get the maximun and minimum distances to the axis
            maxDeje = doubleMax(deje,maxDeje);
            minDeje = doubleMin(deje,minDeje);
            // Get the maximun and minimum height increments to the axis
            maxHeightInc = doubleMax(heightInc,maxHeightInc);
            minHeightInc = doubleMin(heightInc,maxHeightInc);
        }
        // Do the calculations for the last profile
        height = maxHeightInc - minHeightInc;
        width = maxDeje - minDeje;
        maxHeight = doubleMax(maxHeight,height);
        maxWidth = doubleMax(maxWidth,width);
        if(minDeje < 0) {
            xTranslations.add(new Double(-minDeje));
        } else {
            xTranslations.add(new Double(0.0d));
        }
    }
    /**
     * Writes the entities section of the DXF file, where each of the visible elements of the 
     * drawing are included (points, lines, texts).
     * Inoking <code>calculateDimensions(listPK)</code> is required before calling this method, 
     * to calculate the size of the cells and the horizontal translation of the points in each
     * profile.
     * @param listPK List of the <code>PuntoVO</code> points
     * @param writer <code>Writer</code> where the output drawing is to be written
     * @throws IOException Problems writing to the <code>Writer</code>
     * @throws TransformException Relayed from other methods that use <code>PuntoVO.getPoint3D()</code>
     */
    protected void writeSectionEntities(List listPK,Writer writer) throws IOException, TransformException {
        try {
	        writer.write(getResourceString("groupcode.0")+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("section.section")+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("groupcode.2")+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("section.entities")+Constants.LINE_SEPARATOR);
        } catch(IOException e){
            Logger.logError(DXF12_2DWriter.class,e);
            throw e;
        }
        Iterator it = listPK.iterator();
        PuntoVO p1=null;
        PuntoVO p2=null;
        String currentPK = "";
        // Index of the current profile in the profiles list
        int profileIndex = 0;
        // Total number of profiles in the list
        int totalProfiles = listPK.size();
        // Coordinates of the cell where the current profile is drawn
        int gridX = 0;
        int gridY = 0;
        // Number of columns of the grid upon which profiles are placed
        int gridWidth = 3;
        // Upper left corner of the area where the current profile is drawn
        double cellStartX = 0.0d;
        double cellStartY = 0.0d;
        // Constant values that have proved to be OK with the test files
        double marginH = 2.0;
        double marginV = 2.0;
        // Name of the layer whre PK text are written
        String pkLayer = getResourceString("layer.pk.label");
        while(it.hasNext()){
            PuntoVO currentPoint = (PuntoVO) it.next();
            Point3D point = currentPoint.getPoint3D();
            if(!currentPoint.getPkTeor().equals(currentPK)){
                currentPK = currentPoint.getPkTeor();
                gridY = profileIndex / (gridWidth+1);
                gridX = profileIndex % (gridWidth+1);
                cellStartX = gridX * maxWidth + (marginH * gridX);
                cellStartY = (-gridY * maxHeight) - (marginV * gridY);
                profileIndex++;
        	    writeEntity2DText(cellStartX+((Double)xTranslations.get(profileIndex-1)).doubleValue(),
    					cellStartY,currentPK,cellStartX+0.05,cellStartY-0.05,0.30,pkLayer,JUSTH_NONE,JUSTV_TOP,writer);
        	    Point3D axis = new Point3D(cellStartX+((Double)xTranslations.get(profileIndex-1)).doubleValue(),
        	            					cellStartY,0.0d);
                write2DPoint(axis,getResourceString("layer.pk.label"),writer);
                p1 = null;
                p2 = null;
            }
            Point3D point2D = new Point3D(point.getDeje()+cellStartX+((Double)xTranslations.get(profileIndex-1)).doubleValue(),point.getHeightInc()+cellStartY,0.0d);
            write2DPoint(point2D,getResourceString("layer.profile.point.prefix")+currentPoint.getPkTeor()+getResourceString("layer.profile.point.suffix"),writer);
            write2DPointTexts(point2D,currentPoint,writer);
            if(p1==null){
                p1 = currentPoint;
            } else {
	            if(p2==null){
	                p2 = currentPoint;
	            }
            } 
            if (p1!= null && p2!=null){
                Point3D p2d1 = p1.getPoint3D();
                p2d1 = new Point3D(p2d1.getDeje()+cellStartX+((Double)xTranslations.get(profileIndex-1)).doubleValue(),p2d1.getHeightInc()+cellStartY,0.0d);
                Point3D p2d2 = p2.getPoint3D();
                p2d2 = new Point3D(p2d2.getDeje()+cellStartX+((Double)xTranslations.get(profileIndex-1)).doubleValue(),p2d2.getHeightInc()+cellStartY,0.0d);
                write2DLine(p2d1,p2d2,getResourceString("layer.profile.line.prefix")+currentPK+getResourceString("layer.profile.line.suffix"),writer);
                p1 = p2;
                p2 = null;
            }
        }
        writeSectionEnd(writer);
    }
    /**
     * Writes the codes that mark the end of a section
     * @param writer
     * @throws IOException
     */
    protected void writeSectionEnd(Writer writer) throws IOException {
        try {
            writer.write(getResourceString("groupcode.0")+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("section.endsec")+Constants.LINE_SEPARATOR);
	    } catch(IOException e){
	        Logger.logError(DXF12_2DWriter.class,e);
	        throw e;
	    }
    }
    /**
     * The place to do anything before the contents are written.
     * @param writer
     * @throws IOException
     */
    protected void writeBOF(Writer writer) throws IOException {
    }
    /**
     * Writes the codes that mark the end of the file
     * @param writer
     * @throws IOException
     */
    protected void writeEOF(Writer writer) throws IOException {
        try {
	        writer.write(getResourceString("groupcode.0")+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("special.eof")+Constants.LINE_SEPARATOR);
        } catch(IOException e){
            Logger.logError(DXF12_2DWriter.class,e);
            throw e;
        }
    }
    /**
     * Writes the different sections of the output after calculating the 
     * dimensions of the cells and the translation of coordinates of each
     * profile contained in the list of points.
     * @param listPK <code>List</code> of <code>PuntoVO</code>
     * @param output Where output is written
     * @throws Exception will be IOException or TransformException
     */
    public void writeFile(List listPK, File output) throws Exception {
		Iterator ptIterator = listPK.iterator();
		FileWriter writer = new FileWriter(output);
		calculateDimensions(listPK);
	    writeBOF(writer);
	    writeSectionEntities(listPK,writer);
	    writeEOF(writer);
		writer.flush();
		writer.close();
    }
	/**
	 * Allows to use the writer statically. Creates an object an invokes <code>writeFile(List,File)</code>
     * @param listPK <code>List</code> of <code>PuntoVO</code>
     * @param output Where output is written
     * @throws Exception will be IOException or TransformException
	 */
	public static void write(List listPK, File output) throws Exception {
	    DXF12_2DWriter object = new DXF12_2DWriter();
	    object.writeFile(listPK,output);
	}
}
