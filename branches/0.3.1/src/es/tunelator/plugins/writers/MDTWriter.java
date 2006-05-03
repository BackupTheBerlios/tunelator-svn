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
 * Generates an output file in MDT format
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez</a>
 */
public class MDTWriter {
	/**
	 * Generates a file in MDT format iterating trough the
	 * ArrayList.
	 * Point order is preserved.
	 * 
	 * @param listPK Points to include in the output
	 * @param output Destination file
	 * @throws Exception
	 */
	public static void write(List listPK, File output) throws Exception {
		Iterator ptIterator = listPK.iterator();
		FileWriter writer = new FileWriter(output);
		while(ptIterator.hasNext()) {
			PuntoVO punto = (PuntoVO) ptIterator.next();
			writeLine(punto,writer);
		}
		writer.flush();
		writer.close();
	}
	/**
	 * Generates a line in the output file whith the point data
	 * in MDT format.
	 * Format is:
	 * 		punto.getPkTeor()+"   "+punto.getDeje()+"  "+punto.getHeight()+" "+punto.getCode()
	 * 
	 * @param punto Point data to include in the output
	 * @param output Destination file
	 */
	private static void writeLine(PuntoVO punto, FileWriter writer) throws Exception {
		String line = "";
		String newLine = "";
		newLine = System.getProperty("line.separator");
		line = punto.getPkTeor()+"   "+punto.getDeje()+"  "+punto.getHeight()+" "+punto.getCode()+newLine;
		writer.write(line);
	}
}
