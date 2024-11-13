package com.howard;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		String userEnterString = "";

		Palindrome palindromeCheck = new Palindrome();

		Scanner newString = new Scanner(System.in);

		System.out.println("Enter Word to check if palindrome: ");

		userEnterString = newString.nextLine();
		palindromeCheck.palindrome(userEnterString);

	}

	public static void palindrome(String x) {
		String holder = "";
		int i = 0;

		while (i < x.length()) {
			holder = holder + x.charAt(x.length() - i - 1);
			System.out.println(holder);
			i++;

		}
		System.out.println(x);

		if (holder.equals(x)) {
			System.out.println("String is a Palindrome!");
		} else {
			System.out.println("String is not a Palindrome!");
		}

	}

}
