package com.LogicBuilding;

public class CountVowelsInString {

	public static void main(String[] args) {
		String input = "Hello World";

		int count = 0;
		String vowels = "aeiouAEIOU";
		for (int i = 0; i < input.length() - 1; i++) // traversing of String
		{
			if (vowels.indexOf(input.charAt(i)) != -1) {
				count++;
			}

		}
		System.out.println(count);
	}

}
