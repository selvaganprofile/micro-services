package com.cloudshop.product.common.api.response;

import javax.ws.rs.core.Response;

public interface JPAResponseBuilder {

	/**
	 * Rewrites the low-level database error message to a more human readable
	 * message
	 */
	public Response buildResponse(Throwable cause);

}
