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
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Iterator;
import java.util.List;

import es.tunelator.Constants;
import es.tunelator.log.Logger;
import es.tunelator.plugins.transformers.TransformException;
import es.tunelator.plugins.transformers.vo.Point3D;
import es.tunelator.resources.Resourcer;
import es.tunelator.vo.PuntoVO;

/**
 * 
 * Generates a DXF file with the graphic representation of the data.
 * Each profile in a layer named as the theoric PK of the profile.
 * 
 * @author Juan Alvarez Ferrando
 * 
 */
public class DXF12Writer {

    protected static String getResourceString(String key){
        String value = Resourcer.getString(DXF12Writer.class,key);
        if(value.charAt(0)=='\"') {
            value = value.substring(1,value.length()-1);
        }
        return value;
    }
    
    protected static DecimalFormat getDoubleFormat() {
		DecimalFormat formatter = (DecimalFormat) DecimalFormat.getInstance();
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setDecimalSeparator('.');
		formatter.setDecimalFormatSymbols(symbols);
		formatter.applyPattern("#######0.000000");
		return formatter;
    }
    
    protected static void writeEntityLine(double x1, double y1, double z1, double x2, double y2, double z2, String layer, FileWriter writer) throws IOException {
        try {
	        writer.write(getResourceString("groupcode.0")+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("entity.line")+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("groupcode.8")+Constants.LINE_SEPARATOR);
	        writer.write(layer+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("groupcode.10")+Constants.LINE_SEPARATOR);
	        writer.write(getDoubleFormat().format(x1)+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("groupcode.20")+Constants.LINE_SEPARATOR);
	        writer.write(getDoubleFormat().format(y1)+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("groupcode.30")+Constants.LINE_SEPARATOR);
	        writer.write(getDoubleFormat().format(z1)+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("groupcode.11")+Constants.LINE_SEPARATOR);
	        writer.write(getDoubleFormat().format(x2)+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("groupcode.21")+Constants.LINE_SEPARATOR);
	        writer.write(getDoubleFormat().format(y2)+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("groupcode.31")+Constants.LINE_SEPARATOR);
	        writer.write(getDoubleFormat().format(z2)+Constants.LINE_SEPARATOR);
        } catch(IOException e){
            Logger.logError(DXF12Writer.class,e);
            throw e;
        }
    }
    
    protected static void write3DLine(PuntoVO pt1, PuntoVO pt2, String layer, FileWriter writer) throws IOException, TransformException {
        Point3D p1 = pt1.getPoint3D();
        Point3D p2 = pt2.getPoint3D();
        writeEntityLine(p1.getX(),p1.getY(),p1.getZ(),p2.getX(),p2.getY(),p2.getZ(),layer, writer);
    }
    
    protected static void writeEntityPoint(double x, double y, double z, String layer, FileWriter writer) throws IOException {
        writer.write(getResourceString("groupcode.0")+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("entity.point")+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.8")+Constants.LINE_SEPARATOR);
        writer.write(layer+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.10")+Constants.LINE_SEPARATOR);
        writer.write(getDoubleFormat().format(x)+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.20")+Constants.LINE_SEPARATOR);
        writer.write(getDoubleFormat().format(y)+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.30")+Constants.LINE_SEPARATOR);
        writer.write(getDoubleFormat().format(z)+Constants.LINE_SEPARATOR);
    }
    
    protected static void writeEntityText(double x, double y, double z,String value,double alignX, double alignY, double alignZ,
            								double size, String layer, int justH, int justV, FileWriter writer) throws IOException {
        writer.write(getResourceString("groupcode.0")+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("entity.text")+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.8")+Constants.LINE_SEPARATOR);
        writer.write(layer+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.10")+Constants.LINE_SEPARATOR);
        writer.write(getDoubleFormat().format(x)+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.20")+Constants.LINE_SEPARATOR);
        writer.write(getDoubleFormat().format(y)+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.30")+Constants.LINE_SEPARATOR);
        writer.write(getDoubleFormat().format(z)+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.40")+Constants.LINE_SEPARATOR);
        writer.write(getDoubleFormat().format(size)+Constants.LINE_SEPARATOR);
        writeGroupCode72(justH,writer);
        writeGroupCode73(justV,writer);
        writer.write(getResourceString("groupcode.11")+Constants.LINE_SEPARATOR);
        writer.write(getDoubleFormat().format(alignX)+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.21")+Constants.LINE_SEPARATOR);
        writer.write(getDoubleFormat().format(alignY)+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.31")+Constants.LINE_SEPARATOR);
        writer.write(getDoubleFormat().format(alignZ)+Constants.LINE_SEPARATOR);
        writer.write(getResourceString("groupcode.1")+Constants.LINE_SEPARATOR);
        writer.write(value+Constants.LINE_SEPARATOR);
    }
    
    /**
     * No horizontal justification
     */
    public static int JUSTH_NONE = -1;
    /**
     * Text justified to the right
     */
    public static int JUSTH_RIGHT = 2;
    /**
     * Text horiontally centered
     */
    public static int JUSTH_CENTER = 1;
    /**
     * Text justified to the left
     */
    public static int JUSTH_LEFT = 0;
    /**
     * No vertical justification
     */
    public static int JUSTV_NONE = -1;
    /**
     * Text justified to the top
     */
    public static int JUSTV_TOP = 3;
    /**
     * Text vertically centered
     */
    public static int JUSTV_MIDDLE = 2;
    /**
     * Text justified to the bottom
     */
    public static int JUSTV_BOTTOM = 1;
    /**
     * Text aligned with the base line
     */
    public static int JUSTV_BASELINE = 0;
    
    protected static void writeGroupCode72(int just, FileWriter writer) throws IOException {
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

    protected static void writeGroupCode73(int just, FileWriter writer) throws IOException {
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
    
    protected static void write3DPoint(PuntoVO pt, String layer, FileWriter writer) throws IOException, TransformException {
        Point3D p1 = pt.getPoint3D();
        writeEntityPoint(p1.getX(),p1.getY(),p1.getZ(),layer,writer);
    }

    protected static void write3DPointTexts (PuntoVO pt, FileWriter writer) throws IOException, TransformException {
        Point3D p1 = pt.getPoint3D();
        String pointIDLayer = getResourceString("layer.pointID.label");
        String heightLayer = getResourceString("layer.height.label");
	    writeEntityText(p1.getX(),p1.getY(),p1.getZ(),pt.getPointID(),p1.getX()-0.05,p1.getY()+0.05,p1.getZ(),0.15,pointIDLayer,JUSTH_RIGHT,JUSTV_NONE,writer);
	    writeEntityText(p1.getX(),p1.getY(),p1.getZ(),pt.getHeight(),p1.getX()+0.05,p1.getY()-0.05,p1.getZ(),0.15,heightLayer,JUSTH_NONE,JUSTV_TOP,writer);
    }
    
    protected static void writeSectionEntities(List listPK,FileWriter writer) throws IOException, TransformException {
        try {
	        writer.write(getResourceString("groupcode.0")+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("section.section")+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("groupcode.2")+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("section.entities")+Constants.LINE_SEPARATOR);
        } catch(IOException e){
            Logger.logError(DXF12Writer.class,e);
            throw e;
        }
        Iterator it = listPK.iterator();
        PuntoVO p1=null;
        PuntoVO p2=null;
        String currentPK = "";
        while(it.hasNext()){
            PuntoVO currentPoint = (PuntoVO) it.next();
            write3DPoint(currentPoint,getResourceString("layer.profile.point.prefix")+currentPoint.getPkTeor()+getResourceString("layer.profile.point.suffix"),writer);
            write3DPointTexts(currentPoint,writer);
            if(!currentPoint.getPkTeor().equals(currentPK)){
                currentPK = currentPoint.getPkTeor();
                p1 = null;
                p2 = null;
            }
            if(p1==null){
                p1 = currentPoint;
            } else {
	            if(p2==null){
	                p2 = currentPoint;
	            }
            } 
            if (p1!= null && p2!=null){
                write3DLine(p1,p2,getResourceString("layer.profile.line.prefix")+currentPK+getResourceString("layer.profile.line.suffix"),writer);
                p1 = p2;
                p2 = null;
            }
        }
        writeSectionEnd(writer);
    }
    
    protected static void writeSectionEnd(FileWriter writer) throws IOException {
        try {
            writer.write(getResourceString("groupcode.0")+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("section.endsec")+Constants.LINE_SEPARATOR);
	    } catch(IOException e){
	        Logger.logError(DXF12Writer.class,e);
	        throw e;
	    }
    }

    protected static void writeBOF(FileWriter writer) throws IOException {
    }

    protected static void writeEOF(FileWriter writer) throws IOException {
        try {
	        writer.write(getResourceString("groupcode.0")+Constants.LINE_SEPARATOR);
	        writer.write(getResourceString("special.eof")+Constants.LINE_SEPARATOR);
        } catch(IOException e){
            Logger.logError(DXF12Writer.class,e);
            throw e;
        }
    }
	/**
     * Writes the list of profiles to a file in DXF format showing each profile in 
     * a cell of a 2D grid.
	 * @param listPK
	 * @param output
	 * @throws Exception
	 */
	public static void write(List listPK, File output) throws Exception {
		FileWriter writer = new FileWriter(output);
	    writeBOF(writer);
	    writeSectionEntities(listPK,writer);
	    writeEOF(writer);
		writer.flush();
		writer.close();
	}
}
