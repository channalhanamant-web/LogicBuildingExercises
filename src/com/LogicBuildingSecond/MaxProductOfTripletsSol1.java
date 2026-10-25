package com.LogicBuildingSecond;

import java.util.Arrays;

public class MaxProductOfTripletsSol1 {

	public static void main(String[] args) {
		int input[] = { -10, -3, 5, 6, -20 };
		Arrays.sort(input);
		System.out.println(Arrays.toString(input));

		int result1 = input[input.length - 1] * input[input.length - 2] * input[input.length - 3];
		System.out.println(result1);

		int result2 = input[input.length - 1] * input[0] * input[1];
		System.out.println(result2);

		System.out.println("Maximum product of triplets is " + Math.max(result1, result2));

		if (result1 > result2) {
			System.out.println("Maximum product of triplets is " + result1);
		} else {
			System.out.println("Maximum product of triplets is " + result2);
		}

	}

}
