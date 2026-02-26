package com.LogicBuilding;

import java.util.LinkedHashSet;

public class PrintUniqueCharactersFromString {

	public static void main(String[] args) {
		String input = "dabbacdaab";

		char inputArray[] = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (char character : inputArray) {
			if (set.add(character)) {
				sb.append(character);
			}
		}
		System.out.println(sb);

	}

}
