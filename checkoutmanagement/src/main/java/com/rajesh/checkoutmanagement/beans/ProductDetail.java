package com.rajesh.checkoutmanagement.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author rajesh
 *
 */
@Entity
public class ProductDetail {
	@Id
	private String productCode;
	private String category;
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
