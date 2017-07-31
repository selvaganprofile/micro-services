package com.cloudshop.endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import com.cloudshop.endpoint.config.ProductRestConfig;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication(
scanBasePackages = {"com.cloudshop.endpoint.config,com.cloudshop.endpoint.rest,com.cloudshop.product.common"}
 )
@PropertySource("classpath:application.properties")
@EnableSwagger2
@EnableAutoConfiguration


@Import({ ProductRestConfig.class,SwaggerConfig.class})
public class ProductEndpointRestApplication extends SpringBootServletInitializer{
	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		 return builder.sources(ProductEndpointRestApplication.class);
		 }
	public static void main(String[] args) {
		SpringApplication.run(ProductEndpointRestApplication.class, args);
	}
	
	
}
