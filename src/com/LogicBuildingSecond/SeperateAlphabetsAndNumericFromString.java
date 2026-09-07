package com.LogicBuildingSecond;

public class SeperateAlphabetsAndNumericFromString {

	public static void main(String[] args) {
		String inputString = "RA123SA@#4";
		StringBuilder sbAlphabets = new StringBuilder();
		StringBuilder sbNumeric = new StringBuilder();

		for (char c : inputString.toCharArray()) {
			if (Character.isAlphabetic(c)) {
				sbAlphabets.append(c);
			} else if (Character.isDigit(c)) {
				sbNumeric.append(c);

			}
		}
		System.out.println(sbAlphabets.toString());
		System.out.println(sbNumeric.toString());

	}

}
