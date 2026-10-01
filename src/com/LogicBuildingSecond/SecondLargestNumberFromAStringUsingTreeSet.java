package com.LogicBuildingSecond;

import java.util.TreeSet;

public class SecondLargestNumberFromAStringUsingTreeSet {

	public static void main(String[] args) {
		String input = "abc321d4er";

		TreeSet<Integer> set = new TreeSet<Integer>();

		for (char c : input.toCharArray()) {
			if (Character.isDigit(c)) {
				int x = c - '0'; // convert char c to int value x
				set.add(x);
			}
		}
		System.out.println(set);
		System.out.println(set.pollLast()); // will retrieve and remove last element
		System.out.println(set.last()); // will retrieve last element

	}

}
