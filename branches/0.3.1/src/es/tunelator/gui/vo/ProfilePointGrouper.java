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
package es.tunelator.gui.vo;

import java.util.Comparator;
import java.util.List;

import es.tunelator.vo.ProfileVO;
import es.tunelator.vo.PuntoVO;
import es.tunelator.vo.PuntoVOSimpleComparator;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * Provides the representation of a profile as a group of points to be used 
 * with <code>GrouByList</code>.
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class ProfilePointGrouper  {
    /**
     * Returns a <code>PuntoVOSimpleComparator</code> that compares elements 
     * on the value of the <code>PKTeor</code> attribute.
     * @see ca.odell.glazedlists.GroupByList.Grouper#getComparator()
     */
    public Comparator getComparator() {
        return new PuntoVOSimpleComparator(PuntoVO.PK_TEOR);
    }

    /**
     * Creates a <code>ProfileVO</code> that represents the group that's 
     * created. 
     * @see ca.odell.glazedlists.GroupByList.Grouper#group(java.util.List)
     * @throws IllegalArgumentException if the received <code>List</code> is empty
     */
    public Object group(List elements) {
        if(elements.isEmpty()){
            throw new IllegalArgumentException("Can't group an empty list"
                    +" of elements");
        }
        ProfileVO profile = new ProfileVO(elements);
        return profile;
    }
    /**
     * Returns the list of <code>PuntoVO</code> elements that's holded by the 
     * <code>ProfileVO</code> object it receives.
     * @see ca.odell.glazedlists.GroupByList.Grouper#ungroup(java.lang.Object)
     * @throws IllegalArgumentException if the received object is not of 
     * <code>ProfileVO</code> type
     */
    public List ungroup(Object group) {
        if(!(group instanceof ProfileVO)){
            throw new IllegalArgumentException("The type of the group is not "
                    +"ProfileVO");
        }
        return ((ProfileVO)group).getElements();
    }
}
