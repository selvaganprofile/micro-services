package  com.cloudshop.product.common.exception;

import javax.ws.rs.core.Response;

public class CxfClientException extends CxfClientBaseException {

	private Response response;

	public CxfClientException(String msg, Response response) {
		super(msg);
		this.response = response;
	}

	private static final long serialVersionUID = 6519818822742137506L;

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

}
