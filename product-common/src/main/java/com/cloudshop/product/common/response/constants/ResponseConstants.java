package com.cloudshop.product.common.response.constants;

public class ResponseConstants {

	private ResponseConstants() {

	}

	/**
	 * "Success" message to set in the response of all services
	 */
	public static final String MESSAGE_SUCCESS = "Success";

	/**
	 * "Failed" message to set in the response of all services
	 */
	public static final String ERROR_MESSAGE_FAILED = "Failed";

	/**
	 * "Failed" message to set in the response of all services
	 */
	public static final String ERROR_MESSAGE_WARNING = "Warning";

	/**
	 * "Failed to create" message to set when create fails
	 */
	public static final String ERROR_MESSAGE_CREATION = "Could not create %s with params: %s";

	/**
	 * "Failed to find" message to set when update/delete/get fails
	 */
	public static final String ERROR_MESSAGE_NOT_FOUND = "Could not find %s with id: %s";

	/**
	 * "Field can NOT be null" message to set when update/create fails
	 */
	public static final String ERROR_MESSAGE_FIELD_NOT_NULL = "Unable to create/update %s because the field %s can NOT be null";

	/**
	 * "Field can NOT be null" message to set when update/create fails
	 */
	public static final String EXECUTIONPROFILE_IS_PASSTHROUGH = "The ExecutionProfile is Passthrough";

	public static final String MESSAGE_EMPTY_RESULT_LIST = "No %s were found for the given parameters.";

}
