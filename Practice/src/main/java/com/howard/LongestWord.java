package com.howard;

import java.util.Scanner;

public class LongestWord {
	
	public static void main(String[] args) {
		
		String userEntered = "";
		
		LongestWord longWurd = new LongestWord();
		//longWurd.longWord();
		
		Scanner userLine = new Scanner(System.in);
		
		System.out.println("Please enter sentance to find longest word : ");
		userEntered = userLine.nextLine();
		longWurd.longWord(userEntered);
		
		
		
		
	}
	
	public void longWord(String x) {
		String[] sentanceWords = x.split(" ");
		String longestWord = "";
		
		for(String word : sentanceWords) {
			if(word.length() > sentanceWords.length) {
			
			longestWord = word;
			}
			
		}
		System.out.println(longestWord);
		System.out.println(longestWord.length());
		
	}

}
