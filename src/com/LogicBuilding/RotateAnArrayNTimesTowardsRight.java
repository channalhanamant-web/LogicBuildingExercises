package com.LogicBuilding;

import java.util.Arrays;

public class RotateAnArrayNTimesTowardsRight {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

		// imp
		// o/p == 5,6,7,1,2,3,4
		// first reverse entire array, then first n number of char need to reverse then
		// last remaining char need to reverse
		int n = k % a.length;
		int left = 0;
		int right = a.length - 1;

		reverse(a, left, right);
		System.out.println(Arrays.toString(a));
		reverse(a, 0, n - 1);
		System.out.println(Arrays.toString(a));
		reverse(a, n, a.length - 1);
		System.out.println(Arrays.toString(a));

	}

	private static int[] reverse(int a[], int left, int right) {
		while (left < right) {
			int temp;
			temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;

		}
		return a;

	}

}
