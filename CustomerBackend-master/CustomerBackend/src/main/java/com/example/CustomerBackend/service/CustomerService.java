package com.example.CustomerBackend.service;

import com.example.CustomerBackend.enitity.Customer;
import com.example.CustomerBackend.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> saveCustomers(List<Customer> customers){
        return customerRepository.saveAll(customers);
    }

    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    public Customer getCustomerById(int id){
        return customerRepository.findById(id).orElse(null);
    }

//    public Customer getCustomerByName(String name){
//        return customerRepository.findbyName(name);
//    }

    public String deleteCustomer(int id){
        customerRepository.deleteById(id);
        return "Customer Removed !!" + id;
    }

    public Customer updateCustomer(Customer customer){

        Customer existingCustomer = customerRepository.findById(customer.getId()).orElse(null);
        existingCustomer.setName(customer.getName());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setGender(customer.getGender());
        existingCustomer.setDependentList(customer.getDependentList());
        return customerRepository.save(existingCustomer);
    }

}
