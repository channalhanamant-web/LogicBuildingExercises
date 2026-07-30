package com.LogicBuildingSecond;

public class EvenOrOddNumberUsingBitWiseAndOperator {

	public static void main(String[] args) {
		int number = 45689;

		if ((number & 1) == 1) {

			System.out.println("Given number is odd");

		} else {

			System.out.println("Given number is even");

		}

	}

}
