package  com.cloudshop.product.common.exception;

public class TemporalyMovedException extends ServiceException {

	private String redirectionUrl;
	private static final long serialVersionUID = 417925880513706133L;

	public TemporalyMovedException(String message) {
		super(message);
	}

	public String getRedirectionUrl() {
		return redirectionUrl;
	}

	public void setRedirectionUrl(String redirectionUrl) {
		this.redirectionUrl = redirectionUrl;
	}

}
