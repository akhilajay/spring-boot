package com.akhil;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.akhil.service.Adult;
import com.akhil.service.Censoring;
import com.akhil.service.IFilterStrategyFactory;

@SpringBootApplication
public class JavaassigmentdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaassigmentdemoApplication.class, args);
	}
	
	/**
	 * Factory Pattern Implementation.
	 * Below is for filtering.Based on the value of filter in request param, application will load corresponding filter.
	 * If we want to add a new filter , then add a new bean like below and implement the IFilterStrategyFactory interface
	 * @return
	 */
	@Bean
	 public FactoryBean<?> serviceLocatorFactoryBean() {
	    ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
	    factoryBean.setServiceLocatorInterface(IFilterStrategyFactory.class);
	    return factoryBean;
	 }
	
	 @Bean(name = "censoring")
	 @Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	 public Censoring censoring() {
	    return new Censoring();
	 }

	 @Bean(name = "adult")
	 @Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	 public Adult adult() {
	    return new Adult();
	 }

}
