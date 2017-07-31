package com.cloudshop.product.common.exception;

public class ServiceException extends Exception {

	private static final long serialVersionUID = -6252549920215088817L;

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

}