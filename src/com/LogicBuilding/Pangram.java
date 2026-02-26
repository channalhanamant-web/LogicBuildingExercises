package com.LogicBuilding;

public class Pangram {
//check whether 
	public static void main(String[] args) {
		String input = "The quick brown fox jumps over the lazy dog";
		// convert to lower case
		input = input.toLowerCase();
		boolean result = checkPangram(input);
		if (result) {
			System.out.println("It's a Pangram");
		} else {
			System.out.println("Not a Pangram");
		}

	}

	private static boolean checkPangram(String input) {
		if (input.length() < 26) {
			return false;
		}
		for (char i = 'a'; i <= 'z'; i++) {
			if (input.indexOf(i) < 0) {
				return false;
			}

		}
		return true;

	}

}
