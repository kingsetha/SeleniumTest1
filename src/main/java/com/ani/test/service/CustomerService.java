package com.ani.test.service;

import java.util.List;

import com.ani.test.model.Customer;

public interface CustomerService {

	public String addCustomer(Customer Customer);

	public Customer getCustomer(int id);

	public List<Customer> getAllCustomers();

	public String updateCustomer(Customer Customer);

	public String deleteCustomer(int id);

}
