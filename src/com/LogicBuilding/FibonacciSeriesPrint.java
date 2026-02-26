package com.LogicBuilding;

public class FibonacciSeriesPrint {

	public static void main(String[] args) {
		int number = 10;

		int first = 0;
		int second = 1;
		int third;
		System.out.print(first + " " + second);

		for (int i = 2; i <= number; i++) {

			third = first + second;
			System.out.print(" " + third);
			first = second;
			second = third;
		}

	}

}
