package com.LogicBuilding;

import java.util.Arrays;

public class ReverseTheFirstHalfOfTheArray {

	public static void main(String[] args) {
		int input[] = { 4, 5, 10, 3, 7 };
		int left = 0;
		int right = input.length / 2 - 1;

		while (left < right) {
			int temp = input[left];
			input[left] = input[right];
			input[right] = temp;
			left++;
			right--;
		}

		System.out.println(Arrays.toString(input));

	}

}
