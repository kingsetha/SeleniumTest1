package com.ani.test.serviceimplementation;

import java.util.List;
import org.springframework.stereotype.Service;

import com.ani.test.model.Customer;
import com.ani.test.repository.CustomerRepo;
import com.ani.test.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	CustomerRepo repo;

	public CustomerServiceImpl(CustomerRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addCustomer(Customer Customer) {
		return repo.addCustomer(Customer);

	}

	@Override
	public Customer getCustomer(int id) {

		return repo.findById(id);
	}
	@Override
	public List<Customer> getAllCustomers() {

		return repo.findAllCustomers();
	}

	@Override
	public String updateCustomer(Customer Customer) {
		return repo.updateCustomer(Customer);

	}

	@Override
	public String deleteCustomer(int id) {
		return repo.deleteCustomer(id);

	}

}
