package com.LogicBuildingSecond;

import java.util.Arrays;

public class ReverseOnlyVowelsInAString {

	public static void main(String[] args) {
		String inputString = "Hello";

		String vowelString = "aeiouAEIOU";

		char inputArray[] = inputString.toCharArray();
		int left = 0;
		int right = inputArray.length - 1;

		while (left < right) {
			if (vowelString.indexOf(inputArray[left]) == -1) {
				left++;
			} else if (vowelString.indexOf(inputArray[right]) == -1) {
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
		System.out.println(Arrays.toString(inputArray));

	}

}
