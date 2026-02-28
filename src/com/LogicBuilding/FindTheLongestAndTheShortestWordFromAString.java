package com.LogicBuilding;

public class FindTheLongestAndTheShortestWordFromAString {

	public static void main(String[] args) {
		String input = ("I love cricket and football");
		String inputArray[] = input.split(" ");

		String shortest = inputArray[0];
		String longest = inputArray[0];

		for (String word : inputArray) {
			if (word.length() > longest.length()) {
				longest = word;
			} else if (word.length() < shortest.length()) {
				shortest = word;
			}

		}
		System.out.println(shortest);
		System.out.println(longest);
	}

}
