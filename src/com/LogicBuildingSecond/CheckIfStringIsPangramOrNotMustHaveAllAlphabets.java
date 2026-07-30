package com.LogicBuildingSecond;

public class CheckIfStringIsPangramOrNotMustHaveAllAlphabets {

	public static void main(String[] args) {
		String input = "The quick brown fox jumps over the lazy dog";
		// String input = "jaav";
		input = input.toLowerCase();

		boolean result = checkPangram(input);
		if (result) {
			System.out.println("It's a Pangram");
		} else {
			System.out.println("It's Not a Pangram");

		}

	}

	private static boolean checkPangram(String input) {
		if (input.length() < 26) {
			return false;
		}
		for (char i = 'a'; i < 'z'; i++) {
			if (input.indexOf(i) == -1) {
				return false;

			}
		}

		return true;

	}

}
