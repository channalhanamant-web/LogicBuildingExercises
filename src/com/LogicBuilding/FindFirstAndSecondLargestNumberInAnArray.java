package com.LogicBuilding;

public class FindFirstAndSecondLargestNumberInAnArray {

	public static void main(String[] args) {
		int input[] = { 4, 5, 10, 3, 7, 22, 10, 22 };
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int i : input) {
			if (i > first) {
				second = first;
				first = i;
			} else if (i > second && i != first) {

				second = i;

			}
		}
		System.out.println("First largest number in the array is " + first);
		System.out.println("Second largest number in the array is " + second);

	}

}
