package  com.cloudshop.product.common.exception;

public class InitializationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InitializationException(Exception e) {
		super(e);
	}
}
