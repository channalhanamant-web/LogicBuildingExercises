package com.LogicBuilding;

public class FindLargestNumberInArray {

	public static void main(String[] args) {
		int input[] = { 90, 20, 80, 10, 60, 50 };
		int largestNum = 0;
		for (int temp : input) {

			if (temp >= largestNum) {
				largestNum = temp;

			}
		}
		System.out.println(largestNum);
	}

}
