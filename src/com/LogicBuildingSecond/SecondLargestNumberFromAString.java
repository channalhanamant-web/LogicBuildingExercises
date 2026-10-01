package com.LogicBuildingSecond;

public class SecondLargestNumberFromAString {

	public static void main(String[] args) {
		String input = "abc321d4er";
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (char c : input.toCharArray()) {
			if (Character.isDigit(c)) {
				int x = c - '0'; // convert char c to int value x
				if (x > firstLargest) {
					secondLargest = firstLargest;
					firstLargest = x;
				} else if (x > secondLargest) {
					secondLargest = x;
				}
			}
		}
		System.out.println("Second largest number in a String is " + secondLargest);

	}

}
