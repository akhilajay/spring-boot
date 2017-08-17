package com.tacme.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.tacme.apigateway.zullFilters.BasicAuthenticationFilter;
import com.tacme.apigateway.zullFilters.ModifyResponseBodyFilter;

@SpringBootApplication
@EnableZuulProxy
public class ApigatewayApplication {
	


	public static void main(String[] args) {
		SpringApplication.run(ApigatewayApplication.class, args);
	}

	@Bean
	public BasicAuthenticationFilter basicAuthenticationFilter(){
		return new BasicAuthenticationFilter();
	}
	
	/*@Bean
	public ModifyResponseBodyFilter modifyResponseBodyFilter(){
		return new ModifyResponseBodyFilter();
	}*/

}
