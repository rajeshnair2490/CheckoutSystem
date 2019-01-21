package com.rajesh.checkoutmanagement.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BillDetailsBean {
	private double total_taxes_applicable;
	private double total_price;
	
	public BillDetailsBean() {
		productBillInfo = new ArrayList<>();
	}

	public double getGrand_amount() {
		return total_price + total_taxes_applicable;
	}

	public double getTotal_taxes_applicable() {
		return total_taxes_applicable;
	}

	public void setTotal_taxes_applicable(double total_taxes_applicable) {
		this.total_taxes_applicable = total_taxes_applicable;
	}

	public List<ProductBillInfo> getProductBillInfo() {
		return productBillInfo;
	}

	public void setProductBillInfo(List<ProductBillInfo> productBillInfo) {
		this.productBillInfo = productBillInfo;
	}

	private List<ProductBillInfo> productBillInfo;
	

	public void addPrice(int price) {
		total_price += price;
	}

	public void addTaxes(double taxes) {
		total_taxes_applicable += taxes;
	}
}
