package com.LogicBuildingSecond;

public class ReverseCharInWordsFromSentenceUsingStringBuilder {

	public static void main(String[] args) {
		String input = "Java is fun";
		String inputArray[] = input.split(" ");
		StringBuilder result = new StringBuilder();

		for (String word : inputArray) {
			StringBuilder reverseWord = new StringBuilder(word);
			result.append(reverseWord.reverse() + " ");

		}
		System.out.println(result.toString().trim());
	}

}
