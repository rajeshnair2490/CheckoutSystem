package com.rajesh.checkoutmanagement;

import java.util.Scanner;

import com.rajesh.checkoutmanagement.beans.Product;
import com.rajesh.checkoutmanagement.services.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rajesh.checkoutmanagement.beans.BillDetailsBean;
import com.rajesh.checkoutmanagement.beans.ProductDetailBean;
import com.rajesh.checkoutmanagement.beans.ShoppingCartBean;
import com.rajesh.checkoutmanagement.services.CheckoutService;
import com.rajesh.checkoutmanagement.services.DisplayBillService;

@Component
public class CommandLiner implements CommandLineRunner {
	@Autowired
	CheckoutService checkoutService;
	@Autowired
	DisplayBillService displayBillService;
	@Autowired
	ProductDetailsService productService;
	@Autowired
	private ShoppingCartBean shoppingCart;

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------");
		System.out.println("Enter the number of products :");
        System.out.println("-------------------------------------------");
		int numberOfProducts = sc.nextInt();

		for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("-------------------------------------------");
			System.out.println("Enter the product code :");
			ProductDetailBean productDetails = new ProductDetailBean();
			Product product = productService.getProductDetails(sc.next());

			productDetails.setProductBean(product);
			System.out.println("Enter the qty of Product :");
			int quantity = sc.nextInt();
			productDetails.setQuantity(quantity);
			shoppingCart.add(productDetails);
		}

		BillDetailsBean billDetails = checkoutService.processProducts(shoppingCart);

		displayBillService.display(billDetails);
		sc.close();
	}

}
