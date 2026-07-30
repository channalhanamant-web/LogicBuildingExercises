package com.LogicBuildingSecond;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLettersFromString {

	public static void main(String[] args) {

		String input = "Java";

		char inputArray[] = input.toCharArray();
		Set<Character> dCharacters = new LinkedHashSet<Character>();
		StringBuilder sB = new StringBuilder();
		for (char character : inputArray) {

			if (dCharacters.add(character)) {
				sB.append(character);
			}

		}
		System.out.println(sB);
	}
}
