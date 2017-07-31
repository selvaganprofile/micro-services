package com.cloudshop.endpoint.rest.resources.impl;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudshop.endpoint.rest.resources.ProductResource;
import com.cloudshop.product.common.exception.ServiceException;
import com.cloudshop.product.common.model.request.ProductRequest;
import com.cloudshop.product.common.model.response.ProductResponse;
import com.cloudshop.product.common.response.constants.ResponseConstants;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@Path("product")
@Component
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Api(value = "product creation API", description = "Operations on Execution for Distribution")
public class ProductResourceImpl implements ProductResource {

	 @Value("${product.key}")
	 String productKey;
	
	@Override
	@POST

	//@Timer
	//@ApiExceptionHandler
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@ApiOperation(value = "Create Product", notes = "Ingest a file matching the params", response = ProductResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully file ingested", response = ProductResponse.class),
			@ApiResponse(code = 400, message = "Invalid parameters"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	public Response createProduct(ProductRequest productRequest) throws ServiceException {
	System.out.println("Product Request : "+productRequest.toString());
	System.out.println("Product key : "+productKey);
	  ProductResponse response = new ProductResponse();
	 response.setMessage(ResponseConstants.MESSAGE_SUCCESS);
	 return Response.status(Response.Status.OK).entity(response).build();
	}
	@Path("/{productid}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Get Product By id", notes = "Ingest a file matching the params", response = ProductResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully file ingested", response = ProductResponse.class),
			@ApiResponse(code = 400, message = "Invalid parameters"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@Override
	public Response getAndPopulateProduct(@ApiParam @PathParam("productid")  Integer productid) throws ServiceException {
		System.out.println("Reached   getAndPopulateProduct : "+productid);
		 ProductResponse response = new ProductResponse();
		 response.setMessage(ResponseConstants.MESSAGE_SUCCESS);
		 return Response.status(Response.Status.OK).entity(response).build();
	}
	
	@PUT
	@Override
	@ApiOperation(value = "Get Product By id", notes = "Ingest a file matching the params", response = ProductResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully file ingested", response = ProductResponse.class),
			@ApiResponse(code = 400, message = "Invalid parameters"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	public Response updateProduct(ProductRequest productRequest) throws ServiceException {
		// TODO Auto-generated method stub
		 ProductResponse response = new ProductResponse();
		 response.setMessage(ResponseConstants.MESSAGE_SUCCESS);
		 return Response.status(Response.Status.OK).entity(response).build();
	}

	
	@Override
	@DELETE
	@ApiOperation(value = "Get Product By id", notes = "Ingest a file matching the params", response = ProductResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully deleted product", response = ProductResponse.class),
			@ApiResponse(code = 400, message = "Invalid parameters"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	public Response deleteProduct(@ApiParam @PathParam("productid")  Integer name) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}


}
