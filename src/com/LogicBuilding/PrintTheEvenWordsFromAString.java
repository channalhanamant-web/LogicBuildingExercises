package com.LogicBuilding;

public class PrintTheEvenWordsFromAString {

	public static void main(String[] args) {
		String input = "Sky is blue and vast";
		String data[] = input.split(" ");// split on the basis of white spaces

		/*
		 * for (int i = 0; i <= data.length - 1; i++) { if (data[i].length() % 2 == 0) {
		 * System.out.println(data[i]); } }
		 */

		for (String word : data) {
			if (word.length() % 2 == 0) {
				System.out.println(word);
			}

		}

	}

}
