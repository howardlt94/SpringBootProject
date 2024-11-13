package com.howard;

public class ReverseString {

	
	public static void main(String[] args) {
		
		String name = "racecar";
		String emptyHolder = "";
		
		
		for(int i = 0; i < name.length(); i++) {
			emptyHolder = emptyHolder + name.charAt(name.length()- i - 1);
			//System.out.println(emptyHolder);
			//System.out.println(name.charAt(i));
			
		}
		ReverseString.reverse(name);
	}
	
	
	public static String reverse(String x) {
		String emptyHolder = "";
		for(int i = 0; i < x.length(); i++) {
			emptyHolder = emptyHolder + x.charAt(x.length()- i - 1);
			
			System.out.println(emptyHolder);
			
			if(emptyHolder.equals(x)) {
				System.out.println("true " + emptyHolder + " " + x);
			} else {
				System.out.println("false " + emptyHolder + " " + x);
			}
		 
	
	}
		System.out.println(emptyHolder);
		System.out.println(x);
		
		
		return "hi";
}
}