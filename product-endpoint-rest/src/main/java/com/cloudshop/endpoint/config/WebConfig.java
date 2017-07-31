package com.cloudshop.endpoint.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport  {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// Make Swagger meta-data available via <baseURL>/v2/api-docs/
	    registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	    // Make Swagger UI available via <baseURL>/swagger-ui.html
	    registry.addResourceHandler("swagger-ui.html")
	      .addResourceLocations("classpath:/META-INF/resources/");
	   
	
	}
}