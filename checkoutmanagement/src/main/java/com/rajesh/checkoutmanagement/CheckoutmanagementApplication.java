package com.rajesh.checkoutmanagement;

import com.rajesh.checkoutmanagement.beans.BillDetailsBean;
import com.rajesh.checkoutmanagement.beans.Product;
import com.rajesh.checkoutmanagement.beans.ProductDetailBean;
import com.rajesh.checkoutmanagement.beans.ShoppingCartBean;
import com.rajesh.checkoutmanagement.services.CheckoutService;
import com.rajesh.checkoutmanagement.services.DisplayBillService;
import com.rajesh.checkoutmanagement.services.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = "com.rajesh")
@EnableAutoConfiguration
public class CheckoutmanagementApplication{
	@Autowired
	CheckoutService checkoutService;
	@Autowired
	DisplayBillService displayBillService;


	@Autowired
	private ShoppingCartBean shoppingCart;
	public static void main(String[] args) {
		new SpringApplicationBuilder(CheckoutmanagementApplication.class)
        .web(WebApplicationType.NONE)
        .run(args);
	}
}

