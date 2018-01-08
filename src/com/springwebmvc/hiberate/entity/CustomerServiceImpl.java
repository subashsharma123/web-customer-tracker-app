package com.springwebmvc.hiberate.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springwebmvc.hiberate.dao.CustomerDao;
import com.springwebmvc.hiberate.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDao.getCustomer();
	}

	

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
	}



	@Override
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

}
