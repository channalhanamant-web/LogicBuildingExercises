package com.LogicBuildingSecond;

public class CheckIfNumberIsPalindromeOrNot {

	public static void main(String[] args) {

		int input = 123;

		int number = input;
		int lastDigit;
		int reverseNumber = 0;

		while (number != 0) {
			lastDigit = number % 10;
			reverseNumber = reverseNumber * 10 + lastDigit;
			number = number / 10;
		}
		if (reverseNumber == input) {
			System.out.println("Number is Palindrome number");
		} else {
			System.out.println("Number is not a Palindrome number");
		}

	}

}
