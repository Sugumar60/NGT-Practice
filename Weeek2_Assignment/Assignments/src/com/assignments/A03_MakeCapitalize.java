package com.assignments;

import java.util.Scanner;

public class A03_MakeCapitalize {

	public static void main(String[] args) {
		A03_MakeCapitalize makeCapitalize = new A03_MakeCapitalize();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some sentence:");
		String str = sc.nextLine();
		
		makeCapitalize.letterCapitalize(str);
		sc.close();
	}
	
	public void letterCapitalize(String str){
		
		StringBuilder resultStr = new StringBuilder(str.length());
		String words[] = str.split(" "); 
		for (int i = 0; i < words.length; i++)
		{			
			resultStr.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
			
		}
		System.out.println(resultStr); 
	}
}
