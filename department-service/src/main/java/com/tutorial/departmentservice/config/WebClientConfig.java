package com.tutorial.departmentservice.config;

import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancedExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import com.tutorial.departmentservice.client.EmployeeClient;

@Configuration
public class WebClientConfig {

	private LoadBalancedExchangeFilterFunction filterFunction;


    public WebClientConfig(LoadBalancedExchangeFilterFunction filterFunction) {
		super();
		this.filterFunction = filterFunction;
	}

	@Bean
     WebClient employeeWebClient() {
        return WebClient.builder()
                .baseUrl("http://employee-service")
                .filter(filterFunction)
                .build();
    }

    @SuppressWarnings("removal")
	@Bean
     EmployeeClient employeeClient() {
		HttpServiceProxyFactory httpServiceProxyFactory
                = HttpServiceProxyFactory
                .builder(WebClientAdapter.forClient(employeeWebClient()))
                .build();
        return httpServiceProxyFactory.createClient(EmployeeClient.class);
    }
    

    
}
