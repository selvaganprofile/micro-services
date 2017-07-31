
package com.cloudshop.product.common.model.response;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "The System Exception Response")
@XmlRootElement

public class SystemException {

	@ApiModelProperty(value = "The error code of system exception")
    private String errorCode;
	
	@ApiModelProperty(value = "The error description  of system exception")
    private String errorDescription;
   
    /**
     * 
     * @return
     *     The errorCode
     */
   
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 
     * @param errorCode
     *     The ErrorCode
     */
  
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 
     * @return
     *     The errorDescription
     */
    @JsonProperty("ErrorDescription")
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * 
     * @param errorDescription
     *     The ErrorDescription
     */
    @JsonProperty("ErrorDescription")
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    
}
