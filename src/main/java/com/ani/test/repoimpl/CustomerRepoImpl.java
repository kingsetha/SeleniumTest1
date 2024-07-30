package com.ani.test.repoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ani.test.model.Customer;
import com.ani.test.repository.CustomerRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class CustomerRepoImpl implements CustomerRepo {

	@Autowired
	EntityManager em;

	@Override
	public String addCustomer(Customer Customer) {
		
		if(Customer!=null)
		{
			em.merge(Customer);
			return "success";
		}
		else {
			return "failure";
		}
	}

	@Override
	public List<Customer> findAllCustomers() {
		String hql = "from Customer";
		Query query = em.createQuery(hql);
		return query.getResultList();
	}

	@Override
	public Customer findById(int id) {
		return em.find(Customer.class, id);
	}

	@Override
	public String updateCustomer(Customer Customer) {
		if(Customer!=null)
		{
			em.merge(Customer);
			return "success";
		}
		else {
			return "failure";
		}
	}

	@Override
	public String deleteCustomer(int id) {
		Customer p = em.find(Customer.class, id);
//		em.remove(p);
		if(p!=null)
		{
			em.remove(p);
			return "success";
		}
		else {
			return "failure";
		}

	}

}
