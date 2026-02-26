package com.LogicBuilding;

public class CheckIfANumberIsPalindromeOrNot {

	public static void main(String[] args) {
		int number = 123;
		int originalNum = number;
		int lastDigit;
		int reverseNum = 0;

		while (number != 0) {
			lastDigit = number % 10;
			reverseNum = 10 * reverseNum + lastDigit;
			number = number / 10;

		}
		System.out.println(reverseNum);
		if (originalNum - reverseNum == 0) {
			System.out.println("Given number is Palindrome number");
		} else {
			System.out.println("Given number is not a Palindrome number");
		}

	}

}
