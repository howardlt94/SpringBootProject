package com.howard;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		String fizzTest = "";
		int fizzNum = 5;
		
		FizzBuzz fizz = new FizzBuzz();
		fizz.FizzBuzzMethod(fizzNum);
		fizz.FizzBuzzMethod(15);
		
		
	}




public void FizzBuzzMethod(int x) {
	
	if(x%3 ==0 && x%5 ==0) {
		System.out.println("fizzbuzz");
	}else if (x%3 ==0){
		System.out.println("fizz");
	}else if(x%5 ==0) {
		System.out.println("buzz");
	}
	
	
}
}

