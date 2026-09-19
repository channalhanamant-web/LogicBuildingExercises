package com.LogicBuildingSecond;

public class CountTheNumberOfDigitsInANumber {

	public static void main(String[] args) {
		int input = 1234;

		String string = Integer.toString(input);
		System.out.println(string.length());

		int count = 0;

		int lastNumber;
		while (!(input == 0)) {
			lastNumber = input % 10;
			count++;
			input = input / 10;

		}

		System.out.println(count);
	}

}
