package com.LogicBuilding;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharactersFromAString {

	public static void main(String[] args) {
		String input = ("programming");

		// Linked hash map --linked in set or map will help to maintain the order

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char letter : input.toCharArray()) {
			map.put(letter, map.getOrDefault(letter, 0) + 1);
		}
		System.out.println(map);
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.print(entry.getKey());
			}
		}

	}

}
