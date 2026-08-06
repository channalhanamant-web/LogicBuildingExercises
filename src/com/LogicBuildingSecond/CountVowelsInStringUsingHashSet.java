package com.LogicBuildingSecond;

import java.util.HashSet;
import java.util.Set;

public class CountVowelsInStringUsingHashSet {

	public static void main(String[] args) {
		String input = "Hello World";
		int count = 0;
		Set<Character> vowelSet = new HashSet<Character>();
		String vowelString = "aeiouAEIOU";
		for (int i = 0; i < vowelString.length(); i++) {
			vowelSet.add(vowelString.charAt(i));
		}
		for (int i = 0; i < input.length(); i++) {
			if (vowelSet.contains(input.charAt(i))) {
				count++;
			}
		}

		System.out.println(count);

	}

}
