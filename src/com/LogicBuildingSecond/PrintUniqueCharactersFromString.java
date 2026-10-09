package com.LogicBuildingSecond;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueCharactersFromString {

	public static void main(String[] args) {
		String input = "abbacdaab";
		char inputArray[] = input.toCharArray();
		Set<Character> set = new TreeSet<Character>();
		for (char c : inputArray) {
			set.add(c);
		}
		System.out.println(set.toString());
	}

}
