package com.LogicBuildingSecond;

import java.util.HashSet;

public class CheckIfStringIsPangramOrNotMustHaveAllAlphabetsSolution2 {

	public static void main(String[] args) {
		String input = "The quick brown fox jumps over the lazy dog";

		boolean result = checkPangram(input);
		if (result) {
			System.out.println("String is Pangram");
		} else {
			System.out.println("String is not Pangram");
		}

	}

	private static boolean checkPangram(String input) {

		HashSet<Character> hashSet = new HashSet<Character>();
		char inputArray[] = input.toLowerCase().toCharArray();
		for (char c : inputArray) {
			if (Character.isLetter(c))
				hashSet.add(c);
		}
		System.out.println(hashSet);
		if (hashSet.size() < 26) {
			return false;
		} else {
			return true;
		}

	}

}
