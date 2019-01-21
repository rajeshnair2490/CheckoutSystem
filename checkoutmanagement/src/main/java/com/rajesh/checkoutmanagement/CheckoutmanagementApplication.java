package com.rajesh.checkoutmanagement;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.rajesh")
@EnableAutoConfiguration
public class CheckoutmanagementApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(CheckoutmanagementApplication.class)
        .web(WebApplicationType.NONE) // .REACTIVE, .SERVLET
        .run(args);
	}
	
}

