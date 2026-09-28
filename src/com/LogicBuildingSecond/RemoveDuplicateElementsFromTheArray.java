package com.LogicBuildingSecond;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromTheArray {

	public static void main(String[] args) {
		int a[] = { 10, 10, 20, 30, 40 };
		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int value : a) {
			set.add(value);
		}
		System.out.println(set);
	}

}
