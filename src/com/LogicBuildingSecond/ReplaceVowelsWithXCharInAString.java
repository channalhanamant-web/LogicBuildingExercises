package com.LogicBuildingSecond;

public class ReplaceVowelsWithXCharInAString {

	public static void main(String[] args) {
		String input = "Name";
		StringBuilder resultStringBuilder = new StringBuilder();
		for (char currentChar : input.toLowerCase().toCharArray()) {
			if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o'
					|| currentChar == 'u') {
				resultStringBuilder.append('x');
			} else {
				resultStringBuilder.append(currentChar);
			}
		}
		System.out.println(resultStringBuilder.toString());
	}

}
