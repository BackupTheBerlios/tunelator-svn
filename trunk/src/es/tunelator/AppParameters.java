/*
 * Created on 22-mar-2005
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

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;

import es.tunelator.log.Logger;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 *  
 * Singleton that holds the application parameters.
 * These are loaded at the class static constructuctor from
 * the application.properties file found at the folder
 * pointed by the install.path environment variable.<p/>
 * 
 * Notifies registered listeners when application parameters
 * change. Some spplication parameters, like the log threshold
 * may change at runtime.
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class AppParameters {
    /**
     * <code>Properties</code> to read and hold the values read from the 
     * properties file
     */
	private static Properties params;
	/**
	 * Detail level in log file
	 */
	public static final String LOG_THRESHOLD = "log.threshold";
    /**
     * Path where HTML help files are
     */
	public static final String HELP_PATH = "help.path";
    /**
     * HTML file with the about dialog content
     */
	public static final String ABOUT_FILE = "about.file";
    /**
     * YES
     */
	public static final String YES = "yes";
    /**
     * NO
     */
	public static final String NO = "no";
    /**
     * Appender to send log events to
     */
	public static final String LOG_APPENDER = "log.appender";
    /**
     * Log level DEBUG
     */
	public static final String LOG_DEBUG = "DEBUG";
    /**
     * Log level INFO
     */
	public static final String LOG_INFO = "INFO";
    /**
     * Log level WARN
     */
	public static final String LOG_WARN = "WARN";
    /**
     * Log level ERROR
     */
	public static final String LOG_ERROR = "ERROR";
    /**
     * Log level FATAL
     */
	public static final String LOG_FATAL = "FATAL";
    /**
     * @return Returns the params.
     */
    public static Properties getParams() {
        return params;
    }
    /**
     * Returns the value of the application parameter identified
     * by <code>property</code>
     * 
     * @param property
     * @return Value of the requested parameter
     */
    public static String getProperty(String property) {
        return params.getProperty(property);
    }
    /**
     * Modifies the value of the application parameter identified by
     * <code>property</code>
     * @param property Identifier of the parameter
     * @param value Value to set to the parameter
     * @throws Exception Firing notifications failed
     */
    public static void setProperty(String property,String value) 
           throws Exception {
        params.setProperty(property,value);
    }
	/**
	 * Loads the application properties file
	 * Requires that the install.path environment variable be set
	 * to the location where the application.properties file is
	 * stored.<p/>
	 * In case of error an entry is created in the log and the application
	 * parameters are left empty.
	 */
	static {
		try {
			String fileSeparator = System.getProperty("file.separator");
		    // Installation path spacified by JVM parameter
			String installPath = System.getProperty(
			                            Constants.ENV_INSTALL_PATH);
			if(installPath == null) {        
			    installPath = System.getProperty("user.dir");
			}
			System.out.println("Install path = "+installPath);
			if(!new File(installPath+fileSeparator+"application.properties").exists()){
			    // Falling down to another way of detecting the installation
			    // path. Look for the path of this class's binary.
				String className = AppParameters.class.getName();
				className = className.replaceAll("\\.","/")+".class";
				URL url = AppParameters.class.getClassLoader().getResource(className);
			    String path = url.getPath();
			    Logger.logDebug(AppParameters.class,"Install path URL is "+path);
			    int endOfRootPath = path.indexOf(className);
			    if(endOfRootPath < 0){
			        String message = "Finding out intall path: Class name not found in class path";
			        Logger.logFatal(AppParameters.class,message);
			        throw new InternalError(message);
			    }
			    installPath = path.substring(0,endOfRootPath-1);
			    int jarPosition = installPath.lastIndexOf(".jar!");
			    if(jarPosition <0){
			        // Class not loaded from a JAR file.
			        String message = "Finding out intall path: Class not loaded from jar file";
			        Logger.logFatal(AppParameters.class,message);
			        throw new InternalError(message);
			    }
			    // Take the full path of the jar file (the ! character is excluded)
			    installPath = installPath.substring(0,jarPosition+4);
			    // Take the directory where the jar is
			    installPath = new File(installPath).getParent();
			    System.out.println("Class Install path = " + installPath);
			}
			if(!new File(installPath+fileSeparator+"application.properties").exists()){
		        // Could not get or find out the installation path
		        String message = "Could not find installation path or application properties not found there";
		        Logger.logFatal(AppParameters.class,message);
		        throw new InternalError(message);
			}
			Logger.logDebug(AppParameters.class,"InstallPath is "+installPath);
			FileInputStream is;
			if(installPath.substring(installPath.length()-1)
			        .equals(fileSeparator))
				fileSeparator = "";
			params = new Properties();
			is = new FileInputStream(installPath+fileSeparator+
			        "application.properties");
			params.load(is);
			Logger.logDebug(AppParameters.class,"Application properties read");
		} catch (Exception e) {
		    Logger.logError(AppParameters.class,e);
			params = new Properties();
		}
	}
}
