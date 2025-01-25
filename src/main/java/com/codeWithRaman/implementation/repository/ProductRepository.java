package com.codeWithRaman.implementation.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.codeWithRaman.implementation.model.Product;

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, String>{

	List<Product> findByName(String name);

}
