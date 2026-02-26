package com.LogicBuilding;

import java.util.HashMap;

public class TwoSumImp {

	public static void main(String[] args) {
		int a[] = { 2, 7, 12, 6 };
		int target = 9;
		int result[] = calculateTwoSum(a, target);
		System.out.println(result[0] + "," + result[1]);

	}

	private static int[] calculateTwoSum(int[] a, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			int complement = target - a[i];
			if (map.containsKey(complement)) {
				int result[] = { map.get(complement), i };
				return result;

			}
			map.put(a[i], i);
		}
		return null;

	}

}
