package com.cloudshop.product.common.exception;

public class CxfClientNoResponseException extends CxfClientBaseException {

	private static final long serialVersionUID = -3687934866151075352L;

	public CxfClientNoResponseException(String msg){
		super(msg);
	}
}
