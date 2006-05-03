/*
 * Created on 13-mar-2005
 * 
 * Copyright 2005, Juan Alvarez Ferrando
 * 
 * The author has given non trasferable right to use and modify this
 * code to Lógica Equipamientos Integrales, S.L.
 * 
 * All rights are reserved to the author.  
 *
 */
package es.tunelator.plugins.transformers;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

import es.tunelator.log.Logger;
import es.tunelator.resources.Resourcer;
import es.tunelator.vo.ProfileVO;
import es.tunelator.vo.PuntoVO;

/**
 * Sorts the data by the value of their theorical PK, conserving
 * their relative order of appearance inside each PK.
 * Theorical PKs should serve as identifiers of the profiles, so 
 * this is equivalent to sorting by profile.
 * It accepts both <code>PuntoVO</code> and <code>ProfileVO</code>
 * objects as contents of the input collection. 
 * 
 * @author Juan Alvarez
 *
 */
public class SortPKTeor {

    /**
	 * Performs the sorting operation.
	 * Takes an ArrayList structure of PuntoVO objects, and inserts them 
	 * in a TreeMap, using the double value of the PKTeor field as key.
	 * This requires converting the text value of the PKTeor field, to
	 * double and so it may result in format errors.
	 * The values should be formated with no thousands separator and
	 * a point character as the decimal separator. At least one integer and
	 * one decimal digit must exist, and as much as eight integer digits and 
	 * four decimal digits are taken. 
	 * @param input
	 * @return ArrayList where points are sorted by the double value of their
	 * 			PKTeor field.
	 * @throws TransformException 
	 */
	protected static List sort(List input) throws TransformException {
		try {
			ArrayList result = null;
			DecimalFormat formatter = (DecimalFormat) DecimalFormat.getInstance();
			DecimalFormatSymbols symbols = new DecimalFormatSymbols();
			symbols.setDecimalSeparator('.');
			formatter.setDecimalFormatSymbols(symbols);
			formatter.applyPattern("#######0.0###");
			TreeMap tree = new TreeMap();
			ArrayList listPK = null;
			String lastPK = "";
			Iterator inputIt = input.iterator();
			while (inputIt.hasNext()) {
				PuntoVO punto = null;
				punto = (PuntoVO) inputIt.next();
				if (punto == null)
					continue;
				if (!punto.getPkTeor().equals(lastPK)) {
					if (listPK != null) {
					    Double ptKey = new Double(formatter.parse(punto.getPkTeor()).doubleValue());
					    if(tree.containsKey(ptKey)){ // The PK of this point already appeared
					        // Add the point to the existing list for its PK so we don't create new
					        // profiles if points are not grouped by PK
					        ((ArrayList)tree.get(ptKey)).add(punto);
					        continue;
					    }
						tree.put(new Double(formatter.parse(lastPK).doubleValue()),listPK);
					}
					listPK = new ArrayList();
					lastPK = punto.getPkTeor();
				}
				listPK.add(punto);
			}
			if (listPK != null) {
				tree.put(new Double(formatter.parse(lastPK).doubleValue()),listPK);
			}
			
			result = new ArrayList();
			Iterator pkIterator = tree.values().iterator();
			while(pkIterator.hasNext()){
				ArrayList pointsPK = (ArrayList) pkIterator.next();
				Iterator pointIterator = pointsPK.iterator();
				while(pointIterator.hasNext()){
					result.add(pointIterator.next());
				}
			}
			return result;
		} catch (ParseException e) {
		    Logger.logError(SortPKTeor.class,e);
	        String msg = Resourcer.getString(null,"error.dataFormat");
			throw new TransformException(msg);
		} catch (Exception e) {
		    e.printStackTrace();
		    Logger.logError(SortPKTeor.class,e);
			throw new TransformException(e);
		}
	}
	
    /**
	 * Performs the sorting operation.
	 * Takes an ArrayList structure of ProfileVO objects, and inserts them 
	 * in a TreeMap, using the double value of the PK field as key.
	 * This requires converting the text value of the PK field, to
	 * double and so it may result in format errors.
	 * The values should be formated with no thousands separator and
	 * a point character as the decimal separator. At least one integer and
	 * one decimal digit must exist, and as much as eight integer digits and 
	 * four decimal digits are taken. 
	 * @param input
	 * @return ArrayList where points are sorted by the double value of their
	 * 			PK field.
	 * @throws TransformException 
	 */
	protected static List sortProfiles(List input) throws TransformException {
		try {
			ArrayList result = null;
			DecimalFormat formatter = (DecimalFormat) DecimalFormat.getInstance();
			DecimalFormatSymbols symbols = new DecimalFormatSymbols();
			symbols.setDecimalSeparator('.');
			formatter.setDecimalFormatSymbols(symbols);
			formatter.applyPattern("#######0.0###");
			TreeMap tree = new TreeMap();
			Iterator it = input.iterator();
			while (it.hasNext()) {
				ProfileVO profile = null;
				profile = (ProfileVO) it.next();
				tree.put(new Double(formatter.parse(profile.getPK()).doubleValue()),profile);
			}
			result = new ArrayList();
			it = tree.values().iterator();
			while(it.hasNext()){
				ProfileVO profile = (ProfileVO) it.next();
				result.add(profile);
			}
			return result;
		} catch (ParseException e) {
		    Logger.logError(SortPKTeor.class,e);
	        String msg = Resourcer.getString(null,"error.dataFormat");
	        Logger.logError(SortPKTeor.class,"("+SortPKTeor.class.getName()+") "+msg);
			throw new TransformException(msg);
		} catch (Exception e) {
		    Logger.logError(SortPKTeor.class,e);
			throw new TransformException(e);
		}
	}
	/**
	 * Just calls the private sort method.
	 *  
	 * @param input
	 * @return
	 * @throws TransformException
	 */
	public static List transform(List input) throws TransformException {
	    if(input.size()>0){
	        if(input.get(0).getClass().equals(PuntoVO.class))
	            return(sort(input));
	        if(input.get(0).getClass().equals(ProfileVO.class))
	            return(sortProfiles(input));
	    }
	    return input;
	}
}
