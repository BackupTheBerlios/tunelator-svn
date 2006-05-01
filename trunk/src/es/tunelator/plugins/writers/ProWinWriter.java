/*
 * Created on 13-mar-2005
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
 * Generates an output file in ProWin format
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class ProWinWriter {
    /**
     * Generates an output file in ProWin format, iterating 
     * through the ArrayList and invoking writeLine for each
     * point.
     * Point order is preserved.
     * 
     * @param puntos List of point to include in the output
     * @param output Destination file
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
	 * Writes a line in the output file with the point's data 
	 * in ProWin format.
	 * Format is:
	 * 		punto.getDate()+" "+punto.getTime()+" "+punto.getPkAct()+" "+punto.getDeje()+" "+punto.getHeightInc()
	 * 
	 * @param punto Point data to include in the output
	 * @param output Destination file
	 */
	private static void writeLine(PuntoVO punto, FileWriter writer) throws Exception {
		String line = "";
		String newLine = "";
		newLine = System.getProperty("line.separator");
		line = punto.getDate()+" "+punto.getTime()+" "+punto.getPkAct()+" "+punto.getDeje()+" "+punto.getHeightInc()+newLine;
		writer.write(line);
	}
}
