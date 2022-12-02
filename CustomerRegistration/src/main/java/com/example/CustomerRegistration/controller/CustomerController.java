package com.example.CustomerRegistration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.CustomerRegistration.service.CustomerService;
import com.example.CustomerRegistration.model.Customer;

@Controller
public class CustomerController {

	private CustomerService customerService;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listCustomer", customerService.getAllCustomers());
		return "Cust";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute Customer customer) {
		customerService.saveCustomer(customer);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpadte/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
		Customer customer = customerService.getCustomerById(id);
		model.addAttribute("customer", customer);
		return "cust";
	}
	
	@GetMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable(value = "id") long id) {
		customerService.deleteCustomerById(id);
		return "redirect:/";
	}

}