package  com.cloudshop.product.common.exception;

public class CommandException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 552427401693017057L;

	private int returnCode;

	private String command;

	public CommandException(String command, int returnCode, String message) {
		super(message);
		this.command = command;
		this.returnCode = returnCode;
	}

	public int getReturnCode() {
		return returnCode;
	}

	public String getCommand() {
		return command;
	}
}
