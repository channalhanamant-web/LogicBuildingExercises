package com.LogicBuilding;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int input[] = { 1, 2, 4, 5, 6 };

		int missingNumber;
		int actualN = 6;
		int actualSum;
		actualSum = (actualN * (actualN + 1)) / 2; // actual number sum n(n+1)/2-->formula to find sum of numbers
		System.out.println(actualSum);

		int sumOfArray = 0;
		for (int i = 0; i < input.length; i++) {
			sumOfArray = sumOfArray + input[i];
		}
		System.out.println(sumOfArray);

		missingNumber = actualSum - sumOfArray;
		System.out.println("Missing Number from given Array is " + missingNumber);

	}

}
