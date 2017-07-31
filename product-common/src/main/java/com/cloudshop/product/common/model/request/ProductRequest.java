package com.cloudshop.product.common.model.request;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "The aggregator object to hold the additional objects with product")
@XmlRootElement
public class ProductRequest  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "Application area to monitor", required = false)
	@XmlElement(required = true)
	private ApplicationArea applicationArea;
	
	@ApiModelProperty(value = "Actual Data area for the domain objects", required = false)
	@XmlElement(required = true)
	private ProductDataArea productDataArea;

	public ApplicationArea getApplicationArea() {
		return applicationArea;
	}

	public void setApplicationArea(ApplicationArea applicationArea) {
		this.applicationArea = applicationArea;
	}

	public ProductDataArea getProductDataArea() {
		return productDataArea;
	}

	public void setProductDataArea(ProductDataArea productDataArea) {
		this.productDataArea = productDataArea;
	}
}
