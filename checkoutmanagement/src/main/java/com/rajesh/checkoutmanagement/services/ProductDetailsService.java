package com.rajesh.checkoutmanagement.services;

import java.util.Scanner;

import com.rajesh.checkoutmanagement.beans.Product;
import com.rajesh.checkoutmanagement.dao.ProductDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailsService {

	/**
	 * @param productCode
	 * @return
	 */
	@Autowired
	private ProductDAOImpl productDetailRepo;

    public Product getProductDetails(String productCode) {
		Product product = productDetailRepo.get(productCode);
		if (product == null) {
			System.out.println("Product does not exists. Please enter details.");
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the price of the product :");
			int price = s.nextInt();
			System.out.println("Enter the product category :");
			String cat = s.next();
			product = new Product();
			product.setProductCode(productCode);
			product.setCategory(cat);
			product.setPrice(price);
			productDetailRepo.add(product);
		}
		return product;
	}

}
