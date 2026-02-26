package com.LogicBuilding;

public class FindTheSecondLargestNumberInAnArrayIMP {

	public static void main(String[] args) {
		int a[] = { 1, 3, 2, 7, 5 };
		int largestNum = Integer.MIN_VALUE;
		int secondLargestNum = Integer.MIN_VALUE;

		for (int i : a) {
			if (i > largestNum) {
				secondLargestNum = largestNum;
				largestNum = i;

			} else if (i > secondLargestNum && i != largestNum) {
				secondLargestNum = i;

			}

		}
		System.out.println("largest number in given array is " + largestNum);
		System.out.println("Second largest number in given array is " + secondLargestNum);

	}

}
