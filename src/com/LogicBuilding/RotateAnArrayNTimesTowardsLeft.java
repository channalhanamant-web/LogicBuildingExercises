package com.LogicBuilding;

import java.util.Arrays;

public class RotateAnArrayNTimesTowardsLeft {

	public static void main(String[] args) {
		// imp
		int a[] = { 1, 2, 3, 4, 5 };
		int k = 2;
		int left = 0;
		int right = a.length - 1;

		k = k % a.length; // to handle the outofbound exception
		// reverse the whole array
		reverse(a, left, right);
		System.out.println(Arrays.toString(a));

		// reverse the last two values as position k=2
		reverse(a, a.length - k, a.length - 1);
		System.out.println(Arrays.toString(a));

		// reverse the first 3 char except last as k=2
		reverse(a, 0, k);
		System.out.println(Arrays.toString(a));

	}

	private static int[] reverse(int a[], int left, int right) {
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
