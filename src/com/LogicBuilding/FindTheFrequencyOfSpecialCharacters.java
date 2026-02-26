package com.LogicBuilding;

import java.util.HashMap;

public class FindTheFrequencyOfSpecialCharacters {

	public static void main(String[] args) {
		String input = "abs#@#";
		char inputArray[] = input.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : inputArray) {
			if (!(c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= 0 && c <= 9) || (c == ' ')) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);// update the value
				} else {
					map.put(c, 1);

				}

			}

		}
		System.out.println(map);

	}

}
