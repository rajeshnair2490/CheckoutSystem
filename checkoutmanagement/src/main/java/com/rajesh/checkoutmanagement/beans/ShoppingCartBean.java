package com.rajesh.checkoutmanagement.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author rajesh
 *
 */
@Component
public class ShoppingCartBean {
	
	private List<ProductDetailBean> productDetailBeanList;

	public ShoppingCartBean(){
		productDetailBeanList = new ArrayList<>();
	}
	
	/**
	 * @return
	 */
	public List<ProductDetailBean> getProductDetailBeanList() {
		return productDetailBeanList;
	}

	/**
	 * @param productDetailBeanList
	 */
	public void setProductDetailBeanList(
			List<ProductDetailBean> productDetailBeanList) {
		this.productDetailBeanList = productDetailBeanList;
	}

	/**
	 * @param productDetails
	 */
	public void add(ProductDetailBean productDetails) {
		productDetailBeanList.add(productDetails);
	}
}
