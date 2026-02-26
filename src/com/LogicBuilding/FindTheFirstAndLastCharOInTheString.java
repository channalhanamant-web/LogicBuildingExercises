package com.LogicBuilding;

public class FindTheFirstAndLastCharOInTheString {

	public static void main(String[] args) {
		String input = "Hello World";
		int firstIndex = -1;
		int lastIndex = -1;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'o') {
				firstIndex = i;
				break;
			}

		}

		for (int j = input.length() - 1; j >= 0; j--) {
			if (input.charAt(j) == 'o') {
				lastIndex = j;
				break;
			}
		}
		if (firstIndex < 0) {
			System.out.println("Character is not present");
		} else {
			System.out.print(firstIndex + "," + lastIndex);

		}

	}

}
