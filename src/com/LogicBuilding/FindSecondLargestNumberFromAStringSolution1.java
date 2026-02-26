package com.LogicBuilding;

import java.util.TreeSet;

public class FindSecondLargestNumberFromAStringSolution1 {

	public static void main(String[] args) {
		String inputString = "1a4b2c0";
		char inputArray[] = inputString.toCharArray();
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		for (char c : inputArray) {
			if (Character.isDigit(c)) {
				int x = c - '0';
				treeSet.add(x);
			}
		}
		System.out.println(treeSet);

		// pollLast will remove the last element from set
		System.out.println(treeSet.pollLast());

		// .last will print the last element
		System.out.println(treeSet.last());

	}

}
