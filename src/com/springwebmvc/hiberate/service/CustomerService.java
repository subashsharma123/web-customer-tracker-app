package com.springwebmvc.hiberate.service;

import java.util.List;

import com.springwebmvc.hiberate.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();


	public void saveCustomer(Customer customer);


	public Customer getCustomer(int theId);
	
	
}
