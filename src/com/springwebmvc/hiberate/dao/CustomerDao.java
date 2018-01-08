package com.springwebmvc.hiberate.dao;

import java.util.List;

import com.springwebmvc.hiberate.entity.Customer;

public interface CustomerDao {
	public List<Customer> getCustomer();

	public void saveCustomer(Customer customer);
	

}
