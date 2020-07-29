package com.assignments;

import java.util.Scanner;

public class A04_ChangeLetter {

	public static void main(String[] args) {
		A04_ChangeLetter changeLetter = new A04_ChangeLetter();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		System.out.println(changeLetter.letterChanges(str));
		sc.close();		
	}
	
	
	public String letterChanges(String str) {
		
		char ch;
		for(int i=0;i<str.length();i++){
			ch = str.charAt(i);
			Character chr = new Character(ch);
			
			if(chr.equals('z')){
				chr = (char)(chr - 25);
				chr = chr.toUpperCase(chr);
				str = str.substring(0, i) + chr + str.substring(i + 1);
			}
			else {
				chr = (char)(chr + 1);
				if(chr.equals('e')||chr.equals('i')||chr.equals('o')||chr.equals('u')){
					chr = chr.toUpperCase(chr);
				}
				str = str.substring(0, i)  + chr + str.substring(i + 1);
			}
		}
		return str;		
	}

}
