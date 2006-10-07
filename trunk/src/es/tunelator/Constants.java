/*
 * Created on 21-mar-2005
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
package es.tunelator;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * Contains application-wide constant values and environment variables.
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class Constants {
    /**
     * OS dependent new line character
     */
    public static final String LINE_SEPARATOR = 
        						System.getProperty("line.separator");
    /**
     * OS dependent separator of file paths
     */
    public static final String FILE_SEPARATOR = 
        						System.getProperty("file.separator");
    /**
     * Environment variable key to get the installation path
     */
	public static final String ENV_INSTALL_PATH = "install.path";
	/**
	 * Name of the file created to request permanent licenses
	 */
	public static final String LIC_REQ_FILENAME = "TunelatorLR.xml";
	/**
	 * Time values have to be referenced to the same date to be compared
	 */
	public static final String TIME_REFERENCE_DATE = "27.12.1971";
    /**
     * Supported Languages
     */
    public static final String[] SUPPORTED_LANGS = {
        "es", // Spanish
        "en"  // English
    };
}
