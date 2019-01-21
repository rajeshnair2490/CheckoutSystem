package com.rajesh.checkoutmanagement.services;

import com.rajesh.checkoutmanagement.beans.Product;
import org.springframework.stereotype.Service;

@Service
public class TaxCalculationService {

	public double calculateTax(Product productBean) {
		double tax = getTaxPercentage(productBean.getCategory());
		return productBean.getPrice()*tax;
	}

	double getTaxPercentage(String category) {
		double tax =0;
		switch (category) {
		case "A":
			tax =0.01 ;
			break;
		case "B":
			tax =0.02 ;
			break;
		case "C":
			tax =0 ;
			break;
		}
		return tax;
	}

}
