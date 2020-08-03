package com.retailstore.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.retailstore.constants.CustomerType;

public class Customer {
	
	private int custId;
	private String custName;
	private CustomerType custType;
	private LocalDate registeredDate;
	private List<Product> product =new ArrayList<Product>();
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public CustomerType getCustType() {
		return custType;
	}
	public void setCustType(CustomerType custType) {
		this.custType = custType;
	}
	public LocalDate getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(LocalDate registeredDate) {
		this.registeredDate = registeredDate;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public Customer(int custId, String custName, CustomerType custType, LocalDate registeredDate, List<Product> product) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custType = custType;
		this.registeredDate = registeredDate;
		this.product = product;
	}
	public Customer() {
		super();
	}
	
	
	
	

}
