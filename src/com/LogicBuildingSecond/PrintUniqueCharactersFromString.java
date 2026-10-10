package com.LogicBuildingSecond;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharactersFromString {

	public static void main(String[] args) {
		String input = "abbacdaab";
		char inputArray[] = input.toCharArray();
		Set<Character> set = new LinkedHashSet<Character>();
		StringBuilder sb = new StringBuilder();
		for (char c : inputArray) {
			if (set.add(c))

				sb.append(c);
		}
		System.out.println(sb.toString());
	}

}
