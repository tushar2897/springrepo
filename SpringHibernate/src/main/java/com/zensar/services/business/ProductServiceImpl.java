package com.zensar.services.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.daos.ProductDao;
import com.zensar.entities.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao dao;
	
	public void create(Product product) {
		// TODO Auto-generated method stub
		dao.insert(product);
	}

	public void edit(Product product) {
		// TODO Auto-generated method stub
		Product dbProduct=findProductById(product.getProductId());
		if(dbProduct!=null){
			dbProduct.setName(product.getName());
			dbProduct.setBrand(product.getBrand());
			dbProduct.setPrice(product.getPrice());
			dao.update(dbProduct);
		}
		else
			System.out.println("Sorry! Product does not exist.");
	}

	public void remove(Product product) {
		// TODO Auto-generated method stub
		Product dbProduct=findProductById(product.getProductId());
		if(dbProduct!=null){
			
			dao.delete(dbProduct);
		}
		else
			System.out.println("Sorry! Product does not exist.");
	}

	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return dao.getById(productId);
	}

	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}
