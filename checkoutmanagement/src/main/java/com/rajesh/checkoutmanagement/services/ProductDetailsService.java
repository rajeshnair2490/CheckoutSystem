package com.rajesh.checkoutmanagement.services;

import java.util.Scanner;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajesh.checkoutmanagement.beans.ProductDetail;
import com.rajesh.checkoutmanagement.beans.ShoppingCartBean;
import com.rajesh.checkoutmanagement.dao.ProductDAOImpl;

@Service
public class ProductDetailsService {

	/**
	 * @param productCode
	 * @return
	 */
	@Autowired
	private ProductDAOImpl productDetailRepo;

	@Transactional
	ProductDetail getProductDetails(String productCode) {
		ProductDetail productDetail = productDetailRepo.get(productCode);
		if (productDetail == null) {
			System.out.println("Product does not exists. Please enter details.");
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the price of the product :");
			int price = s.nextInt();
			System.out.println("Enter the product category :");
			String cat = s.next();
			s.close();
			productDetail = new ProductDetail();
			productDetail.setProductCode(productCode);
			productDetail.setCategory(cat);
			productDetail.setPrice(price);
			productDetailRepo.add(productDetail);
		}
		return productDetail;
	}

}
