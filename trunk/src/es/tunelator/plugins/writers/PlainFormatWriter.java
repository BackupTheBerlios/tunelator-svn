/*
 * Created on 08-may-2005
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
import java.util.Iterator;
import java.util.List;

import es.tunelator.vo.PuntoVO;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Writes a point list in the same format used to read by <code>PlainFormatReader</code>
 *
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class PlainFormatWriter {
    /**
     * Generates an ouput file iterating through
     * the points in the ArrayList and calling writeLine for
     * each point.
     * Point order is preserved.
     * 
     * @param puntos ArrayList containing the points
     * @param output File
     * @throws Exception
     */
	public static void write(List puntos, File output) throws Exception {
		Iterator pkIterator = puntos.iterator();
		FileWriter writer = new FileWriter(output);
		while(pkIterator.hasNext()){
			PuntoVO punto = null;
			punto = (PuntoVO) pkIterator.next();
			writeLine(punto, writer);
		}
		writer.flush();
		writer.close();
	}
	/**
	 * Writes a line in the output file corresponding to 
	 * the received point.<br>
	 * Format is:<br>
	 * 		line = date+" "+time+" "+PKAct+" "+Deje+" "+HeightInc+PKTeor+" "+Height+" "+X+" "+Y+" "+ID+" "+Code
	 * 
	 * @param punto Point data to include in the output
	 * @param output Destintation file
	 */
	private static void writeLine(PuntoVO punto, FileWriter writer) throws Exception {
	    String line="";
	    String newLine="";
		newLine = System.getProperty("line.separator");
		line = punto.getDate()+" "+punto.getTime()+" "+punto.getPkAct()+" "+
		       punto.getDeje()+" "+punto.getHeightInc()+" "+punto.getPkTeor()+" "+
		       punto.getHeight()+" "+punto.getXCoord()+" "+punto.getYCoord()+" "+
		       punto.getPointID()+" "+punto.getCode()+newLine;
		writer.write(line);
	}
}
