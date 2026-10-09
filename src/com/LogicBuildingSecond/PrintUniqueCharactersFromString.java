package com.LogicBuildingSecond;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharactersFromString {

	public static void main(String[] args) {
		String input = "abbacdaab";
		char inputArray[] = input.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (char c : inputArray) {
			set.add(c);
		}
		System.out.println(set.toString());
	}

}
