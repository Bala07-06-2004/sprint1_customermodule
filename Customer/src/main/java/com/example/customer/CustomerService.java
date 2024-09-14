package com.example.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	 private CustomerRepository customerRepository;
	 public List<Customer> getAllCustomer() {
	 return customerRepository.findAll();
	 }
	 public Customer getCustomerById(Long id) {
	 return customerRepository.findById(id).orElse(null);
	 }
	 public Customer addCustomer(Customer customer) {
	 return customerRepository.save(customer);
	 }
	 public Customer updateCustomer(Long id,Customer 
			 customerDetails) {
		 Customer customer = 
				 customerRepository.findById(id).orElse(null);
	 if (customer != null) {
		 customer.setName(customerDetails.getName());
		 customer.setAddress(customerDetails.getAddress());
		 customer.setCity(customerDetails.getCity());
		 customer.setState(customerDetails.getState());
	 return customerRepository.save(customer);
	 }
	 return null;
	 }
	 public void deletecustomer(Long id) {
		 customerRepository.deleteById(id);
	 }

}
