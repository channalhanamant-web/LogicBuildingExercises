package com.LogicBuilding;

import java.util.Arrays;

public class CheckIfTwoStringsAreAnagram {

	public static void main(String[] args) {
		String s1 = "dba";
		String s2 = "abd";
		
		//anagram means both string must have same characters like silent and listen

		if (s1.length() == s2.length()) {

			char s1Array[] = s1.toCharArray(); // converted both strings into char array
			char s2Array[] = s2.toCharArray();

			Arrays.sort(s1Array); // sorted both arrays using Arrays inbuilt class
			Arrays.sort(s2Array);

			if (Arrays.equals(s1Array, s2Array)) { // compared alphabetically sorted arrays using Arrays.equals
				System.out.println("Anagram");

			} else {
				System.out.println("Not a Anagram");

			}

		} else {
			System.out.println("Not a Anagram");

		}

	}

}
