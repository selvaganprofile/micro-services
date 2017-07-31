package com.cloudshop.product.common.exception;

public class NotFoundException extends ServiceException {

	private static final long serialVersionUID = 1L;

	public NotFoundException(String message) {
		super(message);
	}

}
