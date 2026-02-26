package com.LogicBuilding;

public class PrintTheLengthOfTheLastWord {

	public static void main(String[] args) {

		String s = "      Hello World     moon        ";
		// s=s.trim();
		System.out.println(s);
		int count = 0;
		char inputArray[] = s.toCharArray();// converting string into two character array
		for (int i = inputArray.length - 1; i >= 0; i--) {

			if (inputArray[i] != ' ') {
				count++;
				// System.out.println(inputArray[i]);
			} else {
				if (count > 0) {
					System.out.println(count);
					break;
				}

			}

		}
	}

}
