package com.cloudshop.product.common.model.request;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "The basic Product object with  elements")
@XmlRootElement
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "Name of the product", required = false)
	@XmlElement(required = true)
	private String productName;
	
	@ApiModelProperty(value = "product description", required = false)
	@XmlElement(required = true)
	private String productDescription;
	
	@ApiModelProperty(value = "product id", required = true)
	@XmlElement(required = true)
	private Integer productId;
}
