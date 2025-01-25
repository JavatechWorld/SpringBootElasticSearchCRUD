package com.codeWithRaman.implementation.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.codeWithRaman.implementation.model.Product;
import com.codeWithRaman.implementation.repository.ProductRepository;
@Service
public class ProductService {
	
	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}
	
	public Product save(Product product) {
		return productRepository.save(product);
	}
	
	public List<Product> findByName(String name){
		return productRepository.findByName(name);
	}
	
	public List<Product> findAll(){
		Page<Product> entties = productRepository.findAll(PageRequest.of(0, 10));
		return entties.getContent();
	}
	
	public void deleteById(String id) {
		 productRepository.deleteById(id);
	}

}
