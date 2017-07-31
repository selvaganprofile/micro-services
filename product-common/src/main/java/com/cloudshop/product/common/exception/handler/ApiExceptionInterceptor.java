package com.cloudshop.product.common.exception.handler;

import java.net.URI;

import javax.persistence.PersistenceException;
import javax.ws.rs.core.Response;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Component;

import com.cloudshop.product.common.api.response.APIResponseFactory;
import com.cloudshop.product.common.api.response.JPAErrorResponseFactory;
import com.cloudshop.product.common.exception.AccessDeniedException;
import com.cloudshop.product.common.exception.ConfigurationException;
import com.cloudshop.product.common.exception.NotFoundException;
import com.cloudshop.product.common.exception.TemporalyMovedException;
import com.cloudshop.product.common.exception.ValidationException;



@Component
public class ApiExceptionInterceptor implements MethodInterceptor {

	private static Logger log = LogManager.getLogger(ApiExceptionInterceptor.class);

	/**
	 * Intercepts the method invocation and catches the exception if there is
	 * one
	 */
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object object = null;
		try {
			object = invocation.proceed();
		} catch (PersistenceException e) {
			log.error("Resource not found while doing a PUT/GET/POST/DELETE", e);
			return JPAErrorResponseFactory.INSTANCE.buildResponse(e);
		} catch (JpaSystemException e) {
			log.error("Resource not found while doing a PUT/GET/POST/DELETE", e);
			return JPAErrorResponseFactory.INSTANCE.buildResponse(e);
		} catch (TemporalyMovedException e) {
			log.warn(String.format("Resource not longer available on this endpoint. Redirecting to: %s",
					e.getRedirectionUrl()), e);
			return Response.temporaryRedirect(new URI(e.getRedirectionUrl())).build(); // 307
		} catch (NotFoundException e) {
			log.error("Resource not found while doing a PUT/GET/DELETE", e);
			return Response.status(Response.Status.NOT_FOUND) // 404
					.entity(APIResponseFactory.buildErrorResponse(e.getMessage())).build();
		} catch (ValidationException | IllegalArgumentException e) {
			log.error("Wrong input parameters while doing a PUT/POST/GET", e);
			return Response.status(Response.Status.BAD_REQUEST) // 400
					.entity(APIResponseFactory.buildErrorResponse(e.getMessage())).build();
		}catch (AccessDeniedException e){
			log.error("Access denied/Forbidden", e);
			return Response.status(Response.Status.FORBIDDEN) // 403
					.entity(APIResponseFactory.buildErrorResponse(e.getMessage())).build();
		} catch (ConfigurationException e) {
			log.error("Internal configuration error", e);
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR) // 500
					.entity(APIResponseFactory.buildErrorResponse(e.getMessage())).build();
		} catch (Exception e) {
			log.error("Internal error while performing a PUT/GET/POST/DELETE", e);
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR) // 500
					.entity(APIResponseFactory.buildErrorResponse(e.getMessage())).build();
		}
		return object;
	}

}