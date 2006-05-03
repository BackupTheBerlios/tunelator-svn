/*
 * Created on 19-mar-2005
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
package es.tunelator.plugins.transformers;

import java.util.Iterator;
import java.util.List;

import es.tunelator.vo.PuntoVO;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Numbers correlatively the points in each profile,
 * in the order they where received.
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class SetIndexInProfile {
    /**
     * Expects that the points of each profile appear
     * consecutively, and uses the PKTeor field to detect
     * when a new profile begins.
     * 
     * @param input
     * @return
     */
    public static List transform(List input) throws TransformException {
        try {
	        String PKact = "";
	        Iterator it = input.listIterator();
	        int index = 1;
	        while(it.hasNext()){
	            PuntoVO pto = (PuntoVO) it.next();
	            if(!pto.getPkTeor().equals(PKact)){
	                index = 1;
	                PKact = pto.getPkTeor();
	            }
	            // We use Integer.toString() here to avoid differences due to the locale
	            // this conversion is only done with internal storage purpouses
	            pto.setIndexInPK(new Integer(index).toString());
	            index++;
	        }
	        return(input);
	    } catch (Exception e) {
	        throw new TransformException(e);
	    }
    }
}
