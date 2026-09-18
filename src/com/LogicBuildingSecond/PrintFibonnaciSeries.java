package com.LogicBuildingSecond;

public class PrintFibonnaciSeries {

	public static void main(String[] args) {
		int firstNumber = 0;
		int secondNumber = 1;
		int nextNumber;
		int number = 1;

		if (number == 1) {
			System.out.println(firstNumber);
			System.exit(0);
		}
		System.out.print(firstNumber + " " + secondNumber + " ");
		for (int i = 0; i < number; i++) {
			nextNumber = firstNumber + secondNumber;
			System.out.print(nextNumber + " ");

			firstNumber = secondNumber;
			secondNumber = nextNumber;

		}

	}

}
