package com.cloudshop.endpoint.rest.resources;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.cloudshop.product.common.exception.ServiceException;
import com.cloudshop.product.common.model.request.ProductRequest;

import io.swagger.annotations.ApiParam;

public interface ProductResource {


	public Response createProduct(ProductRequest productRequest) throws ServiceException;

	
	public Response getAndPopulateProduct(@ApiParam @PathParam("productid") Integer productid) throws ServiceException;
	

	public Response updateProduct(ProductRequest productRequest) throws ServiceException;
	
	public Response deleteProduct(@PathParam("productid") Integer productId) throws ServiceException;



	
}
