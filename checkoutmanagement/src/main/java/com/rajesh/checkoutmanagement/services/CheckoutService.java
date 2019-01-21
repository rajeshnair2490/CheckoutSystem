package com.rajesh.checkoutmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajesh.checkoutmanagement.beans.BillDetailsBean;
import com.rajesh.checkoutmanagement.beans.ProductDetailBean;
import com.rajesh.checkoutmanagement.beans.ShoppingCartBean;

/**
 * @author rajesh
 *
 */
@Service
public class CheckoutService {
	@Autowired
	private BillGenerationService billGenerationService;

	/**
	 * @param cart
	 * @return
	 */
	public BillDetailsBean processProducts(ShoppingCartBean cart) {
		// Get Product details
		List<ProductDetailBean> productDetailBeanList = cart
				.getProductDetailBeanList();

		// Process products for bill generation
		for (ProductDetailBean productDetailBean : productDetailBeanList) {
			billGenerationService.addToBill(productDetailBean);
		}

		// Return Bill details
		return billGenerationService.getBillInfo();
	}

}
