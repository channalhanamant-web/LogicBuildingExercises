package com.LogicBuilding;

public class FibonacciSeriesOrNot {

	public static void main(String[] args) {
		int inputArray[] = { 0, 1, 1, 2, 3, 5, 8, 13 };
		int index0 = 0;
		int index1 = 1;
		for (int i = 2; i < inputArray.length - 1; i++) {
			if (inputArray[index0] + inputArray[index1] == inputArray[i]) {

				index0++;
				index1++;

			} else {
				System.out.println("Not A Fibonacci series");
				break;
			}
		}

	}

}
