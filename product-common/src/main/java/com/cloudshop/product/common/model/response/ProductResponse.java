
package com.cloudshop.product.common.model.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cloudshop.product.common.api.response.APIResponse;
import com.cloudshop.product.common.model.request.Product;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "The API Response Model object")
@XmlRootElement
public class ProductResponse extends APIResponse{

@ApiModelProperty(value = "The AvcAsset model JSON as returned by the DB")
@XmlElement(required = true)
private Product product;

public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}

   
}
