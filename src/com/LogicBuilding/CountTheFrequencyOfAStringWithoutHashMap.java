package com.LogicBuilding;

public class CountTheFrequencyOfAStringWithoutHashMap {

	public static void main(String[] args) {
		String input = "abccaa";
		int frequency[] = new int[256]; // ASCII 0-256
		char inputArray[] = input.toCharArray();
		for (char c : inputArray) {
			frequency[c] = frequency[c] + 1;

		}
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] > 0) {
				System.out.println((char) i + " " + frequency[i]);

			}
		}

	}

}
