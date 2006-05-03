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
package es.tunelator.plugins.transformers;

import java.util.Iterator;
import java.util.List;

import es.tunelator.vo.PuntoVO;

/**
 * &COPY; 2005 Juan Alvarez Ferrando
 * <p/>
 * Sets the date and time of the firts point in each profile
 * to the rest of points in the same profile.
 *  
 * @author Juan Alvarez
 */
public class SetProfilePointsDateTime {
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
	        String dateAct = "";
	        String timeAct = "";
	        Iterator it = input.listIterator();
	        while(it.hasNext()){
	            PuntoVO pto = (PuntoVO) it.next();
	            if(!pto.getPkTeor().equals(PKact)){
	                PKact = pto.getPkTeor();
	                dateAct = pto.getDate();
	                timeAct = pto.getTime();
	            }
	            pto.setDate(dateAct);
	            pto.setTime(timeAct);
	        }
	        return(input);
	    } catch (Exception e) {
	        throw new TransformException(e);
	    }
    }
}
