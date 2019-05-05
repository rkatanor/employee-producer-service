package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EmployeeProducerServiceApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProducerServiceApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(EmployeeProducerServiceApplication.class);
	}

}
