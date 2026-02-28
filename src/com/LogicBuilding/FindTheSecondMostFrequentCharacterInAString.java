package com.LogicBuilding;

import java.util.HashMap;
import java.util.Map;

public class FindTheSecondMostFrequentCharacterInAString {

	public static void main(String[] args) {
		String input = "aabbbcccc";
		char inputArray[] = input.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : inputArray) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		System.out.println(map);

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (Map.Entry<Character, Integer> mp : map.entrySet()) {
			if (mp.getValue() > first) {
				second = first;
				first = mp.getValue();

			} else if (mp.getValue() < first && mp.getValue() > second) {
				second = mp.getValue();
			}

		}

		System.out.println(first);
		System.out.println(second);
		for (Map.Entry<Character, Integer> mp : map.entrySet()) {
			if (mp.getValue() == second) {
				System.out.println(mp.getKey());
			}

		}
	}

}
