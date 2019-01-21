package com.rajesh.checkoutmanagement.dao;

import com.rajesh.checkoutmanagement.beans.ProductDetail;

/**
 * @author rajesh
 *
 */
public interface ProductDAO {
	public ProductDetail get(String productCode);
	public void add(ProductDetail productDetail);
	public void remove(String productCode);
	public void update(ProductDetail bean, String productCode);
}
