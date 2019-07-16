package com.simpleecommerce.repository;
import org.springframework.data.repository.CrudRepository;

import com.simpleecommerce.model.OrderProduct;
import com.simpleecommerce.model.OrderProductPK;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}