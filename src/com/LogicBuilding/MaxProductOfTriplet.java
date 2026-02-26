package com.LogicBuilding;

import java.util.Arrays;

public class MaxProductOfTriplet {

	public static void main(String[] args) {
		int a[] = { -10, -3, 5, 6, -20 };
		if (a.length < 3) {
			System.out.println("Minimum number of elements that should be there in the array should be 3");
		} else {

			Arrays.sort(a);
			System.out.println(Arrays.toString(a));
			// [-20, -10, -3, 5, 6]
			int result1 = a[a.length - 1] * a[a.length - 2] * a[a.length - 3];
			int result2 = a[a.length - 1] * a[0] * a[1];
			int result = Math.max(result1, result2);
//			if (result1>result2) {
//				System.out.println(result1);
//			} else {
//				System.out.println(result2);
			//
//			}
			System.out.println(result);
		}

	}

}
