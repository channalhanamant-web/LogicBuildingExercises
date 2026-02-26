package com.LogicBuilding;

public class ReplaceAllVowelsInTheNameWithTheCharacterX {

	public static void main(String[] args) {
		String input = "Name";
		String inputL = input.toLowerCase();
		StringBuilder sb = new StringBuilder();
		char inputArray[] = inputL.toCharArray();
		for (char c : inputArray) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				sb.append('x');
			} else {
				sb.append(c);
			}
		}
		System.out.println(sb);

	}

}
