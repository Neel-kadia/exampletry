package com.example.CustomerRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CustomerRegistration.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository <Customer, Long> {
	
}