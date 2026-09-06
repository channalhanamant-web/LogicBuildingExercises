package com.LogicBuildingSecond;

public class ChangingKeyCountInAString {

	public static void main(String[] args) {
		String inputString="abBcaad";
		char inputArray[]=inputString.toLowerCase().toCharArray();
		int count=0;
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i-1]!=inputArray[i]) {
				count++;
			}
		}
		System.out.println(count+" times key changeD");

	}

}
