package com.rajesh.checkoutmanagement.services;

import java.util.List;

import com.rajesh.checkoutmanagement.beans.BillDetailsBean;
import com.rajesh.checkoutmanagement.beans.ProductDetailBean;
import com.rajesh.checkoutmanagement.beans.ShoppingCartBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		BillDetailsBean billDetailsBean = new BillDetailsBean();
		// Process products for bill generation
		for (ProductDetailBean productDetailBean : productDetailBeanList) {
			billGenerationService.addToBill(productDetailBean,billDetailsBean);
		}
		// Return Bill details
		return billDetailsBean;
	}

}
