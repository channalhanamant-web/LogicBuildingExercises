package com.LogicBuildingSecond;

public class FindMissingNumberInArrayUsingExOrBitwiseOperator {

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5, 6 };
		int missingNumber = 0;

		for (int i : a) {
			missingNumber = missingNumber ^ i;
		}
		System.out.println(missingNumber);

		for (int i = 1; i <= 6; i++) {
			missingNumber = missingNumber ^ i;
		}

		System.out.println("Missing number is " + missingNumber);

	}

}
