package com.LogicBuilding;

public class RemoveAllWhiteSpacesFromTheString {

	public static void main(String[] args) {
		String input = ("   Hello     world    ");
		input = input.trim();

		// Regex for single space "\\s" and for more than one space "\\s+"
		input = input.replaceAll("\\s+", " ");

		System.out.println(input);

	}

}
