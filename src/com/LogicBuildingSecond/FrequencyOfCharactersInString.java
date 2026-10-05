package com.LogicBuildingSecond;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharactersInString {

	public static void main(String[] args) {
		String input = "Hello";
		Map<Character, Integer> resultMap = new HashMap<Character, Integer>();

		for (char c : input.toCharArray()) {
			resultMap.put(c, resultMap.getOrDefault(c, 0) + 1);
		}
		System.out.println(resultMap);
		for (Map.Entry<Character, Integer> c : resultMap.entrySet()) {
			System.out.println(c);
		}
	}

}
