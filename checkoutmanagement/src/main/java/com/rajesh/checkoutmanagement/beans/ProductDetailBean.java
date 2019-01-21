package com.rajesh.checkoutmanagement.beans;

import org.springframework.stereotype.Component;

/**
 * @author rajesh
 *
 */
@Component
public class ProductDetailBean {
	
	private ProductDetail productBean;
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

	public ProductDetail getProductBean() {
		return productBean;
	}

	public void setProductBean(ProductDetail productBean) {
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
