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
package es.tunelator.resources;

import java.text.MessageFormat;
import java.util.Hashtable;
import java.util.ResourceBundle;

import es.tunelator.UserMessageException;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Singleton used to access the application resources
 * Reponsabilities:
 *  - Initialize and own the resource bundles
 *  - Give access the resource bundles
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</p>
 */
public class Resourcer {
    private static Hashtable bundles = new Hashtable();
	/**
	 * The resource bundel for resources that are global to all the application
	 */
	public static ResourceBundle global = null;

	static {
		global = ResourceBundle.getBundle(Resourcer.class.getPackage().getName()+".global");
	}
	
	/**
	 * Loads the resource bundle file of the given class and stores in in the 
	 * internal cache.
	 * The file must have the class name followed by the locale suffix and extension as 
	 * specified for <code>ResourceBundle</code>.
	 * @param bundleId
	 */
	public static void loadClassBundle(Class bundleId) {
	    ResourceBundle bundle = null;
	    if(bundleId != null) {
		    // If the bundle for this class is not cached, load it and put it into the cache
		    if(!bundles.containsKey(bundleId.getName())){
		        bundle = ResourceBundle.getBundle(bundleId.getName());
		        if (bundle != null){
		            bundles.put(bundleId.getName(),bundle);
		        } else {
		    		MessageFormat mf = new MessageFormat(global.getString("error.bundleNotFound"));
		    		Object[] params = { bundleId.getName()};
		    		String message = mf.format(params);
		            throw new InternalError(message);
		        }
		    }
	    }
	}
	/**
	 * Gets a string resource from the resource bundle of the received Class
	 * The resource bundle is searched for in the same package of the class and with
	 * its same name, appended with the locale extensions. For example for this same
	 * class it should be es/tunelator/resources/Resourcer_es_ES.properties
	 * for the Spanish locale.
	 * 
	 * If bundleId is null, then the key is searched for in the global resource file
	 * which must be named "global" and be placed at this class's path.
	 * 
	 * @param bundleId
	 * @param key
	 * @return
	 * @throws UserMessageException
	 */
	public static String getString(Class bundleId,String key) {
	    String result = null;
	    ResourceBundle bundle = null;
	    // If a class is specified take its bundle
	    if(bundleId != null) {
		    // If the bundle for this class is not cached, load it and put it into the cache
		    if(!bundles.containsKey(bundleId.getName())){
		        bundle = ResourceBundle.getBundle(bundleId.getName());
		        if (bundle != null){
		            bundles.put(bundleId.getName(),bundle);
		        } else {
		    		MessageFormat mf = new MessageFormat(global.getString("error.bundleNotFound"));
		    		Object[] params = { bundleId.getName()};
		    		String message = mf.format(params);
		            throw new InternalError(message);
		        }
		    } else { // Take the bundle from the cache
		        bundle = (ResourceBundle) bundles.get(bundleId.getName());
		    }
	    } else { // If no class was specified, use the global resources
	        bundle = global;
	    }
	    result = bundle.getString(key);
	    return result;
	}
}
