package com.LogicBuildingSecond;

import java.util.Arrays;

public class ReverseAnArraySolutionFirst {

	public static void main(String[] args) {
		int input[] = { 10, 20, 30, 40 };
		int reverseArray[] = new int[input.length];
		int j = 0;
		for (int i = input.length - 1; i >= 0; i--) {
			reverseArray[j] = input[i];
			j++;
		}
		System.out.println(Arrays.toString(reverseArray));

	}

}
