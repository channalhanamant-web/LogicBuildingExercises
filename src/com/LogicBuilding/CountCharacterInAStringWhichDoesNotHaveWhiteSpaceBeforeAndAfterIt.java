package com.LogicBuilding;

public class CountCharacterInAStringWhichDoesNotHaveWhiteSpaceBeforeAndAfterIt {

	public static void main(String[] args) {
		String input = " Hie etbr ";
		char inputArray[] = input.toCharArray();
		int count = 0;
		for (int i = 0; i < inputArray.length; i++) {
			//char data = inputArray[i];
			if (inputArray[i] == ' ') {

				continue;

			}
			boolean whiteSpaceAfterChar = i < inputArray.length - 1 && inputArray[i + 1] == ' ';
			boolean whiteSpaceBeforeChar = i > 0 && inputArray[i - 1] == ' ';

			if (!whiteSpaceAfterChar && !whiteSpaceBeforeChar) {
				count++;
			}
		}
		System.out.println(count);

	}

}
