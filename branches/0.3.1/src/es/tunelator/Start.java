/*
 * Created on 19-ene-2005
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

import java.util.Locale;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import es.tunelator.gui.adv.MainFrame;
import es.tunelator.log.Logger;
import es.tunelator.resources.Resourcer;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * Bootstraps the application<br/>
 * Responsabilities:<br/>
 * <dir>
 * <li>Select initial Look&Feel</li>
 * <li>Create and show the main window</li>
 * <li>Collect all unhandled errors and give a user friendly error message</li>
 * </dir>
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class Start {
    private static final String message_en = "Inespecific internal error. Please report "+
    	"this error\n"+
    	" Tunelator regrets it if this message is not \nin your" +
    	" own language, but it couldn't access\n" +
    	" localized resources.";
    private static final String message_es = "Error interno no especifico. Por favor "+
    	"reporte este error.";
    private static final String title = "Tunelator - Error";
	/**
	 * Bootstraps the application, creates and shows the user interface
	 * @param args
	 */
	public static void main(String[] args) {
		MainFrame frame = null;
		try {
// Set log level as configured at the application parameters		    
		    Logger.setLogThreshold(AppParameters.getParams().getProperty(
		                           "log.threshold",AppParameters.LOG_ERROR));
// Log application startup		    
		    Logger.logInfo(Start.class,Resourcer.getString(null,
		                                         "log.info.startup"));
// Set spanish as default language and Spain as default country		    
            Locale.setDefault(new Locale("es","ES"));
// To set up the Look and Feel
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows."+
			                         "WindowsLookAndFeel");
			frame = new MainFrame();
			frame.setVisible(true);
			frame.correctTabStatus();
// To change the Look and Feel. To be included as an option some day...
//	  		UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk."+
//			"GTKLookAndFeel");
//			SwingUtilities.updateComponentTreeUI(frame);
//			frame.pack();
		} catch (Exception e) {
		    Logger.logFatal(Start.class,e);
            if(frame != null){
                frame.showErrorMessage(Resourcer.getString(null,
	                                         "error.internal"));
                frame.dispose();
            } else {
                try {
                    JOptionPane.showMessageDialog(null,
                            Resourcer.getString(Start.class,"error.internal"),
	                        Resourcer.getString(Start.class,"error.title"),
	                        JOptionPane.ERROR_MESSAGE);
                } catch (Exception e2) {
                    String message = "";
                    // This is the last resort to give a localized message
                    // As I'm spanish :-), we give a spanish message if it's
                    // the default language, and an english one otherwise.
                    if(Locale.getDefault().equals(new Locale("es"))){
                        message = message_es;
                    } else {
                        message = message_en;
                    }
                    JOptionPane.showMessageDialog(null, message, title,
	                        JOptionPane.ERROR_MESSAGE);
                }
            }
			System.exit(1);
		} catch (InternalError e) {
		    Logger.logFatal(Start.class,e);
            if(frame != null){
                frame.showErrorMessage(Resourcer.getString(null,
	                                         "error.internal"));
                frame.dispose();
            } else {
                try {
                    JOptionPane.showMessageDialog(null,
                            Resourcer.getString(Start.class,"error.internal"),
	                        Resourcer.getString(Start.class,"error.title"),
	                        JOptionPane.ERROR_MESSAGE);
                } catch (Exception e2) {
                    String message = "";
                    // This is the last resort to give a localized message
                    // As I'm spanish :-), we give a spanish message if it's
                    // the default language, and an english one otherwise.
                    if(Locale.getDefault().equals(new Locale("es"))){
                        message = message_es;
                    } else {
                        message = message_en;
                    }
                    JOptionPane.showMessageDialog(null, message, title,
	                        JOptionPane.ERROR_MESSAGE);
                }
            }
			System.exit(1);
		}
	}
}
