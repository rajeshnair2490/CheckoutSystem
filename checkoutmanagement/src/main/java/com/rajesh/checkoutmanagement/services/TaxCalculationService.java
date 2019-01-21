package com.rajesh.checkoutmanagement.services;

import org.springframework.stereotype.Service;

import com.rajesh.checkoutmanagement.beans.ProductDetail;

@Service
public class TaxCalculationService {

	public double calculateTax(ProductDetail productBean) {
		double tax = getTaxPercentage(productBean.getCategory());
		return productBean.getPrice()*tax;
	}

	double getTaxPercentage(String category) {
		double tax =0;
		switch (category) {
		case "A":
			tax =0.01 ;
		case "B":
			tax =0.02 ;
		case "C":
			tax =0 ;
		}
		return tax;
	}

}
