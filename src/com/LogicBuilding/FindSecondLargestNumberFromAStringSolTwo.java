package com.LogicBuilding;

public class FindSecondLargestNumberFromAStringSolTwo {

	public static void main(String[] args) {
		String input = "a4bc321";
		int firstNumber = Integer.MIN_VALUE;
		int secondNumber = Integer.MIN_VALUE;
		char inputArray[] = input.toCharArray();
		for (char x : inputArray) {
			if (Character.isDigit(x)) {
				// imp we need to convert char type into int type
				//ASCII value of Zero char is 48 so we need to sunstarct 48 i'e 'O'
				int c = x - '0';
				if (c > firstNumber) {
					secondNumber = firstNumber;
					firstNumber = c;

				} else if ((c > secondNumber && c < firstNumber)) {

					secondNumber = c;
				}
			}

			
		}
		System.out.println(secondNumber);

	}

}
