package com.LogicBuildingSecond;

import java.util.Arrays;

public class TotalSumAndFirstAndSecondLargestNumberAndReverseTheFirstHalfOfTheArray {

	public static void main(String[] args) {
		int inputArray[] = { 4, 5, 10, 3, 7 };

		int sum = 0;
		int firstLargestNum = Integer.MIN_VALUE;
		int secondLargestNum = Integer.MIN_VALUE;
		int left = 0;
		int right = inputArray.length / 2;

		for (int num : inputArray) {
			sum = sum + num;
			if (num > firstLargestNum) {
				secondLargestNum = firstLargestNum;
				firstLargestNum = num;
			} else if (num > secondLargestNum && num < firstLargestNum) {
				secondLargestNum = num;
			}

		}
		while (left < right) {
			int temp;
			temp = inputArray[left];
			inputArray[left] = inputArray[right];
			inputArray[right] = temp;
			left++;
			right--;
		}
		System.out.println("Sum of elements is " + sum);
		System.out.println("First Largest Number is " + firstLargestNum);
		System.out.println("Second Largest Number is " + secondLargestNum);
		System.out.println("Reverse The First Half Of The Array " + Arrays.toString(inputArray));

	}

}
