package com.retailstore.service;

import com.retailstore.model.Customer;

public class RetailStoreService implements IRetailStoreService {
	
	RetailStoreService dao = new RetailStoreService();

	@Override
	public double calculateBill(Customer customer) {

		return dao.calculateBill(customer);
	}

}
