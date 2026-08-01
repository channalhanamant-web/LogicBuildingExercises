package com.LogicBuildingSecond;

public class FindTheSumOfArray {

	public static void main(String[] args) {
		int nums[] = { 1, 24, 33, 44 };
		int sum = 0;
		for (int i : nums) {
			sum = sum + i;
		}
		System.out.println("Sum of an Array is " + sum);

	}

}
