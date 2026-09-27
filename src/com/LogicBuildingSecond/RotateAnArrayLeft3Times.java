package com.LogicBuildingSecond;

import java.util.Arrays;

public class RotateAnArrayLeft3Times {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		int left = 0;
		int right = a.length - 1;

		reverse(a, left, right);
		reverse(a, k + 1, right);
		reverse(a, left, k);

		System.out.println(Arrays.toString(a));
	}

	private static int[] reverse(int[] a, int left, int right) {
		int temp;
		while (left < right) {
			temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}

		return a;

	}

}
