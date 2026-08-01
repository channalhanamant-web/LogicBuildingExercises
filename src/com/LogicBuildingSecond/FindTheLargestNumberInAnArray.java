package com.LogicBuildingSecond;

public class FindTheLargestNumberInAnArray {

	public static void main(String[] args) {
		int input[] = { 10, 20, 30, 80, 60, 70 };

		int largestNumber = input[0];
		for (int i = 1; i <= input.length - 1; i++) {
			if (input[i] > largestNumber) {
				largestNumber = input[i];
			}
		}
		System.out.println(largestNumber);

	}

}
