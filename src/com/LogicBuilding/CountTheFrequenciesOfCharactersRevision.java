package com.LogicBuilding;

import java.util.HashMap;

import java.util.Map;

public class CountTheFrequenciesOfCharactersRevision {

	public static void main(String[] args) {
		String inputString = "Hello";

		char inputArray[] = inputString.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : inputArray) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		System.out.println(map);
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
