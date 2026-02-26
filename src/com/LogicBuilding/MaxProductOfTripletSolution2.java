package com.LogicBuilding;

public class MaxProductOfTripletSolution2 {

	public static void main(String[] args) {
		int a[] = { 7, 3, 2, 5, -10, -20 };
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;

		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;

		for (int i : a) {
			if (i > max1) {
				max3 = max2;
				max2 = max1;
				max1 = i;
			} else if (i > max2) {
				max3 = max2;
				max2 = i;
			} else if (i > max3) {
				max3 = i;
			}
			if (i < min1) {
				min2 = min1;
				min1 = i;

			} else if (i < min2) {
				min2 = i;
			}
		}
		int result1 = max1 * max2 * max3;
		int result2 = max1 * min1 * min2;
		int result = Math.max(result1, result2);
		System.out.println(result);
	}

}
