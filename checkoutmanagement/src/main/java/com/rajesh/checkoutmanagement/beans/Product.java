package com.rajesh.checkoutmanagement.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author rajesh
 *
 */
@Entity
public class Product {
	@Id
	@Column(name = "PRODUCTCODE")
	private String productCode;
	@Column(name = "CATEGORY")
	private String category;
	@Column(name = "PRICE")
	private int price;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	

}
