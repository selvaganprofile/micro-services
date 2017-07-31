package com.cloudshop.product.common.model.request;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "The Data area of the request")
@XmlRootElement
public class ProductDataArea implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value = "Product Record", required = false)
	@XmlElement(required = true)
	private ProductRecord productRecord;

	public ProductRecord getProductRecord() {
		return productRecord;
	}

	public void setProductRecord(ProductRecord productRecord) {
		this.productRecord = productRecord;
	}
}
