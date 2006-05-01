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

/**
 * Exception to raise in case of errors during a transformation
 * 
 * @author Juan Alvarez
 *
 */
public class TransformException extends Exception {

	/**
	 * Default constructor
	 */
	public TransformException() {
		super();
	}

	/**
	 * Creates the exception with the received message
	 * @param message
	 */
	public TransformException(String message) {
		super(message);
	}

	/**
	 * Creates the exception from another <code>Throwable</code>
	 * @param cause
	 */
	public TransformException(Throwable cause) {
		super(cause);
	}

	/**
	 * Creates the exception with the given message and <code>Throwable</code>
	 * @param message
	 * @param cause
	 */
	public TransformException(String message, Throwable cause) {
		super(message, cause);
	}
}
