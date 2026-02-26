package com.LogicBuilding;

public class ReverseCharactersOfTheWordsUsingStringBuilder {

	public static void main(String[] args) {
		String inputString = "This is fun";
		String inputArray[] = inputString.split(" ");
		StringBuilder sBuilder = new StringBuilder();

		for (String string : inputArray) {
			StringBuilder sReverse = new StringBuilder(string);
			sBuilder.append(sReverse.reverse()).append(" ");
		}
		System.out.println(sBuilder.toString().trim());
	}
}
