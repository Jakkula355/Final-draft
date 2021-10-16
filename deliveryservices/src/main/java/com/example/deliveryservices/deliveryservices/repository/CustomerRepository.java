package com.example.deliveryservices.deliveryservices.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.deliveryservices.deliveryservices.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer>{

}
