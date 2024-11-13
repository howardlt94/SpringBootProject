package com.howard;

import java.util.Scanner;

public class MinutesToSeconds {
	
	public static void main(String[] args) {
		
		int minutes;
		
		MinutesToSeconds min2sec = new MinutesToSeconds();
		Scanner newScan = new Scanner(System.in);
		System.out.println("Please Enter Number of Minutes to Convert to Seconds: ");
		minutes = newScan.nextInt();
		
		min2sec.MinToSec(minutes);
		
		
	}
	
	public void MinToSec(int x) {
		int min2sec;
		min2sec = x * 60;
		
		System.out.println("Minutes: " + x + "min " + "Seconds: " + min2sec +"sec");
		
	}

}
