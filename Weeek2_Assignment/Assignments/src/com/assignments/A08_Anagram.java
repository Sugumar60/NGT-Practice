package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class A08_Anagram {

	public static void main(String[] args) {
		A08_Anagram anagram = new A08_Anagram();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1 = sc.nextLine();
		System.out.println("Enter the second string: ");
		String str2 = sc.nextLine();
		if(anagram.checkAnagram(str1, str2))
			System.out.println("Given strings are anagrams");
		else
			System.out.println("Given strings are not anagrams");
		sc.close();
		
	}
	
	public boolean checkAnagram(String str1, String str2 ) {
		if (str1.length()==str2.length()) {
			 String s1 = str1.toLowerCase();
			 String s2 = str2.toLowerCase();
	         char[] ch1 = s1.toCharArray();
	         Arrays.sort(ch1);
	         char[] ch2 = s2.toCharArray();
	         Arrays.sort(ch2);     
	         if(Arrays.equals(ch1, ch2))
	            return true;
	         else
	            return false;
	      }
		return false;
	}

}
