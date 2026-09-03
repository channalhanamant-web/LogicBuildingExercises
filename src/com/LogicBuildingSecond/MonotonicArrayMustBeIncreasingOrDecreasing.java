package com.LogicBuildingSecond;

public class MonotonicArrayMustBeIncreasingOrDecreasing {

	public static void main(String[] args) {
		int a[] = { 4, 3, 2, 2, 1 };

		int previous = a[0];
		boolean increasing = true;
		boolean decreasing = true;
		for (int current = 1; current <= a.length - 1; current++) {
			if (previous < a[current]) {
				decreasing = false;
				previous = a[current];
			} else if (previous > a[current]) {
				increasing = false;
				previous = a[current];
			}

		}
		System.out.println(increasing || decreasing);

	}

}
