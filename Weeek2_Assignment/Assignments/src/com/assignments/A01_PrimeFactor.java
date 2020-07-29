package com.assignments;

import java.util.Scanner;

public class A01_PrimeFactor {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		num = sc.nextInt();
		sc.close();
		
		if(num < 2) 
			System.out.println(num);
		else {
			for (int i = 2; i < num; i++) {
				while(num % i == 0) {
					System.out.println(i + " ");
					num /= i;
				}
			}
		}
		
		
	}

}
