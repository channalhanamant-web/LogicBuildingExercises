package com.LogicBuildingSecond;

import java.util.HashMap;

public class CountTheFrequenceOfSpecialCharacters {

	public static void main(String[] args) {
		String input = " 1a@ bs#@#%";
		char inputArray[] = input.toCharArray();

		HashMap<Character, Integer> frequencyMap = new HashMap<Character, Integer>();

		for (char c : inputArray) {
			if (!(Character.isLetter(c) || (Character.isDigit(c)) || (Character.isSpace(c)))) {
				frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
			}
		}
		System.out.println(frequencyMap.toString());

		for (char x : frequencyMap.keySet()) {
			System.out.println(x + " " + frequencyMap.get(x));
		}

	}

}
