package com.ani.test.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ani.test.model.Customer;


@Repository
public interface CustomerRepo{

    public String addCustomer(Customer Customer);
	public List<Customer> findAllCustomers();
	public Customer findById(int id);
	public String updateCustomer(Customer Customer);
	public String deleteCustomer(int id);
	
}
