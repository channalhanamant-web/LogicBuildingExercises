package com.LogicBuilding;

public class ReverseTheCaseInAString {

	public static void main(String[] args) {
		String inputString = "Hello World";
		char inputArray[] = inputString.toCharArray();
		char reverseCase;
		StringBuilder sb = new StringBuilder();
		for (char c : inputArray) {

			if (Character.isUpperCase(c)) {
				reverseCase = Character.toLowerCase(c);
				sb.append(reverseCase);
			} else if (Character.isLowerCase(c)) {
				reverseCase = Character.toUpperCase(c);
				sb.append(reverseCase);
			} else {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}
