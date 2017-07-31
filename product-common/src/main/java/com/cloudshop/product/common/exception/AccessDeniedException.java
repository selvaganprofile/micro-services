package com.cloudshop.product.common.exception;

public class AccessDeniedException extends ServiceException {

	private static final long serialVersionUID = 7239163417735522269L;

	
	public AccessDeniedException(String message) {
		super(message);
	}

}

