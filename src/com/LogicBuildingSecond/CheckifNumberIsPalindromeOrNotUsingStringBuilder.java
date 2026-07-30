package com.LogicBuildingSecond;

public class CheckifNumberIsPalindromeOrNotUsingStringBuilder {

	public static void main(String[] args) {
		int number = 121;

		String numberString = Integer.toString(number);

		StringBuilder sb = new StringBuilder(numberString);
		String reverseString = sb.reverse().toString();

		if (numberString.equals(reverseString)) {
			System.out.println("Number is Palindrome number");
		} else {
			System.out.println("Number is not a Palindrome number");
		}

	}

}
