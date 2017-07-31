package  com.cloudshop.product.common.exception;

public class ValidationException extends ServiceException {

	private static final long serialVersionUID = 1L;
	private String errorCode;
	    
	private String errorDescription;
	
	public ValidationException(String message) {
		super(message);
	}
	
	public ValidationException(String message,String errorCode,String errorDescription) {
		super(message);
		this.errorCode=errorCode;
		this.errorDescription=errorDescription;
	}
	
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public ValidationException(String message, Throwable cause) {
		super(message, cause);
	}
}
