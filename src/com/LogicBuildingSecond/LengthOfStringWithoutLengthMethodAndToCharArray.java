package com.LogicBuildingSecond;

public class LengthOfStringWithoutLengthMethodAndToCharArray {

	public static void main(String[] args) {
		String input = "Hello";
		int count = 0;

		while (true) {
			try {
				input.charAt(count);
				count++;
			} catch (IndexOutOfBoundsException e) {
				System.out.println(count);
				break;
			}
		}

	}

}
