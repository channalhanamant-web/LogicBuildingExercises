package com.LogicBuildingSecond;

import java.util.HashMap;
import java.util.Map;

public class ReverseAMap {

	public static void main(String[] args) {
		Map<String, Integer> ogMap = new HashMap<String, Integer>();
		Map<Integer, String> reversedMap = new HashMap<Integer, String>();
		ogMap.put("A", 1);
		ogMap.put("b", 2);
		ogMap.put("c", 3);
		ogMap.put("d", 4);
		ogMap.put("e", 5);

		for (Map.Entry<String, Integer> ogValue : ogMap.entrySet()) {

			reversedMap.put(ogValue.getValue(), ogValue.getKey());
		}
		System.out.println(ogMap);
		System.out.println(reversedMap);
	}

}
