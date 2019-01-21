package com.rajesh.checkoutmanagement;

import java.util.Scanner;

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
	private ShoppingCartBean shoppingCart;

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int numberOfProducts = sc.nextInt();

		for (int i = 0; i < numberOfProducts; i++) {
			System.out.println("Enter the product code :");
			ProductDetailBean productDetails = new ProductDetailBean();
			productDetails.setProductCode(sc.next());
			System.out.println("Enter the qty of Product :");
			productDetails.setQuantity(sc.nextInt());
			shoppingCart.add(productDetails);
		}

		BillDetailsBean billDetails = checkoutService.processProducts(shoppingCart);

		displayBillService.display(billDetails);
		sc.close();
	}

}
