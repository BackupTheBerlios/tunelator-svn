/*
 * Created on 15-sep-2005
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

import java.util.List;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * Represents a profile, as a set of points that are 
 * ordered in the path that draws a slice of a tunnel.<p/>
 * Each profile is identified by the theoric PK that corresponds
 * to the point at which the tunnel is sliced.
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 * 
 */
public class ProfileVO {
    /**
     * <code>PK</code> - The identification of the profile. Corresponds to
     * the theoric PK of all its points.
     */
    private String PK = "";
    /**
     * Comment for <code>elements</code>
     */
    private List elements = null;
    public ProfileVO(List elements){
        if(elements.isEmpty()){
            throw new IllegalArgumentException(
                    "Atempt to create ProfileVO with no points");
        }
        this.setElements(elements);
        this.setPK(((PuntoVO)elements.get(0)).getPkTeor());
    }
    /**
     * @param elements The elements to set.
     */
    public void setElements(List elements) {
        this.elements = elements;
    }
    /**
     * @param pk The pK to set.
     */
    public void setPK(String pk) {
        PK = pk;
    }
    /**
     * @return Returns the elements.
     */
    public List getElements() {
        return elements;
    }
    /**
     * @return Returns the pK.
     */
    public String getPK() {
        return PK;
    }
    /**
     * Returns a <code>String</code> in the form:
     * PK+"["+<number of points>"]" to be used as the 
     * label of the nodes in the <code>JTree</code> that
     * represent each profile.
     * 
     * @see java.lang.Object#toString()
     */
    public String toString(){
        return getPK()+" ["+elements.size()+"]";
    }
}
