package com.LogicBuildingSecond;

public class PrintEvenWordsFromAString {

	public static void main(String[] args) {
		String input = "Sky is blue and vast";
		String inputArray[] = input.split(" ");

		for (String string : inputArray) {
			if (string.length() % 2 == 0) {
				System.out.println(string);
			}
		}

	}

}
