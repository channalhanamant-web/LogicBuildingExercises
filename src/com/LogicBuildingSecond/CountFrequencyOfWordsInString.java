package com.LogicBuildingSecond;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyOfWordsInString {

	public static void main(String[] args) {
		String input = "Hi My name is Rohan name Rohan";

		Map<String, Integer> frequencyMap = new LinkedHashMap<String, Integer>();

		for (String word : input.split(" ")) {
			frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
		}

		System.out.println(frequencyMap);
	}

}
