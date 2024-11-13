package com.howard;

import java.util.Scanner;

public class SumOfTwoNum {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		int sum1 = 0;

		Scanner newScan = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		int numRead = newScan.nextInt();
		System.out.println("Enter Number 2: ");
		int numRead2 = newScan.nextInt();

		SumOfTwoNum sum = new SumOfTwoNum();
		sum.sum(numRead, numRead2);

		System.out.println("sum of both : " + numRead + numRead2);
		// sum = num1 + num2;

		sum1 = numRead + numRead2;

		System.out.println("Sum of numbers : " + sum1);
	
		System.out.println("Subtract Numbers: ");
		sum.subtract(numRead, numRead2);
		
		System.out.println("Multiply Numbers: ");
		sum.multiple(numRead, numRead2);
		

	}

	public void sum(int x, int y) {
		int sum;
		sum = x + y;
		System.out.println(sum);
		System.out.println();

	}

	public void subtract(int x, int y) {
		int subtract;
		subtract = x - y;
		System.out.println(subtract);
		System.out.println();

	}
	
	public void multiple(int x, int y) {
		int product;
		product = x * y;
		System.out.println(product);
		System.out.println();
	}
}
