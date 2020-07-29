package com.assignments;

import java.util.Scanner;

public class A05_ReverseString {

	public static void main(String[] args) {
		A05_ReverseString reverseString = new A05_ReverseString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		System.out.println(reverseString.reverseOrder(str));
		sc.close();
	
	}
	
	public String reverseOrder(String str) {
		String reverseStr ="";
		for(int i=str.length()-1; i>=0; i--){
			reverseStr += str.charAt(i);
		}
		return reverseStr;
	}

}
