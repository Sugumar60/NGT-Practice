package com.retailstore.dao;

import java.time.LocalDate;

import com.retailstore.constants.CustomerType;
import com.retailstore.constants.ProductType;
import com.retailstore.model.Customer;
import com.retailstore.model.Product;

public class RetailStoreDAO implements IRetailStoreDAO{

	@Override
	public double calculateBillAmount(Customer customer) {
		
		double discount=0.0,totalWithoutGrocery=0.0,groceryAmount=0.0,totalPrice=0.0;
		int generalDiscount=0;
		
		for(Product product : customer.getProduct()){
			
			if(product.getProductType() == ProductType.GROCERIES)
				groceryAmount = groceryAmount + (product.getQuantity()*product.getProductPrice());
			else
				totalWithoutGrocery = totalWithoutGrocery +(product.getQuantity()*product.getProductPrice());
		}
		
		if(customer.getCustType() == CustomerType.EMPLOYEE) {
			discount=totalWithoutGrocery*0.30;
			totalPrice=(groceryAmount + totalWithoutGrocery)-discount;
		}
		else if(customer.getCustType()== CustomerType.AFFILIATE) {
			discount=totalWithoutGrocery*0.10;
			totalPrice=(groceryAmount + totalWithoutGrocery)-discount;
		}
		else if(customer.getCustType() == CustomerType.REGULAR_CUSTOMER) {
			int yearDifference=LocalDate.now().getYear() - customer.getRegisteredDate().getYear();
			if(yearDifference >= 2) {
				discount=totalWithoutGrocery*0.05;
				totalPrice=(groceryAmount + totalWithoutGrocery) - discount;
			}
		}
		else 
			totalPrice = (groceryAmount + totalWithoutGrocery);
		
		generalDiscount = (int)totalPrice/100;
		totalPrice = totalPrice - (generalDiscount*5);
		return totalPrice;
		
	}

}
