package com.LogicBuilding;

public class EvenOrOddUsingAndBitwiseOperator {

	public static void main(String[] args) {
		int number = 23;
		if ((number & 1) == 1) {
			System.out.println("Given number is Odd");
		}
		else
		System.out.println("Given number is even");

	}

}
