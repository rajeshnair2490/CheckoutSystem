package com.rajesh.checkoutmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajesh.checkoutmanagement.beans.BillDetailsBean;
import com.rajesh.checkoutmanagement.beans.ProductDetail;
import com.rajesh.checkoutmanagement.beans.ProductBillInfo;
import com.rajesh.checkoutmanagement.beans.ProductDetailBean;

@Service
public class BillGenerationService {
	@Autowired
	private BillDetailsBean billDetailsBean;
	@Autowired
	private TaxCalculationService taxService;
	
	public void addToBill(ProductDetailBean productDetailBean) {
		ProductDetail productBean = productDetailBean.getProductBean();
		
		ProductBillInfo productBillInfo = new ProductBillInfo();
		productBillInfo.setProductCode(productBean.getProductCode());
		int price = productBean.getPrice();
		productBillInfo.setPrice(price);
		int quantity = productDetailBean.getQuantity();
		productBillInfo.setQty(quantity);
		double taxes = taxService.calculateTax(productBean)*quantity;
		productBillInfo.setTaxes(taxes);
		billDetailsBean.addPrice(price);
		billDetailsBean.addTaxes(taxes);
		billDetailsBean.getProductBillInfo().add(productBillInfo );
	}

	public BillDetailsBean getBillInfo() {
		return billDetailsBean;
	}

}
