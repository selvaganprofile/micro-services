package com.cloudshop.product.common.api.response;

import com.cloudshop.product.common.api.response.APIResponse;

public class APIResponseFactory {

	private APIResponseFactory() {

	}

	/**
	 * Creates an error response
	 */
	public static APIResponse buildErrorResponse(String errorMessage) {
		APIResponse errorResponse = new APIResponse();
		errorResponse.setErrorMessage(errorMessage);
		return errorResponse;
	}

}
