package com.assignments;

import java.util.Scanner;

public class A06_Factorial {

	public static void main(String[] args) {
		A06_Factorial factorial = new A06_Factorial();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println(factorial.firstFactorial(num));
		sc.close();
	}
	
	public int firstFactorial(int num) {
		int fact=1;
		if(num>1 && num<18){
			for(int i=1; i<=num; i++)
				fact *= i;    
			return fact;
		 }
		 else
		    System.out.println("Invalid Input");
		 
		return 0;
	}

}
