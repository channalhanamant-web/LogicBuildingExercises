package com.LogicBuildingSecond;

public class FirstAndLastOccuranceOfCharOInAString {

	public static void main(String[] args) {
		String inputString = "Hello WOrld";
		inputString = inputString.toLowerCase();

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
		if (firstIndex < 0) {
			System.out.println("Given element not present in the string");
		} else {
			System.out.println("First occurance at Index " + firstIndex);
			System.out.println("Last occurance at Index " + lastIndex);
		}

	}

}
