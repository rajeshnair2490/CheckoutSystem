package com.rajesh.checkoutmanagement.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rajesh.checkoutmanagement.beans.ProductDetail;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public ProductDetail get(String productCode) {
	    return jdbcTemplate.queryForObject("select * from ProductDetail where productCode=?", new Object[] {
	            productCode
	        },
	        new BeanPropertyRowMapper < ProductDetail > (ProductDetail.class));
	}

	@Override
	public void add(ProductDetail productDetail) {
		jdbcTemplate.update("Insert into ProductDetail(productCode, category, price ) VALUE(?,?,?)",         new Object[] {
				productDetail.getProductCode(), productDetail.getCategory(),productDetail.getPrice()
	        });
	}

	@Override
	public void remove(String productCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(ProductDetail bean, String productCode) {
		// TODO Auto-generated method stub

	}

}
