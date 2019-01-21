package com.rajesh.checkoutmanagement.services;

import org.springframework.stereotype.Service;

import com.rajesh.checkoutmanagement.beans.BillDetailsBean;
import com.rajesh.checkoutmanagement.beans.ProductBillInfo;

@Service
public class DisplayBillService {
	
	public void display(BillDetailsBean billDetails) {
		for(ProductBillInfo billInfo : billDetails.getProductBillInfo()){
			System.out.println(billInfo);
		}
		System.out.println("TAXES :"+billDetails.getTotal_taxes_applicable());
		System.out.println("GRAND TOTAL :"+billDetails.getGrand_amount());
	}

}
