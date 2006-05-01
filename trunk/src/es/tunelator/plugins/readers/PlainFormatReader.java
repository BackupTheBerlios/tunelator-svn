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
package es.tunelator.plugins.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import es.tunelator.UserMessageException;
import es.tunelator.log.Logger;
import es.tunelator.resources.Resourcer;
import es.tunelator.vo.PuntoVO;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * Reads data from a plain text file where each line contains the
 * following data for one point in a profile:
 * <dir>
 * 	<li> Date (DD.MM.YYYY)</li>
 * 	<li> Time (HH:MM:SS)</li>
 * 	<li> Measured PK (8.4)</li>
 * 	<li> Distance to the axis (8.4)</li>
 * 	<li> Increment in height (8.4)</li>
 * 	<li> PK of the theorical profile to which the point corresponds</li>
 * 	<li> Heigh (Z)</li>
 * 	<li> X Coordinate</li>
 *  <li> Y Coordinate</li>
 *  <li> Point ID label</li>
 *  <li> Code common to all the points in the file</li>
 * </dir>
 * Columns are separated by one or more white space.<p/>
 * 
 * Lines where all data has 1.0 value are skipped for they are
 * wrongly introduced as result of stationing the equipment.</p>
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 *
 */
public class PlainFormatReader {
    /**
     * Comment for <code>tokenDelimiter</code>
     */
    private static String tokenDelimiter = " ";
	/**
	 * Reads the data in one line into a PuntoVO object.
	 * Only checks if the number of columns is corrects, does not check
	 * each datum format.
	 * @param line
	 * @return PuntoVO object containing the string values of each datum
	 * @throws UserMessageException
	 */
	private static PuntoVO parseLine(String line) throws UserMessageException{
		StringTokenizer tokenizer = new StringTokenizer (line,tokenDelimiter,
                false);
		int tokenNumber = 0;
		PuntoVO punto = new PuntoVO();
		if(tokenizer.countTokens() != 11) {
		    Logger.logError(PlainFormatReader.class,
                    Resourcer.getString(null,"error.fileFormat"));
		    throw new UserMessageException(Resourcer.getString(null,
                    "error.fileFormat"));		    
		}
		while(tokenizer.hasMoreTokens()){
			String token = tokenizer.nextToken();
			switch(tokenNumber){
				case 0: punto.setDate(token);
						break;
				case 1: punto.setTime(token);
						break;
				case 2: punto.setPkAct(token);
						break;
				case 3: punto.setDeje(token);
						break;
				case 4: punto.setHeightInc(token);
						break;
				case 5: punto.setPkTeor(token);
						break;
				case 6: punto.setHeight(token);
						break;
				case 7: punto.setXCoord(token);
						break;
				case 8: punto.setYCoord(token);
						break;
				case 9: punto.setPointID(token);
						break;
				case 10: punto.setCode(token);
						break;
				default:Logger.logDebug(PlainFormatReader.class,
                        "Incorrect token number:"+
                        new Integer(tokenNumber).toString()); 
				    	throw new UserMessageException(
                                Resourcer.getString(null,"error.fileFormat"));
			}
			tokenNumber++;
		}
		if (punto.getDate().equals("1.00.1.00.1.00") && 
                punto.getTime().equals("1.00:1.00:1.00"))
			return null;
		return punto;
	}
	/**
	 * Reads the contents of a file into an ArrayList structure of
	 * PointVO objects.
	 * @param file
	 * @return
	 * @throws UserMessageException
	 */
	public static ArrayList readFile(File file) throws UserMessageException {
	    try {
			FileReader reader = new FileReader(file);
			LineNumberReader lineReader = new LineNumberReader(reader);
			ArrayList result = new ArrayList();
			String lastPK = "";
			while (lineReader.ready()) {
				PuntoVO punto = null;
				String line = lineReader.readLine();
				punto = parseLine(line);
				if (punto == null)
					continue;
				result.add(punto);
			}
			if(result.size()==0) {
			    throw new UserMessageException(Resourcer.getString(null,"error.emptyFile"));
			}
			return result;
	    } catch (FileNotFoundException e) {
	        Logger.logError(PlainFormatReader.class,e);
	        throw new UserMessageException(Resourcer.getString(null,"error.fileNotFound"),e);
	    } catch (IOException e) {
	        Logger.logError(PlainFormatReader.class,e);
	        throw new UserMessageException(Resourcer.getString(null,"error.fileRead"),e);
	    } catch (UserMessageException e) {
	        Logger.logInfo(PlainFormatReader.class,e.getMessage());
	        throw e;
	    } catch (Exception e) {
	        Logger.logError(PlainFormatReader.class,e);
	        throw new UserMessageException(e);
	    }
	}
}
