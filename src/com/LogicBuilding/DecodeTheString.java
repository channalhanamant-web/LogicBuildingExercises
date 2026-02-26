package com.LogicBuilding;

public class DecodeTheString {

	public static void main(String[] args) {
		String input = "d3m4t2b0a1";
		char inputArray[] = input.toCharArray();
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < inputArray.length; i = i + 2) {
			char letter = input.charAt(i);
			int count = Character.getNumericValue(input.charAt(i + 1));
			for (int j = 0; j < count; j++) {
				sBuilder.append(letter);
			}
		}
		System.out.println(sBuilder);

	}

}
