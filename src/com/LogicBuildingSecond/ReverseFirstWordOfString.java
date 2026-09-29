package com.LogicBuildingSecond;

public class ReverseFirstWordOfString {

	public static void main(String[] args) {
		String input = "Hello world from Java";
		StringBuilder sb = new StringBuilder();
		String inputArray[] = input.split(" ");
		for (String word : inputArray) {
			if (inputArray[0].equals(word)) {
				StringBuilder reverse = new StringBuilder(word);
				sb.append(reverse.reverse() + " ");

			} else {
				sb.append(word + " ");
			}

		}
		System.out.println(sb);

	}

}
