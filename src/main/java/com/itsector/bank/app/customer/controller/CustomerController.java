package com.itsector.bank.app.customer.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itsector.bank.app.customer.dto.in.CustomerIn;
import com.itsector.bank.app.customer.model.Customer;
import com.itsector.bank.app.customer.service.CustomerService;

@RestController
@RequestMapping("/v1/users")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping()
    public List<Customer> getCustomers() {
        return customerService.getAll();
    }
	
	@PostMapping
	public Customer postNewCustomer(@Valid @RequestBody CustomerIn customer) {
		return customerService.saveCustomer(customer);
	}
	
	@GetMapping("{profileId}")
    public Customer getCustomerById(@PathVariable Long profileId) {
        return customerService.getCustomerById(profileId);
    }	


}
