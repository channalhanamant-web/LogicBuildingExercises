package com.LogicBuildingSecond;

public class NumberOfCharactersInStringWithoutSpaceBeforeAndAfter {

	public static void main(String[] args) {
		String input = " Hide ";
		int count = 0;
		char inputArray[] = input.toCharArray();
		for (int index = 0; index < inputArray.length; index++) {
			
			if (inputArray[index] == ' ') {
				continue;
			}
			
			boolean whiteSpaceAfterCharacter = index < inputArray.length - 1
					&& inputArray[index + 1] == ' ';
			boolean whiteSpaceBeforeCharacter = index > 0 && inputArray[index - 1] == ' ';
			if (!whiteSpaceBeforeCharacter && !whiteSpaceAfterCharacter) {
				count++;
			}

		}
		System.out.println(count);

	}

}
