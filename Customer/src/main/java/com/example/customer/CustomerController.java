package com.example.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CustomerController {

	@Autowired
	 private CustomerService customerService;
	
	 @GetMapping("/customer")
	 public List<Customer> getAllCustomer() {
	 return customerService.getAllCustomer();
	 }
	 @GetMapping("/customer/{id}")
	 public Customer getCustomerById(@PathVariable Long id) {
	 return customerService.getCustomerById(id);
	 }
	 @PostMapping("/customer")
	 public Customer addCustomer(@RequestBody Customer customer) {
	 return customerService.addCustomer(customer);
	 }
	 @PutMapping("/customer/{id}")
	 public Customer updateCustomer(@PathVariable Long id, 
	@RequestBody Customer customer) {
	 return customerService.updateCustomer(id, customer);
	 }
	 @DeleteMapping("/customer/{id}")
	 public void deleteCustomer(@PathVariable Long id) {
		 customerService.deletecustomer(id);
	 }

}
