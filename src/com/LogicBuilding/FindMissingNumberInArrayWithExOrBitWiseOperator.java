package com.LogicBuilding;

public class FindMissingNumberInArrayWithExOrBitWiseOperator {

	public static void main(String[] args) {
		int numbers[] = { 1, 2, 4, 5, 6 };
		int missingNumber = 0;

		for (int no : numbers) {
			missingNumber = missingNumber ^ no; // do ex or bitwise with each consecutive no from given array
		}

		for (int i = 0; i <= 6; i++) {
			missingNumber = missingNumber ^ i; // do ex or bitwise with each consecutive Actual number from above
												// missing number o/p
		}
		System.out.println(missingNumber);
	}

}
