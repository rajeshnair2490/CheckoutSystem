package com.rajesh.checkoutmanagement.services;

import org.springframework.stereotype.Service;

import com.rajesh.checkoutmanagement.beans.BillDetailsBean;
import com.rajesh.checkoutmanagement.beans.ProductBillInfo;

@Service
public class DisplayBillService {
	
	public void display(BillDetailsBean billDetails) {
		System.out.println("-------------------------------------------");
		System.out.println("Product code :: QTY :: PRICE :: TAX :: TOTAL");
		System.out.println("-------------------------------------------");
		for(ProductBillInfo billInfo : billDetails.getProductBillInfo()){
			System.out.println(billInfo);
		}
		System.out.println("-------------------------------------------");
		System.out.println("TAXES :"+billDetails.getTotal_taxes_applicable());
		System.out.println("-------------------------------------------");
		System.out.println("GRAND TOTAL :"+billDetails.getGrand_amount());
		System.out.println("-------------------------------------------");
	}

}
