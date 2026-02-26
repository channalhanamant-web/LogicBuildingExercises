package com.LogicBuilding;

import java.util.Arrays;

public class ReverseFirstWordOfString {

	public static void main(String[] args) {
		String inputString = "Hello world from Java";

		if (inputString == null || inputString.isEmpty()) {
			System.out.println("Cannot reverse the String");
		} else {
			String inputArray[] = inputString.split(" ", 2);
			char stringArray[] = inputArray[0].toCharArray();
			int left = 0;
			int right = stringArray.length - 1;
			char temp;
			while (left < right) {
				temp = stringArray[left];
				stringArray[left] = stringArray[right];
				stringArray[right] = temp;
				left++;
				right--;

			}
			System.out.println(Arrays.toString(stringArray));
			String reversedFirstWord= new String(stringArray);
			System.out.println(reversedFirstWord+" "+ inputArray[1]);
			

		}

	}

}
