package com.retailstore;

import java.util.Scanner;

public class Store {

	private static String customerName;

	public static void main(String[] args) {
		
		Discount discount = new Discount();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Select Customer type: ");
		System.out.println("1. Employee of the store");
        System.out.println("2. Affiliate of the store");
        System.out.println("3. Customer for 2 years ");
        System.out.println("4. None of the above");
        System.out.println("5. No discount on Groceries");
        
		int ctype=sc.nextInt();
		System.out.println("Enter Your Name: ");
		customerName = sc.next();
		System.out.println("Enter your actual bill amount:");
		double billamount=sc.nextDouble();
		
		System.out.println("Total payable amount is :" + discount.getDiscount(billamount, ctype));
		System.out.println("Thank you for Shopping " + customerName );
		sc.close();
			
		}

}


