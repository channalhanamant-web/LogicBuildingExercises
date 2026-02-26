package com.LogicBuilding;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int input1[] = { 1, 2, 4 };
		int input2[] = { 3, 5 };
		int indexOfInput1 = 0;
		int indexOfInput2 = 0;
		int indexOfResult = 0;
		int result[] = new int[input1.length + input2.length];

		while (indexOfInput1 < input1.length && indexOfInput2 < input2.length) {
			if (input1[indexOfInput1] < input2[indexOfInput2]) {
				result[indexOfResult] = input1[indexOfInput1];
				indexOfInput1++;
				indexOfResult++;

			} else {
				result[indexOfResult] = input2[indexOfInput2];
				indexOfInput2++;
				indexOfResult++;

			}
		}
		while (indexOfInput1 < input1.length) {
			result[indexOfResult] = input1[indexOfInput1];
			indexOfInput1++;
			indexOfResult++;

		}
		while (indexOfInput2 < input2.length) {
			result[indexOfResult] = input2[indexOfInput2];
			indexOfInput2++;
			indexOfResult++;
		}

		System.out.println(Arrays.toString(result));

	}

}
