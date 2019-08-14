package com.zensar.services.web;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.Product;
import com.zensar.services.business.ProductService;

@CrossOrigin(origins="*" , allowedHeaders="*" )
@RestController
@RequestMapping("/products")
public class ProductResource {
	@Autowired
	private ProductService service;
	
	@GetMapping
	public List<Product> getAllProducts(){
		return service.findAllProducts();
	}
	
	@RequestMapping("/{Id}")
	public Product getProduct(@PathVariable("Id")int productId) {
		return service.findProductById(productId);
	}
	/*
	 * @PostMapping public String createProduct(@RequestParam("id")int
	 * productId,@RequestParam("name")String name,@RequestParam("brand")String
	 * brand,@RequestParam("price")float price) { Product product = new
	 * Product(productId,name,brand,price); service.create(product);
	 * 
	 * return "Product " +productId + "created Successfully"; }
	 */
	
	
	@PostMapping
	public String createProduct(@RequestBody Product product) {
		
		service.create(product);
		
		return "Product "  + "created Successfully";
	}
	
	@PutMapping public String editProduct(@RequestBody Product product) {
	 
	 service.edit(product);
	 
	 return "Product " +product.getProductId() + "edited Successfully"; 
	}
	
	@DeleteMapping("/{Id}")
	public String removeProduct(@PathVariable("Id")int productId) {
		Product newProduct=service.findProductById(productId);
		
		service.remove(newProduct);
		return "Product deleted";
	}
	
	
	@GetMapping("/count")
	public int getProductCount() {
		return service.findAllProducts().size();
		
	}
}
