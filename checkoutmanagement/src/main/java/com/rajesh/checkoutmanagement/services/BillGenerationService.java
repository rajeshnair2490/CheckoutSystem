package com.rajesh.checkoutmanagement.services;

import com.rajesh.checkoutmanagement.beans.BillDetailsBean;
import com.rajesh.checkoutmanagement.beans.Product;
import com.rajesh.checkoutmanagement.beans.ProductBillInfo;
import com.rajesh.checkoutmanagement.beans.ProductDetailBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class BillGenerationService {
	@Autowired
	private TaxCalculationService taxService;
	
	public void addToBill(ProductDetailBean productDetailBean, BillDetailsBean billDetailsBean) {
		if(productDetailBean == null){
			return;
		}
		Product productBean = productDetailBean.getProductBean();
		if(productBean == null){
			return;
		}
		ProductBillInfo productBillInfo = new ProductBillInfo();
		productBillInfo.setProductCode(productBean.getProductCode());
        int quantity = productDetailBean.getQuantity();
        int price = productBean.getPrice();
        productBillInfo.setPrice(price*quantity);
		productBillInfo.setQty(quantity);
		double taxes = taxService.calculateTax(productBean)*quantity;
		productBillInfo.setTaxes(taxes);
		billDetailsBean.addPrice(price);
		billDetailsBean.addTaxes(taxes);
		billDetailsBean.getProductBillInfo().add(productBillInfo );
	}

}
