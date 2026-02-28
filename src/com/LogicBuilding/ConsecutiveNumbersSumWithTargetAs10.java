package com.LogicBuilding;

public class ConsecutiveNumbersSumWithTargetAs10 {

	public static void main(String[] args) {
		// o/p 51414582
		int array[] = { 7, 5, 1, 4, 5, 8, 2 };
		int target = 10;

		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			for (int j = i; j < array.length; j++) {
				sum = sum + array[j];
				if (sum == target) {
					for (int k = i; k <= j; k++) {
						System.out.print(array[k]);
					}

				}
				if (sum > target) {
					break;
				}
			}
		}

	}

}
