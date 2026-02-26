package com.LogicBuilding;

import java.util.HashMap;
import java.util.Map;

public class CountTheFrequenciesOfWordsInAString {

	public static void main(String[] args) {
		String inputString = "Hello my name is Rohan Rohan";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String string : inputString.split(" ")) {

			map.put(string, map.getOrDefault(string, 0) + 1);

		}
		System.out.println(map);
		for (Map.Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
