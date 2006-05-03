/*
 * Created on 26-jul-2005
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
package es.tunelator.vo;

import java.util.Comparator;

import es.tunelator.log.Logger;
import es.tunelator.plugins.transformers.TransformException;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * Generates keys for <code>PuntoVO</code> objects, to sort them on their theoric PK
 * 
 * @author <a href= mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 * 
 */
public class PuntoVOSimpleComparator implements Comparator {
    /**
     * <code>keyColumn</code> - The key identifier of the column on which the comparator will
     * compare the objects.
     */
    private int keyColumn = 1; //Default is to sort by Point ID
    /**
     * @param keyColumn : The code of the attribute that will be returned as key
     */
    public PuntoVOSimpleComparator(int keyColumn) {
        this.keyColumn = keyColumn;
    }
    /**
     * @param column
     */
    public void setColumn(int column){
        keyColumn = column;
    }
    /**
     * Returns the value that has to be used to compare the 
     * <code>PuntoVO</code> received as an <code>Object</code>, according
     * to the attribute for which this comparator is created.
     * 
     * @param An <code>Object</code> referencing a <code>PuntoVO</code>
     * @return An <code>Object</code> reference to the value of the attribute 
     * of the <code>PuntoVO</code> contained in <code>data</code>, 
     * corresponding to the key attribute of this comparator.
     * @throws TransformException If some attribute of the parameter is not
     * convertible to its native type from the received string representation.
     * @see es.tunelator.vo.SortKeyGenerator#getKey(java.lang.Object)
     */
    public Object getKey(Object data) {
        try {
	        Object result = null;
	        if(data.getClass().equals(PuntoVO.class)){
	            switch(keyColumn) {
	            	case 1: result = ((PuntoVO)data).getPointID();
	            			break;
	            	case 2: result = new Double(((PuntoVO)data).getPoint3D().
	            	        	getTheoricPK());
	            			break;
	            	case 3: result = new Double(((PuntoVO)data).getPoint3D().
	            	        	getRealPK());
	            			break;
	            	case 4: result = new Double(((PuntoVO)data).getPoint3D().
	            	        	getDeje());
	            			break;
	            	case 5: result = new Double(((PuntoVO)data).getPoint3D().
	            	        	getHeightInc());
	            			break;
	            	case 6: result = new Double(((PuntoVO)data).getPoint3D().
	            	        	getX());
        					break;
 	            	case 7: result = new Double(((PuntoVO)data).getPoint3D().
 	            	        	getY());
 	            			break;
	            	case 8: result = new Double(((PuntoVO)data).getPoint3D().
	            	        	getZ());
        					break;
	            	case 9: result = ((PuntoVO)data).getCode();
	            			break;
	            	case 10: result = ((PuntoVO)data).getPoint3D().getDate();
	            			 break;
	            	case 11: result = ((PuntoVO)data).getPoint3D().getTime();
	            			 break;
	            	case 12: result = new Integer(((PuntoVO)data).getPoint3D().
	            	        	getPkIndex());
       			 			 break;
	            	default: throw new InternalError("Illegal column code "+
	            	        	keyColumn);
	            }
	            return result;
	        } else {
	            throw new InternalError("The only supported type is PuntoVO");
	        }
        } catch (TransformException e) {
            Logger.logError(this.getClass(),e.getMessage());
            throw new InternalError(e.getMessage());
        }
    }
    /**
     * Compares two <code>PuntoVO</code> objects on the value of the attribute
     * for which this comparator was constructed.
     * 
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     * @throws InternalError in case any of the parameters is not of 
     * <code>PuntoVO</code> type.
     */
    public int compare(Object o1, Object o2) {
        if((o1 instanceof PuntoVO)&&(o2 instanceof PuntoVO)) {
	        PuntoVO p1 = (PuntoVO) o1;
	        PuntoVO p2 = (PuntoVO) o2;
	        Object key1 = this.getKey(p1);
	        Object key2 = this.getKey(p2);
	        Comparable c1 = (Comparable)key1;
	        Comparable c2 = (Comparable)key2;
	        return c1.compareTo(c2);
        } else {
            Logger.logError(this.getClass(),"Received types ("+o1.getClass().getName()+","+o2.getClass().getName()+")");
            throw new InternalError("Invalid type for this comparator: "+o1.getClass().getName());
        }
    }
}
