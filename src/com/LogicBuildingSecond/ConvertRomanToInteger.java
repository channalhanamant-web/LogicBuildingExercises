package com.LogicBuildingSecond;

import java.util.HashMap;

public class ConvertRomanToInteger {

	public static void main(String[] args) {
		String input = "VII";

		HashMap<Character, Integer> romanMapValue = new HashMap<Character, Integer>();
		romanMapValue.put('V', 5);
		romanMapValue.put('I', 1);
		romanMapValue.put('X', 10);
		romanMapValue.put('L', 50);

		int currentValue;
		int previousValue = 0;
		int result = 0;
		for (int i = input.length() - 1; i >= 0; i--) {
			char currentChar = input.charAt(i);
			currentValue = romanMapValue.get(currentChar);
			if (currentValue >= previousValue) {
				result = result + currentValue;

			} else {
				result = result - currentValue;

			}
			previousValue = currentValue;

		}
		System.out.println(result);

	}

}
