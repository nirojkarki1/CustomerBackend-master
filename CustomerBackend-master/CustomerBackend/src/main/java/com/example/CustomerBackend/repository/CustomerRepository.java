package com.example.CustomerBackend.repository;

import com.example.CustomerBackend.enitity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
//    Customer findbyName(String name);
}
