package com.LogicBuilding;

public class SeparateNumericValuesFromAlphabets {

	public static void main(String[] args) {
		String input = "Ra123j";
		StringBuilder sbNum = new StringBuilder();
		StringBuilder alphabetsSB = new StringBuilder();

		char inputArray[] = input.toCharArray();

		for (char currentChar : inputArray) {

			// if ((inputArray[i] >= 'a' && inputArray[i] <= 'z') || (inputArray[i] >= 'A'
			// && inputArray[i] <= 'Z')) {
			if (Character.isAlphabetic(currentChar)) {
				alphabetsSB.append(currentChar);
			} else if (Character.isDigit(currentChar)) {
				sbNum.append(currentChar);
			}

		}
		System.out.println(sbNum);
		System.out.println(alphabetsSB);
	}

}
