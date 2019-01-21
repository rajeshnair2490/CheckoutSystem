package com.rajesh.checkoutmanagement.dao;

import com.rajesh.checkoutmanagement.beans.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public Product get(String productCode) {
		try {
			return jdbcTemplate.queryForObject("select * from Product where productCode=?", new Object[] {
							productCode
					},
					new BeanPropertyRowMapper <Product> (Product.class));
		}catch (EmptyResultDataAccessException e) { // result.size() == 0;
			return null;
		}
	}

	@Override
	public void add(Product product) {
		jdbcTemplate.update("Insert into Product(PRODUCTCODE,CATEGORY,PRICE) VALUES(?,?,?)",         new Object[] {
				product.getProductCode(), product.getCategory(), product.getPrice()
	        });
	}

	@Override
	public void remove(String productCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Product bean, String productCode) {
		// TODO Auto-generated method stub

	}

}
