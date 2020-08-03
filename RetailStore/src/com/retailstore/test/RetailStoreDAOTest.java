package com.retailstore.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.retailstore.constants.CustomerType;
import com.retailstore.constants.ProductType;
import com.retailstore.dao.RetailStoreDAO;
import com.retailstore.model.Customer;
import com.retailstore.model.Product;

class RetailStoreDAOTest {
	
	static RetailStoreDAO shop;
	static Customer  employee, affliate, regularCustomer, newCustomer;
	static List<Product> listOfProducts;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		shop = new RetailStoreDAO();
		listOfProducts = new ArrayList<Product>(Arrays.asList(
						new Product(001, "Television", 20000.0, 1, ProductType.GADGETS),
						new Product(002, "Vegetables", 200.0, 3, ProductType.GROCERIES),
						new Product(003, "Tube light", 60.0, 2, ProductType.HARDWARES)
						));
		LocalDate employeeJoinedDate = LocalDate.parse("2018-05-22");
		LocalDate registeredDate = LocalDate.parse("2017-02-01");
		employee = new Customer(111, "Sugumar", CustomerType.EMPLOYEE, employeeJoinedDate, listOfProducts);
		affliate = new Customer(222, "Sriharan", CustomerType.AFFILIATE, LocalDate.now(), listOfProducts);
		regularCustomer = new Customer(333, "Ashik", CustomerType.REGULAR_CUSTOMER, registeredDate, listOfProducts);
		newCustomer = new Customer(444, "Sindhu", CustomerType.NEW_CUSTOMER, LocalDate.now(), listOfProducts);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		shop = null;
		listOfProducts = null;
		employee = null;
		affliate = null;
		regularCustomer = null;
	}

	@Test
	void calculateBillForEmployee() {
		assertEquals(13954, shop.calculateBillAmount(employee));
	}
	
	@Test
	void calculateBillForAffliate() {
		assertEquals(17773, shop.calculateBillAmount(affliate));
	}
	
	@Test
	void calculateBillForRegularCustomer() {
		assertEquals(18729, shop.calculateBillAmount(regularCustomer));
	}
	
	@Test
	void calculateBillForNewCustomer() {
		assertEquals(19685, shop.calculateBillAmount(newCustomer));
	}

}
