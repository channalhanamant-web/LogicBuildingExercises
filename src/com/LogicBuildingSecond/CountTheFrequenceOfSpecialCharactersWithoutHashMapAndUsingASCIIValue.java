package com.LogicBuildingSecond;

public class CountTheFrequenceOfSpecialCharactersWithoutHashMapAndUsingASCIIValue {

	public static void main(String[] args) {
		String input = "1a@bs#@#%";

		char inputArray[] = input.toCharArray();

		int frequency[] = new int[256];

		for (char current : inputArray) {
			frequency[current]++;
		}
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] > 0) {
				System.out.println((char) i + " " + frequency[i]);
			}
		}

	}

}
