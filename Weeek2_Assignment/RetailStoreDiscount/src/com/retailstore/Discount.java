package com.retailstore;

public class Discount {
	
	private double dAmount;
	
	public double getDiscount(double amount, int type) {
		
		double totalCost=0;
		
		switch(type) {
		
		case 1:
			dAmount= (amount*30)/100;
			totalCost=amount-dAmount;
			break;
			
		case 2:
			dAmount= (amount*10)/100;
			totalCost=amount-dAmount;
			break;
			
		case 3:
		    dAmount= (amount*5)/100;
		    totalCost=amount-dAmount;
		 break;
			
		case 4:
			int amt=(int) (amount/100);
			dAmount=amt*5;
			totalCost=amount-dAmount;
			break;
				
		case 5:
			totalCost=amount;
			break;
				
		default:  
		     System.out.println("Please select the proper action.");
		     System.exit(0);    
		}
			
		return totalCost;
	}
	
}
