
package com.cloudshop.product.common.model.response;

import javax.xml.bind.annotation.XmlRootElement;

import com.cloudshop.product.common.exception.ValidationException;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "The Service API response")
@XmlRootElement

public class ServiceStatus {

	@ApiModelProperty(value = "The time stamp of the service response")
    private String timeStamp;
 
	@ApiModelProperty(value = "The status type of the service response")
    private String statusType;
 
	@ApiModelProperty(value = "The status code of the service response if it success,unique by service")
    private String statusCode;

	@ApiModelProperty(value = "The system that gives the response")
    private String system;

	@ApiModelProperty(value = "populates validation exception if any")
    private ValidationException validationException;
	
	@ApiModelProperty(value = "populates system exception if any")
    private SystemException systemException;

    /**
     * 
     * @return
     *     The timeStamp
     */
   
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * 
     * @param timeStamp
     *     The TimeStamp
     */
    
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * 
     * @return
     *     The statusType
     */
 
    public String getStatusType() {
        return statusType;
    }

    /**
     * 
     * @param statusType
     *     The StatusType
     */
   
    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    /**
     * 
     * @return
     *     The statusCode
     */
   
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * 
     * @param statusCode
     *     The StatusCode
     */
   
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * 
     * @return
     *     The system
     */
   
    public String getSystem() {
        return system;
    }

    /**
     * 
     * @param system
     *     The System
     */
  
    public void setSystem(String system) {
        this.system = system;
    }

    /**
     * 
     * @return
     *     The validationException
     */
    
    public ValidationException getValidationException() {
        return validationException;
    }

    /**
     * 
     * @param validationException
     *     The ValidationException
     */
    
    public void setValidationException(ValidationException validationException) {
        this.validationException = validationException;
    }

    /**
     * 
     * @return
     *     The systemException
     */
 
    public SystemException getSystemException() {
        return systemException;
    }

    /**
     * 
     * @param systemException
     *     The SystemException
     */
  
    public void setSystemException(SystemException systemException) {
        this.systemException = systemException;
    }

 

   

}
