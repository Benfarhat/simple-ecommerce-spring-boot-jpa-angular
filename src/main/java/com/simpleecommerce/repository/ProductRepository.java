package com.simpleecommerce.repository;
import org.springframework.data.repository.CrudRepository;

import com.simpleecommerce.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}