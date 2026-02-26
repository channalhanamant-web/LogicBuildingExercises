package com.LogicBuilding;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateValuesFromArrays {

	public static void main(String[] args) {
		int input[] = { 10, 10, 30, 20, 40, 30, 50 };
		// linkedhashset stores unique values and order of elements will be maintained
		// where as hashset order will not be there and tree set stores in asending
		// order
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		for (Integer integer : input) {
			set.add(integer);
		}
		System.out.println(set);

		// convert the set into string using streams!!

		int resultArray[] = set.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(resultArray));

	}

}
