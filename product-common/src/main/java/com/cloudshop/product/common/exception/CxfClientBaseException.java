package  com.cloudshop.product.common.exception;

public class CxfClientBaseException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public CxfClientBaseException(String msg){
		super(msg);
	}
	
	public CxfClientBaseException(Exception e){
		super(e);
	}

	public CxfClientBaseException() {
		super();
	}

}
