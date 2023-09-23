package com.interviews.questions.amdocs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmdocshackerrankConfig {

	// cause circular dependency error
	@Bean
	public ServiceA serviceA(ServiceB serviceB) {
		return new ServiceA(serviceB);
	}

	@Bean
	public ServiceB serviceB(ServiceC serviceC) {
		return new ServiceB(serviceC);
	}

	@Bean
	public ServiceC serviceC(ServiceA serviceA) {
		return new ServiceC(serviceA);
	}

}

class ServiceA {
	ServiceB b;

	public ServiceA(ServiceB b) {
		this.b = b;
	}

}

class ServiceB {
	ServiceC c;

	public ServiceB(ServiceC c) {
		this.c = c;
	}

}

class ServiceC {
	ServiceA a;

	public ServiceC(ServiceA a) {
		this.a = a;
	}

}