package com.LogicBuilding;

public class MonotonicArrayOrNot {

	public static void main(String[] args) {
		//array must be increasing or decreasing
		
		int input[] = { 1, 3, 4, 6 };
		boolean increasing = true;
		boolean decreasing = true;

		for (int i = 1; i <= input.length - 1; i++) {

			if (input[i] > input[i - 1]) {
				decreasing = false;

			} else if (input[i] < input[i - 1]) {
				increasing = false;

			}

		}

		boolean result = increasing || decreasing;
		if (result == true) {
			System.out.println("Monotonic");
		} else {
			System.out.println("Not a Monotonic");

		}

	}

}
