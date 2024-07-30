package com.ani.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.ani.test.model.Customer;
import com.ani.test.serviceimplementation.CustomerServiceImpl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/Customer")
@CrossOrigin("http://localhost:3000")
public class CustomerController {

	
	CustomerServiceImpl service;
	
	public CustomerController(CustomerServiceImpl service) {
		super();
		this.service = service;
	}
	static final String SUCCESS = "success";
	static final String FAILURE = "failure";
	@PostMapping
	public String insertCustomer(@RequestBody Customer mob) {
		String msg = "";
		try {
			service.addCustomer(mob);
			msg = SUCCESS;
		} catch (Exception e) {
			msg = FAILURE;
		}

		return msg;
	}
	@GetMapping("{id}")
	public Customer getCustomerById(@PathVariable("id") int id)
	{
		return service.getCustomer(id);
	}
	@GetMapping("/all")
	public List<Customer> getCustomers()
	{
		return service.getAllCustomers();
	}

	@PutMapping
	public String updateCustomer(@RequestBody Customer mob) {
		String msg = "";
		try {
			service.updateCustomer(mob);
			msg = SUCCESS;
		} catch (Exception e) {
			msg = FAILURE;
		}

		return msg;
	}
	@DeleteMapping("{id}")
	public String deleteCustomerById(@PathVariable("id") int id)
	{
		String msg = "";
		try {
			service.deleteCustomer(id);
			msg = SUCCESS;
		} catch (Exception e) {
			msg = FAILURE;
		}

		return msg;
	}

}
