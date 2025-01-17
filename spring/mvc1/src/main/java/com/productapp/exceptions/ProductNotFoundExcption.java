package com.productapp.exceptions;

public class ProductNotFoundExcption extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ProductNotFoundExcption(String message) {
		super(message);
	}

}
