package com.LogicBuilding;

import java.util.HashSet;

public class FindTheUniqueElementsInsideTheArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 1, 2 };

		HashSet<Integer> seenSet = new HashSet<Integer>();
		HashSet<Integer> duplicateSet = new HashSet<Integer>();
		for (int number : a) {
			if (!seenSet.add(number)) {
				duplicateSet.add(number);
			}
		}
		// .removeAll method will remove the elements from seenset which are in
		// duplicate set
		seenSet.removeAll(duplicateSet);
		System.out.println(seenSet);

	}

}
