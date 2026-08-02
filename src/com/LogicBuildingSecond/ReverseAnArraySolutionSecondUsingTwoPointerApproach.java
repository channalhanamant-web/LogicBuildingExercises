package com.LogicBuildingSecond;

import java.util.Arrays;

public class ReverseAnArraySolutionSecondUsingTwoPointerApproach {

	public static void main(String[] args) {
		int input[] = { 10, 20, 30, 40, 50 };

		int left = 0;
		int right = input.length - 1;
		int temp;
		for (int i = 0; i <= input.length - 1; i++) {
			while (right > left) {
				temp = input[right];
				input[right] = input[left];
				input[left] = temp;

				left++;
				right--;
			}
		}
		System.out.println(Arrays.toString(input));
	}

}
