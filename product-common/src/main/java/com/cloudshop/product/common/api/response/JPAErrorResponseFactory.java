package com.cloudshop.product.common.api.response;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.PersistenceException;
import javax.persistence.RollbackException;
import javax.ws.rs.core.Response;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.orm.jpa.JpaSystemException;






public class JPAErrorResponseFactory {

	public static JPAErrorResponseFactory INSTANCE = new JPAErrorResponseFactory();
	private Map<String, JPAResponseBuilder> responseBuilders;

	private JPAErrorResponseFactory() {
		responseBuilders = new HashMap<String, JPAResponseBuilder>();
		responseBuilders.put("default", new JPAResponseBuilder() {
			@Override
			public Response buildResponse(Throwable cause) {
				return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
						.entity(APIResponseFactory.buildErrorResponse(cause.getMessage())).build();
			}
		});
		responseBuilders.put(ConstraintViolationException.class.getCanonicalName(), new JPAResponseBuilder() {
			@Override
			public Response buildResponse(Throwable cause) {
				ConstraintViolationException c = (ConstraintViolationException) cause;
				return Response.status(Response.Status.BAD_REQUEST)
						.entity(APIResponseFactory.buildErrorResponse(c.getSQLException().getMessage())).build();
			}
		});
	}

	public Response buildResponse(PersistenceException exception) {
		Throwable cause = exception.getCause();
		if (exception instanceof RollbackException) {
			// Hibernate returns a RollbackException -> PersistenceException ->
			// Actual cause
			cause = cause.getCause();
		}
		String key = cause.getClass().getCanonicalName();
		if (!responseBuilders.containsKey(key)) {
			return responseBuilders.get("default").buildResponse(cause);
		}

		return responseBuilders.get(key).buildResponse(cause);
	}
	
	public Response buildResponse(JpaSystemException exception) {
		Throwable cause = exception.getCause();
		if(cause instanceof PersistenceException){
			return buildResponse((PersistenceException) cause);
		}		
		return responseBuilders.get("default").buildResponse(cause);
	}

}
