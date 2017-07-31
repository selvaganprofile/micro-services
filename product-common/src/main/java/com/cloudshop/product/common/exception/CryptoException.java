package  com.cloudshop.product.common.exception;

public class CryptoException extends Exception {

	private static final long serialVersionUID = 4436515989054487768L;

	/**
	 * New exception from Exception.
	 */
	public CryptoException(Exception e) {
		super(e);
	}

	/**
	 * New exception from String.
	 */
	public CryptoException(String s) {
		super(s);
	}

	/**
	 * New exception from String and Throwable.
	 */
	public CryptoException(String s, Throwable t) {
		super(s, t);
	}

}
