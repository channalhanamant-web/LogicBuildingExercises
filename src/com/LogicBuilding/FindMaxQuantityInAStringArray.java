package com.LogicBuilding;

import java.util.HashMap;
import java.util.Map;

public class FindMaxQuantityInAStringArray {

	public static void main(String[] args) {
		String a[] = { "xyz 9", "abc 20", "xyz 21" };

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		for (String string : a) {
			String data[] = string.split(" ");
			String name = data[0];
			int value = Integer.parseInt(data[1]);

			hmap.put(name, hmap.getOrDefault(name, 0) + value);

		}
		System.out.println(hmap);
		int max = 0;
		String result = " ";

		for (Map.Entry<String, Integer> entryset : hmap.entrySet()) {
			if (entryset.getValue() > max) {
				max = entryset.getValue();
				result = entryset.getKey();
			}
		}
		System.out.println(result + " " + max);

	}

}
