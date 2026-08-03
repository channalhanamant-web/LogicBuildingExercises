package com.LogicBuildingSecond;

import java.util.HashMap;
import java.util.Map;

public class TwoSumOfIntegersInArray {

	public static void main(String[] args) {
		int a[] = { 2, 11, 7, 5 };
		int target = 9;

		int result[] = calculateTwoSum(a, target);
		System.out.println(result[0] + ", " + result[1]);

	}

	private static int[] calculateTwoSum(int[] a, int target) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

		for (int i = 0; i <= a.length; i++) {
			int compliment = target - a[i];

			if (hashMap.containsKey(compliment)) {
				int result[] = { hashMap.get(compliment), i };
				return result;
			}
			hashMap.put(a[i], i);

		}
		return null;

	}

}
