package  com.cloudshop.product.common.exception;

public class ResponseUnmarshallingException extends CxfClientBaseException {

	private static final long serialVersionUID = 1097274814551639066L;

	public ResponseUnmarshallingException(Exception e){
		super(e);
	}
}
