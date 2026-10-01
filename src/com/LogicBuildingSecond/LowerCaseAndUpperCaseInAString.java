package com.LogicBuildingSecond;

public class LowerCaseAndUpperCaseInAString {

	public static void main(String[] args) {

		String input = "HeLlo";
		int lowerCaseCount = 0;
		int upperCaseCount = 0;
		
		for (char c : input.toCharArray()) {
			if (Character.isUpperCase(c)) {
				upperCaseCount++;
			} else if (Character.isLowerCase(c)) {
				lowerCaseCount++;
			}
		}
		System.out.println("lowerCaseCount "+lowerCaseCount);
		System.out.println("upperCaseCount "+upperCaseCount);

	}

}
