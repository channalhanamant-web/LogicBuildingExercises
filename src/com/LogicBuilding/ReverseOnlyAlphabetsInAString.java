package com.LogicBuilding;

public class ReverseOnlyAlphabetsInAString {

	public static void main(String[] args) {
		String inputString = "1ab2";
		char inputArray[] = inputString.toCharArray();
		int leftIndex = 0;
		int rightIndex = inputArray.length - 1;

		while (leftIndex < rightIndex) {
			if (!Character.isLetter(inputArray[leftIndex])) {
				leftIndex++;
			} else if (!Character.isLetter(inputArray[rightIndex])) {
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
