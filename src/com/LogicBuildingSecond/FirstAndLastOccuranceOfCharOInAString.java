package com.LogicBuildingSecond;

public class FirstAndLastOccuranceOfCharOInAString {

	public static void main(String[] args) {
		String inputString = "Hellow World";
		inputString.toLowerCase();

		int firstIndex = -1;
		int lastIndex = -1;

		for (int index = 0; index < inputString.length(); index++) {
			if (inputString.charAt(index) == 'o') {
				firstIndex = index;
				break;
			}
		}
		for (int index = inputString.length() - 1; index >= 0; index--) {
			if (inputString.charAt(index) == 'o') {
				lastIndex = index;
				break;
			}
		}
		System.out.println("First occurance"+firstIndex);
		System.out.println("Last occurance"+lastIndex);

	}

}
