package com.LogicBuildingSecond;

public class ReverseOnlyLettersInAString {

	public static void main(String[] args) {
		String inputString = "1ab2";

		char inputArray[] = inputString.toCharArray();
		int left = 0;
		int right = inputArray.length - 1;

		while (left < right) {
			if (!Character.isAlphabetic(inputArray[left])) {
				left++;
			} else if (!Character.isAlphabetic(inputArray[right])) {
				right--;
			} else {
				char temp;
				temp = inputArray[left];
				inputArray[left] = inputArray[right];
				inputArray[right] = temp;
				left++;
				right--;
			}

		}
		System.out.println("Result String " + new String(inputArray));

	}

}
