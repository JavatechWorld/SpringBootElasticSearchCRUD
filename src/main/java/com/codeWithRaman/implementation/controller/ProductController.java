package com.codeWithRaman.implementation.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeWithRaman.implementation.model.Product;
import com.codeWithRaman.implementation.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	private final ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return productService.save(product);
	}
	@GetMapping("/{name}")
	public List<Product> findByName(@PathVariable String name){
		return productService.findByName(name);
	}
	@GetMapping
	public List<Product> findAll(){
		return productService.findAll();
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable String id) {
		productService.deleteById(id);
	}

}
