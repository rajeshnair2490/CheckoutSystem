package com.rajesh.checkoutmanagement.beans;

import org.springframework.stereotype.Component;

/**
 * @author rajesh
 *
 */
@Component
public class ProductDetailBean {
	
	private Product productBean;
	private int quantity;
	private double price;

	public ProductDetailBean() {
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product getProductBean() {
		return productBean;
	}

	public void setProductBean(Product productBean) {
		this.productBean = productBean;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setProductCode(String productCode) {
		this.productBean.setProductCode(productCode);
	}

}
