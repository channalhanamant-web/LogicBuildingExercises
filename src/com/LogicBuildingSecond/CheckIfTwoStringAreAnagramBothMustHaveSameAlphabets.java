package com.LogicBuildingSecond;

import java.util.Arrays;

public class CheckIfTwoStringAreAnagramBothMustHaveSameAlphabets {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";

		if (s1.length() == s2.length()) {
			char s1Array1[] = s1.toCharArray();
			char s2Array2[] = s2.toCharArray();
			Arrays.sort(s1Array1);
			Arrays.sort(s2Array2);

			if (Arrays.equals(s1Array1, s2Array2)) {
				System.out.println("Strings are Anagram");
			} else {
				System.out.println("Strings are not Anagram");
			}

		} else {

			System.out.println("Strings are not Anagram");
		}
	}

}
