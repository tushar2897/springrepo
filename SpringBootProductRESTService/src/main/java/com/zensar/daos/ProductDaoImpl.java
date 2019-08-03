package com.zensar.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

/* 
 *Author: Tushar Sadawarte
 *Creation Date: 30th Jul 2019 03.08PM
 *Modified Date: 31th Jul 2019 10.40AM
 *Version: 2.0
 *Copyright: Zensar Technologies. All rights reserved.
 *Description:Represents data access object definitions.
 *It contains CRUD operation methods for entity product.
 */

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	HibernateTemplate ht;
	public void insert(Product product) {
		// TODO Auto-generated method stub
		ht.save(product);
	}

	public void update(Product product) {
		// TODO Auto-generated method stub
		ht.update(product);
	}

	public void delete(Product product) {
		// TODO Auto-generated method stub
		ht.delete(product);
	}

	public Product getById(int productId) {
		// TODO Auto-generated method stub
		return ht.get(Product.class, productId);
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		
		return ht.loadAll(Product.class);
	}
	
}
