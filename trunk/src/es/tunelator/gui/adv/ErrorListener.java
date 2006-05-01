/*
 * Created on 05-jun-2005
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
package es.tunelator.gui.adv;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * Classes that want to listen to other type's errors implement this interface.
 * It is initially created to communicate errors among GUI components, but
 * can be used among any other types. 
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public interface ErrorListener {
    /**
     * Responds to the error event in any way that the listener chooses
     * @param source The object that raised the error event
     * @param msg An optional message created by the source object
     */
    public void respondToError(Object source, String msg);
}
