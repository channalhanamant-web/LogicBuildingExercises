package com.LogicBuildingSecond;

public class ReverseCharInWordsFromSentence {

	public static void main(String[] args) {
		String input = "Java is fun";
		String inputArray[] = input.split(" ");
		// StringBuilder sb=new StringBuilder();
		String result = "";

		for (String word : inputArray) {
			int left = 0;
			int right = word.length() - 1;
			char wordArray[] = word.toCharArray();
			while (left < right) {
				char temp;
				temp = wordArray[left];
				wordArray[left] = wordArray[right];
				wordArray[right] = temp;
				left++;
				right--;

			}
			result = result + new String(wordArray) + " ";

		}
		System.out.println(result);
	}

}
