package com.assignments;

import java.util.Scanner;

public class A07_FindLongestWord {

	public static void main(String[] args) {
		A07_FindLongestWord findLongestWord = new A07_FindLongestWord();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String str = sc.nextLine();
		System.out.println(findLongestWord.longestWord(str));
		sc.close();

	}
	
	public String longestWord(String sentence) {
		String words[] = sentence.split(" ");
		String maxWord="";
		for(int i=0; i<words.length; i++) {
			if(words[i].length() > maxWord.length())
				maxWord = words[i];	
		}
		return maxWord;
	}

}
