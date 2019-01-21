package com.rajesh.checkoutmanagement.dao;

import com.rajesh.checkoutmanagement.beans.Product;

/**
 * @author rajesh
 *
 */
public interface ProductDAO {
	public Product get(String productCode);
	public void add(Product product);
	public void remove(String productCode);
	public void update(Product bean, String productCode);
}
