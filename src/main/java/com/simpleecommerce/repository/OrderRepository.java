package com.simpleecommerce.repository;
import org.springframework.data.repository.CrudRepository;

import com.simpleecommerce.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}