package com.LogicBuildingSecond;

public class ReverseCaseInAString {

	public static void main(String[] args) {
		String input = "Hello WorlD";
		StringBuilder sb = new StringBuilder();
		for (int index = 0; index < input.length(); index++) {
			char c = input.charAt(index);
			if (Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
			} else if (Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(c);
			}
		}

		System.out.println(sb.toString());

	}

}
