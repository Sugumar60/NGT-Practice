package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class A02_ArrangeAlphabet {

	public static void main(String[] args) {
		
	    A02_ArrangeAlphabet arrangrAlphabet = new A02_ArrangeAlphabet();
		Scanner  s = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
	    String value=s.nextLine();
	    
	    if(value.matches("^[a-zA-Z]*$"))
	    {
	    System.out.print(arrangrAlphabet.AlphabetSoup(value));
	    }
	    else {
	    	System.out.println("Invalid string");
	    }
	    s.close();	
	}
	
	
	
	public String AlphabetSoup(String str){
		
		char[] ch = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		Arrays.sort(ch);
		String newStr ="";
		for(int i=0; i < ch.length ; i++)
			newStr += ch[i];
		
		return newStr;
	}
}
