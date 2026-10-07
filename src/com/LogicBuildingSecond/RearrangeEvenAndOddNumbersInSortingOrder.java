package com.LogicBuildingSecond;

import java.util.Arrays;

public class RearrangeEvenAndOddNumbersInSortingOrder {

	public static void main(String[] args) {
		int input[] = { 3, 0, 2, 0, 4, 1, 5 };

		int left = 0;
		int right = input.length - 1;
		while (left < right) {
			while (left < right && input[left] % 2 == 0) {
				left++;
			}
			while (left < right && input[right] % 2 != 0) {
				right--;
			}
			if (left < right) {
				int temp;
				temp = input[left];
				input[left] = input[right];
				input[right] = temp;
				left++;
				right--;

			}
		}
		Arrays.sort(input, 0, 4);
		Arrays.sort(input, 4, 7);
		System.out.println(Arrays.toString(input));

	}

}
