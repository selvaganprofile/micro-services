package com.cloudshop.product.common.model.request;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "The aggregator object to hold the additional objects with product")
@XmlRootElement
public class ProductRecord implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value = "Product", required = false)
	@XmlElement(required = true)
	private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
