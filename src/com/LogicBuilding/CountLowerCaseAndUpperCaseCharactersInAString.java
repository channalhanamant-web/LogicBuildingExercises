package com.LogicBuilding;

public class CountLowerCaseAndUpperCaseCharactersInAString {

	public static void main(String[] args) {
		String input = "aAbB@cDd sdB";
		char inputArray[] = input.toCharArray();
		int upperCases = 0;
		int lowerCases = 0;

		for (char c : inputArray) {
			if (Character.isAlphabetic(c)) {
				if (Character.isUpperCase(c)) {
					upperCases++;
				} else {
					lowerCases++;
				}
			}

		}
		System.out.println("Total upper cases in a string " + upperCases);
		System.out.println("Total lower cases in a string " + lowerCases);
	}

}
