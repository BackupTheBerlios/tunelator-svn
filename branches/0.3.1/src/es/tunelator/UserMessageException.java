/*
 * Created on 21-ene-2005
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

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * Exception type raised to the user interface components from underlying
 * objects when an error occurs and the error message comes from the object
 * that raises it.<p/>
 * Methods receiving this type of exception should pass it through.<p/>
 * Methods raising this type of exception should use user terminology and
 * internationalize the messages.<p/>
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class UserMessageException extends Exception {
	/**
	 * Default constructor
	 */
	public UserMessageException() {
		super();
	}
	/**
	 * Creates the exception with the given message to the user
	 * @param message
	 */
	public UserMessageException(String message) {
		super(message);
	}
	/**
	 * Creates the exception with the given message to the user
	 * @param message
	 * @param cause
	 */
	public UserMessageException(String message, Throwable cause) {
		super(message, cause);
	}
	/**
	 * Creates the exception from the given <code>Throwable</code>
	 * @param cause
	 */
	public UserMessageException(Throwable cause) {
		super(cause);
	}
}
