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
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Iterator;
import java.util.List;

import es.tunelator.vo.PuntoVO;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Generates an output file for Ispol 
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class IspolWriter {
    /**
     * Generates an ouput file for Ispol iterating through
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
	 * the received point.
	 * Format is:
	 * 		line = indexInPK+" "+xCoordr+" "+yCoord+" "+height
	 * @param punto Point data to include in the output
	 * @param output Destintation file
	 */
	private static void writeLine(PuntoVO punto, FileWriter writer) throws Exception {
		String line = "";
		String newLine = "";
		String indexInPKStr = "";
		String xCoordStr = "";
		double xCoord = 0;
		String yCoordStr = "";
		double yCoord = 0;
		String heightStr = "";
		double height = 0;
		
		newLine = System.getProperty("line.separator");
		DecimalFormat formatter = (DecimalFormat) DecimalFormat.getInstance();
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setDecimalSeparator('.');
		formatter.setDecimalFormatSymbols(symbols);
		
		formatter.applyPattern("###0");
		indexInPKStr = leftPad(punto.getIndexInPK()," ",4);
		
		xCoord = formatter.parse(punto.getXCoord()).doubleValue();
		formatter.applyPattern("#######0.0000");
		xCoordStr = leftPad(formatter.format(xCoord)," ",13);

		yCoord = formatter.parse(punto.getYCoord()).doubleValue();
		yCoordStr = leftPad(formatter.format(yCoord)," ",13);
		
		formatter.applyPattern("######0.0000");
		height = formatter.parse(punto.getHeight()).doubleValue();
		heightStr = leftPad(formatter.format(height)," ",12);;

		line = indexInPKStr+" "+xCoordStr+" "+yCoordStr+" "+heightStr+newLine;
		writer.write(line);
	}
	/**
	 * Utility method to pad a String to its left with a pad String 
	 * and up to a given length.
	 * @param str String to pad
	 * @param pad The value used to pad 
	 * @param length Length of the result. It can be more if pad.length is
	 * greater than 1.
	 * @return Padded String
	 */
	private static final String leftPad(String str, String pad, int length) {
		String ret = new String(str);
		for (int i=0; i < length-str.length();i++) {
			ret = pad+ret;
		}
		return ret;
	}
}
