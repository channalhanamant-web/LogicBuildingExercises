package com.LogicBuildingSecond;

public class MaxProductOfTripletsSol2 {

	public static void main(String[] args) {
		int input[] = { 7, 5, 3, 2, -10, -15 ,-5};

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;

		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;

		for (int i : input) {

			if (i > max1) {
				max3 = max2;
				max2 = max1;
				max1 = i;

			} else if (i < max1 && i > max2 && i > max3) {
				max3 = max2;
				max2 = i;
			} else if (i < max1 && i < max2 && i > max3) {
				max3 = i;
			}
			if (i < min1) {
				min2 = min1;
				min1 = i;
			} else if (i < min2) {
				min2 = i;
			}
		}
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(max3);
		System.out.println(min1);
		System.out.println(min2);
	int result1=max1 * max2 * max3;
	int result2=max1 * min1 * min2;
	System.out.println("Maximum product of triplets is " + Math.max(result1, result2));

	}

}
