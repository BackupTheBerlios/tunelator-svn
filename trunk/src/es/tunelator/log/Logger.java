/*
 * Created on 05-abr-2005
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
package es.tunelator.log;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import es.tunelator.AppParameters;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 *<p/>
 * This class acts as a singleton to log messages.
 * Responsabilities:
 * - Provide interfaces to log debug,info,warning and error messages
 * - Format messages in a uniform way throught the application
 * - Set the logging threshold to control the level of detail
 * 
 * Listens for changes in the <code>AppParameters.LOG_THRESHOLD</code>
 * parameter to adjust the logging threshold.
 * 
 * The log appender used is taken from the application parameters
 * (<code>AppParameters.LOG_APPENDER</code>)
 * 
 * @author <a href="maitlo:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 * @see es.tunelator.AppParameters
 */
public class Logger {
    /**
     * @param e
     * @return
     */
    private static String getStringStackTrace(Throwable e){
        StringWriter sw = new StringWriter();
        PrintWriter w = new PrintWriter(sw);
        e.printStackTrace(w);
        return sw.toString();
    }
    /**
     * 
     */
    public static void setLogThreshold() {
        setLogThreshold(AppParameters.getProperty(AppParameters.LOG_THRESHOLD));
    }
    /**
     * @param threshold
     */
    public static void setLogThreshold(String threshold) {
        LogFactory.getFactory().setAttribute(AppParameters.getProperty(AppParameters.LOG_APPENDER)
                							+".threshold",threshold);
        LogFactory.releaseAll();
    }
    /**
     * @param source
     * @param e
     */
    public static void logFatal(Class source,Throwable e) {
        Log log = LogFactory.getLog(es.tunelator.AppParameters.LOG_FATAL);
//        Log log = LogFactory.getLog(source);
        log.error(getStringStackTrace(e));
    }
    /**
     * @param source
     * @param msg
     */
    public static void logFatal(Class source,String msg) {
        Log log = LogFactory.getLog(es.tunelator.AppParameters.LOG_FATAL);
//        Log log = LogFactory.getLog(source);
        log.error(msg);
    }
    /**
     * @param source
     * @param msg
     * @param e
     */
    public static void logFatal(Class source,String msg,Throwable e) {
        Log log = LogFactory.getLog(es.tunelator.AppParameters.LOG_FATAL);
//        Log log = LogFactory.getLog(source);
        log.error(msg);
        log.error(getStringStackTrace(e));
    }
    /**
     * @param source
     * @param e
     */
    public static void logError(Class source,Throwable e) {
//      Log log = LogFactory.getLog(source);
        Log log = LogFactory.getLog(es.tunelator.AppParameters.LOG_ERROR);
        log.error(getStringStackTrace(e));
    }
    /**
     * @param source
     * @param msg
     */
    public static void logError(Class source,String msg) {
//        Log log = LogFactory.getLog(source);
        Log log = LogFactory.getLog(es.tunelator.AppParameters.LOG_ERROR);
        log.error(msg);
    }
    /**
     * @param source
     * @param msg
     * @param e
     */
    public static void logError(Class source,String msg,Throwable e) {
//        Log log = LogFactory.getLog(source);
        Log log = LogFactory.getLog(es.tunelator.AppParameters.LOG_ERROR);
        log.error(msg);
        log.error(getStringStackTrace(e));
    }
    /**
     * @param source
     * @param e
     */
    public static void logWarning(Class source,Throwable e) {
        Log log = LogFactory.getLog(es.tunelator.AppParameters.LOG_WARN);
//        Log log = LogFactory.getLog(source);
        log.warn(e);
    }
    /**
     * @param source
     * @param msg
     */
    public static void logWarning(Class source,String msg) {
        Log log = LogFactory.getLog(es.tunelator.AppParameters.LOG_WARN);
//        Log log = LogFactory.getLog(source);
        log.warn(msg);
    }
    /**
     * @param source
     * @param msg
     * @param e
     */
    public static void logWarning(Class source,String msg,Throwable e) {
        Log log = LogFactory.getLog(es.tunelator.AppParameters.LOG_WARN);
//        Log log = LogFactory.getLog(source);
        log.warn(msg,e);
    }
    /**
     * @param source
     * @param e
     */
    public static void logInfo(Class source,Exception e) {
        Log log = LogFactory.getLog(es.tunelator.AppParameters.LOG_INFO);
//        Log log = LogFactory.getLog(source);
        log.info(e.getMessage());
    }
    /**
     * @param source
     * @param msg
     */
    public static void logInfo(Class source,String msg) {
        Log log = LogFactory.getLog(es.tunelator.AppParameters.LOG_INFO);
//        Log log = LogFactory.getLog(source);
        log.info(msg);
    }
    /**
     * @param source
     * @param msg
     * @param e
     */
    public static void logInfo(Class source,String msg,Throwable e) {
        Log log = LogFactory.getLog(es.tunelator.AppParameters.LOG_INFO);
//        Log log = LogFactory.getLog(source);
        log.info(msg,e);
    }
    /**
     * @param source
     * @param e
     */
    public static void logDebug(Class source,Throwable e){
        Log log = LogFactory.getLog(es.tunelator.AppParameters.LOG_DEBUG);
//        Log log = LogFactory.getLog(source);
        log.debug(e);
    }
    /**
     * @param source
     * @param msg
     */
    public static void logDebug(Class source,String msg){
        Log log = LogFactory.getLog(es.tunelator.AppParameters.LOG_DEBUG);
//        Log log = LogFactory.getLog(source);
        log.debug(msg);
    }
    /**
     * @param source
     * @param msg
     * @param e
     */
    public static void logDebug(Class source,String msg,Throwable e){
        Log log = LogFactory.getLog(es.tunelator.AppParameters.LOG_DEBUG);
//        Log log = LogFactory.getLog(source);
        log.debug(msg,e);
    }
    /**
     * @param source
     * @param msg
     */
    public static void logTrace(Class source,String msg){
        Log log = LogFactory.getLog(source);
        log.trace(msg);
    }
    /**
     * @param source
     * @param msg
     * @param e
     */
    public static void logTrace(Class source,String msg,Throwable e){
        Log log = LogFactory.getLog(source);
        log.trace(msg,e);
    }
    /**
     * @see es.tunelator.vo.DataListener#dataChanged(java.lang.Object)
     */
    public void dataChanged(Object source, Object data) {
        if(data.equals(AppParameters.getParams())){
            setLogThreshold();
        }
    }
}
