package com.cloudshop.endpoint.config;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.cloudshop.endpoint.rest.resources.impl.ProductResourceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
@Configuration

public class ProductRestConfig extends ResourceConfig {
	 @Value("${spring.jersey.application-path:/}")
	 private String apiPath;
	 public ProductRestConfig(ObjectMapper objectMapper) {
		 packages("com.cloudshop.endpoint.rest.resources.impl");
		 registerEndPoints();
		 register(new ObjectMapperContextResolver(objectMapper)); 
		
	    }
	 @Provider
	 public static class ObjectMapperContextResolver implements ContextResolver<ObjectMapper> {
	 private final ObjectMapper mapper;
	 public ObjectMapperContextResolver(ObjectMapper mapper) {
	 this.mapper = mapper;
	 }
	 @Override
	 public ObjectMapper getContext(Class<?> type){
		 return mapper;
		 }
	 }
	
	 
	 private void registerEndPoints(){
		 this.register(ProductResourceImpl.class);
	 }
	 
}
