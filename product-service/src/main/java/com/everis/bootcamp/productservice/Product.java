package com.everis.bootcamp.productservice;

import org.springframework.context.annotation.Bean;

import io.github.resilience4j.common.circuitbreaker.configuration.CircuitBreakerConfigCustomizer;
import io.github.resilience4j.retry.annotation.Retry;

@Retry(name = "priceservice", fallbackMethod = "fallback")
public class Product {
	@Bean
	public static CircuitBreakerConfigCustomizer priceservice() {
		System.out.println("Conexion exitosa");
	    return CircuitBreakerConfigCustomizer
	        .of("priceservice", builder -> builder.slidingWindowSize(100));
	}
	
	@Bean
	public void fallback() {
	    System.out.println("Esperando respuesta");
	}

}
