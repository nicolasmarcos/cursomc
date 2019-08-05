package com.nicolasmarcosti.cursomc.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Construtor nativo apenas com mensagem de erro
	public ObjectNotFoundException(String msg) {
		
		super(msg);
		
	}
	
	//Construtor nativo com mensagem de erro e causa
	public ObjectNotFoundException(String msg, Throwable cause) {
		
		super(msg,cause);
		
	}
	
}
