package com.LogicBuilding;

import java.util.HashMap;

public class ConvertTheRomanValueToNumber {

	public static void main(String[] args) {
		String input = "IX";
		HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		int result = 0;
		int currentValue = 0;
		int previousValue = 0;

		for (int i = input.length() - 1; i >= 0; i--) {
			char currentChar = input.charAt(i);

			currentValue = romanMap.get(currentChar);

			if (currentValue >= previousValue) {
				result = result + currentValue;

			} else {

				result = result - currentValue;
				previousValue = currentValue;
			}
			previousValue = currentValue;

		}
		System.out.println(result);

	}

}
