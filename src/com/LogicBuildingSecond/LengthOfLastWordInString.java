package com.LogicBuildingSecond;

public class LengthOfLastWordInString {

	public static void main(String[] args) {
		String string = " Hello world Moon  ";
		//string = string.trim();
		char input[] = string.toCharArray();
		int count = 0;

		for (int i = input.length - 1; i > 0; i--) {
			if (input[i] != ' ') {
				count++;
			} else {
				if (count > 0) {
					System.out.println(count);
					break;
				}

			}

		}

	}

}
