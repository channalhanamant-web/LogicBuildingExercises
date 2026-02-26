package com.LogicBuilding;

public class ReverseCharactersOfTheWordsInAString {

	public static void main(String[] args) {
		String inputString = "This is fun";
		String[] inputArray = inputString.split(" ");
		String result = " ";
		for (String string : inputArray) {
			char stringArray[] = string.toCharArray();

			char temp;
			int left = 0;
			int right = stringArray.length - 1;
			
			while (left < right) {
				temp = stringArray[left];
				stringArray[left] = stringArray[right];
				stringArray[right] = temp;
				left++;
				right--;

			}
			
			result = result + new String(stringArray) + " ";
			

		}
		System.out.print(result.trim());
		

	}

}
