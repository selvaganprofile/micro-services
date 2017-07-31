package com.cloudshop.product.common.api.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.cloudshop.product.common.model.response.ServiceStatus;

@ApiModel(value = "The API Response Model object")
@XmlRootElement
public class APIResponse<Model> implements Serializable   {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "The message with the result of the operation")
	private String message;

	@ApiModelProperty(value = "The error message in case the operation went wrong")
	private String errorMessage;

	@ApiModelProperty(value = "The actual page")
	private Integer page;

	@ApiModelProperty(value = "The page size")
	private Integer pageSize;

	@ApiModelProperty(value = "The actual page result size")
	private Integer pageCount;

	@ApiModelProperty(value = "The total result size")
	private Integer totalCount;

	public APIResponse() {
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	

    private ServiceStatus serviceStatus;
    

    public ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    /**
     * 
     * @param serviceStatus
     *     The ServiceStatus
     */
    
    public void setServiceStatus(ServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

}
