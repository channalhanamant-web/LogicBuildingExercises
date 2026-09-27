package com.LogicBuildingSecond;

public class LengthOfStringWithoutLengthMethod {

	public static void main(String[] args) {
		String input = "Hello";
		int count = 0;
		for (char c : input.toCharArray()) {
			count++;
		}
		System.out.println("Length of the String is "+count);
	}

}
