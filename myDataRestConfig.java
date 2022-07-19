package com.ShopForHome.ecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.ShopForHome.ecommerce.entity.product;

@Configuration
public class myDataRestConfig implements RepositoryRestConfigurer {
	@SuppressWarnings("unused")
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		// TODO Auto-generated method stub
		RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);
		HttpMethod[] theUnsupportedActions = {HttpMethod.PUT,HttpMethod.POST,HttpMethod.DELETE};
		config.getExposureConfiguration()
			.forDomainType(product.class)
			.withItemExposure((metdata,httpMethod)->httpMethod.disable(theUnsupportedActions)
			.withCollectioExposure((metdata,httpMethods)->httpMethods.disable(theUnSupportedActions));
		
		config.getExposureConfiguration()
			.forDomainType(productCategory.class)
			.withItemExposure((metdata,httpMethod)->httpMethod.disable(theUnsupportedActions)
			.withCollectioExposure((metdata,httpMethods)->httpMethods.disable(theUnSupportedActions));
	}
		
}
