package com.LogicBuilding;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLettersFromAString {

	public static void main(String[] args) {
		String input = "Java";
		char[] inputArray = input.toCharArray(); // convert the string into array of string
		Set<Character> l = new LinkedHashSet<Character>(); // use linked hash set to store unique values in original
															// order
		StringBuilder sb = new StringBuilder();
		for (char temp : inputArray) {

			if (l.add(temp)) { // if set able to add char from temp then append that char to the string builder
				sb.append(temp);
			}

		}
		System.out.println(sb.toString());

	}

}
