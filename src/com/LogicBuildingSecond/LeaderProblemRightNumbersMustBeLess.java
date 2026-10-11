package com.LogicBuildingSecond;

public class LeaderProblemRightNumbersMustBeLess {

	public static void main(String[] args) {
		int a[] = { 16, 17, 4, 3, 5, 2 };

		int maxNum = a[a.length - 1];
		System.out.println(maxNum);
		for (int i = a.length - 2; i >= 0; i--) {
			if (a[i] > maxNum) {
				maxNum = a[i];

				System.out.println(maxNum);
			}
		}

	}

}
