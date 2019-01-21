package com.rajesh.checkoutmanagement.services;

import com.rajesh.checkoutmanagement.beans.BillDetailsBean;
import com.rajesh.checkoutmanagement.beans.ProductBillInfo;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.List;

@Service
public class DisplayBillService {
	
	public void display(BillDetailsBean billDetails) {
        System.out.println("-------------------------BILL DETAILS-------------------------");
		System.out.println("--------------------------------------------------------------");
        //System.out.println("Product code :: QTY :: PRICE :: TAX :: TOTAL PRICE");


        System.out.println(String.format("%-15s :: %-5s :: %-10s :: %-10s :: %-16s" , "PRODUCT CODE", "QTY","PRICE","TAX","TOTAL PRICE" ));
        System.out.println("--------------------------------------------------------------");
        List<ProductBillInfo> productBillInfo = billDetails.getProductBillInfo();
        if(productBillInfo.isEmpty()){
            System.out.println("No products added.");
        }
        for(ProductBillInfo billInfo : productBillInfo){
            System.out.println(String.format("%-15s :: %-5s :: %-10s :: %-10s :: %-16s" ,billInfo.getProductCode(),billInfo.getQty(),billInfo.getPrice(),billInfo.getTaxes(),billInfo.getTotal()));
		}
        System.out.println("--------------------------------------------------------------");
		System.out.println("TAXES :"+billDetails.getTotal_taxes_applicable());
        System.out.println("--------------------------------------------------------------");
		System.out.println("GRAND TOTAL :"+billDetails.getGrand_amount());
        System.out.println("--------------------------------------------------------------");
		return ;
	}

}
