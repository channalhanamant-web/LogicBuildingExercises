package com.LogicBuilding;

public class CheckIfANumberIsPalindromeOrNotUsingStringBuilder {

	public static void main(String[] args) {
		int number = 121;
		// convert this number into string
		String originalNuminString = Integer.toString(number);

		// To reverse a string need to use string builder class

		StringBuilder reverseStringBuilder = new StringBuilder(originalNuminString);
		String reverseStringFromStringBuilder = reverseStringBuilder.reverse().toString();// convert reverse string
																							// builder into string
		System.out.println(reverseStringFromStringBuilder);

		if (originalNuminString.equals(reverseStringFromStringBuilder)) {
			System.out.println("Given number is Palindrome number");
		} else {
			System.out.println("Given number is not a Palindrome number");
		}

	}

}
