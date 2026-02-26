package com.LogicBuilding;

import java.util.HashMap;

public class CountTheFrequencyOfCharactersInStringIMP {

	public static void main(String[] args) {
		String input = "madam";
		char inputArray[] = input.toCharArray(); // convert the string into char type array
		// Storing the each char in MAP using hash map as it stores unique values with
		// key and value format

		HashMap<Character, Integer> frequencyMap = new HashMap<Character, Integer>();

		for (char c : inputArray) {

			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
		}
		// System.out.println(frequencyMap);
		for (char x : frequencyMap.keySet()) {
			System.out.println(x + " " + frequencyMap.get(x));

		}
	}

}
