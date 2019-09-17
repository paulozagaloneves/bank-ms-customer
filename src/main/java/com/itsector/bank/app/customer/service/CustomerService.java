package com.itsector.bank.app.customer.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itsector.bank.app.customer.dto.in.CustomerIn;
import com.itsector.bank.app.customer.model.Customer;
import com.itsector.bank.app.customer.repository.CustomerRepository;
import com.itsector.bank.app.customer.repository.RepositoryUtils;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAll() {
		return RepositoryUtils.toList(customerRepository.findAll());
	}
	
	public Customer getCustomerById(Long profileId) {		
		return customerRepository.findByProfileId(profileId).get();
	}
	
	public Customer saveCustomer(CustomerIn customerIn) {
		Customer customer = customerIn.of(Customer.class);
		customer.setCreateTimestamp(new Date());
		return customerRepository.save(customer);
	}
	
	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void deleteCustomer(Long profileId) {
		customerRepository.deleteById(profileId);
	}
}
