package com.example.CustomerRegistration.service;

import com.example.CustomerRegistration.model.Customer;

import java.util.List;

import org.jvnet.hk2.annotations.Service;

@Service
public interface CustomerService {
	
	List <Customer> getAllCustomers();
	void saveCustomer(Customer customer);
	Customer getCustomerById(long id);
	void deleteCustomerById(long id);
	
}