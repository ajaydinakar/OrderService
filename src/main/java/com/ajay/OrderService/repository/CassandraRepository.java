package com.ajay.OrderService.repository;

import com.ajay.OrderService.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CassandraRepository extends CrudRepository<Customer, String> {

}
