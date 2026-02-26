package com.LogicBuilding;

public class ReverseOnlyVowelsInAString {

	public static void main(String[] args) {
		String input = "Hello";
		char inputArray[] = input.toCharArray();
		String vowels = "aeiouAEIOU";
		int leftIndex = 0;
		int rightIndex = inputArray.length - 1;
		while ((leftIndex < rightIndex)) {
			if (vowels.indexOf(inputArray[leftIndex]) == -1) {
				leftIndex++;

			} else if (vowels.indexOf(inputArray[rightIndex]) == -1) {
				rightIndex--;
			} else {
				char temp;
				temp = inputArray[rightIndex];
				inputArray[rightIndex] = inputArray[leftIndex];
				inputArray[leftIndex] = temp;
				leftIndex++;
				rightIndex--;
			}

		}
		System.out.println(new String(inputArray));

	}

}
