package com.LogicBuilding;

public class ChangingKeysInAString {

	public static void main(String[] args) {
		// number of times the char changed in a string

		String input = "abBccff";
		int count = 0;
		String inputLower = input.toLowerCase();

		char inputArray[] = inputLower.toCharArray();
		char previousKey = inputArray[0];
		for (int i = 1; i <= inputArray.length - 1; i++) {
			if (previousKey != inputArray[i]) {
				count++;
			}
			previousKey = inputArray[i];
		}
		System.out.println(count);

	}

}
