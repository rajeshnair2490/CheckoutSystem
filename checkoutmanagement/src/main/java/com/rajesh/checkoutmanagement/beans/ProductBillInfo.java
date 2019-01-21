package com.rajesh.checkoutmanagement.beans;

import org.springframework.stereotype.Component;

/**
 * @author rajesh
 *
 */
@Component
public class ProductBillInfo {
	private String productCode;
	private double price;
	private int qty;
	private double taxes;
	
	public double getTotal() {
		return price+taxes;
	}

	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getTaxes() {
		return taxes;
	}
	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}
	
	@Override
	public String toString() {
		return productCode + " : "+qty+" : "+price+" : "+taxes+" : "+getTotal()+" : ";
	}
	
}
